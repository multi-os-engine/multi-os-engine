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

package apple.quartzcore.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMediaTiming")
public interface CAMediaTiming {
    @Generated
    @Selector("autoreverses")
    boolean autoreverses();

    @Generated
    @Selector("beginTime")
    double beginTime();

    @Generated
    @Selector("duration")
    double duration();

    @Generated
    @Selector("fillMode")
    String fillMode();

    @Generated
    @Selector("repeatCount")
    float repeatCount();

    @Generated
    @Selector("repeatDuration")
    double repeatDuration();

    @Generated
    @Selector("setAutoreverses:")
    void setAutoreverses(boolean value);

    @Generated
    @Selector("setBeginTime:")
    void setBeginTime(double value);

    @Generated
    @Selector("setDuration:")
    void setDuration(double value);

    @Generated
    @Selector("setFillMode:")
    void setFillMode(String value);

    @Generated
    @Selector("setRepeatCount:")
    void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    void setRepeatDuration(double value);

    @Generated
    @Selector("setSpeed:")
    void setSpeed(float value);

    @Generated
    @Selector("setTimeOffset:")
    void setTimeOffset(double value);

    @Generated
    @Selector("speed")
    float speed();

    @Generated
    @Selector("timeOffset")
    double timeOffset();
}
