/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSKernelOptions {
    /**
     * Use default options
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Most MPS functions will sanity check their arguments. This has a small but
     * non-zero CPU cost. Setting the MPSKernelOptionsSkipAPIValidation will skip these checks.
     * MPSKernelOptionsSkipAPIValidation does not skip checks for memory allocation failure.
     * Caution:  turning on MPSKernelOptionsSkipAPIValidation can result in undefined behavior
     * if the requested operation can not be completed for some reason. Most error states
     * will be passed through to Metal which may do nothing or abort the program if Metal
     * API validation is turned on.
     */
    @Generated @NUInt public static final long SkipAPIValidation = 0x0000000000000001L;
    /**
     * When possible, MPSKernels use a higher precision data representation internally than
     * the destination storage format to avoid excessive accumulation of computational
     * rounding error in the result. MPSKernelOptionsAllowReducedPrecision advises the
     * MPSKernel that the destination storage format already has too much precision for
     * what is ultimately required downstream, and the MPSKernel may use reduced precision
     * internally when it feels that a less precise result would yield better performance.
     * The expected performance win is often small, perhaps 0-20%. When enabled, the
     * precision of the result may vary by hardware and operating system.
     */
    @Generated @NUInt public static final long AllowReducedPrecision = 0x0000000000000002L;
    /**
     * Some MPSKernels may automatically split up the work internally into multiple tiles.
     * This improves performance on larger textures and reduces the amount of memory needed by
     * MPS for temporary storage. However, if you are using your own tiling scheme to achieve
     * similar results, your tile sizes and MPS's choice of tile sizes may interfere with
     * one another causing MPS to subdivide your tiles for its own use inefficiently. Pass
     * MPSKernelOptionsDisableInternalTiling to force MPS to process your data tile as a
     * single chunk.
     */
    @Generated @NUInt public static final long DisableInternalTiling = 0x0000000000000004L;
    /**
     * Enabling this bit will cause various -encode... methods to call MTLCommandEncoder
     * push/popDebugGroup.  The debug string will be drawn from MPSKernel.label, if any
     * or the name of the class otherwise.
     */
    @Generated @NUInt public static final long InsertDebugGroups = 0x0000000000000008L;

    @Generated
    private MPSKernelOptions() {
    }

    /**
     * Some parts of MPS can provide debug commentary and tuning advice when run.
     * Setting this bit to 1 will cause the commentary to be emitted to stderr. Otherwise,
     * the code is silent.  This is especially useful for debugging MPSNNGraph. This option
     * is on by default when the MPS_LOG_INFO environment variable is defined.  For
     * even more detailed output on a MPS object, you can use the po command in llvm
     * with MPS objects:
     * @code
     *   llvm>  po  <MPS object pointer>
     * @endcode
     */
    @Generated @NUInt public static final long Verbose = 0x0000000000000010L;
}
