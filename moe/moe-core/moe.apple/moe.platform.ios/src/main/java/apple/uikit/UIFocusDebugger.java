package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIFocusDebuggerOutput;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItem;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * UIFocusDebugger provides a collection of runtime utilities for debugging issues related to focus interaction.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFocusDebugger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFocusDebugger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFocusDebugger alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFocusDebugger allocWithZone(VoidPtr zone);

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

    /**
     * Outputs a diagnosis of the specified item's focusability, including any known issues that may be preventing
     * focusability.
     * - To use in Swift, enter `po UIFocusDebugger.checkFocusability(for: <item reference>)` when paused in lldb.
     * - To use in Objective-C, enter `po [UIFocusDebugger checkFocusabilityForItem:<item reference>]` when paused in
     * lldb.
     */
    @Generated
    @Selector("checkFocusabilityForItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native UIFocusDebuggerOutput checkFocusabilityForItem(
            @Mapped(ObjCObjectMapper.class) UIFocusItem item);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Outputs an overview of all supported debugging utilities and other relevant information.
     * - To use in Swift, enter `po UIFocusDebugger.help()` when paused in lldb.
     * - To use in Objective-C, enter `po [UIFocusDebugger help]` when paused in lldb.
     */
    @Generated
    @Selector("help")
    @MappedReturn(ObjCObjectMapper.class)
    public static native UIFocusDebuggerOutput help();

    @Generated
    @Selector("init")
    public native UIFocusDebugger init();

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
    public static native UIFocusDebugger new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Simulates a fake focus update requested by the specified environment (e.g. `[environment setNeedsFocusUpdate]`),
     * outlining each step of the process for determining the next focused item.
     * - To use in Swift, enter `po UIFocusDebugger.simulateFocusUpdateRequest(from: <environment reference>)` when
     * paused in lldb.
     * - To use in Objective-C, enter `po [UIFocusDebugger simulateFocusUpdateRequestFromEnvironment:<environment
     * reference>]` when paused in lldb.
     */
    @Generated
    @Selector("simulateFocusUpdateRequestFromEnvironment:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native UIFocusDebuggerOutput simulateFocusUpdateRequestFromEnvironment(
            @Mapped(ObjCObjectMapper.class) UIFocusEnvironment environment);

    /**
     * Outputs information for the currently focused item.
     * - To use in Swift, enter `po UIFocusDebugger.status()` when paused in lldb.
     * - To use in Objective-C, enter `po [UIFocusDebugger status]` when paused in lldb.
     */
    @Generated
    @Selector("status")
    @MappedReturn(ObjCObjectMapper.class)
    public static native UIFocusDebuggerOutput status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Outputs a diagnosis of the focus groups of the specified environment and its children.
     * Pass a focus system as the environment to get the full focus group tree for this focus system.
     * - To use in Swift, enter `po UIFocusDebugger.checkFocusGroupTree(for: <environment reference>)` when paused in
     * lldb.
     * - To use in Objective-C, enter `po [UIFocusDebugger checkFocusGroupTreeForEnvironment:<environment reference>]`
     * when paused in lldb.
     */
    @Generated
    @Selector("checkFocusGroupTreeForEnvironment:")
    public static native String checkFocusGroupTreeForEnvironment(
            @Mapped(ObjCObjectMapper.class) UIFocusEnvironment environment);
}
