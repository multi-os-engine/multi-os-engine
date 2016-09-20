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

package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GKTurnBasedMatchOutcome {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Quit = 0x0000000000000001L;
    @Generated @NInt public static final long Won = 0x0000000000000002L;
    @Generated @NInt public static final long Lost = 0x0000000000000003L;
    @Generated @NInt public static final long Tied = 0x0000000000000004L;
    @Generated @NInt public static final long TimeExpired = 0x0000000000000005L;
    @Generated @NInt public static final long First = 0x0000000000000006L;
    @Generated @NInt public static final long Second = 0x0000000000000007L;
    @Generated @NInt public static final long Third = 0x0000000000000008L;
    @Generated @NInt public static final long Fourth = 0x0000000000000009L;
    @Generated @NInt public static final long CustomRange = 0x0000000000FF0000L;

    @Generated
    private GKTurnBasedMatchOutcome() {
    }
}
