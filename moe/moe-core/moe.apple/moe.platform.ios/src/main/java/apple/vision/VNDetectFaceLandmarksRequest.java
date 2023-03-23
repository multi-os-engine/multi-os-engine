package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.vision.protocol.VNFaceObservationAccepting;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A request that will produce face landmark information.
 * 
 * This request will generate VNFaceObservation objects with the landmarks property populated with information
 * describing face landmarks. If VNFaceObservations are provided via the VNFaceObservationAccepting protocol without the
 * landmarks property populated, new observations will be created as copies of the input VNFaceObservations with the
 * landmarks property populated. If the landmarks property has already been populated, the original VNFaceObservations
 * will be returned. If no VNFaceObservations are provided, face detection will be run first.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectFaceLandmarksRequest extends VNImageBasedRequest implements VNFaceObservationAccepting {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectFaceLandmarksRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectFaceLandmarksRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNDetectFaceLandmarksRequest allocWithZone(VoidPtr zone);

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
    public native VNDetectFaceLandmarksRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectFaceLandmarksRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("inputFaceObservations")
    public native NSArray<? extends VNFaceObservation> inputFaceObservations();

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
    public static native VNDetectFaceLandmarksRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setInputFaceObservations:")
    public native void setInputFaceObservations(NSArray<? extends VNFaceObservation> value);

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

    /**
     * [@property] property constellation
     * 
     * Constellation type defines how many landmark points are used to map a face. Revisions 1, 2, and 3 of the request
     * support 65 points, where Revision 3 also supports 76 points.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("constellation")
    @NUInt
    public native long constellation();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("revision:supportsConstellation:")
    public static native boolean revisionSupportsConstellation(@NUInt long requestRevision, @NUInt long constellation);

    /**
     * [@property] property constellation
     * 
     * Constellation type defines how many landmark points are used to map a face. Revisions 1, 2, and 3 of the request
     * support 65 points, where Revision 3 also supports 76 points.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setConstellation:")
    public native void setConstellation(@NUInt long value);

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * VNFaceObservation with populated landmarks-related properties results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNFaceObservation> results();
}
