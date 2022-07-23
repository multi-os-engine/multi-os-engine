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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes the action an NSCoder should take when it encounters decode failures (e.g. corrupt data) for non-TopLevel
 * decodes.
 */
@Generated
public final class NSDecodingFailurePolicy {
    /**
     * On decode failure, the NSCoder will raise an exception internally to propagate failure messages (and unwind the
     * stack). This exception can be transformed into an NSError via any of the TopLevel decode APIs.
     */
    @Generated @NInt public static final long RaiseException = 0x0000000000000000L;
    /**
     * On decode failure, the NSCoder will capture the failure as an NSError, and prevent further decodes (by returning
     * 0 / nil equivalent as appropriate). Clients should consider using this policy if they know that all encoded
     * objects behave correctly in the presence of decode failures (e.g. they use -failWithError: to communicate decode
     * failures and don't raise exceptions for error propagation)
     */
    @Generated @NInt public static final long SetErrorAndReturn = 0x0000000000000001L;

    @Generated
    private NSDecodingFailurePolicy() {
    }
}
