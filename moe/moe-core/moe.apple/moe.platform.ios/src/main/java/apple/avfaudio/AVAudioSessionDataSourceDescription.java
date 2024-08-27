package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * Information about one of potentially multiple data sources associated with a port.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSessionDataSourceDescription extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSessionDataSourceDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSessionDataSourceDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioSessionDataSourceDescription allocWithZone(VoidPtr zone);

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

    /**
     * System-assigned ID for the data source.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("dataSourceID")
    public native NSNumber dataSourceID();

    /**
     * Human-readable name for the data source.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("dataSourceName")
    public native String dataSourceName();

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
    public native AVAudioSessionDataSourceDescription init();

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

    /**
     * Describes the general location of a data source. Will be nil for data sources for which the
     * location is not known.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("location")
    public native String location();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioSessionDataSourceDescription new_objc();

    /**
     * Describes the orientation of a data source. Will be nil for data sources for which the
     * orientation is not known.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("orientation")
    public native String orientation();

    /**
     * Describes the preferred polar pattern. Will be nil for data sources that have no selectable
     * patterns or if no preference has been set.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("preferredPolarPattern")
    public native String preferredPolarPattern();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Describes the currently selected polar pattern. Will be nil for data sources that have no
     * selectable patterns.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("selectedPolarPattern")
    public native String selectedPolarPattern();

    /**
     * Select the desired polar pattern from the set of available patterns. Setting a nil value
     * will clear the preference.
     * 
     * [@note] If the owning port and data source are part of the active audio route, changing the polar
     * pattern will likely result in a route reconfiguration. If the owning port and data source are
     * not part of the active route, selecting a polar pattern will not result in an immediate route
     * reconfiguration. Use AVAudioSession's setPreferredInput:error: method to activate the port. Use
     * setPreferredDataSource:error: to active the data source on the port.
     * You must call setPreferredInputOrientation:error: on the AVAudioSession if you chose the
     * AVAudioSessionPolarPatternStereo polar pattern.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPreferredPolarPattern:error:")
    public native boolean setPreferredPolarPatternError(@Nullable String pattern,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Array of one or more AVAudioSessionPolarPatterns describing the supported polar patterns for a
     * data source. Will be nil for data sources that have no selectable patterns.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("supportedPolarPatterns")
    public native NSArray<String> supportedPolarPatterns();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
