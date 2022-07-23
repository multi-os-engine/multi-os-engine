package apple.vision;

import apple.NSObject;
import apple.coreml.MLMultiArray;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * VNRecognizedPointsObservation
 * [@superclass] VNObservation
 * <p>
 * VNRecognizedPointsObservation is a request result detailing points in an image.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNRecognizedPointsObservation extends VNObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNRecognizedPointsObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNRecognizedPointsObservation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNRecognizedPointsObservation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The availableGroupKeys property returns all of the point group labels usable with the observation.
     */
    @Generated
    @Selector("availableGroupKeys")
    public native NSArray<String> availableGroupKeys();

    /**
     * Returns all of the point group keys available in the observation.
     */
    @Generated
    @Selector("availableKeys")
    public native NSArray<String> availableKeys();

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
    @Selector("init")
    public native VNRecognizedPointsObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNRecognizedPointsObservation initWithCoder(NSCoder coder);

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
     * Returns the recognized points packaged into an MLMultiArray.
     * <p>
     * The MLMultiArray will contain the raw data output of (x coordinate, y coordinate, confidence) for specific points
     * in the format expected by CreateML action recognition models.
     * The datatype of the elements in the array is double and the dimensions are [1, 3, # of possible points]. If an
     * expected point key is not available in the obeservation, that entry in the MLMultiArray will be populated with
     * 0s.
     *
     * @param error The address of a variable that will be populated with the error that describes the failure. If the
     *              caller does not require this information, NULL can be passed.
     * @return the MLMultiArray representation of the points, or nil if an error was encountered.
     */
    @Generated
    @Selector("keypointsMultiArrayAndReturnError:")
    public native MLMultiArray keypointsMultiArrayAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native VNRecognizedPointsObservation new_objc();

    /**
     * Obtains a specific normalized recognized point.
     *
     * @param pointKey The key specifying the desired recognized point.
     * @param error    The address of a variable that will be populated with the error that describes the failure. If
     *                 the caller does not require this information, NULL can be passed.
     * @return the recognized point, or nil if the specific point is not defined.
     */
    @Generated
    @Selector("recognizedPointForKey:error:")
    public native VNRecognizedPoint recognizedPointForKeyError(String pointKey,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Obtains the collection of points associated with an identified grouping.
     * <p>
     * The obtained collection is a dictionary that provides the mapping of a recognized point's key to the recognized
     * point.
     *
     * @param groupKey The key representing a specific grouping of points.
     * @param error    The address of a variable that will be populated with the error that describes the failure. If
     *                 the caller does not require this information, NULL can be passed.
     * @return the dictionary of recognized points in the group, or nil if an error was encountered.
     */
    @Generated
    @Selector("recognizedPointsForGroupKey:error:")
    public native NSDictionary<String, ? extends VNRecognizedPoint> recognizedPointsForGroupKeyError(String groupKey,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
}
