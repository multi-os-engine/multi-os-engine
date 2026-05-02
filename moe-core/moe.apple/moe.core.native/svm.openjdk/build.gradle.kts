import org.gradle.api.tasks.TaskProvider
import org.moe.prebuilts.BuildFilter
import org.moe.prebuilts.Script
import org.moe.prebuilts.XcodeBuild
import java.io.File

val buildfilter = extensions.getByType<BuildFilter>()

@Suppress("UNCHECKED_CAST")
val externalSvm: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["svm"] as Map<String, Any?>
val svmOpenjdkPath = externalSvm["openjdk"] as String

val parentExtra = parent!!.extra
@Suppress("UNCHECKED_CAST")
val bootJdkTask = parentExtra["bootJdkTask"] as TaskProvider<*>
val bootJdkDirHome = parentExtra["bootJdkDirHome"] as File

tasks.register<Script>("jdk_gensrc") {
    dependsOn(bootJdkTask)

    val builtJdkDir = file("build/labsjdk")

    inputs.dir(bootJdkDirHome)
    inputs.dir(svmOpenjdkPath)
    outputs.dir(builtJdkDir)

    setRawWorkDir("$builtJdkDir")

    progress("Copy jdk")
    rsync(file(svmOpenjdkPath), getWorkDir())

    progress("Configure jdk")

    exec("sh", "-c", "patch -p1 < ${file("add_ios_build_support.patch").absolutePath}")
    exec("sh", "-c", "patch -p1 < ${file("fix_memset_call.patch").absolutePath}")

    val jvmciVersion = "jvmci-25.0.1-b01"
    // For whatever reason setting "--with-boot-jdk" does not work
    env("JAVA_HOME", file(bootJdkDirHome).absolutePath)
    env("MX_PYTHON", "python3")
    exec("sh", "configure", "--with-conf-name=labsjdk", "--with-version-opt=$jvmciVersion", "--with-version-pre=",
        "--with-vendor-name=GraalVM Community", "--with-vendor-url=https://www.graalvm.org/", "--with-vendor-bug-url=https://github.com/oracle/graal/issues",
        "--with-vendor-vm-bug-url=https://github.com/oracle/graal/issues", "--with-extra-cflags=-Wno-error=macro-redefined", "--with-extra-cxxflags=-Wno-error=vla-cxx-extension")
    progress("Make jdk")
    exec("make", "CONF_NAME=labsjdk", "graal-builder-image")
}

XcodeBuild.registerTask(project, "libjava", "ios", "iphoneos", "Debug") {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("jdk_gensrc")
}
XcodeBuild.registerTask(project, "libjava", "ios", "iphoneos", "Release") {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("jdk_gensrc")
}
XcodeBuild.registerTask(project, "libjava", "ios", "iphonesimulator", "Debug") {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("jdk_gensrc")
}
XcodeBuild.registerTask(project, "libjava", "ios", "iphonesimulator", "Release") {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("jdk_gensrc")
}
