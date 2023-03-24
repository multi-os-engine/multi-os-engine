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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActivityItemSource")
public interface UIActivityItemSource {
    /**
     * UTI for item if it is an NSData. iOS 7.0. will be called with nil activity and then selected activity
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("activityViewController:dataTypeIdentifierForActivityType:")
    default String activityViewControllerDataTypeIdentifierForActivityType(
            @NotNull UIActivityViewController activityViewController, @Nullable String activityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called to fetch data after an activity is selected. you can return nil.
     */
    @Nullable
    @Generated
    @Selector("activityViewController:itemForActivityType:")
    @MappedReturn(ObjCObjectMapper.class)
    Object activityViewControllerItemForActivityType(@NotNull UIActivityViewController activityViewController,
            @Nullable String activityType);

    /**
     * if activity supports a Subject field. iOS 7.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("activityViewController:subjectForActivityType:")
    default String activityViewControllerSubjectForActivityType(
            @NotNull UIActivityViewController activityViewController, @Nullable String activityType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * if activity supports preview image. iOS 7.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    default UIImage activityViewControllerThumbnailImageForActivityTypeSuggestedSize(
            @NotNull UIActivityViewController activityViewController, @Nullable String activityType,
            @ByValue CGSize size) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called to determine data type. only the class of the return type is consulted. it should match what
     * -itemForActivityType: returns later
     */
    @NotNull
    @Generated
    @Selector("activityViewControllerPlaceholderItem:")
    @MappedReturn(ObjCObjectMapper.class)
    Object activityViewControllerPlaceholderItem(@NotNull UIActivityViewController activityViewController);

    /**
     * called to fetch LinkPresentation metadata for the activity item. iOS 13.0
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("activityViewControllerLinkMetadata:")
    default LPLinkMetadata activityViewControllerLinkMetadata(
            @NotNull UIActivityViewController activityViewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
