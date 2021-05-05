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

package apple.photos.protocol;

import apple.coreimage.CIImage;
import apple.coremedia.struct.CMTime;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol that describes a single frame of a live photo
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHLivePhotoFrame")
public interface PHLivePhotoFrame {
    /**
     * Input image for the frame
     */
    @Generated
    @Selector("image")
    CIImage image();

    /**
     * The scale of the frame relative to the full-size image
     */
    @Generated
    @Selector("renderScale")
    @NFloat
    double renderScale();

    /**
     * The time of the frame relative to the beginning of the live photo
     */
    @Generated
    @Selector("time")
    @ByValue
    CMTime time();

    /**
     * The type of frame
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}
