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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

/**
 * vDSP_DCT_CreateSetup is a DCT setup routine. It creates a setup object
 * for use with the vDSP_DCT_Execute routine. See additional information
 * above, at "How to use the Discrete Fourier Transform (DFT) and Discrete
 * Cosine Transform (DCT) interfaces."
 * <p>
 * Parameters:
 * <p>
 * vDSP_DFT_Setup Previous
 * <p>
 * Previous is either zero or a previous DFT or DCT setup. If a
 * previous setup is passed, the new setup will share data with the
 * previous setup, if feasible (and with any other setups the
 * previous setup shares with). If zero is passed, the routine
 * will allocate and initialize new memory.
 * <p>
 * vDSP_Length Length
 * <p>
 * Length is the number of real elements to be transformed.
 * <p>
 * vDSP_DCT_Type Type
 * <p>
 * Type specifies which DCT variant to perform. At present, the
 * supported DCT types are II and III (which are mutual inverses, up
 * to scaling) and IV (which is its own inverse). These are specified
 * with symbol names vDSP_DCT_II, vDSP_DCT_III, and vDSP_DCT_IV.
 * <p>
 * Return value:
 * <p>
 * Zero is returned if memory is unavailable or if there is no
 * implementation for the requested case. Currently, the implemented
 * cases are:
 * <p>
 * Length = f * 2**n, where f is 1, 3, 5, or 15 and 4 <= n.
 * <p>
 * Function:
 * <p>
 * When vDSP_DCT_Execute is called with a setup returned from this
 * routine, it calculates:
 * <p>
 * If Type is vDSP_DCT_II:
 * <p>
 * For 0 <= k < N,
 * <p>
 * Or[k] = sum(Ir[j] * cos(k * (j+1/2) * pi / N, 0 <= j < N).
 * <p>
 * If Type is vDSP_DCT_III
 * <p>
 * For 0 <= k < N,
 * <p>
 * Or[k] = Ir[0]/2
 * + sum(Ir[j] * cos((k+1/2) * j * pi / N), 1 <= j < N).
 * <p>
 * If Type is vDSP_DCT_IV:
 * <p>
 * For 0 <= k < N,
 * <p>
 * Or[k] = sum(Ir[j] * cos((k+1/2) * (j+1/2) * pi / N, 0 <= j < N).
 * <p>
 * Where:
 * <p>
 * N is the length given in the setup,
 * <p>
 * h is the array of real numbers passed to vDSP_DCT_Execute in
 * Input, and
 * <p>
 * H is the array of real numbers stored by vDSP_DCT_Execute in
 * the array passed to it in Output.
 * <p>
 * Performance:
 * <p>
 * Performance is good when the array addresses (passed to
 * vDSP_DFT_Execute) are 16-byte aligned. Other alignments are supported,
 * but performance may be significantly worse in some cases, depending on
 * the processor model or the transform length (because different
 * algorithms are used for different forms of transform length).
 * <p>
 * In-Place Operation:
 * <p>
 * Output may equal Input (in the call the vDSP_DCT_Execute). Otherwise,
 * no overlap is permitted between the two buffers.
 * <p>
 * The returned setup object may be used only with vDSP_DCT_Execute for the
 * length given during setup.
 * <p>
 * Do not call this routine while any DFT or DCT routine sharing setup data
 * might be executing.
 */
@Generated
public final class vDSP_DCT_Type {
    @Generated public static final int II = 0x00000002;
    @Generated public static final int III = 0x00000003;
    @Generated public static final int IV = 0x00000004;

    @Generated
    private vDSP_DCT_Type() {
    }
}
