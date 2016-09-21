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

package org.moe.natjgen.cli.utils;

import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;

public class ArchiveUtils {

    public static void unzipArchive(ZipFile zipFile, File destination) throws IOException {
        Enumeration<ZipArchiveEntry> e = zipFile.getEntries();
        InputStream is = null;
        FileOutputStream fStream = null;
        try {
            while (e.hasMoreElements()) {
                ZipArchiveEntry entry = e.nextElement();
                if (entry.isDirectory()) {
                    String dest = entry.getName();
                    File destFolder = new File(destination, dest);
                    if (!destFolder.exists()) {
                        destFolder.mkdirs();
                    }
                } else {
                    if (!entry.isUnixSymlink()) {
                        String dest = entry.getName();
                        File destFile = new File(destination, dest);
                        is = zipFile.getInputStream(entry); // get the input stream
                        fStream = new FileOutputStream(destFile);
                        copyFiles(is, fStream);
                    } else {
                        String link = zipFile.getUnixSymlink(entry);

                        String entryName = entry.getName();
                        int parentIdx = entryName.lastIndexOf("/");

                        String newLink = entryName.substring(0, parentIdx) + "/" + link;
                        File destFile = new File(destination, newLink);
                        File linkFile = new File(destination, entryName);

                        Files.createSymbolicLink(Paths.get(linkFile.getPath()), Paths.get(destFile.getPath()));

                    }
                }
            }
        } finally {
            if (is != null) {
                is.close();
            }

            if (fStream != null) {
                fStream.close();
            }
        }
    }

    public static void untarArchive(ArchiveInputStream archStrim, File destination) throws IOException {
        TarArchiveEntry entry;

        while ((entry = (TarArchiveEntry)archStrim.getNextEntry()) != null) {
            if (entry.isDirectory()) {
                String dest = entry.getName();
                File destFolder = new File(destination, dest);
                if (!destFolder.exists()) {
                    destFolder.mkdirs();
                }
            } else {
                int count;
                byte[] data = new byte[2048];
                File d = new File(destination, entry.getName());

                if (!d.getParentFile().exists()) {
                    d.getParentFile().mkdirs();
                }

                if (entry.isSymbolicLink()) {
                    String link = entry.getLinkName();

                    String entryName = entry.getName();
                    int parentIdx = entryName.lastIndexOf("/");

                    String newLink = entryName.substring(0, parentIdx) + "/" + link;
                    File destFile = new File(destination, newLink);
                    File linkFile = new File(destination, entryName);

                    Files.createSymbolicLink(Paths.get(linkFile.getPath()), Paths.get(destFile.getPath()));

                } else {
                    FileOutputStream fos = new FileOutputStream(d);
                    BufferedOutputStream dest = new BufferedOutputStream(fos, 2048);
                    while ((count = archStrim.read(data, 0, 2048)) != -1) {
                        dest.write(data, 0, count);
                    }
                    dest.close();
                }
            }
        }
    }

    private static void copyFiles(InputStream inStream, FileOutputStream outStream) throws IOException {
        byte[] buffer = new byte[1024];

        int length;
        while ((length = inStream.read(buffer)) > 0) {
            outStream.write(buffer, 0, length);
        }
    }

    public static void addFileToJar(File baseDir, File source, JarArchiveOutputStream target) throws IOException {
        BufferedInputStream in = null;
        try {
            String baseName = baseDir.getPath().replace("\\", "/");
            baseName = baseName.endsWith("/") ? baseName : baseName + "/";
            String name = source.getPath().replace("\\", "/").replace(baseName, "");
            if (source.isDirectory()) {

                if (!name.isEmpty()) {
                    if (!name.endsWith("/")) name += "/";
                    JarArchiveEntry entry = new JarArchiveEntry(name);
                    entry.setTime(source.lastModified());
                    target.putArchiveEntry(entry);
                    target.closeArchiveEntry();
                }
                for (File nestedFile : source.listFiles())
                    addFileToJar(baseDir, nestedFile, target);
                return;
            }

            JarArchiveEntry entry = new JarArchiveEntry(name);
            entry.setTime(source.lastModified());
            target.putArchiveEntry(entry);
            in = new BufferedInputStream(new FileInputStream(source));

            byte[] buffer = new byte[1024];
            while (true) {
                int count = in.read(buffer);
                if (count == -1) break;
                target.write(buffer, 0, count);
            }
            target.closeArchiveEntry();
        } finally {
            if (in != null) in.close();
        }
    }

}
