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

package org.moe.common.application;

import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bundle {
    public static String getBundleId(String bundlePath) {

        NSDictionary rootDict = getRootDictonary(bundlePath);

        if(rootDict == null) {
            return null;
        }

        return rootDict.objectForKey("CFBundleIdentifier").toString();
    }

    public static String getExecutablePath(String bundlePath) {
        NSDictionary rootDict = getRootDictonary(bundlePath);

        if(rootDict == null) {
            return null;
        }

        File file = new File(bundlePath, rootDict.objectForKey("CFBundleExecutable").toString());

        return file.getAbsolutePath();
    }

    private static NSDictionary getRootDictonary(String bundlePath) {
        File appFolder = new File(bundlePath);

        if (!appFolder.exists() || !appFolder.isDirectory()) {
            return null;
        }

        File plistFile = new File(appFolder, "Info.plist");

        if (!plistFile.exists()) {
            return null;
        }

        FileInputStream inputStream;

        try {
            inputStream = new FileInputStream(plistFile);
        }
        catch (FileNotFoundException e) {
            return null;
        }

        NSDictionary rootDict;

        try {
            rootDict = (NSDictionary) PropertyListParser.parse(inputStream);
        }
        catch (Exception e) {
            return null;
        }

        return rootDict;
    }
}
