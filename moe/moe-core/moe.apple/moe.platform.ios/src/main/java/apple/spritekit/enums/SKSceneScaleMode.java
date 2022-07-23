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

package apple.spritekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SKSceneScaleMode {
    /**
     * Scale the SKScene to fill the entire SKView.
     */
    @Generated @NInt public static final long Fill = 0x0000000000000000L;
    /**
     * Scale the SKScene to fill the SKView while preserving the scene's aspect ratio. Some cropping may occur if the
     * view has a different aspect ratio.
     */
    @Generated @NInt public static final long AspectFill = 0x0000000000000001L;
    /**
     * Scale the SKScene to fit within the SKView while preserving the scene's aspect ratio. Some letterboxing may occur
     * if the view has a different aspect ratio.
     */
    @Generated @NInt public static final long AspectFit = 0x0000000000000002L;
    /**
     * Modify the SKScene's actual size to exactly match the SKView.
     */
    @Generated @NInt public static final long ResizeFill = 0x0000000000000003L;

    @Generated
    private SKSceneScaleMode() {
    }
}
