package apple.backgroundassets.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The content request type used in the BADownloaderExtension.
 * [@constant] BAContentRequestInstall Content is being requested because the application was installed.
 * [@constant] BAContentRequestUpdate Content is being requested because the application was updated.
 * [@constant] BAContentRequestPeriodic Content is being requested because the system is asking for updated content for
 * your application.
 */
@Generated
public final class BAContentRequest {
    @Generated
    private BAContentRequest() {
    }

    @Generated @NInt public static final long Install = 0x0000000000000001L;
    @Generated @NInt public static final long Update = 0x0000000000000002L;
    @Generated @NInt public static final long Periodic = 0x0000000000000003L;
}