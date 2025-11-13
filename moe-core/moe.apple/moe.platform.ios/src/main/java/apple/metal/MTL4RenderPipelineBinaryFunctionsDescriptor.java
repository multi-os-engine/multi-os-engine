package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Allows you to specify additional binary functions to link to each stage of a render pipeline.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTL4RenderPipelineBinaryFunctionsDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTL4RenderPipelineBinaryFunctionsDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTL4RenderPipelineBinaryFunctionsDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTL4RenderPipelineBinaryFunctionsDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Provides an array of binary functions representing additional binary fragment shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fragmentAdditionalBinaryFunctions")
    @Nullable
    public native NSArray<?> fragmentAdditionalBinaryFunctions();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTL4RenderPipelineBinaryFunctionsDescriptor init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Provides an array of binary functions representing additional binary mesh shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("meshAdditionalBinaryFunctions")
    @Nullable
    public native NSArray<?> meshAdditionalBinaryFunctions();

    @Generated
    @Owned
    @Selector("new")
    public static native MTL4RenderPipelineBinaryFunctionsDescriptor new_objc();

    /**
     * Provides an array of binary functions representing additional binary object shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("objectAdditionalBinaryFunctions")
    @Nullable
    public native NSArray<?> objectAdditionalBinaryFunctions();

    /**
     * Resets this descriptor to its default state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Provides an array of binary functions representing additional binary fragment shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFragmentAdditionalBinaryFunctions:")
    public native void setFragmentAdditionalBinaryFunctions(@Nullable NSArray<?> value);

    /**
     * Provides an array of binary functions representing additional binary mesh shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMeshAdditionalBinaryFunctions:")
    public native void setMeshAdditionalBinaryFunctions(@Nullable NSArray<?> value);

    /**
     * Provides an array of binary functions representing additional binary object shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setObjectAdditionalBinaryFunctions:")
    public native void setObjectAdditionalBinaryFunctions(@Nullable NSArray<?> value);

    /**
     * Provides an array of binary functions representing additional binary tile shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTileAdditionalBinaryFunctions:")
    public native void setTileAdditionalBinaryFunctions(@Nullable NSArray<?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Provides an array of binary functions representing additional binary vertex shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setVertexAdditionalBinaryFunctions:")
    public native void setVertexAdditionalBinaryFunctions(@Nullable NSArray<?> value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Provides an array of binary functions representing additional binary tile shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tileAdditionalBinaryFunctions")
    @Nullable
    public native NSArray<?> tileAdditionalBinaryFunctions();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Provides an array of binary functions representing additional binary vertex shader functions.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vertexAdditionalBinaryFunctions")
    @Nullable
    public native NSArray<?> vertexAdditionalBinaryFunctions();
}