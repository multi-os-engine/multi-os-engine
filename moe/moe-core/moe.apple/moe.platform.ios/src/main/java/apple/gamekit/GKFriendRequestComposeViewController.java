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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKFriendRequestComposeViewControllerDelegate;
import apple.uikit.UINavigationController;
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
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKFriendRequestComposeViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKFriendRequestComposeViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKFriendRequestComposeViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKFriendRequestComposeViewController allocWithZone(VoidPtr zone);

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

    /**
     * Get the maximum number of recipients permitted
     */
    @Generated
    @Selector("maxNumberOfRecipients")
    @NUInt
    public static native long maxNumberOfRecipients();

    @Generated
    @Owned
    @Selector("new")
    public static native GKFriendRequestComposeViewController new_objc();

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
     * Add recipients to the request.
     * If you don't specify at least one recipient before presenting the view, the recipients field will be made firstResponder, to encourage the user to add some.
     * If you add more than maxNumberOfRecipients recipients, these methods will throw an exception.
     */
    @Generated
    @Selector("addRecipientPlayers:")
    public native void addRecipientPlayers(NSArray<? extends GKPlayer> players);

    @Generated
    @Selector("addRecipientsWithEmailAddresses:")
    public native void addRecipientsWithEmailAddresses(NSArray<String> emailAddresses);

    @Generated
    @Deprecated
    @Selector("addRecipientsWithPlayerIDs:")
    public native void addRecipientsWithPlayerIDs(NSArray<String> playerIDs);

    @Generated
    @Selector("composeViewDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKFriendRequestComposeViewControllerDelegate composeViewDelegate();

    @Generated
    @Selector("init")
    public native GKFriendRequestComposeViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKFriendRequestComposeViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKFriendRequestComposeViewController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKFriendRequestComposeViewController initWithNibNameBundle(String nibNameOrNil,
            NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKFriendRequestComposeViewController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Selector("setComposeViewDelegate:")
    public native void setComposeViewDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) GKFriendRequestComposeViewControllerDelegate value);

    @Generated
    public void setComposeViewDelegate(
            @Mapped(ObjCObjectMapper.class) GKFriendRequestComposeViewControllerDelegate value) {
        Object __old = composeViewDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setComposeViewDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Specify the message sent to the invitee. A default message will be used if you don't specify one.
     */
    @Generated
    @Selector("setMessage:")
    public native void setMessage(String message);
}
