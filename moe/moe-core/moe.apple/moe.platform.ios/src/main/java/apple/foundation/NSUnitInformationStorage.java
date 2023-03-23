package apple.foundation;

import apple.NSObject;
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

/**
 * A dimension for representing amounts of digital information.
 * Base Unit: Byte
 * 
 * The values of the below follow IEC 80000-13 definitions and conventions.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUnitInformationStorage extends NSDimension implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUnitInformationStorage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUnitInformationStorage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUnitInformationStorage allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("baseUnit")
    public static native NSUnitInformationStorage baseUnit();

    /**
     * One byte is 8 bits; one nibble is 4 bits.
     */
    @Generated
    @Selector("bits")
    public static native NSUnitInformationStorage bits();

    /**
     * Bytes are defined by IEC 80000-13: one byte is 8 bits.
     */
    @Generated
    @Selector("bytes")
    public static native NSUnitInformationStorage bytes();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("exabits")
    public static native NSUnitInformationStorage exabits();

    @Generated
    @Selector("exabytes")
    public static native NSUnitInformationStorage exabytes();

    @Generated
    @Selector("exbibits")
    public static native NSUnitInformationStorage exbibits();

    @Generated
    @Selector("exbibytes")
    public static native NSUnitInformationStorage exbibytes();

    @Generated
    @Selector("gibibits")
    public static native NSUnitInformationStorage gibibits();

    @Generated
    @Selector("gibibytes")
    public static native NSUnitInformationStorage gibibytes();

    @Generated
    @Selector("gigabits")
    public static native NSUnitInformationStorage gigabits();

    @Generated
    @Selector("gigabytes")
    public static native NSUnitInformationStorage gigabytes();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSUnitInformationStorage init();

    @Generated
    @Selector("initWithCoder:")
    public native NSUnitInformationStorage initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithSymbol:")
    public native NSUnitInformationStorage initWithSymbol(String symbol);

    @Generated
    @Selector("initWithSymbol:converter:")
    public native NSUnitInformationStorage initWithSymbolConverter(String symbol, NSUnitConverter converter);

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
    @Selector("kibibits")
    public static native NSUnitInformationStorage kibibits();

    @Generated
    @Selector("kibibytes")
    public static native NSUnitInformationStorage kibibytes();

    @Generated
    @Selector("kilobits")
    public static native NSUnitInformationStorage kilobits();

    @Generated
    @Selector("kilobytes")
    public static native NSUnitInformationStorage kilobytes();

    @Generated
    @Selector("mebibits")
    public static native NSUnitInformationStorage mebibits();

    @Generated
    @Selector("mebibytes")
    public static native NSUnitInformationStorage mebibytes();

    @Generated
    @Selector("megabits")
    public static native NSUnitInformationStorage megabits();

    @Generated
    @Selector("megabytes")
    public static native NSUnitInformationStorage megabytes();

    @Generated
    @Owned
    @Selector("new")
    public static native NSUnitInformationStorage new_objc();

    @Generated
    @Selector("nibbles")
    public static native NSUnitInformationStorage nibbles();

    @Generated
    @Selector("pebibits")
    public static native NSUnitInformationStorage pebibits();

    @Generated
    @Selector("pebibytes")
    public static native NSUnitInformationStorage pebibytes();

    @Generated
    @Selector("petabits")
    public static native NSUnitInformationStorage petabits();

    @Generated
    @Selector("petabytes")
    public static native NSUnitInformationStorage petabytes();

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
    @Selector("tebibits")
    public static native NSUnitInformationStorage tebibits();

    @Generated
    @Selector("tebibytes")
    public static native NSUnitInformationStorage tebibytes();

    @Generated
    @Selector("terabits")
    public static native NSUnitInformationStorage terabits();

    @Generated
    @Selector("terabytes")
    public static native NSUnitInformationStorage terabytes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("yobibits")
    public static native NSUnitInformationStorage yobibits();

    /**
     * IEC-prefixed units (i.e. base 2):
     * 1 kibibyte = 1024¹ bytes; 1 mebibyte = 1024² bytes; etc.
     */
    @Generated
    @Selector("yobibytes")
    public static native NSUnitInformationStorage yobibytes();

    @Generated
    @Selector("yottabits")
    public static native NSUnitInformationStorage yottabits();

    /**
     * SI-prefixed units (i.e. base 10):
     * 1 kilobyte = 1000¹ bytes; 1 megabyte = 1000² bytes; etc.
     */
    @Generated
    @Selector("yottabytes")
    public static native NSUnitInformationStorage yottabytes();

    @Generated
    @Selector("zebibits")
    public static native NSUnitInformationStorage zebibits();

    @Generated
    @Selector("zebibytes")
    public static native NSUnitInformationStorage zebibytes();

    @Generated
    @Selector("zettabits")
    public static native NSUnitInformationStorage zettabits();

    @Generated
    @Selector("zettabytes")
    public static native NSUnitInformationStorage zettabytes();
}
