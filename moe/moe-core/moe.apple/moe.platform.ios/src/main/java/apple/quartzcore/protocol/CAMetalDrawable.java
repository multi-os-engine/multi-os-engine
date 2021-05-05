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

package apple.quartzcore.protocol;

import apple.metal.protocol.MTLDrawable;
import apple.metal.protocol.MTLTexture;
import apple.quartzcore.CAMetalLayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CAMetalDrawable represents a displayable buffer that vends an object
 * that conforms to the MTLTexture protocol that may be used to create
 * a render target for Metal.
 * 
 * Note: CAMetalLayer maintains an internal pool of textures used for
 * display. In order for a texture to be re-used for a new CAMetalDrawable,
 * any prior CAMetalDrawable must have been deallocated and another
 * CAMetalDrawable presented.
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMetalDrawable")
public interface CAMetalDrawable extends MTLDrawable {
    /**
     * This is the CAMetalLayer responsible for displaying the drawable
     */
    @Generated
    @Selector("layer")
    CAMetalLayer layer();

    /**
     * This is an object that conforms to the MTLTexture protocol and will
     * typically be used to create an MTLRenderTargetDescriptor.
     */
    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture texture();
}
