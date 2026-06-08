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

package org.moe.gradle.remote;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import org.apache.tools.ant.types.selectors.SelectorUtils;
import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.remote.file.DirectoryEntry;
import org.moe.gradle.remote.file.ExecPolicy;
import org.moe.gradle.remote.file.FileEntry;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.remote.file.Walker;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.moe.gradle.utils.TermColor.*;

class ServerFileUploader extends AbstractServerTask {

    private static final Set<PosixFilePermission> EXEC_PERMS = PosixFilePermissions.fromString("rwxr-xr-x");
    private static final Set<PosixFilePermission> FILE_PERMS = PosixFilePermissions.fromString("rw-r--r--");

    @NotNull private final String name;

    @NotNull private final FileList list;

    protected ServerFileUploader(@NotNull Server server, @NotNull String name, @NotNull FileList list) {
        super(server);
        this.name = Require.nonNull(name);
        this.list = Require.nonNull(list);
    }

    @Override
    public String getTaskName() {
        return "FILE UPLOAD: " + name;
    }

    @Override
    protected void main() {
        outlog.println(FG_SET_YELLOW + "Local Root: " + FG_SET_DEFAULT + list.getLocalRoot().toFile().getAbsolutePath());
        outlog.println(FG_SET_YELLOW + "    Remote: " + FG_SET_DEFAULT + list.getTarget().getPath());
        outlog.println();

        boolean hostIsPosix = FileSystems.getDefault().supportedFileAttributeViews().contains("posix");
        ExecPolicy policy = list.getExecPolicy();
        List<String> globs;
        if (hostIsPosix) {
            globs = Collections.emptyList();
        } else {
            globs = switch (policy) {
                case EXPLICIT -> server.getExecutablePathsSetting().stream().map(this::normalizeGlob).collect(Collectors.toList());
                case ALL -> List.of("**");
            };
        }

        try {
            Path zipPath = Files.createTempFile("MOE-Remote", ".zip");
            Files.deleteIfExists(zipPath);
            Map<String, String> env = new HashMap<>();
            env.put("create", "true");
            env.put("enablePosixFileAttributes", "true");
            try (FileSystem zipFile = FileSystems.newFileSystem(URI.create(zipPath.toUri().toString().replace("file://", "jar:file:")), env)) {
                list.walk(new Zipper(zipFile, hostIsPosix, globs));
                Files.createFile(zipFile.getPath("/.placeholder"));
            }

            String serverPath = Server.getRemotePath(server.getTempDir(), zipPath.getFileName());
            final long start = System.nanoTime();
            uploadFile(zipPath.toString(), serverPath);
            final long stop = System.nanoTime();
            final double elapsed = stop - start;
            final double size = zipPath.toFile().length();
            double speed = (size / 1024.0) / (elapsed / 1000000000.0);
            String sizeM = "kB";
            if (speed > 1024.0) {
                speed /= 1024.0;
                sizeM = "MB";
            }
            outlog.printf(" %s(%.2f %s/s)%s\n", FG_SET_YELLOW, speed, sizeM, FG_SET_DEFAULT);
            outlog.flush();

            server.exec("unzip files", "unzip -o -d " + list.getTarget().getPath() + " " + serverPath);
            Files.deleteIfExists(zipPath);
        } catch (IOException e) {
            throw new GradleException("Unable to create temporary zip file: " + e.getMessage());
        }
    }

    private void copyFileToZip(FileSystem zip, File local, Path remoteRel, Set<PosixFilePermission> perms) throws IOException {
        Path parent = remoteRel.getParent();
        if (parent != null) {
            mkdirsInZip(zip, parent);
        }
        Path dst = zip.getPath(remoteRel.toString());
        Files.copy(local.toPath(), dst);
        Files.setPosixFilePermissions(dst, perms);
    }

    private void mkdirsInZip(FileSystem zip, Path remoteRelDir) throws IOException {
        Path dir = zip.getPath(remoteRelDir.toString());
        Files.createDirectories(dir);
        for (Path p = dir; p != null && p.getNameCount() > 0; p = p.getParent()) {
            Files.setPosixFilePermissions(p, EXEC_PERMS);
        }
    }

    /**
     * Pre-processes a user glob into the form Ant's {@link SelectorUtils#matchPath(String, String)} expects:
     * separators folded to the host {@link File#separatorChar} (matchPath tokenizes on it),
     * and a trailing separator expanded to {@code **}, the way Gradle's include/exclude does.
     * Supports {@code **} (any incl. dirs), {@code *} (within a segment), {@code ?} (one char).
     */
    private String normalizeGlob(String glob) {
        String p = glob.replace('/', File.separatorChar).replace('\\', File.separatorChar);
        if (p.endsWith(File.separator))
            p += "**";
        return p;
    }

    /** Ant-style full-path match, case-sensitive (POSIX remote target). Empty list => no match. */
    private boolean matchesAnyGlob(List<String> globs, String relPath) {
        final String path = relPath.replace('/', File.separatorChar).replace('\\', File.separatorChar);
        for (String g : globs) {
            if (SelectorUtils.matchPath(g, path, true)) {
                return true;
            }
        }
        return false;
    }

    private void uploadFile(String localPath, String remotePath) {
        try {
            ChannelSftp sftp = (ChannelSftp) server.session.openChannel("sftp");
            sftp.connect();
            sftp.put(localPath, remotePath);
            sftp.disconnect();
        } catch (JSchException | SftpException e) {
            throw new RuntimeException(e);
        }
    }

    private class Zipper implements Walker {
        private final StringBuilder structure = new StringBuilder(1024);

        private final FileSystem zipFile;
        private final boolean hostIsPosix;
        private final List<String> globs;


        public Zipper(FileSystem zipFile, boolean hostIsPosix, List<String> globs) {
            this.zipFile = zipFile;
            this.hostIsPosix = hostIsPosix;
            this.globs = globs;
        }

        @Override
        public void visitFile(FileEntry entry, boolean isLast) throws IOException {
            outlog.print(structure + (isLast ? "\\-- " : "+-- ") + entry.getName());
            try {
                File localFile = entry.getLocalFile();
                Path remoteRel = entry.getRemotePath();
                if (localFile.length() > /* only check md5 when file if larger than */ 256 * 1024 && server.checkFileMD5(Server.getRemotePath(list.getTarget(), remoteRel),
                        localFile)) {
                    outlog.printf(" %s(up-to-date)%s\n", FG_SET_YELLOW, FG_SET_DEFAULT);
                    return;
                }

                copyFileToZip(zipFile, localFile, remoteRel, modeFor(localFile, remoteRel));
                outlog.println();
            } catch (Exception e) {
                outlog.println();
                throw e;
            }
        }

        private Set<PosixFilePermission> modeFor(File localFile, Path remoteRel) throws IOException {
            if (hostIsPosix)
                return Files.getPosixFilePermissions(localFile.toPath());

            return matchesAnyGlob(globs, remoteRel.toString()) ? EXEC_PERMS : FILE_PERMS;
        }


        @Override
        public void preVisitDirectory(DirectoryEntry entry, boolean isLast) {
            outlog.println(structure + (isLast ? "\\-- " : "+-- ") + FG_SET_BLUE + entry.getName() + FG_SET_DEFAULT);
            structure.append(isLast ? "    " : "|   ");
        }

        @Override
        public void postVisitDirectory(DirectoryEntry entry, boolean isLast) {
            structure.replace(structure.length() - 4, structure.length(), "");
        }
    }
}
