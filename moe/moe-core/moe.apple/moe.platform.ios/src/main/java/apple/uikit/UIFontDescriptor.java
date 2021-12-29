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
import apple.coregraphics.struct.CGAffineTransform;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class UIFontDescriptor extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFontDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFontDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFontDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * Instantiation
     */
    @Generated
    @Selector("fontDescriptorWithFontAttributes:")
    public static native UIFontDescriptor fontDescriptorWithFontAttributes(NSDictionary<String, ?> attributes);

    @Generated
    @Selector("fontDescriptorWithName:matrix:")
    public static native UIFontDescriptor fontDescriptorWithNameMatrix(String fontName,
            @ByValue CGAffineTransform matrix);

    @Generated
    @Selector("fontDescriptorWithName:size:")
    public static native UIFontDescriptor fontDescriptorWithNameSize(String fontName, @NFloat double size);

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIFontDescriptor new_objc();

    /**
     * Returns a font descriptor containing the text style and containing the user's selected content size category.
     */
    @Generated
    @Selector("preferredFontDescriptorWithTextStyle:")
    public static native UIFontDescriptor preferredFontDescriptorWithTextStyle(String style);

    /**
     * Returns a font descriptor containing the text style and containing the content size category defined in the trait collection.
     */
    @Generated
    @Selector("preferredFontDescriptorWithTextStyle:compatibleWithTraitCollection:")
    public static native UIFontDescriptor preferredFontDescriptorWithTextStyleCompatibleWithTraitCollection(
            String style, UITraitCollection traitCollection);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fontAttributes")
    public native NSDictionary<String, ?> fontAttributes();

    /**
     * the new attributes take precedence over the existing ones in the receiver
     */
    @Generated
    @Selector("fontDescriptorByAddingAttributes:")
    public native UIFontDescriptor fontDescriptorByAddingAttributes(NSDictionary<String, ?> attributes);

    @Generated
    @Selector("fontDescriptorWithFace:")
    public native UIFontDescriptor fontDescriptorWithFace(String newFace);

    @Generated
    @Selector("fontDescriptorWithFamily:")
    public native UIFontDescriptor fontDescriptorWithFamily(String newFamily);

    @Generated
    @Selector("fontDescriptorWithMatrix:")
    public native UIFontDescriptor fontDescriptorWithMatrix(@ByValue CGAffineTransform matrix);

    @Generated
    @Selector("fontDescriptorWithSize:")
    public native UIFontDescriptor fontDescriptorWithSize(@NFloat double newPointSize);

    /**
     * Returns a new font descriptor reference in the same family with the given symbolic traits, or nil if none found in the system.
     */
    @Generated
    @Selector("fontDescriptorWithSymbolicTraits:")
    public native UIFontDescriptor fontDescriptorWithSymbolicTraits(int symbolicTraits);

    @Generated
    @Selector("init")
    public native UIFontDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native UIFontDescriptor initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFontAttributes:")
    public native UIFontDescriptor initWithFontAttributes(NSDictionary<String, ?> attributes);

    /**
     * Instance conversion
     * Returns "normalized" font descriptors matching the receiver. mandatoryKeys is an NSSet instance containing keys that are required to be identical in order to be matched. mandatoryKeys can be nil.
     */
    @Generated
    @Selector("matchingFontDescriptorsWithMandatoryKeys:")
    public native NSArray<? extends UIFontDescriptor> matchingFontDescriptorsWithMandatoryKeys(
            NSSet<String> mandatoryKeys);

    @Generated
    @Selector("matrix")
    @ByValue
    public native CGAffineTransform matrix();

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String anAttribute);

    @Generated
    @Selector("pointSize")
    @NFloat
    public native double pointSize();

    /**
     * Core attribute access
     */
    @Generated
    @Selector("postscriptName")
    public native String postscriptName();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("symbolicTraits")
    public native int symbolicTraits();

    /**
     * Returns a new font descriptor reference with the given design, or nil if no match is found in the system.
     */
    @Generated
    @Selector("fontDescriptorWithDesign:")
    public native UIFontDescriptor fontDescriptorWithDesign(String design);
}
