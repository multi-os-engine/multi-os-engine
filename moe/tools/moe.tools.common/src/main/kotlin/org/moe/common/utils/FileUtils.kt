package org.moe.common.utils

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.util.jar.JarFile

fun Iterable<File>.classAndJarInputIterator(consumer: (InputStream) -> Unit): Unit = forEach {
    if (!it.exists()) {
        return@forEach
    }

    if (it.isDirectory) {
        it.walk().forEach walk@{ f ->
            if (f.isDirectory || !f.name.endsWith(".class")) {
                return@walk
            }

            f.inputStream().use(consumer)
        }
    } else if (it.name.endsWith(".jar")) {
        val file = JarFile(it)

        file.stream().forEach jar@{ entry ->
            if (!entry.name.endsWith(".class")) {
                return@jar
            }

            file.getInputStream(entry).use(consumer)
        }
    }
}

fun File.prepareDir(): Boolean {
    return if (this.exists()) {
        if (this.isDirectory) {
            true
        } else {
            throw IOException("Expected directory at path " + this.absolutePath)
        }
    } else this.mkdirs()
}

fun Path.prepareDir(): Boolean = toFile().prepareDir()

fun Path.touch() {
    Files.write(this, byteArrayOf(),
        StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND)
}

fun File.touch() = toPath().touch()
