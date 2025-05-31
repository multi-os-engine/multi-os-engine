package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * An object representing a single command to be invoked and the response
 * required for the invoke to be considered successful.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRCommandWithRequiredResponse extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRCommandWithRequiredResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRCommandWithRequiredResponse alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRCommandWithRequiredResponse allocWithZone(VoidPtr zone);

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
     * The command fields to pass for the command invoke. nil if this command does
     * not have any fields. If not nil, this should be a data-value dictionary of
     * MTRStructureValueType.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("commandFields")
    @Nullable
    public native NSDictionary<String, ?> commandFields();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRCommandWithRequiredResponse init();

    @Generated
    @Selector("initWithCoder:")
    public native MTRCommandWithRequiredResponse initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithPath:commandFields:requiredResponse:")
    public native MTRCommandWithRequiredResponse initWithPathCommandFieldsRequiredResponse(@NotNull MTRCommandPath path,
            @Nullable NSDictionary<String, ?> commandFields,
            @Nullable NSDictionary<? extends NSNumber, ? extends NSDictionary<String, ?>> requiredResponse);

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
    public static native MTRCommandWithRequiredResponse new_objc();

    /**
     * The path of the command being invoked.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("path")
    @NotNull
    public native MTRCommandPath path();

    /**
     * The response that represents this command succeeding.
     * 
     * If this is nil, that indicates that the invoke is considered successful if it
     * does not result in an error status response.
     * 
     * If this is is not nil, then the invoke is considered successful if
     * the response is a data response and for each entry in the provided
     * requiredResponse the field whose field ID matches the key of the entry has a
     * value that equals the value of the entry. Values of entries are data-value
     * dictionaries.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("requiredResponse")
    @Nullable
    public native NSDictionary<? extends NSNumber, ? extends NSDictionary<String, ?>> requiredResponse();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The command fields to pass for the command invoke. nil if this command does
     * not have any fields. If not nil, this should be a data-value dictionary of
     * MTRStructureValueType.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setCommandFields:")
    public native void setCommandFields(@Nullable NSDictionary<String, ?> value);

    /**
     * The path of the command being invoked.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(@NotNull MTRCommandPath value);

    /**
     * The response that represents this command succeeding.
     * 
     * If this is nil, that indicates that the invoke is considered successful if it
     * does not result in an error status response.
     * 
     * If this is is not nil, then the invoke is considered successful if
     * the response is a data response and for each entry in the provided
     * requiredResponse the field whose field ID matches the key of the entry has a
     * value that equals the value of the entry. Values of entries are data-value
     * dictionaries.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setRequiredResponse:")
    public native void setRequiredResponse(
            @Nullable NSDictionary<? extends NSNumber, ? extends NSDictionary<String, ?>> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}