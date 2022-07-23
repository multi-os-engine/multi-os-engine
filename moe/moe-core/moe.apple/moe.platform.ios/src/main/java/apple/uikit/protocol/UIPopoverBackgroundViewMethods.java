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

import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * The methods defined below are all to be treated as abstract; in order to subclass `UIPopoverBackgroundView`, you must
 * supply implementations of each of the methods below. For `readwrite` properties, you must supply implementations of
 * both of the accessors.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPopoverBackgroundViewMethods")
public interface UIPopoverBackgroundViewMethods {
    /**
     * Represents the the length of the base of the arrow's triangle in points.
     */
    @Generated
    @Selector("arrowBase")
    @ProtocolClassMethod("arrowBase")
    @NFloat
    double _arrowBase();

    @Generated
    @Selector("arrowHeight")
    @ProtocolClassMethod("arrowHeight")
    @NFloat
    double _arrowHeight();

    /**
     * Describes the distance between each edge of the background view and the corresponding edge of its content view
     * (i.e. if it were strictly a rectangle).
     */
    @Generated
    @Selector("contentViewInsets")
    @ProtocolClassMethod("contentViewInsets")
    @ByValue
    UIEdgeInsets _contentViewInsets();
}
