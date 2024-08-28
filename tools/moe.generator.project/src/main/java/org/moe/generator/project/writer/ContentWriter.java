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

package org.moe.generator.project.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ContentWriter over simplifies file handling and writing.
 */
class ContentWriter {

    /**
     * File writer.
     */
    private FileWriter writer;

    /**
     * Creates a new ContentWriter instance.
     *
     * @param file file to write to
     */
    ContentWriter(File file) {
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + file);
            writer = null;
        }
    }

    /**
     * Write content into a file.
     *
     * @param string content
     */
    void w(String string) {
        if (writer != null) {
            try {
                writer.write(string);
            } catch (IOException e) {
                System.err.println("Failed to write to file: " + e.getMessage());
                e.printStackTrace(System.err);
                writer = null;
            }
        }
    }

    /**
     * Write content on a line into the file.
     *
     * @param string content
     */
    void wl(String string) {
        w(string);
        w("\n");
    }

    /**
     * Write a new line.
     */
    void nl() {
        w("\n");
    }

    /**
     * Finish the writing.
     */
    void close() {
        try {
            if (writer == null) {
                return;
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to flush: " + e.getMessage());
            e.printStackTrace(System.err);
            writer = null;
        }
        try {
            if (writer == null) {
                return;
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Failed to close: " + e.getMessage());
            e.printStackTrace(System.err);
            writer = null;
        }
    }
}
