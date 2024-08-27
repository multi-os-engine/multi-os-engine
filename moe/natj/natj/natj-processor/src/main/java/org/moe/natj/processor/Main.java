/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natj.processor;

import org.moe.natj.processor.cxx.CxxReifier;
import org.moe.natj.processor.cxx.visitors.CxxAnalyzer;
import org.moe.natj.processor.cxx.visitors.CxxClassVisitor;
import org.moe.natj.processor.cxx.visitors.CxxClassWriter;
import org.moe.natj.processor.cxx.visitors.CxxTemplateAnalyzer;
import org.apache.commons.io.FileUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/**
 * Main class.
 */
public class Main {

    /**
     * Entry point.
     *
     * @param args Program arguments
     */
    public static void main(String[] args) {
        Main main = new Main(new Config(args));
        main.process();
    }

    /**
     * Program configuration.
     */
    public final Config config;

    /**
     * Create a new Main instance.
     *
     * @param config Configuration
     */
    public Main(Config config) {
        if (config == null) {
            throw new NullPointerException();
        }
        this.config = config;
    }

    /**
     * Start processing.
     */
    private void process() {
        clearOutputDirectory();
        System.out.println("Collecting input classes");
        final Set<Path> classPaths = collectInputClasses();

        if (config.mode == Config.Mode.CXX) {
            processModeCxx(classPaths);
        } else {
            throw new IllegalStateException();
        }
    }

    /**
     * Process input in C++ mode.
     *
     * @param classPaths Class paths
     */
    private void processModeCxx(Set<Path> classPaths) {
        System.out.println("Reading input classes");
        final CxxAnalyzer analyzer = new CxxAnalyzer();
        final List<ClassReader> classReaders = readClassFilesAndAnalyze(classPaths, analyzer);
        specializeTemplateClasses(classReaders, analyzer);
        final HashMap<String, Integer> versionMap = new HashMap<>();
        classReaders.forEach(classReader -> {
            final String className = classReader.getClassName();
            final int bytecodeVersion = config.bytecodeVersion;
            if (bytecodeVersion == 0) {
                final short version = classReader.readShort(6);
                versionMap.put(className, (int) version);
            } else {
                versionMap.put(className, bytecodeVersion);
            }
        });
        analyzer.postProcess();

        System.out.println("Processing input classes");
        classReaders.forEach(classReader -> {
            final String className = classReader.getClassName();
            System.out.println("  Transforming " + className);

            // Process interface
            final CxxClassWriter cw = new CxxClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
            final CxxClassVisitor cpi = new CxxClassVisitor(cw, analyzer);
            classReader.accept(cpi, 0);

            // Write transformed class
            writeBytes(cw.toByteArray());
        });

        System.out.println("Generating runtime classes");
        final CxxReifier reifier = analyzer.getReifier(config);
        reifier.reify(versionMap).forEach(this::writeBytes);

        System.out.println("Generating native stubs");
        try {
            reifier.flushNativeStubBuilder(config.genCxxSource, config.genCxxHeader);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write native stubs", e);
        }
    }

    /**
     * Search for template classes and specialize them.
     *
     * @param classReaders Class readers
     * @param analyzer     C++ analyzer
     */
    private void specializeTemplateClasses(List<ClassReader> classReaders, CxxAnalyzer analyzer) {
        final CxxTemplateAnalyzer templateAnalyzer = new CxxTemplateAnalyzer(analyzer);
        System.out.println("Processing template classes");
        classReaders.forEach(templateAnalyzer::saveTemplateClass);
        classReaders.forEach(templateAnalyzer::collectTemplateReferences);
        Set<ClassReader> reifiedTemplates = templateAnalyzer.reifySpecializations();
        reifiedTemplates.forEach(classReader -> {
            writeBytes(classReader.b);
            analyzer.analyzeClass(classReader);
        });
        classReaders.addAll(reifiedTemplates);
    }

    /**
     * Write a class file into the output directory.
     *
     * @param bytes Class file bytes
     */
    private void writeBytes(byte[] bytes) {
        if (bytes == null) {
            return;
        }

        // Get class name
        final ClassReader reader = new ClassReader(bytes);
        final String className = reader.getClassName();

        System.out.println("  Writing " + className);

        // Resolve output path
        final Path path = Paths.get(className + ".class");
        final Path outputPath = config.output.resolve(path);

        // Prepare output directory
        prepareOutputDirectory(outputPath);

        // Write
        final OutputStream outputStream;
        try {
            outputStream = Files.newOutputStream(outputPath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create output stream for '" + outputPath + "'", e);
        }
        try {
            outputStream.write(bytes);
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to output stream for '" + outputPath + "'", e);
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                System.err.println("Failed to close output stream for '" + outputPath + "'");
                e.printStackTrace(System.err);
                System.exit(1);
            }
        }
    }

    /**
     * Prepare output directory.
     *
     * @param outputPath Output path to prepare the directory for
     */
    public static void prepareOutputDirectory(Path outputPath) {
        final File outputParent = outputPath.getParent().toFile();

        // Prepare output directory
        if (!outputParent.exists() && !outputParent.mkdirs()) {
            throw new RuntimeException("Failed to create directory '" + outputPath + "'");
        }
    }

    /**
     * Read the class files and pass them to the C++ analyzer.
     *
     * @param classPaths Class file paths
     * @param analyzer   C++ analyzer
     * @return List of ClassReaders
     */
    private List<ClassReader> readClassFilesAndAnalyze(Set<Path> classPaths, CxxAnalyzer analyzer) {
        final List<ClassReader> map = new ArrayList<>();
        classPaths.forEach(path -> {
            final Path relativePath = config.input.relativize(path);
            System.out.println("  Reading " + relativePath);

            final InputStream inputStream;
            try {
                inputStream = Files.newInputStream(path, StandardOpenOption.READ);
            } catch (IOException e) {
                throw new RuntimeException("Failed to create input stream for file '" + path + "'", e);
            }
            final ClassReader reader;
            try {
                reader = new ClassReader(inputStream);
            } catch (IOException e) {
                throw new RuntimeException("Failed to read class file '" + path + "'", e);
            }
            analyzer.analyzeClass(reader);
            map.add(reader);
        });
        return map;
    }

    /**
     * Clear the output directory.
     */
    private void clearOutputDirectory() {
        try {
            FileUtils.deleteDirectory(config.output.toFile());
        } catch (IOException e) {
            throw new RuntimeException("Failed to clear output directory", e);
        }
        if (config.genCxxSource != null) {
            final File file = config.genCxxSource.toFile();
            if (file.exists() && !file.delete()) {
                throw new RuntimeException("Failed to delete old generated C++ source file");
            }
        }
        if (config.genCxxHeader != null) {
            final File file = config.genCxxHeader.toFile();
            if (file.exists() && !file.delete()) {
                throw new RuntimeException("Failed to delete old generated C++ header file");
            }
        }
    }

    /**
     * Collect input classes.
     *
     * @return Set of class file paths
     */
    private Set<Path> collectInputClasses() {
        final Set<Path> classPaths = new HashSet<>();
        final SimpleFileVisitor<Path> fv = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (attrs.isRegularFile() && file.getFileName().toString().endsWith(".class")) {
                    classPaths.add(file);
                }
                return FileVisitResult.CONTINUE;
            }
        };
        try {
            Files.walkFileTree(config.input, fv);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classPaths;
    }
}
