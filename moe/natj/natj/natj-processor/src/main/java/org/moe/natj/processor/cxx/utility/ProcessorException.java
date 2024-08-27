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

package org.moe.natj.processor.cxx.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This exception stores contextual information about processing failure.
 */
public class ProcessorException extends RuntimeException {

    /**
     * Diagnostics separator string.
     */
    private static final String DIAG_SEPARATOR = "------------ Diagnostics ------------";

    /**
     * Stacktrace separator string.
     */
    private static final String STAC_SEPARATOR = "------------ Stacktrace -------------";

    /**
     * Diagnostic information.
     */
    private IDiagInfo diagInfo;

    /**
     * Contextual data.
     */
    private final Map<String, Object> contextData = new HashMap<>();

    /**
     * Exception message.
     */
    private String message;

    /**
     * Creates a new ProcessorException instance.
     */
    public ProcessorException() {
    }

    /**
     * Creates a new ProcessorException instance.
     *
     * @param cause Cause
     */
    public ProcessorException(Throwable cause) {
        super(cause);
    }

    /**
     * Returns the diagnostic information.
     *
     * @return Diagnostic information
     */
    public IDiagInfo getDiagInfo() {
        return diagInfo;
    }

    /**
     * Sets diagnostic information.
     *
     * @param diagInfo Diagnostic information
     */
    public void setDiagInfo(IDiagInfo diagInfo) {
        this.diagInfo = diagInfo;
    }

    /**
     * Returns contextual data.
     *
     * @return Contextual data
     */
    public Map<String, Object> getContextData() {
        return Collections.unmodifiableMap(contextData);
    }

    /**
     * Puts contextual data.
     *
     * @param key   Key
     * @param value Value
     */
    public void put(String key, Object value) {
        contextData.put(key, value);
    }

    /**
     * Sets the exception's message.
     *
     * @param message Message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        if (message != null) {
            builder.append(message).append('\n');
        } else {
            builder.append("An unknown exception occurred\n");
        }
        if (diagInfo != null || (contextData != null && contextData.size() > 0)) {
            builder.append(DIAG_SEPARATOR).append('\n');
            if (diagInfo != null) {
                builder.append(diagInfo).append('\n');
            }
            if (contextData != null && contextData.size() > 0) {
                builder.append("Context {\n");
                int padding = 0;
                for (Map.Entry<String, Object> entry : contextData.entrySet()) {
                    padding = Math.max(padding, entry.getKey().length());
                }
                ++padding;
                for (Map.Entry<String, Object> entry : contextData.entrySet()) {
                    builder.append(" ").append(entry.getKey()).append(" = ").append(entry.getValue()).append(",\n");
                }
                builder.append("}\n");
            }
        }
        builder.append(STAC_SEPARATOR);
        return builder.toString();
    }
}
