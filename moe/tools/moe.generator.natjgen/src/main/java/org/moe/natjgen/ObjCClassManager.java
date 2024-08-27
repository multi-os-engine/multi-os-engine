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

import org.moe.natjgen.TypeResolver.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ObjCClassManager extends AbstractUnitManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(ObjCClassManager.class);

    /**
     * Super's name
     */
    protected final String superName;

    /**
     * Returns superclass' name
     *
     * @return superclass' name
     */
    public final String getSuperName() {
        return superName;
    }

    /**
     * Super's manager
     */
    protected ObjCClassManager superManager = null;

    /**
     * Returns the super's manager
     *
     * @return super's manager
     */
    public final ObjCClassManager getSuperManager() {
        return superManager;
    }

    /**
     * Set the super's manager
     *
     * @param superManager new super manager
     */
    public final void setSuperManager(ObjCClassManager superManager) {
        if (this instanceof ObjCProtocolManager) {
            throw new RuntimeException("Protocol can't have superclass!");
        }
        this.superManager = superManager;
    }

    /**
     * Implemented protocols' name
     */
    protected final ArrayList<String> protocolNames = new ArrayList<String>(16);

    /**
     * Returns names for all implemented protocols
     *
     * @return protocols' names
     */
    public final ArrayList<String> getProtocolNames() {
        return protocolNames;
    }

    /**
     * Implemented protocols' manager
     */
    protected final ArrayList<ObjCProtocolManager> protocols = new ArrayList<ObjCProtocolManager>(16);

    /**
     * Returns managers for all implemented protocols
     *
     * @return protocols' managers
     */
    public final ArrayList<ObjCProtocolManager> getProtocols() {
        return protocols;
    }

    /**
     * All methods implemented by this class
     */
    protected final ArrayList<ObjCMethod> allMethods = new ArrayList<ObjCMethod>(256);

    /**
     * Factory methods implemented by this class
     */
    protected final ArrayList<ObjCMethod> factoryMethods = new ArrayList<ObjCMethod>(256);

    /**
     * Init methods implemented by this class
     */
    protected final ArrayList<ObjCMethod> initMethods = new ArrayList<ObjCMethod>(256);

    /**
     * Factory methods implemented by every superclass
     */
    protected final ArrayList<ObjCMethod> superFactoryMethods = new ArrayList<ObjCMethod>(256);

    /**
     * Init methods implemented by every superclass
     */
    protected final ArrayList<ObjCMethod> superInitMethods = new ArrayList<ObjCMethod>(256);

    /**
     * Init methods implemented by every superclass
     */
    protected final ArrayList<ObjCGenericParamType> genericParamTypes = new ArrayList<ObjCGenericParamType>();

    /**
     * This flag indicated whether the class is a hybrid class or not
     */
    private boolean isHybridClass = false;

    /**
     * Tells whether the class is a hybrid class or not
     *
     * @return true if it is a hybrid class
     */
    public boolean isHybridClass() {
        return isHybridClass;
    }

    /**
     * Sets the class' hybrid class property
     *
     * @param isDeprecated true if it is a hybrid class
     */
    public void setHybridClass(boolean isHybridClass) {
        this.isHybridClass = isHybridClass;
    }

    protected final String originalName;

    public String getOriginalName() {
        return originalName;
    }

    protected final String runtimeName;

    public String getRuntimeName() {
        return runtimeName;
    }

    protected String libraryName;

    public final void setLibraryName(String libraryName) {
        if (libraryName != null && libraryName.length() == 0) {
            libraryName = null;
        }
        this.libraryName = libraryName;
    }

    /**
     * Method type resolver
     */
    protected static final TypeResolver methTResolver;

    /**
     * Init, factory & alloc method return type resolver (Only Objective-C
     * classes with no mapping)
     */
    protected static final TypeResolver methCreatorRetTResolver;

    static {
        methTResolver = new TypeResolver("Objective-C Method", Constants.ObjCRuntime, Context.OTHER);
        methTResolver.set(TypeResolver.VOID, TypeResolver.BOTH, false, true, true);
        methTResolver.add(TypeResolver.VOID, TypeResolver.RETURN, true, false, false);
        methTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.BOTH, true, true, true);
        methTResolver.set(TypeResolver.STRUCT, TypeResolver.BOTH, true, true, true);
        methTResolver.set(TypeResolver.OPAQUE, TypeResolver.BOTH, true, true, true);
        methTResolver.set(TypeResolver.FUNCTION_CB, TypeResolver.BOTH, false, true, false);
        methTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.BOTH, true, true, true);
        methTResolver.set(TypeResolver.OBJC_CLASS, TypeResolver.BOTH, true, false, false);
        methTResolver.set(TypeResolver.OBJC_SELECTOR, TypeResolver.BOTH, true, false, false);
        methTResolver.set(TypeResolver.OBJC_BLOCK, TypeResolver.BOTH, true, false, false);
        methTResolver.set(TypeResolver.OBJC_GENERICS, TypeResolver.BOTH, true, true, true);
        methTResolver.setSupportedMappers(
                new String[] { Constants.CStringMapper, Constants.ObjCStringMapper, Constants.CStringArrayMapper
                });

        methCreatorRetTResolver = new TypeResolver("Objective-C Init/Factory/Alloc Return", Constants.ObjCRuntime, Context.OTHER);
        methCreatorRetTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.RETURN, true, false, false);
        methCreatorRetTResolver.set(TypeResolver.OBJC_GENERICS, TypeResolver.RETURN, true, true, true);
    }

    /**
     * Create a new class manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    class name
     * @param superName   super class's name
     * @param cClassName  objc class name
     */
    public ObjCClassManager(Indexer indexer, String name_fq, String originalName, String superName, String runtimeName) {
        super(indexer, name_fq);

        // Check values
        if (superName != null && superName.length() == 0) {
            throw new RuntimeException("Value 'superName' should be null or a string with a length greater then 0!");
        }

        // Set value
        this.superName = superName;
        this.originalName = originalName;
        this.runtimeName = runtimeName;
    }

    @Override
    public boolean isSupported() {
        return true;
    }

    @Override
    public void preparationPhase_Initialize() {
        methPathMatch[0] = this.getClass() == ObjCProtocolManager.class ?
                TypeConfiguration.OBJC_PROTOCOL :
                TypeConfiguration.OBJC_CLASS;
        methPathMatch[1] = getUnitName();
    }

    @Override
    public void preparationPhase_MemberTypeValidation() {
        boolean hasAlloc = false;
        for (ObjCMethod method : allMethods) {
            validateMember(method);
            if (method.isDisabled()) {
                continue;
            }
            updateMemberPreferredTypes(method);
            method.updateFamily(originalName);
            if (!hasAlloc && method.isAlloc()) {
                hasAlloc = true;
            }
        }
        if (!hasAlloc) {
            ObjCMethod alloc = ObjCMethod.allocMethod(getUnitName(), this);
            allMethods.add(alloc);
            validateMember(alloc);
            alloc.updateFamily(originalName);
        }
    }

    @Override
    public void preparationPhase_MemberMerge() {
        for (ObjCProtocolManager protocol : protocols) {
            for (ObjCMethod method : addMethods(protocol)) {
                method.updateFamily(originalName);
            }
        }
        for (ObjCMethod method : allMethods) {
            if (method.getFamily() == ObjCMethodFamily.INIT) {
                initMethods.add(method);
            } else if (method.getFamily() == ObjCMethodFamily.FACTORY) {
                factoryMethods.add(method);
            }
        }
    }

    @Override
    public void preparationPhase_MemberManipulation() {
        try {
            processCreationMethods();
        } catch (GeneratorException e) {
            throw new RuntimeException("Special method processing failed", e);
        }
        for (ObjCMethod method : allMethods) {
            fixNameCollisionForMethod(method);
        }
    }

    @Override
    public void preparationPhase_Final() {
        sortAllMethods();
        for (ObjCMethod method : allMethods) {
            if (method.getOwner() != this || method.isDisabled()) {
                continue;
            }
            if (method.isStatic()) {
                if (method.getType().isObjCProtocolledIdType()) {
                    method.getType().setObjcProtocolGenerationState(new Type.ObjCProtocolGenerationState());
                }
                for (CalleeArgument argument : method.getArguments()) {
                    if (argument.getType().isObjCProtocolledIdType()) {
                        argument.getType().setObjcProtocolGenerationState(new Type.ObjCProtocolGenerationState());
                    }
                }
                continue;
            }
            tryResolveObjCProtocolledId(method, -1);
            final int size = method.getArguments().size();
            for (int idx = 0; idx < size; ++idx) {
                tryResolveObjCProtocolledId(method, idx);
            }
        }
    }

    protected void sortAllMethods() {
        Collections.sort(allMethods, new Comparator<ObjCMethod>() {
            @Override
            public int compare(ObjCMethod o1, ObjCMethod o2) {
                return o1.getSelector().compareTo(o2.getSelector());
            }
        });
    }

    private void tryResolveObjCProtocolledId(final ObjCMethod method, final int argIdx) {
        // Get shared ObjCProtocolGenerationState object
        Type methodType = method.getTypeAt(argIdx);
        Type.ObjCProtocolGenerationState state = methodType.getObjcProtocolGenerationState();
        if (state == null) {
            SuperInfo lastNonNullSuperInfo = getSuperOf(method);

            // This is the root method
            if (lastNonNullSuperInfo == null) {
                state = new Type.ObjCProtocolGenerationState();
                methodType.setObjcProtocolGenerationState(state);
                return;
            }

            // Lookup root method
            state = lastNonNullSuperInfo.method.getTypeAt(argIdx).getObjcProtocolGenerationState();
            while (state == null) {
                SuperInfo superInfo = lastNonNullSuperInfo.manager.getSuperOf(lastNonNullSuperInfo.method);
                if (superInfo == null) {
                    break;
                }
                lastNonNullSuperInfo = superInfo;
                state = lastNonNullSuperInfo.method.getTypeAt(argIdx).getObjcProtocolGenerationState();
            }

            // No state information was found, create it and set it for methods
            // between lastNonNullSuper..method
            if (state == null) {
                state = new Type.ObjCProtocolGenerationState();

                SuperInfo superInfo = getSuperOf(method);
                while (superInfo != null) {
                    superInfo.method.getTypeAt(argIdx).setObjcProtocolGenerationState(state);
                    superInfo = superInfo.manager.getSuperOf(superInfo.method);
                }
            }

            // Set this method's state
            methodType.setObjcProtocolGenerationState(state);
        }
        if (state.isDisabled()) {
            return;
        }
        SuperInfo superInfo = getSuperOf(method);
        if (superInfo == null) {
            return;
        }
        Type superType = superInfo.method.getTypeAt(argIdx);
        if (!methodType.isObjCProtocolExactOrInheritedFrom(superType, getGenerator())) {
            state.disable();
        }
    }

    public static class SuperInfo {
        public final ObjCClassManager manager;
        public final ObjCMethod method;

        public SuperInfo(ObjCClassManager manager, ObjCMethod method) {
            if (manager == null) {
                throw new NullPointerException();
            }
            if (method == null) {
                throw new NullPointerException();
            }
            this.manager = manager;
            this.method = method;
        }
    }

    private SuperInfo getSuperOf(ObjCMethod method) {
        if (superManager == null) {
            return null;
        }
        ObjCMethod superMethod = superManager.getMethodWithSelector(method.getSelector(), method.isStatic());
        if (superMethod != null) {
            // LOG.debug(" >> Found super of " + method.getSelector() + " in " +
            // superManager.getUnitName());
            return new SuperInfo(superManager, superMethod);
        }
        return superManager.getSuperOf(method);
    }

    /**
     * Cached method path match
     */
    protected final String methPathMatch[] = new String[] { null, null, null, null, TypeConfiguration.LOCATION, null
    };

    protected void updateMemberPreferredTypes(ObjCMethod method) {
        TypeConfiguration tConf = getIndexer().getInputTypeConfiguration();

        // Update uncertain binding resolving
        if (!method.isExternalUnit()) {
            methPathMatch[2] = method.isStatic() ? TypeConfiguration.CLASS_METHOD : TypeConfiguration.INSTANCE_METHOD;
            methPathMatch[3] = method.getSelector();

            methPathMatch[5] = "-1";
            method.getType().setPreferredResolving(tConf.getPreferredType(methPathMatch));

            int idx = 0;
            for (CalleeArgument arg : method.getArguments()) {
                methPathMatch[5] = Integer.toString(idx);
                arg.getType().setPreferredResolving(tConf.getPreferredType(methPathMatch));
                ++idx;
            }
        }
    }

    /**
     * Indicates whether the special methods have been processed or not
     */
    private boolean specialMethodsAreProcessed = false;

    private static final ArrayList<Type> EMPTY_TYPE_ARGS_LIST = new ArrayList<Type>();

    private ArrayList<Type> superTypeGenericParams = EMPTY_TYPE_ARGS_LIST;

    /**
     * Tests the given method for errors and sets up the type annotations for it
     *
     * @param method method to check
     */
    protected void validateMember(ObjCMethod method) {
        boolean isValid = true;
        ArrayList<String> problems = new ArrayList<String>();
        if (!method.isSupported(getGenerator(), problems)) {
            isValid = false;
        } else {
            if (isCreatorMethod(method)) {
                if (!methCreatorRetTResolver.supports(toInstanceType(), false)) {
                    problems.add(
                            methCreatorRetTResolver.getName() + " resolver doesn't handle type [" + method.getType()
                                    + "]");
                    isValid = false;
                }
            } else {
                if (method.getType().isCallback()) {
                    CallbackManager cbman = method.getType().getCallbackManager();
                    if (cbman == null) {
                        cbman = new CallbackManager(this, method, -1);
                        method.getType().setCallbackManager(cbman);
                    }
                    if (!cbman.isSupported()) {
                        problems.add("unhadled callback at return type [" + method.getType() + "]");
                        isValid = false;
                    }
                }
                if (!methTResolver.supports(method.getType(), false)) {
                    problems.add(methTResolver.getName() + " resolver doesn't handle return type [" + method.getType()
                            + "]");
                    isValid = false;
                }
            }

            int idx = 0;
            for (CalleeArgument arg : method.getArguments()) {
                if (arg.getType().isCallback()) {
                    CallbackManager cbman = arg.getType().getCallbackManager();
                    if (cbman == null) {
                        cbman = new CallbackManager(this, method, idx);
                        arg.getType().setCallbackManager(cbman);
                    }
                    if (!cbman.isSupported()) {
                        problems.add(
                                "unhadled callback at arg(" + arg.getName() + "@" + idx + ") type [" + arg.getType()
                                        + "]");
                        isValid = false;
                    }
                }
                if (!methTResolver.supports(arg.getType(), true)) {
                    problems.add(methTResolver.getName() + " resolver doesn't handle arg(" + arg.getName() + "@" + idx
                            + ") type [" + arg.getType() + "]");
                    isValid = false;
                }
                ++idx;
            }
        }

        if (!isValid) {
            method.setDisabled();
            log(Statistics.SKIPPING, method.getStatisticsCategory(), method.getSelector(), getUnitName(), problems);
        }
    }

    /**
     * Process creation (init and factory) methods
     *
     * @throws GeneratorException
     */
    protected final void processCreationMethods() throws GeneratorException {
        // Process special methods only once
        if (specialMethodsAreProcessed) {
            return;
        }
        specialMethodsAreProcessed = true;

        // Get all super creation methods
        if (superManager != null) {
            superManager.processCreationMethods();
            superManager.getAllInitMethods(superInitMethods, isExternalUnit());
            superManager.getAllFactoryMethods(superFactoryMethods, isExternalUnit());
        }

        // Remove redundant init methods
        ArrayList<ObjCMethod> removes = new ArrayList<ObjCMethod>();
        for (ObjCMethod meth : initMethods) {
            for (ObjCMethod super_meth : superInitMethods) {
                if (meth.getSelector().equals(super_meth.getSelector())) {
                    removes.add(super_meth);
                    break;
                }
            }
        }
        superInitMethods.removeAll(removes);

        // Remove redundant factory methods
        removes = new ArrayList<ObjCMethod>();
        for (ObjCMethod meth : factoryMethods) {
            for (ObjCMethod super_meth : superFactoryMethods) {
                if (meth.getSelector().equals(super_meth.getSelector())) {
                    removes.add(super_meth);
                    break;
                }
            }
        }
        superFactoryMethods.removeAll(removes);

        // Get all super static methods
        ArrayList<ObjCMethod> staticMethods = new ArrayList<ObjCMethod>();
        if (superManager != null) {
            superManager.getAllStaticMethods(staticMethods, isExternalUnit());
        }

        // Remove redundant static methods
        removes = new ArrayList<ObjCMethod>();
        for (ObjCMethod meth : allMethods) {
            for (ObjCMethod super_meth : staticMethods) {
                if (meth.getSelector().equals(super_meth.getSelector())) {
                    removes.add(super_meth);
                    break;
                }
            }
        }
        staticMethods.removeAll(removes);

        // Add all new init and factory methods to main collection
        allMethods.addAll(superInitMethods);
        allMethods.addAll(superFactoryMethods);
        allMethods.addAll(staticMethods);
    }

    /**
     * Returns all init methods implemented by this class (including init
     * methods implemented by supers)
     *
     * @param container  container to add the init methods to
     * @param isExternal method is external
     * @throws GeneratorException
     */
    private void getAllInitMethods(ArrayList<ObjCMethod> container, boolean isExternal) throws GeneratorException {
        if (superManager != null) {
            superManager.getAllInitMethods(container, isExternal);
        }

        for (ObjCMethod m : initMethods) {
            ObjCMethod inheritedCopy = m.getInheritedCopy(this);
            // Inherit external property from container
            inheritedCopy.setExternalUnit(isExternal);
            container.removeIf(it->m.getSelector().equals(it.getSelector()));
            container.add(inheritedCopy);
        }
    }

    /**
     * Returns all static methods implemented by this class (including static
     * methods implemented by supers)
     *
     * @param container  container to add the static methods to
     * @param isExternal method is external
     * @throws GeneratorException
     */
    private void getAllStaticMethods(ArrayList<ObjCMethod> container, boolean isExternal) throws GeneratorException {
        if (superManager != null) {
            superManager.getAllStaticMethods(container, isExternal);
        }

        for (ObjCMethod m : allMethods) {
            if (!m.isStatic()) continue;
            ObjCMethod inheritedCopy = m.getInheritedCopy(this);
            // Inherit external property from container
            inheritedCopy.setExternalUnit(isExternal);
            container.add(inheritedCopy);
        }
    }

    /**
     * Returns all factory methods implemented by this class (including factory
     * methods implemented by supers)
     *
     * @param container  container to add the factory methods to
     * @param isExternal method is external
     * @throws GeneratorException
     */
    private void getAllFactoryMethods(ArrayList<ObjCMethod> container, boolean isExternal) throws GeneratorException {
        if (superManager != null) {
            superManager.getAllFactoryMethods(container, isExternal);
        }

        for (ObjCMethod m : factoryMethods) {
            ObjCMethod inheritedCopy = m.getInheritedCopy(this);
            // Inherit external property from container
            inheritedCopy.setExternalUnit(isExternal);
            container.removeIf(it->m.getSelector().equals(it.getSelector()));
            container.add(inheritedCopy);
        }
    }

    /**
     * Add all methods from a protocol
     *
     * @param protocol protocol to add all methods from
     */
    public ArrayList<ObjCMethod> addMethods(ObjCProtocolManager protocol) {
        final ArrayList<ObjCMethod> addedMethods = new ArrayList<ObjCMethod>(16);
        ArrayList<ObjCMethod> methods = protocol.getMethods();
        for (ObjCMethod method : methods) {
            ObjCMethod search = getMethodWithSelector(method.getSelector(), method.isStatic());
            if (search == null) {
                allMethods.add(method);
                addedMethods.add(method);
            } else {
                search.setProtocolMethod();
                {
                    Type rett = search.getType();
                    if (rett.isCallback()) {
                        rett.setCallbackManager(method.getType().getCallbackManager());
                    }
                }
                int argCount = search.getArguments().size();
                for (int idx = 0; idx < argCount; ++idx) {
                    Type argt = search.getArguments().get(idx).getType();
                    if (argt.isCallback()) {
                        argt.setCallbackManager(method.getArguments().get(idx).getType().getCallbackManager());
                    }
                }
            }
        }

        for (ObjCProtocolManager parent : protocol.getProtocols()) {
            addedMethods.addAll(addMethods(parent));
        }
        return addedMethods;
    }

    @Override
    protected void update() {
        ClassMemberEditor cme = updateClass();
        for (ObjCMethod method : allMethods) {

            update(method, cme);
            if (method.isStatic() && method.isProtocolMethod()) {
                updateProtocolClassMethod(method, cme);
            }
        }
        cme.close();
    }

    @Override
    public final void cleanup() {
        superManager = null;
        protocolNames.clear();
        protocols.clear();
        allMethods.clear();
        factoryMethods.clear();
        initMethods.clear();
        superFactoryMethods.clear();
        superInitMethods.clear();
    }

    /**
     * Prepare methods for Java compatibility
     *
     * @param method method to prepare
     */
    protected final void fixNameCollisionForMethod(ObjCMethod method) {
        if (superManager != null) {
            superManager.fixNameCollisionForMethod(method);
        }

        for (ObjCMethod collision_method : allMethods) {
            if (collision_method == method) {
                continue;
            }

            if (collision_method.getJavaName().equals(method.getJavaName())) {
                if (collision_method.isStatic() == method.isStatic()) {
                    // Do nothing
                } else if (collision_method.isStatic()) {
                    collision_method.addStaticSuffix();
                } else {
                    method.addStaticSuffix();
                }
            }
        }
    }

    /**
     * Add a method to the container if it doesn't exist in it already
     *
     * @param method method to add
     */
    public final void addMethod(ObjCMethod method) {
        if (getMethodWithSelector(method.getSelector(), method.isStatic()) == null) {
            allMethods.add(method);
        }
    }

    /**
     * Add an implemented protocol's name
     *
     * @param name name of the implemented protocol
     */
    public final void addProtocolName(String name) {
        if (name == null || name.length() == 0) {
            throw new RuntimeException("Protocol name cannot be added, name argument is incorrect!");
        }
        if (protocolNames.contains(name)) {
            return;
        }
        if (this instanceof ObjCProtocolManager && name.equals("NSObject")) {
            return;
        }
        protocolNames.add(name);
    }

    /**
     * Add an implemented protocol's manager
     *
     * @param protocol manager of the implemented protocol
     */
    public final void addProtocol(ObjCProtocolManager protocol) {
        if (protocol == null) {
            throw new RuntimeException("Protocol angument cannot be null!");
        }
        protocols.add(protocol);
    }

    /**
     * Get the Objective-C method with a given selector
     *
     * @param selector Objective-C selector
     * @param isStatic method is static
     * @return resolved method
     */
    protected final ObjCMethod getMethodWithSelector(String selector, boolean isStatic) {
        for (ObjCMethod method : allMethods) {
            if (method.getSelector().equals(selector)) {
                if (method.isStatic() == isStatic) {
                    return method;
                }
            }
        }

        return null;
    }

    /**
     * Tells whether a method is an init or factory method or not
     *
     * @param method to check
     * @return true when method is init or factory otherwise false
     */
    protected final boolean isInitOrFactory(ObjCMethod method) {
        if (initMethods.contains(method) || factoryMethods.contains(method) || superInitMethods.contains(method)
                || superFactoryMethods.contains(method)) {
            return true;
        }
        return false;
    }

    /**
     * Tells whether a method is an init, factory or alloc method or not
     *
     * @param method method
     * @return true if it is a creator method
     */
    protected final boolean isCreatorMethod(ObjCMethod method) {
        if (isInitOrFactory(method) || method.isAlloc()) {
            int kind = method.getType().getKind();
            if (kind == Type.ObjCId || kind == Type.ObjCInstanceType || method.isAlloc()) {
                return true;
            }
        }
        return false;
    }

    public void addGenericParamType(ObjCGenericParamType param) {
        if (param == null) {
            throw new NullPointerException();
        }
        genericParamTypes.add(param);
    }

    /**
     * Update class information
     *
     * @return ClassMemberEditor for the class
     * @throws GeneratorException
     */
    private ClassMemberEditor updateClass() {
        try {
            ClassEditor editor = new ClassEditor(this, getClassDecl(), isNew());
            if (editor.isEditable()) {
                editor.setClass();
                editor.setClassName(getUnitName());
                if (superName != null) {
                    editor.setSuperClass(addImport(superManager), superTypeGenericParams);
                } else {
                    // We assume root classes don't have template parameters
                    editor.setSuperClass(addImport(Constants.ObjCObjectFQ));
                }
                String itfs[] = new String[protocols.size()];
                int idx = 0;
                for (ObjCProtocolManager pman : protocols) {
                    itfs[idx++] = addImport(pman);
                }
                editor.setTemplates(genericParamTypes);
                editor.setInterfaces(itfs);
                editor.setStaticInitializer();

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                if (isHybridClass) {
                    modifiers.setRegisterOnStartup();
                    if (runtimeName != null && runtimeName.length() > 0 &&
                            !originalName.equals(runtimeName)) {
                        modifiers.setObjCClassName(originalName);
                    } else {
                        modifiers.setObjCClassName(runtimeName);
                    }
                } else {
                    modifiers.setObjCClassBinding();
                    if (runtimeName != null && runtimeName.length() > 0 &&
                            !runtimeName.equals(getUnitName())) {
                        modifiers.setObjCClassName(runtimeName);
                    }
                }
                modifiers.setRuntime(addImport(Constants.ObjCRuntimeFQ));
                if (libraryName != null) {
                    modifiers.setLibrary(libraryName);
                }
                if (isDeprecated()) {
                    modifiers.setDeprecated();
                }
                modifiers.setGenerated();

                XcodeDocumentation doc = new XcodeDocumentation(getComment(), getEditGroup());
                editor.setJavaDoc(doc);

                editor.close();
            }

            Type pointerCAT = new Type(Constants.PointerFQ, true);
            String pointerCAN = "peer";
            ConstructorEditor pointerC = editor.getMemberEditor().setConstructor(pointerCAT);
            if (pointerC != null && pointerC.isEditable()) {
                pointerC.getModifiers().setProtected();
                pointerC.getModifiers().setGenerated();
                pointerC.setArgumentCount(1);
                pointerC.setArgument(0, pointerCAN, pointerCAT, TypeResolver.PRIMITIVE_RESOLVER);
                pointerC.setBodyAsSuperInitWithPointerAsArg(pointerCAN);
                pointerC.close();
            }

            logOK(Statistics.OBJC_CLASS);
            return editor.getMemberEditor();
        } catch (GeneratorException e) {
            logFAIL(Statistics.OBJC_CLASS, getFullyQualifiedName(), null, LOG, e);
            return null;
        }
    }

    /**
     * Update method information
     *
     * @param method method
     * @param cme    class member editor of the method's owner
     * @throws GeneratorException
     */
    private void update(ObjCMethod method, ClassMemberEditor cme) {
        if (method.isDisabled()) {
            return;
        }
        if (method.isExternalUnit() && !method.isProtocolMethod()) {
            return;
        }
        if (method.isProtocolMethod() && (method.isOptional() && isHybridClass)) {
            return;
        }

        boolean isUnsafeProperty = method.isUnsafePropertySetter();
        if (isUnsafeProperty) {
            isUnsafeProperty = method.getArguments().get(0).getType().isObjCObject();
        }
        boolean canUpdateUnsafe = false;

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }

            final String methodName = method.getJavaName() + (isUnsafeProperty ? "_unsafe" : "");

            final int numArgs = method.getArguments().size() + (method.isVariadic() ? 1 : 0);
            MethodEditor editor = cme.getObjCMethodBinder(method.getSelector(), method.isStatic());
            if (editor == null) {
                if (cme.hasMethod(methodName, method.isStatic(), numArgs)) {
                    editor = cme.getMehtod(methodName, method.isStatic(), numArgs);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                // We only enable updating safe setter, when the unsafe setter
                // is editable
                canUpdateUnsafe = true;

                editor.setName(methodName);
                boolean methodCouldClash = method.isAlloc() || method.isInheritedFromNonTemplateClass();
                if (isCreatorMethod(method)) {
                    if (methodCouldClash) {
                        editor.setType(new Type(getUnitName()), methCreatorRetTResolver);
                    } else {
                        editor.setType(toInstanceType(), methCreatorRetTResolver);
                    }
                } else {
                    editor.setType(method.getType(), methTResolver);
                }
                if (method.isStatic() && !methodCouldClash) {
                    editor.setTemplates(genericParamTypes);
                } else {
                    editor.setTemplates(new ArrayList<>());
                }
                editor.setArgumentCount(numArgs);
                int idx = 0;
                for (CalleeArgument arg : method.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), methTResolver);
                    ++idx;
                }
                if (method.isVariadic()) {
                    editor.setVariadicArgument(idx, method.getVariadicName());
                }

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                if (method.isStatic()) {
                    modifiers.setStatic();
                }

                // TODO MOE fix
                if (!isHybridClass || method.getAttribute() == null
                        || method.getAttribute().getKind() != ObjCAttributeInfo.IBACTION) {
                    modifiers.setNative();
                }

                modifiers.setSelector(method.getSelector());
                if (method.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (method.isOptional()) {
                    if (isHybridClass) {
                        modifiers.setNotImplemented();
                    } else {
                        modifiers.setIsOptional();
                    }
                }
                if (method.isRetainedReturn() && method.getType().isObjCObject()) {
                    modifiers.setOwned();
                }
                if (method.isVariadic()) {
                    modifiers.setVariadic();
                }

                // TODO MOE code
                // String kind = "";
                if (isHybridClass && method.getAttribute() != null) {
                    // kind = String.valueOf(method.getAttribute().getKind());
                    if (method.getAttribute().getKind() == ObjCAttributeInfo.IBACTION) {
                        modifiers.setIBAction();
                        editor.setEmptyBodyForMethod(method.getType());
                    }

                    if (method.getAttribute().getKind() == 1 && !method.getType().isVoid()) {
                        modifiers.setProperty();
                    }

                }

                modifiers.setGenerated();

                // Add documentation
                if (method.getPropertyName() == null) {
                    String type = null;

                    if (!method.isProtocolMethod()) {
                        type = method.isStatic() ?
                                XcodeDocumentation.DocClassMethodType :
                                XcodeDocumentation.DocInstanceMethodType;
                    }
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName, method.getSelector(), method.getComment(),
                                    getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                } else {
                    String type = null;
                    if (!method.isProtocolMethod()) {
                        type = XcodeDocumentation.DocInstancePropertyType;
                    }
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName,
                                    method.getPropertyName(), method.getComment(), getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                }

                editor.close();
            }

            // Add uncertain bindings to outputTypeConfiguration
            if (method.getOwner() == this) {
                TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
                methPathMatch[2] = method.isStatic() ?
                        TypeConfiguration.CLASS_METHOD :
                        TypeConfiguration.INSTANCE_METHOD;
                methPathMatch[3] = method.getSelector();
                for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
                    methPathMatch[5] = uncert.getLocation();
                    if (uncert.getDescriptor().isFallback()) {
                        logType(Statistics.UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, null, uncert.getDescriptor().getOptions());
                    } else {
                        logType(Statistics.RESOLVED_UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, uncert.getDescriptor().getResolved(),
                                uncert.getDescriptor().getOptions());
                    }
                }

                // Return type + arg types - resolved types
                int count = 1 + method.getArguments().size() - editor.getUncertains().size();
                for (int i = 0; i < count; ++i) {
                    logType(Statistics.RESOLVED_TYPE, method.getStatisticsCategory());
                }

                logOK(method.getStatisticsCategory());
            }
        } catch (GeneratorException e) {
            logFAIL(method.getStatisticsCategory(), method.getSelector(), getFullyQualifiedName(), LOG, e);
        }

        if (method.getOwner() == this) {
            updateFunctionCBOrBlockInterface(cme, method);
        }

        // Do this at the end, otherwise the code for the unsafe version will
        // not be generated.
        if (isUnsafeProperty && canUpdateUnsafe) {
            updateSafe(method, cme);
        }
    }

    /**
     * Update method information for unsafe properties
     *
     * @param method method
     * @param cme    class member editor of the method's owner
     * @throws GeneratorException
     */
    private void updateSafe(ObjCMethod method, ClassMemberEditor cme) {
        if (method.isDisabled()) {
            return;
        }
        if (method.isExternalUnit() && !method.isProtocolMethod()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }

            final String methodName = method.getJavaName();

            MethodEditor editor = cme.getObjCMethodBinder(method.getSelector(), method.isStatic());
            if (cme.hasMethod(methodName, method.isStatic(), method.getArguments().size())) {
                editor = cme.getMehtod(methodName, method.isStatic(), method.getArguments().size());
            } else {
                editor = cme.newMethod();
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(methodName);
                if (isCreatorMethod(method)) {
                    editor.setType(toInstanceType(), methCreatorRetTResolver);
                } else {
                    editor.setType(method.getType(), methTResolver);
                }
                editor.setArgumentCount(method.getArguments().size());
                int idx = 0;
                for (CalleeArgument arg : method.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), methTResolver);
                    ++idx;
                }

                editor.updateSafePropertyBinding(method.getAssociatedGetter().getJavaName(), methodName + "_unsafe",
                        method.getArguments().get(0));

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                if (method.isStatic()) {
                    modifiers.setStatic();
                }
                if (method.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (method.isOptional()) {
                    modifiers.setIsOptional();
                }
                if (method.isRetainedReturn() && method.getType().isObjCObject()) {
                    modifiers.setOwned();
                }
                modifiers.setGenerated();

                // Add documentation
                if (method.getPropertyName() == null) {
                    String type = null;

                    if (!method.isProtocolMethod()) {
                        type = method.isStatic() ?
                                XcodeDocumentation.DocClassMethodType :
                                XcodeDocumentation.DocInstanceMethodType;
                    }
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName, method.getSelector(), method.getComment(),
                                    getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                } else {
                    String type = null;
                    if (!method.isProtocolMethod()) {
                        type = XcodeDocumentation.DocInstancePropertyType;
                    }
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName,
                                    method.getPropertyName(), method.getComment(), getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                }

                editor.close();
            }

            // Add uncertain bindings to outputTypeConfiguration
            if (method.getOwner() == this) {
                TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
                methPathMatch[2] = method.isStatic() ?
                        TypeConfiguration.CLASS_METHOD :
                        TypeConfiguration.INSTANCE_METHOD;
                methPathMatch[3] = method.getSelector();
                for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
                    methPathMatch[5] = uncert.getLocation();
                    if (uncert.getDescriptor().isFallback()) {
                        logType(Statistics.UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, null, uncert.getDescriptor().getOptions());
                    } else {
                        logType(Statistics.RESOLVED_UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, uncert.getDescriptor().getResolved(),
                                uncert.getDescriptor().getOptions());
                    }
                }

                // Return type + arg types - resolved types
                int count = 1 + method.getArguments().size() - editor.getUncertains().size();
                for (int i = 0; i < count; ++i) {
                    logType(Statistics.RESOLVED_TYPE, method.getStatisticsCategory());
                }

                logOK(method.getStatisticsCategory());
            }
        } catch (GeneratorException e) {
            logFAIL(method.getStatisticsCategory(), method.getSelector(), getFullyQualifiedName(), LOG, e);
        }

        if (method.getOwner() == this) {
            updateFunctionCBOrBlockInterface(cme, method);
        }
    }

    /**
     * Update protocol class method information
     *
     * @param method method
     * @param cme    class member editor of the method's owner
     * @throws GeneratorException
     */
    private void updateProtocolClassMethod(ObjCMethod method, ClassMemberEditor cme) {
        if (method.isDisabled()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }

            String javaName = "_" + method.getJavaName();

            final int numArgs = method.getArguments().size() + (method.isVariadic() ? 1 : 0);
            MethodEditor editor = cme.getObjCProtocolClassMethodBinder(method.getJavaName());
            if (editor == null) {
                if (cme.hasMethod(javaName, false, numArgs)) {
                    editor = cme.getMehtod(javaName, false, numArgs);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(javaName);
                editor.setType(method.getType(), methTResolver);
                editor.setArgumentCount(numArgs);
                int idx = 0;
                for (CalleeArgument arg : method.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), methTResolver);
                    ++idx;
                }
                if (method.isVariadic()) {
                    editor.setVariadicArgument(idx, method.getVariadicName());
                }

                ArrayList<CalleeArgument> args = new ArrayList<CalleeArgument>(method.getArguments());
                if (method.isVariadic()) {
                    args.add(new CalleeArgument(method.getVariadicName(), new Type()) {
                        @Override
                        public Type getType() {
                            throw new IllegalStateException();
                        }

                        @Override
                        public String getRawName() {
                            throw new IllegalStateException();
                        }
                    });
                }
                editor.setBodyAsMethodCaller(method.getJavaName(), method.getType(), args);

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setProtocolClassMethod(method.getJavaName());
                if (method.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (method.isOptional()) {
                    modifiers.setIsOptional();
                }
                if (method.isRetainedReturn() && method.getType().isObjCObject()) {
                    modifiers.setOwned();
                }
                modifiers.setGenerated();

                editor.close();
            }
        } catch (GeneratorException e) {
            logFAIL(Statistics.OBJC_CLASS_METHOD, method.getSelector() + " (Prococol class method binding)",
                    getFullyQualifiedName(), LOG, e);
        }
    }

    public final boolean isNSString() {
        return originalName.equals("NSString") && libraryName.equals("Foundation");
    }

    public void resetEditorState() {
        for (ObjCMethod objCMethod : allMethods) {
            objCMethod.clearEdited();
        }
    }

    public void disableUneditedMethods() {
        for (ObjCMethod objCMethod : allMethods) {
            if (!objCMethod.isEdited()) {
                objCMethod.setDisabled();
            }
        }
    }

    public void setSuperTypeGenericParams(ArrayList<Type> objCTypeArgs) {
        superTypeGenericParams = new ArrayList<Type>(objCTypeArgs);
    }

    public Type toInstanceType() {
        Type t = new Type(getUnitName());
        if (!genericParamTypes.isEmpty()) {
            List<Type> typeArgs = genericParamTypes
                    .stream()
                    .map(objCGenericParamType -> {
                        Type argType = new Type(Type.ObjCId, "id");
                        argType.setObjCGenericParamType(objCGenericParamType);

                        return argType;
                    })
                    .collect(Collectors.toList());

            t.setTypeArgs(new ArrayList<>(typeArgs));
        }
        return t;
    }
}
