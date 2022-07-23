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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIGestureRecognizerState {
    /**
     * the recognizer has not yet recognized its gesture, but may be evaluating touch events. this is the default state
     */
    @Generated @NInt public static final long Possible = 0x0000000000000000L;
    /**
     * the recognizer has received touches recognized as the gesture. the action method will be called at the next turn
     * of the run loop
     */
    @Generated @NInt public static final long Began = 0x0000000000000001L;
    /**
     * the recognizer has received touches recognized as a change to the gesture. the action method will be called at
     * the next turn of the run loop
     */
    @Generated @NInt public static final long Changed = 0x0000000000000002L;
    /**
     * the recognizer has received touches recognized as the end of the gesture. the action method will be called at the
     * next turn of the run loop and the recognizer will be reset to UIGestureRecognizerStatePossible
     */
    @Generated @NInt public static final long Ended = 0x0000000000000003L;
    /**
     * the recognizer has received touches resulting in the cancellation of the gesture. the action method will be
     * called at the next turn of the run loop. the recognizer will be reset to UIGestureRecognizerStatePossible
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;
    /**
     * the recognizer has received a touch sequence that can not be recognized as the gesture. the action method will
     * not be called and the recognizer will be reset to UIGestureRecognizerStatePossible
     */
    @Generated @NInt public static final long Failed = 0x0000000000000005L;
    /**
     * the recognizer has received touches recognized as the gesture. the action method will be called at the next turn
     * of the run loop and the recognizer will be reset to UIGestureRecognizerStatePossible
     */
    @Generated @NInt public static final long Recognized = 0x0000000000000003L;

    @Generated
    private UIGestureRecognizerState() {
    }
}
