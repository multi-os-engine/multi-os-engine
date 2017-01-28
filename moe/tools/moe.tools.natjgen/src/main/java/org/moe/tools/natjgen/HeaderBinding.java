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

/**
 * This class is specialized on configuring bindings for custom headers.
 */
public class HeaderBinding extends AbstractBinding {
    /**
     * Binding type.
     */
    public static final String TYPE = "header";

    /**
     * Validation error: header path is not set.
     */
    public static final String ERR_HEADER_PATH_IS_NOT_SET = "header path is not set";
    /**
     * Validation error: header path is incorrect, path must use Unix file separators (/).
     */
    public static final String ERR_HEADER_PATH_MUST_USE_UNIX_FILE_SEPARATORS = "header path is incorrect, path must use Unix file separators (/)";
    /**
     * Validation error: package base is not set.
     */
    public static final String ERR_PACKAGE_BASE_IS_NOT_SET = "package base is not set";
    /**
     * Validation error: package base is not a valid Java package.
     */
    public static final String ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE = "package base is not a valid Java package";
    /**
     * Validation error: import code is not set.
     */
    public static final String ERR_IMPORT_CODE_IS_NOT_SET = "import code is not set";
    /**
     * Validation error: path value must not be null.
     */
    public static final String ERR_PATH_VALUE_MUST_NOT_BE_NULL = "path value must not be null";
    /**
     * Validation error: path is incorrect, path must use Unix file separators (/).
     */
    public static final String ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS = "path is incorrect, path must use Unix file separators (/)";
    /**
     * Validation error: explicit library is invalid, value is set but length is 0.
     */
    public static final String ERR_EXPLICIT_LIBRARY_IS_SET_BUT_EMPTY = "explicit library is invalid, value is set but length is 0";

    /**
     * Path to the Objective-C/C header.
     */
    private String headerPath;
    /**
     * Paths to search for system includes.
     */
    private final List<String> headerSearchPaths = new ArrayList<String>();
    /**
     * Paths to search for user includes.
     */
    private final List<String> userHeaderSearchPaths = new ArrayList<String>();
    /**
     * Paths to search for framework includes.
     */
    private final List<String> frameworkSearchPaths = new ArrayList<String>();
    /**
     * Package base for the framework.
     */
    private String packageBase;
    /**
     * Objective-C/C code for importing the framework.
     */
    private String importCode;
    /**
     * Custom library to use when creating bindings.
     */
    private String explicitLibrary;

    /**
     * Creates a new HeaderBinding instance.
     */
    public HeaderBinding() {
        super(TYPE);
    }

    /**
     * Returns the path to the Objective-C/C header.
     *
     * @return Path to the Objective-C/C header
     */
    public String getHeaderPath() {
        return headerPath;
    }

    /**
     * Sets the path to the Objective-C/C header.
     *
     * @param headerPath Path to the Objective-C/C header
     */
    public void setHeaderPath(String headerPath) {
        this.headerPath = headerPath;
    }

    /**
     * Returns the paths to search for system includes.
     *
     * @return Paths to search for system includes
     */
    public List<String> getHeaderSearchPaths() {
        return headerSearchPaths;
    }

    /**
     * Returns the paths to search for user includes.
     *
     * @return Paths to search for user includes
     */
    public List<String> getUserHeaderSearchPaths() {
        return userHeaderSearchPaths;
    }

    /**
     * Returns the paths to search for framework includes.
     *
     * @return Paths to search for framework includes
     */
    public List<String> getFrameworkSearchPaths() {
        return frameworkSearchPaths;
    }

    /**
     * Returns the package base for the framework.
     *
     * @return Package base for the framework
     */
    public String getPackageBase() {
        return packageBase;
    }

    /**
     * Sets the package base for the framework.
     *
     * @param packageBase Package base for the framework
     */
    public void setPackageBase(String packageBase) {
        this.packageBase = packageBase;
    }

    /**
     * Returns the Objective-C/C code for importing the framework.
     *
     * @return Objective-C/C code for importing the framework
     */
    public String getImportCode() {
        return importCode;
    }

    /**
     * Sets the Objective-C/C code for importing the framework.
     *
     * @param importCode Objective-C/C code for importing the framework
     */
    public void setImportCode(String importCode) {
        this.importCode = importCode;
    }

    /**
     * Returns the custom library to use when creating bindings.
     *
     * @return Custom library to use when creating bindings
     */
    public String getExplicitLibrary() {
        return explicitLibrary;
    }

    /**
     * Sets the custom library to use when creating bindings.
     *
     * @param explicitLibrary Custom library to use when creating bindings
     */
    public void setExplicitLibrary(String explicitLibrary) {
        this.explicitLibrary = explicitLibrary;
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
        if (explicitLibrary != null) {
            validate(explicitLibrary.length() > 0, ERR_EXPLICIT_LIBRARY_IS_SET_BUT_EMPTY);
        }

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
        if (getExplicitLibrary() != null) {
            json.addProperty("explicitLibrary", getExplicitLibrary());
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

        setExplicitLibrary(null);
        final JsonPrimitive jsonExplicitLibrary = json.getAsJsonPrimitive("explicitLibrary");
        if (jsonExplicitLibrary != null) {
            setExplicitLibrary(jsonExplicitLibrary.getAsString());
        }
    }
}
