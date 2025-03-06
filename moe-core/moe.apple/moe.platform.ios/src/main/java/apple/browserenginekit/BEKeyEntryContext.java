package apple.browserenginekit;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BEKeyEntryContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BEKeyEntryContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BEKeyEntryContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BEKeyEntryContext allocWithZone(VoidPtr zone);

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
    public native BEKeyEntryContext init();

    /**
     * Initializes an instance of BEKeyEventContext with its corresponding `keyState`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithKeyEntry:")
    public native BEKeyEntryContext initWithKeyEntry(@NotNull BEKeyEntry keyEntry);

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

    /**
     * Represents whether the web document is editable
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("isDocumentEditable")
    public native boolean isDocumentEditable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * BEKeyEntry for which this context is representing.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("keyEntry")
    @NotNull
    public native BEKeyEntry keyEntry();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native BEKeyEntryContext new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Represents whether the web document is editable
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setDocumentEditable:")
    public native void setDocumentEditable(boolean value);

    /**
     * Represents whether the key event should be evaluated within the context of a composed input mode.
     * 
     * When using an input mode with composed input, such as Chinese/Japanese/Korean, the markedText
     * will be used to combine multiple key events into a single character.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setShouldEvaluateForInputSystemHandling:")
    public native void setShouldEvaluateForInputSystemHandling(boolean value);

    /**
     * Represents whether a character should be inserted.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setShouldInsertCharacter:")
    public native void setShouldInsertCharacter(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Represents whether the key event should be evaluated within the context of a composed input mode.
     * 
     * When using an input mode with composed input, such as Chinese/Japanese/Korean, the markedText
     * will be used to combine multiple key events into a single character.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("shouldEvaluateForInputSystemHandling")
    public native boolean shouldEvaluateForInputSystemHandling();

    /**
     * Represents whether a character should be inserted.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("shouldInsertCharacter")
    public native boolean shouldInsertCharacter();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}