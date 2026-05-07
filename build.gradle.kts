tasks.register("clean") {
    dependsOn(gradle.includedBuilds.map { it.task(":cleanAll") })
}