package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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

/**
 * Cluster Test Cluster
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPTestCluster extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPTestCluster(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPTestCluster alloc();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPTestCluster init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPTestCluster initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("readAttributeBitmap16WithResponseHandler:")
    public native void readAttributeBitmap16WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBitmap16WithResponseHandler") Block_readAttributeBitmap16WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap16WithResponseHandler {
        @Generated
        void call_readAttributeBitmap16WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBitmap32WithResponseHandler:")
    public native void readAttributeBitmap32WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBitmap32WithResponseHandler") Block_readAttributeBitmap32WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap32WithResponseHandler {
        @Generated
        void call_readAttributeBitmap32WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBitmap64WithResponseHandler:")
    public native void readAttributeBitmap64WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBitmap64WithResponseHandler") Block_readAttributeBitmap64WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap64WithResponseHandler {
        @Generated
        void call_readAttributeBitmap64WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBitmap8WithResponseHandler:")
    public native void readAttributeBitmap8WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBitmap8WithResponseHandler") Block_readAttributeBitmap8WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap8WithResponseHandler {
        @Generated
        void call_readAttributeBitmap8WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBooleanWithResponseHandler:")
    public native void readAttributeBooleanWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBooleanWithResponseHandler") Block_readAttributeBooleanWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBooleanWithResponseHandler {
        @Generated
        void call_readAttributeBooleanWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEnum16WithResponseHandler:")
    public native void readAttributeEnum16WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEnum16WithResponseHandler") Block_readAttributeEnum16WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum16WithResponseHandler {
        @Generated
        void call_readAttributeEnum16WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEnum8WithResponseHandler:")
    public native void readAttributeEnum8WithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEnum8WithResponseHandler") Block_readAttributeEnum8WithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum8WithResponseHandler {
        @Generated
        void call_readAttributeEnum8WithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt16sWithResponseHandler:")
    public native void readAttributeInt16sWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt16sWithResponseHandler") Block_readAttributeInt16sWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16sWithResponseHandler {
        @Generated
        void call_readAttributeInt16sWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt16uWithResponseHandler:")
    public native void readAttributeInt16uWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt16uWithResponseHandler") Block_readAttributeInt16uWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16uWithResponseHandler {
        @Generated
        void call_readAttributeInt16uWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt32sWithResponseHandler:")
    public native void readAttributeInt32sWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt32sWithResponseHandler") Block_readAttributeInt32sWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32sWithResponseHandler {
        @Generated
        void call_readAttributeInt32sWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt32uWithResponseHandler:")
    public native void readAttributeInt32uWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt32uWithResponseHandler") Block_readAttributeInt32uWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32uWithResponseHandler {
        @Generated
        void call_readAttributeInt32uWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt64sWithResponseHandler:")
    public native void readAttributeInt64sWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt64sWithResponseHandler") Block_readAttributeInt64sWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64sWithResponseHandler {
        @Generated
        void call_readAttributeInt64sWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt64uWithResponseHandler:")
    public native void readAttributeInt64uWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt64uWithResponseHandler") Block_readAttributeInt64uWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64uWithResponseHandler {
        @Generated
        void call_readAttributeInt64uWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt8sWithResponseHandler:")
    public native void readAttributeInt8sWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt8sWithResponseHandler") Block_readAttributeInt8sWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8sWithResponseHandler {
        @Generated
        void call_readAttributeInt8sWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInt8uWithResponseHandler:")
    public native void readAttributeInt8uWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInt8uWithResponseHandler") Block_readAttributeInt8uWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8uWithResponseHandler {
        @Generated
        void call_readAttributeInt8uWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeListInt8uWithResponseHandler:")
    public native void readAttributeListInt8uWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeListInt8uWithResponseHandler") Block_readAttributeListInt8uWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListInt8uWithResponseHandler {
        @Generated
        void call_readAttributeListInt8uWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeListOctetStringWithResponseHandler:")
    public native void readAttributeListOctetStringWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeListOctetStringWithResponseHandler") Block_readAttributeListOctetStringWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListOctetStringWithResponseHandler {
        @Generated
        void call_readAttributeListOctetStringWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeListStructOctetStringWithResponseHandler:")
    public native void readAttributeListStructOctetStringWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithResponseHandler") Block_readAttributeListStructOctetStringWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListStructOctetStringWithResponseHandler {
        @Generated
        void call_readAttributeListStructOctetStringWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOctetStringWithResponseHandler:")
    public native void readAttributeOctetStringWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOctetStringWithResponseHandler") Block_readAttributeOctetStringWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOctetStringWithResponseHandler {
        @Generated
        void call_readAttributeOctetStringWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
    @Selector("test:")
    public native void test(@ObjCBlock(name = "call_test") Block_test responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_test {
        @Generated
        void call_test(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("testNotHandled:")
    public native void testNotHandled(@ObjCBlock(name = "call_testNotHandled") Block_testNotHandled responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandled {
        @Generated
        void call_testNotHandled(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("testSpecific:")
    public native void testSpecific(@ObjCBlock(name = "call_testSpecific") Block_testSpecific responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecific {
        @Generated
        void call_testSpecific(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("testUnknownCommand:")
    public native void testUnknownCommand(
            @ObjCBlock(name = "call_testUnknownCommand") Block_testUnknownCommand responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommand {
        @Generated
        void call_testUnknownCommand(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writeAttributeBitmap16WithValue:responseHandler:")
    public native void writeAttributeBitmap16WithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeBitmap16WithValueResponseHandler") Block_writeAttributeBitmap16WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap16WithValueResponseHandler {
        @Generated
        void call_writeAttributeBitmap16WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeBitmap32WithValue:responseHandler:")
    public native void writeAttributeBitmap32WithValueResponseHandler(int value,
            @ObjCBlock(name = "call_writeAttributeBitmap32WithValueResponseHandler") Block_writeAttributeBitmap32WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap32WithValueResponseHandler {
        @Generated
        void call_writeAttributeBitmap32WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeBitmap64WithValue:responseHandler:")
    public native void writeAttributeBitmap64WithValueResponseHandler(long value,
            @ObjCBlock(name = "call_writeAttributeBitmap64WithValueResponseHandler") Block_writeAttributeBitmap64WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap64WithValueResponseHandler {
        @Generated
        void call_writeAttributeBitmap64WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeBitmap8WithValue:responseHandler:")
    public native void writeAttributeBitmap8WithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeBitmap8WithValueResponseHandler") Block_writeAttributeBitmap8WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap8WithValueResponseHandler {
        @Generated
        void call_writeAttributeBitmap8WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeBooleanWithValue:responseHandler:")
    public native void writeAttributeBooleanWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeBooleanWithValueResponseHandler") Block_writeAttributeBooleanWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBooleanWithValueResponseHandler {
        @Generated
        void call_writeAttributeBooleanWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeEnum16WithValue:responseHandler:")
    public native void writeAttributeEnum16WithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeEnum16WithValueResponseHandler") Block_writeAttributeEnum16WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum16WithValueResponseHandler {
        @Generated
        void call_writeAttributeEnum16WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeEnum8WithValue:responseHandler:")
    public native void writeAttributeEnum8WithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeEnum8WithValueResponseHandler") Block_writeAttributeEnum8WithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum8WithValueResponseHandler {
        @Generated
        void call_writeAttributeEnum8WithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt16sWithValue:responseHandler:")
    public native void writeAttributeInt16sWithValueResponseHandler(short value,
            @ObjCBlock(name = "call_writeAttributeInt16sWithValueResponseHandler") Block_writeAttributeInt16sWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16sWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt16sWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt16uWithValue:responseHandler:")
    public native void writeAttributeInt16uWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeInt16uWithValueResponseHandler") Block_writeAttributeInt16uWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16uWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt16uWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt32sWithValue:responseHandler:")
    public native void writeAttributeInt32sWithValueResponseHandler(int value,
            @ObjCBlock(name = "call_writeAttributeInt32sWithValueResponseHandler") Block_writeAttributeInt32sWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32sWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt32sWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt32uWithValue:responseHandler:")
    public native void writeAttributeInt32uWithValueResponseHandler(int value,
            @ObjCBlock(name = "call_writeAttributeInt32uWithValueResponseHandler") Block_writeAttributeInt32uWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32uWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt32uWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt64sWithValue:responseHandler:")
    public native void writeAttributeInt64sWithValueResponseHandler(long value,
            @ObjCBlock(name = "call_writeAttributeInt64sWithValueResponseHandler") Block_writeAttributeInt64sWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64sWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt64sWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt64uWithValue:responseHandler:")
    public native void writeAttributeInt64uWithValueResponseHandler(long value,
            @ObjCBlock(name = "call_writeAttributeInt64uWithValueResponseHandler") Block_writeAttributeInt64uWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64uWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt64uWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt8sWithValue:responseHandler:")
    public native void writeAttributeInt8sWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeInt8sWithValueResponseHandler") Block_writeAttributeInt8sWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8sWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt8sWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeInt8uWithValue:responseHandler:")
    public native void writeAttributeInt8uWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeInt8uWithValueResponseHandler") Block_writeAttributeInt8uWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8uWithValueResponseHandler {
        @Generated
        void call_writeAttributeInt8uWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeOctetStringWithValue:responseHandler:")
    public native void writeAttributeOctetStringWithValueResponseHandler(NSData value,
            @ObjCBlock(name = "call_writeAttributeOctetStringWithValueResponseHandler") Block_writeAttributeOctetStringWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOctetStringWithValueResponseHandler {
        @Generated
        void call_writeAttributeOctetStringWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
