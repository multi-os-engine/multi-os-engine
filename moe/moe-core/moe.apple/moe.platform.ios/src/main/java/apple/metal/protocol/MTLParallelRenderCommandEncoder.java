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

/**
 * [@protocol] MTLParallelRenderCommandEncoder
 * <p>
 * The MTLParallelRenderCommandEncoder protocol is designed to allow a single render to texture operation to be
 * efficiently (and safely) broken up across multiple threads.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLParallelRenderCommandEncoder")
public interface MTLParallelRenderCommandEncoder extends MTLCommandEncoder {
    /**
     * renderCommandEncoder
     * <p>
     * Return a new autoreleased object that conforms to <MTLRenderCommandEncoder> that may be used to encode on a
     * different thread.
     */
    @Generated
    @Selector("renderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderCommandEncoder renderCommandEncoder();

    /**
     * setColorStoreAction:atIndex:
     * <p>
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreAction:atIndex: must be used to finalize the store action before endEncoding is called.
     *
     * @param storeAction          The desired store action for the given color attachment. This may be set to any value
     *                             other than MTLStoreActionUnknown.
     * @param colorAttachmentIndex The index of the color attachment
     */
    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    /**
     * setDepthStoreAction:
     * <p>
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreAction: must be used to finalize the store action before endEncoding is called.
     */
    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    /**
     * setStencilStoreAction:
     * <p>
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreAction: must be used to finalize the store action before endEncoding is called.
     */
    @Generated
    @Selector("setStencilStoreAction:")
    void setStencilStoreAction(@NUInt long storeAction);

    /**
     * setColorStoreActionOptions:atIndex:
     * <p>
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreActionOptions:atIndex: may be used to finalize the store action options before endEncoding is
     * called.
     *
     * @param storeActionOptions   The desired store action options for the given color attachment.
     * @param colorAttachmentIndex The index of the color attachment
     */
    @Generated
    @Selector("setColorStoreActionOptions:atIndex:")
    void setColorStoreActionOptionsAtIndex(@NUInt long storeActionOptions, @NUInt long colorAttachmentIndex);

    /**
     * setDepthStoreActionOptions:
     * <p>
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     */
    @Generated
    @Selector("setDepthStoreActionOptions:")
    void setDepthStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * setStencilStoreActionOptions:
     * <p>
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     */
    @Generated
    @Selector("setStencilStoreActionOptions:")
    void setStencilStoreActionOptions(@NUInt long storeActionOptions);
}
