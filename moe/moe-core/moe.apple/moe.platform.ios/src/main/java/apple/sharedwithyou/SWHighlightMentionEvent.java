package apple.sharedwithyou;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.sharedwithyou.protocol.SWHighlightEvent;
import apple.sharedwithyoucore.SWPersonIdentity;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * _SWHighlightMentionEvent
 * 
 * A model object representing a mention event that has happened on some content.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYou")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SWHighlightMentionEvent extends NSObject implements SWHighlightEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected SWHighlightMentionEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SWHighlightMentionEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SWHighlightMentionEvent allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("highlightURL")
    public native NSURL highlightURL();

    @Generated
    @Selector("init")
    public native SWHighlightMentionEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native SWHighlightMentionEvent initWithCoder(NSCoder coder);

    /**
     * Initializes a highlight mention event object when the sender mentions another participant.
     * 
     * @param highlight The object on which the event occurred.
     * @param handle    The CloudKit handle of the person being mentioned by the sender.
     */
    @Generated
    @Selector("initWithHighlight:mentionedPersonCloudKitShareHandle:")
    public native SWHighlightMentionEvent initWithHighlightMentionedPersonCloudKitShareHandle(SWHighlight highlight,
            String handle);

    /**
     * Initializes a highlight mention event object when the sender mentions another participant.
     * 
     * @param highlight The object on which the event occurred.
     * @param identity  The identity of the person being mentioned by the sender.
     */
    @Generated
    @Selector("initWithHighlight:mentionedPersonIdentity:")
    public native SWHighlightMentionEvent initWithHighlightMentionedPersonIdentity(SWHighlight highlight,
            SWPersonIdentity identity);

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
     * The person being mentioned by the sender.
     */
    @Generated
    @Selector("mentionedPersonHandle")
    public native String mentionedPersonHandle();

    @Generated
    @Owned
    @Selector("new")
    public static native SWHighlightMentionEvent new_objc();

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