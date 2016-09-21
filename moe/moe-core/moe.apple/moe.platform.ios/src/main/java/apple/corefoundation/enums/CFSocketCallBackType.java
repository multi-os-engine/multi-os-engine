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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CFSocketCallBackType {
    @Generated @NUInt public static final long NoCallBack = 0x0000000000000000L;
    @Generated @NUInt public static final long ReadCallBack = 0x0000000000000001L;
    @Generated @NUInt public static final long AcceptCallBack = 0x0000000000000002L;
    @Generated @NUInt public static final long DataCallBack = 0x0000000000000003L;
    @Generated @NUInt public static final long ConnectCallBack = 0x0000000000000004L;
    @Generated @NUInt public static final long WriteCallBack = 0x0000000000000008L;

    @Generated
    private CFSocketCallBackType() {
    }
}
