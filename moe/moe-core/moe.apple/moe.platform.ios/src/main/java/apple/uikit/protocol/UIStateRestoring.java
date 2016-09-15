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

import apple.foundation.NSCoder;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIStateRestoring")
public interface UIStateRestoring {
    /**
     * applicationFinishedRestoringState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIStateRestoring_protocol/index.html#//apple_ref/occ/intfm/UIStateRestoring/applicationFinishedRestoringState">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("applicationFinishedRestoringState")
    default void applicationFinishedRestoringState() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * decodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIStateRestoring_protocol/index.html#//apple_ref/occ/intfm/UIStateRestoring/decodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("decodeRestorableStateWithCoder:")
    default void decodeRestorableStateWithCoder(NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * encodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIStateRestoring_protocol/index.html#//apple_ref/occ/intfm/UIStateRestoring/encodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("encodeRestorableStateWithCoder:")
    default void encodeRestorableStateWithCoder(NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * objectRestorationClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIStateRestoring_protocol/index.html#//apple_ref/occ/intfp/UIStateRestoring/objectRestorationClass">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("objectRestorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    default Object objectRestorationClass() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * restorationParent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIStateRestoring_protocol/index.html#//apple_ref/occ/intfp/UIStateRestoring/restorationParent">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("restorationParent")
    @MappedReturn(ObjCObjectMapper.class)
    default Object restorationParent() {
        throw new java.lang.UnsupportedOperationException();
    }
}
