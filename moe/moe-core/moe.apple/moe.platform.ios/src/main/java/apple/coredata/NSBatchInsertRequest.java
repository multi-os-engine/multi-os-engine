package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBatchInsertRequest extends NSPersistentStoreRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSBatchInsertRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBatchInsertRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("batchInsertRequestWithEntityName:objects:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameObjects(String entityName,
            NSArray<? extends NSDictionary<String, ?>> dictionaries);

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
    @Selector("entity")
    public native NSEntityDescription entity();

    @Generated
    @Selector("entityName")
    public native String entityName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSBatchInsertRequest init();

    @Generated
    @Selector("initWithEntity:objects:")
    public native NSBatchInsertRequest initWithEntityObjects(NSEntityDescription entity,
            NSArray<? extends NSDictionary<String, ?>> dictionaries);

    @Generated
    @Selector("initWithEntityName:objects:")
    public native NSBatchInsertRequest initWithEntityNameObjects(String entityName,
            NSArray<? extends NSDictionary<String, ?>> dictionaries);

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
    @Selector("objectsToInsert")
    public native NSArray<? extends NSDictionary<String, ?>> objectsToInsert();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    @Generated
    @Selector("setObjectsToInsert:")
    public native void setObjectsToInsert(NSArray<? extends NSDictionary<String, ?>> value);

    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);

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

    @Generated
    @Selector("batchInsertRequestWithEntityName:dictionaryHandler:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameDictionaryHandler(String entityName,
            @ObjCBlock(name = "call_batchInsertRequestWithEntityNameDictionaryHandler") Block_batchInsertRequestWithEntityNameDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_batchInsertRequestWithEntityNameDictionaryHandler {
        @Generated
        boolean call_batchInsertRequestWithEntityNameDictionaryHandler(NSMutableDictionary<String, Object> obj);
    }

    @Generated
    @Selector("batchInsertRequestWithEntityName:managedObjectHandler:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameManagedObjectHandler(String entityName,
            @ObjCBlock(name = "call_batchInsertRequestWithEntityNameManagedObjectHandler") Block_batchInsertRequestWithEntityNameManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_batchInsertRequestWithEntityNameManagedObjectHandler {
        @Generated
        boolean call_batchInsertRequestWithEntityNameManagedObjectHandler(NSManagedObject obj);
    }

    @Generated
    @Selector("dictionaryHandler")
    @ObjCBlock(name = "call_dictionaryHandler_ret")
    public native Block_dictionaryHandler_ret dictionaryHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dictionaryHandler_ret {
        @Generated
        boolean call_dictionaryHandler_ret(NSMutableDictionary<String, Object> arg0);
    }

    @Generated
    @Selector("initWithEntity:dictionaryHandler:")
    public native NSBatchInsertRequest initWithEntityDictionaryHandler(NSEntityDescription entity,
            @ObjCBlock(name = "call_initWithEntityDictionaryHandler") Block_initWithEntityDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityDictionaryHandler {
        @Generated
        boolean call_initWithEntityDictionaryHandler(NSMutableDictionary<String, Object> obj);
    }

    @Generated
    @Selector("initWithEntity:managedObjectHandler:")
    public native NSBatchInsertRequest initWithEntityManagedObjectHandler(NSEntityDescription entity,
            @ObjCBlock(name = "call_initWithEntityManagedObjectHandler") Block_initWithEntityManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityManagedObjectHandler {
        @Generated
        boolean call_initWithEntityManagedObjectHandler(NSManagedObject obj);
    }

    @Generated
    @Selector("initWithEntityName:dictionaryHandler:")
    public native NSBatchInsertRequest initWithEntityNameDictionaryHandler(String entityName,
            @ObjCBlock(name = "call_initWithEntityNameDictionaryHandler") Block_initWithEntityNameDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityNameDictionaryHandler {
        @Generated
        boolean call_initWithEntityNameDictionaryHandler(NSMutableDictionary<String, Object> obj);
    }

    @Generated
    @Selector("initWithEntityName:managedObjectHandler:")
    public native NSBatchInsertRequest initWithEntityNameManagedObjectHandler(String entityName,
            @ObjCBlock(name = "call_initWithEntityNameManagedObjectHandler") Block_initWithEntityNameManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityNameManagedObjectHandler {
        @Generated
        boolean call_initWithEntityNameManagedObjectHandler(NSManagedObject obj);
    }

    @Generated
    @Selector("managedObjectHandler")
    @ObjCBlock(name = "call_managedObjectHandler_ret")
    public native Block_managedObjectHandler_ret managedObjectHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_managedObjectHandler_ret {
        @Generated
        boolean call_managedObjectHandler_ret(NSManagedObject arg0);
    }

    @Generated
    @Selector("setDictionaryHandler:")
    public native void setDictionaryHandler(
            @ObjCBlock(name = "call_setDictionaryHandler") Block_setDictionaryHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDictionaryHandler {
        @Generated
        boolean call_setDictionaryHandler(NSMutableDictionary<String, Object> arg0);
    }

    @Generated
    @Selector("setManagedObjectHandler:")
    public native void setManagedObjectHandler(
            @ObjCBlock(name = "call_setManagedObjectHandler") Block_setManagedObjectHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setManagedObjectHandler {
        @Generated
        boolean call_setManagedObjectHandler(NSManagedObject arg0);
    }
}