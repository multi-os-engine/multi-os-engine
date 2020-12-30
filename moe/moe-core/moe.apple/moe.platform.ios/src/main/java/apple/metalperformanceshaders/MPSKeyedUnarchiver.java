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

/**
 * @class MPSKeyedUnarchiver
 * @abstract A NSKeyedArchiver that supports the MPSDeviceProvider protocol for MPSKernel decoding
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
    @Selector("classForClassName:")
    public static native Class classForClassName_static(String codedName);

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

    @Generated
    @Selector("initForReadingFromData:device:error:")
    public native MPSKeyedUnarchiver initForReadingFromDataDeviceError(NSData data,
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initForReadingFromData:error:")
    public native MPSKeyedUnarchiver initForReadingFromDataError(NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initForReadingWithData:")
    public native MPSKeyedUnarchiver initForReadingWithData(NSData data);

    @Generated
    @Selector("initForReadingWithData:device:")
    public native MPSKeyedUnarchiver initForReadingWithDataDevice(NSData data,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSKeyedUnarchiver initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

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
    @Selector("mpsMTLDevice")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice mpsMTLDevice();

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
    @Selector("setClass:forClassName:")
    public static native void setClassForClassName_static(Class cls, String codedName);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unarchiveObjectWithData:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithData(NSData data);

    @Generated
    @Selector("unarchiveObjectWithData:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithDataDevice(NSData data,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("unarchiveObjectWithFile:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFile(String path);

    @Generated
    @Selector("unarchiveObjectWithFile:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFileDevice(String path,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("unarchiveTopLevelObjectWithData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataDeviceError(NSData data,
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchiveTopLevelObjectWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataError(NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedObjectOfClass:fromData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassFromDataDeviceError(Class cls, NSData data,
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedObjectOfClass:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassFromDataError(Class cls, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Common NSKeyedUnarchiver methods
     */
    @Generated
    @Selector("unarchivedObjectOfClasses:fromData:device:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassesFromDataDeviceError(NSSet<? extends Class> classes,
            NSData data, @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedObjectOfClasses:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassesFromDataError(NSSet<? extends Class> classes, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("unarchivedArrayOfObjectsOfClass:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassFromDataError(Class cls, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedArrayOfObjectsOfClasses:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassesFromDataError(NSSet<? extends Class> classes,
            NSData data, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClass:objectsOfClass:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassObjectsOfClassFromDataError(Class keyCls,
            Class valueCls, NSData data, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClasses:objectsOfClasses:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassesObjectsOfClassesFromDataError(
            NSSet<? extends Class> keyClasses, NSSet<? extends Class> valueClasses, NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}