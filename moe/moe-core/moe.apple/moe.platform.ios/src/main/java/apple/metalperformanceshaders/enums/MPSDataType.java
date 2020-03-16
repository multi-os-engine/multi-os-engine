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

package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSDataType {
    @Generated public static final int FloatBit = 0x10000000;
    @Generated public static final int Float32 = 0x10000020;

    @Generated
    private MPSDataType() {
    }

    @Generated public static final int Invalid = 0x00000000;
    @Generated public static final int Float16 = 0x10000010;
    @Generated public static final int SignedBit = 0x20000000;
    @Generated public static final int IntBit = 0x20000000;
    @Generated public static final int Int8 = 0x20000008;
    @Generated public static final int Int16 = 0x20000010;
    @Generated public static final int UInt8 = 0x00000008;
    @Generated public static final int UInt16 = 0x00000010;
    @Generated public static final int UInt32 = 0x00000020;
    @Generated public static final int NormalizedBit = 0x40000000;
    @Generated public static final int Unorm1 = 0x40000001;
    @Generated public static final int Unorm8 = 0x40000008;
    @Generated public static final int Int32 = 0x20000020;
}
