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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CTUnderlineStyleModifiers
 * 
 * Underline style modifiers.
 * 
 * Set these bits with the CTUnderlineStyle that you set with the
 * kCTUnderlineStyleAttributeName attribute to modify how the
 * underline will be drawn.
 */
@Generated
public final class CTUnderlineStyleModifiers {
    @Generated public static final int Solid = 0x00000000;
    @Generated public static final int Dot = 0x00000100;
    @Generated public static final int Dash = 0x00000200;
    @Generated public static final int DashDot = 0x00000300;
    @Generated public static final int DashDotDot = 0x00000400;

    @Generated
    private CTUnderlineStyleModifiers() {
    }
}
