package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
 * A ``WKWebExtensionDataRecord`` object represents a record of stored data for a specific web extension context.
 * 
 * Contains properties and methods to query the data types and sizes.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionDataRecord extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionDataRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionDataRecord alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionDataRecord allocWithZone(VoidPtr zone);

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
     * The set of data types contained in this data record.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("containedDataTypes")
    @NotNull
    public native NSSet<String> containedDataTypes();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The display name for the web extension to which this data record belongs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("displayName")
    @NotNull
    public native String displayName();

    /**
     * An array of errors that may have occurred when either calculating or deleting storage.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("errors")
    @NotNull
    public native NSArray<? extends NSError> errors();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKWebExtensionDataRecord init();

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
    public static native WKWebExtensionDataRecord new_objc();

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
     * Retrieves the size in bytes of the specific data types in this data record.
     * 
     * @param dataTypes The set of data types to measure the size for.
     * @return The total size of the specified data types.
     * @see totalSizeInBytes
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("sizeInBytesOfTypes:")
    @NUInt
    public native long sizeInBytesOfTypes(@NotNull NSSet<String> dataTypes);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The total size in bytes of all data types contained in this data record.
     * 
     * @see sizeInBytesOfTypes:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("totalSizeInBytes")
    @NUInt
    public native long totalSizeInBytes();

    /**
     * Unique identifier for the web extension context to which this data record belongs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("uniqueIdentifier")
    @NotNull
    public native String uniqueIdentifier();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}