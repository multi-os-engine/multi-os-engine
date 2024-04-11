package org.moe.tools.classvalidator.substrate

import org.moe.common.utils.classAndJarInputIterator
import org.moe.tools.classvalidator.ChildFirstClassLoader
import org.moe.tools.classvalidator.ContextClassLoaderHolder
import org.objectweb.asm.ClassReader
import java.io.File
import java.nio.file.Path

object ReflectionCollector {
    fun process(
        mainClassName: String?,
        inputFiles: Set<File>,
        outputDir: Path,
        classpath: Set<File>,
        proxyConfigVersion: ProxyConfig.FileVersion
    ) {
        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            val reflectionConfig = ReflectionConfig()
            val proxyConfig = ProxyConfig()

            inputFiles.classAndJarInputIterator { _, inputStream ->
                val cr = ClassReader(inputStream)

                val chain = CollectProxyConfig(config = proxyConfig).let { next ->
                    CollectReflectionConfig(config = reflectionConfig, next = next)
                }

                cr.accept(chain, 0)
            }

            // Add main class if necessary
            mainClassName?.let {
                reflectionConfig.addMethod(it.replace('.', '/'), METHOD_MAIN, METHOD_MAIN_DESC)
            }

            reflectionConfig.save(outputDir.resolve(OUTPUT_REFLECTION).toFile())
            proxyConfig.save(filePath = outputDir.resolve(OUTPUT_PROXY).toFile(), version = proxyConfigVersion)
        }

    }

    const val OUTPUT_REFLECTION = "reflection-config.json"
    const val OUTPUT_PROXY = "proxy-config.json"

    private const val METHOD_MAIN = "main"
    private const val METHOD_MAIN_DESC = "([Ljava/lang/String;)V"
}
