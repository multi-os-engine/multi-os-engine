package apple.uniformtypeidentifiers;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * \brief A class representing a type in a type hierarchy.
 * <p>
 * Types may represent files on disk, abstract data types with no on-disk
 * representation, or even entirely unrelated hierarchical classification
 * systems such as hardware.
 * <p>
 * Older API that does not use \c UTType typically uses an untyped \c NSString
 * or \c CFStringRef to refer to a type by its identifier. To get the
 * identifier of a type for use with these APIs, use the \c identifier property
 * of this class.
 * <p>
 * \sa https://developer.apple.com/library/archive/documentation/FileManagement/Conceptual/understanding_utis/
 */
@Generated
@Library("UniformTypeIdentifiers")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UTType extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UTType(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UTType alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * \brief Tests for a conformance relationship between the receiver and another
     * type.
     * <p>
     * \param type The type against which conformance should be tested.
     * <p>
     * \result If the two types are equal, returns \c YES. If the receiver
     * conforms, directly or indirectly, to \a type, returns \c YES. Otherwise,
     * returns \c NO.
     * <p>
     * \sa -isSupertypeOfType:
     * \sa -isSubtypeOfType:
     */
    @Generated
    @Selector("conformsToType:")
    public native boolean conformsToType(UTType type);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * \brief Gets an active \c UTType corresponding to a type that is declared as
     * "exported" by the current process.
     * <p>
     * \param identifier The type identifier for which a type is desired.
     * <p>
     * \result A type.
     * <p>
     * Use this method to get types that are exported by your application. If
     * \a identifier does not correspond to any type known to the system, the
     * result is undefined.
     * <p>
     * Conformance to either \c UTTypeData or \c UTTypePackage is assumed.
     * <p>
     * You would generally use this method with \c dispatch_once():
     * <p>
     * \code
     * UTType *GetMyFileFormat(void) {
     * static UTType *result = nil;
     * <p>
     * static dispatch_once_t once;
     * dispatch_once(&once, ^ {
     * result = [UTType exportedTypeWithIdentifier:@"com.example.myfileformat"];
     * });
     * <p>
     * return result;
     * }
     * \endcode
     */
    @Generated
    @Selector("exportedTypeWithIdentifier:")
    public static native UTType exportedTypeWithIdentifier(String identifier);

    /**
     * \brief Gets an active \c UTType corresponding to a type that is declared as
     * "exported" by the current process.
     * <p>
     * \param identifier The type identifier for which a type is desired.
     * \param parentType A parent type that the resulting type is expected to
     * conform to.
     * <p>
     * \result A type.
     * <p>
     * Use this method to get types that are exported by your application. If
     * \a identifier does not correspond to any type known to the system, the
     * result is undefined.
     * <p>
     * You would generally use this method with \c dispatch_once():
     * <p>
     * \code
     * UTType *GetMyFileFormat(void) {
     * static UTType *result = nil;
     * <p>
     * static dispatch_once_t once;
     * dispatch_once(&once, ^ {
     * result = [UTType exportedTypeWithIdentifier:@"com.example.myfileformat" conformingToType:UTTypeData];
     * });
     * <p>
     * return result;
     * }
     * \endcode
     */
    @Generated
    @Selector("exportedTypeWithIdentifier:conformingToType:")
    public static native UTType exportedTypeWithIdentifierConformingToType(String identifier, UTType parentType);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * \brief The receiver's identifier.
     * <p>
     * A type is \em identified \em by its Uniform Type Identifier (UTI), a
     * reverse-DNS string such as \c "public.jpeg" or \c "com.adobe.pdf". The type
     * itself \em has a UTI, but is not itself the UTI. This terminology is not
     * consistently used across Apple's documentation.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * \brief Gets an active \c UTType corresponding to a type that is declared as
     * "imported" by the current process.
     * <p>
     * \param identifier The type identifier for which a type is desired.
     * <p>
     * \result A type whose identifier may or may not be equal to \a identifier,
     * but which is functionally equivalent.
     * <p>
     * Use this method to get types that are imported by your application. If
     * \a identifier does not correspond to any type known to the system, the
     * result is undefined.
     * <p>
     * Conformance to either \c UTTypeData or \c UTTypePackage is assumed.
     * <p>
     * You would generally use this method in the body of a funcion or method and
     * would \em not use \c dispatch_once() as the type can change over time:
     * <p>
     * \code
     * UTType *GetCompetitorFileFormat(void) {
     * return [UTType importedTypeWithIdentifier:@"com.example.competitorfileformat"];
     * }
     * \endcode
     * <p>
     * In the general case, this method returns a type with the same identifier,
     * but if that type has a preferred filename extension and \em another type is
     * the preferred type for that extension, then that \em other type is
     * substituted.
     */
    @Generated
    @Selector("importedTypeWithIdentifier:")
    public static native UTType importedTypeWithIdentifier(String identifier);

    /**
     * \brief Gets an active \c UTType corresponding to a type that is declared as
     * "imported" by the current process.
     * <p>
     * \param identifier The type identifier for which a type is desired.
     * \param parentType A parent type that the resulting type is expected to
     * conform to.
     * <p>
     * \result A type whose identifier may or may not be equal to \a identifier,
     * but which is functionally equivalent.
     * <p>
     * Use this method to get types that are imported by your application. If
     * \a identifier does not correspond to any type known to the system, the
     * result is undefined.
     * <p>
     * You would generally use this method in the body of a funcion or method and
     * would \em not use \c dispatch_once() as the type can change over time:
     * <p>
     * \code
     * UTType *GetCompetitorFileFormat(void) {
     * return [UTType importedTypeWithIdentifier:@"com.example.competitorfileformat" conformingToType:UTTypeData];
     * }
     * \endcode
     * <p>
     * In the general case, this method returns a type with the same identifier,
     * but if that type has a preferred filename extension and \em another type is
     * the preferred type for that extension, then that \em other type is
     * substituted.
     */
    @Generated
    @Selector("importedTypeWithIdentifier:conformingToType:")
    public static native UTType importedTypeWithIdentifierConformingToType(String identifier, UTType parentType);

    @Generated
    @Selector("init")
    public native UTType init();

    @Generated
    @Selector("initWithCoder:")
    public native UTType initWithCoder(NSCoder coder);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * \brief Whether or not the receiver is a type known to the system.
     * <p>
     * A type cannot be both declared \em and dynamic.
     */
    @Generated
    @Selector("isDeclared")
    public native boolean isDeclared();

    /**
     * \brief Whether or not the receiver is a dynamically generated type.
     * <p>
     * Dynamic types are recognized by the system, but may not be directly declared
     * or claimed by an application. They are used when a file is encountered whose
     * metadata has no corresponding type known to the system.
     * <p>
     * A type cannot be both declared \em and dynamic.
     */
    @Generated
    @Selector("isDynamic")
    public native boolean isDynamic();

    /**
     * \brief Whether or not the type is in the public domain.
     * <p>
     * Types in the public domain have identifiers starting with \c "public." and
     * are generally defined by a standards body or by convention. They are never
     * dynamic.
     */
    @Generated
    @Selector("isPublicType")
    public native boolean isPublicType();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * \brief Tests if the receiver is a subtype of another type.
     * <p>
     * \param type The type against which conformance should be tested.
     * <p>
     * \result If the receiver conforms, directly or indirectly, to \a type and is
     * not equal to it, returns \c YES. Otherwise, returns \c NO.
     * <p>
     * \sa -conformsToType:
     * \sa -isSupertypeOfType:
     */
    @Generated
    @Selector("isSubtypeOfType:")
    public native boolean isSubtypeOfType(UTType type);

    /**
     * \brief Tests if the receiver is a supertype of another type.
     * <p>
     * \param type The type against which conformance should be tested.
     * <p>
     * \result If \a type conforms, directly or indirectly, to the receiver and is
     * not equal to it, returns \c YES. Otherwise, returns \c NO.
     * <p>
     * \sa -conformsToType:
     * \sa -isSubtypeOfType:
     */
    @Generated
    @Selector("isSupertypeOfType:")
    public native boolean isSupertypeOfType(UTType type);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * \brief The localized description of the type.
     * <p>
     * If the type does not provide a description, the system may search its
     * supertypes for one. Dynamic types never have localized descriptions even if
     * their supertypes do.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * \brief If available, the preferred (first available) tag of class
     * \c UTTagClassFilenameExtension.
     * <p>
     * Many uses of types require the generation of a filename (e.g. when saving a
     * file to disk.) If not \c nil, the value of this property is the best
     * available filename extension for the given type. The value of this property
     * is equivalent to, but more efficient than:
     * <p>
     * \code
     * type.tags[UTTagClassFilenameExtension].firstObject
     * \endcode
     */
    @Generated
    @Selector("preferredFilenameExtension")
    public native String preferredFilenameExtension();

    /**
     * \brief If available, the preferred (first available) tag of class
     * \c UTTagClassMIMEType.
     * <p>
     * If not \c nil, the value of this property is the best available MIME type
     * for the given type, according to its declaration. The value of this property
     * is equivalent to, but more efficient than:
     * <p>
     * \code
     * type.tags[UTTagClassMIMEType].firstObject
     * \endcode
     */
    @Generated
    @Selector("preferredMIMEType")
    public native String preferredMIMEType();

    /**
     * \brief The reference URL of the type.
     * <p>
     * A reference URL is a human-readable document describing a type. Most types
     * do not specify reference URLs.
     * <p>
     * \warning This URL is not validated in any way by the system, nor is its
     * scheme or structure guaranteed in any way.
     */
    @Generated
    @Selector("referenceURL")
    public native NSURL referenceURL();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * \brief The set of types to which the receiving type conforms, directly or
     * indirectly.
     * <p>
     * If you are just interested in checking if one type conforms to another, it
     * is more efficient to use \c -conformsToType: than this property.
     */
    @Generated
    @Selector("supertypes")
    public native NSSet<? extends UTType> supertypes();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * \brief The tag specification dictionary of the type.
     * <p>
     * The system does not store tag information for non-standard tag classes. It
     * normalizes string values into arrays containing those strings. For instance,
     * a value of:
     * <p>
     * \code
     * {
     * "public.mime-type": "x/y",
     * "nonstandard-tag-class": "abc",
     * }
     * \endcode
     * <p>
     * Is normalized to:
     * <p>
     * \code
     * {
     * "public.mime-type": [ "x/y" ]
     * }
     * \endcode
     * <p>
     * If you are simply looking for the preferred filename extension or MIME
     * type of a type, it is more efficient for you to use the
     * \c preferredFilenameExtension and \c preferredMIMEType properties
     * respectively.
     */
    @Generated
    @Selector("tags")
    public native NSDictionary<String, ? extends NSArray<String>> tags();

    /**
     * \brief Create a type given a filename extension that conforms to
     * \c UTTypeData.
     * <p>
     * \param filenameExtension The filename extension for which a type is desired.
     * <p>
     * \result A type. If no types are known to the system with the specified
     * filename extension and conformance but the inputs were otherwise valid,
     * a dynamic type may be provided. If the inputs were not valid, returns
     * \c nil.
     * <p>
     * This method is equivalent to:
     * <p>
     * \code
     * [UTType typeWithTag:filenameExtension tagClass:UTTagClassFilenameExtension conformingToType:UTTypeData]
     * \endcode
     * <p>
     * To get the type of a file on disk, use the \c NSURLContentTypeKey property.
     * You should not attempt to derive the type of a file system object based
     * solely on its path extension.
     */
    @Generated
    @Selector("typeWithFilenameExtension:")
    public static native UTType typeWithFilenameExtension(String filenameExtension);

    /**
     * \brief Create a type given a filename extension.
     * <p>
     * \param filenameExtension The filename extension for which a type is desired.
     * \param supertype Another type that the resulting type must conform to.
     * Typically, you would pass \c UTTypeData or \c UTTypePackage.
     * <p>
     * \result A type. If no types are known to the system with the specified
     * filename extension and conformance but the inputs were otherwise valid,
     * a dynamic type may be provided. If the inputs were not valid, returns
     * \c nil.
     * <p>
     * This method is equivalent to:
     * <p>
     * \code
     * [UTType typeWithTag:filenameExtension tagClass:UTTagClassFilenameExtension conformingToType:supertype]
     * \endcode
     * <p>
     * To get the type of a file on disk, use the \c NSURLContentTypeKey property.
     * You should not attempt to derive the type of a file system object based
     * solely on its path extension.
     */
    @Generated
    @Selector("typeWithFilenameExtension:conformingToType:")
    public static native UTType typeWithFilenameExtensionConformingToType(String filenameExtension, UTType supertype);

    /**
     * \brief Create a type given a type identifier.
     * <p>
     * \param identifier The type identifier.
     * <p>
     * \result A type, or \c nil if the type identifier is not known to the system.
     */
    @Generated
    @Selector("typeWithIdentifier:")
    public static native UTType typeWithIdentifier(String identifier);

    /**
     * \brief Create a type given a MIME type that conforms to \c UTTypeData.
     * <p>
     * \param mimeType The MIME type for which a type is desired.
     * <p>
     * \result A type. If no types are known to the system with the specified
     * MIME type and conformance but the inputs were otherwise valid, a dynamic
     * type may be provided. If the inputs were not valid, returns \c nil.
     * <p>
     * This method is equivalent to:
     * <p>
     * \code
     * [UTType typeWithTag:mimeType tagClass:UTTagClassMIMEType conformingToType:UTTypeData]
     * \endcode
     */
    @Generated
    @Selector("typeWithMIMEType:")
    public static native UTType typeWithMIMEType(String mimeType);

    /**
     * \brief Create a type given a MIME type.
     * <p>
     * \param mimeType The MIME type for which a type is desired.
     * \param supertype Another type that the resulting type must conform to.
     * Typically, you would pass \c UTTypeData.
     * <p>
     * \result A type. If no types are known to the system with the specified
     * MIME type and conformance but the inputs were otherwise valid, a dynamic
     * type may be provided. If the inputs were not valid, returns \c nil.
     * <p>
     * This method is equivalent to:
     * <p>
     * \code
     * [UTType typeWithTag:mimeType tagClass:UTTagClassMIMEType conformingToType:supertype]
     * \endcode
     */
    @Generated
    @Selector("typeWithMIMEType:conformingToType:")
    public static native UTType typeWithMIMETypeConformingToType(String mimeType, UTType supertype);

    /**
     * \brief Create a type given a type tag.
     * <p>
     * \param tag The tag, such as the path extension, for which a type is desired.
     * \param tagClass The class of the tag, such as \c UTTagClassFilenameExtension.
     * \param supertype Another type that the resulting type must conform to. If
     * \c nil, no conformance is required.
     * <p>
     * \result A type. If no types are known to the system with the specified tag
     * but the inputs were otherwise valid, a dynamic type may be provided. If
     * the inputs were not valid, returns \c nil.
     */
    @Generated
    @Selector("typeWithTag:tagClass:conformingToType:")
    public static native UTType typeWithTagTagClassConformingToType(String tag, String tagClass, UTType supertype);

    /**
     * \brief Create an array of types given a type tag.
     * <p>
     * \param tag The tag, such as the path extension, for which a set of types is
     * desired.
     * \param tagClass The class of the tag, such as \c UTTagClassFilenameExtension.
     * \param supertype Another type that the resulting types must conform to. If
     * \c nil, no conformance is required.
     * <p>
     * \result An array of types, or the empty array if no such types were
     * available. If no types are known to the system with the specified tag
     * but the inputs were otherwise valid, a dynamic type may be provided.
     */
    @Generated
    @Selector("typesWithTag:tagClass:conformingToType:")
    public static native NSArray<? extends UTType> typesWithTagTagClassConformingToType(String tag, String tagClass,
            UTType supertype);

    /**
     * \brief The type's version.
     * <p>
     * Most types do not specify a version.
     */
    @Generated
    @Selector("version")
    public native NSNumber version();
}
