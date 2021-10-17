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

package apple.coremedia.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CMSampleTimingInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CMSampleTimingInfo() {
        super(CMSampleTimingInfo.class);
    }

    @Generated
    protected CMSampleTimingInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public CMSampleTimingInfo(@ByValue CMTime duration, @ByValue CMTime presentationTimeStamp,
            @ByValue CMTime decodeTimeStamp) {
        super(CMSampleTimingInfo.class);
        setDuration(duration);
        setPresentationTimeStamp(presentationTimeStamp);
        setDecodeTimeStamp(decodeTimeStamp);
    }

    /**
     * < The duration of the sample. If a single struct applies to
     * each of the samples, they all will have this duration.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CMTime duration();

    /**
     * < The duration of the sample. If a single struct applies to
     * each of the samples, they all will have this duration.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDuration(@ByValue CMTime value);

    /**
     * < The time at which the sample will be presented. If a single
     * struct applies to each of the samples, this is the presentationTime of the
     * first sample. The presentationTime of subsequent samples will be derived by
     * repeatedly adding the sample duration.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CMTime presentationTimeStamp();

    /**
     * < The time at which the sample will be presented. If a single
     * struct applies to each of the samples, this is the presentationTime of the
     * first sample. The presentationTime of subsequent samples will be derived by
     * repeatedly adding the sample duration.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPresentationTimeStamp(@ByValue CMTime value);

    /**
     * < The time at which the sample will be decoded. If the samples
     * are in presentation order (eg. audio samples, or video samples from a codec
     * that doesn't support out-of-order samples), this can be set to kCMTimeInvalid.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CMTime decodeTimeStamp();

    /**
     * < The time at which the sample will be decoded. If the samples
     * are in presentation order (eg. audio samples, or video samples from a codec
     * that doesn't support out-of-order samples), this can be set to kCMTimeInvalid.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDecodeTimeStamp(@ByValue CMTime value);
}
