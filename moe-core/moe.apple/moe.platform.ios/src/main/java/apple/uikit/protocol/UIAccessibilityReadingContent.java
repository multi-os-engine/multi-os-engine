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

import apple.foundation.NSAttributedString;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.Nullable;

/**
 * UIAccessibilityReadingContent
 * 
 * Implemented on an element that represents content meant to be read, like a book or periodical.
 * Use in conjunction with UIAccessibilityTraitCausesPageTurn to provide a continuous reading experience with VoiceOver.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAccessibilityReadingContent")
public interface UIAccessibilityReadingContent {
    /**
     * Returns the content associated with a line number as a string.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("accessibilityContentForLineNumber:")
    String accessibilityContentForLineNumber(@NInt long lineNumber);

    /**
     * Returns the on-screen rectangle for a line number.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("accessibilityFrameForLineNumber:")
    @ByValue
    CGRect accessibilityFrameForLineNumber(@NInt long lineNumber);

    /**
     * Returns the line number given a point in the view's coordinate space.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("accessibilityLineNumberForPoint:")
    @NInt
    long accessibilityLineNumberForPoint(@ByValue CGPoint point);

    /**
     * Returns a string representing the text displayed on the current page.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("accessibilityPageContent")
    String accessibilityPageContent();

    /**
     * If an object adopting this protocol responds to these methods, the system will try sending them before sending
     * the non-attributed versions.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("accessibilityAttributedContentForLineNumber:")
    default NSAttributedString accessibilityAttributedContentForLineNumber(@NInt long lineNumber) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("accessibilityAttributedPageContent")
    default NSAttributedString accessibilityAttributedPageContent() {
        throw new java.lang.UnsupportedOperationException();
    }
}
