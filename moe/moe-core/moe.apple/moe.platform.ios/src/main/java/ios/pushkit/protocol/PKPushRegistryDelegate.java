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

package ios.pushkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.pushkit.PKPushCredentials;
import ios.pushkit.PKPushPayload;
import ios.pushkit.PKPushRegistry;

@Generated
@Library("PushKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPushRegistryDelegate")
public interface PKPushRegistryDelegate {
	/**
	 * pushRegistry:didInvalidatePushTokenForType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PushKit/Reference/PKPushRegistryDelegate_Protocol/index.html#//apple_ref/occ/intfm/PKPushRegistryDelegate/pushRegistry:didInvalidatePushTokenForType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("pushRegistry:didInvalidatePushTokenForType:")
	default void pushRegistryDidInvalidatePushTokenForType(
			PKPushRegistry registry, String type) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * pushRegistry:didReceiveIncomingPushWithPayload:forType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PushKit/Reference/PKPushRegistryDelegate_Protocol/index.html#//apple_ref/occ/intfm/PKPushRegistryDelegate/pushRegistry:didReceiveIncomingPushWithPayload:forType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushRegistry:didReceiveIncomingPushWithPayload:forType:")
	void pushRegistryDidReceiveIncomingPushWithPayloadForType(
			PKPushRegistry registry, PKPushPayload payload, String type);

	/**
	 * pushRegistry:didUpdatePushCredentials:forType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PushKit/Reference/PKPushRegistryDelegate_Protocol/index.html#//apple_ref/occ/intfm/PKPushRegistryDelegate/pushRegistry:didUpdatePushCredentials:forType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushRegistry:didUpdatePushCredentials:forType:")
	void pushRegistryDidUpdatePushCredentialsForType(
			PKPushRegistry registry, PKPushCredentials credentials, String type);
}
