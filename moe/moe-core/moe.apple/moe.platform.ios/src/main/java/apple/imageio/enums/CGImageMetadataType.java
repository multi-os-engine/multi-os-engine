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

package apple.imageio.enums;

import org.moe.natj.general.ann.Generated;

/**
 *  Metadata value type constants.
 * @typedef CGImageMetadataType
 * @abstract The XMP type for a CGImageMetadataTag
 * @discussion CGImageMetadataType defines a list of constants used to indicate
 * the type for a CGImageMetadataTag. If you are reading metadata, use the type
 * to determine how to interpret the CGImageMetadataTag's value. If you are
 * creating a CGImageMetadataTag, use the type to specify how the tag
 * should be serialized in XMP. String types have CFStringRef values, array
 * types have CFArray values, and structure types have CFDictionary values.
 * @const kCGImageMetadataTypeDefault The type will be interpretted based on the
 * CFType of the tag's value. This is only used when creating a new
 * CGImageMetadataTag - no existing tags should have this value. CFString
 * defaults to kCGImageMetadataTypeString, CFArray defaults to
 * kCGImageMetadataTypeArrayOrdered, and CFDictionary defaults to
 * kCGImageMetadataTypeStructure.
 * @const kCGImageMetadataTypeString A string value. CFNumber and CFBoolean
 * values will be converted to a string.
 * @const kCGImageMetadataTypeArrayUnordered An array where order does not matter.
 * Serialized in XMP as <rdf:Bag>.
 * @const kCGImageMetadataTypeArrayOrdered An array where order is preserved.
 * Serialized in XMP as <rdf:Seq>.
 * @const kCGImageMetadataTypeAlternateArray An ordered array where all elements
 * are alternates for the same value. Serialized in XMP as <rdf:Alt>.
 * @const kCGImageMetadataTypeAlternateText A special case of an alternate array
 * where all elements are different localized strings for the same value.
 * Serialized in XMP as an alternate array of strings with xml:lang qualifiers.
 * @const kCGImageMetadataTypeStructure A collection of keys and values. Unlike
 * array elements, fields of a structure may belong to different namespaces.
 */
@Generated
public final class CGImageMetadataType {
    @Generated public static final int Invalid = 0xFFFFFFFF;
    @Generated public static final int Default = 0x00000000;
    @Generated public static final int String = 0x00000001;
    @Generated public static final int ArrayUnordered = 0x00000002;
    @Generated public static final int ArrayOrdered = 0x00000003;
    @Generated public static final int AlternateArray = 0x00000004;
    @Generated public static final int AlternateText = 0x00000005;
    @Generated public static final int Structure = 0x00000006;

    @Generated
    private CGImageMetadataType() {
    }
}
