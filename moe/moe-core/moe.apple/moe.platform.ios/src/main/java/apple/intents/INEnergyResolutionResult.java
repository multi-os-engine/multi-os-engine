package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitEnergy;
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
public class INEnergyResolutionResult extends INIntentResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INEnergyResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INEnergyResolutionResult alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native INEnergyResolutionResult allocWithZone(VoidPtr zone);

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

    /**
     * This resolution result is to ask Siri to confirm if this is the energy with which the user wants to continue.
     */
    @Generated
    @Selector("confirmationRequiredWithEnergyToConfirm:")
    public static native INEnergyResolutionResult confirmationRequiredWithEnergyToConfirm(
            NSMeasurement<NSUnitEnergy> energyToConfirm);

    @Generated
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INEnergyResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This resolution result is to ask Siri to disambiguate between the provided energy.
     */
    @Generated
    @Selector("disambiguationWithEnergyToDisambiguate:")
    public static native INEnergyResolutionResult disambiguationWithEnergyToDisambiguate(
            NSArray<? extends NSMeasurement<NSUnitEnergy>> energyToDisambiguate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INEnergyResolutionResult init();

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
    public static native INEnergyResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INEnergyResolutionResult new_objc();

    @Generated
    @Selector("notRequired")
    public static native INEnergyResolutionResult notRequired();

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
     * This resolution result is for when the app extension wants to tell Siri to proceed, with a given energy. The resolvedEnergy can be different than the original energy. This allows app extensions to apply business logic constraints.
     * Use +notRequired to continue with a 'nil' value.
     */
    @Generated
    @Selector("successWithResolvedEnergy:")
    public static native INEnergyResolutionResult successWithResolvedEnergy(NSMeasurement<NSUnitEnergy> resolvedEnergy);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unsupported")
    public static native INEnergyResolutionResult unsupported();

    @Generated
    @Selector("unsupportedWithReason:")
    public static native INEnergyResolutionResult unsupportedWithReason(@NInt long reason);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
