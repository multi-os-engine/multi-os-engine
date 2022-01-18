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

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.intellij.execution.RunManager;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.moe.common.utils.SimCtl.Device;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.utils.JDOMHelper;
import org.moe.idea.utils.RunTargetUtil;
import org.moe.idea.utils.logger.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MOERunConfiguration extends MOERunConfigurationBase {

    private static final Logger LOG = LoggerFactory.getLogger(MOERunConfiguration.class);

    private String simulatorUdid;
    private boolean runOnSimulator = true;
    private boolean runJUnitTests = false;

    private int testType = MOEJUnitUtil.TEST_ALL_IN_MODULE;
    private String testMethodName = "";
    private String testClassName = "";
    private String testPackageName = "";
    private String vmArgs = "";
    private String environmentVariables = "";
    private String programArgs = "";
    private boolean openDeploymentTargetDialog;
    private boolean canceled;

    public MOERunConfiguration(final Project project, final ConfigurationFactory factory) {
        super(project, factory);
    }

    public static RunnerAndConfigurationSettings createRunConfiguration(Project project, Module module)
            throws Exception {
        RunManager runManager = RunManager.getInstance(project);

        RunnerAndConfigurationSettings settings = runManager.createConfiguration(module.getName(),
                MOERunConfigurationType.getInstance().getConfigurationFactories()[0]);

        MOERunConfiguration configuration = (MOERunConfiguration)settings.getConfiguration();

        configuration.moduleName(module.getName());

        final Device defaultSimulator = RunTargetUtil.getDefaultSimulatorQuiet();
        if (defaultSimulator != null) {
            configuration.runOnSimulator(true);
            configuration.simulatorDeviceName(defaultSimulator.udid);
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
        testMethodName = JDOMExternalizerUtil.readField(element, "testMethodName", "");
        testClassName = JDOMExternalizerUtil.readField(element, "testClassName", "");
        testPackageName = JDOMExternalizerUtil.readField(element, "testPackageName", "");
        vmArgs = JDOMExternalizerUtil.readField(element, "vmArguments", "");
        environmentVariables = JDOMExternalizerUtil.readField(element, "environmentVariables", "");
        programArgs = JDOMExternalizerUtil.readField(element, "programArguments", "");
        openDeploymentTargetDialog = JDOMHelper.readBoolean(element, "openDeploymentTargetDialog", false);
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
        JDOMExternalizerUtil.writeField(element, "vmArguments", vmArgs);
        JDOMExternalizerUtil.writeField(element, "environmentVariables", environmentVariables);
        JDOMExternalizerUtil.writeField(element, "programArguments", programArgs);
        JDOMExternalizerUtil
                .writeField(element, "openDeploymentTargetDialog", Boolean.toString(openDeploymentTargetDialog));
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

    @SuppressWarnings("unchecked")
    public List<String> getVMArguments() {
        try {
            final List list = new Gson().fromJson(getVMArgumentsJSONString(), List.class);
            if (list != null) {
                return list;
            }
            return new ArrayList<String>();
        } catch (JsonSyntaxException ex) {
            LOG.warn("Failed to read getVMArgumentsJSONString(), resetting", ex);
            setVMArgumentsJSONString("[]");
            return new ArrayList<String>();
        }
    }

    @SuppressWarnings("unchecked")
    public Map<String, String> getEnvironmentVariables() {
        try {
            final Map map = new Gson().fromJson(getEnvironmentVariablesJSONString(), Map.class);
            if (map != null) {
                return map;
            }
            return new HashMap<String, String>();
        } catch (JsonSyntaxException ex) {
            LOG.warn("Failed to read getEnvironmentVariablesJSONString(), resetting", ex);
            setEnvironmentVariablesJSONString("{}");
            return new HashMap<String, String>();
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> getProgramArguments() {
        try {
            final List list = new Gson().fromJson(getProgramArgumentsJSONString(), List.class);
            if (list != null) {
                return list;
            }
            return new ArrayList<String>();
        } catch (JsonSyntaxException ex) {
            LOG.warn("Failed to read getProgramArgumentsJSONString(), resetting", ex);
            setProgramArgumentsJSONString("[]");
            return new ArrayList<String>();
        }
    }

    public void setVMArgumentsJSONString(String vmargs) {
        this.vmArgs = vmargs;
    }

    public void setEnvironmentVariablesJSONString(String environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public void setProgramArgumentsJSONString(String programArgs) {
        this.programArgs = programArgs;
    }

    public String getProgramArgumentsJSONString() {
        if (programArgs == null) {
            programArgs = "[]";
        }
        return programArgs;
    }

    public String getVMArgumentsJSONString() {
        if (vmArgs == null) {
            vmArgs = "[]";
        }
        return vmArgs;
    }

    public String getEnvironmentVariablesJSONString() {
        if (environmentVariables == null) {
            environmentVariables = "{}";
        }
        return environmentVariables;
    }

    public void setOpenDeploymentTargetDialog(boolean openDeploymentTargetDialog) {
        this.openDeploymentTargetDialog = openDeploymentTargetDialog;
    }

    public boolean getOpenDeploymentTargetDialog() {
        return openDeploymentTargetDialog;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
