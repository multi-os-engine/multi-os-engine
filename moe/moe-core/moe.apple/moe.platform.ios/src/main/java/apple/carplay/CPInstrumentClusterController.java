package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPInstrumentClusterControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIWindow;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPInstrumentClusterController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CPInstrumentClusterController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPInstrumentClusterController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPInstrumentClusterController allocWithZone(VoidPtr zone);

    /**
     * attributedInactiveDescriptionVariants is an array of @c NSAttributedString to be displayed when the user is not
     * actively navigating,
     * arranged from most to least preferred.
     * 
     * [@c] attributedInactiveDescriptionVariants will be preferred over inactiveDescriptionVariants.
     * 
     * Only one attribute is presently supported: text attachments. You may annotate the string with an image
     * by including a text attachment. The maximum text attachment image size is 64x16 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     */
    @NotNull
    @Generated
    @Selector("attributedInactiveDescriptionVariants")
    public native NSArray<? extends NSAttributedString> attributedInactiveDescriptionVariants();

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
    @Selector("compassSetting")
    @NUInt
    public native long compassSetting();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPInstrumentClusterControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * inactiveDescriptionVariants is an array of @c NSString to be displayed when the user is not actively navigating,
     * arranged from most to least preferred.
     */
    @NotNull
    @Generated
    @Selector("inactiveDescriptionVariants")
    public native NSArray<String> inactiveDescriptionVariants();

    @Generated
    @Selector("init")
    public native CPInstrumentClusterController init();

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
     * The UIWindow created for this CPInstrumentClusterController
     */
    @Nullable
    @Generated
    @Selector("instrumentClusterWindow")
    public native UIWindow instrumentClusterWindow();

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
    public static native CPInstrumentClusterController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * attributedInactiveDescriptionVariants is an array of @c NSAttributedString to be displayed when the user is not
     * actively navigating,
     * arranged from most to least preferred.
     * 
     * [@c] attributedInactiveDescriptionVariants will be preferred over inactiveDescriptionVariants.
     * 
     * Only one attribute is presently supported: text attachments. You may annotate the string with an image
     * by including a text attachment. The maximum text attachment image size is 64x16 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     */
    @Generated
    @Selector("setAttributedInactiveDescriptionVariants:")
    public native void setAttributedInactiveDescriptionVariants(@NotNull NSArray<? extends NSAttributedString> value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CPInstrumentClusterControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CPInstrumentClusterControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * inactiveDescriptionVariants is an array of @c NSString to be displayed when the user is not actively navigating,
     * arranged from most to least preferred.
     */
    @Generated
    @Selector("setInactiveDescriptionVariants:")
    public native void setInactiveDescriptionVariants(@NotNull NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("speedLimitSetting")
    @NUInt
    public native long speedLimitSetting();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}