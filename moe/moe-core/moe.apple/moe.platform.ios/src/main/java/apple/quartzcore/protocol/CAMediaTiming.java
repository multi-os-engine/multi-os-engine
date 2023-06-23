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
import org.jetbrains.annotations.NotNull;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMediaTiming")
public interface CAMediaTiming {
    /**
     * When true, the object plays backwards after playing forwards. Defaults
     * to NO.
     */
    @Generated
    @Selector("autoreverses")
    boolean autoreverses();

    /**
     * The begin time of the object, in relation to its parent object, if
     * applicable. Defaults to 0.
     */
    @Generated
    @Selector("beginTime")
    double beginTime();

    /**
     * The basic duration of the object. Defaults to 0.
     */
    @Generated
    @Selector("duration")
    double duration();

    /**
     * Defines how the timed object behaves outside its active duration.
     * Local time may be clamped to either end of the active duration, or
     * the element may be removed from the presentation. The legal values
     * are `backwards', `forwards', `both' and `removed'. Defaults to
     * `removed'.
     */
    @NotNull
    @Generated
    @Selector("fillMode")
    String fillMode();

    /**
     * The repeat count of the object. May be fractional. Defaults to 0.
     */
    @Generated
    @Selector("repeatCount")
    float repeatCount();

    /**
     * The repeat duration of the object. Defaults to 0.
     */
    @Generated
    @Selector("repeatDuration")
    double repeatDuration();

    /**
     * When true, the object plays backwards after playing forwards. Defaults
     * to NO.
     */
    @Generated
    @Selector("setAutoreverses:")
    void setAutoreverses(boolean value);

    /**
     * The begin time of the object, in relation to its parent object, if
     * applicable. Defaults to 0.
     */
    @Generated
    @Selector("setBeginTime:")
    void setBeginTime(double value);

    /**
     * The basic duration of the object. Defaults to 0.
     */
    @Generated
    @Selector("setDuration:")
    void setDuration(double value);

    /**
     * Defines how the timed object behaves outside its active duration.
     * Local time may be clamped to either end of the active duration, or
     * the element may be removed from the presentation. The legal values
     * are `backwards', `forwards', `both' and `removed'. Defaults to
     * `removed'.
     */
    @Generated
    @Selector("setFillMode:")
    void setFillMode(@NotNull String value);

    /**
     * The repeat count of the object. May be fractional. Defaults to 0.
     */
    @Generated
    @Selector("setRepeatCount:")
    void setRepeatCount(float value);

    /**
     * The repeat duration of the object. Defaults to 0.
     */
    @Generated
    @Selector("setRepeatDuration:")
    void setRepeatDuration(double value);

    /**
     * The rate of the layer. Used to scale parent time to local time, e.g.
     * if rate is 2, local time progresses twice as fast as parent time.
     * Defaults to 1.
     */
    @Generated
    @Selector("setSpeed:")
    void setSpeed(float value);

    /**
     * Additional offset in active local time. i.e. to convert from parent
     * time tp to active local time t: t = (tp - begin) * speed + offset.
     * One use of this is to "pause" a layer by setting `speed' to zero and
     * `offset' to a suitable value. Defaults to 0.
     */
    @Generated
    @Selector("setTimeOffset:")
    void setTimeOffset(double value);

    /**
     * The rate of the layer. Used to scale parent time to local time, e.g.
     * if rate is 2, local time progresses twice as fast as parent time.
     * Defaults to 1.
     */
    @Generated
    @Selector("speed")
    float speed();

    /**
     * Additional offset in active local time. i.e. to convert from parent
     * time tp to active local time t: t = (tp - begin) * speed + offset.
     * One use of this is to "pause" a layer by setting `speed' to zero and
     * `offset' to a suitable value. Defaults to 0.
     */
    @Generated
    @Selector("timeOffset")
    double timeOffset();
}
