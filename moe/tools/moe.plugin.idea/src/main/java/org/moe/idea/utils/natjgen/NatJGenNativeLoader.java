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

package org.moe.idea.utils.natjgen;

import org.moe.common.utils.OsUtils;

import java.io.IOException;

public class NatJGenNativeLoader {

	public static void initNatives() throws IOException {
		String current = new java.io.File( "." ).getCanonicalPath();

		if(OsUtils.isMac()) {
			System.load(current + "/macosx/x86_64/libclang_bindings.dylib");
			System.load(current + "/macosx/x86_64/libclang.dylib");

			System.load(current + "/macosx/x86_64/natjgen.dylib");
			System.load(current + "/macosx/x86_64/libnatj.dylib");
		}
		else {
			throw new RuntimeException("Unsupported OS");
		}
	}
}
