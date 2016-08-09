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

package org.moe.template;

import org.moe.idea.utils.logger.LoggerFactory;
import com.intellij.openapi.diagnostic.Logger;


public class MOEClassTemplate {

    private static final Logger LOG = LoggerFactory.getLogger(MOEClassTemplate.class);

    private String className;
    private String subclassName;
    private String packageName;

    final String templatePath = "/template/classes/MOEClassTemplate";

    public MOEClassTemplate(String className, String subclassName, String packageName) {
        this.className = className;
        this.subclassName = subclassName;
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public String getPackageName() {
        return packageName;
    }

}
