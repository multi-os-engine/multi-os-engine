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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLParallelRenderCommandEncoder
 * 
 * The MTLParallelRenderCommandEncoder protocol is designed to allow a single render to texture operation to be
 * efficiently (and safely) broken up across multiple threads.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLParallelRenderCommandEncoder")
public interface MTLParallelRenderCommandEncoder extends MTLCommandEncoder {
    /**
     * renderCommandEncoder
     * 
     * Return a new autoreleased object that conforms to <MTLRenderCommandEncoder> that may be used to encode on a
     * different thread.
     */
    @Nullable
    @Generated
    @Selector("renderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderCommandEncoder renderCommandEncoder();

    /**
     * setColorStoreAction:atIndex:
     * 
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreAction:atIndex: must be used to finalize the store action before endEncoding is called.
     * 
     * @param storeAction          The desired store action for the given color attachment. This may be set to any value
     *                             other than MTLStoreActionUnknown.
     * @param colorAttachmentIndex The index of the color attachment
     * 
     *                             API-Since: 10.0
     */
    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    /**
     * setDepthStoreAction:
     * 
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreAction: must be used to finalize the store action before endEncoding is called.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    /**
     * setStencilStoreAction:
     * 
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreAction: must be used to finalize the store action before endEncoding is called.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setStencilStoreAction:")
    void setStencilStoreAction(@NUInt long storeAction);

    /**
     * setColorStoreActionOptions:atIndex:
     * 
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreActionOptions:atIndex: may be used to finalize the store action options before endEncoding is
     * called.
     * 
     * @param storeActionOptions   The desired store action options for the given color attachment.
     * @param colorAttachmentIndex The index of the color attachment
     * 
     *                             API-Since: 11.0
     */
    @Generated
    @Selector("setColorStoreActionOptions:atIndex:")
    void setColorStoreActionOptionsAtIndex(@NUInt long storeActionOptions, @NUInt long colorAttachmentIndex);

    /**
     * setDepthStoreActionOptions:
     * 
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDepthStoreActionOptions:")
    void setDepthStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * setStencilStoreActionOptions:
     * 
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setStencilStoreActionOptions:")
    void setStencilStoreActionOptions(@NUInt long storeActionOptions);
}
