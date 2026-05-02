import org.gradle.api.file.FileSystemOperations
import org.gradle.api.tasks.TaskProvider
import org.moe.prebuilts.BuildFilter
import org.moe.prebuilts.Script
import org.moe.prebuilts.XcodeBuild
import java.io.File
import javax.inject.Inject

plugins {
    id("base")
}

interface InjectedFsOps {
    @Inject
    fun getFs(): FileSystemOperations
}

val buildfilter = extensions.getByType<BuildFilter>()

val jdwpDestDir = file("build/jdwpBuild")
val baseCapPath = rootProject.file("../tools/moe.tools.substrate/src/main/resources/")

val parentExtra = parent!!.extra
@Suppress("UNCHECKED_CAST")
val graalDistTask = parentExtra["graalDistTask"] as TaskProvider<*>
val graalDist = parentExtra["graalDist"] as File

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
        // Kotlin lambdas in doLast capture the enclosing script class, which the
        // configuration cache cannot serialize. Groovy closures in the original
        // build had different capture semantics. Opt out of config cache here.
        notCompatibleWithConfigurationCache("doLast captures script-scope FileSystemOperations and File refs")
        val fsOps = project.objects.newInstance<InjectedFsOps>().getFs()

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

        doLast {
            val resultDir = buildPath.listFiles()!!.first { it.name.startsWith("SVM-") }
            fsOps.copy {
                from(resultDir) {
                    include("svmjdwp.o")
                    rename("svmjdwp.o", "svmjdwp_${arch}.o")
                }
                into(jdwpDestDir)
            }
        }
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
