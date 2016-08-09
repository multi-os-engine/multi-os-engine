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

package org.clang.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Util {

	public static String getPathForTempResource(String file) {
		File temp = null;
		try {
			ClassLoader classLoader = Util.class.getClassLoader();

			InputStream is = classLoader.getResourceAsStream(file);
            if (is == null) {
                throw new IOException();
            }
            try {
                byte buffer[] = new byte[2048];
                int read;
                
                temp = File.createTempFile("tempfile", ".m");
                temp.deleteOnExit();
                FileOutputStream os = new FileOutputStream(temp);
                try {
                    while (is.available() > 0) {
                        read = is.read(buffer);
                        os.write(buffer, 0, read);
                    }
                } finally {
                    os.close();
                }
            } finally {
                is.close();
			}
		} catch (IOException e) {
			System.err.println("An error occured during printing the file.");
		}

		if (temp == null) return null;
		return temp.getAbsolutePath();
	}

}
