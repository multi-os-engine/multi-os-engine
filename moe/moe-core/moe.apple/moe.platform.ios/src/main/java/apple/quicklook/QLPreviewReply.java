package apple.quicklook;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.pdfkit.PDFDocument;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;

/**
 * To provide a data-based preview, you have to return a QLPreviewReply object.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLPreviewReply extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected QLPreviewReply(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLPreviewReply alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native QLPreviewReply allocWithZone(VoidPtr zone);

    /**
     * Attachments for HTML data previews. The keys of the dictionary are the attachment identifiers (eg foo) that can
     * be referenced with the cid:id URL (eg cid:foo).
     */
    @Generated
    @Selector("attachments")
    public native NSDictionary<String, ? extends QLPreviewReplyAttachment> attachments();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native QLPreviewReply init();

    /**
     * Use this method to provide a preview with a PDFDocument
     * 
     * @param defaultPageSize       The size of your pages in the document. If the page size varies, use the first
     *                              page's size.
     * @param documentCreationBlock Create and return the PDFDocument. Heavy lifting should be done inside of the
     *                              documentCreationBlock instead of when creating the QLPreviewReply. The
     *                              QLPreviewReply passed into this block is the same as the one created by this method
     *                              and is provided for convenience for any further updates to its properties during
     *                              document creation. Return the PDFDocument if successfully created. Populate error if
     *                              unsuccessful.
     */
    @Generated
    @Selector("initForPDFWithPageSize:documentCreationBlock:")
    public native QLPreviewReply initForPDFWithPageSizeDocumentCreationBlock(@ByValue CGSize defaultPageSize,
            @ObjCBlock(name = "call_initForPDFWithPageSizeDocumentCreationBlock") Block_initForPDFWithPageSizeDocumentCreationBlock documentCreationBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initForPDFWithPageSizeDocumentCreationBlock {
        @Generated
        PDFDocument call_initForPDFWithPageSizeDocumentCreationBlock(QLPreviewReply reply,
                @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
    }

    /**
     * Use this method to provide a preview by drawing into a context.
     * 
     * @param contextSize  The size of your image.
     * @param isBitmap     Whether the context should be bitmap or vector.
     * @param drawingBlock The preview should be drawn into the context passed to this block. The QLPreviewReply passed
     *                     into this block is the same as the one created by this method and is provided for convenience
     *                     for any further updates to its properties during the drawing block. Return YES if the preview
     *                     was successfully drawn into the context. Return NO and populate error otherwise.
     */
    @Generated
    @Selector("initWithContextSize:isBitmap:drawingBlock:")
    public native QLPreviewReply initWithContextSizeIsBitmapDrawingBlock(@ByValue CGSize contextSize, boolean isBitmap,
            @ObjCBlock(name = "call_initWithContextSizeIsBitmapDrawingBlock") Block_initWithContextSizeIsBitmapDrawingBlock drawingBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithContextSizeIsBitmapDrawingBlock {
        @Generated
        boolean call_initWithContextSizeIsBitmapDrawingBlock(CGContextRef context, QLPreviewReply reply,
                @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
    }

    /**
     * Use this method to provide a preview with data of a supported format.
     * 
     * @param contentType       The content type of the data.
     * @param contentSize       A hint for the size you would like to display your content at. If your content has an
     *                          intrinsic size built in, such as images and PDFs, that will be used as the final size,
     *                          but providing the correct size here will allow QuickLook to present loading UI at the
     *                          correct size before you are finished creating the data. QuickLook will use a default
     *                          size if NSZeroSize is passed in.
     * @param dataCreationBlock Create and return data representing the file preview. Supported types include:
     *                          UTTypeImage, UTTypePDF, UTTypeHTML, UTTypeXML, UTTypePlainText, UTTypeRTF. Heavy lifting
     *                          should be done inside of the dataCreationBlock instead of when creating the
     *                          QLPreviewReply. The QLPreviewReply passed into this block is the same as the one created
     *                          by this method and is provided for convenience for any further updates to its
     *                          properties, such as attachments, during the data generation. Return the data if
     *                          successful. Populate error if unsuccessful.
     */
    @Generated
    @Selector("initWithDataOfContentType:contentSize:dataCreationBlock:")
    public native QLPreviewReply initWithDataOfContentTypeContentSizeDataCreationBlock(UTType contentType,
            @ByValue CGSize contentSize,
            @ObjCBlock(name = "call_initWithDataOfContentTypeContentSizeDataCreationBlock") Block_initWithDataOfContentTypeContentSizeDataCreationBlock dataCreationBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDataOfContentTypeContentSizeDataCreationBlock {
        @Generated
        NSData call_initWithDataOfContentTypeContentSizeDataCreationBlock(QLPreviewReply reply,
                @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
    }

    /**
     * Use this method to provide a preview by providing a URL to a file of a supported type.
     * 
     * @param fileURL A file URL representing a preview of the previewed URL. Currently supported types include:
     *                UTTypeImage, UTTypePDF, UTTypeHTML, UTTypeXML, UTTypePlainText, UTTypeRTF, UTTypeRTFD,
     *                UTTypeMovie, UTTypeAudio
     */
    @Generated
    @Selector("initWithFileURL:")
    public native QLPreviewReply initWithFileURL(NSURL fileURL);

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
    public static native QLPreviewReply new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Attachments for HTML data previews. The keys of the dictionary are the attachment identifiers (eg foo) that can
     * be referenced with the cid:id URL (eg cid:foo).
     */
    @Generated
    @Selector("setAttachments:")
    public native void setAttachments(NSDictionary<String, ? extends QLPreviewReplyAttachment> value);

    /**
     * String encoding for text or html based previews. Defaults to NSUTF8StringEncoding.
     */
    @Generated
    @Selector("setStringEncoding:")
    public native void setStringEncoding(@NUInt long value);

    /**
     * Custom display title for the preview. If left as the empty string, QuickLook will use the file name.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * String encoding for text or html based previews. Defaults to NSUTF8StringEncoding.
     */
    @Generated
    @Selector("stringEncoding")
    @NUInt
    public native long stringEncoding();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Custom display title for the preview. If left as the empty string, QuickLook will use the file name.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
