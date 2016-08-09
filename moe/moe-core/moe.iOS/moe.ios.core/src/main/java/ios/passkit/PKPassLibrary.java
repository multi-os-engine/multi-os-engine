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

package ios.passkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSError;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPassLibrary extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected PKPassLibrary(Pointer peer) {
		super(peer);
	}

	/**
	 * activatePaymentPass:withActivationCode:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/activatePaymentPass:withActivationCode:completion:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("activatePaymentPass:withActivationCode:completion:")
	public native void activatePaymentPassWithActivationCodeCompletion(
			PKPaymentPass paymentPass,
			String activationCode,
			@ObjCBlock(name = "call_activatePaymentPassWithActivationCodeCompletion") Block_activatePaymentPassWithActivationCodeCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_activatePaymentPassWithActivationCodeCompletion {
		@Generated
		void call_activatePaymentPassWithActivationCodeCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * activatePaymentPass:withActivationData:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/activatePaymentPass:withActivationData:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activatePaymentPass:withActivationData:completion:")
	public native void activatePaymentPassWithActivationDataCompletion(
			PKPaymentPass paymentPass,
			NSData activationData,
			@ObjCBlock(name = "call_activatePaymentPassWithActivationDataCompletion") Block_activatePaymentPassWithActivationDataCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_activatePaymentPassWithActivationDataCompletion {
		@Generated
		void call_activatePaymentPassWithActivationDataCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * addPasses:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/addPasses:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPasses:withCompletionHandler:")
	public native void addPassesWithCompletionHandler(
			NSArray<? extends PKPass> passes,
			@ObjCBlock(name = "call_addPassesWithCompletionHandler") Block_addPassesWithCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addPassesWithCompletionHandler {
		@Generated
		void call_addPassesWithCompletionHandler(@NInt long arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native PKPassLibrary alloc();

	/**
	 * containsPass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/containsPass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsPass:")
	public native boolean containsPass(PKPass pass);

	@Generated
	@Selector("init")
	public native PKPassLibrary init();

	/**
	 * isPassLibraryAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/clm/PKPassLibrary/isPassLibraryAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPassLibraryAvailable")
	public static native boolean isPassLibraryAvailable();

	/**
	 * isPaymentPassActivationAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/clm/PKPassLibrary/isPaymentPassActivationAvailable">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("isPaymentPassActivationAvailable")
	public static native boolean isPaymentPassActivationAvailable_static();

	/**
	 * openPaymentSetup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/openPaymentSetup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("openPaymentSetup")
	public native void openPaymentSetup();

	/**
	 * passWithPassTypeIdentifier:serialNumber:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/passWithPassTypeIdentifier:serialNumber:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("passWithPassTypeIdentifier:serialNumber:")
	public native PKPass passWithPassTypeIdentifierSerialNumber(
			String identifier, String serialNumber);

	/**
	 * passes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/passes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("passes")
	public native NSArray<? extends PKPass> passes();

	/**
	 * passesOfType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/passesOfType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("passesOfType:")
	public native NSArray<? extends PKPass> passesOfType(@NUInt long passType);

	/**
	 * removePass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/removePass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removePass:")
	public native void removePass(PKPass pass);

	/**
	 * replacePassWithPass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/replacePassWithPass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replacePassWithPass:")
	public native boolean replacePassWithPass(PKPass pass);

	/**
	 * canAddPaymentPassWithPrimaryAccountIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/canAddPaymentPassWithPrimaryAccountIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canAddPaymentPassWithPrimaryAccountIdentifier:")
	public native boolean canAddPaymentPassWithPrimaryAccountIdentifier(String primaryAccountIdentifier);

	/**
	 * endAutomaticPassPresentationSuppressionWithRequestToken:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/clm/PKPassLibrary/endAutomaticPassPresentationSuppressionWithRequestToken:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endAutomaticPassPresentationSuppressionWithRequestToken:")
	public static native void endAutomaticPassPresentationSuppressionWithRequestToken(@NUInt long requestToken);

	/**
	 * isPaymentPassActivationAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/isPaymentPassActivationAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPaymentPassActivationAvailable")
	public native boolean isPaymentPassActivationAvailable();

	/**
	 * isSuppressingAutomaticPassPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/clm/PKPassLibrary/isSuppressingAutomaticPassPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSuppressingAutomaticPassPresentation")
	public static native boolean isSuppressingAutomaticPassPresentation();

	/**
	 * remotePaymentPasses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/instm/PKPassLibrary/remotePaymentPasses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("remotePaymentPasses")
	public native NSArray<? extends PKPaymentPass> remotePaymentPasses();

	/**
	 * requestAutomaticPassPresentationSuppressionWithResponseHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPassLibrary_Ref/index.html#//apple_ref/occ/clm/PKPassLibrary/requestAutomaticPassPresentationSuppressionWithResponseHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAutomaticPassPresentationSuppressionWithResponseHandler:")
	@NUInt
	public static native long requestAutomaticPassPresentationSuppressionWithResponseHandler(
			@ObjCBlock(name = "call_requestAutomaticPassPresentationSuppressionWithResponseHandler") Block_requestAutomaticPassPresentationSuppressionWithResponseHandler responseHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAutomaticPassPresentationSuppressionWithResponseHandler {
		@Generated
		void call_requestAutomaticPassPresentationSuppressionWithResponseHandler(@NUInt long arg0);
	}

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
