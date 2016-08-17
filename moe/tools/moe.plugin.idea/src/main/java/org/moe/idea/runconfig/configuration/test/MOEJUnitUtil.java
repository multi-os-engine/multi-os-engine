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

package org.moe.idea.runconfig.configuration.test;

import com.intellij.execution.ExecutionBundle;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.JavaRunConfigurationModule;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.execution.configurations.RuntimeConfigurationWarning;
import com.intellij.execution.junit.JUnitUtil;
import com.intellij.execution.testframework.sm.SMTestRunnerConnectionUtil;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentIterator;
import com.intellij.openapi.roots.FileIndex;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.java.JavaModuleSourceRootTypes;
import org.moe.idea.runconfig.MOERunProfileState;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class MOEJUnitUtil {

    public static final int TEST_ALL_IN_MODULE = 0;
    public static final int TEST_ALL_IN_PACKAGE = 1;
    public static final int TEST_CLASS = 2;
    public static final int TEST_METHOD = 3;

    public static Vector<PsiPackage> getModelPackagesWithName(Module myModule, final String packageRootName) {

        final Vector<PsiPackage> packages = new Vector<PsiPackage>();

        final PsiManager psiManager = PsiManager.getInstance(myModule.getProject());
        final FileIndex fileIndex = ModuleRootManager.getInstance(myModule).getFileIndex();
        fileIndex.iterateContent(
                new ContentIterator() {
                    public boolean processFile(VirtualFile fileOrDir) {
                        if (fileOrDir.isDirectory() && fileIndex.isUnderSourceRootOfType(fileOrDir, JavaModuleSourceRootTypes.SOURCES)) {
                            final PsiDirectory psiDirectory = psiManager.findDirectory(fileOrDir);
                            if (psiDirectory != null) {
                                PsiPackage aPackage = JavaDirectoryService.getInstance().getPackage(psiDirectory);
                                if (aPackage != null) {
                                    String actName = aPackage.getQualifiedName();
                                    if (actName.equals(packageRootName) || actName.startsWith(packageRootName)) {
                                        packages.add(aPackage);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
        );

        return packages;
    }

    public static Vector<PsiClass> getTestClasses(Module myModule, final String packageRootName) {
        Vector<PsiPackage> packages = getModelPackagesWithName(myModule, packageRootName);

        Vector<PsiClass> testClasses = new Vector<PsiClass>();

        Iterator<PsiPackage> it = packages.iterator();

        while (it.hasNext()) {
            PsiPackage p = it.next();
            PsiClass[] packageClasses = p.getClasses();

            if (packageClasses != null && packageClasses.length > 0) {
                for (PsiClass c : packageClasses) {
                    if (JUnitUtil.isTestClass(c)) {
                        testClasses.add(c);
                    }
                }
            }
        }

        return testClasses;
    }

    public static void checkConfiguration(Module module, int TESTING_TYPE, String PACKAGE_NAME, String CLASS_NAME) throws RuntimeConfigurationException {
        JavaPsiFacade facade = JavaPsiFacade.getInstance(module.getProject());
        switch (TESTING_TYPE) {
            case TEST_ALL_IN_PACKAGE:
                if (PACKAGE_NAME == null || PACKAGE_NAME.isEmpty()) {
                    throw new RuntimeConfigurationWarning("No test package specified");
                }
                final PsiPackage testPackage = facade.findPackage(PACKAGE_NAME);
                if (testPackage == null) {
                    throw new RuntimeConfigurationWarning(ExecutionBundle.message("package.does.not.exist.error.message", PACKAGE_NAME));
                }

                Vector<PsiClass> packageTestClasses = MOEJUnitUtil.getTestClasses(module, PACKAGE_NAME);
                if (packageTestClasses == null || packageTestClasses.size() == 0) {
                    throw new RuntimeConfigurationWarning("Not found test class in package: " + PACKAGE_NAME);
                }
                break;
            case TEST_CLASS:
                JavaRunConfigurationModule configurationModule = new JavaRunConfigurationModule(module.getProject(), false);
                configurationModule.setModule(module);
                final PsiClass testClass =
                        configurationModule.checkModuleAndClassName(CLASS_NAME, ExecutionBundle.message("no.test.class.specified.error.text"));
                if (!JUnitUtil.isTestClass(testClass)) {
                    throw new RuntimeConfigurationWarning(ExecutionBundle.message("class.isnt.test.class.error.message", CLASS_NAME));
                }
                break;
            case TEST_METHOD:
                //Already not used
                break;
        }
    }

    public static String[] getTestArgs(Module module, int TESTING_TYPE, String PACKAGE_NAME, String CLASS_NAME) {
        switch (TESTING_TYPE) {
            case TEST_ALL_IN_PACKAGE:

                List<String> testClasses = new ArrayList<String>();
                Vector<PsiClass> packageTestClasses = MOEJUnitUtil.getTestClasses(module, PACKAGE_NAME);
                if (packageTestClasses != null || packageTestClasses.size() > 0) {
                    for (PsiClass c : packageTestClasses) {
                        if (JUnitUtil.isTestClass(c)) {
                            testClasses.add(c.getQualifiedName());
                        }
                    }

                    if (testClasses.size() > 0) {
                        String[] res = new String[testClasses.size()];

                        return testClasses.toArray(res);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }

            case TEST_CLASS: {
                return new String[] {CLASS_NAME};
            }
        }
        return null;
    }

    @NotNull
    public static ConsoleView getTestConsole(MOERunProfileState state, Executor executor, MOERunConfigurationBase conf, Project project) throws ExecutionException {
        MOETestConsoleProperties properties = new MOETestConsoleProperties(conf, executor);
        ConsoleView consoleView = SMTestRunnerConnectionUtil.createConsole("Multi-OS Engine Test", properties);
        Disposer.register(project, consoleView);
        return consoleView;
    }

}
