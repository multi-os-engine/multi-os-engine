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
import apple.corefoundation.struct.CGRect;

@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewControllerDelegate")
public interface QLPreviewControllerDelegate {
    /**
     * Invoked when the preview controller is about to be presented full screen or dismissed from full screen, to
     * provide a zoom effect.
     * 
     * Return the origin of the zoom. It should be relative to view, or screen based if view is not set. The controller
     * will fade in/out if the rect is CGRectZero.
     */
    @Generated
    @IsOptional
    @Selector("previewController:frameForPreviewItem:inSourceView:")
    @ByValue
    default CGRect previewControllerFrameForPreviewItemInSourceView(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem item, @ReferenceInfo(type = UIView.class) Ptr<UIView> view) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked by the preview controller before trying to open an URL tapped in the preview.
     * 
     * If not implemented, defaults is YES.
     * 
     * @return Returns NO to prevent the preview controller from calling -[UIApplication openURL:] on url.
     */
    @Generated
    @IsOptional
    @Selector("previewController:shouldOpenURL:forPreviewItem:")
    default boolean previewControllerShouldOpenURLForPreviewItem(QLPreviewController controller, NSURL url,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the preview controller is about to be presented full screen or dismissed from full screen, to
     * provide a smooth transition when zooming.
     * 
     * Return an image the controller will crossfade with when zooming. You can specify the actual "document" content
     * rect in the image in contentRect.
     * 
     * @param contentRect The rect within the image that actually represents the content of the document. For example,
     *                    for icons the actual rect is generally smaller than the icon itself.
     */
    @Generated
    @IsOptional
    @Selector("previewController:transitionImageForPreviewItem:contentRect:")
    default UIImage previewControllerTransitionImageForPreviewItemContentRect(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem item, CGRect contentRect) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the preview controller is about to be presented full screen or dismissed from full screen, to
     * provide a smooth transition when zooming.
     * 
     * Return the view that will crossfade with the preview.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("previewController:transitionViewForPreviewItem:")
    default UIView previewControllerTransitionViewForPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked after the preview controller is closed.
     */
    @Generated
    @IsOptional
    @Selector("previewControllerDidDismiss:")
    default void previewControllerDidDismiss(QLPreviewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked before the preview controller is closed.
     */
    @Generated
    @IsOptional
    @Selector("previewControllerWillDismiss:")
    default void previewControllerWillDismiss(QLPreviewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * * @abstract This method will be called with an edited copy of the contents of the preview item at previewItemURL.
     * * @discussion This can be called after the users save changes in the following cases:
     * 
     * - If the returned editing mode of the preview item is QLPreviewItemEditingModeCreateCopy.
     * 
     * - If the returned editing mode of the preview item is QLPreviewItemEditingModeUpdateContents and its
     * previewItemURL could not be successfully overwritten. In this case, modifiedContentsURL will point to a temporary
     * file on disk containing the edited copy.
     * 
     * - If the returned editing mode of the preview item is QLPreviewItemEditingModeUpdateContents and its content type
     * and the content type of the edited version don't match.
     * This means that the file type of modifiedContentsURL may be different from the one of the preview item.
     * 
     * Note that this may be called multiple times in a row with the successive edited versions of the preview item
     * (whenever the users save the changes).
     * * @param modifiedContentsURL NSURL of a temporary file on disk containing the edited copy of the preview item.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("previewController:didSaveEditedCopyOfPreviewItem:atURL:")
    default void previewControllerDidSaveEditedCopyOfPreviewItemAtURL(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem previewItem, NSURL modifiedContentsURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the preview controller has successfully overwritten the contents of the file at previewItemURL for
     * the preview item with the edited version of the users.
     * 
     * May be called multiple times in a row when overwriting the preview item with the successive edited versions of
     * the preview item (whenever the users save the changes).
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("previewController:didUpdateContentsOfPreviewItem:")
    default void previewControllerDidUpdateContentsOfPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem previewItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * * @abstract Invoked when the preview controller is loading its data. It is called for each preview item passed to
     * the data source of the preview controller.
     * * @discussion The preview controller does not offer the users to edit previews by default, but it is possible to
     * activate this functionality if its delegate either allows it to overwrite the contents of the preview item, or if
     * it takes care of the updated version of the preview item by implementing
     * previewController:didSaveEditedCopyOfPreviewItem:atURL:.
     * If the returned value is QLPreviewItemEditingModeUpdateContents and the
     * previewController:didSaveEditedCopyOfPreviewItem:atURL: delegate method is implemented, the preview controller
     * will overwrite the contents of the preview item if this is possible. If not (because the new version of the
     * preview item is of a different type for instance), it will instead call
     * previewController:didSaveEditedCopyOfPreviewItem:atURL:.
     * * @param previewItem The preview item for which the controller needs to know how its delegate wants edited
     * versions of the preview item to be handled.
     * * @result A value indicating how the preview controller should handle edited versions of the preview item.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("previewController:editingModeForPreviewItem:")
    @NInt
    default long previewControllerEditingModeForPreviewItem(QLPreviewController controller,
            @Mapped(ObjCObjectMapper.class) QLPreviewItem previewItem) {
        throw new java.lang.UnsupportedOperationException();
    }
}
