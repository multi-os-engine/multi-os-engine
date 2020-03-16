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

import apple.avfoundation.struct.AVAudio3DPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudio3DMixing")
public interface AVAudio3DMixing {
    @Generated
    @Selector("obstruction")
    float obstruction();

    @Generated
    @Selector("occlusion")
    float occlusion();

    @Generated
    @Selector("position")
    @ByValue
    AVAudio3DPoint position();

    @Generated
    @Selector("rate")
    float rate();

    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    long renderingAlgorithm();

    @Generated
    @Selector("reverbBlend")
    float reverbBlend();

    @Generated
    @Selector("setObstruction:")
    void setObstruction(float value);

    @Generated
    @Selector("setOcclusion:")
    void setOcclusion(float value);

    @Generated
    @Selector("setPosition:")
    void setPosition(@ByValue AVAudio3DPoint value);

    @Generated
    @Selector("setRate:")
    void setRate(float value);

    @Generated
    @Selector("setRenderingAlgorithm:")
    void setRenderingAlgorithm(@NInt long value);

    @Generated
    @Selector("setReverbBlend:")
    void setReverbBlend(float value);

    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    long pointSourceInHeadMode();

    @Generated
    @Selector("setPointSourceInHeadMode:")
    void setPointSourceInHeadMode(@NInt long value);

    @Generated
    @Selector("setSourceMode:")
    void setSourceMode(@NInt long value);

    @Generated
    @Selector("sourceMode")
    @NInt
    long sourceMode();
}
