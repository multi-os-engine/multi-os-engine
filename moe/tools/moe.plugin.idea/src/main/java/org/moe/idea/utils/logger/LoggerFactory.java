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


package org.moe.idea.utils.logger;

import com.intellij.openapi.diagnostic.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class LoggerFactory {

    /**
     * Configured flag.
     */
    private static boolean isConfigured;

    /**
     * Log4j filename.
     */
    private static final String LOG4J_FILENAME = "log4j.properties";

    public static Logger getLogger(Class classname) {
        configure();
        return Logger.getInstance(classname);
    }

    private synchronized static void configure() {
        if (isConfigured) {
            return;
        }

        Properties p = new Properties();
        p.setProperty("log4j.rootLogger", "ERROR, stdout");
        p.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
        p.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
        p.setProperty("log4j.logger.#org.moe.mdt", "DEBUG");
        p.setProperty("log4j.logger.org.moe.mdt", "DEBUG");
        PropertyConfigurator.configure(p);

        isConfigured = true;
    }
}
