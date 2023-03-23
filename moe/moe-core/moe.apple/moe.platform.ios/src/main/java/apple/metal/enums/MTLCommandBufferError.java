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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLCommandBufferError
 * 
 * Error codes that can be found in MTLCommandBuffer.error
 * 
 * [@constant] MTLCommandBufferErrorInternal
 * An internal error that doesn't fit into the other categories. The actual low level error code is encoded in the local
 * description.
 * 
 * [@constant] MTLCommandBufferErrorTimeout
 * Execution of this command buffer took too long, execution of this command was interrupted and aborted.
 * 
 * [@constant] MTLCommandBufferErrorPageFault
 * Execution of this command buffer generated an unserviceable GPU page fault. This can caused by buffer read write
 * attribute mismatch or out of boundary access.
 * 
 * [@constant] MTLCommandBufferErrorAccessRevoked
 * Access to this device has been revoked because this client has been responsible for too many timeouts or hangs.
 * 
 * [@constant] MTLCommandBufferErrorNotPermitted
 * This process does not have access to use this device.
 * 
 * [@constant] MTLCommandBufferErrorOutOfMemory
 * Insufficient memory was available to execute this command buffer.
 * 
 * [@constant] MTLCommandBufferErrorInvalidResource
 * The command buffer referenced an invalid resource. This is most commonly caused when the caller deletes a resource
 * before executing a command buffer that refers to it.
 * 
 * [@constant] MTLCommandBufferErrorMemoryless
 * One or more internal resources limits reached that prevent using memoryless render pass attachments. See error string
 * for more detail.
 * 
 * [@constant] MTLCommandBufferErrorDeviceRemoved
 * The device was physically removed before the command could finish execution
 * 
 * [@constant] MTLCommandBufferErrorStackOverflow
 * Execution of the command buffer was stopped due to Stack Overflow Exception. [MTLComputePipelineDescriptor
 * maxCallStackDepth] setting needs to be checked.
 * 
 * API-Since: 8.0
 */
@Generated
public final class MTLCommandBufferError {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Internal = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Timeout = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PageFault = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long Blacklisted = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long NotPermitted = 0x0000000000000007L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long OutOfMemory = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long InvalidResource = 0x0000000000000009L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Memoryless = 0x000000000000000AL;

    @Generated
    private MTLCommandBufferError() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long AccessRevoked = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long StackOverflow = 0x000000000000000CL;
}
