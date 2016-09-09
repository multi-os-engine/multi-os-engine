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

package ios.externalaccessory.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.externalaccessory.EAWiFiUnconfiguredAccessory;
import ios.externalaccessory.EAWiFiUnconfiguredAccessoryBrowser;
import ios.foundation.NSSet;

@Generated
@Library("ExternalAccessory")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EAWiFiUnconfiguredAccessoryBrowserDelegate")
public interface EAWiFiUnconfiguredAccessoryBrowserDelegate {
	/**
	 * accessoryBrowser:didFindUnconfiguredAccessories:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAWiFiUnconfiguredAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/EAWiFiUnconfiguredAccessoryBrowserDelegate/accessoryBrowser:didFindUnconfiguredAccessories:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accessoryBrowser:didFindUnconfiguredAccessories:")
	void accessoryBrowserDidFindUnconfiguredAccessories(
			EAWiFiUnconfiguredAccessoryBrowser browser, NSSet<? extends EAWiFiUnconfiguredAccessory> accessories);

	/**
	 * accessoryBrowser:didFinishConfiguringAccessory:withStatus:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAWiFiUnconfiguredAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/EAWiFiUnconfiguredAccessoryBrowserDelegate/accessoryBrowser:didFinishConfiguringAccessory:withStatus:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accessoryBrowser:didFinishConfiguringAccessory:withStatus:")
	void accessoryBrowserDidFinishConfiguringAccessoryWithStatus(
			EAWiFiUnconfiguredAccessoryBrowser browser,
			EAWiFiUnconfiguredAccessory accessory, @NInt long status);

	/**
	 * accessoryBrowser:didRemoveUnconfiguredAccessories:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAWiFiUnconfiguredAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/EAWiFiUnconfiguredAccessoryBrowserDelegate/accessoryBrowser:didRemoveUnconfiguredAccessories:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accessoryBrowser:didRemoveUnconfiguredAccessories:")
	void accessoryBrowserDidRemoveUnconfiguredAccessories(
			EAWiFiUnconfiguredAccessoryBrowser browser, NSSet<? extends EAWiFiUnconfiguredAccessory> accessories);

	/**
	 * accessoryBrowser:didUpdateState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAWiFiUnconfiguredAccessoryBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/EAWiFiUnconfiguredAccessoryBrowserDelegate/accessoryBrowser:didUpdateState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accessoryBrowser:didUpdateState:")
	void accessoryBrowserDidUpdateState(
			EAWiFiUnconfiguredAccessoryBrowser browser, @NInt long state);
}
