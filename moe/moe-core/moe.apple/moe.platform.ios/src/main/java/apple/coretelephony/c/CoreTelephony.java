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

package apple.coretelephony.c;

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
@Library("CoreTelephony")
@Runtime(CRuntime.class)
public final class CoreTelephony {
    static {
        NatJ.register();
    }

    @Generated
    private CoreTelephony() {
    }

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Replaced by <CallKit/CXCall.h> properties
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateDialing();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Replaced by <CallKit/CXCall.h> properties
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateIncoming();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Replaced by <CallKit/CXCall.h> properties
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateConnected();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Replaced by <CallKit/CXCall.h> properties
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateDisconnected();

    /**
     * CTSubscriberTokenRefreshed
     * 
     * Description:
     * The name of the NSNotification sent when the carrier token is available.
     * The `object' argument is set to the CTSubscriber instance for which the token was refreshed.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 12.1
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTSubscriberTokenRefreshed();

    /**
     * CTRadioAccessTechnologyDataTechnologyDidChangeNotification
     * 
     * Description:
     * A NSNotification broadcast when radio access technology changes
     * 
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyDidChangeNotification();

    /**
     * Radio Access Technology values
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyGPRS();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyEdge();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyWCDMA();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyHSDPA();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyHSUPA();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMA1x();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORev0();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORevA();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORevB();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyeHRPD();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyLTE();

    /**
     * CTServiceRadioAccessTechnologyDataTechnologyDidChangeNotification
     * 
     * Description:
     * A NSNotification broadcast when radio access technology changes for one of the services. Only an object is sent
     * with
     * this notfication. The object is an NSString that represents the service identifier of the service whose radio
     * access
     * technology has changed. This NSString should be used as the key in serviceCurrentRadioAccessTechnology to get the
     * value of the new radio access technology for the service.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTServiceRadioAccessTechnologyDidChangeNotification();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyNRNSA();

    /**
     * API-Since: 14.1
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyNR();
}
