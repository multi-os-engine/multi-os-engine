package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.UIConfigurationState;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBackgroundConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBackgroundConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBackgroundConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("backgroundColorTransformer")
    @ObjCBlock(name = "call_backgroundColorTransformer_ret")
    public native Block_backgroundColorTransformer_ret backgroundColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_backgroundColorTransformer_ret {
        @Generated
        UIColor call_backgroundColorTransformer_ret(UIColor color);
    }

    @Generated
    @Selector("backgroundInsets")
    @ByValue
    public native NSDirectionalEdgeInsets backgroundInsets();

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
    @Selector("clearConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object clearConfiguration();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("cornerRadius")
    @NFloat
    public native double cornerRadius();

    @Generated
    @Selector("customView")
    public native UIView customView();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("edgesAddingLayoutMarginsToBackgroundInsets")
    @NUInt
    public native long edgesAddingLayoutMarginsToBackgroundInsets();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIBackgroundConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBackgroundConfiguration initWithCoder(NSCoder coder);

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
    @Selector("listAccompaniedSidebarCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listAccompaniedSidebarCellConfiguration();

    @Generated
    @Selector("listGroupedCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listGroupedCellConfiguration();

    @Generated
    @Selector("listGroupedHeaderFooterConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listGroupedHeaderFooterConfiguration();

    @Generated
    @Selector("listPlainCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listPlainCellConfiguration();

    @Generated
    @Selector("listPlainHeaderFooterConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listPlainHeaderFooterConfiguration();

    @Generated
    @Selector("listSidebarCellConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listSidebarCellConfiguration();

    @Generated
    @Selector("listSidebarHeaderConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object listSidebarHeaderConfiguration();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resolvedBackgroundColorForTintColor:")
    public native UIColor resolvedBackgroundColorForTintColor(UIColor tintColor);

    @Generated
    @Selector("resolvedStrokeColorForTintColor:")
    public native UIColor resolvedStrokeColorForTintColor(UIColor tintColor);

    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setBackgroundColorTransformer:")
    public native void setBackgroundColorTransformer(
            @ObjCBlock(name = "call_setBackgroundColorTransformer") Block_setBackgroundColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setBackgroundColorTransformer {
        @Generated
        UIColor call_setBackgroundColorTransformer(UIColor color);
    }

    @Generated
    @Selector("setBackgroundInsets:")
    public native void setBackgroundInsets(@ByValue NSDirectionalEdgeInsets value);

    @Generated
    @Selector("setCornerRadius:")
    public native void setCornerRadius(@NFloat double value);

    @Generated
    @Selector("setCustomView:")
    public native void setCustomView(UIView value);

    @Generated
    @Selector("setEdgesAddingLayoutMarginsToBackgroundInsets:")
    public native void setEdgesAddingLayoutMarginsToBackgroundInsets(@NUInt long value);

    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(UIColor value);

    @Generated
    @Selector("setStrokeColorTransformer:")
    public native void setStrokeColorTransformer(
            @ObjCBlock(name = "call_setStrokeColorTransformer") Block_setStrokeColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setStrokeColorTransformer {
        @Generated
        UIColor call_setStrokeColorTransformer(UIColor color);
    }

    @Generated
    @Selector("setStrokeOutset:")
    public native void setStrokeOutset(@NFloat double value);

    @Generated
    @Selector("setStrokeWidth:")
    public native void setStrokeWidth(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setVisualEffect:")
    public native void setVisualEffect(UIVisualEffect value);

    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    @Generated
    @Selector("strokeColorTransformer")
    @ObjCBlock(name = "call_strokeColorTransformer_ret")
    public native Block_strokeColorTransformer_ret strokeColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_strokeColorTransformer_ret {
        @Generated
        UIColor call_strokeColorTransformer_ret(UIColor color);
    }

    @Generated
    @Selector("strokeOutset")
    @NFloat
    public native double strokeOutset();

    @Generated
    @Selector("strokeWidth")
    @NFloat
    public native double strokeWidth();

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
    @Selector("updatedConfigurationForState:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object updatedConfigurationForState(@Mapped(ObjCObjectMapper.class) UIConfigurationState state);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("visualEffect")
    public native UIVisualEffect visualEffect();
}