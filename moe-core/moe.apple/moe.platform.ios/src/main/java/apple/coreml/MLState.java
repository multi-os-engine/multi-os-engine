package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

/**
 * Handle to the state buffers.
 * 
 * A stateful model maintains a state from one prediction to another by storing the information in the state buffers. To
 * use such a model, the client must request the model to create state buffers and get `MLState` object, which is the
 * handle to those buffers. Then, at the prediction time, pass the `MLState` object in one of the stateful prediction
 * functions.
 * 
 * ```swift
 * // Load a stateful model
 * let modelAsset = try MLModelAsset(url: modelURL)
 * let model = try await MLModel.load(asset: modelAsset, configuration: MLModelConfiguration())
 * 
 * // Request a state
 * let state = model.newState()
 * 
 * // Run predictions
 * for _ in 0 ..< 42 {
 * _ = try await model.prediction(from: inputFeatures, using: state)
 * }
 * 
 * // Access the state buffer.
 * state.withMultiArray(for: "accumulator") { stateMultiArray in
 * ...
 * }
 * ```
 * 
 * The object is a handle to the state buffers. The client shall not read or write the buffers while a prediction is
 * in-flight.
 * 
 * Each stateful prediction that uses the same `MLState` must be serialized. Otherwise, if two such predictions run
 * concurrently, the behavior is undefined.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MLState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Gets a mutable view into a state buffer.
     * 
     * The underlying state buffer's address can differ for each call; one shall not access the state buffer outside of
     * the closure.
     * 
     * - Parameters:
     * - handler: Block to access the state buffer through `MLMultiArray`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("getMultiArrayForStateNamed:handler:")
    public native void getMultiArrayForStateNamedHandler(@NotNull String stateName,
            @ObjCBlock(name = "call_getMultiArrayForStateNamedHandler") @NotNull Block_getMultiArrayForStateNamedHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMultiArrayForStateNamedHandler {
        @Generated
        void call_getMultiArrayForStateNamedHandler(@NotNull MLMultiArray buffer);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLState init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MLState new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}