package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRClusterUnitTesting
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterTestCluster extends MTRClusterUnitTesting {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterTestCluster(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterTestCluster alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterTestCluster allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterTestCluster init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterTestCluster initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterTestCluster initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterTestCluster new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use simpleStructEchoRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("simpleStructEchoRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterSimpleStructEchoRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterSimpleStructResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testAddArgumentsWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testAddArgumentsWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestAddArgumentsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestAddArgumentsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testComplexNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testComplexNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestComplexNullableOptionalRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestComplexNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testEmitTestEventRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEmitTestEventRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestEmitTestEventRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestEmitTestEventResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testEmitTestFabricScopedEventRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEmitTestFabricScopedEventRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestEmitTestFabricScopedEventRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestEmitTestFabricScopedEventResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testEnumsRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEnumsRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestEnumsRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestEnumsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testListInt8UArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListInt8UArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestListInt8UArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testListInt8UReverseRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListInt8UReverseRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestListInt8UReverseRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestListInt8UReverseResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testListNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestListNestedStructListArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testListStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestListStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testNestedStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNestedStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestNestedStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestNestedStructListArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNotHandledWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNotHandledWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void testNotHandledWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNotHandledWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testNotHandledWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testNotHandledWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNotHandledWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNotHandledWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestNotHandledParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestNullableOptionalRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testSimpleArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSimpleArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestSimpleArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestSimpleArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testSimpleOptionalArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSimpleOptionalArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestSimpleOptionalArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSpecificWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSpecificWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void testSpecificWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSpecificWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testSpecificWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testSpecificWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestSpecificResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSpecificWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSpecificWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestSpecificParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestSpecificResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * testStructArrayArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testStructArrayArgumentRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRTestClusterClusterTestStructArrayArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRTestClusterClusterTestStructArrayArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testUnknownCommandWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testUnknownCommandWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testUnknownCommandWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testUnknownCommandWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestUnknownCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void testWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use timedInvokeRequestWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeRequestWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use timedInvokeRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRTestClusterClusterTimedInvokeRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}