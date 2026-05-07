fun createTask(configuration: String): TaskProvider<Exec> {
    return tasks.register<Exec>("build_natj_${configuration}_linux") {
        inputs.dir("../src/")
        outputs.file("build/$configuration/libnatj.so")
        dependsOn(":prebuild_libffi_linux")

        environment("MOE_PREBUILTS_DIR", file("../../prebuilts").absolutePath)
        environment("BUILD_DIR", layout.buildDirectory.get().asFile.absolutePath)

        executable = "sh"
        args("build_linux.sh")
        args(configuration)
    }
}

val releaseTask = createTask("Release")
val debugTask = createTask("Debug")

// Create build task
tasks.register("build") {
    dependsOn(releaseTask)
    dependsOn(debugTask)
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}
