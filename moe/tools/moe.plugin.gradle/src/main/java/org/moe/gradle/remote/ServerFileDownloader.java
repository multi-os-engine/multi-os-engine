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
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TermColor;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class ServerFileDownloader extends AbstractServerTask {

    private static final Logger LOG = Logging.getLogger(ServerFileDownloader.class);

    @NotNull
    private final String name;

    @NotNull
    private final String remoteFile;

    @NotNull
    private final File localOutputDir;

    private final boolean recursive;

    protected ServerFileDownloader(@NotNull Server server, @NotNull String name, @NotNull String remoteFile,
                                   @NotNull File localOutputDir, boolean recursive) {
        super(server);
        this.name = Require.nonNull(name);
        this.remoteFile = Require.nonNull(remoteFile);
        this.localOutputDir = Require.nonNull(localOutputDir);
        this.recursive = recursive;
        Require.TRUE(localOutputDir.isAbsolute(), "Internal error: file must be an absolute path");
    }

    @Override
    public String getTaskName() {
        return "FILE DOWNLOAD: " + name;
    }

    protected enum Type {
        FILE, DIRECTORY_ENTER, DIRECTORY_EXIT
    }

    @Override
    protected void main() throws Exception {
        if (!localOutputDir.exists() && !localOutputDir.mkdirs()) {
            throw new IOException("Failed to create output directory " + localOutputDir);
        }

        outlog.println(TermColor.FG_SET_YELLOW + "    Remote: " + TermColor.FG_SET_DEFAULT + remoteFile);
        outlog.println(TermColor.FG_SET_YELLOW + "Local Root: " + TermColor.FG_SET_DEFAULT + localOutputDir.getAbsoluteFile());
        outlog.println(TermColor.FG_SET_YELLOW + " Recursive: " + TermColor.FG_SET_DEFAULT + (recursive ? "Yes" : "No"));
        outlog.println();

        if (recursive) {
            ServerCommandRunner commandRunner = new ServerCommandRunner(server, "test", "mktemp -d");
            commandRunner.run();
            String remoteZip = commandRunner.getOutput().trim() + "/zip.zip";
            server.exec("zip directory", "cd " + remoteFile + "/../ && zip -r -X " + remoteZip + " " + Paths.get(remoteFile).getFileName());
            Path tmp = Files.createTempFile("zip", ".zip");
            ChannelSftp sftp = (ChannelSftp) server.session.openChannel("sftp");
            sftp.connect();
            sftp.get(remoteZip, tmp.toString());
            try (FileSystem fileSystem = FileSystems.newFileSystem(tmp, (ClassLoader)null)) {
                Files.walk(fileSystem.getPath("/")).skip(1).forEach(e -> {
                    Path target = localOutputDir.toPath().resolve(fileSystem.getPath("/").relativize(e).toString());
                    try {
                        if (target.getParent() != null) {
                            Files.createDirectories(target.getParent());
                        }
                        if (target.toFile().isDirectory()) return;
                        Files.copy(e, target, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
            }
        } else {
            ChannelSftp sftp = (ChannelSftp) server.session.openChannel("sftp");
            sftp.connect();
            sftp.get(remoteFile, localOutputDir.toPath().resolve(Paths.get(remoteFile).getFileName()).toString());
            sftp.disconnect();
        }

    }

}
