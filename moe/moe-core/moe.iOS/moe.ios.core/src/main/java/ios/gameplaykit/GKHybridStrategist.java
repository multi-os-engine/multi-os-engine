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

package ios.gameplaykit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.gameplaykit.protocol.GKStrategist;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKHybridStrategist extends NSObject implements GKStrategist {
	static {
		NatJ.register();
	}

	@Generated
	protected GKHybridStrategist(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKHybridStrategist alloc();

	@Generated
	@Selector("bestMoveForActivePlayer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object bestMoveForActivePlayer();

	@Generated
	@Selector("budget")
	@NUInt
	public native long budget();

	@Generated
	@Selector("explorationParameter")
	@NUInt
	public native long explorationParameter();

	@Generated
	@Selector("gameModel")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object gameModel();

	@Generated
	@Selector("init")
	public native GKHybridStrategist init();

	@Generated
	@Selector("maxLookAheadDepth")
	@NUInt
	public native long maxLookAheadDepth();

	@Generated
	@Selector("randomSource")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object randomSource();

	@Generated
	@Selector("setBudget:")
	public native void setBudget(@NUInt long value);

	@Generated
	@Selector("setExplorationParameter:")
	public native void setExplorationParameter(@NUInt long value);

	@Generated
	@Selector("setGameModel:")
	public native void setGameModel(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setMaxLookAheadDepth:")
	public native void setMaxLookAheadDepth(@NUInt long value);

	@Generated
	@Selector("setRandomSource:")
	public native void setRandomSource(
			@Mapped(ObjCObjectMapper.class) Object value);
}
