package apple.cinematic;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Represents focus & detection information at a particular time.
 * 
 * Indicates where to focus (disparity) and what to focus on (detection) at a particular time in the movie.
 * It also provides access to all known detections that can be focused on at that time.
 * Utility methods support looking up a detection by detectionID or detectionGroupID.
 * 
 * Frames are obtained from the cinematic script using `frame(at:tolerance:)` or `frames(in:)`.
 * 
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNScriptFrame extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CNScriptFrame(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * All detected objects in this frame.
     */
    @Generated
    @Selector("allDetections")
    @NotNull
    public native NSArray<? extends CNDetection> allDetections();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNScriptFrame alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNScriptFrame allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The best detection to focus on in this frame among those with the given detectionGroupID.
     * For example, a face is preferred to the corresponding torso, even though both have the same detectionGroupID.
     */
    @Generated
    @Selector("bestDetectionForGroupID:")
    @Nullable
    public native CNDetection bestDetectionForGroupID(long detectionGroupID);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The detection in this frame with the given detection ID, if any.
     */
    @Generated
    @Selector("detectionForID:")
    @Nullable
    public native CNDetection detectionForID(long detectionID);

    /**
     * The detection on which the script is focused in this frame.
     * 
     * The focusDisparity of the focusDetection can be different from that of the frame such as when a rack focus is in
     * progress.
     */
    @Generated
    @Selector("focusDetection")
    @NotNull
    public native CNDetection focusDetection();

    /**
     * The disparity value representing the focus plane at which the script is focused in this frame.
     * 
     * A larger disparity results in the focus plane being closer to the camera. The scale and offset of disparity is
     * not defined.
     * 
     * Pass this to the rendering session when rendering the corresponding frame of the movie to focus at the
     * recommended depth.
     */
    @Generated
    @Selector("focusDisparity")
    public native float focusDisparity();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNScriptFrame init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNScriptFrame new_objc();

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

    /**
     * The presentation time associated with the remaining properties.
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}