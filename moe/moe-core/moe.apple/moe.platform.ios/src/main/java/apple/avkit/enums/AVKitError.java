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

package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@constant]	AVKitErrorUnknown
 * Unknown error.
 * [@constant]	AVKitErrorPictureInPictureStartFailed
 * Failed to start Picture in Picture.
 */
@Generated
public final class AVKitError {
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFC18L;
    @Generated @NInt public static final long PictureInPictureStartFailed = 0xFFFFFFFFFFFFFC17L;

    @Generated
    private AVKitError() {
    }
}
