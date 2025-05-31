package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRCommissionerControlClusterReverseOpenCommissioningWindowParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRCommissionerControlClusterReverseOpenCommissioningWindowParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRCommissionerControlClusterReverseOpenCommissioningWindowParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRCommissionerControlClusterReverseOpenCommissioningWindowParams allocWithZone(VoidPtr zone);

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
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("commissioningTimeout")
    @NotNull
    public native NSNumber commissioningTimeout();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("discriminator")
    @NotNull
    public native NSNumber discriminator();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRCommissionerControlClusterReverseOpenCommissioningWindowParams init();

    /**
     * Initialize an MTRCommissionerControlClusterReverseOpenCommissioningWindowParams with a response-value dictionary
     * of the sort that MTRDeviceResponseHandler would receive.
     * 
     * Will return nil and hand out an error if the response-value dictionary is not
     * a command data response or is not the right command response.
     * 
     * Will return nil and hand out an error if the data response does not match the known
     * schema for this command.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTRCommissionerControlClusterReverseOpenCommissioningWindowParams initWithResponseValueError(
            @NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("iterations")
    @NotNull
    public native NSNumber iterations();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRCommissionerControlClusterReverseOpenCommissioningWindowParams new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("pakePasscodeVerifier")
    @NotNull
    public native NSData pakePasscodeVerifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("salt")
    @NotNull
    public native NSData salt();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setCommissioningTimeout:")
    public native void setCommissioningTimeout(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDiscriminator:")
    public native void setDiscriminator(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setIterations:")
    public native void setIterations(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setPakePasscodeVerifier:")
    public native void setPakePasscodeVerifier(@NotNull NSData value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSalt:")
    public native void setSalt(@NotNull NSData value);

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