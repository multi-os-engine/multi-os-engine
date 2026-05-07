import org.gradle.api.tasks.PathSensitivity
import org.moe.prebuilts.MOECoreNativeContext
import org.moe.prebuilts.Script
import org.moe.prebuilts.XcodeBuild

val svmOpenjdkPath = moeExternal.svm.openjdk
val nativeContext = parent!!.the<MOECoreNativeContext>()

tasks.register<Script>("jdk_gensrc") {
    dependsOn(nativeContext.bootJdkTask)

    val builtJdkDir = file("build/labsjdk")

    inputs.dir(nativeContext.bootJdkDirHome).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(svmOpenjdkPath).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file("add_ios_build_support.patch").withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.file("fix_memset_call.patch").withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir(builtJdkDir)

    setRawWorkDir(builtJdkDir)

    progress("Copy jdk")
    rsync(file(svmOpenjdkPath), workDir)

    progress("Configure jdk")

    exec("sh", "-c", "patch -p1 < ${rel("add_ios_build_support.patch")}")
    exec("sh", "-c", "patch -p1 < ${rel("fix_memset_call.patch")}")

    val jvmciVersion = "jvmci-25.0.1-b01"
    // For whatever reason setting "--with-boot-jdk" does not work
    env("JAVA_HOME", rel(nativeContext.bootJdkDirHome))
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
