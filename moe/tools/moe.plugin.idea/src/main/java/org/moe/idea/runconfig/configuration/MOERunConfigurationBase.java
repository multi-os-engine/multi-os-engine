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

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.RunConfigurationWithSuppressedDefaultRunAction;
import com.intellij.ide.passwordSafe.PasswordSafe;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.common.PasswordEntry;
import org.moe.common.constants.ProductType;
import org.moe.common.utils.OsUtils;
import org.moe.idea.runconfig.MOERunProfileState;
import org.moe.idea.utils.Configuration;
import org.moe.idea.utils.JDOMHelper;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;

public abstract class MOERunConfigurationBase extends LocatableConfigurationBase
        implements RunConfigurationWithSuppressedDefaultDebugAction,
        RunConfigurationWithSuppressedDefaultRunAction,
        RunProfileWithCompileBeforeLaunchOption {

    private static final Logger LOG = LoggerFactory.getLogger(MOERunConfigurationBase.class);

    public static final String DEFAULT_CONFIGURATION = "Debug";
    protected static PasswordSafe safeStorage = PasswordSafe.getInstance();
    protected String architecture;
    protected String configuration;
    protected String deviceUdid;
    protected boolean debug;
    protected int debugPort = 8000;
    protected int debugRemotePort = 8000;
    protected ProductType productType;
    private String moduleName;
    private String modulePath;
    protected Module module;
    public String actionType;
    protected boolean remoteBuildEnabled = false;
    protected String remoteHost;
    protected int remotePort;
    protected String remoteUser;
    protected String remoteKnownhosts;
    protected String remoteIdentity;
    protected String remoteKeychainPass;
    protected String remoteKeychainName;
    protected int remoteKeychainLocktimeout;
    protected String remoteGradleRepositories;

    public MOERunConfigurationBase(final Project project, final ConfigurationFactory factory) {
        super(project, factory, "");

        configuration = Configuration.DEBUG_NAME;
        productType = ProductType.app;
    }

    public ProductType productType() {
        return productType;
    }

    public void productType(ProductType productType) {
        this.productType = productType;
    }

    public Module module() {
        return module;
    }

    public String moduleName() {
        return moduleName;
    }

    public void moduleName(String moduleName) {
        if ((moduleName != null) && !moduleName.isEmpty()) {
            module = ModuleUtils.findModuleByName(getProject(), moduleName);
            if (module != null) {
                modulePath = ModuleUtils.getModulePath(module);
            }
        }

        this.moduleName = moduleName;
    }

    public String modulePath() {
        if ((modulePath == null) || modulePath.isEmpty()) {
            if ((module == null) && (moduleName != null) && !moduleName.isEmpty()) {
                module = ModuleUtils.findModuleByName(getProject(), moduleName);
            }
            if (module != null) {
                modulePath = ModuleUtils.getModulePath(module);
            }
        }
        return modulePath;
    }

    public void deviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }

    public String deviceUdid() {
        return this.deviceUdid;
    }

    public void debug(boolean debug) {
        this.debug = debug;
    }

    public boolean debug() {
        return debug;
    }

    public int debugPort() {
        return debugPort;
    }

    public void debugPort(int debugPort) {
        this.debugPort = debugPort;
    }

    public int debugRemotePort() {
        return debugRemotePort;
    }

    public void debugRemotePort(int debugRemotePort) {
        this.debugRemotePort = debugRemotePort;
    }

    public String architecture() {
        return architecture;
    }

    protected void architecture(String architecture) {
        this.architecture = architecture;
    }

    public String configuration() {
        return configuration;
    }

    public void configuration(String configuration) {
        this.configuration = configuration;
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public int getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(int remotePort) {
        this.remotePort = remotePort;
    }

    public String getRemoteUser() {
        return remoteUser;
    }

    public void setRemoteUser(String remotePUser) {
        this.remoteUser = remotePUser;
    }

    public String getRemoteKnownhosts() {
        return remoteKnownhosts;
    }

    public void setRemoteKnownhosts(String remoteKnownhosts) {
        this.remoteKnownhosts = remoteKnownhosts;
    }

    public String getRemoteIdentity() {
        return remoteIdentity;
    }

    public void setRemoteIdentity(String remoteIdentity) {
        this.remoteIdentity = remoteIdentity;
    }

    public String getRemoteKeychainPass() {
        return remoteKeychainPass;
    }

    public boolean isRemoteBuildEnabled() {
        return remoteBuildEnabled;
    }

    public void setRemoteBuildEnabled(boolean remoteBuildEnabled) {
        this.remoteBuildEnabled = remoteBuildEnabled;
    }

    public void setRemoteKeychainPass(String remoteKeychainPass) {
        this.remoteKeychainPass = remoteKeychainPass;
    }

    public int getRemoteKeychainLocktimeout() {
        return remoteKeychainLocktimeout;
    }

    public void setRemoteKeychainLocktimeout(int remoteKeychainLocktimeout) {
        this.remoteKeychainLocktimeout = remoteKeychainLocktimeout;
    }

    public String getRemoteGradleRepositories() {
        return remoteGradleRepositories;
    }

    public void setRemoteGradleRepositories(String remoteGradleRepositories) {
        this.remoteGradleRepositories = remoteGradleRepositories;
    }

    public String getRemoteKeychainName() {
        return remoteKeychainName;
    }

    public void setRemoteKeychainName(String remoteKeychainName) {
        this.remoteKeychainName = remoteKeychainName;
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) throws ExecutionException {
        this.actionType = executor.getActionName();
        try {
            moduleName(moduleName);
        } catch (Exception e) {
            throw new ExecutionException(e.getMessage());
        }

        return new MOERunProfileState(getProject(), executionEnvironment);
    }

    @Override
    public void readExternal(Element element) throws InvalidDataException {
        super.readExternal(element);

        try {
            moduleName(JDOMExternalizerUtil.readField(element, "moduleName"));
        }
        catch (Exception e) {
            return;
        }

        architecture(JDOMExternalizerUtil.readField(element, "architecture"));
        configuration(JDOMHelper.readString(element, "configuration", "Debug"));
        deviceUdid(JDOMExternalizerUtil.readField(element, "deviceUdid"));
        debugPort(JDOMHelper.readInteger(element, "debugPort", 8000));
        debugRemotePort(JDOMHelper.readInteger(element, "debugRemotePort", 8000));
        productType(ProductType.valueOf(JDOMHelper.readString(element, "productType", ProductType.app.name())));
        setRemoteBuildEnabled(JDOMHelper.readBoolean(element, "remoteBuildEnabled", false));
        setRemoteHost(JDOMExternalizerUtil.readField(element, "remoteHost"));
        setRemotePort(JDOMHelper.readInteger(element, "remotePort", 0));
        setRemoteUser(JDOMExternalizerUtil.readField(element, "remoteUser"));
        setRemoteKnownhosts(JDOMExternalizerUtil.readField(element, "remoteKnownhosts"));
        setRemoteIdentity(JDOMExternalizerUtil.readField(element, "remoteIdentity"));
        setRemoteKeychainPass(JDOMExternalizerUtil.readField(element, "remoteKeychainPass"));
        setRemoteKeychainName(JDOMExternalizerUtil.readField(element, "remoteKeychainName"));
        setRemoteKeychainLocktimeout(JDOMHelper.readInteger(element, "remoteKeychainLocktimeout", 0));
        setRemoteGradleRepositories(JDOMExternalizerUtil.readField(element, "remoteGradleRepositories"));

    }

    @Override
    public void writeExternal(Element element) throws WriteExternalException {
        super.writeExternal(element);

        JDOMExternalizerUtil.writeField(element, "moduleName", moduleName());
        JDOMExternalizerUtil.writeField(element, "architecture", architecture());
        JDOMExternalizerUtil.writeField(element, "configuration", configuration());
        JDOMExternalizerUtil.writeField(element, "deviceUdid", deviceUdid());
        JDOMExternalizerUtil.writeField(element, "debugPort", Integer.toString(debugPort()));
        JDOMExternalizerUtil.writeField(element, "debugRemotePort", Integer.toString(debugRemotePort()));
        JDOMExternalizerUtil.writeField(element, "productType", productType.name());
        JDOMExternalizerUtil.writeField(element, "remoteBuildEnabled", Boolean.toString(isRemoteBuildEnabled()));
        JDOMExternalizerUtil.writeField(element, "remotePort", Integer.toString(getRemotePort()));
        JDOMExternalizerUtil.writeField(element, "remoteKeychainLocktimeout", Integer.toString(getRemoteKeychainLocktimeout()));
        JDOMExternalizerUtil.writeField(element, "remoteHost", getRemoteHost());
        JDOMExternalizerUtil.writeField(element, "remoteUser", getRemoteUser());
        JDOMExternalizerUtil.writeField(element, "remoteKnownhosts", getRemoteKnownhosts());
        JDOMExternalizerUtil.writeField(element, "remoteIdentity", getRemoteIdentity());
        JDOMExternalizerUtil.writeField(element, "remoteKeychainPass", getRemoteKeychainPass());
        JDOMExternalizerUtil.writeField(element, "remoteKeychainName", getRemoteKeychainName());
        JDOMExternalizerUtil.writeField(element, "remoteGradleRepositories", getRemoteGradleRepositories());
    }

    @NotNull
    @Override
    public Module[] getModules() {
        final String moduleName = moduleName();
        if (moduleName == null || moduleName.isEmpty()) {
            return new Module[0];
        } else {
            final Module moduleByName = ModuleManager.getInstance(getProject()).findModuleByName(moduleName);
            if (moduleByName == null) {
                LOG.error("Failed to find module by name '" + moduleName + "'");
                return new Module[0];
            }
            return new Module[]{ moduleByName };
        }
    }

    public String secureValue(String key) throws PasswordSafeException {
        String result = null;
        try {
            // If we are asking password first time here, User will see standard IntelliJ master password dialog.
            result = safeStorage.getPassword(getProject(), this.getClass(), key);
        } catch (PasswordSafeException pse) {
            throw pse;
        } catch (Exception e) {
            throw new PasswordSafeException(e.getMessage());
        }

        return result;
    }

    public void secureValue(String key, String value, boolean cleanValue) throws PasswordSafeException {
        try {
            safeStorage.storePassword(getProject(), this.getClass(), key, value);
        } catch (PasswordSafeException pse) {
            throw pse;
        } catch (Exception e) {
            throw new PasswordSafeException(e.getMessage());
        } finally {
            if (cleanValue) {
                try {
                    PasswordEntry.clean(value);
                } catch (Exception e) {
                    throw new PasswordSafeException(e.getMessage());
                }
            }
        }
    }

    public void secureValue(String key, char[] value, boolean cleanValue) throws PasswordSafeException {
        String sValue = new String(value);
        if (cleanValue) {
            PasswordEntry.clean(value);
        }
        try {
            safeStorage.storePassword(getProject(), this.getClass(), key, sValue);
        } catch (PasswordSafeException pse) {
            throw pse;
        } catch (Exception e) {
            throw new PasswordSafeException(e.getMessage());
        } finally {
            try {
                PasswordEntry.clean(sValue);
            } catch (Exception e) {
                throw new PasswordSafeException(e.getMessage());
            }
        }
    }

    // This function is needed for console execution to avoid issues with special symbols.
    // In particular is used with gradle tasks.
    public String getQuotedPassKey(String key) throws PasswordSafeException {
        String valueTmp = secureValue(key);
        String value = null;
        if (valueTmp != null) {
            value = String.format("\"%s\"", valueTmp);
            try {
                PasswordEntry.clean(valueTmp);
            } catch (Exception e) {
                throw new PasswordSafeException(e.getMessage());
            }
        }

        return value;
    }

    public boolean runJUnitTests() {
        return false;
    }
}
