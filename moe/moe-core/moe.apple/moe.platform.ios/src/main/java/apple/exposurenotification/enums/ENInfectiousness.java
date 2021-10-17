package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ===========================================================================================================================
 * <p>
 * How infectious based on days since onset of symptoms.
 */
@Generated
public final class ENInfectiousness {
    @Generated
    private ENInfectiousness() {
    }

    @Generated public static final int None = 0x00000000;
    /**
     * Never returned through the API, but used for configuration.
     */
    @Generated public static final int Standard = 0x00000001;
    /**
     * Never returned through the API, but used for configuration.
     */
    @Generated public static final int High = 0x00000002;
}
