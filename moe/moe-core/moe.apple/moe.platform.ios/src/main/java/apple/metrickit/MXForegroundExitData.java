package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
 * MXForegroundExitData
 * <p>
 * A class that encapsulates cumulative application exit metrics when the application is on screen.
 * <p>
 * Foreground exits are user visible terminations that, when unexpected, interrupt usage.
 * <p>
 * Not all foreground exits are unexpected. See the documentation for each exit reason for more information.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXForegroundExitData extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXForegroundExitData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXForegroundExitData alloc();

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

    /**
     * [@property]      cumulativeAbnormalExitCount
     * <p>
     * Cumulative number of times the application exited abnormally.
     * <p>
     * The most common causes of crashes with this exception type are uncaught Objective-C/C++ exceptions and calls to abort().
     */
    @Generated
    @Selector("cumulativeAbnormalExitCount")
    @NUInt
    public native long cumulativeAbnormalExitCount();

    /**
     * [@property]      cumulativeAppWatchdogExitCount
     * <p>
     * Cumulative number of times the application was terminated because a watchdog timeout occured.
     * <p>
     * These can occur when the application took too long to launch, terminate, or respond to system events.
     */
    @Generated
    @Selector("cumulativeAppWatchdogExitCount")
    @NUInt
    public native long cumulativeAppWatchdogExitCount();

    /**
     * [@property]      cumulativeBadAccessExitCount
     * <p>
     * Cumulative number of times the application was terminated for attempting to access invalid memory, or attempting to access memory in a manner not allowed by the memory's protection level (e.g. writing to read-only memory).
     */
    @Generated
    @Selector("cumulativeBadAccessExitCount")
    @NUInt
    public native long cumulativeBadAccessExitCount();

    /**
     * [@property]      cumulativeIllegalInstructionExitCount
     * <p>
     * Cumulative number of times the application terminated for attempting to execute an illegal or undefined instruction.
     * <p>
     * The process may have attempted to jump to an invalid address via a misconfigured function pointer.
     */
    @Generated
    @Selector("cumulativeIllegalInstructionExitCount")
    @NUInt
    public native long cumulativeIllegalInstructionExitCount();

    /**
     * [@property]      cumulativeMemoryResourceLimitExitCount
     * <p>
     * Cumulative number of times the application was terminated for exceeding a memory consumption limit.
     */
    @Generated
    @Selector("cumulativeMemoryResourceLimitExitCount")
    @NUInt
    public native long cumulativeMemoryResourceLimitExitCount();

    /**
     * [@property]      cumulativeNormalAppExitCount
     * <p>
     * Cumulative number of times the application exited normally, or was gracefully terminated by the system.
     */
    @Generated
    @Selector("cumulativeNormalAppExitCount")
    @NUInt
    public native long cumulativeNormalAppExitCount();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXForegroundExitData init();

    @Generated
    @Selector("initWithCoder:")
    public native MXForegroundExitData initWithCoder(NSCoder coder);

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
