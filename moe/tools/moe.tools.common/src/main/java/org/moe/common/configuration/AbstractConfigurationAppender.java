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

import org.moe.common.Port;
import org.moe.common.ProxyPort;
import org.moe.common.utils.ArrayUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Base class for configuration appender classes.
 */
public abstract class AbstractConfigurationAppender {

    /**
     * Configuration.
     */
    private final AbstractConfiguration configuration;
    /**
     * Options.
     */
    private final ArrayList<Option> options = new ArrayList<Option>();
    /**
     * Option-help map.
     */
    private final HashMap<String, String> optionHelps = new HashMap<String, String>();
    /**
     * Option-example map.
     */
    private final HashMap<String, String> optionExamples = new HashMap<String, String>();
    /**
     * Flag indicating that setup method has been executed.
     */
    private boolean hasRunSetup = false;

    /**
     * Created a new AbstractConfigurationAppender instance.
     *
     * @param configuration configuration
     */
    protected AbstractConfigurationAppender(AbstractConfiguration configuration) {
        if (configuration == null) {
            throw new NullPointerException();
        }
        this.configuration = configuration;
    }

    /**
     * Setup appender and add options.
     */
    protected abstract void setup();

    /**
     * Add lookup for match 'option=value'.
     * <p>
     * Example: addOptionWithArg("-username", USER_NAME_PROPERTY); will look for strings like
     * "-username=mike" and assign mike to the USER_NAME_PROPERTY property.
     *
     * @param option   option prefix
     * @param property property to assign to
     */
    protected final void addOptionWithArg(String option, String property) {
        options.add(new Option(option, property, false, null));
    }

    /**
     * Add lookup for match 'option'.
     * <p>
     * Example: addOptionWithValue("-loadFile", LOAD_FILE_PROPERTY, Boolean.TRUE); will look for strings like
     * "-loadFile" and assign Boolean.TRUE to the LOAD_FILE_PROPERTY property.
     *
     * @param option   option prefix
     * @param property property to assign to
     * @param value    value to assign to the property
     */
    protected final void addOptionWithValue(String option, String property, Object value) {
        options.add(new Option(option, property, true, value));
    }

    /**
     * Add a printable optionHelps to the specified property.
     *
     * @param property    property
     * @param example     option usage example
     * @param description property description
     */
    protected final void addHelp(String property, String example, String description) {
        optionHelps.put(property, description);
        if (example != null && example.length() > 0) {
            optionExamples.put(property, "Example: " + example);
        }
    }

    /**
     * Runs the appender for the specified strings.
     *
     * @param options option strings
     */
    public final void set(String... options) {
        if (!hasRunSetup) {
            hasRunSetup = true;
            setup();
        }
        for (String option : options) {
            if ("-h".equals(option) || "--help".equals(option)) {
                printHelp();
            } else {
                pushOption(option);
            }
        }
    }

    /**
     * Prints help information to the standard output.
     */
    private void printHelp() {
        System.out.println("Help");
        System.out.println("------------------");
        ArrayList<String> printedHelps = new ArrayList<String>();
        for (Option option : options) {
            if (printedHelps.contains(option.propertyName)) {
                continue;
            }
            printedHelps.add(option.propertyName);
            String desc = optionHelps.get(option.propertyName);
            if (desc == null) {
                continue;
            }
            String example = optionExamples.get(option.propertyName);

            ArrayList<String> args = new ArrayList<String>();
            args.add(option.optionName);
            for (Option option2 : options) {
                if (option.propertyName.equals(option2.propertyName) &&
                        !args.contains(option2.optionName)) {
                    args.add(option2.optionName);
                }
            }

            System.out.println(ArrayUtil.join(args, ","));
            System.out.println(fitInWidth(desc, 80));
            if (example != null && example.length() > 0) {
                System.out.println("        " + example);
            }
            System.out.println();
        }
    }

    /**
     * Does a lazy linebreak for the specified string.
     *
     * @param value string to linebreak
     * @param width line width
     * @return broken string
     */
    private String fitInWidth(String value, int width) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(value.split(" ")));
        StringBuilder builder = new StringBuilder(value.length() + 30);
        int linew = 4;
        builder.append("    ");
        for (String word : words) {
            if (linew + word.length() > width && linew != 4) {
                linew = 4;
                builder.append("\n    ");
            }
            builder.append(word).append(" ");
            linew += word.length() + 1;
        }
        return builder.toString();
    }

    /**
     * Push a single option.
     *
     * @param input option to put
     */
    private void pushOption(String input) {
        for (Option option : options) {
            try {
                Object value = tryGetValue(input, option);
                configuration.setProperty(option.propertyName, value);
                return;
            } catch (IOException ex) {
                // Ignore
            }
        }
        throw new IllegalArgumentException("Unrecognized argument '" + input + "'");
    }

    /**
     * Tries to read an option and return a corresponding value.
     *
     * @param value  input string
     * @param option option to match
     * @return corresponding value
     * @throws IOException If the reading fails
     */
    private Object tryGetValue(String value, Option option) throws IOException {
        if (!value.startsWith(option.optionName)) {
            throw new IOException();
        }
        value = value.substring(option.optionName.length());
        if (option.setsValue) {
            if (value.length() != 0) {
                throw new IOException();
            }
            return option.valueSet;
        } else {
            if (!value.startsWith("=")) {
                throw new IOException();
            } else {
                value = value.substring(1);
                return value.length() == 0 ? null : convertValue(value, option);
            }
        }
    }

    /**
     * Converts a value for the specified option.
     *
     * @param value  value to convert
     * @param option option to convert for
     * @return converted value
     */
    protected Object convertValue(String value, Option option) {
        Class<?> clazz = configuration.getPropertyClass(option.propertyName);
        if (clazz == String.class) {
            return value;
        } else if (clazz == File.class) {
            return new File(value);
        } else if (clazz == Boolean.class) {
            return Boolean.valueOf(value);
        } else if (clazz == Byte.class) {
            return new Byte(value);
        } else if (clazz == Short.class) {
            return new Short(value);
        } else if (clazz == Integer.class) {
            return new Integer(value);
        } else if (clazz == Long.class) {
            return new Long(value);
        } else if (clazz == Float.class) {
            return new Float(value);
        } else if (clazz == Double.class) {
            return new Double(value);
        } else if (clazz == ProxyPort.class) {
            return ProxyPort.parse(value);
        } else if (clazz == Port.class) {
            return Port.parse(value);
        } else {
            return value;
        }
    }

    /**
     * Helper class representing an option.
     */
    private static class Option {
        /**
         * Option name.
         */
        private final String optionName;

        /**
         * Property name.
         */
        private final String propertyName;

        /**
         * Flag for setting a custom value.
         */
        private final boolean setsValue;

        /**
         * Custom value being set.
         */
        private final Object valueSet;

        /**
         * Creates a new Option instance.
         *
         * @param optionName   option name
         * @param propertyName property name
         * @param setsValue    sets value
         * @param valueSet     custom value
         */
        private Option(String optionName, String propertyName, boolean setsValue, Object valueSet) {
            if (optionName == null || propertyName == null) {
                throw new NullPointerException();
            }
            this.optionName = optionName;
            this.propertyName = propertyName;
            this.setsValue = setsValue;
            this.valueSet = valueSet;
        }
    }
}
