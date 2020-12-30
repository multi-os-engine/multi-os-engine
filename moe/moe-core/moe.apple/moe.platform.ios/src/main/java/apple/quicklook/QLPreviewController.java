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

package apple.quicklook;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quicklook.protocol.QLPreviewControllerDataSource;
import apple.quicklook.protocol.QLPreviewControllerDelegate;
import apple.quicklook.protocol.QLPreviewItem;
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
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLPreviewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected QLPreviewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLPreviewController alloc();

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

    /**
     * Returns YES if QLPreviewController can display this preview item.
     */
    @Generated
    @Selector("canPreviewItem:")
    public static native boolean canPreviewItem(@Mapped(ObjCObjectMapper.class) QLPreviewItem item);

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

    /**
     * The currently previewed item in the preview panel or nil if there is none.
     */
    @Generated
    @Selector("currentPreviewItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native QLPreviewItem currentPreviewItem();

    /**
     * The index of the currently previewed item in the preview panel or NSNotFound if there is none.
     */
    @Generated
    @Selector("currentPreviewItemIndex")
    @NInt
    public native long currentPreviewItemIndex();

    /**
     * The Preview Panel data source.
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native QLPreviewControllerDataSource dataSource();

    /**
     * The Preview Controller delegate.
     * 
     * Should implement the <QLPreviewControllerDelegate> protocol
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native QLPreviewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native QLPreviewController init();

    @Generated
    @Selector("initWithCoder:")
    public native QLPreviewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native QLPreviewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Asks the Preview Controller to recompute the preview of the currently previewed item.
     */
    @Generated
    @Selector("refreshCurrentPreviewItem")
    public native void refreshCurrentPreviewItem();

    /**
     * Asks the Preview Controller to reload its data from its data source.
     * 
     * This method does not refresh the visible item if it has not changed.
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    /**
     * The index of the currently previewed item in the preview panel or NSNotFound if there is none.
     */
    @Generated
    @Selector("setCurrentPreviewItemIndex:")
    public native void setCurrentPreviewItemIndex(@NInt long value);

    /**
     * The Preview Panel data source.
     */
    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Mapped(ObjCObjectMapper.class) QLPreviewControllerDataSource value);

    /**
     * The Preview Panel data source.
     */
    @Generated
    public void setDataSource(@Mapped(ObjCObjectMapper.class) QLPreviewControllerDataSource value) {
        Object __old = dataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The Preview Controller delegate.
     * 
     * Should implement the <QLPreviewControllerDelegate> protocol
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) QLPreviewControllerDelegate value);

    /**
     * The Preview Controller delegate.
     * 
     * Should implement the <QLPreviewControllerDelegate> protocol
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) QLPreviewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
