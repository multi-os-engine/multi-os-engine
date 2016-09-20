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

package org.moe.natjgen.cli;

import org.moe.natjgen.cli.executor.IExecutor;
import org.moe.natjgen.cli.manager.ExecutorManager;
import org.moe.natjgen.cli.utils.params.OptionsHandler;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;

public class Main {

	public static final String WRAP_NATJ_GEN = "wrapnatjgen";

	public static void main(String[] argc) {
		if (System.getenv("MOE_HOME") == null) {
			System.err.println("MOE_HOME env var is not set");
			System.exit(1);
		}
		try {
			System.out.println("wrapnatjgen running...");

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
}
