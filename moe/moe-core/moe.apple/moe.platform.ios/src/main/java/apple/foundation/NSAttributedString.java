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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.NSStringDrawingContext;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributedString extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAttributedString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAttributedString alloc();

    /**
     * attribute:atIndex:effectiveRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/attribute:atIndex:effectiveRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attribute:atIndex:effectiveRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexEffectiveRange(String attrName, @NUInt long location, NSRange range);

    /**
     * attribute:atIndex:longestEffectiveRange:inRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/attribute:atIndex:longestEffectiveRange:inRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attribute:atIndex:longestEffectiveRange:inRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexLongestEffectiveRangeInRange(String attrName, @NUInt long location,
            NSRange range, @ByValue NSRange rangeLimit);

    /**
     * attributedStringWithAttachment:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/clm/NSAttributedString/attributedStringWithAttachment:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment(NSTextAttachment attachment);

    /**
     * attributedSubstringFromRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/attributedSubstringFromRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedSubstringFromRange:")
    public native NSAttributedString attributedSubstringFromRange(@ByValue NSRange range);

    /**
     * attributesAtIndex:effectiveRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/attributesAtIndex:effectiveRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributesAtIndex:effectiveRange:")
    public native NSDictionary<String, ?> attributesAtIndexEffectiveRange(@NUInt long location, NSRange range);

    /**
     * attributesAtIndex:longestEffectiveRange:inRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/attributesAtIndex:longestEffectiveRange:inRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary<String, ?> attributesAtIndexLongestEffectiveRangeInRange(@NUInt long location,
            NSRange range, @ByValue NSRange rangeLimit);

    /**
     * boundingRectWithSize:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/boundingRectWithSize:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("boundingRectWithSize:options:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsContext(@ByValue CGSize size, @NInt long options,
            NSStringDrawingContext context);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dataFromRange:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/dataFromRange:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataFromRange:documentAttributes:error:")
    public native NSData dataFromRangeDocumentAttributesError(@ByValue NSRange range, NSDictionary<String, ?> dict,
            Ptr<NSError> error);

    /**
     * drawAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/drawAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawAtPoint:")
    public native void drawAtPoint(@ByValue CGPoint point);

    /**
     * drawInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/drawInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawInRect:")
    public native void drawInRect(@ByValue CGRect rect);

    /**
     * drawWithRect:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/drawWithRect:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawWithRect:options:context:")
    public native void drawWithRectOptionsContext(@ByValue CGRect rect, @NInt long options,
            NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateAttribute:inRange:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/enumerateAttribute:inRange:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateAttribute:inRange:options:usingBlock:")
    public native void enumerateAttributeInRangeOptionsUsingBlock(String attrName, @ByValue NSRange enumerationRange,
            @NUInt long opts,
            @ObjCBlock(name = "call_enumerateAttributeInRangeOptionsUsingBlock") Block_enumerateAttributeInRangeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAttributeInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateAttributeInRangeOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @ByValue NSRange arg1, BoolPtr arg2);
    }

    /**
     * enumerateAttributesInRange:options:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/enumerateAttributesInRange:options:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateAttributesInRange:options:usingBlock:")
    public native void enumerateAttributesInRangeOptionsUsingBlock(@ByValue NSRange enumerationRange, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateAttributesInRangeOptionsUsingBlock") Block_enumerateAttributesInRangeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAttributesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateAttributesInRangeOptionsUsingBlock(NSDictionary<String, ?> arg0, @ByValue NSRange arg1,
                BoolPtr arg2);
    }

    /**
     * fileWrapperFromRange:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/fileWrapperFromRange:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileWrapperFromRange:documentAttributes:error:")
    public native NSFileWrapper fileWrapperFromRangeDocumentAttributesError(@ByValue NSRange range,
            NSDictionary<String, ?> dict, Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSAttributedString init();

    /**
     * initWithAttributedString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithAttributedString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAttributedString:")
    public native NSAttributedString initWithAttributedString(NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSAttributedString initWithCoder(NSCoder aDecoder);

    /**
     * initWithData:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithData:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSAttributedString initWithDataOptionsDocumentAttributesError(NSData data,
            NSDictionary<String, ?> options, Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

    /**
     * initWithFileURL:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithFileURL:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSAttributedString initWithFileURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<?, ?> options, Ptr<NSDictionary<?, ?>> dict, Ptr<NSError> error);

    /**
     * initWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:")
    public native NSAttributedString initWithString(String str);

    /**
     * initWithString:attributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithString:attributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:attributes:")
    public native NSAttributedString initWithStringAttributes(String str, NSDictionary<String, ?> attrs);

    /**
     * isEqualToAttributedString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/isEqualToAttributedString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToAttributedString:")
    public native boolean isEqualToAttributedString(NSAttributedString other);

    /**
     * length</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instp/NSAttributedString/length">iOS Dev Center</a>
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * string</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instp/NSAttributedString/string">iOS Dev Center</a>
     */
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * containsAttachmentsInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/containsAttachmentsInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsAttachmentsInRange:")
    public native boolean containsAttachmentsInRange(@ByValue NSRange range);

    /**
     * initWithURL:options:documentAttributes:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAttributedString_Class/index.html#//apple_ref/occ/instm/NSAttributedString/initWithURL:options:documentAttributes:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSAttributedString initWithURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<String, ?> options, Ptr<NSDictionary<String, ?>> dict, Ptr<NSError> error);

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
