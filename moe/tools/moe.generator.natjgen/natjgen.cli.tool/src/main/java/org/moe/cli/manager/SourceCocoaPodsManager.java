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

package org.moe.cli.manager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.management.OperationsException;

import org.moe.cli.exceptions.WrapNatJGenException;
import org.moe.cli.executable.Pod;
import org.moe.cli.executable.Pod.PodNotFoundException;
import org.moe.cli.executable.Svn.NotDirectoryException;
import org.moe.cli.executor.IExecutor;
import org.moe.cli.executor.ThirdPartyFrameworkLinkExecutor;
import org.moe.cli.utils.SpecObject;
import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import org.moe.cli.utils.Utils;


public class SourceCocoaPodsManager extends AbstractCocoaPodsManager {
    
    private String[] options = {"use_frameworks!"};
    private String[] params = {"version"};
	private Dictionary<String,Dictionary<String,String>> dependencies; //<LibName,<param,value>>
    private File JPod = new File("build/JPod");
    
    public IExecutor processCocoapods(String source, SpecObject spec, String packageName, String[] javaSource, String outputJar) throws IOException, OperationsException, InterruptedException, WrapNatJGenException {
		generatePodFile(spec);
		extractXCodeProject();
		String buildExitMessage = buildPods(spec);
		
		if(buildExitMessage != null){
			throw new OperationsException(buildExitMessage);
		}
		List<File> dependenciesFramework = new ArrayList<>();
		
		List<String> exceptList = new ArrayList<>();
		exceptList.add(spec.getName());
		List<SpecObject> allUsedSpecs = getAllDepSpecs(spec, exceptList);
		allUsedSpecs.add(spec);

        for (SpecObject key : allUsedSpecs) {
        	//for iphonesimulator
        	File simDep = new File(JPod.getAbsolutePath(), "/build/Release-iphonesimulator/");
        	File[] simFiles = simDep.listFiles();
        	if (simFiles != null) {
        		String nameRegexp = key.getName().replace("-", ".") + ".framework";
        		for (File file : simFiles) {
        			if(file.getName().matches(nameRegexp)){
        				dependenciesFramework.add(file);
        			}
        		}
        	}
        	
        	//for iphoneos
        	File devDep = new File(JPod.getAbsolutePath(), "/build/Release-iphoneos/");
        	File[] devFiles = devDep.listFiles();
        	if (devFiles != null) {
        		String nameRegexp = key.getName().replace("-", ".") + ".framework";
        		for(File file : devFiles){
        			if(file.getName().matches(nameRegexp)){
        				dependenciesFramework.add(file);
        			}
        		}
        	}
        }
        
        IExecutor executor = null;
        if(dependenciesFramework.size() > 0){
        	
        	Set<String> headerContent = new HashSet<String>();
        	for(File fr : dependenciesFramework){
        		File headers = new File(fr, "Headers");
        		if(headers.exists()){
        			headerContent.add(headers.getPath());
        		}
        	}
            
            
            String ldFlags = spec.getLdFlags();
            
            //find all bundles
            File destination = new File(JPod.getAbsolutePath(), String.format("/Pods/%s", spec.getName()));
            Set<String> bundleContent = new HashSet<String>();
            List<String> resources = spec.getResources();
            if(resources != null && resources.size() > 0){
                for(String bundle : resources){
                    Set<String> bundleWildCard = getBundleResources(bundle, destination);
                    bundleContent.addAll(bundleWildCard);
                }
            }
            
            Set<String> frameworkParam = new HashSet<String>();
            for(File fr : dependenciesFramework){
            	frameworkParam.add(fr.getAbsolutePath());
            	
            	int frameworkNameIdx = fr.getName().lastIndexOf(".");
                if(frameworkNameIdx >= 0){
                    ldFlags = ldFlags + "-framework " + fr.getName().substring(0, frameworkNameIdx) + ";";
                }
            }
            
            executor = new ThirdPartyFrameworkLinkExecutor(packageName, frameworkParam.toArray(new String[0]),
            		javaSource, headerContent.toArray(new String[0]), bundleContent.toArray(new String[0]), outputJar, ldFlags);
        }

        return executor;
    }

	private String buildPods (SpecObject spec) throws WrapNatJGenException, IOException {
		System.setProperty("file.encoding", "UTF-8");
		Pod.install(JPod);
		File podsDir = new File(JPod.getPath() + "/Pods");
		String projectPath = podsDir.getAbsolutePath() + File.separator + "Pods.xcodeproj";
		Utils.execute(podsDir, "xcodebuild -target " + spec.getName() + " -sdk iphoneos -configuration Release -project " + projectPath, null);
		String result = Utils.execute(new File(JPod.getPath() + File.separator + "Pods"), "xcodebuild -target " + spec.getName() + " -sdk iphonesimulator -configuration Release -project " + projectPath, null)[1];

		
		return result;
	}
	
	private List<SpecObject> getAllDepSpecs(SpecObject spec, List<String> exceptList) throws IOException, InterruptedException, WrapNatJGenException {
		List<SpecObject> result = new ArrayList<>();
		
		Map<String, List<String>> dependency = spec.getDependencies();
		for (String depSpecName : dependency.keySet()) {
            for (String except : exceptList) {
                if (!depSpecName.startsWith(except + '/')) {
                    String jSon = Pod.getSpecContent(depSpecName);
                    Gson gson = new Gson();
                    SpecObject rootSpec = gson.fromJson(jSon, SpecObject.class);
                    result.add(rootSpec);

                    List<String> tmp = new ArrayList<>(exceptList);
                    tmp.add(depSpecName);
                    result.addAll(getAllDepSpecs(rootSpec, tmp));
                }
            }
		}
		
		return result;
	}


	private void generatePodFile(SpecObject spec) throws IOException {
		PrintWriter podFileWriter = null;
		try {
			FileUtils.deleteDirectory(JPod);
			if (JPod.mkdirs()) {
				File podFile = new File(JPod, "PodFile");
				podFileWriter = new PrintWriter(podFile);
				
				for (String option : options) {
					podFileWriter.println(option);
				}

                podFileWriter.println("target 'template' do");

                String podEntry = String.format("\tpod '%s'", spec.getName());
                String version = spec.getVersion();
                if ((version != null) && !version.isEmpty()) {
                    podEntry += String.format(", '%s'", version);
                }
				podFileWriter.println(podEntry);

                podFileWriter.println("end");
			} else {
				System.out.println("Error while PodFile's generating");
			}
		}
		finally{
			if (podFileWriter != null) {
				podFileWriter.close();
			}
		}
	}
	
	//TODO: params should be determined in one place
	private String handleParam(String param, String value) {
		switch (param) {
		case "version":
			return "'~>" + value + "'";
			default:
				throw new RuntimeException("Unsupported library's parameters for " + param);
		}
	}

	private void extractXCodeProject() throws IOException {
		InputStream resStream = null;
		ZipInputStream zis = null;
		try{
			ClassLoader cl = this.getClass().getClassLoader();
			resStream = cl.getResourceAsStream("template.xcodeproj.zip");
			if(resStream != null){
				zis = new ZipInputStream(resStream);
		        ZipEntry entry;
		        while ((entry = zis.getNextEntry()) != null)
		        {
		            if(entry.isDirectory()){
		            	File newDir = new File(JPod, entry.getName());
		            	if(!newDir.exists()){
		            		newDir.mkdirs();
		            	}
		            }
		            else{
		            	File newDest = new File(JPod, entry.getName());
		            	FileOutputStream output = null;
		            	try{
		            		output = new FileOutputStream(newDest);
			            	byte[] buffer = new byte[1024];
			                int len = 0;
			                while ((len = zis.read(buffer)) > 0)
			                {
			                    output.write(buffer, 0, len);
			                }
		            	}
		            	finally{
		            		if(output != null){
		            			output.close();
		            		}
		            	}
	
		            }
		        }
			}
			else{
				throw new InvalidParameterException("Could not find Xcode project in resources");
			}
		}
		finally{
			if(resStream != null){
				resStream.close();
			}
			
			if(zis != null){
				zis.close();
			}
		}
	}

}
