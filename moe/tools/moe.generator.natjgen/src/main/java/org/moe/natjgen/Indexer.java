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

package org.moe.natjgen;

import org.clang.c.clang;
import org.clang.enums.CXCursorKind;
import org.clang.enums.CXIdxEntityKind;
import org.clang.enums.CXIndexOptFlags;
import org.clang.enums.CXTranslationUnit_Flags;
import org.clang.opaque.CXTranslationUnit;
import org.clang.struct.CXCursor;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXSourceLocation;
import org.clang.struct.IndexerCallbacks;
import org.clang.struct.IndexerCallbacks.Function_indexDeclaration;
import org.clang.util.StdHeaders;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.text.edits.TextEditGroup;
import org.moe.common.developer.NativeSDKUtil;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natjgen.Configuration.Action;
import org.moe.natjgen.Configuration.Condition;
import org.moe.natjgen.Configuration.Unit;
import org.moe.natjgen.Configuration.UnitRule;
import org.moe.natjgen.helper.MOEJavaProject;
import org.moe.natjgen.util.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import static org.clang.c.clang.*;
import static org.moe.natjgen.Configuration.Unit.C_FUNCTION_TYPE;
import static org.moe.natjgen.Configuration.Unit.HANDLING_DISABLED;

public class Indexer {

    /**
     * Logger for this class
     */
    private static final Logger LOG = LoggerFactory.getLogger(Indexer.class);

    /**
     * Project in which which the source folder is
     */
    private final MOEJavaProject project;

    /**
     * The source folder in which the compilation units should be placed
     */
    private String pkgroot;

    /**
     * Generator configuration
     */
    private Configuration configuration;

    /**
     * Translation unit
     */
    private CXTranslationUnit tu;

    /**
     * Shared generator
     */
    private Generator generator;

    /**
     * Shared includeManager
     */
    private IncludeManager includeManager;

    /**
     * Text editing group
     */
    private final TextEditGroup editGroup;

    /**
     * Boolean indicating whether we tried to cache the Xcode path or not
     */
    private boolean hasCachedXcodePath = false;

    /**
     * Cached path of Xcode
     */
    private String cachedXcodePath = null;

    /**
     * Indexer statistics
     */
    final Statistics stats = new Statistics();

    /**
     * Aliases for {@link CStructManager}s
     */
    final ArrayList<Generator.Alias> structAliases = new ArrayList<Generator.Alias>();

    /**
     * Aliases for {@link CEnumManager}s
     */
    final ArrayList<Generator.Alias> enumAliases = new ArrayList<Generator.Alias>();

    /**
     * Map for caching category-class relationships
     */
    final HashMap<String, String> categoryClassMap = new HashMap<String, String>(512);

    /**
     * Array for caching categories unavailable due to unavailable class
     */
    final ArrayList<String> unavailableCategories = new ArrayList<String>(128);

    final TypeLogger tStats = new TypeLogger();

    private TypeConfiguration inputTypeConfiguration;

    public TypeConfiguration getInputTypeConfiguration() {
        return inputTypeConfiguration;
    }

    private TypeConfiguration outputTypeConfiguration;

    private IModelEditor modelEditor;

    public TypeConfiguration getOutputTypeConfiguration() {
        return outputTypeConfiguration;
    }

    /**
     * Returns the includeManager associated with the indexer
     *
     * @return includeManager
     */
    public IncludeManager getIncludeManager() {
        return includeManager;
    }

    /**
     * Returns the project associated with the indexer
     *
     * @return project
     */
    public MOEJavaProject getProject() {
        return project;
    }

    /**
     * Returns the package root associated with the indexer
     *
     * @return package root
     */
    public String getPkgroot() {
        return pkgroot;
    }

    /**
     * Returns the generator associated with the indexer
     *
     * @return generator
     */
    public Generator getGenerator() {
        return generator;
    }

    /**
     * Returns the indexer's configuration
     *
     * @return configuration
     */
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Returns the {@link Indexer}'s statistics
     *
     * @return {@link Statistics}
     */
    public Statistics getStats() {
        return stats;
    }

    /**
     * Create a new indexer
     *
     * @param project in which which the source folder is
     * @param root    source folder in which the compilation units should be placed
     * @throws IOException
     * @throws CoreException
     */
    public Indexer(MOEJavaProject project, String root) throws IOException, CoreException {
        this(project, Configuration.createFromFile(root));
    }

    /**
     * Create a new indexer
     *
     * @param project       in which which the source folder is
     * @param configuration configuration
     * @throws IOException
     * @throws CoreException
     */
    public Indexer(MOEJavaProject project, Configuration configuration) throws IOException, CoreException {
        this.project = project;
        this.editGroup = new TextEditGroup("Edit Group of " + this.project.getName());
        this.configuration = configuration;
        configuration.setVariable(Configuration.PROJECT_VARIABLE, project.getLocation().toOSString());

        String logOutput = System.getProperty("moe.natjgen.log.output");
        if (logOutput != null && !logOutput.isEmpty()) {
            if (logOutput.startsWith("/")) {
                configuration.setLoggingPath(logOutput);
            } else {
                configuration.setLoggingPath("${PROJECT}/" + logOutput);
            }
        }

        ArrayList<ValidationEntry> problems = configuration.validate();
        if (problems != null && ValidationEntry.containsErrors(problems)) {
            throw new CoreException(ValidationEntry.createMultiStatus(problems, true));
        }

        String path = configuration.getOutputPackageFragmentRootPath();

        this.pkgroot = project.getLocation().toOSString() + File.separator + path;

        if (this.pkgroot == null) {
            throw new IOException(
                    "Could not find package root at path " + configuration.getOutputPackageFragmentRootPath());
        }
    }

    /**
     * Generate classes
     *
     * @param monitor
     * @throws IOException
     */
    public boolean generate(IProgressMonitor monitor) throws IOException {
        final boolean isTestRun = "true".equalsIgnoreCase(System.getProperty("moe.natjgen.testrun", "false"));
        configuration.setVariable(Configuration.DATETIME_VARIABLE,
                new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date()));
        generator = new Generator();

        if (configuration.getUseIncludedStandardHeaders()) {
            final UnitRule rule = new UnitRule();
            rule.setFinal(true);
            rule.getConditions().add(new Condition(Condition.PATH_PREFIX, StdHeaders.getPath()));
            rule.getConditions().add(new Condition(Condition.TYPE_MATCH, C_FUNCTION_TYPE));
            rule.getActions().add(new Action(Action.HANDLING_MODE, HANDLING_DISABLED));
            configuration.getUnitActionManager().getUnitRules().add(0, rule);
        }

        ArrayList<ValidationEntry> problems = configuration.validate();
        if (problems != null && ValidationEntry.containsErrors(problems)) {
            return false;
        }

        String file = getTempPathForContent(configuration.getSourceCode());
        if (file == null) {
            throw new IOException("Failed to create temp file for indexer!");
        }

        // Prepare type configurations
        inputTypeConfiguration = new TypeConfiguration();
        outputTypeConfiguration = new TypeConfiguration();
        String inputTCP = configuration.getDemangledInputTypeConfigurationPath();
        if (inputTCP != null) {
            inputTypeConfiguration.readFromFile(inputTCP);
            if (!configuration.isCleanOutputTypeConfiguration()) {
                outputTypeConfiguration.readFromFile(inputTCP);
            }
        }

        clang.clang_forceSetNoThreads();

        for (String arch : configuration.getArchs()) {
            String sdkPath = configuration.getDemangledSDKPath(arch);
            if (!(new File(sdkPath).exists())) {
                // Skip arch if doesn't exist
                LOG.info("Platform with arch at " + sdkPath + " could not be found, skipping");
                continue;
            }
            configuration.setVariable(Configuration.SDK_VARIABLE, configuration.getDemangledSDKPath(arch));

            if (modelEditor == null) {
                modelEditor = new ModelBuilder(this, configuration.getArchBitWidth(arch));
            } else {
                modelEditor = new ModelDowngrader(this, configuration.getArchBitWidth(arch));
            }
            modelEditor.preProcess();

            // Reset Type system
            Type.resetAll();

            // Setup
            VoidPtr index = clang_createIndex(0, 1);

            String[] args = configuration.getCMDLine(arch);
            LOG.debug("Clang options: " + Arrays.asList(args));
            tu = clang_parseTranslationUnit(index, file, args, args.length, null, 0,
                    CXTranslationUnit_Flags.SkipFunctionBodies | CXTranslationUnit_Flags.IncludeAttributedTypes);
            VoidPtr iaction = clang_IndexAction_create(index);

            // Create indexer callbacks
            IndexerCallbacks callbacks = new IndexerCallbacks();
            callbacks.setIndexDeclaration(new Function_indexDeclaration() {

                @Override
                public void call_indexDeclaration(VoidPtr arg0, CXIdxDeclInfo arg1) {
                    if (isTestRun) {
                        return;
                    }
                    indexDeclaration(arg1);
                }
            });

            includeManager = new IncludeManager();

            // Index
            LOG.debug("Indexing translation unit");
            int error = clang_indexTranslationUnit(iaction, null, callbacks, 64,
                    CXIndexOptFlags.CXIndexOpt_SuppressWarnings | CXIndexOptFlags.CXIndexOpt_SuppressRedundantRefs, tu);

            // Clean up
            clang_IndexAction_dispose(iaction);
            iaction = null;
            clang_disposeTranslationUnit(tu);
            tu = null;
            clang_disposeIndex(index);
            index = null;
            NatJ.disposeFunctionPtr(this);

            // Fail if TU failed
            if (error > 0) {
                throw new IOException("NatJGen failed with translation unit error " + error);
            }

            modelEditor.postProcess();
        }

        if (isTestRun) {
            return true;
        }

        // TODO: add better save support
        tStats.saveToFile(
                new File(System.getProperty("user.home"), "natjgen-typelog-" + (new Date()).toString() + ".csv"));

        generator.processCStructAliasing(structAliases);
        generator.processCEnumAliasing(enumAliases);

        // Generate classes
        LOG.debug("Generating classes");
        monitor = monitor == null ? new NullProgressMonitor() : monitor;
        generator.generate(monitor);

        // Write log file
        String logPath = configuration.getDemangledLoggingPath();
        if (logPath != null) {
            File f = new File(logPath);

            if (!f.getParentFile().exists() && !f.getParentFile().mkdirs()) {
                LOG.error("Failed to create directory at path: " + f.getParentFile());
            } else {
                stats.writeHTMLLogToFile(f.getAbsolutePath());
            }
        }

        // Write output type configuration
        String outputTCPath = configuration.getDemangledOutputTypeConfigurationPath();
        if (outputTCPath != null) {
            outputTypeConfiguration.writeToFile(outputTCPath);
        }

        return true;
    }

    /**
     * Get path to a temp file containing the given content
     *
     * @param content content to contain
     * @return path to the temp file
     */
    public static String getTempPathForContent(String content) {
        try {
            File temp = File.createTempFile("tempfile", ".m");
            FileOutputStream os = new FileOutputStream(temp);
            os.write(content.getBytes());
            os.close();
            return temp.getAbsolutePath();
        } catch (IOException e) {
            LOG.error("An error occured during writing the file.", e);
        }
        return null;
    }

    /**
     * Callback to the indexer
     *
     * @param decl currently indexed declaration
     */
    private int indexDeclaration(CXIdxDeclInfo decl) {
        try {
            indexDeclaration_internal(decl);
            return 0;
        } catch (Exception e) {
            CXSourceLocation location = decl.cursor().getCursorLocation();
            @SuppressWarnings("unchecked") Ptr<VoidPtr> file = (Ptr<VoidPtr>)PtrFactory
                    .newPointerPtr(Void.class, 2, 1, true, false);
            IntPtr ptr = PtrFactory.newIntArray(3);
            IntPtr line = ptr;
            IntPtr column = ptr.ofs(1);
            IntPtr offset = ptr.ofs(2);
            location.getExpansionLocation(file, line, column, offset);
            String filepath = clang_getFileName(file.get()).toString();
            LOG.error("Failed to index declaration at " + filepath + ":" + line.getValue() + ":" + column.getValue(),
                    e);
            return 1;
        }
    }

    /**
     * Actual callback to the indexer
     *
     * @param decl currently indexed declaration
     */
    private void indexDeclaration_internal(CXIdxDeclInfo decl) {
        // Ignore implicit declarations
        if (decl.isImplicit() != 0) {
            return;
        }

        // Index declaration
        switch (decl.entityInfo().kind()) {
        case CXIdxEntityKind.CXIdxEntity_ObjCClass:
            modelEditor.processObjCClass(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_ObjCCategory:
            modelEditor.processObjCCategory(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_ObjCProtocol:
            modelEditor.processObjCProtocol(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_ObjCClassMethod:
        case CXIdxEntityKind.CXIdxEntity_ObjCInstanceMethod:
            modelEditor.processObjCMethod(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_ObjCProperty:
            modelEditor.processObjCProperty(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Struct:
            modelEditor.processStruct(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Field:
            modelEditor.processField(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Enum:
            modelEditor.processEnum(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_EnumConstant:
            modelEditor.processEnumConstant(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Function:
            modelEditor.processFunction(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Variable:
            modelEditor.processVariable(decl);
            break;

        case CXIdxEntityKind.CXIdxEntity_Typedef:
            modelEditor.processTypedef(decl);
            break;
        }
    }

    /**
     * Get the proper Objective-C container
     *
     * @param decl declaration of the method
     */
    ObjCClassManager getObjCManagerForContainer(CXIdxDeclInfo decl) {
        CXCursor container = decl.semanticContainer().cursor();
        int container_kind = container.kind();
        if (container_kind == CXCursorKind.ObjCInterfaceDecl) {
            ObjCClassManager classManager = generator.getClass(container.toString());
            return classManager;

        } else if (container_kind == CXCursorKind.ObjCCategoryDecl) {
            // Get unit
            Unit unit = configuration.getUnit(decl);
            if (unit.handlingDisabled()) {
                return null;
            }

            // Get manager
            String categoryUSR = container.getCursorUSR().toString();
            String class_name = categoryClassMap.get(categoryUSR);
            if (class_name == null) {
                if (unavailableCategories.contains(categoryUSR)) {
                    return null;
                }
                LOG.error("Class name for category could not be found " + categoryUSR);
                return null;
            }
            ObjCClassManager cls_manager = generator.getClass(class_name);

            // Get external category manager when the method should not be
            // skipped but the container class is not generated
            if (!unit.handlingExternal() && cls_manager.isExternalUnit()) {
                // Add as external category

                // Use fully qualified name as the lookup key,
                // so the external categories for the same class from different frameworks won't
                // be incorrectly merged into a single file.
                String name_fq = Unit.packageName(unit.getPkg(), "category", class_name);
                ObjCExternalCategoryManager cat_manager = generator.getExternalCategory(name_fq);
                if (cat_manager == null) {
                    cat_manager = new ObjCExternalCategoryManager(this, name_fq, cls_manager);
                    cat_manager.setLibraryName(unit.getFramework());
                    cat_manager.setComment(ClangUtil.getComment(container, configuration.getPlatform()));
                    generator.put(name_fq, cat_manager);
                }
                return cat_manager;
            } else {
                return cls_manager;
            }

        } else if (container_kind == CXCursorKind.ObjCProtocolDecl) {
            ObjCProtocolManager protocolManager = generator.getProtocol(container.toString());
            return protocolManager;

        } else if (container_kind == CXCursorKind.ObjCImplementationDecl
                || container_kind == CXCursorKind.ObjCCategoryImplDecl) {
            // Ignore
            return null;

        } else {
            throw new RuntimeException(
                    "Non-Fatal: Failed to add objc method into unknown container (code " + container_kind + ")");
        }
    }

    /**
     * Get edit group
     *
     * @return edit group
     */
    public TextEditGroup getEditGroup() {
        return editGroup;
    }

    /**
     * Returns Xcode's path if possible
     *
     * @return path to Xcode's Developer directory
     */
    public String getXcodePath() {
        if (!hasCachedXcodePath) {
            final File xcodeDeveloperFile = NativeSDKUtil.getXcodeDeveloperPath();
            if (xcodeDeveloperFile == null) {
                throw new RuntimeException("Xcode path is null");
            }
            Path xcodeDeveloperPath = new Path(xcodeDeveloperFile);
            cachedXcodePath = xcodeDeveloperPath.toString();
            if (cachedXcodePath == null) {
                throw new RuntimeException("Xcode path is null");
            }
            hasCachedXcodePath = true;
        }
        return cachedXcodePath;
    }

    private Object xcodeDocCache;

    public Object getXcodeDocCache() {
        if (xcodeDocCache != null) {
            return xcodeDocCache;
        }
        synchronized (this) {
            if (xcodeDocCache != null) {
                return xcodeDocCache;
            }
            xcodeDocCache = XcodeLinkedDocumentation.initSQL(this);
            return xcodeDocCache;
        }
    }
}
