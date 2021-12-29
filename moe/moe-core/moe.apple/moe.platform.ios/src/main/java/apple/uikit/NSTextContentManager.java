package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.NSTextElementProvider;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSTextContentManager is an abstract class defining the interface for managing the text document contents and the default implementation. The concrete subclass overrides NSTextElementProvider for managing the content backing store. It is the root object strongly referencing the rest of objects in the TextKit network via an array of NSTextLayoutManager. Also, it manages the editing transaction by tracking the active NSTextLayoutManager focused to be editing.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextContentManager extends NSObject implements NSTextElementProvider, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextContentManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addTextLayoutManager:")
    public native void addTextLayoutManager(NSTextLayoutManager textLayoutManager);

    @Generated
    @IsOptional
    @Selector("adjustedRangeFromRange:forEditingTextSelection:")
    public native NSTextRange adjustedRangeFromRangeForEditingTextSelection(NSTextRange textRange,
            boolean forEditingTextSelection);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextContentManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextContentManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Automatically synchronizes all text layout managers when hasEditingTransaction becoming NO. YES by default.
     */
    @Generated
    @Selector("automaticallySynchronizesTextLayoutManagers")
    public native boolean automaticallySynchronizesTextLayoutManagers();

    /**
     * Automatically synchronizes the backing store when hasEditingTransaction becoming NO. NO by default.
     */
    @Generated
    @Selector("automaticallySynchronizesToBackingStore")
    public native boolean automaticallySynchronizesToBackingStore();

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
    @Selector("documentRange")
    public native NSTextRange documentRange();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("enumerateTextElementsFromLocation:options:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation enumerateTextElementsFromLocationOptionsUsingBlock(
            @Mapped(ObjCObjectMapper.class) NSTextLocation textLocation, @NUInt long options,
            @ObjCBlock(name = "call_enumerateTextElementsFromLocationOptionsUsingBlock") NSTextElementProvider.Block_enumerateTextElementsFromLocationOptionsUsingBlock block);

    /**
     * When YES, there is an active editing transaction from primaryTextLayoutManager. the synchronization operations to non-primary text layout managers and the backing store block (or fails when synchronous) while this property is YES. Non-primary text layout managers should avoid accessing the elements while this is YES. KVO-compliant
     */
    @Generated
    @Selector("hasEditingTransaction")
    public native boolean hasEditingTransaction();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextContentManager init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextContentManager initWithCoder(NSCoder coder);

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
    @IsOptional
    @Selector("locationFromLocation:withOffset:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation locationFromLocationWithOffset(@Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NInt long offset);

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextContentManager new_objc();

    @Generated
    @IsOptional
    @Selector("offsetFromLocation:toLocation:")
    @NInt
    public native long offsetFromLocationToLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation from,
            @Mapped(ObjCObjectMapper.class) NSTextLocation to);

    /**
     * Invoked by primaryTextLayoutManager controlling the active editing transaction. Can be nested. The outer most transaction toggles hasEditingTransaction and sends synchronization messages if enabled after invoking transaction.
     */
    @Generated
    @Selector("performEditingTransactionUsingBlock:")
    public native void performEditingTransactionUsingBlock(
            @ObjCBlock(name = "call_performEditingTransactionUsingBlock") Block_performEditingTransactionUsingBlock transaction);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performEditingTransactionUsingBlock {
        @Generated
        void call_performEditingTransactionUsingBlock();
    }

    /**
     * The primary NSTextLayoutManager interacting with the user allowing to edit. Setting an NSTextLayoutManager not in textLayoutManagers will reset to nil. It automatically synchronizes pending edits before switching to a new primary object. The operation is synchronous. KVO-compliant
     */
    @Generated
    @Selector("primaryTextLayoutManager")
    public native NSTextLayoutManager primaryTextLayoutManager();

    /**
     * Records information about an edit action to the transaction. originalTextRange is the range edited before the action, and newTextRange is the corresponding range after the action. The concrete subclass should invoke this method for each edit action.
     */
    @Generated
    @Selector("recordEditActionInRange:newTextRange:")
    public native void recordEditActionInRangeNewTextRange(NSTextRange originalTextRange, NSTextRange newTextRange);

    @Generated
    @Selector("removeTextLayoutManager:")
    public native void removeTextLayoutManager(NSTextLayoutManager textLayoutManager);

    @Generated
    @Selector("replaceContentsInRange:withTextElements:")
    public native void replaceContentsInRangeWithTextElements(NSTextRange range,
            NSArray<? extends NSTextElement> textElements);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Automatically synchronizes all text layout managers when hasEditingTransaction becoming NO. YES by default.
     */
    @Generated
    @Selector("setAutomaticallySynchronizesTextLayoutManagers:")
    public native void setAutomaticallySynchronizesTextLayoutManagers(boolean value);

    /**
     * Automatically synchronizes the backing store when hasEditingTransaction becoming NO. NO by default.
     */
    @Generated
    @Selector("setAutomaticallySynchronizesToBackingStore:")
    public native void setAutomaticallySynchronizesToBackingStore(boolean value);

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

    /**
     * The primary NSTextLayoutManager interacting with the user allowing to edit. Setting an NSTextLayoutManager not in textLayoutManagers will reset to nil. It automatically synchronizes pending edits before switching to a new primary object. The operation is synchronous. KVO-compliant
     */
    @Generated
    @Selector("setPrimaryTextLayoutManager:")
    public native void setPrimaryTextLayoutManager(NSTextLayoutManager value);

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
     * Synchronizes changes to all non-primary text layout managers. If completionHandler=nil, performs the operation synchronously. completionHandler gets passed error if failed. It should block (or fail if synchronous) when there is an active transaction.
     */
    @Generated
    @Selector("synchronizeTextLayoutManagers:")
    public native void synchronizeTextLayoutManagers(
            @ObjCBlock(name = "call_synchronizeTextLayoutManagers") Block_synchronizeTextLayoutManagers completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_synchronizeTextLayoutManagers {
        @Generated
        void call_synchronizeTextLayoutManagers(NSError error);
    }

    @Generated
    @Selector("synchronizeToBackingStore:")
    public native void synchronizeToBackingStore(
            @ObjCBlock(name = "call_synchronizeToBackingStore") NSTextElementProvider.Block_synchronizeToBackingStore completionHandler);

    /**
     * Returns an array of NSTextElement intersecting the specified range in sequence. It can return a set of elements not filling the entire range specified if the entire range is not synchronously available. Uses -enumerateTextElementsFromLocation:options:usingBlocK: to fill the array.
     */
    @Generated
    @Selector("textElementsForRange:")
    public native NSArray<? extends NSTextElement> textElementsForRange(NSTextRange range);

    /**
     * An array of NSTextLayoutManager. KVO-compliant
     */
    @Generated
    @Selector("textLayoutManagers")
    public native NSArray<? extends NSTextLayoutManager> textLayoutManagers();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
