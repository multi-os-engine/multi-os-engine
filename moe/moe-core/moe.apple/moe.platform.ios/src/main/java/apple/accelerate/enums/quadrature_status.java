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

@Generated
public final class quadrature_status {
    @Generated public static final int QUADRATURE_SUCCESS = 0x00000000;
    @Generated public static final int QUADRATURE_ERROR = 0xFFFFFFFF;
    @Generated public static final int QUADRATURE_INVALID_ARG_ERROR = 0xFFFFFFFE;
    @Generated public static final int QUADRATURE_ALLOC_ERROR = 0xFFFFFFFD;
    @Generated public static final int QUADRATURE_INTERNAL_ERROR = 0xFFFFFF9D;
    @Generated public static final int QUADRATURE_INTEGRATE_MAX_EVAL_ERROR = 0xFFFFFF9B;
    @Generated public static final int QUADRATURE_INTEGRATE_BAD_BEHAVIOUR_ERROR = 0xFFFFFF9A;

    @Generated
    private quadrature_status() {
    }
}
