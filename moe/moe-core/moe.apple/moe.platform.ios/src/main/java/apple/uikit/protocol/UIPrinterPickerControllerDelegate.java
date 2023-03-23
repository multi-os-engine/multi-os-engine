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

import apple.uikit.UIPrinter;
import apple.uikit.UIPrinterPickerController;
import apple.uikit.UIViewController;
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
@ObjCProtocolName("UIPrinterPickerControllerDelegate")
public interface UIPrinterPickerControllerDelegate {
    /**
     * printerPickerController:shouldShowPrinter:
     * 
     * Use to filter out specific printers from the printer picker.
     * Evaluate the UIPrinter object and returns YES if the printer should
     * be shown, NO otherwise.
     * This delegate can assume that all UIPrinter properties are available
     * (the contactPrinter: method need not be called).
     * This method may be called from threads other than the main thread,
     * and may be called simultaneously from several different threads.
     */
    @Generated
    @IsOptional
    @Selector("printerPickerController:shouldShowPrinter:")
    default boolean printerPickerControllerShouldShowPrinter(UIPrinterPickerController printerPickerController,
            UIPrinter printer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerDidDismiss:")
    default void printerPickerControllerDidDismiss(UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerDidPresent:")
    default void printerPickerControllerDidPresent(UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerDidSelectPrinter:")
    default void printerPickerControllerDidSelectPrinter(UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerParentViewController:")
    default UIViewController printerPickerControllerParentViewController(
            UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerWillDismiss:")
    default void printerPickerControllerWillDismiss(UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("printerPickerControllerWillPresent:")
    default void printerPickerControllerWillPresent(UIPrinterPickerController printerPickerController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
