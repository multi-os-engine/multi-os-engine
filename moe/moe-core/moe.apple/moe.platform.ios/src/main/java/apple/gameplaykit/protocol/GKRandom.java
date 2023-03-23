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

package apple.gameplaykit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol for random sources that can generate random numbers. This is the minimal interface needed
 * to consume random values from a source; concrete subclasses should be used for configuring the
 * production of random values.
 * The availability of deterministic random sources is critical to creating reliable gameplay mechanics.
 * Ensure that systems that should not influence each other have unique random sources and avoid sharing
 * sources unless absolutely needed.
 * 
 * This protocol allows you to provide custom random sources from classes that are not able to
 * derive from GKRandomSource directly.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKRandom")
public interface GKRandom {
    /**
     * Returns the next true or false value in the random sequence and moves ahead to the next one.
     * The value is either nonzero (true) or zero (false).
     * Use this for simple boolean switches in logic that don't require fuzzy evaluation.
     * For fuzzy evaluation use nextUniform.
     * 
     * By default this should be based on nextIntWithUpperBound:. Implementations may base it on
     * another representation if needed.
     * 
     * @see nextIntWithUpperBound:
     * @see nextUniform
     */
    @Generated
    @Selector("nextBool")
    boolean nextBool();

    /**
     * Returns the next integer in the random sequence and moves ahead to the next one.
     * The value is in the range of [INT32_MIN, INT32_MAX].
     * The lower bits are not guaranteed to be random so please use another
     * property for simple choices.
     * 
     * @see nextBool
     * @see nextUniform
     */
    @Generated
    @Selector("nextInt")
    @NInt
    long nextInt();

    /**
     * Returns the next unsigned value in the random sequence that is less than upperBound.
     * The value is in the range of [0, upperBound). Thus the value never equals or exceeeds upperBound.
     * The unsigned nature and upper bound allows implementations to use logical shifts to return a
     * value whose lower bits are more random than a similar call to nextInt.
     * 
     * This is used to implement nextBool and nextUniform by default.
     */
    @Generated
    @Selector("nextIntWithUpperBound:")
    @NUInt
    long nextIntWithUpperBound(@NUInt long upperBound);

    /**
     * Returns the next uniform float in the random sequence and moves ahead to the next one.
     * The value is in the range of [0.0, 1.0].
     * There is no weighting across the range so remapping this with a curve may give the best
     * sampling distribution for your algorithm.
     * 
     * By default this should be based on nextIntWithUpperBound:. Implementions may base it on
     * another representation if needed.
     * 
     * @see nextIntWithUpperBound:
     * @see nextInt
     */
    @Generated
    @Selector("nextUniform")
    float nextUniform();
}
