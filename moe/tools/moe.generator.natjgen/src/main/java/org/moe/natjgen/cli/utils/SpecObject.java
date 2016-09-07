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

package org.moe.natjgen.cli.utils;

import java.util.*;

public class SpecObject{
	private static final String LD_FLAGS_KEY = "OTHER_LDFLAGS";
	private static final String VENDORED_FRAMEWORKS_KEY = "vendored_frameworks";
	private static final String VENDORED_LIBRARIES_KEY = "vendored_libraries";
	private static final String PUBLIC_HEADER_FILE = "public_header_files";
	private static final String SOURCE_FILE = "source_files";
	
	private static final String FRAMEWORKS_KEY = "frameworks";
	private static final String LIBRARIES_KEY = "libraries";
	
	private String name;
	private String version;
	
	private Object frameworks;
	private Object weak_frameworks;
	private Object libraries;
	private Object source_files;
	private Object public_header_files;
	
	//linker flag section
	private Map<String, String> xcconfig;
	private Map<String, String> pod_target_xcconfig;
	
	private Object resources;
	private Map<String, Object> resource_bundles;
	
	private Object vendored_frameworks;//for prebuild frameworks
	private Object vendored_libraries;
	private Map<String, Object> ios;
	private Map<String, String> platforms;
	
	private Map<String, String> source;
	
	private Map<String, Object> dependencies;
	
	private String prepare_command;

	//subspec
	private Object default_subspecs;
	private List<SpecObject> subspecs;
	private List<String> usedSubspec;

    public boolean isPodSupported(){
		boolean isSupported = true;
		
		if(platforms != null){
			String platformVersion = platforms.get("ios");
			double version = Double.valueOf(platformVersion);
			
			isSupported = version >= 8.0;
		}
		return isSupported;
	}

	public String getName(){
		return name;
	}
	
	public String getVersion(){
		return version;
	}
	
	public List<SpecObject> getSubspecs(){
		return subspecs;
	}
	
	public List<String> getDefaultSubspecs(){
		if(default_subspecs instanceof String){
			return Arrays.asList(default_subspecs.toString());
		}
		else{
			return (List<String>)default_subspecs;
		}
	}
	
	public List<String> getFrameworks() {
		List<String> result = new ArrayList<String>();
		if(frameworks == null){
            if(ios != null){
                Object iosFramework = ios.get(FRAMEWORKS_KEY);
                if(iosFramework != null && iosFramework instanceof String){
                    result.add(iosFramework.toString());
                }
                else if(iosFramework != null){
                    result.addAll((List<String>)iosFramework);
                }
            }
        }
		else if(frameworks != null){
    		if(frameworks instanceof String){
    			result.add(frameworks.toString());
    		}
    		else{
    			result.addAll((List<String>)frameworks);
    		}			
		}
		
		//add frameworks from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getFrameworks());
    			}
    		}
		}

		
		return result;
	}
	
	public List<String> getWeakFrameworks() {
		List<String> result = new ArrayList<String>();
		
		if(weak_frameworks != null){
    		if(weak_frameworks instanceof String){
    			result.add(weak_frameworks.toString());
    		}
    		else{
    			result.addAll((List<String>)weak_frameworks);
    		}
		}
		
		//add weak frameworks from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getWeakFrameworks());
    			}
    		}
		}

		
		return result;
		
	}
	
	public List<String> getLibraries() {
		List<String> result = new ArrayList<String>();
		
		if(libraries == null){
		    if(ios != null){
		        Object iosLib = ios.get(LIBRARIES_KEY);
		        if(iosLib != null && iosLib instanceof String){
		            result.add(iosLib.toString());
		        }
		        else if(iosLib != null){
		            result.addAll((List<String>)iosLib);
		        }
		    }
		}
		else if(libraries != null){
			if(libraries instanceof String){
				result.add(libraries.toString());
			}
			else{
				result.addAll((List<String>)libraries);
			}
		}
		
		//add libraries from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getLibraries());
    			}
    		}
		}

		
		return result;
	}
	public List<String> getResources() {
		List<String> result = new ArrayList<String>();
		
		if(resources != null){
    		if(resources instanceof String){
    			result.add(resources.toString());
    		}
    		else{
    			result.addAll((List<String>)resources);
    		}
		}
		
		if(resource_bundles != null && resource_bundles.size() > 0){
			for(Map.Entry<String, Object> entry : resource_bundles.entrySet()){
				if(entry.getValue() instanceof String){
					result.add((String) entry.getValue());
				}
				else{
					result.addAll((List<String>)entry.getValue());
				}
			}
		}
		
		//add resources from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getResources());
    			}
    		}
		}

		
		return result;
	}
	
	public List<String> getSourceFiles() {
		List<String> iosRes = new ArrayList<>();
		if(public_header_files == null && source_files == null){
			if(ios != null){
				Object pHeader = ios.get(PUBLIC_HEADER_FILE);
				Object source = ios.get(SOURCE_FILE);
				
				if(pHeader != null && pHeader instanceof String){
				    iosRes.add(pHeader.toString());
				}
				else if (pHeader != null){
				    iosRes.addAll((List<String>)pHeader);
				}
				
				if(source != null && source instanceof String){
					iosRes.add(source.toString());
				}
				else if(source != null){
				    iosRes.addAll((List<String>)source);
				}
			}
		}
		else if(public_header_files != null){
			if(public_header_files instanceof String){
				iosRes.add(public_header_files.toString());
			}
			else{
				iosRes.addAll((List<String>)public_header_files);
			}
		}
		else if (source_files != null){
			if(source_files instanceof String){
				iosRes.add(source_files.toString());
			}
			else{
				iosRes.addAll((List<String>)source_files);
			}
		}
		
		//add sources from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				iosRes.addAll(subSpec.getSourceFiles());
    			}
    		}
		}

		
		return iosRes;
	}
	
	public Map<String, String> getSource() {
		return source;
	}
	
	public List<String> getVendoredFrameworks() {
		List<String> result = new ArrayList<String>();
		
		if(vendored_frameworks == null){
			Object vFramework = ios == null ? null : ios.get(VENDORED_FRAMEWORKS_KEY);
			if(vFramework != null && vFramework instanceof String){
				result.add(vFramework.toString());
			}
			else if(vFramework != null){
			    result.addAll((List<String>)vFramework);
			}
		}
		else{
			if(vendored_frameworks instanceof String){
				result.add(vendored_frameworks.toString());
			}
			else{
				result.addAll((List<String>)vendored_frameworks);
			}
		}
		
		//add vendored frameworks from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName()))|| defSubspecs == null){
    				result.addAll(subSpec.getVendoredFrameworks());
    			}
    		}
		}

		
		return result;
	}
	
	public List<String> getVendoredLibraries(){
		List<String> result = new ArrayList<String>();
		
		if(vendored_libraries == null){
			Object vLib = ios == null ? null : ios.get(VENDORED_LIBRARIES_KEY);
			if(vLib != null && vLib instanceof String){
				result.add(vLib.toString());
			}
			else if(vLib != null){
			    result.addAll((List<String>)vLib);
			}
		}
		else{
			if(vendored_libraries instanceof String){
				result.add(vendored_libraries.toString());
			}
			else{
				result.addAll((List<String>)vendored_libraries);
			}
		}
		
		//add vendored libraries from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getVendoredLibraries());
    			}
    		}
		}

		
		return result;
	}
	
	public List<String> getPreparedCommands(){
		List<String> result = new ArrayList<>();
		
		if(prepare_command != null){
			result.add(prepare_command);
		}
		
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getPreparedCommands());
    			}
    		}
		}
		
		return result;
	}
	
	public String getLdFlags(){
		
		//prepare ld flags
		List<String> resFlags = new ArrayList<>();
		resFlags.addAll(getXcconfigLDFlags());
		
		StringBuilder ldFlags = new StringBuilder();
		for(String flag : resFlags){
			ldFlags.append(flag).append(";");
		}
		
		//prepare framework dependencies
		List<String> frameworks = getFrameworks();
		if(frameworks != null){
			for(String flag : frameworks){
				ldFlags.append("-framework " + flag).append(";");
			}
		}
		
		//prepare weak frameworks
		List<String> weakframeworks = getWeakFrameworks();
		if(weakframeworks != null){
			for(String flag : weakframeworks){
				ldFlags.append("-weak_framework " + flag).append(";");
			}
		}
		
		//prepare library dependencies
		List<String> libraries = getLibraries();
		if(libraries != null){
			for(String lib : libraries){
				String library;
				if(lib.startsWith("lib")){
					library = lib.substring(3);
				}
				else{
					library = lib;
				}
				ldFlags.append("-l" + library).append(";");
			}
		}
		
		if(!ldFlags.toString().endsWith(";")){
			ldFlags.append(";");
		}
		
		return ldFlags.toString();
		
	}

	public List<String> getXcconfigLDFlags(){
		List<String> result = new ArrayList<>();
		
		Object xcConfflags = xcconfig != null ? xcconfig.get(LD_FLAGS_KEY) : null;
		if(xcConfflags == null){
			xcConfflags = ios == null ? null : ios.get("xcconfig");
		}
		
		
		if(xcConfflags != null){
			if(xcConfflags instanceof String){
				result.add(xcConfflags.toString());
			}
			else{
				result.addAll((List<String>) xcConfflags);
			}
		}
		
		Object podxcConfigFlags = pod_target_xcconfig != null ? pod_target_xcconfig.get(LD_FLAGS_KEY) : null;
		if(podxcConfigFlags == null){
			podxcConfigFlags = ios == null ? null : ios.get("pod_target_xcconfig");
		}
		
		if(podxcConfigFlags != null){
			if(podxcConfigFlags instanceof String){
				result.add(podxcConfigFlags.toString());
			}
			else{
				result.addAll((List<String>) podxcConfigFlags);
			}
		}
		
		//add XcconfigLDFlags from subspec
		List<String> defSubspecs = null;
		if(usedSubspec != null){
			defSubspecs = usedSubspec;
		}
		else if(default_subspecs != null){
			defSubspecs = getDefaultSubspecs();
			
		}
		
		if(subspecs != null){
    		for(SpecObject subSpec : subspecs){
    			if((defSubspecs != null && defSubspecs.contains(subSpec.getName())) || defSubspecs == null){
    				result.addAll(subSpec.getXcconfigLDFlags());
    			}
    		}
		}
		
		return result;
	}
	
	public Map<String, List<String>> getDependencies(){
        Map result = new HashMap<>();

        List<String> defSubspecs = null;
        if (usedSubspec != null) {
            defSubspecs = usedSubspec;
        } else if (default_subspecs != null) {
            defSubspecs = getDefaultSubspecs();
        }

        if (subspecs != null) {
            for (SpecObject subSpec : subspecs) {
                if (((defSubspecs != null) && defSubspecs.contains(subSpec.getName())) || (defSubspecs == null)) {
                    result.putAll(subSpec.getDependencies());
                }
            }
        }
        if (dependencies == null) {
            if (ios != null) {
                Map<String, Object> tmp = (Map<String, Object>) ios.get("dependencies");
                if (tmp != null) {
                    for (Map.Entry<String, Object> entry : tmp.entrySet()) {
                        Object val = entry.getValue();
                        if (val instanceof String) {
                            List<String> valList = new ArrayList<>();
                            valList.add((String)val);
                            result.put(entry.getKey(), valList);
                        } else if (val instanceof Collection<?>) {
                            result.put(entry.getKey(), val);
                        } else {
                            System.out.println("Unsupported dependencies values for spec " + this.name);
                        }
                    }
                }
            }
        } else {
            for (Map.Entry<String, Object> entry : dependencies.entrySet()) {
                Object val = entry.getValue();
                if (val instanceof String) {
                    List<String> valList = new ArrayList<>();
                    valList.add((String)val);
                    result.put(entry.getKey(), valList);
                } else if (val instanceof Collection<?>) {
                    result.put(entry.getKey(), val);
                } else {
                    System.out.println("Unsupported dependencies values for spec " + this.name);
                }
            }
        }

        return result;
	}

	public void addSubspec(String subspec) {
		if(subspec != null){
		    if(usedSubspec == null){
		        usedSubspec = new ArrayList<>();
		    }
		    
		    if(!usedSubspec.contains(subspec)){
		    	usedSubspec.add(subspec);
		    }
		}
	}

	public int getSizeSubspecs(){
	    return usedSubspec == null ? 0 : usedSubspec.size();
	}
}

