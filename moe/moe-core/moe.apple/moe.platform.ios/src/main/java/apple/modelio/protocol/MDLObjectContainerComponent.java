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
import apple.foundation.protocol.NSFastEnumeration;
import apple.modelio.MDLObject;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLObjectContainerComponent")
public interface MDLObjectContainerComponent extends MDLComponent, NSFastEnumeration {
    @Generated
    @Selector("addObject:")
    void addObject(MDLObject object);

    /**
     * returns an array of this object's contained objects, aka children
     */
    @Generated
    @Selector("objects")
    NSArray<? extends MDLObject> objects();

    @Generated
    @Selector("removeObject:")
    void removeObject(MDLObject object);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("count")
    @NUInt
    long count();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    MDLObject objectAtIndexedSubscript(@NUInt long index);
}
