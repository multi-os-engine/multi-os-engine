import org.moe.prebuilts.BuildFilter
import org.moe.prebuilts.Script

plugins {
    id("base")
}

@Suppress("UNCHECKED_CAST")
val externalSvm: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["svm"] as Map<String, Any?>
val svmGraalPath = externalSvm["graal"] as String
val svmOpenjdkPath = externalSvm["openjdk"] as String
val svmMxPath = externalSvm["mx"] as String

val bootJdkDir = file("build/bootJDK")
val bootJdkDirAlias = "jdk25"
val bootJdkDirHome = file("$bootJdkDir/$bootJdkDirAlias/Contents/Home")
val graalDist = file("build/graalDist")

val bootJdkTask = tasks.register<Script>("fetch_boot_jdk") {
    outputs.dir(bootJdkDir)

    progress("Fetching boot JDK")
    setRawWorkDir(svmMxPath)

    exec(
        "./mx",
        "-y", "--no-warning",
        "fetch-jdk",
        "--to", file(bootJdkDir).absolutePath,
        "--alias", bootJdkDirAlias,
        "labsjdk-ce-latest", "ce-25.0.1+8-jvmci-b01",
    )
}

val graalDistTask = tasks.register<Script>("build_graal_dist") {
    dependsOn(bootJdkTask)
    inputs.dir(bootJdkDir)
    inputs.dir(svmGraalPath)
    outputs.dir(graalDist)

    setWorkDir("graalBuild")

    progress("Copying graal")
    rsync(file(svmGraalPath), getWorkDir())

    progress("Build graal dist")
    setWorkDir("graalBuild/vm/")
    exec("$svmMxPath/mx", "--java-home", file(bootJdkDirHome).absolutePath, "--env", "ce", "build")

    progress("Copy build distribution")
    exec("bash", "-c",
        "rsync -a --delete \$($svmMxPath/mx --java-home ${file(bootJdkDirHome).absolutePath} --env ce graalvm-home)/ ${file(graalDist).absolutePath}/")
}

// Expose for subprojects (svm.jdwp reads bootJdkTask, bootJdkDirHome, graalDistTask, graalDist)
extra["bootJdkDir"] = bootJdkDir
extra["bootJdkDirAlias"] = bootJdkDirAlias
extra["bootJdkDirHome"] = bootJdkDirHome
extra["bootJdkTask"] = bootJdkTask
extra["graalDist"] = graalDist
extra["graalDistTask"] = graalDistTask

subprojects {
    val buildfilter = extensions.create("buildfilter", BuildFilter::class.java)

    if (rootProject.hasProperty("moe.buildfilter.ios.config")) {
        buildfilter.ios.config = rootProject.property("moe.buildfilter.ios.config").toString()
    }
    if (rootProject.hasProperty("moe.buildfilter.ios.sdk")) {
        buildfilter.ios.sdk = rootProject.property("moe.buildfilter.ios.sdk").toString()
    }
    if (rootProject.hasProperty("moe.buildfilter.ios.archs")) {
        buildfilter.ios.archs = rootProject.property("moe.buildfilter.ios.archs").toString()
    }
    if (buildfilter.ios.archs != null && buildfilter.ios.sdk == null) {
        throw GradleException("Specifying 'moe.buildfilter.ios.archs' requires 'moe.buildfilter.ios.sdk'")
    }
    if (rootProject.hasProperty("moe.buildfilter.macos.config")) {
        buildfilter.macos.config = rootProject.property("moe.buildfilter.macos.config").toString()
    }

    afterEvaluate {
        if (tasks.findByName("clean") != null) return@afterEvaluate
        tasks.register<Delete>("clean") {
            delete(file("build"))
        }
    }
}
