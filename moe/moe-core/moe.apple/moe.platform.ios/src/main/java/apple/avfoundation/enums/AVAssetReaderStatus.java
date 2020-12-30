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
 * [@enum] AVAssetReaderStatus
 * 
 * These constants are returned by the AVAssetReader status property to indicate whether it can successfully read samples from its asset.
 * 
 * [@constant]	 AVAssetReaderStatusUnknown
 * Indicates that the status of the asset reader is not currently known.
 * [@constant]	 AVAssetReaderStatusReading
 * Indicates that the asset reader is successfully reading samples from its asset.
 * [@constant]	 AVAssetReaderStatusCompleted
 * Indicates that the asset reader has successfully read all of the samples in its time range.
 * [@constant]	 AVAssetReaderStatusFailed
 * Indicates that the asset reader can no longer read samples from its asset because of an error. The error is described by the value of the asset reader's error property.
 * [@constant]	 AVAssetReaderStatusCancelled
 * Indicates that the asset reader can no longer read samples because reading was canceled with the cancelReading method.
 */
@Generated
public final class AVAssetReaderStatus {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Reading = 0x0000000000000001L;
    @Generated @NInt public static final long Completed = 0x0000000000000002L;
    @Generated @NInt public static final long Failed = 0x0000000000000003L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;

    @Generated
    private AVAssetReaderStatus() {
    }
}
