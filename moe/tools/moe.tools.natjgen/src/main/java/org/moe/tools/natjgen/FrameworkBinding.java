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

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.moe.tools.natjgen.util.JavaUtil;

public class FrameworkBinding extends AbstractBinding {
    public static final String TYPE = "framework";
    public static final String ERR_FRAMEWORK_PATH_IS_NOT_SET = "framework path is not set";
    public static final String ERR_FRAMEWORK_PATH_IS_NOT_FRAMEWORK_DIRECTORY =
            "framework path is incorrect, path must " + "point to a <name>.framework directory";
    public static final String ERR_FRAMEWORK_PATH_MUST_USE_UNIX_FILE_SEPARATORS =
            "framework path is incorrect, path " + "must use Unix file separators (/)";
    public static final String ERR_PACKAGE_BASE_IS_NOT_SET = "package base is not set";
    public static final String ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE = "package base is not a valid Java package";
    public static final String ERR_IMPORT_CODE_IS_NOT_SET = "import code is not set";

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
        validate(frameworkPath != null, ERR_FRAMEWORK_PATH_IS_NOT_SET);
        validate(frameworkPath.length() > 0, ERR_FRAMEWORK_PATH_IS_NOT_SET);
        validate(frameworkPath.endsWith(".framework"), ERR_FRAMEWORK_PATH_IS_NOT_FRAMEWORK_DIRECTORY);
        validate(!frameworkPath.contains("\\"), ERR_FRAMEWORK_PATH_MUST_USE_UNIX_FILE_SEPARATORS);
        validate(packageBase != null, ERR_PACKAGE_BASE_IS_NOT_SET);
        validate(packageBase.length() > 0, ERR_PACKAGE_BASE_IS_NOT_SET);
        validate(JavaUtil.isValidJavaPackage(packageBase), ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE);
        validate(importCode != null, ERR_IMPORT_CODE_IS_NOT_SET);
        validate(importCode.length() > 0, ERR_IMPORT_CODE_IS_NOT_SET);
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

    @Override
    public JsonObject getJsonObject() {
        final JsonObject json = super.getJsonObject();
        if (getFrameworkPath() != null) {
            json.addProperty("frameworkPath", getFrameworkPath());
        }
        if (getPackageBase() != null) {
            json.addProperty("packageBase", getPackageBase());
        }
        if (getImportCode() != null) {
            json.addProperty("importCode", getImportCode());
        }
        return json;
    }

    @Override
    public void setJsonObject(JsonObject json) {
        super.setJsonObject(json);

        setFrameworkPath(null);
        final JsonPrimitive jsonFrameworkPath = json.getAsJsonPrimitive("frameworkPath");
        if (jsonFrameworkPath != null) {
            setFrameworkPath(jsonFrameworkPath.getAsString());
        }

        setPackageBase(null);
        final JsonPrimitive jsonPackageBase = json.getAsJsonPrimitive("packageBase");
        if (jsonPackageBase != null) {
            setPackageBase(jsonPackageBase.getAsString());
        }

        setImportCode(null);
        final JsonPrimitive jsonImportCode = json.getAsJsonPrimitive("importCode");
        if (jsonImportCode != null) {
            setImportCode(jsonImportCode.getAsString());
        }
    }
}
