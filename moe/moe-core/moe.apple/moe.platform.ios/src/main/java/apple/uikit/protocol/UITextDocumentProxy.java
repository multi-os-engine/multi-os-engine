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

import apple.foundation.NSUUID;
import apple.foundation.struct.NSRange;
import apple.uikit.UITextInputMode;
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
@ObjCProtocolName("UITextDocumentProxy")
public interface UITextDocumentProxy extends UIKeyInput {
    @Generated
    @Selector("adjustTextPositionByCharacterOffset:")
    void adjustTextPositionByCharacterOffset(@NInt long offset);

    @Generated
    @Selector("documentContextAfterInput")
    String documentContextAfterInput();

    @Generated
    @Selector("documentContextBeforeInput")
    String documentContextBeforeInput();

    /**
     * An app can store UITextInputMode in its document context, when user switches to the document, the host will pass the inputMode as documentInputMode to the UIInputViewController,
     * which can switch to the inputMode and set primaryLanguage if it supports it.
     */
    @Generated
    @Selector("documentInputMode")
    UITextInputMode documentInputMode();

    @Generated
    @Selector("documentIdentifier")
    NSUUID documentIdentifier();

    @Generated
    @Selector("selectedText")
    String selectedText();

    /**
     * Setting marked text either replaces the existing marked text or, if none is present, inserts it in place of the current input location.
     */
    @Generated
    @Selector("setMarkedText:selectedRange:")
    void setMarkedTextSelectedRange(String markedText, @ByValue NSRange selectedRange);

    /**
     * Unmark the currently marked text.
     */
    @Generated
    @Selector("unmarkText")
    void unmarkText();
}
