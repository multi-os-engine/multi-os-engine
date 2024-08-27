package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
 * VNFaceLandmarks2D
 * 
 * VNFaceLandmarks2D is the result of a face landmarks 2D request, containing detected facial landmark points organized
 * into VNFaceLandmarkRegion2D regions. The points are accessible as a full list, or as sub-gruops representing
 * pre-defined facial regions.
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNFaceLandmarks2D extends VNFaceLandmarks {
    static {
        NatJ.register();
    }

    @Generated
    protected VNFaceLandmarks2D(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * allPoints the region containing all face landmark points.
     */
    @Nullable
    @Generated
    @Selector("allPoints")
    public native VNFaceLandmarkRegion2D allPoints();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNFaceLandmarks2D alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNFaceLandmarks2D allocWithZone(VoidPtr zone);

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

    /**
     * faceContour the region containing the points that describe the face contour from cheek over chin to cheek.
     */
    @Nullable
    @Generated
    @Selector("faceContour")
    public native VNFaceLandmarkRegion2D faceContour();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNFaceLandmarks2D init();

    /**
     * innerLips the region containing the points describing the outline of the space between the of the lips.
     */
    @Nullable
    @Generated
    @Selector("innerLips")
    public native VNFaceLandmarkRegion2D innerLips();

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
     * leftEye the region containing the points describing the outline of the left eye.
     */
    @Nullable
    @Generated
    @Selector("leftEye")
    public native VNFaceLandmarkRegion2D leftEye();

    /**
     * leftEyebrow the region containing the points describing the trace of the left eyebrow.
     */
    @Nullable
    @Generated
    @Selector("leftEyebrow")
    public native VNFaceLandmarkRegion2D leftEyebrow();

    /**
     * leftPupil the region containing the point where the left pupil is located. This value may be inaccurate if
     * the face isBlinking.
     */
    @Nullable
    @Generated
    @Selector("leftPupil")
    public native VNFaceLandmarkRegion2D leftPupil();

    /**
     * medianLine the region containing the points describing the trace of the center line of the face.
     */
    @Nullable
    @Generated
    @Selector("medianLine")
    public native VNFaceLandmarkRegion2D medianLine();

    @Generated
    @Owned
    @Selector("new")
    public static native VNFaceLandmarks2D new_objc();

    /**
     * nose the region containing the points describing the outline of the nose.
     */
    @Nullable
    @Generated
    @Selector("nose")
    public native VNFaceLandmarkRegion2D nose();

    /**
     * noseCrest the region containing the points describing the trace of the center crest of the nose.
     */
    @Nullable
    @Generated
    @Selector("noseCrest")
    public native VNFaceLandmarkRegion2D noseCrest();

    /**
     * outer lips the region containing the points describing the outline of the outside of the lips.
     */
    @Nullable
    @Generated
    @Selector("outerLips")
    public native VNFaceLandmarkRegion2D outerLips();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * rightEye the region containing the points describing the outline of the right eye.
     */
    @Nullable
    @Generated
    @Selector("rightEye")
    public native VNFaceLandmarkRegion2D rightEye();

    /**
     * rightEyebrow the region containing the points describing the trace of the right eyebrow.
     */
    @Nullable
    @Generated
    @Selector("rightEyebrow")
    public native VNFaceLandmarkRegion2D rightEyebrow();

    /**
     * rightPupil the region containing the point where the right pupil is located. This value may be inaccurate if
     * the face isBlinking.
     */
    @Nullable
    @Generated
    @Selector("rightPupil")
    public native VNFaceLandmarkRegion2D rightPupil();

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

    @Generated
    @Selector("initWithCoder:")
    public native VNFaceLandmarks2D initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
