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

    @Generated
    @Selector("addAnnotation:")
    public native void addAnnotation(PDFAnnotation annotation);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFPage alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("annotationAtPoint:")
    public native PDFAnnotation annotationAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("annotations")
    public native NSArray<? extends PDFAnnotation> annotations();

    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("characterBoundsAtIndex:")
    @ByValue
    public native CGRect characterBoundsAtIndex(@NInt long index);

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

    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("displaysAnnotations")
    public native boolean displaysAnnotations();

    @Generated
    @Selector("document")
    public native PDFDocument document();

    @Generated
    @Selector("drawWithBox:toContext:")
    public native void drawWithBoxToContext(@NInt long box, CGContextRef context);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PDFPage init();

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

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfCharacters")
    @NUInt
    public native long numberOfCharacters();

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

    @Generated
    @Selector("rotation")
    @NInt
    public native long rotation();

    @Generated
    @Selector("selectionForLineAtPoint:")
    public native PDFSelection selectionForLineAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("selectionForRange:")
    public native PDFSelection selectionForRange(@ByValue NSRange range);

    @Generated
    @Selector("selectionForRect:")
    public native PDFSelection selectionForRect(@ByValue CGRect rect);

    @Generated
    @Selector("selectionForWordAtPoint:")
    public native PDFSelection selectionForWordAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("selectionFromPoint:toPoint:")
    public native PDFSelection selectionFromPointToPoint(@ByValue CGPoint startPoint, @ByValue CGPoint endPoint);

    @Generated
    @Selector("setBounds:forBox:")
    public native void setBoundsForBox(@ByValue CGRect bounds, @NInt long box);

    @Generated
    @Selector("setDisplaysAnnotations:")
    public native void setDisplaysAnnotations(boolean value);

    @Generated
    @Selector("setRotation:")
    public native void setRotation(@NInt long value);

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
    @Selector("thumbnailOfSize:forBox:")
    public native UIImage thumbnailOfSizeForBox(@ByValue CGSize size, @NInt long box);

    @Generated
    @Selector("transformContext:forBox:")
    public native void transformContextForBox(CGContextRef context, @NInt long box);

    @Generated
    @Selector("transformForBox:")
    @ByValue
    public native CGAffineTransform transformForBox(@NInt long box);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}