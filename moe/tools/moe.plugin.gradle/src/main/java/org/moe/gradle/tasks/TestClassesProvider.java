/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestClassesProvider extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_CLASS_LIST_FILE = "classListFile";

    @Nullable
    private Set<Object> inputFiles;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getInputFiles() {
        return getProject().files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES));
    }

    @IgnoreUnused
    public void setInputFiles(@Nullable Collection<Object> inputFiles) {
        this.inputFiles = inputFiles == null ? null : new HashSet<>(inputFiles);
    }

    @Nullable
    private Object classListFile;

    @OutputFile
    @NotNull
    public File getClassListFile() {
        return getProject().file(getOrConvention(classListFile, CONVENTION_CLASS_LIST_FILE));
    }

    @IgnoreUnused
    public void setClassListFile(@Nullable Object classListFile) {
        this.classListFile = classListFile;
    }

    @Override
    protected void run() {
        // Reset output
        FileUtils.write(getClassListFile(), "");

        // Create class map
        ClassMap classMap = new ClassMap();

        FileUtils.classAndJarInputIterator(getInputFiles(), inputStream -> {
            ClassTestAnnotationFinder indexer = new ClassTestAnnotationFinder(inputStream);
            indexer.index(classMap);
        });

        classMap.resolve(getClassListFile());
    }

    /**
     * ClassTestAnnotationFinder class is a class visitor class and looks for any information on
     * whether this class contains junit tests or not.
     */
    private class ClassTestAnnotationFinder extends ClassVisitor {

        /**
         * Input stream to read the class data from.
         */
        private final InputStream inputStream;

        /**
         * Boolean indicating whether this class contains junit tests.
         */
        private boolean hasFoundTestIndication = false;

        /**
         * Name of the parsed class.
         */
        private String className;

        /**
         * Name of the parsed class' superclass.
         */
        private String superName;

        /**
         * boolean indicating whether a class can be instantiated or not.
         */
        private boolean isInstantiatable;

        /**
         * Creates a new ClassTestAnnotationFinder instance.
         *
         * @param inputStream input stream to read class from
         */
        ClassTestAnnotationFinder(InputStream inputStream) {
            super(Opcodes.ASM9);
            this.inputStream = inputStream;
        }

        /**
         * Indexes the class.
         *
         * @param map ClassMap to add information to
         */
        public void index(ClassMap map) {
            ClassReader reader;
            try {
                reader = new ClassReader(inputStream);
            } catch (IOException e) {
                throw new GradleException("an IOException occurred", e);
            }
            reader.accept(this, 0);
            if (className.startsWith("org/junit/") || className.startsWith("junit/")) {
                return;
            }
            ClassRep rep = map.add(className, superName, isInstantiatable);
            if (hasFoundTestIndication) {
                rep.testCase = ClassRep.IS_TEST;
            }
        }

        /**
         * Sets the hasFoundTestIndication to true.
         */
        public void setFoundTestIndication() {
            hasFoundTestIndication = true;
            getProject().getLogger().debug("----------X found an indicator");
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
            if (this.className != null || this.superName != null) {
                throw new GradleException("Didn't really prepare for this case, please report!");
            }
            this.className = name;
            this.superName = superName;
            this.isInstantiatable = (access & Opcodes.ACC_ABSTRACT) == 0 && (access & Opcodes.ACC_INTERFACE) == 0;
            getProject().getLogger().debug(name + " from " + superName + " (" + this.isInstantiatable + ")");
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String desc, String sign, String[] exceptions) {
            if (hasFoundTestIndication) {
                return null;
            }
            getProject().getLogger().debug("    " + name + " - " + desc);
            return new MethodTestAnnotationFinder(this);
        }
    }

    /**
     * List of known junit 4 annotations.
     */
    private static final List<String> annotationClasses = new ArrayList<>();

    static {
        annotationClasses.add("Lorg/junit/Before;");
        annotationClasses.add("Lorg/junit/BeforeClass;");
        annotationClasses.add("Lorg/junit/Ignore;");
        annotationClasses.add("Lorg/junit/AfterClass;");
        annotationClasses.add("Lorg/junit/After;");
        annotationClasses.add("Lorg/junit/Test;");
    }

    /**
     * MethodTestAnnotationFinder class is a method visitor class and looks for junit annotations on methods.
     */
    private class MethodTestAnnotationFinder extends MethodVisitor {

        /**
         * Parent visitor of this method visitor.
         */
        private final ClassTestAnnotationFinder classVisitor;

        /**
         * Creates a new MethodTestAnnotationFinder instance.
         *
         * @param classVisitor parent visitor
         */
        MethodTestAnnotationFinder(ClassTestAnnotationFinder classVisitor) {
            super(Opcodes.ASM9);
            this.classVisitor = classVisitor;
        }

        @Override
        public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
            getProject().getLogger().debug("        " + desc);
            if (annotationClasses.contains(desc)) {
                classVisitor.setFoundTestIndication();
            }
            return null;
        }
    }

    /**
     * ClassRep contains information about a class excluding it's name. Instances of class are used
     * as the values in ClassMap.
     */
    private class ClassRep {

        /**
         * Undefined state constant.
         */
        private static final int UNDEFINED = -1;

        /**
         * Not a test state constant.
         */
        private static final int NOT_TEST = 0;

        /**
         * Is a test state constant.
         */
        private static final int IS_TEST = 1;

        /**
         * Name of the parent class.
         */
        private final String parentName;

        /**
         * Instantiatable information.
         */
        private final boolean isInstantiatable;

        /**
         * Class' test state.
         */
        private int testCase = UNDEFINED;

        /**
         * Creates a new ClassRep instance.
         *
         * @param parentName       parent class' name
         * @param isInstantiatable instantiatable information
         */
        private ClassRep(String parentName, boolean isInstantiatable) {
            this.parentName = parentName;
            this.isInstantiatable = isInstantiatable;
        }
    }

    /**
     * ClassMap class resolves a collection of classes, checks which class is somehow inherited
     * from junit.framework.TestCase.
     */
    private class ClassMap {

        /**
         * Map containing the classes, key: class name, value: class representation
         */
        private final Map<String, ClassRep> map = new HashMap<>();

        /**
         * Add a class to this map.
         *
         * @param name             name of the class
         * @param superName        name oth the superclass
         * @param isInstantiatable instantiatable information
         * @return a newly created ClassRep for the specified class
         */
        private ClassRep add(String name, String superName, boolean isInstantiatable) {
            getProject().getLogger().debug("Creating entry: " + name + ", " + superName + ", " + isInstantiatable);
            ClassRep rep = new ClassRep(superName, isInstantiatable);
            map.put(name, rep);
            return rep;
        }

        /**
         * Resolve all classes in this map and write classes onto the output.
         *
         * @param output output to write to
         */
        private void resolve(File output) {
            StringBuilder builder = new StringBuilder();
            map.entrySet().forEach(it -> {
                getProject().getLogger().debug("@resolving: " + it.getKey());
                switch (resolveClass(it.getValue())) {
                    case ClassRep.IS_TEST:
                        getProject().getLogger().debug("+ " + it.getKey());
                        if (it.getValue().isInstantiatable) {
                            builder.append(it.getKey().replaceAll("/", ".")).append("\n");
                        }
                        break;
                    case ClassRep.NOT_TEST:
                        getProject().getLogger().debug("- " + it.getKey());
                        // It is not a TestCase
                        break;
                    default:
                        throw new GradleException("Illegal value in testCase (" + it.getValue().testCase + ")");
                }
            });
            FileUtils.write(output, builder.toString());
        }

        /**
         * Check whether a class is inherited from TestCase.
         *
         * @param rep class representation to check
         * @return resolved state's value
         */
        private int resolveClass(ClassRep rep) {
            // It if is set, return it
            if (rep.testCase != ClassRep.UNDEFINED) {
                return rep.testCase;
            }

            // If parent is not found, default to NO
            if (rep.parentName == null || rep.parentName.length() == 0) {
                rep.testCase = ClassRep.NOT_TEST;
                return rep.testCase;
            }

            // Check is from TestCase
            if ("junit/framework/TestCase".equals(rep.parentName)) {
                rep.testCase = ClassRep.IS_TEST;
                return rep.testCase;
            }

            // Inherit from parent class
            ClassRep parent = map.get(rep.parentName);
            if (parent == null) {
                rep.testCase = ClassRep.NOT_TEST;
            } else {
                rep.testCase = resolveClass(parent);
            }
            return rep.testCase;
        }
    }

    private ProGuard proGuardTaskDep;

    @NotNull
    @IgnoreUnused
    @Internal
    public ProGuard getProGuardTaskDep() {
        return Require.nonNull(proGuardTaskDep);
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet, final @NotNull Mode mode) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "test-provider", mode.name);

        // Create task
        setDescription("Generates classlist.txt file (sourceset: " + sourceSet.getName() + ", mode: " + mode.name + ").");

        // Add dependencies
        final ProGuard proguardTask = getMoePlugin().getTaskBy(ProGuard.class, sourceSet, mode);
        proGuardTaskDep = proguardTask;
        dependsOn(proguardTask);

        if (!SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName())
                && !SourceSet.TEST_SOURCE_SET_NAME.equals(sourceSet.getName())) {
            throw new GradleException("Unsupported SourceSet " + sourceSet.getName());
        }

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES, () -> Collections.singletonList(proguardTask.getOutJar()));
        addConvention(CONVENTION_CLASS_LIST_FILE, () -> resolvePathInBuildDir(out, "classlist.txt"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "TestClassesProvider.log"));
    }
}
