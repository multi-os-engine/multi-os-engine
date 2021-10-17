package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * This configuration allows for fine grained control of separator appearance in a UICollectionView List section.
 *
 * @see UICollectionLayoutListConfiguration.separatorConfiguration
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIListSeparatorConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIListSeparatorConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIListSeparatorConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIListSeparatorConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Insets to apply to the bottom separator of the item that this configuration is applied to. Defaults to UIListSeparatorAutomaticInsets.
     */
    @Generated
    @Selector("bottomSeparatorInsets")
    @ByValue
    public native NSDirectionalEdgeInsets bottomSeparatorInsets();

    /**
     * The visibility of the bottom separator for the item that this configuration is applied to.
     */
    @Generated
    @Selector("bottomSeparatorVisibility")
    @NInt
    public native long bottomSeparatorVisibility();

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

    /**
     * The color to use for the separators for the item this configuration is applied to.
     */
    @Generated
    @Selector("color")
    public native UIColor color();

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

    @Generated
    @Selector("init")
    public native UIListSeparatorConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIListSeparatorConfiguration initWithCoder(NSCoder coder);

    /**
     * Initializes a list separator configuration with the appropriate defaults for the passed in list appearance.
     *
     * @param listAppearance The appearance of the list consuming this separator configuration
     */
    @Generated
    @Selector("initWithListAppearance:")
    public native UIListSeparatorConfiguration initWithListAppearance(@NInt long listAppearance);

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
     * The color to use for the separators for the item this configuration is applied to, when the item is in a multiple selection group.
     */
    @Generated
    @Selector("multipleSelectionColor")
    public native UIColor multipleSelectionColor();

    @Generated
    @Owned
    @Selector("new")
    public static native UIListSeparatorConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Insets to apply to the bottom separator of the item that this configuration is applied to. Defaults to UIListSeparatorAutomaticInsets.
     */
    @Generated
    @Selector("setBottomSeparatorInsets:")
    public native void setBottomSeparatorInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The visibility of the bottom separator for the item that this configuration is applied to.
     */
    @Generated
    @Selector("setBottomSeparatorVisibility:")
    public native void setBottomSeparatorVisibility(@NInt long value);

    /**
     * The color to use for the separators for the item this configuration is applied to.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * The color to use for the separators for the item this configuration is applied to, when the item is in a multiple selection group.
     */
    @Generated
    @Selector("setMultipleSelectionColor:")
    public native void setMultipleSelectionColor(UIColor value);

    /**
     * Insets to apply to the top separator of the item that this configuration is applied to. Defaults to UIListSeparatorAutomaticInsets.
     */
    @Generated
    @Selector("setTopSeparatorInsets:")
    public native void setTopSeparatorInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The visibility of the top separator for the item that this configuration is applied to.
     */
    @Generated
    @Selector("setTopSeparatorVisibility:")
    public native void setTopSeparatorVisibility(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The visual effect to use for the separators of the item this configuration is applied to.
     */
    @Generated
    @Selector("setVisualEffect:")
    public native void setVisualEffect(UIVisualEffect value);

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
     * Insets to apply to the top separator of the item that this configuration is applied to. Defaults to UIListSeparatorAutomaticInsets.
     */
    @Generated
    @Selector("topSeparatorInsets")
    @ByValue
    public native NSDirectionalEdgeInsets topSeparatorInsets();

    /**
     * The visibility of the top separator for the item that this configuration is applied to.
     */
    @Generated
    @Selector("topSeparatorVisibility")
    @NInt
    public native long topSeparatorVisibility();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The visual effect to use for the separators of the item this configuration is applied to.
     */
    @Generated
    @Selector("visualEffect")
    public native UIVisualEffect visualEffect();
}
