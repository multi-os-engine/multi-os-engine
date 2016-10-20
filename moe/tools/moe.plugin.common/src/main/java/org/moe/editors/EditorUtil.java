/*
Copyright (C) 2016 Migeran

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

package org.moe.editors;

import com.dd.plist.NSString;

import java.io.File;
import java.util.Map;

public class EditorUtil {

    public static String getKey(Map<String, String> map, String value) {
        for (String key : map.keySet()) {
            String v = map.get(key);
            if (v.equals(value)) {
                return key;
            }
        }
        return null;
    }

    public static String getNSStringKey(Map<String, NSString> map, NSString value) {
        for (String key : map.keySet()) {
            String v = map.get(key).getContent();
            if (v.equals(value.getContent())) {
                return key;
            }
        }
        return "";
    }

    public static String getXcodeProjectName(File file) {
        // Fix path if xcodeproj is the input
        int idx = file.getName().lastIndexOf('.');
        if (idx >= 0 && file.getName().substring(idx + 1).equals("xcodeproj")) {
            file = new File(file, "project.pbxproj");
        }

        // Get project name
        File parent = file.getParentFile();
        if (parent != null) {
            String name = parent.getName();
            if (name.endsWith(".xcodeproj")) {
                return name.substring(0, name.length() - ".xcodeproj".length());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static String getInterfaceNameWithoutExtension(String fullName) {
        return fullName.substring(0, fullName.indexOf("."));
    }
}
