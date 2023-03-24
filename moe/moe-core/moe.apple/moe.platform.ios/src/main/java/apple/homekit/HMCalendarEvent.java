package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDateComponents;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A calendar event which fires at an absolute time. It can also be used to set up a recurring events which will fire at
 * a scheduled time.
 * 
 * [@note] Not all the fields in NSDateComponents are used to calculate the next fire date. Only Month, Day & Minutes
 * are used. Other NSDateComponents such as
 * year, weekday, quarter, week of the year / month are not used in calculation for next fire date.
 * If its expected to fire on the same day, it should be at least 1 minute ahead or it could get scheduled for the next
 * recurrent day.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMCalendarEvent extends HMTimeEvent implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HMCalendarEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMCalendarEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMCalendarEvent allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The date component that specifies the time when the event is fired
     * 
     * [@note] Not all the fields in NSDateComponents are used to calculate the next fire date. Only Month, Day &
     * Minutes are used. Other NSDateComponents such as
     * year, weekday, quarter, week of the year / month are not used in calculation for next fire date.
     * If its expected to fire on the same day, it should be at least 1 minute ahead or it could get scheduled for the
     * next recurrent day.
     */
    @NotNull
    @Generated
    @Selector("fireDateComponents")
    public native NSDateComponents fireDateComponents();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HMCalendarEvent init();

    /**
     * Creates a calendar event
     * 
     * [@note] Not all the fields in NSDateComponents are used to calculate the next fire date. Only Month, Day &
     * Minutes are used. Other NSDateComponents such as
     * year, weekday, quarter, week of the year / month are not used in calculation for next fire date.
     * If its expected to fire on the same day, it should be at least 1 minute ahead or it could get scheduled for the
     * next recurrent day.
     * 
     * @param fireDateComponents The date component that specifies the time when the event is fired
     * 
     * @return Instance object representing the event trigger.
     */
    @Generated
    @Selector("initWithFireDateComponents:")
    public native HMCalendarEvent initWithFireDateComponents(@NotNull NSDateComponents fireDateComponents);

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
    @Selector("isSupportedForHome:")
    public static native boolean isSupportedForHome(@NotNull HMHome home);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native HMCalendarEvent new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
