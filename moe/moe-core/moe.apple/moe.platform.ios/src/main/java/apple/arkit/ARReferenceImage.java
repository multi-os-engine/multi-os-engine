package apple.arkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGSize;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * A reference image to be detected in the scene.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARReferenceImage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ARReferenceImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARReferenceImage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARReferenceImage allocWithZone(VoidPtr zone);

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
    public native ARReferenceImage init();

    /**
     * Creates a new reference image.
     *
     * @param image         The reference image as CGImage.
     * @param orientation   The image orientation.
     * @param physicalWidth The width in meters of the physical object.
     */
    @Generated
    @Selector("initWithCGImage:orientation:physicalWidth:")
    public native ARReferenceImage initWithCGImageOrientationPhysicalWidth(CGImageRef image, int orientation,
            @NFloat double physicalWidth);

    /**
     * Creates a new reference image.
     *
     * @param pixelBuffer   The reference image as CVPixelBuffer.
     * @param physicalWidth The width in meters of the physical object.
     * @param orientation   The image orientation.
     */
    @Generated
    @Selector("initWithPixelBuffer:orientation:physicalWidth:")
    public native ARReferenceImage initWithPixelBufferOrientationPhysicalWidth(CVBufferRef pixelBuffer, int orientation,
            @NFloat double physicalWidth);

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
     * An optional name used to identify the image.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native ARReferenceImage new_objc();

    /**
     * The physical size of the image in meters.
     */
    @Generated
    @Selector("physicalSize")
    @ByValue
    public native CGSize physicalSize();

    /**
     * Returns the set of ARReferenceImages in the specified resource group and bundle.
     *
     * @param name   The name of the resource group.
     * @param bundle The bundle containing the image file or asset catalog. Specify nil to search the app’s main bundle.
     * @return The set of reference images or nil on error.
     */
    @Generated
    @Selector("referenceImagesInGroupNamed:bundle:")
    public static native NSSet<? extends ARReferenceImage> referenceImagesInGroupNamedBundle(String name,
            NSBundle bundle);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The AR resource group name for this image.
     * <p>
     * If this image was loaded via an AR resource group in the Xcode asset catalogue this property will have the name of the resource group,
     * else be set to nil.
     */
    @Generated
    @Selector("resourceGroupName")
    public native String resourceGroupName();

    /**
     * An optional name used to identify the image.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Validate if this image can be used for image detection or tracking.
     * <p>
     * When loading reference images from the asset catalog this verification is not needed as the same verification happens
     * at compile time.
     *
     * @param completionHandler Completion handler invoked when validation is done. The completion handler takes the following parameters:
     *                          error - An error that indicates why the image is not suitable for tracking, or nil if no error occured.
     */
    @Generated
    @Selector("validateWithCompletionHandler:")
    public native void validateWithCompletionHandler(
            @ObjCBlock(name = "call_validateWithCompletionHandler") Block_validateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_validateWithCompletionHandler {
        @Generated
        void call_validateWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
