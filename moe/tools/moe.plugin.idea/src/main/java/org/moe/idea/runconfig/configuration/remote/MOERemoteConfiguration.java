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

package org.moe.idea.runconfig.configuration.remote;

import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jdom.Element;
import org.jetbrains.annotations.Nullable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@State(
        name = "MOERemoteBuildServerConfiguration",
        storages = {
                @Storage(file = StoragePathMacros.WORKSPACE_FILE)
        }
)

public class MOERemoteConfiguration implements PersistentStateComponent<MOERemoteConfiguration> {

    public static final String m_sServerAddressHint = "IPv4 address";
    // SSH port must be privileged for secure purposes.
    public static final int OSX_MAX_PRIVILEGED_PORT = 1024;

    private String address;
    private String login;

    private int port;

    private String path;

    protected String passKey;

    public MOERemoteConfiguration() {

    }

    public static MOERemoteConfiguration parse(String server) throws IllegalStateException {

        Pattern IPv4pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

        Matcher matcher = IPv4pattern.matcher(server);

        if (!matcher.matches()) {
            throw new IllegalStateException("Wrong server address format. Should be: " + m_sServerAddressHint);
        }

        MOERemoteConfiguration configuration = new MOERemoteConfiguration();

        configuration.address = server;

        return configuration;
    }

    @Nullable
    @Override
    public MOERemoteConfiguration getState() {
        return this;
    }

    @Override
    public void loadState(MOERemoteConfiguration configuration) {
        XmlSerializerUtil.copyBean(configuration, this);
    }

    public void readExternal(Element element) throws InvalidDataException {
        address(JDOMExternalizerUtil.readField(element, "address"));
        login(JDOMExternalizerUtil.readField(element, "login"));

        String serverPort = JDOMExternalizerUtil.readField(element, "port");

        if (serverPort == null || serverPort.length() == 0) {
            port = 22;
        }
        else {
            port = Integer.parseInt(serverPort);
        }
    }

    public void writeExternal(Element element) throws WriteExternalException {
        JDOMExternalizerUtil.writeField(element, "address", address());
        JDOMExternalizerUtil.writeField(element, "login", login());
        JDOMExternalizerUtil.writeField(element, "port", Integer.toString(port()));
    }

    public static MOERemoteConfiguration getInstance(final Project project) {
        return ServiceManager.getService(project, MOERemoteConfiguration.class);
    }

    public String address() {
        return address;
    }

    public void address(String address) {
        this.address = address;

        if ((this.address != null) && (login != null)) {
            passKey = this.address + login;
        } else {
            passKey = null;
        }
    }

    public int port() {
        return port;
    }

    public void port(int port) {
        this.port = port;
    }

    public String login() {
        return login;
    }

    public void login(String login) {
        this.login = login;

        if ((address != null) && (this.login != null)) {
            passKey = this.address + login;
        } else {
            passKey = null;
        }
    }

    public String passKey() {
        return passKey;
    }
}
