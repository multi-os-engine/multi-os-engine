package org.moe.common.utils

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.jar.JarFile

fun File.classpathIterator(consumer: (path: String, inputStream: InputStream) -> Unit, filter: (path: String) -> Boolean) {
    if (!this.exists()) {
        return
    }

    if (this.isDirectory) {
        this.walk().forEach walk@{ f ->
            if (f.isDirectory) {
                return@walk
            }

            val relPath = f.relativeToOrSelf(this)

            if (!filter(relPath.path)) {
                return@walk
            }

            f.inputStream().use {
                it.reader()
                consumer(relPath.path, it) }
        }
    } else if (this.name.endsWith(".jar")) {
        JarFile(this).use { file ->
            file.stream().forEach jar@{ entry ->
                if (entry.isDirectory || !filter(entry.name)) {
                    return@jar
                }

                file.getInputStream(entry).use { consumer(entry.name, it) }
            }
        }
    }
}

fun Iterable<File>.classpathIterator(consumer: (path: String, inputStream: InputStream) -> Unit, filter: (path: String) -> Boolean): Unit = forEach {
    it.classpathIterator(consumer, filter)
}

fun Iterable<File>.classAndJarInputIterator(consumer: (path: String, inputStream: InputStream) -> Unit): Unit = classpathIterator(consumer) { it.endsWith(".class") }

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
