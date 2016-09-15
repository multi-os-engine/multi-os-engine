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

package apple.mediaplayer;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPMediaPickerControllerDelegate;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaPickerController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaPickerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaPickerController alloc();

    /**
     * allowsPickingMultipleItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/allowsPickingMultipleItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPMediaPickerControllerDelegate delegate();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instm/MPMediaPickerController/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native MPMediaPickerController init();

    /**
     * initWithMediaTypes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instm/MPMediaPickerController/initWithMediaTypes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithMediaTypes:")
    public native MPMediaPickerController initWithMediaTypes(@NUInt long mediaTypes);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MPMediaPickerController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * mediaTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/mediaTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("mediaTypes")
    @NUInt
    public native long mediaTypes();

    /**
     * prompt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/prompt">iOS Dev Center</a>
     */
    @Generated
    @Selector("prompt")
    public native String prompt();

    /**
     * allowsPickingMultipleItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/allowsPickingMultipleItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MPMediaPickerControllerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) MPMediaPickerControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * prompt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/prompt">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(String value);

    /**
     * showsCloudItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/showsCloudItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShowsCloudItems:")
    public native void setShowsCloudItems(boolean value);

    /**
     * showsCloudItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPickerController_ClassReference/index.html#//apple_ref/occ/instp/MPMediaPickerController/showsCloudItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("showsCloudItems")
    public native boolean showsCloudItems();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaPickerController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("setShowsItemsWithProtectedAssets:")
    public native void setShowsItemsWithProtectedAssets(boolean value);

    @Generated
    @Selector("showsItemsWithProtectedAssets")
    public native boolean showsItemsWithProtectedAssets();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
