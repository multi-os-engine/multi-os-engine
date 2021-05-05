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
 * [@enum] quadrature_integrator
 * 
 * Integrators
 * 
 * [@constant] QUADRATURE_INTEGRATE_QNG
 * Simple non-adaptive automatic integrator using Gauss-Kronrod-Patterson quadrature coefficients.
 * Evaluates 21, or 43, or 87 points in the interval until the requested accuracy is reached.
 * No workspace is necessary for this integrator.
 * 
 * [@constant] QUADRATURE_INTEGRATE_QAG
 * Simple globally adaptive integrator.
 * Allows selection of the number of Gauss-Kronrod points used in each subinterval, and the max number of subintervals.
 * 
 * [@constant] QUADRATURE_INTEGRATE_QAGS
 * Global adaptive quadrature based on 21-point or 15-point (if at least one bound is infinite) Gauss–Kronrod quadrature within each subinterval, with acceleration by Peter Wynn's epsilon algorithm.
 * If at least one of the interval bounds is infinite, this is equivalent to the QUADPACK QAGI routine. Otherwise, this is equivalent to the QUADPACK QAGS routine.
 */
@Generated
public final class quadrature_integrator {
    @Generated public static final int QUADRATURE_INTEGRATE_QNG = 0x00000000;
    @Generated public static final int QUADRATURE_INTEGRATE_QAG = 0x00000001;
    @Generated public static final int QUADRATURE_INTEGRATE_QAGS = 0x00000002;

    @Generated
    private quadrature_integrator() {
    }
}
