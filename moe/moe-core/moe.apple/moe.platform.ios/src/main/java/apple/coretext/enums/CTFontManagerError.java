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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CTFontManagerError {
    @Generated @NInt public static final long FileNotFound = 0x0000000000000065L;
    @Generated @NInt public static final long InsufficientPermissions = 0x0000000000000066L;
    @Generated @NInt public static final long UnrecognizedFormat = 0x0000000000000067L;
    @Generated @NInt public static final long InvalidFontData = 0x0000000000000068L;
    @Generated @NInt public static final long AlreadyRegistered = 0x0000000000000069L;
    @Generated @NInt public static final long NotRegistered = 0x00000000000000C9L;
    @Generated @NInt public static final long InUse = 0x00000000000000CAL;
    @Generated @NInt public static final long SystemRequired = 0x00000000000000CBL;

    @Generated
    private CTFontManagerError() {
    }
}
