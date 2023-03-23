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

package apple.homekit.protocol;

import apple.homekit.HMAddAccessoryRequest;
import apple.homekit.HMHome;
import apple.homekit.HMHomeManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This delegate receives updates on homes being managed via the home manager.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMHomeManagerDelegate")
public interface HMHomeManagerDelegate {
    /**
     * Informs the delegate when a new home is added.
     * 
     * @param manager Sender of this message.
     * 
     * @param home    New home that was added.
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didAddHome:")
    default void homeManagerDidAddHome(HMHomeManager manager, HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when an existing home is removed.
     * 
     * @param manager Sender of this message.
     * 
     * @param home    Home that was removed.
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didRemoveHome:")
    default void homeManagerDidRemoveHome(HMHomeManager manager, HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when homes configured by the user have been detected by the system.
     * 
     * This delegate method is also invoked to inform an application of significant changes
     * to the home configuration. Applications should use this as a cue to invalidate their
     * current references to HomeKit objects and refresh their views with the new list of homes.
     * 
     * @param manager Sender of this message.
     */
    @Generated
    @IsOptional
    @Selector("homeManagerDidUpdateHomes:")
    default void homeManagerDidUpdateHomes(HMHomeManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate when the primary home is modified.
     * 
     * @param manager Sender of this message.
     */
    @Generated
    @IsOptional
    @Selector("homeManagerDidUpdatePrimaryHome:")
    default void homeManagerDidUpdatePrimaryHome(HMHomeManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate an accessory needs to be added to the home by using one of the
     * HMAccessorySetupPayload factory methods on the request parameter.
     * 
     * @param manager Sender of this message.
     * 
     * @param request Information for the add accessory request.
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didReceiveAddAccessoryRequest:")
    default void homeManagerDidReceiveAddAccessoryRequest(HMHomeManager manager, HMAddAccessoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate a change in authorization status has occurred.
     * 
     * @param manager Sender of this message.
     * @param status  The updated authorization status.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didUpdateAuthorizationStatus:")
    default void homeManagerDidUpdateAuthorizationStatus(HMHomeManager manager, @NUInt long status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
