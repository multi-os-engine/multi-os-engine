package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIInteraction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBandSelectionInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBandSelectionInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBandSelectionInteraction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBandSelectionInteraction allocWithZone(VoidPtr zone);

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
    @Selector("didMoveToView:")
    public native void didMoveToView(UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIBandSelectionInteraction init();

    /**
     * Creates a UIBandSelectionInteraction with the given selection handler.
     * 
     * @param selectionHandler Called when the interaction's state and/or selection rect change.
     */
    @Generated
    @Selector("initWithSelectionHandler:")
    public native UIBandSelectionInteraction initWithSelectionHandler(
            @ObjCBlock(name = "call_initWithSelectionHandler") Block_initWithSelectionHandler selectionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSelectionHandler {
        @Generated
        void call_initWithSelectionHandler(UIBandSelectionInteraction interaction);
    }

    /**
     * Modifier keys held at the beginning of the interaction.
     */
    @Generated
    @Selector("initialModifierFlags")
    @NInt
    public native long initialModifierFlags();

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
     * Indicates whether the interaction is enabled. Defaults to YES.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIBandSelectionInteraction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The current selection rect. Returns CGRectNull when the interaction is inactive.
     */
    @Generated
    @Selector("selectionRect")
    @ByValue
    public native CGRect selectionRect();

    /**
     * Indicates whether the interaction is enabled. Defaults to YES.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Called when the interaction is about to begin.
     * Return a boolean indicating whether the interaction should begin at the given location.
     */
    @Generated
    @Selector("setShouldBeginHandler:")
    public native void setShouldBeginHandler(
            @ObjCBlock(name = "call_setShouldBeginHandler") Block_setShouldBeginHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setShouldBeginHandler {
        @Generated
        boolean call_setShouldBeginHandler(UIBandSelectionInteraction arg0, @ByValue CGPoint arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Called when the interaction is about to begin.
     * Return a boolean indicating whether the interaction should begin at the given location.
     */
    @Generated
    @Selector("shouldBeginHandler")
    @ObjCBlock(name = "call_shouldBeginHandler_ret")
    public native Block_shouldBeginHandler_ret shouldBeginHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shouldBeginHandler_ret {
        @Generated
        boolean call_shouldBeginHandler_ret(UIBandSelectionInteraction arg0, @ByValue CGPoint arg1);
    }

    /**
     * The interaction's current state.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(UIView view);
}
