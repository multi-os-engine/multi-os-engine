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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] MTLDrawable
 * 
 * All "drawable" objects (such as those coming from CAMetalLayer) are expected to conform to this protocol
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLDrawable")
public interface MTLDrawable {
    /**
     * Present this drawable as soon as possible
     */
    @Generated
    @Selector("present")
    void present();

    /**
     * Present this drawable at the given host time
     */
    @Generated
    @Selector("presentAtTime:")
    void presentAtTime(double presentationTime);

    /**
     * addPresentedHandler
     * 
     * Add a block to be called when this drawable is presented on screen.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("addPresentedHandler:")
    void addPresentedHandler(@NotNull @ObjCBlock(name = "call_addPresentedHandler") Block_addPresentedHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPresentedHandler {
        @Generated
        void call_addPresentedHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * [@property] drawableID
     * 
     * The monotonically incremented ID for all MTLDrawable objects created from the same CAMetalLayer object.
     * 
     * The value starts from 0.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("drawableID")
    @NUInt
    long drawableID();

    /**
     * presentAfterMinimumDuration
     * 
     * Present this drawable while setting a minimum duration in seconds before allowing this drawable to appear on the
     * display.
     * 
     * @param duration Duration in seconds before this drawable is allowed to appear on the display
     * 
     *                 API-Since: 10.3
     */
    @Generated
    @Selector("presentAfterMinimumDuration:")
    void presentAfterMinimumDuration(double duration);

    /**
     * [@property] presentedTime
     * 
     * The host time that this drawable was presented on screen.
     * 
     * Returns 0 if a frame has not been presented or has been skipped.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("presentedTime")
    double presentedTime();
}
