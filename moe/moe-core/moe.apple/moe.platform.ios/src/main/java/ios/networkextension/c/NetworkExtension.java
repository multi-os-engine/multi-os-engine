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

package ios.networkextension.c;


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

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEVPNErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEVPNConfigurationChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEVPNStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEAppProxyErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NETunnelProviderErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEFilterProviderRemediationMapRemediationURLs();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEFilterProviderRemediationMapRemediationButtonTexts();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEFilterErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEFilterConfigurationDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kNEHotspotHelperOptionDisplayName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEVPNConnectionStartOptionUsername();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NEVPNConnectionStartOptionPassword();
}
