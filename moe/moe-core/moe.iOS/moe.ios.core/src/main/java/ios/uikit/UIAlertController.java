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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAlertController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected UIAlertController(Pointer peer) {
		super(peer);
	}

	/**
	 * actions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/actions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("actions")
	public native NSArray<? extends UIAlertAction> actions();

	/**
	 * addAction:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instm/UIAlertController/addAction:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAction:")
	public native void addAction(UIAlertAction action);

	/**
	 * addTextFieldWithConfigurationHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instm/UIAlertController/addTextFieldWithConfigurationHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addTextFieldWithConfigurationHandler:")
	public native void addTextFieldWithConfigurationHandler(
			@ObjCBlock(name = "call_addTextFieldWithConfigurationHandler") Block_addTextFieldWithConfigurationHandler configurationHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addTextFieldWithConfigurationHandler {
		@Generated
		void call_addTextFieldWithConfigurationHandler(UITextField arg0);
	}

	/**
	 * alertControllerWithTitle:message:preferredStyle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/clm/UIAlertController/alertControllerWithTitle:message:preferredStyle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alertControllerWithTitle:message:preferredStyle:")
	public static native UIAlertController alertControllerWithTitleMessagePreferredStyle(
			String title, String message, @NInt long preferredStyle);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIAlertController alloc();

	@Generated
	@Selector("init")
	public native UIAlertController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UIAlertController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("message")
	public native String message();

	/**
	 * preferredStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/preferredStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredStyle")
	@NInt
	public native long preferredStyle();

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMessage:")
	public native void setMessage(String value);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	/**
	 * textFields</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/textFields">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textFields")
	public native NSArray<? extends UITextField> textFields();

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("initWithCoder:")
	public native UIAlertController initWithCoder(NSCoder aDecoder);

	/**
	 * preferredAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/preferredAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredAction")
	public native UIAlertAction preferredAction();

	/**
	 * preferredAction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAlertController_class/index.html#//apple_ref/occ/instp/UIAlertController/preferredAction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredAction:")
	public native void setPreferredAction(UIAlertAction value);

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
	public static native void load_objc();

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
	public static native long version();
}
