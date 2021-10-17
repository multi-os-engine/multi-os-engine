package apple.identitylookup;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
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

/**
 * A response to an ILClassificationRequest.
 */
@Generated
@Library("IdentityLookup")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ILClassificationResponse extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected ILClassificationResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("action")
    @NInt
    public native long action();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ILClassificationResponse alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ILClassificationResponse allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ILClassificationResponse init();

    @Generated
    @Selector("initWithClassificationAction:")
    public native ILClassificationResponse initWithClassificationAction(@NInt long action);

    @Generated
    @Selector("initWithCoder:")
    public native ILClassificationResponse initWithCoder(NSCoder coder);

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
    public static native ILClassificationResponse new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The JSON representation of this dictionary will be sent when a value for
     * ILClassificationExtensionNetworkReportDestination has been set in the extension's Info.plist
     * <p>
     * The keys and values in this dictionary must conform to the NSJSONSerialization specifications:
     * - Top level object is an NSDictionary
     * - All objects are NSString, NSNumber, NSArray, NSDictionary, or NSNull
     * - All dictionary keys are NSStrings
     * - NSNumbers are not NaN or infinity
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<String, ?> value);

    /**
     * The value of this string will be sent when a value for
     * ILClassificationExtensionSMSReportDestination has been set in the extension's Info.plist
     */
    @Generated
    @Selector("setUserString:")
    public native void setUserString(String value);

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

    /**
     * The JSON representation of this dictionary will be sent when a value for
     * ILClassificationExtensionNetworkReportDestination has been set in the extension's Info.plist
     * <p>
     * The keys and values in this dictionary must conform to the NSJSONSerialization specifications:
     * - Top level object is an NSDictionary
     * - All objects are NSString, NSNumber, NSArray, NSDictionary, or NSNull
     * - All dictionary keys are NSStrings
     * - NSNumbers are not NaN or infinity
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    /**
     * The value of this string will be sent when a value for
     * ILClassificationExtensionSMSReportDestination has been set in the extension's Info.plist
     */
    @Generated
    @Selector("userString")
    public native String userString();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
