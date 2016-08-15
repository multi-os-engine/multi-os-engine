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

package org.moe.tools.natjgen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NatjGenConfig {

    public NatjGenConfig() {
    }

    public static String generate(String packageName, List<String> headers) {
        List<String> sources = new ArrayList<String>();
        List<String> headerSearchPaths = new ArrayList<String>();

        String path;

        int pos;
        boolean found;

        for(String header : headers) {
            pos = header.lastIndexOf(File.separator);

            if(pos != -1) {
                path = header.substring(0, pos);
                header = header.substring(pos + 1);
            }
            else {
                path = "";
            }

            sources.add(header);

            if(!path.isEmpty()) {
                found = false;

                for (String searchPath : headerSearchPaths) {
                    if (path.compareToIgnoreCase(searchPath) == 0) {
                        found = true;
                    }
                }

                if(!found) {
                    headerSearchPaths.add(path);
                }
            }
        }

        String sourcePlaceholder = "\"";

        for(String source : sources) {
            sourcePlaceholder += "#import \\\"" + source + "\\\"\n";
        }

        sourcePlaceholder += "\"";

        String pathsPlaceholder = "";

        for(String headerPath : headerSearchPaths) {
            pathsPlaceholder += "\"" + headerPath + "\",\n";
        }

        if(pathsPlaceholder.lastIndexOf(",\n") != -1) {
            pathsPlaceholder = pathsPlaceholder.substring(0, pathsPlaceholder.length() - 2);
        }

        String template = "{\n" +
                "  \"platform\": \"iOS\",\n" +
                "  \"package-base\": \"__package_name__\",\n" +
                "  \"base-sdk\": \"/Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS.sdk\",\n" +
                "  \"header-search-paths\": [],\n" +
                "  \"framework-search-paths\": [" +
                "    \"${PROJECT}/lib\"\n" +
                "],\n" +
                "  \"user-header-search-paths\": [\n" +
                "    __header_search_paths__\n" +
                "  ],\n" +
                "  \"source\": __source__,\n" +
                "  \"output\": \"src/main/java\",\n" +
                "  \"docsets\": [],\n" +
                "  \"unit-rules\": [\n" +
                "    {\n" +
                "      \"final\": false,\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"path-prefix\",\n" +
                "          \"value\": \"${SDK}\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"actions\": [\n" +
                "        {\n" +
                "          \"action\": \"replace-package-base\",\n" +
                "          \"value\": \"ios\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"action\": \"handling-mode\",\n" +
                "          \"value\": \"external\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"type-config-clean-output\": false,\n" +
                "  \"header-file-resolving-paths\": [\n" +
                "    \"${SDK}/usr/include\",\n" +
                "    \"${SDK}/System/Library/Frameworks\"\n" +
                "  ]\n" +
                "}";

        template = template.replace("__package_name__", packageName);
        template = template.replace("__header_search_paths__", pathsPlaceholder);
        template = template.replace("__source__", sourcePlaceholder);

        return template;
    }
}
