package apple.healthkit;

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
 * HKGlassesLensSpecification
 * 
 * An object subclass representing lens specification for glasses
 * 
 * API-Since: 16.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKGlassesLensSpecification extends HKLensSpecification implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKGlassesLensSpecification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKGlassesLensSpecification alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKGlassesLensSpecification allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] farPupillaryDistance
     * 
     * The distance from each pupil to the center of the nose (measured in mm) when looking at a far target.
     * Can be described as combined or individual value. For distance prescriptions, the pupillary distance will be a
     * far value.
     */
    @Generated
    @Selector("farPupillaryDistance")
    public native HKQuantity farPupillaryDistance();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKGlassesLensSpecification init();

    @Generated
    @Selector("initWithCoder:")
    public native HKGlassesLensSpecification initWithCoder(NSCoder coder);

    /**
     * initWithSphere:cylinder:axis:addPower:vertexDistance:prism:farPupillaryDistance:nearPupillaryDistance
     * 
     * @param sphere                The lens power to correct nearsightedness or farsightedness
     * @param cylinder              The lens power required to correct astigmatism
     * @param axis                  The angle along which cylindrical power should be positioned to correct astigmatism
     * @param addPower              The power adjustment applied to a multifocal lens to correct presbyopia
     * @param vertexDistance        The distance between the back of the eyeglass lens and the eye
     * @param prism                 The object encapsulating the prism fields
     * @param farPupillaryDistance  The distance from each pupil to the center of the nose (measured in mm) when looking
     *                              at a far target.
     *                              Can be described as combined or individual value. For distance prescriptions, the
     *                              pupillary distance will be a far value.
     * @param nearPupillaryDistance The distance from each pupil to the center of the nose (measured in mm) when looking
     *                              at a near target.
     *                              Can be described as combined or individual value. For near prescriptions, the
     *                              pupillary distance will be a near value.
     */
    @Generated
    @Selector("initWithSphere:cylinder:axis:addPower:vertexDistance:prism:farPupillaryDistance:nearPupillaryDistance:")
    public native HKGlassesLensSpecification initWithSphereCylinderAxisAddPowerVertexDistancePrismFarPupillaryDistanceNearPupillaryDistance(
            HKQuantity sphere, HKQuantity cylinder, HKQuantity axis, HKQuantity addPower, HKQuantity vertexDistance,
            HKVisionPrism prism, HKQuantity farPupillaryDistance, HKQuantity nearPupillaryDistance);

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
     * [@property] nearPupillaryDistance
     * 
     * The distance from each pupil to the center of the nose (measured in mm) when looking at a near target.
     * Can be described as combined or individual value. For near prescriptions, the pupillary distance will be a near
     * value.
     */
    @Generated
    @Selector("nearPupillaryDistance")
    public native HKQuantity nearPupillaryDistance();

    @Generated
    @Owned
    @Selector("new")
    public static native HKGlassesLensSpecification new_objc();

    /**
     * [@property] prism
     * 
     * The object encapsulating the prism fields
     */
    @Generated
    @Selector("prism")
    public native HKVisionPrism prism();

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
     * [@property] vertexDistance
     * 
     * The distance between the back of the eyeglass lens and the eye (measured in mm)
     */
    @Generated
    @Selector("vertexDistance")
    public native HKQuantity vertexDistance();
}