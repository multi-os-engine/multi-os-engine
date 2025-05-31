package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A representation of a sports team for the now playing screen,
 * in sports that have exactly two teams.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNowPlayingSportsTeam extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNowPlayingSportsTeam(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNowPlayingSportsTeam alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPNowPlayingSportsTeam allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The numeric score string for this team in the current event. Depending on the size
     * of the car screen, a maximum of 3 to 5 characters may be displayed.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("eventScore")
    @NotNull
    public native String eventScore();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPNowPlayingSportsTeam init();

    @Generated
    @Selector("initWithCoder:")
    public native CPNowPlayingSportsTeam initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize a sports team for display on the now playing screen.
     * 
     * @param name                A localized, user-visible name for this sports team.
     * @param logo                The team logo or, if no logo is available, the initials/abbreviation for this team.
     * @param teamStandings       An optional additional label displayed near the team name. This could be a
     *                            win-loss ratio string, team standings, or other statistics relevant to this team.
     *                            Depending on the size of the car screen, a maximum of 15-20 characters may
     *                            be displayed.
     * @param eventScore          The score string for this team in the current event. Depending on the size
     *                            of the car screen, a maximum of 3 to 5 characters may be displayed.
     * @param possessionIndicator An optional indicator used to indicate possession by this team.
     *                            Only one team should have possession at a given time.
     * @param favorite            If true, the team is marked with a star to indicate it has been saved as a
     *                            user favorite.
     * 
     *                            API-Since: 18.4
     */
    @Generated
    @Selector("initWithName:logo:teamStandings:eventScore:possessionIndicator:favorite:")
    public native CPNowPlayingSportsTeam initWithNameLogoTeamStandingsEventScorePossessionIndicatorFavorite(
            @NotNull String name, @NotNull CPNowPlayingSportsTeamLogo logo, @Nullable String teamStandings,
            @NotNull String eventScore, @Nullable UIImage possessionIndicator, boolean favorite);

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
     * If true, the team is marked with a star to indicate it has been saved as a
     * user favorite.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isFavorite")
    public native boolean isFavorite();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The team logo or, if no logo is available, the initials/abbreviation for this team.
     * See @c CPNowPlayingSportsTeamLogo.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("logo")
    @NotNull
    public native CPNowPlayingSportsTeamLogo logo();

    /**
     * A localized, user-visible name for this sports team.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native CPNowPlayingSportsTeam new_objc();

    /**
     * An optional indicator used to indicate possession by this team.
     * Only one team should have possession at a given time.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("possessionIndicator")
    @Nullable
    public native UIImage possessionIndicator();

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

    /**
     * An optional additional label displayed near the team name. This could be a
     * win-loss ratio string, team standings, or other statistics relevant to this team.
     * Depending on the size of the car screen, a maximum of 15-20 characters may
     * be displayed.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("teamStandings")
    @Nullable
    public native String teamStandings();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}