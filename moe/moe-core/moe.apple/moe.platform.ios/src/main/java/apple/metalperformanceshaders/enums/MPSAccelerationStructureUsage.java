package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options describing how an acceleration structure will be used
 */
@Generated
public final class MPSAccelerationStructureUsage {
    @Generated
    private MPSAccelerationStructureUsage() {
    }

    /**
     * No usage options specified
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Enable support for refitting the acceleration structure after it has been built.
     * This option may reduce raytracing performance so do not use it unless the acceleration
     * structure will be refit.
     */
    @Generated @NUInt public static final long Refit = 0x0000000000000001L;
    /**
     * Option indicating that the acceleration structure will be rebuilt frequently. In this
     * case, the acceleration structure may choose a higher performance but lower quality
     * acceleration structure construction algorithm. This option may reduce raytracing performance
     * performance so do not use it unless reduced acceleration structure build time is
     * worth reduced raytracing performance. This option may be useful if, for example, the user
     * is interactively editing a live view of the scene.
     */
    @Generated @NUInt public static final long FrequentRebuild = 0x0000000000000002L;
    /**
     * Prefer building the acceleration structure on the GPU. By default, the acceleration
     * structure will be built on the GPU when possible. However, in some cases such as very small
     * triangle counts, the acceleration structure may be built on the CPU. This option will force
     * the acceleration structure to be always be built on the GPU whenever possible.
     */
    @Generated @NUInt public static final long PreferGPUBuild = 0x0000000000000004L;
    /**
     * Prefer building the acceleration structure on the CPU. By default, the acceleration
     * structure will be built on the GPU when possible, which is typically much faster than
     * building on the CPU. However, in some cases it may be preferable to build on the CPU such as
     * to avoid framerate hitches when the GPU is rendering the user interface.
     */
    @Generated @NUInt public static final long PreferCPUBuild = 0x0000000000000008L;
}