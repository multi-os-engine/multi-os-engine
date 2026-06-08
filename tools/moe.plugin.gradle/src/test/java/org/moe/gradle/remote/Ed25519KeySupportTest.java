package org.moe.gradle.remote;

import com.jcraft.jsch.JSch;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

/**
 * Verifies the SSH library can load an OpenSSH-format ed25519 private key.
 * com.jcraft:jsch 0.1.53 throws JSchException("invalid privatekey") here;
 * com.github.mwiede:jsch 2.28.2 parses it.
 */
public class Ed25519KeySupportTest {

    @Rule
    public final TemporaryFolder tmp = new TemporaryFolder();

    @Test
    public void loadsOpenSshEd25519Key() throws Exception {
        final File key = new File(tmp.getRoot(), "id_ed25519");

        final Process p;
        try {
            p = new ProcessBuilder(
                    "ssh-keygen", "-t", "ed25519", "-N", "", "-C", "moe-test",
                    "-f", key.getAbsolutePath())
                    .redirectErrorStream(true)
                    .start();
        } catch (IOException notOnPath) {
            assumeNoException("ssh-keygen unavailable; skipping", notOnPath);
            return;
        }

        String output = new String(p.getInputStream().readAllBytes());
        int code = p.waitFor();
        assertEquals("ssh-keygen failed: " + output, 0, code);

        new JSch().addIdentity(key.getAbsolutePath());
    }
}
