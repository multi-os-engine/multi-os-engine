package org.moe.gradle.utils;

import org.moe.gradle.anns.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JUnitTestCollectorWriter extends OutputStream {
    private final JUnitTestCollector testCollector;

    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    public JUnitTestCollectorWriter(@NotNull JUnitTestCollector testCollector) {
        this.testCollector = testCollector;
    }

    @Override
    public synchronized void write(int b) throws IOException {
        if (b == '\n') {
            testCollector.appendLine(buffer.toString());
            buffer.reset();
        } else {
            buffer.write(b);
        }
    }

    @Override
    public synchronized void write(byte[] b, int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length) || (len < 0) ||
                ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }

        int start = 0;
        for (int i = start; i < len; ++i) {
            final byte d = b[off + i];
            if (d == '\n') {
                buffer.write(b, off + start, i - start);
                testCollector.appendLine(buffer.toString());
                buffer.reset();
                start = i + 1;
            }
        }
        buffer.write(b, off + start, len - start);
    }

    @Override
    public synchronized void close() throws IOException {
        if (buffer.size() > 0) {
            testCollector.appendLine(buffer.toString());
            buffer.reset();
            buffer.close();
        }
        super.close();
    }
}
