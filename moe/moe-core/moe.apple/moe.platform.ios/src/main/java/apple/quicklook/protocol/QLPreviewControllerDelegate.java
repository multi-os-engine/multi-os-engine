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

package apple.quicklook.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSURL;
import apple.quicklook.QLPreviewController;
import apple.uikit.UIImage;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewControllerDelegate")
public interface QLPreviewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("previewController:frameForPreviewItem:inSourceView:")
    @ByValue
    default CGRect previewControllerFrameForPreviewItemInSourceView(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object item, @ReferenceInfo(type = UIView.class) Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:shouldOpenURL:forPreviewItem:")
    default boolean previewControllerShouldOpenURLForPreviewItem(QLPreviewController controller, NSURL url,
            @Mapped(ObjCObjectMapper.class) Object item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:transitionImageForPreviewItem:contentRect:")
    default UIImage previewControllerTransitionImageForPreviewItemContentRect(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object item, CGRect contentRect) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:transitionViewForPreviewItem:")
    default UIView previewControllerTransitionViewForPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object item) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewControllerDidDismiss:")
    default void previewControllerDidDismiss(QLPreviewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewControllerWillDismiss:")
    default void previewControllerWillDismiss(QLPreviewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:didSaveEditedCopyOfPreviewItem:atURL:")
    default void previewControllerDidSaveEditedCopyOfPreviewItemAtURL(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object previewItem, NSURL modifiedContentsURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:didUpdateContentsOfPreviewItem:")
    default void previewControllerDidUpdateContentsOfPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object previewItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("previewController:editingModeForPreviewItem:")
    @NInt
    default long previewControllerEditingModeForPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) Object previewItem) {
        throw new java.lang.UnsupportedOperationException();
    }
}
