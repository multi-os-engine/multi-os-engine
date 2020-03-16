package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentHistoryChangeRequest extends NSPersistentStoreRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentHistoryChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentHistoryChangeRequest alloc();

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
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("deleteHistoryBeforeDate:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object deleteHistoryBeforeDate(NSDate date);

    @Generated
    @Selector("deleteHistoryBeforeToken:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object deleteHistoryBeforeToken(NSPersistentHistoryToken token);

    @Generated
    @Selector("deleteHistoryBeforeTransaction:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object deleteHistoryBeforeTransaction(NSPersistentHistoryTransaction transaction);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("fetchHistoryAfterDate:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fetchHistoryAfterDate(NSDate date);

    @Generated
    @Selector("fetchHistoryAfterToken:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fetchHistoryAfterToken(NSPersistentHistoryToken token);

    @Generated
    @Selector("fetchHistoryAfterTransaction:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fetchHistoryAfterTransaction(NSPersistentHistoryTransaction transaction);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSPersistentHistoryChangeRequest init();

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resultType")
    @NInt
    public native long resultType();

    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("token")
    public native NSPersistentHistoryToken token();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("fetchHistoryWithFetchRequest:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fetchHistoryWithFetchRequest(NSFetchRequest<?> fetchRequest);

    @Generated
    @Selector("fetchRequest")
    public native NSFetchRequest<?> fetchRequest();

    @Generated
    @Selector("setFetchRequest:")
    public native void setFetchRequest(NSFetchRequest<?> value);
}