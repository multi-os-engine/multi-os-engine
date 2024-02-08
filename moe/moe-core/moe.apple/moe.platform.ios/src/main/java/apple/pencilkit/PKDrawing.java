package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The data model object for storing drawing data created from PKCanvasView.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKDrawing extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected PKDrawing(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKDrawing alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKDrawing allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The bounds of the drawing's contents, taking into account the rendered width of all content.
     * If these bounds are used to render an image with `imageFromRect:scale:`, no contents will be cropped.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Generate a data representation of the drawing.
     * 
     * @return A NSData object containing a representation of the drawing.
     */
    @NotNull
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
     * Returns a new drawing by appending the contents of `drawing` on top of the receiver’s contents.
     * 
     * @param drawing The drawing to append.
     * @return A new copy of this drawing with `drawing` appended onto it.
     */
    @NotNull
    @Generated
    @Selector("drawingByAppendingDrawing:")
    public native PKDrawing drawingByAppendingDrawing(@NotNull PKDrawing drawing);

    /**
     * Returns a new drawing with `transform` applied.
     * 
     * @param transform The transform to apply to this drawing.
     * @return A new copy of this drawing with `transform` applied.
     */
    @NotNull
    @Generated
    @Selector("drawingByApplyingTransform:")
    public native PKDrawing drawingByApplyingTransform(@ByValue CGAffineTransform transform);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("imageFromRect:scale:")
    public native UIImage imageFromRectScale(@ByValue CGRect rect, @NFloat double scale);

    /**
     * Initializes and returns a blank drawing.
     */
    @Generated
    @Selector("init")
    public native PKDrawing init();

    @Generated
    @Selector("initWithCoder:")
    public native PKDrawing initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes and returns the drawing with the specified data.
     * 
     * @param data  The data containing the drawing data.
     * @param error If an error occurs, upon return the NSError object describes the error.
     *              Set to NULL to ignore errors.
     * @return On success, an initialized PKDrawing object. If nil, the outError parameter
     *         contains an NSError instance describing the problem.
     */
    @Generated
    @Selector("initWithData:error:")
    public native PKDrawing initWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native PKDrawing new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Create a new drawing by appending an array of strokes to this drawing.
     * This is a convenience method, to quickly add strokes to a drawing.
     * 
     * @param strokes The strokes to append.
     * @return A new copy of this drawing with `strokes` appended onto it.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("drawingByAppendingStrokes:")
    public native PKDrawing drawingByAppendingStrokes(@NotNull NSArray<? extends PKStroke> strokes);

    /**
     * Initializes a drawing with an array of strokes.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithStrokes:")
    public native PKDrawing initWithStrokes(@NotNull NSArray<? extends PKStroke> strokes);

    /**
     * The strokes that this drawing contains.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("strokes")
    public native NSArray<? extends PKStroke> strokes();

    /**
     * The PencilKit version required to use this drawing.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("requiredContentVersion")
    @NInt
    public native long requiredContentVersion();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
