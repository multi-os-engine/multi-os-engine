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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSParagraphStyle extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSParagraphStyle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSParagraphStyle alloc();

    /**
     * defaultParagraphStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/clm/NSParagraphStyle/defaultParagraphStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultParagraphStyle")
    public static native NSParagraphStyle defaultParagraphStyle();

    /**
     * defaultWritingDirectionForLanguage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/clm/NSParagraphStyle/defaultWritingDirectionForLanguage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultWritingDirectionForLanguage:")
    @NInt
    public static native long defaultWritingDirectionForLanguage(String languageName);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    /**
     * alignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/alignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    /**
     * baseWritingDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/baseWritingDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("baseWritingDirection")
    @NInt
    public native long baseWritingDirection();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * defaultTabInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/defaultTabInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultTabInterval")
    @NFloat
    public native double defaultTabInterval();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * firstLineHeadIndent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/firstLineHeadIndent">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstLineHeadIndent")
    @NFloat
    public native double firstLineHeadIndent();

    /**
     * headIndent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/headIndent">iOS Dev Center</a>
     */
    @Generated
    @Selector("headIndent")
    @NFloat
    public native double headIndent();

    /**
     * hyphenationFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/hyphenationFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("hyphenationFactor")
    public native float hyphenationFactor();

    @Generated
    @Selector("init")
    public native NSParagraphStyle init();

    @Generated
    @Selector("initWithCoder:")
    public native NSParagraphStyle initWithCoder(NSCoder aDecoder);

    /**
     * lineBreakMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/lineBreakMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * lineHeightMultiple</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/lineHeightMultiple">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineHeightMultiple")
    @NFloat
    public native double lineHeightMultiple();

    /**
     * lineSpacing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/lineSpacing">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineSpacing")
    @NFloat
    public native double lineSpacing();

    /**
     * maximumLineHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/maximumLineHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumLineHeight")
    @NFloat
    public native double maximumLineHeight();

    /**
     * minimumLineHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/minimumLineHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumLineHeight")
    @NFloat
    public native double minimumLineHeight();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * paragraphSpacing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/paragraphSpacing">iOS Dev Center</a>
     */
    @Generated
    @Selector("paragraphSpacing")
    @NFloat
    public native double paragraphSpacing();

    /**
     * paragraphSpacingBefore</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/paragraphSpacingBefore">iOS Dev Center</a>
     */
    @Generated
    @Selector("paragraphSpacingBefore")
    @NFloat
    public native double paragraphSpacingBefore();

    /**
     * tabStops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/tabStops">iOS Dev Center</a>
     */
    @Generated
    @Selector("tabStops")
    public native NSArray<? extends NSTextTab> tabStops();

    /**
     * tailIndent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSParagraphStyle/tailIndent">iOS Dev Center</a>
     */
    @Generated
    @Selector("tailIndent")
    @NFloat
    public native double tailIndent();

    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
