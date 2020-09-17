package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLModelError {
    @Generated
    private MLModelError() {
    }

    @Generated @NInt public static final long Generic = 0x0000000000000000L;
    @Generated @NInt public static final long FeatureType = 0x0000000000000001L;
    @Generated @NInt public static final long IO = 0x0000000000000003L;
    @Generated @NInt public static final long CustomLayer = 0x0000000000000004L;
    @Generated @NInt public static final long CustomModel = 0x0000000000000005L;
    @Generated @NInt public static final long Update = 0x0000000000000006L;
    @Generated @NInt public static final long Parameters = 0x0000000000000007L;
    @Generated @NInt public static final long ModelDecryptionKeyFetch = 0x0000000000000008L;
    @Generated @NInt public static final long ModelDecryption = 0x0000000000000009L;
    @Generated @NInt public static final long ModelCollection = 0x000000000000000AL;
}