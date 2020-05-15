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

package apple.coreimage.protocol;

import apple.coregraphics.opaque.IOSurfaceRef;
import apple.coregraphics.struct.CGRect;
import apple.corevideo.opaque.CVBufferRef;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLTexture;
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

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CIImageProcessorOutput")
public interface CIImageProcessorOutput {
    @Generated
    @Selector("baseAddress")
    VoidPtr baseAddress();

    @Generated
    @Selector("bytesPerRow")
    @NUInt
    long bytesPerRow();

    @Generated
    @Selector("format")
    int format();

    @Generated
    @Selector("metalCommandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer metalCommandBuffer();

    @Generated
    @Selector("metalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture metalTexture();

    @Generated
    @Selector("pixelBuffer")
    CVBufferRef pixelBuffer();

    @Generated
    @Selector("region")
    @ByValue
    CGRect region();

    @Generated
    @Selector("surface")
    IOSurfaceRef surface();
}
