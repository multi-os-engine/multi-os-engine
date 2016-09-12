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

package ios.messageui;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;
import ios.uikit.UINavigationController;
import ios.uikit.UIViewController;
import ios.messageui.protocol.MFMessageComposeViewControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MessageUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MFMessageComposeViewController extends UINavigationController {
	static {
		NatJ.register();
	}

	@Generated
	protected MFMessageComposeViewController(Pointer peer) {
		super(peer);
	}

	/**
	 * addAttachmentData:typeIdentifier:filename:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instm/MFMessageComposeViewController/addAttachmentData:typeIdentifier:filename:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAttachmentData:typeIdentifier:filename:")
	public native boolean addAttachmentDataTypeIdentifierFilename(
			NSData attachmentData, String uti, String filename);

	/**
	 * addAttachmentURL:withAlternateFilename:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instm/MFMessageComposeViewController/addAttachmentURL:withAlternateFilename:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAttachmentURL:withAlternateFilename:")
	public native boolean addAttachmentURLWithAlternateFilename(
			NSURL attachmentURL, String alternateFilename);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MFMessageComposeViewController alloc();

	/**
	 * attachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/attachments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attachments")
	public native NSArray<? extends NSDictionary<?, ?>> attachments();

	/**
	 * body</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/body">iOS Dev Center</a>
	 */
	@Generated
	@Selector("body")
	public native String body();

	/**
	 * canSendAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/clm/MFMessageComposeViewController/canSendAttachments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canSendAttachments")
	public static native boolean canSendAttachments();

	/**
	 * canSendSubject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/clm/MFMessageComposeViewController/canSendSubject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canSendSubject")
	public static native boolean canSendSubject();

	/**
	 * canSendText</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/clm/MFMessageComposeViewController/canSendText">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canSendText")
	public static native boolean canSendText();

	/**
	 * disableUserAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instm/MFMessageComposeViewController/disableUserAttachments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableUserAttachments")
	public native void disableUserAttachments();

	@Generated
	@Selector("init")
	public native MFMessageComposeViewController init();

	@Generated
	@Selector("initWithNavigationBarClass:toolbarClass:")
	public native MFMessageComposeViewController initWithNavigationBarClassToolbarClass(
			Class navigationBarClass, Class toolbarClass);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MFMessageComposeViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithRootViewController:")
	public native MFMessageComposeViewController initWithRootViewController(
			UIViewController rootViewController);

	/**
	 * isSupportedAttachmentUTI:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/clm/MFMessageComposeViewController/isSupportedAttachmentUTI:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSupportedAttachmentUTI:")
	public static native boolean isSupportedAttachmentUTI(String uti);

	/**
	 * messageComposeDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/messageComposeDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("messageComposeDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MFMessageComposeViewControllerDelegate messageComposeDelegate();

	/**
	 * recipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/recipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recipients")
	public native NSArray<String> recipients();

	/**
	 * body</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/body">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBody:")
	public native void setBody(String value);

	/**
	 * messageComposeDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/messageComposeDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMessageComposeDelegate:")
	public native void setMessageComposeDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MFMessageComposeViewControllerDelegate value);

	/**
	 * messageComposeDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/messageComposeDelegate">iOS Dev Center</a>
	 */
	@Generated
	public void setMessageComposeDelegate(
			@Mapped(ObjCObjectMapper.class) MFMessageComposeViewControllerDelegate value) {
		Object __old = messageComposeDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setMessageComposeDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * recipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/recipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecipients:")
	public native void setRecipients(NSArray<String> value);

	/**
	 * subject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/subject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSubject:")
	public native void setSubject(String value);

	/**
	 * subject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MessageUI/Reference/MFMessageComposeViewController_class/index.html#//apple_ref/occ/instp/MFMessageComposeViewController/subject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subject")
	public native String subject();

	@Generated
	@Selector("initWithCoder:")
	public native MFMessageComposeViewController initWithCoder(NSCoder aDecoder);

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
