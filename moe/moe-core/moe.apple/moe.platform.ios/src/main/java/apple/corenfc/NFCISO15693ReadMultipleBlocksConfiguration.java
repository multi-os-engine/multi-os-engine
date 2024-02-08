package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

/**
 * NFCISO15693ReadMultipleBlocksConfiguration
 * 
 * Configuration options for the Read Multiple Blocks command.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCISO15693ReadMultipleBlocksConfiguration extends NFCTagCommandConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCISO15693ReadMultipleBlocksConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCISO15693ReadMultipleBlocksConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCISO15693ReadMultipleBlocksConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Number of blocks to read per Read Multiple Blocks command. This may be limited by the tag hardware.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("chunkSize")
    @NUInt
    public native long chunkSize();

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
    public native NFCISO15693ReadMultipleBlocksConfiguration init();

    /**
     * Initialize with default zero maximum retry and zero retry interval.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithRange:chunkSize:")
    public native NFCISO15693ReadMultipleBlocksConfiguration initWithRangeChunkSize(@ByValue NSRange range,
            @NUInt long chunkSize);

    /**
     * initWithRange:chunkSize:maximumRetries:retryInterval:
     * 
     * @param range          Read range specify by the starting block index and the total number of blocks.
     * @param chunkSize      Specify number of blocks parameter for the Read multiple blocks command.
     * @param maximumRetries Maximum number of retry attempt when tag response is not recevied.
     * @param retryInterval  Time interval wait between each retry attempt.
     * 
     *                       API-Since: 11.0
     */
    @Generated
    @Selector("initWithRange:chunkSize:maximumRetries:retryInterval:")
    public native NFCISO15693ReadMultipleBlocksConfiguration initWithRangeChunkSizeMaximumRetriesRetryInterval(
            @ByValue NSRange range, @NUInt long chunkSize, @NUInt long maximumRetries, double retryInterval);

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
    public static native NFCISO15693ReadMultipleBlocksConfiguration new_objc();

    /**
     * Range to read in blocks. Valid start index range is 0x00 to 0xFF. Length shall not be 0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Number of blocks to read per Read Multiple Blocks command. This may be limited by the tag hardware.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setChunkSize:")
    public native void setChunkSize(@NUInt long value);

    /**
     * Range to read in blocks. Valid start index range is 0x00 to 0xFF. Length shall not be 0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRange:")
    public native void setRange(@ByValue NSRange value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
