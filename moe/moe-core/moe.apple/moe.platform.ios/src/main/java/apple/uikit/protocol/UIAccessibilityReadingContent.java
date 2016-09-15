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

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAccessibilityReadingContent")
public interface UIAccessibilityReadingContent {
    /**
     * accessibilityContentForLineNumber:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityReadingContent_Protocol/index.html#//apple_ref/occ/intfm/UIAccessibilityReadingContent/accessibilityContentForLineNumber:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityContentForLineNumber:")
    String accessibilityContentForLineNumber(@NInt long lineNumber);

    /**
     * accessibilityFrameForLineNumber:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityReadingContent_Protocol/index.html#//apple_ref/occ/intfm/UIAccessibilityReadingContent/accessibilityFrameForLineNumber:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityFrameForLineNumber:")
    @ByValue
    CGRect accessibilityFrameForLineNumber(@NInt long lineNumber);

    /**
     * accessibilityLineNumberForPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityReadingContent_Protocol/index.html#//apple_ref/occ/intfm/UIAccessibilityReadingContent/accessibilityLineNumberForPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityLineNumberForPoint:")
    @NInt
    long accessibilityLineNumberForPoint(@ByValue CGPoint point);

    /**
     * accessibilityPageContent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityReadingContent_Protocol/index.html#//apple_ref/occ/intfm/UIAccessibilityReadingContent/accessibilityPageContent">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityPageContent")
    String accessibilityPageContent();
}
