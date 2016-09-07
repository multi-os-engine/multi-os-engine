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

package org.moe.natjgen.nativelibs;

import org.moe.common.utils.NativeUtil;
import org.moe.natjgen.util.Path;

public class NatJGenNativeLoader {

	public static void initNatives() {

		// Only use for testing clang builds!
		// System.load("/Volumes/Developer/NoBackup/git/build-release/lib/libclang.3.8.dylib");

		/*
         * @formatter:off
         * 
         * NOTE: libclang.3.8
         *  llvm: a29a1b01eb5190c8384c2ec03ce914ab6deb6c99
         * clang: 2459d422b9a30a47facdcfcd8ec6bc055d34f796
         * extra: 4ec41cc4037f878c995a975e52e64c8bbe90af5c
         * 
         * @formatter:on
         */

		String osName = NativeUtil.getUnifiedSystemName();
		try {
			System.loadLibrary("clang");
			System.loadLibrary("natj");
		} catch(UnsatisfiedLinkError e) {
			if (NativeUtil.OS_NAME_MAC_OS_X.equals(osName)) {
				System.load(Path.compose("macosx", "x86_64", "libclang.dylib"));
				System.load(Path.compose("macosx", "x86_64", "libnatj.dylib"));
			} else if (NativeUtil.OS_NAME_WINDOWS.equals(osName)) {
				System.load(Path.compose("windows", "x86_64", "libclang.dll"));
				System.load(Path.compose("windows", "x86_64", "libnatj.dll"));
			} else {
				throw new RuntimeException("Unsupported OS: " + osName);
			}
		}
	}
}
