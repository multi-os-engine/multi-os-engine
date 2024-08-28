package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSKeyedUnarchiver;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSDeviceProvider;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSKeyedUnarchiver
 * 
 * A NSKeyedArchiver that supports the MPSDeviceProvider protocol for MPSKernel decoding
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSKeyedUnarchiver extends NSKeyedUnarchiver implements MPSDeviceProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSKeyedUnarchiver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSKeyedUnarchiver alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSKeyedUnarchiver allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @Nullable
    @Generated
    @Selector("classForClassName:")
    public static native Class classForClassName_static(@NotNull String codedName);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSKeyedUnarchiver init();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initForReadingFromData:device:error:")
    public native MPSKeyedUnarchiver initForReadingFromDataDeviceError(@NotNull NSData data,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initForReadingFromData:error:")
    public native MPSKeyedUnarchiver initForReadingFromDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Deprecated
    @Generated
    @Selector("initForReadingWithData:")
    public native MPSKeyedUnarchiver initForReadingWithData(@NotNull NSData data);

    /**
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("initForReadingWithData:device:")
    public native MPSKeyedUnarchiver initForReadingWithDataDevice(@NotNull NSData data,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("initWithDevice:")
    public native MPSKeyedUnarchiver initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

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

    @NotNull
    @Generated
    @Selector("mpsMTLDevice")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice mpsMTLDevice();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSKeyedUnarchiver new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setClass:forClassName:")
    public static native void setClassForClassName_static(@Nullable Class cls, @NotNull String codedName);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithData:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithData(@NotNull NSData data);

    /**
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithData:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithDataDevice(@NotNull NSData data,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithFile:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFile(@NotNull String path);

    /**
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithFile:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFileDevice(@NotNull String path,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * API-Since: 11.3
     * Deprecated-Since: 12.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveTopLevelObjectWithData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataDeviceError(@NotNull NSData data,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveTopLevelObjectWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClass:fromData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassFromDataDeviceError(@NotNull Class cls, @NotNull NSData data,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClass:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassFromDataError(@NotNull Class cls, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Common NSKeyedUnarchiver methods
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClasses:fromData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassesFromDataDeviceError(@NotNull NSSet<? extends Class> classes,
            @NotNull NSData data, @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClasses:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassesFromDataError(@NotNull NSSet<? extends Class> classes,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("unarchivedArrayOfObjectsOfClass:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassFromDataError(@NotNull Class cls,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("unarchivedArrayOfObjectsOfClasses:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassesFromDataError(
            @NotNull NSSet<? extends Class> classes, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClass:objectsOfClass:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassObjectsOfClassFromDataError(
            @NotNull Class keyCls, @NotNull Class valueCls, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClasses:objectsOfClasses:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassesObjectsOfClassesFromDataError(
            @NotNull NSSet<? extends Class> keyClasses, @NotNull NSSet<? extends Class> valueClasses,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
