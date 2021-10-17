package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPVoiceControlTemplate extends CPTemplate {
    static {
        NatJ.register();
    }

    @Generated
    protected CPVoiceControlTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Switch the voice control template to the state corresponding with a particular identifier.
     * <p>
     * [@note] The Voice Control template applies a rate-limit for voice control states; the template will
     * ignore voice control state changes that occur too rapidly or frequently in a short period of time.
     * <p>
     * [@warning] You must first present this voice control template through your @c CPInterfaceController before
     * activating a voice control state, otherwise this method will have no effect.
     * When the Voice Control template is first presented, the first state you specify in
     * [@c] initWithVoiceControlStates: will be visible.
     *
     * @param identifier An identifier corresponding to one of the voice control states used to initialize this template.
     */
    @Generated
    @Selector("activateVoiceControlStateWithIdentifier:")
    public native void activateVoiceControlStateWithIdentifier(String identifier);

    /**
     * The currently-active voice control state identifier.
     */
    @Generated
    @Selector("activeStateIdentifier")
    public native String activeStateIdentifier();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPVoiceControlTemplate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPVoiceControlTemplate allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPVoiceControlTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPVoiceControlTemplate initWithCoder(NSCoder coder);

    /**
     * Initialize a voice control template with a list of voice control states.
     * <p>
     * [@note] By default, the Voice Control template will begin on the first state specified.
     * <p>
     * [@warning] You may specify a maximum of 5 voice control states. If you specify more than 5, only the first 5 will be available.
     *
     * @param voiceControlStates An array of voice control states for this template. Your app can switch between these states after the template is presented.
     */
    @Generated
    @Selector("initWithVoiceControlStates:")
    public native CPVoiceControlTemplate initWithVoiceControlStates(
            NSArray<? extends CPVoiceControlState> voiceControlStates);

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
    public static native CPVoiceControlTemplate new_objc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("voiceControlStates")
    public native NSArray<? extends CPVoiceControlState> voiceControlStates();
}
