package org.moe.tools.substrate.utils

import org.moe.common.exec.AbstractExec
import org.moe.common.exec.ExecRunner
import org.moe.common.exec.ExecRunnerBase
import java.io.File
import java.io.IOException

fun AbstractExec.collect(logFile: File?): String = runner.collect(logFile)

fun ExecRunner.collect(logFile: File?): String {
    val out = StringBuilder()
    val err = StringBuilder()

    val rc = logFile?.printWriter().use { logW ->
        logW?.println("COMMAND >>> ${commandLine()}")

        listener = object : ExecRunnerBase.ExecRunnerListener {
            override fun stdout(line: String?) {
                logW?.println(line)
                logW?.flush()
                out.appendLine(line)
            }

            override fun stderr(line: String?) {
                logW?.println(line)
                logW?.flush()
                err.appendLine(line)
            }
        }

        run(null)
    }

    if (rc != 0) {
        if (wasKilled()) {
            throw IOException("Execution of command '${commandLine()}' was canceled by the user.")
        } else {
            throw IOException("Execution of command '${commandLine()}' failed with error code $rc\n$err")
        }
    }

    return out.toString()
}