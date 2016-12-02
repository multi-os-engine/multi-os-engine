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

import java.util.ArrayList;
import java.util.List;

public class HeaderBinding extends AbstractBinding {
    public static final String TYPE = "header";
    private String headerPath;
    private final List<String> headerSearchPaths = new ArrayList<String>();
    private final List<String> userHeaderSearchPaths = new ArrayList<String>();
    private final List<String> frameworkSearchPaths = new ArrayList<String>();
    private String packageBase;
    private String importCode;

    public HeaderBinding() {
        super(TYPE);
    }

    public String getHeaderPath() {
        return headerPath;
    }

    public void setHeaderPath(String headerPath) {
        this.headerPath = headerPath;
    }

    public List<String> getHeaderSearchPaths() {
        return headerSearchPaths;
    }

    public List<String> getUserHeaderSearchPaths() {
        return userHeaderSearchPaths;
    }

    public List<String> getFrameworkSearchPaths() {
        return frameworkSearchPaths;
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
        validate(headerPath != null, "headerPath is not set");
        validate(headerPath.length() > 0, "headerPath is not set");
        validate(!headerPath.contains("\\"), "headerPath is incorrect, path must use Unix file separators (/)");
        validate(packageBase != null, "package base is not set");
        validate(packageBase.length() > 0, "package base is not set");
        validate(JavaUtil.isValidJavaPackage(packageBase), "package base is not a valid Java package");
        validate(importCode != null, "import code is not set");
        validate(importCode.length() > 0, "import code is not set");
    }
}
