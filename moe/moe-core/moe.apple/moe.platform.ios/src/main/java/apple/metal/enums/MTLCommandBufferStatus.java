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
 * @enum MTLCommandBufferStatus
 * 
 * @abstract MTLCommandBufferStatus reports the current stage in the lifetime of MTLCommandBuffer, as it proceeds to enqueued, committed, scheduled, and completed.
 * 
 * @constant MTLCommandBufferStatusNotEnqueued
 * The command buffer has not been enqueued yet.
 * 
 * @constant MTLCommandBufferStatusEnqueued
 * This command buffer is enqueued, but not committed.
 * 
 * @constant MTLCommandBufferStatusCommitted
 * Commited to its command queue, but not yet scheduled for execution.
 * 
 * @constant MTLCommandBufferStatusScheduled
 * All dependencies have been resolved and the command buffer has been scheduled for execution.
 * 
 * @constant MTLCommandBufferStatusCompleted
 * The command buffer has finished executing successfully: any blocks set with -addCompletedHandler: may now be called.
 * 
 * @constant MTLCommandBufferStatusError
 * Execution of the command buffer was aborted due to an error during execution.  Check -error for more information.
 */
@Generated
public final class MTLCommandBufferStatus {
    @Generated @NUInt public static final long NotEnqueued = 0x0000000000000000L;
    @Generated @NUInt public static final long Enqueued = 0x0000000000000001L;
    @Generated @NUInt public static final long Committed = 0x0000000000000002L;
    @Generated @NUInt public static final long Scheduled = 0x0000000000000003L;
    @Generated @NUInt public static final long Completed = 0x0000000000000004L;
    @Generated @NUInt public static final long Error = 0x0000000000000005L;

    @Generated
    private MTLCommandBufferStatus() {
    }
}
