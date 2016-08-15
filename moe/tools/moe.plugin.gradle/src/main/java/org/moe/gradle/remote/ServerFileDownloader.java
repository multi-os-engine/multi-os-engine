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

import com.jcraft.jsch.ChannelExec;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TermColor;
import static org.moe.gradle.utils.TermColor.*;
import static org.moe.gradle.remote.ServerFileDownloader.Type.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class ServerFileDownloader extends AbstractServerSCPTask {

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

    /*
     * MSG: <mode:mmmm> ' ' <filesize> ' ' <filename> '\n'
     */
    private class FEntry {

        final int mode;

        final long size;

        @NotNull
        final String name;

        FEntry(@NotNull InputStream in, @NotNull OutputStream out) throws IOException {
            Require.nonNull(in);
            Require.nonNull(out);

            // <mode:mmmm>
            byte filemodeBytes[] = new byte[4];
            Require.EQ(in.read(filemodeBytes, 0, 4), 4, "not enough bytes read");
            Require.EQ(filemodeBytes[0], '0', "expected first mode byte to be '0'");
            int filemode = 0;
            for (int i = 0; i < 4; ++i) {
                final byte actual = filemodeBytes[i];
                if (actual < '0' || actual > '7') {
                    screwup(out, "bad mode");
                }
                filemode = (filemode << 3) | (actual - '0');
            }
            mode = filemode;

            // ' '
            int c = in.read();
            Require.NE(c, -1, "unexpected end of stream");
            if (c != ' ') {
                screwup(out, "mode not delimited");
            }

            // <filesize>
            long filesize = 0;
            while (true) {
                c = in.read();
                Require.NE(c, -1, "unexpected end of stream");
                if (c < '0' || c > '9') {
                    break;
                }
                filesize = (filesize * 10) + (c - '0');
            }
            this.size = filesize;

            // ' '
            if (c != ' ') {
                screwup(out, "size not delimited");
            }

            // <filename> '\n'
            final StringBuilder filename = new StringBuilder(256);
            while ((c = in.read()) != '\n') {
                Require.NE(c, -1, "unexpected end of stream");
                filename.append((char) c);
            }
            this.name = filename.toString();
            if (name.indexOf('/') != -1 || name.compareTo("..") == 0) {
                screwup(out, "error: unexpected filename: " + name);
            }

            // OK
            writeResponse(out, RESP_OK);
        }
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

        // exec 'scp -f rfile' remotely
        String command = "scp -f " + (recursive ? "-r " : "") + remoteFile;
        ChannelExec channel = (ChannelExec) server.session.openChannel("exec");
        channel.setCommand(command);

        // get I/O streams for remote scp
        OutputStream out = channel.getOutputStream();
        InputStream in = channel.getInputStream();

        channel.connect();

        try {
            writeResponse(out, RESP_OK);

            Type code;
            int depth = 0;
            File targetDir = localOutputDir;
            final StringBuilder structure = new StringBuilder(1024);
            while (true) {
                code = getNextType(in);
                switch (code) {
                    case FILE: {
                        final FEntry entry = new FEntry(in, out);
                        outlog.print(structure + "+-- " +
                                TermColor.FG_SET_RED + "[" + Integer.toOctalString(entry.mode) + "] " + TermColor.FG_SET_DEFAULT +
                                entry.name);

                        try {
                            final File file = new File(targetDir, entry.name);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("Failed to delete file " + file);
                            }

                            final long start = System.nanoTime();
                            try (FileOutputStream fos = new FileOutputStream(file)) {
                                long rem = entry.size;
                                byte buff[] = new byte[4096];
                                while (rem > 0) {
                                    int chunk = (int) Math.min(4096, rem);
                                    final int read = in.read(buff, 0, chunk);
                                    Require.NE(read, -1, "unexpected end of stream");
                                    rem -= read;
                                    fos.write(buff, 0, read);
                                }
                                checkAck(in);
                                writeResponse(out, RESP_OK);
                            }
                            setPrivileges(file, entry.mode);
                            final long stop = System.nanoTime();
                            final double elapsed = stop - start;
                            final double size = entry.size;
                            double speed = (size / 1024.0) / (elapsed / 1000000000.0);
                            String sizeM = "kB";
                            if (speed > 1024.0) {
                                speed /= 1024.0;
                                sizeM = "MB";
                            }
                            outlog.printf(" %s(%.2f %s/s)%s\n", TermColor.FG_SET_YELLOW, speed, sizeM, TermColor.FG_SET_DEFAULT);
                        } catch (Exception e) {
                            outlog.println();
                            throw e;
                        }

                        break;
                    }
                    case DIRECTORY_ENTER: {
                        final FEntry entry = new FEntry(in, out);

                        if (depth != 0 || !remoteFile.endsWith("/")) {
                            outlog.println(structure + "+-- " +
                                    TermColor.FG_SET_RED + "[" + Integer.toOctalString(entry.mode) + "] " +
                                    TermColor.FG_SET_BLUE + entry.name + TermColor.FG_SET_DEFAULT);
                            structure.append("|   ");

                            targetDir = new File(targetDir, entry.name);
                            if (targetDir.exists() && !targetDir.isDirectory() && !targetDir.delete()) {
                                throw new IOException("Failed to delete non-directory " + targetDir);
                            }
                            if (!targetDir.exists() && !targetDir.mkdirs()) {
                                throw new IOException("Failed to create directory " + targetDir);
                            }
                            setPrivileges(targetDir, entry.mode);
                        }
                        ++depth;

                        break;
                    }
                    case DIRECTORY_EXIT: {
                        --depth;
                        if (depth != 0 || !remoteFile.endsWith("/")) {
                            structure.replace(structure.length() - 4, structure.length(), "");
                        }

                        int c = in.read();
                        Require.NE(c, -1, "unexpected end of stream");
                        if (c != '\n') {
                            screwup(out, "mode not delimited");
                        }
                        writeResponse(out, RESP_OK);
                        targetDir = targetDir.getParentFile();
                        break;
                    }
                }
                if (depth == 0) {
                    break;
                }
            }
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace(errlog);
            }
            channel.disconnect();
        }
    }

    private void setPrivileges(File file, int mode) {
        final int usermode = (mode >> 6) & 0x7;
        final boolean r = (usermode & 0x4) > 0;
        final boolean w = (usermode & 0x2) > 0;
        final boolean x = (usermode & 0x1) > 0;
        if (file.canRead() != r && !file.setReadable(r)) {
            System.err.println("Failed to set '" + file + "' readable");
        }
        if (file.canWrite() != w && !file.setWritable(w)) {
            System.err.println("Failed to set '" + file + "' writable");
        }
        if (file.canExecute() != x && !file.setExecutable(x)) {
            if (!Os.isFamily(Os.FAMILY_WINDOWS) || x) {
                System.err.println("Failed to set '" + file + "' executable");
            }
        }
    }

    private Type getNextType(InputStream in) throws IOException {
        final int next = in.read();
        switch (next) {
            case 'C':
                return FILE;
            case 'D':
                return DIRECTORY_ENTER;
            case 'E':
                return DIRECTORY_EXIT;
            case -1:
                throw new GradleException("End of stream");
            case 1:
            case 2: {
                StringBuilder sb = new StringBuilder();
                int c;
                do {
                    c = in.read();
                    sb.append((char) c);
                }
                while (c != '\n');
                throw new IOException("ERROR(" + next + "): " + sb);
            }
            default:
                throw new IOException("Unknown type (" + next + ")");
        }
    }
}
