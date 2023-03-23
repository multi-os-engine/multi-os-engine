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

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFont extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFont(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFont alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFont allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("boldSystemFontOfSize:")
    public static native UIFont boldSystemFontOfSize(@NFloat double fontSize);

    @Generated
    @Selector("buttonFontSize")
    @NFloat
    public static native double buttonFontSize();

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

    /**
     * Returns an array of font family names for all installed fonts
     */
    @Generated
    @Selector("familyNames")
    public static native NSArray<String> familyNames();

    /**
     * Returns an array of font names for the specified family name
     */
    @Generated
    @Selector("fontNamesForFamilyName:")
    public static native NSArray<String> fontNamesForFamilyName(String familyName);

    /**
     * Returns a font matching the font descriptor. If fontSize is greater than 0.0, it has precedence over
     * UIFontDescriptorSizeAttribute in fontDescriptor.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fontWithDescriptor:size:")
    public static native UIFont fontWithDescriptorSize(UIFontDescriptor descriptor, @NFloat double pointSize);

    /**
     * Returns a font using CSS name matching semantics.
     */
    @Generated
    @Selector("fontWithName:size:")
    public static native UIFont fontWithNameSize(String fontName, @NFloat double fontSize);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    @Selector("italicSystemFontOfSize:")
    public static native UIFont italicSystemFontOfSize(@NFloat double fontSize);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("labelFontSize")
    @NFloat
    public static native double labelFontSize();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("monospacedDigitSystemFontOfSize:weight:")
    public static native UIFont monospacedDigitSystemFontOfSizeWeight(@NFloat double fontSize, @NFloat double weight);

    @Generated
    @Owned
    @Selector("new")
    public static native UIFont new_objc();

    /**
     * Returns an instance of the font associated with the text style and scaled appropriately for the user's selected
     * content size category. See UIFontDescriptor.h for the complete list.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("preferredFontForTextStyle:")
    public static native UIFont preferredFontForTextStyle(String style);

    /**
     * Returns an instance of the font associated with the text style and scaled appropriately for the content size
     * category defined in the trait collection.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("preferredFontForTextStyle:compatibleWithTraitCollection:")
    public static native UIFont preferredFontForTextStyleCompatibleWithTraitCollection(String style,
            UITraitCollection traitCollection);

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
    @Selector("smallSystemFontSize")
    @NFloat
    public static native double smallSystemFontSize();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Think carefully before using these methods. In most cases, a font returned by +preferredFontForTextStyle: will be
     * more appropriate, and will respect the user's selected content size category.
     */
    @Generated
    @Selector("systemFontOfSize:")
    public static native UIFont systemFontOfSize(@NFloat double fontSize);

    /**
     * Weights used here are analogous to those used with UIFontDescriptor's UIFontWeightTrait.
     * See the UIFontWeight... constants in UIFontDescriptor.h for suggested values.
     * The caveat above about the use of ...systemFont... methods applies to these methods too.
     * 
     * API-Since: 8.2
     */
    @Generated
    @Selector("systemFontOfSize:weight:")
    public static native UIFont systemFontOfSizeWeight(@NFloat double fontSize, @NFloat double weight);

    @Generated
    @Selector("systemFontSize")
    @NFloat
    public static native double systemFontSize();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("ascender")
    @NFloat
    public native double ascender();

    @Generated
    @Selector("capHeight")
    @NFloat
    public native double capHeight();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("descender")
    @NFloat
    public native double descender();

    /**
     * Font attributes
     */
    @Generated
    @Selector("familyName")
    public native String familyName();

    /**
     * Returns a font descriptor which describes the font.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fontDescriptor")
    public native UIFontDescriptor fontDescriptor();

    @Generated
    @Selector("fontName")
    public native String fontName();

    /**
     * Create a new font that is identical to the current font except the specified size
     */
    @Generated
    @Selector("fontWithSize:")
    public native UIFont fontWithSize(@NFloat double fontSize);

    @Generated
    @Selector("init")
    public native UIFont init();

    @Generated
    @Selector("leading")
    @NFloat
    public native double leading();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("lineHeight")
    @NFloat
    public native double lineHeight();

    @Generated
    @Selector("pointSize")
    @NFloat
    public native double pointSize();

    @Generated
    @Selector("xHeight")
    @NFloat
    public native double xHeight();

    /**
     * Returns current default monospaced font for system UI. Clients of this API should be aware that the monospaced
     * system font has a similar coverage of default system UI font, which includes Latin and common symbols used for
     * displaying text like source code. For the characters it does not cover, the substituted fonts are usually not the
     * same width as the monospaced system font, they can be wider, narrower, or variable. To ensure fixed advances in
     * text layout, clients can consider using string attributes like UIFontDescriptorFixedAdvanceAttribute.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("monospacedSystemFontOfSize:weight:")
    public static native UIFont monospacedSystemFontOfSizeWeight(@NFloat double fontSize, @NFloat double weight);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native UIFont initWithCoder(NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns an instance with the specified weight and width. Width values are declared in UIFontDescriptor.h.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("systemFontOfSize:weight:width:")
    public static native UIFont systemFontOfSizeWeightWidth(@NFloat double fontSize, @NFloat double weight,
            @NFloat double width);
}
