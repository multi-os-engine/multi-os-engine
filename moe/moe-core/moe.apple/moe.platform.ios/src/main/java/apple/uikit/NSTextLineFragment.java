package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;

/**
 * NSTextLineFragment represents a single textual layout and rendering unit inside NSTextLayoutFragment.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextLineFragment extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextLineFragment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextLineFragment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextLineFragment allocWithZone(VoidPtr zone);

    /**
     * The source attributed string
     */
    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

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

    /**
     * The character index for point inside the line fragment coordinate system. The fraction of distance is from the
     * upstream edge
     */
    @Generated
    @Selector("characterIndexForPoint:")
    @NInt
    public native long characterIndexForPoint(@ByValue CGPoint point);

    /**
     * The string range for the source attributed string corresponding to this line fragment
     */
    @Generated
    @Selector("characterRange")
    @ByValue
    public native NSRange characterRange();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Renders the line fragment contents at the rendering origin. The origin can be specified as
     * (NSMinX(typographicBounds) + glyphOrigin.x, NSMinY(typographicBounds) + glyphOrigin.y) relative to the line
     * fragment group coordinate system
     */
    @Generated
    @Selector("drawAtPoint:inContext:")
    public native void drawAtPointInContext(@ByValue CGPoint point, CGContextRef context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fractionOfDistanceThroughGlyphForPoint:")
    @NFloat
    public native double fractionOfDistanceThroughGlyphForPoint(@ByValue CGPoint point);

    /**
     * Rendering origin for the left most glyph in the line fragment coordinate system
     */
    @Generated
    @Selector("glyphOrigin")
    @ByValue
    public native CGPoint glyphOrigin();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextLineFragment init();

    @Generated
    @Selector("initWithAttributedString:range:")
    public native NSTextLineFragment initWithAttributedStringRange(NSAttributedString attributedString,
            @ByValue NSRange range);

    @Generated
    @Selector("initWithCoder:")
    public native NSTextLineFragment initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithString:attributes:range:")
    public native NSTextLineFragment initWithStringAttributesRange(String string, NSDictionary<String, ?> attributes,
            @ByValue NSRange range);

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
     * The location of the character at the specified index. It is on the upstream edge of the glyph. It is in the
     * coordinate system relative to the line fragment origin
     */
    @Generated
    @Selector("locationForCharacterAtIndex:")
    @ByValue
    public native CGPoint locationForCharacterAtIndex(@NInt long index);

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextLineFragment new_objc();

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
     * The typographic bounds specifying the dimensions of the line fragment for laying out line fragments to each
     * other. The origin value is offset from the beginning of the line fragment group belonging to the parent layout
     * fragment.
     */
    @Generated
    @Selector("typographicBounds")
    @ByValue
    public native CGRect typographicBounds();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
