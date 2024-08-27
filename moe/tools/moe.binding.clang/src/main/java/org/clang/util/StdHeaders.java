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

package org.clang.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StdHeaders {

    private static String PATH;

    private StdHeaders() {
    }

    public static synchronized String getPath() {
        if (PATH != null) {
            return PATH;
        }

        File tmp;
        try {
            tmp = File.createTempFile("NatJGen", "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tmp.delete();
        tmp.mkdir();
        PATH = tmp.getAbsolutePath();

        for (String s : getHeaderList()) {
            copyStdHeader(s);
        }

        return PATH;
    }

    private static List<String> getHeaderList() {
        try (InputStream stream = StdHeaders.class.getResourceAsStream("std_headers.txt")) {
            if (stream == null) {
                throw new IOException("std_headers.txt not found");
            }

            ArrayList<String> result = new ArrayList<>();

            BufferedReader r = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line = r.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    result.add(line);
                }
            }

            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyStdHeader(String resourceName) {
        try {
            copyResource(resourceName, new File(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyResource(String resourceName, File target) throws IOException {
        InputStream stream = StdHeaders.class.getResourceAsStream(resourceName);
        if (stream == null) {
            throw new IOException("Resource " + resourceName + " not found");
        }
        try {
            File targetFile = new File(target, resourceName);
            if (!targetFile.getParentFile().exists()) {
                targetFile.getParentFile().mkdirs();
            }
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(targetFile);
                byte buffer[] = new byte[8192];
                int read;
                while ((read = stream.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
