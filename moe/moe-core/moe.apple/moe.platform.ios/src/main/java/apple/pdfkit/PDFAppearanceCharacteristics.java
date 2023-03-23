package apple.pdfkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIColor;
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

/**
 * API-Since: 11.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFAppearanceCharacteristics extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFAppearanceCharacteristics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFAppearanceCharacteristics alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFAppearanceCharacteristics allocWithZone(VoidPtr zone);

    /**
     * List all appearance characteristics properties as key-value pairs; returns a deep copy of all pairs.
     * Helpful for debugging.
     */
    @Generated
    @Selector("appearanceCharacteristicsKeyValues")
    public native NSDictionary<?, ?> appearanceCharacteristicsKeyValues();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The background color of the widget annotation.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * The border color of the widget annotation.
     */
    @Generated
    @Selector("borderColor")
    public native UIColor borderColor();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * The widget annotation’s normal caption, displayed when it is not interacting with the user.
     */
    @Generated
    @Selector("caption")
    public native String caption();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * For button widget annotations, need to specify the control type for PDFAppearanceCharacteristics
     * as certain attributes, i.e. captions, are only available for certain flavors.
     * Control type does not need to be set for text or choice widget annotations.
     */
    @Generated
    @Selector("controlType")
    @NInt
    public native long controlType();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The widget's caption displayed when the user holds the mouse button while over the annotation.
     * Applies only to kPDFWidgetPushButtonControl.
     */
    @Generated
    @Selector("downCaption")
    public native String downCaption();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PDFAppearanceCharacteristics init();

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
    public static native PDFAppearanceCharacteristics new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The widget's caption displayed when the user moves the mouse over the annotation.
     * Applies only to kPDFWidgetPushButtonControl.
     */
    @Generated
    @Selector("rolloverCaption")
    public native String rolloverCaption();

    /**
     * The number of *degrees* by which the widget annotation is rotated counterclockwise relative to the page.
     * The value must be a multiple of 90. Default value: 0.
     */
    @Generated
    @Selector("rotation")
    @NInt
    public native long rotation();

    /**
     * The background color of the widget annotation.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * The border color of the widget annotation.
     */
    @Generated
    @Selector("setBorderColor:")
    public native void setBorderColor(UIColor value);

    /**
     * The widget annotation’s normal caption, displayed when it is not interacting with the user.
     */
    @Generated
    @Selector("setCaption:")
    public native void setCaption(String value);

    /**
     * For button widget annotations, need to specify the control type for PDFAppearanceCharacteristics
     * as certain attributes, i.e. captions, are only available for certain flavors.
     * Control type does not need to be set for text or choice widget annotations.
     */
    @Generated
    @Selector("setControlType:")
    public native void setControlType(@NInt long value);

    /**
     * The widget's caption displayed when the user holds the mouse button while over the annotation.
     * Applies only to kPDFWidgetPushButtonControl.
     */
    @Generated
    @Selector("setDownCaption:")
    public native void setDownCaption(String value);

    /**
     * The widget's caption displayed when the user moves the mouse over the annotation.
     * Applies only to kPDFWidgetPushButtonControl.
     */
    @Generated
    @Selector("setRolloverCaption:")
    public native void setRolloverCaption(String value);

    /**
     * The number of *degrees* by which the widget annotation is rotated counterclockwise relative to the page.
     * The value must be a multiple of 90. Default value: 0.
     */
    @Generated
    @Selector("setRotation:")
    public native void setRotation(@NInt long value);

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
