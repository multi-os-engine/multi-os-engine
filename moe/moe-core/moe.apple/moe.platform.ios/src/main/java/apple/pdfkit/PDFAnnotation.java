package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIBezierPath;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
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

@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFAnnotation extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFAnnotation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("action")
    public native PDFAction action();

    @Generated
    @Selector("addBezierPath:")
    public native void addBezierPath(UIBezierPath path);

    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFAnnotation alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allowsToggleToOff")
    public native boolean allowsToggleToOff();

    @Generated
    @Selector("annotationKeyValues")
    public native NSDictionary<?, ?> annotationKeyValues();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("border")
    public native PDFBorder border();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("buttonWidgetState")
    @NInt
    public native long buttonWidgetState();

    @Generated
    @Selector("buttonWidgetStateString")
    public native String buttonWidgetStateString();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("caption")
    public native String caption();

    @Generated
    @Selector("choices")
    public native NSArray<String> choices();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("color")
    public native UIColor color();

    @Generated
    @Selector("contents")
    public native String contents();

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

    @Generated
    @Selector("destination")
    public native PDFDestination destination();

    @Generated
    @Selector("drawWithBox:inContext:")
    public native void drawWithBoxInContext(@NInt long box, CGContextRef context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endLineStyle")
    @NInt
    public native long endLineStyle();

    @Generated
    @Selector("endPoint")
    @ByValue
    public native CGPoint endPoint();

    @Generated
    @Selector("fieldName")
    public native String fieldName();

    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @Selector("fontColor")
    public native UIColor fontColor();

    @Generated
    @Selector("hasAppearanceStream")
    public native boolean hasAppearanceStream();

    @Generated
    @Selector("hasComb")
    public native boolean hasComb();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("iconType")
    @NInt
    public native long iconType();

    @Generated
    @Selector("init")
    public native PDFAnnotation init();

    @Generated
    @Selector("initWithBounds:forType:withProperties:")
    public native PDFAnnotation initWithBoundsForTypeWithProperties(@ByValue CGRect bounds, String annotationType,
            NSDictionary<?, ?> properties);

    @Generated
    @Selector("initWithCoder:")
    public native PDFAnnotation initWithCoder(NSCoder coder);

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
    @Selector("interiorColor")
    public native UIColor interiorColor();

    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    @Generated
    @Selector("isListChoice")
    public native boolean isListChoice();

    @Generated
    @Selector("isMultiline")
    public native boolean isMultiline();

    @Generated
    @Selector("isOpen")
    public native boolean isOpen();

    @Generated
    @Selector("isPasswordField")
    public native boolean isPasswordField();

    @Generated
    @Selector("isReadOnly")
    public native boolean isReadOnly();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("lineStyleFromName:")
    @NInt
    public static native long lineStyleFromName(String name);

    @Generated
    @Selector("markupType")
    @NInt
    public native long markupType();

    @Generated
    @Selector("maximumLength")
    @NInt
    public native long maximumLength();

    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("nameForLineStyle:")
    public static native String nameForLineStyle(@NInt long style);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("page")
    public native PDFPage page();

    @Generated
    @Selector("paths")
    public native NSArray<? extends UIBezierPath> paths();

    @Generated
    @Selector("popup")
    public native PDFAnnotation popup();

    @Generated
    @Selector("quadrilateralPoints")
    public native NSArray<? extends NSValue> quadrilateralPoints();

    @Generated
    @Selector("radiosInUnison")
    public native boolean radiosInUnison();

    @Generated
    @Selector("removeBezierPath:")
    public native void removeBezierPath(UIBezierPath path);

    @Generated
    @Selector("removeValueForAnnotationKey:")
    public native void removeValueForAnnotationKey(String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAction:")
    public native void setAction(PDFAction value);

    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    @Generated
    @Selector("setAllowsToggleToOff:")
    public native void setAllowsToggleToOff(boolean value);

    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setBoolean:forAnnotationKey:")
    public native boolean setBooleanForAnnotationKey(boolean value, String key);

    @Generated
    @Selector("setBorder:")
    public native void setBorder(PDFBorder value);

    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    @Generated
    @Selector("setButtonWidgetState:")
    public native void setButtonWidgetState(@NInt long value);

    @Generated
    @Selector("setButtonWidgetStateString:")
    public native void setButtonWidgetStateString(String value);

    @Generated
    @Selector("setCaption:")
    public native void setCaption(String value);

    @Generated
    @Selector("setChoices:")
    public native void setChoices(NSArray<String> value);

    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    @Generated
    @Selector("setComb:")
    public native void setComb(boolean value);

    @Generated
    @Selector("setContents:")
    public native void setContents(String value);

    @Generated
    @Selector("setDestination:")
    public native void setDestination(PDFDestination value);

    @Generated
    @Selector("setEndLineStyle:")
    public native void setEndLineStyle(@NInt long value);

    @Generated
    @Selector("setEndPoint:")
    public native void setEndPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setFieldName:")
    public native void setFieldName(String value);

    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    @Generated
    @Selector("setFontColor:")
    public native void setFontColor(UIColor value);

    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    @Generated
    @Selector("setIconType:")
    public native void setIconType(@NInt long value);

    @Generated
    @Selector("setInteriorColor:")
    public native void setInteriorColor(UIColor value);

    @Generated
    @Selector("setListChoice:")
    public native void setListChoice(boolean value);

    @Generated
    @Selector("setMarkupType:")
    public native void setMarkupType(@NInt long value);

    @Generated
    @Selector("setMaximumLength:")
    public native void setMaximumLength(@NInt long value);

    @Generated
    @Selector("setModificationDate:")
    public native void setModificationDate(NSDate value);

    @Generated
    @Selector("setMultiline:")
    public native void setMultiline(boolean value);

    @Generated
    @Selector("setOpen:")
    public native void setOpen(boolean value);

    @Generated
    @Selector("setPage:")
    public native void setPage_unsafe(PDFPage value);

    @Generated
    public void setPage(PDFPage value) {
        Object __old = page();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPage_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setPopup:")
    public native void setPopup(PDFAnnotation value);

    @Generated
    @Selector("setQuadrilateralPoints:")
    public native void setQuadrilateralPoints(NSArray<? extends NSValue> value);

    @Generated
    @Selector("setRadiosInUnison:")
    public native void setRadiosInUnison(boolean value);

    @Generated
    @Selector("setReadOnly:")
    public native void setReadOnly(boolean value);

    @Generated
    @Selector("setRect:forAnnotationKey:")
    public native boolean setRectForAnnotationKey(@ByValue CGRect value, String key);

    @Generated
    @Selector("setShouldDisplay:")
    public native void setShouldDisplay(boolean value);

    @Generated
    @Selector("setShouldPrint:")
    public native void setShouldPrint(boolean value);

    @Generated
    @Selector("setStampName:")
    public native void setStampName(String value);

    @Generated
    @Selector("setStartLineStyle:")
    public native void setStartLineStyle(@NInt long value);

    @Generated
    @Selector("setStartPoint:")
    public native void setStartPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setType:")
    public native void setType(String value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    @Generated
    @Selector("setUserName:")
    public native void setUserName(String value);

    @Generated
    @Selector("setValue:forAnnotationKey:")
    public native boolean setValueForAnnotationKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setValues:")
    public native void setValues(NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWidgetControlType:")
    public native void setWidgetControlType(@NInt long value);

    @Generated
    @Selector("setWidgetDefaultStringValue:")
    public native void setWidgetDefaultStringValue(String value);

    @Generated
    @Selector("setWidgetFieldType:")
    public native void setWidgetFieldType(String value);

    @Generated
    @Selector("setWidgetStringValue:")
    public native void setWidgetStringValue(String value);

    @Generated
    @Selector("shouldDisplay")
    public native boolean shouldDisplay();

    @Generated
    @Selector("shouldPrint")
    public native boolean shouldPrint();

    @Generated
    @Selector("stampName")
    public native String stampName();

    @Generated
    @Selector("startLineStyle")
    @NInt
    public native long startLineStyle();

    @Generated
    @Selector("startPoint")
    @ByValue
    public native CGPoint startPoint();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("type")
    public native String type();

    @Generated
    @Selector("userName")
    public native String userName();

    @Generated
    @Selector("valueForAnnotationKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForAnnotationKey(String key);

    @Generated
    @Selector("values")
    public native NSArray<String> values();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("widgetControlType")
    @NInt
    public native long widgetControlType();

    @Generated
    @Selector("widgetDefaultStringValue")
    public native String widgetDefaultStringValue();

    @Generated
    @Selector("widgetFieldType")
    public native String widgetFieldType();

    @Generated
    @Selector("widgetStringValue")
    public native String widgetStringValue();
}