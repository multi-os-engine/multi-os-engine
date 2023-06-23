package apple.coreservices.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreServices")
@Runtime(CRuntime.class)
public final class CoreServices {
    static {
        NatJ.register();
    }

    @Generated
    private CoreServices() {
    }

    /**
     * UTTypeCreatePreferredIdentifierForTag() *** DEPRECATED ***
     * 
     * Discussion:
     * Creates a uniform type identifier for the type indicated by the
     * specified tag. This is the primary function to use for going from
     * tag (extension/MIMEType/OSType) to uniform type identifier.
     * Optionally, the returned type identifiers must conform to the
     * identified "conforming-to" type argument. This is a hint to the
     * implementation to constrain the search to a particular tree of
     * types. For example, the client may want to know the type
     * indicated by a particular extension tag. If the client knows that
     * the extension is associated with a directory (rather than a
     * file), the client may specify "public.directory" for the
     * conforming-to argument. This will allow the implementation to
     * ignore all types associated with byte data formats (public.data
     * base type). If more than one type is indicated, preference is
     * given to a public type over a non-public type on the theory that
     * instances of public types are more common, and therefore more
     * likely to be correct. When there a choice must be made between
     * multiple public types or multiple non-public types, the selection
     * rules are undefined. Clients needing finer control should use
     * UTTypeCreateAllIdentifiersForTag. If no declared type is
     * indicated, a dynamic type identifier is generated which satisfies
     * the parameters.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inTagClass:
     * the class identifier of the tag argument
     * 
     * inTag:
     * the tag string
     * 
     * inConformingToUTI:
     * the identifier of a type to which the result must conform
     * 
     * Result:
     * a new CFStringRef containing the type identifier, or NULL if
     * inTagClass is not a known tag class
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use the UTType class instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCreatePreferredIdentifierForTag(@NotNull CFStringRef inTagClass,
            @NotNull CFStringRef inTag, @Nullable CFStringRef inConformingToUTI);

    /**
     * UTTypeCreateAllIdentifiersForTag() *** DEPRECATED ***
     * 
     * Discussion:
     * Creates an array of all uniform type identifiers indicated by the
     * specified tag. An overloaded tag (e.g., an extension used by
     * several applications for different file formats) may indicate
     * multiple types. If no declared type identifiers have the
     * specified tag, then a single dynamic type identifier will be
     * created for the tag. Optionally, the returned type identifiers
     * must conform to the identified "conforming-to" type argument.
     * This is a hint to the implementation to constrain the search to a
     * particular tree of types. For example, the client may want to
     * know the type indicated by a particular extension tag. If the
     * client knows that the extension is associated with a directory
     * (rather than a file), the client may specify "public.directory"
     * for the conforming-to argument. This will allow the
     * implementation to ignore all types associated with byte data
     * formats (public.data base type).
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inTagClass:
     * the class identifier of the tag argument
     * 
     * inTag:
     * the tag string
     * 
     * inConformingToUTI:
     * the identifier of a type to which the results must conform
     * 
     * Result:
     * An array of uniform type identifiers, or NULL if inTagClass is
     * not a known tag class
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use the UTType class instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCreateAllIdentifiersForTag(@NotNull CFStringRef inTagClass,
            @NotNull CFStringRef inTag, @Nullable CFStringRef inConformingToUTI);

    /**
     * UTTypeCopyPreferredTagWithClass() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns the identified type's preferred tag with the specified
     * tag class as a CFString. This is the primary function to use for
     * going from uniform type identifier to tag. If the type
     * declaration included more than one tag with the specified class,
     * the first tag in the declared tag array is the preferred tag.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * inTagClass:
     * the class of tags to return
     * 
     * Result:
     * the tag string, or NULL if there is no tag of the specified class.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use the UTType class instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyPreferredTagWithClass(@NotNull CFStringRef inUTI,
            @NotNull CFStringRef inTagClass);

    /**
     * UTTypeCopyAllTagsWithClass() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns each of the identified type's tags with the specified
     * tag class as a CFArray of CFStrings.
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * inTagClass:
     * the class of tags to return
     * 
     * Result:
     * an array of tag strings, or NULL if there is no tag of the specified class.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use the UTType class instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCopyAllTagsWithClass(@NotNull CFStringRef inUTI,
            @NotNull CFStringRef inTagClass);

    /**
     * UTTypeEqual() *** DEPRECATED ***
     * 
     * Discussion:
     * Compares two identified types for equality. Types are equal if
     * their identifier strings are equal using a case-insensitive
     * comparison.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI1:
     * a uniform type identifier
     * 
     * inUTI2:
     * another uniform type identifier
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use -[UTType isEqual:] instead.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte UTTypeEqual(@NotNull CFStringRef inUTI1, @NotNull CFStringRef inUTI2);

    /**
     * UTTypeConformsTo() *** DEPRECATED ***
     * 
     * Discussion:
     * Tests for a conformance relationship between the two identified
     * types. Returns true if the types are equal, or if the first type
     * conforms, directly or indirectly, to the second type.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier to test
     * 
     * inConformsToUTI:
     * the uniform type identifier against which to test conformance.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use -[UTType conformsToType:] instead.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte UTTypeConformsTo(@NotNull CFStringRef inUTI, @NotNull CFStringRef inConformsToUTI);

    /**
     * UTTypeCopyDescription() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns the localized, user-readable type description string
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * Result:
     * a localized string, or NULL of no type description is available
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTType.localizedDescription instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyDescription(@NotNull CFStringRef inUTI);

    /**
     * UTTypeIsDeclared() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns whether or not the specified UTI has a declaration
     * registered on the current system. Dynamic UTIs are never
     * registered.
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * Result:
     * Whether or not the UTI is registered.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTType.declared instead.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte UTTypeIsDeclared(@NotNull CFStringRef inUTI);

    /**
     * UTTypeIsDynamic() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns whether or not the specified UTI is a dynamic UTI.
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * Result:
     * Whether or not the UTI is dynamic.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTType.dynamic instead.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte UTTypeIsDynamic(@NotNull CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaration() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns the identified type's declaration dictionary, as it
     * appears in the declaring bundle's info property list. This the
     * access path to other type properties for which direct access is
     * rarely needed.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * Result:
     * a tag declaration dictionary, or NULL if the type is not declared
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use the UTType class instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFDictionaryRef UTTypeCopyDeclaration(@NotNull CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaringBundleURL() *** DEPRECATED ***
     * 
     * Discussion:
     * Returns the URL of the bundle containing the type declaration of
     * the identified type.
     * 
     * Mac OS X threading:
     * Thread safe since version 10.3
     * 
     * Parameters:
     * 
     * inUTI:
     * the uniform type identifier
     * 
     * Result:
     * a URL, or NULL if the bundle cannot be located.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 14.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFURLRef UTTypeCopyDeclaringBundleURL(@NotNull CFStringRef inUTI);

    /**
     * kUTTypeItem *** DEPRECATED ***
     * 
     * generic base type for most things
     * (files, directories)
     * 
     * UTI: public.item
     * 
     * 
     * kUTTypeContent *** DEPRECATED ***
     * 
     * base type for anything containing user-viewable document content
     * (documents, pasteboard data, and document packages.) Types describing
     * files or packages must also conform to kUTTypeData or kUTTypePackage
     * in order for the system to bind documents to them.
     * 
     * UTI: public.content
     * 
     * 
     * kUTTypeCompositeContent *** DEPRECATED ***
     * 
     * base type for content formats supporting mixed embedded content
     * (i.e., compound documents)
     * 
     * UTI: public.composite-content
     * conforms to: public.content
     * 
     * 
     * kUTTypeMessage *** DEPRECATED ***
     * 
     * base type for messages (email, IM, etc.)
     * 
     * UTI: public.message
     * 
     * 
     * kUTTypeContact *** DEPRECATED ***
     * 
     * contact information, e.g. for a person, group, organization
     * 
     * UTI: public.contact
     * 
     * 
     * kUTTypeArchive *** DEPRECATED ***
     * 
     * an archive of files and directories
     * 
     * UTI: public.archive
     * 
     * 
     * kUTTypeDiskImage *** DEPRECATED ***
     * 
     * a data item mountable as a volume
     * 
     * UTI: public.disk-image
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeItem instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeItem();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeContent instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContent();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCompositeContent instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCompositeContent();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMessage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMessage();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeContact instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContact();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeArchive instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeArchive();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeDiskImage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDiskImage();

    /**
     * kUTTypeData *** DEPRECATED ***
     * 
     * base type for any sort of simple byte stream,
     * including files and in-memory data
     * 
     * UTI: public.data
     * conforms to: public.item
     * 
     * 
     * kUTTypeDirectory *** DEPRECATED ***
     * 
     * file system directory
     * (includes packages AND folders)
     * 
     * UTI: public.directory
     * conforms to: public.item
     * 
     * 
     * kUTTypeResolvable *** DEPRECATED ***
     * 
     * symlink and alias file types conform to this UTI
     * 
     * UTI: com.apple.resolvable
     * 
     * 
     * kUTTypeSymLink *** DEPRECATED ***
     * 
     * a symbolic link
     * 
     * UTI: public.symlink
     * conforms to: public.item, com.apple.resolvable
     * 
     * 
     * kUTTypeExecutable *** DEPRECATED ***
     * 
     * an executable item
     * UTI: public.executable
     * conforms to: public.item
     * 
     * 
     * kUTTypeMountPoint *** DEPRECATED ***
     * 
     * a volume mount point (resolvable, resolves to the root dir of a volume)
     * 
     * UTI: com.apple.mount-point
     * conforms to: public.item, com.apple.resolvable
     * 
     * 
     * kUTTypeAliasFile *** DEPRECATED ***
     * 
     * a fully-formed alias file
     * 
     * UTI: com.apple.alias-file
     * conforms to: public.data, com.apple.resolvable
     * 
     * 
     * kUTTypeAliasRecord *** DEPRECATED ***
     * 
     * raw alias data
     * 
     * UTI: com.apple.alias-record
     * conforms to: public.data, com.apple.resolvable
     * 
     * 
     * kUTTypeURLBookmarkData *** DEPRECATED ***
     * 
     * URL bookmark
     * 
     * UTI: com.apple.bookmark
     * conforms to: public.data, com.apple.resolvable
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeData instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeData();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeDirectory instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDirectory();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeResolvable instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeResolvable();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSymLink instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSymLink();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeExecutable instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeExecutable();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMountPoint instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMountPoint();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAliasFile instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasFile();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: The Alias Manager is obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasRecord();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeURLBookmarkData instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURLBookmarkData();

    /**
     * kUTTypeURL *** DEPRECATED ***
     * 
     * The bytes of a URL
     * (OSType 'url ')
     * 
     * UTI: public.url
     * conforms to: public.data
     * 
     * 
     * kUTTypeFileURL *** DEPRECATED ***
     * 
     * The text of a "file:" URL
     * (OSType 'furl')
     * 
     * UTI: public.file-url
     * conforms to: public.url
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeURL instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURL();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeFileURL instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFileURL();

    /**
     * kUTTypeText *** DEPRECATED ***
     * 
     * base type for all text-encoded data,
     * including text with markup (HTML, RTF, etc.)
     * 
     * UTI: public.text
     * conforms to: public.data, public.content
     * 
     * 
     * kUTTypePlainText *** DEPRECATED ***
     * 
     * text with no markup, unspecified encoding
     * 
     * UTI: public.plain-text
     * conforms to: public.text
     * 
     * 
     * kUTTypeUTF8PlainText *** DEPRECATED ***
     * 
     * plain text, UTF-8 encoding
     * (OSType 'utf8', NSPasteboardType "NSStringPBoardType")
     * 
     * UTI: public.utf8-plain-text
     * conforms to: public.plain-text
     * 
     * 
     * kUTTypeUTF16ExternalPlainText *** DEPRECATED ***
     * 
     * plain text, UTF-16 encoding, with BOM, or if BOM
     * is not present, has "external representation"
     * byte order (big-endian).
     * (OSType 'ut16')
     * 
     * UTI: public.utf16-external-plain-text
     * conforms to: public.plain-text
     * 
     * 
     * kUTTypeUTF16PlainText *** DEPRECATED ***
     * 
     * plain text, UTF-16 encoding, native byte order, optional BOM
     * (OSType 'utxt')
     * 
     * UTI: public.utf16-plain-text
     * conforms to: public.plain-text
     * 
     * 
     * kUTTypeDelimitedText *** DEPRECATED ***
     * 
     * text containing delimited values
     * 
     * UTI: public.delimited-values-text
     * conforms to: public.text
     * 
     * 
     * kUTTypeCommaSeparatedText *** DEPRECATED ***
     * 
     * text containing comma-separated values (.csv)
     * 
     * UTI: public.comma-separated-values-text
     * conforms to: public.delimited-values-text
     * 
     * 
     * kUTTypeTabSeparatedText *** DEPRECATED ***
     * 
     * text containing tab-separated values
     * 
     * UTI: public.tab-separated-values-text
     * conforms to: public.delimited-values-text
     * 
     * 
     * kUTTypeUTF8TabSeparatedText *** DEPRECATED ***
     * 
     * UTF-8 encoded text containing tab-separated values
     * 
     * UTI: public.utf8-tab-separated-values-text
     * conforms to: public.tab-separated-values-text, public.utf8-plain-text
     * 
     * 
     * kUTTypeRTF *** DEPRECATED ***
     * 
     * Rich Text Format
     * 
     * UTI: public.rtf
     * conforms to: public.text
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeText();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePlainText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlainText();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeUTF8PlainText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8PlainText();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeUTF16ExternalPlainText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16ExternalPlainText();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeUTF16PlainText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16PlainText();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeDelimitedText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDelimitedText();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCommaSeparatedText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCommaSeparatedText();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeTabSeparatedText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTabSeparatedText();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeUTF8TabSeparatedText instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8TabSeparatedText();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeRTF instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTF();

    /**
     * kUTTypeHTML *** DEPRECATED ***
     * 
     * HTML, any version
     * 
     * UTI: public.html
     * conforms to: public.text
     * 
     * 
     * kUTTypeXML *** DEPRECATED ***
     * 
     * generic XML
     * 
     * UTI: public.xml
     * conforms to: public.text
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeHTML instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeHTML();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeXML instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXML();

    /**
     * kUTTypeSourceCode *** DEPRECATED ***
     * 
     * abstract type for source code (any language)
     * 
     * UTI: public.source-code
     * conforms to: public.plain-text
     * 
     * 
     * kUTTypeAssemblyLanguageSource *** DEPRECATED ***
     * 
     * assembly language source (.s)
     * 
     * UTI: public.assembly-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeCSource *** DEPRECATED ***
     * 
     * C source code (.c)
     * 
     * UTI: public.c-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeObjectiveCSource *** DEPRECATED ***
     * 
     * Objective-C source code (.m)
     * 
     * UTI: public.objective-c-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeSwiftSource *** DEPRECATED ***
     * 
     * Swift source code (.swift)
     * 
     * UTI: public.swift-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeCPlusPlusSource *** DEPRECATED ***
     * 
     * C++ source code (.cp, etc.)
     * 
     * UTI: public.c-plus-plus-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeObjectiveCPlusPlusSource *** DEPRECATED ***
     * 
     * Objective-C++ source code
     * 
     * UTI: public.objective-c-plus-plus-source
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeCHeader *** DEPRECATED ***
     * 
     * C header
     * 
     * UTI: public.c-header
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeCPlusPlusHeader *** DEPRECATED ***
     * 
     * C++ header
     * 
     * UTI: public.c-plus-plus-header
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeJavaSource *** DEPRECATED ***
     * 
     * Java source code
     * 
     * UTI: com.sun.java-source
     * conforms to: public.source-code
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSourceCode instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSourceCode();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAssemblyLanguageSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAssemblyLanguageSource();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCSource();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeObjectiveCSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCSource();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSwiftSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSwiftSource();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCPlusPlusSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusSource();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeObjectiveCPlusPlusSource instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCPlusPlusSource();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCHeader instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCHeader();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCPlusPlusHeader instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusHeader();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Java support is no longer provided by this operating system. Install a JDK to use Java.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaSource();

    /**
     * kUTTypeScript *** DEPRECATED ***
     * 
     * scripting language source
     * 
     * UTI: public.script
     * conforms to: public.source-code
     * 
     * 
     * kUTTypeAppleScript *** DEPRECATED ***
     * 
     * AppleScript text format (.applescript)
     * 
     * UTI: com.apple.applescript.text
     * conforms to: public.script
     * 
     * 
     * kUTTypeOSAScript *** DEPRECATED ***
     * 
     * Open Scripting Architecture script binary format (.scpt)
     * 
     * UTI: com.apple.applescript.script
     * conforms to: public.data, public.script
     * 
     * 
     * kUTTypeOSAScriptBundle *** DEPRECATED ***
     * 
     * Open Scripting Architecture script bundle format (.scptd)
     * 
     * UTI: com.apple.applescript.script-bundle
     * conforms to: com.apple.bundle, com.apple.package, public.script
     * 
     * 
     * kUTTypeJavaScript *** DEPRECATED ***
     * 
     * JavaScript source code
     * 
     * UTI: com.netscape.javascript-source
     * conforms to: public.source-code, public.executable
     * 
     * 
     * kUTTypeShellScript *** DEPRECATED ***
     * 
     * base type for shell scripts
     * 
     * UTI: public.shell-script
     * conforms to: public.script
     * 
     * 
     * kUTTypePerlScript *** DEPRECATED ***
     * 
     * Perl script
     * 
     * UTI: public.perl-script
     * conforms to: public.shell-script
     * 
     * 
     * kUTTypePythonScript *** DEPRECATED ***
     * 
     * Python script
     * 
     * UTI: public.python-script
     * conforms to: public.shell-script
     * 
     * 
     * kUTTypeRubyScript *** DEPRECATED ***
     * 
     * Ruby script
     * 
     * UTI: public.ruby-script
     * conforms to: public.shell-script
     * 
     * 
     * kUTTypePHPScript *** DEPRECATED ***
     * 
     * PHP script
     * 
     * UTI: public.php-script
     * conforms to: public.shell-script
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAppleScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeOSAScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeOSAScriptBundle instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScriptBundle();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeJavaScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeShellScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeShellScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePerlScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePerlScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePythonScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePythonScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeRubyScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRubyScript();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePHPScript instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePHPScript();

    /**
     * kUTTypeJSON *** DEPRECATED ***
     * 
     * JavaScript object notation (JSON) data
     * NOTE: JSON almost but doesn't quite conform to
     * com.netscape.javascript-source
     * 
     * UTI: public.json
     * conforms to: public.text
     * 
     * 
     * kUTTypePropertyList *** DEPRECATED ***
     * 
     * base type for property lists
     * 
     * UTI: com.apple.property-list
     * conforms to: public.data
     * 
     * 
     * kUTTypeXMLPropertyList *** DEPRECATED ***
     * 
     * XML property list
     * 
     * UTI: com.apple.xml-property-list
     * conforms to: public.xml, com.apple.property-list
     * 
     * 
     * kUTTypeBinaryPropertyList *** DEPRECATED ***
     * 
     * XML property list
     * 
     * UTI: com.apple.binary-property-list
     * conforms to: com.apple.property-list
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeJSON instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJSON();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePropertyList instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePropertyList();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeXMLPropertyList instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXMLPropertyList();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeBinaryPropertyList instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBinaryPropertyList();

    /**
     * kUTTypePDF *** DEPRECATED ***
     * 
     * Adobe PDF
     * 
     * UTI: com.adobe.pdf
     * conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeRTFD *** DEPRECATED ***
     * 
     * Rich Text Format Directory
     * (RTF with content embedding, on-disk format)
     * 
     * UTI: com.apple.rtfd
     * conforms to: com.apple.package, public.composite-content
     * 
     * 
     * kUTTypeFlatRTFD *** DEPRECATED ***
     * 
     * Flattened RTFD (pasteboard format)
     * 
     * UTI: com.apple.flat-rtfd
     * conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeTXNTextAndMultimediaData *** DEPRECATED ***
     * 
     * MLTE (Textension) format for mixed text & multimedia data
     * (OSType 'txtn')
     * 
     * UTI: com.apple.txn.text-multimedia-data
     * conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeWebArchive *** DEPRECATED ***
     * 
     * The WebKit webarchive format
     * 
     * UTI: com.apple.webarchive
     * conforms to: public.data, public.composite-content
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePDF instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePDF();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeRTFD instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTFD();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeFlatRTFD instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFlatRTFD();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: The Multilingual Text Engine is obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTXNTextAndMultimediaData();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeWebArchive instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWebArchive();

    /**
     * kUTTypeImage *** DEPRECATED ***
     * 
     * abstract image data
     * 
     * UTI: public.image
     * conforms to: public.data, public.content
     * 
     * 
     * kUTTypeJPEG *** DEPRECATED ***
     * 
     * JPEG image
     * 
     * UTI: public.jpeg
     * conforms to: public.image
     * 
     * 
     * kUTTypeJPEG2000 *** DEPRECATED ***
     * 
     * JPEG-2000 image
     * 
     * UTI: public.jpeg-2000
     * conforms to: public.image
     * 
     * 
     * kUTTypeTIFF *** DEPRECATED ***
     * 
     * TIFF image
     * 
     * UTI: public.tiff
     * conforms to: public.image
     * 
     * 
     * kUTTypePICT *** DEPRECATED ***
     * 
     * Quickdraw PICT format
     * 
     * UTI: com.apple.pict
     * conforms to: public.image
     * 
     * 
     * kUTTypeGIF *** DEPRECATED ***
     * 
     * GIF image
     * 
     * UTI: com.compuserve.gif
     * conforms to: public.image
     * 
     * 
     * kUTTypePNG *** DEPRECATED ***
     * 
     * PNG image
     * 
     * UTI: public.png
     * conforms to: public.image
     * 
     * 
     * kUTTypeQuickTimeImage *** DEPRECATED ***
     * 
     * QuickTime image format (OSType 'qtif')
     * 
     * UTI: com.apple.quicktime-image
     * conforms to: public.image
     * 
     * 
     * kUTTypeAppleICNS *** DEPRECATED ***
     * 
     * Apple icon data
     * 
     * UTI: com.apple.icns
     * conforms to: public.image
     * 
     * 
     * kUTTypeBMP *** DEPRECATED ***
     * 
     * Windows bitmap
     * 
     * UTI: com.microsoft.bmp
     * conforms to: public.image
     * 
     * 
     * kUTTypeICO *** DEPRECATED ***
     * 
     * Windows icon data
     * 
     * UTI: com.microsoft.ico
     * conforms to: public.image
     * 
     * 
     * kUTTypeRawImage *** DEPRECATED ***
     * 
     * base type for raw image data (.raw)
     * 
     * UTI: public.camera-raw-image
     * conforms to: public.image
     * 
     * 
     * kUTTypeScalableVectorGraphics *** DEPRECATED ***
     * 
     * SVG image
     * 
     * UTI: public.svg-image
     * conforms to: public.image
     * 
     * kUTTypeLivePhoto *** DEPRECATED ***
     * 
     * Live Photo
     * 
     * UTI: com.apple.live-photo
     * 
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeImage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeImage();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeJPEG instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: JPEG2000 is no longer supported by this operating system.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG2000();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeTIFF instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTIFF();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: QuickDraw is obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePICT();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeGIF instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGIF();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePNG instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePNG();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: The QuickTime Image file format is obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeImage();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeICNS instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleICNS();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeBMP instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBMP();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeICO instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeICO();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeRAWImage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRawImage();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSVG instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScalableVectorGraphics();

    /**
     * API-Since: 9.1
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeLivePhoto instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLivePhoto();

    /**
     * kUTTypeAudiovisualContent *** DEPRECATED ***
     * 
     * audio and/or video content
     * 
     * UTI: public.audiovisual-content
     * conforms to: public.data, public.content
     * 
     * 
     * kUTTypeMovie *** DEPRECATED ***
     * 
     * A media format which may contain both video and audio
     * Corresponds to what users would label a "movie"
     * 
     * UTI: public.movie
     * conforms to: public.audiovisual-content
     * 
     * 
     * kUTTypeVideo *** DEPRECATED ***
     * 
     * pure video (no audio)
     * 
     * UTI: public.video
     * conforms to: public.movie
     * 
     * 
     * kUTTypeAudio *** DEPRECATED ***
     * 
     * pure audio (no video)
     * 
     * UTI: public.audio
     * conforms to: public.audiovisual-content
     * 
     * 
     * kUTTypeQuickTimeMovie *** DEPRECATED ***
     * 
     * QuickTime movie
     * 
     * UTI: com.apple.quicktime-movie
     * conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG *** DEPRECATED ***
     * 
     * MPEG-1 or MPEG-2 movie
     * 
     * UTI: public.mpeg
     * conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG2Video *** DEPRECATED ***
     * 
     * MPEG-2 video
     * 
     * UTI: public.mpeg-2-video
     * conforms to: public.video
     * 
     * 
     * kUTTypeMPEG2TransportStream *** DEPRECATED ***
     * 
     * MPEG-2 Transport Stream movie format
     * 
     * UTI: public.mpeg-2-transport-stream
     * conforms to: public.movie
     * 
     * 
     * kUTTypeMP3 *** DEPRECATED ***
     * 
     * MP3 audio
     * 
     * UTI: public.mp3
     * conforms to: public.audio
     * 
     * 
     * kUTTypeMPEG4 *** DEPRECATED ***
     * 
     * MPEG-4 movie
     * 
     * UTI: public.mpeg-4
     * conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG4Audio *** DEPRECATED ***
     * 
     * MPEG-4 audio layer
     * 
     * UTI: public.mpeg-4-audio
     * conforms to: public.mpeg-4, public.audio
     * 
     * 
     * kUTTypeAppleProtectedMPEG4Audio *** DEPRECATED ***
     * 
     * Apple protected MPEG4 format
     * (.m4p, iTunes music store format)
     * 
     * UTI: com.apple.protected-mpeg-4-audio
     * conforms to: public.audio
     * 
     * 
     * kUTTypeAppleProtectedMPEG4Video *** DEPRECATED ***
     * 
     * Apple protected MPEG-4 movie
     * 
     * UTI: com.apple.protected-mpeg-4-video
     * conforms to: com.apple.m4v-video
     * 
     * 
     * kUTTypeAVIMovie *** DEPRECATED ***
     * 
     * Audio Video Interleaved (AVI) movie format
     * 
     * UTI: public.avi
     * conforms to: public.movie
     * 
     * 
     * kUTTypeAudioInterchangeFileFormat *** DEPRECATED ***
     * 
     * AIFF audio format
     * 
     * UTI: public.aiff-audio
     * conforms to: public.aifc-audio
     * 
     * 
     * kUTTypeWaveformAudio *** DEPRECATED ***
     * 
     * Waveform audio format (.wav)
     * 
     * UTI: com.microsoft.waveform-audio
     * conforms to: public.audio
     * 
     * 
     * kUTTypeMIDIAudio *** DEPRECATED ***
     * 
     * MIDI audio format
     * 
     * UTI: public.midi-audio
     * conforms to: public.audio
     * 
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAudiovisualContent instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudiovisualContent();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMovie instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMovie();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeVideo instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVideo();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAudio instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudio();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeQuickTimeMovie instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeMovie();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMPEG instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMPEG2Video instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2Video();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMPEG2TransportStream instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2TransportStream();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMP3 instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMP3();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMPEG4Movie instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMPEG4Audio instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4Audio();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAppleProtectedMPEG4Audio instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Audio();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAppleProtectedMPEG4Video instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Video();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAVI instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAVIMovie();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeAIFF instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudioInterchangeFileFormat();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeWAV instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWaveformAudio();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeMIDI instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMIDIAudio();

    /**
     * kUTTypePlaylist *** DEPRECATED ***
     * 
     * base type for playlists
     * 
     * UTI: public.playlist
     * 
     * 
     * kUTTypeM3UPlaylist *** DEPRECATED ***
     * 
     * M3U or M3U8 playlist
     * 
     * UTI: public.m3u-playlist
     * conforms to: public.text, public.playlist
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePlaylist instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlaylist();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeM3UPlaylist instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeM3UPlaylist();

    /**
     * kUTTypeFolder *** DEPRECATED ***
     * 
     * a user-browsable directory (i.e., not a package)
     * 
     * UTI: public.folder
     * conforms to: public.directory
     * 
     * 
     * kUTTypeVolume *** DEPRECATED ***
     * 
     * the root folder of a volume/mount point
     * 
     * UTI: public.volume
     * conforms to: public.folder
     * 
     * 
     * kUTTypePackage *** DEPRECATED ***
     * 
     * a packaged directory
     * 
     * UTI: com.apple.package
     * conforms to: public.directory
     * 
     * 
     * kUTTypeBundle *** DEPRECATED ***
     * 
     * a directory conforming to one of the CFBundle layouts
     * 
     * UTI: com.apple.bundle
     * conforms to: public.directory
     * 
     * 
     * kUTTypePluginBundle *** DEPRECATED ***
     * 
     * base type for bundle-based plugins
     * 
     * UTI: com.apple.plugin
     * conforms to: com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeSpotlightImporter *** DEPRECATED ***
     * 
     * a Spotlight metadata importer
     * 
     * UTI: com.apple.metadata-importer
     * conforms to: com.apple.plugin
     * 
     * 
     * kUTTypeQuickLookGenerator *** DEPRECATED ***
     * 
     * a QuickLook preview generator
     * 
     * UTI: com.apple.quicklook-generator
     * conforms to: com.apple.plugin
     * 
     * 
     * kUTTypeXPCService *** DEPRECATED ***
     * 
     * an XPC service
     * 
     * UTI: com.apple.xpc-service
     * conforms to: com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeFramework *** DEPRECATED ***
     * 
     * a Mac OS X framework
     * 
     * UTI: com.apple.framework
     * conforms to: com.apple.bundle
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeFolder instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFolder();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeVolume instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVolume();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePackage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePackage();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeBundle instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBundle();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePluginBundle instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePluginBundle();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSpotlightImporter instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpotlightImporter();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeQuickLookGenerator instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickLookGenerator();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeXPCService instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXPCService();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeFramework instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFramework();

    /**
     * kUTTypeApplication *** DEPRECATED ***
     * 
     * base type for OS X applications, launchable items
     * 
     * UTI: com.apple.application
     * conforms to: public.executable
     * 
     * 
     * kUTTypeApplicationBundle *** DEPRECATED ***
     * 
     * a bundled application
     * 
     * UTI: com.apple.application-bundle
     * conforms to: com.apple.application, com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeApplicationFile *** DEPRECATED ***
     * 
     * a single-file Carbon/Classic application
     * 
     * UTI: com.apple.application-file
     * conforms to: com.apple.application, public.data
     * 
     * 
     * kUTTypeUnixExecutable *** DEPRECATED ***
     * 
     * a UNIX executable (flat file)
     * 
     * UTI: public.unix-executable
     * conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeWindowsExecutable *** DEPRECATED ***
     * 
     * a Windows executable (.exe files)
     * 
     * UTI: com.microsoft.windows-executable
     * conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeJavaClass *** DEPRECATED ***
     * 
     * a Java class
     * 
     * UTI: com.sun.java-class
     * conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeJavaArchive *** DEPRECATED ***
     * 
     * a Java archive (.jar)
     * 
     * UTI: com.sun.java-archive
     * conforms to: public.zip-archive, public.executable
     * 
     * 
     * kUTTypeSystemPreferencesPane *** DEPRECATED ***
     * 
     * a System Preferences pane
     * 
     * UTI: com.apple.systempreference.prefpane
     * conforms to: com.apple.package, com.apple.bundle
     * 
     * Abstract executable types
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeApplication instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplication();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeApplicationBundle instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationBundle();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Classic applications are obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationFile();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeUnixExecutable instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUnixExecutable();

    /**
     * Other platform binaries
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeEXE instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWindowsExecutable();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Java support is no longer provided by this operating system. Install a JDK to use Java.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaClass();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Java support is no longer provided by this operating system. Install a JDK to use Java.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaArchive();

    /**
     * Misc. binaries
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSystemPreferencesPane instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSystemPreferencesPane();

    /**
     * kUTTypeGNUZipArchive *** DEPRECATED ***
     * 
     * a GNU zip archive (gzip)
     * 
     * UTI: org.gnu.gnu-zip-archive
     * conforms to: public.data, public.archive
     * 
     * 
     * kUTTypeBzip2Archive *** DEPRECATED ***
     * 
     * a bzip2 archive (.bz2)
     * 
     * UTI: public.bzip2-archive
     * conforms to: public.data, public.archive
     * 
     * 
     * kUTTypeZipArchive *** DEPRECATED ***
     * 
     * a zip archive
     * 
     * UTI: public.zip-archive
     * conforms to: com.pkware.zip-archive
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeGZIP instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGNUZipArchive();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeBZ2 instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBzip2Archive();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeZIP instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeZipArchive();

    /**
     * kUTTypeSpreadsheet *** DEPRECATED ***
     * 
     * base spreadsheet document type
     * 
     * UTI: public.spreadsheet
     * conforms to: public.content
     * 
     * 
     * kUTTypePresentation *** DEPRECATED ***
     * 
     * base presentation document type
     * 
     * UTI: public.presentation
     * conforms to: public.composite-content
     * 
     * 
     * kUTTypeDatabase *** DEPRECATED ***
     * 
     * a database store
     * 
     * UTI: public.database
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeSpreadsheet instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpreadsheet();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePresentation instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePresentation();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeDatabase instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDatabase();

    /**
     * kUTTypeVCard *** DEPRECATED ***
     * 
     * VCard format
     * 
     * UTI: public.vcard
     * conforms to: public.text, public.contact
     * 
     * 
     * kUTTypeToDoItem *** DEPRECATED ***
     * 
     * to-do item
     * 
     * UTI: public.to-do-item
     * 
     * 
     * kUTTypeCalendarEvent *** DEPRECATED ***
     * 
     * calendar event
     * 
     * UTI: public.calendar-event
     * 
     * 
     * kUTTypeEmailMessage *** DEPRECATED ***
     * 
     * e-mail message
     * 
     * UTI: public.email-message
     * conforms to: public.message
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeVCard instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVCard();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeToDoItem instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeToDoItem();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeCalendarEvent instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCalendarEvent();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeEmailMessage instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeEmailMessage();

    /**
     * kUTTypeInternetLocation *** DEPRECATED ***
     * 
     * base type for Apple Internet locations
     * 
     * UTI: com.apple.internet-location
     * conforms to: public.data
     * 
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeInternetLocation instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInternetLocation();

    /**
     * kUTTypeInkText *** DEPRECATED ***
     * 
     * Opaque InkText data
     * 
     * UTI: com.apple.ink.inktext
     * conforms to: public.data
     * 
     * 
     * kUTTypeFont *** DEPRECATED ***
     * 
     * base type for fonts
     * 
     * UTI: public.font
     * 
     * 
     * kUTTypeBookmark *** DEPRECATED ***
     * 
     * bookmark
     * 
     * UTI: public.bookmark
     * 
     * 
     * kUTType3DContent *** DEPRECATED ***
     * 
     * base type for 3D content
     * 
     * UTI: public.3d-content
     * conforms to: public.content
     * 
     * 
     * kUTTypePKCS12 *** DEPRECATED ***
     * 
     * PKCS#12 format
     * 
     * UTI: com.rsa.pkcs-12
     * conforms to: public.data
     * 
     * 
     * kUTTypeX509Certificate *** DEPRECATED ***
     * 
     * X.509 certificate format
     * 
     * UTI: public.x509-certificate
     * conforms to: public.data
     * 
     * 
     * kUTTypeElectronicPublication *** DEPRECATED ***
     * 
     * ePub format
     * 
     * UTI: org.idpf.epub-container
     * conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeLog *** DEPRECATED ***
     * 
     * console log
     * 
     * UTI: public.log
     * 
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: The Ink framework is obsolete.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInkText();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeFont instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFont();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeBookmark instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBookmark();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTType3DContent instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTType3DContent();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypePKCS12 instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePKCS12();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeX509Certificate instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeX509Certificate();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeEPUB instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeElectronicPublication();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTypeLog instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLog();

    /**
     * Type Declaration Dictionary Keys
     * 
     * The following keys are used in type declarations
     * kUTExportedTypeDeclarationsKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTExportedTypeDeclarationsKey();

    /**
     * kUTImportedTypeDeclarationsKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTImportedTypeDeclarationsKey();

    /**
     * kUTTypeIdentifierKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIdentifierKey();

    /**
     * kUTTypeTagSpecificationKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTagSpecificationKey();

    /**
     * kUTTypeConformsToKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeConformsToKey();

    /**
     * kUTTypeDescriptionKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDescriptionKey();

    /**
     * kUTTypeIconFileKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIconFileKey();

    /**
     * kUTTypeReferenceURLKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeReferenceURLKey();

    /**
     * kUTTypeVersionKey
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVersionKey();

    /**
     * Type Tag Classes
     * 
     * The following constant strings identify tag classes for use
     * when converting uniform type identifiers to and from
     * equivalent tags.
     * kUTTagClassFilenameExtension *** DEPRECATED ***
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTagClassFilenameExtension instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassFilenameExtension();

    /**
     * kUTTagClassMIMEType *** DEPRECATED ***
     * 
     * API-Since: 3.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use UTTagClassMIMEType instead.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassMIMEType();
}
