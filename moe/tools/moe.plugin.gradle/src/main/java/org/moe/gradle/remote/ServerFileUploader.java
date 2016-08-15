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

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.remote.file.DirectoryEntry;
import org.moe.gradle.remote.file.FileEntry;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.remote.file.Walker;
import org.moe.gradle.utils.Require;
import static org.moe.gradle.utils.TermColor.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

class ServerFileUploader extends AbstractServerSCPTask {

    @NotNull
    private final String name;

    @NotNull
    private final FileList list;

    private boolean ptimestamp = true;

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
    protected void main() throws Exception {
        outlog.println(FG_SET_YELLOW + "Local Root: " + FG_SET_DEFAULT + list.getLocalRoot().toFile().getAbsolutePath());
        outlog.println(FG_SET_YELLOW + "    Remote: " + FG_SET_DEFAULT + list.getTarget().getPath());
        outlog.println();

        list.walk(new Uploader());
    }

    private class Uploader implements Walker {
        ChannelExec channel;
        OutputStream out;
        InputStream in;
        int depth = 0;
        private final StringBuilder structure = new StringBuilder(1024);

        @Override
        public void visitFile(FileEntry entry, boolean isLast) throws IOException {
            outlog.print(structure + (isLast ? "\\-- " : "+-- ") + entry.getName());
            try {
                @NotNull final File localFile = entry.getLocalFile();
                if (localFile.length() > /* only check md5 when file if larger than */ 256 * 1024 &&
                        server.checkFileMD5(Server.getRemotePath(list.getTarget(), entry.getRemotePath()), localFile)) {
                    outlog.printf(" %s(up-to-date)%s\n", FG_SET_YELLOW, FG_SET_DEFAULT);
                    return;
                }

                final long start = System.nanoTime();
                if (channel == null) {
                    uploadSingleFile(entry.getRemotePath(), localFile);
                } else {
                    Require.nonNull(in);
                    Require.nonNull(out);
                    writeFile(localFile, in, out);
                }
                final long stop = System.nanoTime();
                final double elapsed = stop - start;
                final double size = localFile.length();
                double speed = (size / 1024.0) / (elapsed / 1000000000.0);
                String sizeM = "kB";
                if (speed > 1024.0) {
                    speed /= 1024.0;
                    sizeM = "MB";
                }
                outlog.printf(" %s(%.2f %s/s)%s\n", FG_SET_YELLOW, speed, sizeM, FG_SET_DEFAULT);
            } catch (Exception e) {
                outlog.println();
                throw e;
            }
        }

        private void uploadSingleFile(@NotNull Path remotePath, @NotNull File localFile) throws IOException {
            Require.nonNull(remotePath);
            Require.nonNull(localFile);
            String remoteFile = server.getRemotePath(remotePath);

            try {
                // exec 'scp -t remoteFile' remotely
                String command = "scp " + (ptimestamp ? "-p" : "") + " -t " + remoteFile;
                Channel channel = server.session.openChannel("exec");
                ((ChannelExec) channel).setCommand(command);

                // Get I/O streams for remote scp
                OutputStream out = channel.getOutputStream();
                InputStream in = channel.getInputStream();

                // Connect
                channel.connect();
                try {
                    checkAck(in);
                    writeFile(localFile, in, out);
                } finally {
                    try {
                        out.close();
                    } catch (IOException ex) {
                        ex.printStackTrace(errlog);
                    }
                    channel.disconnect();
                }
            } catch (Exception ex) {
                throw new IOException(ex.getMessage(), ex);
            }
        }

        @Override
        public void preVisitDirectory(DirectoryEntry entry, boolean isLast) throws IOException {
            outlog.println(structure + (isLast ? "\\-- " : "+-- ") + FG_SET_BLUE + entry.getName() + FG_SET_DEFAULT);
            structure.append(isLast ? "    " : "|   ");

            if (depth++ == 0) {
                String remoteFile = server.getRemotePath(Paths.get("."));
                channelSetup(remoteFile);
            }

            writeDirectoryEnter(entry.getName(), in, out);
        }

        private void channelSetup(String remoteFile) throws IOException {
            Require.nullObject(channel);
            Require.nullObject(in);
            Require.nullObject(out);

            try {
                // exec 'scp -t remoteFile' remotely
                String command = "scp " + (ptimestamp ? "-p" : "") + " -r -t " + remoteFile;
                channel = (ChannelExec) server.session.openChannel("exec");
                channel.setCommand(command);

                // Get I/O streams for remote scp
                out = channel.getOutputStream();
                in = channel.getInputStream();

                // Connect
                channel.connect();
            } catch (Exception ex) {
                throw new IOException(ex.getMessage(), ex);
            }
        }

        @Override
        public void postVisitDirectory(DirectoryEntry entry, boolean isLast) throws IOException {
            Require.nonNull(channel);
            Require.nonNull(in);
            Require.nonNull(out);

            structure.replace(structure.length() - 4, structure.length(), "");

            writeDirectoryExit(in, out);

            if (--depth == 0) {
                channelTeardown();
            }
        }

        private void channelTeardown() {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace(errlog);
            } finally {
                out = null;
            }
            try {
                in.close();
            } catch (IOException ex) {
                ex.printStackTrace(errlog);
            } finally {
                in = null;
            }
            channel.disconnect();
            channel = null;
        }
    }

    private void writeFile(@NotNull File file, @NotNull InputStream in, @NotNull OutputStream out) throws IOException {
        writeTimes(file, in, out);
        writeFileEntry(file, in, out);
    }

    private void writeTimes(@NotNull File file, @NotNull InputStream in, @NotNull OutputStream out) throws IOException {
        Require.nonNull(file);
        Require.nonNull(in);
        Require.nonNull(out);

        if (ptimestamp) {
            // MSG: 'T' <modification> ' 0 ' <access> ' 0\n'
            final long mod = file.lastModified() / 1000;
            out.write(("T" + mod + " 0 " + mod + " 0\n").getBytes());
            out.flush();
            checkAck(in);
        }
    }

    private void writeFileEntry(@NotNull File file, @NotNull InputStream in, @NotNull OutputStream out)
            throws IOException {
        Require.nonNull(file);
        Require.nonNull(in);
        Require.nonNull(out);

        if (!file.isFile()) {
            throw new GradleException("Expected file");
        }

        // MSG: 'C' <mode:mmmm> ' ' <filesize> ' ' <filename>
        out.write(("C" + getPrivileges(file) + " " + file.length() + " " + file.getName() + "\n").getBytes());
        out.flush();
        checkAck(in);

        // MSG: <data>+ '\0'
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buf = new byte[4096];
            while (true) {
                int len = fis.read(buf, 0, buf.length);
                if (len <= 0) break;
                out.write(buf, 0, len);
            }
            // send '\0'
            buf[0] = 0;
            out.write(buf, 0, 1);
            out.flush();
            checkAck(in);
        }
    }

    private void writeDirectoryEnter(@NotNull String name, @NotNull InputStream in, @NotNull OutputStream out)
            throws IOException {
        Require.nonNull(name);
        Require.nonNull(in);
        Require.nonNull(out);

        // MSG: 'D' <mode:mmmm> ' 0 ' <filename>
        out.write(("D0700 0 " + name + "\n").getBytes());
        out.flush();
        checkAck(in);
    }

    private String getPrivileges(@NotNull File file) {
        final boolean r = file.canRead();
        final boolean w = file.canWrite();
        final boolean x = file.canExecute();
        return "0" + ((r ? 4 : 0) + (w ? 2 : 0) + (x ? 1 : 0)) + "00";
    }

    private void writeDirectoryExit(@NotNull InputStream in, @NotNull OutputStream out) throws IOException {
        Require.nonNull(in);
        Require.nonNull(out);

        // MSG: 'E'
        out.write(("E\n").getBytes());
        out.flush();
        checkAck(in);
    }
}
