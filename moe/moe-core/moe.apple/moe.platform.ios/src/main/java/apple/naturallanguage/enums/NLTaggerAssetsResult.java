package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * If a given tag scheme is not available for a particular language on the current device, it may be because necessary assets have not been loaded onto this device. In those cases, clients may put in a request for those assets. If they are available for loading, then they will be requested and at some point will be loaded and made available on the device, and the completion handler will be called on an arbitrary queue. The completion handler may be called immediately if the state of the assets is already known or if an error occurs.
 */
@Generated
public final class NLTaggerAssetsResult {
    @Generated
    private NLTaggerAssetsResult() {
    }

    @Generated @NInt public static final long Available = 0x0000000000000000L;
    @Generated @NInt public static final long NotAvailable = 0x0000000000000001L;
    @Generated @NInt public static final long Error = 0x0000000000000002L;
}