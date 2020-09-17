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

    @Generated
    @Selector("exportedTypeWithIdentifier:")
    public static native UTType exportedTypeWithIdentifier(String identifier);

    @Generated
    @Selector("exportedTypeWithIdentifier:conformingToType:")
    public static native UTType exportedTypeWithIdentifierConformingToType(String identifier, UTType parentType);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("importedTypeWithIdentifier:")
    public static native UTType importedTypeWithIdentifier(String identifier);

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

    @Generated
    @Selector("isDeclared")
    public native boolean isDeclared();

    @Generated
    @Selector("isDynamic")
    public native boolean isDynamic();

    @Generated
    @Selector("isPublicType")
    public native boolean isPublicType();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isSubtypeOfType:")
    public native boolean isSubtypeOfType(UTType type);

    @Generated
    @Selector("isSupertypeOfType:")
    public native boolean isSupertypeOfType(UTType type);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("preferredFilenameExtension")
    public native String preferredFilenameExtension();

    @Generated
    @Selector("preferredMIMEType")
    public native String preferredMIMEType();

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

    @Generated
    @Selector("tags")
    public native NSDictionary<String, ? extends NSArray<String>> tags();

    @Generated
    @Selector("typeWithFilenameExtension:")
    public static native UTType typeWithFilenameExtension(String filenameExtension);

    @Generated
    @Selector("typeWithFilenameExtension:conformingToType:")
    public static native UTType typeWithFilenameExtensionConformingToType(String filenameExtension, UTType supertype);

    @Generated
    @Selector("typeWithIdentifier:")
    public static native UTType typeWithIdentifier(String identifier);

    @Generated
    @Selector("typeWithMIMEType:")
    public static native UTType typeWithMIMEType(String mimeType);

    @Generated
    @Selector("typeWithMIMEType:conformingToType:")
    public static native UTType typeWithMIMETypeConformingToType(String mimeType, UTType supertype);

    @Generated
    @Selector("typeWithTag:tagClass:conformingToType:")
    public static native UTType typeWithTagTagClassConformingToType(String tag, String tagClass, UTType supertype);

    @Generated
    @Selector("typesWithTag:tagClass:conformingToType:")
    public static native NSArray<? extends UTType> typesWithTagTagClassConformingToType(String tag, String tagClass,
            UTType supertype);

    @Generated
    @Selector("version")
    public native NSNumber version();
}