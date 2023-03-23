package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * AVSampleBufferRequest
 * 
 * An AVSampleBufferRequest describes a CMSampleBuffer creation request.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSampleBufferRequest allocWithZone(VoidPtr zone);

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

    /**
     * Default is AVSampleBufferRequestDirectionNone.
     */
    @Generated
    @Selector("direction")
    @NInt
    public native long direction();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSampleBufferRequest init();

    @Generated
    @Selector("initWithStartCursor:")
    public native AVSampleBufferRequest initWithStartCursor(AVSampleCursor startCursor);

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
     * optional: if not nil, the sequence of samples to be loaded may include the sample at this position, but no
     * further.
     */
    @Generated
    @Selector("limitCursor")
    public native AVSampleCursor limitCursor();

    /**
     * optional: if not zero, indicates the maximum number of samples to load.
     */
    @Generated
    @Selector("maxSampleCount")
    @NInt
    public native long maxSampleCount();

    /**
     * One of AVSampleBufferRequestMode*. This property is ignored when scheduling the request on an
     * AVSampleBufferGenerator created with a NULL timebase.
     */
    @Generated
    @Selector("mode")
    @NInt
    public native long mode();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSampleBufferRequest new_objc();

    /**
     * optional: indicates deadline for sample data and output PTS for CMSampleBuffer.
     */
    @Generated
    @Selector("overrideTime")
    @ByValue
    public native CMTime overrideTime();

    /**
     * optional: if not zero, indicates the preferred number of samples to load. Fewer samples may be loaded if there is
     * a change of format description.
     */
    @Generated
    @Selector("preferredMinSampleCount")
    @NInt
    public native long preferredMinSampleCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Default is AVSampleBufferRequestDirectionNone.
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@NInt long value);

    /**
     * optional: if not nil, the sequence of samples to be loaded may include the sample at this position, but no
     * further.
     */
    @Generated
    @Selector("setLimitCursor:")
    public native void setLimitCursor(AVSampleCursor value);

    /**
     * optional: if not zero, indicates the maximum number of samples to load.
     */
    @Generated
    @Selector("setMaxSampleCount:")
    public native void setMaxSampleCount(@NInt long value);

    /**
     * One of AVSampleBufferRequestMode*. This property is ignored when scheduling the request on an
     * AVSampleBufferGenerator created with a NULL timebase.
     */
    @Generated
    @Selector("setMode:")
    public native void setMode(@NInt long value);

    /**
     * optional: indicates deadline for sample data and output PTS for CMSampleBuffer.
     */
    @Generated
    @Selector("setOverrideTime:")
    public native void setOverrideTime(@ByValue CMTime value);

    /**
     * optional: if not zero, indicates the preferred number of samples to load. Fewer samples may be loaded if there is
     * a change of format description.
     */
    @Generated
    @Selector("setPreferredMinSampleCount:")
    public native void setPreferredMinSampleCount(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * mandatory: the created CMSampleBuffer must include the sample at this position
     */
    @Generated
    @Selector("startCursor")
    public native AVSampleCursor startCursor();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}