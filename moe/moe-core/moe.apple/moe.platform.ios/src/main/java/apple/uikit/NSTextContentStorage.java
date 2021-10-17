package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.NSTextLocation;
import apple.uikit.protocol.NSTextStorageObserving;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSTextContentStorage is a concrete subclass of NSTextContentManager providing support for NSAttributedString backing-store. It also implements NSTextStorageObserving participating as a client of NSTextStorage. The facility only supports a single NSTextContentStorage associated with a text storage. When -textStorage!=nil, -attributedString is ignored. By default, NSTextContentStorage is initialized with NSTextStorage as the backing-store.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextContentStorage extends NSTextContentManager implements NSTextStorageObserving {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextContentStorage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Should be implemented if the location backing store requires manual adjustment after editing. When textRange is intersecting or following the current edited range, the method returns the range adjusted for the modification in the editing session. Returns nil, when no adjustment necessary. forEditingTextSelection indicates if textRange is for the text selection associated with the edit session.
     */
    @Generated
    @Selector("adjustedRangeFromRange:forEditingTextSelection:")
    public native NSTextRange adjustedRangeFromRangeForEditingTextSelection(NSTextRange textRange,
            boolean forEditingTextSelection);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextContentStorage alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSTextContentStorage allocWithZone(VoidPtr zone);

    /**
     * The document contents. KVO-compliant
     */
    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

    /**
     * Returns a new attributed string for textElement. Returns if textElement cannot be mapped to NSAttributedString.
     */
    @Generated
    @Selector("attributedStringForTextElement:")
    public native NSAttributedString attributedStringForTextElement(NSTextElement textElement);

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextContentStorage init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextContentStorage initWithCoder(NSCoder coder);

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
     * Returns a new location from location with offset. The offset value could be positive or negative indicating the logical direction. Could return nil when the inputs don't produce any legal location (i.e. out of bounds index).
     */
    @Generated
    @Selector("locationFromLocation:withOffset:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation locationFromLocationWithOffset(@Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NInt long offset);

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextContentStorage new_objc();

    /**
     * Returns the offset between from and to. The return value could be positive or negative. Could return NSNotFound when the offset cannot be represented in an integer value (i.e. locations are not in the same document).
     */
    @Generated
    @Selector("offsetFromLocation:toLocation:")
    @NInt
    public native long offsetFromLocationToLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation from,
            @Mapped(ObjCObjectMapper.class) NSTextLocation to);

    @Generated
    @Selector("performEditingTransactionForTextStorage:usingBlock:")
    public native void performEditingTransactionForTextStorageUsingBlock(NSTextStorage textStorage,
            @ObjCBlock(name = "call_performEditingTransactionForTextStorageUsingBlock") NSTextStorageObserving.Block_performEditingTransactionForTextStorageUsingBlock transaction);

    @Generated
    @Selector("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorageEditedRangeChangeInLengthInvalidatedRange(NSTextStorage textStorage,
            @NUInt long editMask, @ByValue NSRange newCharRange, @NInt long delta,
            @ByValue NSRange invalidatedCharRange);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The document contents. KVO-compliant
     */
    @Generated
    @Selector("setAttributedString:")
    public native void setAttributedString(NSAttributedString value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setTextStorage:")
    public native void setTextStorage(NSTextStorage value);

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
     * Returns NSTextElement corresponding to attributedString. Returns nil when attributedString contains attributes not mappable to NSTextElement.
     */
    @Generated
    @Selector("textElementForAttributedString:")
    public native NSTextElement textElementForAttributedString(NSAttributedString attributedString);

    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
