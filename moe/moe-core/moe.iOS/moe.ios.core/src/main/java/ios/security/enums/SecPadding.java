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

package ios.security.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class SecPadding {
	@Generated
	private SecPadding() {
	}

	@Generated
	public static final int None = 0x00000000;
	@Generated
	public static final int PKCS1 = 0x00000001;
	@Generated
	public static final int OAEP = 0x00000002;
	@Generated
	public static final int SigRaw = 0x00004000;
	@Generated
	public static final int PKCS1MD2 = 0x00008000;
	@Generated
	public static final int PKCS1MD5 = 0x00008001;
	@Generated
	public static final int PKCS1SHA1 = 0x00008002;
	@Generated
	public static final int PKCS1SHA224 = 0x00008003;
	@Generated
	public static final int PKCS1SHA256 = 0x00008004;
	@Generated
	public static final int PKCS1SHA384 = 0x00008005;
	@Generated
	public static final int PKCS1SHA512 = 0x00008006;
}
