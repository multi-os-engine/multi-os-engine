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

package apple.avfoundation.protocol;

import apple.avfoundation.AVPlayerItemLegibleOutput;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] AVPlayerItemLegibleOutputPushDelegate
 * 
 * Extends AVPlayerItemOutputPushDelegate to provide additional methods specific to attributed string output.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemLegibleOutputPushDelegate")
public interface AVPlayerItemLegibleOutputPushDelegate extends AVPlayerItemOutputPushDelegate {
    /**
     * legibleOutput:didOutputAttributedStrings:nativeSampleBuffers:forItemTime:
     * 
     * A delegate callback that delivers new textual samples.
     * 
     * For each media subtype in the array passed in to -initWithMediaSubtypesForNativeRepresentation:, the delegate
     * will receive sample buffers carrying data in its native format via the nativeSamples parameter, if there is media
     * data of that subtype in the media resource. For all other media subtypes present in the media resource, the
     * delegate will receive attributed strings in a common format via the strings parameter. See
     * <CoreMedia/CMTextMarkup.h> for the string attributes that are used in the attributed strings.
     * 
     * API-Since: 7.0
     * 
     * @param output
     *                      The AVPlayerItemLegibleOutput source.
     * @param strings
     *                      An NSArray of NSAttributedString, each containing both the run of text and descriptive
     *                      markup.
     * @param nativeSamples
     *                      An NSArray of CMSampleBuffer objects, for media subtypes included in the array passed in to
     *                      -initWithMediaSubtypesForNativeRepresentation:
     * @param itemTime
     *                      The item time at which the strings should be presented.
     */
    @Generated
    @IsOptional
    @Selector("legibleOutput:didOutputAttributedStrings:nativeSampleBuffers:forItemTime:")
    default void legibleOutputDidOutputAttributedStringsNativeSampleBuffersForItemTime(
            @NotNull AVPlayerItemLegibleOutput output, @NotNull NSArray<? extends NSAttributedString> strings,
            @NotNull NSArray<?> nativeSamples, @ByValue CMTime itemTime) {
        throw new java.lang.UnsupportedOperationException();
    }
}
