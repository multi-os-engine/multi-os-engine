package apple.vision;

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
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * VNPoint
 * 
 * VNPoint represents a single, immutable, two-dimensional point in an image.
 * 
 * It should be noted that VNPoint is not intended as an overall replacement of CGPoint, NSPoint or vec2, but is used by
 * observations that need to present points which may contain additional metadata.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNPoint extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected VNPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNPoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNPoint allocWithZone(VoidPtr zone);

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
     * Returns the Euclidean distance between two VNPoint objects.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("distanceBetweenPoint:point:")
    public static native double distanceBetweenPointPoint(@NotNull VNPoint point1, @NotNull VNPoint point2);

    /**
     * Returns the Euclidean distance to another point.
     * 
     * @param point The destination point.
     * @return the Euclidean distance between the target and specified points.
     */
    @Generated
    @Selector("distanceToPoint:")
    public native double distanceToPoint(@NotNull VNPoint point);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNPoint init();

    @Generated
    @Selector("initWithCoder:")
    public native VNPoint initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a VNPoint object from a CGPoint.
     */
    @Generated
    @Selector("initWithLocation:")
    public native VNPoint initWithLocation(@ByValue CGPoint location);

    /**
     * Initializes a VNPoint object from X and Y coordinates.
     */
    @Generated
    @Selector("initWithX:y:")
    public native VNPoint initWithXY(double x, double y);

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

    /**
     * Returns the X and Y coordinates of the point, as CGPoint type, with respect to the origin of the coordinate
     * system the point is defined in.
     */
    @Generated
    @Selector("location")
    @ByValue
    public native CGPoint location();

    @Generated
    @Owned
    @Selector("new")
    public static native VNPoint new_objc();

    /**
     * Returns a new VNPoint object that is shifted by X and Y offsets of the vector.
     * 
     * @param vector The vector offset to be applied to a source point.
     * @param point  The source point.
     * @return the translated point.
     */
    @NotNull
    @Generated
    @Selector("pointByApplyingVector:toPoint:")
    public static native VNPoint pointByApplyingVectorToPoint(@NotNull VNVector vector, @NotNull VNPoint point);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the X coordinate of the point with respect to the origin of the coordinate system the point is defined
     * in.
     */
    @Generated
    @Selector("x")
    public native double x();

    /**
     * Returns the Y coordinate of the point with respect to the origin of the coordinate system the point is defined
     * in.
     */
    @Generated
    @Selector("y")
    public native double y();

    /**
     * Returns a VNPoint object that represents the location of (0.0, 0.0).
     */
    @NotNull
    @Generated
    @Selector("zeroPoint")
    public static native VNPoint zeroPoint();
}
