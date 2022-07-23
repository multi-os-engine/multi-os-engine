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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] WKAudiovisualMediaTypes
 * <p>
 * The types of audiovisual media which will require a user gesture to begin playing.
 * [@constant] WKAudiovisualMediaTypeNone No audiovisual media will require a user gesture to begin playing.
 * [@constant] WKAudiovisualMediaTypeAudio Audiovisual media containing audio will require a user gesture to begin
 * playing.
 * [@constant] WKAudiovisualMediaTypeVideo Audiovisual media containing video will require a user gesture to begin
 * playing.
 * [@constant] WKAudiovisualMediaTypeAll All audiovisual media will require a user gesture to begin playing.
 */
@Generated
public final class WKAudiovisualMediaTypes {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Audio = 0x0000000000000001L;
    @Generated @NUInt public static final long Video = 0x0000000000000002L;
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;

    @Generated
    private WKAudiovisualMediaTypes() {
    }
}
