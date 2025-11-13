package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
 * API-Since: 26.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKShareRequestAccessOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKShareRequestAccessOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKShareRequestAccessOperation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKShareRequestAccessOperation allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a new, empty share request access operation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native CKShareRequestAccessOperation init();

    /**
     * Creates a share request access operation configured with specified share URLs.
     * 
     * - Parameter shareURLs: An array of `NSURL` objects representing the shares to request access to.
     * - Returns: A configured ``CKShareRequestAccessOperation`` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithShareURLs:")
    public native CKShareRequestAccessOperation initWithShareURLs(@NotNull NSArray<? extends NSURL> shareURLs);

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
    public static native CKShareRequestAccessOperation new_objc();

    /**
     * A completion block called once for each processed share URL.
     * 
     * The server does not disclose share existence to protect user privacy.
     * 
     * - Parameters:
     * - shareURL: The URL of the share that was processed.
     * - shareRequestAccessError: An error describing why the access request failed, or `nil` if successful.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("perShareAccessRequestCompletionBlock")
    @ObjCBlock(name = "call_perShareAccessRequestCompletionBlock_ret")
    @Nullable
    public native Block_perShareAccessRequestCompletionBlock_ret perShareAccessRequestCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perShareAccessRequestCompletionBlock_ret {
        @Generated
        void call_perShareAccessRequestCompletionBlock_ret(@NotNull NSURL arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A completion block called once for each processed share URL.
     * 
     * The server does not disclose share existence to protect user privacy.
     * 
     * - Parameters:
     * - shareURL: The URL of the share that was processed.
     * - shareRequestAccessError: An error describing why the access request failed, or `nil` if successful.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPerShareAccessRequestCompletionBlock:")
    public native void setPerShareAccessRequestCompletionBlock(
            @ObjCBlock(name = "call_setPerShareAccessRequestCompletionBlock") @Nullable Block_setPerShareAccessRequestCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerShareAccessRequestCompletionBlock {
        @Generated
        void call_setPerShareAccessRequestCompletionBlock(@NotNull NSURL arg0, @Nullable NSError arg1);
    }

    /**
     * A completion block called when the entire operation finishes.
     * 
     * - Parameter operationError: An error describing the overall operation failure, or `nil` if successful.
     * 
     * If `operationError` is `CKErrorPartialFailure`, the `userInfo` dictionary contains detailed errors for each share
     * under ``CKPartialErrorsByItemIDKey``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShareRequestAccessCompletionBlock:")
    public native void setShareRequestAccessCompletionBlock(
            @ObjCBlock(name = "call_setShareRequestAccessCompletionBlock") @Nullable Block_setShareRequestAccessCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setShareRequestAccessCompletionBlock {
        @Generated
        void call_setShareRequestAccessCompletionBlock(@Nullable NSError arg0);
    }

    /**
     * The URLs of the shares to request access to.
     * 
     * Include multiple URLs to request access to multiple shares simultaneously. The server processes each URL
     * independently.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShareURLs:")
    public native void setShareURLs(@Nullable NSArray<? extends NSURL> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A completion block called when the entire operation finishes.
     * 
     * - Parameter operationError: An error describing the overall operation failure, or `nil` if successful.
     * 
     * If `operationError` is `CKErrorPartialFailure`, the `userInfo` dictionary contains detailed errors for each share
     * under ``CKPartialErrorsByItemIDKey``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shareRequestAccessCompletionBlock")
    @ObjCBlock(name = "call_shareRequestAccessCompletionBlock_ret")
    @Nullable
    public native Block_shareRequestAccessCompletionBlock_ret shareRequestAccessCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shareRequestAccessCompletionBlock_ret {
        @Generated
        void call_shareRequestAccessCompletionBlock_ret(@Nullable NSError arg0);
    }

    /**
     * The URLs of the shares to request access to.
     * 
     * Include multiple URLs to request access to multiple shares simultaneously. The server processes each URL
     * independently.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shareURLs")
    @Nullable
    public native NSArray<? extends NSURL> shareURLs();

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