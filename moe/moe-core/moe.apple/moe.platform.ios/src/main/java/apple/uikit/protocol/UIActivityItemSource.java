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
import apple.linkpresentation.LPLinkMetadata;
import apple.uikit.UIActivityViewController;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.ByValue;
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
@ObjCProtocolName("UIActivityItemSource")
public interface UIActivityItemSource {
    @Generated
    @IsOptional
    @Selector("activityViewController:dataTypeIdentifierForActivityType:")
    default String activityViewControllerDataTypeIdentifierForActivityType(
            UIActivityViewController activityViewController, String activityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("activityViewController:itemForActivityType:")
    @MappedReturn(ObjCObjectMapper.class)
    Object activityViewControllerItemForActivityType(UIActivityViewController activityViewController,
            String activityType);

    @Generated
    @IsOptional
    @Selector("activityViewController:subjectForActivityType:")
    default String activityViewControllerSubjectForActivityType(UIActivityViewController activityViewController,
            String activityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    default UIImage activityViewControllerThumbnailImageForActivityTypeSuggestedSize(
            UIActivityViewController activityViewController, String activityType, @ByValue CGSize size) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("activityViewControllerPlaceholderItem:")
    @MappedReturn(ObjCObjectMapper.class)
    Object activityViewControllerPlaceholderItem(UIActivityViewController activityViewController);

    @Generated
    @IsOptional
    @Selector("activityViewControllerLinkMetadata:")
    default LPLinkMetadata activityViewControllerLinkMetadata(UIActivityViewController activityViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
