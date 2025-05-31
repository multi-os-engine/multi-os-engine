package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A base class that represents a message in a conversation.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIConversationEntry extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIConversationEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIConversationEntry alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIConversationEntry allocWithZone(VoidPtr zone);

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
     * A string that uniquely identifies this specific entry in the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("entryIdentifier")
    @NotNull
    public native String entryIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIConversationEntry init();

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
    public static native UIConversationEntry new_objc();

    /**
     * A set of strings that identifies the primary recipients of the message.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("primaryRecipientIdentifiers")
    @NotNull
    public native NSSet<String> primaryRecipientIdentifiers();

    /**
     * An optional string that identifies another message in a conversation, when this entry is a reply to that message.
     * 
     * When an entry is a reply to another conversation entry, this contains the identifier of the conversation entry
     * that the person replied to.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("replyThreadIdentifier")
    @Nullable
    public native String replyThreadIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A string that identifies the message’s sender.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("senderIdentifier")
    @NotNull
    public native String senderIdentifier();

    /**
     * A date that notes when the sender added the message to the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("sentDate")
    @NotNull
    public native NSDate sentDate();

    /**
     * A string that uniquely identifies this specific entry in the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setEntryIdentifier:")
    public native void setEntryIdentifier(@NotNull String value);

    /**
     * A set of strings that identifies the primary recipients of the message.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setPrimaryRecipientIdentifiers:")
    public native void setPrimaryRecipientIdentifiers(@NotNull NSSet<String> value);

    /**
     * An optional string that identifies another message in a conversation, when this entry is a reply to that message.
     * 
     * When an entry is a reply to another conversation entry, this contains the identifier of the conversation entry
     * that the person replied to.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setReplyThreadIdentifier:")
    public native void setReplyThreadIdentifier(@Nullable String value);

    /**
     * A string that identifies the message’s sender.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSenderIdentifier:")
    public native void setSenderIdentifier(@NotNull String value);

    /**
     * A date that notes when the sender added the message to the conversation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSentDate:")
    public native void setSentDate(@NotNull NSDate value);

    /**
     * A string that contains the message’s text.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setText:")
    public native void setText(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A string that contains the message’s text.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("text")
    @NotNull
    public native String text();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}