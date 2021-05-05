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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEAppProxyFlowError
 * 
 * Flow error codes
 */
@Generated
public final class NEAppProxyFlowError {
    /**
     * [@const] NEAppProxyFlowErrorNotOpen The flow is not fully open.
     */
    @Generated @NInt public static final long NotConnected = 0x0000000000000001L;
    /**
     * [@const] NEAppProxyFlowErrorPeerReset The remote peer reset the flow.
     */
    @Generated @NInt public static final long PeerReset = 0x0000000000000002L;
    /**
     * [@const] NEAppProxyFlowErrorHostUnreachable The remote peer is unreachable.
     */
    @Generated @NInt public static final long HostUnreachable = 0x0000000000000003L;
    /**
     * [@const] NEAppProxyFlowErrorInvalidArgument An invalid argument was passed to one of the NEAppProxyFlow methods.
     */
    @Generated @NInt public static final long InvalidArgument = 0x0000000000000004L;
    /**
     * [@const] NEAppProxyFlowErrorAborted The flow was aborted.
     */
    @Generated @NInt public static final long Aborted = 0x0000000000000005L;
    /**
     * [@const] NEAppProxyFlowErrorRefused The flow was disallowed.
     */
    @Generated @NInt public static final long Refused = 0x0000000000000006L;
    /**
     * [@const] NEAppProxyFlowErrorTimedOut The flow timed out.
     */
    @Generated @NInt public static final long TimedOut = 0x0000000000000007L;
    /**
     * [@const] NEAppProxyFlowErrorInternal An internal error occurred.
     */
    @Generated @NInt public static final long Internal = 0x0000000000000008L;
    /**
     * [@const] NEAppProxyFlowErrorDatagramTooLarge An attempt was made to write a datagram that is larger than the socket's receive window
     */
    @Generated @NInt public static final long DatagramTooLarge = 0x0000000000000009L;
    /**
     * [@const] NEAppProxyFlowErrorReadAlreadyPending A read operation on the flow is already pending
     */
    @Generated @NInt public static final long ReadAlreadyPending = 0x000000000000000AL;

    @Generated
    private NEAppProxyFlowError() {
    }
}
