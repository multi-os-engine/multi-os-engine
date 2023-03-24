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

import apple.scenekit.struct.SCNVector3;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] SCNBoundingVolume
 * 
 * The SCNBoundingVolume protocol is implemented by objects which can compute their bounding boxes.
 * 
 * You can currently use this protocol to get the bounding boxes of nodes and geometries.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNBoundingVolume")
public interface SCNBoundingVolume {
    /**
     * getBoundingBoxMin:max:
     * 
     * Fill the min and max vectors with the min and max vertex of the bounding box.
     * 
     * the returned bounding box is in local space of the receiver.
     * 
     * @param min A pointer to a SCNVector3 to store the min vertex of the bounding box into.
     * @param max A pointer to a SCNVector3 to store the max vertex of the bounding box into.
     */
    @Generated
    @Selector("getBoundingBoxMin:max:")
    boolean getBoundingBoxMinMax(@Nullable SCNVector3 min, @Nullable SCNVector3 max);

    /**
     * getBoundingSphereCenter:radius:
     * 
     * Fill the center vector with the center of the bounding sphere and store the radius of the bounding sphere in
     * 'radius'.
     * 
     * the returned bounding sphere is in local space of the receiver.
     * 
     * @param center A pointer to a SCNVector3 to store the center of the bounding sphere into.
     * @param radius A pointer to a CGFloat to store the radius of the bounding sphere into.
     */
    @Generated
    @Selector("getBoundingSphereCenter:radius:")
    boolean getBoundingSphereCenterRadius(@Nullable SCNVector3 center, @Nullable NFloatPtr radius);

    /**
     * setBoundingBoxMin:max:
     * 
     * Override the receiver bounding box with the min and max vectors provided (in local space of the receiver).
     * 
     * Passing nil as arguments will recompute the original bounding box of the receiver.
     * 
     * @param min A pointer to a SCNVector3 representing the min vertex of the desired bounding box.
     * @param max A pointer to a SCNVector3 representing the max vertex of the desired bounding box.
     */
    @Generated
    @Selector("setBoundingBoxMin:max:")
    void setBoundingBoxMinMax(@Nullable SCNVector3 min, @Nullable SCNVector3 max);
}
