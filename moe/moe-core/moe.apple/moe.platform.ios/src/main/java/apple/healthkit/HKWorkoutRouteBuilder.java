package apple.healthkit;

import apple.NSObject;
import apple.corelocation.CLLocation;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutRouteBuilder extends HKSeriesBuilder {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutRouteBuilder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutRouteBuilder alloc();

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("finishRouteWithWorkout:metadata:completion:")
    public native void finishRouteWithWorkoutMetadataCompletion(HKWorkout workout, NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_finishRouteWithWorkoutMetadataCompletion") Block_finishRouteWithWorkoutMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishRouteWithWorkoutMetadataCompletion {
        @Generated
        void call_finishRouteWithWorkoutMetadataCompletion(HKWorkoutRoute arg0, NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKWorkoutRouteBuilder init();

    @Generated
    @Selector("initWithHealthStore:device:")
    public native HKWorkoutRouteBuilder initWithHealthStoreDevice(HKHealthStore healthStore, HKDevice device);

    @Generated
    @Selector("insertRouteData:completion:")
    public native void insertRouteDataCompletion(NSArray<? extends CLLocation> routeData,
            @ObjCBlock(name = "call_insertRouteDataCompletion") Block_insertRouteDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_insertRouteDataCompletion {
        @Generated
        void call_insertRouteDataCompletion(boolean arg0, NSError arg1);
    }

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
    @Selector("addMetadata:completion:")
    public native void addMetadataCompletion(NSDictionary<String, ?> metadata,
            @ObjCBlock(name = "call_addMetadataCompletion") Block_addMetadataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addMetadataCompletion {
        @Generated
        void call_addMetadataCompletion(boolean arg0, NSError arg1);
    }
}