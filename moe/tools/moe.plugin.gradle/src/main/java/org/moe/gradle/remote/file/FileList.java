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

package org.moe.gradle.remote.file;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.nio.file.FileVisitResult.*;

public class FileList implements EntryParent {

    @NotNull
    private final Path localRoot;

    @NotNull
    private final URI target;

    @NotNull
    private final List<Entry> entries = new ArrayList<>();

    public FileList(@NotNull File localRoot, @NotNull URI target) {
        this.localRoot = Require.nonNull(localRoot.getAbsoluteFile().toPath());
        this.target = Require.nonNull(target);
    }

    public Path getLocalRoot() {
        return localRoot;
    }

    public URI getTarget() {
        return target;
    }

    public void walk(@NotNull Walker walker) {
        Require.nonNull(walker);

        try {
            for (Entry entry : entries) {
                entry.walk(walker);
            }
        } catch (IOException ex) {
            throw new GradleException(ex.getMessage(), ex);
        }
    }

    @Override
    public boolean isLast(Entry entry) {
        Require.TRUE(entries.contains(entry), "unexpected state");
        Require.sizeGT(entries, 0);
        return entries.indexOf(entry) == entries.size() - 1;
    }

    public String add(@NotNull File file) {
        return add(file, null);
    }

    public String add(@NotNull File file, @Nullable Set<File> excludes) {
        Require.nonNull(file);
        Require.TRUE(file.isAbsolute(), "Internal error: file must be an absolute path");

        final Set<Path> excls;
        if (excludes != null) {
            excls = excludes.stream()
                    .map(x -> x.getAbsoluteFile().toPath())
                    .collect(Collectors.toSet());
        } else {
            excls = Collections.emptySet();
        }

        // We only support files and directories
        if (!file.isFile() && !file.isDirectory()) {
            throw new GradleException("unknown file type " + file.getAbsolutePath());
        }

        final File absoluteFile = file.getAbsoluteFile();
        if (file.isFile()) {
            addFile(absoluteFile);
            return resolveRemotePath(absoluteFile);

        } else if (file.isDirectory()) {
            final Path root = absoluteFile.toPath();
            try {
                Files.walkFileTree(root, new FileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                        if (excls.contains(dir)) {
                            return SKIP_SUBTREE;
                        }

                        final Path relativize = localRoot.relativize(dir);

                        if (relativize.getNameCount() == 1 && relativize.getName(0).toString().length() == 0) {
                            return CONTINUE;
                        }

                        getDirectory(relativize);
                        return CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        if (excls.contains(file)) {
                            return CONTINUE;
                        }
                        addFile(file.toFile());
                        return CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                        return TERMINATE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        return CONTINUE;
                    }
                });
            } catch (IOException e) {
                throw new GradleException(e.getMessage(), e);
            }
            return resolveRemotePath(absoluteFile);

        } else {
            throw new IllegalStateException();
        }
    }

    private String resolveRemotePath(File absoluteFile) {
        final Path relative = localRoot.relativize(absoluteFile.toPath());
        try {
            return Server.getRemotePath(target, relative);
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    private void addFile(@NotNull File absoluteFile) {
        // Get relative path
        final Path relativePath = localRoot.relativize(absoluteFile.toPath());

        Require.GT(relativePath.getNameCount(), 0, "unexpected state - relativePath.namecount <= 0");

        // Get entryParent and entries container
        List<Entry> entries = this.entries;
        EntryParent entryParent = this;
        if (relativePath.getNameCount() > 1) {
            final DirectoryEntry directory = getDirectory(relativePath.getParent());
            assert directory != null;
            entries = directory.entries;
            entryParent = directory;
        }

        // Add the file
        insertFileEntry(relativePath.getFileName().toString(), absoluteFile, entryParent, entries);
    }

    private static void insertFileEntry(@NotNull String name, @NotNull File localFile,
                                        @NotNull EntryParent parent, @NotNull List<Entry> entries) {
        Require.GT(name.length(), 0, "unexpected state - rpath.filename.length <= 0");
        final Entry entry = getEntry(entries, name);
        if (entry != null) {
            Require.TRUE(entry instanceof FileEntry, "unexpected state - entry.class !~ FileEntry");
            Require.TRUE(((FileEntry) entry).getLocalFile().equals(localFile), "unexpected state - entry.localFile != localFile");

        } else {
            entries.add(new FileEntry(name, parent, localFile));
        }
    }

    @Nullable
    private static Entry getEntry(@NotNull List<Entry> entries, @NotNull String name) {
        Require.nonNull(name);
        Require.nonNull(entries);

        return entries.stream().filter(entry -> entry.name.equals(name)).findFirst().orElse(null);
    }

    @Override
    public DirectoryEntry getEntry() {
        throw new IllegalStateException();
    }

    @Override
    public EntryParent getEntryParent() {
        return null;
    }

    private DirectoryEntry getDirectory(Path path) {
        return getDirectory(path, entries, this, 0);
    }

    private static DirectoryEntry getDirectory(Path path, List<Entry> entries, EntryParent entryParent, int idx) {
        final Path name = path.getName(idx);
        DirectoryEntry entry = (DirectoryEntry) getEntry(entries, name.getFileName().toString());
        if (entry == null) {
            entry = new DirectoryEntry(name.toString(), entryParent);
            entries.add(entry);
        }
        if (idx + 1 < path.getNameCount()) {
            return getDirectory(path, entry.entries, entry, idx + 1);
        }
        return entry;
    }
}
