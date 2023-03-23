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
import apple.cloudkit.CKContainer;
import apple.cloudkit.CKShare;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIActivityItemSource;
import apple.uikit.protocol.UICloudSharingControllerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICloudSharingController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UICloudSharingController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICloudSharingController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICloudSharingController allocWithZone(VoidPtr zone);

    @Deprecated
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
    public static native UICloudSharingController new_objc();

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
     * Returns an activity item source for use with UIActivityViewController.
     * If the activity is selected, delegate methods will be called for the original instance of
     * the sharing controller.
     */
    @Generated
    @Selector("activityItemSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIActivityItemSource activityItemSource();

    /**
     * Restrict the sharing invitation UI to specific types of share permissions. If set, only the specified
     * combinations of permissions are selectable.
     */
    @Generated
    @Selector("availablePermissions")
    @NUInt
    public native long availablePermissions();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICloudSharingControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native UICloudSharingController init();

    @Generated
    @Selector("initWithCoder:")
    public native UICloudSharingController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UICloudSharingController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Use this initializer when you already have an active CKShare that was set up previously.
     */
    @Generated
    @Selector("initWithShare:container:")
    public native UICloudSharingController initWithShareContainer(CKShare share, CKContainer container);

    /**
     * Restrict the sharing invitation UI to specific types of share permissions. If set, only the specified
     * combinations of permissions are selectable.
     */
    @Generated
    @Selector("setAvailablePermissions:")
    public native void setAvailablePermissions(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UICloudSharingControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UICloudSharingControllerDelegate value) {
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
    @Selector("share")
    public native CKShare share();

    /**
     * Use this initializer when you want to share a set of CKRecords but haven't yet saved a CKShare.
     * The preparation handler is called when it is time to save the share to the server.
     * After ensuring the share and record have been saved to the server, invoke the preparationCompletionHandler
     * with either the resulting CKShare, or an NSError if saving failed.
     */
    @Generated
    @Selector("initWithPreparationHandler:")
    public native UICloudSharingController initWithPreparationHandler(
            @ObjCBlock(name = "call_initWithPreparationHandler") Block_initWithPreparationHandler preparationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithPreparationHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_initWithPreparationHandler {
            @Generated
            void call_Block_initWithPreparationHandler(CKShare arg0, CKContainer arg1, NSError arg2);
        }

        @Generated
        void call_initWithPreparationHandler(UICloudSharingController controller,
                @ObjCBlock(name = "call_Block_initWithPreparationHandler") Block_Block_initWithPreparationHandler preparationCompletionHandler);
    }
}
