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

package org.moe.generator.project.util;

import java.util.HashMap;

/**
 * FileTypeUtil simplifies file type associations.
 */
public final class FileTypeUtil {

    /**
     * Map containing extension-file type pairs.
     */
    private static final HashMap<String, String> extensionFileTypeMap;

    static {
        extensionFileTypeMap = new HashMap<String, String>();
        extensionFileTypeMap.put("c", "sourcecode.c.c");
        extensionFileTypeMap.put("cfbundle", "wrapper.cfbundle");
        extensionFileTypeMap.put("cpp", "sourcecode.cpp.cpp");
        extensionFileTypeMap.put("dat", "text");
        extensionFileTypeMap.put("framework", "wrapper.framework");
        extensionFileTypeMap.put("jar", "archive.jar");
        extensionFileTypeMap.put("jpeg", "image.jpeg");
        extensionFileTypeMap.put("jpg", "image.jpeg");
        extensionFileTypeMap.put("h", "sourcecode.c.h");
        extensionFileTypeMap.put("m", "sourcecode.c.objc");
        extensionFileTypeMap.put("plist", "text.plist.xml");
        extensionFileTypeMap.put("png", "image.png");
        extensionFileTypeMap.put("storyboard", "file.storyboard");
        extensionFileTypeMap.put("txt", "text");
        extensionFileTypeMap.put("xcassets", "folder.assetcatalog");
        extensionFileTypeMap.put("scnassets", "wrapper.scnassets");
        extensionFileTypeMap.put("xcconfig", "text.xcconfig");
        extensionFileTypeMap.put("xib", "file.xib");
    }

    /**
     * Return the default file type for the specified file.
     *
     * @param fileName file name
     * @return default file type or null
     */
    public static String getFileType(String fileName) {
        String type = null;

        if (fileName == null) {
            throw new NullPointerException();
        }
        int idx = fileName.lastIndexOf(".");
        if (idx != -1) {
            String extension = fileName.substring(idx + 1);
            type = extensionFileTypeMap.get(extension);
        }

        if (type == null) {
            type = "text";
        }
        return type;
    }
}
