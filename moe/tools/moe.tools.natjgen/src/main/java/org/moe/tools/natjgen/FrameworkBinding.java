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

package org.moe.tools.natjgen;

import org.moe.tools.natjgen.util.JavaUtil;

public class FrameworkBinding extends AbstractBinding {
    public static final String TYPE = "framework";
    private String frameworkPath;
    private String packageBase;
    private String importCode;

    public FrameworkBinding() {
        super(TYPE);
    }

    public String getFrameworkPath() {
        return frameworkPath;
    }

    public void setFrameworkPath(String frameworkPath) {
        this.frameworkPath = frameworkPath;
    }

    public String getPackageBase() {
        return packageBase;
    }

    public void setPackageBase(String packageBase) {
        this.packageBase = packageBase;
    }

    public String getImportCode() {
        return importCode;
    }

    public void setImportCode(String importCode) {
        this.importCode = importCode;
    }

    @Override
    public void validate() throws ValidationException {
        validate(frameworkPath != null, "frameworkPath is not set");
        validate(frameworkPath.length() > 0, "frameworkPath is not set");
        validate(frameworkPath.endsWith(".framework"),
                "frameworkPath is incorrect, path must point to a <name>.framework directory");
        validate(!frameworkPath.contains("\\"), "frameworkPath is incorrect, path must use Unix file separators (/)");
        validate(packageBase != null, "package base is not set");
        validate(packageBase.length() > 0, "package base is not set");
        validate(JavaUtil.isValidJavaPackage(packageBase), "package base is not a valid Java package");
        validate(importCode != null, "import code is not set");
        validate(importCode.length() > 0, "import code is not set");
    }

    public String getFrameworkName() {
        String framework = this.frameworkPath;
        int lastIndexOf = framework.lastIndexOf('/');
        if (lastIndexOf != -1) {
            framework = framework.substring(lastIndexOf + 1);
        }
        lastIndexOf = framework.lastIndexOf(".framework");
        if (lastIndexOf != -1) {
            framework = framework.substring(0, lastIndexOf);
        }
        return framework;
    }

    public String getFrameworkParentPath() {
        String framework = this.frameworkPath;
        int lastIndexOf = framework.lastIndexOf('/');
        if (lastIndexOf != -1) {
            framework = framework.substring(0, lastIndexOf);
        }
        return framework;
    }
}
