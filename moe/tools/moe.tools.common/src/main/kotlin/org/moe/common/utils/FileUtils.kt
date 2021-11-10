package org.moe.common.utils

import java.io.File
import java.io.InputStream
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
