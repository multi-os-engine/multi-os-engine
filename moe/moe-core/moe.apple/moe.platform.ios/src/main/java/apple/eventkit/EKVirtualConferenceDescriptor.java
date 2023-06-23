package apple.eventkit;

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
 * EKVirtualConferenceDescriptor
 * 
 * Describes a virtual conference.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKVirtualConferenceDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EKVirtualConferenceDescriptor(Pointer peer) {
        super(peer);
    }

    @NotNull
    @Generated
    @Selector("URLDescriptors")
    public native NSArray<? extends EKVirtualConferenceURLDescriptor> URLDescriptors();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKVirtualConferenceDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKVirtualConferenceDescriptor allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("conferenceDetails")
    public native String conferenceDetails();

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
    public native EKVirtualConferenceDescriptor init();

    /**
     * initWithTitle:URLDescriptors:conferenceDetails:
     * 
     * Initializes an instance of EKVirtualConferenceDescriptor.
     * 
     * @param title             A user-readable title describing this virtual conference. This string
     *                          may be displayed in the UI. This string is optional and may be left nil.
     * @param URLDescriptors    An array of EKVirtualConferenceURLDescriptors, representing the various
     *                          ways to join your virtual conference. Do not pass an empty array. Your
     *                          array should be ordered such that the most preferred method of joining
     *                          the virtual conference comes first in the array, with subsequent methods
     *                          of joining appearing in descending priority.
     * @param conferenceDetails A user-readable string containing any other information you wish to
     *                          communicate to the user about this virtual conference. This string will
     *                          be displayed in the UI. This argument is optional and may be left nil.
     */
    @Generated
    @Selector("initWithTitle:URLDescriptors:conferenceDetails:")
    public native EKVirtualConferenceDescriptor initWithTitleURLDescriptorsConferenceDetails(@Nullable String title,
            @NotNull NSArray<? extends EKVirtualConferenceURLDescriptor> URLDescriptors,
            @Nullable String conferenceDetails);

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
    public static native EKVirtualConferenceDescriptor new_objc();

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

    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
