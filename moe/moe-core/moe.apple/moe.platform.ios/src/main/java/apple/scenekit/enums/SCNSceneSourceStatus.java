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

package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SCNSceneSourceStatus
 * 
 * Represents a phase of the loading process.
 * 
 * Each of these constants (except SCNSceneSourceStatusError) represents a phase of the loading process. "Parsing" means that the document is being deserialized, "validating" that it's being checked for consistency, "processing" that the resulting object is being loaded. New values might be added to this enumeration to make it more detailed; however the values will always be ordered in the same order as the corresponding phases are executed.
 */
@Generated
public final class SCNSceneSourceStatus {
    @Generated @NInt public static final long Error = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Parsing = 0x0000000000000004L;
    @Generated @NInt public static final long Validating = 0x0000000000000008L;
    @Generated @NInt public static final long Processing = 0x000000000000000CL;
    @Generated @NInt public static final long Complete = 0x0000000000000010L;

    @Generated
    private SCNSceneSourceStatus() {
    }
}
