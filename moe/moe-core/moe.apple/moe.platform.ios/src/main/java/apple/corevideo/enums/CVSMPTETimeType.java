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

package apple.corevideo.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]           SMPTE Time Types
 * 
 * Constants that describe the type of SMPTE time.
 * [@constant]       kCVSMPTETimeType24
 *                     24 Frame
 * [@constant]       kCVSMPTETimeType25
 *                     25 Frame
 * [@constant]       kCVSMPTETimeType30Drop
 *                     30 Drop Frame
 * [@constant]       kCVSMPTETimeType30
 *                     30 Frame
 * [@constant]       kCVSMPTETimeType2997
 *                     29.97 Frame
 * [@constant]       kCVSMPTETimeType2997Drop
 *                     29.97 Drop Frame
 * [@constant]       kCVSMPTETimeType60
 *                     60 Frame
 * [@constant]       kCVSMPTETimeType5994
 *                     59.94 Frame
 */
@Generated
public final class CVSMPTETimeType {
    @Generated public static final int Type24 = 0x00000000;
    @Generated public static final int Type25 = 0x00000001;
    @Generated public static final int Type30Drop = 0x00000002;
    @Generated public static final int Type30 = 0x00000003;
    @Generated public static final int Type2997 = 0x00000004;
    @Generated public static final int Type2997Drop = 0x00000005;
    @Generated public static final int Type60 = 0x00000006;
    @Generated public static final int Type5994 = 0x00000007;

    @Generated
    private CVSMPTETimeType() {
    }
}
