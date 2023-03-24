package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKAddShareablePassConfiguration extends PKAddSecureElementPassConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected PKAddShareablePassConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKAddShareablePassConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKAddShareablePassConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use configurationForPassMetadata:primaryAction:completion:
     */
    @Deprecated
    @Generated
    @Selector("configurationForPassMetadata:provisioningPolicyIdentifier:primaryAction:completion:")
    public static native void configurationForPassMetadataProvisioningPolicyIdentifierPrimaryActionCompletion(
            @NotNull NSArray<? extends PKShareablePassMetadata> passMetadata,
            @NotNull String provisioningPolicyIdentifier, @NUInt long action,
            @NotNull @ObjCBlock(name = "call_configurationForPassMetadataProvisioningPolicyIdentifierPrimaryActionCompletion") Block_configurationForPassMetadataProvisioningPolicyIdentifierPrimaryActionCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationForPassMetadataProvisioningPolicyIdentifierPrimaryActionCompletion {
        @Generated
        void call_configurationForPassMetadataProvisioningPolicyIdentifierPrimaryActionCompletion(
                @Nullable PKAddShareablePassConfiguration shareableCredentialConfiguration, @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Selector("credentialsMetadata")
    public native NSArray<? extends PKShareablePassMetadata> credentialsMetadata();

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
    public native PKAddShareablePassConfiguration init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKAddShareablePassConfiguration new_objc();

    @Generated
    @Selector("primaryAction")
    @NUInt
    public native long primaryAction();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: provisioningPolicyIdentifier has been deprecated. You can stop setting this property in the
     * init with no repercussions.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("provisioningPolicyIdentifier")
    public native String provisioningPolicyIdentifier();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("configurationForPassMetadata:primaryAction:completion:")
    public static native void configurationForPassMetadataPrimaryActionCompletion(
            @NotNull NSArray<? extends PKShareablePassMetadata> passMetadata, @NUInt long action,
            @NotNull @ObjCBlock(name = "call_configurationForPassMetadataPrimaryActionCompletion") Block_configurationForPassMetadataPrimaryActionCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationForPassMetadataPrimaryActionCompletion {
        @Generated
        void call_configurationForPassMetadataPrimaryActionCompletion(
                @Nullable PKAddShareablePassConfiguration shareableCredentialConfiguration, @Nullable NSError error);
    }
}
