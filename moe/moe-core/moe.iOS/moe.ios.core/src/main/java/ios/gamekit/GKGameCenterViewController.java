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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UINavigationController;
import ios.uikit.UIViewController;
import ios.gamekit.protocol.GKGameCenterControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGameCenterViewController extends UINavigationController {
	static {
		NatJ.register();
	}

	@Generated
	protected GKGameCenterViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKGameCenterViewController alloc();

	/**
	 * gameCenterDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/gameCenterDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gameCenterDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GKGameCenterControllerDelegate gameCenterDelegate();

	@Generated
	@Selector("init")
	public native GKGameCenterViewController init();

	@Generated
	@Selector("initWithNavigationBarClass:toolbarClass:")
	public native GKGameCenterViewController initWithNavigationBarClassToolbarClass(
			Class navigationBarClass, Class toolbarClass);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native GKGameCenterViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithRootViewController:")
	public native GKGameCenterViewController initWithRootViewController(
			UIViewController rootViewController);

	/**
	 * leaderboardCategory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardCategory">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("leaderboardCategory")
	public native String leaderboardCategory();

	/**
	 * leaderboardIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leaderboardIdentifier")
	public native String leaderboardIdentifier();

	/**
	 * leaderboardTimeScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardTimeScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leaderboardTimeScope")
	@NInt
	public native long leaderboardTimeScope();

	/**
	 * gameCenterDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/gameCenterDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGameCenterDelegate:")
	public native void setGameCenterDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GKGameCenterControllerDelegate value);

	/**
	 * gameCenterDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/gameCenterDelegate">iOS Dev Center</a>
	 */
	@Generated
	public void setGameCenterDelegate(
			@Mapped(ObjCObjectMapper.class) GKGameCenterControllerDelegate value) {
		Object __old = gameCenterDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setGameCenterDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * leaderboardCategory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardCategory">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setLeaderboardCategory:")
	public native void setLeaderboardCategory(String value);

	/**
	 * leaderboardIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLeaderboardIdentifier:")
	public native void setLeaderboardIdentifier(String value);

	/**
	 * leaderboardTimeScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/leaderboardTimeScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLeaderboardTimeScope:")
	public native void setLeaderboardTimeScope(@NInt long value);

	/**
	 * viewState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/viewState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewState:")
	public native void setViewState(@NInt long value);

	/**
	 * viewState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKGameCenterViewController_Ref/index.html#//apple_ref/occ/instp/GKGameCenterViewController/viewState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewState")
	@NInt
	public native long viewState();

	@Generated
	@Selector("initWithCoder:")
	public native GKGameCenterViewController initWithCoder(NSCoder aDecoder);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
