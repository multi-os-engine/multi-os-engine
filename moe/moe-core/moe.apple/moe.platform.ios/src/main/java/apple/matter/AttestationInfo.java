package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRDeviceAttestationInfo
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AttestationInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AttestationInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AttestationInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AttestationInfo allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("certificationDeclaration")
    @NotNull
    public native NSData certificationDeclaration();

    @Generated
    @Selector("challenge")
    @NotNull
    public native NSData challenge();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("dac")
    @NotNull
    public native NSData dac();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("elements")
    @NotNull
    public native NSData elements();

    @Generated
    @Selector("elementsSignature")
    @NotNull
    public native NSData elementsSignature();

    @Generated
    @Selector("firmwareInfo")
    @NotNull
    public native NSData firmwareInfo();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AttestationInfo init();

    @Generated
    @Selector("initWithChallenge:nonce:elements:elementsSignature:dac:pai:certificationDeclaration:firmwareInfo:")
    public native AttestationInfo initWithChallengeNonceElementsElementsSignatureDacPaiCertificationDeclarationFirmwareInfo(
            @NotNull NSData challenge, @NotNull NSData nonce, @NotNull NSData elements,
            @NotNull NSData elementsSignature, @NotNull NSData dac, @NotNull NSData pai,
            @NotNull NSData certificationDeclaration, @NotNull NSData firmwareInfo);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AttestationInfo new_objc();

    @Generated
    @Selector("nonce")
    @NotNull
    public native NSData nonce();

    @Generated
    @Selector("pai")
    @NotNull
    public native NSData pai();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setCertificationDeclaration:")
    public native void setCertificationDeclaration(@NotNull NSData value);

    @Generated
    @Selector("setChallenge:")
    public native void setChallenge(@NotNull NSData value);

    @Generated
    @Selector("setDac:")
    public native void setDac(@NotNull NSData value);

    @Generated
    @Selector("setElements:")
    public native void setElements(@NotNull NSData value);

    @Generated
    @Selector("setElementsSignature:")
    public native void setElementsSignature(@NotNull NSData value);

    @Generated
    @Selector("setFirmwareInfo:")
    public native void setFirmwareInfo(@NotNull NSData value);

    @Generated
    @Selector("setNonce:")
    public native void setNonce(@NotNull NSData value);

    @Generated
    @Selector("setPai:")
    public native void setPai(@NotNull NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}