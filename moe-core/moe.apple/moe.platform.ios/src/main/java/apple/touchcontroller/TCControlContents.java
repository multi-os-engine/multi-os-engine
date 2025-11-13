package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Represents the visual contents of a touch control.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCControlContents extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCControlContents(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCControlContents alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCControlContents allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The button contents for the specified system image name, size, and shape.
     * 
     * - Parameters:
     * - imageName: The name of the system image to use for the button.
     * - size: The size of the button in points.
     * - shape: The shape of the button.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonContentsForSystemImageNamed:size:shape:controller:")
    @NotNull
    public static native TCControlContents buttonContentsForSystemImageNamedSizeShapeController(
            @NotNull String imageName, @ByValue CGSize size, @NInt long shape, @NotNull TCTouchController controller);

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

    /**
     * Creates a new instance with the specified images.
     * 
     * - Parameters:
     * - images: An array of `TCControlImage` objects to use for the contents.
     * - Returns: A new `TCControlContents` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("contentsWithImages:")
    public static native TCControlContents contentsWithImages(@NotNull NSArray<? extends TCControlImage> images);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The direction pad contents for the specified label, size, style, and direction.
     * 
     * - Parameters:
     * - label: The label for the direction pad.
     * - size: The size of the direction pad in points.
     * - style: The style of the direction pad.
     * - direction: The direction of the direction pad visual.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("directionPadContentsForLabel:size:style:direction:controller:")
    @NotNull
    public static native TCControlContents directionPadContentsForLabelSizeStyleDirectionController(
            @NotNull TCControlLabel label, @ByValue CGSize size, @NInt long style, @NInt long direction,
            @NotNull TCTouchController controller);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The array of objects used to render the control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("images")
    @NotNull
    public native NSArray<? extends TCControlImage> images();

    @Generated
    @Selector("init")
    public native TCControlContents init();

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
    public static native TCControlContents new_objc();

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
     * The switch contents for the specified system image name, size, and shape.
     * 
     * - Parameters:
     * - imageName: The name of the system image to use for the switch button.
     * - size: The size of the switch button in points.
     * - shape: The shape of the switch button.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the switch button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("switchedOnContentsForSystemImageNamed:size:shape:controller:")
    @NotNull
    public static native TCControlContents switchedOnContentsForSystemImageNamedSizeShapeController(
            @NotNull String imageName, @ByValue CGSize size, @NInt long shape, @NotNull TCTouchController controller);

    /**
     * The throttle background contents for the specified size.
     * 
     * - Parameters:
     * - size: The size of the throttle background in points.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the throttle background.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("throttleBackgroundContentsOfSize:controller:")
    @NotNull
    public static native TCControlContents throttleBackgroundContentsOfSizeController(@ByValue CGSize size,
            @NotNull TCTouchController controller);

    /**
     * The throttle indicator contents for the specified size.
     * 
     * - Parameters:
     * - size: The size of the throttle indicator in points.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the throttle indicator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("throttleIndicatorContentsOfSize:controller:")
    @NotNull
    public static native TCControlContents throttleIndicatorContentsOfSizeController(@ByValue CGSize size,
            @NotNull TCTouchController controller);

    /**
     * The thumbstick background contents for the specified size.
     * 
     * - Parameters:
     * - size: The size of the thumbstick background in points.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the thumbstick background.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("thumbstickBackgroundContentsOfSize:controller:")
    @NotNull
    public static native TCControlContents thumbstickBackgroundContentsOfSizeController(@ByValue CGSize size,
            @NotNull TCTouchController controller);

    /**
     * The thumbstick stick contents for the specified size.
     * 
     * - Parameters:
     * - size: The size of the thumbstick stick in points.
     * - controller: The touch controller to create control contents for.
     * - Returns: The `TCControlContents` for the thumbstick stick.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("thumbstickStickContentsOfSize:controller:")
    @NotNull
    public static native TCControlContents thumbstickStickContentsOfSizeController(@ByValue CGSize size,
            @NotNull TCTouchController controller);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}