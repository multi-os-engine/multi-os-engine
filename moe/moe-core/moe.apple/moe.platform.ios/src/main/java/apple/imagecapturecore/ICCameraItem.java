package apple.imagecapturecore;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICCameraItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ICCameraItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("UTI")
    public native String UTI();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICCameraItem alloc();

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
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("device")
    public native ICCameraDevice device();

    @Generated
    @Selector("flushMetadataCache")
    public native void flushMetadataCache();

    @Generated
    @Selector("flushThumbnailCache")
    public native void flushThumbnailCache();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ICCameraItem init();

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
    @Selector("isInTemporaryStore")
    public native boolean isInTemporaryStore();

    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    @Generated
    @Selector("isRaw")
    public native boolean isRaw();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("largeThumbnailIfAvailable")
    public native CGImageRef largeThumbnailIfAvailable();

    @Generated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    @Generated
    @Selector("metadataIfAvailable")
    public native NSDictionary<String, ?> metadataIfAvailable();

    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("parentFolder")
    public native ICCameraFolder parentFolder();

    @Generated
    @Selector("ptpObjectHandle")
    public native int ptpObjectHandle();

    @Generated
    @Selector("requestMetadata")
    public native void requestMetadata();

    @Generated
    @Selector("requestThumbnail")
    public native void requestThumbnail();

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
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    @Generated
    @Selector("thumbnailIfAvailable")
    public native CGImageRef thumbnailIfAvailable();

    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("wasAddedAfterContentCatalogCompleted")
    public native boolean wasAddedAfterContentCatalogCompleted();
}