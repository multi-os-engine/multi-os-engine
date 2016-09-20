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

package apple.security.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SecAccessControlCreateFlags {
    @Generated @NInt public static final long UserPresence = 0x0000000000000001L;
    @Generated @NInt public static final long TouchIDAny = 0x0000000000000002L;
    @Generated @NInt public static final long TouchIDCurrentSet = 0x0000000000000008L;
    @Generated @NInt public static final long DevicePasscode = 0x0000000000000010L;
    @Generated @NInt public static final long Or = 0x0000000000004000L;
    @Generated @NInt public static final long And = 0x0000000000008000L;
    @Generated @NInt public static final long PrivateKeyUsage = 0x0000000040000000L;
    @Generated @NInt public static final long ApplicationPassword = 0xFFFFFFFF80000000L;

    @Generated
    private SecAccessControlCreateFlags() {
    }
}
