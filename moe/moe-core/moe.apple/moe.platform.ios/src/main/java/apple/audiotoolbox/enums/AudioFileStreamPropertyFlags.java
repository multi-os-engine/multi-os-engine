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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 *   [@enum] AudioFileStreamPropertyFlags
 *   [@constant]   kAudioFileStreamPropertyFlag_PropertyIsCached 
 * This flag is set in a call to AudioFileStream_PropertyListenerProc when the value of the property
 * can be obtained at any later time. If this flag is not set, then you should either get the value of 
 * the property from within this callback or set the flag kAudioFileStreamPropertyFlag_CacheProperty in order to signal
 * to the parser to begin caching the property data. Otherwise the value may not be available in the future.
 * 
 *   [@constant]   kAudioFileStreamPropertyFlag_CacheProperty 
 * This flag can be set by a property listener in order to signal to the parser that the client is
 * interested in the value of the property and that it should be cached until the full value of the property is available.
 */
@Generated
public final class AudioFileStreamPropertyFlags {
    @Generated public static final int PropertyIsCached = 0x00000001;
    @Generated public static final int CacheProperty = 0x00000002;

    @Generated
    private AudioFileStreamPropertyFlags() {
    }
}
