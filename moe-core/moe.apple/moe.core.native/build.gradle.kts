import org.gradle.api.tasks.PathSensitivity
import org.moe.prebuilts.MOECoreNativeContext
import org.moe.prebuilts.Script

plugins {
    id("base")
}

val svm = moeExternal.svm

val nativeContext = extensions.create("moeCoreNative", MOECoreNativeContext::class.java).apply {
    bootJdkDir = file("build/bootJDK")
    bootJdkDirAlias = "jdk25"
    bootJdkDirHome = file("$bootJdkDir/$bootJdkDirAlias/Contents/Home")
    graalDist = file("build/graalDist")
}

nativeContext.bootJdkTask = tasks.register<Script>("fetch_boot_jdk") {
    inputs.dir(svm.mx).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir(nativeContext.bootJdkDir)

    progress("Fetching boot JDK")
    setRawWorkDir(file(svm.mx))

    exec(
        "./mx",
        "-y", "--no-warning",
        "fetch-jdk",
        "--to", rel(nativeContext.bootJdkDir),
        "--alias", nativeContext.bootJdkDirAlias,
        "labsjdk-ce-latest", "ce-25.0.1+8-jvmci-b01",
    )
}

nativeContext.graalDistTask = tasks.register<Script>("build_graal_dist") {
    dependsOn(nativeContext.bootJdkTask)
    inputs.dir(nativeContext.bootJdkDir).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(svm.mx).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(svm.graal).withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir(nativeContext.graalDist)
    localState.register(layout.buildDirectory.dir("graalBuild"))

    setWorkDir("graalBuild")

    progress("Copying graal")
    rsync(file(svm.graal), getWorkDir())

    progress("Build graal dist")
    setWorkDir("graalBuild/vm/")
    exec("${rel(svm.mx)}/mx", "--java-home", rel(nativeContext.bootJdkDirHome), "--env", "ce", "build")

    progress("Copy build distribution")
    exec("bash", "-c",
        "rsync -a --delete \$(${rel(svm.mx)}/mx --java-home ${rel(nativeContext.bootJdkDirHome)} --env ce graalvm-home)/ ${rel(nativeContext.graalDist)}/")
}

subprojects {
    afterEvaluate {
        if (tasks.findByName("clean") != null) return@afterEvaluate
        tasks.register<Delete>("clean") {
            delete(file("build"))
        }
    }
}
