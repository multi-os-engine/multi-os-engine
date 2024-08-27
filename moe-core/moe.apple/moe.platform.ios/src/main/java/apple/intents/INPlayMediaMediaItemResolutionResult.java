package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INPlayMediaMediaItemResolutionResult extends INMediaItemResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INPlayMediaMediaItemResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INPlayMediaMediaItemResolutionResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INPlayMediaMediaItemResolutionResult allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INPlayMediaMediaItemResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @NotNull @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    @NotNull
    @Generated
    @Selector("confirmationRequiredWithMediaItemToConfirm:")
    public static native INPlayMediaMediaItemResolutionResult confirmationRequiredWithMediaItemToConfirm(
            @Nullable INMediaItem mediaItemToConfirm);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("disambiguationWithMediaItemsToDisambiguate:")
    public static native INPlayMediaMediaItemResolutionResult disambiguationWithMediaItemsToDisambiguate(
            @NotNull NSArray<? extends INMediaItem> mediaItemsToDisambiguate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INPlayMediaMediaItemResolutionResult init();

    @Generated
    @Selector("initWithMediaItemResolutionResult:")
    public native INPlayMediaMediaItemResolutionResult initWithMediaItemResolutionResult(
            @NotNull INMediaItemResolutionResult mediaItemResolutionResult);

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

    @NotNull
    @Generated
    @Selector("needsValue")
    public static native INPlayMediaMediaItemResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INPlayMediaMediaItemResolutionResult new_objc();

    @NotNull
    @Generated
    @Selector("notRequired")
    public static native INPlayMediaMediaItemResolutionResult notRequired();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("successWithResolvedMediaItem:")
    public static native INPlayMediaMediaItemResolutionResult successWithResolvedMediaItem(
            @NotNull INMediaItem resolvedMediaItem);

    /**
     * Convenience method to return multiple success resolution results for an array of INMediaItems
     */
    @NotNull
    @Generated
    @Selector("successesWithResolvedMediaItems:")
    public static native NSArray<? extends INPlayMediaMediaItemResolutionResult> successesWithResolvedMediaItems(
            @NotNull NSArray<? extends INMediaItem> resolvedMediaItems);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("unsupported")
    public static native INPlayMediaMediaItemResolutionResult unsupported();

    @NotNull
    @Generated
    @Selector("unsupportedForReason:")
    public static native INPlayMediaMediaItemResolutionResult unsupportedForReason(@NInt long reason);

    @NotNull
    @Generated
    @Selector("unsupportedWithReason:")
    public static native INPlayMediaMediaItemResolutionResult unsupportedWithReason(@NInt long reason);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
