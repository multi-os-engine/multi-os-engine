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
     * To customize the appearance of all instances of a class, send the relevant appearance modification messages to
     * the appearance proxy for the class. For example, to modify the bar tint color for all UINavigationBar instances:
     * [[UINavigationBar appearance] setBarTintColor:myColor];
     * <p>
     * Note for iOS7: On iOS7 the tintColor property has moved to UIView, and now has special inherited behavior
     * described in UIView.h.
     * This inherited behavior can conflict with the appearance proxy, and therefore tintColor is now disallowed with
     * the appearance proxy.
     */
    @Generated
    @Selector("appearance")
    @ProtocolClassMethod("appearance")
    UIAppearance _appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    @ProtocolClassMethod("appearanceForTraitCollection")
    UIAppearance _appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    UIAppearance _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    UIAppearance _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    /**
     * To customize the appearances for instances of a class contained within an instance of a container class, or
     * instances in a hierarchy, use +appearanceWhenContainedInInstancesOfClasses: for the appropriate appearance proxy.
     * For example:
     * <p>
     * [[UINavigationBar appearanceWhenContainedInInstancesOfClasses:@[[UISplitViewController class]]]
     * setBarTintColor:myColor];
     * [[UINavigationBar appearanceWhenContainedInInstancesOfClasses:@[[UITabBarController class],
     * [UISplitViewController class]]] setBarTintColor:myTabbedNavBarColor];
     * <p>
     * In any given view hierarchy the outermost appearance proxy wins. Specificity (depth of the chain) is the
     * tie-breaker.
     * <p>
     * In other words, the containment statement is treated as a partial ordering. Given a concrete ordering (actual
     * subview hierarchy), we select the partial ordering that is the first unique match when reading the actual
     * hierarchy from the window down.
     */
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @ProtocolClassMethod("appearanceWhenContainedIn")
    UIAppearance _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    UIAppearance _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);
}
