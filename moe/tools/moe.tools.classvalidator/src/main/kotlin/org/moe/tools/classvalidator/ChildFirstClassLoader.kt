package org.moe.tools.classvalidator

import java.net.URL
import java.net.URLClassLoader

/**
 * A classloader that load class by itself first, and only delegate to parent if
 * the class cannot be found.
 */
class ChildFirstClassLoader(
    urls: Array<URL>
) : URLClassLoader(urls) {
    override fun findClass(name: String): Class<*> {
        if (name.startsWith("java.")) {
            // Class that's not available in running JDK, but from MOE core, and we can't load it
            // because it's from java.*
            throw ClassNotFoundException(name)
        }
        return super.findClass(name)
    }

    override fun loadClass(name: String): Class<*> {
        // These classes can only be loaded by bootstrap classloader
        if (name.startsWith("java.")) {
            return super.loadClass(name)
        }

        return findLoadedClass(name) ?: try {
            findClass(name)
        } catch (_: ClassNotFoundException) {
            super.loadClass(name)
        }
    }
}
