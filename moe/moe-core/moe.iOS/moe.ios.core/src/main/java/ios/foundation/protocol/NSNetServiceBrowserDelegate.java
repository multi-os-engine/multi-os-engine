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

package ios.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSDictionary;
import ios.foundation.NSNetService;
import ios.foundation.NSNetServiceBrowser;
import ios.foundation.NSNumber;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSNetServiceBrowserDelegate")
public interface NSNetServiceBrowserDelegate {
	/**
	 * netServiceBrowser:didFindDomain:moreComing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowser:didFindDomain:moreComing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didFindDomain:moreComing:")
	default void netServiceBrowserDidFindDomainMoreComing(
			NSNetServiceBrowser browser, String domainString,
			boolean moreComing) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowser:didFindService:moreComing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowser:didFindService:moreComing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didFindService:moreComing:")
	default void netServiceBrowserDidFindServiceMoreComing(
			NSNetServiceBrowser browser, NSNetService service,
			boolean moreComing) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowser:didNotSearch:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowser:didNotSearch:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didNotSearch:")
	default void netServiceBrowserDidNotSearch(
			NSNetServiceBrowser browser, NSDictionary<String, ? extends NSNumber> errorDict) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowser:didRemoveDomain:moreComing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowser:didRemoveDomain:moreComing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didRemoveDomain:moreComing:")
	default void netServiceBrowserDidRemoveDomainMoreComing(
			NSNetServiceBrowser browser, String domainString,
			boolean moreComing) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowser:didRemoveService:moreComing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowser:didRemoveService:moreComing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didRemoveService:moreComing:")
	default void netServiceBrowserDidRemoveServiceMoreComing(
			NSNetServiceBrowser browser, NSNetService service,
			boolean moreComing) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowserDidStopSearch:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowserDidStopSearch:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowserDidStopSearch:")
	default void netServiceBrowserDidStopSearch(
			NSNetServiceBrowser browser) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * netServiceBrowserWillSearch:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceBrowserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceBrowserDelegate/netServiceBrowserWillSearch:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("netServiceBrowserWillSearch:")
	default void netServiceBrowserWillSearch(
			NSNetServiceBrowser browser) {
		throw new java.lang.UnsupportedOperationException();
	}
}
