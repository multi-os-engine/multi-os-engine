package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 11.0
 */
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

    /**
     * URL for the link. May be nil if no URL action associated with link; in this case the -[destination] may be valid.
     * The preferred way though is to call -[PDFAnnotation action] and -[PDFAnnotation setAction:].
     * Used by annotations type(s): /Link.
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Optional action performed when a user clicks / taps an annotation. PDF readers ignore actions except
     * for those associated with Link or button Widget annotations.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("action")
    public native PDFAction action();

    /**
     * Add or remove paths from the annotation.
     * Path points are specified in annotation space.
     * Used by annotations type(s): /Ink.
     */
    @Generated
    @Selector("addBezierPath:")
    public native void addBezierPath(UIBezierPath path);

    /**
     * Alignment of text within annotation bounds. Supported: NSLeftTextAlignment, NSRightTextAlignment and
     * NSCenterTextAlignment.
     * Used by annotations type(s): /FreeText, /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFAnnotation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFAnnotation allocWithZone(VoidPtr zone);

    /**
     * For radio buttons, indicates whether clicking on widget whose state is already On toggles it Off.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("allowsToggleToOff")
    public native boolean allowsToggleToOff();

    /**
     * List all key-value pairs for this annotation; returns a deep copy of all pairs.
     * Note that this method will not include a copy of the value for /Parent. This is by design as to avoid
     * introduing a memory cycle. If you would like to get the /Parent propery, use -[PDFAnnotation
     * valueForAnnotationKey:]
     * with key PDFAnnotationKeyParent.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("annotationKeyValues")
    public native NSDictionary<?, ?> annotationKeyValues();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Background color characteristics.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * Optional border or border style that describes how to draw the annotation border (if any). For the "geometry"
     * annotations (Circle, Ink, Line, Square), the border indicates the line width and whether to draw with a dash
     * pattern
     * or solid pattern. PDFAnnotation markup types (Highlight, Strikethrough, Underline) ignores the border.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("border")
    public native PDFBorder border();

    /**
     * Required for all annotations. The bounding box in page-space of the annotation.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * The current state of a button widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("buttonWidgetState")
    @NInt
    public native long buttonWidgetState();

    /**
     * The string that represents the ON state of a button widget annotation.
     * This should be set when trying to, for example, group together a set of radio buttons with the same field name.
     * When buttons share the same field name, their individual state strings set them apart from one another.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
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

    /**
     * Label for the button. Applies to kPDFWidgetPushButtonControl only.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("caption")
    public native String caption();

    /**
     * The choices are an array of strings indicating the options (items) in either a list or pop-up menu.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("choices")
    public native NSArray<String> choices();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * For many annotations ("Circle", "Square") the stroke color. Used for other annotations as well.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * A string of text associated with an annotation. Often displayed in a window when the annotation is clicked on
     * ("FreeText" and "Text" especially).
     * 
     * API-Since: 11.0
     */
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

    /**
     * Destination for the link. May be nil if no destination associated with link; in this case the -[URL] may be
     * valid.
     * The preferred way though is to call -[PDFAnnotation action] and -[PDFAnnotation setAction:].
     * Used by annotations type(s): /Link.
     */
    @Generated
    @Selector("destination")
    public native PDFDestination destination();

    /**
     * Draw method. Draws in page-space relative to origin of "box" passed in and to the given context
     * 
     * API-Since: 11.0
     */
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

    /**
     * Widget annotations backed by form data have (internal) field names with which to associate a value or data.
     * Can also be used for ResetForm actions.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("fieldName")
    public native String fieldName();

    /**
     * Font and font color associated with the text field.
     * Used by annotations type(s): /FreeText, /Popup, /Widget (field type(s): /Btn, /Ch, and /Tx).
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    /**
     * Width of line used to stroke border.
     * Used by annotations type(s): /FreeText, /Widget (field type(s): /Btn, /Ch, and /Tx).
     */
    @Generated
    @Selector("fontColor")
    public native UIColor fontColor();

    /**
     * Returns YES if the annotation has an appearance stream. Annotations with appearance streams are drawn using their
     * stream. As a result setting many parameters (like -[setColor:] above) will have no visible effect.
     */
    @Generated
    @Selector("hasAppearanceStream")
    public native boolean hasAppearanceStream();

    /**
     * Used to configure combing for PDF text fields.
     * If set, the field is automatically divided into as many equally spaced positions, or combs, as the value of the
     * maximum length of the field. To get the maximum length, use annotaiton key: PDFAnnotationKeyWidgetMaxLen.
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("hasComb")
    public native boolean hasComb();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The type of icon displayed in the PDF. Supported icons: "Comment", "Key", "Note", "Help", "NewParagraph",
     * "Paragraph" and "Insert".
     * Used by annotations type(s): /Text.
     */
    @Generated
    @Selector("iconType")
    @NInt
    public native long iconType();

    @Generated
    @Selector("init")
    public native PDFAnnotation init();

    /**
     * Create a custom annotation with bounds, a type (PDFAnnotationSubtype), and an (optional) dictionary of annotation
     * properties.
     * 
     * API-Since: 11.0
     */
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

    /**
     * Interior color of the annotation.
     * Used by annotations type(s): /Circle, /Line, /Square.
     */
    @Generated
    @Selector("interiorColor")
    public native UIColor interiorColor();

    /**
     * The highlight state dictates how the annotation is drawn. For example, if a user has clicked on a
     * "Link" annotation, you should set highlighted to YES and redraw it. When the user lets up, set highlighted to
     * NO and redraw again.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * There are two flavors of Choice widget annotations, lists and pop-up menus. This method allow you to
     * differentiate.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("isListChoice")
    public native boolean isListChoice();

    /**
     * Used to configure multiline PDF text fields.
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("isMultiline")
    public native boolean isMultiline();

    /**
     * Used to tell if an annotation is open or closed.
     * Used by annotations type(s): /Popup.
     */
    @Generated
    @Selector("isOpen")
    public native boolean isOpen();

    /**
     * Used to determine if a PDF text field is a password field.
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("isPasswordField")
    public native boolean isPasswordField();

    /**
     * Determines if a text field should be editable or not.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("isReadOnly")
    public native boolean isReadOnly();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Class methods to help with mapping PDFLineStyle to the associated name based on PDF specification
     * Used by annotations type(s): /Line.
     */
    @Generated
    @Selector("lineStyleFromName:")
    @NInt
    public static native long lineStyleFromName(String name);

    /**
     * Type of mark-up (highlight, strike-out or underline). Changing the markup type also changes the annotations type.
     * Used by annotations type(s): /Highlight, /StrikeOut, /Underline.
     */
    @Generated
    @Selector("markupType")
    @NInt
    public native long markupType();

    /**
     * Maximum characters allowed (optional, zero indicates no specified maximum).
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("maximumLength")
    @NInt
    public native long maximumLength();

    /**
     * Optional (-[modificationDate] may return nil). Modification date of the annotation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("nameForLineStyle:")
    public static native String nameForLineStyle(@NInt long style);

    @Generated
    @Owned
    @Selector("new")
    public static native PDFAnnotation new_objc();

    /**
     * Returns the page the annotation is associated with (may return nil if annotation not associated with a page).
     */
    @Generated
    @Selector("page")
    public native PDFPage page();

    /**
     * Array of NSBezierPaths / UIBezierPaths that comprise the annotation.
     * Paths are specified in annotation space.
     * Used by annotations type(s): /Ink.
     */
    @Generated
    @Selector("paths")
    public native NSArray<? extends UIBezierPath> paths();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("popup")
    public native PDFAnnotation popup();

    /**
     * Array of n * 4 points, packed as NSValue pointValue / CGPointValue, defining n quadrilaterals in page space where
     * n is the number of quad points.
     * The points for each quad are ordered in a 'Z' pattern. That is, the first point should represent the upper left
     * point representing the start of the marked-up text, the next point will be the upper right, the third point will
     * represent the lower left of the text and the last point the lower right.
     * Points are specified relative to the annotation's bound's origin.
     */
    @Generated
    @Selector("quadrilateralPoints")
    public native NSArray<? extends NSValue> quadrilateralPoints();

    /**
     * For radio buttons, indicates whether a group of radio buttons will turn on and off in
     * unison; that is if one is checked, they are all checked. If clear, the buttons are mutually exclusive.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("radiosInUnison")
    public native boolean radiosInUnison();

    @Generated
    @Selector("removeBezierPath:")
    public native void removeBezierPath(UIBezierPath path);

    /**
     * Remove the key-value pair from the annotation dictionary. Returns true on successful removal.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeValueForAnnotationKey:")
    public native void removeValueForAnnotationKey(String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional action performed when a user clicks / taps an annotation. PDF readers ignore actions except
     * for those associated with Link or button Widget annotations.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAction:")
    public native void setAction(PDFAction value);

    /**
     * Alignment of text within annotation bounds. Supported: NSLeftTextAlignment, NSRightTextAlignment and
     * NSCenterTextAlignment.
     * Used by annotations type(s): /FreeText, /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    /**
     * For radio buttons, indicates whether clicking on widget whose state is already On toggles it Off.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setAllowsToggleToOff:")
    public native void setAllowsToggleToOff(boolean value);

    /**
     * Background color characteristics.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setBoolean:forAnnotationKey:")
    public native boolean setBooleanForAnnotationKey(boolean value, String key);

    /**
     * Optional border or border style that describes how to draw the annotation border (if any). For the "geometry"
     * annotations (Circle, Ink, Line, Square), the border indicates the line width and whether to draw with a dash
     * pattern
     * or solid pattern. PDFAnnotation markup types (Highlight, Strikethrough, Underline) ignores the border.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setBorder:")
    public native void setBorder(PDFBorder value);

    /**
     * Required for all annotations. The bounding box in page-space of the annotation.
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    /**
     * The current state of a button widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setButtonWidgetState:")
    public native void setButtonWidgetState(@NInt long value);

    /**
     * The string that represents the ON state of a button widget annotation.
     * This should be set when trying to, for example, group together a set of radio buttons with the same field name.
     * When buttons share the same field name, their individual state strings set them apart from one another.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setButtonWidgetStateString:")
    public native void setButtonWidgetStateString(String value);

    /**
     * Label for the button. Applies to kPDFWidgetPushButtonControl only.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setCaption:")
    public native void setCaption(String value);

    /**
     * The choices are an array of strings indicating the options (items) in either a list or pop-up menu.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("setChoices:")
    public native void setChoices(NSArray<String> value);

    /**
     * For many annotations ("Circle", "Square") the stroke color. Used for other annotations as well.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * Used to configure combing for PDF text fields.
     * If set, the field is automatically divided into as many equally spaced positions, or combs, as the value of the
     * maximum length of the field. To get the maximum length, use annotaiton key: PDFAnnotationKeyWidgetMaxLen.
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("setComb:")
    public native void setComb(boolean value);

    /**
     * A string of text associated with an annotation. Often displayed in a window when the annotation is clicked on
     * ("FreeText" and "Text" especially).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(String value);

    /**
     * Destination for the link. May be nil if no destination associated with link; in this case the -[URL] may be
     * valid.
     * The preferred way though is to call -[PDFAnnotation action] and -[PDFAnnotation setAction:].
     * Used by annotations type(s): /Link.
     */
    @Generated
    @Selector("setDestination:")
    public native void setDestination(PDFDestination value);

    @Generated
    @Selector("setEndLineStyle:")
    public native void setEndLineStyle(@NInt long value);

    @Generated
    @Selector("setEndPoint:")
    public native void setEndPoint(@ByValue CGPoint value);

    /**
     * Widget annotations backed by form data have (internal) field names with which to associate a value or data.
     * Can also be used for ResetForm actions.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setFieldName:")
    public native void setFieldName(String value);

    /**
     * Font and font color associated with the text field.
     * Used by annotations type(s): /FreeText, /Popup, /Widget (field type(s): /Btn, /Ch, and /Tx).
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * Width of line used to stroke border.
     * Used by annotations type(s): /FreeText, /Widget (field type(s): /Btn, /Ch, and /Tx).
     */
    @Generated
    @Selector("setFontColor:")
    public native void setFontColor(UIColor value);

    /**
     * The highlight state dictates how the annotation is drawn. For example, if a user has clicked on a
     * "Link" annotation, you should set highlighted to YES and redraw it. When the user lets up, set highlighted to
     * NO and redraw again.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * The type of icon displayed in the PDF. Supported icons: "Comment", "Key", "Note", "Help", "NewParagraph",
     * "Paragraph" and "Insert".
     * Used by annotations type(s): /Text.
     */
    @Generated
    @Selector("setIconType:")
    public native void setIconType(@NInt long value);

    /**
     * Interior color of the annotation.
     * Used by annotations type(s): /Circle, /Line, /Square.
     */
    @Generated
    @Selector("setInteriorColor:")
    public native void setInteriorColor(UIColor value);

    /**
     * There are two flavors of Choice widget annotations, lists and pop-up menus. This method allow you to
     * differentiate.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("setListChoice:")
    public native void setListChoice(boolean value);

    /**
     * Type of mark-up (highlight, strike-out or underline). Changing the markup type also changes the annotations type.
     * Used by annotations type(s): /Highlight, /StrikeOut, /Underline.
     */
    @Generated
    @Selector("setMarkupType:")
    public native void setMarkupType(@NInt long value);

    /**
     * Maximum characters allowed (optional, zero indicates no specified maximum).
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("setMaximumLength:")
    public native void setMaximumLength(@NInt long value);

    /**
     * Optional (-[modificationDate] may return nil). Modification date of the annotation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setModificationDate:")
    public native void setModificationDate(NSDate value);

    /**
     * Used to configure multiline PDF text fields.
     * Used by annotations type(s): /Widget (field type(s): /Tx).
     */
    @Generated
    @Selector("setMultiline:")
    public native void setMultiline(boolean value);

    /**
     * Used to tell if an annotation is open or closed.
     * Used by annotations type(s): /Popup.
     */
    @Generated
    @Selector("setOpen:")
    public native void setOpen(boolean value);

    /**
     * Returns the page the annotation is associated with (may return nil if annotation not associated with a page).
     */
    @Generated
    @Selector("setPage:")
    public native void setPage_unsafe(PDFPage value);

    /**
     * Returns the page the annotation is associated with (may return nil if annotation not associated with a page).
     */
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

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPopup:")
    public native void setPopup(PDFAnnotation value);

    /**
     * Array of n * 4 points, packed as NSValue pointValue / CGPointValue, defining n quadrilaterals in page space where
     * n is the number of quad points.
     * The points for each quad are ordered in a 'Z' pattern. That is, the first point should represent the upper left
     * point representing the start of the marked-up text, the next point will be the upper right, the third point will
     * represent the lower left of the text and the last point the lower right.
     * Points are specified relative to the annotation's bound's origin.
     */
    @Generated
    @Selector("setQuadrilateralPoints:")
    public native void setQuadrilateralPoints(NSArray<? extends NSValue> value);

    /**
     * For radio buttons, indicates whether a group of radio buttons will turn on and off in
     * unison; that is if one is checked, they are all checked. If clear, the buttons are mutually exclusive.
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setRadiosInUnison:")
    public native void setRadiosInUnison(boolean value);

    /**
     * Determines if a text field should be editable or not.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setReadOnly:")
    public native void setReadOnly(boolean value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRect:forAnnotationKey:")
    public native boolean setRectForAnnotationKey(@ByValue CGRect value, String key);

    /**
     * Indicates whether the annotation should be displayed on screen (depending upon -[shouldPrint] it may still
     * print).
     */
    @Generated
    @Selector("setShouldDisplay:")
    public native void setShouldDisplay(boolean value);

    /**
     * Indicates whether the annotation should be printed or not.
     */
    @Generated
    @Selector("setShouldPrint:")
    public native void setShouldPrint(boolean value);

    /**
     * Name of stamp annotation. Standard stamps include names like, "Approved", "Draft", "TopSecret", etc.
     * The name must be representable as ASCII. Very little is rendered if the annotation has no appearance stream.
     * Used by annotations type(s): /Stamp
     */
    @Generated
    @Selector("setStampName:")
    public native void setStampName(String value);

    /**
     * Style used for ornaments at the lines start and end (optional, PDF 1.4).
     * Used by annotations type(s): /Line.
     */
    @Generated
    @Selector("setStartLineStyle:")
    public native void setStartLineStyle(@NInt long value);

    /**
     * Points specifying start and end points for line annotation (required).
     * Points are specified in annotation space.
     * Used by annotations type(s): /Line.
     */
    @Generated
    @Selector("setStartPoint:")
    public native void setStartPoint(@ByValue CGPoint value);

    /**
     * Returns the annotation type (called "Subtype" in the PDF specification since "Annot" is the type). Examples
     * include:
     * "Text", "Link", "Line", etc. Required. Note that you are only allowed to set the type of an annotation once.
     */
    @Generated
    @Selector("setType:")
    public native void setType(String value);

    /**
     * URL for the link. May be nil if no URL action associated with link; in this case the -[destination] may be valid.
     * The preferred way though is to call -[PDFAnnotation action] and -[PDFAnnotation setAction:].
     * Used by annotations type(s): /Link.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * Optional (-[userName] may return nil). Name of the user who created the annotation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setUserName:")
    public native void setUserName(String value);

    /**
     * Allows you to set a key-value pair in this annotation's dictionary. Returns true on successful
     * assignment, false on error. Key must be valid for a PDF annotation's object type, and must have
     * a value that is acceptable for the key type. These values can either be an NSString, NSNumber,
     * NSArray of strings or numbers, or an NSDictionary of the previously listed types. Some keys expect
     * a complex type, for example the key "/C" expects a color in the format of an array of 0, 1, 3,
     * or 4 elements, with each element being a floating-point number in the range of 0.0 - 1.0 ). As
     * a convenience, these kind of keys will directly accept NSColor / UIColor values. Other convenience
     * functions provide similar support can be found in PDFAnnotationUtilities header file. Note that you
     * can set the environment variable "PDFKIT_LOG_ANNOTATIONS" to log any key-value assignment failures.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setValue:forAnnotationKey:")
    public native boolean setValueForAnnotationKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * The choices are an array of strings indicating the option’s export values in either a list or pop-up menu.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("setValues:")
    public native void setValues(NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The type of button widget control type (radio button, push button, or checkbox).
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("setWidgetControlType:")
    public native void setWidgetControlType(@NInt long value);

    /**
     * The string value for a widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setWidgetDefaultStringValue:")
    public native void setWidgetDefaultStringValue(String value);

    /**
     * The specific field type of a widget annotation (button, choice, or text).
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setWidgetFieldType:")
    public native void setWidgetFieldType(String value);

    /**
     * The string value for a widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("setWidgetStringValue:")
    public native void setWidgetStringValue(String value);

    /**
     * Indicates whether the annotation should be displayed on screen (depending upon -[shouldPrint] it may still
     * print).
     */
    @Generated
    @Selector("shouldDisplay")
    public native boolean shouldDisplay();

    /**
     * Indicates whether the annotation should be printed or not.
     */
    @Generated
    @Selector("shouldPrint")
    public native boolean shouldPrint();

    /**
     * Name of stamp annotation. Standard stamps include names like, "Approved", "Draft", "TopSecret", etc.
     * The name must be representable as ASCII. Very little is rendered if the annotation has no appearance stream.
     * Used by annotations type(s): /Stamp
     */
    @Generated
    @Selector("stampName")
    public native String stampName();

    /**
     * Style used for ornaments at the lines start and end (optional, PDF 1.4).
     * Used by annotations type(s): /Line.
     */
    @Generated
    @Selector("startLineStyle")
    @NInt
    public native long startLineStyle();

    /**
     * Points specifying start and end points for line annotation (required).
     * Points are specified in annotation space.
     * Used by annotations type(s): /Line.
     */
    @Generated
    @Selector("startPoint")
    @ByValue
    public native CGPoint startPoint();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the annotation type (called "Subtype" in the PDF specification since "Annot" is the type). Examples
     * include:
     * "Text", "Link", "Line", etc. Required. Note that you are only allowed to set the type of an annotation once.
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * Optional (-[userName] may return nil). Name of the user who created the annotation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("userName")
    public native String userName();

    /**
     * Retrieves a deep copy of the key-value pair based on the given key; key can either be
     * from the keys PDFAnnotationKey, or an appropriate string from the PDF specification.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("valueForAnnotationKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForAnnotationKey(String key);

    /**
     * The choices are an array of strings indicating the option’s export values in either a list or pop-up menu.
     * Used by annotations type(s): /Widget (field type(s): /Ch).
     */
    @Generated
    @Selector("values")
    public native NSArray<String> values();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The type of button widget control type (radio button, push button, or checkbox).
     * Used by annotations type(s): /Widget (field type(s): /Btn).
     */
    @Generated
    @Selector("widgetControlType")
    @NInt
    public native long widgetControlType();

    /**
     * The string value for a widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("widgetDefaultStringValue")
    public native String widgetDefaultStringValue();

    /**
     * The specific field type of a widget annotation (button, choice, or text).
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("widgetFieldType")
    public native String widgetFieldType();

    /**
     * The string value for a widget annotation.
     * Used by annotations type(s): /Widget (field type(s): /Btn, /Ch, /Tx).
     */
    @Generated
    @Selector("widgetStringValue")
    public native String widgetStringValue();
}
