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

package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UITraitCollection;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAppearance")
public interface UIAppearance {
    /**
     * appearance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAppearance_Protocol/index.html#//apple_ref/occ/intfcm/UIAppearance/appearance">iOS Dev Center</a>
     */
    @Generated
    @Selector("appearance")
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearance();

    /**
     * appearanceForTraitCollection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAppearance_Protocol/index.html#//apple_ref/occ/intfcm/UIAppearance/appearanceForTraitCollection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appearanceForTraitCollection:")
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearanceForTraitCollection(UITraitCollection trait);

    /**
     * appearanceForTraitCollection:whenContainedIn:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAppearance_Protocol/index.html#//apple_ref/occ/intfcm/UIAppearance/appearanceForTraitCollection:whenContainedIn:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Variadic()
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    /**
     * appearanceWhenContainedIn:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAppearance_Protocol/index.html#//apple_ref/occ/intfcm/UIAppearance/appearanceWhenContainedIn:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Variadic()
    @Selector("appearanceWhenContainedIn:")
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);
}
