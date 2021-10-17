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
     * <p>
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
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inTagClass:
     * the class identifier of the tag argument
     * <p>
     * inTag:
     * the tag string
     * <p>
     * inConformingToUTI:
     * the identifier of a type to which the result must conform
     * <p>
     * Result:
     * a new CFStringRef containing the type identifier, or NULL if
     * inTagClass is not a known tag class
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCreatePreferredIdentifierForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    /**
     * UTTypeCreateAllIdentifiersForTag()   *** DEPRECATED ***
     * <p>
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
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inTagClass:
     * the class identifier of the tag argument
     * <p>
     * inTag:
     * the tag string
     * <p>
     * inConformingToUTI:
     * the identifier of a type to which the results must conform
     * <p>
     * Result:
     * An array of uniform type identifiers, or NULL if inTagClass is
     * not a known tag class
     */
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCreateAllIdentifiersForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    /**
     * UTTypeCopyPreferredTagWithClass()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns the identified type's preferred tag with the specified
     * tag class as a CFString. This is the primary function to use for
     * going from uniform type identifier to tag. If the type
     * declaration included more than one tag with the specified class,
     * the first tag in the declared tag array is the preferred tag.
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * inTagClass:
     * the class of tags to return
     * <p>
     * Result:
     * the tag string, or NULL if there is no tag of the specified class.
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyPreferredTagWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    /**
     * UTTypeCopyAllTagsWithClass()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns each of the identified type's tags with the specified
     * tag class as a CFArray of CFStrings.
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * inTagClass:
     * the class of tags to return
     * <p>
     * Result:
     * an array of tag strings, or NULL if there is no tag of the specified class.
     */
    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCopyAllTagsWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    /**
     * UTTypeEqual()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Compares two identified types for equality. Types are equal if
     * their identifier strings are equal using a case-insensitive
     * comparison.
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI1:
     * a uniform type identifier
     * <p>
     * inUTI2:
     * another uniform type identifier
     */
    @Generated
    @CFunction
    public static native byte UTTypeEqual(CFStringRef inUTI1, CFStringRef inUTI2);

    /**
     * UTTypeConformsTo()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Tests for a conformance relationship between the two identified
     * types. Returns true if the types are equal, or if the first type
     * conforms, directly or indirectly, to the second type.
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier to test
     * <p>
     * inConformsToUTI:
     * the uniform type identifier against which to test conformance.
     */
    @Generated
    @CFunction
    public static native byte UTTypeConformsTo(CFStringRef inUTI, CFStringRef inConformsToUTI);

    /**
     * UTTypeCopyDescription()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns the localized, user-readable type description string
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * Result:
     * a localized string, or NULL of no type description is available
     */
    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyDescription(CFStringRef inUTI);

    /**
     * UTTypeIsDeclared()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns whether or not the specified UTI has a declaration
     * registered on the current system. Dynamic UTIs are never
     * registered.
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * Result:
     * Whether or not the UTI is registered.
     */
    @Generated
    @CFunction
    public static native byte UTTypeIsDeclared(CFStringRef inUTI);

    /**
     * UTTypeIsDynamic()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns whether or not the specified UTI is a dynamic UTI.
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * Result:
     * Whether or not the UTI is dynamic.
     */
    @Generated
    @CFunction
    public static native byte UTTypeIsDynamic(CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaration()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns the identified type's declaration dictionary, as it
     * appears in the declaring bundle's info property list. This the
     * access path to other type properties for which direct access is
     * rarely needed.
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * Result:
     * a tag declaration dictionary, or NULL if the type is not declared
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef UTTypeCopyDeclaration(CFStringRef inUTI);

    /**
     * UTTypeCopyDeclaringBundleURL()   *** DEPRECATED ***
     * <p>
     * Discussion:
     * Returns the URL of the bundle containing the type declaration of
     * the identified type.
     * <p>
     * Mac OS X threading:
     * Thread safe since version 10.3
     * <p>
     * Parameters:
     * <p>
     * inUTI:
     * the uniform type identifier
     * <p>
     * Result:
     * a URL, or NULL if the bundle cannot be located.
     */
    @Generated
    @CFunction
    public static native CFURLRef UTTypeCopyDeclaringBundleURL(CFStringRef inUTI);

    /**
     * kUTTypeItem   *** DEPRECATED ***
     * <p>
     * generic base type for most things
     * (files, directories)
     * <p>
     * UTI: public.item
     * <p>
     * <p>
     * kUTTypeContent   *** DEPRECATED ***
     * <p>
     * base type for anything containing user-viewable document content
     * (documents, pasteboard data, and document packages.) Types describing
     * files or packages must also conform to kUTTypeData or kUTTypePackage
     * in order for the system to bind documents to them.
     * <p>
     * UTI: public.content
     * <p>
     * <p>
     * kUTTypeCompositeContent   *** DEPRECATED ***
     * <p>
     * base type for content formats supporting mixed embedded content
     * (i.e., compound documents)
     * <p>
     * UTI: public.composite-content
     * conforms to: public.content
     * <p>
     * <p>
     * kUTTypeMessage   *** DEPRECATED ***
     * <p>
     * base type for messages (email, IM, etc.)
     * <p>
     * UTI: public.message
     * <p>
     * <p>
     * kUTTypeContact   *** DEPRECATED ***
     * <p>
     * contact information, e.g. for a person, group, organization
     * <p>
     * UTI: public.contact
     * <p>
     * <p>
     * kUTTypeArchive   *** DEPRECATED ***
     * <p>
     * an archive of files and directories
     * <p>
     * UTI: public.archive
     * <p>
     * <p>
     * kUTTypeDiskImage   *** DEPRECATED ***
     * <p>
     * a data item mountable as a volume
     * <p>
     * UTI: public.disk-image
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
     * <p>
     * base type for any sort of simple byte stream,
     * including files and in-memory data
     * <p>
     * UTI: public.data
     * conforms to: public.item
     * <p>
     * <p>
     * kUTTypeDirectory   *** DEPRECATED ***
     * <p>
     * file system directory
     * (includes packages AND folders)
     * <p>
     * UTI: public.directory
     * conforms to: public.item
     * <p>
     * <p>
     * kUTTypeResolvable   *** DEPRECATED ***
     * <p>
     * symlink and alias file types conform to this UTI
     * <p>
     * UTI: com.apple.resolvable
     * <p>
     * <p>
     * kUTTypeSymLink   *** DEPRECATED ***
     * <p>
     * a symbolic link
     * <p>
     * UTI: public.symlink
     * conforms to: public.item, com.apple.resolvable
     * <p>
     * <p>
     * kUTTypeExecutable   *** DEPRECATED ***
     * <p>
     * an executable item
     * UTI: public.executable
     * conforms to: public.item
     * <p>
     * <p>
     * kUTTypeMountPoint   *** DEPRECATED ***
     * <p>
     * a volume mount point (resolvable, resolves to the root dir of a volume)
     * <p>
     * UTI: com.apple.mount-point
     * conforms to: public.item, com.apple.resolvable
     * <p>
     * <p>
     * kUTTypeAliasFile   *** DEPRECATED ***
     * <p>
     * a fully-formed alias file
     * <p>
     * UTI: com.apple.alias-file
     * conforms to: public.data, com.apple.resolvable
     * <p>
     * <p>
     * kUTTypeAliasRecord   *** DEPRECATED ***
     * <p>
     * raw alias data
     * <p>
     * UTI: com.apple.alias-record
     * conforms to: public.data, com.apple.resolvable
     * <p>
     * <p>
     * kUTTypeURLBookmarkData   *** DEPRECATED ***
     * <p>
     * URL bookmark
     * <p>
     * UTI: com.apple.bookmark
     * conforms to: public.data, com.apple.resolvable
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
     * <p>
     * The bytes of a URL
     * (OSType 'url ')
     * <p>
     * UTI: public.url
     * conforms to: public.data
     * <p>
     * <p>
     * kUTTypeFileURL   *** DEPRECATED ***
     * <p>
     * The text of a "file:" URL
     * (OSType 'furl')
     * <p>
     * UTI: public.file-url
     * conforms to: public.url
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURL();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFileURL();

    /**
     * kUTTypeText   *** DEPRECATED ***
     * <p>
     * base type for all text-encoded data,
     * including text with markup (HTML, RTF, etc.)
     * <p>
     * UTI: public.text
     * conforms to: public.data, public.content
     * <p>
     * <p>
     * kUTTypePlainText   *** DEPRECATED ***
     * <p>
     * text with no markup, unspecified encoding
     * <p>
     * UTI: public.plain-text
     * conforms to: public.text
     * <p>
     * <p>
     * kUTTypeUTF8PlainText   *** DEPRECATED ***
     * <p>
     * plain text, UTF-8 encoding
     * (OSType 'utf8', NSPasteboardType "NSStringPBoardType")
     * <p>
     * UTI: public.utf8-plain-text
     * conforms to: public.plain-text
     * <p>
     * <p>
     * kUTTypeUTF16ExternalPlainText   *** DEPRECATED ***
     * <p>
     * plain text, UTF-16 encoding, with BOM, or if BOM
     * is not present, has "external representation"
     * byte order (big-endian).
     * (OSType 'ut16')
     * <p>
     * UTI: public.utf16-external-plain-text
     * conforms to: public.plain-text
     * <p>
     * <p>
     * kUTTypeUTF16PlainText   *** DEPRECATED ***
     * <p>
     * plain text, UTF-16 encoding, native byte order, optional BOM
     * (OSType 'utxt')
     * <p>
     * UTI: public.utf16-plain-text
     * conforms to: public.plain-text
     * <p>
     * <p>
     * kUTTypeDelimitedText   *** DEPRECATED ***
     * <p>
     * text containing delimited values
     * <p>
     * UTI: public.delimited-values-text
     * conforms to: public.text
     * <p>
     * <p>
     * kUTTypeCommaSeparatedText   *** DEPRECATED ***
     * <p>
     * text containing comma-separated values (.csv)
     * <p>
     * UTI: public.comma-separated-values-text
     * conforms to: public.delimited-values-text
     * <p>
     * <p>
     * kUTTypeTabSeparatedText   *** DEPRECATED ***
     * <p>
     * text containing tab-separated values
     * <p>
     * UTI: public.tab-separated-values-text
     * conforms to: public.delimited-values-text
     * <p>
     * <p>
     * kUTTypeUTF8TabSeparatedText   *** DEPRECATED ***
     * <p>
     * UTF-8 encoded text containing tab-separated values
     * <p>
     * UTI: public.utf8-tab-separated-values-text
     * conforms to: public.tab-separated-values-text, public.utf8-plain-text
     * <p>
     * <p>
     * kUTTypeRTF   *** DEPRECATED ***
     * <p>
     * Rich Text Format
     * <p>
     * UTI: public.rtf
     * conforms to: public.text
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
     * <p>
     * HTML, any version
     * <p>
     * UTI: public.html
     * conforms to: public.text
     * <p>
     * <p>
     * kUTTypeXML   *** DEPRECATED ***
     * <p>
     * generic XML
     * <p>
     * UTI: public.xml
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeHTML();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXML();

    /**
     * kUTTypeSourceCode   *** DEPRECATED ***
     * <p>
     * abstract type for source code (any language)
     * <p>
     * UTI: public.source-code
     * conforms to: public.plain-text
     * <p>
     * <p>
     * kUTTypeAssemblyLanguageSource   *** DEPRECATED ***
     * <p>
     * assembly language source (.s)
     * <p>
     * UTI: public.assembly-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeCSource   *** DEPRECATED ***
     * <p>
     * C source code (.c)
     * <p>
     * UTI: public.c-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeObjectiveCSource   *** DEPRECATED ***
     * <p>
     * Objective-C source code (.m)
     * <p>
     * UTI: public.objective-c-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeSwiftSource   *** DEPRECATED ***
     * <p>
     * Swift source code (.swift)
     * <p>
     * UTI: public.swift-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeCPlusPlusSource   *** DEPRECATED ***
     * <p>
     * C++ source code (.cp, etc.)
     * <p>
     * UTI: public.c-plus-plus-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeObjectiveCPlusPlusSource   *** DEPRECATED ***
     * <p>
     * Objective-C++ source code
     * <p>
     * UTI: public.objective-c-plus-plus-source
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeCHeader   *** DEPRECATED ***
     * <p>
     * C header
     * <p>
     * UTI: public.c-header
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeCPlusPlusHeader   *** DEPRECATED ***
     * <p>
     * C++ header
     * <p>
     * UTI: public.c-plus-plus-header
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeJavaSource   *** DEPRECATED ***
     * <p>
     * Java source code
     * <p>
     * UTI: com.sun.java-source
     * conforms to: public.source-code
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
     * <p>
     * scripting language source
     * <p>
     * UTI: public.script
     * conforms to: public.source-code
     * <p>
     * <p>
     * kUTTypeAppleScript   *** DEPRECATED ***
     * <p>
     * AppleScript text format (.applescript)
     * <p>
     * UTI: com.apple.applescript.text
     * conforms to: public.script
     * <p>
     * <p>
     * kUTTypeOSAScript   *** DEPRECATED ***
     * <p>
     * Open Scripting Architecture script binary format (.scpt)
     * <p>
     * UTI: com.apple.applescript.script
     * conforms to: public.data, public.script
     * <p>
     * <p>
     * kUTTypeOSAScriptBundle   *** DEPRECATED ***
     * <p>
     * Open Scripting Architecture script bundle format (.scptd)
     * <p>
     * UTI: com.apple.applescript.script-bundle
     * conforms to: com.apple.bundle, com.apple.package, public.script
     * <p>
     * <p>
     * kUTTypeJavaScript   *** DEPRECATED ***
     * <p>
     * JavaScript source code
     * <p>
     * UTI: com.netscape.javascript-source
     * conforms to: public.source-code, public.executable
     * <p>
     * <p>
     * kUTTypeShellScript   *** DEPRECATED ***
     * <p>
     * base type for shell scripts
     * <p>
     * UTI: public.shell-script
     * conforms to: public.script
     * <p>
     * <p>
     * kUTTypePerlScript   *** DEPRECATED ***
     * <p>
     * Perl script
     * <p>
     * UTI: public.perl-script
     * conforms to: public.shell-script
     * <p>
     * <p>
     * kUTTypePythonScript   *** DEPRECATED ***
     * <p>
     * Python script
     * <p>
     * UTI: public.python-script
     * conforms to: public.shell-script
     * <p>
     * <p>
     * kUTTypeRubyScript   *** DEPRECATED ***
     * <p>
     * Ruby script
     * <p>
     * UTI: public.ruby-script
     * conforms to: public.shell-script
     * <p>
     * <p>
     * kUTTypePHPScript   *** DEPRECATED ***
     * <p>
     * PHP script
     * <p>
     * UTI: public.php-script
     * conforms to: public.shell-script
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
     * <p>
     * JavaScript object notation (JSON) data
     * NOTE: JSON almost but doesn't quite conform to
     * com.netscape.javascript-source
     * <p>
     * UTI: public.json
     * conforms to: public.text
     * <p>
     * <p>
     * kUTTypePropertyList   *** DEPRECATED ***
     * <p>
     * base type for property lists
     * <p>
     * UTI: com.apple.property-list
     * conforms to: public.data
     * <p>
     * <p>
     * kUTTypeXMLPropertyList   *** DEPRECATED ***
     * <p>
     * XML property list
     * <p>
     * UTI: com.apple.xml-property-list
     * conforms to: public.xml, com.apple.property-list
     * <p>
     * <p>
     * kUTTypeBinaryPropertyList   *** DEPRECATED ***
     * <p>
     * XML property list
     * <p>
     * UTI: com.apple.binary-property-list
     * conforms to: com.apple.property-list
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
     * <p>
     * Adobe PDF
     * <p>
     * UTI: com.adobe.pdf
     * conforms to: public.data, public.composite-content
     * <p>
     * <p>
     * kUTTypeRTFD   *** DEPRECATED ***
     * <p>
     * Rich Text Format Directory
     * (RTF with content embedding, on-disk format)
     * <p>
     * UTI: com.apple.rtfd
     * conforms to: com.apple.package, public.composite-content
     * <p>
     * <p>
     * kUTTypeFlatRTFD   *** DEPRECATED ***
     * <p>
     * Flattened RTFD (pasteboard format)
     * <p>
     * UTI: com.apple.flat-rtfd
     * conforms to: public.data, public.composite-content
     * <p>
     * <p>
     * kUTTypeTXNTextAndMultimediaData   *** DEPRECATED ***
     * <p>
     * MLTE (Textension) format for mixed text & multimedia data
     * (OSType 'txtn')
     * <p>
     * UTI: com.apple.txn.text-multimedia-data
     * conforms to: public.data, public.composite-content
     * <p>
     * <p>
     * kUTTypeWebArchive   *** DEPRECATED ***
     * <p>
     * The WebKit webarchive format
     * <p>
     * UTI: com.apple.webarchive
     * conforms to: public.data, public.composite-content
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
     * <p>
     * abstract image data
     * <p>
     * UTI: public.image
     * conforms to: public.data, public.content
     * <p>
     * <p>
     * kUTTypeJPEG   *** DEPRECATED ***
     * <p>
     * JPEG image
     * <p>
     * UTI: public.jpeg
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeJPEG2000   *** DEPRECATED ***
     * <p>
     * JPEG-2000 image
     * <p>
     * UTI: public.jpeg-2000
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeTIFF   *** DEPRECATED ***
     * <p>
     * TIFF image
     * <p>
     * UTI: public.tiff
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypePICT   *** DEPRECATED ***
     * <p>
     * Quickdraw PICT format
     * <p>
     * UTI: com.apple.pict
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeGIF   *** DEPRECATED ***
     * <p>
     * GIF image
     * <p>
     * UTI: com.compuserve.gif
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypePNG   *** DEPRECATED ***
     * <p>
     * PNG image
     * <p>
     * UTI: public.png
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeQuickTimeImage   *** DEPRECATED ***
     * <p>
     * QuickTime image format (OSType 'qtif')
     * <p>
     * UTI: com.apple.quicktime-image
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeAppleICNS   *** DEPRECATED ***
     * <p>
     * Apple icon data
     * <p>
     * UTI: com.apple.icns
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeBMP   *** DEPRECATED ***
     * <p>
     * Windows bitmap
     * <p>
     * UTI: com.microsoft.bmp
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeICO   *** DEPRECATED ***
     * <p>
     * Windows icon data
     * <p>
     * UTI: com.microsoft.ico
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeRawImage   *** DEPRECATED ***
     * <p>
     * base type for raw image data (.raw)
     * <p>
     * UTI: public.camera-raw-image
     * conforms to: public.image
     * <p>
     * <p>
     * kUTTypeScalableVectorGraphics   *** DEPRECATED ***
     * <p>
     * SVG image
     * <p>
     * UTI: public.svg-image
     * conforms to: public.image
     * <p>
     * kUTTypeLivePhoto   *** DEPRECATED ***
     * <p>
     * Live Photo
     * <p>
     * UTI: com.apple.live-photo
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
     * <p>
     * audio and/or video content
     * <p>
     * UTI: public.audiovisual-content
     * conforms to: public.data, public.content
     * <p>
     * <p>
     * kUTTypeMovie   *** DEPRECATED ***
     * <p>
     * A media format which may contain both video and audio
     * Corresponds to what users would label a "movie"
     * <p>
     * UTI: public.movie
     * conforms to: public.audiovisual-content
     * <p>
     * <p>
     * kUTTypeVideo   *** DEPRECATED ***
     * <p>
     * pure video (no audio)
     * <p>
     * UTI: public.video
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeAudio   *** DEPRECATED ***
     * <p>
     * pure audio (no video)
     * <p>
     * UTI: public.audio
     * conforms to: public.audiovisual-content
     * <p>
     * <p>
     * kUTTypeQuickTimeMovie   *** DEPRECATED ***
     * <p>
     * QuickTime movie
     * <p>
     * UTI: com.apple.quicktime-movie
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeMPEG   *** DEPRECATED ***
     * <p>
     * MPEG-1 or MPEG-2 movie
     * <p>
     * UTI: public.mpeg
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeMPEG2Video   *** DEPRECATED ***
     * <p>
     * MPEG-2 video
     * <p>
     * UTI: public.mpeg-2-video
     * conforms to: public.video
     * <p>
     * <p>
     * kUTTypeMPEG2TransportStream   *** DEPRECATED ***
     * <p>
     * MPEG-2 Transport Stream movie format
     * <p>
     * UTI: public.mpeg-2-transport-stream
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeMP3   *** DEPRECATED ***
     * <p>
     * MP3 audio
     * <p>
     * UTI: public.mp3
     * conforms to: public.audio
     * <p>
     * <p>
     * kUTTypeMPEG4   *** DEPRECATED ***
     * <p>
     * MPEG-4 movie
     * <p>
     * UTI: public.mpeg-4
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeMPEG4Audio   *** DEPRECATED ***
     * <p>
     * MPEG-4 audio layer
     * <p>
     * UTI: public.mpeg-4-audio
     * conforms to: public.mpeg-4, public.audio
     * <p>
     * <p>
     * kUTTypeAppleProtectedMPEG4Audio   *** DEPRECATED ***
     * <p>
     * Apple protected MPEG4 format
     * (.m4p, iTunes music store format)
     * <p>
     * UTI: com.apple.protected-mpeg-4-audio
     * conforms to: public.audio
     * <p>
     * <p>
     * kUTTypeAppleProtectedMPEG4Video   *** DEPRECATED ***
     * <p>
     * Apple protected MPEG-4 movie
     * <p>
     * UTI: com.apple.protected-mpeg-4-video
     * conforms to: com.apple.m4v-video
     * <p>
     * <p>
     * kUTTypeAVIMovie   *** DEPRECATED ***
     * <p>
     * Audio Video Interleaved (AVI) movie format
     * <p>
     * UTI: public.avi
     * conforms to: public.movie
     * <p>
     * <p>
     * kUTTypeAudioInterchangeFileFormat   *** DEPRECATED ***
     * <p>
     * AIFF audio format
     * <p>
     * UTI: public.aiff-audio
     * conforms to: public.aifc-audio
     * <p>
     * <p>
     * kUTTypeWaveformAudio   *** DEPRECATED ***
     * <p>
     * Waveform audio format (.wav)
     * <p>
     * UTI: com.microsoft.waveform-audio
     * conforms to: public.audio
     * <p>
     * <p>
     * kUTTypeMIDIAudio   *** DEPRECATED ***
     * <p>
     * MIDI audio format
     * <p>
     * UTI: public.midi-audio
     * conforms to: public.audio
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
     * <p>
     * base type for playlists
     * <p>
     * UTI: public.playlist
     * <p>
     * <p>
     * kUTTypeM3UPlaylist   *** DEPRECATED ***
     * <p>
     * M3U or M3U8 playlist
     * <p>
     * UTI: public.m3u-playlist
     * conforms to: public.text, public.playlist
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlaylist();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeM3UPlaylist();

    /**
     * kUTTypeFolder   *** DEPRECATED ***
     * <p>
     * a user-browsable directory (i.e., not a package)
     * <p>
     * UTI: public.folder
     * conforms to: public.directory
     * <p>
     * <p>
     * kUTTypeVolume   *** DEPRECATED ***
     * <p>
     * the root folder of a volume/mount point
     * <p>
     * UTI: public.volume
     * conforms to: public.folder
     * <p>
     * <p>
     * kUTTypePackage   *** DEPRECATED ***
     * <p>
     * a packaged directory
     * <p>
     * UTI: com.apple.package
     * conforms to: public.directory
     * <p>
     * <p>
     * kUTTypeBundle   *** DEPRECATED ***
     * <p>
     * a directory conforming to one of the CFBundle layouts
     * <p>
     * UTI: com.apple.bundle
     * conforms to: public.directory
     * <p>
     * <p>
     * kUTTypePluginBundle   *** DEPRECATED ***
     * <p>
     * base type for bundle-based plugins
     * <p>
     * UTI: com.apple.plugin
     * conforms to: com.apple.bundle, com.apple.package
     * <p>
     * <p>
     * kUTTypeSpotlightImporter   *** DEPRECATED ***
     * <p>
     * a Spotlight metadata importer
     * <p>
     * UTI: com.apple.metadata-importer
     * conforms to: com.apple.plugin
     * <p>
     * <p>
     * kUTTypeQuickLookGenerator   *** DEPRECATED ***
     * <p>
     * a QuickLook preview generator
     * <p>
     * UTI: com.apple.quicklook-generator
     * conforms to: com.apple.plugin
     * <p>
     * <p>
     * kUTTypeXPCService   *** DEPRECATED ***
     * <p>
     * an XPC service
     * <p>
     * UTI: com.apple.xpc-service
     * conforms to: com.apple.bundle, com.apple.package
     * <p>
     * <p>
     * kUTTypeFramework   *** DEPRECATED ***
     * <p>
     * a Mac OS X framework
     * <p>
     * UTI: com.apple.framework
     * conforms to: com.apple.bundle
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
     * <p>
     * base type for OS X applications, launchable items
     * <p>
     * UTI: com.apple.application
     * conforms to: public.executable
     * <p>
     * <p>
     * kUTTypeApplicationBundle   *** DEPRECATED ***
     * <p>
     * a bundled application
     * <p>
     * UTI: com.apple.application-bundle
     * conforms to: com.apple.application, com.apple.bundle, com.apple.package
     * <p>
     * <p>
     * kUTTypeApplicationFile   *** DEPRECATED ***
     * <p>
     * a single-file Carbon/Classic application
     * <p>
     * UTI: com.apple.application-file
     * conforms to: com.apple.application, public.data
     * <p>
     * <p>
     * kUTTypeUnixExecutable   *** DEPRECATED ***
     * <p>
     * a UNIX executable (flat file)
     * <p>
     * UTI: public.unix-executable
     * conforms to: public.data, public.executable
     * <p>
     * <p>
     * kUTTypeWindowsExecutable   *** DEPRECATED ***
     * <p>
     * a Windows executable (.exe files)
     * <p>
     * UTI: com.microsoft.windows-executable
     * conforms to: public.data, public.executable
     * <p>
     * <p>
     * kUTTypeJavaClass   *** DEPRECATED ***
     * <p>
     * a Java class
     * <p>
     * UTI: com.sun.java-class
     * conforms to: public.data, public.executable
     * <p>
     * <p>
     * kUTTypeJavaArchive   *** DEPRECATED ***
     * <p>
     * a Java archive (.jar)
     * <p>
     * UTI: com.sun.java-archive
     * conforms to: public.zip-archive, public.executable
     * <p>
     * <p>
     * kUTTypeSystemPreferencesPane   *** DEPRECATED ***
     * <p>
     * a System Preferences pane
     * <p>
     * UTI: com.apple.systempreference.prefpane
     * conforms to: com.apple.package, com.apple.bundle
     * <p>
     * Abstract executable types
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
     * <p>
     * a GNU zip archive (gzip)
     * <p>
     * UTI: org.gnu.gnu-zip-archive
     * conforms to: public.data, public.archive
     * <p>
     * <p>
     * kUTTypeBzip2Archive   *** DEPRECATED ***
     * <p>
     * a bzip2 archive (.bz2)
     * <p>
     * UTI: public.bzip2-archive
     * conforms to: public.data, public.archive
     * <p>
     * <p>
     * kUTTypeZipArchive   *** DEPRECATED ***
     * <p>
     * a zip archive
     * <p>
     * UTI: public.zip-archive
     * conforms to: com.pkware.zip-archive
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
     * <p>
     * base spreadsheet document type
     * <p>
     * UTI: public.spreadsheet
     * conforms to: public.content
     * <p>
     * <p>
     * kUTTypePresentation   *** DEPRECATED ***
     * <p>
     * base presentation document type
     * <p>
     * UTI: public.presentation
     * conforms to: public.composite-content
     * <p>
     * <p>
     * kUTTypeDatabase   *** DEPRECATED ***
     * <p>
     * a database store
     * <p>
     * UTI: public.database
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
     * <p>
     * VCard format
     * <p>
     * UTI: public.vcard
     * conforms to: public.text, public.contact
     * <p>
     * <p>
     * kUTTypeToDoItem   *** DEPRECATED ***
     * <p>
     * to-do item
     * <p>
     * UTI: public.to-do-item
     * <p>
     * <p>
     * kUTTypeCalendarEvent   *** DEPRECATED ***
     * <p>
     * calendar event
     * <p>
     * UTI: public.calendar-event
     * <p>
     * <p>
     * kUTTypeEmailMessage   *** DEPRECATED ***
     * <p>
     * e-mail message
     * <p>
     * UTI: public.email-message
     * conforms to: public.message
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
     * <p>
     * base type for Apple Internet locations
     * <p>
     * UTI: com.apple.internet-location
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInternetLocation();

    /**
     * kUTTypeInkText   *** DEPRECATED ***
     * <p>
     * Opaque InkText data
     * <p>
     * UTI: com.apple.ink.inktext
     * conforms to: public.data
     * <p>
     * <p>
     * kUTTypeFont   *** DEPRECATED ***
     * <p>
     * base type for fonts
     * <p>
     * UTI: public.font
     * <p>
     * <p>
     * kUTTypeBookmark   *** DEPRECATED ***
     * <p>
     * bookmark
     * <p>
     * UTI: public.bookmark
     * <p>
     * <p>
     * kUTType3DContent   *** DEPRECATED ***
     * <p>
     * base type for 3D content
     * <p>
     * UTI: public.3d-content
     * conforms to: public.content
     * <p>
     * <p>
     * kUTTypePKCS12   *** DEPRECATED ***
     * <p>
     * PKCS#12 format
     * <p>
     * UTI: com.rsa.pkcs-12
     * conforms to: public.data
     * <p>
     * <p>
     * kUTTypeX509Certificate   *** DEPRECATED ***
     * <p>
     * X.509 certificate format
     * <p>
     * UTI: public.x509-certificate
     * conforms to: public.data
     * <p>
     * <p>
     * kUTTypeElectronicPublication   *** DEPRECATED ***
     * <p>
     * ePub format
     * <p>
     * UTI: org.idpf.epub-container
     * conforms to: public.data, public.composite-content
     * <p>
     * <p>
     * kUTTypeLog   *** DEPRECATED ***
     * <p>
     * console log
     * <p>
     * UTI: public.log
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
     * <p>
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
     * <p>
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
