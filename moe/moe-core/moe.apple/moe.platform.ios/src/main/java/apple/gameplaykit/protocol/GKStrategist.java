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

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKStrategist")
public interface GKStrategist {
    @Generated
    @Selector("bestMoveForActivePlayer")
    @MappedReturn(ObjCObjectMapper.class)
    Object bestMoveForActivePlayer();

    @Generated
    @Selector("gameModel")
    @MappedReturn(ObjCObjectMapper.class)
    Object gameModel();

    @Generated
    @Selector("randomSource")
    @MappedReturn(ObjCObjectMapper.class)
    Object randomSource();

    @Generated
    @Selector("setGameModel:")
    void setGameModel(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setRandomSource:")
    void setRandomSource(@Mapped(ObjCObjectMapper.class) Object value);
}
