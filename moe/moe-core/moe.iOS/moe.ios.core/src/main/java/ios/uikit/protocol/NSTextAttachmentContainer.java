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

package ios.uikit.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.uikit.NSTextContainer;
import ios.uikit.UIImage;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextAttachmentContainer")
public interface NSTextAttachmentContainer {
	/**
	 * attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSTextAttachmentContainer_Protocol/index.html#//apple_ref/occ/intfm/NSTextAttachmentContainer/attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
	@ByValue
	CGRect attachmentBoundsForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
			NSTextContainer textContainer, @ByValue CGRect lineFrag,
			@ByValue CGPoint position, @NUInt long charIndex);

	/**
	 * imageForBounds:textContainer:characterIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSTextAttachmentContainer_Protocol/index.html#//apple_ref/occ/intfm/NSTextAttachmentContainer/imageForBounds:textContainer:characterIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageForBounds:textContainer:characterIndex:")
	UIImage imageForBoundsTextContainerCharacterIndex(
			@ByValue CGRect imageBounds, NSTextContainer textContainer,
			@NUInt long charIndex);
}
