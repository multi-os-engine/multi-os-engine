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

package ios.modelio.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MDLMaterialPropertyType {
	@Generated
	private MDLMaterialPropertyType() {
	}

	@Generated
	@NUInt
	public static final long None = 0x0000000000000000L;
	@Generated
	@NUInt
	public static final long String = 0x0000000000000001L;
	@Generated
	@NUInt
	public static final long URL = 0x0000000000000002L;
	@Generated
	@NUInt
	public static final long Texture = 0x0000000000000003L;
	@Generated
	@NUInt
	public static final long Color = 0x0000000000000004L;
	@Generated
	@NUInt
	public static final long Float = 0x0000000000000005L;
	@Generated
	@NUInt
	public static final long Float2 = 0x0000000000000006L;
	@Generated
	@NUInt
	public static final long Float3 = 0x0000000000000007L;
	@Generated
	@NUInt
	public static final long Float4 = 0x0000000000000008L;
	@Generated
	@NUInt
	public static final long Matrix44 = 0x0000000000000009L;
}
