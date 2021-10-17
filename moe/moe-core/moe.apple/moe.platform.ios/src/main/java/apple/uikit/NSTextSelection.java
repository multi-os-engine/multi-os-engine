package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.NSTextLocation;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextSelection extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextSelection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Either upstream or downstream selection. NSTextSelectionAffinityDownstream by default. For a 0-length selection, it describes the visual location of the text cursor between the head of line containing the selection location (downstream) or tail of the previous line (upstream). For a selection with contents, it describes the logical direction of non-anchored edge of the selection.
     */
    @Generated
    @Selector("affinity")
    @NInt
    public native long affinity();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextSelection alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Represents the anchor position offset from the beginning of a line fragment in the visual order for the initial tap or mouse down. That is from the left for a horizontal line fragment and from the top for a vertical. Navigating between lines uses this point when the current line fragment associated with the selection is shorter than the next line visited. 0.0 by default.
     */
    @Generated
    @Selector("anchorPositionOffset")
    @NFloat
    public native double anchorPositionOffset();

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
     * The granularity of the selection. NSTextSelectionGranularityByCharacter by default. Extending operations should modify the selection by the granularity.
     */
    @Generated
    @Selector("granularity")
    @NInt
    public native long granularity();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextSelection init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextSelection initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLocation:affinity:")
    public native NSTextSelection initWithLocationAffinity(@Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NInt long affinity);

    @Generated
    @Selector("initWithRange:affinity:granularity:")
    public native NSTextSelection initWithRangeAffinityGranularity(NSTextRange range, @NInt long affinity,
            @NInt long granularity);

    /**
     * textRanges should be ordered and not overlapping. Otherwise, textRanges would get normalized by reordered and merging overlapping ranges.
     */
    @Generated
    @Selector("initWithRanges:affinity:granularity:")
    public native NSTextSelection initWithRangesAffinityGranularity(NSArray<? extends NSTextRange> textRanges,
            @NInt long affinity, @NInt long granularity);

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
     * Indicates whether the selection should be interpreted as logical or visual.
     */
    @Generated
    @Selector("isLogical")
    public native boolean isLogical();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Transient text selection during drag handling
     */
    @Generated
    @Selector("isTransient")
    public native boolean isTransient();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    /**
     * Specifies the secondary character location when user taps/clicks at a directional boundary. Setting non-nil location has a side effect of making -logical=NO.
     */
    @Generated
    @Selector("secondarySelectionLocation")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation secondarySelectionLocation();

    /**
     * Represents the anchor position offset from the beginning of a line fragment in the visual order for the initial tap or mouse down. That is from the left for a horizontal line fragment and from the top for a vertical. Navigating between lines uses this point when the current line fragment associated with the selection is shorter than the next line visited. 0.0 by default.
     */
    @Generated
    @Selector("setAnchorPositionOffset:")
    public native void setAnchorPositionOffset(@NFloat double value);

    /**
     * Indicates whether the selection should be interpreted as logical or visual.
     */
    @Generated
    @Selector("setLogical:")
    public native void setLogical(boolean value);

    /**
     * Specifies the secondary character location when user taps/clicks at a directional boundary. Setting non-nil location has a side effect of making -logical=NO.
     */
    @Generated
    @Selector("setSecondarySelectionLocation:")
    public native void setSecondarySelectionLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation value);

    /**
     * The template attributes used for characters replacing the contents of this selection.
     */
    @Generated
    @Selector("setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary<String, ?> value);

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
     * Represents an array of disjoint logical ranges in the selection. The array must be logically ordered. When editing, all ranges in a text selection constitute a single insertion point.
     */
    @Generated
    @Selector("textRanges")
    public native NSArray<? extends NSTextRange> textRanges();

    /**
     * Returns a copy of this selection, replacing this instance's textRanges property with textRanges but keeping all other attributes the same.
     */
    @Generated
    @Selector("textSelectionWithTextRanges:")
    public native NSTextSelection textSelectionWithTextRanges(NSArray<? extends NSTextRange> textRanges);

    /**
     * The template attributes used for characters replacing the contents of this selection.
     */
    @Generated
    @Selector("typingAttributes")
    public native NSDictionary<String, ?> typingAttributes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
