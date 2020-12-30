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

    /**
     * When the content container forwards viewWillTransitionToSize:withTransitionCoordinator: to its children, it will call this method to determine what size to send them. 
     * 
     * If the returned size is the same as the child container's current size, viewWillTransitionToSize:withTransitionCoordinator: will not be called.
     */
    @Generated
    @Selector("sizeForChildContentContainer:withParentContainerSize:")
    @ByValue
    CGSize sizeForChildContentContainerWithParentContainerSize(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container, @ByValue CGSize parentSize);

    /**
     * Intended as a bridge for a view controller that does not use auto layout presenting a child that does use auto layout.
     * 
     * If the child's view is using auto layout and the -systemLayoutSizeFittingSize: of the view
     * changes, -systemLayoutFittingSizeDidChangeForChildContentContainer: will be sent to the view controller's parent.
     */
    @Generated
    @Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    void systemLayoutFittingSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    /**
     * This method is called when the view controller's view's size is changed by its parent (i.e. for the root view controller when its window rotates or is resized). 
     * 
     * If you override this method, you should either call super to propagate the change to children or manually forward the change to children.
     */
    @Generated
    @Selector("viewWillTransitionToSize:withTransitionCoordinator:")
    void viewWillTransitionToSizeWithTransitionCoordinator(@ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

    /**
     * This method is called when the view controller's trait collection is changed by its parent.
     * 
     * If you override this method, you should either call super to propagate the change to children or manually forward the change to children.
     */
    @Generated
    @Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
    void willTransitionToTraitCollectionWithTransitionCoordinator(UITraitCollection newCollection,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);
}
