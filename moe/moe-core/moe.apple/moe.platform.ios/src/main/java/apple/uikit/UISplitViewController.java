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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UISplitViewControllerDelegate;
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
public class UISplitViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UISplitViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISplitViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISplitViewControllerDelegate delegate();

    @Generated
    @Selector("displayMode")
    @NInt
    public native long displayMode();

    @Generated
    @Selector("displayModeButtonItem")
    public native UIBarButtonItem displayModeButtonItem();

    @Generated
    @Selector("init")
    public native UISplitViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UISplitViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UISplitViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("isCollapsed")
    public native boolean isCollapsed();

    @Generated
    @Selector("maximumPrimaryColumnWidth")
    @NFloat
    public native double maximumPrimaryColumnWidth();

    @Generated
    @Selector("minimumPrimaryColumnWidth")
    @NFloat
    public native double minimumPrimaryColumnWidth();

    @Generated
    @Selector("preferredDisplayMode")
    @NInt
    public native long preferredDisplayMode();

    @Generated
    @Selector("preferredPrimaryColumnWidthFraction")
    @NFloat
    public native double preferredPrimaryColumnWidthFraction();

    @Generated
    @Selector("presentsWithGesture")
    public native boolean presentsWithGesture();

    @Generated
    @Selector("primaryColumnWidth")
    @NFloat
    public native double primaryColumnWidth();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value) {
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
    @Selector("setMaximumPrimaryColumnWidth:")
    public native void setMaximumPrimaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setMinimumPrimaryColumnWidth:")
    public native void setMinimumPrimaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setPreferredDisplayMode:")
    public native void setPreferredDisplayMode(@NInt long value);

    @Generated
    @Selector("setPreferredPrimaryColumnWidthFraction:")
    public native void setPreferredPrimaryColumnWidthFraction(@NFloat double value);

    @Generated
    @Selector("setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean value);

    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(NSArray<? extends UIViewController> value);

    @Generated
    @Selector("showDetailViewController:sender:")
    public native void showDetailViewControllerSender(UIViewController vc,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    @Generated
    @Selector("primaryEdge")
    @NInt
    public native long primaryEdge();

    @Generated
    @Selector("setPrimaryEdge:")
    public native void setPrimaryEdge(@NInt long value);

    @Generated
    @Selector("primaryBackgroundStyle")
    @NInt
    public native long primaryBackgroundStyle();

    @Generated
    @Selector("setPrimaryBackgroundStyle:")
    public native void setPrimaryBackgroundStyle(@NInt long value);

    @Generated
    @Selector("hideColumn:")
    public native void hideColumn(@NInt long column);

    @Generated
    @Selector("initWithStyle:")
    public native UISplitViewController initWithStyle(@NInt long style);

    @Generated
    @Selector("maximumSupplementaryColumnWidth")
    @NFloat
    public native double maximumSupplementaryColumnWidth();

    @Generated
    @Selector("minimumSupplementaryColumnWidth")
    @NFloat
    public native double minimumSupplementaryColumnWidth();

    @Generated
    @Selector("preferredPrimaryColumnWidth")
    @NFloat
    public native double preferredPrimaryColumnWidth();

    @Generated
    @Selector("preferredSplitBehavior")
    @NInt
    public native long preferredSplitBehavior();

    @Generated
    @Selector("preferredSupplementaryColumnWidth")
    @NFloat
    public native double preferredSupplementaryColumnWidth();

    @Generated
    @Selector("preferredSupplementaryColumnWidthFraction")
    @NFloat
    public native double preferredSupplementaryColumnWidthFraction();

    @Generated
    @Selector("setMaximumSupplementaryColumnWidth:")
    public native void setMaximumSupplementaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setMinimumSupplementaryColumnWidth:")
    public native void setMinimumSupplementaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setPreferredPrimaryColumnWidth:")
    public native void setPreferredPrimaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setPreferredSplitBehavior:")
    public native void setPreferredSplitBehavior(@NInt long value);

    @Generated
    @Selector("setPreferredSupplementaryColumnWidth:")
    public native void setPreferredSupplementaryColumnWidth(@NFloat double value);

    @Generated
    @Selector("setPreferredSupplementaryColumnWidthFraction:")
    public native void setPreferredSupplementaryColumnWidthFraction(@NFloat double value);

    @Generated
    @Selector("setShowsSecondaryOnlyButton:")
    public native void setShowsSecondaryOnlyButton(boolean value);

    @Generated
    @Selector("setViewController:forColumn:")
    public native void setViewControllerForColumn(UIViewController vc, @NInt long column);

    @Generated
    @Selector("showColumn:")
    public native void showColumn(@NInt long column);

    @Generated
    @Selector("showsSecondaryOnlyButton")
    public native boolean showsSecondaryOnlyButton();

    @Generated
    @Selector("splitBehavior")
    @NInt
    public native long splitBehavior();

    @Generated
    @Selector("style")
    @NInt
    public native long style();

    @Generated
    @Selector("supplementaryColumnWidth")
    @NFloat
    public native double supplementaryColumnWidth();

    @Generated
    @Selector("viewControllerForColumn:")
    public native UIViewController viewControllerForColumn(@NInt long column);
}
