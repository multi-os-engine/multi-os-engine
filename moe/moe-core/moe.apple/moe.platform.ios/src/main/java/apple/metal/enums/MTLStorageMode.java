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
 * [@enum] MTLStorageMode
 * <p>
 * Describes location and CPU mapping of MTLTexture.
 * [@constant] MTLStorageModeShared
 * In this mode, CPU and device will nominally both use the same underlying memory when accessing the contents of the texture resource.
 * However, coherency is only guaranteed at command buffer boundaries to minimize the required flushing of CPU and GPU caches.
 * This is the default storage mode for iOS Textures.
 * <p>
 * [@constant] MTLStorageModeManaged
 * This mode relaxes the coherency requirements and requires that the developer make explicit requests to maintain
 * coherency between a CPU and GPU version of the texture resource.  In order for CPU to access up to date GPU results,
 * first, a blit synchronizations must be completed (see synchronize methods of MTLBlitCommandEncoder).
 * Blit overhead is only incurred if GPU has modified the resource.
 * This is the default storage mode for OS X Textures.
 * <p>
 * [@constant] MTLStorageModePrivate
 * This mode allows the texture resource data to be kept entirely to GPU (or driver) private memory that will never be accessed by the CPU directly, so no
 * conherency of any kind must be maintained.
 * <p>
 * [@constant] MTLStorageModeMemoryless
 * This mode allows creation of resources that do not have a GPU or CPU memory backing, but do have on-chip storage for TBDR
 * devices. The contents of the on-chip storage is undefined and does not persist, but its configuration is controlled by the
 * MTLTexture descriptor. Textures created with MTLStorageModeMemoryless dont have an IOAccelResource at any point in their
 * lifetime. The only way to populate such resource is to perform rendering operations on it. Blit operations are disallowed.
 */
@Generated
public final class MTLStorageMode {
    @Generated @NUInt public static final long Shared = 0x0000000000000000L;
    @Generated @NUInt public static final long Private = 0x0000000000000002L;
    @Generated @NUInt public static final long Memoryless = 0x0000000000000003L;

    @Generated
    private MTLStorageMode() {
    }
}
