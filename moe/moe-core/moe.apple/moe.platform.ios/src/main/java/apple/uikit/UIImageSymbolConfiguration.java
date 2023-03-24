package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImageSymbolConfiguration extends UIImageConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected UIImageSymbolConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIImageSymbolConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIImageSymbolConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Adjusts for Dynamic Type. Use UIFontMetrics to get automatic adjustment with a custom font.
     */
    @Generated
    @Selector("configurationWithFont:")
    public static native UIImageSymbolConfiguration configurationWithFont(@NotNull UIFont font);

    /**
     * Adjusts for Dynamic Type. Use UIFontMetrics to get automatic adjustment with a custom font.
     */
    @Generated
    @Selector("configurationWithFont:scale:")
    public static native UIImageSymbolConfiguration configurationWithFontScale(@NotNull UIFont font, @NInt long scale);

    /**
     * Fixed point size configurations
     */
    @Generated
    @Selector("configurationWithPointSize:")
    public static native UIImageSymbolConfiguration configurationWithPointSize(@NFloat double pointSize);

    @Generated
    @Selector("configurationWithPointSize:weight:")
    public static native UIImageSymbolConfiguration configurationWithPointSizeWeight(@NFloat double pointSize,
            @NInt long weight);

    @Generated
    @Selector("configurationWithPointSize:weight:scale:")
    public static native UIImageSymbolConfiguration configurationWithPointSizeWeightScale(@NFloat double pointSize,
            @NInt long weight, @NInt long scale);

    /**
     * just change the scale on the configuration
     */
    @Generated
    @Selector("configurationWithScale:")
    public static native UIImageSymbolConfiguration configurationWithScale(@NInt long scale);

    /**
     * Dynamic type size configurations
     */
    @Generated
    @Selector("configurationWithTextStyle:")
    public static native UIImageSymbolConfiguration configurationWithTextStyle(@NotNull String textStyle);

    @Generated
    @Selector("configurationWithTextStyle:scale:")
    public static native UIImageSymbolConfiguration configurationWithTextStyleScale(@NotNull String textStyle,
            @NInt long scale);

    @Generated
    @Selector("configurationWithWeight:")
    public static native UIImageSymbolConfiguration configurationWithWeight(@NInt long weight);

    @NotNull
    @Generated
    @Selector("configurationWithoutPointSizeAndWeight")
    public native UIImageSymbolConfiguration configurationWithoutPointSizeAndWeight();

    @NotNull
    @Generated
    @Selector("configurationWithoutScale")
    public native UIImageSymbolConfiguration configurationWithoutScale();

    /**
     * Removes attributes from the configuration if they are set
     */
    @NotNull
    @Generated
    @Selector("configurationWithoutTextStyle")
    public native UIImageSymbolConfiguration configurationWithoutTextStyle();

    @NotNull
    @Generated
    @Selector("configurationWithoutWeight")
    public native UIImageSymbolConfiguration configurationWithoutWeight();

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
    public native UIImageSymbolConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIImageSymbolConfiguration initWithCoder(@NotNull NSCoder coder);

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

    /**
     * checks if the other configuration is equal to this one.
     * the values have to match exactly. If you only want to check "specified"
     * values, use `isEquivalentToConfiguration:`.
     */
    @Generated
    @Selector("isEqualToConfiguration:")
    public native boolean isEqualToConfiguration(@Nullable UIImageSymbolConfiguration otherConfiguration);

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
    public static native UIImageSymbolConfiguration new_objc();

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

    /**
     * everything is "unspecified". This is essentially the same as nil but's more explicit.
     */
    @NotNull
    @Generated
    @Selector("unspecifiedConfiguration")
    public static native UIImageSymbolConfiguration unspecifiedConfiguration();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("configurationPreferringMulticolor")
    public static native UIImageSymbolConfiguration configurationPreferringMulticolor();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("configurationWithHierarchicalColor:")
    public static native UIImageSymbolConfiguration configurationWithHierarchicalColor(
            @NotNull UIColor hierarchicalColor);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("configurationWithPaletteColors:")
    public static native UIImageSymbolConfiguration configurationWithPaletteColors(
            @NotNull NSArray<? extends UIColor> paletteColors);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("configurationPreferringMonochrome")
    public static native UIImageSymbolConfiguration configurationPreferringMonochrome();
}
