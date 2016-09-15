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

import apple.foundation.NSArray;
import apple.uikit.UIPrintInteractionController;
import apple.uikit.UIPrintPaper;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPrintInteractionControllerDelegate")
public interface UIPrintInteractionControllerDelegate {
    /**
     * printInteractionController:choosePaper:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionController:choosePaper:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionController:choosePaper:")
    default UIPrintPaper printInteractionControllerChoosePaper(UIPrintInteractionController printInteractionController,
            NSArray<? extends UIPrintPaper> paperList) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionController:cutLengthForPaper:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionController:cutLengthForPaper:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionController:cutLengthForPaper:")
    @NFloat
    default double printInteractionControllerCutLengthForPaper(UIPrintInteractionController printInteractionController,
            UIPrintPaper paper) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerDidDismissPrinterOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerDidDismissPrinterOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidDismissPrinterOptions:")
    default void printInteractionControllerDidDismissPrinterOptions(
            UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerDidFinishJob:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerDidFinishJob:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidFinishJob:")
    default void printInteractionControllerDidFinishJob(UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerDidPresentPrinterOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerDidPresentPrinterOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidPresentPrinterOptions:")
    default void printInteractionControllerDidPresentPrinterOptions(
            UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerParentViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerParentViewController:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerParentViewController:")
    default UIViewController printInteractionControllerParentViewController(
            UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerWillDismissPrinterOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerWillDismissPrinterOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillDismissPrinterOptions:")
    default void printInteractionControllerWillDismissPrinterOptions(
            UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerWillPresentPrinterOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerWillPresentPrinterOptions:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillPresentPrinterOptions:")
    default void printInteractionControllerWillPresentPrinterOptions(
            UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionControllerWillStartJob:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionControllerWillStartJob:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillStartJob:")
    default void printInteractionControllerWillStartJob(UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * printInteractionController:chooseCutterBehavior:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintInteractionControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIPrintInteractionControllerDelegate/printInteractionController:chooseCutterBehavior:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("printInteractionController:chooseCutterBehavior:")
    @NInt
    default long printInteractionControllerChooseCutterBehavior(UIPrintInteractionController printInteractionController,
            NSArray<?> availableBehaviors) {
        throw new java.lang.UnsupportedOperationException();
    }
}
