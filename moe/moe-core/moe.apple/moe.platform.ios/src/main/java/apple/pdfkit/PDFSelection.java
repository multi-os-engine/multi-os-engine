package apple.pdfkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.struct.NSRange;
import apple.uikit.UIColor;
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
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 11.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFSelection extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFSelection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add a selection to this selection. Selections don't have to be contiguous. If the selection added overlaps with
     * this
     * selection, overlaps are removed.
     */
    @Generated
    @Selector("addSelection:")
    public native void addSelection(PDFSelection selection);

    /**
     * For adding several selections, you can get better performance calling -[addSelections:] and passing in an array
     * of
     * PDFSelections than calling -[addSelection] above inside a loop. It is the "normalization" (removing the overlaps)
     * that can be slow when adding a selection to another. This function adds all the selections first and then
     * normalizes just once at the end.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("addSelections:")
    public native void addSelections(NSArray<? extends PDFSelection> selections);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFSelection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFSelection allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Given a PDFPage, returns the bounds in page-space of the text covered by the selection on that page.
     * Note that the bounds are relative to the origin of the page content, not the origin of any particular
     * PDFDisplayBox.
     */
    @Generated
    @Selector("boundsForPage:")
    @ByValue
    public native CGRect boundsForPage(PDFPage page);

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

    /**
     * If no color is ever specified, PDFSelections will draw using [NSColor selectedTextBackgroundColor] when active
     * and
     * [NSColor secondarySelectedControlColor] when not active. Calling -[setColor] will force the specified color to be
     * used for both active and inactive drawing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("color")
    public native UIColor color();

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
     * Calls the below method passing kPDFDisplayBoxCropBox for box.
     */
    @Generated
    @Selector("drawForPage:active:")
    public native void drawForPageActive(PDFPage page, boolean active);

    /**
     * Draws the selection in page space relative to the origin of box. Box can be kPDFDisplayBoxMediaBox,
     * kPDFDisplayBoxCropBox, kPDFDisplayBoxBleedBox, kPDFDisplayBoxTrimBox or kPDFDisplayBoxArtBox. If active is true,
     * it
     * is drawn using -[NSColor selectedTextBackgroundColor], otherwise it is drawn using
     * -[NSColor secondarySelectedControlColor].
     */
    @Generated
    @Selector("drawForPage:withBox:active:")
    public native void drawForPageWithBoxActive(PDFPage page, @NInt long box, boolean active);

    /**
     * Extends the selection at either end. Selections can be extended right off onto neighboring pages even to include
     * the
     * entire PDF document.
     */
    @Generated
    @Selector("extendSelectionAtEnd:")
    public native void extendSelectionAtEnd(@NInt long succeed);

    @Generated
    @Selector("extendSelectionAtStart:")
    public native void extendSelectionAtStart(@NInt long precede);

    /**
     * Extend to the selection to the beginning and end of the currently selected lines of text. If the current
     * selection is on a single
     * line, then this will extend it to the entire line width. If the selection is across multiple lines, then the
     * first and last
     * lines are expected to wholly contain their respective rows of text.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("extendSelectionForLineBoundaries")
    public native void extendSelectionForLineBoundaries();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PDFSelection init();

    /**
     * Returns and empty PDFSelection. Generally this is not useful but you can use this empty PDFSelection as a
     * container
     * into which you -[addSelection] or -[addSelections] below.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithDocument:")
    public native PDFSelection initWithDocument(PDFDocument document);

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
    public static native PDFSelection new_objc();

    /**
     * Returns the number of contiguous ranges of text on the specified page. Returns zero if page is not in selection.
     * A typical, simple selection will contain a single range of text.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("numberOfTextRangesOnPage:")
    @NUInt
    public native long numberOfTextRangesOnPage(PDFPage page);

    /**
     * Array of pages covered by the selection. These are sorted by page index.
     */
    @Generated
    @Selector("pages")
    public native NSArray<? extends PDFPage> pages();

    /**
     * Returns a range of contiguous text at index on the specified page.
     * A typical, simple selection will contain a single range of text.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("rangeAtIndex:onPage:")
    @ByValue
    public native NSRange rangeAtIndexOnPage(@NUInt long index, PDFPage page);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns an array of PDFSelection objects - one for each line of text covered by the receiver. For example if the
     * receiver PDFSelection represents a selected paragraph, calling this method would return several PDFSelections -
     * one
     * for each line of text in the paragraph.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("selectionsByLine")
    public native NSArray<? extends PDFSelection> selectionsByLine();

    /**
     * If no color is ever specified, PDFSelections will draw using [NSColor selectedTextBackgroundColor] when active
     * and
     * [NSColor secondarySelectedControlColor] when not active. Calling -[setColor] will force the specified color to be
     * used for both active and inactive drawing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * String representing the text covered by the selection. May contain line-feeds.
     */
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
