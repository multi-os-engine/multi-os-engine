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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * UINavigationController manages a stack of view controllers and a navigation bar.
 * It performs horizontal view transitions for pushed and popped views while keeping the navigation bar in sync.
 * <p>
 * Most clients will not need to subclass UINavigationController.
 * <p>
 * If a navigation controller is nested in a tab bar controller, it uses the title and toolbar attributes of the bottom view controller on the stack.
 * <p>
 * UINavigationController is rotatable if its top view controller is rotatable.
 * Navigation between controllers with non-uniform rotatability is currently not supported.
 */
@Generated
public final class UINavigationControllerOperation {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Push = 0x0000000000000001L;
    @Generated @NInt public static final long Pop = 0x0000000000000002L;

    @Generated
    private UINavigationControllerOperation() {
    }
}
