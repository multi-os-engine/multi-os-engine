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

package apple.externalaccessory.protocol;

import apple.externalaccessory.EAWiFiUnconfiguredAccessory;
import apple.externalaccessory.EAWiFiUnconfiguredAccessoryBrowser;
import apple.foundation.NSSet;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] EAWiFiUnconfiguredAccessoryBrowserDelegate
 * <p>
 * The delegate of a EAWiFiUnconfiguredAccessoryBrowser object must adopt the
 * EAWiFiUnconfiguredAccessoryBrowserDelegate protocol. The required
 * callbacks keep the delegate informed of the state of the search and configuration processes.
 */
@Generated
@Library("ExternalAccessory")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EAWiFiUnconfiguredAccessoryBrowserDelegate")
public interface EAWiFiUnconfiguredAccessoryBrowserDelegate {
    /**
     * accessoryBrowser:didFindUnconfiguredAccessories:
     * <p>
     * Invoked whenever the EAWiFiUnconfiguredAccessoryBrowser has found new unconfigured accessories that match
     * the filter predicate defined when starting the search.
     *
     * @param browser     The EAWiFiUnconfiguredAccessoryBrowser instance generating the event.
     * @param accessories The set of EAWiFiUnconfiguredAccessory objects that have been found since the last update.
     */
    @Generated
    @Selector("accessoryBrowser:didFindUnconfiguredAccessories:")
    void accessoryBrowserDidFindUnconfiguredAccessories(EAWiFiUnconfiguredAccessoryBrowser browser,
            NSSet<? extends EAWiFiUnconfiguredAccessory> accessories);

    /**
     * accessoryBrowser:didFinishConfiguringAccessory:withStatus:
     * <p>
     * Invoked whenever the EAWiFiUnconfiguredAccessoryBrowser has completed configuring the selected
     * EAWiFiUnconfiguredAccessory.
     *
     * @param browser   The EAWiFiUnconfiguredAccessoryBrowser instance generating the event.
     * @param accessory The EAWiFiUnconfiguredAccessory whose configuration process has completed.
     * @param status    The status of the configuration process that has completed.
     */
    @Generated
    @Selector("accessoryBrowser:didFinishConfiguringAccessory:withStatus:")
    void accessoryBrowserDidFinishConfiguringAccessoryWithStatus(EAWiFiUnconfiguredAccessoryBrowser browser,
            EAWiFiUnconfiguredAccessory accessory, @NInt long status);

    /**
     * accessoryBrowser:didRemoveUnconfiguredAccessories:
     * <p>
     * Invoked whenever the EAWiFiUnconfiguredAccessoryBrowser has removed unconfigured accessories from the scan
     * results
     * that match the filter predicate defined when starting the search.
     *
     * @param browser     The EAWiFiUnconfiguredAccessoryBrowser instance generating the event.
     * @param accessories The set of EAWiFiUnconfiguredAccessory objects that have been removed from the scan results
     *                    since the last update.
     */
    @Generated
    @Selector("accessoryBrowser:didRemoveUnconfiguredAccessories:")
    void accessoryBrowserDidRemoveUnconfiguredAccessories(EAWiFiUnconfiguredAccessoryBrowser browser,
            NSSet<? extends EAWiFiUnconfiguredAccessory> accessories);

    /**
     * accessoryBrowser:didUpdateState:
     * <p>
     * Invoked whenever the EAWiFiUnconfiguredAccessoryBrowser's state has changed.
     *
     * @param browser The EAWiFiUnconfiguredAccessoryBrowser instance generating the event.
     * @param state   The current state of the EAWiFiUnconfiguredAccessoryBrowser.
     */
    @Generated
    @Selector("accessoryBrowser:didUpdateState:")
    void accessoryBrowserDidUpdateState(EAWiFiUnconfiguredAccessoryBrowser browser, @NInt long state);
}
