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

package apple.systemconfiguration.c;

import apple.NSObject;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.struct.sockaddr;
import apple.systemconfiguration.opaque.SCNetworkReachabilityRef;
import apple.systemconfiguration.struct.SCNetworkReachabilityContext;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("SystemConfiguration")
@Runtime(CRuntime.class)
public final class SystemConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    private SystemConfiguration() {
    }

    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithAddress(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr address);

    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithAddressPair(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr localAddress,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr remoteAddress);

    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithName(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String nodename);

    @Generated
    @CFunction
    @NUInt
    public static native long SCNetworkReachabilityGetTypeID();

    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityGetFlags(SCNetworkReachabilityRef target, IntPtr flags);

    @Generated
    @CFunction
    public static native byte SCNetworkReachabilitySetCallback(SCNetworkReachabilityRef target,
            @FunctionPtr(name = "call_SCNetworkReachabilitySetCallback") Function_SCNetworkReachabilitySetCallback callout,
            @UncertainArgument("Options: reference, array Fallback: reference") SCNetworkReachabilityContext context);

    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityScheduleWithRunLoop(SCNetworkReachabilityRef target,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityUnscheduleFromRunLoop(SCNetworkReachabilityRef target,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native byte SCNetworkReachabilitySetDispatchQueue(SCNetworkReachabilityRef target, NSObject queue);

    @Generated
    @CFunction
    public static native CFErrorRef SCCopyLastError();

    @Generated
    @CFunction
    public static native int SCError();

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String SCErrorString(int status);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CNSetSupportedSSIDs(CFArrayRef ssidArray);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CNMarkPortalOnline(CFStringRef interfaceName);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CNMarkPortalOffline(CFStringRef interfaceName);

    @Generated
    @CFunction
    public static native CFArrayRef CNCopySupportedInterfaces();

    @Generated
    @CFunction
    public static native CFDictionaryRef CNCopyCurrentNetworkInfo(CFStringRef interfaceName);

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainSystemConfiguration();

    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeySSIDData();

    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeySSID();

    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeyBSSID();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SCNetworkReachabilitySetCallback {
        @Generated
        void call_SCNetworkReachabilitySetCallback(SCNetworkReachabilityRef arg0, int arg1, VoidPtr arg2);
    }
}
