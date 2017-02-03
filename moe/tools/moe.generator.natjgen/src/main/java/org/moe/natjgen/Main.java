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

package org.moe.natjgen;

import org.eclipse.core.runtime.CoreException;
import org.moe.natjgen.helper.MOEJavaProject;
import org.moe.natjgen.nativelibs.NatJGenNativeLoader;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.ConfigurationBuilder;
import org.moe.tools.natjgen.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Main {

    private static final String NATJ_BINDING_CONFIGURATION_EXTENSION = ".nbc";

    /**
     * Logger for this class
     */
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.exit(main_internal(args));
    }

    public static int main_internal(String[] args) {
        try {
            // Initialize native libraries
            NatJGenNativeLoader.initNatives();

            // Read arguments
            String workspace;
            String projectName;
            File natjgenFile = null;
            File confFile = null;
            try {
                workspace = args[0];
                projectName = args[1];
                String genFileName = args[2];
                if (genFileName.endsWith(NATJ_BINDING_CONFIGURATION_EXTENSION)) {
                    natjgenFile = null;
                    confFile = new File(genFileName);
                } else {
                    natjgenFile = new File(genFileName);
                }
            } catch (Exception e) {
                LOG.error("Usage: java -jar <jar-path> <workspace-path> <project-name> <natjgen-file>");
                return 1;
            }

            MOEJavaProject project = new MOEJavaProject(projectName, workspace);
            if (natjgenFile != null) {
                if (!natjgenFile.isAbsolute()) {
                    File workspaceFile = new File(workspace, projectName);
                    natjgenFile = new File(workspaceFile, natjgenFile.getPath());
                }

                return generate(project, natjgenFile.getAbsolutePath(), confFile) ? 0 : 1;
            } else {
                if (!confFile.isAbsolute()) {
                    File workspaceFile = new File(workspace, projectName);
                    confFile = new File(workspaceFile, confFile.getPath());
                }

                return generate(project, null, confFile) ? 0 : 1;
            }
        } catch (Throwable t) {
            LOG.error("Generation failed", t);
            return 1;
        }
    }

    private static boolean generate(final MOEJavaProject project, final String root, File conf) {

        long start_time = System.nanoTime();
        LOG.debug("NatJGen started");

        Indexer indexer = null;
        try {
            if (root != null) {
                indexer = new Indexer(project, root);
            } else {
                indexer = new Indexer(project, Configuration.createWithContents(generateNatj(conf)));
            }
        } catch (CoreException e) {
            LOG.error("Indexer error occured", e);
            return false;
        } catch (Exception e) {
            LOG.error("Indexer error occured", e);
            return false;
        }
        try {
            indexer.generate(null);
        } catch (IOException e) {
            LOG.error("Failed to generate binding code!", e);
            return false;
        }

        LOG.debug("NatJGen ended in " + ((double)(System.nanoTime() - start_time) / 1000000000.0) + "s");
        return true;
    }

    private static String generateNatj(File conf) throws IOException, ValidationException {
        Bindings bindings = new Bindings();
        bindings.load(conf);
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(bindings);
        return configurationBuilder.build();
    }

}
