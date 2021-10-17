package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextDropProposal extends UIDropProposal implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextDropProposal(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextDropProposal alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UITextDropProposal allocWithZone(VoidPtr zone);

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

    /**
     * The proposed text drop action. The default value is UITextDropInsert.
     */
    @Generated
    @Selector("dropAction")
    @NUInt
    public native long dropAction();

    /**
     * Defines who will be responsible for performing the drop.
     * The performer must:
     * - load the data from the item providers
     * - insert it into the text droppable view
     * - provide a preview for the drop
     * <p>
     * The default is `UITextDropPerformerView`.
     */
    @Generated
    @Selector("dropPerformer")
    @NUInt
    public native long dropPerformer();

    /**
     * The progress mode to be used. The default value is UITextDropProgressModeSystem.
     */
    @Generated
    @Selector("dropProgressMode")
    @NUInt
    public native long dropProgressMode();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UITextDropProposal init();

    @Generated
    @Selector("initWithDropOperation:")
    public native UITextDropProposal initWithDropOperation(@NUInt long operation);

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
    public static native UITextDropProposal new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The proposed text drop action. The default value is UITextDropInsert.
     */
    @Generated
    @Selector("setDropAction:")
    public native void setDropAction(@NUInt long value);

    /**
     * Defines who will be responsible for performing the drop.
     * The performer must:
     * - load the data from the item providers
     * - insert it into the text droppable view
     * - provide a preview for the drop
     * <p>
     * The default is `UITextDropPerformerView`.
     */
    @Generated
    @Selector("setDropPerformer:")
    public native void setDropPerformer(@NUInt long value);

    /**
     * The progress mode to be used. The default value is UITextDropProgressModeSystem.
     */
    @Generated
    @Selector("setDropProgressMode:")
    public native void setDropProgressMode(@NUInt long value);

    /**
     * Specifies whether the drop is allowed to use "fast" inline operations
     * for drags between the same view. This will not use the data in the
     * items, but instead moves or copies text from the original positions
     * to the dropped position.
     * Defaults to YES.
     */
    @Generated
    @Selector("setUseFastSameViewOperations:")
    public native void setUseFastSameViewOperations(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Specifies whether the drop is allowed to use "fast" inline operations
     * for drags between the same view. This will not use the data in the
     * items, but instead moves or copies text from the original positions
     * to the dropped position.
     * Defaults to YES.
     */
    @Generated
    @Selector("useFastSameViewOperations")
    public native boolean useFastSameViewOperations();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
