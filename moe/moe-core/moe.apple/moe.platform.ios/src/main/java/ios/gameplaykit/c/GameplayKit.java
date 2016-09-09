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

package ios.gameplaykit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("GameplayKit")
@Runtime(CRuntime.class)
public final class GameplayKit {
	static {
		NatJ.register();
	}

	@Generated
	private GameplayKit() {
	}

	@Generated
	@NInt
	public static final long GKGameModelMaxScore = 0x0000000001000000L;
	@Generated
	@NInt
	public static final long GKGameModelMinScore = 0xFFFFFFFFFF000000L;
}
