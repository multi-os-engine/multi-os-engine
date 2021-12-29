package apple.intents;

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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSetTaskAttributeTemporalEventTriggerResolutionResult extends INTemporalEventTriggerResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INSetTaskAttributeTemporalEventTriggerResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult allocWithZone(VoidPtr zone);

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
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    @Generated
    @Selector("confirmationRequiredWithTemporalEventTriggerToConfirm:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult confirmationRequiredWithTemporalEventTriggerToConfirm(
            INTemporalEventTrigger temporalEventTriggerToConfirm);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("disambiguationWithTemporalEventTriggersToDisambiguate:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult disambiguationWithTemporalEventTriggersToDisambiguate(
            NSArray<? extends INTemporalEventTrigger> temporalEventTriggersToDisambiguate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INSetTaskAttributeTemporalEventTriggerResolutionResult init();

    @Generated
    @Selector("initWithTemporalEventTriggerResolutionResult:")
    public native INSetTaskAttributeTemporalEventTriggerResolutionResult initWithTemporalEventTriggerResolutionResult(
            INTemporalEventTriggerResolutionResult temporalEventTriggerResolutionResult);

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
    @Selector("needsValue")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult new_objc();

    @Generated
    @Selector("notRequired")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult notRequired();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("successWithResolvedTemporalEventTrigger:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult successWithResolvedTemporalEventTrigger(
            INTemporalEventTrigger resolvedTemporalEventTrigger);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unsupported")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult unsupported();

    @Generated
    @Selector("unsupportedForReason:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult unsupportedForReason(@NInt long reason);

    @Generated
    @Selector("unsupportedWithReason:")
    public static native INSetTaskAttributeTemporalEventTriggerResolutionResult unsupportedWithReason(
            @NInt long reason);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
