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

package org.moe.natjgen.cli.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidParameterException;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;
import org.moe.natjgen.cli.executor.IExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyFrameworkLinkExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyLibraryLinkExecutor;
import org.moe.natjgen.cli.utils.ArchiveUtils;
import org.moe.natjgen.cli.utils.GrabUtils;
import org.moe.natjgen.cli.utils.NatJFileUtils;
import org.moe.natjgen.cli.utils.SpecObject;

public class PrebuildCocoaPodsManager extends AbstractCocoaPodsManager{
    
    
    public IExecutor processCocoapods(String source, SpecObject spec, String packageName, String[] javaSource, String outputJar) throws IOException, CompressorException, ArchiveException, InvalidParameterSpecException, InterruptedException, URISyntaxException, UnsupportedTypeException {
        File tmpFolder = NatJFileUtils.getNewTempDirectory();
        File download = new File(tmpFolder, "download/");
        if(!download.exists()){
            download.mkdirs();
        }
        
        int nameIdx = source.lastIndexOf("/");
        File outFile = new File(download, source.substring(nameIdx + 1));
        
        GrabUtils.download( new URI(source), outFile);

        int extIdx = outFile.getName().lastIndexOf(".");
        String folderUnzip = outFile.getName().substring(0, extIdx);
        File destination = new File(download, folderUnzip);
        if(!destination.exists()){
            destination.mkdirs();
        }

        String type = spec.getSource().get("type");
        if(outFile.getName().endsWith(".zip") || (type != null && type.equals("zip"))){
            ZipFile apachZip = new ZipFile(outFile);
            ArchiveUtils.unzipArchive(apachZip, destination);
        }
        else if(outFile.getName().endsWith("tar.bzip2") 
                || outFile.getName().endsWith("tar.gz") 
                || outFile.getName().endsWith("tar.bz2")
                || type.equals("tgz")){
            InputStream inputC = null;
            
            int extArchIdx = outFile.getName().lastIndexOf(".");
            String ext = outFile.getName().substring(extArchIdx + 1);
            if(ext.equals("tar")){
                inputC = new FileInputStream(outFile);
            }
            else if(ext.equals("bzip2") || ext.equals("gz") || ext.equals("bz2")){
                InputStream fin = new FileInputStream(outFile);
                
                String compressorType = null;
                if(ext.equals("bzip2") || ext.equals("bz2")){
                    compressorType = CompressorStreamFactory.BZIP2;
                }
                else if(ext.equals("gz") || type.equals("tgz")){
                    compressorType = CompressorStreamFactory.GZIP;
                }
                inputC = new CompressorStreamFactory().createCompressorInputStream(compressorType, fin);
            }
            else{
                throw new InvalidParameterException("Unsupported archive type");
            }
            
            ArchiveInputStream input = new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.TAR, inputC);
            ArchiveUtils.untarArchive(input, destination);
        }
        
        //update destination for git repo
        if(spec.getSource().containsKey("git")){
        	String git = spec.getSource().get("git");
        	String tag = spec.getSource().get("tag");
        	
        	int gitNameIdx = git.lastIndexOf("/");
        	String gitName = git.substring(gitNameIdx + 1);
        	if(gitName.endsWith(".git")){
        		gitName = gitName.substring(0, gitName.length() - 4);
        	}
        	
        	if(!Character.isDigit(tag.charAt(0)) && Character.isDigit(tag.charAt(1))){
        		tag = tag.substring(1);
        	}
        	
        	String zipSubfolder = String.format("%s-%s", gitName, tag);
        	destination = new File(destination, zipSubfolder);
        }
        
        List<String> commandList = spec.getPreparedCommands();
        for(String command : commandList){
        	if(command != null && !command.isEmpty()){
        		executePrepareCommands(destination, command);
        	}
        }

        IExecutor executor = null;
        
        //find all bundles
        Set<String> bundleContent = new HashSet<String>();
        List<String> resources = spec.getResources();
        if(resources != null && resources.size() > 0){
            for(String bundle : resources){
                Set<String> bundleWildCard = getBundleResources(bundle, destination);
                bundleContent.addAll(bundleWildCard);
            }
        }
        String[] bundleRes = bundleContent.toArray(new String[0]);
        
        //get additional linker flags
        String ldFlags = spec.getLdFlags();
        
        //create 
        Set<String> headersContent = new HashSet<String>();
        List<String> headerList = spec.getSourceFiles();
        if(headerList != null && headerList.size() > 0){
            for(String header : headerList){
                int recursivIdx = header.indexOf("**");
                
                if(recursivIdx >= 0){
                    File headerFile = new File(destination, header.substring(0, recursivIdx));
                    headersContent.add(headerFile.getPath());
                }
                else{
                    Set<String> bundleWildCard = getBundleResources(header, destination);                    
                    	headersContent.addAll(bundleWildCard);
                }
            }
        }
                
        if(spec.getVendoredFrameworks() != null && spec.getVendoredFrameworks().size() > 0){
            List<File> frameworkList = new ArrayList<>();
            Set<String> frameworkContent = new HashSet<String>();
            for(String vFramework : spec.getVendoredFrameworks()){
                Set<String> frName = getBundleResources(vFramework, destination);
                if (frName.size() != 1) throw new RuntimeException("Something wrong with this code. Refactor it! And the same with libraries");
                File frameworkFile = new File(frName.toArray(new String[0])[0]);
                if(frameworkFile.exists()){
                    frameworkList.add(frameworkFile);
                    frameworkContent.add(frameworkFile.getPath());
                    
                    int frameworkNameIdx = frameworkFile.getName().lastIndexOf(".");
                    if(frameworkNameIdx >= 0){
                        ldFlags = ldFlags + "-framework " + frameworkFile.getName().substring(0, frameworkNameIdx) + ";";
                    }
                }
            }
            
            if(headersContent.isEmpty()){
                for(File framework : frameworkList){
                    File headerFile = new File(framework, "Headers");
                    headersContent.add(headerFile.getPath());
                }
            }
            
            executor = new ThirdPartyFrameworkLinkExecutor(packageName, frameworkContent.toArray(new String[0]), 
            		javaSource, headersContent.toArray(new String[0]), bundleRes, outputJar, ldFlags);
        }
        else if(spec.getVendoredLibraries() != null && spec.getVendoredLibraries().size() > 0){
            Set<String> libContent = new HashSet<String>();
            
            for(String lib : spec.getVendoredLibraries()){
                Set<String> libName = getBundleResources(lib, destination);
                if (libName.size() != 1) throw new RuntimeException("Something wrong with this code. Refactor it! And the same with libraries");

                File library = new File(libName.toArray(new String[0])[0]);
                if(library.exists()){
                    libContent.add(library.getPath());
                    
                    
                    int libNameIdx = library.getName().lastIndexOf(".");
                    if(libNameIdx >= 0){
                        String libShortName = library.getName().substring(0, libNameIdx);
                        ldFlags = ldFlags + "-l" + (libShortName.startsWith("lib") ? libShortName.substring(3) : libShortName) + ";";
                    }
                }
            }
                        
            executor = new ThirdPartyLibraryLinkExecutor(packageName, libContent.toArray(new String[0]), 
            		javaSource, headersContent.toArray(new String[0]), bundleRes, outputJar, ldFlags);
        }
        return executor;
    }

    private void executePrepareCommands(File zipRoot, String prepareCommand) throws InvalidParameterSpecException, IOException, InterruptedException {
        File root = zipRoot;
        File[] children = zipRoot.listFiles();
        if(children.length == 1 && !children[0].getName().endsWith(".framework")){
            root = new File(zipRoot, children[0].getName());
        }
        else if(children.length == 2){
            if(children[0].getName().equals("__MACOSX")){
                root = new File(zipRoot, children[1].getName());
            }
            else if(children[1].getName().equals("__MACOSX")){
                root = new File(zipRoot, children[2].getName());
            }
        }
        if(root != null && root.exists()){
                String[] commandArray = prepareCommand.split("\n");
                for(String command : commandArray){
                    String[] cmd = {
                            "/bin/sh",
                            "-c",
                            command.replace("\n", "")
                            };
                    
                    Process process = Runtime.getRuntime().exec(cmd, null, root);
                    process.waitFor();
                    
                    if(process.exitValue() != 0){
                        throw new InvalidParameterSpecException("An error occured during execution of preparation commands");
                    }
                }
        } 
    }
}
