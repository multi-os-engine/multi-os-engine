package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NFCNDEFMessage
 * 
 * A NDEF message consists of payload records. The maximum size of the NDEF message is limited to 128KB.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCNDEFMessage extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCNDEFMessage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCNDEFMessage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCNDEFMessage allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NFCNDEFMessage init();

    @Generated
    @Selector("initWithCoder:")
    public native NFCNDEFMessage initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithNDEFRecords:
     * 
     * @param records NSArray of NFCNDEFPayload object. An empty array will create an empty NDEF message.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @Selector("initWithNDEFRecords:")
    public native NFCNDEFMessage initWithNDEFRecords(@NotNull NSArray<? extends NFCNDEFPayload> records);

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

    /**
     * [@property] length
     * 
     * Length of the resulting NDEF message in bytes as it would be stored on a NFC tag.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    /**
     * ndefMessageWithData:
     * 
     * @param data NSData storing raw bytes of a complete NDEF message. The data content will be validated; all NDEF
     *             payloads must
     *             be valid according to the NFC Forum NDEF RTD specification and it shall only contain a single NDEF
     *             message.
     * 
     * 
     *             API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("ndefMessageWithData:")
    public static native NFCNDEFMessage ndefMessageWithData(@NotNull NSData data);

    @Generated
    @Owned
    @Selector("new")
    public static native NFCNDEFMessage new_objc();

    /**
     * [@property] records
     * 
     * Array of NFCNDEFPayload records contained in this message.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("records")
    public native NSArray<? extends NFCNDEFPayload> records();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] records
     * 
     * Array of NFCNDEFPayload records contained in this message.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRecords:")
    public native void setRecords(@NotNull NSArray<? extends NFCNDEFPayload> value);

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
