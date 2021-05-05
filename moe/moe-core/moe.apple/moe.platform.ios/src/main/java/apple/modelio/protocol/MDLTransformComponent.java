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

package apple.modelio.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * MDLTransformComponent
 * [@summary] a container for a time sampled local transformation
 * 
 * Accessors to get the local transform and the global transform
 * for a particular MDLObject are provided.
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLTransformComponent")
public interface MDLTransformComponent extends MDLComponent {
    /**
     * An array of sample times for which a key has been stored
     * If no animation data is present, the array will contain a single value of zero 
     */
    @Generated
    @Selector("keyTimes")
    NSArray<? extends NSNumber> keyTimes();

    @Generated
    @Selector("maximumTime")
    double maximumTime();

    /**
     * If no animation data is present, minimumTime and maximumTime will be zero
     */
    @Generated
    @Selector("minimumTime")
    double minimumTime();

    /**
     * if YES, this transform is intended to be in global space, not parent space
     */
    @Generated
    @Selector("resetsTransform")
    boolean resetsTransform();

    /**
     * if YES, this transform is intended to be in global space, not parent space
     */
    @Generated
    @Selector("setResetsTransform:")
    void setResetsTransform(boolean value);
}
