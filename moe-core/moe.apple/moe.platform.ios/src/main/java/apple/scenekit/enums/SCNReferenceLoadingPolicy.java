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

package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SCNReferenceLoadingPolicy
 * 
 * Controls whenever to load the reference node.
 * 
 * When the load policy is set to SCNReferenceLoadingPolicyImmediately, the reference is loaded immediately when the
 * SCNReferenceNode is unarchived.
 * When the load policy is set to SCNReferenceLoadingPolicyOnDemand the reference is never loaded until "load" is
 * explicitly invoked.
 * 
 * API-Since: 9.0
 */
@Generated
public final class SCNReferenceLoadingPolicy {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Immediate = 0x0000000000000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long OnDemand = 0x0000000000000001L;

    @Generated
    private SCNReferenceLoadingPolicy() {
    }
}
