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

package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.MTLTextureDescriptor;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLBuffer
 * 
 * A typeless allocation accessible by both the CPU and the GPU (MTLDevice) or by only the GPU when the storage mode is
 * MTLResourceStorageModePrivate.
 * 
 * Unlike in OpenGL and OpenCL, access to buffers is not synchronized. The caller may use the CPU to modify the data at
 * any time
 * but is also responsible for ensuring synchronization and coherency.
 * 
 * The contents become undefined if both the CPU and GPU write to the same buffer without a synchronizing action between
 * those writes.
 * This is true even when the regions written do not overlap.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBuffer")
public interface MTLBuffer extends MTLResource {
    /**
     * addDebugMarker:range:
     * 
     * Adds a marker to a specific range in the buffer.
     * When inspecting a buffer in the GPU debugging tools the marker will be shown.
     * 
     * @param marker A label used for the marker.
     * @param range  The range of bytes the marker is using.
     * 
     *               API-Since: 10.0
     */
    @Generated
    @Selector("addDebugMarker:range:")
    void addDebugMarkerRange(@NotNull String marker, @ByValue NSRange range);

    /**
     * contents
     * 
     * Returns the data pointer of this buffer's shared copy.
     */
    @NotNull
    @Generated
    @Selector("contents")
    VoidPtr contents();

    /**
     * [@property] length
     * 
     * The length of the buffer in bytes.
     */
    @Generated
    @Selector("length")
    @NUInt
    long length();

    /**
     * newTextureWithDescriptor:offset:bytesPerRow:
     * 
     * Create a 2D texture or texture buffer that shares storage with this buffer.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("newTextureWithDescriptor:offset:bytesPerRow:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorOffsetBytesPerRow(@NotNull MTLTextureDescriptor descriptor, @NUInt long offset,
            @NUInt long bytesPerRow);

    /**
     * removeAllDebugMarkers
     * 
     * Removes all debug markers from a buffer.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("removeAllDebugMarkers")
    void removeAllDebugMarkers();

    /**
     * [@property] gpuAddress
     * 
     * Represents the GPU virtual address of a buffer resource
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuAddress")
    long gpuAddress();
}
