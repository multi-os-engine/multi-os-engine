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

package ios.gamekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UINavigationController;
import ios.uikit.UIViewController;
import ios.gamekit.protocol.GKFriendRequestComposeViewControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKFriendRequestComposeViewController extends
		UINavigationController {
	static {
		NatJ.register();
	}

	@Generated
	protected GKFriendRequestComposeViewController(Pointer peer) {
		super(peer);
	}

	/**
	 * addRecipientPlayers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instm/GKFriendRequestComposeViewController/addRecipientPlayers:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addRecipientPlayers:")
	public native void addRecipientPlayers(NSArray<? extends GKPlayer> players);

	/**
	 * addRecipientsWithEmailAddresses:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instm/GKFriendRequestComposeViewController/addRecipientsWithEmailAddresses:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addRecipientsWithEmailAddresses:")
	public native void addRecipientsWithEmailAddresses(NSArray<String> emailAddresses);

	/**
	 * addRecipientsWithPlayerIDs:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instm/GKFriendRequestComposeViewController/addRecipientsWithPlayerIDs:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("addRecipientsWithPlayerIDs:")
	public native void addRecipientsWithPlayerIDs(NSArray<String> playerIDs);

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKFriendRequestComposeViewController alloc();

	/**
	 * composeViewDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instp/GKFriendRequestComposeViewController/composeViewDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("composeViewDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GKFriendRequestComposeViewControllerDelegate composeViewDelegate();

	@Generated
	@Selector("init")
	public native GKFriendRequestComposeViewController init();

	@Generated
	@Selector("initWithNavigationBarClass:toolbarClass:")
	public native GKFriendRequestComposeViewController initWithNavigationBarClassToolbarClass(
			Class navigationBarClass, Class toolbarClass);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native GKFriendRequestComposeViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithRootViewController:")
	public native GKFriendRequestComposeViewController initWithRootViewController(
			UIViewController rootViewController);

	/**
	 * maxNumberOfRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/clm/GKFriendRequestComposeViewController/maxNumberOfRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxNumberOfRecipients")
	@NUInt
	public static native long maxNumberOfRecipients();

	/**
	 * composeViewDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instp/GKFriendRequestComposeViewController/composeViewDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setComposeViewDelegate:")
	public native void setComposeViewDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GKFriendRequestComposeViewControllerDelegate value);

	/**
	 * composeViewDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instp/GKFriendRequestComposeViewController/composeViewDelegate">iOS Dev Center</a>
	 */
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
	 * setMessage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKFriendRequestComposeViewController_Ref/index.html#//apple_ref/occ/instm/GKFriendRequestComposeViewController/setMessage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMessage:")
	public native void setMessage(String message);

	@Generated
	@Selector("initWithCoder:")
	public native GKFriendRequestComposeViewController initWithCoder(NSCoder aDecoder);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
