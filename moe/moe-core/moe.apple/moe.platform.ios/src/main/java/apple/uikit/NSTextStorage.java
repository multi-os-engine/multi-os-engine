/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableAttributedString;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.NSTextStorageDelegate;
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
import org.moe.natj.general.ptr.Ptr;
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
public class NSTextStorage extends NSMutableAttributedString {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextStorage(Pointer peer) {
        super(peer);
    }

    /**
     * addLayoutManager:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/addLayoutManager:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addLayoutManager:")
    public native void addLayoutManager(NSLayoutManager aLayoutManager);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextStorage alloc();

    @Generated
    @Selector("attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment(NSTextAttachment attachment);

    /**
     * changeInLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/changeInLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeInLength")
    @NInt
    public native long changeInLength();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextStorageDelegate delegate();

    /**
     * edited:range:changeInLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/edited:range:changeInLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("edited:range:changeInLength:")
    public native void editedRangeChangeInLength(@NUInt long editedMask, @ByValue NSRange editedRange,
            @NInt long delta);

    /**
     * editedMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/editedMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("editedMask")
    @NUInt
    public native long editedMask();

    /**
     * editedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/editedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("editedRange")
    @ByValue
    public native NSRange editedRange();

    /**
     * ensureAttributesAreFixedInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/ensureAttributesAreFixedInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixedInRange(@ByValue NSRange range);

    /**
     * fixesAttributesLazily</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/fixesAttributesLazily">iOS Dev Center</a>
     */
    @Generated
    @Selector("fixesAttributesLazily")
    public native boolean fixesAttributesLazily();

    @Generated
    @Selector("init")
    public native NSTextStorage init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSTextStorage initWithAttributedString(NSAttributedString attrStr);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSTextStorage initWithDataOptionsDocumentAttributesError(NSData data, NSDictionary<String, ?> options,
            Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    @Deprecated
    @Generated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSTextStorage initWithFileURLOptionsDocumentAttributesError(NSURL url, NSDictionary<?, ?> options,
            Ptr<NSDictionary<?, ?>> dict, Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSTextStorage initWithString(String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSTextStorage initWithStringAttributes(String str, NSDictionary<String, ?> attrs);

    /**
     * invalidateAttributesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/invalidateAttributesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateAttributesInRange:")
    public native void invalidateAttributesInRange(@ByValue NSRange range);

    /**
     * layoutManagers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/layoutManagers">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutManagers")
    public native NSArray<? extends NSLayoutManager> layoutManagers();

    /**
     * processEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/processEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("processEditing")
    public native void processEditing();

    /**
     * removeLayoutManager:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instm/NSTextStorage/removeLayoutManager:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeLayoutManager:")
    public native void removeLayoutManager(NSLayoutManager aLayoutManager);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextStorage_Class/index.html#//apple_ref/occ/instp/NSTextStorage/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value) {
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
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSTextStorage initWithURLOptionsDocumentAttributesError(NSURL url, NSDictionary<String, ?> options,
            Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    @Generated
    @Selector("initWithCoder:")
    public native NSTextStorage initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
