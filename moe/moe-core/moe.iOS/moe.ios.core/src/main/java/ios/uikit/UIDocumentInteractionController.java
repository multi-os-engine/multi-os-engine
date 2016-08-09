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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSURL;
import ios.uikit.protocol.UIActionSheetDelegate;
import ios.uikit.protocol.UIDocumentInteractionControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentInteractionController extends NSObject implements
		UIActionSheetDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected UIDocumentInteractionController(Pointer peer) {
		super(peer);
	}

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URL")
	public native NSURL URL();

	/**
	 * UTI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/UTI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("UTI")
	public native String UTI();

	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:clickedButtonAtIndex:")
	public native void actionSheetClickedButtonAtIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:didDismissWithButtonIndex:")
	public native void actionSheetDidDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheet:willDismissWithButtonIndex:")
	public native void actionSheetWillDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Deprecated
	@Generated
	@IsOptional
	@Selector("actionSheetCancel:")
	public native void actionSheetCancel(UIActionSheet actionSheet);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIDocumentInteractionController alloc();

	/**
	 * annotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/annotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("annotation")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object annotation();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIDocumentInteractionControllerDelegate delegate();

	@Deprecated
	@Generated
	@IsOptional
	@Selector("didPresentActionSheet:")
	public native void didPresentActionSheet(UIActionSheet actionSheet);

	/**
	 * dismissMenuAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/dismissMenuAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissMenuAnimated:")
	public native void dismissMenuAnimated(boolean animated);

	/**
	 * dismissPreviewAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/dismissPreviewAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissPreviewAnimated:")
	public native void dismissPreviewAnimated(boolean animated);

	/**
	 * gestureRecognizers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/gestureRecognizers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gestureRecognizers")
	public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

	/**
	 * icons</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/icons">iOS Dev Center</a>
	 */
	@Generated
	@Selector("icons")
	public native NSArray<? extends UIImage> icons();

	@Generated
	@Selector("init")
	public native UIDocumentInteractionController init();

	/**
	 * interactionControllerWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/clm/UIDocumentInteractionController/interactionControllerWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("interactionControllerWithURL:")
	public static native UIDocumentInteractionController interactionControllerWithURL(
			NSURL url);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * presentOpenInMenuFromBarButtonItem:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/presentOpenInMenuFromBarButtonItem:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentOpenInMenuFromBarButtonItem:animated:")
	public native boolean presentOpenInMenuFromBarButtonItemAnimated(
			UIBarButtonItem item, boolean animated);

	/**
	 * presentOpenInMenuFromRect:inView:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/presentOpenInMenuFromRect:inView:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentOpenInMenuFromRect:inView:animated:")
	public native boolean presentOpenInMenuFromRectInViewAnimated(
			@ByValue CGRect rect, UIView view, boolean animated);

	/**
	 * presentOptionsMenuFromBarButtonItem:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/presentOptionsMenuFromBarButtonItem:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentOptionsMenuFromBarButtonItem:animated:")
	public native boolean presentOptionsMenuFromBarButtonItemAnimated(
			UIBarButtonItem item, boolean animated);

	/**
	 * presentOptionsMenuFromRect:inView:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/presentOptionsMenuFromRect:inView:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentOptionsMenuFromRect:inView:animated:")
	public native boolean presentOptionsMenuFromRectInViewAnimated(
			@ByValue CGRect rect, UIView view, boolean animated);

	/**
	 * presentPreviewAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instm/UIDocumentInteractionController/presentPreviewAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentPreviewAnimated:")
	public native boolean presentPreviewAnimated(boolean animated);

	/**
	 * annotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/annotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnnotation:")
	public native void setAnnotation(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UIDocumentInteractionControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UIDocumentInteractionControllerDelegate value) {
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
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	/**
	 * UTI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDocumentInteractionController_class/index.html#//apple_ref/occ/instp/UIDocumentInteractionController/UTI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUTI:")
	public native void setUTI(String value);

	@Deprecated
	@Generated
	@IsOptional
	@Selector("willPresentActionSheet:")
	public native void willPresentActionSheet(UIActionSheet actionSheet);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

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
