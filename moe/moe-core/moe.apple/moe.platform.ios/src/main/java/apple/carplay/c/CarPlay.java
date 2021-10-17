package apple.carplay.c;

import apple.coregraphics.struct.CGSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CarPlay")
@Runtime(CRuntime.class)
public final class CarPlay {
    static {
        NatJ.register();
    }

    @Generated
    private CarPlay() {
    }

    /**
     * Your @c CPNavigationAlert may specify a duration for which the alert will be visible onscreen,
     * or 0 for an alert that is visible indefinitely.
     * <p>
     * For non-indefinite alerts, this is the minimum duration the alert will be visible.
     */
    @Generated public static final double CPNavigationAlertMinimumDuration = 5.0;

    /**
     * A session role which defines a typical interactive application on the car display
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CPTemplateApplicationSceneSessionRoleApplication();

    /**
     * A session role which defines a typical interactive application in the CarPlay dashboard
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CPTemplateApplicationDashboardSceneSessionRoleApplication();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPButtonMaximumImageSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CarPlayErrorDomain();

    /**
     * The maximum number of images allowed in a @c CPListImageRowItem.
     * The system may display fewer than this number of images, depending on the available width of the car screen.
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long CPMaximumNumberOfGridImages();

    /**
     * Maximum size of an image or accessory image in a @c CPMessageListItem.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPMaximumMessageItemImageSize();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPNowPlayingButtonMaximumImageSize();

    @Generated
    @CVariable()
    @NUInt
    public static native long CPGridTemplateMaximumItems();

    /**
     * The expected maximum size of an image size for your @c CPListSection.
     * <p>
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPMaximumListSectionImageSize();
}
