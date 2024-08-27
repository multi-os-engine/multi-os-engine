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

package apple.webkit.protocol;

import apple.uikit.protocol.UIPreviewActionItem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 10.0
 * Deprecated-Since: 13.0
 * Deprecated-Message: This API will be replaced
 */
@Deprecated
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKPreviewActionItem")
public interface WKPreviewActionItem extends UIPreviewActionItem {
    @Generated
    @Selector("identifier")
    String identifier();
}
