plugins {
    id("java-gradle-plugin")
}

gradlePlugin {
    plugins {
        create("buildTools") {
            id = "org.moe.buildtools"
            implementationClass = "org.moe.prebuilts.BuildTools"
        }
        create("javaConventions") {
            id = "org.moe.java-conventions"
            implementationClass = "org.moe.prebuilts.JavaConventions"
        }
    }
}
