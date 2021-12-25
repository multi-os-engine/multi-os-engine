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

package org.moe.natj.general;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.map.ReferenceMapper;
import org.moe.natj.general.ptr.ConstVoidPtr;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The entry class of the NatJ library.
 */
public class NatJ {
    /*
     * Constant for identifying Darwin platforms.
     */
    private static final String OS_DARWIN = "Darwin";

    /*
     * Constant for identifying Windows platforms.
     */
    private static final String OS_WINDOWS = "Windows";

    /*
     * Current platform.
     */
    private static String currentOS;

    /*
     * Whether current runtime is Dalvik.
     */
    private static boolean isDalvik;

    /*
     * Dynamic library extension.
     */
    private static String dynlibExt;

    /*
     * Returns whether the current platform is Darwin.
     */
    private static boolean isDarwin() {
        return currentOS == OS_DARWIN;
    }

    /*
     * Returns whether the current platform is Windows.
     */
    private static boolean isWindows() {
        return currentOS == OS_WINDOWS;
    }

    /*
     * Returns whether the current runtime is Dalvik.
     */
    private static boolean isDalvik() {
        return isDalvik;
    }

    /**
     * Collection for caching runtime objects.
     */
    private static Map<Class<? extends NativeRuntime>, NativeRuntime> runtimes =
            new HashMap<Class<? extends NativeRuntime>, NativeRuntime>();

    /**
     * Collection used for marking runtimes that are being constructed to keep these runtimes from
     * being constructed multiple times.
     */
    private static Set<Class<? extends NativeRuntime>> runtimesUnderConstruction =
            new HashSet<Class<? extends NativeRuntime>>();

    /**
     * A placeholder runtime instance, used for registering a runtime as invalid;.
     */
    private static NativeRuntime invalidRuntime = new NativeRuntime(null, null, null) {
        @Override
        public void tryToDisposeCallback(Object callback) {
        }

        @Override
        protected void doRegistration(Class<?> type) {
        }

        @Override
        public byte getDefaultUnboxPolicy() {
            return Variadic.Runtime;
        }
    };

    /**
     * Used for NatJ to do initialization only at the first use.
     */
    private static boolean initialized = false;

    public static boolean is64Bit() {
        return CRuntime.POINTER_SIZE == 8;
    }

    /**
     * The reference mapper instance used for handling {@link ReferenceMapper} objects.
     */
    private static ReferenceMapper referenceMapper = null;

    /**
     * Returns the reference mapper instance.
     *
     * @return The reference mapper.
     */
    public static Mapper getReferenceMapper() {
        if (referenceMapper == null) {
            referenceMapper = new ReferenceMapper();
        }
        return referenceMapper;
    }

    /**
     * This initializes the NatJ only once.
     */
    private static void init() {
        if (!initialized) {
            synchronized (NatJ.class) {
                if (!initialized) {
                    try {
                        // Add hook to shutdown
                        java.lang.Runtime.getRuntime().addShutdownHook(new Thread() {
                            public void run() {
                                handleShutdown();
                            }
                        });

                        // Determine current platform
                        Properties props = System.getProperties();
                        String os_name = props.getProperty("os.name");
                        if (os_name == null) {
                            throw new RuntimeException("There is no system property with OS name.");
                        }

                        String os_name_lowercase = os_name.toLowerCase();
                        if (os_name_lowercase.contains("windows")) {
                            currentOS = OS_WINDOWS;
                            dynlibExt = "dll";
                        } else if (os_name_lowercase.contains("darwin")
                                || os_name_lowercase.contains("mac")) {
                            currentOS = OS_DARWIN;
                            dynlibExt = "dylib";
                        } else {
                            dynlibExt = "so";
                        }

                        // In the Dalvik-on-Darwin case NatJ will be statically linked
                        String java_vm_name = props.getProperty("java.vm.name");
                        isDalvik = "Dalvik".equals(java_vm_name);
                        if (isDalvik()) {
                            if (isDarwin()) {
                                System.load("NatJ");
                            } else {
                                System.loadLibrary("natj");
                            }
                        } else {
                            lookUpLibrary("natj", true);
                        }
                        initialized = true;
                        initialize();
                    } catch (RuntimeException e) {
                        System.out.println("[ERROR] Cannot initialize NatJ");
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Registers a runtime.
     *
     * @param runtimeClass The runtime we want to register.
     */
    public static void registerRuntime(Class<? extends NativeRuntime> runtimeClass) {
        init();
        synchronized (runtimes) {
            // Invoking the constructor might invoke the static initializer that would cause a
            // recursive call to the method called below ending up with a redundant instantiation
            // of the given runtime class.
            if (!runtimesUnderConstruction.contains(runtimeClass)) {
                getOrCreateInstanceOfRuntimeClass(runtimeClass);
            }
        }
    }

    /**
     * Registers a class with its determined runtime.
     *
     * <p>
     * Usable from static initializers:
     * {@code
     * class MyClass {
     *     static {
     *         NatJ.register();
     *     }
     *     // ...
     * }
     * }
     *
     * <p>
     * At first use it initializes NatJ.
     * Loads the library specified by a {@link Library} annotation, if found any.
     * Determines the responsible runtime with {@link #getRuntime(Class, boolean)} and uses it for
     * registering the class.
     */
    public static void register() {
        init();

        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        if (stackTrace.length < 2) {
            throw new RuntimeException("No useful stack trace: cannot register class.");
        }
        String name = stackTrace[1].getClassName();
        try {
            Class<?> type = Class.forName(name);

            if (!NativeObject.class.isAssignableFrom(type) && name.endsWith("$")
                    && stackTrace.length > 3) {
                type = Class.forName(stackTrace[3].getClassName());
            }

            Library lann = type.getAnnotation(Library.class);
            if (lann != null) {
                lookUpLibrary(lann.value(), true);
            }

            NativeRuntime runtime = getRuntime(type, true);
            if (runtime != null) runtime.doRegistration(type);

        } catch (Exception ex) {
            throw new RuntimeException("Failed to register class " + name, ex);
        }
    }

    /**
     * Returns an instance for a runtime class with using a cache.
     *
     * @param runtimeClass The runtime class we want to get instance for.
     * @return The instance of the runtime class.
     */
    public static NativeRuntime getOrCreateInstanceOfRuntimeClass(
            Class<? extends NativeRuntime> runtimeClass) {
        synchronized (runtimes) {
            NativeRuntime runtime = runtimes.get(runtimeClass);
            if (runtime == invalidRuntime) {
                throw new RuntimeException("Invalid runtime for type " + runtimeClass.getName() +
                        " was found");
            } else if (runtime == null) {
                try {
                    Constructor<? extends NativeRuntime> constructor = runtimeClass
                            .getDeclaredConstructor();
                    constructor.setAccessible(true);
                    runtimesUnderConstruction.add(runtimeClass);
                    try {
                        runtime = constructor.newInstance();
                    } finally {
                        runtimesUnderConstruction.remove(runtimeClass);
                    }
                    runtimes.put(runtimeClass, runtime);

                } catch (Throwable ex) {
                    runtime = invalidRuntime;
                    runtimes.put(runtimeClass, runtime);

                    throw new RuntimeException("Exception during instantiation of runtime with type "
                            + runtimeClass.getName(), ex);
                }
            }
            return runtime;
        }
    }

    /**
     * Cache for storing class-runtime pairs.
     */
    private static final ConcurrentHashMap<Class<?>, Class<? extends NativeRuntime>> CLASS_RUNTIME_CACHE =
            new ConcurrentHashMap<Class<?>, Class<? extends NativeRuntime>>();

    /**
     * Determines the runtime of the class by looking for a {@link Runtime}
     * annotation of the class or its ascendants and interfaces.
     *
     * @param type The class we want to determine the responsible runtime for
     * @return The determined responsible runtime class
     */
    private static Class<? extends NativeRuntime> getRuntimeClass(Class<?> type) {
        if (type == null) {
            return null;
        }
        Class<? extends NativeRuntime> nativeRuntime = CLASS_RUNTIME_CACHE.get(type);
        if (nativeRuntime == null) {
            nativeRuntime = getRuntimeClassNoCache(type);
            if (nativeRuntime != null) {
                CLASS_RUNTIME_CACHE.putIfAbsent(type, nativeRuntime);
            }
        }
        return nativeRuntime;
    }

    /**
     * Determines the runtime of the class by looking for a {@link Runtime}
     * annotation of the class or its ascendants and interfaces.
     *
     * @param type The class we want to determine the responsible runtime for
     * @return The determined responsible runtime class
     */
    private static Class<? extends NativeRuntime> getRuntimeClassNoCache(Class<?> type) {
        Class<? extends NativeRuntime> runtimeClass = null;
        boolean isAnnotation = type.isAnnotation();
        while (type != null) {
            Runtime rann = type.getAnnotation(Runtime.class);
            if (rann != null) {
                runtimeClass = rann.value();
                break;
            }
            if (isAnnotation) {
                break;
            }
            for (Annotation anno : type.getAnnotations()) {
                runtimeClass = getRuntimeClassNoCache(anno.annotationType());
                if (runtimeClass != null) {
                    break;
                }
            }
            for (Class<?> inter : type.getInterfaces()) {
                runtimeClass = getRuntimeClassNoCache(inter);
                if (runtimeClass != null) {
                    break;
                }
            }
            if (runtimeClass != null) {
                break;
            }
            type = type.getSuperclass();
        }
        return runtimeClass;
    }

    /**
     * Determines the runtime of the class by looking for a {@link Runtime}
     * annotation of the class or its ascendants and interfaces.
     * Cache every new runtime instance.
     *
     * @param type The class we want to determine the responsible runtime for
     * @param def If this is true, then it will default to CRuntime if no runtime found in the
     *     hierarchy
     * @return The determined responsible runtime
     */
    private static NativeRuntime getRuntime(Class<?> type, boolean def) {
        NativeRuntime runtime = null;
        Class<? extends NativeRuntime> runtimeClass = getRuntimeClass(type);
        if (def && runtimeClass == null) {
            runtimeClass = CRuntime.class;
        }
        if (runtimeClass != null) {
            runtime = getOrCreateInstanceOfRuntimeClass(runtimeClass);
        }
        return runtime;
    }

    /**
     * Collection for caching any resolved library name.
     */
    private static Map<String, String> resolvedLibraries = new HashMap<String, String>();

    /**
     * Looks up a library by its name in the file system.
     *
     * <p>
     * Uses {@link #resolvedLibraries} for caching to avoid looking up the same library for
     * multiple times.
     *
     * @param name The library name we want to resolve a path for
     * @param load If this is true and the lookup resulted in a success, then it will load the
     *     library
     * @return The resolved path of the library
     */
    protected static String lookUpLibrary(String name, boolean load) {

        synchronized (resolvedLibraries) {
            {
                String path = resolvedLibraries.get(name);
                if (path != null) {
                    return path == "" ? null : path;
                }
            }

            {
                String path = System.getenv(name.toUpperCase() + "_LIBRARY");
                if (path != null) {
                    resolvedLibraries.put(name, path);
                    if (load) {
                        System.load(path);
                    }
                    return path;
                }
            }

            {
                String values = System.getProperty("java.library.path");
                if (values != null) {
                    String[] paths = values.split(File.pathSeparator);
                    for (String value : paths) {
                        File file = new File(value, "lib" + name + "." + dynlibExt);
                        if (file.isFile()) {
                            String path;
                            try {
                                path = file.getCanonicalPath();
                            } catch (IOException e) {
                                path = file.getAbsolutePath();
                            }
                            resolvedLibraries.put(name, path);
                            if (load) {
                                System.load(path);
                            }
                            return path;
                        }
                    }
                    if (isDarwin()) {
                        for (String value : paths) {
                            File file = new File(value, name + ".framework/" + name);
                            if (file.isFile()) {
                                String path;
                                try {
                                    path = file.getCanonicalPath();
                                } catch (IOException e) {
                                    path = file.getAbsolutePath();
                                }
                                resolvedLibraries.put(name, path);
                                if (load) {
                                    System.load(path);
                                }
                                return path;
                            }
                        }
                    }
                }
            }

            if (isDarwin()) {
                for (String path : new String[] {
                        "/System/Library/Frameworks/" + name + ".framework"
                }) {
                    String exec_path = path + "/" + name;
                    File file = new File(path);
                    if (file.exists() && file.isDirectory()) {
                        /* Framework bundle was found.
                         * Assume that executable file with same name is exist at least
                         * in cache and dynamic link editor (dyld) can to load it.
                         *
                         * Reason: The problem was detect for iOS devices where standard
                         * system frameworks exist ONLY in cache and we cannot find
                         * separate framework executable on file system but we can load it
                         * by name.
                         */
                        resolvedLibraries.put(name, exec_path);
                        if (load) {
                            boolean res = loadFramework(exec_path);
                            if (!res) throw new RuntimeException(
                                    "Cannot load executable file from system framework " + path );
                        }
                        return exec_path;
                    } else if (load) {
                        // On ios simulator the framework path is dynamic based on the location of the Xcode,
                        // so we cannot reliably determine if the framework exists, and we have to just try
                        // loading the framework and if it succeeded then we assume it exist.
                        boolean res = loadFramework(exec_path);
                        if (res) {
                            resolvedLibraries.put(name, exec_path);
                            return exec_path;
                        }
                    }
                }
            } else if (isDalvik()) {
                String path = null;
                try {
                    ClassLoader loader = NatJ.class.getClassLoader();
                    path = (String)loader.getClass().getMethod("findLibrary", String.class).invoke(loader, name);
                } catch (Exception ex) {}
                if (path != null) {
                    File file = new File(path);
                    if (file.exists() && file.isFile()) {
                        resolvedLibraries.put(name, path);
                        if (load) {
                            System.load(path);
                        }
                        return path;
                    }
                }
            }

            if (!isWindows()) {
                for (String prefix : new String[] {
                        "/usr/lib/lib", "/usr/lib32/lib", "/usr/lib64/lib"
                }) {
                    String path = prefix + name + "." + dynlibExt;
                    File file = new File(path);
                    if (file.exists() && file.isFile()) {
                        resolvedLibraries.put(name, path);
                        if (load) {
                            System.load(path);
                        }
                        return path;
                    }
                }
            }

            resolvedLibraries.put(name, "");
        }

        return null;
    }

    /**
     * Fast hash for references.
     */
    private static long id(Object obj) {
        return ((0xcafebabeL << 32) | (System.identityHashCode(obj) & 0xffffffffL) | 1)
                & (CRuntime.POINTER_SIZE == 4 ? 0xffffffffL : 0xffffffffffffffffL);
    }

    /**
     * Collection for strong references.
     */
    private static HashMap<Long, Object> strongReferences = new HashMap<Long, Object>();

    /**
     * Adds a strong reference.
     */
    private static long addStrongReference(Object reference) {
        if (reference == null) {
            return 0L;
        }

        long nextId = id(reference);

        synchronized (strongReferences) {
            while (strongReferences.containsKey(nextId)) {
                ++nextId;
            }
            strongReferences.put(nextId, reference);
        }

        return nextId;
    }

    /**
     * Removes a strong reference.
     */
    private static boolean removeStrongReference(long key) {
        if (key == 0L) {
            return false;
        }
        synchronized (strongReferences) {
            return strongReferences.remove(key) != null;
        }
    }

    /**
     * Gets a strong reference.
     */
    private static Object getStrongReference(long key) {
        if (key == 0L) {
            return null;
        }
        synchronized (strongReferences) {
            return strongReferences.get(key);
        }
    }

    /**
     * Collection for weak references.
     */
    private static HashMap<Long, WeakReference<Object>> weakReferences =
        new HashMap<Long, WeakReference<Object>>();

    /**
     * Adds a weak reference.
     */
    private static long addWeakReference(Object reference) {
        if (reference == null) {
            return 0L;
        }

        long nextId = id(reference);
        WeakReference<Object> weakReference = new WeakReference<Object>(reference);

        synchronized (weakReferences) {
            while (weakReferences.containsKey(nextId)) {
                ++nextId;
            }
            weakReferences.put(nextId, weakReference);
        }

        return nextId;
    }

    /**
     * Removes a weak reference.
     */
    private static boolean removeWeakReference(long key) {
        if (key == 0L) {
            return false;
        }
        synchronized (weakReferences) {
            return weakReferences.remove(key) != null;
        }
    }

    /**
     * Gets a weak reference.
     */
    private static Object getWeakReference(long key) {
        if (key == 0L) {
            return null;
        }
        WeakReference<Object> weakReference;
        synchronized (weakReferences) {
            weakReference = weakReferences.get(key);
        }
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /**
     * Iterates over every cached runtime and tells them to dispose callbacks for the given
     * instance.
     *
     * @param callback The instance we want to do callback disposing for
     */
    public static void disposeFunctionPtr(Object callback) {
        synchronized (runtimes) {
            for (Map.Entry<Class<? extends NativeRuntime>, NativeRuntime> runtimeEntry : runtimes
                    .entrySet()) {
                runtimeEntry.getValue().tryToDisposeCallback(callback);
            }
        }
    }

    /**
     * Interface used for cache construction through the NatJ interface.
     */
    public interface CacheConstructor {
        public Object constructCache();
    }

    /**
     * Determines whether the first class is a super class of the other.
     *
     * @param superCls The super class
     * @param subCls The sub class
     * @return Whether the first class is a super class of the other
     */
    private static boolean isSuperClassOf(java.lang.Class<?> superCls, java.lang.Class<?> subCls) {
        try {
            subCls.asSubclass(superCls);
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    /**
     * Optionally creates a cache for a given instance then returns it.
     *
     * <p>
     * If the {@code instance} has a {@code __natjCache} field and it's not initialized,
     * then it will save a hash map in it to be able to store cache for every runtime.
     * If a cache found for the {@code runtime}, then it will return it, otherwise,
     * it will create one by the given {@code constructor} and store it in the cache for the
     * {@code runtimeClass} and return it. If there are no {@code __natjCache} fields to use, then
     * this will return {@code null} to tell the caller there are no caching capabilities of the
     * {@code instance}.
     *
     * @param runtimeClass For which runtime we want to get the cache
     * @param instance Of which object we want to get the cache
     * @param constructor Cache factory implementation
     * @return The cache, nil if creation was not possible
     */
    @SuppressWarnings("unchecked")
    public static Object getOrCreateObjectCacheForRuntime(
            Class<? extends NativeRuntime> runtimeClass, Object instance,
            CacheConstructor constructor) {
        try {
            Field cacheField = instance.getClass().getDeclaredField("__natjCache");
            cacheField.setAccessible(true);
            Object value = null;
            if (isSuperClassOf(cacheField.getType(), HashMap.class)) {
                Object fieldValue = cacheField.get(instance);
                HashMap<Class<? extends NativeRuntime>, Object> cache;
                if (fieldValue != null && fieldValue instanceof HashMap<?, ?>) {
                    cache = (HashMap<Class<? extends NativeRuntime>, Object>) fieldValue;
                    value = cache.get(runtimeClass);
                } else {
                    cache = new HashMap<Class<? extends NativeRuntime>, Object>();
                    cacheField.set(instance, cache);
                }
                if (value == null && constructor != null) {
                    value = constructor.constructCache();
                    cache.put(runtimeClass, value);
                }
            }
            return value;
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Returns cache for the given instance.
     *
     * <p>
     * If a cache found for the {@code runtime}, then it will return it, otherwise null will be
     * returned.
     *
     * @param runtimeClass For which runtime we want to get the cache
     * @param instance Of which object we want to get the cache
     * @return The cache, nil if creation was not possible
     */
    @SuppressWarnings("unchecked")
    public static Object getObjectCacheForRuntime(Class<? extends NativeRuntime> runtimeClass,
            Object instance) {
        try {
            Field cacheField = instance.getClass().getDeclaredField("__natjCache");
            cacheField.setAccessible(true);
            Object value = null;
            if (isSuperClassOf(cacheField.getType(), HashMap.class)) {
                Object fieldValue = cacheField.get(instance);
                if (fieldValue != null && fieldValue instanceof HashMap<?, ?>) {
                    HashMap<Class<? extends NativeRuntime>, Object> cache =
                            (HashMap<Class<? extends NativeRuntime>, Object>) fieldValue;
                    value = cache.get(runtimeClass);
                }
            }
            return value;
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Returns and deletes cache for {@code runtime} of the {@code instance}.
     *
     * @param runtimeClass The runtime we want to get and delete cache for
     * @param instance The instance we want to get and delete cache of
     * @return The cache
     */
    @SuppressWarnings("unchecked")
    public static Object getAndRemoveObjectCacheForRuntime(
            Class<? extends NativeRuntime> runtimeClass, Object instance) {
        try {
            Field cacheField = instance.getClass().getDeclaredField("__natjCache");
            cacheField.setAccessible(true);
            Object fieldValue = cacheField.get(instance);
            Object value = null;
            if (fieldValue != null && fieldValue instanceof HashMap<?, ?>) {
                HashMap<Class<? extends NativeRuntime>, Object> cache =
                        (HashMap<Class<? extends NativeRuntime>, Object>) fieldValue;
                value = cache.remove(runtimeClass);
            }
            return value;
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Lookups a method in a class by its given name and argument types,
     * and computes the method's index and the method count.
     *
     * @param cls The class in we want to do the lookup
     * @param name The method name to lookup
     * @param argTypes The method argument types
     * @param idxRef Out argument to return the computed index
     * @param countRef Out argument to return the method count
     * @return The method
     */
    public static Method getMethod(Class<?> cls, String name, java.lang.Class<?>[] argTypes,
            int[] idxRef, int[] countRef) {
        if (name == null) {
            return null;
        }

        int idx;
        int count;
        Method[] methods = cls.getDeclaredMethods();
        count = methods.length;

        for (idx = 0; idx < count; idx++) {
            Method meth = methods[idx];
            if (!meth.isSynthetic()
                    && meth.getName().equals(name)
                    && ((argTypes == null)
                            || (argTypes.length == 1 && argTypes[0] == void.class) || Arrays
                                .equals(meth.getParameterTypes(), argTypes))) {
                if (idxRef != null) {
                    idxRef[0] = idx;
                }
                if (countRef != null) {
                    countRef[0] = count;
                }
                return meth;
            }
        }
        return null;
    }

    /**
     * Computes index for a method.
     *
     * @param method The method we want to get the index of
     * @return The method index
     */
    public static int getMethodIndex(Method method) {
        Method[] methods = method.getDeclaringClass().getDeclaredMethods();
        for (int i = 0, n = methods.length; i < n; i++) {
            if (methods[i].equals(method)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Determines whether a class is a kind of a boxed type, like Integer, Boolean, etc.
     *
     * @param type The type to check.
     * @return Whether the given type is a boxed one.
     */
    public static boolean isBoxedPrimitiveType(Class<?> type) {
        return type == Boolean.class || type == Byte.class || type == Character.class
                || type == Short.class || type == Integer.class || type == Long.class
                || type == Float.class || type == Double.class;
    }

    /**
     * Class used for storing every information needed when constructing a Java value from a
     * native one.
     */
    public static class JavaObjectConstructionInfo {
        /** The type to convert. */
        public Class<?> type;

        /** Extra information for callbacks. */
        public Object callback;

        /** Specifies the ownership of the value, used for memory management. */
        public boolean owned;

        /** Specifies whether the value passed by reference or value. */
        public boolean byvalue;

        /** Specifies whether this is a conversion for an argument value. */
        public boolean arg;

        /** Specifies whether this is a conversion for a reference. */
        public boolean ref;

        /** User data for custom use. */
        public Object data;

        /** Specifies which mapper to use. */
        public Mapper mapper;
    }

    /**
     * Class used for storing every information needed when constructing a native value from a
     * Java one.
     */
    public static class NativeObjectConstructionInfo {
        /** Extra information for callbacks. */
        public Object callback;

        /** Specifies the ownership of the value, used for memory management. */
        public boolean owned;

        /** Specifies whether the value passed by reference or value. */
        public boolean byvalue;

        /** Specifies whether this is a conversion for an argument value. */
        public boolean arg;

        /** Specifies whether this is a conversion for a reference. */
        public boolean ref;

        /** User data for custom use. */
        public Object data;

        /** Specifies which mapper to use. */
        public Mapper mapper;
    }

    public static Annotation[][] getParameterAnnotationsInherited(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 0) {
            return new Annotation[0][];
        }

        List<List<Annotation>> results = new ArrayList<>(parameterTypes.length);
        for (int i = 0; i < parameterTypes.length; i++) {
            results.add(new ArrayList<Annotation>());
        }

        ArrayList<Class<?>> supers = new ArrayList<>();
        // First get annotations from interfaces
        Class<?> methodDeclaredKlass = method.getDeclaringClass();
        Class<?>[] interfaces = methodDeclaredKlass.getInterfaces();
        supers.addAll(Arrays.asList(interfaces));
        // Then super class
        Class<?> superClass = methodDeclaredKlass.getSuperclass();
        if (superClass != null) {
            supers.add(superClass);
        }

        for (Class<?> c : supers) {
            // Find method
            try {
                for (Method sm : c.getDeclaredMethods()) {
                    int modifiers = sm.getModifiers();
                    if (Modifier.isStatic(modifiers)
                            || Modifier.isPrivate(modifiers)
                            || Modifier.isFinal(modifiers)) {
                        continue;
                    }

                    if (method.getName().equals(sm.getName()) && Arrays.equals(parameterTypes, sm.getParameterTypes())) {
                        int idx = 0;
                        for (Annotation[] annotations : sm.getParameterAnnotations()) {
                            results.get(idx).addAll(Arrays.asList(annotations));
                            idx++;
                        }
                        break;
                    }
                }
            } catch (Throwable e) {
                // Do nothing
            }
        }

        // Finally add annotations from current method
        int idx = 0;
        for (Annotation[] annotations : method.getParameterAnnotations()) {
            results.get(idx).addAll(Arrays.asList(annotations));
            idx++;
        }

        // Convert list to array
        Annotation[][] resultArray = new Annotation[parameterTypes.length][];
        for (int i = 0; i < parameterTypes.length; i++) {
            List<Annotation> al = results.get(i);
            Annotation[] aa = new Annotation[al.size()];
            aa = al.toArray(aa);
            resultArray[i] = aa;
        }
        return resultArray;
    }

    /**
     * Constructs a {@link JavaObjectConstructionInfo} instance.
     *
     * <p>
     * The responsible runtime determined by the following simplified formula:
     * {@code
     * runtime = (mapperClass != null ? getRuntime(mapperClass) : getRuntime(type));
     * runtime = runtime != null ? runtime : defaultRuntime;
     * }
     *
     * @param defaultRuntime Runtime used when the runtime can not be determined
     * @param type The type to convert
     * @param mapperClass Specifies the mapper class to use
     * @param callback Extra information for callbacks
     * @param typeInfo Type information for reference types
     * @param owned Specifies the ownership
     * @param byvalue Specifies whether it is for a by-value value
     * @param arg Specifies whether it is for an argument
     * @return The constructed {@link JavaObjectConstructionInfo} instance
     */
    public static JavaObjectConstructionInfo buildJavaObjectConstructionInfo(
            NativeRuntime defaultRuntime, Class<?> type,
            Class<?> mapperClass, Annotation callback, Object typeInfo, boolean owned,
            boolean byvalue, boolean arg) {
        JavaObjectConstructionInfo info = new JavaObjectConstructionInfo();
        info.owned = owned;
        info.arg = arg;
        info.type = type;
        info.callback = callback;
        info.data = null;
        info.byvalue = byvalue;

        if (ConstVoidPtr.class.isAssignableFrom(type)) {
            info.ref = true;
            info.mapper = getReferenceMapper();
            info.data = new Object[] {
                    typeInfo, null
            };
        } else {
            info.ref = false;
            if (mapperClass == null) {
                if (callback != null) {
                    NativeRuntime runtime = getRuntime(callback.annotationType(), true);
                    info.mapper = runtime == null ? null : runtime.getCallbackMapper();

                } else if (String.class == type) {
                    info.mapper = defaultRuntime == null ? null : defaultRuntime.getStringMapper();

                } else {
                    NativeRuntime runtime = getRuntime(type, false);
                    if (runtime == null) {
                        runtime = defaultRuntime;
                    }
                    info.mapper = runtime == null ? null : runtime.getObjectMapper();
                }
            } else {
                NativeRuntime runtime = getRuntime(mapperClass, true);
                if (runtime != null) {
                    info.mapper = runtime.getMapper(mapperClass);
                }
            }
        }

        return info;
    }

    /**
     * Constructs a {@link NativeObjectConstructionInfo} instance.
     *
     * @param defaultRuntime Runtime used when the runtime can not be determined by the {@code type}
     * @param type The type to convert
     * @param mapperClass Specifies the mapper class to use
     * @param callback Extra information for callbacks
     * @param owned Specifies the ownership
     * @param byvalue Specifies whether it is for a by-value value
     * @param arg Specifies whether it is for an argument
     * @return The constructed {@link NativeObjectConstructionInfo} instance
     */
    public static NativeObjectConstructionInfo buildNativeObjectConstructionInfo(
            NativeRuntime defaultRuntime, Class<?> type,
            Class<?> mapperClass, Annotation callback, boolean owned, boolean byvalue,
            boolean arg) {
        NativeObjectConstructionInfo info = new NativeObjectConstructionInfo();
        info.owned = owned;
        info.arg = arg;
        info.callback = callback;
        info.byvalue = byvalue;

        if (ConstVoidPtr.class.isAssignableFrom(type)) {
            info.ref = true;
            info.mapper = getReferenceMapper();
        } else {
            info.ref = false;
            if (mapperClass == null) {
                if (callback != null) {
                    NativeRuntime runtime = getRuntime(callback.annotationType(), true);
                    if (runtime != null) {
                        info.mapper = runtime.getCallbackMapper();
                    }

                } else if (String.class == type) {
                    info.mapper = defaultRuntime == null ? null : defaultRuntime.getStringMapper();
                } else {
                    NativeRuntime runtime = getRuntime(type, false);
                    if (runtime == null) {
                        runtime = defaultRuntime;
                    }
                    info.mapper = runtime == null ? null : runtime.getObjectMapper();
                }
            } else {
                NativeRuntime runtime = getRuntime(mapperClass, true);
                if (runtime != null) {
                    info.mapper = runtime.getMapper(mapperClass);
                }
            }
        }

        return info;
    }

    /**
     * Forwards to {@code info.mapper}.
     *
     * @param peer The native pointer pointing to the object we want to convert.
     * @param info The conversion info.
     * @return The Java peer.
     */
    public static Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (info.mapper == null) {
            return null;
        }
        return info.mapper.toJava(peer, info);
    }

    /**
     * Forwards to {@code info.mapper}.
     *
     * @param instance The Java object we want to convert.
     * @param info The conversion info.
     * @return The native pointer pointing to the native peer.
     */
    public static long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (info.mapper == null) {
            return 0L;
        }
        return info.mapper.toNative(instance, info);
    }

    // -------------- Native methods -------------- //

    /**
     * Initializes NatJ.
     *
     * <p>
     * Also documented in NatJ.h
     */
    private static native void initialize();

    /**
     * Handles JVM shutdown.
     *
     * <p>
     * Also documented in NatJ.h
     */
    private static native void handleShutdown();

    /**
     * Returns the platform name.
     *
     * <p>
     * Also documented in NatJ.h
     *
     * @return The platform name.
     */
    public static native String getPlatformName();

    /**
     * Try to load framework.
     * Should be applied only for darwin OS.
     *
     * @param path The full path to framework executable file
     *
     * @return Status of loading. True for cussess and false for
     * all other cases
     */
    public static native boolean loadFramework(String path);
}
