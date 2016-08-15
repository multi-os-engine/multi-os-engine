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

public class NatjGenUIConfig {
    public static String generateNatjGenFile(String packageName, String baseSDK, String headerSearchPath, String className, String sourceCode){
        String template = "{\n" +
            "  \"platform\": \"iOS\",\n" +
            "  \"package-base\": \"__package_name__\",\n" +
            "  \"base-sdk\": \"__base_sdk__\",\n" +
            "  \"output\": \"src/main/java\",\n" +
            "  \"header-search-paths\": [],\n" +
            "  \"user-header-search-paths\": [\n" +
            "    \"__header_search_paths__\"\n" +
            "  ],\n" +
            "  \"framework-search-paths\": [" +
            "    \"${PROJECT}/lib\"\n" +
            "],\n" +
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
            "    },\n" +
            "    {\n" +
            "      \"final\": false,\n" +
            "      \"conditions\": [\n" +
            "        {\n" +
            "          \"condition\": \"type-match\",\n" +
            "          \"value\": \"objc-class\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"condition\": \"name-match\",\n" +
            "          \"value\": \"__class_name__\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"actions\": [\n" +
            "        {\n" +
            "          \"action\": \"generate-hybrid-class\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"type-config-clean-output\": false,\n" +
            "  \"header-file-resolving-paths\": [\n" +
            "    \"${SDK}/usr/include\",\n" +
            "    \"${SDK}/System/Library/Frameworks\"\n" +
            "  ],\n" +
            "  \"source\":\"__source_code__\"\n" +
            "  \n" +
            "}";
        template = template.replace("__package_name__", packageName);
        template = template.replace("__base_sdk__", baseSDK);
        template = template.replace("__header_search_paths__", headerSearchPath);
        template = template.replace("__class_name__", className);
        template = template.replace("__source_code__", sourceCode);

        return template;
    }

}
