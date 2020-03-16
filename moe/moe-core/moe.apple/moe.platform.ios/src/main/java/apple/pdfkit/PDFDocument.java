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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allowsCommenting")
    public native boolean allowsCommenting();

    @Generated
    @Selector("allowsContentAccessibility")
    public native boolean allowsContentAccessibility();

    @Generated
    @Selector("allowsCopying")
    public native boolean allowsCopying();

    @Generated
    @Selector("allowsDocumentAssembly")
    public native boolean allowsDocumentAssembly();

    @Generated
    @Selector("allowsDocumentChanges")
    public native boolean allowsDocumentChanges();

    @Generated
    @Selector("allowsFormFieldEntry")
    public native boolean allowsFormFieldEntry();

    @Generated
    @Selector("allowsPrinting")
    public native boolean allowsPrinting();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginFindString:withOptions:")
    public native void beginFindStringWithOptions(String string, @NUInt long options);

    @Generated
    @Selector("beginFindStrings:withOptions:")
    public native void beginFindStringsWithOptions(NSArray<String> strings, @NUInt long options);

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

    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("dataRepresentationWithOptions:")
    public native NSData dataRepresentationWithOptions(NSDictionary<?, ?> options);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PDFDocumentDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("documentAttributes")
    public native NSDictionary<?, ?> documentAttributes();

    @Generated
    @Selector("documentRef")
    public native CGPDFDocumentRef documentRef();

    @Generated
    @Selector("documentURL")
    public native NSURL documentURL();

    @Generated
    @Selector("exchangePageAtIndex:withPageAtIndex:")
    public native void exchangePageAtIndexWithPageAtIndex(@NUInt long indexA, @NUInt long indexB);

    @Generated
    @Selector("findString:fromSelection:withOptions:")
    public native PDFSelection findStringFromSelectionWithOptions(String string, PDFSelection selection,
            @NUInt long options);

    @Generated
    @Selector("findString:withOptions:")
    public native NSArray<? extends PDFSelection> findStringWithOptions(String string, @NUInt long options);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indexForPage:")
    @NUInt
    public native long indexForPage(PDFPage page);

    @Generated
    @Selector("init")
    public native PDFDocument init();

    @Generated
    @Selector("initWithData:")
    public native PDFDocument initWithData(NSData data);

    @Generated
    @Selector("initWithURL:")
    public native PDFDocument initWithURL(NSURL url);

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

    @Generated
    @Selector("isEncrypted")
    public native boolean isEncrypted();

    @Generated
    @Selector("isFinding")
    public native boolean isFinding();

    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("outlineItemForSelection:")
    public native PDFOutline outlineItemForSelection(PDFSelection selection);

    @Generated
    @Selector("outlineRoot")
    public native PDFOutline outlineRoot();

    @Generated
    @Selector("pageAtIndex:")
    public native PDFPage pageAtIndex(@NUInt long index);

    @Generated
    @Selector("pageClass")
    public native Class pageClass();

    @Generated
    @Selector("pageCount")
    @NUInt
    public native long pageCount();

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

    @Generated
    @Selector("selectionForEntireDocument")
    public native PDFSelection selectionForEntireDocument();

    @Generated
    @Selector("selectionFromPage:atCharacterIndex:toPage:atCharacterIndex:")
    public native PDFSelection selectionFromPageAtCharacterIndexToPageAtCharacterIndex(PDFPage startPage,
            @NUInt long startCharacter, PDFPage endPage, @NUInt long endCharacter);

    @Generated
    @Selector("selectionFromPage:atPoint:toPage:atPoint:")
    public native PDFSelection selectionFromPageAtPointToPageAtPoint(PDFPage startPage, @ByValue CGPoint startPoint,
            PDFPage endPage, @ByValue CGPoint endPoint);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) PDFDocumentDelegate value);

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

    @Generated
    @Selector("setDocumentAttributes:")
    public native void setDocumentAttributes(NSDictionary<?, ?> value);

    @Generated
    @Selector("setOutlineRoot:")
    public native void setOutlineRoot(PDFOutline value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unlockWithPassword:")
    public native boolean unlockWithPassword(String password);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

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
}