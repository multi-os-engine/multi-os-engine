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

import apple.homekit.HMHome;
import apple.homekit.HMHomeManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMHomeManagerDelegate")
public interface HMHomeManagerDelegate {
    /**
     * homeManager:didAddHome:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeManagerDelegate/homeManager:didAddHome:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didAddHome:")
    default void homeManagerDidAddHome(HMHomeManager manager, HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * homeManager:didRemoveHome:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeManagerDelegate/homeManager:didRemoveHome:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("homeManager:didRemoveHome:")
    default void homeManagerDidRemoveHome(HMHomeManager manager, HMHome home) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * homeManagerDidUpdateHomes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeManagerDelegate/homeManagerDidUpdateHomes:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("homeManagerDidUpdateHomes:")
    default void homeManagerDidUpdateHomes(HMHomeManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * homeManagerDidUpdatePrimaryHome:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/HMHomeManagerDelegate/homeManagerDidUpdatePrimaryHome:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("homeManagerDidUpdatePrimaryHome:")
    default void homeManagerDidUpdatePrimaryHome(HMHomeManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }
}
