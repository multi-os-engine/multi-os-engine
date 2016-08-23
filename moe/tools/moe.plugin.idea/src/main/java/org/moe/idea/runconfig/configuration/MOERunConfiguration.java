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

package org.moe.idea.runconfig.configuration;

import com.intellij.execution.RunManager;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.moe.common.utils.OsUtils;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.utils.JDOMHelper;
import org.moe.idea.utils.SimCtl;

public class MOERunConfiguration extends MOERunConfigurationBase {
    private String simulatorUdid;
    private boolean runOnSimulator = true;
    private boolean runJUnitTests = false;

    private int testType = MOEJUnitUtil.TEST_ALL_IN_MODULE;
    private String testMethodName = "";
    private String testClassName = "";
    private String testPackageName = "";

    public MOERunConfiguration(final Project project, final ConfigurationFactory factory) {
        super(project, factory);
    }

    public static RunnerAndConfigurationSettings createRunConfiguration(Project project, Module module) throws Exception {
        RunManager runManager = RunManager.getInstance(project);

        RunnerAndConfigurationSettings settings = runManager.createRunConfiguration(module.getName(), MOERunConfigurationType.getInstance().getConfigurationFactories()[0]);

        MOERunConfiguration configuration = (MOERunConfiguration) settings.getConfiguration();

        configuration.moduleName(module.getName());

        if(OsUtils.isMac()) {
            for (SimCtl.Device device : SimCtl.getDevices()) {
                configuration.runOnSimulator(true);
                configuration.simulatorDeviceName(device.udid);
                break;
            }
        }

        return settings;
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new MOERunConfigurationEditor(getProject());
    }

    @Override
    public void readExternal(Element element) throws InvalidDataException {
        super.readExternal(element);

        simulatorUdid = JDOMExternalizerUtil.readField(element, "simulatorUdid");
        runOnSimulator = JDOMHelper.readBoolean(element, "runOnSimulator", true);
        runJUnitTests = JDOMHelper.readBoolean(element, "runJUnitTests", false);
        testType = JDOMHelper.readInteger(element, "testType", MOEJUnitUtil.TEST_ALL_IN_MODULE);
        testMethodName = JDOMExternalizerUtil.readField(element, "testMethodName");
        testClassName = JDOMExternalizerUtil.readField(element, "testClassName");
        testPackageName = JDOMExternalizerUtil.readField(element, "testPackageName");
    }

    @Override
    public void writeExternal(Element element) throws WriteExternalException {
        super.writeExternal(element);

        JDOMExternalizerUtil.writeField(element, "simulatorUdid", simulatorUdid);
        JDOMExternalizerUtil.writeField(element, "runOnSimulator", Boolean.toString(runOnSimulator));
        JDOMExternalizerUtil.writeField(element, "runJUnitTests", Boolean.toString(runJUnitTests));
        JDOMExternalizerUtil.writeField(element, "testType", Integer.toString(testType));
        JDOMExternalizerUtil.writeField(element, "testMethodName", testMethodName);
        JDOMExternalizerUtil.writeField(element, "testClassName", testClassName);
        JDOMExternalizerUtil.writeField(element, "testPackageName", testPackageName);
    }

    public String simulatorUdid() {
        return simulatorUdid;
    }

    public void simulatorUdid(String simulatorUdid) {
        this.simulatorUdid = simulatorUdid;
    }

    public void simulatorDeviceName(String simulatorUdid) {
        this.simulatorUdid = simulatorUdid;
    }

    public boolean runOnSimulator() {
        return runOnSimulator;
    }

    public boolean runJUnitTests() {
        return runJUnitTests;
    }

    public void runJUnitTests(boolean runJUnitTests) {
        this.runJUnitTests = runJUnitTests;
    }

    public int getTestType() {
        return testType;
    }

    public void setTestType(int t) {
        this.testType = t;
    }

    public String getTestMethodName() {
        return testMethodName;
    }

    public void setTestMethodName(String methodName) {
        this.testMethodName = methodName;
    }

    public String getTestClassName() {
        return testClassName;
    }

    public void setTestClassName(String className) {
        this.testClassName = className;
    }

    public String getTestPackageName() {
        return testPackageName;
    }

    public void setTestPackageName(String packageName) {
        this.testPackageName = packageName;
    }

    public void runOnSimulator(boolean runOnSimulator) {
        if (runOnSimulator) {
            architecture = "i386";
        }
        else {
            architecture = "armv7,arm64";
        }

        this.runOnSimulator = runOnSimulator;
    }
    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {
        super.checkConfiguration();
        Module moduls[] = getModules();
        if (moduls.length > 0) {
            MOEJUnitUtil.checkConfiguration(moduls[0], testType, testPackageName, testClassName);
        }
    }

    public String[] getTestArgs() {
        if (runJUnitTests) {
            return MOEJUnitUtil.getTestArgs(module, testType, testPackageName, testClassName);
        }
        return null;
    }

    public String getActionType() {
        return actionType;
    }

}
