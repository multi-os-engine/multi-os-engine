package org.moe.tools.substrate

import org.apache.commons.io.FilenameUtils
import org.moe.common.exec.ExecOutputCollector
import org.moe.common.exec.SimpleExec
import org.moe.common.utils.OsUtils
import org.moe.tools.substrate.GraalVM.Companion.MAC_ATTR_COM_APPLE_QUARANTINE
import org.slf4j.LoggerFactory
import java.nio.file.Files
import java.nio.file.Paths

/**
 * [GraalVMHost] for the local machine — the behavior [GraalVM] used to do inline
 * (OsUtils / Files / SimpleExec), now living behind the handler seam.
 */
class LocalGraalVMHost : GraalVMHost {

    override val isWindows: Boolean
        get() = OsUtils.isWindows()

    override val isMac: Boolean
        get() = OsUtils.isMac()

    override fun resolve(base: String, vararg parts: String): String =
            parts.fold(base) { acc, part -> FilenameUtils.concat(acc, part) }

    override fun exists(path: String): Boolean = Files.exists(Paths.get(path))

    override fun exec(vararg command: String): String =
            ExecOutputCollector.collect(
                    SimpleExec
                            .getExec(command.first(), *command.drop(1).toTypedArray())
                            .runner
                            // java writes -version to stderr
                            .apply { builder.redirectErrorStream(true) }
            ).trim()

    override fun ensureUnquarantined(base: String) {
        LOG.debug("Checking quarantine of {}", base)

        val attrs = SimpleExec.exec("xattr", base).trim().lines()
        if (MAC_ATTR_COM_APPLE_QUARANTINE in attrs) {
            LOG.warn(
                    "GraalVM home quarantined, run the following command to remove the quarantine attribute:\nsudo xattr -r -d {} {}",
                    MAC_ATTR_COM_APPLE_QUARANTINE, base
            )
            throw IllegalArgumentException("GraalVM home quarantined")
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(LocalGraalVMHost::class.java)
    }
}
