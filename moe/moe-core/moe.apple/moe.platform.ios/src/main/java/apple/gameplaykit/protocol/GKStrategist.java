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

package apple.gameplaykit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKStrategist")
public interface GKStrategist {
    @Nullable
    @Generated
    @Selector("bestMoveForActivePlayer")
    @MappedReturn(ObjCObjectMapper.class)
    GKGameModelUpdate bestMoveForActivePlayer();

    /**
     * The game model that we wish to select updates for.
     */
    @Nullable
    @Generated
    @Selector("gameModel")
    @MappedReturn(ObjCObjectMapper.class)
    GKGameModel gameModel();

    /**
     * A random source to use when breaking ties between equally-strong moves when calling bestMoveForPlayer
     * or when selecting a random move when randomMoveForPlayer is called. If set to nil, bestMoveForPlayer
     * and randomMoveForPlayer will simply return the first best move available.
     */
    @Nullable
    @Generated
    @Selector("randomSource")
    @MappedReturn(ObjCObjectMapper.class)
    GKRandom randomSource();

    /**
     * The game model that we wish to select updates for.
     */
    @Generated
    @Selector("setGameModel:")
    void setGameModel(@Nullable @Mapped(ObjCObjectMapper.class) GKGameModel value);

    /**
     * A random source to use when breaking ties between equally-strong moves when calling bestMoveForPlayer
     * or when selecting a random move when randomMoveForPlayer is called. If set to nil, bestMoveForPlayer
     * and randomMoveForPlayer will simply return the first best move available.
     */
    @Generated
    @Selector("setRandomSource:")
    void setRandomSource(@Nullable @Mapped(ObjCObjectMapper.class) GKRandom value);
}
