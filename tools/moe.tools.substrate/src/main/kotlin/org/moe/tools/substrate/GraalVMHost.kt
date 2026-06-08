package org.moe.tools.substrate

/**
 * Abstracts the machine a [GraalVM] lives on, so the same [GraalVM] logic works for the local host
 * and a remote (SSH) build server. Every environment-specific operation a [GraalVM] needs goes
 * through this handler; a [GraalVM] holds no [java.nio.file.Path] (which would implicitly mean "the
 * local JVM's filesystem").
 */
interface GraalVMHost {

    val isWindows: Boolean

    val isMac: Boolean

    /** Compose a path in this machine's convention (local separator vs. remote `/`). */
    fun resolve(base: String, vararg parts: String): String

    fun exists(path: String): Boolean

    /** Run [command] on this machine and return its combined stdout+stderr, trimmed. */
    fun exec(vararg command: String): String

    /**
     * Ensure the GraalVM at [base] is not Gatekeeper-quarantined. Policy is per-machine: the local
     * host detects and throws with a fix instruction; a remote build server clears it automatically.
     * Only invoked when [isMac] is true.
     */
    fun ensureUnquarantined(base: String)

    val pathSeparator: String get() = if (isWindows) ";" else ":"
}
