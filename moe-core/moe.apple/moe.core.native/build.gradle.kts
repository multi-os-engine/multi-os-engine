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
    outputs.dir(nativeContext.bootJdkDir)

    progress("Fetching boot JDK")
    setRawWorkDir(svm.mx)

    exec(
        "./mx",
        "-y", "--no-warning",
        "fetch-jdk",
        "--to", file(nativeContext.bootJdkDir).absolutePath,
        "--alias", nativeContext.bootJdkDirAlias,
        "labsjdk-ce-latest", "ce-25.0.1+8-jvmci-b01",
    )
}

nativeContext.graalDistTask = tasks.register<Script>("build_graal_dist") {
    dependsOn(nativeContext.bootJdkTask)
    inputs.dir(nativeContext.bootJdkDir)
    inputs.dir(svm.graal)
    outputs.dir(nativeContext.graalDist)

    setWorkDir("graalBuild")

    progress("Copying graal")
    rsync(file(svm.graal), getWorkDir())

    progress("Build graal dist")
    setWorkDir("graalBuild/vm/")
    exec("${svm.mx}/mx", "--java-home", file(nativeContext.bootJdkDirHome).absolutePath, "--env", "ce", "build")

    progress("Copy build distribution")
    exec("bash", "-c",
        "rsync -a --delete \$(${svm.mx}/mx --java-home ${file(nativeContext.bootJdkDirHome).absolutePath} --env ce graalvm-home)/ ${file(nativeContext.graalDist).absolutePath}/")
}

subprojects {
    afterEvaluate {
        if (tasks.findByName("clean") != null) return@afterEvaluate
        tasks.register<Delete>("clean") {
            delete(file("build"))
        }
    }
}
