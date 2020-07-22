package apple.classkit;

import apple.NSObject;
import apple.classkit.protocol.CLSDataStoreDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
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
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLSDataStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLSDataStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("activeContext")
    public native CLSContext activeContext();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLSDataStore alloc();

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
    @Selector("completeAllAssignedActivitiesMatching:")
    public native void completeAllAssignedActivitiesMatching(NSArray<String> contextPath);

    @Generated
    @Selector("contextsMatchingIdentifierPath:completion:")
    public native void contextsMatchingIdentifierPathCompletion(NSArray<String> identifierPath,
            @ObjCBlock(name = "call_contextsMatchingIdentifierPathCompletion") Block_contextsMatchingIdentifierPathCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contextsMatchingIdentifierPathCompletion {
        @Generated
        void call_contextsMatchingIdentifierPathCompletion(NSArray<? extends CLSContext> contexts, NSError error);
    }

    @Generated
    @Selector("contextsMatchingPredicate:completion:")
    public native void contextsMatchingPredicateCompletion(NSPredicate predicate,
            @ObjCBlock(name = "call_contextsMatchingPredicateCompletion") Block_contextsMatchingPredicateCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contextsMatchingPredicateCompletion {
        @Generated
        void call_contextsMatchingPredicateCompletion(NSArray<? extends CLSContext> contexts, NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CLSDataStoreDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLSDataStore init();

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
    @Selector("mainAppContext")
    public native CLSContext mainAppContext();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("removeContext:")
    public native void removeContext(CLSContext context);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("runningActivity")
    public native CLSActivity runningActivity();

    @Generated
    @Selector("saveWithCompletion:")
    public native void saveWithCompletion(
            @ObjCBlock(name = "call_saveWithCompletion") Block_saveWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveWithCompletion {
        @Generated
        void call_saveWithCompletion(NSError error);
    }

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CLSDataStoreDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CLSDataStoreDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("shared")
    public static native CLSDataStore shared();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}