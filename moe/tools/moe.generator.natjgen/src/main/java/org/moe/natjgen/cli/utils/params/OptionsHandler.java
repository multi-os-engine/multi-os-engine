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

package org.moe.natjgen.cli.utils.params;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import org.moe.natjgen.cli.Main;

/**
 * This class contains all supported command line options as final fields
 * and methods to handle it
 */
public class OptionsHandler {
	
	/**
	 * Symbol separating multiple values for options which allow this
	 */
	public static final char VALUE_SEPARATOR = ':';
	
	/**
	 * Options with multiple argument
	 */
	
	public static final Option FRAMEWORK = Option.builder()
			.argName("paths to frameworks")
			.longOpt("framework")
			.hasArg(true)
			.hasArgs()
			.valueSeparator(VALUE_SEPARATOR)
			.desc("paths to input frameworks") //TODO: add informative description
			.build();
	
	public static final Option HEADERS = Option.builder()
			.argName("paths")
			.longOpt("headers")
			.hasArg(true)
			.hasArgs()
			.valueSeparator(VALUE_SEPARATOR)
			.desc("paths to folder/file with API header files")
			.build();
	
	public static final Option LIBRARY = Option.builder()
			.argName("path to library")
			.longOpt("library")
			.hasArg(true)
			.hasArgs()
			.valueSeparator(VALUE_SEPARATOR)
			.desc("input library/libraries") //TODO: add informative description
			.build();
	
	
	public static final Option BUNDLE = Option.builder()
			.argName("path")
			.longOpt("bundle")
			.hasArg(true)
			.hasArgs()
			.valueSeparator(VALUE_SEPARATOR)
			.desc("paths to resources which will be copied to final application")
			.build();
	
	public static final Option JAVA_SOURCE = Option.builder()
			.argName("path")
			.longOpt("java-source")
			.hasArg(true)
			.hasArgs()
			.valueSeparator(',') //TODO: change external scheme to generalize separator
			.desc("paths to folders with existing bindings")
			.build();
	
	/**
	 * Options with single argument
	 */
	
	public static final Option PATH_TO_PROJECT = Option.builder()
			.argName("path")
			.longOpt("path-to-project")
			.hasArg(true)
			.desc("path to generated files will be constructed as: <path-to-project>/src/main/java/<package-name>")
			.build();
	
	public static final Option PACKAGE_NAME = Option.builder()
			.argName("name of package")
			.longOpt("package-name")
			.hasArg(true)
			.desc("package name for generated files. By default - 'org.moe'")
			.build();
	
	public static final Option FRAMEWORK_SEARCH_PATH = Option.builder()
			.argName("path to framework")
			.longOpt("framework-search-path")
			.hasArg(true)
			.desc("path to framework") //TODO: add informative description
			.build();
	
	public static final Option OUTPUT_FILE_PATH = Option.builder()
			.argName("output file")
			.longOpt("output-file-path")
			.hasArg(true)
			.desc("path to output .jar file with generated bindings & input library")
			.build();
	
	public static final Option LD_FLAGS = Option.builder()
			.argName("path to file with flags")
			.longOpt("ld-flags")
			.hasArg(true)
			.desc("additional flags which will be passed to linker during link step for final application")
			.build();
	
	public static final Option POD = Option.builder()
			.argName("path")
			.longOpt("pod")
			.hasArg(true)
			.desc("path to file with pod name, version and subspec name")
			.build();
	
	public static final Option JPOD_SPEC_REPO = Option.builder()
			.argName("URI")
			.longOpt("jpod-spec-repo")
			.hasArg(true)
			.desc("path to repository with .jpodspec.json files")
			.build();
	
	/**
	 * Options without arguments
	 */
	
	public static final Option ALL_DEPENDENCIES = Option.builder()
			.longOpt("all-dependencies")
			.hasArg(false)
			.desc("I don't know how to use it") //TODO: add informative description
			.build();
	
	public static final Option IS_POD_INSTALLED = Option.builder()
			.longOpt("is-pod-installed")
			.hasArg(false)
			.desc("indicate if pod installed") //TODO: add informative description
			.build();
	
	public static final Option CREATE_FROM_PROTOTYPE = Option.builder()
			.longOpt("create-from-prototype")
			.hasArg(false)
			.desc("indicate what bindings will be generated for native stubs")
			.build();
	
	public static final Option HELP = Option.builder("h")
			.longOpt("help")
			.hasArg(false)
			.desc("print a synopsis of standard options")
			.build();
	
	/**
	 * Returns all registered options.
	 * @return Well prepared {@link Options} object
	 */
	public static Options getAvalibleOptions() {
		Options avalibleOptions = new Options();
		
		Field[] fields = OptionsHandler.class.getDeclaredFields();
		for(Field field : fields) {
			int mod = field.getModifiers();
			if( Modifier.isPublic(mod) && Modifier.isStatic(mod) && Modifier.isFinal(mod) //we check it to eliminate unnecessary field's handling if such exists 
					&& field.getType().equals(Option.class)) {
				Option opt = null;
				try {
					opt = (Option) field.get(null);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				avalibleOptions.addOption(opt);
			}
		}
		
		return avalibleOptions;
	}
	
	/**
	 * Prints help
	 */
	public static void printHelp() {
		 String header = "Produce .jar file with java bindings for specified native library/framework\n\n";
		 String footer = "\n"; //TODO: some useful advice like 'Please report issues at http://some.address/issues' should be here
		 
		 HelpFormatter formatter = new HelpFormatter();
		 formatter.printHelp("java -jar " + Main.WRAP_NATJ_GEN + ".jar", header, getAvalibleOptions(), footer, true);
	}
	
	//TODO: implement method for value's verification
	public static void verifyValues(CommandLine request) {
		
	}
	
}
