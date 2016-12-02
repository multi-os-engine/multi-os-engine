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

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.moe.tools.natjgen.util.JavaUtil;

import java.util.ArrayList;
import java.util.List;

public class HeaderBinding extends AbstractBinding {
    public static final String TYPE = "header";
    public static final String ERR_HEADER_PATH_IS_NOT_SET = "headerPath is not set";
    public static final String ERR_HEADER_PATH_MUST_USE_UNIX_FILE_SEPARATORS = "headerPath is incorrect, path must use Unix file separators (/)";
    public static final String ERR_PACKAGE_BASE_IS_NOT_SET = "package base is not set";
    public static final String ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE = "package base is not a valid Java package";
    public static final String ERR_IMPORT_CODE_IS_NOT_SET = "import code is not set";
    public static final String ERR_PATH_VALUE_MUST_NOT_BE_NULL = "path value must not be null";
    public static final String ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS = "path is incorrect, path must use Unix file separators (/)";

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
        validate(headerPath != null, ERR_HEADER_PATH_IS_NOT_SET);
        validate(headerPath.length() > 0, ERR_HEADER_PATH_IS_NOT_SET);
        validate(!headerPath.contains("\\"), ERR_HEADER_PATH_MUST_USE_UNIX_FILE_SEPARATORS);
        validate(packageBase != null, ERR_PACKAGE_BASE_IS_NOT_SET);
        validate(packageBase.length() > 0, ERR_PACKAGE_BASE_IS_NOT_SET);
        validate(JavaUtil.isValidJavaPackage(packageBase), ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE);
        validate(importCode != null, ERR_IMPORT_CODE_IS_NOT_SET);
        validate(importCode.length() > 0, ERR_IMPORT_CODE_IS_NOT_SET);

        for (String path : headerSearchPaths) {
            validate(path != null, ERR_PATH_VALUE_MUST_NOT_BE_NULL);
            validate(!path.contains("\\"), ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);
        }

        for (String path : userHeaderSearchPaths) {
            validate(path != null, ERR_PATH_VALUE_MUST_NOT_BE_NULL);
            validate(!path.contains("\\"), ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);
        }

        for (String path : frameworkSearchPaths) {
            validate(path != null, ERR_PATH_VALUE_MUST_NOT_BE_NULL);
            validate(!path.contains("\\"), ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);
        }
    }

    @Override
    public JsonObject getJsonObject() {
        final JsonObject json = super.getJsonObject();
        if (getHeaderPath() != null) {
            json.addProperty("headerPath", getHeaderPath());
        }

        final JsonArray jsonHeaderSearchPaths = new JsonArray();
        for (String path : headerSearchPaths) {
            if (path != null) {
                jsonHeaderSearchPaths.add(path);
            }
        }
        json.add("headerSearchPaths", jsonHeaderSearchPaths);

        final JsonArray jsonUserHeaderSearchPaths = new JsonArray();
        for (String path : userHeaderSearchPaths) {
            if (path != null) {
                jsonUserHeaderSearchPaths.add(path);
            }
        }
        json.add("userHeaderSearchPaths", jsonUserHeaderSearchPaths);

        final JsonArray jsonFrameworkSearchPaths = new JsonArray();
        for (String path : frameworkSearchPaths) {
            if (path != null) {
                jsonFrameworkSearchPaths.add(path);
            }
        }
        json.add("frameworkSearchPaths", jsonFrameworkSearchPaths);

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

        setHeaderPath(null);
        final JsonPrimitive jsonHeaderPath = json.getAsJsonPrimitive("headerPath");
        if (jsonHeaderPath != null) {
            setHeaderPath(jsonHeaderPath.getAsString());
        }

        readJsonStringArray(json.getAsJsonArray("headerSearchPaths"), headerSearchPaths);
        readJsonStringArray(json.getAsJsonArray("userHeaderSearchPaths"), userHeaderSearchPaths);
        readJsonStringArray(json.getAsJsonArray("frameworkSearchPaths"), frameworkSearchPaths);

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
