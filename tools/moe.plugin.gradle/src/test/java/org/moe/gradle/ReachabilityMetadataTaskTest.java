package org.moe.gradle;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;
import org.moe.gradle.utils.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReachabilityMetadataTaskTest extends AbstractPluginTest {

    @Test
    public void testTasksAreRegistered() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("tasks", "--all", "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        assertTrue(result.getOutput().contains("moeReachabilityMetadataDownload"));
        assertTrue(result.getOutput().contains("moeMainDebugReachabilityMetadataResolve"));
        assertTrue(result.getOutput().contains("moeMainReleaseReachabilityMetadataResolve"));
        assertEquals(result.task(":tasks").getOutcome(), SUCCESS);
    }

    @Test
    public void testResolveAgainstLocalZip() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");

        // Fixture repository covering com.example:lib 1.0.0.
        File repo = testProjectDir.newFolder("fixture-repo");
        File schemasDir = new File(repo, "schemas");
        assertTrue(schemasDir.mkdirs());
        writeFile(new File(schemasDir, "library-and-framework-list-schema-v1.0.0.json"), "{}");
        writeFile(new File(schemasDir, "metadata-library-index-schema-v2.1.0.json"), "{}");
        File artifactDir = new File(repo, "com.example/lib");
        assertTrue(artifactDir.mkdirs());
        writeFile(new File(artifactDir, "index.json"),
                "[{\"latest\": true, \"metadata-version\": \"1.0.0\", \"tested-versions\": [\"1.0.0\"]}]");
        File configDir = new File(artifactDir, "1.0.0");
        assertTrue(configDir.mkdirs());
        writeFile(new File(configDir, "reachability-metadata.json"),
                "{\"reflection\":[{\"type\":\"com.example.Foo\"}]}");

        File repoZip = new File(testProjectDir.getRoot(), "fixture-repo.zip");
        zipDirectory(repo, repoZip);

        // A flat-dir repo provides the matching artifact without network access.
        File libs = testProjectDir.newFolder("libs");
        writeFile(new File(libs, "lib-1.0.0.jar"), "");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}\n" +
                "repositories {\n" +
                "    flatDir { dirs 'libs' }\n" +
                "}\n" +
                "dependencies {\n" +
                "    implementation 'com.example:lib:1.0.0'\n" +
                "}\n" +
                "moe {\n" +
                "    metadataRepository {\n" +
                "        uri = file('fixture-repo.zip')\n" +
                "        excludedModules = ['com.other:excluded']\n" +
                "    }\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("moeMainDebugReachabilityMetadataResolve",
                        "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        assertEquals(result.task(":moeReachabilityMetadataDownload").getOutcome(), SUCCESS);
        assertEquals(result.task(":moeMainDebugReachabilityMetadataResolve").getOutcome(), SUCCESS);
        assertTrue(result.getOutput().contains("Using reachability metadata for com.example:lib (1.0.0)"));
        File listFile = new File(testProjectDir.getRoot(),
                "build/moe/main/reachability-metadata/debug/matched-directories.txt");
        assertTrue(listFile.isFile());
        String matched = FileUtils.read(listFile).trim();
        assertTrue(matched.endsWith(
                "build/moe/graalvm-reachability-metadata/repository/com.example/lib/1.0.0"));
        assertTrue(new File(matched, "reachability-metadata.json").isFile());
    }

    @Test
    public void testDisabledResolveProducesNoConfigs() throws IOException {
        File buildFile = testProjectDir.newFile("build.gradle");

        // @formatter:off
        String buildFileContent = "plugins {\n" +
                "    id 'java'\n" +
                "    id 'moe'\n" +
                "}\n" +
                "moe {\n" +
                "    metadataRepository {\n" +
                "        enabled = false\n" +
                "    }\n" +
                "}";
        // @formatter:on
        writeFile(buildFile, buildFileContent);

        BuildResult result = GradleRunner.create()
                .withProjectDir(testProjectDir.getRoot())
                .withArguments("moeMainDebugReachabilityMetadataResolve",
                        "-Pmoe.sdk.localbuild=" + getSdkLocalbuild(), "-s")
                .withPluginClasspath(getPluginClasspath())
                .build();

        assertEquals(result.task(":moeMainDebugReachabilityMetadataResolve").getOutcome(), SUCCESS);
        File listFile = new File(testProjectDir.getRoot(),
                "build/moe/main/reachability-metadata/debug/matched-directories.txt");
        assertTrue(listFile.isFile());
        assertEquals("", FileUtils.read(listFile).trim());
    }

    private static void zipDirectory(File sourceDir, File zipFile) throws IOException {
        java.nio.file.Path root = sourceDir.toPath();
        try (java.util.zip.ZipOutputStream out =
                     new java.util.zip.ZipOutputStream(java.nio.file.Files.newOutputStream(zipFile.toPath()))) {
            java.util.List<java.nio.file.Path> files;
            try (java.util.stream.Stream<java.nio.file.Path> walk = java.nio.file.Files.walk(root)) {
                files = walk.filter(java.nio.file.Files::isRegularFile).collect(java.util.stream.Collectors.toList());
            }
            for (java.nio.file.Path file : files) {
                out.putNextEntry(new java.util.zip.ZipEntry(root.relativize(file).toString()));
                java.nio.file.Files.copy(file, out);
                out.closeEntry();
            }
        }
    }
}
