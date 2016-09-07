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

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import org.moe.natjgen.cli.executable.Svn;

public class JSpecObject {
	
	private String name;
	private String version;
	private Map<String, String> source;

	public static JSpecObject getJSpecObject(SpecObject spec, String jpodSpecRepo) throws IOException {
		String name = spec.getName();
		String version = spec.getVersion();
		URI jspecRepo = null;
		
		try {
			jspecRepo = new URI(jpodSpecRepo);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( jspecRepo == null ) {
			throw new IllegalArgumentException("Please define correct --jpod-spec-repo");
		}
		
		String scheme = jspecRepo.getScheme();
		if (scheme == null ) {
			throw new IllegalArgumentException("Please define correct --jpod-spec-repo");
		}
		JSpecObject jspec = null;
		File jspecPodFile = null;
		
		switch(scheme) {
		case "file": {
			File jspecRepoFile = new File(jspecRepo.getPath());
			if(jspecRepoFile.exists()) {
				jspecPodFile = new File(jspecRepoFile, name + "/" + version + "/" + name + ".jpodspec.json");
			} else {
				throw new IllegalArgumentException("Please define correct --jpod-spec-repo");
			}
			break;
		}
		case "https": {
			if(jpodSpecRepo.contains(".git")) {
				String address = jpodSpecRepo;
				String fragment = jspecRepo.getFragment();
				if ( fragment != null && address.contains(".git#")) {
					address = address.replace(".git#" + fragment, "/trunk/" + fragment);
				} else if ( address.endsWith(".git") ) {
					address = address.replace(".git", "/trunk");
				} else {
					throw new IllegalArgumentException("Unsupported resource in --jpod-spec-repo");
				}
				
				//Download spec file
				File tmp = NatJFileUtils.getNewTempDirectory();
				String specAddress = address + "/" + name + "/" + version + "/" + name + ".jpodspec.json";
				try {
					try {
						Svn.ls(address);
					} catch (Svn.RepositoryNotFoundException e) {
						throw new RuntimeException(e);
					}
					Svn.export(tmp, specAddress);
				} catch (Svn.SvnNotFoundException | Svn.ConnectionException | Svn.NotDirectoryException e) {
					throw new RuntimeException(e);
				} catch (Svn.RepositoryNotFoundException e) {
					break; // No file - no problems
				}
				
				jspecPodFile = new File(tmp, name + ".jpodspec.json");	
				break;
			} else {
				throw new IllegalArgumentException("Unsupported resource in --jpod-spec-repo");
			}
		}
		default:
			throw new IllegalArgumentException("Unsupported scheme in --jpod-spec-repo");
		}
		
		if (jspecPodFile == null) return jspec;
		
		if(jspecPodFile.exists()) {
			String jSon = Utils.readFile(jspecPodFile, Charset.defaultCharset());
			if (jSon == null) throw new IOException();
            Gson gson = new Gson();
            jspec = gson.fromJson(jSon, JSpecObject.class);
		} else {
			//TODO: Say "This is not the sources you are looking for"
		}
		
		return jspec;
	}
	
	public String[] getSource() {
		Set<String> keySet = source.keySet();
		if (keySet.isEmpty()) return null;
		
		if( keySet.contains("local") ) {
			URI jSourceRepo = null;
			try {
				jSourceRepo = new URI(source.get("local"));
			} catch (URISyntaxException e) { e.printStackTrace(); }
		
			if( jSourceRepo == null ) {
				throw new IllegalArgumentException("Sources not found");
			} else if ( !jSourceRepo.getScheme().equals("file") ) {
				throw new IllegalArgumentException("Incorrect jpodspec");
			}
			
			File localPath = new File(jSourceRepo.getPath());
			if (localPath.exists()) {
				System.out.println("Using bindings for " + name + ":v." + version + " from " + jSourceRepo.toString());
				return new String[]{ jSourceRepo.toString() };
			} else {
				throw new IllegalArgumentException("Sources not found"); //TODO: Special exception
			}
		} else if( keySet.contains("git") ) {
			String address = source.get("git");
			String tag = source.get("tag");
			String src = source.get("src");
			
			URI gitRepo = null;
			
			try {
				gitRepo = new URI(address);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if( gitRepo == null ) {
				throw new IllegalArgumentException("Invalid bindings's repo");
			}
			
			if ( address.endsWith(".git") ) {
				if( tag == null ) address = address.replace(".git", "/trunk");
				else address = address.replace(".git", "/tags/" + tag);
				if ( src != null ) address = address + "/" + src;
			} else {
				throw new IllegalArgumentException("Invalid bindings's repo");
			}
			
			//Download sources
			String error = null;
			error = Utils.execute(null, "svn --version", null)[1];
			if( error != null ) throw new RuntimeException(error); //No svn
			error = Utils.execute(null, "svn --non-interactive --trust-server-cert ls " + address, null)[1]; //check if bindings exists
			if( error != null ) throw new RuntimeException(error); //No bindings
			
			File tmp = null;
			try {
				tmp = NatJFileUtils.getNewTempDirectory();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if( tmp == null ) throw new RuntimeException("Cannot create temp directory");
			
			error = Utils.execute(tmp, "svn --non-interactive --trust-server-cert export " + address, null)[1];// Download bindings
			if ( error != null ) throw new RuntimeException(error); //...
			
			String[] chuncks = address.split("/");
			String subPath = null;
			for ( int i = chuncks.length; i > 0; i-- ) {
				if ( !chuncks[ i - 1 ].isEmpty() ) {
					subPath = chuncks[ i - 1 ];
					break;
				}
			}
			
			File localRepo = new File(tmp, subPath);
			
			if (localRepo.exists()) {
				URI jSourceRepo = localRepo.toURI();
				System.out.println("Using bindings for " + name + ":v." + version + " from " + address);
				return new String[]{ jSourceRepo.toString() };
			} else {
				throw new IllegalArgumentException("Fail to download bindings"); //TODO: Special exception
			}				
		}
		// TODO Auto-generated method stub
		return null;
	}

}
