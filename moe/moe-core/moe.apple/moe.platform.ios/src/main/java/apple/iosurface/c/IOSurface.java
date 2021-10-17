package apple.iosurface.c;

import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.coregraphics.opaque.IOSurfaceRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("IOSurface")
@Runtime(CRuntime.class)
public final class IOSurface {
    static {
        NatJ.register();
    }

    @Generated
    private IOSurface() {
    }

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetTypeID();

    /**
     * Create a brand new IOSurface object
     */
    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceCreate(CFDictionaryRef properties);

    /**
     * Perform an atomic lookup and retain of a IOSurface by its IOSurfaceID.
     * Note: Performing multiple lookups of the same IOSurface will *NOT* return
     * the same IOSurfaceRef.   If you need to compare two IOSurface objects
     * for equality, you must either do so by comparing their IOSurfaceIDs, or by
     * using CFEqual().
     */
    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceLookup(int csid);

    /**
     * Retrieve the unique IOSurfaceID value for a IOSurface
     */
    @Generated
    @CFunction
    public static native int IOSurfaceGetID(IOSurfaceRef buffer);

    /**
     * "Lock" or "Unlock" a IOSurface for reading or writing.
     * <p>
     * The term "lock" is used loosely in this context, and is simply used along with the
     * "unlock" information to put a bound on CPU access to the raw IOSurface data.
     * <p>
     * If the seed parameter is non-NULL, IOSurfaceLock() will store the buffer's
     * internal modification seed value at the time you made the lock call.   You can compare
     * this value to a value returned previously to determine of the contents of the buffer
     * has been changed since the last lock.
     * <p>
     * In the case of IOSurfaceUnlock(), the seed value returned will be the internal
     * seed value at the time of the unlock.  If you locked the buffer for writing, this value
     * will be incremented as the unlock is performed and the new value will be returned.
     * <p>
     * See the kIOSurfaceLock enums for more information.
     * <p>
     * Note: Locking and unlocking a IOSurface is not a particularly cheap operation,
     * so care should be taken to avoid the calls whenever possible.   The seed values are
     * particularly useful for keeping a cache of the buffer contents.
     */
    @Generated
    @CFunction
    public static native int IOSurfaceLock(IOSurfaceRef buffer, int options, IntPtr seed);

    @Generated
    @CFunction
    public static native int IOSurfaceUnlock(IOSurfaceRef buffer, int options, IntPtr seed);

    /**
     * These routines are all fairly self explanatory.  0 is returned if buffer is invalid or NULL
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetAllocSize(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetWidth(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetHeight(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBytesPerElement(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBytesPerRow(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native VoidPtr IOSurfaceGetBaseAddress(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetElementWidth(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetElementHeight(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native int IOSurfaceGetPixelFormat(IOSurfaceRef buffer);

    /**
     * This will return the current seed value of the buffer and is a cheap call to make to see
     * if the contents of the buffer have changed since the last lock/unlock.
     */
    @Generated
    @CFunction
    public static native int IOSurfaceGetSeed(IOSurfaceRef buffer);

    /**
     * Return the number of planes in this buffer.  May be 0.   Returns 0 for an invalid or NULL buffer pointer.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPlaneCount(IOSurfaceRef buffer);

    /**
     * These routines return information about a particular plane of a IOSurface.
     * <p>
     * If the planeIndex is greater than or equal to the plane count of the IOSurface, zero
     * is returned.... with one exception.   If this IOSurface has zero planes and a planeIndex
     * of zero is passed in, the routines function just like the non-planar APIs.  This is to allow
     * higher level code to treat planar and non-planar buffers is a more uniform fashion.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetWidthOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetHeightOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBytesPerElementOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBytesPerRowOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    public static native VoidPtr IOSurfaceGetBaseAddressOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetElementWidthOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetElementHeightOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    /**
     * These routines return information about a particular component of a particular plane of a IOSurface.
     * For non-planar IOSurfaces, pass zero for planeIndex.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetNumberOfComponentsOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex);

    @Generated
    @CFunction
    public static native int IOSurfaceGetNameOfComponentOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex,
            @NUInt long componentIndex);

    @Generated
    @CFunction
    public static native int IOSurfaceGetTypeOfComponentOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex,
            @NUInt long componentIndex);

    @Generated
    @CFunction
    public static native int IOSurfaceGetRangeOfComponentOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex,
            @NUInt long componentIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBitDepthOfComponentOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex,
            @NUInt long componentIndex);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetBitOffsetOfComponentOfPlane(IOSurfaceRef buffer, @NUInt long planeIndex,
            @NUInt long componentIndex);

    @Generated
    @CFunction
    public static native int IOSurfaceGetSubsampling(IOSurfaceRef buffer);

    /**
     * These  calls let you attach CF property list types to a IOSurface buffer.  These calls are
     * expensive (they essentially must serialize the data into the kernel) and thus should be avoided whenever
     * possible.   Note:  These functions can not be used to change the underlying surface properties.
     */
    @Generated
    @CFunction
    public static native void IOSurfaceSetValue(IOSurfaceRef buffer, CFStringRef key, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr IOSurfaceCopyValue(IOSurfaceRef buffer, CFStringRef key);

    @Generated
    @CFunction
    public static native void IOSurfaceRemoveValue(IOSurfaceRef buffer, CFStringRef key);

    /**
     * Bulk setters and getters for setting, retrieving or removing the entire
     * set of values at once .
     */
    @Generated
    @CFunction
    public static native void IOSurfaceSetValues(IOSurfaceRef buffer, CFDictionaryRef keysAndValues);

    @Generated
    @CFunction
    public static native CFDictionaryRef IOSurfaceCopyAllValues(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native void IOSurfaceRemoveAllValues(IOSurfaceRef buffer);

    /**
     * This call lets you get a mach_port_t that holds a reference to the IOSurface. This is useful
     * if you need to atomically or securely pass an IOSurface to another task without making the surface global to
     * the entire system.  The returned port must be deallocated with mach_port_deallocate or the equivalent.
     * Note: Any live mach ports created from an IOSurfaceRef implicity increase the IOSurface's global use
     * count by one until the port is deleted.
     */
    @Generated
    @CFunction
    public static native int IOSurfaceCreateMachPort(IOSurfaceRef buffer);

    /**
     * This call lets you take a mach_port_t created via IOSurfaceCreatePort() and recreate an IOSurfaceRef from it.
     * Note: This call does NOT destroy the port.
     */
    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceLookupFromMachPort(int port);

    /**
     * IOSurfaceGetPropertyMaximum() will return the maximum of a given property that is guaranteed to be
     * compatible with all of the current devices (GPUs, etc.) in the system.   The most important ones being:
     * <p>
     * kIOSurfaceBytesPerRow
     * kIOSurfaceWidth
     * kIOSurfaceHeight
     * kIOSurfacePlaneBytesPerRow
     * kIOSurfacePlaneWidth
     * kIOSurfacePlaneHeight
     * <p>
     * For the width and height properties, the maximum values are the largest that are guaranteed to work
     * for both reading and writing.   In OpenGL terms this translates into the largest size that will work
     * for both textures and render targets.
     * <p>
     * This function returns 0 for properties that have no predefined limit or where the concept of a limit
     * would be considered invalid (such as kIOSurfacePixelFormat).
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPropertyMaximum(CFStringRef property);

    /**
     * If a property has a particular alignment requirement, then IOSurfaceGetPropertyAlignment() will return it.
     * If the property has no alignment requirement then 1 will be returned.   The following properties
     * should always be aligned if you choose calculate them yourself:
     * <p>
     * kIOSurfaceBytesPerRow
     * kIOSurfaceOffset
     * <p>
     * kIOSurfacePlaneBase
     * kIOSurfacePlaneOffset
     * kIOSurfacePlaneBytesPerRow
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPropertyAlignment(CFStringRef property);

    /**
     * This is a convenience function to automatically align property values.  For properties with no alignment
     * requirements, the original value will be returned.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceAlignProperty(CFStringRef property, @NUInt long value);

    /**
     * Increment the per-process usage count for an IOSurface
     */
    @Generated
    @CFunction
    public static native void IOSurfaceIncrementUseCount(IOSurfaceRef buffer);

    /**
     * Decrement the per-process usage count for an IOSurface
     */
    @Generated
    @CFunction
    public static native void IOSurfaceDecrementUseCount(IOSurfaceRef buffer);

    /**
     * Return the per-process usage count for an IOSurface
     */
    @Generated
    @CFunction
    public static native int IOSurfaceGetUseCount(IOSurfaceRef buffer);

    /**
     * Returns true of an IOSurface is in use by any process in the system, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte IOSurfaceIsInUse(IOSurfaceRef buffer);

    /**
     * Rerturns true if this IOSurface allows pixel size casting
     */
    @Generated
    @CFunction
    public static native byte IOSurfaceAllowsPixelSizeCasting(IOSurfaceRef buffer);

    /**
     * You should assume that if you mark an IOSurface as Purgeable/Empty and mark it
     * NonVolatile and it comes back with the old state being Empty that any texture
     * objects bound to the IOSurface now have undefined content in them.
     * <p>
     * If oldState is non-NULL, it will return the previous state of the IOSurface.
     * <p>
     * kIOSurfacePurgeableNonVolatile - The IOSurface was not volatile and the contents are still valid
     * kIOSurfacePurgeableVolatile    - The IOSurface was volatile, but the contents were not discarded
     * kIOSurfacePurgeableEmpty       - The IOSurface was empty and the contents have been discarded.
     * kIOSurfacePurgeableKeepCurrent - Don't change the current status, just return what the state is now.
     */
    @Generated
    @CFunction
    public static native int IOSurfaceSetPurgeable(IOSurfaceRef buffer, int newState, IntPtr oldState);

    /**
     * kIOSurfaceAllocSize    - CFNumber of the total allocation size of the buffer including all planes.
     * Defaults to BufferHeight * BytesPerRow if not specified.   Must be specified for
     * dimensionless buffers.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceAllocSize();

    /**
     * kIOSurfaceWidth  - CFNumber for the width of the IOSurface buffer in pixels.   Required for planar IOSurfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceWidth();

    /**
     * kIOSurfaceHeight - CFNumber for the height of the IOSurface buffer in pixels.  Required for planar IOSurfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceHeight();

    /**
     * kIOSurfaceBytesPerRow - CFNumber for the bytes per row of the buffer.   If not specified, IOSurface will first calculate
     * the number full elements required on each row (by rounding up), multiplied by the bytes per element
     * for this buffer.   That value will then be appropriately aligned.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceBytesPerRow();

    /**
     * kIOSurfaceBytesPerElement - CFNumber for the total number of bytes in an element.  Default to 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceBytesPerElement();

    /**
     * kIOSurfaceElementWidth   - CFNumber for how many pixels wide each element is.   Defaults to 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceElementWidth();

    /**
     * kIOSurfaceElementHeight  - CFNumber for how many pixels high each element is.   Defaults to 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceElementHeight();

    /**
     * kIOSurfaceOffset - CFNumber for the starting offset into the buffer.  Defaults to 0.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceOffset();

    /**
     * kIOSurfacePlaneInfo    - CFArray describing each image plane in the buffer as a CFDictionary.   The CFArray must have at least one entry.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneInfo();

    /**
     * kIOSurfacePlaneWidth  - CFNumber for the width of this plane in pixels.  Required for image planes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneWidth();

    /**
     * kIOSurfacePlaneHeight  - CFNumber for the height of this plane in pixels.  Required for image planes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneHeight();

    /**
     * kIOSurfacePlaneBytesPerRow    - CFNumber for the bytes per row of this plane.  If not specified, IOSurface will first calculate
     * the number full elements required on each row (by rounding up), multiplied by the bytes per element
     * for this plane.   That value will then be appropriately aligned.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBytesPerRow();

    /**
     * kIOSurfacePlaneOffset  - CFNumber for the offset into the buffer for this plane.  If not specified then IOSurface
     * will lay out each plane sequentially based on the previous plane's allocation size.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneOffset();

    /**
     * kIOSurfacePlaneSize    - CFNumber for the total data size of this plane.  Defaults to plane height * plane bytes per row if not specified.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneSize();

    /**
     * kIOSurfacePlaneBase    - CFNumber for the base offset into the buffer for this plane. Optional, defaults to the plane offset
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBase();

    /**
     * kIOSurfacePlaneBitsPerElement    - CFNumber for the bits per element of this plane.  Optional, default is 1.
     * For use in cases where kIOSurfacePlaneBytesPerElement doesn't allow sufficient precision.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBitsPerElement();

    /**
     * kIOSurfacePlaneBytesPerElement    - CFNumber for the bytes per element of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBytesPerElement();

    /**
     * kIOSurfacePlaneElementWidth    - CFNumber for the element width of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneElementWidth();

    /**
     * kIOSurfacePlaneElementHeight   - CFNumber for the element height of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneElementHeight();

    /**
     * kIOSurfaceCacheMode  - CFNumber for the CPU cache mode to be used for the allocation.  Default is kIOMapDefaultCache.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceCacheMode();

    /**
     * kIOSurfaceIsGlobal   - CFBoolean     If true, the IOSurface may be looked up by any task in the system by its ID.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceIsGlobal();

    /**
     * kIOSurfacePixelFormat - CFNumber     A 32-bit unsigned integer that stores the traditional Mac OS X buffer format
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePixelFormat();

    /**
     * kIOSurfacePixelSizeCastingAllowed - If false the creator promises that there will be no pixel size casting when used on the GPU.  Default is true.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePixelSizeCastingAllowed();

    /**
     * kIOSurfacePlaneComponentBitDepths   - CFArray[CFNumber] for bit depth of each component in this plane.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentBitDepths();

    /**
     * kIOSurfacePlaneComponentBitOffsets   - CFArray[CFNumber] for bit offset of each component in this plane, (low bit zero, high bit 7). For example 'BGRA' would be {0, 8, 16, 24}
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentBitOffsets();

    /**
     * kIOSurfacePlaneComponentNames   - CFArray[CFNumber] for IOSurfaceComponentName of each component in this plane.
     * For example 'BGRA' would be {4, 3, 2, 1}
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentNames();

    /**
     * kIOSurfacePlaneComponentTypes   - CFArray[CFNumber] for IOSurfaceComponentType of each component in this plane.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentTypes();

    /**
     * kIOSurfacePlaneComponentRanges   - CFArray[CFNumber] for IOSurfaceComponentRange of each component in this plane.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentRanges();

    /**
     * kIOSurfaceSubsampling   - CFNumber(IOSurfaceSubsampling) describing the chroma subsampling.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceSubsampling();

    /**
     * This key was misnamed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyAllocSizeKey();

    /**
     * IOSurfacePropertyKeyWidth  - NSNumber for the width of the IOSurface buffer in pixels.   Required for planar IOSurfaces.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyWidth();

    /**
     * IOSurfacePropertyKeyHeight - NSNumber for the height of the IOSurface buffer in pixels.  Required for planar IOSurfaces.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyHeight();

    /**
     * IOSurfacePropertyKeyBytesPerRow - NSNumber for the bytes per row of the buffer.   If not specified, IOSurface will first calculate
     * the number full elements required on each row (by rounding up), multiplied by the bytes per element for this surface.
     * That value will then be appropriately aligned.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyBytesPerRow();

    /**
     * IOSurfacePropertyKeyBytesPerElement - NSNumber for the total number of bytes in an element.  Default to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyBytesPerElement();

    /**
     * IOSurfacePropertyKeyElementWidth   - NSNumber for how many pixels wide each element is.   Defaults to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyElementWidth();

    /**
     * IOSurfacePropertyKeyElementHeight  - NSNumber for how many pixels high each element is.   Defaults to 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyElementHeight();

    /**
     * IOSurfacePropertyKeyOffset - NSNumber for the starting offset into the buffer.  Defaults to 0.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyOffset();

    /**
     * IOSurfacePropertyKeyPlaneInfo    - NSArray describing each image plane in the buffer as a CFDictionary.   The CFArray must have at least one entry.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneInfo();

    /**
     * IOSurfacePropertyKeyPlaneWidth  - NSNumber for the width of this plane in pixels.  Required for image planes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneWidth();

    /**
     * IOSurfacePropertyKeyPlaneHeight  - NSNumber for the height of this plane in pixels.  Required for image planes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneHeight();

    /**
     * IOSurfacePropertyKeyPlaneBytesPerRow    - NSNumber for the bytes per row of this plane.  If not specified, IOSurface will first calculate
     * the number full elements required on each row (by rounding up), multiplied by the bytes per element for this plane.
     * That value will then be appropriately aligned.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBytesPerRow();

    /**
     * IOSurfacePropertyKeyPlaneOffset  - NSNumber for the offset into the buffer for this plane.  If not specified then IOSurface
     * will lay out each plane sequentially based on the previous plane's allocation size.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneOffset();

    /**
     * IOSurfacePropertyKeyPlaneSize    - NSNumber for the total data size of this plane.  Defaults to plane height * plane bytes per row if not specified.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneSize();

    /**
     * IOSurfacePropertyKeyPlaneBase    - NSNumber for the base offset into the buffer for this plane. Optional, defaults to the plane offset
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBase();

    /**
     * IOSurfacePropertyKeyPlaneBytesPerElement    - NSNumber for the bytes per element of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBytesPerElement();

    /**
     * IOSurfacePropertyKeyPlaneElementWidth    - NSNumber for the element width of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneElementWidth();

    /**
     * IOSurfacePropertyKeyPlaneElementHeight   - NSNumber for the element height of this plane.  Optional, default is 1.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneElementHeight();

    /**
     * IOSurfacePropertyKeyCacheMode        - NSNumber for the CPU cache mode to be used for the allocation.  Default is kIOMapDefaultCache.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyCacheMode();

    /**
     * IOSurfacePropertyKeyPixelFormat - NSNumber   A 32-bit unsigned integer that stores the traditional Mac OS X buffer format
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPixelFormat();

    /**
     * IOSurfacePropertyKeyPixelSizeCastingAllowed - If false the creator promises that there will be no pixel size casting when used on the GPU.  Default is true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPixelSizeCastingAllowed();

    /**
     * IOSurfacePropertyKeyAllocSize    - NSNumber of the total allocation size of the buffer including all planes.
     * Defaults to BufferHeight * BytesPerRow if not specified.   Must be specified for
     * dimensionless buffers.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyAllocSize();

    /**
     * kIOSurfaceColorSpace defines the RGB (or other) color space for the data stored in the IOSurface. It
     * is expected that this is a serialized CGColorSpaceRef, provided by the CoreGraphics CGColorSpaceRef
     * serialization APIs (CGColorSpaceCopyPropertyList).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceColorSpace();

    /**
     * CFData representation of the ICC Profile, generally via CGColorSpaceCopyICCData
     */
    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceICCProfile();
}
