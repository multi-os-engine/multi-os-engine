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

package apple.gameplaykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Adjusts how graph nodes are created when you triangulate a GKMeshGrapk
 * 
 * [@enum] GKMeshGraphTriangulationModeVertices Graph nodes will be made at all triangle vertices
 * [@enum] GKMeshGraphTriangulationModeCenters Graph nodes will be made at all triangle centers
 * [@enum] GKMeshGraphTriangulationModeEdgeMidpoints Graph nodes will be made at midpoint of all triangle edges
 */
@Generated
public final class GKMeshGraphTriangulationMode {
    @Generated @NUInt public static final long Vertices = 0x0000000000000001L;
    @Generated @NUInt public static final long Centers = 0x0000000000000002L;
    @Generated @NUInt public static final long EdgeMidpoints = 0x0000000000000004L;

    @Generated
    private GKMeshGraphTriangulationMode() {
    }
}
