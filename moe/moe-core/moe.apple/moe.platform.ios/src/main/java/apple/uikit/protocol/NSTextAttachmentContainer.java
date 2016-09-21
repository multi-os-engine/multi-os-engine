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
import apple.uikit.NSTextContainer;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextAttachmentContainer")
public interface NSTextAttachmentContainer {
    @Generated
    @Selector("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ByValue
    CGRect attachmentBoundsForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
            NSTextContainer textContainer, @ByValue CGRect lineFrag, @ByValue CGPoint position, @NUInt long charIndex);

    @Generated
    @Selector("imageForBounds:textContainer:characterIndex:")
    UIImage imageForBoundsTextContainerCharacterIndex(@ByValue CGRect imageBounds, NSTextContainer textContainer,
            @NUInt long charIndex);
}
