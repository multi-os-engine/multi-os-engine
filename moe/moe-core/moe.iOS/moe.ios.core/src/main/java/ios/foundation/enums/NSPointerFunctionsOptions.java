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

package ios.foundation.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSPointerFunctionsOptions {
	@Generated
	private NSPointerFunctionsOptions() {
	}

	@Generated
	@NUInt
	public static final long StrongMemory = 0x0000000000000000L;
	@Generated
	@NUInt
	public static final long OpaqueMemory = 0x0000000000000002L;
	@Generated
	@NUInt
	public static final long MallocMemory = 0x0000000000000003L;
	@Generated
	@NUInt
	public static final long MachVirtualMemory = 0x0000000000000004L;
	@Generated
	@NUInt
	public static final long WeakMemory = 0x0000000000000005L;
	@Generated
	@NUInt
	public static final long ObjectPersonality = 0x0000000000000000L;
	@Generated
	@NUInt
	public static final long OpaquePersonality = 0x0000000000000100L;
	@Generated
	@NUInt
	public static final long ObjectPointerPersonality = 0x0000000000000200L;
	@Generated
	@NUInt
	public static final long CStringPersonality = 0x0000000000000300L;
	@Generated
	@NUInt
	public static final long StructPersonality = 0x0000000000000400L;
	@Generated
	@NUInt
	public static final long IntegerPersonality = 0x0000000000000500L;
	@Generated
	@NUInt
	public static final long CopyIn = 0x0000000000010000L;
}
