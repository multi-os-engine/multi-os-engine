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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVQueuedSampleBufferRenderingStatus
 * 
 * These constants are the possible status values for queued sample buffer renderers.
 * [@constant] AVQueuedSampleBufferRenderingStatusUnknown
 * Indicates that the receiver is in a fresh state without any sample buffers enqueued on it.
 * [@constant] AVQueuedSampleBufferRenderingStatusRendering
 * Indicates at least one sample buffer has been enqueued on the receiver.
 * [@constant] AVQueuedSampleBufferRenderingStatusFailed
 * Indicates that the receiver cannot currently enqueue or render sample buffers because of an error.
 * 
 * API-Since: 8.0
 */
@Generated
public final class AVQueuedSampleBufferRenderingStatus {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Rendering = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Failed = 0x0000000000000002L;

    @Generated
    private AVQueuedSampleBufferRenderingStatus() {
    }
}
