/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.remote;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TermColor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ServerCommandRunner extends AbstractServerTask {

    @NotNull
    private final String name;

    @NotNull
    private final String command;

    @Nullable
    private String output;

    @Nullable
    public String getOutput() {
        return output;
    }

    protected ServerCommandRunner(@NotNull Server server, @NotNull String name, @NotNull String command) {
        super(server);
        this.name = Require.nonNull(name);
        this.command = Require.nonNull(command);
    }

    @Override
    public String getTaskName() {
        return "COMMAND EXECUTION: " + name;
    }

    @Override
    protected void main() throws Exception {
        if (!isQuiet()) {
            outlog.println(TermColor.FG_SET_YELLOW + "Command: " + TermColor.FG_SET_DEFAULT + command);
        }

        final ChannelExec channel;
        try {
            channel = (ChannelExec) server.session.openChannel("exec");
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        channel.setCommand(command);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        channel.setOutputStream(baos, true);
        channel.setErrStream(baos, true);

        try {
            channel.connect();
        } catch (JSchException e) {
            throw new GradleException(e.getMessage(), e);
        }

        while (!channel.isClosed()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new GradleException(e.getMessage(), e);
            }
        }

        output = baos.toString();

        try {
            baos.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }

        channel.disconnect();
        if (channel.getExitStatus() != 0) {
            throw new ServerChannelException("Remote command execution failed", output);
        }
    }
}
