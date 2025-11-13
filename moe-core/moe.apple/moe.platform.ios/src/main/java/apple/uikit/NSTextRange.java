package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.NSTextLocation;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class that represents a contiguous range between two locations inside document contents.
 * 
 * An `NSTextRange` consists of the starting and terminating locations. There
 * the two basic properties: ``location`` and ``endLocation``, respectively.
 * The terminating ``location``, ``endLocation``, is directly following the
 * last location in the range. For example, a location contains a range if
 * `(range.location <= location) && (location < range.endLocation)` is `true`.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextRange extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextRange(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextRange alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextRange allocWithZone(VoidPtr zone);

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
     * Determines if the text location you specify is in the current text range.
     * 
     * - Parameters:
     * - location: An ``NSTextLocation``.
     * 
     * - Returns: Returns `true` if the location is in the range otherwise `false` .
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("containsLocation:")
    public native boolean containsLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Determines if the text range you specify is in the current text range.
     * 
     * - Parameters:
     * - textRange: An ``NSTextRange``.
     * 
     * - Returns: Returns `true` if the range you provide is in the current range; otherwise `false`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("containsRange:")
    public native boolean containsRange(@NotNull NSTextRange textRange);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The ending location of the text range.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("endLocation")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation endLocation();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextRange init();

    /**
     * Creates a new text range at the location you specify.
     * 
     * - Parameters:
     * - location: An ``NSTextLocation``.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithLocation:")
    public native NSTextRange initWithLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns an empty range when endLocation=nil
     * Creates a new text range with the starting and ending locations you specify.
     * 
     * - Parameters:
     * - location: The starting location.
     * - endLocation: The ending location.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithLocation:endLocation:")
    public native NSTextRange initWithLocationEndLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @Nullable @Mapped(ObjCObjectMapper.class) NSTextLocation endLocation);

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
     * Determines if two ranges intersect.
     * 
     * - Parameters:
     * - textRange: The range used to compare against the current range to evaluate for differences.
     * 
     * - Returns: Returns `true` if the ranges intersect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("intersectsWithTextRange:")
    public native boolean intersectsWithTextRange(@NotNull NSTextRange textRange);

    /**
     * Returns whether the text range is empty.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    /**
     * Compares two text ranges.
     * 
     * - Parameters:
     * - textRange: The range used to compare against the current range to evaluate for differences.
     * 
     * - Returns: Returns `true` if the ranges are equal.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isEqualToTextRange:")
    public native boolean isEqualToTextRange(@NotNull NSTextRange textRange);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The starting location of the text range.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("location")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation location();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextRange new_objc();

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
     * Returns a new text range by forming the union with the text range you provide.
     * 
     * - Parameters:
     * - textRange: The range to use to create the union.
     * 
     * - Returns: An ``NSTextRange`` that represent the union of the two ranges.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("textRangeByFormingUnionWithTextRange:")
    public native NSTextRange textRangeByFormingUnionWithTextRange(@NotNull NSTextRange textRange);

    /**
     * Returns the range, if any, where two text ranges intersect.
     * 
     * - Parameters:
     * - textRange: The range used to compare against the current range to evaluate for differences.
     * 
     * - Returns: An
     * <doc://com.apple.documentation/documentation/foundation/nsrange> that
     * represents the intersection of the ranges, or `nil` if they don't
     * intersect.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("textRangeByIntersectingWithTextRange:")
    public native NSTextRange textRangeByIntersectingWithTextRange(@NotNull NSTextRange textRange);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
