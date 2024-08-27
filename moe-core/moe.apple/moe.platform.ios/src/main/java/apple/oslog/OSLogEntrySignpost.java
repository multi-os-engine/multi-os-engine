package apple.oslog;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.oslog.protocol.OSLogEntryFromProcess;
import apple.oslog.protocol.OSLogEntryWithPayload;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * OSLogEntrySignpost
 * 
 * Entries made by the os_signpost API.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OSLogEntrySignpost extends OSLogEntry implements OSLogEntryFromProcess, OSLogEntryWithPayload {
    static {
        NatJ.register();
    }

    @Generated
    protected OSLogEntrySignpost(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("activityIdentifier")
    public native long activityIdentifier();

    @Generated
    @Owned
    @Selector("alloc")
    public static native OSLogEntrySignpost alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native OSLogEntrySignpost allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("category")
    public native String category();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Selector("components")
    public native NSArray<? extends OSLogMessageComponent> components();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("formatString")
    public native String formatString();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native OSLogEntrySignpost init();

    @Generated
    @Selector("initWithCoder:")
    public native OSLogEntrySignpost initWithCoder(@NotNull NSCoder coder);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native OSLogEntrySignpost new_objc();

    @NotNull
    @Generated
    @Selector("process")
    public native String process();

    @Generated
    @Selector("processIdentifier")
    public native int processIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @NotNull
    @Generated
    @Selector("sender")
    public native String sender();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] signpostIdentifier
     * 
     * The signpost ID associated with this entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("signpostIdentifier")
    public native long signpostIdentifier();

    /**
     * [@property] signpostName
     * 
     * The signpost name associated with this entry.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("signpostName")
    public native String signpostName();

    /**
     * [@property] signpostType
     * 
     * The signpost type associated with this entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("signpostType")
    @NInt
    public native long signpostType();

    @NotNull
    @Generated
    @Selector("subsystem")
    public native String subsystem();

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
    @Selector("threadIdentifier")
    public native long threadIdentifier();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
