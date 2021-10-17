package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * User interaction for the secure PIN operations on the SmartCard reader.
 * [@note] Result is available after the interaction has been successfully completed.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardUserInteractionForPINOperation extends TKSmartCardUserInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardUserInteractionForPINOperation(Pointer peer) {
        super(peer);
    }

    /**
     * Bitmask specifying condition(s) under which PIN entry should be considered complete.
     * [@note] Default value: TKSmartCardPINCompletionKey
     */
    @Generated
    @Selector("PINCompletion")
    @NUInt
    public native long PINCompletion();

    /**
     * List of message indices referring to a predefined message table. It is used to specify the type and number of messages displayed during the PIN operation.
     * <p>
     * If nil, the reader does not display any message (reader specific). Typically, PIN verification takes 1 message, PIN modification 1-3 messages.
     * [@note] Default value: nil
     */
    @Generated
    @Selector("PINMessageIndices")
    public native NSArray<? extends NSNumber> PINMessageIndices();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardUserInteractionForPINOperation alloc();

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
    public native TKSmartCardUserInteractionForPINOperation init();

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

    /**
     * Locale defining the language of displayed messages. If set to nil, the user's current locale is used.
     * [@note] Default value: the user's current locale
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional block of returned data (without SW1SW2 bytes).
     */
    @Generated
    @Selector("resultData")
    public native NSData resultData();

    /**
     * SW1SW2 result code.
     */
    @Generated
    @Selector("resultSW")
    public native char resultSW();

    /**
     * Locale defining the language of displayed messages. If set to nil, the user's current locale is used.
     * [@note] Default value: the user's current locale
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * Bitmask specifying condition(s) under which PIN entry should be considered complete.
     * [@note] Default value: TKSmartCardPINCompletionKey
     */
    @Generated
    @Selector("setPINCompletion:")
    public native void setPINCompletion(@NUInt long value);

    /**
     * List of message indices referring to a predefined message table. It is used to specify the type and number of messages displayed during the PIN operation.
     * <p>
     * If nil, the reader does not display any message (reader specific). Typically, PIN verification takes 1 message, PIN modification 1-3 messages.
     * [@note] Default value: nil
     */
    @Generated
    @Selector("setPINMessageIndices:")
    public native void setPINMessageIndices(NSArray<? extends NSNumber> value);

    /**
     * Optional block of returned data (without SW1SW2 bytes).
     */
    @Generated
    @Selector("setResultData:")
    public native void setResultData(NSData value);

    /**
     * SW1SW2 result code.
     */
    @Generated
    @Selector("setResultSW:")
    public native void setResultSW(char value);

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
}
