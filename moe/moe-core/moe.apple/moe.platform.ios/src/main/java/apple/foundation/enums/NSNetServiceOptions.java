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
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSNetServiceOptions {
    /**
     * When passed to -publishWithOptions:, this suppresses the auto-renaming of an
     * NSNetService in the event of a name collision. The collision is reported to the
     * instance's delegate on the -netService:didNotPublish: method.
     */
    @Generated @NUInt public static final long NoAutoRename = 0x0000000000000001L;
    /**
     * When passed to -publishWithOptions:, in addition to publishing the service, a
     * TCP listener is started for both IPv4 and IPv6 on the port specified by the
     * NSNetService. If the listening port can't be opened, an error is reported using
     * -netService:didNotPublish:. Specify a port number of zero to use a random port.
     * When -netServiceDidPublish: is called, -port will return the actual listening
     * port number. Since the listener only supports TCP, the publish will fail with
     * NSNetServicesBadArgumentError if the NSNetService type does not end with "_tcp".
     * New incoming connections will be delivered in the form of NSStreams via the
     * -netService:didAcceptConnectionWithInputStream:outputStream: delegate method.
     */
    @Generated @NUInt public static final long ListenForConnections = 0x0000000000000002L;

    @Generated
    private NSNetServiceOptions() {
    }
}
