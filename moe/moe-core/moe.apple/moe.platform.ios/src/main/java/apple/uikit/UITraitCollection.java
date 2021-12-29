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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A trait collection encapsulates the system traits of an interface's environment.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITraitCollection allocWithZone(VoidPtr zone);

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
    public static native UITraitCollection new_objc();

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

    /**
     * Returns a trait collection by merging the traits in `traitCollections`. The last trait along any given
     * axis (e.g. interface usage) will supersede any others.
     */
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

    /**
     * unspecified: UIDisplayGamutUnspecified
     */
    @Generated
    @Selector("displayGamut")
    @NInt
    public native long displayGamut();

    /**
     * unspecified: 0.0
     */
    @Generated
    @Selector("displayScale")
    @NFloat
    public native double displayScale();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * unspecified: UIForceTouchCapabilityUnknown
     */
    @Generated
    @Selector("forceTouchCapability")
    @NInt
    public native long forceTouchCapability();

    /**
     * unspecified: UIUserInterfaceSizeClassUnspecified
     */
    @Generated
    @Selector("horizontalSizeClass")
    @NInt
    public native long horizontalSizeClass();

    @Generated
    @Selector("init")
    public native UITraitCollection init();

    @Generated
    @Selector("initWithCoder:")
    public native UITraitCollection initWithCoder(NSCoder coder);

    /**
     * unspecified: UITraitEnvironmentLayoutDirectionUnspecified
     */
    @Generated
    @Selector("layoutDirection")
    @NInt
    public native long layoutDirection();

    /**
     * unspecified: UIContentSizeCategoryUnspecified
     */
    @Generated
    @Selector("preferredContentSizeCategory")
    public native String preferredContentSizeCategory();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * unspecified: UIUserInterfaceIdiomUnspecified
     */
    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    public native long userInterfaceIdiom();

    /**
     * unspecified: UIUserInterfaceSizeClassUnspecified
     */
    @Generated
    @Selector("verticalSizeClass")
    @NInt
    public native long verticalSizeClass();

    /**
     * unspecified: UIAccessibilityContrastUnspecified
     */
    @Generated
    @Selector("accessibilityContrast")
    @NInt
    public native long accessibilityContrast();

    /**
     * The current trait collection, used when resolving the appearance of dynamic UIColors and similar objects.
     * This is a thread-local property, so it may be changed on non-main threads without affecting the main thread.
     */
    @Generated
    @Selector("currentTraitCollection")
    public static native UITraitCollection currentTraitCollection();

    /**
     * Return whether this trait collection, compared to a different trait collection, could show a different appearance
     * for dynamic colors that are provided by UIKit or are in an asset catalog.
     * If you need to be aware of when dynamic colors might change, override `traitCollectionDidChange` in your view or view controller,
     * and use this method to compare `self.traitCollection` with `previousTraitCollection`.
     * <p>
     * Currently, a change in any of these traits could affect dynamic colors:
     * userInterfaceIdiom, userInterfaceStyle, displayGamut, accessibilityContrast, userInterfaceLevel
     * and more could be added in the future.
     */
    @Generated
    @Selector("hasDifferentColorAppearanceComparedToTraitCollection:")
    public native boolean hasDifferentColorAppearanceComparedToTraitCollection(UITraitCollection traitCollection);

    /**
     * Returns an image configuration compatible with this trait collection.
     */
    @Generated
    @Selector("imageConfiguration")
    public native UIImageConfiguration imageConfiguration();

    /**
     * unspecified: UILegibilityWeightUnspecified
     */
    @Generated
    @Selector("legibilityWeight")
    @NInt
    public native long legibilityWeight();

    /**
     * Sets `UITraitCollection.currentTraitCollection` to this trait collection, performs the given actions,
     * then restores `UITraitCollection.currentTraitCollection` to its original value.
     * Just like `currentTraitCollection`, this only affects the current thread, and may be used on non-main threads
     * without affecting the main thread.
     */
    @Generated
    @Selector("performAsCurrentTraitCollection:")
    public native void performAsCurrentTraitCollection(
            @ObjCBlock(name = "call_performAsCurrentTraitCollection") Block_performAsCurrentTraitCollection actions);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performAsCurrentTraitCollection {
        @Generated
        void call_performAsCurrentTraitCollection();
    }

    /**
     * The current trait collection, used when resolving the appearance of dynamic UIColors and similar objects.
     * This is a thread-local property, so it may be changed on non-main threads without affecting the main thread.
     */
    @Generated
    @Selector("setCurrentTraitCollection:")
    public static native void setCurrentTraitCollection(UITraitCollection value);

    @Generated
    @Selector("traitCollectionWithAccessibilityContrast:")
    public static native UITraitCollection traitCollectionWithAccessibilityContrast(@NInt long accessibilityContrast);

    @Generated
    @Selector("traitCollectionWithLegibilityWeight:")
    public static native UITraitCollection traitCollectionWithLegibilityWeight(@NInt long legibilityWeight);

    @Generated
    @Selector("traitCollectionWithUserInterfaceLevel:")
    public static native UITraitCollection traitCollectionWithUserInterfaceLevel(@NInt long userInterfaceLevel);

    @Generated
    @Selector("traitCollectionWithUserInterfaceStyle:")
    public static native UITraitCollection traitCollectionWithUserInterfaceStyle(@NInt long userInterfaceStyle);

    /**
     * unspecified: UIUserInterfaceLevelUnspecified
     */
    @Generated
    @Selector("userInterfaceLevel")
    @NInt
    public native long userInterfaceLevel();

    /**
     * unspecified: UIUserInterfaceStyleUnspecified
     */
    @Generated
    @Selector("userInterfaceStyle")
    @NInt
    public native long userInterfaceStyle();

    /**
     * unspecified: UIUserInterfaceActiveAppearanceUnspecified
     */
    @Generated
    @Selector("activeAppearance")
    @NInt
    public native long activeAppearance();

    /**
     * This trait indicates whether the UI should have an 'active' appearance.
     * On macOS, this varies based on window activation state.
     * On other platforms, this is always .active.
     */
    @Generated
    @Selector("traitCollectionWithActiveAppearance:")
    public static native UITraitCollection traitCollectionWithActiveAppearance(
            @NInt long userInterfaceActiveAppearance);
}
