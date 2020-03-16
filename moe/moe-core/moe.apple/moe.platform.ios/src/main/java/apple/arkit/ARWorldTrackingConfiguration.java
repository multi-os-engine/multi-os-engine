package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARWorldTrackingConfiguration extends ARConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected ARWorldTrackingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARWorldTrackingConfiguration alloc();

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
    public native ARWorldTrackingConfiguration init();

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
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("planeDetection")
    @NUInt
    public native long planeDetection();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setPlaneDetection:")
    public native void setPlaneDetection(@NUInt long value);

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
    @Selector("automaticImageScaleEstimationEnabled")
    public native boolean automaticImageScaleEstimationEnabled();

    @Generated
    @Selector("detectionImages")
    public native NSSet<? extends ARReferenceImage> detectionImages();

    @Generated
    @Selector("detectionObjects")
    public native NSSet<? extends ARReferenceObject> detectionObjects();

    @Generated
    @Selector("environmentTexturing")
    @NInt
    public native long environmentTexturing();

    @Generated
    @Selector("initialWorldMap")
    public native ARWorldMap initialWorldMap();

    @Generated
    @Selector("isAutoFocusEnabled")
    public native boolean isAutoFocusEnabled();

    @Generated
    @Selector("isCollaborationEnabled")
    public native boolean isCollaborationEnabled();

    @Generated
    @Selector("maximumNumberOfTrackedImages")
    @NInt
    public native long maximumNumberOfTrackedImages();

    @Generated
    @Selector("setAutoFocusEnabled:")
    public native void setAutoFocusEnabled(boolean value);

    @Generated
    @Selector("setAutomaticImageScaleEstimationEnabled:")
    public native void setAutomaticImageScaleEstimationEnabled(boolean value);

    @Generated
    @Selector("setCollaborationEnabled:")
    public native void setCollaborationEnabled(boolean value);

    @Generated
    @Selector("setDetectionImages:")
    public native void setDetectionImages(NSSet<? extends ARReferenceImage> value);

    @Generated
    @Selector("setDetectionObjects:")
    public native void setDetectionObjects(NSSet<? extends ARReferenceObject> value);

    @Generated
    @Selector("setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(@NInt long value);

    @Generated
    @Selector("setInitialWorldMap:")
    public native void setInitialWorldMap(ARWorldMap value);

    @Generated
    @Selector("setMaximumNumberOfTrackedImages:")
    public native void setMaximumNumberOfTrackedImages(@NInt long value);

    @Generated
    @Selector("setUserFaceTrackingEnabled:")
    public native void setUserFaceTrackingEnabled(boolean value);

    @Generated
    @Selector("setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean value);

    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    @Generated
    @Selector("supportsUserFaceTracking")
    public static native boolean supportsUserFaceTracking();

    @Generated
    @Selector("userFaceTrackingEnabled")
    public native boolean userFaceTrackingEnabled();

    @Generated
    @Selector("wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();
}