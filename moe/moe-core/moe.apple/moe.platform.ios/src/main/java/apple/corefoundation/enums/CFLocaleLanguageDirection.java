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
import org.moe.natj.general.ann.NInt;

@Generated
public final class CFLocaleLanguageDirection {
    @Generated
    private CFLocaleLanguageDirection() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long LeftToRight = 0x0000000000000001L;
    @Generated @NInt public static final long RightToLeft = 0x0000000000000002L;
    @Generated @NInt public static final long TopToBottom = 0x0000000000000003L;
    @Generated @NInt public static final long BottomToTop = 0x0000000000000004L;
}
