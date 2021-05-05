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
 * The adjacency mask is used to specify which neighboring tiles need to be filled in for a rule to go into effect.
 */
@Generated
public final class SKTileAdjacencyMask {
    /**
     * The above neighboring tile
     */
    @Generated @NUInt public static final long AdjacencyUp = 0x0000000000000001L;
    /**
     * The neighboring tile to the upper right
     */
    @Generated @NUInt public static final long AdjacencyUpperRight = 0x0000000000000002L;
    /**
     * The neighboring tile to the right
     */
    @Generated @NUInt public static final long AdjacencyRight = 0x0000000000000004L;
    /**
     * The neighboring tile to the lower right
     */
    @Generated @NUInt public static final long AdjacencyLowerRight = 0x0000000000000008L;
    /**
     * The below neighboring tile
     */
    @Generated @NUInt public static final long AdjacencyDown = 0x0000000000000010L;
    /**
     * The neighboring tile to the lower left
     */
    @Generated @NUInt public static final long AdjacencyLowerLeft = 0x0000000000000020L;
    /**
     * The neighboring tile to the left
     */
    @Generated @NUInt public static final long AdjacencyLeft = 0x0000000000000040L;
    /**
     * The neighboring tile to the upper left
     */
    @Generated @NUInt public static final long AdjacencyUpperLeft = 0x0000000000000080L;
    @Generated @NUInt public static final long AdjacencyAll = 0x00000000000000FFL;
    @Generated @NUInt public static final long HexFlatAdjacencyUp = 0x0000000000000001L;
    @Generated @NUInt public static final long HexFlatAdjacencyUpperRight = 0x0000000000000002L;
    @Generated @NUInt public static final long HexFlatAdjacencyLowerRight = 0x0000000000000004L;
    @Generated @NUInt public static final long HexFlatAdjacencyDown = 0x0000000000000008L;
    @Generated @NUInt public static final long HexFlatAdjacencyLowerLeft = 0x0000000000000010L;
    @Generated @NUInt public static final long HexFlatAdjacencyUpperLeft = 0x0000000000000020L;
    @Generated @NUInt public static final long HexFlatAdjacencyAll = 0x000000000000003FL;
    @Generated @NUInt public static final long HexPointyAdjacencyUpperLeft = 0x0000000000000001L;
    @Generated @NUInt public static final long HexPointyAdjacencyUpperRight = 0x0000000000000002L;
    @Generated @NUInt public static final long HexPointyAdjacencyRight = 0x0000000000000004L;
    @Generated @NUInt public static final long HexPointyAdjacencyLowerRight = 0x0000000000000008L;
    @Generated @NUInt public static final long HexPointyAdjacencyLowerLeft = 0x0000000000000010L;
    @Generated @NUInt public static final long HexPointyAdjacencyLeft = 0x0000000000000020L;
    @Generated @NUInt public static final long HexPointyAdjacencyAdd = 0x000000000000003FL;
    /**
     * Pre-defined values for an upwards-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyUpEdge = 0x000000000000007CL;
    /**
     * Pre-defined values for an upper right-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyUpperRightEdge = 0x0000000000000070L;
    /**
     * Pre-defined values for a right-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyRightEdge = 0x00000000000000F1L;
    /**
     * Pre-defined values for a lower right-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyLowerRightEdge = 0x00000000000000C1L;
    /**
     * Pre-defined values for a downwards-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyDownEdge = 0x00000000000000C7L;
    /**
     * Pre-defined values for a lower left-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyLowerLeftEdge = 0x0000000000000007L;
    /**
     * Pre-defined values for a left-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyLeftEdge = 0x000000000000001FL;
    /**
     * Pre-defined values for a upper left-facing edge tile.
     */
    @Generated @NUInt public static final long AdjacencyUpperLeftEdge = 0x000000000000001CL;
    /**
     * Pre-defined values for an upper right-facing corner tile.
     */
    @Generated @NUInt public static final long AdjacencyUpperRightCorner = 0x00000000000000DFL;
    /**
     * Pre-defined values for a lower right-facing corner tile.
     */
    @Generated @NUInt public static final long AdjacencyLowerRightCorner = 0x000000000000007FL;
    /**
     * Pre-defined values for a lower left-facing corner tile.
     */
    @Generated @NUInt public static final long AdjacencyLowerLeftCorner = 0x00000000000000FDL;
    /**
     * Pre-defined values for an upper left-facing corner tile.
     */
    @Generated @NUInt public static final long AdjacencyUpperLeftCorner = 0x00000000000000F7L;

    @Generated
    private SKTileAdjacencyMask() {
    }
}
