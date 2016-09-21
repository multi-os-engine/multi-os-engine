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

package org.moe.natjgen.util;

import java.io.File;
import java.io.IOException;

public class Path {

    private final File f;

    public Path(File file) {
        if (file == null) {
            throw new NullPointerException();
        }
        File f;
        try {
            f = file.getCanonicalFile();
        } catch (IOException e) {
            f = file.getAbsoluteFile();
        }
        this.f = f;
    }

    public Path(String... elems) {
        if (elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            f = new File(".");
            return;
        }
        File f = new File(elems[0]);
        for (int i = 1; i < elems.length; ++i) {
            f = new File(f, elems[i]);
        }
        try {
            f = f.getCanonicalFile();
        } catch (IOException e) {
            f = f.getAbsoluteFile();
        }
        this.f = f;
    }

    public Path(Path root, String... elems) {
        if (root == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            f = root.f;
            return;
        }
        File f = root.f;
        for (int i = 0; i < elems.length; ++i) {
            f = new File(f, elems[i]);
        }
        try {
            f = f.getCanonicalFile();
        } catch (IOException e) {
            f = f.getAbsoluteFile();
        }
        this.f = f;
    }

    @Override
    public String toString() {
        try {
            return f.getCanonicalPath();
        } catch (Exception ex) {
            return f.getAbsolutePath();
        }
    }

    public static String canonicalize(String path) {
        return new Path(path).toString();
    }

    public static String compose(String... elems) {
        if (elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return new Path().toString();
        }
        File f = new File(elems[0]);
        for (int i = 1; i < elems.length; ++i) {
            f = new File(f, elems[i]);
        }
        return new Path(f).toString();
    }

    public boolean exists() {
        return f.exists();
    }

    public String getName() {
        return f.getName();
    }

    public Path getParentFile() {
        return new Path(f.getParentFile());
    }

    public boolean isFile() {
        return f.isFile();
    }

    public boolean isDirectory() {
        return f.isDirectory();
    }

    public File[] listFiles() {
        return f.listFiles();
    }

}
