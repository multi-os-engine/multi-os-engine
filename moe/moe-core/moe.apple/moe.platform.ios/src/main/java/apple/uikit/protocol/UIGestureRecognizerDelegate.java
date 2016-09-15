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
     * gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIGestureRecognizerDelegate/gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    default boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(UIGestureRecognizer gestureRecognizer,
            UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * gestureRecognizer:shouldReceiveTouch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIGestureRecognizerDelegate/gestureRecognizer:shouldReceiveTouch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceiveTouch:")
    default boolean gestureRecognizerShouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIGestureRecognizerDelegate/gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    default boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
            UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * gestureRecognizer:shouldRequireFailureOfGestureRecognizer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIGestureRecognizerDelegate/gestureRecognizer:shouldRequireFailureOfGestureRecognizer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    default boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(UIGestureRecognizer gestureRecognizer,
            UIGestureRecognizer otherGestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * gestureRecognizerShouldBegin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIGestureRecognizerDelegate/gestureRecognizerShouldBegin:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("gestureRecognizerShouldBegin:")
    default boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("gestureRecognizer:shouldReceivePress:")
    default boolean gestureRecognizerShouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press) {
        throw new java.lang.UnsupportedOperationException();
    }
}
