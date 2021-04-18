package org.moe.tools.classvalidator

class ContextClassLoaderHolder(
    classLoader: ClassLoader
) : AutoCloseable {

    // Save current context CL
    private val savedClassLoader: ClassLoader? = Thread.currentThread().contextClassLoader

    init {
        // Then set context CL
        Thread.currentThread().contextClassLoader = classLoader
    }

    override fun close() {
        // Restore context CL
        Thread.currentThread().contextClassLoader = savedClassLoader
    }
}
