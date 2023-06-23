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
 * API-Since: 11.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKProductStorePromotionController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKProductStorePromotionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKProductStorePromotionController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKProductStorePromotionController allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("defaultController")
    public static native SKProductStorePromotionController defaultController();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("fetchStorePromotionOrderWithCompletionHandler:")
    public native void fetchStorePromotionOrderWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_fetchStorePromotionOrderWithCompletionHandler") Block_fetchStorePromotionOrderWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchStorePromotionOrderWithCompletionHandler {
        @Generated
        void call_fetchStorePromotionOrderWithCompletionHandler(@NotNull NSArray<? extends SKProduct> promotionOrder,
                @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("fetchStorePromotionVisibilityForProduct:completionHandler:")
    public native void fetchStorePromotionVisibilityForProductCompletionHandler(@NotNull SKProduct product,
            @Nullable @ObjCBlock(name = "call_fetchStorePromotionVisibilityForProductCompletionHandler") Block_fetchStorePromotionVisibilityForProductCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchStorePromotionVisibilityForProductCompletionHandler {
        @Generated
        void call_fetchStorePromotionVisibilityForProductCompletionHandler(@NInt long storePromotionVisibility,
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SKProductStorePromotionController init();

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
    public static native SKProductStorePromotionController new_objc();

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

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("updateStorePromotionOrder:completionHandler:")
    public native void updateStorePromotionOrderCompletionHandler(@NotNull NSArray<? extends SKProduct> promotionOrder,
            @Nullable @ObjCBlock(name = "call_updateStorePromotionOrderCompletionHandler") Block_updateStorePromotionOrderCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateStorePromotionOrderCompletionHandler {
        @Generated
        void call_updateStorePromotionOrderCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("updateStorePromotionVisibility:forProduct:completionHandler:")
    public native void updateStorePromotionVisibilityForProductCompletionHandler(@NInt long promotionVisibility,
            @NotNull SKProduct product,
            @Nullable @ObjCBlock(name = "call_updateStorePromotionVisibilityForProductCompletionHandler") Block_updateStorePromotionVisibilityForProductCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateStorePromotionVisibilityForProductCompletionHandler {
        @Generated
        void call_updateStorePromotionVisibilityForProductCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
