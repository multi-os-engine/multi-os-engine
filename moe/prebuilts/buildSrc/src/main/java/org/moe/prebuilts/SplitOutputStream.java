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

package org.moe.prebuilts;

import java.io.IOException;
import java.io.OutputStream;

class SplitOutputStream extends OutputStream {
    private final OutputStream primary;
    private final OutputStream secondary;

    SplitOutputStream(OutputStream primary, OutputStream secondary) {
        if (primary == null) throw new NullPointerException();
        if (secondary == null) throw new NullPointerException();
        this.primary = primary;
        this.secondary = secondary;
    }

    @Override
    public void write(int d) throws IOException {
        primary.write(d);
        secondary.write(d);
    }

    @Override
    public void write(byte[] d) throws IOException {
        primary.write(d);
        secondary.write(d);
    }

    @Override
    public void write(byte[] d, int off, int len) throws IOException {
        primary.write(d, off, len);
        secondary.write(d, off, len);
    }

    @Override
    public void flush() throws IOException {
        primary.flush();
        secondary.flush();
    }

    @Override
    public void close() throws IOException {
        // Do not close primary!
        secondary.close();
    }
}
