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
import apple.foundation.NSURL;
import apple.uikit.UIDocumentPickerViewController;
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
@ObjCProtocolName("UIDocumentPickerDelegate")
public interface UIDocumentPickerDelegate {
    @IsOptional
    @Generated
    @Selector("documentPicker:didPickDocumentAtURL:")
    default void documentPickerDidPickDocumentAtURL(UIDocumentPickerViewController controller, NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called if the user dismisses the document picker without selecting a document (using the Cancel button)
     */
    @Generated
    @IsOptional
    @Selector("documentPickerWasCancelled:")
    default void documentPickerWasCancelled(UIDocumentPickerViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentPicker:didPickDocumentsAtURLs:")
    default void documentPickerDidPickDocumentsAtURLs(UIDocumentPickerViewController controller,
            NSArray<? extends NSURL> urls) {
        throw new java.lang.UnsupportedOperationException();
    }
}
