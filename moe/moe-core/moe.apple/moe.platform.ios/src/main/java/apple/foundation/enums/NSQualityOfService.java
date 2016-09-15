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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSQualityOfService {
    @Generated
    private NSQualityOfService() {
    }

    @Generated @NInt public static final long UserInteractive = 0x0000000000000021L;
    @Generated @NInt public static final long UserInitiated = 0x0000000000000019L;
    @Generated @NInt public static final long Utility = 0x0000000000000011L;
    @Generated @NInt public static final long Background = 0x0000000000000009L;
    @Generated @NInt public static final long Default = 0xFFFFFFFFFFFFFFFFL;
}
