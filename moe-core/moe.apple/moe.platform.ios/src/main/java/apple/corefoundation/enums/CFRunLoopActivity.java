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

/**
 * Run Loop Observer Activities
 */
@Generated
public final class CFRunLoopActivity {
    @Generated @NUInt public static final long Entry = 0x0000000000000001L;
    @Generated @NUInt public static final long BeforeTimers = 0x0000000000000002L;
    @Generated @NUInt public static final long BeforeSources = 0x0000000000000004L;
    @Generated @NUInt public static final long BeforeWaiting = 0x0000000000000020L;
    @Generated @NUInt public static final long AfterWaiting = 0x0000000000000040L;
    @Generated @NUInt public static final long Exit = 0x0000000000000080L;
    @Generated @NUInt public static final long AllActivities = 0x000000000FFFFFFFL;

    @Generated
    private CFRunLoopActivity() {
    }
}
