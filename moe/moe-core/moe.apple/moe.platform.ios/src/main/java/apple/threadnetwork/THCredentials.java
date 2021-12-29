package apple.threadnetwork;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ThreadNetwork")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class THCredentials extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected THCredentials(Pointer peer) {
        super(peer);
    }

    /**
     * PSKc : A 16 byte value. e.g. 0eec92e950c4cbc6966d32613f08efe0
     */
    @Generated
    @Selector("PSKC")
    public native NSData PSKC();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Active Operational Data Set in Bytes.
     */
    @Generated
    @Selector("activeOperationalDataSet")
    public native NSData activeOperationalDataSet();

    @Generated
    @Owned
    @Selector("alloc")
    public static native THCredentials alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native THCredentials allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * extendedPANID : Active Thread Network Border Agent Identifier
     */
    @Generated
    @Selector("borderAgentID")
    public native NSData borderAgentID();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * channel : Thread network channel
     */
    @Generated
    @Selector("channel")
    public native byte channel();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Metadata
     */
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * extendedPANID : Thread Network extended PAN ID
     */
    @Generated
    @Selector("extendedPANID")
    public native NSData extendedPANID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native THCredentials init();

    @Generated
    @Selector("initWithCoder:")
    public native THCredentials initWithCoder(NSCoder coder);

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
    @Selector("lastModificationDate")
    public native NSDate lastModificationDate();

    /**
     * networkKey : A 16 byte value. e.g. 7dd5b9bffe1285f27e78898658aa88f4
     */
    @Generated
    @Selector("networkKey")
    public native NSData networkKey();

    /**
     * networkName : Thread Network name
     */
    @Generated
    @Selector("networkName")
    public native String networkName();

    @Generated
    @Owned
    @Selector("new")
    public static native THCredentials new_objc();

    /**
     * PANID : A 2 byte value. e.g. 308f
     */
    @Generated
    @Selector("panID")
    public native NSData panID();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * channel : Thread network channel
     */
    @Generated
    @Selector("setChannel:")
    public native void setChannel(byte value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
