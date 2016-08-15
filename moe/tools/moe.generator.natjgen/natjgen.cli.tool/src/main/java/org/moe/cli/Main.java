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

package org.moe.cli;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.moe.cli.executor.IExecutor;
import org.moe.cli.manager.ExecutorManager;
import org.moe.cli.utils.params.OptionsHandler;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	public static final String WRAP_NATJ_GEN = "wrapnatjgen";
	private static final String LOG4J_FILENAME = "/log4j.properties";

	public static void main(String[] argc) {
		if (System.getenv("MOE_HOME") == null) {
			System.err.println("MOE_HOME env var is not set");
			System.exit(1);
		}
		try {
			System.out.println("wrapnatjgen running...");
			configureLogger();

			DefaultParser parser = new DefaultParser();
			CommandLine cmd = parser.parse(OptionsHandler.getAvalibleOptions(), argc);

			IExecutor executor = ExecutorManager.getExecutorByParams(cmd);

			if (executor != null) {
				executor.execute();
			}

			System.exit(0);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private static void configureLogger() {
		// configure logger
		File file = new File("configuration", LOG4J_FILENAME);
		if (file.exists()) {
			PropertyConfigurator.configure(file.getAbsolutePath());
		} else {
			// configure from default: local resources
			try {
				Properties props = new Properties();
				props.load(Main.class.getResourceAsStream(LOG4J_FILENAME));
				PropertyConfigurator.configure(props);
				return;
			} catch (IOException e) {
			}
		}
	}
}
