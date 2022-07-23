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
 * [@enum] CTCharacterCollection
 * <p>
 * These constants specify character collections.
 * <p>
 * [@constant] kCTCharacterCollectionIdentityMapping
 * Indicates that the character identifier is equal to the CGGlyph
 * glyph index.
 * <p>
 * [@constant] kCTCharacterCollectionAdobeCNS1
 * Indicates the Adobe-CNS1 mapping.
 * <p>
 * [@constant] kCTCharacterCollectionAdobeGB1
 * Indicates the Adobe-GB1 mapping.
 * <p>
 * [@constant] kCTCharacterCollectionAdobeJapan1
 * Indicates the Adobe-Japan1 mapping.
 * <p>
 * [@constant] kCTCharacterCollectionAdobeJapan2
 * Indicates the Adobe-Japan2 mapping.
 * <p>
 * [@constant] kCTCharacterCollectionAdobeKorea1
 * Indicates the Adobe-Korea1 mapping.
 */
@Generated
public final class CTCharacterCollection {
    @Generated public static final char CharacterCollectionIdentityMapping = 0x0000;
    @Generated public static final char CharacterCollectionAdobeCNS1 = 0x0001;
    @Generated public static final char CharacterCollectionAdobeGB1 = 0x0002;
    @Generated public static final char CharacterCollectionAdobeJapan1 = 0x0003;
    @Generated public static final char CharacterCollectionAdobeJapan2 = 0x0004;
    @Generated public static final char CharacterCollectionAdobeKorea1 = 0x0005;
    @Deprecated @Generated public static final char IdentityMappingCharacterCollection = 0x0000;
    @Deprecated @Generated public static final char AdobeCNS1CharacterCollection = 0x0001;
    @Deprecated @Generated public static final char AdobeGB1CharacterCollection = 0x0002;
    @Deprecated @Generated public static final char AdobeJapan1CharacterCollection = 0x0003;
    @Deprecated @Generated public static final char AdobeJapan2CharacterCollection = 0x0004;
    @Deprecated @Generated public static final char AdobeKorea1CharacterCollection = 0x0005;

    @Generated
    private CTCharacterCollection() {
    }
}
