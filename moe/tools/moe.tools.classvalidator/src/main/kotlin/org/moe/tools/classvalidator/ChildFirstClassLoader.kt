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
