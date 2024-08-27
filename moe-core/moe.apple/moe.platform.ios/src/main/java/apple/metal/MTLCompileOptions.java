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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLCompileOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLCompileOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLCompileOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLCompileOptions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTLCompileOptions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] fastMathEnabled
     * 
     * If YES, enables the compiler to perform optimizations for floating-point arithmetic that may violate the IEEE 754
     * standard. It also enables the high precision variant of math functions for single precision floating-point scalar
     * and vector types. fastMathEnabled defaults to YES.
     */
    @Generated
    @Selector("fastMathEnabled")
    public native boolean fastMathEnabled();

    @Generated
    @Selector("init")
    public native MTLCompileOptions init();

    /**
     * [@property] languageVersion
     * 
     * set the metal language version used to interpret the source.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("languageVersion")
    @NUInt
    public native long languageVersion();

    /**
     * [@property] preprocessorNames
     * 
     * List of preprocessor macros to consider to when compiling this program. Specified as key value pairs, using a
     * NSDictionary. The keys must be NSString objects and values can be either NSString or NSNumber objects.
     * 
     * The default value is nil.
     */
    @Nullable
    @Generated
    @Selector("preprocessorMacros")
    public native NSDictionary<String, ? extends NSObject> preprocessorMacros();

    /**
     * [@property] fastMathEnabled
     * 
     * If YES, enables the compiler to perform optimizations for floating-point arithmetic that may violate the IEEE 754
     * standard. It also enables the high precision variant of math functions for single precision floating-point scalar
     * and vector types. fastMathEnabled defaults to YES.
     */
    @Generated
    @Selector("setFastMathEnabled:")
    public native void setFastMathEnabled(boolean value);

    /**
     * [@property] languageVersion
     * 
     * set the metal language version used to interpret the source.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setLanguageVersion:")
    public native void setLanguageVersion(@NUInt long value);

    /**
     * [@property] preprocessorNames
     * 
     * List of preprocessor macros to consider to when compiling this program. Specified as key value pairs, using a
     * NSDictionary. The keys must be NSString objects and values can be either NSString or NSNumber objects.
     * 
     * The default value is nil.
     */
    @Generated
    @Selector("setPreprocessorMacros:")
    public native void setPreprocessorMacros(@Nullable NSDictionary<String, ? extends NSObject> value);

    /**
     * [@property] installName
     * 
     * The install name of this dynamic library.
     * 
     * The install name is used when a pipeline state is created that depends, directly or indirectly, on a dynamic
     * library.
     * The installName is embedded into any other MTLLibrary that links against the compilation result.
     * This property should be set such that the dynamic library can be found in the file system at the time a pipeline
     * state is created.
     * Specify one of:
     * - an absolute path to a file from which the dynamic library can be loaded, or
     * - a path relative to \@executable_path, where \@executable_path is substituted with the directory name from which
     * the MTLLibrary containing the MTLFunction entrypoint used to create the pipeline state is loaded, or
     * - a path relative to \@loader_path, where \@loader_path is substituted with the directory name from which the
     * MTLLibrary with the reference to this installName embedded is loaded.
     * The first is appropriate for MTLDynamicLibrary written to the file-system using its serializeToURL:error: method
     * on the current device.
     * The others are appropriate when the MTLDynamicLibrary is installed as part of a bundle or app, where the absolute
     * path is not known.
     * This property is ignored when the type property is not set to MTLLibraryTypeDynamic.
     * This propery should not be null if the property type is set to MTLLibraryTypeDynamic: the compilation will fail
     * in that scenario.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("installName")
    public native String installName();

    /**
     * [@property] libraries
     * 
     * A set of MTLDynamicLibrary instances to link against.
     * The installName of the provided MTLDynamicLibrary is embedded into the compilation result.
     * When a function from the resulting MTLLibrary is used (either as an MTLFunction, or as an to create a pipeline
     * state, the embedded install names are used to automatically load the MTLDynamicLibrary instances.
     * This property can be null if no libraries should be automatically loaded, either because the MTLLibrary has no
     * external dependencies, or because you will use preloadedLibraries to specify the libraries to use at pipeline
     * creation time.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("libraries")
    public native NSArray<?> libraries();

    /**
     * [@property] type
     * 
     * Which type the library should be compiled as. The default value is MTLLibraryTypeExecutable.
     * 
     * MTLLibraryTypeExecutable is suitable to build a library of "kernel", "vertex" and "fragment" qualified functions.
     * MTLLibraryType is suitable when the compilation result will instead be used to instantiate a MTLDynamicLibrary.
     * MTLDynamicLibrary contains no qualified functions, but it's unqualified functions and variables can be used as an
     * external dependency for compiling other libraries.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("libraryType")
    @NInt
    public native long libraryType();

    /**
     * [@property] preserveInvariance
     * 
     * If YES, set the compiler to compile shaders to preserve invariance. The default is false.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preserveInvariance")
    public native boolean preserveInvariance();

    /**
     * [@property] installName
     * 
     * The install name of this dynamic library.
     * 
     * The install name is used when a pipeline state is created that depends, directly or indirectly, on a dynamic
     * library.
     * The installName is embedded into any other MTLLibrary that links against the compilation result.
     * This property should be set such that the dynamic library can be found in the file system at the time a pipeline
     * state is created.
     * Specify one of:
     * - an absolute path to a file from which the dynamic library can be loaded, or
     * - a path relative to \@executable_path, where \@executable_path is substituted with the directory name from which
     * the MTLLibrary containing the MTLFunction entrypoint used to create the pipeline state is loaded, or
     * - a path relative to \@loader_path, where \@loader_path is substituted with the directory name from which the
     * MTLLibrary with the reference to this installName embedded is loaded.
     * The first is appropriate for MTLDynamicLibrary written to the file-system using its serializeToURL:error: method
     * on the current device.
     * The others are appropriate when the MTLDynamicLibrary is installed as part of a bundle or app, where the absolute
     * path is not known.
     * This property is ignored when the type property is not set to MTLLibraryTypeDynamic.
     * This propery should not be null if the property type is set to MTLLibraryTypeDynamic: the compilation will fail
     * in that scenario.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setInstallName:")
    public native void setInstallName(@Nullable String value);

    /**
     * [@property] libraries
     * 
     * A set of MTLDynamicLibrary instances to link against.
     * The installName of the provided MTLDynamicLibrary is embedded into the compilation result.
     * When a function from the resulting MTLLibrary is used (either as an MTLFunction, or as an to create a pipeline
     * state, the embedded install names are used to automatically load the MTLDynamicLibrary instances.
     * This property can be null if no libraries should be automatically loaded, either because the MTLLibrary has no
     * external dependencies, or because you will use preloadedLibraries to specify the libraries to use at pipeline
     * creation time.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setLibraries:")
    public native void setLibraries(@Nullable NSArray<?> value);

    /**
     * [@property] type
     * 
     * Which type the library should be compiled as. The default value is MTLLibraryTypeExecutable.
     * 
     * MTLLibraryTypeExecutable is suitable to build a library of "kernel", "vertex" and "fragment" qualified functions.
     * MTLLibraryType is suitable when the compilation result will instead be used to instantiate a MTLDynamicLibrary.
     * MTLDynamicLibrary contains no qualified functions, but it's unqualified functions and variables can be used as an
     * external dependency for compiling other libraries.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setLibraryType:")
    public native void setLibraryType(@NInt long value);

    /**
     * [@property] preserveInvariance
     * 
     * If YES, set the compiler to compile shaders to preserve invariance. The default is false.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreserveInvariance:")
    public native void setPreserveInvariance(boolean value);

    /**
     * [@property] optimizationLevel
     * 
     * Sets the compiler optimization level.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("optimizationLevel")
    @NInt
    public native long optimizationLevel();

    /**
     * [@property] optimizationLevel
     * 
     * Sets the compiler optimization level.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOptimizationLevel:")
    public native void setOptimizationLevel(@NInt long value);

    /**
     * [@property] allowReferencingUndefinedSymbols
     * 
     * Adds a compiler command to allow the reference of undefined symbols
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("allowReferencingUndefinedSymbols")
    public native boolean allowReferencingUndefinedSymbols();

    /**
     * [@property]
     * 
     * Adds a compiler command to force the default visibility of symbols to be hidden
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("compileSymbolVisibility")
    @NInt
    public native long compileSymbolVisibility();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * Adds a compiler command to specify the total threads per threadgroup
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerThreadgroup();

    /**
     * [@property] allowReferencingUndefinedSymbols
     * 
     * Adds a compiler command to allow the reference of undefined symbols
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setAllowReferencingUndefinedSymbols:")
    public native void setAllowReferencingUndefinedSymbols(boolean value);

    /**
     * [@property]
     * 
     * Adds a compiler command to force the default visibility of symbols to be hidden
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setCompileSymbolVisibility:")
    public native void setCompileSymbolVisibility(@NInt long value);

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * Adds a compiler command to specify the total threads per threadgroup
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
