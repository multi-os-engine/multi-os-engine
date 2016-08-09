/*
 * Copyright 2014-2016 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.tools.ant.DirectoryScanner;

import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXGroup;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.ProjFile;
import org.moe.document.pbxproj.ProjectException;


public class Main {
	
	private static final String MOE_ANDROID_ROOT_PREFIX = "MOE_ANDROID_ROOT";
	private static final String PRELOADED_CLASSES_PATH = "/frameworks/base/preloaded-classes";
	private static final String GROUP_KEY = "<group>";
	private static final String ABSOLUTE_KEY = "<absolute>";
	private static final String SRC_ROOT_KEY = "SOURCE_ROOT";
	//private static final String ICU_DAT_PATH = "external/icu/icu4c/source/stubdata/icudt54l.dat";
	
	private static final String[] JAVA_SOURCES = {
			"external/apache-http/src",
			"external/bouncycastle/bcprov/src/main/java",
			"external/conscrypt/src/main/java",
			"external/conscrypt/src/platform/java",
            "external/javasqlite/src/main/java",
			"external/okhttp/android/main/java",
			"external/okhttp/okhttp/src/main/java",
			"external/okhttp/okhttp-android-support/src/main/java",
			"external/okhttp/okhttp-apache/src/main/java",
			"external/okhttp/okhttp-urlconnection/src/main/java",
			"external/okhttp/okio/okio/src/main/java",
			"libcore/dalvik/src/main/java",
			"libcore/dex/src/main/java",
			"libcore/libart/src/main/java",
			"libcore/luni/src/main/java",
			"libcore/xml/src/main/java"
		};
	
	private static HashMap<String, String> resolvedAndroidEnvironments = new HashMap<>();
	private static HashSet<String> files = new HashSet<>();
	
	private static String resolveAndroidEnvironment(String name) throws IOException, InterruptedException {
		synchronized(resolvedAndroidEnvironments) {
			String path = resolvedAndroidEnvironments.get(name);
			
			if (path != null) return path;
			
			String user = System.getProperty("user.home");
	
			ProcessBuilder pb = new ProcessBuilder("/usr/libexec/PlistBuddy", "-c", "Print IDEApplicationwideBuildSettings:" + name + ":0",  user + "/Library/Preferences/com.apple.dt.Xcode.plist");
			Process p = pb.start();
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			path = input.readLine();
			p.waitFor();
	
			if(p.exitValue() != 0) {
				pb = new ProcessBuilder("/usr/libexec/PlistBuddy", "-c", "Print IDEApplicationwideBuildSettings:" + name,  user + "/Library/Preferences/com.apple.dt.Xcode.plist");
				p = pb.start();
				input = new BufferedReader(new InputStreamReader(p.getInputStream()));
				path = input.readLine();
				p.waitFor();
			}
			
			resolvedAndroidEnvironments.put(name, path);
	
			return path;
		}
	}
	
	private static void resolveFilesInner(ProjFile proj, PBXGroup grp, File cur) throws IOException, InterruptedException {
		String srcTree = grp.getSourceTree();
		if (srcTree.equals(SRC_ROOT_KEY)) {
			cur = proj.getSourceRoot();
		} else if(srcTree.startsWith(MOE_ANDROID_ROOT_PREFIX)) {
			cur = new File(resolveAndroidEnvironment(srcTree));
		} else if(srcTree.equals(GROUP_KEY)) {
			if (grp.getPath() != null) {
				cur = new File(cur, grp.getPath());
			}
		} else if(srcTree.equals(ABSOLUTE_KEY)) {
			cur = new File(grp.getPath());
		} else {
			return;
		}
		for (PBXObjectRef<? extends PBXObject> childRef : grp.getChildren()) {
			PBXObject child = childRef.getReferenced();
			if (child instanceof PBXGroup) {
				resolveFilesInner(proj, (PBXGroup)child, cur);
			} else {
				PBXFileReference file = (PBXFileReference)child;
				
				if (!file.getSourceTree().equals(GROUP_KEY)) {
					return;
				}
				
				File f = new File(cur, file.getPath());
				f = f.toPath().normalize().toFile();
				String path = f.getAbsolutePath();
				
				if (!f.exists()) {
					return;
				}				
				
				synchronized (resolvedAndroidEnvironments) {
					for (String android : resolvedAndroidEnvironments.values()) {
						if (path.startsWith(android)) {
							if (path.startsWith(new File(android, "moe").getAbsolutePath())) {
								break;
							}
							synchronized(files) {
								files.add(path);
							}
							break;
						}
					}
				}
			}
		}
	}
	
	private static void resolveFiles(ProjFile proj) throws IOException, InterruptedException {
		PBXGroup grp = proj.getRoot().getRootObject().getReferenced().getMainGroup().getReferenced();
		resolveFilesInner(proj, grp, proj.getSourceRoot());
	}
	
	private static void collectFromXcode(File location) throws ProjectException, IOException, InterruptedException {
		ProjFile file = new ProjFile(location);
		
		resolveFiles(file);
				
		File root = location.getParentFile().getParentFile();
		root = new File(root, "build/xcode/" + root.getName() + ".build");
		
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setIncludes(new String[]{"**/*.d"});
		scanner.setBasedir(root);
		scanner.scan();
		for (String inc : scanner.getIncludedFiles()) {
			File f = new File(root, inc);			
			try(Stream<String> stream = Files.lines(f.toPath())) {
	            for (Iterator<String> it = stream.iterator(); it.hasNext();) {
	            	String line = it.next();
	            	if (!line.endsWith(": \\")) {
						String path = line.replaceAll(" \\\\", "").trim();
						synchronized(resolvedAndroidEnvironments) {
							for (String android : resolvedAndroidEnvironments.values()) {
								if (path.startsWith(android)) {
									synchronized(files) {
										files.add(new File(path).toPath().normalize().toFile().getAbsolutePath());
									}
									break;
								}
							}
						}
					}
	            }
	        } catch (IOException e) {
	            throw new AssertionError(e);
	        }
		}
	}
	
	static public void copyDirectory(File src, File dst) throws IOException {
		dst.mkdirs();
        for(File child : src.listFiles()) {
           if(child.isDirectory()) {
        	   copyDirectory(child, new File(dst, child.getName()));
           } else {
        	   Files.copy(child.toPath(), new File(dst, child.getName()).toPath());
           }
        }
	}
	
	static public void deleteFileOrDirectory(File root) {
	    if(root.isDirectory()) {
	        for(File child : root.listFiles()) {
	           if(child.isDirectory()) {
	        	   deleteFileOrDirectory(child);
	           } else {
	          	   child.delete();
	           }
	        }
	    }
	    root.delete();
	}
	
	public static void main(String[] args) throws ProjectException, IOException, InterruptedException {
		File root = new File(args[0]);
		File natives = new File(root, "moe.ios.core.native");
		File dest = new File(args[1]);
		
		for (File content : dest.listFiles()) {
			deleteFileOrDirectory(content);
		}
		
		int cores = Runtime.getRuntime().availableProcessors();
		
		@SuppressWarnings("unchecked")
		ArrayList<File>[] queues = new ArrayList[cores];
		for (int i = 0; i < cores; i++) {
			queues[i] = new ArrayList<File>();
		}
		
		{
			int i = 0;
			for (File project : natives.listFiles()) {
				if(project.getName().startsWith("android.")) {
					int idx = i % cores;
					queues[idx].add(new File(project, project.getName() + ".xcodeproj/project.pbxproj"));
					i++;
				}
			}
		}
		
		Thread[] workers = new Thread[cores];
		for (int i = 0; i < cores; i++) {
			final int j = i;
			workers[i] = new Thread(new Runnable() {
			@Override
			public void run() {
				for(File p : queues[j]) {
					System.out.println("Processing " + p);
					try {
						collectFromXcode(p);
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(1);
					}
				}	
			}});
		}
		
		for (int i = 0; i < cores; i++) {
			workers[i].start();
		}
		
		for (int i = 0; i < cores; i++) {
			workers[i].join();
		}
		
		System.out.println("Copying files: " + files);
		
		for (String file : files) {
			for (String android : resolvedAndroidEnvironments.values()) {
				if (file.startsWith(android)) {
					File to = new File(dest, file.substring(android.length()));
					to.getParentFile().mkdirs();
					Files.copy(new File(file).toPath(), to.toPath());					
					break;
				}
			}
		}
		
		File classes = new File(resolvedAndroidEnvironments.values().iterator().next(), PRELOADED_CLASSES_PATH);
		System.out.println("Copying preloaded-classes file: " + classes);
		File classesD = new File(dest, PRELOADED_CLASSES_PATH);
		classesD.getParentFile().mkdirs();
		Files.copy(classes.toPath(), classesD.toPath());
		
		// The icudata file will be copied already at this point,
		// because that file is referenced from the icu Xcode project.
		/*
		File icu = new File(resolvedAndroidEnvironments.values().iterator().next(), ICU_DAT_PATH);
		System.out.println("Copying icu data file: " + icu);
		File icuD = new File(dest, ICU_DAT_PATH);
		icuD.getParentFile().mkdirs();
		Files.copy(icu.toPath(), icuD.toPath());
		*/

		System.out.println("Copying java sources: " + JAVA_SOURCES);
		for (String java : JAVA_SOURCES) {
			File src = new File(resolvedAndroidEnvironments.values().iterator().next(), java);
			File dst = new File(dest, java);
			copyDirectory(src, dst);
		}
	}
	
}
