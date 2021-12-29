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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CFNetServicesError
 * <p>
 * Discussion:
 * Errors from the kCFStreamErrorDomainNetServices domain.
 */
@Generated
public final class CFNetServicesError {
    /**
     * An error of unknown type has occurred.
     */
    @Generated public static final int Unknown = 0xFFFEE6C0;
    /**
     * The given registration has had a name collision.  Registration
     * should be cancelled and should try again probably with a different
     * name.
     */
    @Generated public static final int Collision = 0xFFFEE6BF;
    /**
     * Not used
     */
    @Generated public static final int NotFound = 0xFFFEE6BE;
    /**
     * There is already a register, resolve, browse, or monitor in
     * progress on the given object.
     */
    @Generated public static final int InProgress = 0xFFFEE6BD;
    /**
     * Not used
     */
    @Generated public static final int BadArgument = 0xFFFEE6BC;
    /**
     * The register, resolve, or browse on the object has been cancelled.
     */
    @Generated public static final int Cancel = 0xFFFEE6BB;
    /**
     * The given CFNetServiceBrowser or CFNetServiceMonitor has already
     * been invalidated and can no longer be used.
     */
    @Generated public static final int Invalid = 0xFFFEE6BA;
    /**
     * The given CFNetServiceResolveWithTimeout has hit the timeout
     * before a successful resolve.
     */
    @Generated public static final int Timeout = 0xFFFEE6B9;

    @Generated
    private CFNetServicesError() {
    }

    /**
     * Missing required configuration for local network access.
     */
    @Generated public static final int MissingRequiredConfiguration = 0xFFFEE6B8;
}
