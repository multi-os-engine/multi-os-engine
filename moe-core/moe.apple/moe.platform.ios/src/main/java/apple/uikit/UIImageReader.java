package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImageReader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIImageReader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIImageReader alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIImageReader allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("configuration")
    @NotNull
    public native UIImageReaderConfiguration configuration();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns a reader that uses the default configuration options. This method is thread safe.
     */
    @Generated
    @Selector("defaultReader")
    @NotNull
    public static native UIImageReader defaultReader();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Synchronously generate an image from the given file URL. If an image could not be generated, returns nil.
     */
    @Generated
    @Selector("imageWithContentsOfFileURL:")
    @NotNull
    public native UIImage imageWithContentsOfFileURL(@NotNull NSURL url);

    /**
     * Asynchronously generate an image from the given file URL. If an image could not be generated, the completion will
     * be called with nil.
     */
    @Generated
    @Selector("imageWithContentsOfFileURL:completion:")
    public native void imageWithContentsOfFileURLCompletion(@NotNull NSURL url,
            @ObjCBlock(name = "call_imageWithContentsOfFileURLCompletion") @NotNull Block_imageWithContentsOfFileURLCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageWithContentsOfFileURLCompletion {
        @Generated
        void call_imageWithContentsOfFileURLCompletion(@Nullable UIImage arg0);
    }

    /**
     * Synchronously generate an image from the given data. If an image could not be generated, returns nil.
     */
    @Generated
    @Selector("imageWithData:")
    @NotNull
    public native UIImage imageWithData(@NotNull NSData data);

    /**
     * Asynchronously generate an image from the given data. If an image could not be generated, the completion will be
     * called with nil.
     */
    @Generated
    @Selector("imageWithData:completion:")
    public native void imageWithDataCompletion(@NotNull NSData data,
            @ObjCBlock(name = "call_imageWithDataCompletion") @NotNull Block_imageWithDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageWithDataCompletion {
        @Generated
        void call_imageWithDataCompletion(@Nullable UIImage arg0);
    }

    @Generated
    @Selector("init")
    public native UIImageReader init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIImageReader new_objc();

    /**
     * Returns a loader of the given configuration. Loaders are thread safe and sharable.
     */
    @Generated
    @Selector("readerWithConfiguration:")
    public static native UIImageReader readerWithConfiguration(@NotNull UIImageReaderConfiguration configuration);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}