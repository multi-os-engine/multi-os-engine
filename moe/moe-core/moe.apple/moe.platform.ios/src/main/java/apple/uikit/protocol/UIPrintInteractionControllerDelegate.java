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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPrintInteractionControllerDelegate")
public interface UIPrintInteractionControllerDelegate {
    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("printInteractionController:chooseCutterBehavior:")
    @NInt
    default long printInteractionControllerChooseCutterBehavior(
            @NotNull UIPrintInteractionController printInteractionController, @NotNull NSArray<?> availableBehaviors) {
        throw new java.lang.UnsupportedOperationException();
    }

    @NotNull
    @Generated
    @IsOptional
    @Selector("printInteractionController:choosePaper:")
    default UIPrintPaper printInteractionControllerChoosePaper(
            @NotNull UIPrintInteractionController printInteractionController,
            @NotNull NSArray<? extends UIPrintPaper> paperList) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("printInteractionController:cutLengthForPaper:")
    @NFloat
    default double printInteractionControllerCutLengthForPaper(
            @NotNull UIPrintInteractionController printInteractionController, @NotNull UIPrintPaper paper) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidDismissPrinterOptions:")
    default void printInteractionControllerDidDismissPrinterOptions(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidFinishJob:")
    default void printInteractionControllerDidFinishJob(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerDidPresentPrinterOptions:")
    default void printInteractionControllerDidPresentPrinterOptions(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("printInteractionControllerParentViewController:")
    default UIViewController printInteractionControllerParentViewController(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillDismissPrinterOptions:")
    default void printInteractionControllerWillDismissPrinterOptions(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillPresentPrinterOptions:")
    default void printInteractionControllerWillPresentPrinterOptions(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printInteractionControllerWillStartJob:")
    default void printInteractionControllerWillStartJob(
            @NotNull UIPrintInteractionController printInteractionController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
