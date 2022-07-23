package apple.pdfkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGPDFDocumentRef;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.pdfkit.protocol.PDFDocumentDelegate;
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
public class PDFDocument extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFDocument(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFDocument alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFDocument allocWithZone(VoidPtr zone);

    /**
     * Create or modify annotations, including form field entries
     */
    @Generated
    @Selector("allowsCommenting")
    public native boolean allowsCommenting();

    /**
     * Extract content, but only for the purpose of accessibility
     */
    @Generated
    @Selector("allowsContentAccessibility")
    public native boolean allowsContentAccessibility();

    /**
     * Extract content (text, images, etc.)
     */
    @Generated
    @Selector("allowsCopying")
    public native boolean allowsCopying();

    /**
     * Page management: insert, delete, and rotate pages
     */
    @Generated
    @Selector("allowsDocumentAssembly")
    public native boolean allowsDocumentAssembly();

    /**
     * Modify the document contents except for page management (document attrubutes)
     */
    @Generated
    @Selector("allowsDocumentChanges")
    public native boolean allowsDocumentChanges();

    /**
     * Modify form field entries, even if allowsCommenting is NO
     */
    @Generated
    @Selector("allowsFormFieldEntry")
    public native boolean allowsFormFieldEntry();

    /**
     * Printing the document
     */
    @Generated
    @Selector("allowsPrinting")
    public native boolean allowsPrinting();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Begins a find, searching the document for string. Search results are handled via a
     * PDFDocumentDidFindMatchNotification or if the delegate implements -[didMatchString:]. Supported options are:
     * NSCaseInsensitiveSearch, NSLiteralSearch, and NSBackwardsSearch.
     */
    @Generated
    @Selector("beginFindString:withOptions:")
    public native void beginFindStringWithOptions(String string, @NUInt long options);

    /**
     * Like -[beginFindString:withOptions:] above but it accepts an array of strings to search for.
     * All other comments for -[beginFindString:withOptions:] above apply.
     */
    @Generated
    @Selector("beginFindStrings:withOptions:")
    public native void beginFindStringsWithOptions(NSArray<String> strings, @NUInt long options);

    /**
     * Method to cancel a search. Can be called from a user method being serviced by a find notification.
     */
    @Generated
    @Selector("cancelFindString")
    public native void cancelFindString();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Methods to record the current state of the PDFDocument as data or a file. Passing a QuartzFilter object in the
     * options dictionary with the key @"QuartzFilter" will allow you to have the filter applied when saving the PDF.
     * NOTE: Versions of PDFKit before SnowLeopard did not return autorelease data for -[dataRepresentation]. You had to
     * release the data yourself. Beginning with apps compiled on SnowLeopard the data returned is autoreleased.
     */
    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("dataRepresentationWithOptions:")
    public native NSData dataRepresentationWithOptions(NSDictionary<?, ?> options);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * If a PDFDocument has a delegate, delegate methods may be called. See: NSNotificationNames and
     * PDFDocumentDelegate below.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PDFDocumentDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns a dictionary with PDF metadata. Metadata is optional for PDF's and so some of the keys may be missing or
     * the
     * entire dictionary may be empty. See attributes above for keys.
     */
    @Generated
    @Selector("documentAttributes")
    public native NSDictionary<?, ?> documentAttributes();

    /**
     * This is the CGPDFDocument associated with the PDFDocument object. With this object you can call many CoreGraphics
     * API. May return NULL if the document was not created from an existing PDF file or data.
     */
    @Generated
    @Selector("documentRef")
    public native CGPDFDocumentRef documentRef();

    /**
     * May return NULL if the document was created from NSData.
     */
    @Generated
    @Selector("documentURL")
    public native NSURL documentURL();

    @Generated
    @Selector("exchangePageAtIndex:withPageAtIndex:")
    public native void exchangePageAtIndexWithPageAtIndex(@NUInt long indexA, @NUInt long indexB);

    /**
     * Searches for only the next instance of string beginning after the last character of selection with options (or
     * preceding the first character of the selection if NSBackwardsSearch is specified as a search option).
     * Returns next instance as a PDFSelection or NULL if the end of the document is reached. Supported options are:
     * NSCaseInsensitiveSearch, NSLiteralSearch, and NSBackwardsSearch. Passing in NULL for selection will start the
     * search from the beginning of the document (or end if NSBackwardsSearch is specified).
     */
    @Generated
    @Selector("findString:fromSelection:withOptions:")
    public native PDFSelection findStringFromSelectionWithOptions(String string, PDFSelection selection,
            @NUInt long options);

    /**
     * Searches entire document for string and returns an array of PDFSelections representing all instances found. May
     * return an empty array (if not found). Supported options are: NSCaseInsensitiveSearch, NSLiteralSearch, and
     * NSBackwardsSearch.
     */
    @Generated
    @Selector("findString:withOptions:")
    public native NSArray<? extends PDFSelection> findStringWithOptions(String string, @NUInt long options);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Given a PDFPage, returns the pages index within the document. Indices are zero-based.
     */
    @Generated
    @Selector("indexForPage:")
    @NUInt
    public native long indexForPage(PDFPage page);

    /**
     * Initializers.
     */
    @Generated
    @Selector("init")
    public native PDFDocument init();

    @Generated
    @Selector("initWithData:")
    public native PDFDocument initWithData(NSData data);

    @Generated
    @Selector("initWithURL:")
    public native PDFDocument initWithURL(NSURL url);

    /**
     * Methods allowing pages to be inserted, removed, and re-ordered. Can throw range exceptions.
     * Note: when inserting a PDFPage, you have to be careful if that page came from another PDFDocument. PDFPage's have
     * a
     * notion of a single document that owns them and when you call the methods below the PDFPage passed in is assigned
     * a
     * new owning document. You'll want to call -[PDFPage copy] first then and pass this copy to the blow methods. This
     * allows the orignal PDFPage to maintain its original document.
     */
    @Generated
    @Selector("insertPage:atIndex:")
    public native void insertPageAtIndex(PDFPage page, @NUInt long index);

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
     * Whether the PDF is encrypted. With the right password, a PDF can be unlocked - nonetheless, the PDF still
     * indicates
     * that it is encrypted - just no longer locked. Some PDF's may be encrypted but can be unlocked with the empty
     * string.
     * These are unlocked automatically.
     */
    @Generated
    @Selector("isEncrypted")
    public native boolean isEncrypted();

    /**
     * Returns YES if document is currently searching for a string.
     */
    @Generated
    @Selector("isFinding")
    public native boolean isFinding();

    /**
     * See comments above.
     */
    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * PDF version of the PDF file (example: major version = 1, minor = 4; PDF v1.4).
     */
    @Generated
    @Selector("majorVersion")
    @NInt
    public native long majorVersion();

    @Generated
    @Selector("minorVersion")
    @NInt
    public native long minorVersion();

    @Generated
    @Owned
    @Selector("new")
    public static native PDFDocument new_objc();

    /**
     * Given a PDFSelection, this method returns the child outline item the selection most closely falls beneath. Since
     * a
     * selection may span multiple outline items, only the point representing the first character of the PDFSelection is
     * considered. Typically, outlines indicate things like chapters for the PDF. Therefore, this method would help you
     * identify the chapter the selection falls within.
     */
    @Generated
    @Selector("outlineItemForSelection:")
    public native PDFOutline outlineItemForSelection(PDFSelection selection);

    /**
     * Allows you specify a PDFOutline as the root outline item for this document. When the PDF is saved the outline
     * tree
     * structure is written out to the destination PDF file. Passing NULL is a way to strip any outline from a document.
     * Returns the root outline object for the PDF (or NULL if none).
     */
    @Generated
    @Selector("outlineRoot")
    public native PDFOutline outlineRoot();

    /**
     * Returns a PDFPage object representing the page at index. Will raise an exception if index is out of bounds.
     * Indices
     * are zero-based.
     */
    @Generated
    @Selector("pageAtIndex:")
    public native PDFPage pageAtIndex(@NUInt long index);

    /**
     * This is the class that will be allocated and initialized when page objects are created for the document. The
     * default implementation returns [PDFPage class] but if you want PDFDocument to use your own custom class you can
     * subclass PDFDocument and implement this method to return your own custom class. Your class should be a subclass
     * of
     * PDFPage (otherwise the behavior is undefined).
     */
    @Generated
    @Selector("pageClass")
    public native Class pageClass();

    /**
     * The number of pages in the document.
     */
    @Generated
    @Selector("pageCount")
    @NUInt
    public native long pageCount();

    /**
     * Returns the permissions status of the PDF document. You have kPDFDocumentPermissionsNone status for an encrypted
     * document that you have not supplied either a valid user or owner password. For a document with no encryption, you
     * automatically have kPDFDocumentPermissionsOwner status.
     */
    @Generated
    @Selector("permissionsStatus")
    @NInt
    public native long permissionsStatus();

    @Generated
    @Selector("removePageAtIndex:")
    public native void removePageAtIndex(@NUInt long index);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns a selection representing text for the entire document.
     */
    @Generated
    @Selector("selectionForEntireDocument")
    public native PDFSelection selectionForEntireDocument();

    /**
     * Similar to the above method but allows you to specify a character index for the start and end pages.
     */
    @Generated
    @Selector("selectionFromPage:atCharacterIndex:toPage:atCharacterIndex:")
    public native PDFSelection selectionFromPageAtCharacterIndexToPageAtCharacterIndex(PDFPage startPage,
            @NUInt long startCharacter, PDFPage endPage, @NUInt long endCharacter);

    /**
     * Returns a selection representing text from page startPage and point startPt to page endPage and to point endPt on
     * that page. Points are in page-space and relative to their respective pages. Start and end page can be the same
     * (and are then equivalent to calling -[PDFPage selectionFromPoint: toPoint:]).
     */
    @Generated
    @Selector("selectionFromPage:atPoint:toPage:atPoint:")
    public native PDFSelection selectionFromPageAtPointToPageAtPoint(PDFPage startPage, @ByValue CGPoint startPoint,
            PDFPage endPage, @ByValue CGPoint endPoint);

    /**
     * If a PDFDocument has a delegate, delegate methods may be called. See: NSNotificationNames and
     * PDFDocumentDelegate below.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) PDFDocumentDelegate value);

    /**
     * If a PDFDocument has a delegate, delegate methods may be called. See: NSNotificationNames and
     * PDFDocumentDelegate below.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) PDFDocumentDelegate value) {
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
     * Returns a dictionary with PDF metadata. Metadata is optional for PDF's and so some of the keys may be missing or
     * the
     * entire dictionary may be empty. See attributes above for keys.
     */
    @Generated
    @Selector("setDocumentAttributes:")
    public native void setDocumentAttributes(NSDictionary<?, ?> value);

    /**
     * Allows you specify a PDFOutline as the root outline item for this document. When the PDF is saved the outline
     * tree
     * structure is written out to the destination PDF file. Passing NULL is a way to strip any outline from a document.
     * Returns the root outline object for the PDF (or NULL if none).
     */
    @Generated
    @Selector("setOutlineRoot:")
    public native void setOutlineRoot(PDFOutline value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Convenience method. Returns a string representing the entire document (each page's string concatenated with line
     * feeds between pages).
     */
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Means of passing in a password to unlock encrypted PDF's. Calling -[unlockWithPassword:] will attempt to unlock
     * the
     * PDF. If successful, a PDFDocumentDidUnlockNotification notification is sent. You cannot "re-lock" a PDF by
     * passing
     * in a bogus password. Returns YES if the document is now unlocked, NO otherwise ([self isLocked] == NO).
     */
    @Generated
    @Selector("unlockWithPassword:")
    public native boolean unlockWithPassword(String password);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * -[writeToFile:withOptions:] and -[writeToURL:withOptions:] methods may take any CoreGraphics options that are
     * typically
     * passed into CGPDFContextCreate(...) and CGPDFContextCreateWithURL(...)'s auxiliaryInfo dictionary. For
     * encryption, you
     * may provide an owner and user password via the keys PDFDocumentWriteOption, where the values should be non-zero
     * length
     * strings.
     */
    @Generated
    @Selector("writeToFile:")
    public native boolean writeToFile(String path);

    @Generated
    @Selector("writeToFile:withOptions:")
    public native boolean writeToFileWithOptions(String path, NSDictionary<String, ?> options);

    @Generated
    @Selector("writeToURL:")
    public native boolean writeToURL(NSURL url);

    @Generated
    @Selector("writeToURL:withOptions:")
    public native boolean writeToURLWithOptions(NSURL url, NSDictionary<String, ?> options);

    /**
     * Returns all 7 properties above as a PDFAccessPermissions value.
     */
    @Generated
    @Selector("accessPermissions")
    @NUInt
    public native long accessPermissions();
}
