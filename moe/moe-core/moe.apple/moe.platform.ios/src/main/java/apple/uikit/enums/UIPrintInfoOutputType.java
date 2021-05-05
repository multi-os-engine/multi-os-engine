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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPrintInfoOutputType {
    /**
     * B&W or color, normal quality output for mixed text, graphics, and images
     */
    @Generated @NInt public static final long General = 0x0000000000000000L;
    /**
     * B&W or color, best quality output for images
     */
    @Generated @NInt public static final long Photo = 0x0000000000000001L;
    /**
     * B&W content only
     */
    @Generated @NInt public static final long Grayscale = 0x0000000000000002L;
    /**
     * B&W only, best quality output for images
     */
    @Generated @NInt public static final long PhotoGrayscale = 0x0000000000000003L;

    @Generated
    private UIPrintInfoOutputType() {
    }
}
