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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFont extends NSObject implements NSCopying {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("familyNames")
    public static native NSArray<String> familyNames();

    @Generated
    @Selector("fontNamesForFamilyName:")
    public static native NSArray<String> fontNamesForFamilyName(String familyName);

    @Generated
    @Selector("fontWithDescriptor:size:")
    public static native UIFont fontWithDescriptorSize(UIFontDescriptor descriptor, @NFloat double pointSize);

    @Generated
    @Selector("fontWithName:size:")
    public static native UIFont fontWithNameSize(String fontName, @NFloat double fontSize);

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
    @Selector("italicSystemFontOfSize:")
    public static native UIFont italicSystemFontOfSize(@NFloat double fontSize);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("labelFontSize")
    @NFloat
    public static native double labelFontSize();

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("monospacedDigitSystemFontOfSize:weight:")
    public static native UIFont monospacedDigitSystemFontOfSizeWeight(@NFloat double fontSize, @NFloat double weight);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("preferredFontForTextStyle:")
    public static native UIFont preferredFontForTextStyle(String style);

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

    @Generated
    @Selector("systemFontOfSize:")
    public static native UIFont systemFontOfSize(@NFloat double fontSize);

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

    @Generated
    @Selector("familyName")
    public native String familyName();

    @Generated
    @Selector("fontDescriptor")
    public native UIFontDescriptor fontDescriptor();

    @Generated
    @Selector("fontName")
    public native String fontName();

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
}
