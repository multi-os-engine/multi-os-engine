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

    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceCreate(CFDictionaryRef properties);

    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceLookup(int csid);

    @Generated
    @CFunction
    public static native int IOSurfaceGetID(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native int IOSurfaceLock(IOSurfaceRef buffer, int options, IntPtr seed);

    @Generated
    @CFunction
    public static native int IOSurfaceUnlock(IOSurfaceRef buffer, int options, IntPtr seed);

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

    @Generated
    @CFunction
    public static native int IOSurfaceGetSeed(IOSurfaceRef buffer);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPlaneCount(IOSurfaceRef buffer);

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

    @Generated
    @CFunction
    public static native void IOSurfaceSetValue(IOSurfaceRef buffer, CFStringRef key, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr IOSurfaceCopyValue(IOSurfaceRef buffer, CFStringRef key);

    @Generated
    @CFunction
    public static native void IOSurfaceRemoveValue(IOSurfaceRef buffer, CFStringRef key);

    @Generated
    @CFunction
    public static native void IOSurfaceSetValues(IOSurfaceRef buffer, CFDictionaryRef keysAndValues);

    @Generated
    @CFunction
    public static native CFDictionaryRef IOSurfaceCopyAllValues(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native void IOSurfaceRemoveAllValues(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native int IOSurfaceCreateMachPort(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native IOSurfaceRef IOSurfaceLookupFromMachPort(int port);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPropertyMaximum(CFStringRef property);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceGetPropertyAlignment(CFStringRef property);

    @Generated
    @CFunction
    @NUInt
    public static native long IOSurfaceAlignProperty(CFStringRef property, @NUInt long value);

    @Generated
    @CFunction
    public static native void IOSurfaceIncrementUseCount(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native void IOSurfaceDecrementUseCount(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native int IOSurfaceGetUseCount(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native byte IOSurfaceIsInUse(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native byte IOSurfaceAllowsPixelSizeCasting(IOSurfaceRef buffer);

    @Generated
    @CFunction
    public static native int IOSurfaceSetPurgeable(IOSurfaceRef buffer, int newState, IntPtr oldState);

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceAllocSize();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceBytesPerRow();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceBytesPerElement();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceElementWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceElementHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBytesPerRow();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneSize();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBase();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBitsPerElement();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneBytesPerElement();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneElementWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneElementHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceCacheMode();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceIsGlobal();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePixelFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePixelSizeCastingAllowed();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentBitDepths();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentBitOffsets();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentNames();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentTypes();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfacePlaneComponentRanges();

    @Generated
    @CVariable()
    public static native CFStringRef kIOSurfaceSubsampling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyAllocSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyWidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyHeight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyBytesPerRow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyBytesPerElement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyElementWidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyElementHeight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyOffset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneInfo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneWidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneHeight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBytesPerRow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneOffset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBase();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneBytesPerElement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneElementWidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPlaneElementHeight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyCacheMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPixelFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyPixelSizeCastingAllowed();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String IOSurfacePropertyKeyAllocSize();
}