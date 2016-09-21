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

import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.io.FileUtils;
import org.moe.natjgen.Configuration;
import org.moe.natjgen.Indexer;
import org.moe.natjgen.cli.exceptions.CheckArchitectureException;
import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;
import org.moe.natjgen.cli.utils.ArchiveUtils;
import org.moe.natjgen.cli.utils.GrabUtils;
import org.moe.natjgen.cli.utils.NatJFileUtils;
import org.moe.natjgen.cli.utils.NatjGenFrameworkConfig;
import org.moe.natjgen.helper.MOEJavaProject;
import org.moe.natjgen.nativelibs.NatJGenNativeLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public abstract class AbstractLinkExecutor implements IExecutor {

    protected final String MOE_TYPE = "MOE_TYPE";

    protected final String UNIVERSAL_MANIFEST_CONST = "MOE_ThirdpartyFramework_universal";

    protected final String IOS_SIMULATOR_MANIFEST_CONST = "MOE_ThirdpartyFramework_ios_simulator";
    protected final String IOS_DEVICE_MANIFEST_CONST = "MOE_ThirdpartyFramework_ios_device";

    protected final String MOE_BUNDLE_FOLDER_RESOURCES = "MOE_BUNDLE_FOLDER_RESOURCES";
    protected final String MOE_BUNDLE_FILE_RESOURCES = "MOE_BUNDLE_FILE_RESOURCES";

    private String packageName;
    private String[] frameworks;
    private String[] javaSource;
    private String[] headers;
    private String[] bundle;
    private String outFile;
    private String ldFlags;

    public AbstractLinkExecutor(String packageName, String[] frameworks, String[] javaSource, String[] headers,
            String[] bundle2, String outFile, String ldFlags) {
        this.packageName = packageName;
        this.frameworks = frameworks;
        this.javaSource = javaSource;
        this.headers = headers;
        this.bundle = bundle2;
        this.outFile = outFile;
        this.ldFlags = ldFlags;
    }

    @Override
    public void execute() throws IOException, URISyntaxException, InterruptedException, CheckArchitectureException,
            UnsupportedTypeException {

        //collect all header files
        List<String> headerList = new ArrayList<String>();
        if (headers != null) {
            for (String header : headers) {
                if (header != null && !header.isEmpty()) {
                    File tmp = new File(header);
                    if (tmp.isDirectory()) {
                        Collection<File> files = FileUtils.listFiles(tmp, new String[] { "h" }, true);
                        for (File file : files)
                            headerList.add(file.getAbsolutePath());
                    } else {
                        headerList.add(header);
                    }
                }
            }
        }

        List<String> frameworkList = new ArrayList<String>();
        Set<String> frameworksSearchPaths = new HashSet<String>();
        if (frameworks != null) {

            for (String framework : frameworks) {
                frameworkList.add(framework);
                File frFile = new File(framework);
                frameworksSearchPaths.add(frFile.getParent());
            }

        }

        // Initialize native libraries
        NatJGenNativeLoader.initNatives();

        // Read arguments
        MOEJavaProject project = new MOEJavaProject("", "/");

        boolean generated = true;
        File tmpDir = NatJFileUtils.getNewTempDirectory();
        if (javaSource == null) {

            //generate bindings for all frameworks
            String natJGenBody = NatjGenFrameworkConfig
                    .generate(packageName, frameworksSearchPaths, tmpDir.getPath(), headerList);

            //generate bindings
            generated = generate(project, natJGenBody);
        } else {

            Set<URI> links = new HashSet<URI>();
            for (String jsource : javaSource) {
                links.add(new URI(jsource));
            }
            GrabUtils.downloadToFolder(links, tmpDir);
        }

        if (generated) {
            //try to compile generated jars
            File destinationJavacDir = new File(tmpDir, "result");
            destinationJavacDir.mkdir();

            String indePath = System.getenv("MOE_HOME");
            if (indePath != null && !indePath.isEmpty()) {
                String coreJar = indePath + File.separator + "sdk" + File.separator + "moe-core.jar";
                String iosJar = indePath + File.separator + "sdk" + File.separator + "moe-ios.jar";

                String compileList = createCompileFileList(tmpDir, javaSource != null ? null : packageName);

                String classPathArg = String.format("%s:%s", coreJar, iosJar);
                ProcessBuilder processBuilder = new ProcessBuilder("javac", "@" + compileList, "-cp", classPathArg,
                        "-d", destinationJavacDir.getPath());
                Process process = processBuilder.start();
                process.waitFor();

                if (process.exitValue() == 0 || headerList.size() == 0) {
                    //try to create lib subdirectory
                    File libTemp = new File(destinationJavacDir, "lib");
                    if (!(libTemp.mkdir())) {
                        throw new IOException("Could not create temp directory: " + libTemp.getAbsolutePath());
                    }

                    //try to create bundle subdirectory
                    File bundleTemp = new File(destinationJavacDir, "bundle");
                    if (!(bundleTemp.mkdir())) {
                        throw new IOException("Could not create temp directory: " + bundleTemp.getAbsolutePath());
                    }

                    copyLibrary(libTemp, frameworkList);

                    if (bundle != null) {
                        copyBundle(bundleTemp, bundle);
                    }

                    Map<String, String> flags = getManifestProperties(frameworkList);

                    //create manifest file
                    Manifest manifest = new Manifest();
                    manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");

                    //Logic from CocoaPods; for more information visit https://github.com/CocoaPods/CocoaPods/issues/3537
                    String moe_type = flags.get(MOE_TYPE);
                    if (moe_type != null && moe_type.contains("static")) {
                        if (ldFlags != null && !ldFlags.isEmpty()) {
                            if (ldFlags.endsWith(";")) ldFlags += "-ObjC;";
                            else ldFlags += ";-ObjC;";
                        } else {
                            ldFlags = "-ObjC;";
                        }
                    }

                    if (ldFlags != null && !ldFlags.isEmpty()) {
                        flags.put("MOE_CUSTOM_LINKER_FLAGS", ldFlags);
                    }

                    for (Map.Entry<String, String> entry : flags.entrySet()) {
                        manifest.getMainAttributes().put(new Attributes.Name(entry.getKey()), entry.getValue());
                    }

                    //try to create manifest subdirectory
                    File manifestTemp = new File(destinationJavacDir, "META-INF");
                    if (!(manifestTemp.mkdir())) {
                        throw new IOException("Could not create temp directory: " + bundleTemp.getAbsolutePath());
                    }

                    String manifestFileName = "MANIFEST.MF";
                    File manifestFile = new File(manifestTemp, manifestFileName);
                    FileOutputStream manOut = new FileOutputStream(manifestFile);
                    manifest.write(manOut);
                    manOut.close();

                    //try to pack custom content into jar
                    File jarFile = new File(outFile);

                    FileOutputStream jarFos = null;
                    JarArchiveOutputStream target = null;
                    try {
                        jarFos = new FileOutputStream(jarFile);
                        target = new JarArchiveOutputStream(jarFos);

                        for (File file : destinationJavacDir.listFiles()) {
                            ArchiveUtils.addFileToJar(destinationJavacDir, file, target);
                        }
                        target.close();

                    } finally {
                        if (jarFos != null) {
                            jarFos.close();
                        }

                        if (target != null) {
                            target.close();
                        }
                    }
                } else {
                    throw new IOException("An error occured during process of bindings compilation");
                }
            } else {
                throw new IOException("Could not find system variable - MOE_HOME");
            }
        } else {
            throw new IOException("An error occured during process of bindings generation");
        }

    }

    protected abstract void copyLibrary(File destination, List<String> libList)
            throws CheckArchitectureException, IOException;

    protected abstract void copyBundle(File destination, String[] bundleFlag) throws IOException;

    protected abstract Map<String, String> getManifestProperties(List<String> libList);

    private boolean generate(final MOEJavaProject project, final String natjgenContent) {
        Indexer indexer = null;
        try {
            indexer = new Indexer(project, Configuration.createFromString(natjgenContent));
            indexer.generate(null);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private String createCompileFileList(File baseDir, String packageName) throws IOException {
        Collection<File> fileList = null;
        if (packageName != null) {
            int firstPackgIdx = packageName.indexOf(".");
            String pkgName = firstPackgIdx >= 0 ? packageName.substring(0, firstPackgIdx) : packageName;
            fileList = FileUtils.listFiles(new File(baseDir, pkgName), new String[] { "java" }, true);
        } else {
            fileList = FileUtils.listFiles(baseDir, new String[] { "java" }, true);
        }

        File sources = new File(baseDir, "sources.txt");
        if (!sources.exists()) {
            sources.createNewFile();
        }

        PrintWriter out = new PrintWriter(sources);
        for (File file : fileList) {
            out.println(file);
        }
        out.close();

        return sources.getPath();
    }

}
