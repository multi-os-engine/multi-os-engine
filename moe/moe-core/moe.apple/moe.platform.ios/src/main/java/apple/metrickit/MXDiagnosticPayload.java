package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
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
 * @class         MXDiagnosticPayload
 * @abstract      A wrapper class which contains a diagnostic payload and associated properties of that payload.
 * @discussion    MXDiagnosticPayload encapsulates currently supported diagnostics that can be vended by MetricKit. Arrays of MXDiangostic subclasses on MXDiagnosticPayload are nullable. If an array of MXDiagnostic subclasses is nil, it indicates that the diagnostics are not available for this payload.
 * @discussion    MXDiagnosticPayload exposes a convenience function, JSONRepresentation, to convert the contents of the payload to a human readable JSON. This should be used in conjunction with other APIs that accept NSData.
 * @discussion    An MXDiagnosticPayload contains diagnostics that cover a 24 hour period of application usage. The properties timeStampBegin and timeStampEnd should be used to determine which time range the payload covers.
 * @discussion    It is possible for an MXDiagnosticPayload to cover regions of time where an application was updated, and thus each MXDiagnostic subclass will contain its own application version string. This is in contrast to MXMetricPayload, where only the latest application version string is included as metadata of the payload. Each MXDiagnostic subclass application version string should be inspected prior to processing.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXDiagnosticPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXDiagnosticPayload(Pointer peer) {
        super(peer);
    }

    /**
     * @method        JSONRepresentation
     * @abstract      Convenience method to return a JSON representation of this diagnostic payload.
     * @result        An NSData object containing the JSON representation
     */
    @Generated
    @Selector("JSONRepresentation")
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXDiagnosticPayload alloc();

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
     * @property      cpuExceptionDiagnostics
     * @abstract      An array containing CPU exception diagnostics for this application.
     */
    @Generated
    @Selector("cpuExceptionDiagnostics")
    public native NSArray<? extends MXCPUExceptionDiagnostic> cpuExceptionDiagnostics();

    /**
     * @property      crashDiagnostics
     * @abstract      An array containing crash diagnostics for this application.
     */
    @Generated
    @Selector("crashDiagnostics")
    public native NSArray<? extends MXCrashDiagnostic> crashDiagnostics();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @method        dictionaryRepresentation
     * @abstract      Convenience method to return a NSDictionary representation of this diagnostic payload.
     * @result        An NSDictionary object containing the dictionary representation
     */
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();

    /**
     * @property      diskWriteExceptionDiagnostics
     * @abstract      An array containing disk write exception diagnostics for this application.
     */
    @Generated
    @Selector("diskWriteExceptionDiagnostics")
    public native NSArray<? extends MXDiskWriteExceptionDiagnostic> diskWriteExceptionDiagnostics();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * @property      hangDiagnostics
     * @abstract      An array containing hang diagnostics for this application.
     */
    @Generated
    @Selector("hangDiagnostics")
    public native NSArray<? extends MXHangDiagnostic> hangDiagnostics();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXDiagnosticPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native MXDiagnosticPayload initWithCoder(NSCoder coder);

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

    /**
     * @property      timeStampBegin
     * @abstract      An NSDate object that indicates the start time for which the payload was generated.
     */
    @Generated
    @Selector("timeStampBegin")
    public native NSDate timeStampBegin();

    /**
     * @property      timeStampEnd
     * @abstract      An NSDate object that indicates the end time for which the payload was generated.
     */
    @Generated
    @Selector("timeStampEnd")
    public native NSDate timeStampEnd();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}