package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPMapButton extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPMapButton(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPMapButton alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPMapButton allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The image displayed on the button when focused.
     * 
     * The button will automatically create a focused image using the alpha values from the source image.
     * 
     * [@note] If unspecified, the button will use the default @c image
     */
    @Nullable
    @Generated
    @Selector("focusedImage")
    public native UIImage focusedImage();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The image displayed on the button.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native CPMapButton init();

    @Generated
    @Selector("initWithCoder:")
    public native CPMapButton initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a new map button.
     * 
     * @param handler A block to execute when the user selects the button. The block has no return value and takes the
     *                selected button as its only parameter.
     */
    @Generated
    @Selector("initWithHandler:")
    public native CPMapButton initWithHandler(
            @Nullable @ObjCBlock(name = "call_initWithHandler") Block_initWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithHandler {
        @Generated
        void call_initWithHandler(@NotNull CPMapButton mapButton);
    }

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

    /**
     * A Boolean value indicating whether the button is enabled.
     * 
     * Set the value of this property to @c YES to enable the button or @c NO to disable it. The default value of this
     * property is @c YES.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * A Boolean value indicating whether the button is hidden.
     * 
     * Setting the value of this property to @c YES hides the button and setting it to @c NO shows it. The default value
     * is @c NO.
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPMapButton new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value indicating whether the button is enabled.
     * 
     * Set the value of this property to @c YES to enable the button or @c NO to disable it. The default value of this
     * property is @c YES.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * The image displayed on the button when focused.
     * 
     * The button will automatically create a focused image using the alpha values from the source image.
     * 
     * [@note] If unspecified, the button will use the default @c image
     */
    @Generated
    @Selector("setFocusedImage:")
    public native void setFocusedImage(@Nullable UIImage value);

    /**
     * A Boolean value indicating whether the button is hidden.
     * 
     * Setting the value of this property to @c YES hides the button and setting it to @c NO shows it. The default value
     * is @c NO.
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * The image displayed on the button.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
