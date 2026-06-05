package org.moe.gradle.remote;

import org.jspecify.annotations.NonNull;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;
import org.moe.tools.substrate.GraalVM;
import org.moe.tools.substrate.GraalVMHost;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * {@link GraalVMHost} backed by an SSH {@link Server}: every operation runs on the remote macOS
 * build server. The remote is always a Unix Mac, so paths join with '/'. Quarantine is auto-cleared
 */
public class RemoteGraalVMHost implements GraalVMHost {

    @NotNull
    private final Server server;

    public RemoteGraalVMHost(Server server) {
        this.server = Require.nonNull(server);
    }

    @Override
    public boolean isWindows() {
        return false;
    }

    @Override
    public boolean isMac() {
        return true;
    }

    @Override
    public @NonNull String resolve(@NonNull String base, String... parts) {
        final StringBuilder sb = new StringBuilder(base);
        for (String part : parts)
            sb.append('/').append(part);
        return sb.toString();
    }

    @Override
    public boolean exists(@NonNull String path) {
        try {
            server.exec("graalvm exists", "test -e " + quote(path));
            return true;
        } catch (ServerChannelException e) {
            return false;
        }
    }


    @Override
    public @NonNull String exec(String @NonNull ... command) {
        String cmd = Arrays.stream(command).map(RemoteGraalVMHost::quote).collect(Collectors.joining(" "));
        return server.exec("graalvm exec", cmd);
    }

    @Override
    public void ensureUnquarantined(@NonNull String home) {
        server.exec("graalvm dequarantine", "xattr -r -d " + GraalVM.MAC_ATTR_COM_APPLE_QUARANTINE + " " + quote(home));
    }

    private static String quote(String s) {
        return "'" + s.replace("'", "'\\''") + "'";
    }
}
