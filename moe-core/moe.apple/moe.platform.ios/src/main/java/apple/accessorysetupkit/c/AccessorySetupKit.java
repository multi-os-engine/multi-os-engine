package apple.accessorysetupkit.c;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AccessorySetupKit")
@Runtime(CRuntime.class)
public final class AccessorySetupKit {
    static {
        NatJ.register();
    }

    @Generated
    private AccessorySetupKit() {
    }

    /**
     * NSError domain for AccessorySetupKit errors.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String ASErrorDomain();

    /**
     * A picker discovery timeout value that times out after about about 60 seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @CVariable()
    public static native double ASPickerDisplaySettingsDiscoveryTimeoutShort();

    /**
     * A picker discovery timeout value that times out after about two minutes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @CVariable()
    public static native double ASPickerDisplaySettingsDiscoveryTimeoutMedium();

    /**
     * A picker discovery timeout value that times out after about five minutes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @CVariable()
    public static native double ASPickerDisplaySettingsDiscoveryTimeoutLong();

    /**
     * A picker discovery that only times out when the app tells it to.
     * 
     * Use this timeout value if you set the picker display option
     * ``ASPickerDisplaySettings/Options/filterDiscoveryResults`` and need unlimited time for filtering.
     * After performing manual discovery, perform the manual timeout by calling the ``ASAccessorySession`` method
     * ``ASAccessorySession/finishPickerDiscovery(completionHandler:)``.
     * This process shows a timeout message if your filtering added no accessories to the picker, or returns silently if
     * you updated the picker.
     * 
     * API-Since: 26.1
     */
    @Generated
    @CVariable()
    public static native double ASPickerDisplaySettingsDiscoveryTimeoutUnbounded();
}