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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The QLPreviewItem protocol declares the methods that a QLPreviewController instance uses to access the contents of a
 * given item.
 */
@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewItem")
public interface QLPreviewItem {
    /**
     * The item's title this will be used as apparent item title.
     * <p>
     * The title replaces the default item display name. This property is optional.
     */
    @Generated
    @IsOptional
    @Selector("previewItemTitle")
    default String previewItemTitle() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The URL of the item to preview.
     * <p>
     * The URL must be a file URL.
     */
    @Generated
    @Selector("previewItemURL")
    NSURL previewItemURL();
}
