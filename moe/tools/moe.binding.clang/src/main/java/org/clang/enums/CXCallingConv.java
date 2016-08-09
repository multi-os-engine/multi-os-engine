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

package org.clang.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CXCallingConv {
	@Generated
	private CXCallingConv() {
	}

	@Generated
	public static final int Default = 0x00000000;
	@Generated
	public static final int C = 0x00000001;
	@Generated
	public static final int X86StdCall = 0x00000002;
	@Generated
	public static final int X86FastCall = 0x00000003;
	@Generated
	public static final int X86ThisCall = 0x00000004;
	@Generated
	public static final int X86Pascal = 0x00000005;
	@Generated
	public static final int AAPCS = 0x00000006;
	@Generated
	public static final int AAPCS_VFP = 0x00000007;
	@Generated
	public static final int IntelOclBicc = 0x00000009;
	@Generated
	public static final int X86_64Win64 = 0x0000000A;
	@Generated
	public static final int X86_64SysV = 0x0000000B;
	@Generated
	public static final int X86VectorCall = 0x0000000C;
	@Generated
	public static final int Invalid = 0x00000064;
	@Generated
	public static final int Unexposed = 0x000000C8;
}
