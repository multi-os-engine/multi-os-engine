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

import apple.quicklook.QLPreviewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @abstract The QLPreviewControllerDataSource protocol declares the methods that the Preview Controller uses to access the contents of its data source object.
 */
@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewControllerDataSource")
public interface QLPreviewControllerDataSource {
    /**
     * @abstract Returns the number of items that the preview controller should preview.
     * @param controller The Preview Controller.
     * @result The number of items.
     */
    @Generated
    @Selector("numberOfPreviewItemsInPreviewController:")
    @NInt
    long numberOfPreviewItemsInPreviewController(QLPreviewController controller);

    /**
     * @abstract Returns the item that the preview controller should preview.
     * @param controller The Preview Controller.
     * @param index The index of the item to preview.
     * @result An item conforming to the QLPreviewItem protocol.
     */
    @Generated
    @Selector("previewController:previewItemAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    QLPreviewItem previewControllerPreviewItemAtIndex(QLPreviewController controller, @NInt long index);
}
