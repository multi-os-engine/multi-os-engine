package apple.quicklookthumbnailing;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuickLookThumbnailing")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLThumbnailGenerationRequest extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected QLThumbnailGenerationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLThumbnailGenerationRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * If set to YES, this will generate something appropriate for display as a file icon,
     * meaning that the thumbnail might be embedded in a frame, show a curled corner, draw a background
     * and/or a drop shadow, as appropriate for the platform.
     * If set to NO, this will generate a raw undecorated thumbnail.
     * Defaults to NO.
     */
    @Generated
    @Selector("iconMode")
    public native boolean iconMode();

    @Generated
    @Selector("init")
    public native QLThumbnailGenerationRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native QLThumbnailGenerationRequest initWithCoder(NSCoder coder);

    /**
     * @param url The url of the file on disk for which a thumbnail is requested.
     * @param size The desired size of the thumbnails that should be generated.
     * @param scale The desired scale of the thumbnails that should be generated. This will usually be the scale of the screen.
     * You can for instance pass a scale different from the one of the screen if you would like to save generated thumbnails to a server to later download them on devices with a different screen scale.
     * @param representationTypes The desired successive representations of the thumbnail that should be generated when possible.
     */
    @Generated
    @Selector("initWithFileAtURL:size:scale:representationTypes:")
    public native QLThumbnailGenerationRequest initWithFileAtURLSizeScaleRepresentationTypes(NSURL url,
            @ByValue CGSize size, @NFloat double scale, @NUInt long representationTypes);

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
     * Defaults to 0. If set, the thumbnail will have a width and height greater or equal to minimumDimension * scale.
     * If set and it is not possible to generate thumbnails of minimumDimension for any of the requested QLThumbnailGenerationRequestRepresentationTypes, no thumbnail will be provided.
     */
    @Generated
    @Selector("minimumDimension")
    @NFloat
    public native double minimumDimension();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("representationTypes")
    @NUInt
    public native long representationTypes();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    /**
     * If set to YES, this will generate something appropriate for display as a file icon,
     * meaning that the thumbnail might be embedded in a frame, show a curled corner, draw a background
     * and/or a drop shadow, as appropriate for the platform.
     * If set to NO, this will generate a raw undecorated thumbnail.
     * Defaults to NO.
     */
    @Generated
    @Selector("setIconMode:")
    public native void setIconMode(boolean value);

    /**
     * Defaults to 0. If set, the thumbnail will have a width and height greater or equal to minimumDimension * scale.
     * If set and it is not possible to generate thumbnails of minimumDimension for any of the requested QLThumbnailGenerationRequestRepresentationTypes, no thumbnail will be provided.
     */
    @Generated
    @Selector("setMinimumDimension:")
    public native void setMinimumDimension(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

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
     * The content type of the file being thumbnailed is used to determine the provider of the thumbnail and the icon styles applied if iconMode is requested. By default the content type is derived from the file extension. Setting this property will override the derived content type. This is useful for files that don't have meaningful extensions but for which you may already know the content type. 
     */
    @Generated
    @Selector("contentType")
    public native UTType contentType();

    /**
     * The content type of the file being thumbnailed is used to determine the provider of the thumbnail and the icon styles applied if iconMode is requested. By default the content type is derived from the file extension. Setting this property will override the derived content type. This is useful for files that don't have meaningful extensions but for which you may already know the content type. 
     */
    @Generated
    @Selector("setContentType:")
    public native void setContentType(UTType value);
}