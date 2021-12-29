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

/**
 * VNVector
 * <p>
 * VNVector is a two-dimensional vector represented its X and Y axis projections. Once created, VNVector objects are immutable.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNVector extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected VNVector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNVector alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNVector allocWithZone(VoidPtr zone);

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
     * Caclulates a dot product (aka 'scalar product' or 'inner product') of two vectors v1 and v2 and returns dot product value.
     */
    @Generated
    @Selector("dotProductOfVector:vector:")
    public static native double dotProductOfVectorVector(VNVector v1, VNVector v2);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNVector init();

    @Generated
    @Selector("initWithCoder:")
    public native VNVector initWithCoder(NSCoder coder);

    /**
     * Initializes a vector in polar coordinate space, using R and Theta (radians), where R is the length of the vector and
     * Theta is the ange that the vector forms with the positive direction of X axis.
     */
    @Generated
    @Selector("initWithR:theta:")
    public native VNVector initWithRTheta(double r, double theta);

    /**
     * Initializes a vector in Cartesian Coordinate space, using two VNPoints - the head and the tail of the vector.
     */
    @Generated
    @Selector("initWithVectorHead:tail:")
    public native VNVector initWithVectorHeadTail(VNPoint head, VNPoint tail);

    /**
     * Initializes a vector in Cartesian Coordinate space, using its X and Y axis projections.
     */
    @Generated
    @Selector("initWithXComponent:yComponent:")
    public native VNVector initWithXComponentYComponent(double x, double y);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Returns a length, or absolute value, of the vector.
     */
    @Generated
    @Selector("length")
    public native double length();

    @Generated
    @Owned
    @Selector("new")
    public static native VNVector new_objc();

    /**
     * Radius, or absolute value, or length of the vector.
     */
    @Generated
    @Selector("r")
    public native double r();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns a length ^ 2 of a vector.
     */
    @Generated
    @Selector("squaredLength")
    public native double squaredLength();

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
     * Angle between the vector direction and positive direction of X axis.
     */
    @Generated
    @Selector("theta")
    public native double theta();

    /**
     * Returns a vector that is normalized by preserving direction, such as |v|, or vector length = 1.0.
     */
    @Generated
    @Selector("unitVectorForVector:")
    public static native VNVector unitVectorForVector(VNVector vector);

    /**
     * Adds two vectors v1 and v2 and returns a resulting vector v, such as v = v1 + v2.
     */
    @Generated
    @Selector("vectorByAddingVector:toVector:")
    public static native VNVector vectorByAddingVectorToVector(VNVector v1, VNVector v2);

    /**
     * Returns a vector that whose X and Y projections multiplied by a scalar value.
     */
    @Generated
    @Selector("vectorByMultiplyingVector:byScalar:")
    public static native VNVector vectorByMultiplyingVectorByScalar(VNVector vector, double scalar);

    /**
     * Substructs vector v1 from v2 and returns a resulting vector v, such as v = v2 - v1.
     */
    @Generated
    @Selector("vectorBySubtractingVector:fromVector:")
    public static native VNVector vectorBySubtractingVectorFromVector(VNVector v1, VNVector v2);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Signed projection on X-axis, or X component of the vector. Sign determines direction the vector is facing in X direction.
     */
    @Generated
    @Selector("x")
    public native double x();

    /**
     * Signed projection on Y-axis, or Y component of the vector. Sign determines direction the vector is facing in Y direction.
     */
    @Generated
    @Selector("y")
    public native double y();

    /**
     * Returns a VNVector object with zero length. The theta for zeroVector is not defined (NaN).
     */
    @Generated
    @Selector("zeroVector")
    public static native VNVector zeroVector();
}
