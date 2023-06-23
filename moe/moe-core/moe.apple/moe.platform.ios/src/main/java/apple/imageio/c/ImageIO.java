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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * 
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
     * 
     * Creates an empty CGMutableImageMetadataRef
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutable();

    /**
     * [@function] CGImageMetadataCreateMutableCopy
     * 
     * Creates a deep mutable copy of another CGImageMetadataRef
     * 
     * Before modifying an immutable CGImageMetadataRef (such as metadata
     * from CGImageSourceCopyMetadataAtIndex) you must first make a copy.
     * This function makes a deep copy of all CGImageMetadataTags and their values.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutableCopy(
            @NotNull CGImageMetadataRef metadata);

    /**
     * *! @functiongroup Creating and identifying CGImageMetadataTags
     * [@function] CGImageMetadataTagGetTypeID
     * 
     * Gets the type identifier for the CGImageMetadataTag opaque type
     * 
     * @return the type identifier for the CGImageMetadataTagGetTypeID opaque type
     * 
     *         API-Since: 7.0
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
     * 
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
     *         could not be created with the specified parameters.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataTagCreate(@NotNull CFStringRef xmlns,
            @Nullable CFStringRef prefix, @NotNull CFStringRef name, int type, @NotNull ConstVoidPtr value);

    /**
     * ****************************************************************************
     * Getting attributes of a CGImageMetadataTag
     * ****************************************************************************
     * *! @functiongroup Getting attributes of a CGImageMetadataTag
     * [@function] CGImageMetadataTagCopyNamespace
     * 
     * Returns a copy of the tag's namespace
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyNamespace(@NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyPrefix
     * 
     * Returns a copy of the tag's prefix
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyPrefix(@NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyName
     * 
     * Returns a copy of the tag's name
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyName(@NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyValue
     * 
     * Returns a shallow copy of the tag's value
     * 
     * This function should only be used to read the tag's value.
     * CGImageMetadataCopyTagWithPath returns a copy of the tag (including a copy of
     * the tag's value). Therefore mutating a tag's value returned from this function
     * may not actually mutate the value in the CGImageMetadata. It is recommended
     * to create a new tag followed by CGImageMetadataSetTagWithPath, or use
     * CGImageMetadataSetValueWithPath to mutate a metadata value.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CGImageMetadataTagCopyValue(@NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagGetType
     * 
     * Get the type of the CGImageMetadataTag
     * 
     * @return Returns a CGImageMetadataType constant for the CGImageMetadataTag.
     *         This is primarily used to determine how to interpret the tag's value.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int CGImageMetadataTagGetType(@NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataTagCopyQualifiers
     * 
     * Return a copy of the tag's qualifiers
     * 
     * XMP allows properties to contain supplemental properties called
     * qualifiers. Qualifiers are themselves CGImageMetadataTags with their own
     * namespace, prefix, name, and value. A common use is the xml:lang qualifier
     * for elements of an alternate-text array.
     * 
     * @return Returns a copy of the array of qualifiers. Elements of the array are
     *         CGImageMetadataTags. Returns NULL if the tag does not have any qualifiers.
     *         The copy is shallow, the qualifiers are not deep copied.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataTagCopyQualifiers(@NotNull CGImageMetadataTagRef tag);

    /**
     * ****************************************************************************
     * Functions for copying CGImageMetadataTagRefs from a CGImageMetadataRef.
     * These functions make it easier for the caller to traverse complex nested
     * structures of metadata, similar to KVC-compliant Objective-C classes.
     * ****************************************************************************
     * *! @functiongroup Retrieving CGImageMetadataTagRefs from a CGImageMetadataRef
     * [@function] CGImageMetadataCopyTags
     * 
     * Obtain an array of tags from a CGImageMetadataRef
     * 
     * @return Returns an array with a shallow copy of all top-level
     *         CGImageMetadataTagRefs in a CGImageMetadataRef.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataCopyTags(@NotNull CGImageMetadataRef metadata);

    /**
     * [@function] CGImageMetadataCopyTagWithPath
     * 
     * Searches for a specific CGImageMetadataTag in a CGImageMetadataRef
     * 
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
     *                 Elements of ordered and unordered arrays are accessed via 0-based indices inside square []
     *                 brackets.
     *                 Elements of alternate-text arrays are accessed by an RFC 3066 language code inside square []
     *                 brackets.
     *                 Fields of a structure are delimited by a period, '.'.
     *                 Qualifiers are delimited by the '?' character. Only tags with string values
     *                 (kCGImageMetadataTypeString)
     *                 are allowed to have qualifiers - arrays and structures may not contain qualifiers.
     * 
     *                 If parent is NULL, a prefix must be specified for the first tag. Prefixes for
     *                 all subsequent tags are optional. If unspecified, the prefix is
     *                 inherented from the nearest parent tag with a prefix. Custom prefixes must be
     *                 registered using @link CGImageMetadataRegisterNamespaceForPrefix @/link prior to use
     *                 in any path-based functions.
     * 
     *                 Examples:
     *                 <ul>
     *                 <li>'path' = CFSTR("xmp:CreateDate")</li>
     *                 <li>'path' = CFSTR("exif:Flash.Fired")</li>
     *                 <li>'parent' = tag at path CFSTR("exif:Flash"), path = CFSTR("exif:Fired") (equivilent to
     *                 previous)</li>
     *                 <li>'path' = CFSTR("exif:Flash.RedEyeMode")</li>
     *                 <li>'path' = CFSTR("dc:title")</li>
     *                 <li>'path' = CFSTR("dc:subject")</li>
     *                 <li>'path' = CFSTR("dc:subject[2]") </li>
     *                 <li>'parent' = tag at path CFSTR("dc:subject"), path = CFSTR("[2]") (equivilent to previous)</li>
     *                 <li>'path' = CFSTR("dc:description[x-default])"</li>
     *                 <li>'path' = CFSTR("dc.description[de])"</li>
     *                 <li>'path' = CFSTR("dc.description[fr])"</li>
     *                 <li>'path' = CFSTR("foo:product)"</li>
     *                 <li>'path' = CFSTR("foo:product?bar:manufacturer)"</li>
     *                 </ul>
     * @return Returns a copy of CGImageMetadataTag matching 'path', or NULL if no
     *         match is found. The copy of the tag's value is shallow. Tags
     *         copied from an immutable CGImageMetadataRef are also immutable. Because this
     *         function returns a copy of the tag's value, any modification of the tag's
     *         value must be followed by a CGImageMetadataSetTagWithPath to commit the
     *         change to the metadata container.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagWithPath(@NotNull CGImageMetadataRef metadata,
            @Nullable CGImageMetadataTagRef parent, @NotNull CFStringRef path);

    /**
     * [@function] CGImageMetadataCopyStringValueWithPath
     * 
     * Searches for a specific tag in a CGImageMetadataRef and returns its
     * string value.
     * 
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
     *         tag must be of type kCGImageMetadataTypeString or kCGImageMetadataTypeAlternateText.
     *         For AlternateText tags, the element with the "x-default" language qualifier
     *         will be returned. For other types, NULL will be returned.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataCopyStringValueWithPath(@NotNull CGImageMetadataRef metadata,
            @Nullable CGImageMetadataTagRef parent, @NotNull CFStringRef path);

    /**
     * ****************************************************************************
     * Functions for modifying a CGMutableImageMetadataRef
     * ****************************************************************************
     * *! @functiongroup Modifying a CGMutableImageMetadataRef
     * [@function] CGImageMetadataRegisterNamespaceForPrefix
     * 
     * Associates an XMP namespace URI with a prefix string.
     * 
     * This allows ImageIO to create custom metadata when it encounters
     * an unrecognized prefix in a path (see CGImageMetadataCopyTagWithPath for more
     * information about path syntax). A namespace must be registered before it can
     * be used to add custom metadata. All namespaces found in the image's metadata,
     * or defined as a constant above, will be pre-registered. Namespaces and
     * prefixes must be unique.
     * 
     * @return Returns true if successful. Returns false and sets 'err' if an error
     *         or conflict occurs.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataRegisterNamespaceForPrefix(@NotNull CGMutableImageMetadataRef metadata,
            @NotNull CFStringRef xmlns, @NotNull CFStringRef prefix, @Nullable Ptr<CFErrorRef> err);

    /**
     * [@function] CGImageMetadataSetTagWithPath
     * 
     * Sets the tag at a specific path in a CGMutableImageMetadata container or a parent tag
     * 
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
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetTagWithPath(@NotNull CGMutableImageMetadataRef metadata,
            @Nullable CGImageMetadataTagRef parent, @NotNull CFStringRef path, @NotNull CGImageMetadataTagRef tag);

    /**
     * [@function] CGImageMetadataSetValueWithPath
     * 
     * Sets the value of the tag at a specific path in a CGMutableImageMetadataRef container or a parent tag
     * 
     * This function is used to add new metadata values to a
     * metadata container, or update existing tag values. All tags required to reach
     * the final tag (at the end of the path) are created, if needed. Tags are
     * created with default types (i.e. arrays will be ordered). Creating tags will
     * fail if a prefix is encountered that has not been registered. Use
     * [@link] CGImageMetadataRegisterNamespaceForPrefix @/link to associate a prefix
     * with a namespace prior to using a path-based CGImageMetadata function.
     * 
     * Examples
     * <ul>
     * <li>'path' = CFSTR("xmp:CreateDate"), 'value' = CFSTR("2011-09-20T14:54:47-08:00")</li>
     * <li>'path' = CFSTR("dc:subject[0]"), 'value' = CFSTR("San Francisco")</li>
     * <li>'path' = CFSTR("dc:subject[1]"), 'value' = CFSTR("Golden Gate Bridge")</li>
     * <li>'path' = CFSTR("dc:description[en]") 'value' = CFSTR("my image description")</li>
     * <li>'path' = CFSTR("dc:description[de]") 'value' = CFSTR("meine bildbeschreibung")</li>
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
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueWithPath(@NotNull CGMutableImageMetadataRef metadata,
            @Nullable CGImageMetadataTagRef parent, @NotNull CFStringRef path, @NotNull ConstVoidPtr value);

    /**
     * [@function] CGImageMetadataRemoveTagWithPath
     * 
     * Removes the tag at a specific path from a CGMutableImageMetadata container or from the parent tag
     * 
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
     * 
     *               API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataRemoveTagWithPath(@NotNull CGMutableImageMetadataRef metadata,
            @Nullable CGImageMetadataTagRef parent, @NotNull CFStringRef path);

    /**
     * [@function] CGImageMetadataEnumerateTagsUsingBlock
     * 
     * Executes a given block using each tag in the metadata
     * 
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
     * 
     *                 API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CGImageMetadataEnumerateTagsUsingBlock(@NotNull CGImageMetadataRef metadata,
            @Nullable CFStringRef rootPath, @Nullable CFDictionaryRef options,
            @NotNull @ObjCBlock(name = "call_CGImageMetadataEnumerateTagsUsingBlock") Block_CGImageMetadataEnumerateTagsUsingBlock block);

    /**
     * *! @functiongroup Working with CGImageProperties
     * [@function] CGImageMetadataCopyTagMatchingImageProperty
     * 
     * Searches for a specific CGImageMetadataTag matching a kCGImageProperty constant
     * 
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
     *         tag name, and XMP value for the corresponding CGImageProperty. Returns NULL if the
     *         property could not be found.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagMatchingImageProperty(
            @NotNull CGImageMetadataRef metadata, @NotNull CFStringRef dictionaryName,
            @NotNull CFStringRef propertyName);

    /**
     * [@function] CGImageMetadataSetValueMatchingImageProperty
     * 
     * Sets the value of the CGImageMetadataTag matching a kCGImageProperty constant
     * 
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
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueMatchingImageProperty(
            @NotNull CGMutableImageMetadataRef metadata, @NotNull CFStringRef dictionaryName,
            @NotNull CFStringRef propertyName, @NotNull ConstVoidPtr value);

    /**
     * [@function] CGImageMetadataCreateXMPData
     * 
     * Serializes the CGImageMetadataRef to XMP data
     * 
     * This converts all of the metadata tags to a block of XMP data. Common uses
     * include creating sidecar files that contain metadata for image formats that do not
     * support embedded XMP, or cannot be edited due to other format restrictions (such as
     * proprietary RAW camera formats).
     * 
     * @param metadata A collection of metadata tags.
     * @param options  should be NULL. Options are currently not used, but may be used in
     *                 future release.
     * @return Returns a CFData containing an XMP representation of the metadata. Returns
     *         NULL if an error occurred.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDataRef CGImageMetadataCreateXMPData(@NotNull CGImageMetadataRef metadata,
            @Nullable CFDictionaryRef options);

    /**
     * [@function] CGImageMetadataCreateFromXMPData
     * 
     * Creates a collection of CGImageMetadataTags from a block of XMP data
     * 
     * Converts XMP data into a collection of metadata tags.
     * The data must be a complete XMP tree. XMP packet headers (<?xpacket .. ?>) are
     * supported.
     * 
     * @param data The XMP data.
     * @return Returns a collection of CGImageMetadata tags. Returns NULL if an error occurred.
     * 
     *         API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageMetadataCreateFromXMPData(@NotNull CFDataRef data);

    /**
     * Return the CFTypeID for CGImageSources.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetTypeID();

    /**
     * Return an array of supported type identifiers.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef CGImageSourceCopyTypeIdentifiers();

    /**
     * Create an image source reading from the data provider `provider'. The
     * `options' dictionary may be used to request additional creation options;
     * see the list of keys above for more information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithDataProvider(@NotNull CGDataProviderRef provider,
            @Nullable CFDictionaryRef options);

    /**
     * Create an image source reading from `data'. The `options' dictionary
     * may be used to request additional creation options; see the list of keys
     * above for more information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithData(@NotNull CFDataRef data,
            @Nullable CFDictionaryRef options);

    /**
     * Create an image source reading from `url'. The `options' dictionary may
     * be used to request additional creation options; see the list of keys
     * above for more information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithURL(@NotNull CFURLRef url,
            @Nullable CFDictionaryRef options);

    /**
     * Return the type identifier of the image source `isrc'. This type is the
     * type of the source "container", which is not necessarily the type of the
     * image(s) in the container. For example, the .icns format supports
     * embedded JPEG2000 but the source type will be "com.apple.icns".
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageSourceGetType(@NotNull CGImageSourceRef isrc);

    /**
     * Return the number of images (not including thumbnails) in the image
     * source `isrc'.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetCount(@NotNull CGImageSourceRef isrc);

    /**
     * Return the properties of the image source `isrc'. These properties
     * apply to the container in general but not necessarily to any individual
     * image that it contains.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyProperties(@NotNull CGImageSourceRef isrc,
            @Nullable CFDictionaryRef options);

    /**
     * Return the properties of the image at `index' in the image source
     * `isrc'. The index is zero-based. The `options' dictionary may be used
     * to request additional options; see the list of keys above for more
     * information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyPropertiesAtIndex(@NotNull CGImageSourceRef isrc,
            @NUInt long index, @Nullable CFDictionaryRef options);

    /**
     * Return the metadata of the image at `index' in the image source
     * `isrc'. The index is zero-based. The `options' dictionary may be used
     * to request additional options; see the list of keys above for more
     * information. Please refer to CGImageMetadata.h for usage of metadata.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageSourceCopyMetadataAtIndex(@NotNull CGImageSourceRef isrc,
            @NUInt long index, @Nullable CFDictionaryRef options);

    /**
     * Return the image at `index' in the image source `isrc'. The index is
     * zero-based. The `options' dictionary may be used to request additional
     * creation options; see the list of keys above for more information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateImageAtIndex(@NotNull CGImageSourceRef isrc, @NUInt long index,
            @Nullable CFDictionaryRef options);

    /**
     * Remove the cached decoded image data for the image at `index' in the image source `isrc'.
     * The index is zero-based.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CGImageSourceRemoveCacheAtIndex(@NotNull CGImageSourceRef isrc, @NUInt long index);

    /**
     * Return the thumbnail of the image at `index' in the image source `isrc'.
     * The index is zero-based. The `options' dictionary may be used to request
     * additional thumbnail creation options; see the list of keys above for
     * more information.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateThumbnailAtIndex(@NotNull CGImageSourceRef isrc,
            @NUInt long index, @Nullable CFDictionaryRef options);

    /**
     * Create an incremental image source. No data is provided at creation
     * time; it is assumed that data will eventually be provided using
     * "CGImageSourceUpdateDataProvider" or "CGImageSourceUpdateData". The
     * `options' dictionary may be used to request additional creation options;
     * see the list of keys above for more information.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateIncremental(@Nullable CFDictionaryRef options);

    /**
     * Update the incremental image source `isrc' with new data. The new data
     * must include all the previous data plus any additional new data. The
     * `final' parameter should be true when the final set of data is provided;
     * false otherwise.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGImageSourceUpdateData(@NotNull CGImageSourceRef isrc, @NotNull CFDataRef data,
            boolean final_);

    /**
     * Update the incremental image source `isrc' with a new data provider.
     * The new data provider must provide all the previous data plus any
     * additional new data. The `final' parameter should be true when the final
     * set of data is provided; false otherwise.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGImageSourceUpdateDataProvider(@NotNull CGImageSourceRef isrc,
            @NotNull CGDataProviderRef provider, boolean final_);

    /**
     * Return the overall status of the image source `isrc'. The status is
     * particularly informative for incremental image sources, but may be used
     * by clients providing non-incremental data as well.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CGImageSourceGetStatus(@NotNull CGImageSourceRef isrc);

    /**
     * Return the current status of the image at `index' in the image source
     * `isrc'. The index is zero-based. The returned status is particularly
     * informative for incremental image sources but may used by clients
     * providing non-incremental data as well.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CGImageSourceGetStatusAtIndex(@NotNull CGImageSourceRef isrc, @NUInt long index);

    /**
     * Return the CFTypeID for CGImageDestinations.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageDestinationGetTypeID();

    /**
     * Return an array of supported type identifiers.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef CGImageDestinationCopyTypeIdentifiers();

    /**
     * Create an image destination writing to the data consumer `consumer'.
     * The parameter `type' specifies the type identifier of the resulting
     * image file. Constants for `type' are found in the LaunchServices framework
     * header UTCoreTypes.h. The parameter `count' specifies number of images
     * (not including thumbnails) that the image file will contain. The `options'
     * dictionary is reserved for future use; currently, you should pass NULL for
     * this parameter.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithDataConsumer(
            @NotNull CGDataConsumerRef consumer, @NotNull CFStringRef type, @NUInt long count,
            @Nullable CFDictionaryRef options);

    /**
     * Create an image destination writing to `data'. The parameter `type'
     * specifies the type identifier of the resulting image file. Constants for
     * `type' are found in the LaunchServices framework header UTCoreTypes.h. The
     * parameter `count' specifies number of images (not including thumbnails)
     * that the image file will contain. The `options' dictionary is reserved
     * for future use; currently, you should pass NULL for this parameter.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithData(@NotNull CFMutableDataRef data,
            @NotNull CFStringRef type, @NUInt long count, @Nullable CFDictionaryRef options);

    /**
     * Create an image destination writing to `url'. The parameter `type'
     * specifies the type identifier of the resulting image file. Constants for
     * `type' are found in the LaunchServices framework header UTCoreTypes.h. The
     * parameter `count' specifies number of images (not including thumbnails)
     * that the image file will contain. The `options' dictionary is reserved
     * for future use; currently, you should pass NULL for this parameter.
     * Note that if `url' already exists, it will be overwritten.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithURL(@NotNull CFURLRef url,
            @NotNull CFStringRef type, @NUInt long count, @Nullable CFDictionaryRef options);

    /**
     * Specify the dictionary `properties' of properties which apply to all
     * images in the image destination `idst'.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationSetProperties(@NotNull CGImageDestinationRef idst,
            @Nullable CFDictionaryRef properties);

    /**
     * Set the next image in the image destination `idst' to be `image' with
     * optional properties specified in `properties'. An error is logged if
     * more images are added than specified in the original count of the image
     * destination.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImage(@NotNull CGImageDestinationRef idst, @NotNull CGImageRef image,
            @Nullable CFDictionaryRef properties);

    /**
     * Set the next image in the image destination `idst' to be the image at
     * `index' in the image source `isrc'. The index is zero-based. The
     * properties of the source image can be added to or overriden by supplying
     * additional keys/values in `properties'. If a key in `properties' has
     * the value kCFNull, the corresponding property in the destination will be
     * removed.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageFromSource(@NotNull CGImageDestinationRef idst,
            @NotNull CGImageSourceRef isrc, @NUInt long index, @Nullable CFDictionaryRef properties);

    /**
     * Write everything to the destination data, url or consumer of the image
     * destination `idst'. You must call this function or the image
     * destination will not be valid. After this function is called, no
     * additional data will be written to the image destination. Return true
     * if the image was successfully written; false otherwise.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageDestinationFinalize(@NotNull CGImageDestinationRef idst);

    /**
     * Set the next image in the image destination `idst' to be `image' with
     * metadata properties specified in `metadata'. An error is logged if more
     * images are added than specified in the original count of the image
     * destination.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageAndMetadata(@NotNull CGImageDestinationRef idst,
            @NotNull CGImageRef image, @Nullable CGImageMetadataRef metadata, @Nullable CFDictionaryRef options);

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
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageDestinationCopyImageSource(@NotNull CGImageDestinationRef idst,
            @NotNull CGImageSourceRef isrc, @Nullable CFDictionaryRef options, @Nullable Ptr<CFErrorRef> err);

    /**
     * Public, common namespaces.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifAux();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifEX();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceDublinCore();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCCore();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespacePhotoshop();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceTIFF();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPBasic();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPRights();

    /**
     * Public, common prefixes.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExif();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifAux();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifEX();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixDublinCore();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCCore();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixPhotoshop();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixTIFF();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPBasic();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPRights();

    /**
     * A key for the 'options' of CGImageMetadataEnumerateTagsUsingBlock. If present,
     * the value should be a CFBoolean. If true, tags will be enumerated recursively,
     * if false, only the direct children of 'rootPath' will be enumerated.
     * The default is non-recursive.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataEnumerateRecursively();

    /**
     * [@constant] kCFErrorDomainCGImageMetadata
     * 
     * Error domain for all errors originating in ImageIO for CGImageMetadata APIs.
     * Error codes may be interpreted using the list below.
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCGImageMetadata();

    /**
     * Specifies the "best guess" of the type identifier for the format of the
     * image source file. If specified, the value of this key must be a
     * CFStringRef. For more information about type identifiers, see "UTType.h"
     * in the Application Services framework.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceTypeIdentifierHint();

    /**
     * Specifies whether the image should be cached in a decoded form. The
     * value of this key must be a CFBooleanRef.
     * kCFBooleanFalse indicates no caching, kCFBooleanTrue indicates caching.
     * For 64-bit architectures, the default is kCFBooleanTrue, for 32-bit the default is kCFBooleanFalse.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCache();

    /**
     * Specifies whether image decoding and caching should happen at image creation time.
     * The value of this key must be a CFBooleanRef. The default value is kCFBooleanFalse (image decoding will
     * happen at rendering time).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCacheImmediately();

    /**
     * Specifies whether the image should be returned as a floating
     * point CGImageRef if supported by the file format. Extended
     * range floating point CGImageRef may require additional
     * processing to render pleasingly. The value of this key must
     * be a CFBooleanRef; the default value is kCFBooleanFalse.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldAllowFloat();

    /**
     * Specifies whether a thumbnail should be automatically created for an
     * image if a thumbnail isn't present in the image source file. The
     * thumbnail will be created from the full image, subject to the limit
     * specified by kCGImageSourceThumbnailMaxPixelSize---if a maximum pixel
     * size isn't specified, then the thumbnail will be the size of the full
     * image, which probably isn't what you want. The value of this key must be
     * a CFBooleanRef; the default value of this key is kCFBooleanFalse.
     * 
     * API-Since: 4.0
     */
    @NotNull
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
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailFromImageAlways();

    /**
     * Specifies the maximum width and height in pixels of a thumbnail. If
     * this this key is not specified, the width and height of a thumbnail is
     * not limited and thumbnails may be as big as the image itself. If
     * present, this value of this key must be a CFNumberRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceThumbnailMaxPixelSize();

    /**
     * Specifies whether the thumbnail should be rotated and scaled according
     * to the orientation and pixel aspect ratio of the full image. The value
     * of this key must be a CFBooleanRef; the default value of this key is
     * kCFBooleanFalse.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailWithTransform();

    /**
     * Specifies that, if possible, an image should be returned as scaled down (in height and width) by a specified
     * factor.
     * The resulting image will be smaller and have reduced spatial quality but will otherwise have the same
     * characteristics
     * as the full size normal image.
     * If the specified scaling factor is not supported, a larger or full size normal image will be returned.
     * Supported file formats are JPEG, HEIF, TIFF, and PNG.
     * The value of this key must be an integer CFNumberRef (allowed values: 2, 4, and 8).
     * 
     * API-Since: 9.0
     */
    @NotNull
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
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationLossyCompressionQuality();

    /**
     * The desired background color to composite against when writing
     * an image with alpha to a destination format that does not support
     * alpha. If present, the value of this key is a CGColorRef without
     * any alpha component of its own. If not present a white color
     * will be used if needed.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationBackgroundColor();

    /**
     * Rescale the image to the maximum width and height in pixels.
     * If present, this value of this key must be a CFNumberRef.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationImageMaxPixelSize();

    /**
     * Enable or disable thumbnail embedding for JPEG and HEIF.
     * The value should be kCFBooleanTrue or kCFBooleanFalse. Defaults to kCFBooleanFalse
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationEmbedThumbnail();

    /**
     * Create an image using a colorspace, that has is compatible with older devices
     * The value should be kCFBooleanTrue or kCFBooleanFalse
     * Defaults to kCFBooleanFalse = don't do any color conversion
     * 
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOptimizeColorForSharing();

    /**
     * Set the metadata tags for the image destination. If present, the value of
     * this key is a CGImageMetadataRef. By default, all EXIF, IPTC, and XMP tags
     * will be replaced. Use kCGImageDestinationMergeMetadata to merge the tags
     * with the existing tags in the image source.
     * 
     * API-Since: 7.0
     */
    @NotNull
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
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationMergeMetadata();

    /**
     * XMP data will not be written to the destination. If used in conjunction with
     * kCGImageDestinationMetadata, EXIF tags will be preserved, but
     * an XMP packet will not be written to the file. IPTC tags, that are stored in XMP, will not be preserved.
     * If present, the value for this key is a CFBooleanRef. The default is kCFBooleanFalse.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeXMP();

    /**
     * If true, GPS metadata will not be written to EXIF data or the corresponding
     * EXIF tags in XMP. This flag cannot filter any proprietary location data that
     * could be stored in a manufacturer's EXIF MakerNote or custom XMP properties.
     * If present, the value for this key is a CFBooleanRef. The default is
     * kCFBooleanFalse.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeGPS();

    /**
     * Updates the DateTime parameters of the image metadata. Only values
     * present in the original image will updated. If present, the value should
     * be a CFStringRef or a CFDateRef. If CFString, the value must be in
     * Exif DateTime or ISO 8601 DateTime format. This option is mutually
     * exclusive with kCGImageDestinationMetadata.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationDateTime();

    /**
     * Updates the orientation in the image metadata. The image data itself will
     * not be rotated. If present, the value should be a CFNumberRef from 1 to 8.
     * This option is mutually exclusive with kCGImageDestinationMetadata.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOrientation();

    /**
     * Properties that, if returned by CGImageSourceCopyProperties or
     * CGImageSourceCopyPropertiesAtIndex, contain a dictionary of file-format
     * or metadata-format specific key-values.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyRawDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerMinoltaDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerFujiDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerOlympusDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerPentaxDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDictionary();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxDictionary();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerAppleDictionary();

    /**
     * The size of the image file in bytes, if known. If present, the value of
     * this key is a CFNumberRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileSize();

    /**
     * The number of pixels in the x- and y-dimensions. The value of these keys
     * is a CFNumberRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelHeight();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelWidth();

    /**
     * The DPI in the x- and y-dimensions, if known. If present, the value of
     * these keys is a CFNumberRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIHeight();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIWidth();

    /**
     * The number of bits in each color sample of each pixel. The value of this
     * key is a CFNumberRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDepth();

    /**
     * The intended display orientation of the image. If present, the value
     * of this key is a CFNumberRef with the same value as defined by the
     * TIFF and Exif specifications. That is:
     * 1 = 0th row is at the top, and 0th column is on the left.
     * 2 = 0th row is at the top, and 0th column is on the right.
     * 3 = 0th row is at the bottom, and 0th column is on the right.
     * 4 = 0th row is at the bottom, and 0th column is on the left.
     * 5 = 0th row is on the left, and 0th column is the top.
     * 6 = 0th row is on the right, and 0th column is the top.
     * 7 = 0th row is on the right, and 0th column is the bottom.
     * 8 = 0th row is on the left, and 0th column is the bottom.
     * If not present, a value of 1 is assumed.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOrientation();

    /**
     * The value of this key is kCFBooleanTrue if the image contains floating-
     * point pixel samples
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsFloat();

    /**
     * The value of this key is kCFBooleanTrue if the image contains indexed
     * (a.k.a. paletted) pixel samples
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsIndexed();

    /**
     * The value of this key is kCFBooleanTrue if the image contains an alpha
     * (a.k.a. coverage) channel
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHasAlpha();

    /**
     * The color model of the image such as "RGB", "CMYK", "Gray", or "Lab".
     * The value of this key is CFStringRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModel();

    /**
     * The name of the optional ICC profile embedded in the image, if known.
     * If present, the value of this key is a CFStringRef.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyProfileName();

    /**
     * Possible values for kCGImagePropertyColorModel property
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelRGB();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelGray();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelCMYK();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelLab();

    /**
     * Possible keys for kCGImagePropertyTIFFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCompression();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPhotometricInterpretation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDocumentName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFImageDescription();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFMake();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFOrientation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFXResolution();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFYResolution();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFResolutionUnit();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFSoftware();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTransferFunction();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDateTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFArtist();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFHostComputer();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCopyright();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFWhitePoint();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPrimaryChromaticities();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileWidth();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileLength();

    /**
     * Possible keys for kCGImagePropertyJFIFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFXDensity();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFYDensity();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDensityUnit();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFIsProgressive();

    /**
     * Possible keys for kCGImagePropertyExifDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureProgram();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpectralSensitivity();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedRatings();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOECF();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensitivityType();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifStandardOutputSensitivity();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRecommendedExposureIndex();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeed();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudeyyy();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudezzz();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeOriginal();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeDigitized();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifComponentsConfiguration();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompressedBitsPerPixel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifShutterSpeedValue();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifApertureValue();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBrightnessValue();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureBiasValue();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMaxApertureValue();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistance();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMeteringMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLightSource();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlash();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLength();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectArea();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMakerNote();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifUserComment();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTime();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOriginal();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeDigitized();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashPixVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifColorSpace();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelXDimension();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelYDimension();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRelatedSoundFile();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashEnergy();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpatialFrequencyResponse();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneXResolution();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneYResolution();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneResolutionUnit();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectLocation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureIndex();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensingMethod();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFileSource();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCFAPattern();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCustomRendered();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifWhiteBalance();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDigitalZoomRatio();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLenIn35mmFilm();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneCaptureType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGainControl();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifContrast();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSaturation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSharpness();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDeviceSettingDescription();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistRange();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifImageUniqueID();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCameraOwnerName();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBodySerialNumber();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSpecification();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensMake();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensModel();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGamma();

    /**
     * Deprecated. See kCGImagePropertyExifSubsecTimeOriginal
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: No longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOrginal();

    /**
     * Possible keys for kCGImagePropertyExifAuxDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensInfo();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensID();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxImageNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFlashCompensation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxOwnerName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFirmware();

    /**
     * Possible keys for kCGImagePropertyGIFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFLoopCount();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDelayTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFImageColorMap();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFHasGlobalColorMap();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFUnclampedDelayTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGGamma();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGInterlaceType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGXPixelsPerMeter();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGYPixelsPerMeter();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGsRGBIntent();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGChromaticities();

    /**
     * Possible keys for kCGImagePropertyPNGDictionary
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGAuthor();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCopyright();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCreationTime();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDescription();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGModificationTime();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSoftware();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGTitle();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGLoopCount();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGDelayTime();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGUnclampedDelayTime();

    /**
     * Possible keys for kCGImagePropertyGPSDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitudeRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitude();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitudeRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitude();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitudeRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitude();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTimeStamp();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSatellites();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSStatus();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMeasureMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDOP();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeedRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeed();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrackRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrack();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirectionRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirection();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMapDatum();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitudeRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitude();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitudeRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitude();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearingRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearing();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistanceRef();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistance();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSProcessingMethod();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAreaInformation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDateStamp();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDifferental();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSHPositioningError();

    /**
     * Possible keys for kCGImagePropertyIPTCDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectTypeReference();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectAttributeReference();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditStatus();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditorialUpdate();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCUrgency();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubjectReference();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCategory();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSupplementalCategory();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCFixtureIdentifier();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCKeywords();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationCode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseDate();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationDate();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSpecialInstructions();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCActionAdvised();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceService();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceDate();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDateCreated();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCTimeCreated();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationDate();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginatingProgram();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProgramVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectCycle();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCByline();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCBylineTitle();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCity();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubLocation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProvinceState();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationCode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginalTransmissionReference();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCHeadline();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCredit();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSource();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCopyrightNotice();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContact();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCaptionAbstract();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCWriterEditor();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageOrientation();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCLanguageIdentifier();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCStarRating();

    /**
     * IPTC Core
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCreatorContactInfo();

    /**
     * IPTC Core
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCRightsUsageTerms();

    /**
     * IPTC Core
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCScene();

    /**
     * Possible keys for kCGImagePropertyIPTCCreatorContactInfo dictionary (part of IPTC Core - above)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCity();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCountry();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoAddress();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPostalCode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoStateProvince();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoEmails();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPhones();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoWebURLs();

    /**
     * Possible keys for kCGImageProperty8BIMDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMLayerNames();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMVersion();

    /**
     * Possible keys for kCGImagePropertyDNGDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBackwardVersion();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGUniqueCameraModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLocalizedCameraModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLensInfo();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevel();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWhiteLevel();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant1();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant2();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix1();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix2();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration1();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration2();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotNeutral();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotWhiteXY();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposure();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineNoise();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineSharpness();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPrivateData();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibrationSignature();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCalibrationSignature();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseProfile();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpRectilinear();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpFisheye();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGFixVignetteRadial();

    /**
     * Possible keys for kCGImagePropertyCIFFDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDescription();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFirmware();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFOwnerName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageFileName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseMethod();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseTiming();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFRecordID();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFSelfTimingTime();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFCameraSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFContinuousDrive();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFocusMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeteringMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFShootingMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMaxMM();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMinMM();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFWhiteBalanceIndex();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFlashExposureComp();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeasuredEV();

    /**
     * Possible keys for kCGImagePropertyMakerNikonDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSetting();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonColorMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonQuality();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonWhiteBalanceMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonSharpenMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashSetting();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSelection();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashExposureComp();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonImageAdjustment();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensAdapter();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensInfo();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusDistance();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDigitalZoom();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShootingMode();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonCameraSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShutterCount();

    /**
     * Possible keys for kCGImagePropertyMakerCanonDictionary
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonOwnerName();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonCameraSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonImageSerialNumber();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFlashExposureComp();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonContinuousDrive();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonLensModel();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFirmware();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonAspectRatioInfo();

    /**
     * Allows client to choose the filters applied before PNG compression
     * http://www.libpng.org/pub/png/book/chapter09.html#png.ch09.div.1
     * The value should be a CFNumber, of type long, containing a bitwise OR of the desired filters
     * The filters are defined below, IMAGEIO_PNG_NO_FILTERS, IMAGEIO_PNG_FILTER_NONE, etc
     * This value has no effect when compressing to any format other than PNG
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCompressionFilter();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGImageMetadataEnumerateTagsUsingBlock {
        @Generated
        boolean call_CGImageMetadataEnumerateTagsUsingBlock(@NotNull CFStringRef path,
                @NotNull CGImageMetadataTagRef tag);
    }

    /**
     * Auxiliary data support for JPEG, HEIF, and DNG images (kCGImageAuxiliaryDataTypeDepth, ...)
     * The returned CFDictionary contains:
     * - the depth data (CFDataRef) - (kCGImageAuxiliaryDataInfoData),
     * - the depth data description (CFDictionary) - (kCGImageAuxiliaryDataInfoDataDescription)
     * - metadata (CGImageMetadataRef) - (kCGImageAuxiliaryDataInfoMetadata)
     * CGImageSourceCopyAuxiliaryDataInfoAtIndex returns nil if the image did not contain ‘auxiliaryImageDataType’ data.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyAuxiliaryDataInfoAtIndex(@NotNull CGImageSourceRef isrc,
            @NUInt long index, @NotNull CFStringRef auxiliaryImageDataType);

    /**
     * Auxiliary data support for JPEG, HEIF, and DNG images.
     * The auxiliaryDataInfoDictionary should contain:
     * - the auxiliary data (CFDataRef) - (kCGImageAuxiliaryDataInfoData),
     * - the auxiliary data description (CFDictionary) - (kCGImageAuxiliaryDataInfoDataDescription)
     * - metadata (CGImageMetadataRef) - (kCGImageAuxiliaryDataInfoMetadata)
     * To add auxiliary data to an image, call CGImageDestinationAddAuxiliaryDataInfo() after adding the CGImage to the
     * CGImageDestinationRef.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native void CGImageDestinationAddAuxiliaryDataInfo(@NotNull CGImageDestinationRef idst,
            @NotNull CFStringRef auxiliaryImageDataType, @NotNull CFDictionaryRef auxiliaryDataInfoDictionary);

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileContentsDictionary();

    /**
     * For use with CGImageSourceCopyAuxiliaryDataInfoAtIndex and CGImageDestinationAddAuxiliaryDataInfo:
     * These strings specify the 'auxiliaryImageDataType':
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDepth();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDisparity();

    /**
     * Depth/Disparity data support for JPEG, HEIF, and DNG images:
     * CGImageSourceCopyAuxiliaryDataInfoAtIndex and CGImageDestinationAddAuxiliaryDataInfo will use these keys in the
     * dictionary:
     * kCGImageAuxiliaryDataInfoData - the depth data (CFDataRef)
     * kCGImageAuxiliaryDataInfoDataDescription - the depth data description (CFDictionary)
     * kCGImageAuxiliaryDataInfoMetadata - metadata (CGImageMetadataRef)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoData();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoDataDescription();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoMetadata();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImageCount();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWidth();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHeight();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyBytesPerRow();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyNamedColorSpace();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelFormat();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImages();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyThumbnailImages();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryData();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryDataType();

    /**
     * Return the primary image index for HEIF images.
     * Zero for all other formats.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetPrimaryImageIndex(@NotNull CGImageSourceRef isrc);

    /**
     * Animate the sequence of images contained in the file at `url'. Currently supported image
     * formats are GIF and APNG. The `options' dictionary may be used to request additional playback
     * options; see the list of keys above for more information. The block is called on the main queue
     * at time intervals specified by the `delay time' of the image. The animation can be stopped by
     * setting the boolean parameter of the block to true.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int CGAnimateImageAtURLWithBlock(@NotNull CFURLRef url, @Nullable CFDictionaryRef options,
            @NotNull @ObjCBlock(name = "call_CGAnimateImageAtURLWithBlock") Block_CGAnimateImageAtURLWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageAtURLWithBlock {
        @Generated
        void call_CGAnimateImageAtURLWithBlock(@NUInt long index, @NotNull CGImageRef image, @NotNull BoolPtr stop);
    }

    /**
     * Animate the sequence of images contained in `data'. Currently supported image
     * formats are GIF and APNG. The `options' dictionary may be used to request additional playback
     * options; see the list of keys above for more information. The block is called on the main queue
     * at time intervals specified by the `delay time' of the image. The animation can be stopped by
     * setting the boolean parameter of the block to true.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int CGAnimateImageDataWithBlock(@NotNull CFDataRef data, @Nullable CFDictionaryRef options,
            @NotNull @ObjCBlock(name = "call_CGAnimateImageDataWithBlock") Block_CGAnimateImageDataWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageDataWithBlock {
        @Generated
        void call_CGAnimateImageDataWithBlock(@NUInt long index, @NotNull CGImageRef image, @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCExtension();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCExtension();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDictionary();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRDictionary();

    /**
     * For HEIF images: the value of this key is kCFBooleanTrue if the image at the given index is the primary image.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPrimaryImage();

    /**
     * Possible keys for kCGImagePropertyHEICSDictionary
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSLoopCount();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDelayTime();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSUnclampedDelayTime();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelWidth();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelHeight();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSFrameInfoArray();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTime();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeOriginal();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeDigitized();

    /**
     * API-Since: 13.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompositeImage();

    /**
     * API-Since: 13.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceImageNumberOfCompositeImage();

    /**
     * API-Since: 13.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceExposureTimesOfCompositeImage();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelWidth();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelHeight();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFFrameInfoArray();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGComment();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDisclaimer();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSource();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGWarning();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGFrameInfoArray();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelWidth();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelHeight();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTerm();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermCvId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermRefinedAbout();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAddlModelInfo();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkOrObject();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCircaDateCreated();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContentDescription();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContributionDescription();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightNotice();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreator();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreatorID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkDateCreated();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkPhysicalDescription();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSource();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInventoryNo();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInvURL();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkStylePeriod();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkTitle();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrate();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrateMode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioChannelCount();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCircaDateCreated();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormat();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributor();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorRole();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCopyrightYear();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreator();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorRole();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtControlledVocabularyTerm();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreen();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegion();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionD();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionH();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionText();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionUnit();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionW();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionX();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionY();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalImageGUID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceFileType();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceType();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheet();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLinkQualifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbdEncRightsExpr();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExpr();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprType();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprLangID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeNumber();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEvent();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEvent();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtExternalMetadataLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtFeedIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenre();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermRefinedAbout();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtHeadline();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtIPTCLastEdited();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncRightsExpr();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExpr();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprType();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprLangID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCreated();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCity();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryCode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSAltitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLatitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLongitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationProvinceState();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationSublocation();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationWorldRegion();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationShown();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailHeight();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailWidth();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtModelAge();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageCode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeard();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImage();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageWDetails();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCharacteristic();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermCvId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermRefinedAbout();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageDescription();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImage();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageDescription();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageGTIN();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEvent();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventDate();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRating();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRatingRegion();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCity();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryCode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSAltitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLatitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLongitude();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionProvinceState();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionSublocation();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionWorldRegion();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMaxValue();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMinValue();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingSourceLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValue();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValueLogoLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryEntryRole();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryItemID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryOrganisationID();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtReleaseReady();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeason();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonNumber();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeries();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStorylineIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStreamReady();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStylePeriod();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSource();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverage();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageFrom();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageTo();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscript();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLink();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLinkQualifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrate();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrateMode();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoDisplayAspectRatio();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoEncodingProfile();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotType();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeIdentifier();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoStreamsCount();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVisualColor();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTag();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermId();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermName();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermRefinedAbout();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGActiveArea();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAnalogBalance();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAntiAliasStrength();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotICCProfile();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotPreProfileMatrix();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotProfileName();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposureOffset();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBayerGreenSplit();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBestQualityScale();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaH();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaV();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelRepeatDim();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFALayout();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFAPlaneColor();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGChromaBlurRadius();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorimetricReference();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentICCProfile();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentPreProfileMatrix();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultBlackRender();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropOrigin();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropSize();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultScale();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultUserCrop();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGExtraCameraProfiles();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix1();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix2();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearizationTable();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearResponseLimit();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMakerNoteSafety();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMaskedAreas();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNewRawImageDigest();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseReductionApplied();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList1();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList2();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList3();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalBestQualityFinalSize();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultCropSize();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultFinalSize();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileData();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileDigest();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileName();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationName();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationVersion();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewColorSpace();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewDateTime();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsDigest();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsName();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCopyright();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileEmbedPolicy();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData1();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData2();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapDims();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapEncoding();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableData();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableDims();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableEncoding();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileName();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileToneCurve();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawDataUniqueID();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawImageDigest();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawToPreviewGain();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix1();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix2();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRowInterleaveFactor();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGShadowScale();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGSubTileBlockSize();

    /**
     * Possible keys for kCGImagePropertyOpenEXRDictionary
     * 
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRAspectRatio();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypePortraitEffectsMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationSkinMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationHairMatte();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationTeethMatte();

    /**
     * Starts the animation at the given index. Defaults to 0
     * Value is a CFNumber
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationStartIndex();

    /**
     * The value of this key overrides the `delay time' specified by the image
     * Value is a CFNumber of kCFNumberDoubleType.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationDelayTime();

    /**
     * The value of this key overrides the `loop count' specified by the image
     * Value is a CFNumber; kCFNumberPositiveInfinity may be used.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationLoopCount();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPDictionary();

    /**
     * Possible keys for kCGImagePropertyWebPDictionary
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPLoopCount();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPDelayTime();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPUnclampedDelayTime();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPFrameInfoArray();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPCanvasPixelWidth();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWebPCanvasPixelHeight();

    /**
     * For CGImageDestinationAddImageFromSource: when set to kCFBooleanTrue, a HEIF-embedded GainMap will be preserved.
     * If the destination image is scaled (using kCGImageDestinationImageMaxPixelSize), the GainMap will be scaled
     * accordingly.
     * The value should be kCFBooleanTrue or kCFBooleanFalse
     * Defaults to kCFBooleanFalse
     * 
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationPreserveGainMap();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTGADictionary();

    /**
     * Possible keys for kCGImagePropertyTGADictionary
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTGACompression();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationGlassesMatte();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeHDRGainMap();

    /**
     * API-Since: 19.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGPixelsAspectRatio();

    /**
     * For PNG files:
     * When writing indexed color PNGs, the data for the transparity chunk 'tRNS' can be passed in with this key.
     * The value (CFDataRef) should contain one byte transparency info for each entry in the indexed color map.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGTransparency();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationSkyMatte();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImageIndex();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroups();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupIndex();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupType();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupTypeStereoPair();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupTypeAlternate();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImagesAlternate();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIndexLeft();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIndexRight();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsLeftImage();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsRightImage();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageIsAlternateImage();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEIFDictionary();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageBaseline();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGroupImageDisparityAdjustment();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOMetadata_CameraExtrinsicsKey();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraExtrinsics_CoordinateSystemID();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraExtrinsics_Position();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraExtrinsics_Rotation();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOMetadata_CameraModelKey();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraModel_ModelType();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraModelType_SimplifiedPinhole();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraModelType_GenericPinhole();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kIIOCameraModel_Intrinsics();

    @Generated public static final double IIO_HAS_IOSURFACE = 1.0;
    @Generated public static final double IMAGEIO_PNG_NO_FILTERS = 0.0;
    @Generated public static final double IMAGEIO_PNG_FILTER_NONE = 8.0;
    @Generated public static final double IMAGEIO_PNG_FILTER_SUB = 16.0;
    @Generated public static final double IMAGEIO_PNG_FILTER_UP = 32.0;
    @Generated public static final double IMAGEIO_PNG_FILTER_AVG = 64.0;
    @Generated public static final double IMAGEIO_PNG_FILTER_PAETH = 128.0;
}
