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

/**
 * SCNGeometryTessellator
 * <p>
 * A geometry tessellator describes how a more detailed surface is calculated from the geometry's initial surface.
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] edgeTessellationFactor
     * <p>
     * Specifies the edge tessellation factor. Defaults to 1.
     * <p>
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("edgeTessellationFactor")
    @NFloat
    public native double edgeTessellationFactor();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNGeometryTessellator init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometryTessellator initWithCoder(NSCoder coder);

    /**
     * [@property] insideTessellationFactor
     * <p>
     * Specifies the inside tessellation factor. Defaults to 1.
     * <p>
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
     * <p>
     * Specifies if the tessellation should be uniform or adaptive. Defaults to NO.
     */
    @Generated
    @Selector("isAdaptive")
    public native boolean isAdaptive();

    /**
     * [@property] screenspace
     * <p>
     * Specifies if the level of tessellation should be adapted in screenSpace. Defaults to NO.
     */
    @Generated
    @Selector("isScreenSpace")
    public native boolean isScreenSpace();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] maximumEdgeLength
     * <p>
     * Specifies the maximum edge length. Defaults to 1.
     * <p>
     * This has no effect for non-adaptive subdivision
     */
    @Generated
    @Selector("maximumEdgeLength")
    @NFloat
    public native double maximumEdgeLength();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] adaptive
     * <p>
     * Specifies if the tessellation should be uniform or adaptive. Defaults to NO.
     */
    @Generated
    @Selector("setAdaptive:")
    public native void setAdaptive(boolean value);

    /**
     * [@property] edgeTessellationFactor
     * <p>
     * Specifies the edge tessellation factor. Defaults to 1.
     * <p>
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("setEdgeTessellationFactor:")
    public native void setEdgeTessellationFactor(@NFloat double value);

    /**
     * [@property] insideTessellationFactor
     * <p>
     * Specifies the inside tessellation factor. Defaults to 1.
     * <p>
     * This has no effect for adaptive subdivision
     */
    @Generated
    @Selector("setInsideTessellationFactor:")
    public native void setInsideTessellationFactor(@NFloat double value);

    /**
     * [@property] maximumEdgeLength
     * <p>
     * Specifies the maximum edge length. Defaults to 1.
     * <p>
     * This has no effect for non-adaptive subdivision
     */
    @Generated
    @Selector("setMaximumEdgeLength:")
    public native void setMaximumEdgeLength(@NFloat double value);

    /**
     * [@property] screenspace
     * <p>
     * Specifies if the level of tessellation should be adapted in screenSpace. Defaults to NO.
     */
    @Generated
    @Selector("setScreenSpace:")
    public native void setScreenSpace(boolean value);

    /**
     * [@property] smoothingMode
     * <p>
     * Defaults to SCNTessellationSmoothingModeNone.
     */
    @Generated
    @Selector("setSmoothingMode:")
    public native void setSmoothingMode(@NInt long value);

    /**
     * [@property] tessellationFactorScale
     * <p>
     * Specifies the scale factor applied to the per-patch tessellation factors. Defaults to 1.
     */
    @Generated
    @Selector("setTessellationFactorScale:")
    public native void setTessellationFactorScale(@NFloat double value);

    /**
     * [@property] tessellationPartitionMode
     * <p>
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
     * <p>
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
     * <p>
     * Specifies the scale factor applied to the per-patch tessellation factors. Defaults to 1.
     */
    @Generated
    @Selector("tessellationFactorScale")
    @NFloat
    public native double tessellationFactorScale();

    /**
     * [@property] tessellationPartitionMode
     * <p>
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
}
