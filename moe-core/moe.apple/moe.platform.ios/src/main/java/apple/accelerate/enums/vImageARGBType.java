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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] vImageARGBType
 * 
 * An encoding of an image format type to be used with RGB <-> Y'CbCr conversions in vImage/Conversions.h
 * 
 * These formats enumerate different vImage ARGB pixel formats.
 */
@Generated
public final class vImageARGBType {
    /**
     * Any 8-bit four channel interleaved buffer [0,255]=[0,1.0]. Does not specify channel order.
     * 
     * API-Since: 8.0
     */
    @Generated public static final int kvImageARGB8888 = 0x00000000;
    /**
     * Any 16-bit unsigned four channel interleaved buffer [0,65535]=[0,1.0]. Does not specify channel order.
     * 
     * API-Since: 8.0
     */
    @Generated public static final int kvImageARGB16U = 0x00000001;
    /**
     * Any 16-bit signed fixedpoint four channel interleaved buffer [0,4096]=[0,1.0]. Does not specify channel order.
     * 
     * API-Since: 8.0
     */
    @Generated public static final int kvImageARGB16Q12 = 0x00000002;

    @Generated
    private vImageARGBType() {
    }
}
