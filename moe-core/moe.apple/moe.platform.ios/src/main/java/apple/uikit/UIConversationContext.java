package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPersonNameComponents;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A base class that represents a conversation between participants, such as in an email or messaging app.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIConversationContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIConversationContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIConversationContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIConversationContext allocWithZone(VoidPtr zone);

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
     * Array of messages in the conversation
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("entries")
    @NotNull
    public native NSArray<? extends UIConversationEntry> entries();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIConversationContext init();

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
    public static native UIConversationContext new_objc();

    /**
     * Map of participant identifiers to participant names
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("participantNameByIdentifier")
    @NotNull
    public native NSDictionary<String, ? extends NSPersonNameComponents> participantNameByIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A dictionary that relates participant identifiers to participant names.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("responsePrimaryRecipientIdentifiers")
    @NotNull
    public native NSSet<String> responsePrimaryRecipientIdentifiers();

    /**
     * A set of strings that identifies the active person in the conversation on the current device.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("selfIdentifiers")
    @NotNull
    public native NSSet<String> selfIdentifiers();

    /**
     * Array of messages in the conversation
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setEntries:")
    public native void setEntries(@NotNull NSArray<? extends UIConversationEntry> value);

    /**
     * Map of participant identifiers to participant names
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setParticipantNameByIdentifier:")
    public native void setParticipantNameByIdentifier(
            @NotNull NSDictionary<String, ? extends NSPersonNameComponents> value);

    /**
     * A dictionary that relates participant identifiers to participant names.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setResponsePrimaryRecipientIdentifiers:")
    public native void setResponsePrimaryRecipientIdentifiers(@NotNull NSSet<String> value);

    /**
     * A set of strings that identifies the active person in the conversation on the current device.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSelfIdentifiers:")
    public native void setSelfIdentifiers(@NotNull NSSet<String> value);

    /**
     * A string that uniquely identifies a conversation.
     * This identifier is persistent for the life of the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setThreadIdentifier:")
    public native void setThreadIdentifier(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A string that uniquely identifies a conversation.
     * This identifier is persistent for the life of the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("threadIdentifier")
    @NotNull
    public native String threadIdentifier();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}