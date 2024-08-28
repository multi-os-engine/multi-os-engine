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

package apple.videosubscriberaccount.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("VideoSubscriberAccount")
@Runtime(CRuntime.class)
public final class VideoSubscriberAccount {
    static {
        NatJ.register();
    }

    @Generated
    private VideoSubscriberAccount() {
    }

    /**
     * The domain of all errors returned by VideoSubscriberAccount framework.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSErrorDomain();

    /**
     * A key that can be used to obtain the subscription provider's SAML response string from an error user info
     * dictionary.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSErrorInfoKeySAMLResponse();

    /**
     * A key that can be used to obtain the subscription provider's SAML status code string from an error user info
     * dictionary.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSErrorInfoKeySAMLResponseStatus();

    /**
     * A key that can be used to obtain the account provider's response object from an error user info dictionary.
     * 
     * API-Since: 10.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSErrorInfoKeyAccountProviderResponse();

    /**
     * A key that can be used to obtain the identifier string of the user's unsupported subscription provider from an
     * error user info dictionary.
     * 
     * API-Since: 10.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSErrorInfoKeyUnsupportedProviderIdentifier();

    /**
     * A boolean indicating whether the user may be prompted to grant access.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSCheckAccessOptionPrompt();

    /**
     * The authentication scheme for responses that use the SAML protocol.
     * 
     * API-Since: 10.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSAccountProviderAuthenticationSchemeSAML();

    /**
     * The URL string used to deep link to the system TV Provider settings.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSOpenTVProviderSettingsURLString();

    /**
     * The identifier for responses that use any authentication protocol.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VSAccountProviderAuthenticationSchemeAPI();
}
