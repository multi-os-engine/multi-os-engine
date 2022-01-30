package org.moe.common.utils

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.jar.JarEntry
import java.util.jar.JarFile

sealed class ClasspathEntry {
    abstract val path: String
    abstract val isDirectory: Boolean

    abstract fun inputStream(): InputStream

    internal class Jar(
        private val jarFile: JarFile,
        private val jarEntry: JarEntry,
    ) : ClasspathEntry() {
        override val path: String
            get() = jarEntry.name

        override val isDirectory: Boolean
            get() = jarEntry.isDirectory

        override fun inputStream(): InputStream = jarFile.getInputStream(jarEntry)
    }

    internal class NormalFile(
        private val file: File,
        override val path: String
    ) : ClasspathEntry() {
        override val isDirectory: Boolean
            get() = file.isDirectory

        override fun inputStream(): InputStream = file.inputStream()
    }
}

fun File.classpathIterator(consumer: (entry: ClasspathEntry) -> Unit) {
    if (!this.exists()) {
        return
    }

    if (this.isDirectory) {
        this.walk().forEach walk@{ f ->
            consumer(
                ClasspathEntry.NormalFile(
                    file = f,
                    path = f.relativeToOrSelf(this).path,
                )
            )
        }
    } else if (this.name.endsWith(".jar")) {
        JarFile(this).use { file ->
            file.stream().forEach jar@{ entry ->
                consumer(
                    ClasspathEntry.Jar(
                        jarFile = file,
                        jarEntry = entry,
                    )
                )
            }
        }
    }
}

fun Iterable<File>.classpathIterator(consumer: (entry: ClasspathEntry) -> Unit) = forEach {
    it.classpathIterator(consumer)
}

fun File.classpathIterator(consumer: (path: String, inputStream: InputStream) -> Unit, filter: (path: String) -> Boolean) {
    this.classpathIterator { entry->
        if(!entry.isDirectory && filter(entry.path)) {
            entry.inputStream().use {
                consumer(entry.path, it)
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
