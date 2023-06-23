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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Note: IOSurface objects are "toll free bridged" to IOSurfaceRef objects
 * 
 * API-Since: 11.0
 */
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

    @Nullable
    @Generated
    @Selector("allAttachments")
    public native NSDictionary<String, ?> allAttachments();

    @Generated
    @Owned
    @Selector("alloc")
    public static native IOSurface alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native IOSurface allocWithZone(VoidPtr zone);

    /**
     * The total allocation size of the IOSurface
     */
    @Generated
    @Selector("allocationSize")
    @NInt
    public native long allocationSize();

    /**
     * This property returns YES if it is legal to choose an OpenGL or Metal pixel format with a bytes per pixel
     * value that is different than the bytesPerElement value(s) of this IOSurface. Returns NO if the bytes per pixel
     * value must be an exact match.
     */
    @Generated
    @Selector("allowsPixelSizeCasting")
    public native boolean allowsPixelSizeCasting();

    @Nullable
    @Generated
    @Selector("attachmentForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attachmentForKey(@NotNull String key);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("baseAddress")
    public native VoidPtr baseAddress();

    @NotNull
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

    /**
     * Note: These properties may not return well-defined values for planar surfaces
     */
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
    public native void encodeWithCoder(@NotNull NSCoder coder);

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
    public native IOSurface initWithCoder(@NotNull NSCoder coder);

    /**
     * Create a new IOSurface
     */
    @Generated
    @Selector("initWithProperties:")
    public native IOSurface initWithProperties(@NotNull NSDictionary<String, ?> properties);

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
     * There are cases where it is useful to know whether or not an IOSurface buffer is considered to be "in use"
     * by other users of the same IOSurface. In particular, CoreVideo and other APIs make use of the IOSurface
     * use count facility to know when it is safe to recycle an IOSurface backed CVPixelBuffer object. This is
     * particularly important when IOSurface objects are being shared across process boundaries and the normal
     * mechanisms one might use would not be viable.
     * 
     * The IOSurface use count is similar in concept to any other reference counting scheme. When the global use
     * count of an IOSurface goes to zero, it is no longer considered "in use". When it is anything other than
     * zero, then the IOSurface is still "in use" by someone and therefore anyone attempting to maintain a pool
     * of IOSurfaces to be recycled should not reclaim that IOSurface.
     * 
     * Note that IOSurface maintains both a per-process and an internal system wide usage count. In the current
     * implementation, when the per-process usage count goes from zero to one, the system wide usage count is
     * incremented by one. When the per-process usage count drops back to zero (either via explicit decrement
     * calls or the process terminates), the global usage count is decremented by one.
     */
    @Generated
    @Selector("isInUse")
    public native boolean isInUse();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The localUseCount property returns the local per-process usage count for an IOSurface. This call is only
     * provided for logging/debugging purposes and should never be used to determine whether an IOSurface is
     * considered to be "in use". The isInUse property is the only call that should be used for that purpose.
     */
    @Generated
    @Selector("localUseCount")
    public native int localUseCount();

    /**
     * "Lock" or "Unlock" a IOSurface for reading or writing.
     * 
     * The term "lock" is used loosely in this context, and is simply used along with the
     * "unlock" information to put a bound on CPU access to the raw IOSurface data.
     * 
     * If the seed parameter is non-NULL, IOSurfaceLock() will store the buffer's
     * internal modification seed value at the time you made the lock call. You can compare
     * this value to a value returned previously to determine of the contents of the buffer
     * has been changed since the last lock.
     * 
     * In the case of IOSurfaceUnlock(), the seed value returned will be the internal
     * seed value at the time of the unlock. If you locked the buffer for writing, this value
     * will be incremented as the unlock is performed and the new value will be returned.
     * 
     * See the IOSurfacePropertyKeyLock enums for more information.
     * 
     * Note: Locking and unlocking a IOSurface is not a particularly cheap operation,
     * so care should be taken to avoid the calls whenever possible. The seed values are
     * particularly useful for keeping a cache of the buffer contents.
     */
    @Generated
    @Selector("lockWithOptions:seed:")
    public native int lockWithOptionsSeed(int options, @Nullable IntPtr seed);

    @Generated
    @Owned
    @Selector("new")
    public static native IOSurface new_objc();

    @Generated
    @Selector("pixelFormat")
    public native int pixelFormat();

    /**
     * Return the number of planes in this buffer. Will be 0 if the surface is non-planar
     */
    @Generated
    @Selector("planeCount")
    @NUInt
    public native long planeCount();

    @Generated
    @Selector("removeAllAttachments")
    public native void removeAllAttachments();

    @Generated
    @Selector("removeAttachmentForKey:")
    public native void removeAttachmentForKey(@NotNull String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This will return the current seed value of the buffer and is a cheap property to read to see
     * if the contents of the buffer have changed since the last lock/unlock.
     */
    @Generated
    @Selector("seed")
    public native int seed();

    @Generated
    @Selector("setAllAttachments:")
    public native void setAllAttachments(@NotNull NSDictionary<String, ?> dict);

    /**
     * These calls let you attach property list types to a IOSurface buffer. These calls are
     * expensive (they essentially must serialize the data into the kernel) and thus should be avoided whenever
     * possible. Note: These functions can not be used to change the underlying surface properties.
     */
    @Generated
    @Selector("setAttachment:forKey:")
    public native void setAttachmentForKey(@NotNull @Mapped(ObjCObjectMapper.class) Object anObject,
            @NotNull String key);

    /**
     * See comments in IOSurfaceAPI.h
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPurgeable:oldState:")
    public native int setPurgeableOldState(int newState, @Nullable IntPtr oldState);

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
    public native int unlockWithOptionsSeed(int options, @Nullable IntPtr seed);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Basic surface layout information
     */
    @Generated
    @Selector("width")
    @NInt
    public native long width();

    /**
     * These properties return information about a particular plane of a IOSurface. They will
     * raise if called on non-planar surfaces or if the index value is not less than the number
     * of planes.
     */
    @Generated
    @Selector("widthOfPlaneAtIndex:")
    @NInt
    public native long widthOfPlaneAtIndex(@NUInt long planeIndex);
}
