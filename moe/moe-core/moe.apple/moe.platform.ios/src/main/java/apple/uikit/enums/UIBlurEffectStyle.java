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

@Generated
public final class UIBlurEffectStyle {
    /**
     * Traditional blur styles.
     */
    @Generated @NInt public static final long ExtraLight = 0x0000000000000000L;
    /**
     * Traditional blur styles.
     */
    @Generated @NInt public static final long Light = 0x0000000000000001L;
    /**
     * Traditional blur styles.
     */
    @Generated @NInt public static final long Dark = 0x0000000000000002L;
    /**
     * Styles which automatically show one of the traditional blur styles,
     * depending on the user interface style.
     * <p>
     * Regular displays either Light or Dark.
     */
    @Generated @NInt public static final long Regular = 0x0000000000000004L;
    /**
     * Prominent displays either ExtraLight, Dark (on iOS), or ExtraDark (on tvOS).
     */
    @Generated @NInt public static final long Prominent = 0x0000000000000005L;

    @Generated
    private UIBlurEffectStyle() {
    }

    /**
     * Blur styles available in iOS 13.
     * <p>
     * Styles which automatically adapt to the user interface style:
     */
    @Generated @NInt public static final long SystemUltraThinMaterial = 0x0000000000000006L;
    /**
     * Blur styles available in iOS 13.
     * <p>
     * Styles which automatically adapt to the user interface style:
     */
    @Generated @NInt public static final long SystemThinMaterial = 0x0000000000000007L;
    /**
     * Blur styles available in iOS 13.
     * <p>
     * Styles which automatically adapt to the user interface style:
     */
    @Generated @NInt public static final long SystemMaterial = 0x0000000000000008L;
    /**
     * Blur styles available in iOS 13.
     * <p>
     * Styles which automatically adapt to the user interface style:
     */
    @Generated @NInt public static final long SystemThickMaterial = 0x0000000000000009L;
    /**
     * Blur styles available in iOS 13.
     * <p>
     * Styles which automatically adapt to the user interface style:
     */
    @Generated @NInt public static final long SystemChromeMaterial = 0x000000000000000AL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemUltraThinMaterialLight = 0x000000000000000BL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemThinMaterialLight = 0x000000000000000CL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemMaterialLight = 0x000000000000000DL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemThickMaterialLight = 0x000000000000000EL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemChromeMaterialLight = 0x000000000000000FL;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemUltraThinMaterialDark = 0x0000000000000010L;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemThinMaterialDark = 0x0000000000000011L;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemMaterialDark = 0x0000000000000012L;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemThickMaterialDark = 0x0000000000000013L;
    /**
     * And always-light and always-dark versions:
     */
    @Generated @NInt public static final long SystemChromeMaterialDark = 0x0000000000000014L;
}
