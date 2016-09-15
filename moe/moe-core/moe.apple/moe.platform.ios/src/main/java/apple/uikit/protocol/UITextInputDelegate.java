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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInputDelegate")
public interface UITextInputDelegate {
    /**
     * selectionDidChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextInputDelegate/selectionDidChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectionDidChange:")
    void selectionDidChange(@Mapped(ObjCObjectMapper.class) Object textInput);

    /**
     * selectionWillChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextInputDelegate/selectionWillChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectionWillChange:")
    void selectionWillChange(@Mapped(ObjCObjectMapper.class) Object textInput);

    /**
     * textDidChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextInputDelegate/textDidChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textDidChange:")
    void textDidChange(@Mapped(ObjCObjectMapper.class) Object textInput);

    /**
     * textWillChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITextInputDelegate/textWillChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textWillChange:")
    void textWillChange(@Mapped(ObjCObjectMapper.class) Object textInput);
}
