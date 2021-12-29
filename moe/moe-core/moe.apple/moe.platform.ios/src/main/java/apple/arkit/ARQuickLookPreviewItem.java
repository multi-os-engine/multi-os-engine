package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.quicklook.protocol.QLPreviewItem;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARQuickLookPreviewItem extends NSObject implements QLPreviewItem {
    static {
        NatJ.register();
    }

    @Generated
    protected ARQuickLookPreviewItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARQuickLookPreviewItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARQuickLookPreviewItem allocWithZone(VoidPtr zone);

    /**
     * Whether or not AR Quick Look allows content scaling in AR mode.
     * Defaults to `YES` which allows scaling content in AR mode.
     */
    @Generated
    @Selector("allowsContentScaling")
    public native boolean allowsContentScaling();

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

    /**
     * An optional canonical web page URL for the 3D content that will be shared.
     * <p>
     * If this is supplied, the URL to the canonical web page is shared instead of the 3D content file.
     * For example, providing https://developer.apple.com/arkit/gallery/ as the canonical web page URL string will be shared via the Share button. If the web page URL string is malformed or not provided, then AR Quick Look will default to sharing the 3D content.
     */
    @Generated
    @Selector("canonicalWebPageURL")
    public native NSURL canonicalWebPageURL();

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
    public native ARQuickLookPreviewItem init();

    /**
     * Creates an object representing the 3D content that will be previewed in AR Quick Look.
     * <p>
     * This object will be previewed in AR Quick Look using the default
     * behavior:
     * <p>
     * - Start in Object mode without camera passthrough
     * <p>
     * - Display the Share button for 3D content sharing
     * <p>
     * - Allow scaling content in both Object and AR mode
     * <p>
     * This is a promise to the ARQuickLookPreviewItem class that the URL points to a 3D content file. This class does not deal with the file's existence or content, and leaves it up to QuickLook to handle and process the URL.
     *
     * @param url A file URL to 3D content file (e.g. usdz).
     * @return The preview object to display in AR Quick Look.
     */
    @Generated
    @Selector("initWithFileAtURL:")
    public native ARQuickLookPreviewItem initWithFileAtURL(NSURL url);

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
    public static native ARQuickLookPreviewItem new_objc();

    @Generated
    @IsOptional
    @Selector("previewItemTitle")
    public native String previewItemTitle();

    @Generated
    @Selector("previewItemURL")
    public native NSURL previewItemURL();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether or not AR Quick Look allows content scaling in AR mode.
     * Defaults to `YES` which allows scaling content in AR mode.
     */
    @Generated
    @Selector("setAllowsContentScaling:")
    public native void setAllowsContentScaling(boolean value);

    /**
     * An optional canonical web page URL for the 3D content that will be shared.
     * <p>
     * If this is supplied, the URL to the canonical web page is shared instead of the 3D content file.
     * For example, providing https://developer.apple.com/arkit/gallery/ as the canonical web page URL string will be shared via the Share button. If the web page URL string is malformed or not provided, then AR Quick Look will default to sharing the 3D content.
     */
    @Generated
    @Selector("setCanonicalWebPageURL:")
    public native void setCanonicalWebPageURL(NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
