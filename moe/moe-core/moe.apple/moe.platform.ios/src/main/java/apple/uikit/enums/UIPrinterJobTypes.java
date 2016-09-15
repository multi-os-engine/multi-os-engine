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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPrinterJobTypes {
    @Generated
    private UIPrinterJobTypes() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Document = 0x0000000000000001L;
    @Generated @NInt public static final long Envelope = 0x0000000000000002L;
    @Generated @NInt public static final long Label = 0x0000000000000004L;
    @Generated @NInt public static final long Photo = 0x0000000000000008L;
    @Generated @NInt public static final long Receipt = 0x0000000000000010L;
    @Generated @NInt public static final long Roll = 0x0000000000000020L;
    @Generated @NInt public static final long LargeFormat = 0x0000000000000040L;
    @Generated @NInt public static final long Postcard = 0x0000000000000080L;
}
