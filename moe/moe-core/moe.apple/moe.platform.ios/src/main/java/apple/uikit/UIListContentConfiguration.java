package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.UIConfigurationState;
import apple.uikit.protocol.UIContentConfiguration;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIListContentConfiguration extends NSObject implements UIContentConfiguration, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIListContentConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("accompaniedSidebarCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object accompaniedSidebarCellConfiguration();

    @Generated
    @Selector("accompaniedSidebarSubtitleCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object accompaniedSidebarSubtitleCellConfiguration();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIListContentConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("axesPreservingSuperviewLayoutMargins")
    @NUInt
    public native long axesPreservingSuperviewLayoutMargins();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("cellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cellConfiguration();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

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
    @Selector("directionalLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets directionalLayoutMargins();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("groupedFooterConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object groupedFooterConfiguration();

    @Generated
    @Selector("groupedHeaderConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object groupedHeaderConfiguration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("imageProperties")
    public native UIListContentImageProperties imageProperties();

    @Generated
    @Selector("imageToTextPadding")
    @NFloat
    public native double imageToTextPadding();

    @Generated
    @Selector("init")
    public native UIListContentConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIListContentConfiguration initWithCoder(NSCoder coder);

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
    @Selector("makeContentView")
    public native UIView makeContentView();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("plainFooterConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object plainFooterConfiguration();

    @Generated
    @Selector("plainHeaderConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object plainHeaderConfiguration();

    @Generated
    @Selector("prefersSideBySideTextAndSecondaryText")
    public native boolean prefersSideBySideTextAndSecondaryText();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondaryAttributedText")
    public native NSAttributedString secondaryAttributedText();

    @Generated
    @Selector("secondaryText")
    public native String secondaryText();

    @Generated
    @Selector("secondaryTextProperties")
    public native UIListContentTextProperties secondaryTextProperties();

    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(NSAttributedString value);

    @Generated
    @Selector("setAxesPreservingSuperviewLayoutMargins:")
    public native void setAxesPreservingSuperviewLayoutMargins(@NUInt long value);

    @Generated
    @Selector("setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByValue NSDirectionalEdgeInsets value);

    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    @Generated
    @Selector("setImageToTextPadding:")
    public native void setImageToTextPadding(@NFloat double value);

    @Generated
    @Selector("setPrefersSideBySideTextAndSecondaryText:")
    public native void setPrefersSideBySideTextAndSecondaryText(boolean value);

    @Generated
    @Selector("setSecondaryAttributedText:")
    public native void setSecondaryAttributedText(NSAttributedString value);

    @Generated
    @Selector("setSecondaryText:")
    public native void setSecondaryText(String value);

    @Generated
    @Selector("setText:")
    public native void setText(String value);

    @Generated
    @Selector("setTextToSecondaryTextHorizontalPadding:")
    public native void setTextToSecondaryTextHorizontalPadding(@NFloat double value);

    @Generated
    @Selector("setTextToSecondaryTextVerticalPadding:")
    public native void setTextToSecondaryTextVerticalPadding(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sidebarCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object sidebarCellConfiguration();

    @Generated
    @Selector("sidebarHeaderConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object sidebarHeaderConfiguration();

    @Generated
    @Selector("sidebarSubtitleCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object sidebarSubtitleCellConfiguration();

    @Generated
    @Selector("subtitleCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object subtitleCellConfiguration();

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

    @Generated
    @Selector("text")
    public native String text();

    @Generated
    @Selector("textProperties")
    public native UIListContentTextProperties textProperties();

    @Generated
    @Selector("textToSecondaryTextHorizontalPadding")
    @NFloat
    public native double textToSecondaryTextHorizontalPadding();

    @Generated
    @Selector("textToSecondaryTextVerticalPadding")
    @NFloat
    public native double textToSecondaryTextVerticalPadding();

    @Generated
    @Selector("updatedConfigurationForState:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object updatedConfigurationForState(@Mapped(ObjCObjectMapper.class) UIConfigurationState state);

    @Generated
    @Selector("valueCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object valueCellConfiguration();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}