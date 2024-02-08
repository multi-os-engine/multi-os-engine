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
 * A button for placement in a navigation bar.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPBarButton extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPBarButton(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPBarButton alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPBarButton allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("buttonType")
    @NUInt
    public native long buttonType();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The image displayed on the button.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     * 
     * [@note] If both an image and title are specified, the title will take precedence.
     * To use an image, ensure that the button's title is nil.
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native CPBarButton init();

    @Generated
    @Selector("initWithCoder:")
    public native CPBarButton initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithType:handler:")
    public native CPBarButton initWithTypeHandler(@NUInt long type,
            @Nullable @ObjCBlock(name = "call_initWithTypeHandler") Block_initWithTypeHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTypeHandler {
        @Generated
        void call_initWithTypeHandler(@NotNull CPBarButton arg0);
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
    public static native CPBarButton new_objc();

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
     * The image displayed on the button.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     * 
     * [@note] If both an image and title are specified, the title will take precedence.
     * To use an image, ensure that the button's title is nil.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * The title displayed on the button.
     * 
     * [@note] If both an image and title are specified, the title will take precedence.
     * To use an image, ensure that the button's title is nil.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

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

    /**
     * The title displayed on the button.
     * 
     * [@note] If both an image and title are specified, the title will take precedence.
     * To use an image, ensure that the button's title is nil.
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The style used to display this button.
     * 
     * Defaults to @c CPBarButtonStyleNone.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("buttonStyle")
    @NInt
    public native long buttonStyle();

    /**
     * Convenience initializer that creates a bar button that renders with an image.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithImage:handler:")
    public native CPBarButton initWithImageHandler(@NotNull UIImage image,
            @Nullable @ObjCBlock(name = "call_initWithImageHandler") Block_initWithImageHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithImageHandler {
        @Generated
        void call_initWithImageHandler(@NotNull CPBarButton arg0);
    }

    /**
     * Convenience initializer that creates a bar button that displays a text label.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithTitle:handler:")
    public native CPBarButton initWithTitleHandler(@NotNull String title,
            @Nullable @ObjCBlock(name = "call_initWithTitleHandler") Block_initWithTitleHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleHandler {
        @Generated
        void call_initWithTitleHandler(@NotNull CPBarButton arg0);
    }

    /**
     * The style used to display this button.
     * 
     * Defaults to @c CPBarButtonStyleNone.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setButtonStyle:")
    public native void setButtonStyle(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
