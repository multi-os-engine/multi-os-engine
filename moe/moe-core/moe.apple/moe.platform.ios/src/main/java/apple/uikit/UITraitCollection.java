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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITraitCollection extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITraitCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITraitCollection alloc();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("traitCollectionWithDisplayGamut:")
    public static native UITraitCollection traitCollectionWithDisplayGamut(@NInt long displayGamut);

    @Generated
    @Selector("traitCollectionWithDisplayScale:")
    public static native UITraitCollection traitCollectionWithDisplayScale(@NFloat double scale);

    @Generated
    @Selector("traitCollectionWithForceTouchCapability:")
    public static native UITraitCollection traitCollectionWithForceTouchCapability(@NInt long capability);

    @Generated
    @Selector("traitCollectionWithHorizontalSizeClass:")
    public static native UITraitCollection traitCollectionWithHorizontalSizeClass(@NInt long horizontalSizeClass);

    @Generated
    @Selector("traitCollectionWithLayoutDirection:")
    public static native UITraitCollection traitCollectionWithLayoutDirection(@NInt long layoutDirection);

    @Generated
    @Selector("traitCollectionWithPreferredContentSizeCategory:")
    public static native UITraitCollection traitCollectionWithPreferredContentSizeCategory(
            String preferredContentSizeCategory);

    @Generated
    @Selector("traitCollectionWithTraitsFromCollections:")
    public static native UITraitCollection traitCollectionWithTraitsFromCollections(
            NSArray<? extends UITraitCollection> traitCollections);

    @Generated
    @Selector("traitCollectionWithUserInterfaceIdiom:")
    public static native UITraitCollection traitCollectionWithUserInterfaceIdiom(@NInt long idiom);

    @Generated
    @Selector("traitCollectionWithVerticalSizeClass:")
    public static native UITraitCollection traitCollectionWithVerticalSizeClass(@NInt long verticalSizeClass);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("containsTraitsInCollection:")
    public native boolean containsTraitsInCollection(UITraitCollection trait);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("displayGamut")
    @NInt
    public native long displayGamut();

    @Generated
    @Selector("displayScale")
    @NFloat
    public native double displayScale();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("forceTouchCapability")
    @NInt
    public native long forceTouchCapability();

    @Generated
    @Selector("horizontalSizeClass")
    @NInt
    public native long horizontalSizeClass();

    @Generated
    @Selector("init")
    public native UITraitCollection init();

    @Generated
    @Selector("initWithCoder:")
    public native UITraitCollection initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("layoutDirection")
    @NInt
    public native long layoutDirection();

    @Generated
    @Selector("preferredContentSizeCategory")
    public native String preferredContentSizeCategory();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    public native long userInterfaceIdiom();

    @Generated
    @Selector("verticalSizeClass")
    @NInt
    public native long verticalSizeClass();
}
