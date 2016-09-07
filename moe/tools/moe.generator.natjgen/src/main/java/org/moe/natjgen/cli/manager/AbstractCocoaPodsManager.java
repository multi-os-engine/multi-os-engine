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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractCocoaPodsManager {
    protected Set<String> getBundleResources(String bundleWildcard, File unzipedFolder){
        List<File> folders = getFolderList(bundleWildcard, unzipedFolder);
        Set<String> bundle = new HashSet<String>();
        if(folders.size() > 0){
            String nameRegEx = getFileNameValidRegEx(bundleWildcard);
            
            for(File file : folders){
                for(File child : file.listFiles()){
                    if(child.getName().matches(nameRegEx)){
                        bundle.add(child.getPath());
                    }
                }
            }
        }
        return bundle;
    }
    
    protected List<File> getFolderList(String bundleWildcard, File unzipedFolder){
        List<File> result = new ArrayList<>();
        
        List<File> allFolder = getFolderRecursively(unzipedFolder);
        
        int recursiveIdx = bundleWildcard.indexOf("**");
        if(recursiveIdx >= 0){
            String pathWildcard = bundleWildcard.substring(0, recursiveIdx);
            
            int dirIdx = bundleWildcard.lastIndexOf("/");
            String otherDirPath = bundleWildcard.substring(recursiveIdx + 2, dirIdx);
            pathWildcard =  unzipedFolder.getPath() + File.separator + convertGlobToRegEx(pathWildcard) + ".*" + otherDirPath;

            String rootFolder = unzipedFolder.getPath() + (recursiveIdx == 0 ? "" : File.separator + bundleWildcard.substring(0, recursiveIdx - 1)) + otherDirPath;
            
            for(File file : allFolder){
                if(file.getAbsolutePath().matches(pathWildcard) || file.getAbsolutePath().equals(rootFolder)){
                    result.add(file);
                }
            }
        }
        else{
            int folderIdx = bundleWildcard.lastIndexOf("/");
            if(folderIdx >= 0){
                String pathNameRegEx = bundleWildcard.substring(0, folderIdx);
                pathNameRegEx = unzipedFolder.getPath() + File.separator + convertGlobToRegEx(pathNameRegEx);
                
                for(File file : allFolder){
                    if(file.getPath().matches(pathNameRegEx)){
                        result.add(file);
                    }
                }
            }
            else{
                result.add(unzipedFolder);
            }
        }

        return result;
    }
    
    private List<File> getFolderRecursively(File unzipedFolder){
        List<File> result = new ArrayList<>();
        result.add(unzipedFolder);
        for(File file : unzipedFolder.listFiles()){
            if(file.isDirectory()){
                result.addAll(getFolderRecursively(file));
            }
        }
        return result;
    }
    
    protected String getFileNameValidRegEx(String bundleWildcard){
        String[] pathElements = bundleWildcard.split("/");
        
        String nameWildcard = null;
        if(pathElements.length > 0){
            nameWildcard = pathElements[pathElements.length - 1];
        }
        else{
            nameWildcard = bundleWildcard;
        }
        
        nameWildcard = convertGlobToRegEx(nameWildcard);

        return nameWildcard;
    }
    
    protected String convertGlobToRegEx(String line)
    {
        line = line.trim();
        int strLen = line.length();
        StringBuilder sb = new StringBuilder(strLen);
        boolean escaping = false;
        int inCurlies = 0;
        for (char currentChar : line.toCharArray())
        {
            switch (currentChar)
            {
            case '*':
                if (escaping)
                    sb.append("\\*");
                else
                    sb.append(".*");
                escaping = false;
                break;
            case '?':
                if (escaping)
                    sb.append("\\?");
                else
                    sb.append('.');
                escaping = false;
                break;
            case '.':
            case '(':
            case ')':
            case '+':
            case '|':
            case '^':
            case '$':
            case '@':
            case '%':
                sb.append('\\');
                sb.append(currentChar);
                escaping = false;
                break;
            case '\\':
                if (escaping)
                {
                    sb.append("\\\\");
                    escaping = false;
                }
                else
                    escaping = true;
                break;
            case '{':
                if (escaping)
                {
                    sb.append("\\{");
                }
                else
                {
                    sb.append('(');
                    inCurlies++;
                }
                escaping = false;
                break;
            case '}':
                if (inCurlies > 0 && !escaping)
                {
                    sb.append(')');
                    inCurlies--;
                }
                else if (escaping)
                    sb.append("\\}");
                else
                    sb.append("}");
                escaping = false;
                break;
            case ',':
                if (inCurlies > 0 && !escaping)
                {
                    sb.append('|');
                }
                else if (escaping)
                    sb.append("\\,");
                else
                    sb.append(",");
                break;
            default:
                escaping = false;
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
