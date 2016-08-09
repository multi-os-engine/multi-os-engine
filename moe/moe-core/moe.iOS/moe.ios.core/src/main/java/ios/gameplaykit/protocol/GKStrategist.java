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

package ios.gameplaykit.protocol;


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
	/**
	 * bestMoveForActivePlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKStrategist_Protocol/index.html#//apple_ref/occ/intfm/GKStrategist/bestMoveForActivePlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bestMoveForActivePlayer")
	@MappedReturn(ObjCObjectMapper.class)
	Object bestMoveForActivePlayer();

	/**
	 * gameModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKStrategist_Protocol/index.html#//apple_ref/occ/intfp/GKStrategist/gameModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gameModel")
	@MappedReturn(ObjCObjectMapper.class)
	Object gameModel();

	/**
	 * randomSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKStrategist_Protocol/index.html#//apple_ref/occ/intfp/GKStrategist/randomSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("randomSource")
	@MappedReturn(ObjCObjectMapper.class)
	Object randomSource();

	/**
	 * gameModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKStrategist_Protocol/index.html#//apple_ref/occ/intfp/GKStrategist/gameModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGameModel:")
	void setGameModel(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * randomSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKStrategist_Protocol/index.html#//apple_ref/occ/intfp/GKStrategist/randomSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRandomSource:")
	void setRandomSource(@Mapped(ObjCObjectMapper.class) Object value);
}
