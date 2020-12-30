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

package apple.networkextension.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("NetworkExtension")
@Runtime(CRuntime.class)
public final class NetworkExtension {
    static {
        NatJ.register();
    }

    @Generated
    private NetworkExtension() {
    }

    /**
     * @const NEAppProxyErrorDomain The NEAppProxyFlow error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEAppProxyErrorDomain();

    /**
     * @const NETunnelProviderErrorDomain The tunnel provider error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NETunnelProviderErrorDomain();

    /**
     * @const NEVPNErrorDomain The VPN error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEVPNErrorDomain();

    /**
     * @const NEVPNConfigurationChangeNotification Name of the NSNotification that is posted when the VPN configuration changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEVPNConfigurationChangeNotification();

    /**
     * Key for RemediationURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEFilterProviderRemediationMapRemediationURLs();

    /**
     * Key for Remediation button text
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEFilterProviderRemediationMapRemediationButtonTexts();

    /**
     * @const NEFilterErrorDomain The filter error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEFilterErrorDomain();

    /**
     * @const NEFilterConfigurationDidChangeNotification Name of the NSNotification that is posted when the filter configuration changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEFilterConfigurationDidChangeNotification();

    /**
     * @const kNEHotspotHelperOptionDisplayName
     * @abstract
     *   The string displayed in Wi-Fi Settings for a network handled by
     *   the application.
     * @discussion
     *   This key specifies the display name for the application, if an alternate
     *   name is desired.  If this property is not specified, the application's
     *   name is used.
     * 
     *   This name appears in Settings -> Wi-Fi underneath the Wi-Fi network
     *   name if the helper indicated that it was able to handle the network.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kNEHotspotHelperOptionDisplayName();

    /**
     * @const NEVPNStatusDidChangeNotification Name of the NSNotification that is posted when the VPN status changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEVPNStatusDidChangeNotification();

    /**
     * @const NEVPNConnectionStartOptionUsername Specify this key in the options dictionary passed to startVPNTunnelWithOptions:returningError: to override the username saved in the configuration. The value is a string
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEVPNConnectionStartOptionUsername();

    /**
     * @const NEVPNConnectionStartOptionPassword Specify this key in the options dictionary passed to startVPNTunnelWithOptions:returningError: to override the password saved in the configuration. The value is a string
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEVPNConnectionStartOptionPassword();

    /**
     * @const NEDNSProxyManagerErrorDomain The DNS proxy error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEDNSProxyErrorDomain();

    /**
     * @const NEDNSProxyConfigurationDidChangeNotification Name of the NSNotification that is posted when the DNS proxy configuration changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEDNSProxyConfigurationDidChangeNotification();

    /**
     * @const NEHotspotConfigurationErrorDomain The Hotspot Configuration error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEHotspotConfigurationErrorDomain();

    /**
     * @const NEDNSSettingsManagerErrorDomain The DNS settings error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEDNSSettingsErrorDomain();

    /**
     * @const NEDNSSettingsConfigurationDidChangeNotification Name of the NSNotification that is posted when the DNS settings configuration changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEDNSSettingsConfigurationDidChangeNotification();

    /**
     * @const NEAppPushErrorDomain The app push manager error domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NEAppPushErrorDomain();
}
