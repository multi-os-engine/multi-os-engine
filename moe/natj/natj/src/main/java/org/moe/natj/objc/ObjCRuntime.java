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

package org.moe.natj.objc;

import org.moe.natj.c.OpaquePtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NativeRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.Pointer.Releaser;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCCategory;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.map.ObjCCallbackMapper;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/**
 * ObjCRuntime.
 *
 * <p>
 * {@link NativeRuntime} implementation used for supporting Objective-C features like NSObjects
 * and block codes.
 */
public class ObjCRuntime extends NativeRuntime {

    static {
        NatJ.registerRuntime(ObjCRuntime.class);
    }

    /**
     * Process the Java class.
     *
     * <p>
     * This will register native handlers for native methods.
     * Handles methods with selectors and instance variable getters and setters.
     *
     * @param type class
     */
    @Override
    protected void doRegistration(java.lang.Class<?> type) {
        // TODO: Throw error if proxy
        long objcClass = registerClass(type);
        ObjCCategory ann = type.getAnnotation(ObjCCategory.class);
        if (ann != null) {
            type = ann.value();
        }
        synchronized (resolvedObjCClasses) {
            resolvedObjCClasses.put(objcClass, type);
        }
    }

    /**
     * ObjCRuntime constructor.
     *
     * <p>
     * Sets the default mappers and calls initialization.
     * Builds up containers used for Objective-C class resolving.
     */
    private ObjCRuntime() {
        super(ObjCObjectMapper.class, ObjCStringMapper.class, ObjCCallbackMapper.class);

        String platform = NatJ.getPlatformName();
        if ("ios".equals(platform)) {
            String coreimage = "apple.coreimage";
            String foundation = "apple.foundation";
            String uikit = "apple.uikit";
            String mapkit = "apple.mapkit";
            String glkit = "apple.glkit";
            platformRoot = "apple"; // As of iOS 7 NSObject moved to the apple package

            sdkPackages.add(coreimage);
            sdkPackages.add(foundation);
            sdkPackages.add(uikit);
            sdkPackages.add(mapkit);
            sdkPackages.add(glkit);
            sdkPackages.add(platformRoot);

            preferablePackagesForPrefixes.put("CI", new HashSet<String>(Arrays.asList(coreimage)));
            preferablePackagesForPrefixes.put("NS", new HashSet<String>(Arrays.asList(foundation,
                    uikit, platformRoot)));
            preferablePackagesForPrefixes.put("UI", new HashSet<String>(Arrays.asList(uikit)));
            preferablePackagesForPrefixes.put("MK", new HashSet<String>(Arrays.asList(mapkit)));
            preferablePackagesForPrefixes.put("GLK", new HashSet<String>(Arrays.asList(glkit)));
        } else if ("mac".equals(platform)) {
            String foundation = "apple.foundation";
            platformRoot = "apple";

            sdkPackages.add(foundation);
            sdkPackages.add(platformRoot);

            preferablePackagesForPrefixes.put("NS",
                    new HashSet<String>(Arrays.asList(foundation, platformRoot)));
        } else if ("tvos".equals(platform)) {
            String coreimage = "apple.coreimage";
            String foundation = "apple.foundation";
            String uikit = "apple.uikit";
            String glkit = "apple.glkit";
            platformRoot = "apple";

            sdkPackages.add(coreimage);
            sdkPackages.add(foundation);
            sdkPackages.add(uikit);
            sdkPackages.add(glkit);
            sdkPackages.add(platformRoot);

            preferablePackagesForPrefixes.put("CI", new HashSet<String>(Arrays.asList(coreimage)));
            preferablePackagesForPrefixes.put("NS", new HashSet<String>(Arrays.asList(foundation,
                    uikit, platformRoot)));
            preferablePackagesForPrefixes.put("UI", new HashSet<String>(Arrays.asList(uikit)));
            preferablePackagesForPrefixes.put("GLK", new HashSet<String>(Arrays.asList(glkit)));
        } else {
            throw new RuntimeException("Unsupported platform!");
        }

        initialize(this);
    }

    /**
     * Releaser for Objective-C objects.
     *
     * <p>
     * Will send release message to the pointed object.
     */
    private static Releaser strongReleaser = new Releaser() {
        @Override
        public void release(long peer) {
            releaseObject(peer);
        }

        @Override
        public boolean ifFinalizedExternally() {
            return true;
        }
    };

    /**
     * Creates a strong pointer to an Objective-C object.
     *
     * <p>
     * Retains if doing so is needed to keep the strong ownership.
     *
     * @param peer The pointer
     * @param owned If this is false, the pointer objects will be retained
     * @return The created {@link Pointer} object
     */
    public static Pointer createStrongPointer(long peer, boolean owned) {
        if (!owned) {
            retainObject(peer);
        }
        return new Pointer(peer, strongReleaser);
    }

    /**
     * Creates a weak reference to an Objective-C object.
     *
     * @param peer The pointer
     * @return The created {@link Pointer} object
     */
    public static WeakReference createWeakReference(long peer) {
        return new WeakReference(peer);
    }

    /**
     * Empty implementation for disposing Objective-C callbacks (blocks).
     *
     * <p>
     * Empty, because blocks are objects, so they have proper memory management.
     *
     * @param callback Callback object
     */
    @Override
    public void tryToDisposeCallback(Object callback) {
        // not needed
    }

    /**
     * Print full description of throwable object into single string
     * including name, reason, stacktrace and other info.
     *
     * <p>
     * Used during converting java throwable to NSException with keeping
     * stacktrace information.
     *
     * @param throwable input object
     * @return full stacktrace of throwable object
     */
    public static String getExceptionStacktrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        throwable.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    /**
     * Returns the respective native object class name for a Java instance.
     *
     * @param instance The Java instance we want to get respective native class name for
     * @return The native class name
     */
    public static String getObjectClassName(Object instance) {
        Pointer peer;
        if (ObjCObject.class.isAssignableFrom(instance.getClass())) {
            peer = ((ObjCObject) instance).getPeer();
        } else {
            peer = ((ObjCObjectMapper) NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class)
                    .getObjectMapper()).getNativePeerOfProxyedObject(instance);
            if (peer == null) {
                throw new RuntimeException("No native object found for the Java instance!");
            }
        }
        if (isObjectString(peer.getPeer())) {
            return "NSString";
        }
        return getClassName(peer.getPeer());
    }

    /**
     * Casts an instance to a given Objective-C type with native transparency.
     *
     * @param <T> Objective-C class to cast to
     * @param instance The instance we want to cast
     * @param cls The desired type of the class
     * @return The new object with the given type
     */
    public static <T extends ObjCObject> T cast(Object instance, java.lang.Class<T> cls) {
        return cast(instance, cls, true);
    }

    /**
     * Casts an instance to a given Objective-C type with a given native transparency.
     *
     * @param <T> Objective-C class to cast to
     * @param instance The instance we want to cast
     * @param cls The desired type of the class
     * @param transparent If this is true, then native side will see only the original peer
     * @return The new object with the given type
     */
    public static <T extends ObjCObject> T cast(Object instance, java.lang.Class<T> cls, boolean transparent) {
        if (instance == null) {
            return null;
        }
        if (!ObjCObject.class.isAssignableFrom(instance.getClass())) {
            throw new UnsupportedOperationException("Only instances of ObjCObject are castable!");
        }

        final long peer = ((ObjCObject) instance).getPeer().getPeer();
        final long proxyPeer = createObjCCastProxy(peer, Class.fromJavaClass(cls).getPeerPointer(), transparent);

        JavaObjectConstructionInfo toObjCObjectInfo =
                NatJ.buildJavaObjectConstructionInfo(
                        NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), cls, null, null,
                        null, true, false, false);

        return (T) NatJ.toJava(proxyPeer, toObjCObjectInfo);
    }

    /**
     * Casts an instance to a given Objective-C protocol type with native transparency.
     *
     * @param <T> Objective-C class to cast to
     * @param instance The instance we want to cast
     * @param cls The desired type of the class
     * @return The new object with the given type
     */
    public static <T> T castToProtocol(Object instance, java.lang.Class<T> cls) {
        return castToProtocol(instance, cls, true);
    }

    /**
     * Casts an instance to a given Objective-C protocol with a given native transparency.
     *
     * @param <T> Objective-C class to cast to
     * @param instance The instance we want to cast
     * @param cls The desired type of the class
     * @param transparent If this is true, then native side will see only the original peer
     * @return The new object with the given type
     */
    public static <T> T castToProtocol(Object instance, java.lang.Class<T> cls, boolean transparent) {
        if (instance == null) {
            return null;
        }
        if (!ObjCObject.class.isAssignableFrom(instance.getClass())) {
            throw new UnsupportedOperationException("Only instances of ObjCObject are castable!");
        }
        if (!cls.isInterface() || !cls.isAnnotationPresent(ObjCProtocolName.class)) {
            throw new UnsupportedOperationException("Target type has to be an Objective-C protocol binding!");
        }

        final long peer = ((ObjCObject) instance).getPeer().getPeer();
        final long proxyPeer = createObjCCastProxy(peer, 0L, transparent);

        JavaObjectConstructionInfo toObjCObjectInfo =
                NatJ.buildJavaObjectConstructionInfo(
                        NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), cls, null, null,
                        null, true, false, false);

        return (T) NatJ.toJava(proxyPeer, toObjCObjectInfo);
    }

    /**
     * Casts an opaque pointer to a given Objective-C type.
     *
     * @param <T> Objective-C class to cast to
     * @param ptr The opaque pointer we want to cast
     * @param cls The desired type of the class
     * @return The new object with the given type
     */
    @SuppressWarnings("unchecked")
    public static <T extends ObjCObject> T cast(OpaquePtr ptr, java.lang.Class<T> cls) {
        JavaObjectConstructionInfo toObjCObjectInfo =
                NatJ.buildJavaObjectConstructionInfo(
                        NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), cls, null, null,
                        null, false, false, false);

        return (T) NatJ.toJava(ptr.getPeer().getPeer(), toObjCObjectInfo);
    }

    /**
     * Casts an Objective-C object to an opaque pointer.
     *
     * @param <T> opaque pointer type class to cast to
     * @param obj The Objective-C object we want to cast
     * @param cls The desired type of the class
     * @return The new opaque pointer with the given type
     */
    @SuppressWarnings("unchecked")
    public static <T extends OpaquePtr> T cast(ObjCObject obj, java.lang.Class<T> cls) {
        JavaObjectConstructionInfo toOpqquePtrInfo =
                NatJ.buildJavaObjectConstructionInfo(null, cls, null, null, null, false, false,
                        false);

        return (T) NatJ.toJava(obj.getPeer().getPeer(), toOpqquePtrInfo);
    }

    /**
     * Contains the type of the hierarchy root.
     */
    private static java.lang.Class<? extends ObjCObject> rootType = null;

    /**
     * Contains the root package for the current platform.
     */
    private static String platformRoot = null;

    /**
     * Returns the resolved hierarchy root type.
     *
     * @return Root type class
     */
    public static java.lang.Class<? extends ObjCObject> getHierarchyRootType() {
        if (rootType == null) {
            synchronized (ObjCRuntime.class) {
                if (rootType == null) {
                    try {
                        @SuppressWarnings("unchecked")
                        java.lang.Class<? extends ObjCObject> resolvedRootType =
                                (java.lang.Class<? extends ObjCObject>) java.lang.Class
                                        .forName(platformRoot + ".NSObject");
                        rootType = resolvedRootType;
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("NSObject class can not be found!", e);
                    } catch (ClassCastException e) {
                        throw new RuntimeException("NSObject class has inconsistent type!", e);
                    }
                }
            }
        }
        return rootType;
    }

    /**
     * Cache for resolved Objective-C classes.
     */
    private HashMap<Long, java.lang.Class<?>> resolvedObjCClasses =
            new HashMap<Long, java.lang.Class<?>>();

    /**
     * Contains the every packages of the of the SDK.
     */
    private Set<String> sdkPackages = new HashSet<String>();

    /**
     * Contains what packages to use when trying to resolve a class by the prefix of its name.
     */
    private SortedMap<String, Set<String>> preferablePackagesForPrefixes =
            new TreeMap<String, Set<String>>();

    /**
     * List of external packages that will be used when a class can not be resolved by any package
     * of {@link #sdkPackages}.
     */
    private Set<String> externalPackages = new HashSet<String>();

    /**
     * Handles an @{link org.moe.natj.objc.IFrameworkInitializer} instance.
     *
     * @param initializer Framework initializer
     */
    public void handleFrameworkInitializer(IFrameworkInitializer initializer) {
        Set<String> externals = initializer.getExternalPackages();
        if (externals != null) {
            synchronized (externalPackages) {
                externalPackages.addAll(externals);
            }
        }

        Map<String, Set<String>> preferables = initializer.getExternalPackagesAndPrefixes();
        if (preferables != null) {
            for (Map.Entry<String, Set<String>> entry : preferables.entrySet()) {
                addExternalPackagesForPrefix(entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * Adds an external package name.
     *
     * @param name Package name
     */
    public void addExternalPackage(String name) {
        synchronized (externalPackages) {
            externalPackages.add(name);
        }
    }

    /**
     * Adds external packages for a prefix.
     *
     * @param prefix Class name prefix
     * @param packages Package names
     */
    public void addExternalPackagesForPrefix(String prefix, Set<String> packages) {
        synchronized (preferablePackagesForPrefixes) {
            Set<String> oldPackages = preferablePackagesForPrefixes.get(prefix);

            HashSet<String> newPackages = new HashSet<String>();
            if (oldPackages != null) {
                newPackages.addAll(oldPackages);
            }
            newPackages.addAll(packages);

            preferablePackagesForPrefixes.put(prefix, newPackages);
        }
    }

    /**
     * Resolve Java class by Objective-C class.
     *
     * <p>
     * At failure it defaults to the hierarchy root type.
     *
     * @param cls The Objective-C class we want to resolve respective Java class for
     * @return The Java class
     */
    @SuppressWarnings("unchecked")
    public java.lang.Class<?> resolveObjCClass(long cls) {
        synchronized (resolvedObjCClasses) {
            java.lang.Class<?> javaClass = resolvedObjCClasses.get(cls);
            if (javaClass == null) {
                synchronized (preferablePackagesForPrefixes) {
                    synchronized (sdkPackages) {
                        synchronized (externalPackages) {
                            List<Long> resolvables = new LinkedList<Long>();
                            String name = getObjectDescription(cls);
                            {
                                resolvables.add(cls);
                                while (name.startsWith("_")) {
                                    cls = getClassParent(cls);
                                    javaClass = resolvedObjCClasses.get(cls);
                                    if (javaClass != null) {
                                        break;
                                    }
                                    resolvables.add(cls);
                                    name = getObjectDescription(cls);
                                }
                            }
                            if (javaClass == null) {
                                Set<String> packagesList = new HashSet<String>();
                                SortedMap<String, Set<String>> subMap =
                                        preferablePackagesForPrefixes;
                                for (int i = 0; i < name.length() && subMap.size() > 0; i++) {
                                    String subfix = name.substring(0, i + 1);
                                    String end = name.substring(0, i) + (char) (name.charAt(i) + 1);
                                    subMap = subMap.subMap(subfix, end);
                                    for (Map.Entry<String, Set<String>> entry : subMap.entrySet()) {
                                        if (entry.getKey().length() == i + 1) {
                                            packagesList.addAll(entry.getValue());
                                        }
                                    }
                                }
                                for (String pack : packagesList) {
                                    try {
                                        javaClass =
                                                (java.lang.Class<? extends ObjCObject>)
                                                java.lang.Class.forName(pack + "." + name);
                                        break;
                                    } catch (Exception ex) {
                                        // nothing
                                    }
                                }
                                if (javaClass == null) {
                                    for (String pack : sdkPackages) {
                                        if (!packagesList.contains(pack)) {
                                            try {
                                                javaClass =
                                                        (java.lang.Class<? extends ObjCObject>)
                                                        java.lang.Class.forName(pack + "." + name);
                                                break;
                                            } catch (Exception ex) {
                                                // nothing
                                            }
                                        }
                                    }
                                }
                                if (javaClass == null) {
                                    for (String pack : externalPackages) {
                                        if (!packagesList.contains(pack)
                                                && !sdkPackages.contains(pack)) {
                                            try {
                                                javaClass = (java.lang.Class<? extends ObjCObject>)
                                                        java.lang.Class.forName(pack + "." + name);
                                                break;
                                            } catch (Exception ex) {
                                                // nothing
                                            }
                                        }
                                    }
                                }
                                if (javaClass == null) {
                                    javaClass = resolveObjCClass(getClassParent(cls));
                                }
                            }
                            for (Long resolvable : resolvables) {
                                resolvedObjCClasses.put(resolvable,
                                        javaClass == null ? getHierarchyRootType() : javaClass);
                            }
                        }
                    }
                }
            }
            return javaClass == null ? getHierarchyRootType() : javaClass;
        }
    }

    /**
     * Cleans up after an Objective-C proxy.
     *
     * @param peer Proxy object
     */
    private void cleanupObjCProxy(Object peer) {
        ((ObjCObjectMapper) getObjectMapper()).cleanupObjCProxy(peer);
    }

    /**
     * Cleans up after an Objective-C block.
     *
     * @param peer Objective-C block
     * @param method Callback method
     */
    private void cleanupObjCBlock(Object peer, Method method) {
        ((ObjCCallbackMapper) getCallbackMapper()).cleanupObjCBlock(peer, method);
    }

    /**
     * Wrapper class for delaying some initializations.
     */
    private static class ObjCAssociation {

        /**
         * Construction info for creating native objects from Java instances.
         */
        public static NatJ.NativeObjectConstructionInfo associationInfo =
                createBuildInfoForAssociation();

        /**
         * Factory for creating construction info for associations.
         *
         * @return Construction info
         */
        private static NatJ.NativeObjectConstructionInfo createBuildInfoForAssociation() {
            try {
                return NatJ.buildNativeObjectConstructionInfo(
                        NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class),
                        Object.class, ObjCObjectMapper.class, null, false, false, true);
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * Helper class for creating construction infos for block associations.
         */
        @SuppressWarnings("all")
        private static class ObjCBlockInfo implements ObjCBlock {

            private String name;
            private java.lang.Class<?>[] argTypes;

            public ObjCBlockInfo(String name, java.lang.Class<?>[] argTypes) {

            }

            @Override
            public java.lang.Class<? extends Annotation> annotationType() {
                return ObjCBlock.class;
            }

            @Override
            public String name() {
                return name;
            }

            @Override
            public java.lang.Class<?>[] argTypes() {
                return argTypes;
            }

        }

        /**
         * Factory for creating construction info for making associations with Objective-C blocks.
         */
        public static NatJ.NativeObjectConstructionInfo createBuildInfoForBlockAssociation(
                String name, java.lang.Class<?>[] argTypes) {
            try {
                return NatJ.buildNativeObjectConstructionInfo(
                        NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class),
                        Object.class, ObjCObjectMapper.class, new ObjCBlockInfo(name, argTypes),
                        false, false, true);
            } catch (Exception e) {
                return null;
            }
        }

    }

    /**
     * Associates an object to an Objective-C object.
     *
     * <p>
     * The Objective-C object will retain the object for itself and it will release the object
     * when it gets deallocated.
     *
     * @param owner Object to associate with
     * @param instance Object to add
     */
    public static void associateObjCObject(long owner, Object instance) {
        // In some case the ObjCObjectMapper will use autorelease,
        // so we wrap this construction with one autorelease pool.
        long pool = createAutoreleasePool();
        long peer = NatJ.toNative(instance, ObjCAssociation.associationInfo);
        associateObjCObject(owner, peer);
        releaseAutoreleasePool(pool);
    }

    /**
     * Associates an object to an Objective-C object.
     *
     * <p>
     * The Objective-C object will retain the object for itself and it will release the object
     * when it gets deallocated.
     *
     * @param owner Object to associate with
     * @param instance Object to add
     */
    public static void associateObjCObject(ObjCObject owner, Object instance) {
        associateObjCObject(owner.getPeer().getPeer(), instance);
    }

    /**
     * Associates an object to an Objective-C object as an Objective-C Block.
     *
     * <p>
     * The Objective-C object will retain the object for itself and it will release the object
     * when it gets deallocated.
     *
     * @param owner Object to associate with
     * @param instance Object to add
     * @param name Block name
     * @param argTypes Block argument types
     */
    public static void associateObjCObject(long owner, Object instance, String name,
            java.lang.Class<?>[] argTypes) {
        // In some case the ObjCObjectMapper will use autorelease,
        // so we wrap this construction with one autorelease pool.
        long pool = createAutoreleasePool();
        long peer = NatJ.toNative(instance,
                ObjCAssociation.createBuildInfoForBlockAssociation(name, argTypes));
        associateObjCObject(owner, peer);
        releaseAutoreleasePool(pool);
    }

    /**
     * Associates an object to an Objective-C object as an Objective-C block.
     *
     * <p>
     * The Objective-C object will retain the object for itself and it will release the object
     * when it gets deallocated.
     *
     * @param owner Object to associate with
     * @param instance Object to add
     * @param name Block name
     * @param argTypes Block argument types
     */
    public static void associateObjCObject(ObjCObject owner, Object instance, String name,
            java.lang.Class<?>[] argTypes) {
        associateObjCObject(owner.getPeer().getPeer(), instance, name, argTypes);
    }

    /**
     * Removes an object from an Objective-C object's association list.
     *
     * <p>
     * If the object was associated with the Objective-C object then it will be removed
     * from the association list and released.
     *
     * @param owner Object to dissociate from
     * @param instance Object to remove
     */
    public static void dissociateObjCObject(long owner, Object instance) {
        // In some case the ObjCObjectMapper will use autorelease,
        // so we wrap this construction with one autorelease pool.
        long pool = createAutoreleasePool();
        long peer = NatJ.toNative(instance, ObjCAssociation.associationInfo);
        dissociateObjCObject(owner, peer);
        releaseAutoreleasePool(pool);
    }

    /**
     * Removes an object from an Objective-C object's association list.
     *
     * <p>
     * If the object was associated with the Objective-C object then it will be removed
     * from the association list and released.
     *
     * @param owner Object to dissociate from
     * @param instance Object to remove
     */
    public static void dissociateObjCObject(ObjCObject owner, Object instance) {
        dissociateObjCObject(owner.getPeer().getPeer(), instance);
    }

    /**
     * Removes an Objective-C block object from an Objective-C object's association list.
     *
     * <p>
     * If the object was associated with the Objective-C object then it will be removed
     * from the association list and released.
     *
     * @param owner Object to dissociate from
     * @param instance Object to remove
     * @param name Block name
     * @param argTypes Block argument types
     */
    public static void dissociateObjCObject(long owner, Object instance, String name,
            java.lang.Class<?>[] argTypes) {
        // In some case the ObjCObjectMapper will use autorelease,
        // so we wrap this construction with one autorelease pool.
        long pool = createAutoreleasePool();
        long peer = NatJ.toNative(instance,
                ObjCAssociation.createBuildInfoForBlockAssociation(name, argTypes));
        dissociateObjCObject(owner, peer);
        releaseAutoreleasePool(pool);
    }

    /**
     * Removes an Objective-C block object from an Objective-C object's association list.
     *
     * <p>
     * If the object was associated with the Objective-C object then it will be removed
     * from the association list and released.
     *
     * @param owner Object to dissociate from
     * @param instance Object to remove
     * @param name Block name
     * @param argTypes Block argument types
     */
    public static void dissociateObjCObject(ObjCObject owner, Object instance, String name,
            java.lang.Class<?>[] argTypes) {
        dissociateObjCObject(owner.getPeer().getPeer(), instance, name, argTypes);
    }

    /**
     * Returns the default unbox policy for variadic arguments.
     *
     * <p>
     * For Objective-C Runtime the policy is boxing, because this runtime does
     * have object types.
     *
     * @return The default unbox policy.
     */
    @Override
    public byte getDefaultUnboxPolicy() {
        return Variadic.Box;
    }

    /**
     * Base type for extra selector implementations for proxies.
     */
    public static class ProxyExtensionBase<T> {
        /**
         * Specifies the target object.
         */
        protected T target;

        /**
         * Single constructor that requires only the target object.
         */
        public ProxyExtensionBase(Object target) {
            this.target = (T)target;
        }

    }

    // -------------- Native methods -------------- //

    /**
     * Initializes the ObjCRuntime.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param instance ObjCRuntime singleton object
     */
    private static native void initialize(ObjCRuntime instance);

    /**
     * Process a Java class and register native methods.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param type The Java type we want to process
     * @return The Objective-C Class object
     */
    private static native long registerClass(java.lang.Class<?> type);

    /**
     * Retains an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param pointer The Objective-C object we want to retain
     */
    public static native void retainObject(long pointer);

    /**
     * Releases an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param pointer The Objective-C object we want to release
     */
    public static native void releaseObject(long pointer);

    /**
     * Autoreleases an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param pointer The Objective-C object we want to autorelease
     */
    public static native void autoreleaseObject(long pointer);

    /**
     * Tries to dispose the Objective-C peer of a given object
     *
     * <p>
     * This will invalidate the given object and thus further use may result in undefined behaviour.
     *
     * <p>
     * This will only work for objects originated from native side, namely:
     * Bindings, Native Blocks and Protocol Proxies.
     *
     * @param object The object of which we want to dispose the native peer
     */
    public static void disposeObject(Object object) {
        if (((ObjCCallbackMapper) NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class)
                .getCallbackMapper()).dispose(object)) {
            return;
        }
        if (((ObjCObjectMapper) NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class)
                .getObjectMapper()).dispose(object)) {
            return;
        }
    }

    /**
     * Constructs a Java string from an NSString instance.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param pointer The NSString instance we want to create Java string from
     * @return The Java string
     */
    public static native String createJavaString(long pointer);

    /**
     * Constructs an NSString instance from a Java string.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param string The Java string we want to create NSString instance from
     * @return The native string
     */
    public static native long createNativeString(String string);

    /**
     * Constructs an Objective-C class from a Java class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param type The Java class we want to create proxy for
     * @return The newly created Objective-C class
     */
    public static native long createProxyClass(java.lang.Class<?> type);

    /**
     * Constructs an Objective-C class from a Java class and adds implementations specified by extension.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param type The Java class we want to create proxy for
     * @param base Name of the base Objective-C class to be used as super class
     * @param extension The extension we want to use extra selectors from
     * @return The newly created Objective-C class
     */
    public static native long createProxyClassWithExtension(java.lang.Class<?> type, String base, java.lang.Class<? extends ProxyExtensionBase> extension);

    /**
     * Instantiates a proxy class for a Java instance.
     * Works only for classes we generate with Java_org_natj_objc_ObjCRuntime_createProxyClass().
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param type The Objective-C class object we want to instantiate
     * @param instance Java instance we want to create proxy object for
     * @return The Objective-C instance
     */
    public static native long createProxyInstance(long type, Object instance);

    /**
     * Creates Native block construction data for a Java method.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param method The Java method
     * @return The native block construction data pointer
     */
    public static native long createDataForNativeBlock(Object method);

    /**
     * Creates Native protocol proxy construction data for a Java interface
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param inter Tha Java interface
     * @return The native protocol proxy construction data pointer
     */
    public static native Object[] createDataForNativeProtocolProxy(java.lang.Class<?> inter);

    /**
     * Creates Java block construction data for a Java method.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param method The Java method
     * @return The Java block construction data pointer
     */
    public static native long createDataForJavaBlock(Object method);

    /**
     * Constructs an Objective-C block from a Java method.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param instance The Java instance we want to create native callback for
     * @param data The data pointer created by a call to createDataForJavaBlock()
     * @return The native callback
     */
    public static native long createNativeCallbackFromJavaInstance(Object instance, long data);

    /**
     * Constructs a Java instance from a given callback.
     * Works only with callbacks we create with createNativeCallbackFromJavaInstance().
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param callback The callback we want to create Java instance from
     * @return The Java instance
     */
    public static native Object getInstanceForJavaBlock(long callback);

    /**
     * Returns the Java instance associated with an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object we want to get Java instance from
     * @return The Java instance
     */
    public static native Object getJavaReferenceOfBindingObject(long peer);

    /**
     * Sets the Java instance associated with an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object we want to set the associated Java instance of
     * @param ref The Java instance we want to associate with the Objective-C object
     */
    public static native void setJavaReferenceOfBindingObject(long peer, Object ref);

    /**
     * Returns the custom Java instance associated with an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object we want to get Java instance from
     * @return The Java instance
     */
    public static native Object getJavaReferenceOfCustomObject(long peer);

    /**
     * Sets the custom Java instance associated with an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object we want to set the associated Java instance of
     * @param ref The Java instance we want to associate with the Objective-C object
     */
    public static native void setJavaReferenceOfCustomObject(long peer, Object ref);

    /**
     * Determines whether an Objective-C class is a runtime created inherited class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C class object
     * @return Whether the given class is a runtime created inherited class
     */
    public static native boolean isKindOfInheritedClass(long peer);

    /**
     * Determines whether an Objective-C class is a runtime created proxy class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C class object
     * @return Whether the given class is a runtime created proxy class
     */
    public static native boolean isKindOfProxyClass(long peer);

    /**
     * Determines whether an Objective-C class is a hybrid class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C class object
     * @return Whether the given class is a runtime created hybrid class
     */
    public static native boolean isKindOfHybridClass(long peer);

    /**
     * Gets description of an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object
     * @return The object description
     */
    public static native String getObjectDescription(long peer);

    /**
     * Returns the Objective-C class of an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C object we want to get the class of
     * @return The class of the Objective-C object
     */
    public static native long getObjectClass(long peer);

    /**
     * Returns the parent of an Objective-C class object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The Objective-C class object we want to get the parent of
     * @return The parent class
     */
    public static native long getClassParent(long object);

    /**
     * Looks up and returns Objective-C class by its name.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param name The name of the Objective-C class we want to get
     * @return The Objective-C class
     */
    public static native long getClassByName(String name);

    /**
     * Determines whether the given object is a string.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The object we want to check
     * @return Whether the object is a string
     */
    public static native boolean isObjectString(long object);

    /**
     * Determines whether the given object is a block.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The object we want to check
     * @return Whether the object is a block
     */
    public static native boolean isObjectBlock(long object);

    /**
     * Determines whether the given object is a stack block.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The object we want to check
     * @return Whether the object is a stack block
     */
    public static native boolean isStackBlock(long object);

    /**
     * Copies a native block.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The object we want to copy
     * @return The copied block
     */
    public static native long copyBlock(long object);

    /**
     * Returns the name of an Objective-C class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param peer The Objective-C class object we want to get the name of
     * @return The Objective-C class name
     */
    public static native String getClassName(long peer);

    /**
     * Gets the target of an actual initializer method call of the current thread.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @return The init call target
     */
    public static native Object getInitTargetOnCurrentThread();

    /**
     * Registers a selector by its name.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param string The name of the selector we want to register
     * @return The SEL object
     */
    public static native long registerSelector(String string);

    /**
     * Locks Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The Objective-C object we want to lock
     */
    public static native void lockObject(long object);

    /**
     * Unlocks Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The Objective-C object we want to unlock
     */
    public static native void unlockObject(long object);

    /**
     * Gets Java type for hybrid Objective-C class.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The Objective-C object we want to get the relevant Java class for
     * @return The relevant Java class
     */
    public static native java.lang.Class<?> getJavaTypeForHybridClass(long object);

    /**
     * Stores a weak reference to an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The Objective-C object we want to store weak reference for
     * @param location The address of the reference
     */
    public static native void storeWeak(long object, long location);

    /**
     * Loads a weak reference to an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param location The address of the reference
     * @return The referenced Objective-C object
     */
    public static native long loadWeak(long location);

    /**
     * Destroys a weak reference to an Objective-C object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param location The address of the reference
     */
    public static native void destroyWeak(long location);

    /**
     * Associates an object to an Objective-C object.
     *
     * <p>
     * The Objective-C object will retain the object for itself and it will release
     * the object when it gets deallocated.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The ObjCObject to which we want to associate the instance
     * @param instance The object we want to associate
     */
    public static native void associateObjCObject(long object, long instance);

    /**
     * Removes an object from an Objective-C object's association list.
     *
     * <p>
     * If the object was associated with the Objective-C object then it will be removed
     * from the association list and released.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param object The ObjCObject with which we want to dissociate the instance
     * @param instance The object we want to dissociate
     */
    public static native void dissociateObjCObject(long object, long instance);

    /**
     * Creates a new autorelease pool.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @return The newly created autorelease pool
     */
    public static native long createAutoreleasePool();

    /**
     * Releases an autorelease pool.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param pool The pool we want to release
     */
    public static native void releaseAutoreleasePool(long pool);

    /**
     * Executes the specified runnable in an autorelease pool.
     *
     * @param runnable Runnable to execute
     */
    public static void autoreleasepool(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        final long pool = createAutoreleasePool();
        try {
            runnable.run();
        } finally {
            releaseAutoreleasePool(pool);
        }
    }

    /**
     * Executes the specified callable in an autorelease pool.
     *
     * @param callable Callable to execute
     * @return Computed result
     * @throws Exception If unable to compute a result
     */
    public static <T> T autoreleasepool(Callable<T> callable) throws Exception {
        if (callable == null) {
            throw new NullPointerException();
        }
        final long pool = createAutoreleasePool();
        try {
            return callable.call();
        } finally {
            releaseAutoreleasePool(pool);
        }
    }

    /**
     * Forwards a call to a boolean native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native boolean forwardBooleanBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a byte native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native byte forwardByteBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a char native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native char forwardCharBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a short native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native short forwardShortBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a int native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native int forwardIntBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a long native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native long forwardLongBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a float native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native float forwardFloatBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a double native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native double forwardDoubleBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a void native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     */
    public static native void forwardVoidBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a Object native block.
     *
     * @param peer The block to call
     * @param data The native block data generated by a call to createDataForNativeBlock()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native Object forwardObjectBlockCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a boolean native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native boolean forwardBooleanProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a byte native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native byte forwardByteProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a char native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native char forwardCharProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a short native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native short forwardShortProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a int native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native int forwardIntProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a long native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native long forwardLongProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a float native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native float forwardFloatProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a double native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native double forwardDoubleProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a void native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     */
    public static native void forwardVoidProtocolCall(long peer, long data, Object[] args);

    /**
     * Forwards a call to a Object native protocol proxy.
     *
     * @param peer The native protocol peer
     * @param data The native protocol proxy data generated by a call to createDataForNativeProtocolProxy()
     * @param args The arguments of the call
     * @return The result of the call
     */
    public static native Object forwardObjectProtocolCall(long peer, long data, Object[] args);

    /**
     * Constructs a _NatJObjCCastProxy object for the specified peer.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param instance The instance of the proxy target
     * @param target The target ObjC class
     * @param transparent If this is true, then native side will see only the original peer
     * @return The _NatJObjCCastProxy instance peer
     */
    private static native long createObjCCastProxy(long instance, long target, boolean transparent);

    /**
     * Returns the peer of a _NatJObjCCastProxy object.
     *
     * <p>
     * Also documented in ObjCRuntime.h
     *
     * @param instance The instance of the proxy target
     * @return The peer of _NatJObjCCastProxy
     */
    public static native long getObjCCastProxyPeer(long instance);

    /**
     * Throw the given Java exception to native side
     *
     * @param ex The exception to throw
     */
    private static native void throwJavaExceptionToNative(Throwable ex);

    private static final Thread.UncaughtExceptionHandler crashHandler = new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread thread, Throwable ex) {
            ex.printStackTrace();

            // Throw the exception to native side. This should cause the app to crash
            // when calling from the thread uncaught exception handler.
            throwJavaExceptionToNative(ex);
        }
    };

    /**
     * Install a default uncaught exception handler that forces the app to natively crash
     * whenever a Java exception is uncaught.
     */
    public static void crashAppWhenExceptionUncaught() {
        Thread.setDefaultUncaughtExceptionHandler(crashHandler);
    }
}
