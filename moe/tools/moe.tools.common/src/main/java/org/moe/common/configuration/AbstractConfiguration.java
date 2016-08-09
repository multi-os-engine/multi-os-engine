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

package org.moe.common.configuration;

import org.moe.common.utils.ArrayUtil;

import java.io.File;

/**
 * Base class for validated configuration classes.
 */
public abstract class AbstractConfiguration {

    /*
    Configuration property errors.
     */
    /**
     * Property is not defined error.
     */
    public static final String PROPERTY_NOT_DEFINED_ERROR = "Property is not defined";

    /**
     * Space character in property is not allowed error.
     */
    public static final String PROPERTY_CONTAINS_SPACE_ERROR = "Space character in property is not allowed";

    /**
     * Property cannot be empty error.
     */
    public static final String PROPERTY_IS_EMPTY_ERROR = "Property cannot be empty";

    /**
     * Property must point to a valid file error.
     */
    public static final String PROPERTY_FILE_DOESNT_EXIST_ERROR = "Property must point to a valid file";

    /**
     * Property must point to a valid directory error.
     */
    public static final String PROPERTY_DIRECTORY_DOESNT_EXIST_ERROR = "Property must point to a valid directory";

    /**
     * Property value is invalid error.
     */
    public static final String PROPERTY_VALUE_INVALID = "Property value is invalid";

    /**
     * Close flag.
     */
    private boolean closed;

    /**
     * Close the configuration for editing.
     */
    public void close() {
        closed = true;
    }

    /**
     * Returns the close flag of this object.
     *
     * @return close flag
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Throws a java.lang.IllegalStateException exception if the object is closed.
     */
    protected void requireOpen() {
        if (isClosed()) {
            throw new IllegalStateException("configuration is closed");
        }
    }

    /**
     * Validates the configuration object.
     *
     * @throws ConfigurationValidationException If validation failed.
     */
    public abstract void validate() throws ConfigurationValidationException;

    /**
     * Returns a property of this configuration.
     *
     * @param key property key
     * @return property's value
     */
    public Object getProperty(String key) {
        throw new IllegalArgumentException("unknown key: " + key);
    }

    /**
     * Sets a property of this configuration.
     *
     * @param key   property key
     * @param value new value
     */
    public void setProperty(String key, Object value) {
        throw new IllegalArgumentException("unknown key: " + key);
    }

    /**
     * Returns the class of a property of this configuration.
     *
     * @param key property key
     * @return property's cass
     */
    public Class<?> getPropertyClass(String key) {
        throw new IllegalArgumentException("unknown key: " + key);
    }

    /**
     * Returns all the accessible property names in this configuration.
     *
     * @return all the accessible property names
     */
    public String[] getAllPropertyNames() {
        return new String[0];
    }

    /**
     * Asserts that the value is not null.
     *
     * @param property property being checked
     * @param value    value being checked
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final void assertNotNull(String property, Object value) throws ConfigurationValidationException {
        if (value == null) {
            throw new ConfigurationValidationException(property, PROPERTY_NOT_DEFINED_ERROR);
        }
    }

    /**
     * Asserts that the value is not an empty string. This assert enables the string to be null.
     *
     * @param property property being checked
     * @param value    value being checked
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final void assertNotEmpty(String property, String value) throws ConfigurationValidationException {
        if (value != null && value.length() == 0) {
            throw new ConfigurationValidationException(property, PROPERTY_IS_EMPTY_ERROR);
        }
    }

    /**
     * Asserts that the value doesn't contain any space characters.
     *
     * @param property property being checked
     * @param value    value being checked
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final void assertNoSpace(String property, String value) throws ConfigurationValidationException {
        if (value != null && value.contains(" ")) {
            throw new ConfigurationValidationException(property, PROPERTY_CONTAINS_SPACE_ERROR);
        }
    }

    /**
     * Asserts that the value points to a valid file. Directories are not accepted.
     *
     * @param property property being checked
     * @param value    value being checked
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final void assertFileExists(String property, File value) throws ConfigurationValidationException {
        if (value == null) {
            return;
        }
        if (!value.exists() || !value.isFile()) {
            throw new ConfigurationValidationException(property, PROPERTY_FILE_DOESNT_EXIST_ERROR);
        }
    }

    /**
     * Asserts that the value points to a valid directory. Files are not accepted.
     *
     * @param property property being checked
     * @param value    value being checked
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final void assertDirectoryExists(String property, File value) throws ConfigurationValidationException {
        if (value == null) {
            return;
        }
        if (!value.exists() || !value.isDirectory()) {
            throw new ConfigurationValidationException(property, PROPERTY_DIRECTORY_DOESNT_EXIST_ERROR);
        }
    }

    /**
     * Asserts that the value is equal to one in the specified array.
     *
     * @param property property being checked
     * @param value    value being checked
     * @param array    array of valid values
     * @param <T>      type of the array's element
     * @throws ConfigurationValidationException if the assertion fails
     */
    protected final <T> void assertValueIsOneOf(String property, T value, T[] array) throws ConfigurationValidationException {
        if (value == null) {
            return;
        }
        if (!ArrayUtil.contains(array, value)) {
            throw new ConfigurationValidationException(property, PROPERTY_VALUE_INVALID + " (" + ArrayUtil.join(array, ", ") + ")");
        }
    }
}
