package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAEDRMetadata extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CAEDRMetadata(Pointer peer) {
        super(peer);
    }

    /**
     * Initialize with SEI MDCV and CLLI as defined by ISO/IEC 23008-2:2017
     * 
     * `displayData'
     * The value is 24 bytes containing a big-endian structure as defined in D.2.28
     * Mastering display colour volume SEI message. If nil, uses system defaults.
     * 
     * `contentData'
     * The value is 4 bytes containing a big-endian structure as defined in D.2.35
     * Content light level information SEI message. If nil, uses system defaults.
     * 
     * `scale'
     * Scale factor relating (display-referred linear) extended range buffer values
     * (such as MTLPixelFormatRGBA16Float) to optical output of a reference display.
     * Values y in the buffer are assumed to be proportional to the optical output
     * C (in cd/m^2) of a reference display; denoting the opticalOutputScale as C1
     * (cd/m^2), the relationship is C = C1 * y. As an example, if C1 = 100 cd/m^2,
     * the optical output corresponding to y = 1 is C = C1 = 100 cd/m^2, and the
     * display-referred linear value corresponding to C = 4,000 cd/m^2 is y = 40.
     * If the content, y, is in a normalized pixel format then `scale' is
     * assumed to be 10,000.
     */
    @Generated
    @Selector("HDR10MetadataWithDisplayInfo:contentInfo:opticalOutputScale:")
    public static native CAEDRMetadata HDR10MetadataWithDisplayInfoContentInfoOpticalOutputScale(NSData displayData,
            NSData contentData, float scale);

    /**
     * Simplified HDR10 initializer based on the minimum and maximum candelas per
     * meters squared ("nits") of the mastering display. Any content greater than
     * `maxNits' may be clamped when displayed.
     * 
     * `minNits'
     * Minimum nits (cd/m^2) of the mastering display
     * 
     * `maxNits'
     * Maximum nits (cd/m^2) of the mastering display
     * 
     * `scale'
     * Scale factor relating (display-referred linear) extended range buffer values
     * (such as MTLPixelFormatRGBA16Float) to optical output of a reference display.
     * Values y in the buffer are assumed to be proportional to the optical output
     * C (in cd/m^2) of a reference display; denoting the opticalOutputScale as C1
     * (cd/m^2), the relationship is C = C1 * y. As an example, if C1 = 100 cd/m^2,
     * the optical output corresponding to y = 1 is C = C1 = 100 cd/m^2, and the
     * display-referred linear value corresponding to C = 4,000 cd/m^2 is y = 40.
     * If the content, y, is in a normalized pixel format then `scale' is
     * assumed to be 10,000.
     */
    @Generated
    @Selector("HDR10MetadataWithMinLuminance:maxLuminance:opticalOutputScale:")
    public static native CAEDRMetadata HDR10MetadataWithMinLuminanceMaxLuminanceOpticalOutputScale(float minNits,
            float maxNits, float scale);

    /**
     * Content is scene referred and originally encoded with the ITU-R BT.2100-2
     * Hybrid Log Gamma (HLG) opto-electrical transfer function (OETF). The system
     * will apply the opto-optical transfer function (OOTF) based on peak display
     * brightness and ambient. If rendering to a CAMetalLayer with a linear
     * colorspace (for floating point extended dynamic range layers), the content
     * provider must have already applied the HLG inverse OETF.
     */
    @Generated
    @Selector("HLGMetadata")
    public static native CAEDRMetadata HLGMetadata();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAEDRMetadata alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CAEDRMetadata allocWithZone(VoidPtr zone);

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
    public native CAEDRMetadata init();

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

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("isAvailable")
    public static native boolean isAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CAEDRMetadata new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}