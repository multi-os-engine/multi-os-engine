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

package apple.metalkit.protocol;

import apple.coregraphics.struct.CGSize;
import apple.metalkit.MTKView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * MTKViewDelegate
 * 
 * Allows an object to render into the view and respond to resize events
 */
@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTKViewDelegate")
public interface MTKViewDelegate {
    /**
     * drawInMTKView:
     * 
     * Called on the delegate when it is asked to render into the view
     * 
     * Called on the delegate when it is asked to render into the view
     */
    @Generated
    @Selector("drawInMTKView:")
    void drawInMTKView(MTKView view);

    /**
     * mtkView:drawableSizeWillChange:
     * 
     * Called whenever the drawableSize of the view will change
     * 
     * Delegate can recompute view and projection matricies or regenerate any buffers to be compatible with the new view size or resolution
     * 
     * @param view MTKView which called this method
     * @param size New drawable size in pixels
     */
    @Generated
    @Selector("mtkView:drawableSizeWillChange:")
    void mtkViewDrawableSizeWillChange(MTKView view, @ByValue CGSize size);
}
