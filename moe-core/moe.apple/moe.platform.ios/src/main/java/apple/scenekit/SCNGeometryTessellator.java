package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNGeometryTessellator
 * 
 * A geometry tessellator describes how a more detailed surface is calculated from the geometry's initial surface.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNGeometryTessellator extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNGeometryTessellator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNGeometryTessellator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNGeometryTessellator allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] edgeTessellationFactor
     * 
     * Specifies the edge tessellation factor. Defaults to 1.
     * 
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("edgeTessellationFactor")
    @NFloat
    public native double edgeTessellationFactor();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNGeometryTessellator init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometryTessellator initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] insideTessellationFactor
     * 
     * Specifies the inside tessellation factor. Defaults to 1.
     * 
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("insideTessellationFactor")
    @NFloat
    public native double insideTessellationFactor();

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

    /**
     * [@property] adaptive
     * 
     * Specifies if the tessellation should be uniform or adaptive. Defaults to NO.
     */
    @Generated
    @Selector("isAdaptive")
    public native boolean isAdaptive();

    /**
     * [@property] screenspace
     * 
     * Specifies if the level of tessellation should be adapted in screenSpace. Defaults to NO.
     */
    @Generated
    @Selector("isScreenSpace")
    public native boolean isScreenSpace();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] maximumEdgeLength
     * 
     * Specifies the maximum edge length. Defaults to 1.
     * 
     * This has no effect for non-adaptive subdivision
     */
    @Generated
    @Selector("maximumEdgeLength")
    @NFloat
    public native double maximumEdgeLength();

    @Generated
    @Owned
    @Selector("new")
    public static native SCNGeometryTessellator new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] adaptive
     * 
     * Specifies if the tessellation should be uniform or adaptive. Defaults to NO.
     */
    @Generated
    @Selector("setAdaptive:")
    public native void setAdaptive(boolean value);

    /**
     * [@property] edgeTessellationFactor
     * 
     * Specifies the edge tessellation factor. Defaults to 1.
     * 
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("setEdgeTessellationFactor:")
    public native void setEdgeTessellationFactor(@NFloat double value);

    /**
     * [@property] insideTessellationFactor
     * 
     * Specifies the inside tessellation factor. Defaults to 1.
     * 
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("setInsideTessellationFactor:")
    public native void setInsideTessellationFactor(@NFloat double value);

    /**
     * [@property] maximumEdgeLength
     * 
     * Specifies the maximum edge length. Defaults to 1.
     * 
     * This has no effect for non-adaptive subdivision
     */
    @Generated
    @Selector("setMaximumEdgeLength:")
    public native void setMaximumEdgeLength(@NFloat double value);

    /**
     * [@property] screenspace
     * 
     * Specifies if the level of tessellation should be adapted in screenSpace. Defaults to NO.
     */
    @Generated
    @Selector("setScreenSpace:")
    public native void setScreenSpace(boolean value);

    /**
     * [@property] smoothingMode
     * 
     * Defaults to SCNTessellationSmoothingModeNone.
     */
    @Generated
    @Selector("setSmoothingMode:")
    public native void setSmoothingMode(@NInt long value);

    /**
     * [@property] tessellationFactorScale
     * 
     * Specifies the scale factor applied to the per-patch tessellation factors. Defaults to 1.
     */
    @Generated
    @Selector("setTessellationFactorScale:")
    public native void setTessellationFactorScale(@NFloat double value);

    /**
     * [@property] tessellationPartitionMode
     * 
     * Specifies the tessellation partition mode. Defaults to MTLTessellationPartitionModeInteger.
     */
    @Generated
    @Selector("setTessellationPartitionMode:")
    public native void setTessellationPartitionMode(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] smoothingMode
     * 
     * Defaults to SCNTessellationSmoothingModeNone.
     */
    @Generated
    @Selector("smoothingMode")
    @NInt
    public native long smoothingMode();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] tessellationFactorScale
     * 
     * Specifies the scale factor applied to the per-patch tessellation factors. Defaults to 1.
     */
    @Generated
    @Selector("tessellationFactorScale")
    @NFloat
    public native double tessellationFactorScale();

    /**
     * [@property] tessellationPartitionMode
     * 
     * Specifies the tessellation partition mode. Defaults to MTLTessellationPartitionModeInteger.
     */
    @Generated
    @Selector("tessellationPartitionMode")
    @NUInt
    public native long tessellationPartitionMode();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
