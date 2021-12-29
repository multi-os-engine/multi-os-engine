package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRenderPipelineFunctionsDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPipelineFunctionsDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPipelineFunctionsDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRenderPipelineFunctionsDescriptor allocWithZone(VoidPtr zone);

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
     * [@property] fragmentAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the fragment function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("fragmentAdditionalBinaryFunctions")
    public native NSArray<?> fragmentAdditionalBinaryFunctions();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLRenderPipelineFunctionsDescriptor init();

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
    public static native MTLRenderPipelineFunctionsDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] fragmentAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the fragment function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("setFragmentAdditionalBinaryFunctions:")
    public native void setFragmentAdditionalBinaryFunctions(NSArray<?> value);

    /**
     * [@property] tileAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the tile function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("setTileAdditionalBinaryFunctions:")
    public native void setTileAdditionalBinaryFunctions(NSArray<?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] vertexAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the vertex function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("setVertexAdditionalBinaryFunctions:")
    public native void setVertexAdditionalBinaryFunctions(NSArray<?> value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] tileAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the tile function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("tileAdditionalBinaryFunctions")
    public native NSArray<?> tileAdditionalBinaryFunctions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] vertexAdditionalBinaryFunctions
     * <p>
     * The set of additional binary functions to be accessed from the vertex function in an incrementally created pipeline state.
     */
    @Generated
    @Selector("vertexAdditionalBinaryFunctions")
    public native NSArray<?> vertexAdditionalBinaryFunctions();
}
