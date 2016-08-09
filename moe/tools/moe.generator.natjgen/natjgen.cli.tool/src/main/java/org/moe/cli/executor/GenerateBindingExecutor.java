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

package org.moe.cli.executor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.moe.cli.NatjGenConfig;
import org.moe.cli.NatjGenUIConfig;
import org.moe.natjgen.Configuration;
import org.moe.natjgen.Indexer;
import org.moe.natjgen.helper.MOEJavaProject;
import org.moe.natjgen.nativelibs.NatJGenNativeLoader;

public class GenerateBindingExecutor implements IExecutor {

	private String pathToProject;
	private String packageName;
	
	private String headers;
	private boolean isCreateFromPrototype;
	
	public GenerateBindingExecutor(){
		
	}

	
	public GenerateBindingExecutor(String pathToProject, String packageName, String headers,
	        boolean isCreateFromPrototype) {
		super();
		this.pathToProject = pathToProject;
		this.packageName = packageName;
		this.headers = headers;
		this.isCreateFromPrototype = isCreateFromPrototype;
	}



	public void setPathToProject(String pathToProject) {
		this.pathToProject = pathToProject;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}



	public void setCreateFromPrototype(boolean isCreateFromPrototype) {
		this.isCreateFromPrototype = isCreateFromPrototype;
	}

	@Override
	public void execute() throws IOException {

		//collect all header files
		List<String> result = new ArrayList<String>();
		if(headers.contains(":")){
			String[] headersArray = headers.split(":");
			for(String header : headersArray){
				if(!header.isEmpty()){
					result.add(header.replace(":", ""));
				}
			}
		}
		else{
			File tmp = new File(headers);
			if(tmp.exists()){
				if(tmp.isDirectory()){
					result.addAll(getAllFiles(tmp));
				}else{
					result.add(headers);
				}
			}
			else{
				throw new IOException(String.format("specified header %s does not exists", headers));
			}
		}

		// Initialize native libraries
		NatJGenNativeLoader.initNatives();
		
		// Read arguments
		String projectName = "";
		MOEJavaProject project = new MOEJavaProject(projectName, pathToProject);
		
		String natJGenBody = null;
		if(isCreateFromPrototype){
			for(String file : result){
				
				String content = new String(Files.readAllBytes(Paths.get(file)));
				Pattern interfacePattern = Pattern.compile(".*@\\s*interface\\s*");
				Matcher interfaceMatcher = interfacePattern.matcher(content);
				while(interfaceMatcher.find()){
					String subContent = content.substring(interfaceMatcher.end());
					int spaceIdx = subContent.indexOf(":");
					String name = subContent.substring(0, spaceIdx).trim();
					natJGenBody = NatjGenUIConfig.generateNatjGenFile(packageName, name, Arrays.asList(file));
					generate(project, natJGenBody);
				}
			}
		}
		else{
			natJGenBody = NatjGenConfig.generate(packageName, result);
			generate(project, natJGenBody);
		}
		
	}
	
	private List<String> getAllFiles(File directory){
		List<String> result = new ArrayList<>();
		for(File child : directory.listFiles()){
			if(child.isDirectory()){
				result.addAll(getAllFiles(child));
			}
			else{
				if(child.getName().endsWith(".h")){
					result.add(child.getPath());
				}
				
			}
		}
		
		return result;
	}
	
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

}
