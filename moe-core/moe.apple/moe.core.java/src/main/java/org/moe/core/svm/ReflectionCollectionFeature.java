package org.moe.core.svm;

import SQLite.Authorizer;
import SQLite.Backup;
import SQLite.Blob;
import SQLite.BusyHandler;
import SQLite.Callback;
import SQLite.Database;
import SQLite.Exception;
import SQLite.Function;
import SQLite.FunctionContext;
import SQLite.JDBC2z1.JDBCConnection;
import SQLite.JDBCDriver;
import SQLite.Profile;
import SQLite.ProgressHandler;
import SQLite.Stmt;
import SQLite.Trace;
import SQLite.Vm;
import org.graalvm.nativeimage.AnnotationAccess;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeJNIAccess;
import org.graalvm.nativeimage.hosted.RuntimeProxyCreation;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.OpaquePtr;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.Mapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeException;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.NativeRuntime;
import org.moe.natj.general.NilException;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.UnSupportedAnnotationException;
import org.moe.natj.general.VariadicArg;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Callable;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.WCharT;
import org.moe.natj.objc.IFrameworkInitializer;
import org.moe.natj.objc.ObjCException;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ObjCSelectorsFinder;
import org.moe.natj.objc.ann.CategoryClassMethod;
import org.moe.natj.objc.ann.InstanceVariable;
import org.moe.natj.objc.ann.NotImplemented;
import org.moe.natj.objc.ann.ObjCCategory;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.org.objectweb.asm.Type;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.Buffer;

public class ReflectionCollectionFeature implements Feature {

    private static final Class<?>[] NATJ_ANNOTATION_CLASSES = { ByValue.class, Library.class, Runtime.class, Mapped.class,
            MappedReturn.class, Owned.class, ReferenceInfo.class, Callable.class, NFloat.class, NUInt.class, NInt.class,
            NLong.class, NULong.class, WCharT.class, Selector.class, CategoryClassMethod.class, InstanceVariable.class,
            NotImplemented.class, Property.class, ObjCClassBinding.class, ObjCClassName.class, ObjCProtocolName.class,
            ObjCCategory.class, ProtocolClassMethod.class, Structure.class, StructureField.class, CFunction.class, CVariable.class
    };

    private static final Class<?>[] JAVA_SQLITE_UPCALL_INTERFACES = { Authorizer.class, BusyHandler.class, Callback.class,
            Function.class, Profile.class, ProgressHandler.class, Trace.class
    };

    private void registerNatJ(BeforeAnalysisAccess access) {
        try {
            RuntimeJNIAccess.register(Buffer.class.getDeclaredMethod("position"));
            RuntimeJNIAccess.register(Type.class.getDeclaredMethod("getMethodDescriptor", Method.class));

            RuntimeJNIAccess.register(NatJ.class.getDeclaredMethods());
            RuntimeJNIAccess.register(NativeRuntime.class.getDeclaredMethod("getDefaultUnboxPolicy"));
            RuntimeJNIAccess.register(Pointer.class.getDeclaredMethod("getPeer"));
            RuntimeJNIAccess.register(NativeObject.class.getDeclaredMethod("getPeer"));
            RuntimeJNIAccess.register(NativeObject.class.getDeclaredMethod("getPeerPointer"));
            RuntimeJNIAccess.register(NativeException.class.getDeclaredMethod("getNativeException"));
            RuntimeJNIAccess.register(NilException.class.getDeclaredConstructor());

            for (Class<?> annotationClass : NATJ_ANNOTATION_CLASSES) {
                RuntimeJNIAccess.register(annotationClass);
                for (Method method : annotationClass.getDeclaredMethods()) {
                    RuntimeJNIAccess.register(method);
                }
            }

            RuntimeJNIAccess.register(Variadic.class.getDeclaredMethods());
            RuntimeJNIAccess.register(Variadic.class.getDeclaredFields());

            RuntimeJNIAccess.register(VariadicArg.class.getDeclaredMethod("getInstance"));
            for (Class<?> innerClass : VariadicArg.class.getDeclaredClasses()) {
                RuntimeJNIAccess.register(innerClass.getDeclaredMethods());
            }

            RuntimeJNIAccess.register(UnSupportedAnnotationException.class);

            access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
                if (aClass == Mapper.class)
                    return;
                try {
                    RuntimeReflection.register(aClass.getDeclaredConstructor());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }, Mapper.class);

            RuntimeReflection.register(CRuntime.class.getDeclaredConstructor());
            RuntimeReflection.register(ObjCRuntime.class.getDeclaredConstructor());
            RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("cleanupObjCProxy", Object.class));
            RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("cleanupObjCBlock", Object.class, Method.class));
            RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("handleFrameworkInitializer", IFrameworkInitializer.class));
            RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("registerUnloadedObjCBinding", String.class, String.class));
            RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("getExceptionStacktrace", Throwable.class));
            RuntimeJNIAccess.register(ObjCObject.class);
            RuntimeJNIAccess.register(ObjCObjectMapper.class);
            RuntimeJNIAccess.register(IFrameworkInitializer.class);
            RuntimeJNIAccess.register(ObjCException.class.getDeclaredConstructor(ObjCObject.class));
            RuntimeJNIAccess.register(ObjCSelectorsFinder.class.getDeclaredConstructor());
            RuntimeJNIAccess.register(ObjCSelectorsFinder.class.getDeclaredMethod("prepareParentsSelectorsList", Class.class));
            RuntimeJNIAccess.register(ObjCSelectorsFinder.class.getDeclaredMethod("getSelectorForMethod", Method.class));
            RuntimeJNIAccess.register(access.findClassByName("org.moe.natj.general.ptr.impl.ObjCObjectPtrImpl").getDeclaredMethod("refreshRetainList"));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private void registerSQLite(BeforeAnalysisAccess access) {
        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeReflection.register(JDBCConnection.class);
                RuntimeReflection.register(JDBCConnection.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class));

                RuntimeJNIAccess.register(Exception.class.getDeclaredConstructor(String.class));
                RuntimeJNIAccess.register(FunctionContext.class.getDeclaredConstructor());
                RuntimeJNIAccess.register(FunctionContext.class.getDeclaredField("handle"));

            } catch (NoSuchMethodException | NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, JDBCDriver.class);

        for (Class<?> upcallInterface : JAVA_SQLITE_UPCALL_INTERFACES) {
            access.registerReachabilityHandler(duringAnalysisAccess -> {
                RuntimeJNIAccess.register(upcallInterface.getDeclaredMethods());
            }, upcallInterface);
        }

        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeJNIAccess.register(Backup.class.getDeclaredField("handle"));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, Backup.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeJNIAccess.register(Blob.class.getDeclaredField("handle"));
                RuntimeJNIAccess.register(Blob.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, Blob.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeJNIAccess.register(Database.class.getDeclaredField("handle"));
                RuntimeJNIAccess.register(Database.class.getDeclaredField("error_code"));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, Database.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeJNIAccess.register(Stmt.class.getDeclaredField("handle"));
                RuntimeJNIAccess.register(Stmt.class.getDeclaredField("error_code"));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, Stmt.class);

        access.registerReachabilityHandler(duringAnalysisAccess -> {
            try {
                RuntimeJNIAccess.register(Vm.class.getDeclaredField("handle"));
                RuntimeJNIAccess.register(Vm.class.getDeclaredField("error_code"));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }, Vm.class);
    }

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        registerNatJ(access);
        registerSQLite(access);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            if (!aClass.isInterface())
                return;
            if (aClass.getInterfaces().length != 1)
                return;
            if (aClass.getInterfaces()[0] != OpaquePtr.class)
                return;

            RuntimeReflection.registerAllDeclaredClasses(aClass);
            Class<?> impl = duringAnalysisAccess.findClassByName(aClass.getName() + "$Impl");
            try {
                RuntimeReflection.register(impl.getDeclaredConstructor(Pointer.class));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Couldn't find Pointer constructor for class " + impl.getName(), e);
            }
        }, OpaquePtr.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            try {
                RuntimeReflection.register(aClass.getDeclaredConstructor(Pointer.class));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Couldn't find Pointer constructor for class " + aClass.getName(), e);
            }
        }, NativeObject.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            if (aClass == StructObject.class)
                return;
            try {
                Field cacheField = aClass.getDeclaredField("__natjCache");
                RuntimeReflection.register(cacheField);
                RuntimeJNIAccess.register(cacheField);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException("Field '__natjCache' not found in class " + aClass.getName(), e);
            }

            RuntimeReflection.registerAllDeclaredMethods(aClass);
        }, StructObject.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            if (aClass == ObjCObject.class)
                return;
            if (aClass.isInterface())
                return;

            // Required so Class.forName(...) on a binding class succeeds at runtime,
            // including the lazy lookup in ObjCRuntime.resolveObjCClass that loads
            // bindings listed in objc-bindings.txt.
            RuntimeReflection.register(aClass);

            RuntimeReflection.registerAllDeclaredMethods(aClass);
            RuntimeReflection.registerAllMethods(aClass);

            for (Method method : aClass.getDeclaredMethods()) {
                if (!AnnotationAccess.isAnnotationPresent(method, Selector.class))
                    continue;
                if (Modifier.isNative(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()))
                    continue;
                RuntimeReflection.register(method);
                RuntimeJNIAccess.register(method);
            }
        }, ObjCObject.class);

        access.registerSubtypeReachabilityHandler((duringAnalysisAccess, aClass) -> {
            for (Method method : aClass.getMethods()) {
                if (!Modifier.isNative(method.getModifiers())) {
                    // TODO: I feel like this is a native-image bug. The lower check should work just fine
                    if (method.getName().startsWith("call_")) {
                        RuntimeReflection.register(method);
                        RuntimeJNIAccess.register(method);
                    }

                    if (AnnotationAccess.isAnnotationPresent(method, Selector.class)) {
                        RuntimeJNIAccess.register(method);
                        RuntimeReflection.registerAsQueried(method);
                    }
                }
            }

            if (!AnnotationAccess.isAnnotationPresent(aClass, Runtime.class))
                return;
            RuntimeReflection.register(aClass);
            RuntimeReflection.registerAllMethods(aClass);
            RuntimeReflection.registerAllDeclaredMethods(aClass);

            if (!aClass.isInterface())
                return;

            if (AnnotationAccess.isAnnotationPresent(aClass, ObjCProtocolName.class)) {
                RuntimeProxyCreation.register(aClass);
                return;
            }

            for (Method method : aClass.getDeclaredMethods()) {
                if (method.getName().startsWith("call_")) {
                    RuntimeReflection.register(method);
                    RuntimeJNIAccess.register(method);
                }
            }
        }, Object.class);
    }
}
