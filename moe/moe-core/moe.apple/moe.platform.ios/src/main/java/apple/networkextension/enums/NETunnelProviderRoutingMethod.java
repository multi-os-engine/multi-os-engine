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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NETunnelProviderRoutingMethod
 * @abstract Network traffic routing methods.
 */
@Generated
public final class NETunnelProviderRoutingMethod {
    /**
     * @const NETunnelProviderRoutingMethodDestinationIP Route network traffic to the tunnel based on destination IP
     */
    @Generated @NInt public static final long DestinationIP = 0x0000000000000001L;
    /**
     * @const NETunnelProviderRoutingMethodSourceApplication Route network traffic to the tunnel based on source application
     */
    @Generated @NInt public static final long SourceApplication = 0x0000000000000002L;

    @Generated
    private NETunnelProviderRoutingMethod() {
    }
}
