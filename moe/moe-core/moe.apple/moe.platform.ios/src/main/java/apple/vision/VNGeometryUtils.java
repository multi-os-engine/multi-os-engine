package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNGeometryUtils extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNGeometryUtils(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNGeometryUtils alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Calculates a bounding circle that includes a collection of points or a VNContour object. Note that because this is based on a geometric shape the aspect ratio is important when using normalized points.
     * This takes the aspect ratio of the contour into account when using a VNContour as an input.
     * boundingCircleForPoints and boundingCircleForSIMDPoints assume that the aspect ratio is correctly applied to the points.
     *
     * @param contour    A contour around which to find the bounding circle.
     * @param points     A collection of points around which to find the bounding circle.
     * @param pointCount Number of points in points
     * @param contour    VNContour object whose bounding circle needs to be calculated
     * @param error      An output parameter, populated only in case of algorithmic failure
     * @return the VNCircle object describing the bounding circle or nil, if the algorithm failed. The latter case is accompanied by populating an 'error' output parameter
     */
    @Generated
    @Selector("boundingCircleForContour:error:")
    public static native VNCircle boundingCircleForContourError(VNContour contour,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("boundingCircleForPoints:error:")
    public static native VNCircle boundingCircleForPointsError(NSArray<? extends VNPoint> points,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Calculates a closed contour area using Green's theorem. The contour is represented by a set of points in VNContour object,
     * It's important to note that a random set of points, or a contour with self-crossing edges will likely produce undefined results
     * Note that because this is based on a geometric shape the aspect ratio is important when using normalized points.
     * This takes the aspect ratio of the contour into account when using a VNContour as an input.
     *
     * @param area         Output parameter to be populated with calculated contour area
     * @param contour      A VNContour object whose area is being calculated
     * @param orientedArea If true, returns signed area - positive for CCW oriented contours and negative for CW oriented contours.
     *                     If false, returned area is always positive.
     * @param error        An output parameter, populated only in case of algorithmic failure
     * @return Area calculation status, YES indicates success, NO - failure. The failure case is accompanied by populating an 'error' output parameter
     */
    @Generated
    @Selector("calculateArea:forContour:orientedArea:error:")
    public static native boolean calculateAreaForContourOrientedAreaError(DoublePtr area, VNContour contour,
            boolean orientedArea, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Calculates perimeter, or a sum of all arc-lengths (edges), of a closed contour. The contour is represented by a set of points in VNContour object.
     * Note that because this is based on a geometric shape the aspect ratio is important when using normalized points.
     * This takes the aspect ratio of the contour into account when using a VNContour as an input.
     *
     * @param perimeter Output parameter to be populated with calculated contour perimeter
     * @param contour   A VNContour object whose perimeter is being calculated
     * @param error     An output parameter, populated only in case of algorithmic failure
     * @return Perimeter calculation status, YES indicates success, NO - failure. The failure case is accompanied by populating an 'error' output parameter
     */
    @Generated
    @Selector("calculatePerimeter:forContour:error:")
    public static native boolean calculatePerimeterForContourError(DoublePtr perimeter, VNContour contour,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public native VNGeometryUtils init();

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
}
