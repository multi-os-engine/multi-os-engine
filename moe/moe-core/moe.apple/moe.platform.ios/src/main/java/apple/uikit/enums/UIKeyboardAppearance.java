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
 * UIKeyboardAppearance
 * 
 * Requests a keyboard appearance be used when a text widget
 * becomes first responder..
 * Note: Some keyboard/input methods types may not support every variant.
 * In such cases, the input method will make a best effort to find a close
 * match to the requested type.
 */
@Generated
public final class UIKeyboardAppearance {
    /**
     * Default apperance for the current input method.
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long Dark = 0x0000000000000001L;
    @Generated @NInt public static final long Light = 0x0000000000000002L;
    /**
     * Deprecated
     */
    @Generated @NInt public static final long Alert = 0x0000000000000001L;

    @Generated
    private UIKeyboardAppearance() {
    }
}
