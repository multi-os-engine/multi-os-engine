package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
public class UIListContentTextProperties extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIListContentTextProperties(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Whether the font is automatically updated when the content size category changes.
     */
    @Generated
    @Selector("adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();

    /**
     * Whether the font size of the text is automatically adjusted when necessary to fit in the available width.
     */
    @Generated
    @Selector("adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();

    /**
     * The alignment for the text.
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIListContentTextProperties alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIListContentTextProperties allocWithZone(VoidPtr zone);

    /**
     * Whether the text is tightened before truncating.
     */
    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
     * The color of the text.
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * Optional color transformer that is used to resolve the color. A nil value means the `color` is used as-is.
     */
    @Generated
    @Selector("colorTransformer")
    @ObjCBlock(name = "call_colorTransformer_ret")
    public native Block_colorTransformer_ret colorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorTransformer_ret {
        @Generated
        UIColor call_colorTransformer_ret(UIColor color);
    }

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

    /**
     * The font used for the text.
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIListContentTextProperties init();

    @Generated
    @Selector("initWithCoder:")
    public native UIListContentTextProperties initWithCoder(NSCoder coder);

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
     * The line break mode to use for the text.
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * When `adjustsFontSizeToFitWidth` is enabled, the smallest multiplier for the font size used to make the text fit.
     */
    @Generated
    @Selector("minimumScaleFactor")
    @NFloat
    public native double minimumScaleFactor();

    @Generated
    @Owned
    @Selector("new")
    public static native UIListContentTextProperties new_objc();

    /**
     * The maximum number of lines for the text. 0 indicates the number of lines is unlimited.
     */
    @Generated
    @Selector("numberOfLines")
    @NInt
    public native long numberOfLines();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the resolved color, based on the `color` and `colorTransformer`.
     */
    @Generated
    @Selector("resolvedColor")
    public native UIColor resolvedColor();

    /**
     * Whether the font is automatically updated when the content size category changes.
     */
    @Generated
    @Selector("setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean value);

    /**
     * Whether the font size of the text is automatically adjusted when necessary to fit in the available width.
     */
    @Generated
    @Selector("setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean value);

    /**
     * The alignment for the text.
     */
    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    /**
     * Whether the text is tightened before truncating.
     */
    @Generated
    @Selector("setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean value);

    /**
     * The color of the text.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * Optional color transformer that is used to resolve the color. A nil value means the `color` is used as-is.
     */
    @Generated
    @Selector("setColorTransformer:")
    public native void setColorTransformer(
            @ObjCBlock(name = "call_setColorTransformer") Block_setColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setColorTransformer {
        @Generated
        UIColor call_setColorTransformer(UIColor color);
    }

    /**
     * The font used for the text.
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * The line break mode to use for the text.
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * When `adjustsFontSizeToFitWidth` is enabled, the smallest multiplier for the font size used to make the text fit.
     */
    @Generated
    @Selector("setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@NFloat double value);

    /**
     * The maximum number of lines for the text. 0 indicates the number of lines is unlimited.
     */
    @Generated
    @Selector("setNumberOfLines:")
    public native void setNumberOfLines(@NInt long value);

    /**
     * A transform that is applied to the text before it is displayed.
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@NInt long value);

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
     * A transform that is applied to the text before it is displayed.
     */
    @Generated
    @Selector("transform")
    @NInt
    public native long transform();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
