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
     * UTTypeCreatePreferredIdentifierForTag()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Creates a uniform type identifier for the type indicated by the
     *   specified tag. This is the primary function to use for going from
     *   tag (extension/MIMEType/OSType) to uniform type identifier.
     *   Optionally, the returned type identifiers must conform to the
     *   identified "conforming-to" type argument. This is a hint to the
     *   implementation to constrain the search to a particular tree of
     *   types. For example, the client may want to know the type
     *   indicated by a particular extension tag. If the client knows that
     *   the extension is associated with a directory (rather than a
     *   file), the client may specify "public.directory" for the
     *   conforming-to argument. This will allow the implementation to
     *   ignore all types associated with byte data formats (public.data
     *   base type). If more than one type is indicated, preference is
     *   given to a public type over a non-public type on the theory that
     *   instances of public types are more common, and therefore more
     *   likely to be correct. When there a choice must be made between
     *   multiple public types or multiple non-public types, the selection
     *   rules are undefined. Clients needing finer control should use
     *   UTTypeCreateAllIdentifiersForTag. If no declared type is
     *   indicated, a dynamic type identifier is generated which satisfies
     *   the parameters.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inTagClass:
     *     the class identifier of the tag argument
     * 
     *   inTag:
     *     the tag string
     * 
     *   inConformingToUTI:
     *     the identifier of a type to which the result must conform
     * 
     * Result:
     *   a new CFStringRef containing the type identifier, or NULL if
     *   inTagClass is not a known tag class
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCreatePreferredIdentifierForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    /**
     * UTTypeCreateAllIdentifiersForTag()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Creates an array of all uniform type identifiers indicated by the
     *   specified tag. An overloaded tag (e.g., an extension used by
     *   several applications for different file formats) may indicate
     *   multiple types. If no declared type identifiers have the
     *   specified tag, then a single dynamic type identifier will be
     *   created for the tag. Optionally, the returned type identifiers
     *   must conform to the identified "conforming-to" type argument.
     *   This is a hint to the implementation to constrain the search to a
     *   particular tree of types. For example, the client may want to
     *   know the type indicated by a particular extension tag. If the
     *   client knows that the extension is associated with a directory
     *   (rather than a file), the client may specify "public.directory"
     *   for the conforming-to argument. This will allow the
     *   implementation to ignore all types associated with byte data
     *   formats (public.data base type).
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inTagClass:
     *     the class identifier of the tag argument
     * 
     *   inTag:
     *     the tag string
     * 
     *   inConformingToUTI:
     *     the identifier of a type to which the results must conform
     * 
     * Result:
     *   An array of uniform type identifiers, or NULL if inTagClass is
     *   not a known tag class
     */
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCreateAllIdentifiersForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    /**
     * UTTypeCopyPreferredTagWithClass()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns the identified type's preferred tag with the specified
     *   tag class as a CFString. This is the primary function to use for
     *   going from uniform type identifier to tag. If the type
     *   declaration included more than one tag with the specified class,
     *   the first tag in the declared tag array is the preferred tag.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     *   inTagClass:
     *     the class of tags to return
     * 
     * Result:
     *   the tag string, or NULL if there is no tag of the specified class.
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyPreferredTagWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    /**
     * UTTypeCopyAllTagsWithClass()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns each of the identified type's tags with the specified
     *   tag class as a CFArray of CFStrings.
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     *   inTagClass:
     *     the class of tags to return
     * 
     * Result:
     *   an array of tag strings, or NULL if there is no tag of the specified class.
     */
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCopyAllTagsWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    /**
     * UTTypeEqual()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Compares two identified types for equality. Types are equal if
     *   their identifier strings are equal using a case-insensitive
     *   comparison.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI1:
     *     a uniform type identifier
     * 
     *   inUTI2:
     *     another uniform type identifier
     */
    @Generated
    @CFunction
    public static native byte UTTypeEqual(CFStringRef inUTI1, CFStringRef inUTI2);

    /**
     * UTTypeConformsTo()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Tests for a conformance relationship between the two identified
     *   types. Returns true if the types are equal, or if the first type
     *   conforms, directly or indirectly, to the second type.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier to test
     * 
     *   inConformsToUTI:
     *     the uniform type identifier against which to test conformance.
     */
    @Generated
    @CFunction
    public static native byte UTTypeConformsTo(CFStringRef inUTI, CFStringRef inConformsToUTI);

    /**
     * UTTypeCopyDescription()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns the localized, user-readable type description string
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     * Result:
     *   a localized string, or NULL of no type description is available
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyDescription(CFStringRef inUTI);

    /**
     * UTTypeIsDeclared()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns whether or not the specified UTI has a declaration
     *   registered on the current system. Dynamic UTIs are never
     *   registered.
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     * Result:
     *   Whether or not the UTI is registered.
     */
    @Generated
    @CFunction
    public static native byte UTTypeIsDeclared(CFStringRef inUTI);

    /**
     * UTTypeIsDynamic()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns whether or not the specified UTI is a dynamic UTI.
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     * Result:
     *   Whether or not the UTI is dynamic.
     */
    @Generated
    @CFunction
    public static native byte UTTypeIsDynamic(CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaration()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns the identified type's declaration dictionary, as it
     *   appears in the declaring bundle's info property list. This the
     *   access path to other type properties for which direct access is
     *   rarely needed.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     * Result:
     *   a tag declaration dictionary, or NULL if the type is not declared
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef UTTypeCopyDeclaration(CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaringBundleURL()   *** DEPRECATED ***
     * 
     * Discussion:
     *   Returns the URL of the bundle containing the type declaration of
     *   the identified type.
     * 
     * Mac OS X threading:
     *   Thread safe since version 10.3
     * 
     * Parameters:
     * 
     *   inUTI:
     *     the uniform type identifier
     * 
     * Result:
     *   a URL, or NULL if the bundle cannot be located.
     */
    @Generated
    @CFunction
    public static native CFURLRef UTTypeCopyDeclaringBundleURL(CFStringRef inUTI);

    /**
     * kUTTypeItem   *** DEPRECATED ***
     * 
     *   generic base type for most things
     *   (files, directories)
     * 
     *   UTI: public.item
     * 
     * 
     * kUTTypeContent   *** DEPRECATED ***
     * 
     *   base type for anything containing user-viewable document content
     *   (documents, pasteboard data, and document packages.) Types describing
     *   files or packages must also conform to kUTTypeData or kUTTypePackage
     *   in order for the system to bind documents to them.
     * 
     *   UTI: public.content
     * 
     * 
     * kUTTypeCompositeContent   *** DEPRECATED ***
     * 
     *   base type for content formats supporting mixed embedded content
     *   (i.e., compound documents)
     * 
     *   UTI: public.composite-content
     *   conforms to: public.content
     * 
     * 
     * kUTTypeMessage   *** DEPRECATED ***
     * 
     *   base type for messages (email, IM, etc.)
     * 
     *   UTI: public.message
     * 
     * 
     * kUTTypeContact   *** DEPRECATED ***
     * 
     *   contact information, e.g. for a person, group, organization
     * 
     *   UTI: public.contact
     * 
     * 
     * kUTTypeArchive   *** DEPRECATED ***
     * 
     *   an archive of files and directories
     * 
     *   UTI: public.archive
     * 
     * 
     * kUTTypeDiskImage   *** DEPRECATED ***
     * 
     *   a data item mountable as a volume
     * 
     *   UTI: public.disk-image
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeItem();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCompositeContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMessage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContact();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDiskImage();

    /**
     * kUTTypeData   *** DEPRECATED ***
     * 
     *   base type for any sort of simple byte stream,
     *   including files and in-memory data
     * 
     *   UTI: public.data
     *   conforms to: public.item
     * 
     * 
     * kUTTypeDirectory   *** DEPRECATED ***
     * 
     *   file system directory
     *   (includes packages AND folders)
     * 
     *   UTI: public.directory
     *   conforms to: public.item
     * 
     * 
     * kUTTypeResolvable   *** DEPRECATED ***
     * 
     *   symlink and alias file types conform to this UTI
     * 
     *   UTI: com.apple.resolvable
     * 
     * 
     * kUTTypeSymLink   *** DEPRECATED ***
     * 
     *   a symbolic link
     * 
     *   UTI: public.symlink
     *   conforms to: public.item, com.apple.resolvable
     * 
     * 
     * kUTTypeExecutable   *** DEPRECATED ***
     * 
     *   an executable item
     *   UTI: public.executable
     *   conforms to: public.item
     * 
     * 
     * kUTTypeMountPoint   *** DEPRECATED ***
     * 
     *   a volume mount point (resolvable, resolves to the root dir of a volume)
     * 
     *   UTI: com.apple.mount-point
     *   conforms to: public.item, com.apple.resolvable
     * 
     * 
     * kUTTypeAliasFile   *** DEPRECATED ***
     * 
     *   a fully-formed alias file
     * 
     *   UTI: com.apple.alias-file
     *   conforms to: public.data, com.apple.resolvable
     * 
     * 
     * kUTTypeAliasRecord   *** DEPRECATED ***
     * 
     *   raw alias data
     * 
     *   UTI: com.apple.alias-record
     *   conforms to: public.data, com.apple.resolvable
     * 
     * 
     * kUTTypeURLBookmarkData   *** DEPRECATED ***
     * 
     *   URL bookmark
     * 
     *   UTI: com.apple.bookmark
     *   conforms to: public.data, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeData();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDirectory();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeResolvable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSymLink();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeExecutable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMountPoint();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasFile();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasRecord();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURLBookmarkData();

    /**
     * kUTTypeURL   *** DEPRECATED ***
     * 
     *   The bytes of a URL
     *   (OSType 'url ')
     * 
     *   UTI: public.url
     *   conforms to: public.data
     * 
     * 
     * kUTTypeFileURL   *** DEPRECATED ***
     * 
     *   The text of a "file:" URL
     *   (OSType 'furl')
     * 
     *   UTI: public.file-url
     *   conforms to: public.url
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURL();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFileURL();

    /**
     * kUTTypeText   *** DEPRECATED ***
     * 
     *   base type for all text-encoded data,
     *   including text with markup (HTML, RTF, etc.)
     * 
     *   UTI: public.text
     *   conforms to: public.data, public.content
     * 
     * 
     * kUTTypePlainText   *** DEPRECATED ***
     * 
     *   text with no markup, unspecified encoding
     * 
     *   UTI: public.plain-text
     *   conforms to: public.text
     * 
     * 
     * kUTTypeUTF8PlainText   *** DEPRECATED ***
     * 
     *   plain text, UTF-8 encoding
     *   (OSType 'utf8', NSPasteboardType "NSStringPBoardType")
     * 
     *   UTI: public.utf8-plain-text
     *   conforms to: public.plain-text
     * 
     * 
     * kUTTypeUTF16ExternalPlainText   *** DEPRECATED ***
     * 
     *   plain text, UTF-16 encoding, with BOM, or if BOM
     *   is not present, has "external representation"
     *   byte order (big-endian).
     *   (OSType 'ut16')
     * 
     *   UTI: public.utf16-external-plain-text
     *   conforms to: public.plain-text
     * 
     * 
     * kUTTypeUTF16PlainText   *** DEPRECATED ***
     * 
     *   plain text, UTF-16 encoding, native byte order, optional BOM
     *   (OSType 'utxt')
     * 
     *   UTI: public.utf16-plain-text
     *   conforms to: public.plain-text
     * 
     * 
     * kUTTypeDelimitedText   *** DEPRECATED ***
     * 
     *   text containing delimited values
     * 
     *   UTI: public.delimited-values-text
     *   conforms to: public.text
     * 
     * 
     * kUTTypeCommaSeparatedText   *** DEPRECATED ***
     * 
     *   text containing comma-separated values (.csv)
     * 
     *   UTI: public.comma-separated-values-text
     *   conforms to: public.delimited-values-text
     * 
     * 
     * kUTTypeTabSeparatedText   *** DEPRECATED ***
     * 
     *   text containing tab-separated values
     * 
     *   UTI: public.tab-separated-values-text
     *   conforms to: public.delimited-values-text
     * 
     * 
     * kUTTypeUTF8TabSeparatedText   *** DEPRECATED ***
     * 
     *   UTF-8 encoded text containing tab-separated values
     * 
     *   UTI: public.utf8-tab-separated-values-text
     *   conforms to: public.tab-separated-values-text, public.utf8-plain-text
     * 
     * 
     * kUTTypeRTF   *** DEPRECATED ***
     * 
     *   Rich Text Format
     * 
     *   UTI: public.rtf
     *   conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8PlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16ExternalPlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16PlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDelimitedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCommaSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTabSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8TabSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTF();

    /**
     * kUTTypeHTML   *** DEPRECATED ***
     * 
     *   HTML, any version
     * 
     *   UTI: public.html
     *   conforms to: public.text
     * 
     * 
     * kUTTypeXML   *** DEPRECATED ***
     * 
     *   generic XML
     * 
     *   UTI: public.xml
     *   conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeHTML();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXML();

    /**
     * kUTTypeSourceCode   *** DEPRECATED ***
     * 
     *   abstract type for source code (any language)
     * 
     *   UTI: public.source-code
     *   conforms to: public.plain-text
     * 
     * 
     * kUTTypeAssemblyLanguageSource   *** DEPRECATED ***
     * 
     *   assembly language source (.s)
     * 
     *   UTI: public.assembly-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeCSource   *** DEPRECATED ***
     * 
     *   C source code (.c)
     * 
     *   UTI: public.c-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeObjectiveCSource   *** DEPRECATED ***
     * 
     *   Objective-C source code (.m)
     * 
     *   UTI: public.objective-c-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeSwiftSource   *** DEPRECATED ***
     * 
     *   Swift source code (.swift)
     * 
     *   UTI: public.swift-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeCPlusPlusSource   *** DEPRECATED ***
     * 
     *   C++ source code (.cp, etc.)
     * 
     *   UTI: public.c-plus-plus-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeObjectiveCPlusPlusSource   *** DEPRECATED ***
     * 
     *   Objective-C++ source code
     * 
     *   UTI: public.objective-c-plus-plus-source
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeCHeader   *** DEPRECATED ***
     * 
     *   C header
     * 
     *   UTI: public.c-header
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeCPlusPlusHeader   *** DEPRECATED ***
     * 
     *   C++ header
     * 
     *   UTI: public.c-plus-plus-header
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeJavaSource   *** DEPRECATED ***
     * 
     *   Java source code
     * 
     *   UTI: com.sun.java-source
     *   conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSourceCode();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAssemblyLanguageSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSwiftSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCPlusPlusSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCHeader();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusHeader();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaSource();

    /**
     * kUTTypeScript   *** DEPRECATED ***
     * 
     *   scripting language source
     * 
     *   UTI: public.script
     *   conforms to: public.source-code
     * 
     * 
     * kUTTypeAppleScript   *** DEPRECATED ***
     * 
     *   AppleScript text format (.applescript)
     * 
     *   UTI: com.apple.applescript.text
     *   conforms to: public.script
     * 
     * 
     * kUTTypeOSAScript   *** DEPRECATED ***
     * 
     *   Open Scripting Architecture script binary format (.scpt)
     * 
     *   UTI: com.apple.applescript.script
     *   conforms to: public.data, public.script
     * 
     * 
     * kUTTypeOSAScriptBundle   *** DEPRECATED ***
     * 
     *   Open Scripting Architecture script bundle format (.scptd)
     * 
     *   UTI: com.apple.applescript.script-bundle
     *   conforms to: com.apple.bundle, com.apple.package, public.script
     * 
     * 
     * kUTTypeJavaScript   *** DEPRECATED ***
     * 
     *   JavaScript source code
     * 
     *   UTI: com.netscape.javascript-source
     *   conforms to: public.source-code, public.executable
     * 
     * 
     * kUTTypeShellScript   *** DEPRECATED ***
     * 
     *   base type for shell scripts
     * 
     *   UTI: public.shell-script
     *   conforms to: public.script
     * 
     * 
     * kUTTypePerlScript   *** DEPRECATED ***
     * 
     *   Perl script
     * 
     *   UTI: public.perl-script
     *   conforms to: public.shell-script
     * 
     * 
     * kUTTypePythonScript   *** DEPRECATED ***
     * 
     *   Python script
     * 
     *   UTI: public.python-script
     *   conforms to: public.shell-script
     * 
     * 
     * kUTTypeRubyScript   *** DEPRECATED ***
     * 
     *   Ruby script
     * 
     *   UTI: public.ruby-script
     *   conforms to: public.shell-script
     * 
     * 
     * kUTTypePHPScript   *** DEPRECATED ***
     * 
     *   PHP script
     * 
     *   UTI: public.php-script
     *   conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScriptBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeShellScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePerlScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePythonScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRubyScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePHPScript();

    /**
     * kUTTypeJSON   *** DEPRECATED ***
     * 
     *   JavaScript object notation (JSON) data
     *   NOTE: JSON almost but doesn't quite conform to
     *   com.netscape.javascript-source
     * 
     *   UTI: public.json
     *   conforms to: public.text
     * 
     * 
     * kUTTypePropertyList   *** DEPRECATED ***
     * 
     *   base type for property lists
     * 
     *   UTI: com.apple.property-list
     *   conforms to: public.data
     * 
     * 
     * kUTTypeXMLPropertyList   *** DEPRECATED ***
     * 
     *   XML property list
     * 
     *   UTI: com.apple.xml-property-list
     *   conforms to: public.xml, com.apple.property-list
     * 
     * 
     * kUTTypeBinaryPropertyList   *** DEPRECATED ***
     * 
     *   XML property list
     * 
     *   UTI: com.apple.binary-property-list
     *   conforms to: com.apple.property-list
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJSON();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePropertyList();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXMLPropertyList();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBinaryPropertyList();

    /**
     * kUTTypePDF   *** DEPRECATED ***
     * 
     *   Adobe PDF
     * 
     *   UTI: com.adobe.pdf
     *   conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeRTFD   *** DEPRECATED ***
     * 
     *   Rich Text Format Directory
     *   (RTF with content embedding, on-disk format)
     * 
     *   UTI: com.apple.rtfd
     *   conforms to: com.apple.package, public.composite-content
     * 
     * 
     * kUTTypeFlatRTFD   *** DEPRECATED ***
     * 
     *   Flattened RTFD (pasteboard format)
     * 
     *   UTI: com.apple.flat-rtfd
     *   conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeTXNTextAndMultimediaData   *** DEPRECATED ***
     * 
     *   MLTE (Textension) format for mixed text & multimedia data
     *   (OSType 'txtn')
     * 
     *   UTI: com.apple.txn.text-multimedia-data
     *   conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeWebArchive   *** DEPRECATED ***
     * 
     *   The WebKit webarchive format
     * 
     *   UTI: com.apple.webarchive
     *   conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePDF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTFD();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFlatRTFD();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTXNTextAndMultimediaData();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWebArchive();

    /**
     * kUTTypeImage   *** DEPRECATED ***
     * 
     *   abstract image data
     * 
     *   UTI: public.image
     *   conforms to: public.data, public.content
     * 
     * 
     * kUTTypeJPEG   *** DEPRECATED ***
     * 
     *   JPEG image
     * 
     *   UTI: public.jpeg
     *   conforms to: public.image
     * 
     * 
     * kUTTypeJPEG2000   *** DEPRECATED ***
     * 
     *   JPEG-2000 image
     * 
     *   UTI: public.jpeg-2000
     *   conforms to: public.image
     * 
     * 
     * kUTTypeTIFF   *** DEPRECATED ***
     * 
     *   TIFF image
     * 
     *   UTI: public.tiff
     *   conforms to: public.image
     * 
     * 
     * kUTTypePICT   *** DEPRECATED ***
     * 
     *   Quickdraw PICT format
     * 
     *   UTI: com.apple.pict
     *   conforms to: public.image
     * 
     * 
     * kUTTypeGIF   *** DEPRECATED ***
     * 
     *   GIF image
     * 
     *   UTI: com.compuserve.gif
     *   conforms to: public.image
     * 
     * 
     * kUTTypePNG   *** DEPRECATED ***
     * 
     *   PNG image
     * 
     *   UTI: public.png
     *   conforms to: public.image
     * 
     * 
     * kUTTypeQuickTimeImage   *** DEPRECATED ***
     * 
     *   QuickTime image format (OSType 'qtif')
     * 
     *   UTI: com.apple.quicktime-image
     *   conforms to: public.image
     * 
     * 
     * kUTTypeAppleICNS   *** DEPRECATED ***
     * 
     *   Apple icon data
     * 
     *   UTI: com.apple.icns
     *   conforms to: public.image
     * 
     * 
     * kUTTypeBMP   *** DEPRECATED ***
     * 
     *   Windows bitmap
     * 
     *   UTI: com.microsoft.bmp
     *   conforms to: public.image
     * 
     * 
     * kUTTypeICO   *** DEPRECATED ***
     * 
     *   Windows icon data
     * 
     *   UTI: com.microsoft.ico
     *   conforms to: public.image
     * 
     * 
     * kUTTypeRawImage   *** DEPRECATED ***
     * 
     *   base type for raw image data (.raw)
     * 
     *   UTI: public.camera-raw-image
     *   conforms to: public.image
     * 
     * 
     * kUTTypeScalableVectorGraphics   *** DEPRECATED ***
     * 
     *   SVG image
     * 
     *   UTI: public.svg-image
     *   conforms to: public.image
     * 
     * kUTTypeLivePhoto   *** DEPRECATED ***
     * 
     *   Live Photo
     * 
     *   UTI: com.apple.live-photo
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG2000();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePICT();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGIF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePNG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleICNS();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBMP();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeICO();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRawImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScalableVectorGraphics();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLivePhoto();

    /**
     * kUTTypeAudiovisualContent   *** DEPRECATED ***
     * 
     *   audio and/or video content
     * 
     *   UTI: public.audiovisual-content
     *   conforms to: public.data, public.content
     * 
     * 
     * kUTTypeMovie   *** DEPRECATED ***
     * 
     *   A media format which may contain both video and audio
     *   Corresponds to what users would label a "movie"
     * 
     *   UTI: public.movie
     *   conforms to: public.audiovisual-content
     * 
     * 
     * kUTTypeVideo   *** DEPRECATED ***
     * 
     *   pure video (no audio)
     * 
     *   UTI: public.video
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeAudio   *** DEPRECATED ***
     * 
     *   pure audio (no video)
     * 
     *   UTI: public.audio
     *   conforms to: public.audiovisual-content
     * 
     * 
     * kUTTypeQuickTimeMovie   *** DEPRECATED ***
     * 
     *   QuickTime movie
     * 
     *   UTI: com.apple.quicktime-movie
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG   *** DEPRECATED ***
     * 
     *   MPEG-1 or MPEG-2 movie
     * 
     *   UTI: public.mpeg
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG2Video   *** DEPRECATED ***
     * 
     *   MPEG-2 video
     * 
     *   UTI: public.mpeg-2-video
     *   conforms to: public.video
     * 
     * 
     * kUTTypeMPEG2TransportStream   *** DEPRECATED ***
     * 
     *   MPEG-2 Transport Stream movie format
     * 
     *   UTI: public.mpeg-2-transport-stream
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeMP3   *** DEPRECATED ***
     * 
     *   MP3 audio
     * 
     *   UTI: public.mp3
     *   conforms to: public.audio
     * 
     * 
     * kUTTypeMPEG4   *** DEPRECATED ***
     * 
     *   MPEG-4 movie
     * 
     *   UTI: public.mpeg-4
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeMPEG4Audio   *** DEPRECATED ***
     * 
     *   MPEG-4 audio layer
     * 
     *   UTI: public.mpeg-4-audio
     *   conforms to: public.mpeg-4, public.audio
     * 
     * 
     * kUTTypeAppleProtectedMPEG4Audio   *** DEPRECATED ***
     * 
     *   Apple protected MPEG4 format
     *   (.m4p, iTunes music store format)
     * 
     *   UTI: com.apple.protected-mpeg-4-audio
     *   conforms to: public.audio
     * 
     * 
     * kUTTypeAppleProtectedMPEG4Video   *** DEPRECATED ***
     * 
     *   Apple protected MPEG-4 movie
     * 
     *   UTI: com.apple.protected-mpeg-4-video
     *   conforms to: com.apple.m4v-video
     * 
     * 
     * kUTTypeAVIMovie   *** DEPRECATED ***
     * 
     *   Audio Video Interleaved (AVI) movie format
     * 
     *   UTI: public.avi
     *   conforms to: public.movie
     * 
     * 
     * kUTTypeAudioInterchangeFileFormat   *** DEPRECATED ***
     * 
     *   AIFF audio format
     * 
     *   UTI: public.aiff-audio
     *   conforms to: public.aifc-audio
     * 
     * 
     * kUTTypeWaveformAudio   *** DEPRECATED ***
     * 
     *   Waveform audio format (.wav)
     * 
     *   UTI: com.microsoft.waveform-audio
     *   conforms to: public.audio
     * 
     * 
     * kUTTypeMIDIAudio   *** DEPRECATED ***
     * 
     *   MIDI audio format
     * 
     *   UTI: public.midi-audio
     *   conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudiovisualContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVideo();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2Video();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2TransportStream();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMP3();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4Audio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Audio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Video();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAVIMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudioInterchangeFileFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWaveformAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMIDIAudio();

    /**
     * kUTTypePlaylist   *** DEPRECATED ***
     * 
     *   base type for playlists
     * 
     *   UTI: public.playlist
     * 
     * 
     * kUTTypeM3UPlaylist   *** DEPRECATED ***
     * 
     *   M3U or M3U8 playlist
     * 
     *   UTI: public.m3u-playlist
     *   conforms to: public.text, public.playlist
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlaylist();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeM3UPlaylist();

    /**
     * kUTTypeFolder   *** DEPRECATED ***
     * 
     *   a user-browsable directory (i.e., not a package)
     * 
     *   UTI: public.folder
     *   conforms to: public.directory
     * 
     * 
     * kUTTypeVolume   *** DEPRECATED ***
     * 
     *   the root folder of a volume/mount point
     * 
     *   UTI: public.volume
     *   conforms to: public.folder
     * 
     * 
     * kUTTypePackage   *** DEPRECATED ***
     * 
     *   a packaged directory
     * 
     *   UTI: com.apple.package
     *   conforms to: public.directory
     * 
     * 
     * kUTTypeBundle   *** DEPRECATED ***
     * 
     *   a directory conforming to one of the CFBundle layouts
     * 
     *   UTI: com.apple.bundle
     *   conforms to: public.directory
     * 
     * 
     * kUTTypePluginBundle   *** DEPRECATED ***
     * 
     *   base type for bundle-based plugins
     * 
     *   UTI: com.apple.plugin
     *   conforms to: com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeSpotlightImporter   *** DEPRECATED ***
     * 
     *   a Spotlight metadata importer
     * 
     *   UTI: com.apple.metadata-importer
     *   conforms to: com.apple.plugin
     * 
     * 
     * kUTTypeQuickLookGenerator   *** DEPRECATED ***
     * 
     *   a QuickLook preview generator
     * 
     *   UTI: com.apple.quicklook-generator
     *   conforms to: com.apple.plugin
     * 
     * 
     * kUTTypeXPCService   *** DEPRECATED ***
     * 
     *   an XPC service
     * 
     *   UTI: com.apple.xpc-service
     *   conforms to: com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeFramework   *** DEPRECATED ***
     * 
     *   a Mac OS X framework
     * 
     *   UTI: com.apple.framework
     *   conforms to: com.apple.bundle
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFolder();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVolume();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePackage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePluginBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpotlightImporter();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickLookGenerator();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXPCService();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFramework();

    /**
     * kUTTypeApplication   *** DEPRECATED ***
     * 
     *   base type for OS X applications, launchable items
     * 
     *   UTI: com.apple.application
     *   conforms to: public.executable
     * 
     * 
     * kUTTypeApplicationBundle   *** DEPRECATED ***
     * 
     *   a bundled application
     * 
     *   UTI: com.apple.application-bundle
     *   conforms to: com.apple.application, com.apple.bundle, com.apple.package
     * 
     * 
     * kUTTypeApplicationFile   *** DEPRECATED ***
     * 
     *   a single-file Carbon/Classic application
     * 
     *   UTI: com.apple.application-file
     *   conforms to: com.apple.application, public.data
     * 
     * 
     * kUTTypeUnixExecutable   *** DEPRECATED ***
     * 
     *   a UNIX executable (flat file)
     * 
     *   UTI: public.unix-executable
     *   conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeWindowsExecutable   *** DEPRECATED ***
     * 
     *   a Windows executable (.exe files)
     * 
     *   UTI: com.microsoft.windows-executable
     *   conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeJavaClass   *** DEPRECATED ***
     * 
     *   a Java class
     * 
     *   UTI: com.sun.java-class
     *   conforms to: public.data, public.executable
     * 
     * 
     * kUTTypeJavaArchive   *** DEPRECATED ***
     * 
     *   a Java archive (.jar)
     * 
     *   UTI: com.sun.java-archive
     *   conforms to: public.zip-archive, public.executable
     * 
     * 
     * kUTTypeSystemPreferencesPane   *** DEPRECATED ***
     * 
     *   a System Preferences pane
     * 
     *   UTI: com.apple.systempreference.prefpane
     *   conforms to: com.apple.package, com.apple.bundle
     * 
     *  Abstract executable types
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplication();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationFile();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUnixExecutable();

    /**
     * Other platform binaries
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWindowsExecutable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaClass();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaArchive();

    /**
     * Misc. binaries
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSystemPreferencesPane();

    /**
     * kUTTypeGNUZipArchive   *** DEPRECATED ***
     * 
     *   a GNU zip archive (gzip)
     * 
     *   UTI: org.gnu.gnu-zip-archive
     *   conforms to: public.data, public.archive
     * 
     * 
     * kUTTypeBzip2Archive   *** DEPRECATED ***
     * 
     *   a bzip2 archive (.bz2)
     * 
     *   UTI: public.bzip2-archive
     *   conforms to: public.data, public.archive
     * 
     * 
     * kUTTypeZipArchive   *** DEPRECATED ***
     * 
     *   a zip archive
     * 
     *   UTI: public.zip-archive
     *   conforms to: com.pkware.zip-archive
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGNUZipArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBzip2Archive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeZipArchive();

    /**
     * kUTTypeSpreadsheet   *** DEPRECATED ***
     * 
     *   base spreadsheet document type
     * 
     *   UTI: public.spreadsheet
     *   conforms to: public.content
     * 
     * 
     * kUTTypePresentation   *** DEPRECATED ***
     * 
     *   base presentation document type
     * 
     *   UTI: public.presentation
     *   conforms to: public.composite-content
     * 
     * 
     * kUTTypeDatabase   *** DEPRECATED ***
     * 
     *   a database store
     * 
     *   UTI: public.database
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpreadsheet();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePresentation();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDatabase();

    /**
     * kUTTypeVCard   *** DEPRECATED ***
     * 
     *   VCard format
     * 
     *   UTI: public.vcard
     *   conforms to: public.text, public.contact
     * 
     * 
     * kUTTypeToDoItem   *** DEPRECATED ***
     * 
     *   to-do item
     * 
     *   UTI: public.to-do-item
     * 
     * 
     * kUTTypeCalendarEvent   *** DEPRECATED ***
     * 
     *   calendar event
     * 
     *   UTI: public.calendar-event
     * 
     * 
     * kUTTypeEmailMessage   *** DEPRECATED ***
     * 
     *   e-mail message
     * 
     *   UTI: public.email-message
     *   conforms to: public.message
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVCard();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeToDoItem();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCalendarEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeEmailMessage();

    /**
     * kUTTypeInternetLocation   *** DEPRECATED ***
     * 
     *   base type for Apple Internet locations
     * 
     *   UTI: com.apple.internet-location
     *   conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInternetLocation();

    /**
     * kUTTypeInkText   *** DEPRECATED ***
     * 
     *   Opaque InkText data
     * 
     *   UTI: com.apple.ink.inktext
     *   conforms to: public.data
     * 
     * 
     * kUTTypeFont   *** DEPRECATED ***
     * 
     *   base type for fonts
     * 
     *   UTI: public.font
     * 
     * 
     * kUTTypeBookmark   *** DEPRECATED ***
     * 
     *   bookmark
     * 
     *   UTI: public.bookmark
     * 
     * 
     * kUTType3DContent   *** DEPRECATED ***
     * 
     *   base type for 3D content
     * 
     *   UTI: public.3d-content
     *   conforms to: public.content
     * 
     * 
     * kUTTypePKCS12   *** DEPRECATED ***
     * 
     *   PKCS#12 format
     * 
     *   UTI: com.rsa.pkcs-12
     *   conforms to: public.data
     * 
     * 
     * kUTTypeX509Certificate   *** DEPRECATED ***
     * 
     *   X.509 certificate format
     * 
     *   UTI: public.x509-certificate
     *   conforms to: public.data
     * 
     * 
     * kUTTypeElectronicPublication   *** DEPRECATED ***
     * 
     *   ePub format
     * 
     *   UTI: org.idpf.epub-container
     *   conforms to: public.data, public.composite-content
     * 
     * 
     * kUTTypeLog   *** DEPRECATED ***
     * 
     *   console log
     * 
     *   UTI: public.log
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInkText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFont();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBookmark();

    @Generated
    @CVariable()
    public static native CFStringRef kUTType3DContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePKCS12();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeX509Certificate();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeElectronicPublication();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLog();

    /**
     * Type Declaration Dictionary Keys
     * 
     * The following keys are used in type declarations
     * kUTExportedTypeDeclarationsKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTExportedTypeDeclarationsKey();

    /**
     * kUTImportedTypeDeclarationsKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTImportedTypeDeclarationsKey();

    /**
     * kUTTypeIdentifierKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIdentifierKey();

    /**
     * kUTTypeTagSpecificationKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTagSpecificationKey();

    /**
     * kUTTypeConformsToKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeConformsToKey();

    /**
     * kUTTypeDescriptionKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDescriptionKey();

    /**
     * kUTTypeIconFileKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIconFileKey();

    /**
     * kUTTypeReferenceURLKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeReferenceURLKey();

    /**
     * kUTTypeVersionKey
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVersionKey();

    /**
     * Type Tag Classes
     * 
     * The following constant strings identify tag classes for use 
     * when converting uniform type identifiers to and from
     * equivalent tags.
     * kUTTagClassFilenameExtension   *** DEPRECATED ***
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassFilenameExtension();

    /**
     * kUTTagClassMIMEType   *** DEPRECATED ***
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassMIMEType();
}