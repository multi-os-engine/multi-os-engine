package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Lets you access shortcuts that have been added to Siri
 * 
 * @see INVoiceShortcut
 * 
 *      API-Since: 12.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INVoiceShortcutCenter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected INVoiceShortcutCenter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INVoiceShortcutCenter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INVoiceShortcutCenter allocWithZone(VoidPtr zone);

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
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Get all of the shortcuts associated with this app that have been added to Siri.
     * These could have either been added with `INUIAddVoiceShortcutViewController`, or separately by the user in the
     * Shortcuts app.
     */
    @Generated
    @Selector("getAllVoiceShortcutsWithCompletion:")
    public native void getAllVoiceShortcutsWithCompletion(
            @NotNull @ObjCBlock(name = "call_getAllVoiceShortcutsWithCompletion") Block_getAllVoiceShortcutsWithCompletion completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAllVoiceShortcutsWithCompletion {
        @Generated
        void call_getAllVoiceShortcutsWithCompletion(@Nullable NSArray<? extends INVoiceShortcut> voiceShortcuts,
                @Nullable NSError error);
    }

    /**
     * Get a single shortcut (associated with this app) that has been added to Siri, by its identifier.
     */
    @Generated
    @Selector("getVoiceShortcutWithIdentifier:completion:")
    public native void getVoiceShortcutWithIdentifierCompletion(@NotNull NSUUID identifier,
            @NotNull @ObjCBlock(name = "call_getVoiceShortcutWithIdentifierCompletion") Block_getVoiceShortcutWithIdentifierCompletion completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getVoiceShortcutWithIdentifierCompletion {
        @Generated
        void call_getVoiceShortcutWithIdentifierCompletion(@Nullable INVoiceShortcut voiceShortcut,
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INVoiceShortcutCenter init();

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
    public static native INVoiceShortcutCenter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set some shortcuts that should be suggested to the user to add to Siri.
     * 
     * These suggestions are shown to the user in the Shortcuts app.
     */
    @Generated
    @Selector("setShortcutSuggestions:")
    public native void setShortcutSuggestions(@NotNull NSArray<? extends INShortcut> suggestions);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("sharedCenter")
    public static native INVoiceShortcutCenter sharedCenter();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
