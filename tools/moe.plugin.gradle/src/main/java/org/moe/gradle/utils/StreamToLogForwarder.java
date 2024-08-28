/*
Copyright (C) 2017 Migeran

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

package org.moe.gradle.utils;

import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.common.utils.CloseableUtil;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StreamToLogForwarder extends OutputStream {

    private static final Logger LOG = Logging.getLogger(StreamToLogForwarder.class);

    @Nullable private final PipedOutputStream pos;

    @Nullable private final PipedInputStream pis;

    @NotNull private final PrintStream fallback;

    public StreamToLogForwarder(@NotNull Logger target, boolean isError) {
        Require.nonNull(target);

        fallback = isError ? System.err : System.out;

        PipedOutputStream _pos = null;
        PipedInputStream _pis = null;
        try {
            _pos = new PipedOutputStream();
            _pis = new PipedInputStream(_pos);
        } catch (IOException e) {
            LOG.error("Failed to create LogForwarder streams", e);
            CloseableUtil.tryClose(_pos, LOG, "Failed to close PipedOutputStream");
            CloseableUtil.tryClose(_pis, LOG, "Failed to close PipedInputStream");
            _pos = null;
            _pis = null;
        } finally {
            pos = _pos;
            pis = _pis;
        }

        if (pis == null) {
            return;
        }

        Scanner scanner = new Scanner(pis);

        if (isError) {
            new Thread(() -> {
                while (scanner.hasNextLine()) {
                    target.error(scanner.nextLine());
                }
            }).start();
        } else {
            new Thread(() -> {
                while (scanner.hasNextLine()) {
                    target.quiet(scanner.nextLine());
                }
            }).start();
        }
    }

    @Override
    public void write(int b) throws IOException {
        if (pos != null) {
            pos.write(b);
        } else {
            fallback.write(b);
        }
    }

    @Override
    public void write(byte[] b) throws IOException {
        if (pos != null) {
            pos.write(b, 0, b.length);
        } else {
            fallback.write(b);
        }
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        if (pos != null) {
            pos.write(b, off, len);
        } else {
            fallback.write(b, off, len);
        }
    }

    @Override
    public void flush() throws IOException {
        if (pos != null) {
            pos.flush();
        } else {
            fallback.flush();
        }
    }

    @Override
    public void close() throws IOException {
        flush();
        CloseableUtil.tryClose(pos, LOG, "Failed to close PipedOutputStream");
        CloseableUtil.tryClose(pis, LOG, "Failed to close PipedInputStream");
    }
}
