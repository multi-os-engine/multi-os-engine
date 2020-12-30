package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSPersistentCloudKitContainerSchemaInitializationOptions {
    @Generated
    private NSPersistentCloudKitContainerSchemaInitializationOptions() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Validate the model, and generate the records, but don't actually upload them to
     * CloudKit. This option is useful for unit testing to ensure your managed object model
     * is valid for use with CloudKit.
     */
    @Generated @NUInt public static final long DryRun = 0x0000000000000002L;
    /**
     * Causes the generated records to be logged to console.
     */
    @Generated @NUInt public static final long PrintSchema = 0x0000000000000004L;
}