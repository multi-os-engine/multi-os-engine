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
import org.moe.natj.general.ann.NUInt;

/**
 * The tile set type is used to describe how the tiles will be arranged in a tile map.
 * 
 * [@enum] SKTileSetTypeGrid Specifies that the tiles will be axis-alligned rectangles that are placed in rows and columns at right angles to one another. This is the default type.
 * [@enum] SKTileSetTypeIsometric Specifies that the tiles will be rectangles that are rotated and scaled to give the appearance of 3/4 perspective.
 * [@enum] SKTileSetTypeHexagonalFlat Specifies that the tiles will be flat bottomed hexagons.
 * [@enum] SKTileSetTypeHexagonalPointy Specifies that the tiles will be "pointy" bottomed hexagons.
 */
@Generated
public final class SKTileSetType {
    @Generated @NUInt public static final long Grid = 0x0000000000000000L;
    @Generated @NUInt public static final long Isometric = 0x0000000000000001L;
    @Generated @NUInt public static final long HexagonalFlat = 0x0000000000000002L;
    @Generated @NUInt public static final long HexagonalPointy = 0x0000000000000003L;

    @Generated
    private SKTileSetType() {
    }
}
