package apple.iosurface;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("IOSurface")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class IOSurface extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected IOSurface(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allAttachments")
    public native NSDictionary<String, ?> allAttachments();

    @Generated
    @Owned
    @Selector("alloc")
    public static native IOSurface alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allocationSize")
    @NInt
    public native long allocationSize();

    @Generated
    @Selector("allowsPixelSizeCasting")
    public native boolean allowsPixelSizeCasting();

    @Generated
    @Selector("attachmentForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attachmentForKey(String key);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("baseAddress")
    public native VoidPtr baseAddress();

    @Generated
    @Selector("baseAddressOfPlaneAtIndex:")
    public native VoidPtr baseAddressOfPlaneAtIndex(@NUInt long planeIndex);

    @Generated
    @Selector("bytesPerElement")
    @NInt
    public native long bytesPerElement();

    @Generated
    @Selector("bytesPerElementOfPlaneAtIndex:")
    @NInt
    public native long bytesPerElementOfPlaneAtIndex(@NUInt long planeIndex);

    @Generated
    @Selector("bytesPerRow")
    @NInt
    public native long bytesPerRow();

    @Generated
    @Selector("bytesPerRowOfPlaneAtIndex:")
    @NInt
    public native long bytesPerRowOfPlaneAtIndex(@NUInt long planeIndex);

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
    @Selector("decrementUseCount")
    public native void decrementUseCount();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("elementHeight")
    @NInt
    public native long elementHeight();

    @Generated
    @Selector("elementHeightOfPlaneAtIndex:")
    @NInt
    public native long elementHeightOfPlaneAtIndex(@NUInt long planeIndex);

    @Generated
    @Selector("elementWidth")
    @NInt
    public native long elementWidth();

    @Generated
    @Selector("elementWidthOfPlaneAtIndex:")
    @NInt
    public native long elementWidthOfPlaneAtIndex(@NUInt long planeIndex);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("height")
    @NInt
    public native long height();

    @Generated
    @Selector("heightOfPlaneAtIndex:")
    @NInt
    public native long heightOfPlaneAtIndex(@NUInt long planeIndex);

    @Generated
    @Selector("incrementUseCount")
    public native void incrementUseCount();

    @Generated
    @Selector("init")
    public native IOSurface init();

    @Generated
    @Selector("initWithCoder:")
    public native IOSurface initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithProperties:")
    public native IOSurface initWithProperties(NSDictionary<String, ?> properties);

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
    @Selector("isInUse")
    public native boolean isInUse();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("localUseCount")
    public native int localUseCount();

    @Generated
    @Selector("lockWithOptions:seed:")
    public native int lockWithOptionsSeed(int options, IntPtr seed);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pixelFormat")
    public native int pixelFormat();

    @Generated
    @Selector("planeCount")
    @NUInt
    public native long planeCount();

    @Generated
    @Selector("removeAllAttachments")
    public native void removeAllAttachments();

    @Generated
    @Selector("removeAttachmentForKey:")
    public native void removeAttachmentForKey(String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("seed")
    public native int seed();

    @Generated
    @Selector("setAllAttachments:")
    public native void setAllAttachments(NSDictionary<String, ?> dict);

    @Generated
    @Selector("setAttachment:forKey:")
    public native void setAttachmentForKey(@Mapped(ObjCObjectMapper.class) Object anObject, String key);

    @Generated
    @Selector("setPurgeable:oldState:")
    public native int setPurgeableOldState(int newState, IntPtr oldState);

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
    @Selector("unlockWithOptions:seed:")
    public native int unlockWithOptionsSeed(int options, IntPtr seed);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("width")
    @NInt
    public native long width();

    @Generated
    @Selector("widthOfPlaneAtIndex:")
    @NInt
    public native long widthOfPlaneAtIndex(@NUInt long planeIndex);
}