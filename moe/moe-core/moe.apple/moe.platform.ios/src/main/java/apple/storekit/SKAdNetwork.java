package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.3
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKAdNetwork extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKAdNetwork(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAdNetwork alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKAdNetwork allocWithZone(VoidPtr zone);

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
    public native SKAdNetwork init();

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
    public static native SKAdNetwork new_objc();

    /**
     * Participating apps should call this on launch to complete the install+open action associated with a product view
     * 
     * API-Since: 11.3
     * Deprecated-Since: 15.4
     * Deprecated-Message: Use updatePostbackConversionValue:completionHandler: instead
     */
    @Deprecated
    @Generated
    @Selector("registerAppForAdNetworkAttribution")
    public static native void registerAppForAdNetworkAttribution();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 15.4
     * Deprecated-Message: Use updatePostbackConversionValue:completionHandler: instead
     */
    @Deprecated
    @Generated
    @Selector("updateConversionValue:")
    public static native void updateConversionValue(@NInt long conversionValue);

    /**
     * API-Since: 14.5
     */
    @Generated
    @Selector("endImpression:completionHandler:")
    public static native void endImpressionCompletionHandler(@NotNull SKAdImpression impression,
            @Nullable @ObjCBlock(name = "call_endImpressionCompletionHandler") Block_endImpressionCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endImpressionCompletionHandler {
        @Generated
        void call_endImpressionCompletionHandler(@Nullable NSError error);
    }

    /**
     * Source apps should call these methods for performing a non-mediated attribution
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("startImpression:completionHandler:")
    public static native void startImpressionCompletionHandler(@NotNull SKAdImpression impression,
            @Nullable @ObjCBlock(name = "call_startImpressionCompletionHandler") Block_startImpressionCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startImpressionCompletionHandler {
        @Generated
        void call_startImpressionCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("updatePostbackConversionValue:coarseValue:completionHandler:")
    public static native void updatePostbackConversionValueCoarseValueCompletionHandler(@NInt long fineValue,
            @NotNull String coarseValue,
            @Nullable @ObjCBlock(name = "call_updatePostbackConversionValueCoarseValueCompletionHandler") Block_updatePostbackConversionValueCoarseValueCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePostbackConversionValueCoarseValueCompletionHandler {
        @Generated
        void call_updatePostbackConversionValueCoarseValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("updatePostbackConversionValue:coarseValue:lockWindow:completionHandler:")
    public static native void updatePostbackConversionValueCoarseValueLockWindowCompletionHandler(@NInt long fineValue,
            @NotNull String coarseValue, boolean lockWindow,
            @Nullable @ObjCBlock(name = "call_updatePostbackConversionValueCoarseValueLockWindowCompletionHandler") Block_updatePostbackConversionValueCoarseValueLockWindowCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePostbackConversionValueCoarseValueLockWindowCompletionHandler {
        @Generated
        void call_updatePostbackConversionValueCoarseValueLockWindowCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 15.4
     */
    @Generated
    @Selector("updatePostbackConversionValue:completionHandler:")
    public static native void updatePostbackConversionValueCompletionHandler(@NInt long conversionValue,
            @Nullable @ObjCBlock(name = "call_updatePostbackConversionValueCompletionHandler") Block_updatePostbackConversionValueCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updatePostbackConversionValueCompletionHandler {
        @Generated
        void call_updatePostbackConversionValueCompletionHandler(@Nullable NSError error);
    }
}
