/************************/
/** Build Script Setup **/
/************************/

// NOTE: This sample app is not included in any settings.gradle.kts and is
// never evaluated by Gradle. It uses the legacy moe-gradle plugin (1.3.+)
// hosted on jcenter (now defunct) and APIs removed in Gradle 7
// (compile, testCompile, sourceCompatibility/targetCompatibility as
// top-level assignments, tasks.testClasses); the file is preserved as
// documentation of the original Groovy form.

buildscript {
    repositories {
        @Suppress("DEPRECATION") jcenter()
        mavenLocal()
    }
    dependencies {
        // Multi-OS Engine plugin
        classpath("org.multi-os-engine:moe-gradle:1.3.+")
    }
}

/*******************/
/** Project Setup **/
/*******************/

// Apply plugins
apply(plugin = "moe")
apply(plugin = "eclipse")

// Set source and target to Java 8
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
    named("test") {
        java {
            srcDir(file("../../natj-ctests/src/test/java"))
            srcDir(file("../../natj-objctests/src/test/java"))
        }
    }
}

val copyCTestResources = tasks.register<Copy>("copyCTestResources") {
    from(file("../../natj-ctests/src/test/resources"))
    into("build/external_resources/ctests")
}
tasks.named("testClasses") { dependsOn(copyCTestResources) }

val copyObjCTestResources = tasks.register<Copy>("copyObjCTestResources") {
    from(file("../../natj-objctests/src/test/resources"))
    into("build/external_resources/objctests")
}
tasks.named("testClasses") { dependsOn(copyObjCTestResources) }

val compilePrerequisites = tasks.register<Exec>("compilePrerequisites") {
    workingDir = file("../../")
    commandLine(
        "./gradlew", ":natj-ctests:testClasses", ":natj-cxxtests:processCxxTests",
        ":natj-objctests:testClasses",
    )
}
tasks.named("testClasses") { dependsOn(compilePrerequisites) }

// Exclude all files from Gradle's test runner
tasks.test { exclude("**") }

// Setup MOE
configure<groovy.lang.GroovyObject>(extensions.getByName("moe")) {
    @Suppress("UNCHECKED_CAST")
    val moe = this
    // Legacy DSL — preserved as-is for documentation; would not compile against
    // the modern moe-gradle plugin even if jcenter were reachable.
}

// Set dependencies
dependencies {
    // Compile with 'jar' files in the project's 'lib' directory
    "compile"(fileTree(mapOf("dir" to "lib", "include" to "*.jar")))
    "testCompile"(files("../../natj-cxxtests/build/classes/processedCxxTest"))
}

// Setup Eclipse
configure<org.gradle.plugins.ide.eclipse.model.EclipseModel>(extensions.getByName("eclipse")) {
    project {
        natures("org.multi-os-engine.project")
    }
}
