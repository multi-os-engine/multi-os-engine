package apple.automaticassessmentconfiguration.protocol;

import apple.automaticassessmentconfiguration.AEAssessmentSession;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import apple.automaticassessmentconfiguration.AEAssessmentConfiguration;

/**
 * API-Since: 13.4
 */
@Generated
@Library("AutomaticAssessmentConfiguration")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AEAssessmentSessionDelegate")
public interface AEAssessmentSessionDelegate {
    /**
     * API-Since: 13.4
     */
    @Generated
    @IsOptional
    @Selector("assessmentSession:failedToBeginWithError:")
    default void assessmentSessionFailedToBeginWithError(@NotNull AEAssessmentSession session, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.4
     */
    @Generated
    @IsOptional
    @Selector("assessmentSession:wasInterruptedWithError:")
    default void assessmentSessionWasInterruptedWithError(@NotNull AEAssessmentSession session,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.4
     */
    @Generated
    @IsOptional
    @Selector("assessmentSessionDidBegin:")
    default void assessmentSessionDidBegin(@NotNull AEAssessmentSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.4
     */
    @Generated
    @IsOptional
    @Selector("assessmentSessionDidEnd:")
    default void assessmentSessionDidEnd(@NotNull AEAssessmentSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 17.5
     */
    @Generated
    @IsOptional
    @Selector("assessmentSession:failedToUpdateToConfiguration:error:")
    default void assessmentSessionFailedToUpdateToConfigurationError(@NotNull AEAssessmentSession session,
            @NotNull AEAssessmentConfiguration configuration, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 17.5
     */
    @Generated
    @IsOptional
    @Selector("assessmentSessionDidUpdate:")
    default void assessmentSessionDidUpdate(@NotNull AEAssessmentSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
