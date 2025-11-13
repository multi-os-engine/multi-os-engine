package apple.cryptotokenkit;

import apple.NSObject;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSError;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;

/**
 * TKSmartCardTokenSession represents token session based on SmartCard token.
 * 
 * When implementing SmartCard token extension, subclass TKSmartCardTokenSession and implement TKTokenSessionDelegate on
 * it. Use #token property to get access and send APDUs to the underlying SmartCard.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardTokenSession extends TKTokenSession {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardTokenSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardTokenSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardTokenSession allocWithZone(VoidPtr zone);

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
    public native TKSmartCardTokenSession init();

    @Generated
    @Selector("initWithToken:")
    public native TKSmartCardTokenSession initWithToken(@NotNull TKToken token);

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
    public static native TKSmartCardTokenSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * contains TKSmartCard instance with active exclusive session and SmartCard application selected.
     * 
     * This property can be accessed only when handling one of the methods of TKTokenSessionDelegate protocol. If
     * associated token has set AID property, then the returned card has opened exclusive session to the card and the
     * application is already selected. Therefore there is no need to call -[TKSmartCard beginSessionWithReply:]) on
     * returned SmartCard instance in such case and system will take care of terminating session when current token
     * request servicing is finished, -[TKSmartCard endSession] must not be called either.
     * 
     * You can store any kind of context state information representing state of the card into smartCard.context
     * property. This property will be automatically set to nil if the card is reset or accessed by different
     * TKSmartCard instance (possibly in another process). Checking TKSmartCard.context property for previously stored
     * value can be used to avoid potentially costly restoring of SmartCard state before performing the operation.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 26.0
     * 
     * @deprecated use -[getSmartCardWithError:] instead
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("smartCard")
    public native TKSmartCard smartCard();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Returns a TKSmartCard instance with an active exclusive session and the SmartCard application selected. Replaces
     * the deprecated @c smartCard property.
     * 
     * The TKSmartCard object is only accessible within the methods of the TKTokenSessionDelegate protocol. If the
     * associated token has an AID set, the returned card will have an exclusive session already opened and the
     * specified application selected. In this scenario: Do not call -[TKSmartCard beginSessionWithReply:]) on the
     * returned SmartCard instance. The system manages the session lifecycle and will terminate it automatically when
     * the current token request servicing is finished. Do not call -[TKSmartCard endSession]. You can use the
     * `smartCard.context` property to store any context-specific state information related to the card. This property
     * is automatically set to `nil` if the card is reset or accessed by a different TKSmartCard instance (potentially
     * in another process). Before performing an operation, check the `TKSmartCard.context` property for a previously
     * stored value. This can help you avoid potentially costly restoration of the SmartCard state if it's already
     * available.
     * 
     * @param error An NSError object containing details if the operation fails.
     * 
     *              API-Since: 26.0
     */
    @Generated
    @Selector("getSmartCardWithError:")
    @Nullable
    public native TKSmartCard getSmartCardWithError(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}
