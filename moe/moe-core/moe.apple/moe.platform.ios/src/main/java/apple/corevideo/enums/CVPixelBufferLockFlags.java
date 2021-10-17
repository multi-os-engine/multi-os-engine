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

package apple.corevideo.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] Pixel Buffer Locking Flags
 * <p>
 * Flags to pass to CVPixelBufferLockBaseAddress() / CVPixelBufferUnlockBaseAddress()
 * [@constant] kCVPixelBufferLock_ReadOnly
 * If you are not going to modify the data while you hold the lock, you should set this flag
 * to avoid potentially invalidating any existing caches of the buffer contents.  This flag
 * should be passed both to the lock and unlock functions.  Non-symmetrical usage of this
 * flag will result in undefined behavior.
 */
@Generated
public final class CVPixelBufferLockFlags {
    @Generated public static final long kCVPixelBufferLock_ReadOnly = 0x0000000000000001L;

    @Generated
    private CVPixelBufferLockFlags() {
    }
}
