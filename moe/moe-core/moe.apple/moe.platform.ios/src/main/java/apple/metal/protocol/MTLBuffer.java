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

/**
 * [@protocol] MTLBuffer
 * <p>
 * A typeless allocation accessible by both the CPU and the GPU (MTLDevice) or by only the GPU when the storage mode is
 * MTLResourceStorageModePrivate.
 * <p>
 * Unlike in OpenGL and OpenCL, access to buffers is not synchronized. The caller may use the CPU to modify the data at
 * any time
 * but is also responsible for ensuring synchronization and coherency.
 * <p>
 * The contents become undefined if both the CPU and GPU write to the same buffer without a synchronizing action between
 * those writes.
 * This is true even when the regions written do not overlap.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBuffer")
public interface MTLBuffer extends MTLResource {
    /**
     * addDebugMarker:range:
     * <p>
     * Adds a marker to a specific range in the buffer.
     * When inspecting a buffer in the GPU debugging tools the marker will be shown.
     *
     * @param marker A label used for the marker.
     * @param range  The range of bytes the marker is using.
     */
    @Generated
    @Selector("addDebugMarker:range:")
    void addDebugMarkerRange(String marker, @ByValue NSRange range);

    /**
     * contents
     * <p>
     * Returns the data pointer of this buffer's shared copy.
     */
    @Generated
    @Selector("contents")
    VoidPtr contents();

    /**
     * [@property] length
     * <p>
     * The length of the buffer in bytes.
     */
    @Generated
    @Selector("length")
    @NUInt
    long length();

    /**
     * newTextureWithDescriptor:offset:bytesPerRow:
     * <p>
     * Create a 2D texture or texture buffer that shares storage with this buffer.
     */
    @Generated
    @Selector("newTextureWithDescriptor:offset:bytesPerRow:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorOffsetBytesPerRow(MTLTextureDescriptor descriptor, @NUInt long offset,
            @NUInt long bytesPerRow);

    /**
     * removeAllDebugMarkers
     * <p>
     * Removes all debug markers from a buffer.
     */
    @Generated
    @Selector("removeAllDebugMarkers")
    void removeAllDebugMarkers();
}
