package org.moe.tools.substrate.utils

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import kotlin.streams.toList

@Throws(IOException::class)
fun Path.find(fileName: String, isDirectory: Boolean = false, maxDepth: Int = Int.MAX_VALUE): List<Path> {
    return Files.find(this, maxDepth, { p, _ ->
        p.fileName.toString() == fileName && (isDirectory == Files.isDirectory(p))
    }).toList()
}

@Throws(IOException::class)
fun Path.findOne(fileName: String, isDirectory: Boolean = false, maxDepth: Int = Int.MAX_VALUE): Path {
    val results = find(fileName, isDirectory, maxDepth)

    return when (results.size) {
        1 -> results.single()
        0 -> throw IOException("No ${if (isDirectory) "directory" else "file"} with name \"$fileName\" can be found in \"$this\" with max depth $maxDepth")
        else -> throw IOException("Multiple ${if (isDirectory) "directories" else "files"} with name \"$fileName\" are found in \"$this\" with max depth $maxDepth: $results")
    }
}
