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

package apple.foundation.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.NSNetService;
import apple.foundation.NSNetServiceBrowser;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSNetServiceBrowserDelegate")
public interface NSNetServiceBrowserDelegate {
    /**
     * Sent to the NSNetServiceBrowser instance's delegate for each domain discovered. If there are more domains,
     * moreComing will be YES. If for some reason handling discovered domains requires significant processing,
     * accumulating domains until moreComing is NO and then doing the processing in bulk fashion may be desirable.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowser:didFindDomain:moreComing:")
    default void netServiceBrowserDidFindDomainMoreComing(NSNetServiceBrowser browser, String domainString,
            boolean moreComing) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate for each service discovered. If there are more services,
     * moreComing will be YES. If for some reason handling discovered services requires significant processing,
     * accumulating services until moreComing is NO and then doing the processing in bulk fashion may be desirable.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowser:didFindService:moreComing:")
    default void netServiceBrowserDidFindServiceMoreComing(NSNetServiceBrowser browser, NSNetService service,
            boolean moreComing) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate when an error in searching for domains or services has
     * occurred. The error dictionary will contain two key/value pairs representing the error domain and code (see the
     * NSNetServicesError enumeration above for error code constants). It is possible for an error to occur after a
     * search has been started successfully.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowser:didNotSearch:")
    default void netServiceBrowserDidNotSearch(NSNetServiceBrowser browser,
            NSDictionary<String, ? extends NSNumber> errorDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate when a previously discovered domain is no longer available.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowser:didRemoveDomain:moreComing:")
    default void netServiceBrowserDidRemoveDomainMoreComing(NSNetServiceBrowser browser, String domainString,
            boolean moreComing) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate when a previously discovered service is no longer published.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowser:didRemoveService:moreComing:")
    default void netServiceBrowserDidRemoveServiceMoreComing(NSNetServiceBrowser browser, NSNetService service,
            boolean moreComing) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate when the instance's previous running search request has
     * stopped.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowserDidStopSearch:")
    default void netServiceBrowserDidStopSearch(NSNetServiceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetServiceBrowser instance's delegate before the instance begins a search. The delegate will not
     * receive this message if the instance is unable to begin a search. Instead, the delegate will receive the
     * -netServiceBrowser:didNotSearch: message.
     */
    @Generated
    @IsOptional
    @Selector("netServiceBrowserWillSearch:")
    default void netServiceBrowserWillSearch(NSNetServiceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }
}
