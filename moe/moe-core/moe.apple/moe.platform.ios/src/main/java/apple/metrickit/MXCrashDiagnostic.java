package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MXCrashDiagnostic
 * 
 * An MXDiagnostic subclass that encapsulates crash reports.
 * 
 * See "Analyzing a Crash Report" for more information on crash diagnostics.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXCrashDiagnostic extends MXDiagnostic {
    static {
        NatJ.register();
    }

    @Generated
    protected MXCrashDiagnostic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXCrashDiagnostic alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MXCrashDiagnostic allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] callStackTree
     * 
     * The application call stack tree associated with this crash.
     * 
     * This call stack tree includes those stack frames present at the time of the crash.
     */
    @NotNull
    @Generated
    @Selector("callStackTree")
    public native MXCallStackTree callStackTree();

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

    /**
     * [@property] exceptionCode
     * 
     * Processor specific information about the exception encoded into one or more 64-bit hexadecimal numbers
     * 
     * @see sys/exception_types.h
     */
    @Nullable
    @Generated
    @Selector("exceptionCode")
    public native NSNumber exceptionCode();

    /**
     * [@property] exceptionType
     * 
     * The name of the Mach exception that terminated the app.
     * 
     * @see sys/exception_types.h
     */
    @Nullable
    @Generated
    @Selector("exceptionType")
    public native NSNumber exceptionType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXCrashDiagnostic init();

    @Generated
    @Selector("initWithCoder:")
    public native MXCrashDiagnostic initWithCoder(@NotNull NSCoder coder);

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
    public static native MXCrashDiagnostic new_objc();

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
     * [@property] signal
     * 
     * The signal associated with this crash.
     * 
     * @see sys/signal.h
     */
    @Nullable
    @Generated
    @Selector("signal")
    public native NSNumber signal();

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

    /**
     * [@property] terminationReason
     * 
     * The termination reason associated with this crash.
     * 
     * Exit reason information specified when a process is terminated. Key system components, both inside and outside of
     * a process, will terminate the process upon encountering a fatal error (e.g. a bad code signature, a missing
     * dependent library, or accessing privacy sensitive information without the proper entitlement).
     */
    @Nullable
    @Generated
    @Selector("terminationReason")
    public native String terminationReason();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] virtualMemoryRegionInfo
     * 
     * Details about memory that the app incorrectly accessed in relation to other sections of the app’s virtual memory
     * address space.
     * 
     * This property is set when a bad memory access crash occurs.
     */
    @Nullable
    @Generated
    @Selector("virtualMemoryRegionInfo")
    public native String virtualMemoryRegionInfo();
}
