package apple.classkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLSContext extends CLSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLSContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addChildContext:")
    public native void addChildContext(CLSContext child);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLSContext alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("becomeActive")
    public native void becomeActive();

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
    @Selector("createNewActivity")
    public native CLSActivity createNewActivity();

    @Generated
    @Selector("currentActivity")
    public native CLSActivity currentActivity();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("descendantMatchingIdentifierPath:completion:")
    public native void descendantMatchingIdentifierPathCompletion(NSArray<String> identifierPath,
            @ObjCBlock(name = "call_descendantMatchingIdentifierPathCompletion") Block_descendantMatchingIdentifierPathCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_descendantMatchingIdentifierPathCompletion {
        @Generated
        void call_descendantMatchingIdentifierPathCompletion(CLSContext context, NSError error);
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("displayOrder")
    @NInt
    public native long displayOrder();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native CLSContext init();

    @Generated
    @Selector("initWithCoder:")
    public native CLSContext initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithType:identifier:title:")
    public native CLSContext initWithTypeIdentifierTitle(@NInt long type, String identifier, String title);

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
    @Selector("isActive")
    public native boolean isActive();

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
    @Selector("parent")
    public native CLSContext parent();

    @Generated
    @Selector("removeFromParent")
    public native void removeFromParent();

    @Generated
    @Selector("resignActive")
    public native void resignActive();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDisplayOrder:")
    public native void setDisplayOrder(@NInt long value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setTopic:")
    public native void setTopic(String value);

    @Generated
    @Selector("setUniversalLinkURL:")
    public native void setUniversalLinkURL(NSURL value);

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
    @Selector("title")
    public native String title();

    @Generated
    @Selector("topic")
    public native String topic();

    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("universalLinkURL")
    public native NSURL universalLinkURL();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("customTypeName")
    public native String customTypeName();

    @Generated
    @Selector("identifierPath")
    public native NSArray<String> identifierPath();

    @Generated
    @Selector("setCustomTypeName:")
    public native void setCustomTypeName(String value);

    @Generated
    @Selector("setSummary:")
    public native void setSummary(String value);

    @Generated
    @Selector("setThumbnail:")
    public native void setThumbnail(CGImageRef value);

    @Generated
    @Selector("summary")
    public native String summary();

    @Generated
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    @Generated
    @Selector("addProgressReportingCapabilities:")
    public native void addProgressReportingCapabilities(NSSet<? extends CLSProgressReportingCapability> capabilities);

    @Generated
    @Selector("isAssignable")
    public native boolean isAssignable();

    @Generated
    @Selector("progressReportingCapabilities")
    public native NSSet<? extends CLSProgressReportingCapability> progressReportingCapabilities();

    @Generated
    @Selector("resetProgressReportingCapabilities")
    public native void resetProgressReportingCapabilities();

    @Generated
    @Selector("setAssignable:")
    public native void setAssignable(boolean value);

    @Generated
    @Selector("setSuggestedAge:")
    public native void setSuggestedAge(@ByValue NSRange value);

    @Generated
    @Selector("setSuggestedCompletionTime:")
    public native void setSuggestedCompletionTime(@ByValue NSRange value);

    @Generated
    @Selector("setType:")
    public native void setType(@NInt long type);

    @Generated
    @Selector("suggestedAge")
    @ByValue
    public native NSRange suggestedAge();

    @Generated
    @Selector("suggestedCompletionTime")
    @ByValue
    public native NSRange suggestedCompletionTime();
}