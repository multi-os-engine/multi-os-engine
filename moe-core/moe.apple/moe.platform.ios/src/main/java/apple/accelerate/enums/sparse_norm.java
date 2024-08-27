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
 * The norm specifier
 * [@constant] SPARSE_NORM_ONE
 * Matrix element wise: sum over i,j ( | A[i,j] | )
 * 
 * Matrix operator : max over j ( sum over i ( | A[i,j] | )
 * 
 * Vector element wise: sum over i ( | x[i] | )
 * 
 * [@constant] SPARSE_NORM_TWO
 * Matrix element wise: sqrt( sum over i,j (A[i,j])^2 )
 * 
 * Matrix operator : Largest singular value of matrix, note that the operator
 * SPARSE_NORM_TWO is significantly more expensive than other norm operations.
 * 
 * Vector element wise: sqrt( sum over i (x[i])^2 )
 * 
 * [@constant] SPARSE_NORM_INF
 * Matrix element wise: max over i,j ( | A[i,j] | )
 * 
 * Matrix operator : max over i ( sum over j ( | A[i,j] | )
 * 
 * Vector element wise: max over i ( | x[i] | )
 * 
 * [@constant] SPARSE_NORM_R1
 * Matrix element wise: sum over j ( sqrt ( sum over i ( A[i,j]^2 ) ) )
 * 
 * Matrix operator : Not supported. Undefined
 * 
 * Vector element wise: Not supported. Undefined
 */
@Generated
public final class sparse_norm {
    @Generated public static final int SPARSE_NORM_ONE = 0x000000AB;
    @Generated public static final int SPARSE_NORM_TWO = 0x000000AD;
    @Generated public static final int SPARSE_NORM_INF = 0x000000AF;
    @Generated public static final int SPARSE_NORM_R1 = 0x000000B3;

    @Generated
    private sparse_norm() {
    }
}
