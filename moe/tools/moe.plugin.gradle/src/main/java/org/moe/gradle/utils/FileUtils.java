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

package org.moe.gradle.utils;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

public class FileUtils {
    public static void deleteFileOrFolder(final @NotNull Path path) throws IOException {
        Require.nonNull(path);

        if (!path.toFile().exists()) {
            return;
        }
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs)
                    throws IOException {
                Files.delete(file);
                return CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(final Path dir, final IOException e)
                    throws IOException {
                if (e != null) throw e;
                Files.delete(dir);
                return CONTINUE;
            }
        });
    }

    public static void deleteFileOrFolder(final @NotNull File file) throws IOException {
        Require.nonNull(file);

        deleteFileOrFolder(Paths.get(file.toURI()));
    }

    @NotNull
    public static String read(@NotNull File file) {
        Require.nonNull(file);

        String string;
        try {
            string = new String(Files.readAllBytes(Paths.get(file.toURI())));
        } catch (IOException e) {
            throw new GradleException("Failed to read " + file, e);
        }
        return string;
    }

    public static void write(@NotNull File file, @NotNull String string) {
        Require.nonNull(file);
        Require.nonNull(string);

        try {
            Files.write(Paths.get(file.toURI()), string.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new GradleException("Failed to write " + file, e);
        }
    }

    public static void append(@NotNull File file, @NotNull String string) {
        Require.nonNull(file);
        Require.nonNull(string);

        try {
            Files.write(Paths.get(file.toURI()), string.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new GradleException("Failed to write " + file, e);
        }
    }

    public static boolean prepareDir(@NotNull File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            } else {
                throw new GradleException("Expected directory at path " + file.getAbsolutePath());
            }
        }
        return file.mkdirs();
    }

    @NotNull
    public static File getRelativeTo(@NotNull File base, @NotNull File other) {
        Require.nonNull(base);
        Require.nonNull(other);

        return Paths.get(base.getAbsolutePath()).relativize(Paths.get(other.getAbsolutePath())).toFile();
    }
}
