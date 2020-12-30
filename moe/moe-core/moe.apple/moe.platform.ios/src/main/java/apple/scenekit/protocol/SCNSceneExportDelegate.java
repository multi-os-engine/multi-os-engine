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

package apple.scenekit.protocol;

import apple.foundation.NSURL;
import apple.uikit.UIImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneExportDelegate")
public interface SCNSceneExportDelegate {
    /**
     * writeImage:withSceneDocumentURL:originalImageURL:
     * 
     * Invoked on the delegate to write the referenced image and return the destination url.
     * 
     * @param image The image to write.
     * @param documentURL The url where the scene is currently exported to.
     * @param originalImageURL The original url for the image. May be nil if the image was not previously loaded from a url.
     * @return The delegate must returns the url of the image that was exported or nil if it didn't export any image. If the returned value is nil, the image will be exported to a default destination in a default format.
     */
    @Generated
    @IsOptional
    @Selector("writeImage:withSceneDocumentURL:originalImageURL:")
    default NSURL writeImageWithSceneDocumentURLOriginalImageURL(UIImage image, NSURL documentURL,
            NSURL originalImageURL) {
        throw new java.lang.UnsupportedOperationException();
    }
}
