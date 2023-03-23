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
 * [@enum] CTFontOrientation
 * 
 * Specifies the intended rendering orientation of the font for obtaining glyph metrics.
 */
@Generated
public final class CTFontOrientation {
    @Generated public static final int OrientationDefault = 0x00000000;
    @Generated public static final int OrientationHorizontal = 0x00000001;
    @Generated public static final int OrientationVertical = 0x00000002;
    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Deprecated
     */
    @Deprecated @Generated public static final int DefaultOrientation = 0x00000000;
    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Deprecated
     */
    @Deprecated @Generated public static final int HorizontalOrientation = 0x00000001;
    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Deprecated
     */
    @Deprecated @Generated public static final int VerticalOrientation = 0x00000002;

    @Generated
    private CTFontOrientation() {
    }
}
