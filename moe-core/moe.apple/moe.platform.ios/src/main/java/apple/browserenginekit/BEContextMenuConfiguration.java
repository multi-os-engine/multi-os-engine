package apple.browserenginekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIContextMenuConfiguration;
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
 * A specialized `UIContextMenuConfiguration` object to defer a context menu presentation when the
 * when the context menu gestures are first recognized and a possible menu presentation is not immediately known.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BEContextMenuConfiguration extends UIContextMenuConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected BEContextMenuConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BEContextMenuConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BEContextMenuConfiguration allocWithZone(VoidPtr zone);

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
    @Selector("configurationWithIdentifier:previewProvider:actionProvider:")
    public static native BEContextMenuConfiguration configurationWithIdentifierPreviewProviderActionProvider(
            @Mapped(ObjCObjectMapper.class) @Nullable Object identifier,
            @ObjCBlock(name = "call_configurationWithIdentifierPreviewProviderActionProvider_1") @Nullable UIContextMenuConfiguration.Block_configurationWithIdentifierPreviewProviderActionProvider_1 previewProvider,
            @ObjCBlock(name = "call_configurationWithIdentifierPreviewProviderActionProvider_2") @Nullable UIContextMenuConfiguration.Block_configurationWithIdentifierPreviewProviderActionProvider_2 actionProvider);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fulfills the configuration with a concrete configuration. Once fulfilled, the context menu presentation will
     * begin.
     * You should call this method as soon as you have determined that a menu presentation is possible for the
     * configuration, as to
     * minimize the delay between the context menu gesture's recognition and the menu's presentation. If no menu
     * presentation is possible,
     * fulfill with a `nil` configuration.
     * 
     * There is a system-defined timeout before the configuration is cancelled, where no menu presents. This method
     * returns `YES` if the
     * configuration did successfully prepare, and `NO` otherwise.
     * 
     * [@NOTE] The fulfilled configuration is used by `UIContextMenuInteractionDelegate` when referencing any
     * `UIContextMenuConfiguration`,
     * rather than this object.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("fulfillUsingConfiguration:")
    public native boolean fulfillUsingConfiguration(@Nullable UIContextMenuConfiguration configuration);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a new configuration for the context menu interaction.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("init")
    public native BEContextMenuConfiguration init();

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
    public static native BEContextMenuConfiguration new_objc();

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