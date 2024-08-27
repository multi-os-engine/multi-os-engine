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

/**
 * ConfigurationValidationException is thrown on Configuration validation failure.
 */
public final class ConfigurationValidationException extends Exception {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Property that failed.
     */
    private final String propertyName;

    /**
     * Error message.
     */
    private final String errorMessage;

    /**
     * Creates a new ValidationException instance.
     *
     * @param propertyName property name
     * @param errorMessage error message
     */
    ConfigurationValidationException(String propertyName, String errorMessage) {
        this.propertyName = propertyName;
        this.errorMessage = errorMessage;
    }

    /**
     * Returns the failed property's name.
     *
     * @return property's name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Returns the error message.
     *
     * @return error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}
