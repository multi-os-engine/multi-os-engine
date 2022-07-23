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

@Generated
public final class NSURLSessionTaskState {
    /**
     * The task is currently being serviced by the session
     */
    @Generated @NInt public static final long Running = 0x0000000000000000L;
    @Generated @NInt public static final long Suspended = 0x0000000000000001L;
    /**
     * The task has been told to cancel. The session will receive a URLSession:task:didCompleteWithError: message.
     */
    @Generated @NInt public static final long Canceling = 0x0000000000000002L;
    /**
     * The task has completed and the session will receive no more delegate notifications
     */
    @Generated @NInt public static final long Completed = 0x0000000000000003L;

    @Generated
    private NSURLSessionTaskState() {
    }
}
