package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGPDFPageRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.struct.NSRange;
import apple.uikit.UIImage;
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
public class PDFPage extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFPage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Methods allowing annotations to be added or removed.
     */
    @Generated
    @Selector("addAnnotation:")
    public native void addAnnotation(PDFAnnotation annotation);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFPage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFPage allocWithZone(VoidPtr zone);

    /**
     * Hit-testing method returns the annotation at point (or NULL if none). The point is in page-space.
     */
    @Generated
    @Selector("annotationAtPoint:")
    public native PDFAnnotation annotationAtPoint(@ByValue CGPoint point);

    /**
     * Array of all PDFAnnotation objects on this page.
     */
    @Generated
    @Selector("annotations")
    public native NSArray<? extends PDFAnnotation> annotations();

    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The bounds for the specified box (see defines above). Only the media box is required for a PDF. If the crop box
     * is
     * requested and not present in the PDF, the media box is returned. If other boxes are requested and not present,
     * the
     * value for the crop box is returned. Throws a range exception if box is not in range. Coordinates for the box are
     * in
     * page space - you may need to transform the points if the page has a rotation on it. Also, note that the bounds
     * returned are intersected with the page's media box.
     */
    @Generated
    @Selector("boundsForBox:")
    @ByValue
    public native CGRect boundsForBox(@NInt long box);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Returns the bounds in page-space, of the character at index.
     */
    @Generated
    @Selector("characterBoundsAtIndex:")
    @ByValue
    public native CGRect characterBoundsAtIndex(@NInt long index);

    /**
     * Returns the index of the character at point (in page space). Returns the index of the first character if multiple
     * characters are at this point.
     * Returns NSNotFound if no character at point. Earlier version of PDFKit (prior to Lion) returned -1 if no
     * character at point.
     */
    @Generated
    @Selector("characterIndexAtPoint:")
    @NInt
    public native long characterIndexAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Returns PDF data (a proper PDF document) consisting of a single page (this page).
     * NOTE: External page links are not preserved.
     * NOTE: Versions of PDFKit before SnowLeopard did not return autorelease data for -[dataRepresentation]. You had to
     * release the data yourself. Beginning with apps compiled on SnowLeopard the data returned is autoreleased.
     */
    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Method to turn on or off the display of annotations when the page is drawn.
     */
    @Generated
    @Selector("displaysAnnotations")
    public native boolean displaysAnnotations();

    /**
     * The PDFDocument the page is associated with.
     */
    @Generated
    @Selector("document")
    public native PDFDocument document();

    /**
     * Drawing method takes into account page rotation, draws in page space relative to and clipped to the box bounds.
     * If
     * -[displaysAnnotations] is true, also draws any page annotations. Does not clear the background (page white).
     */
    @Generated
    @Selector("drawWithBox:toContext:")
    public native void drawWithBoxToContext(@NInt long box, CGContextRef context);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * For subclassers, just call the standard -(id) init.
     * Note: -[PDFPage init] creates a new empty page with a media box set to (0.0, 0.0), [612.0, 792.0].
     */
    @Generated
    @Selector("init")
    public native PDFPage init();

    /**
     * Returns a PDFPage for the passed in image. An easy way to create a PDFPage from an image to add to a PDFDocument.
     */
    @Generated
    @Selector("initWithImage:")
    public native PDFPage initWithImage(UIImage image);

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
     * The page label. Usually "1" for the first page, "2" for the second, etc.
     */
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native PDFPage new_objc();

    /**
     * Number of characters on the page (including linefeeds and spaces inserted).
     */
    @Generated
    @Selector("numberOfCharacters")
    @NUInt
    public native long numberOfCharacters();

    /**
     * This is the CGPDFPage associated with the PDFPage object. With this object you can call many CoreGraphics API
     * methods.
     * May return NULL if the owning document was not created from an existing PDF file or data or if the page itself
     * was
     * created independently.
     */
    @Generated
    @Selector("pageRef")
    public native CGPDFPageRef pageRef();

    @Generated
    @Selector("removeAnnotation:")
    public native void removeAnnotation(PDFAnnotation annotation);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Rotation on a page. Must be 0, 90, 180 or 270 (negative rotations will be "normalized" to one of 0, 90, 180 or
     * 270).
     * Some PDF's have an inherent rotation and so -[rotation] may be non-zero when a PDF is first opened.
     */
    @Generated
    @Selector("rotation")
    @NInt
    public native long rotation();

    /**
     * Given a point in page-space, returns a selection representing a whole line at that point. May return NULL if no
     * character (and by extension no line) under point.
     */
    @Generated
    @Selector("selectionForLineAtPoint:")
    public native PDFSelection selectionForLineAtPoint(@ByValue CGPoint point);

    /**
     * Given a range, returns a selection representing text within that range. Will clamp any range that goes out of
     * bounds.
     * Will return NULL for an empty selection.
     */
    @Generated
    @Selector("selectionForRange:")
    public native PDFSelection selectionForRange(@ByValue NSRange range);

    /**
     * Given a rect in page-space, returns a selection representing enclosed text on page.
     */
    @Generated
    @Selector("selectionForRect:")
    public native PDFSelection selectionForRect(@ByValue CGRect rect);

    /**
     * Given a point in page-space, returns a selection representing a whole word at that point. May return NULL if no
     * character (and by extension no word) under point. If data dectors are enabled (-[PDFView enableDataDetectors]),
     * this return the smart-selection for the content at the given point.
     */
    @Generated
    @Selector("selectionForWordAtPoint:")
    public native PDFSelection selectionForWordAtPoint(@ByValue CGPoint point);

    /**
     * Returns a selection representing text between startPt and endPt. Points are sorted first top to bottom, left to
     * right.
     */
    @Generated
    @Selector("selectionFromPoint:toPoint:")
    public native PDFSelection selectionFromPointToPoint(@ByValue CGPoint startPoint, @ByValue CGPoint endPoint);

    /**
     * Set bounds for the specified box. If the specified box did not previously exist, it will now. To remove a box
     * pass
     * NSZeroRect for the bounds (you cannot however remove the media box). Throws a range exception if box is not in
     * range.
     */
    @Generated
    @Selector("setBounds:forBox:")
    public native void setBoundsForBox(@ByValue CGRect bounds, @NInt long box);

    /**
     * Method to turn on or off the display of annotations when the page is drawn.
     */
    @Generated
    @Selector("setDisplaysAnnotations:")
    public native void setDisplaysAnnotations(boolean value);

    /**
     * Rotation on a page. Must be 0, 90, 180 or 270 (negative rotations will be "normalized" to one of 0, 90, 180 or
     * 270).
     * Some PDF's have an inherent rotation and so -[rotation] may be non-zero when a PDF is first opened.
     */
    @Generated
    @Selector("setRotation:")
    public native void setRotation(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * String (with linefeeds and in some cases spaces inserted) representing the text on the page.
     */
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Convenience function that returns an image of this page, with annotations, that fits the given size.
     * Note that the produced image is "size to fit": it retains the original page aspect-ratio. The size you give
     * may not match the size of the returned image, but the returned image is guaranteed to be equal or less.
     */
    @Generated
    @Selector("thumbnailOfSize:forBox:")
    public native UIImage thumbnailOfSizeForBox(@ByValue CGSize size, @NInt long box);

    /**
     * Given a display box, will transform the given context to take into account the rotation of the page as well as
     * the origin of the box with respect to the page's base coordinates system. This is a convenience method to call
     * from within -[PDFView drawPage:toContext:] or -[PDFAnnotation drawWithBox:inContext:].
     */
    @Generated
    @Selector("transformContext:forBox:")
    public native void transformContextForBox(CGContextRef context, @NInt long box);

    /**
     * This transform correctly rotates and offsets based on the given page's rotation property and the display box
     * type.
     */
    @Generated
    @Selector("transformForBox:")
    @ByValue
    public native CGAffineTransform transformForBox(@NInt long box);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
