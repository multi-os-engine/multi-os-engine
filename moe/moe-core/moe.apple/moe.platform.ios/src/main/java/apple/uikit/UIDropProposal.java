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
public class UIDropProposal extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDropProposal(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDropProposal alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDropProposal allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIDropProposal init();

    @Generated
    @Selector("initWithDropOperation:")
    public native UIDropProposal initWithDropOperation(@NUInt long operation);

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
     * Set `precise` to true to specify that this drop interaction wants to handle the drop
     * in a precise way, e.g. dropping into text. The drag system may move the drag point
     * away from the touch in order to make it easier to hit a small target.
     */
    @Generated
    @Selector("isPrecise")
    public native boolean isPrecise();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIDropProposal new_objc();

    /**
     * The operation that this interaction proposes to perform.
     */
    @Generated
    @Selector("operation")
    @NUInt
    public native long operation();

    /**
     * Signals that this drop interaction wants the preview to be shown
     * at its full original size, not scaled smaller, while this proposal is in effect.
     * For instance, you might set this to true if the items are being moved from some
     * other nearby view, and scaling them smaller would be distracting.
     * This only applies to drags that started in the same app.
     */
    @Generated
    @Selector("prefersFullSizePreview")
    public native boolean prefersFullSizePreview();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set `precise` to true to specify that this drop interaction wants to handle the drop
     * in a precise way, e.g. dropping into text. The drag system may move the drag point
     * away from the touch in order to make it easier to hit a small target.
     */
    @Generated
    @Selector("setPrecise:")
    public native void setPrecise(boolean value);

    /**
     * Signals that this drop interaction wants the preview to be shown
     * at its full original size, not scaled smaller, while this proposal is in effect.
     * For instance, you might set this to true if the items are being moved from some
     * other nearby view, and scaling them smaller would be distracting.
     * This only applies to drags that started in the same app.
     */
    @Generated
    @Selector("setPrefersFullSizePreview:")
    public native void setPrefersFullSizePreview(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
