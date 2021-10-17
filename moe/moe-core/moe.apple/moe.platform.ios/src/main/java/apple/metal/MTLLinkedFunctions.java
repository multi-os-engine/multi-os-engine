package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

/**
 * MTLLinkedFunctions
 * <p>
 * A class to set functions to be linked.
 * <p>
 * All functions set on this object must have unique names.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLLinkedFunctions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLLinkedFunctions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLLinkedFunctions alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MTLLinkedFunctions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] binaryFunctions
     * <p>
     * The array of functions compiled to binary to be linked.
     */
    @Generated
    @Selector("binaryFunctions")
    public native NSArray<?> binaryFunctions();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] functions
     * <p>
     * The array of functions to be AIR linked.
     */
    @Generated
    @Selector("functions")
    public native NSArray<?> functions();

    /**
     * [@property] groups
     * <p>
     * Groups of functions, grouped to match callsites in the shader code.
     */
    @Generated
    @Selector("groups")
    public native NSDictionary<String, ? extends NSArray<?>> groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLLinkedFunctions init();

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

    /**
     * linkedFunctions
     * <p>
     * Create an autoreleased MTLLinkedFunctions object.
     */
    @Generated
    @Selector("linkedFunctions")
    public static native MTLLinkedFunctions linkedFunctions();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLLinkedFunctions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] binaryFunctions
     * <p>
     * The array of functions compiled to binary to be linked.
     */
    @Generated
    @Selector("setBinaryFunctions:")
    public native void setBinaryFunctions(NSArray<?> value);

    /**
     * [@property] functions
     * <p>
     * The array of functions to be AIR linked.
     */
    @Generated
    @Selector("setFunctions:")
    public native void setFunctions(NSArray<?> value);

    /**
     * [@property] groups
     * <p>
     * Groups of functions, grouped to match callsites in the shader code.
     */
    @Generated
    @Selector("setGroups:")
    public native void setGroups(NSDictionary<String, ? extends NSArray<?>> value);

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

    /**
     * [@property] privateFunctions
     * <p>
     * The array of functions to be AIR linked.
     * <p>
     * These functions are not exported by the pipeline state as MTLFunctionHandle objects.
     * Function pointer support is not required to link private functions.
     */
    @Generated
    @Selector("privateFunctions")
    public native NSArray<?> privateFunctions();

    /**
     * [@property] privateFunctions
     * <p>
     * The array of functions to be AIR linked.
     * <p>
     * These functions are not exported by the pipeline state as MTLFunctionHandle objects.
     * Function pointer support is not required to link private functions.
     */
    @Generated
    @Selector("setPrivateFunctions:")
    public native void setPrivateFunctions(NSArray<?> value);
}
