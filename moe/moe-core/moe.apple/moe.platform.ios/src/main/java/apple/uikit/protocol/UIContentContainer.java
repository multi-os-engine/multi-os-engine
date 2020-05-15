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

import apple.coregraphics.struct.CGSize;
import apple.uikit.UITraitCollection;
import org.moe.natj.general.ann.ByValue;
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
@ObjCProtocolName("UIContentContainer")
public interface UIContentContainer {
    @Generated
    @Selector("preferredContentSize")
    @ByValue
    CGSize preferredContentSize();

    @Generated
    @Selector("preferredContentSizeDidChangeForChildContentContainer:")
    void preferredContentSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    @Generated
    @Selector("sizeForChildContentContainer:withParentContainerSize:")
    @ByValue
    CGSize sizeForChildContentContainerWithParentContainerSize(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container, @ByValue CGSize parentSize);

    @Generated
    @Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    void systemLayoutFittingSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    @Generated
    @Selector("viewWillTransitionToSize:withTransitionCoordinator:")
    void viewWillTransitionToSizeWithTransitionCoordinator(@ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

    @Generated
    @Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
    void willTransitionToTraitCollectionWithTransitionCoordinator(UITraitCollection newCollection,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);
}
