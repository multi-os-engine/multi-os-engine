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
 * Cluster Unit Testing
 * The Test Cluster is meant to validate the generated code
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterUnitTesting extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterUnitTesting(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterUnitTesting alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterUnitTesting allocWithZone(VoidPtr zone);

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
    public native MTRClusterUnitTesting init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterUnitTesting initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterUnitTesting new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap16WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBitmap16WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap32WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBitmap32WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap64WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBitmap64WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap8WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBitmap8WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBooleanWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBooleanWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCharStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCharStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterErrorBooleanWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterErrorBooleanWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum16WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnum16WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum8WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnum8WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnumAttrWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnumAttrWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochSWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEpochSWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochUsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEpochUsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatDoubleWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFloatDoubleWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatSingleWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFloatSingleWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneralErrorBooleanWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneralErrorBooleanWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt16sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt16uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt24sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt24uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt32sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt32uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt40sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt40uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt48sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt48uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt56sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt56uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt64sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt64uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt8sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInt8uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListFabricScopedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListFabricScopedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListInt8uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListLongOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListLongOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListNullablesAndOptionalsStructWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListNullablesAndOptionalsStructWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListStructOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeListStructOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongCharStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLongCharStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLongOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap16WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableBitmap16WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap32WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableBitmap32WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap64WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableBitmap64WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap8WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableBitmap8WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBooleanWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableBooleanWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableCharStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableCharStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum16WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableEnum16WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum8WithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableEnum8WithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnumAttrWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableEnumAttrWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatDoubleWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableFloatDoubleWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatSingleWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableFloatSingleWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt16sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt16uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt24sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt24uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt32sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt32uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt40sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt40uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt48sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt48uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt56sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt56uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt64sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt64uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt8sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableInt8uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableRangeRestrictedInt16sWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableRangeRestrictedInt16uWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableRangeRestrictedInt8sWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableRangeRestrictedInt8uWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableStructWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNullableStructWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOctetStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOctetStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRangeRestrictedInt16sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRangeRestrictedInt16uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8sWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRangeRestrictedInt8sWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRangeRestrictedInt8uWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStructAttrWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStructAttrWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTimedWriteBooleanWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTimedWriteBooleanWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnsupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnsupportedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVendorIdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeVendorIdWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWriteOnlyInt8uWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWriteOnlyInt8uWithParams(@Nullable MTRReadParams params);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("simpleStructEchoRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterSimpleStructEchoRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_simpleStructEchoRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterSimpleStructResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testAddArgumentsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestAddArgumentsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testAddArgumentsWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestAddArgumentsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testComplexNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestComplexNullableOptionalRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testComplexNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestComplexNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEmitTestEventRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestEmitTestEventRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testEmitTestEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestEmitTestEventResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEmitTestFabricScopedEventRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestEmitTestFabricScopedEventRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testEmitTestFabricScopedEventRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestEmitTestFabricScopedEventResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEnumsRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestEnumsRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testEnumsRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestEnumsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListInt8UArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestListInt8UArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testListInt8UArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListInt8UReverseRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestListInt8UReverseRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testListInt8UReverseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestListInt8UReverseResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestListNestedStructListArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testListNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestListStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testListStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNestedStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestNestedStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testNestedStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestNestedStructListArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testNestedStructListArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNotHandledWithExpectedValues:expectedValueInterval:completion:")
    public native void testNotHandledWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNotHandledWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testNotHandledWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testNotHandledWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNotHandledWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestNotHandledParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testNotHandledWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestNullableOptionalRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testNullableOptionalRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSimpleArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestSimpleArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testSimpleArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestSimpleArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSimpleOptionalArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestSimpleOptionalArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testSimpleOptionalArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSpecificWithExpectedValues:expectedValueInterval:completion:")
    public native void testSpecificWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSpecificWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testSpecificWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testSpecificWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestSpecificResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSpecificWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestSpecificParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testSpecificWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestSpecificResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestStructArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testStructArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testStructArrayArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRUnitTestingClusterTestStructArrayArgumentRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testStructArrayArgumentRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRUnitTestingClusterTestStructArrayArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testUnknownCommandWithExpectedValues:expectedValueInterval:completion:")
    public native void testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testUnknownCommandWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testUnknownCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestUnknownCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testUnknownCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testWithExpectedValues:expectedValueInterval:completion:")
    public native void testWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("timedInvokeRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_timedInvokeRequestWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("timedInvokeRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRUnitTestingClusterTimedInvokeRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_timedInvokeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap16WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap16WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap16WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap16WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap32WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap32WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap32WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap32WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap64WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap64WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap64WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap64WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap8WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap8WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap8WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap8WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeBooleanWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeBooleanWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeCharStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeCharStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeClusterErrorBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeClusterErrorBooleanWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeClusterErrorBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeClusterErrorBooleanWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum16WithValue:expectedValueInterval:")
    public native void writeAttributeEnum16WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum16WithValue:expectedValueInterval:params:")
    public native void writeAttributeEnum16WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum8WithValue:expectedValueInterval:")
    public native void writeAttributeEnum8WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum8WithValue:expectedValueInterval:params:")
    public native void writeAttributeEnum8WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnumAttrWithValue:expectedValueInterval:")
    public native void writeAttributeEnumAttrWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnumAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnumAttrWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochSWithValue:expectedValueInterval:")
    public native void writeAttributeEpochSWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochSWithValue:expectedValueInterval:params:")
    public native void writeAttributeEpochSWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochUsWithValue:expectedValueInterval:")
    public native void writeAttributeEpochUsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochUsWithValue:expectedValueInterval:params:")
    public native void writeAttributeEpochUsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatDoubleWithValue:expectedValueInterval:")
    public native void writeAttributeFloatDoubleWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatDoubleWithValue:expectedValueInterval:params:")
    public native void writeAttributeFloatDoubleWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatSingleWithValue:expectedValueInterval:")
    public native void writeAttributeFloatSingleWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatSingleWithValue:expectedValueInterval:params:")
    public native void writeAttributeFloatSingleWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeGeneralErrorBooleanWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeGeneralErrorBooleanWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeInt16sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt16sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeInt16uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt16uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24sWithValue:expectedValueInterval:")
    public native void writeAttributeInt24sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt24sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24uWithValue:expectedValueInterval:")
    public native void writeAttributeInt24uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt24uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32sWithValue:expectedValueInterval:")
    public native void writeAttributeInt32sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt32sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32uWithValue:expectedValueInterval:")
    public native void writeAttributeInt32uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt32uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40sWithValue:expectedValueInterval:")
    public native void writeAttributeInt40sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt40sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40uWithValue:expectedValueInterval:")
    public native void writeAttributeInt40uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt40uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48sWithValue:expectedValueInterval:")
    public native void writeAttributeInt48sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt48sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48uWithValue:expectedValueInterval:")
    public native void writeAttributeInt48uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt48uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56sWithValue:expectedValueInterval:")
    public native void writeAttributeInt56sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt56sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56uWithValue:expectedValueInterval:")
    public native void writeAttributeInt56uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt56uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64sWithValue:expectedValueInterval:")
    public native void writeAttributeInt64sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt64sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64uWithValue:expectedValueInterval:")
    public native void writeAttributeInt64uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt64uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeInt8sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt8sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListFabricScopedWithValue:expectedValueInterval:")
    public native void writeAttributeListFabricScopedWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListFabricScopedWithValue:expectedValueInterval:params:")
    public native void writeAttributeListFabricScopedWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeListInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeListInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListLongOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListLongOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListLongOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListLongOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:expectedValueInterval:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:expectedValueInterval:params:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListStructOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListStructOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListStructOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListStructOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeLongCharStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeLongCharStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeLongOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeLongOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap16WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap16WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap16WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap16WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap32WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap32WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap32WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap32WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap64WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap64WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap64WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap64WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap8WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap8WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap8WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap8WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeNullableBooleanWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBooleanWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeNullableCharStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableCharStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum16WithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnum16WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum16WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnum16WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum8WithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnum8WithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum8WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnum8WithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnumAttrWithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnumAttrWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnumAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnumAttrWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatDoubleWithValue:expectedValueInterval:")
    public native void writeAttributeNullableFloatDoubleWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatDoubleWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableFloatDoubleWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatSingleWithValue:expectedValueInterval:")
    public native void writeAttributeNullableFloatSingleWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatSingleWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableFloatSingleWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt16sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt16sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt16uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt16uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt24sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt24sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt24uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt24uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt32sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt32sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt32uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt32uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt40sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt40sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt40uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt40uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt48sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt48sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt48uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt48uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt56sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt56sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt56uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt56uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt64sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt64sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt64uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt64uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt8sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt8sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeNullableOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableStructWithValue:expectedValueInterval:")
    public native void writeAttributeNullableStructWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableStructWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableStructWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeOctetStringWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeOctetStringWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt16sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt16sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt16uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt16uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt8sWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt8sWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStructAttrWithValue:expectedValueInterval:")
    public native void writeAttributeStructAttrWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStructAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeStructAttrWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTimedWriteBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeTimedWriteBooleanWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTimedWriteBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeTimedWriteBooleanWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnsupportedWithValue:expectedValueInterval:")
    public native void writeAttributeUnsupportedWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnsupportedWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnsupportedWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeVendorIdWithValue:expectedValueInterval:")
    public native void writeAttributeVendorIdWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeVendorIdWithValue:expectedValueInterval:params:")
    public native void writeAttributeVendorIdWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeWriteOnlyInt8uWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeWriteOnlyInt8uWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}