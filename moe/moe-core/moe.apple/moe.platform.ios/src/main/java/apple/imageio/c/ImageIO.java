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

package apple.imageio.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFMutableDataRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGDataConsumerRef;
import apple.coregraphics.opaque.CGDataProviderRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.imageio.opaque.CGImageDestinationRef;
import apple.imageio.opaque.CGImageMetadataRef;
import apple.imageio.opaque.CGImageMetadataTagRef;
import apple.imageio.opaque.CGImageSourceRef;
import apple.imageio.opaque.CGMutableImageMetadataRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("ImageIO")
@Runtime(CRuntime.class)
public final class ImageIO {
    static {
        NatJ.register();
    }

    @Generated
    private ImageIO() {
    }

    /**
     * *! @functiongroup Creating and identifying CGImageMetadata containers
     * [@function] CGImageMetadataGetTypeID
     * <p>
     * Gets the type identifier for the CGImageMetadata opaque type
     *
     * @return the type identifier for the CGImageMetadata opaque type
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageMetadataGetTypeID();

    /**
     * [@function] CGImageMetadataCreateMutable
     * <p>
     * Creates an empty CGMutableImageMetadataRef
     */
    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutable();

    /**
     * [@function] CGImageMetadataCreateMutableCopy
     * <p>
     * Creates a deep mutable copy of another CGImageMetadataRef
     * <p>
     * Before modifying an immutable CGImageMetadataRef (such as metadata
     * from CGImageSourceCopyMetadataAtIndex) you must first make a copy.
     * This function makes a deep copy of all CGImageMetadataTags and their values.
     */
    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutableCopy(CGImageMetadataRef metadata);

    /**
     * *! @functiongroup Creating and identifying CGImageMetadataTags
     * [@function] CGImageMetadataTagGetTypeID
     * <p>
     * Gets the type identifier for the CGImageMetadataTag opaque type
     *
     * @return the type identifier for the CGImageMetadataTagGetTypeID opaque type
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageMetadataTagGetTypeID();

    /**
     * ****************************************************************************
     * Creating a CGImageMetadataTag
     * ****************************************************************************
     * [@function] CGImageMetadataTagCreate
     * <p>
     * Creates a new CGImageMetadataTag
     * [@link] CGImageMetadataCopyStringValueWithPath @/link or
     * [@link] CGImageMetadataSetValueWithPath @/link.
     *
     * @param xmlns  The namespace for the tag. The value can be a common XMP namespace
     *               defined above, such as kCGImageMetadataNamespaceExif, or a CFString with a
     *               custom namespace URI. Custom namespaces must be a valid XML namespace. By
     *               convention, namespaces should end with either '/' or '#'. For example, exif
     *               uses the namespace "http://ns.adobe.com/exif/1.0/".
     * @param prefix An abbreviation for the XML namespace. The value can be NULL if
     *               the namespace is defined as a constant. Custom prefixes must be a valid XML
     *               name. For example, the prefix used for "http://ns.adobe.com/exif/1.0/" is "exif".
     *               The XMP serialization of the tag will use the prefix. Prefixes are also
     *               important for path-based CGImageMetadata functions, such as
     * @param name   The name of the tag. It must be a valid XMP name.
     * @param type   The type of the tag's value. Must be a constant from @link
     *               CGImageMetadataType @/link.
     * @param value  The value of the tag. Allowable CFTypes include CFStringRef,
     *               CFNumberRef, CFBooleanRef, CFArrayRef, and CFDictionaryRef. The CFType of 'value'
     *               must correspond to the 'type'. The elements of a CFArray must be either a
     *               CFStringRef or CGImageMetadataTagRef. The keys of a CFDictionary must be
     *               CFStringRefs with valid XMP names. The values of a CFDictionary must be either
     *               CFStringRefs or CGImageMetadataTagRefs. A shallow copy of the value is stored
     *               in the tag. Therefore, modifying a mutable value after the tag is created
     *               will not affect the tag's value.
     * @return Returns a pointer to a new CGImageMetadataTag. Returns NULL if a tag
     * could not be created with the specified parameters.
     */
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataTagCreate(CFStringRef xmlns, CFStringRef prefix,
            CFStringRef name, int type, ConstVoidPtr value);

    /**
     * ****************************************************************************
     * Getting attributes of a CGImageMetadataTag
     * ****************************************************************************
     * *! @functiongroup Getting attributes of a CGImageMetadataTag
     * [@function] CGImageMetadataTagCopyNamespace
     * <p>
     * Returns a copy of the tag's namespace
     */
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyNamespace(CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyPrefix
     * <p>
     * Returns a copy of the tag's prefix
     */
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyPrefix(CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyName
     * <p>
     * Returns a copy of the tag's name
     */
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyName(CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyValue
     * <p>
     * Returns a shallow copy of the tag's value
     * <p>
     * This function should only be used to read the tag's value.
     * CGImageMetadataCopyTagWithPath returns a copy of the tag (including a copy of
     * the tag's value). Therefore mutating a tag's value returned from this function
     * may not actually mutate the value in the CGImageMetadata. It is recommended
     * to create a new tag followed by CGImageMetadataSetTagWithPath, or use
     * CGImageMetadataSetValueWithPath to mutate a metadata value.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CGImageMetadataTagCopyValue(CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagGetType
     * <p>
     * Get the type of the CGImageMetadataTag
     *
     * @return Returns a CGImageMetadataType constant for the CGImageMetadataTag.
     * This is primarily used to determine how to interpret the tag's value.
     */
    @Generated
    @CFunction
    public static native int CGImageMetadataTagGetType(CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyQualifiers
     * <p>
     * Return a copy of the tag's qualifiers
     * <p>
     * XMP allows properties to contain supplemental properties called
     * qualifiers. Qualifiers are themselves CGImageMetadataTags with their own
     * namespace, prefix, name, and value. A common use is the xml:lang qualifier
     * for elements of an alternate-text array.
     *
     * @return Returns a copy of the array of qualifiers. Elements of the array are
     * CGImageMetadataTags. Returns NULL if the tag does not have any qualifiers.
     * The copy is shallow, the qualifiers are not deep copied.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataTagCopyQualifiers(CGImageMetadataTagRef tag);

    /**
     * ****************************************************************************
     * Functions for copying CGImageMetadataTagRefs from a CGImageMetadataRef.
     * These functions make it easier for the caller to traverse complex nested
     * structures of metadata, similar to KVC-compliant Objective-C classes.
     * ****************************************************************************
     * *! @functiongroup Retrieving CGImageMetadataTagRefs from a CGImageMetadataRef
     * [@function] CGImageMetadataCopyTags
     * <p>
     * Obtain an array of tags from a CGImageMetadataRef
     *
     * @return Returns an array with a shallow copy of all top-level
     * CGImageMetadataTagRefs in a CGImageMetadataRef.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataCopyTags(CGImageMetadataRef metadata);

    /**
     * [@function] CGImageMetadataCopyTagWithPath
     * <p>
     * Searches for a specific CGImageMetadataTag in a CGImageMetadataRef
     * <p>
     * This is the primary function for clients to obtain specific
     * metadata properties from an image. The 'path' mechanism provides a way to
     * access both simple top-level properties, such as Date & Time, or complex
     * deeply-nested properties with ease.
     *
     * @param metadata A collection of metadata tags.
     * @param parent   A parent tag. If NULL, the path is relative to the root of the
     *                 CGImageMetadataRef (i.e. it is not a child of another property). If the parent
     *                 is provided, the effective path will be the concatenation of the parent's path
     *                 and the 'path' parameter. This is useful for accessing array elements or
     *                 structure fields inside nested tags.
     * @param path     A string representing a path to the desired tag. Paths consist of
     *                 a tag prefix (i.e. "exif") joined with a tag name (i.e. "Flash") by a colon
     *                 (":"), such as CFSTR("exif:Flash").
     *                 Elements of ordered and unordered arrays are accessed via 0-based indices inside square [] brackets.
     *                 Elements of alternate-text arrays are accessed by an RFC 3066 language code inside square [] brackets.
     *                 Fields of a structure are delimited by a period, '.'.
     *                 Qualifiers are delimited by the '?' character. Only tags with string values (kCGImageMetadataTypeString)
     *                 are allowed to have qualifiers - arrays and structures may not contain qualifiers.
     *                 <p>
     *                 If parent is NULL, a prefix must be specified for the first tag. Prefixes for
     *                 all subsequent tags are optional. If unspecified, the prefix is
     *                 inherented from the nearest parent tag with a prefix. Custom prefixes must be
     *                 registered using @link CGImageMetadataRegisterNamespaceForPrefix @/link prior to use
     *                 in any path-based functions.
     *                 <p>
     *                 Examples:
     *                 <ul>
     *                   <li>'path' = CFSTR("xmp:CreateDate")</li>
     *                   <li>'path' = CFSTR("exif:Flash.Fired")</li>
     *                   <li>'parent' = tag at path CFSTR("exif:Flash"), path = CFSTR("exif:Fired") (equivilent to previous)</li>
     *                   <li>'path' = CFSTR("exif:Flash.RedEyeMode")</li>
     *                   <li>'path' = CFSTR("dc:title")</li>
     *                   <li>'path' = CFSTR("dc:subject")</li>
     *                   <li>'path' = CFSTR("dc:subject[2]") </li>
     *                   <li>'parent' = tag at path CFSTR("dc:subject"), path = CFSTR("[2]") (equivilent to previous)</li>
     *                   <li>'path' = CFSTR("dc:description[x-default])"</li>
     *                   <li>'path' = CFSTR("dc.description[de])"</li>
     *                   <li>'path' = CFSTR("dc.description[fr])"</li>
     *                   <li>'path' = CFSTR("foo:product)"</li>
     *                   <li>'path' = CFSTR("foo:product?bar:manufacturer)"</li>
     *                 </ul>
     * @return Returns a copy of CGImageMetadataTag matching 'path', or NULL if no
     * match is found. The copy of the tag's value is shallow. Tags
     * copied from an immutable CGImageMetadataRef are also immutable. Because this
     * function returns a copy of the tag's value, any modification of the tag's
     * value must be followed by a CGImageMetadataSetTagWithPath to commit the
     * change to the metadata container.
     */
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagWithPath(CGImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    /**
     * [@function] CGImageMetadataCopyStringValueWithPath
     * <p>
     * Searches for a specific tag in a CGImageMetadataRef and returns its
     * string value.
     * <p>
     * This is a convenience method for searching for a tag at path and
     * extracting the string value.
     *
     * @param metadata A collection of metadata tags.
     * @param parent   A parent tag. If NULL, the path is relative to the root of the
     *                 CGImageMetadataRef (i.e. it is not a child of another property).
     * @param path     A string with the path to the desired tag. Please consult
     *                 the documentation of @link CGImageMetadataCopyTagWithPath @/link for
     *                 information about path syntax.
     * @return Returns a string from a CGImageMetadataTag located at 'path'. The
     * tag must be of type kCGImageMetadataTypeString or kCGImageMetadataTypeAlternateText.
     * For AlternateText tags, the element with the "x-default" language qualifier
     * will be returned. For other types, NULL will be returned.
     */
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataCopyStringValueWithPath(CGImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    /**
     * ****************************************************************************
     * Functions for modifying a CGMutableImageMetadataRef
     * ****************************************************************************
     * *! @functiongroup Modifying a CGMutableImageMetadataRef
     * [@function] CGImageMetadataRegisterNamespaceForPrefix
     * <p>
     * Associates an XMP namespace URI with a prefix string.
     * <p>
     * This allows ImageIO to create custom metadata when it encounters
     * an unrecognized prefix in a path (see CGImageMetadataCopyTagWithPath for more
     * information about path syntax). A namespace must be registered before it can
     * be used to add custom metadata. All namespaces found in the image's metadata,
     * or defined as a constant above, will be pre-registered. Namespaces and
     * prefixes must be unique.
     *
     * @return Returns true if successful. Returns false and sets 'err' if an error
     * or conflict occurs.
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataRegisterNamespaceForPrefix(CGMutableImageMetadataRef metadata,
            CFStringRef xmlns, CFStringRef prefix, Ptr<CFErrorRef> err);

    /**
     * [@function] CGImageMetadataSetTagWithPath
     * <p>
     * Sets the tag at a specific path in a CGMutableImageMetadata container or a parent tag
     * <p>
     * This is the primary function for adding new metadata tags to a
     * metadata container, or updating existing tags. All tags required to reach
     * the final tag (at the end of the path) will be created, if needed. Tags will
     * created with default types (ordered arrays). Creating tags will fail if a
     * prefix is encountered that has not been registered. Use
     * [@link] CGImageMetadataRegisterNamespaceForPrefix @/link to associate a prefix
     * with a namespace prior to using a path-based CGImageMetadata function.
     * Note that if a parent tag is provided,
     * the children of that tag reference will be modified, which may be a different
     * reference from the tag stored in the metadata container. Since tags are normally
     * obtained as a copy, it is typically neccesary to use CGImageMetadataSetTagWithPath
     * to commit the changed parent object back to the metadata container (using
     * the parent's path and NULL for the parent).
     * [@link] CGImageMetadataCreateMutable @/link to obtain a mutable metadata container.
     *
     * @param metadata A mutable collection of metadata tags.
     *                 Use @link CGImageMetadataCreateMutableCopy @/link or
     * @param parent   A parent tag. If NULL, the path is relative to the root of the
     *                 CGImageMetadataRef (i.e. it is not a child of another property).
     *                 Note that if a parent tag is provided,
     *                 the children of that tag reference will be modified, which may be a different
     *                 reference from the tag stored in the metadata container. Since tags are normally
     *                 obtained as a copy, it is typically neccesary to use CGImageMetadataSetTagWithPath
     *                 to commit the changed parent object back to the metadata container (using
     *                 the parent's path and NULL for the parent).
     * @param path     A string with the path to the desired tag. Please consult
     *                 the documentation of @link CGImageMetadataCopyTagWithPath @/link for
     *                 information about path syntax.
     * @param tag      The CGImageMetadataTag to be added to the metadata. The tag
     *                 will be retained.
     * @return Returns true if successful, false otherwise.
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetTagWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path, CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataSetValueWithPath
     * <p>
     * Sets the value of the tag at a specific path in a CGMutableImageMetadataRef container or a parent tag
     * <p>
     * This function is used to add new metadata values to a
     * metadata container, or update existing tag values. All tags required to reach
     * the final tag (at the end of the path) are created, if needed. Tags are
     * created with default types (i.e. arrays will be ordered). Creating tags will
     * fail if a prefix is encountered that has not been registered. Use
     * [@link] CGImageMetadataRegisterNamespaceForPrefix @/link to associate a prefix
     * with a namespace prior to using a path-based CGImageMetadata function.
     * <p>
     * Examples
     * <ul>
     *     <li>'path' = CFSTR("xmp:CreateDate"), 'value' = CFSTR("2011-09-20T14:54:47-08:00")</li>
     *     <li>'path' = CFSTR("dc:subject[0]"), 'value' = CFSTR("San Francisco")</li>
     *     <li>'path' = CFSTR("dc:subject[1]"), 'value' = CFSTR("Golden Gate Bridge")</li>
     *     <li>'path' = CFSTR("dc:description[en]") 'value' = CFSTR("my image description")</li>
     *     <li>'path' = CFSTR("dc:description[de]") 'value' = CFSTR("meine bildbeschreibung")</li>
     * </ul>
     * Note that if a parent tag is provided,
     * the children of that tag reference will be modified, which may be a different
     * reference from the tag stored in the metadata container. Since tags are normally
     * obtained as a copy, it is typically neccesary to use CGImageMetadataSetTagWithPath
     * to commit the changed parent object back to the metadata container (using
     * the parent's path and NULL for the parent).
     * [@link] CGImageMetadataCreateMutable @/link to obtain a mutable metadata container.
     *
     * @param metadata A mutable collection of metadata tags.
     *                 Use @link CGImageMetadataCreateMutableCopy @/link or
     * @param parent   A parent tag. If NULL, the path is relative to the root of the
     *                 CGImageMetadataRef (i.e. it is not a child of another property).
     * @param path     A string with the path to the desired tag. Please consult
     *                 the documentation of @link CGImageMetadataCopyTagWithPath @/link for
     *                 information about path syntax.
     * @param value    The value to be added to the CGImageMetadataTag matching the path.
     *                 The tag will be retained. The restrictions for the value are the same as in @link
     *                 CGImageMetadataTagCreate @/link.
     * @return Returns true if successful, false otherwise.
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path, ConstVoidPtr value);

    /**
     * [@function] CGImageMetadataRemoveTagWithPath
     * <p>
     * Removes the tag at a specific path from a CGMutableImageMetadata container or from the parent tag
     * <p>
     * Use this function to delete a metadata tag matching a specific
     * path from a mutable metadata container. Note that if a parent tag is provided,
     * the children of that tag reference will be modified, which may be a different
     * reference from the tag stored in the metadata container. Since tags are normally
     * obtained as a copy, it is typically neccesary to use CGImageMetadataSetTagWithPath
     * to commit the changed parent object back to the metadata container (using
     * the parent's path and NULL for the parent).
     *
     * @param parent A parent tag. If NULL, the path is relative to the root of the
     *               CGImageMetadataRef (i.e. it is not a child of another property).
     * @param path   A string with the path to the desired tag. Please consult
     *               the documentation of @link CGImageMetadataCopyTagWithPath @/link for
     *               information about path syntax.
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataRemoveTagWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    /**
     * [@function] CGImageMetadataEnumerateTagsUsingBlock
     * <p>
     * Executes a given block using each tag in the metadata
     * <p>
     * This function iterates over all of the tags in a
     * CGImageMetadataRef, executing the block for each tag. The default behavior
     * iterates over all top-level tags in the metadata. The path of the tag and
     * the tag itself is passed to the block. The metadata cannot be modified inside
     * the block - consider adding the tags of interest into another collection.
     *
     * @param metadata A collection of metadata tags.
     * @param rootPath Iteration will occur for all children of the tag matching
     *                 the root path. Please refer to CGImageMetadataCopyTagWithPath for information
     *                 about path syntax. If NULL or an empty string, the block will be executed
     *                 for all top-level tags in the metadata container.
     * @param options  A dictionary of options for iterating through the tags.
     *                 Currently the only supported option is kCGImageMetadataEnumerateRecursively,
     *                 which should be set to a CFBoolean.
     * @param block    The block that is executed for each tag in metadata.
     */
    @Generated
    @CFunction
    public static native void CGImageMetadataEnumerateTagsUsingBlock(CGImageMetadataRef metadata, CFStringRef rootPath,
            CFDictionaryRef options,
            @ObjCBlock(name = "call_CGImageMetadataEnumerateTagsUsingBlock") Block_CGImageMetadataEnumerateTagsUsingBlock block);

    /**
     * *! @functiongroup Working with CGImageProperties
     * [@function] CGImageMetadataCopyTagMatchingImageProperty
     * <p>
     * Searches for a specific CGImageMetadataTag matching a kCGImageProperty constant
     * <p>
     * Provides a bridge for values from CGImageCopyPropertiesAtIndex, simplifying
     * access for properties defined in EXIF and IPTC standards, which have no notion of
     * namespaces, prefixes, or XMP property types.
     * Metadata Working Group guidance is factored into the mapping of CGImageProperties to
     * XMP compatible CGImageMetadataTags.
     * For example, kCGImagePropertyExifDateTimeOriginal will get the value of the
     * corresponding XMP tag, which is photoshop:DateCreated. Note that property values will
     * still be in their XMP forms, such as "YYYY-MM-DDThh:mm:ss" for DateTime, rather than
     * the EXIF or IPTC DateTime formats.
     *
     * @param metadata       A collection of metadata tags
     * @param dictionaryName the metadata subdictionary to which the image property belongs,
     *                       such as kCGImagePropertyExifDictionary or kCGImagePropertyIPTCDictionary. Not all
     *                       dictionaries and properties are supported at this time.
     * @param propertyName   the name of the property. This must be a defined property constant
     *                       corresponding to the 'dictionaryName'. For example, kCGImagePropertyTIFFOrientation,
     *                       kCGImagePropertyExifDateTimeOriginal, or kCGImagePropertyIPTCKeywords. A warning
     *                       will be logged if the CGImageProperty is unsupported by CGImageMetadata.
     * @return Returns a CGImageMetadataTagRef with the appropriate namespace, prefix,
     * tag name, and XMP value for the corresponding CGImageProperty. Returns NULL if the
     * property could not be found.
     */
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagMatchingImageProperty(CGImageMetadataRef metadata,
            CFStringRef dictionaryName, CFStringRef propertyName);

    /**
     * [@function] CGImageMetadataSetValueMatchingImageProperty
     * <p>
     * Sets the value of the CGImageMetadataTag matching a kCGImageProperty constant
     * <p>
     * Provides a bridge for values from CGImageCopyPropertiesAtIndex, simplifying
     * changing property values defined in EXIF and IPTC standards, which have no notion of
     * namespaces, prefixes, or XMP property types.
     * Metadata Working Group guidance is factored into the mapping of CGImageProperties to
     * XMP compatible CGImageMetadataTags.
     * For example, setting kCGImagePropertyExifDateTimeOriginal will set the value of the
     * corresponding XMP tag, which is photoshop:DateCreated. Note that property values should
     * still be in their XMP forms, such as "YYYY-MM-DDThh:mm:ss" for DateTime, rather than
     * the EXIF or IPTC DateTime formats. Although this function will allow the caller to set
     * custom values for these properties, you should consult the appropriate specifications
     * for details about property value formats for EXIF and IPTC tags in XMP.
     *
     * @param metadata       A mutable collection of metadata tags
     * @param dictionaryName the metadata subdictionary to which the image property belongs,
     *                       such as kCGImagePropertyExifDictionary or kCGImagePropertyIPTCDictionary. Not all
     *                       dictionaries and properties are supported at this time.
     * @param propertyName   the name of the property. This must be a defined property constant
     *                       corresponding to the 'dictionaryName'. For example, kCGImagePropertyTIFFOrientation,
     *                       kCGImagePropertyExifDateTimeOriginal, or kCGImagePropertyIPTCKeywords. A warning
     *                       will be logged if the CGImageProperty is unsupported by CGImageMetadata.
     * @param value          A CFTypeRef with the value for the tag. The same value restrictions apply
     *                       as in @link CGImageMetadataTagCreate @/link.
     * @return Returns true if successful, false otherwise.
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueMatchingImageProperty(CGMutableImageMetadataRef metadata,
            CFStringRef dictionaryName, CFStringRef propertyName, ConstVoidPtr value);

    /**
     * [@function] CGImageMetadataCreateXMPData
     * <p>
     * Serializes the CGImageMetadataRef to XMP data
     * <p>
     * This converts all of the metadata tags to a block of XMP data. Common uses
     * include creating sidecar files that contain metadata for image formats that do not
     * support embedded XMP, or cannot be edited due to other format restrictions (such as
     * proprietary RAW camera formats).
     *
     * @param metadata A collection of metadata tags.
     * @param options  should be NULL. Options are currently not used, but may be used in
     *                 future release.
     * @return Returns a CFData containing an XMP representation of the metadata. Returns
     * NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native CFDataRef CGImageMetadataCreateXMPData(CGImageMetadataRef metadata, CFDictionaryRef options);

    /**
     * [@function] CGImageMetadataCreateFromXMPData
     * <p>
     * Creates a collection of CGImageMetadataTags from a block of XMP data
     * <p>
     * Converts XMP data into a collection of metadata tags.
     * The data must be a complete XMP tree. XMP packet  headers (<?xpacket .. ?>) are
     * supported.
     *
     * @param data The XMP data.
     * @return Returns a collection of CGImageMetadata tags. Returns NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageMetadataCreateFromXMPData(CFDataRef data);

    /**
     * Return the CFTypeID for CGImageSources.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetTypeID();

    /**
     * Return an array of supported type identifiers.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGImageSourceCopyTypeIdentifiers();

    /**
     * Create an image source reading from the data provider `provider'. The
     * `options' dictionary may be used to request additional creation options;
     * see the list of keys above for more information.
     */
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithDataProvider(CGDataProviderRef provider,
            CFDictionaryRef options);

    /**
     * Create an image source reading from `data'.  The `options' dictionary
     * may be used to request additional creation options; see the list of keys
     * above for more information.
     */
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithData(CFDataRef data, CFDictionaryRef options);

    /**
     * Create an image source reading from `url'. The `options' dictionary may
     * be used to request additional creation options; see the list of keys
     * above for more information.
     */
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithURL(CFURLRef url, CFDictionaryRef options);

    /**
     * Return the type identifier of the image source `isrc'.  This type is the
     * type of the source "container", which is not necessarily the type of the
     * image(s) in the container.  For example, the .icns format supports
     * embedded JPEG2000 but the source type will be "com.apple.icns".
     */
    @Generated
    @CFunction
    public static native CFStringRef CGImageSourceGetType(CGImageSourceRef isrc);

    /**
     * Return the number of images (not including thumbnails) in the image
     * source `isrc'.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetCount(CGImageSourceRef isrc);

    /**
     * Return the properties of the image source `isrc'.  These properties
     * apply to the container in general but not necessarily to any individual
     * image that it contains.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyProperties(CGImageSourceRef isrc, CFDictionaryRef options);

    /**
     * Return the properties of the image at `index' in the image source
     * `isrc'.  The index is zero-based. The `options' dictionary may be used
     * to request additional options; see the list of keys above for more
     * information.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyPropertiesAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    /**
     * Return the metadata of the image at `index' in the image source
     * `isrc'. The index is zero-based. The `options' dictionary may be used
     * to request additional options; see the list of keys above for more
     * information. Please refer to CGImageMetadata.h for usage of metadata.
     */
    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageSourceCopyMetadataAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    /**
     * Return the image at `index' in the image source `isrc'.  The index is
     * zero-based. The `options' dictionary may be used to request additional
     * creation options; see the list of keys above for more information.
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateImageAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    /**
     * Remove the cached decoded image data for the image at `index' in the image source `isrc'.
     * The index is zero-based.
     */
    @Generated
    @CFunction
    public static native void CGImageSourceRemoveCacheAtIndex(CGImageSourceRef isrc, @NUInt long index);

    /**
     * Return the thumbnail of the image at `index' in the image source `isrc'.
     * The index is zero-based. The `options' dictionary may be used to request
     * additional thumbnail creation options; see the list of keys above for
     * more information.
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateThumbnailAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    /**
     * Create an incremental image source. No data is provided at creation
     * time; it is assumed that data will eventually be provided using
     * "CGImageSourceUpdateDataProvider" or "CGImageSourceUpdateData".  The
     * `options' dictionary may be used to request additional creation options;
     * see the list of keys above for more information.
     */
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateIncremental(CFDictionaryRef options);

    /**
     * Update the incremental image source `isrc' with new data.  The new data
     * must include all the previous data plus any additional new data. The
     * `final' parameter should be true when the final set of data is provided;
     * false otherwise.
     */
    @Generated
    @CFunction
    public static native void CGImageSourceUpdateData(CGImageSourceRef isrc, CFDataRef data, boolean final_);

    /**
     * Update the incremental image source `isrc' with a new data provider.
     * The new data provider must provide all the previous data plus any
     * additional new data. The `final' parameter should be true when the final
     * set of data is provided; false otherwise.
     */
    @Generated
    @CFunction
    public static native void CGImageSourceUpdateDataProvider(CGImageSourceRef isrc, CGDataProviderRef provider,
            boolean final_);

    /**
     * Return the overall status of the image source `isrc'.  The status is
     * particularly informative for incremental image sources, but may be used
     * by clients providing non-incremental data as well.
     */
    @Generated
    @CFunction
    public static native int CGImageSourceGetStatus(CGImageSourceRef isrc);

    /**
     * Return the current status of the image at `index' in the image source
     * `isrc'. The index is zero-based. The returned status is particularly
     * informative for incremental image sources but may used by clients
     * providing non-incremental data as well.
     */
    @Generated
    @CFunction
    public static native int CGImageSourceGetStatusAtIndex(CGImageSourceRef isrc, @NUInt long index);

    /**
     * Return the CFTypeID for CGImageDestinations.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageDestinationGetTypeID();

    /**
     * Return an array of supported type identifiers.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGImageDestinationCopyTypeIdentifiers();

    /**
     * Create an image destination writing to the data consumer `consumer'.
     * The parameter `type' specifies the type identifier of the resulting
     * image file.  Constants for `type' are found in the LaunchServices framework
     * header UTCoreTypes.h.  The parameter `count' specifies number of images
     * (not including thumbnails) that the image file will contain. The `options'
     * dictionary is reserved for future use; currently, you should pass NULL for
     * this parameter.
     */
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithDataConsumer(CGDataConsumerRef consumer,
            CFStringRef type, @NUInt long count, CFDictionaryRef options);

    /**
     * Create an image destination writing to `data'. The parameter `type'
     * specifies the type identifier of the resulting image file.  Constants for
     * `type' are found in the LaunchServices framework header UTCoreTypes.h.  The
     * parameter `count' specifies number of images (not including thumbnails)
     * that the image file will contain. The `options' dictionary is reserved
     * for future use; currently, you should pass NULL for this parameter.
     */
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithData(CFMutableDataRef data, CFStringRef type,
            @NUInt long count, CFDictionaryRef options);

    /**
     * Create an image destination writing to `url'. The parameter `type'
     * specifies the type identifier of the resulting image file.  Constants for
     * `type' are found in the LaunchServices framework header UTCoreTypes.h.  The
     * parameter `count' specifies number of images (not including thumbnails)
     * that the image file will contain. The `options' dictionary is reserved
     * for future use; currently, you should pass NULL for this parameter.
     * Note that if `url' already exists, it will be overwritten.
     */
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithURL(CFURLRef url, CFStringRef type,
            @NUInt long count, CFDictionaryRef options);

    /**
     * Specify the dictionary `properties' of properties which apply to all
     * images in the image destination `idst'.
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationSetProperties(CGImageDestinationRef idst, CFDictionaryRef properties);

    /**
     * Set the next image in the image destination `idst' to be `image' with
     * optional properties specified in `properties'.  An error is logged if
     * more images are added than specified in the original count of the image
     * destination.
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImage(CGImageDestinationRef idst, CGImageRef image,
            CFDictionaryRef properties);

    /**
     * Set the next image in the image destination `idst' to be the image at
     * `index' in the image source `isrc'.  The index is zero-based. The
     * properties of the source image can be added to or overriden by supplying
     * additional keys/values in `properties'.  If a key in `properties' has
     * the value kCFNull, the corresponding property in the destination will be
     * removed.
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageFromSource(CGImageDestinationRef idst, CGImageSourceRef isrc,
            @NUInt long index, CFDictionaryRef properties);

    /**
     * Write everything to the destination data, url or consumer of the image
     * destination `idst'.  You must call this function or the image
     * destination will not be valid.  After this function is called, no
     * additional data will be written to the image destination.  Return true
     * if the image was successfully written; false otherwise.
     */
    @Generated
    @CFunction
    public static native boolean CGImageDestinationFinalize(CGImageDestinationRef idst);

    /**
     * Set the next image in the image destination `idst' to be `image' with
     * metadata properties specified in `metadata'. An error is logged if more
     * images are added than specified in the original count of the image
     * destination.
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageAndMetadata(CGImageDestinationRef idst, CGImageRef image,
            CGImageMetadataRef metadata, CFDictionaryRef options);

    /**
     * Losslessly copies the contents of the image source, 'isrc', to the
     * destination, 'idst'. The image data will not be modified. The image's
     * metadata can be modified by adding the keys and values defined above to
     * 'options'. No other images should be added to the image destination.
     * CGImageDestinationFinalize() should not be called afterward -
     * the result is saved to the destination when this function returns.
     * The image type of the destination must match the image source. Returns true
     * if the operation was successful. If an error occurs, false will be returned
     * and 'err' will be set to a CFErrorRef. Not all image formats are supported
     * for this operation.
     */
    @Generated
    @CFunction
    public static native boolean CGImageDestinationCopyImageSource(CGImageDestinationRef idst, CGImageSourceRef isrc,
            CFDictionaryRef options, Ptr<CFErrorRef> err);

    /**
     * Public, common namespaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExif();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifAux();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifEX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceDublinCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespacePhotoshop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPRights();

    /**
     * Public, common prefixes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExif();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifAux();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifEX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixDublinCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixPhotoshop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPRights();

    /**
     * A key for the 'options' of CGImageMetadataEnumerateTagsUsingBlock. If present,
     * the value should be a CFBoolean. If true, tags will be enumerated recursively,
     * if false, only the direct children of 'rootPath' will be enumerated.
     * The default is non-recursive.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataEnumerateRecursively();

    /**
     * [@constant] kCFErrorDomainCGImageMetadata
     * <p>
     * Error domain for all errors originating in ImageIO for CGImageMetadata APIs.
     * Error codes may be interpreted using the list below.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCGImageMetadata();

    /**
     * Specifies the "best guess" of the type identifier for the format of the
     * image source file. If specified, the value of this key must be a
     * CFStringRef. For more information about type identifiers, see "UTType.h"
     * in the Application Services framework.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceTypeIdentifierHint();

    /**
     * Specifies whether the image should be cached in a decoded form. The
     * value of this key must be a CFBooleanRef.
     * kCFBooleanFalse indicates no caching, kCFBooleanTrue indicates caching.
     * For 64-bit architectures, the default is kCFBooleanTrue, for 32-bit the default is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCache();

    /**
     * Specifies whether image decoding and caching should happen at image creation time.
     * The value of this key must be a CFBooleanRef. The default value is kCFBooleanFalse (image decoding will
     * happen at rendering time).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCacheImmediately();

    /**
     * Specifies whether the image should be returned as a floating
     * point CGImageRef if supported by the file format. Extended
     * range floating point CGImageRef may require additional
     * processing  to render pleasingly.  The value of this key must
     * be a CFBooleanRef; the default value is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldAllowFloat();

    /**
     * Specifies whether a thumbnail should be automatically created for an
     * image if a thumbnail isn't present in the image source file.  The
     * thumbnail will be created from the full image, subject to the limit
     * specified by kCGImageSourceThumbnailMaxPixelSize---if a maximum pixel
     * size isn't specified, then the thumbnail will be the size of the full
     * image, which probably isn't what you want. The value of this key must be
     * a CFBooleanRef; the default value of this key is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailFromImageIfAbsent();

    /**
     * Specifies whether a thumbnail should be created from the full image even
     * if a thumbnail is present in the image source file. The thumbnail will
     * be created from the full image, subject to the limit specified by
     * kCGImageSourceThumbnailMaxPixelSize---if a maximum pixel size isn't
     * specified, then the thumbnail will be the size of the full image, which
     * probably isn't what you want. The value of this key must be a
     * CFBooleanRef; the default value of this key is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailFromImageAlways();

    /**
     * Specifies the maximum width and height in pixels of a thumbnail.  If
     * this this key is not specified, the width and height of a thumbnail is
     * not limited and thumbnails may be as big as the image itself.  If
     * present, this value of this key must be a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceThumbnailMaxPixelSize();

    /**
     * Specifies whether the thumbnail should be rotated and scaled according
     * to the orientation and pixel aspect ratio of the full image. The value
     * of this key must be a CFBooleanRef; the default value of this key is
     * kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailWithTransform();

    /**
     * Specifies that, if possible, an image should be returned as scaled down (in height and width) by a specified factor.
     * The resulting image will be smaller and have reduced spatial quality but will otherwise have the same characteristics
     * as the full size normal image.
     * If the specified scaling factor is not supported, a larger or full size normal image will be returned.
     * Supported file formats are JPEG, HEIF, TIFF, and PNG.
     * The value of this key must be an integer CFNumberRef (allowed values: 2, 4, and 8).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceSubsampleFactor();

    /**
     * The desired compression quality to use when writing to an image
     * destination. If present, the value of this key is a CFNumberRef
     * in the range 0.0 to 1.0. A value of 1.0 implies lossless
     * compression is desired if destination format supports it.
     * A value of 0.0 implies that that maximum compression is
     * desired.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationLossyCompressionQuality();

    /**
     * The desired background color to composite against when writing
     * an image with alpha to a destination format that does not support
     * alpha. If present, the value of this key is a CGColorRef without
     * any alpha component of its own.  If not present a white color
     * will be used if needed.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationBackgroundColor();

    /**
     * Rescale the image to the maximum width and height in pixels.
     * If present, this value of this key must be a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationImageMaxPixelSize();

    /**
     * Enable or disable thumbnail embedding for JPEG and HEIF.
     * The value should be kCFBooleanTrue or kCFBooleanFalse. Defaults to kCFBooleanFalse
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationEmbedThumbnail();

    /**
     * Create an image using a colorspace, that has is compatible with older devices
     * The value should be kCFBooleanTrue or kCFBooleanFalse
     * Defaults to kCFBooleanFalse = don't do any color conversion
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOptimizeColorForSharing();

    /**
     * Set the metadata tags for the image destination. If present, the value of
     * this key is a CGImageMetadataRef. By default, all EXIF, IPTC, and XMP tags
     * will be replaced. Use kCGImageDestinationMergeMetadata to merge the tags
     * with the existing tags in the image source.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationMetadata();

    /**
     * If true, The metadata will be copied from the source and merged with the tags
     * specified in kCGImageDestinationMetadata. If a tag does not exist in the
     * source, it will be added. If the tag exists in the source, it will be
     * updated. A metadata tag can be removed by setting the tag's value to
     * kCFNull. If present, the value of this key is a CFBoooleanRef. The default
     * is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationMergeMetadata();

    /**
     * XMP data will not be written to the destination. If used in conjunction with
     * kCGImageDestinationMetadata, EXIF tags will be preserved, but
     * an XMP packet will not be written to the file. IPTC tags, that are stored in XMP, will not be preserved.
     * If present, the value for this key is a CFBooleanRef. The default is kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeXMP();

    /**
     * If true, GPS metadata will not be written to EXIF data or the corresponding
     * EXIF tags in XMP. This flag cannot filter any proprietary location data that
     * could be stored in a manufacturer's EXIF MakerNote or custom XMP properties.
     * If present, the value for this key is a CFBooleanRef. The default is
     * kCFBooleanFalse.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeGPS();

    /**
     * Updates the DateTime parameters of the image metadata. Only values
     * present in the original image will updated. If present, the value should
     * be a CFStringRef or a CFDateRef. If CFString, the value must be in
     * Exif DateTime or ISO 8601 DateTime format. This option is mutually
     * exclusive with kCGImageDestinationMetadata.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationDateTime();

    /**
     * Updates the orientation in the image metadata. The image data itself will
     * not be rotated. If present, the value should be a CFNumberRef from 1 to 8.
     * This option is mutually exclusive with kCGImageDestinationMetadata.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOrientation();

    /**
     * Properties that, if returned by CGImageSourceCopyProperties or
     * CGImageSourceCopyPropertiesAtIndex, contain a dictionary of file-format
     * or metadata-format specific key-values.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyRawDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerMinoltaDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerFujiDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerOlympusDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerPentaxDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerAppleDictionary();

    /**
     * The size of the image file in bytes, if known. If present, the value of
     * this key is a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileSize();

    /**
     * The number of pixels in the x- and y-dimensions. The value of these keys
     * is a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelWidth();

    /**
     * The DPI in the x- and y-dimensions, if known. If present, the value of
     * these keys is a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIWidth();

    /**
     * The number of bits in each color sample of each pixel. The value of this
     * key is a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDepth();

    /**
     * The intended display orientation of the image. If present, the value
     * of this key is a CFNumberRef with the same value as defined by the
     * TIFF and Exif specifications.  That is:
     * 1  =  0th row is at the top, and 0th column is on the left.
     * 2  =  0th row is at the top, and 0th column is on the right.
     * 3  =  0th row is at the bottom, and 0th column is on the right.
     * 4  =  0th row is at the bottom, and 0th column is on the left.
     * 5  =  0th row is on the left, and 0th column is the top.
     * 6  =  0th row is on the right, and 0th column is the top.
     * 7  =  0th row is on the right, and 0th column is the bottom.
     * 8  =  0th row is on the left, and 0th column is the bottom.
     * If not present, a value of 1 is assumed.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOrientation();

    /**
     * The value of this key is kCFBooleanTrue if the image contains floating-
     * point pixel samples
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsFloat();

    /**
     * The value of this key is kCFBooleanTrue if the image contains indexed
     * (a.k.a. paletted) pixel samples
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsIndexed();

    /**
     * The value of this key is kCFBooleanTrue if the image contains an alpha
     * (a.k.a. coverage) channel
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHasAlpha();

    /**
     * The color model of the image such as "RGB", "CMYK", "Gray", or "Lab".
     * The value of this key is CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModel();

    /**
     * The name of the optional ICC profile embedded in the image, if known.
     * If present, the value of this key is a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyProfileName();

    /**
     * Possible values for kCGImagePropertyColorModel property
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelCMYK();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelLab();

    /**
     * Possible keys for kCGImagePropertyTIFFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCompression();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPhotometricInterpretation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDocumentName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFMake();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFXResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFYResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFResolutionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFSoftware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTransferFunction();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDateTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFArtist();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFHostComputer();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFWhitePoint();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPrimaryChromaticities();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileLength();

    /**
     * Possible keys for kCGImagePropertyJFIFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFXDensity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFYDensity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDensityUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFIsProgressive();

    /**
     * Possible keys for kCGImagePropertyExifDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureProgram();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpectralSensitivity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedRatings();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOECF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensitivityType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifStandardOutputSensitivity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRecommendedExposureIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeed();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudeyyy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudezzz();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifComponentsConfiguration();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompressedBitsPerPixel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifShutterSpeedValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifApertureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBrightnessValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureBiasValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMaxApertureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMeteringMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLightSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlash();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectArea();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMakerNote();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifUserComment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashPixVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelXDimension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelYDimension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRelatedSoundFile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashEnergy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpatialFrequencyResponse();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneXResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneYResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneResolutionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectLocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensingMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFileSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCFAPattern();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCustomRendered();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifWhiteBalance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDigitalZoomRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLenIn35mmFilm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneCaptureType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGainControl();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifContrast();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSaturation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSharpness();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDeviceSettingDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistRange();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifImageUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCameraOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBodySerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSpecification();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensMake();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGamma();

    /**
     * Deprecated. See kCGImagePropertyExifSubsecTimeOriginal
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOrginal();

    /**
     * Possible keys for kCGImagePropertyExifAuxDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxImageNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFlashCompensation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFirmware();

    /**
     * Possible keys for kCGImagePropertyGIFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFImageColorMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFHasGlobalColorMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGGamma();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGInterlaceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGXPixelsPerMeter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGYPixelsPerMeter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGsRGBIntent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGChromaticities();

    /**
     * Possible keys for kCGImagePropertyPNGDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGAuthor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCreationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGModificationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSoftware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGUnclampedDelayTime();

    /**
     * Possible keys for kCGImagePropertyGPSDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTimeStamp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSatellites();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMeasureMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDOP();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeedRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeed();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrackRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrack();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirectionRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirection();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMapDatum();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearingRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearing();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistanceRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSProcessingMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAreaInformation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDateStamp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDifferental();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSHPositioningError();

    /**
     * Possible keys for kCGImagePropertyIPTCDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectTypeReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectAttributeReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditorialUpdate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCUrgency();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubjectReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCategory();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSupplementalCategory();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCFixtureIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCKeywords();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSpecialInstructions();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCActionAdvised();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceService();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCTimeCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginatingProgram();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProgramVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectCycle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCByline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCBylineTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubLocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginalTransmissionReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCHeadline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCredit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCopyrightNotice();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContact();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCaptionAbstract();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCWriterEditor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCLanguageIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCStarRating();

    /**
     * IPTC Core
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCreatorContactInfo();

    /**
     * IPTC Core
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCRightsUsageTerms();

    /**
     * IPTC Core
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCScene();

    /**
     * Possible keys for kCGImagePropertyIPTCCreatorContactInfo dictionary (part of IPTC Core - above)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCountry();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoAddress();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPostalCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoStateProvince();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoEmails();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPhones();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoWebURLs();

    /**
     * Possible keys for kCGImageProperty8BIMDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMLayerNames();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMVersion();

    /**
     * Possible keys for kCGImagePropertyDNGDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBackwardVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGUniqueCameraModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLocalizedCameraModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWhiteLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotNeutral();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotWhiteXY();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposure();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineNoise();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineSharpness();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPrivateData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibrationSignature();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCalibrationSignature();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpRectilinear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpFisheye();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGFixVignetteRadial();

    /**
     * Possible keys for kCGImagePropertyCIFFDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFirmware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageFileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseTiming();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFRecordID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFSelfTimingTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFContinuousDrive();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFocusMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeteringMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFShootingMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMaxMM();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMinMM();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFWhiteBalanceIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeasuredEV();

    /**
     * Possible keys for kCGImagePropertyMakerNikonDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSetting();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonColorMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonWhiteBalanceMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonSharpenMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashSetting();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSelection();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonImageAdjustment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensAdapter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDigitalZoom();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShootingMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShutterCount();

    /**
     * Possible keys for kCGImagePropertyMakerCanonDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonImageSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonContinuousDrive();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFirmware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonAspectRatioInfo();

    /**
     * Allows client to choose the filters applied before PNG compression
     * http://www.libpng.org/pub/png/book/chapter09.html#png.ch09.div.1
     * The value should be a CFNumber, of type long, containing a bitwise OR of the desired filters
     * The filters are defined below, IMAGEIO_PNG_NO_FILTERS, IMAGEIO_PNG_FILTER_NONE, etc
     * This value has no effect when compressing to any format other than PNG
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCompressionFilter();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGImageMetadataEnumerateTagsUsingBlock {
        @Generated
        boolean call_CGImageMetadataEnumerateTagsUsingBlock(CFStringRef path, CGImageMetadataTagRef tag);
    }

    /**
     * Depth data support for JPEG, HEIF, and DNG images.
     * The returned CFDictionary contains:
     * - the depth data (CFDataRef) - (kCGImageAuxiliaryDataInfoData),
     * - the depth data description (CFDictionary) - (kCGImageAuxiliaryDataInfoDataDescription)
     * - metadata (CGImageMetadataRef) - (kCGImageAuxiliaryDataInfoMetadata)
     * CGImageSourceCopyAuxiliaryDataInfoAtIndex returns nil if the image did not contain ‘auxiliaryImageDataType’ data.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyAuxiliaryDataInfoAtIndex(CGImageSourceRef isrc,
            @NUInt long index, CFStringRef auxiliaryImageDataType);

    /**
     * Auxiliary data support for JPEG, HEIF, and DNG images.
     * The auxiliaryDataInfoDictionary should contain:
     * - the auxiliary data (CFDataRef) - (kCGImageAuxiliaryDataInfoData),
     * - the auxiliary data description (CFDictionary) - (kCGImageAuxiliaryDataInfoDataDescription)
     * - metadata (CGImageMetadataRef) - (kCGImageAuxiliaryDataInfoMetadata)
     * To add auxiliary data to an image, call CGImageDestinationAddAuxiliaryDataInfo() after adding the CGImage to the CGImageDestinationRef.
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddAuxiliaryDataInfo(CGImageDestinationRef idst,
            CFStringRef auxiliaryImageDataType, CFDictionaryRef auxiliaryDataInfoDictionary);

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileContentsDictionary();

    /**
     * For use with CGImageSourceCopyAuxiliaryDataInfoAtIndex and CGImageDestinationAddAuxiliaryDataInfo:
     * These strings specify the 'auxiliaryImageDataType':
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDepth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDisparity();

    /**
     * Depth/Disparity data support for JPEG, HEIF, and DNG images:
     * CGImageSourceCopyAuxiliaryDataInfoAtIndex and CGImageDestinationAddAuxiliaryDataInfo will use these keys in the dictionary:
     * kCGImageAuxiliaryDataInfoData - the depth data (CFDataRef)
     * kCGImageAuxiliaryDataInfoDataDescription - the depth data description (CFDictionary)
     * kCGImageAuxiliaryDataInfoMetadata - metadata (CGImageMetadataRef)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoDataDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImageCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyBytesPerRow();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyNamedColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImages();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyThumbnailImages();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryDataType();

    /**
     * Return the primary image index for HEIF images.
     * Zero for all other formats.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetPrimaryImageIndex(CGImageSourceRef isrc);

    /**
     * Animate the sequence of images contained in the file at `url'. Currently supported image
     * formats are GIF and APNG. The `options' dictionary may be used to request additional playback
     * options; see the list of keys above for more information. The block is called on the main queue
     * at time intervals specified by the `delay time' of the image. The animation can be stopped by
     * setting the boolean parameter of the block to true.
     */
    @Generated
    @CFunction
    public static native int CGAnimateImageAtURLWithBlock(CFURLRef url, CFDictionaryRef options,
            @ObjCBlock(name = "call_CGAnimateImageAtURLWithBlock") Block_CGAnimateImageAtURLWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageAtURLWithBlock {
        @Generated
        void call_CGAnimateImageAtURLWithBlock(@NUInt long index, CGImageRef image, BoolPtr stop);
    }

    /**
     * Animate the sequence of images contained in `data'. Currently supported image
     * formats are GIF and APNG. The `options' dictionary may be used to request additional playback
     * options; see the list of keys above for more information. The block is called on the main queue
     * at time intervals specified by the `delay time' of the image. The animation can be stopped by
     * setting the boolean parameter of the block to true.
     */
    @Generated
    @CFunction
    public static native int CGAnimateImageDataWithBlock(CFDataRef data, CFDictionaryRef options,
            @ObjCBlock(name = "call_CGAnimateImageDataWithBlock") Block_CGAnimateImageDataWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageDataWithBlock {
        @Generated
        void call_CGAnimateImageDataWithBlock(@NUInt long index, CGImageRef image, BoolPtr stop);
    }

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCExtension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCExtension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRDictionary();

    /**
     * For HEIF images: the value of this key is kCFBooleanTrue if the image at the given index is the primary image.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPrimaryImage();

    /**
     * Possible keys for kCGImagePropertyHEICSDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceImageNumberOfCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceExposureTimesOfCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGComment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDisclaimer();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGWarning();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTerm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAddlModelInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkOrObject();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCircaDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContentDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContributionDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightNotice();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreatorID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkPhysicalDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInventoryNo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInvURL();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkStylePeriod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrateMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioChannelCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCircaDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCopyrightYear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtControlledVocabularyTerm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreen();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionD();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionH();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionW();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionY();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalImageGUID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceFileType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheet();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLinkQualifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbdEncRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprLangID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtExternalMetadataLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtFeedIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenre();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtHeadline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtIPTCLastEdited();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprLangID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationSublocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationWorldRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationShown();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtModelAge();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeard();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageWDetails();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCharacteristic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageGTIN();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRating();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRatingRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionSublocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionWorldRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMaxValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMinValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingSourceLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValueLogoLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryEntryRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryItemID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryOrganisationID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtReleaseReady();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeason();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeries();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStorylineIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStreamReady();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStylePeriod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageFrom();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageTo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscript();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLinkQualifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrateMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoDisplayAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoEncodingProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoStreamsCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVisualColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGActiveArea();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAnalogBalance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAntiAliasStrength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotPreProfileMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotProfileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposureOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBayerGreenSplit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBestQualityScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaH();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaV();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelRepeatDim();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFALayout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFAPlaneColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGChromaBlurRadius();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorimetricReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentPreProfileMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultBlackRender();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropOrigin();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultUserCrop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGExtraCameraProfiles();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearizationTable();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearResponseLimit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMakerNoteSafety();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMaskedAreas();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNewRawImageDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseReductionApplied();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalBestQualityFinalSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultCropSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultFinalSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewDateTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileEmbedPolicy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapDims();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapEncoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableDims();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableEncoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileToneCurve();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawDataUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawImageDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawToPreviewGain();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRowInterleaveFactor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGShadowScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGSubTileBlockSize();

    /**
     * Possible keys for kCGImagePropertyOpenEXRDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypePortraitEffectsMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationSkinMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationHairMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationTeethMatte();

    /**
     * Starts the animation at the given index. Defaults to 0
     * Value is a CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationStartIndex();

    /**
     * The value of this key overrides the `delay time' specified by the image
     * Value is a CFNumber of kCFNumberDoubleType.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationDelayTime();

    /**
     * The value of this key overrides the `loop count' specified by the image
     * Value is a CFNumber; kCFNumberPositiveInfinity may be used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPDictionary();

    /**
     * Possible keys for kCGImagePropertyWebPDictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPCanvasPixelHeight();

    /**
     * For CGImageDestinationAddImageFromSource: when set to kCFBooleanTrue, a HEIF-embedded GainMap will be preserved.
     * If the destination image is scaled (using kCGImageDestinationImageMaxPixelSize), the GainMap will be scaled accordingly.
     * The value should be kCFBooleanTrue or kCFBooleanFalse
     * Defaults to kCFBooleanFalse
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationPreserveGainMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTGADictionary();

    /**
     * Possible keys for kCGImagePropertyTGADictionary
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTGACompression();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationGlassesMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeHDRGainMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGPixelsAspectRatio();

    /**
     * For PNG files:
     * When writing indexed color PNGs, the data for the transparity chunk 'tRNS' can be passed in with this key.
     * The value (CFDataRef) should contain one byte transparency info for each entry in the indexed color map.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGTransparency();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationSkyMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImageIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroups();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupTypeStereoPair();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupTypeAlternate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImagesAlternate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIndexLeft();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIndexRight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsLeftImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsRightImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsAlternateImage();
}
