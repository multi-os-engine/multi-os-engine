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

package apple.uikit.protocol;

import apple.uikit.UIEvent;
import apple.uikit.UIGestureRecognizer;
import apple.uikit.UIPress;
import apple.uikit.UITouch;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIGestureRecognizerDelegate")
public interface UIGestureRecognizerDelegate {
    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    default boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(UIGestureRecognizer gestureRecognizer,
            UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called before pressesBegan:withEvent: is called on the gesture recognizer for a new press. return NO to prevent
     * the gesture recognizer from seeing this press
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceivePress:")
    default boolean gestureRecognizerShouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called before touchesBegan:withEvent: is called on the gesture recognizer for a new touch. return NO to prevent
     * the gesture recognizer from seeing this touch
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveTouch:")
    default boolean gestureRecognizerShouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when the recognition of one of gestureRecognizer or otherGestureRecognizer would be blocked by the other
     * return YES to allow both to recognize simultaneously. the default implementation returns NO (by default no two
     * gestures can be recognized simultaneously)
     * 
     * note: returning YES is guaranteed to allow simultaneous recognition. returning NO is not guaranteed to prevent
     * simultaneous recognition, as the other gesture's delegate may return YES
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    default boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called once per attempt to recognize, so failure requirements can be determined lazily and may be set up between
     * recognizers across view hierarchies
     * return YES to set up a dynamic failure requirement between gestureRecognizer and otherGestureRecognizer
     * 
     * note: returning YES is guaranteed to set up the failure requirement. returning NO does not guarantee that there
     * will not be a failure requirement as the other gesture's counterpart delegate or subclass methods may return YES
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    default boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(UIGestureRecognizer gestureRecognizer,
            UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when a gesture recognizer attempts to transition out of UIGestureRecognizerStatePossible. returning NO
     * causes it to transition to UIGestureRecognizerStateFailed
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizerShouldBegin:")
    default boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called once before either -gestureRecognizer:shouldReceiveTouch: or -gestureRecognizer:shouldReceivePress:
     * return NO to prevent the gesture recognizer from seeing this event
     * 
     * API-Since: 13.4
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveEvent:")
    default boolean gestureRecognizerShouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }
}
