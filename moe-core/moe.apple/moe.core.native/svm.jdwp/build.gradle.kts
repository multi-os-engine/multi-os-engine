import org.gradle.api.tasks.TaskProvider
import org.moe.prebuilts.MOECoreNativeContext
import org.moe.prebuilts.Script
import org.moe.prebuilts.Script.FirstMatchingSubdirFile
import org.moe.prebuilts.XcodeBuild

plugins {
    id("base")
}

val jdwpDestDir = file("build/jdwpBuild")
val baseCapPath = rootProject.file("../tools/moe.tools.substrate/src/main/resources/")

val nativeContext = parent!!.the<MOECoreNativeContext>()
val graalDistTask = nativeContext.graalDistTask
val graalDist = nativeContext.graalDist

val graalDeps: Map<String, Any> = mapOf(
    "projects" to listOf(
        ":moe.apple:moe.core.native:svm.graal@libjvm",
        ":moe.apple:moe.core.native:svm.openjdk@libjava",
    ),
)

fun createJDWPJarBuild(arch: String): TaskProvider<Script> {
    val platform = if (arch == "arm64") "IOS_AARCH64" else "IOS_AMD64"
    val cAbi = if (arch == "arm64") "MAC_OS_AARCH_64" else "SYS_V"
    val buildPath = file("build/jdwpBuild$arch")
    return tasks.register<Script>("build_jdwp_${arch}_jar") {
        dependsOn(graalDistTask)
        inputs.dir(graalDist)
        inputs.dir(baseCapPath)
        outputs.file(file("${jdwpDestDir}/svmjdwp_${arch}.o"))

        setRawWorkDir("$buildPath")
        exec("rm", "-rf", file(getWorkDir()).absolutePath)

        mkdir(file(getWorkDir()).absolutePath)

        exec(
            file("$graalDist/bin/native-image").absolutePath,
            "-H:+SharedLibrary",
            "-H:-SpawnIsolates",
            "-H:PageSize=16384",
            "-H:+ExitAfterRelocatableImageWrite",
            "-H:TempDirectory=${getWorkDir()}",
            "-H:+UseCAPCache",
            "-H:CAPCacheDir=${file("$baseCapPath/cap_$arch/")}",
            "--no-server",
            "-Dsvm.targetName=iOS",
            "-Dsvm.targetArch=${arch}",
            "-Dsvm.platform=org.graalvm.nativeimage.Platform\$$platform",
            "-Djdk.internal.foreign.CABI=$cAbi",

            "--no-fallback",
            "-H:+UnlockExperimentalVMOptions",
            "-H:+AssertInitializationSpecifiedForAllClasses",
            "-H:+EnforceMaxRuntimeCompileMethods",
            "-H:+VerifyRuntimeCompilationFrameStates",
            "-H:+GuaranteeSubstrateTypesLinked",
            "-H:-UnlockExperimentalVMOptions",
            "--link-at-build-time",
            "--shared",
            "-H:+UnlockExperimentalVMOptions",
            "-H:+IncludeDebugHelperMethods",
            "-H:-DeleteLocalSymbols",
            "-H:+PreserveFramePointer",
            "--features=com.oracle.svm.jdwp.server.ServerJDWPFeature",

            "--add-exports", "java.base/jdk.internal.misc=com.oracle.svm.jdwp.server",
            "--add-exports", "jdk.internal.vm.ci/jdk.vm.ci.meta=com.oracle.svm.jdwp.server",

            "-o", "svmjdwp",
            "--module-path", file("$graalDist/lib/graalvm/svm-jdwp-server.jar").absolutePath,
        )

        copyFile(
            FirstMatchingSubdirFile(buildPath, "SVM-", "svmjdwp.o"),
            file("$jdwpDestDir/svmjdwp_${arch}.o")
        )
    }
}

val arm64Task = createJDWPJarBuild("arm64")
val x86_64Task = createJDWPJarBuild("x86_64")


tasks.register("build_jdwp_jar") {
    dependsOn(arm64Task)
    dependsOn(x86_64Task)
}


XcodeBuild.registerTask(project, "svmjdwp", "ios", "iphoneos", "Debug", graalDeps) {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("build_jdwp_jar")
}
XcodeBuild.registerTask(project, "svmjdwp", "ios", "iphoneos", "Release", graalDeps) {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("build_jdwp_jar")
}
XcodeBuild.registerTask(project, "svmjdwp", "ios", "iphonesimulator", "Debug", graalDeps) {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("build_jdwp_jar")
}
XcodeBuild.registerTask(project, "svmjdwp", "ios", "iphonesimulator", "Release", graalDeps) {
    cond_buildopt(buildfilter.ios.archs, "ARCHS")
    cond_buildopt(buildfilter.ios.archs != null, "ONLY_ACTIVE_ARCH", "YES")
    dependsOn("build_jdwp_jar")
}

tasks.build {
    val configOverride = buildfilter.ios.config
    val configs = if (configOverride != null) listOf(configOverride) else listOf("Release")

    val sdkOverride = buildfilter.ios.sdk
    val sdks = if (sdkOverride != null) listOf(sdkOverride) else listOf("iphoneos", "iphonesimulator")

    for (config in configs) {
        for (sdk in sdks) {
            dependsOn("build_svmjdwp_ios_${sdk}_${config.lowercase()}")
        }
    }
}
