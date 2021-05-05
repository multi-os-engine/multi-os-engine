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
 * [@enum] AVAssetWriterStatus
 * 
 * These constants are returned by the AVAssetWriter status property to indicate whether it can successfully write samples to its output file.
 * 
 * [@constant]	 AVAssetWriterStatusUnknown
 * Indicates that the status of the asset writer is not currently known.
 * [@constant]	 AVAssetWriterStatusWriting
 * Indicates that the asset writer is successfully writing samples to its output file.
 * [@constant]	 AVAssetWriterStatusCompleted
 * Indicates that the asset writer has successfully written all samples following a call to finishWriting.
 * [@constant]	 AVAssetWriterStatusFailed
 * Indicates that the asset writer can no longer write samples to its output file because of an error. The error is described by the value of the asset writer's error property.
 * [@constant]	 AVAssetWriterStatusCancelled
 * Indicates that the asset writer can no longer write samples because writing was canceled with the cancelWriting method.
 */
@Generated
public final class AVAssetWriterStatus {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Writing = 0x0000000000000001L;
    @Generated @NInt public static final long Completed = 0x0000000000000002L;
    @Generated @NInt public static final long Failed = 0x0000000000000003L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;

    @Generated
    private AVAssetWriterStatus() {
    }
}
