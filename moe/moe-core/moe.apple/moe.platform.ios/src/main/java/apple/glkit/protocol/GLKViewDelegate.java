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

package apple.glkit.protocol;

import apple.glkit.GLKView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;

@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GLKViewDelegate")
public interface GLKViewDelegate {
    /**
     * Required method for implementing GLKViewDelegate. This draw method variant should be used when not subclassing
     * GLKView.
     * This method will not be called if the GLKView object has been subclassed and implements
     * -(void)drawRect:(CGRect)rect.
     */
    @Generated
    @Selector("glkView:drawInRect:")
    void glkViewDrawInRect(GLKView view, @ByValue CGRect rect);
}
