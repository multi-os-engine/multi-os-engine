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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The following API is deprecated starting in 10.5; please use CFRead/WriteStreamCopyError(), above, instead
 */
@Generated
public final class CFStreamErrorDomain {
    /**
     * custom to the kind of stream in question
     */
    @Generated @NInt public static final long Custom = 0xFFFFFFFFFFFFFFFFL;
    /**
     * POSIX errno; interpret using <sys/errno.h>
     */
    @Generated @NInt public static final long POSIX = 0x0000000000000001L;
    /**
     * OSStatus type from Carbon APIs; interpret using <MacTypes.h>
     */
    @Generated @NInt public static final long MacOSStatus = 0x0000000000000002L;

    @Generated
    private CFStreamErrorDomain() {
    }
}
