package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSTextElement is an abstract base class for representing the smallest text layout unit typically paragraphs, tables,
 * or attachments. A text element is associated with an NSTextContentManager.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextElement extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextElement alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextElement allocWithZone(VoidPtr zone);

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
     * Represents the range of the element inside the document.
     */
    @Nullable
    @Generated
    @Selector("elementRange")
    public native NSTextRange elementRange();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextElement init();

    @Generated
    @Selector("initWithTextContentManager:")
    public native NSTextElement initWithTextContentManager(@Nullable NSTextContentManager textContentManager);

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
    public static native NSTextElement new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Represents the range of the element inside the document.
     */
    @Generated
    @Selector("setElementRange:")
    public native void setElementRange(@Nullable NSTextRange value);

    /**
     * Returns the owner NSTextContentManager. A text element can migrate between text content managers.
     */
    @Generated
    @Selector("setTextContentManager:")
    public native void setTextContentManager_unsafe(@Nullable NSTextContentManager value);

    /**
     * Returns the owner NSTextContentManager. A text element can migrate between text content managers.
     */
    @Generated
    public void setTextContentManager(@Nullable NSTextContentManager value) {
        Object __old = textContentManager();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextContentManager_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the owner NSTextContentManager. A text element can migrate between text content managers.
     */
    @Nullable
    @Generated
    @Selector("textContentManager")
    public native NSTextContentManager textContentManager();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A concrete NSTextElement subclass can be structured in a tree. An element can have zero or more child elements.
     * This section provides interface for supporting such a configuration.
     * Returns an array of children. The array can contain zero or more elements.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("childElements")
    public native NSArray<? extends NSTextElement> childElements();

    /**
     * Returns YES if it is an element represented in text layout. It is enumerated by NSTextContentManager.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isRepresentedElement")
    public native boolean isRepresentedElement();

    /**
     * Returns the parent element if the receiver is a child.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("parentElement")
    public native NSTextElement parentElement();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
