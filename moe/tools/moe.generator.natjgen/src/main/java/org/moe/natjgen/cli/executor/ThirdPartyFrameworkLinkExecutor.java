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

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.moe.natjgen.cli.verifier.ArchitectureVerifier;
import org.apache.commons.io.FileUtils;

import org.moe.natjgen.cli.exceptions.CheckArchitectureException;
import org.moe.natjgen.cli.utils.NatJFileUtils;

public class ThirdPartyFrameworkLinkExecutor extends AbstractLinkExecutor {

	private Map<String, String> flags;
	
	
	public ThirdPartyFrameworkLinkExecutor(String packageName, String[] frameworks, String[] javaSource, String[] headers, String[] bundle, String outFile, String ldFlags) {
		super(packageName, frameworks, javaSource, headers, bundle, outFile, ldFlags);
		flags = new HashMap<String, String>();
	}

	@Override
	protected void copyLibrary(File destination, List<String> libList) throws CheckArchitectureException, IOException {

        for(String value : libList){
            File frameworkFile = new File(value);
            if(value != null && !value.isEmpty() && frameworkFile.exists()){
            	
            	int extIdx = frameworkFile.getName().lastIndexOf(".");
            	
            	File frameworkBinary = new File(frameworkFile, frameworkFile.getName().substring(0, extIdx));
                List<ArchitectureVerifier.CPU_TYPE> archs = ArchitectureVerifier.checkArchitectures(frameworkBinary);

                boolean arm = false;
                boolean sim = false;
                for(ArchitectureVerifier.CPU_TYPE arch : archs){
                    arm |= arch.isArm();
                    sim |= !arch.isArm();
                }
                
                if(archs.size() >= 4 || (arm && sim)){
                    
                    if(flags.containsKey(UNIVERSAL_MANIFEST_CONST)){
                    	String flag = flags.get(UNIVERSAL_MANIFEST_CONST);
                    	flags.put(UNIVERSAL_MANIFEST_CONST, flag + ";" + "./lib/" + frameworkFile.getName());
                    }
                    else{
                    	flags.put(UNIVERSAL_MANIFEST_CONST, "./lib/" + frameworkFile.getName());
                    }
                    
                    String type = archs.get(0).isStatic() ? "static" : "dynamic";
                    
                    if(flags.containsKey(MOE_TYPE)){
                    	String flag = flags.get(MOE_TYPE);
                    	flags.put(MOE_TYPE, flag + ";" + type);
                    }
                    else{
                    	flags.put(MOE_TYPE, type);
                    }
                    
                    File destinationFr = new File(destination, frameworkFile.getName());
                    if(!destinationFr.exists()){
                        destinationFr.mkdir();
                    }
                    
                    NatJFileUtils.copyDirectoryWithSymbolicLinks(frameworkFile, destinationFr);
                }
                else if(archs.size() >= 2){
                    boolean isArm = false;
                    for(ArchitectureVerifier.CPU_TYPE arch : archs){
                        isArm |= arch.isArm();
                    }

                    File destinationFr = null;
                    String flag = null;
                    String manPrefix = null;
                    if(isArm){
                        flag = IOS_DEVICE_MANIFEST_CONST;
                    	manPrefix = "./lib/iphoneos/";
                        destinationFr = new File(destination, "iphoneos");
                    }
                    else{
                    	flag = IOS_SIMULATOR_MANIFEST_CONST;
                    	manPrefix = "./lib/iphonesimulator/";
                        destinationFr = new File(destination, "iphonesimulator");
                    }
                    
                    //put appropriate flag
                    if(flags.containsKey(flag)){
                    	String flagValue = flags.get(flag);
                    	flags.put(flag, flagValue + ";" + manPrefix + frameworkFile.getName());
                    }
                    else{
                    	flags.put(flag, manPrefix + frameworkFile.getName());
                    }
                    
                	String type = archs.get(0).isStatic() ? "static" : "dynamic";
                	
                	if(flags.containsKey(MOE_TYPE)){
                    	String flagVlue = flags.get(MOE_TYPE);
                    	flags.put(MOE_TYPE, flagVlue + ";" + type);
                    }
                    else{
                    	flags.put(MOE_TYPE, type);
                    }
                    
                    
                    if(!destinationFr.exists()){
                        destinationFr.mkdirs();
                    }
                    
                    File destinationFramework = new File(destinationFr, frameworkFile.getName());
                    if(!destinationFramework.exists()){
                        destinationFr.mkdirs();
                    }
                    
                    FileUtils.copyDirectory(frameworkFile, destinationFramework);
                }
                else if(archs.size() == 1){
                    ArchitectureVerifier.CPU_TYPE arch = archs.iterator().next();
                    File destinationFr = new File(destination, String.format("%s/%s", arch.getName(), frameworkFile.getName()));
                    if(!destinationFr.exists()){
                        destinationFr.mkdirs();
                    }
                    
                    if(flags.containsKey(arch.getManifestConst())){
                    	String flagValue = flags.get(arch.getManifestConst());
                    	flags.put(arch.getManifestConst(), flagValue + ";" + String.format("./lib/%s/%s", arch.getName(),frameworkFile.getName()));
                    }
                    else{
                    	flags.put(arch.getManifestConst(), String.format("./lib/%s/%s", arch.getName(),frameworkFile.getName()));
                    }
                    
                    String type = archs.get(0).isStatic() ? "static" : "dynamic";
                    if(flags.containsKey(MOE_TYPE)){
                    	String flagVlue = flags.get(MOE_TYPE);
                    	flags.put(MOE_TYPE, flagVlue + ";" + type);
                    }
                    else{
                    	flags.put(MOE_TYPE, type);
                    }
                    
                    FileUtils.copyDirectory(frameworkFile, destinationFr);
                }
            }
        }
		
	}

	@Override
	protected void copyBundle(File destination, String[] bundleFlag) throws IOException {
		
        StringBuilder folderContent = new StringBuilder();
        StringBuilder fileContent = new StringBuilder();
        for(String pathToFile : bundleFlag){
            File bundle = new File (pathToFile);

            if(bundle.exists()){
                if(bundle.isDirectory()){
                    File bundleDest = new File(destination, bundle.getName());
                    if(!bundleDest.exists()){
                        bundleDest.mkdirs();
                    }
                    FileUtils.copyDirectory(bundle, bundleDest);
                    folderContent.append(String.format("./bundle/%s", bundle.getName())).append(";");
                }
                else{
                    File bundleDest = new File(destination, bundle.getName());
                    if(!bundleDest.exists()){
                        bundleDest.createNewFile();
                    }
                    FileUtils.copyFile(bundle, bundleDest);
                    fileContent.append(String.format("./bundle/%s", bundle.getName())).append(";");
                }
            }
        }
        
        flags.put(MOE_BUNDLE_FOLDER_RESOURCES, folderContent.toString());
        flags.put(MOE_BUNDLE_FILE_RESOURCES, fileContent.toString());
	}

	@Override
	protected Map<String, String> getManifestProperties(List<String> libList) {
		return flags;
	}
	
	
	
}
