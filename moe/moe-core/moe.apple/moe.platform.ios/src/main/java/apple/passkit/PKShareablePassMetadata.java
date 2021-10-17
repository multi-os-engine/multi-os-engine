package apple.passkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKShareablePassMetadata extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKShareablePassMetadata(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKShareablePassMetadata alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PKShareablePassMetadata allocWithZone(VoidPtr zone);

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
    @Selector("cardConfigurationIdentifier")
    public native String cardConfigurationIdentifier();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("credentialIdentifier")
    public native String credentialIdentifier();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKShareablePassMetadata init();

    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:cardConfigurationIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierCardConfigurationIdentifierSharingInstanceIdentifierPassThumbnailImageOwnerDisplayNameLocalizedDescription(
            String credentialIdentifier, String cardConfigurationIdentifier, String sharingInstanceIdentifier,
            CGImageRef passThumbnailImage, String ownerDisplayName, String localizedDescription);

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    public static native PKShareablePassMetadata new_objc();

    @Generated
    @Selector("ownerDisplayName")
    public native String ownerDisplayName();

    @Generated
    @Selector("passThumbnailImage")
    public native CGImageRef passThumbnailImage();

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
    @Selector("sharingInstanceIdentifier")
    public native String sharingInstanceIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("accountHash")
    public native String accountHash();

    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:accountHash:templateIdentifier:relyingPartyIdentifier:requiresUnifiedAccessCapableDevice:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierPassThumbnailImageOwnerDisplayNameLocalizedDescriptionAccountHashTemplateIdentifierRelyingPartyIdentifierRequiresUnifiedAccessCapableDevice(
            String credentialIdentifier, String sharingInstanceIdentifier, CGImageRef passThumbnailImage,
            String ownerDisplayName, String localizedDescription, String accountHash, String templateIdentifier,
            String relyingPartyIdentifier, boolean requiresUnifiedAccessCapableDevice);

    @Generated
    @Selector("relyingPartyIdentifier")
    public native String relyingPartyIdentifier();

    @Generated
    @Selector("requiresUnifiedAccessCapableDevice")
    public native boolean requiresUnifiedAccessCapableDevice();

    @Generated
    @Selector("templateIdentifier")
    public native String templateIdentifier();
}
