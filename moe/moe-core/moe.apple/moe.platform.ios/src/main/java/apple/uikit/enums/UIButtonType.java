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
public final class UIButtonType {
    /**
     * no button type
     */
    @Generated @NInt public static final long Custom = 0x0000000000000000L;
    /**
     * standard system button
     */
    @Generated @NInt public static final long System = 0x0000000000000001L;
    @Generated @NInt public static final long DetailDisclosure = 0x0000000000000002L;
    @Generated @NInt public static final long InfoLight = 0x0000000000000003L;
    @Generated @NInt public static final long InfoDark = 0x0000000000000004L;
    @Generated @NInt public static final long ContactAdd = 0x0000000000000005L;
    /**
     * Deprecated, use UIButtonTypeSystem instead
     */
    @Generated @NInt public static final long RoundedRect = 0x0000000000000001L;

    @Generated
    private UIButtonType() {
    }

    @Generated @NInt public static final long Close = 0x0000000000000007L;
}
