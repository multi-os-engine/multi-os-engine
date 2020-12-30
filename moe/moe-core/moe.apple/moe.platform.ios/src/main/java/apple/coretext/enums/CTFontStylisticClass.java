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
 * @enum       CTFontStylisticClass
 * @abstract   Stylistic class values.
 * @discussion CTFontStylisticClass classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the CTFontSymbolicTraits and can be obtained via the kCTFontTraitClassMask.
 */
@Generated
public final class CTFontStylisticClass {
    @Generated public static final int ClassUnknown = 0x00000000;
    @Generated public static final int ClassOldStyleSerifs = 0x10000000;
    @Generated public static final int ClassTransitionalSerifs = 0x20000000;
    @Generated public static final int ClassModernSerifs = 0x30000000;
    @Generated public static final int ClassClarendonSerifs = 0x40000000;
    @Generated public static final int ClassSlabSerifs = 0x50000000;
    @Generated public static final int ClassFreeformSerifs = 0x70000000;
    @Generated public static final int ClassSansSerif = 0x80000000;
    @Generated public static final int ClassOrnamentals = 0x90000000;
    @Generated public static final int ClassScripts = 0xA0000000;
    @Generated public static final int ClassSymbolic = 0xC0000000;
    @Generated public static final int UnknownClass = 0x00000000;
    @Generated public static final int OldStyleSerifsClass = 0x10000000;
    @Generated public static final int TransitionalSerifsClass = 0x20000000;
    @Generated public static final int ModernSerifsClass = 0x30000000;
    @Generated public static final int ClarendonSerifsClass = 0x40000000;
    @Generated public static final int SlabSerifsClass = 0x50000000;
    @Generated public static final int FreeformSerifsClass = 0x70000000;
    @Generated public static final int SansSerifClass = 0x80000000;
    @Generated public static final int OrnamentalsClass = 0x90000000;
    @Generated public static final int ScriptsClass = 0xA0000000;
    @Generated public static final int SymbolicClass = 0xC0000000;

    @Generated
    private CTFontStylisticClass() {
    }
}
