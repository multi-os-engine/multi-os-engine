/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natjgen.cli.executor;

import com.google.gson.Gson;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.compressors.CompressorException;
import org.moe.natjgen.cli.exceptions.CheckArchitectureException;
import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;
import org.moe.natjgen.cli.exceptions.WrapNatJGenException;
import org.moe.natjgen.cli.executable.Pod;
import org.moe.natjgen.cli.executable.Pod.PodNotFoundException;
import org.moe.natjgen.cli.manager.PrebuildCocoaPodsManager;
import org.moe.natjgen.cli.manager.SourceCocoaPodsManager;
import org.moe.natjgen.cli.utils.JSpecObject;
import org.moe.natjgen.cli.utils.SpecObject;
import org.moe.natjgen.cli.utils.params.OptionsHandler;

import javax.management.OperationsException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.security.InvalidParameterException;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CocoaPodsExecutor implements IExecutor {

    private String pod;
    private String outputJar;
    private String[] javaSource;
    private String jpodSpecRepo;
    private String packageName;
    private Set<String> dependencies;

    public CocoaPodsExecutor(String pod, String outputJar, String[] javaSource2, String jpodSpecRepo,
            String packageName, Set<String> dependencies) {
        this.pod = pod;
        this.outputJar = outputJar;
        this.javaSource = javaSource2;
        this.jpodSpecRepo = jpodSpecRepo;
        this.packageName = packageName;
        this.dependencies = new HashSet<>(dependencies);
    }

    @Override
    public void execute() throws IOException, OperationsException, InterruptedException, InvalidParameterSpecException,
            CompressorException, ArchiveException, URISyntaxException, CheckArchitectureException,
            UnsupportedTypeException, WrapNatJGenException {

        File podFile = new File(pod);
        if (podFile.exists()) {
            SpecObject spec = getSpecObject(podFile);

            //update self dependency
            if (spec.getSizeSubspecs() > 0) {
                Map<String, List<String>> specDependencies = spec.getDependencies();
                for (Map.Entry<String, List<String>> entry : specDependencies.entrySet()) {
                    if (entry.getKey().startsWith(spec.getName() + "/")) {
                        int depIdx = entry.getKey().indexOf("/");
                        spec.addSubspec(entry.getKey().substring(depIdx + 1).trim());
                    }
                }
            } else if (spec.getSizeSubspecs() == 0 && (spec.getDefaultSubspecs() == null
                    || spec.getDefaultSubspecs().size() == 0)) {
                Map<String, List<String>> specDependencies = spec.getDependencies();
                for (Map.Entry<String, List<String>> entry : specDependencies.entrySet()) {
                    String nameSubspec = null;
                    if (entry.getKey().startsWith(spec.getName() + "/")) {
                        int depIdx = entry.getKey().indexOf("/");
                        nameSubspec = entry.getKey().substring(depIdx + 1).trim();
                        spec.addSubspec(nameSubspec);
                    }
                }
            }

            IExecutor executor = null;
            String source = spec.getSource().get("http");
            if (source == null) {
                String git = spec.getSource().get("git");
                String tag = spec.getSource().get("tag");

                //remove .git
                git = git.substring(0, git.length() - 4);
                source = String.format("%s/archive/%s.zip", git, tag);
            }

            //handle jspec repository
            if (javaSource == null && jpodSpecRepo != null) {
                JSpecObject jspec = JSpecObject.getJSpecObject(spec, jpodSpecRepo);
                if (jspec != null) {
                    javaSource = jspec.getSource();
                }
            }

            if (source != null && (spec.getVendoredFrameworks().size() != 0
                    || spec.getVendoredLibraries().size() != 0)) {
                PrebuildCocoaPodsManager manager = new PrebuildCocoaPodsManager();
                executor = manager.processCocoapods(source, spec, packageName, javaSource, outputJar);

                Map<String, List<String>> localDependencies = spec.getDependencies();
                for (Map.Entry<String, List<String>> entry : localDependencies.entrySet()) {
                    if (!entry.getKey().startsWith(spec.getName() + "/") && !dependencies.contains(entry.getKey())) {

                        //create dependency spec
                        String podName = entry.getKey();
                        String subspec = null;
                        if (podName.contains("/")) {
                            int depIdx = podName.indexOf("/");
                            subspec = podName.substring(depIdx + 1);
                            podName = podName.substring(0, depIdx);
                        }

                        File depPodFile = new File(podFile.getParentFile(), podName + "Pod");
                        PrintWriter writer = new PrintWriter(depPodFile);
                        try {
                            writer.println("pod:" + podName);
                            String version = entry.getValue().get(0);
                            writer.println("version:" + (version == null ? "" : version));
                            writer.println("subspec:" + (subspec == null ? "" : subspec));
                        } finally {
                            writer.close();
                        }
                        File tmpOut = new File(outputJar);
                        File depOutJar = new File(tmpOut.getParent(), podName + ".jar");

                        String depPackageName = packageName + "." + entry.getKey();
                        Set<String> cummonDep = new HashSet<String>(dependencies);
                        cummonDep.addAll(localDependencies.keySet());
                        CocoaPodsExecutor depExecutor = new CocoaPodsExecutor(depPodFile.getPath(), depOutJar.getPath(),
                                null, jpodSpecRepo, depPackageName.toLowerCase(), cummonDep);
                        depExecutor.execute();
                    }
                }
            } else {
                SourceCocoaPodsManager manager = new SourceCocoaPodsManager();
                executor = manager.processCocoapods(null, spec, packageName, javaSource, outputJar);
            }

            if (executor != null) {
                executor.execute();
            } else {
                throw new InvalidParameterException("Unsupported pod source");
            }

        } else {
            throw new InvalidParameterException(
                    String.format("Specify correct path in %s parameter", OptionsHandler.POD.getLongOpt()));
        }

    }

    public SpecObject getSpecObject(File podFile) throws IOException, InterruptedException,
            PodNotFoundException { //TODO: May be this method should be in SpecObject class?
        BufferedReader inputReader = new BufferedReader(new FileReader(podFile));

        Pattern podPattern = Pattern.compile(".*pod:\\s*.+\\s*");
        Pattern versionPattern = Pattern.compile(".*version:\\s*.+\\s*");
        Pattern subspecPattern = Pattern.compile(".*subspec:\\s*.+\\s*");

        String line;
        String podName = null;
        String podVersion = null;
        String subspec = null;

        while ((line = inputReader.readLine()) != null) {
            Matcher podMatcher = podPattern.matcher(line);
            if (podMatcher.find()) {
                String podGroup = podMatcher.group();
                podName = podGroup.replace("pod:", "").trim();
            }

            Matcher versionMatcher = versionPattern.matcher(line);
            if (versionMatcher.find()) {
                String versionGroup = versionMatcher.group();
                podVersion = versionGroup.replace("version:", "").trim();
            }

            Matcher subspecMatcher = subspecPattern.matcher(line);
            if (subspecMatcher.find()) {
                String subspecGroup = subspecMatcher.group();
                subspec = subspecGroup.replace("subspec:", "").trim();
            }
        }
        inputReader.close();

        SpecObject rootSpec = null;
        if (podName != null) {
            String jSon = Pod.getSpecContent(podName);
            Gson gson = new Gson();
            rootSpec = gson.fromJson(jSon, SpecObject.class);
            rootSpec.addSubspec(subspec);
        }

        return rootSpec;
    }
}
