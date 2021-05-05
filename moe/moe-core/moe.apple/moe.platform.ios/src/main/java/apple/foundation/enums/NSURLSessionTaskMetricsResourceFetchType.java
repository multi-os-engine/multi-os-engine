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
 * The resource fetch type.
 */
@Generated
public final class NSURLSessionTaskMetricsResourceFetchType {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The resource was loaded over the network.
     */
    @Generated @NInt public static final long NetworkLoad = 0x0000000000000001L;
    /**
     * The resource was pushed by the server to the client.
     */
    @Generated @NInt public static final long ServerPush = 0x0000000000000002L;
    /**
     * The resource was retrieved from the local storage.
     */
    @Generated @NInt public static final long LocalCache = 0x0000000000000003L;

    @Generated
    private NSURLSessionTaskMetricsResourceFetchType() {
    }
}
