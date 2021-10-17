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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateDialing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateIncoming();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateConnected();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTCallStateDisconnected();

    /**
     * CTSubscriberTokenRefreshed
     * <p>
     * Description:
     * The name of the NSNotification sent when the carrier token is available.
     * The `object' argument is set to the CTSubscriber instance for which the token was refreshed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTSubscriberTokenRefreshed();

    /**
     * CTRadioAccessTechnologyDataTechnologyDidChangeNotification
     * <p>
     * Description:
     * A NSNotification broadcast when radio access technology changes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyDidChangeNotification();

    /**
     * Radio Access Technology values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyGPRS();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyEdge();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyWCDMA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyHSDPA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyHSUPA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMA1x();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORev0();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORevA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyCDMAEVDORevB();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyeHRPD();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyLTE();

    /**
     * CTServiceRadioAccessTechnologyDataTechnologyDidChangeNotification
     * <p>
     * Description:
     * A NSNotification broadcast when radio access technology changes for one of the services.  Only an object is sent with
     * this notfication.  The object is an NSString that represents the service identifier of the service whose radio access
     * technology has changed.  This NSString should be used as the key in serviceCurrentRadioAccessTechnology to get the
     * value of the new radio access technology for the service.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTServiceRadioAccessTechnologyDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyNRNSA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CTRadioAccessTechnologyNR();
}
