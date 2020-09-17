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

    @Generated public static final double CPNavigationAlertMinimumDuration = 5.0;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CPTemplateApplicationSceneSessionRoleApplication();

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

    @Generated
    @CVariable()
    @NUInt
    public static native long CPMaximumNumberOfGridImages();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPMaximumMessageItemImageSize();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CPNowPlayingButtonMaximumImageSize();
}