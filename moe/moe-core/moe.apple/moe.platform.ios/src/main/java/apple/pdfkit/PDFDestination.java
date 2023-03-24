package apple.pdfkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFDestination extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFDestination(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFDestination alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFDestination allocWithZone(VoidPtr zone);

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

    /**
     * If the destination passed in is further along in the document than the receiver, we return NSOrderedAscending. If
     * the destination passed in precedes the receiver, we return NSOrderedDescending. Otherwise if the destination
     * passed in
     * matches the receiver, we return NSOrderedSame. For purposes of comparison, the horizontal component on the point
     * is
     * ignored. Also for purposes of comparison, having kPDFDestinationUnspecifiedValue for the vertical component of
     * the
     * destination point will be treated as the top point on the destination page.
     * An exception will be raised if either destination does not have a page associated with it or if the pages of the
     * two
     * destinations are associated with different documents.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(@NotNull PDFDestination destination);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native PDFDestination init();

    /**
     * Initializer. You do not often create PDFDestinations, but usually get them from link annotations or PDFOutline
     * items.
     */
    @Generated
    @Selector("initWithPage:atPoint:")
    public native PDFDestination initWithPageAtPoint(@NotNull PDFPage page, @ByValue CGPoint point);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PDFDestination new_objc();

    /**
     * The page that the destination refers to (destination page).
     */
    @Nullable
    @Generated
    @Selector("page")
    public native PDFPage page();

    /**
     * The destination point on the page above (in page space).
     */
    @Generated
    @Selector("point")
    @ByValue
    public native CGPoint point();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Get / set the scale factor the PDF viewer should assume for this destination.
     * kPDFDestinationUnspecifiedValue indicates the scale factor is unaffected.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setZoom:")
    public native void setZoom(@NFloat double value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Get / set the scale factor the PDF viewer should assume for this destination.
     * kPDFDestinationUnspecifiedValue indicates the scale factor is unaffected.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("zoom")
    @NFloat
    public native double zoom();
}
