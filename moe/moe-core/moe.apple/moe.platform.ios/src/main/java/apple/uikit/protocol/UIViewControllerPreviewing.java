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

import apple.coregraphics.struct.CGRect;
import apple.uikit.UIGestureRecognizer;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerPreviewing")
public interface UIViewControllerPreviewing {
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    UIViewControllerPreviewingDelegate delegate();

    @Generated
    @Selector("previewingGestureRecognizerForFailureRelationship")
    UIGestureRecognizer previewingGestureRecognizerForFailureRelationship();

    @Generated
    @Selector("setSourceRect:")
    void setSourceRect(@ByValue CGRect value);

    @Generated
    @Selector("sourceRect")
    @ByValue
    CGRect sourceRect();

    @Generated
    @Selector("sourceView")
    UIView sourceView();
}
