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

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

abstract class AbstractServerSCPTask extends AbstractServerTask {

    protected static final byte RESP_OK = 0;
    protected static final byte RESP_WARNING = 1;
    protected static final byte RESP_FATAL = 2;

    protected AbstractServerSCPTask(@NotNull Server server) {
        super(server);
    }

    protected static void checkAck(@NotNull InputStream in) throws IOException {
        final String error = getError(in);
        if (error != null) {
            throw new GradleException("ERROR: " + error);
        }
    }

    private static String getError(@NotNull InputStream in) throws IOException {
        Require.nonNull(in);

        int ack = in.read();
        return getError(in, ack);
    }

    private static String getError(@NotNull InputStream in, int ack) throws IOException {

        // 0 = OK
        // 1 = WARNING
        // 2 = FATAL
        // Additional: -1 = End of stream from Java

        if (ack == RESP_OK) return null;
        if (ack == -1) {
            throw new GradleException("End of stream");
        }

        if (ack == RESP_WARNING || ack == RESP_FATAL) {
            StringBuilder sb = new StringBuilder();
            int c;
            do {
                c = in.read();
                sb.append((char) c);
            }
            while (c != '\n');
            if (ack == RESP_WARNING) {
                return sb.toString();
            }
            // fatal error
            throw new GradleException("FATAL: " + sb.toString());
        }
        throw new GradleException("FATAL: unknown response from scp (" + ack + ")");
    }

    protected static void writeResponse(OutputStream out, byte code) throws IOException {
        out.write(new byte[]{code}, 0, 1);
        out.flush();
    }

    protected void screwup(@NotNull OutputStream out, @NotNull String why) {
        Require.nonNull(out);
        Require.nonNull(why);

        try {
            out.write(("\001scp: " + why + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace(errlog);
        }
        throw new GradleException("scp: " + why);
    }
}
