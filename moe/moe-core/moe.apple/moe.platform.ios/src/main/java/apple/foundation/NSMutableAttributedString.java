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

package apple.foundation;

import apple.NSObject;
import apple.foundation.struct.NSRange;
import apple.uikit.NSTextAttachment;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableAttributedString extends NSAttributedString {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableAttributedString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableAttributedString alloc();

    @Generated
    @Selector("attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment(NSTextAttachment attachment);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addAttribute:value:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/addAttribute:value:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addAttribute:value:range:")
    public native void addAttributeValueRange(String name, @Mapped(ObjCObjectMapper.class) Object value,
            @ByValue NSRange range);

    /**
     * addAttributes:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/addAttributes:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addAttributes:range:")
    public native void addAttributesRange(NSDictionary<String, ?> attrs, @ByValue NSRange range);

    /**
     * appendAttributedString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/appendAttributedString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appendAttributedString:")
    public native void appendAttributedString(NSAttributedString attrString);

    /**
     * beginEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/beginEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginEditing")
    public native void beginEditing();

    /**
     * deleteCharactersInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/deleteCharactersInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteCharactersInRange:")
    public native void deleteCharactersInRange(@ByValue NSRange range);

    /**
     * endEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/endEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("endEditing")
    public native void endEditing();

    /**
     * fixAttributesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/fixAttributesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fixAttributesInRange:")
    public native void fixAttributesInRange(@ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSMutableAttributedString init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSMutableAttributedString initWithAttributedString(NSAttributedString attrStr);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithDataOptionsDocumentAttributesError(NSData data,
            NSDictionary<String, ?> options, Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    @Deprecated
    @Generated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithFileURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<?, ?> options, Ptr<NSDictionary<?, ?>> dict, Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSMutableAttributedString initWithString(String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSMutableAttributedString initWithStringAttributes(String str, NSDictionary<String, ?> attrs);

    /**
     * insertAttributedString:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/insertAttributedString:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertAttributedString:atIndex:")
    public native void insertAttributedStringAtIndex(NSAttributedString attrString, @NUInt long loc);

    /**
     * mutableString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instp/NSMutableAttributedString/mutableString">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableString")
    public native NSMutableString mutableString();

    /**
     * readFromData:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/readFromData:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readFromData:options:documentAttributes:error:")
    public native boolean readFromDataOptionsDocumentAttributesError(NSData data, NSDictionary<String, ?> opts,
            Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    /**
     * readFromFileURL:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/readFromFileURL:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("readFromFileURL:options:documentAttributes:error:")
    public native boolean readFromFileURLOptionsDocumentAttributesError(NSURL url, NSDictionary<?, ?> opts,
            Ptr<NSDictionary<?, ?>> dict, Ptr<NSError> error);

    /**
     * removeAttribute:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/removeAttribute:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAttribute:range:")
    public native void removeAttributeRange(String name, @ByValue NSRange range);

    /**
     * replaceCharactersInRange:withAttributedString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/replaceCharactersInRange:withAttributedString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceCharactersInRange:withAttributedString:")
    public native void replaceCharactersInRangeWithAttributedString(@ByValue NSRange range,
            NSAttributedString attrString);

    /**
     * replaceCharactersInRange:withString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/replaceCharactersInRange:withString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceCharactersInRange:withString:")
    public native void replaceCharactersInRangeWithString(@ByValue NSRange range, String str);

    /**
     * setAttributedString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/setAttributedString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributedString:")
    public native void setAttributedString(NSAttributedString attrString);

    /**
     * setAttributes:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/setAttributes:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributes:range:")
    public native void setAttributesRange(NSDictionary<String, ?> attrs, @ByValue NSRange range);

    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<String, ?> options, Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    /**
     * readFromURL:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableAttributedString_Class/index.html#//apple_ref/occ/instm/NSMutableAttributedString/readFromURL:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readFromURL:options:documentAttributes:error:")
    public native boolean readFromURLOptionsDocumentAttributesError(NSURL url, NSDictionary<String, ?> opts,
            Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableAttributedString initWithCoder(NSCoder aDecoder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
