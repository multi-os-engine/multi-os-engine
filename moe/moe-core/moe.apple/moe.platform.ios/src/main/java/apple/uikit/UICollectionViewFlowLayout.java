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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
public class UICollectionViewFlowLayout extends UICollectionViewLayout {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewFlowLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewFlowLayout alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewFlowLayout allocWithZone(VoidPtr zone);

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
    @Selector("invalidationContextClass")
    public static native Class invalidationContextClass();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layoutAttributesClass")
    public static native Class layoutAttributesClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UICollectionViewFlowLayout new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * defaults to CGSizeZero - setting a non-zero size enables cells that self-size via -preferredLayoutAttributesFittingAttributes:
     */
    @Generated
    @Selector("estimatedItemSize")
    @ByValue
    public native CGSize estimatedItemSize();

    @Generated
    @Selector("footerReferenceSize")
    @ByValue
    public native CGSize footerReferenceSize();

    @Generated
    @Selector("headerReferenceSize")
    @ByValue
    public native CGSize headerReferenceSize();

    @Generated
    @Selector("init")
    public native UICollectionViewFlowLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewFlowLayout initWithCoder(NSCoder coder);

    @Generated
    @Selector("itemSize")
    @ByValue
    public native CGSize itemSize();

    @Generated
    @Selector("minimumInteritemSpacing")
    @NFloat
    public native double minimumInteritemSpacing();

    @Generated
    @Selector("minimumLineSpacing")
    @NFloat
    public native double minimumLineSpacing();

    /**
     * default is UICollectionViewScrollDirectionVertical
     */
    @Generated
    @Selector("scrollDirection")
    @NInt
    public native long scrollDirection();

    @Generated
    @Selector("sectionFootersPinToVisibleBounds")
    public native boolean sectionFootersPinToVisibleBounds();

    /**
     * Set these properties to YES to get headers that pin to the top of the screen and footers that pin to the bottom while scrolling (similar to UITableView).
     */
    @Generated
    @Selector("sectionHeadersPinToVisibleBounds")
    public native boolean sectionHeadersPinToVisibleBounds();

    @Generated
    @Selector("sectionInset")
    @ByValue
    public native UIEdgeInsets sectionInset();

    /**
     * defaults to CGSizeZero - setting a non-zero size enables cells that self-size via -preferredLayoutAttributesFittingAttributes:
     */
    @Generated
    @Selector("setEstimatedItemSize:")
    public native void setEstimatedItemSize(@ByValue CGSize value);

    @Generated
    @Selector("setFooterReferenceSize:")
    public native void setFooterReferenceSize(@ByValue CGSize value);

    @Generated
    @Selector("setHeaderReferenceSize:")
    public native void setHeaderReferenceSize(@ByValue CGSize value);

    @Generated
    @Selector("setItemSize:")
    public native void setItemSize(@ByValue CGSize value);

    @Generated
    @Selector("setMinimumInteritemSpacing:")
    public native void setMinimumInteritemSpacing(@NFloat double value);

    @Generated
    @Selector("setMinimumLineSpacing:")
    public native void setMinimumLineSpacing(@NFloat double value);

    /**
     * default is UICollectionViewScrollDirectionVertical
     */
    @Generated
    @Selector("setScrollDirection:")
    public native void setScrollDirection(@NInt long value);

    @Generated
    @Selector("setSectionFootersPinToVisibleBounds:")
    public native void setSectionFootersPinToVisibleBounds(boolean value);

    /**
     * Set these properties to YES to get headers that pin to the top of the screen and footers that pin to the bottom while scrolling (similar to UITableView).
     */
    @Generated
    @Selector("setSectionHeadersPinToVisibleBounds:")
    public native void setSectionHeadersPinToVisibleBounds(boolean value);

    @Generated
    @Selector("setSectionInset:")
    public native void setSectionInset(@ByValue UIEdgeInsets value);

    /**
     * The reference boundary that the section insets will be defined as relative to. Defaults to `.fromContentInset`.
     * NOTE: Content inset will always be respected at a minimum. For example, if the sectionInsetReference equals `.fromSafeArea`, but the adjusted content inset is greater that the combination of the safe area and section insets, then section content will be aligned with the content inset instead.
     */
    @Generated
    @Selector("sectionInsetReference")
    @NInt
    public native long sectionInsetReference();

    /**
     * The reference boundary that the section insets will be defined as relative to. Defaults to `.fromContentInset`.
     * NOTE: Content inset will always be respected at a minimum. For example, if the sectionInsetReference equals `.fromSafeArea`, but the adjusted content inset is greater that the combination of the safe area and section insets, then section content will be aligned with the content inset instead.
     */
    @Generated
    @Selector("setSectionInsetReference:")
    public native void setSectionInsetReference(@NInt long value);
}
