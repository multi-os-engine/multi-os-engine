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

package org.moe.ios.device.launcher;

import org.moe.common.configuration.AbstractConfigurationAppender;

/**
 * iOS Device launch configuration appender.
 */
public class ConfigurationAppender extends AbstractConfigurationAppender {

    /**
     * Creates a new ConfigurationAppender instance.
     *
     * @param configuration configuration to append to
     */
    private ConfigurationAppender(Configuration configuration) {
        super(configuration);
    }

    /**
     * Reads arguments from a string array and creates a configuration object for it.
     *
     * @param args arguments
     * @return Configuration instance
     */
    public static Configuration read(String[] args) {
        Configuration conf = new Configuration();
        ConfigurationAppender reader = new ConfigurationAppender(conf);
        reader.set(args);
        return conf;
    }

    @Override
    protected void setup() {
        addOptionWithArg("-u", Configuration.DEVICE_UDID_PROPERTY_NAME);
        addOptionWithArg("--udid", Configuration.DEVICE_UDID_PROPERTY_NAME);
        addHelp(Configuration.DEVICE_UDID_PROPERTY_NAME,
                "--udid=afb5fab15af51b6afba1fba65fb1a6af56b16af1",
                "Set device UDID to attach to.");

        addOptionWithArg("-a", Configuration.APPLICATION_PATH_PROPERTY_NAME);
        addOptionWithArg("--app-path", Configuration.APPLICATION_PATH_PROPERTY_NAME);
        addHelp(Configuration.APPLICATION_PATH_PROPERTY_NAME,
                "--app-path=/my/file/superapp.app",
                "Set the application to run.");

        addOptionWithValue("-l", Configuration.LIST_DEVICES_PROPERTY_NAME, Boolean.TRUE);
        addOptionWithValue("--list", Configuration.LIST_DEVICES_PROPERTY_NAME, Boolean.TRUE);
        addHelp(Configuration.LIST_DEVICES_PROPERTY_NAME, null,
                "Print the list the connected devices.");

        addOptionWithValue("-w", Configuration.WAIT_FOR_DEVICE_PROPERTY_NAME, Boolean.TRUE);
        addOptionWithValue("--wait-for-device", Configuration.WAIT_FOR_DEVICE_PROPERTY_NAME, Boolean.TRUE);
        addHelp(Configuration.WAIT_FOR_DEVICE_PROPERTY_NAME, null,
                "Wait for the specified device to be connected or if the device was not specified, " +
                        "then wait for the first connected device.");

        addOptionWithArg("-x", Configuration.ADD_LAUNCH_ARG_PROPERTY_NAME);
        addOptionWithArg("--launch-arg", Configuration.ADD_LAUNCH_ARG_PROPERTY_NAME);
        addHelp(Configuration.ADD_LAUNCH_ARG_PROPERTY_NAME,
                "-x=my_arg",
                "Pass a value as launch argument, pass this option multiple times to " +
                        "specify multiple values.");

        addOptionWithArg("-e", Configuration.ADD_ENV_VAR_PROPERTY_NAME);
        addOptionWithArg("--env", Configuration.ADD_ENV_VAR_PROPERTY_NAME);
        addHelp(Configuration.ADD_ENV_VAR_PROPERTY_NAME,
                "-e=key=value",
                "Pass a key-value pair as an env variable, pass this option multiple " +
                        "times to specify multiple key-values pairs.");

        addOptionWithArg("-p", Configuration.ADD_PROXY_PORT_PROPERTY_NAME);
        addOptionWithArg("--proxy-port", Configuration.ADD_PROXY_PORT_PROPERTY_NAME);
        addHelp(Configuration.ADD_PROXY_PORT_PROPERTY_NAME,
                "-p=8000 -p=5900:5901",
                "Create a proxy server to the device. Specify the value as in example '12000' if " +
                        "the local and remote ports are the same and as in example '6524:5412' if " +
                        "the local port is 6524 and the remote is 5412. The proxy server on the " +
                        "local machine is automatically created.");

        addOptionWithArg("-d", Configuration.JDWP_PORT_PROPERTY_NAME);
        addOptionWithArg("--debug", Configuration.JDWP_PORT_PROPERTY_NAME);
        addHelp(Configuration.JDWP_PORT_PROPERTY_NAME,
                "--debug=5005 or --debug=5005:8000",
                "Start the app with the JDWP debugger on the specified port, and creates a proxy " +
                        "server for it. The port specifying is the same as at '--proxy-port'.");

        addOptionWithArg("-m", Configuration.INSTALL_MODE_PROPERTY_NAME);
        addOptionWithArg("--install-mode", Configuration.INSTALL_MODE_PROPERTY_NAME);
        addHelp(Configuration.INSTALL_MODE_PROPERTY_NAME,
                "-m=runonly",
                "Set the mode the application should start in. Valid modes are: " +
                        Configuration.INSTALL_MODE_RUN_ONLY + ", " +
                        Configuration.INSTALL_MODE_INSTALL + ", " +
                        Configuration.INSTALL_MODE_UPGRADE + ", " +
                        Configuration.INSTALL_MODE_INSTALL_ONLY + ", " +
                        Configuration.INSTALL_MODE_UPGRADE_ONLY + ". Default is " + Configuration.INSTALL_MODE_UPGRADE);
        addOptionWithArg("-nd", Configuration.NATIVE_DEBUG_PORT_PROPERTY_NAME);
        addOptionWithArg("--native-debug", Configuration.NATIVE_DEBUG_PORT_PROPERTY_NAME);
        addHelp(Configuration.NATIVE_DEBUG_PORT_PROPERTY_NAME,
                "-nd=3001",
                "Start the app with debugserver on specified local port for native debug using lldb");

        addOptionWithArg("-o", Configuration.STD_OUT_PROPERTY_NAME);
        addOptionWithArg("--output", Configuration.STD_OUT_PROPERTY_NAME);
        addHelp(Configuration.STD_OUT_PROPERTY_NAME,
                "-o=2541",
                "Set the port for forwarding standard output from the device. If this option is " +
                        "not specified, then the launcher's standard output will be used.");

        addOptionWithArg("-of", Configuration.STD_OUT_FILE_PROPERTY_NAME);
        addOptionWithArg("--output-file", Configuration.STD_OUT_FILE_PROPERTY_NAME);
        addHelp(Configuration.STD_OUT_FILE_PROPERTY_NAME,
                "-of=log.txt",
                "Set the file to which standard output and standard error should be written to");
    }
}
