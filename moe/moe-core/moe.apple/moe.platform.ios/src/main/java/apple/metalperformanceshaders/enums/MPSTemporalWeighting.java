package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Controls how samples are weighted over time
 */
@Generated
public final class MPSTemporalWeighting {
    @Generated
    private MPSTemporalWeighting() {
    }

    /**
     * Compute an average of all samples. This will fully utilize all samples but may lead
     * to excessive ghosting artifacts under motion. Therefore, this is best for static images.
     */
    @Generated @NUInt public static final long Average = 0x0000000000000000L;
    /**
     * Compute an exponential moving average by blending linearly between the previous
     * accumulated samples and the current sample according to the temporalReprojectionBlendFactor
     * property. This will cause older samples to lose their contribution over time, which will
     * prevent ghosting artifacts but will also never converge to a stable value. Therefore, this
     * is best for images with motion.
     */
    @Generated @NUInt public static final long ExponentialMovingAverage = 0x0000000000000001L;
}