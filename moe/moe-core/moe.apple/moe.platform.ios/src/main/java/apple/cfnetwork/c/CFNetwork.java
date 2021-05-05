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

package apple.cfnetwork.c;

import apple.cfnetwork.opaque.CFHTTPAuthenticationRef;
import apple.cfnetwork.opaque.CFHTTPMessageRef;
import apple.cfnetwork.opaque.CFHostRef;
import apple.cfnetwork.opaque.CFNetDiagnosticRef;
import apple.cfnetwork.opaque.CFNetServiceBrowserRef;
import apple.cfnetwork.opaque.CFNetServiceMonitorRef;
import apple.cfnetwork.opaque.CFNetServiceRef;
import apple.cfnetwork.struct.CFHostClientContext;
import apple.cfnetwork.struct.CFNetServiceClientContext;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFReadStreamRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFRunLoopSourceRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.corefoundation.opaque.CFWriteStreamRef;
import apple.corefoundation.struct.CFStreamClientContext;
import apple.corefoundation.struct.CFStreamError;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("CFNetwork")
@Runtime(CRuntime.class)
public final class CFNetwork {
    static {
        NatJ.register();
    }

    @Generated
    private CFNetwork() {
    }

    /**
     *  CFHostGetTypeID()
     * 
     *  Discussion:
     * Returns the type identifier of all CFHost instances.
     * 
     *  Mac OS X threading:
     * Thread safe
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFHostGetTypeID();

    /**
     *  CFHostCreateWithName()
     * 
     *  Discussion:
     * Creates a new host object with the given name.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * allocator:
     *   The CFAllocator which should be used to allocate memory for the
     *   host. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * hostname:
     *   A CFStringRef representing the name of the host. Must be
     *   non-NULL.  If this reference is not a valid CFStringRef, the
     *   behavior is undefined.
     * 
     *  Result:
     * A valid CFHostRef which may now be resolved, or NULL if
     * unsuccessful.
     */
    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateWithName(CFAllocatorRef allocator, CFStringRef hostname);

    /**
     *  CFHostCreateWithAddress()
     * 
     *  Discussion:
     * Creates a new host object with the given address.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * allocator:
     *   The CFAllocator which should be used to allocate memory for the
     *   host. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * addr:
     *   A CFDataRef containing a struct sockaddr which is the address
     *   of the host. Must be non-NULL.  If this reference is not a
     *   valid CFDataRef, the behavior is undefined.
     * 
     *  Result:
     * A valid CFHostRef which may now be resolved, or NULL if
     * unsuccessful.
     */
    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateWithAddress(CFAllocatorRef allocator, CFDataRef addr);

    /**
     *  CFHostCreateCopy()
     * 
     *  Discussion:
     * Creates a new host object as a copy of host argument.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   new host. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * host:
     *   A CFHostRef representing the original host. Must be non-NULL.
     *   If this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     *  Result:
     * A valid CFHostRef which contains a copy of all previously
     * resolved data from the original.  NULL is returned in the case of
     * failure.
     */
    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateCopy(CFAllocatorRef alloc, CFHostRef host);

    /**
     *  CFHostStartInfoResolution()
     * 
     *  Discussion:
     * Performs a lookup for the given host.  It will search for the
     * requested information if there is no other active request.
     * Previously cached information of the given type will be released.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which should be resolved. Must be non-NULL. If
     *   this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     * info:
     *   The enum representing the type of information to be retrieved.
     *   If the value is not a valid type, the behavior is undefined.
     * 
     * error:
     *   A reference to a CFStreamError structure which will be filled
     *   with any error information should an error occur.  May be set
     *   to NULL if error information is not wanted.
     * 
     *  Result:
     * Returns TRUE on success and FALSE on failure.  In asynchronous
     * mode, this function will return immediately.  In synchronous
     * mode, it will block until the resolve has completed or until the
     * resolve is cancelled.
     */
    @Generated
    @CFunction
    public static native byte CFHostStartInfoResolution(CFHostRef theHost, int info,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFHostGetAddressing()
     * 
     *  Discussion:
     * Tries to retrieve the known addresses from the given host.
     * Returns a CFArrayRef of addresses if known and there were some.
     * NULL is returned otherwise.  Each address is a CFDataRef wrapping
     * a struct sockaddr.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the host is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which contains the relevant information. Must be
     *   non-NULL. If this reference is not a valid CFHostRef, the
     *   behavior is undefined.
     * 
     * hasBeenResolved:
     *   A reference to a Boolean which returns FALSE if the information
     *   was not available (e.g. CFHostStartInfoResolution has not been
     *   called), otherwise TRUE will be returned.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFHostGetAddressing(CFHostRef theHost, BytePtr hasBeenResolved);

    /**
     *  CFHostGetNames()
     * 
     *  Discussion:
     * Tries to retrieve the names/aliases from the given host. Returns
     * a CFArrayRef of names for the given host.  NULL is returned
     * otherwise.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the host is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which contains the relevant information. Must be
     *   non-NULL. If this reference is not a valid CFHostRef, the
     *   behavior is undefined.
     * 
     * hasBeenResolved:
     *   A reference to a Boolean which returns FALSE if the information
     *   was not available (e.g. CFHostStartInfoResolution has not been
     *   called), otherwise TRUE will be returned. Can be NULL.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFHostGetNames(CFHostRef theHost, BytePtr hasBeenResolved);

    /**
     *  CFHostGetReachability()
     * 
     *  Discussion:
     * Tries to retrieve the reachability of the given host. Returns a
     * CFDataRef which wraps the reachability flags. NULL will be
     * returned if the value has not been resolved. The possible values
     * of these flags is declared in SystemConfiguration/SCNetwork.h.
     * Returns FALSE if the information was not available, otherwise
     * TRUE will be returned with the results containing the requested
     * information.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the host is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which contains the relevant information. Must be
     *   non-NULL. If this reference is not a valid CFHostRef, the
     *   behavior is undefined.
     * 
     * hasBeenResolved:
     *   A reference to a Boolean which returns FALSE if the information
     *   was not available (e.g. CFHostStartInfoResolution has not been
     *   called), otherwise TRUE will be returned. Can be NULL.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFHostGetReachability(CFHostRef theHost, BytePtr hasBeenResolved);

    /**
     *  CFHostCancelInfoResolution()
     * 
     *  Discussion:
     * Cancels an outstanding asynchronous or synchronous resolve.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which is currently resolving.  Must be non-NULL.
     *   If this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     * info:
     *   The enum representing which resolution to be canceled.  If the
     *   value is not a valid type, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFHostCancelInfoResolution(CFHostRef theHost, int info);

    /**
     *  CFHostSetClient()
     * 
     *  Discussion:
     * Associates a client context and callback function with a CFHostRef.
     * This is required for asynchronous usage.  If not set, resolve will
     * take place synchronously.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which is getting a client.  Must be non-NULL. If
     *   this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     * clientCB:
     *   A CFHostClientCallBack which will be called when the resolve
     *   completes or is cancelled.  Use NULL to remove the client
     *   association with a host object.
     * 
     * clientContext:
     *   A CFHostClientContext which is used to set the contextual
     *   information associated with the host object.  The info pointer
     *   from the struct will be passed to the callback function. If
     *   setting a client, this value must be non-NULL.
     * 
     *  Result:
     * Returns TRUE if the procedure was a success, otherwise it returns
     * FALSE.
     */
    @Generated
    @CFunction
    public static native byte CFHostSetClient(CFHostRef theHost,
            @FunctionPtr(name = "call_CFHostSetClient") Function_CFHostSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFHostClientContext clientContext);

    /**
     *  CFHostScheduleWithRunLoop()
     * 
     *  Discussion:
     * Schedules the given host on a run loop and mode so the client
     * will receive its callbacks on that loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which is being scheduled.  Must be non-NULL. If
     *   this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     * runLoop:
     *   A CFRunLoopRef on which the host should be scheduled. Must be
     *   non-NULL.  If this reference is not a valid CFRunLoopRef, the
     *   behavior is undefined.
     * 
     * runLoopMode:
     *   A CFStringRef which is the mode in which the run loop will be
     *   running when notification occurs.  Must be non-NULL. If this
     *   reference is not a valid CFStringRef, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFHostScheduleWithRunLoop(CFHostRef theHost, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     *  CFHostUnscheduleFromRunLoop()
     * 
     *  Discussion:
     * Unschedules the given host from a run loop and mode so the client
     * will not receive its callbacks on that loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theHost:
     *   The CFHostRef which is being unscheduled.  Must be non-NULL. If
     *   this reference is not a valid CFHostRef, the behavior is
     *   undefined.
     * 
     * runLoop:
     *   A CFRunLoopRef on which the host is scheduled and should now be
     *   unscheduled.  Must be non-NULL.  If this reference is not a
     *   valid CFRunLoopRef, the behavior is undefined.
     * 
     * runLoopMode:
     *   A CFStringRef which is the mode in which the host is scheduled
     *   and should be unscheduled.  Must be non-NULL. If this reference
     *   is not a valid CFStringRef, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFHostUnscheduleFromRunLoop(CFHostRef theHost, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     *  CFNetServiceGetTypeID()
     * 
     *  Discussion:
     * Returns the type identifier of all CFNetService instances.
     * 
     *  Mac OS X threading:
     * Thread safe
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceGetTypeID();

    /**
     *  CFNetServiceMonitorGetTypeID()
     * 
     *  Discussion:
     * Returns the type identifier of all CFNetServiceMonitor instances.
     * 
     *  Mac OS X threading:
     * Thread safe
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceMonitorGetTypeID();

    /**
     *  CFNetServiceBrowserGetTypeID()
     * 
     *  Discussion:
     * Returns the type identifier of all CFNetServiceBrowser instances.
     * 
     *  Mac OS X threading:
     * Thread safe
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceBrowserGetTypeID();

    /**
     *  CFNetServiceCreate()
     * 
     *  Discussion:
     * Creates an instance of a Network Service.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   service and its storage for values. If this reference is not a
     *   valid CFAllocator, the behavior is undefined.
     * 
     * domain:
     *   The network domain in which it is registered or will be
     *   registered. This value must be non-NULL.
     * 
     * serviceType:
     *   The type of service being registered or resolved on the
     *   network. The service type consists of the application protocol
     *   name followed by the transport protocol name, separated by a
     *   dot (e.g. "_ftp._tcp").  The application protocol name should
     *   be 14 characters or less, and should only contain lower-case
     *   letters, digits, and hyphens.  New service types should be
     *   registered at <htp://www.dns-sd.org/ServiceTypes.html>.  This
     *   value must be non-NULL.
     * 
     * name:
     *   The name of the machine or application advertising the service.
     *    If this value is not unique, registering will eventually fail.
     *    This value must be non-NULL.  This value is usually displayed
     *   in a browser for the user.
     * 
     * port:
     *   The port on which the service is listening.  This must be
     *   non-zero for services which are to be registered.
     * 
     *  Result:
     * A valid CFNetService which may now be registered or resolved, or
     * NULL if unsuccessful.
     */
    @Generated
    @CFunction
    public static native CFNetServiceRef CFNetServiceCreate(CFAllocatorRef alloc, CFStringRef domain,
            CFStringRef serviceType, CFStringRef name, int port);

    /**
     *  CFNetServiceCreateCopy()
     * 
     *  Discussion:
     * Creates a new CFNetService object as a copy of service argument.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   new service. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * service:
     *   A CFNetServiceRef representing the original service. Must be
     *   non-NULL.  If this If this reference is not a valid
     *   CFNetServiceRef, the behavior is undefined.
     * 
     *  Result:
     * Returns a valid CFNetServiceRef which contains a copy of all
     * previously resolved data from the original.  NULL is returned in
     * the case of failure.
     */
    @Generated
    @CFunction
    public static native CFNetServiceRef CFNetServiceCreateCopy(CFAllocatorRef alloc, CFNetServiceRef service);

    /**
     *  CFNetServiceGetDomain()
     * 
     *  Discussion:
     * Query a Network Service for its domain.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * CFStringRef which is the service's domain.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetDomain(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetType()
     * 
     *  Discussion:
     * Query a Network Service for its type.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * CFStringRef which is the service's service type.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetType(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetName()
     * 
     *  Discussion:
     * Query a Network Service for its name.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * CFStringRef which is the service's name.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetName(CFNetServiceRef theService);

    /**
     *  CFNetServiceRegisterWithOptions()
     * 
     *  Discussion:
     * Registers the entity on the network.  This requires that the
     * service has a domain, a type, a name, and a port.  The service is
     * registered on the network until this function returns or is
     * cancelled by calling CFNetServiceCancel.  In synchronous mode,
     * this function will block until there is an error or it is
     * cancelled from another thread.  In asynchronous mode, this
     * function returns immediately and the underlying network
     * registration process will start.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to register on the network.  Must be
     *   non-NULL.
     * 
     * options:
     *   A set of bit options used to instruct the registration process.
     *   Current supported option is kCFNetServiceFlagNoAutoRename.
     * 
     * error:
     *   A reference to an error struct which will be set to the error
     *   and domain of the error should one occur.  If the value of
     *   error is not desired, set to NULL.
     * 
     *  Result:
     * Returns FALSE if domain, type, name or port is NULL.  In
     * synchronous mode, it will always return FALSE as a result of the
     * error or the cancellation.  In asynchronous mode, it will return
     * TRUE if the registration process could start.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceRegisterWithOptions(CFNetServiceRef theService, @NUInt long options,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceResolveWithTimeout()
     * 
     *  Discussion:
     * Resolves the information related to this service.  It will
     * resolve the target host, the addresses, and the first TXT record
     * associated with the service.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The CFNetServiceRef which should be resolved. Must be non-NULL.
     *   If this reference is not a valid CFNetServiceRef, the behavior
     *   is undefined.
     * 
     * timeout:
     *   CFTimeInterval representing the maximum amount of time to take
     *   to perform the resolve.  If the resolve can not be performed
     *   within this timeout, the function or callback will recieve a
     *   timeout error.  Values less than or equal to zero indicate an
     *   infinite timeout.
     * 
     * error:
     *   A reference to a CFStreamError structure which will be filled
     *   with any error information should an error occur.  May be set
     *   to NULL if error information is not wanted.
     * 
     *  Result:
     * Returns TRUE on success and FALSE on failure.  In asynchronous
     * mode, this function will return immediately.  In synchronous
     * mode, it will block until the resolve has completed or until the
     * resolve is cancelled.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceResolveWithTimeout(CFNetServiceRef theService, double timeout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceCancel()
     * 
     *  Discussion:
     * Cancels an outstanding request for registration or resolution.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service which is active.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceCancel(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetTargetHost()
     * 
     *  Discussion:
     * Query a Network Service for its resolve target.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * Returns The target hostname of the machine providing the service,
     * or NULL if the entity's target is not known (has not been
     * resolved).
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetTargetHost(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetPortNumber()
     * 
     *  Discussion:
     * Query a Network Service for its port number.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * Returns a SInt32 containing the port number in host byte order.
     * Returns -1 if the entity's port is not known (has not been
     * resolved)
     */
    @Generated
    @CFunction
    public static native int CFNetServiceGetPortNumber(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetAddressing()
     * 
     *  Discussion:
     * Query a Network Service for its addressing.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * Returns NULL if the entity's addressing is not known (has not
     * been resolved).  The array will contain a CFDataRef for each
     * address resolved.  Each CFDataRef contains a struct sockaddr
     * representing the address of the service.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFNetServiceGetAddressing(CFNetServiceRef theService);

    /**
     *  CFNetServiceGetTXTData()
     * 
     *  Discussion:
     * Query a Network Service for its TXT record contents.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The function gets the data in a thread-safe manner, but the
     * resulting data is not safe.  Since it is returned as a matter of
     * a get opposed to a copy, the data is not safe if the service is
     * being altered from another thread.
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to be queried.  Must be non-NULL.
     * 
     *  Result:
     * Returns NULL if the entity's TXT is not known (has not been
     * resolved).  The result will contain the contents of the TXT
     * record.  This is suitable to pass to
     * CFNetServiceCreateDictionaryWithTXTData.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFNetServiceGetTXTData(CFNetServiceRef theService);

    /**
     *  CFNetServiceSetTXTData()
     * 
     *  Discussion:
     * Sets the TXT record for the service.  If the service is currently
     * registered on the network, the record will be broadcast.  Setting
     * the TXT record on a resolving service is not allowed.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The Network Service to receive the new record.  Must be
     *   non-NULL.
     * 
     * txtRecord:
     *   The contents of the TXT record.  This should not exceed a
     *   length of 1450 bytes.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceSetTXTData(CFNetServiceRef theService, CFDataRef txtRecord);

    /**
     *  CFNetServiceCreateDictionaryWithTXTData()
     * 
     *  Discussion:
     * Parses the given TXT record data into a set of key/value pairs as
     * a CFDictionary where keys are CFStringRefs and values are
     * CFDataRefs.  If the given record can not be parsed, NULL will be
     * returned.  READ THE COMMENTS FOR
     * CFNetServiceCreateTXTDataWithDictionary TO FULLY UNDERSTAND THE
     * USE AND RESULTS OF THIS FUNCTION.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   CFAllocatorRef to be used for the creation of the result.
     * 
     * txtRecord:
     *   The TXT record data as returned by CFNetServiceGetInfo.
     * 
     *  Result:
     * CFDictionaryRef containing the key/value pairs parsed from the
     * record. It will return NULL if the record could not be parsed.
     * Keys in the dictionary are CFStringRef's.  Values are CFDataRef's.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFNetServiceCreateDictionaryWithTXTData(CFAllocatorRef alloc,
            CFDataRef txtRecord);

    /**
     *  CFNetServiceCreateTXTDataWithDictionary()
     * 
     *  Discussion:
     * Flattens a set of key/value pairs into a CFDataRef suitable to
     * pass into CFNetServiceSetTXTData.  This function will properly
     * format the data for TXT record usage.  THIS IS NOT A GENERAL
     * CFDictionaryRef FLATTENING ROUTINE.  CFDictionaryRef keys should
     * be CFStringRef's and values should be CFDataRef's.  For
     * convenience, values that are CFStringRef's will be converted to
     * CFDataRef's representing the flattened UTF-8 bytes of the string.
     *  The types of the values are not encoded in the CFDataRef's,
     * therefore CFStringRef's will be flattened into CFDataRef's, and
     * they will come out of CFNetServiceCreateDictionaryWithTXTData as
     * CFDataRef's.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   CFAllocatorRef to be used for the creation of the result.
     * 
     * keyValuePairs:
     *   CFDictionaryRef containing keys and values to be placed into
     *   the TXT record.  The keys must be CFStringRef's.  The values
     *   should be CFDataRef's (CFStringRef's are permitted for
     *   convenience).  Any other types will cause a failure.  The
     *   length of a key and its value should not exceed 255.
     * 
     *  Result:
     * CFDataRef containing the flattened form of the keys and values.
     * If the dictionary could not be flattend, NULL will be returned.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFNetServiceCreateTXTDataWithDictionary(CFAllocatorRef alloc,
            CFDictionaryRef keyValuePairs);

    /**
     *  CFNetServiceSetClient()
     * 
     *  Discussion:
     * Sets up the service to be used in asynchronous mode.
     * Notification of registration failure or resolution completion
     * will occur through the given callback.  Once the client is set,
     * the service must be scheduled on a runloop. The client callback
     * will be triggered via one of the scheduled run loops; It is the
     * caller's responsibility to ensure that at least one of the
     * scheduled run loops is being run.  This call must be performed
     * before calling CFNetServiceRegister or CFNetServiceResolve,
     * otherwise it will return FALSE.  TRUE will be returned if the
     * client could be set.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The service to set up for asynchronous mode.  Must be non-NULL.
     * 
     * clientCB:
     *   Function pointer will be called upon registration failure or
     *   upon resolution completion.  In the case of resolution, this
     *   callback may be called multiple times if there is more than one
     *   address for a service.  Passing NULL will remove the client
     *   from the entity and cancel any outstanding activity.
     * 
     * clientContext:
     *   Client contextual information to be used when calling clientCB.
     *   Passing NULL will remove the client from the entity and cancel
     *   any outstanding activity.
     * 
     *  Result:
     * Returns FALSE if the client could not be set, TRUE otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceSetClient(CFNetServiceRef theService,
            @FunctionPtr(name = "call_CFNetServiceSetClient") Function_CFNetServiceSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    /**
     *  CFNetServiceScheduleWithRunLoop()
     * 
     *  Discussion:
     * Schedule the given service on the given run loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The service which is set up for asynchronous mode. Must be
     *   non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop on which the service should be
     *   scheduled. Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode on which to schedule the service.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceScheduleWithRunLoop(CFNetServiceRef theService, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     *  CFNetServiceUnscheduleFromRunLoop()
     * 
     *  Discussion:
     * Unschedule the given service from the given run loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * theService:
     *   The service which is set up for asynchronous mode.  Must be
     *   non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop from which the service should be
     *   unscheduled.  Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode from which to unschedule the service.  Must be
     *   non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceUnscheduleFromRunLoop(CFNetServiceRef theService, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     *  CFNetServiceMonitorCreate()
     * 
     *  Discussion:
     * Creates an instance of an object suitable for watching for
     * CFNetService record changes on the network.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   monitor and its storage for values. If this reference is not a
     *   valid CFAllocator, the behavior is undefined.
     * 
     * theService:
     *   The CFNetService to be monitored for record changes.
     * 
     * clientCB:
     *   Function pointer that will be called as record changes occur.
     *   Must be non-NULL.
     * 
     * clientContext:
     *   Client contextual information to be used when calling clientCB.
     *    Must be non-NULL.
     * 
     *  Result:
     * Returns a new instance of a CFNetServiceMonitor, or NULL if the
     * object could not be created.
     */
    @Generated
    @CFunction
    public static native CFNetServiceMonitorRef CFNetServiceMonitorCreate(CFAllocatorRef alloc,
            CFNetServiceRef theService,
            @FunctionPtr(name = "call_CFNetServiceMonitorCreate") Function_CFNetServiceMonitorCreate clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    /**
     *  CFNetServiceMonitorInvalidate()
     * 
     *  Discussion:
     * Invalidates the given monitor object so that it may no longer be
     * scheduled and callback never be called.  This will also stop any
     * monitors currently in progress.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * monitor:
     *   CFNetServiceMonitor to invalidate.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceMonitorInvalidate(CFNetServiceMonitorRef monitor);

    /**
     *  CFNetServiceMonitorStart()
     * 
     *  Discussion:
     * Starts monitoring for record changes on a service.  It watches
     * for changes of the given record type.  If there is already an
     * outstanding monitor, it will return FALSE.  In synchronous mode,
     * this call blocks until the monitor is stopped. It will return
     * FALSE if there is an error performing the monitor or if there is
     * some other error.  It will return TRUE otherwise.  In
     * asynchronous mode, this call will return TRUE or FALSE depending
     * if the underlying network query could be instantiated.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * monitor:
     *   CFNetServiceMonitor to perform the watch.
     * 
     * recordType:
     *   CFNetServiceMonitorType indicating the record type to watch.
     * 
     * error:
     *   A reference to an error struct which will be set to the error
     *   and domain of the error should one occur.  If the value of
     *   error is not desired, set to NULL.
     * 
     *  Result:
     * Returns FALSE if an error occurs during a synchronous monitor or
     * if the monitor could not start.  It returns TRUE otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceMonitorStart(CFNetServiceMonitorRef monitor, int recordType,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceMonitorStop()
     * 
     *  Discussion:
     * Stops an outstanding monitor.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * monitor:
     *   CFNetServiceMonitor with an active monitor.  Must be non-NULL.
     * 
     * error:
     *   Error value to be returned in "error" in
     *   CFNetServiceMonitorStart if monitor is being performed in
     *   synchronous mode.  In this case, a non-zero of the error field
     *   of the struct will cause CFNetServiceMonitorStart to return
     *   FALSE.  In asynchronous mode, the client call back will be
     *   called with this error. Can be NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceMonitorStop(CFNetServiceMonitorRef monitor,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceMonitorScheduleWithRunLoop()
     * 
     *  Discussion:
     * Schedules the monitor on a run loop and mode.  Use this to place
     * the given monitor into asynchronous mode.  The client callback
     * will be triggered via one of the scheduled run loops; It is the
     * caller's responsibility to ensure that at least one of the
     * scheduled run loops is being run.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * monitor:
     *   CFNetServiceMonitor to schedule.  Must be non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop on which the monitor should be
     *   scheduled.  Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode on which to schedule the monitor.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceMonitorScheduleWithRunLoop(CFNetServiceMonitorRef monitor,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    /**
     *  CFNetServiceMonitorUnscheduleFromRunLoop()
     * 
     *  Discussion:
     * Unschedules the browser from a run loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * monitor:
     *   CFNetServiceMonitor to unschedule.  Must be non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop from which the monitor should be
     *   unscheduled. Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode from which to unschedule the monitor.  Must be
     *   non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceMonitorUnscheduleFromRunLoop(CFNetServiceMonitorRef monitor,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    /**
     *  CFNetServiceBrowserCreate()
     * 
     *  Discussion:
     * Creates an instance of a browser object.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   browser and its storage for values. If this reference is not a
     *   valid CFAllocator, the behavior is undefined.
     * 
     * clientCB:
     *   Function pointer that will be called as domains or services are
     *   found on the network.  Must be non-NULL.
     * 
     * clientContext:
     *   Client contextual information to be used when calling clientCB.
     *   Must be non-NULL.
     * 
     *  Result:
     * Returns a new instance of a browser, or NULL if the instance
     * could not be created.
     */
    @Generated
    @CFunction
    public static native CFNetServiceBrowserRef CFNetServiceBrowserCreate(CFAllocatorRef alloc,
            @FunctionPtr(name = "call_CFNetServiceBrowserCreate") Function_CFNetServiceBrowserCreate clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    /**
     *  CFNetServiceBrowserInvalidate()
     * 
     *  Discussion:
     * Invalidates the given browser object so that it may no longer be
     * scheduled and callback never be called.  This will also stop any
     * searches currently in progress.
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser to invalidate.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceBrowserInvalidate(CFNetServiceBrowserRef browser);

    /**
     *  CFNetServiceBrowserSearchForDomains()
     * 
     *  Discussion:
     * Starts a search for domains.  The browser will either try to find
     * "Browse" domains or will search for "Registration" domains.  If
     * there is already an outstanding search, it will return FALSE.  In
     * syncronous mode, this call blocks until the search is stopped.
     * It will return FALSE if there is an error performing the search.
     * It will return TRUE otherwise.  In asynchronous mode, this call
     * will return TRUE or FALSE depending if the underlying network
     * search could be started.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser to perform the search.  Must be
     *   non-NULL.
     * 
     * registrationDomains:
     *   FALSE if "Browse" domains are to be discovered. TRUE if only
     *   "Registration" domains are to be discovered.
     * 
     * error:
     *   A reference to an error struct which will be set to the error
     *   and domain of the error should one occur.  If the value of
     *   error is not desired, set to NULL.
     * 
     *  Result:
     * Returns FALSE if an error occurs during a synchronous search or
     * if the search could not start.  It returns TRUE otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceBrowserSearchForDomains(CFNetServiceBrowserRef browser,
            byte registrationDomains,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceBrowserSearchForServices()
     * 
     *  Discussion:
     * Starts a search for a service type on the given domain.  If there
     * is already an outstanding search, it will return FALSE.  In
     * syncronous mode, this call blocks until the search is stopped.
     * It will return FALSE if there is an error performing the search
     * or if there is some other error.  It will return TRUE otherwise.
     * In asynchronous mode, this call will return TRUE or FALSE
     * depending if the underlying network search could be instantiated.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser to perform the search.  Must be
     *   non-NULL.
     * 
     * domain:
     *   Network domain to search in order to find the service.  Must be
     *   non-NULL.
     * 
     * serviceType:
     *   Service type for which to search.  Must be non-NULL.
     * 
     * error:
     *   A reference to an error struct which will be set to the error
     *   and domain of the error should one occur.  If the value of
     *   error is not desired, set to NULL.
     * 
     *  Result:
     * Returns FALSE if an error occurs during a synchronous search or
     * if the search could not start.  It returns TRUE otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFNetServiceBrowserSearchForServices(CFNetServiceBrowserRef browser, CFStringRef domain,
            CFStringRef serviceType,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceBrowserStopSearch()
     * 
     *  Discussion:
     * Stops an outstanding browser search.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser performing the search.  Must be
     *   non-NULL.
     * 
     * error:
     *   Error value to be returned in "error" in
     *   CFNetServiceBrowserStartServiceSearch if search is being
     *   performed in synchronous mode.  In this case, a non-zero of the
     *   error field of the struct will cause
     *   CFNetServiceBrowserStartServiceSearch to return FALSE. In
     *   asynchronous mode, the client call back will be called with
     *   this error. Can be NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceBrowserStopSearch(CFNetServiceBrowserRef browser,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFNetServiceBrowserScheduleWithRunLoop()
     * 
     *  Discussion:
     * Schedules the browser on a run loop and mode.  Use this to place
     * the given browser into asynchronous mode.  The client callback
     * will be triggered via one of the scheduled run loops; It is the
     * caller's responsibility to ensure that at least one of the
     * scheduled run loops is being run.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser to schedule.  Must be non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop on which the browser should be
     *   scheduled.  Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode on which to schedule the browser.  Must be non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceBrowserScheduleWithRunLoop(CFNetServiceBrowserRef browser,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    /**
     *  CFNetServiceBrowserUnscheduleFromRunLoop()
     * 
     *  Discussion:
     * Unschedules the browser from a run loop and mode.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * browser:
     *   Network Service Browser to unschedule.  Must be non-NULL.
     * 
     * runLoop:
     *   A reference to a runloop from which the browser should be
     *   unscheduled. Must be non-NULL.
     * 
     * runLoopMode:
     *   The mode from which to unschedule the browser.  Must be
     *   non-NULL.
     */
    @Generated
    @CFunction
    public static native void CFNetServiceBrowserUnscheduleFromRunLoop(CFNetServiceBrowserRef browser,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @Inline
    @CFunction
    public static native int CFSocketStreamSOCKSGetErrorSubdomain(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @Inline
    @CFunction
    public static native int CFSocketStreamSOCKSGetError(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFStreamCreatePairWithSocketToCFHost()
     * 
     *  Discussion:
     * Given a CFHostRef, this function will create a pair of streams
     * suitable for connecting to the host.  If there is a failure
     * during creation, the stream references will be set to NULL.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   streams. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * host:
     *   A reference to a CFHost to which the streams are desired.  If
     *   unresolved, the host will be resolved prior to connecting.
     * 
     * port:
     *   The port to which the connection should be established.
     * 
     * readStream:
     *   A pointer to a CFReadStreamRef which will be set to the new
     *   read stream instance.  Can be set to NULL if not desired.
     * 
     * writeStream:
     *   A pointer to a CFWriteStreamRef which will be set to the new
     *   write stream instance.  Can be set to NULL if not desired.
     */
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToCFHost(CFAllocatorRef alloc, CFHostRef host, int port,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     *  CFStreamCreatePairWithSocketToNetService()
     * 
     *  Discussion:
     * Given a CFNetService, this function will create a pair of streams
     * suitable for connecting to the service.  If there is a failure
     * during creation, the stream references will be set to NULL.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CFAllocator which should be used to allocate memory for the
     *   streams. If this reference is not a valid CFAllocator, the
     *   behavior is undefined.
     * 
     * service:
     *   A reference to a CFNetService to which the streams are desired.
     *    If unresolved, the service will be resolved prior to
     *   connecting.
     * 
     * readStream:
     *   A pointer to a CFReadStreamRef which will be set to the new
     *   read stream instance.  Can be set to NULL if not desired.
     * 
     * writeStream:
     *   A pointer to a CFWriteStreamRef which will be set to the new
     *   write stream instance.  Can be set to NULL if not desired.
     */
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToNetService(CFAllocatorRef alloc, CFNetServiceRef service,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     *  CFReadStreamCreateWithFTPURL()
     * 
     *  DEPRECATED: Use NSURLSessionAPI for ftp requests
     * 
     *  Discussion:
     * Create an FTP read stream for downloading operation from an FTP
     * URL. If the URL refers to a directory, the stream is a filtered
     * line-at-a-time read stream corresponding to the listing results
     * provided by the server. If it's a file, then the stream is a
     * regular read stream providing the data for that file.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * ftpURL:
     *   A pointer to a CFURL structure created by CFURLCreateWithString
     *   function.  If this parameter is not a pointer to a valid CFURL
     *   structure, the behavior is undefined.
     * 
     *  Result:
     * A pointer to the CF read stream created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * read stream.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithFTPURL(CFAllocatorRef alloc, CFURLRef ftpURL);

    /**
     *  CFFTPCreateParsedResourceListing()
     * 
     *  DEPRECATED: Use NSURLSessionAPI for ftp requests
     * 
     *  Discussion:
     * Parse a line of file or folder listing of Unix format, and store
     * the extracted result in a CFDictionary.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CFDictionary to hold resource info.  If this
     *   reference is not a valid CFAllocator, the behavior is undefined.
     * 
     * buffer:
     *   A pointer to a buffer that may hold lines of resource listing,
     *   but only the first line starting from buffer[0] will be parsed
     *   each call.
     * 
     * bufferLength:
     *   The maximum buffer size in bytes started from the location
     *   pointed by "buffer."
     * 
     * parsed:
     *   A pointer to a CFDictionary pointer.  The dictionary holds the
     *   extracted resource information.  When parsing fails, a NULL
     *   pointer will be returned.  It is caller's responsibilty to
     *   release the memory allocated for the dictionary.
     * 
     *  Result:
     * The number of bytes consumed from buffer, 0 if there are not
     * enough bytes, or -1 if a parse failure occurs.
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long CFFTPCreateParsedResourceListing(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufferLength, Ptr<CFDictionaryRef> parsed);

    /**
     *  CFWriteStreamCreateWithFTPURL()
     * 
     *  DEPRECATED: Use NSURLSessionAPI for ftp requests
     * 
     *  Discussion:
     * Create an FTP write stream for uploading operation to a FTP URL.
     * If the URL specifies a directory, the open will be followed by a
     * close event/state and the directory will have been created.
     * Intermediary directory structure is not created.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * ftpURL:
     *   A pointer to a CFURL structure created by CFURLCreateWithString
     *   function.  If this parameter is not a pointer to a valid CFURL
     *   structure, the behavior is undefined.
     * 
     *  Result:
     * A pointer to the CF write stream created, or NULL if failed. It
     * is caller's responsibilty to release the memory allocated for the
     * write stream.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithFTPURL(CFAllocatorRef alloc, CFURLRef ftpURL);

    /**
     *  CFHTTPMessageGetTypeID()
     * 
     *  Discussion:
     * Return the unique type for this class.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Result:
     * A unique CFType for CFHTTPMessage.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFHTTPMessageGetTypeID();

    /**
     *  CFHTTPMessageCreateRequest()
     * 
     *  Discussion:
     * Create an HTTPMessage from an HTTP method, url and version.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * requestMethod:
     *   A pointer to a CFString indicating the method of request. For a
     *   "GET" request, for example, the value would be CFSTR("GET").
     * 
     * url:
     *   A pointer to a CFURL structure created any of the several
     *   CFURLCreate... functions.  If this parameter is not a pointer
     *   to a valid CFURL structure, the behavior is undefined.
     * 
     * httpVersion:
     *   A pointer to a CFString indicating the version of request.
     * 
     *  Result:
     * A pointer to the CFHTTPMessage created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * message.
     */
    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateRequest(CFAllocatorRef alloc, CFStringRef requestMethod,
            CFURLRef url, CFStringRef httpVersion);

    /**
     *  CFHTTPMessageCreateResponse()
     * 
     *  Discussion:
     * Create an HTTPMessage from an HTTP status code, description and
     * version.
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * statusCode:
     *   An integer status code for the response.
     * 
     * statusDescription:
     *   A pointer to a CFString for the status. Pass NULL to use the
     *   standard description for the given status code, as found in RFC
     *   2616.
     * 
     * httpVersion:
     *   A pointer to a CFString for the HTTP version.
     * 
     *  Result:
     * A pointer to the CFHTTPMessage created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * message.
     */
    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateResponse(CFAllocatorRef alloc, @NInt long statusCode,
            CFStringRef statusDescription, CFStringRef httpVersion);

    /**
     *  CFHTTPMessageCreateEmpty()
     * 
     *  Discussion:
     * Creates an empty request or response, which you can then append
     * bytes to via CFHTTPMessageAppendBytes().
     * 
     *  Mac OS X threading:
     * Thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * isRequest:
     *   A boolean. Pass kCFBooleanTrue if the message should be a
     *   request.
     * 
     *  Result:
     * A pointer to the CFHTTPMessage created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * message.
     */
    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateEmpty(CFAllocatorRef alloc, byte isRequest);

    /**
     *  CFHTTPMessageCreateCopy()
     * 
     *  Discussion:
     * Creates a copy of a CFHTTPMessage.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A pointer to the CFHTTPMessage created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * message.
     */
    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateCopy(CFAllocatorRef alloc, CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageIsRequest()
     * 
     *  Discussion:
     * Returns whether the CFHTTPMessage is a request or a response.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A Boolean. A value of kCFBooleanTrue indicates the message is a
     * request. A value of kCFBooleanFalse indicates the message is a
     * response.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageIsRequest(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageCopyVersion()
     * 
     *  Discussion:
     * Returns the HTTP version.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A pointer to a CFString, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the string.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyVersion(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageCopyBody()
     * 
     *  Discussion:
     * Returns the body of the message.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A pointer to a CFData, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the data.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFHTTPMessageCopyBody(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageSetBody()
     * 
     *  Discussion:
     * Sets the body of the message from a CFData.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     * bodyData:
     *   A pointer to a CFData containing the body to be set. If the
     *   bodyData is NULL, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFHTTPMessageSetBody(CFHTTPMessageRef message, CFDataRef bodyData);

    /**
     *  CFHTTPMessageCopyHeaderFieldValue()
     * 
     *  Discussion:
     * Returns the specified header field.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     * headerField:
     *   A pointer to the CFString. If the headerField is NULL, the
     *   behavior is undefined.
     * 
     *  Result:
     * A pointer to a CFString, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the string.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyHeaderFieldValue(CFHTTPMessageRef message,
            CFStringRef headerField);

    /**
     *  CFHTTPMessageCopyAllHeaderFields()
     * 
     *  Discussion:
     * Returns a CFDictionary containing all of the header fields.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A pointer to a CFDictionary, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the dictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFHTTPMessageCopyAllHeaderFields(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageSetHeaderFieldValue()
     * 
     *  Discussion:
     * Sets the value of the specified header field.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     * headerField:
     *   A pointer to the CFString. If headerField is NULL, the behavior
     *   is undefined.
     * 
     * value:
     *   A pointer to the CFString containing the value to set. Set the
     *   value to NULL to remove the header field.
     */
    @Generated
    @CFunction
    public static native void CFHTTPMessageSetHeaderFieldValue(CFHTTPMessageRef message, CFStringRef headerField,
            CFStringRef value);

    /**
     *  CFHTTPMessageAppendBytes()
     * 
     *  Discussion:
     * Appends the given bytes to the message given (parsing out any
     * control information if appropriate).  Returns kCFBooleanFalse if
     * a parsing error occurs while processing the new data.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     * newBytes:
     *   A pointer to the bytes. If newBytes is NULL, the behavior is
     *   undefined.
     * 
     * numBytes:
     *   A CFIndex of the number of bytes to append.
     * 
     *  Result:
     * A Boolean indicating success or failure.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageAppendBytes(CFHTTPMessageRef message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
            @NInt long numBytes);

    /**
     *  CFHTTPMessageIsHeaderComplete()
     * 
     *  Discussion:
     * Returns whether further header data is expected by the message.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * message:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A Boolean. A value of kCFBooleanTrue indicates the header is
     * complete and no further data is expected.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageIsHeaderComplete(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageCopySerializedMessage()
     * 
     *  Discussion:
     * Creates a self-contained copy of a CFHTTPMessage. This would be
     * suitable for persistant storage or for transmitting over the
     * network independently.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * request:
     *   A pointer to the CFHTTPMessage to be seralized.
     * 
     *  Result:
     * A pointer to a CFData, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the data.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFHTTPMessageCopySerializedMessage(CFHTTPMessageRef message);

    /**
     *  CFHTTPMessageCopyRequestURL()
     * 
     *  Discussion:
     * Creates a copy of the request URL.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * request:
     *   A pointer to the CFHTTPMessage.
     * 
     *  Result:
     * A pointer to a CFURL, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the url.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFHTTPMessageCopyRequestURL(CFHTTPMessageRef request);

    /**
     *  CFHTTPMessageCopyRequestMethod()
     * 
     *  Discussion:
     * Creates a copy of the request method.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * request:
     *   A pointer to the CFHTTPMessage.
     * 
     *  Result:
     * A pointer to a CFString, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the string.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyRequestMethod(CFHTTPMessageRef request);

    /**
     *  CFHTTPMessageAddAuthentication()
     * 
     *  Discussion:
     * Adds authentication to the request. Tries to modify request to
     * contain the authentication information requested by the failed
     * response (which presumably is a 401 or 407 response).
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * request:
     *   A pointer to a CFHTTPMessage request.
     * 
     * authenticationFailureResponse:
     *   A pointer to a CFHTTPMessage of the failed response.
     * 
     * username:
     *   A pointer to a CFString containing the user name to
     *   authenticate.
     * 
     * password:
     *   A pointer to a CFString containing the password of the user.
     * 
     * authenticationScheme:
     *   A pointer to a CFString containing the authentication scheme to
     *   use to authenticate. If authenticationScheme is NULL, strongest
     *   supported scheme listed authenticationFailureResponse will be
     *   used.
     * 
     * forProxy:
     *   A boolean indicating whether the authentication applies to a
     *   proxy or not.
     * 
     *  Result:
     * A pointer to a CFString, or NULL if failed. It is caller's
     * responsibilty to release the memory allocated for the string.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageAddAuthentication(CFHTTPMessageRef request,
            CFHTTPMessageRef authenticationFailureResponse, CFStringRef username, CFStringRef password,
            CFStringRef authenticationScheme, byte forProxy);

    /**
     *  CFHTTPMessageGetResponseStatusCode()
     * 
     *  Discussion:
     * Returns the status code for the response.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * response:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A UInt32 indicating the status code.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFHTTPMessageGetResponseStatusCode(CFHTTPMessageRef response);

    /**
     *  CFHTTPMessageCopyResponseStatusLine()
     * 
     *  Discussion:
     * Returns the status line for the response.
     * 
     *  Mac OS X threading:
     * Not thread safe
     * 
     *  Parameters:
     * 
     * response:
     *   A pointer to the CFHTTPMessage to be copied. If the message is
     *   NULL, the behavior is undefined.
     * 
     *  Result:
     * A CFString indicating the status code, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * string.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyResponseStatusLine(CFHTTPMessageRef response);

    /**
     * Creation routines
     *  CFReadStreamCreateForHTTPRequest()   *** DEPRECATED ***
     * 
     *  DEPRECATED: Use NSURLSession API for http requests
     * 
     *  Discussion:
     * Create an HTTP read stream for the response to the given request.
     * When the stream is opened, it will begin transmitting the
     * request. The bytes returned are the pure body bytes; the response
     * header has been parsed off. To retrieve the response header, ask
     * for kCFStreamPropertyHTTPResponseHeader, above, any time after
     * the first bytes arrive on the stream (or when stream end is
     * reported, if there are no data bytes). When an HTTP/1.1 server
     * returns a chunked a response, the chunks will be formed into one
     * continuous stream.
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * request:
     *   A pointer to a CFHTTPMessage created by the
     *   CFHTTPMessageCreateRequest function.
     * 
     *  Result:
     * A pointer to the CF read stream created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * read stream.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateForHTTPRequest(CFAllocatorRef alloc,
            CFHTTPMessageRef request);

    /**
     *  CFReadStreamCreateForStreamedHTTPRequest()   *** DEPRECATED ***
     * 
     *  DEPRECATED: Use NSURLSession API for http requests
     * 
     *  Discussion:
     * Creates a read stream for the response to the given
     * requestHeaders plus requestBody. Use in preference to
     * CFReadStreamCreateForHTTPRequest() when the body of the request
     * is larger than you wish to be resident in memory.  Note that
     * because streams cannot be reset, read streams created this way
     * cannot have autoredirection enabled.  If the Content-Length
     * header is set in requestHeaders, it is assumed that the caller
     * got the length right and that requestBody will report
     * end-of-stream after precisely Content-Length bytes have been read
     * from it. If the Content-Length header is not set, the chunked
     * transfer-encoding will be added to requestHeaders, and bytes read
     * from requestBody will be transmitted chunked. The body of
     * requestHeaders is ignored.
     * 
     *  Parameters:
     * 
     * alloc:
     *   A pointer to the CFAllocator which should be used to allocate
     *   memory for the CF read stream and its storage for values. If
     *   this reference is not a valid CFAllocator, the behavior is
     *   undefined.
     * 
     * requestHeaders:
     *   A pointer to a CFHTTPMessage created by the
     *   CFHTTPMessageCreateRequest function. The body of requestHeaders
     *   is ignored.
     * 
     * requestBody:
     *   A pointer to a CFReadStream.
     * 
     *  Result:
     * A pointer to the CF read stream created, or NULL if failed. It is
     * caller's responsibilty to release the memory allocated for the
     * read stream.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateForStreamedHTTPRequest(CFAllocatorRef alloc,
            CFHTTPMessageRef requestHeaders, CFReadStreamRef requestBody);

    /**
     *  CFHTTPAuthenticationGetTypeID()
     * 
     *  Discussion:
     * Returns the type identifier of all CFHTTPAuthentication instances.
     * 
     *  Mac OS X threading:
     * Thread safe
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFHTTPAuthenticationGetTypeID();

    /**
     *  CFHTTPAuthenticationCreateFromResponse()
     * 
     *  Discussion:
     * Based on a response of 401 or 407, this function will create a
     * new authentication object which can be used for adding
     * credentials to future requests.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * alloc:
     *   Allocator to use for creating authentication object
     * 
     * response:
     *   Failed response.
     * 
     *  Result:
     * A freshly created authentication object useful for applying
     * authentication credentials to new requests.
     */
    @Generated
    @CFunction
    public static native CFHTTPAuthenticationRef CFHTTPAuthenticationCreateFromResponse(CFAllocatorRef alloc,
            CFHTTPMessageRef response);

    /**
     *  CFHTTPAuthenticationIsValid()
     * 
     *  Discussion:
     * Returns TRUE if the given authentication information was
     * instantiated correctly and contains enough information in order
     * to be applied to a request. If FALSE is returned, the object may
     * still contain information which is useful to the user, e.g.
     * unsupported method name.  An invalid object may be queried for
     * information but may not be applied to a request.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     * error:
     *   Reference to a CFStreamError which will be populated in the
     *   case of an error in creation.  Pass NULL if not interested in
     *   the failure reason.  The error domain will be
     *   kCFStreamErrorDomainHTTP, and the error code will be one of
     *   those defined in CFHTTPStream.h or one of those listed as
     *   CFStreamErrorHTTPAuthentication.
     * 
     *  Result:
     * TRUE or FALSE depending on whether the authentication object is
     * good for applying credentials to further requests.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationIsValid(CFHTTPAuthenticationRef auth,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFHTTPAuthenticationAppliesToRequest()
     * 
     *  Discussion:
     * Returns TRUE if the given request requires credentials based upon
     * the given authentication information.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     * request:
     *   The request which is believed to need the given authentication.
     * 
     *  Result:
     * TRUE if the given authentication information should be applied to
     * the request, otherwise FALSE is returned.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationAppliesToRequest(CFHTTPAuthenticationRef auth,
            CFHTTPMessageRef request);

    /**
     *  CFHTTPAuthenticationRequiresOrderedRequests()
     * 
     *  Discussion:
     * Some authentication methods require that future requests must be
     * performed in an ordered manner, so that information from a
     * response can be added to a following request.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * Returns TRUE if the given authentication method requires ordered
     * requests.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresOrderedRequests(CFHTTPAuthenticationRef auth);

    /**
     *  CFHTTPMessageApplyCredentials()
     * 
     *  Discussion:
     * Perform the authentication method required on the request using
     * the given username and password.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * request:
     *   The request which is to receive the credentials.
     * 
     * auth:
     *   The authentication information for the given request.
     * 
     * username:
     *   The username to use for performing the authentication.
     * 
     * password:
     *   The password to use for performing the authentication.
     * 
     * error:
     *   Reference to a CFStreamError which will be populated with the
     *   error information should one occurr during the application of
     *   the credentials. Pass NULL if not interested in the failure
     *   reason.  The error domain will be kCFStreamErrorDomainHTTP, and
     *   the error code will be one of those define in CFHTTPStream.h or
     *   one of those listed as CFStreamErrorHTTPAuthentication.
     * 
     *  Result:
     * TRUE will be returned if the application of the credentials to
     * the request was successful, otherwise FALSE is returned.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageApplyCredentials(CFHTTPMessageRef request, CFHTTPAuthenticationRef auth,
            CFStringRef username, CFStringRef password,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFHTTPMessageApplyCredentialDictionary()
     * 
     *  Discussion:
     * Perform the authentication method required on the request using
     * the given credential information.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * request:
     *   The request which is to receive the credentials.
     * 
     * auth:
     *   The authentication information for the given request.
     * 
     * dict:
     *   A dictionary containing credentials to be applied to the
     *   request.  Valid keys are declared above.
     * 
     * error:
     *   Reference to a CFStreamError which will be populated with the
     *   error information should one occurr during the application of
     *   the credentials. Pass NULL if not interested in the failure
     *   reason.  The error domain will be kCFStreamErrorDomainHTTP, and
     *   the error code will be one of those define in CFHTTPStream.h or
     *   one of those listed as CFStreamErrorHTTPAuthentication.
     * 
     *  Result:
     * TRUE will be returned if the application of the credentials to
     * the request was successful, otherwise FALSE is returned.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPMessageApplyCredentialDictionary(CFHTTPMessageRef request,
            CFHTTPAuthenticationRef auth, CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    /**
     *  CFHTTPAuthenticationCopyRealm()
     * 
     *  Discussion:
     * Some authentication techniques provide for namespaces on top of
     * domains. This call will return the authentication information's
     * namespace if there is one, otherwise it will return NULL.  This
     * namespace is usually used for prompting the application user for
     * a name and password.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * This call will return the authentication information's namespace
     * if there is one, otherwise it will return NULL.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPAuthenticationCopyRealm(CFHTTPAuthenticationRef auth);

    /**
     *  CFHTTPAuthenticationCopyDomains()
     * 
     *  Discussion:
     * Returns a list of domain URL's on which the given authentication
     * should be applied. This function is provided mostly for
     * informational purposes. CFHTTPAuthenticationAppliesToRequest
     * should be used in order to check whether a request requires the
     * authentication.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * Returns a list of domain URL's on which the given authentication
     * should be applied.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFHTTPAuthenticationCopyDomains(CFHTTPAuthenticationRef auth);

    /**
     *  CFHTTPAuthenticationCopyMethod()
     * 
     *  Discussion:
     * Returns the method of authentication which will be performed when
     * applying credentials.  The strongest method of authentication
     * will be chosen in the case of multiple choices.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * Returns the method of authentication which will be performed when
     * applying credentials.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFHTTPAuthenticationCopyMethod(CFHTTPAuthenticationRef auth);

    /**
     *  CFHTTPAuthenticationRequiresUserNameAndPassword()
     * 
     *  Discussion:
     * Returns TRUE if the chosen authentication scheme requires a
     * username and password.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * Returns TRUE if the chosen authentication scheme requires a
     * username and password.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresUserNameAndPassword(CFHTTPAuthenticationRef auth);

    /**
     *  CFHTTPAuthenticationRequiresAccountDomain()
     * 
     *  Discussion:
     * Returns TRUE if the chosen authentication scheme requires a
     * domain for authentication.  Currently, this will return TRUE for
     * "NTLM" and FALSE for the other methods.
     * 
     *  Mac OS X threading:
     * Thread safe
     * The API's to CFHTTPAuthenticationRef are thread-safe so long as
     * multiple threads are not altering the same
     * CFHTTPAuthenticationRef at the same time.
     * 
     *  Parameters:
     * 
     * auth:
     *   The authentication information being queried.
     * 
     *  Result:
     * Returns TRUE if the chosen authentication scheme requires a
     * domain for authentication.
     */
    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresAccountDomain(CFHTTPAuthenticationRef auth);

    /**
     *  CFNetDiagnosticCreateWithStreams()
     * 
     *  Discussion:
     * Creates a CFNetDiagnosticRef from a pair of CFStreams. Either
     * stream may be NULL. This is the preferred interface for creating
     * a CFNetDiagnosticRef.
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CF allocator to use.
     * 
     * readStream:
     *   CFReadStreamRef referring to the failed connection. May be NULL.
     * 
     * writeStream:
     *   CFWriteStreamRef referring to the failed connection. May be
     *   NULL.
     * 
     *  Result:
     * A CFNetDiagnosticRef referring to the current networking issue.
     */
    @Generated
    @CFunction
    public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithStreams(CFAllocatorRef alloc,
            CFReadStreamRef readStream, CFWriteStreamRef writeStream);

    /**
     *  CFNetDiagnosticCreateWithURL()
     * 
     *  Discussion:
     * Creates a CFNetDiagnosticRef based on a CFURLRef passed in by the
     * application.
     * 
     *  Parameters:
     * 
     * alloc:
     *   The CF allocator to use.
     * 
     * url:
     *   CFURLRef referring to the failed connection.
     * 
     *  Result:
     * A CFNetDiagnosticRef referring to the current networking issue.
     */
    @Generated
    @CFunction
    public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithURL(CFAllocatorRef alloc, CFURLRef url);

    /**
     *  CFNetDiagnosticSetName()
     * 
     *  Discussion:
     * If the framework requires an application name to be displayed to
     * the user it will derive it from the bundle identifier of the
     * currently running application, in that application's current
     * localization. If you want to override that you may use
     * CFNetDiagnosticSetName to specify a CFStringRef to be used.
     * 
     *  Parameters:
     * 
     * details:
     *   CFNetDiagnosticRef referring to the current problem.
     * 
     * name:
     *   The localized name that should appear to the user when
     *   referring to the application.
     */
    @Generated
    @CFunction
    public static native void CFNetDiagnosticSetName(CFNetDiagnosticRef details, CFStringRef name);

    /**
     *  CFNetDiagnosticDiagnoseProblemInteractively()
     * 
     *  Discussion:
     * Opens the Network Diagnostics window and returns immediately once
     * it is open. The client passes in a CFNetDiagnosticRef built with
     * one of the creator functions.
     * 
     *  Parameters:
     * 
     * details:
     *   CFNetDiagnosticRef referring to the current problem.
     * 
     *  Result:
     * A CFNetDiagnosticStatus. Will either be CFNetDiagnosticNoErr, or
     * CFNetDiagnosticErr if there was an error attempting to run the
     * diagnosis.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNetDiagnosticDiagnoseProblemInteractively(CFNetDiagnosticRef details);

    /**
     *  CFNetDiagnosticCopyNetworkStatusPassively()
     * 
     *  Discussion:
     * Returns a status value that can be used to display basic
     * information about the connection. If the caller wishes they may
     * pass in a pointer to a CFStringRef that will be used to pass back
     * a localized description of the problem. It is the caller's
     * responsibility to release the CFStringRef. If the caller does not
     * want a description they may pass in NULL.
     * CFNetDiagnosticCopyNetworkStatusPassively() is guaranteed not to
     * cause network activity.
     * 
     *  Parameters:
     * 
     * details:
     *   CFNetDiagnosticRef referring to the current problem.
     * 
     * description:
     *   A pointer to a CFStringRef that, upon return, will point to a
     *   localized string containing a description of the current
     *   network status. May be NULL. If it is not NULL, the client must
     *   call CFRelease on the returned object.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNetDiagnosticCopyNetworkStatusPassively(CFNetDiagnosticRef details,
            Ptr<CFStringRef> description);

    /**
     * [@function] CFNetworkCopySystemProxySettings
     * 
     * Returns a CFDictionary containing the current system internet proxy settings.
     * 
     * @return Returns a dictionary containing key-value pairs that represent
     * 	the current internet proxy settings.  See below for definitions of the keys and
     * 	values.
     * 	NULL if no proxy settings have been defined or if an error
     * 	was encountered.
     * 	The caller is responsible for releasing the returned dictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFNetworkCopySystemProxySettings();

    /**
     *  CFNetworkCopyProxiesForURL()
     * 
     *  Discussion:
     * Given a URL and a proxy dictionary, determines the ordered list
     * of proxies that should be used to download the given URL.
     * 
     *  Parameters:
     * 
     * url:
     *   The URL to be accessed
     * 
     * proxySettings:
     *   A dictionary describing the available proxy settings; the
     *   dictionary's format should match the dictionary returned
     *   by CFNetworkCopySystemProxySettings described below.
     * 
     *  Result:
     * An array of dictionaries; each dictionary describes a single
     * proxy.  See the comment at the top of this file for how to
     * interpret the returned dictionaries.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFNetworkCopyProxiesForURL(CFURLRef url, CFDictionaryRef proxySettings);

    /**
     *  CFNetworkCopyProxiesForAutoConfigurationScript()
     * 
     *  Discussion:
     * Synchronously executes the given proxy autoconfiguration script
     * and returns a valid proxyList and NULL error upon success or a
     * NULL proxyList and valid error on failure.
     * 
     *  Parameters:
     * 
     * proxyAutoConfigurationScript:
     *   A CFString containing the code of the script to be executed.
     * 
     * targetURL:
     *   The URL that should be input in to the autoconfiguration script.
     * 
     * error:
     *   A return argument that will contain a valid error in case of
     *   failure.
     * 
     *  Result:
     * An array of dictionaries describing the proxies returned by the
     * script or NULL on failure.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFNetworkCopyProxiesForAutoConfigurationScript(
            CFStringRef proxyAutoConfigurationScript, CFURLRef targetURL, Ptr<CFErrorRef> error);

    /**
     *  CFNetworkExecuteProxyAutoConfigurationScript()
     * 
     *  Discussion:
     * Begins the process of executing proxyAutoConfigurationScript to
     * determine the correct proxy to use to retrieve targetURL.  The
     * caller should schedule the returned run loop source; when the
     * results are found, the caller's callback will be called via the
     * run loop, passing a valid proxyList and NULL error upon success,
     * or a NULL proxyList and valid error on failure.  The caller
     * should invalidate the returned run loop source if it wishes to
     * terminate the request before completion. The returned
     * RunLoopSource will be removed from all run loops and modes on
     * which it was scheduled after the callback returns.
     * 
     *  Parameters:
     * 
     * proxyAutoConfigurationScript:
     *   A CFString containing the code of the script to be executed.
     * 
     * targetURL:
     *   The URL that should be passed to the autoconfiguration script.
     * 
     * cb:
     *   A client callback to notify the caller of completion.
     * 
     * clientContext:
     *   a stream context containing a client info object and optionally
     *   retain / release callbacks for said info object.
     * 
     *  Result:
     * A CFRunLoopSource which the client can use to schedule execution
     * of the AutoConfiguration Script.
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationScript(
            CFStringRef proxyAutoConfigurationScript, CFURLRef targetURL,
            @FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationScript") Function_CFNetworkExecuteProxyAutoConfigurationScript cb,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    /**
     *  CFNetworkExecuteProxyAutoConfigurationURL()
     * 
     *  Discussion:
     * As CFNetworkExecuteProxyAutoConfigurationScript(), above, except
     * that CFNetworkExecuteProxyAutoConfigurationURL will additionally
     * download the contents of proxyAutoConfigURL, convert it to a
     * JavaScript string, and then execute that script.
     *  Ownership for the returned CFRunLoopSourceRef follows the copy rule,
     *  the client is responsible for releasing the object.
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationURL(CFURLRef proxyAutoConfigURL,
            CFURLRef targetURL,
            @FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationURL") Function_CFNetworkExecuteProxyAutoConfigurationURL cb,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    /**
     *  kCFErrorDomainCFNetwork
     * 
     *  Discussion:
     * Error domain for all errors originating in CFNetwork. Error codes
     * may be interpreted using the list below.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCFNetwork();

    /**
     *  kCFErrorDomainWinSock
     * 
     *  Discussion:
     * On Windows, errors originating from WinSock are represented using
     * this domain.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainWinSock();

    /**
     * Keys used by CFNetwork to pass additional error information back to the user within CFError's userInfo dictionary
     *  kCFURLErrorFailingURLErrorKey
     * 
     *  Discussion:
     * When an NSURLConnection or NSURLDownload error occurs, this key's
     *  value is set to the URL which caused a load to fail
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLErrorFailingURLErrorKey();

    /**
     *  kCFURLErrorFailingURLStringErrorKey
     * 
     *  Discussion:
     * When an NSURLConnection or NSURLDownload error occurs, this key's
     *  value is set to the CFString value of the URL which caused a load
     *  to fail
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLErrorFailingURLStringErrorKey();

    /**
     *  kCFGetAddrInfoFailureKey
     * 
     *  Discussion:
     * When an error of kCFHostErrorUnknown is returned, this key's
     * value is set to a CFNumber containing the raw error value
     * returned by getaddrinfo()
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFGetAddrInfoFailureKey();

    /**
     *  kCFSOCKSStatusCodeKey
     * 
     *  Discussion:
     * When a SOCKS failure has occurred, this key's value is set to a
     * CFString containing the status value returned by the SOCKS server.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSStatusCodeKey();

    /**
     *  kCFSOCKSVersionKey
     * 
     *  Discussion:
     * When an error of kCFSOCKSErrorUnsupportedServerVersion is
     * returned, this key's value is set to a CFString containing the
     * version number requested by the server.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSVersionKey();

    /**
     *  kCFSOCKSNegotiationMethodKey
     * 
     *  Discussion:
     * When an error of kCFSOCKS5ErrorUnsupportedNegotiationMethod is
     * returned, this key's value is set to a CFString containing the
     * negotiation method requested by the server.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSNegotiationMethodKey();

    /**
     *  kCFDNSServiceFailureKey
     * 
     *  Discussion:
     * When an error of kCFNetServicesErrorDNSServiceFailure is
     * returned, this key's value is set to a CFNumber containing the
     * value returned from DNS; interret it using the values dns_sd.h
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDNSServiceFailureKey();

    /**
     *  kCFFTPStatusCodeKey
     * 
     *  Discussion:
     * When an error of kCFFTPErrorUnexpectedStatusCode is returned,
     * this key's value is set to a CFString containing the status code
     * returned by the server
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPStatusCodeKey();

    /**
     *  kCFStreamErrorDomainNetDB
     * 
     *  Discussion:
     * Errors listed in netdb.h
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainNetDB();

    /**
     *  kCFStreamErrorDomainSystemConfiguration
     * 
     *  Discussion:
     * Errors listed in SystemConfiguration/SystemConfiguration.h
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSystemConfiguration();

    /**
     *  kCFStreamErrorDomainMach
     * 
     *  Discussion:
     * Errors reported by mach.  See <mach/error.h>
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainMach();

    /**
     *  kCFStreamErrorDomainNetServices
     * 
     *  Discussion:
     * Errors listed below or reported by the Service Discovery API's.
     * See <dns_sd.h>.  The Service Discovery errors will only be
     * returned when using the new, Mac OS X 10.4-based API's or
     * CFNetServiceBrowser.
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainNetServices();

    /**
     *  kCFStreamPropertySSLContext
     * 
     * The SSLContextRef used for both read and write operations on a
     * CFSocketStream.
     * 
     * CFReadStreamCopyProperty or CFWriteStreamCopyProperty return an
     * appropriately reference counted SSLContextRef.  If the stream has
     * not yet been opened, this SSLContext may be configured directly
     * using the appropriate SecureTransport APIs.
     * 
     * CFReadStreamSetProperty or CFWriteStreamSetProperty will allow you
     * to specify an SSLContextRef for a stream.  If the stream has not
     * been opened, the SSLContextRef will replace any existing
     * SSLContextRef and be used in the initial stream handshake.  If the
     * stream has been opened without SSL enabled, setting this property
     * will initiate an SSL handshake over the existing socket.
     * 
     * If an SSL settings dictionary was set via
     * kCFStreamPropertySSLSettings, a SSLContextRef is created internally
     * and configured as per the dictionary.  However, if an SSLContextRef
     * is set after this, its configuration will take precedence over the
     * previously configured context.
     * 
     * Reconfiguring an SSLContext after the stream it is bound to has
     * opened is unsupported.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLContext();

    /**
     *  kCFStreamPropertySSLPeerTrust
     * 
     *  Discussion:
     * Stream property value for copy operations.  Returns a SecTrustRef
     * which was a result of the SSL handshake.  This property is not valid before
     *  a stream is opened.  See Security/SecTrust.h for more information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLPeerTrust();

    /**
     *  kCFStreamSSLValidatesCertificateChain
     * 
     *  Discussion:
     * Security property key for kCFStreamPropertySSLSettings.
     * CFBooleanRef indicating whether the certificate chain should be
     * validated or not.  The value is kCFBooleanTrue by default (not
     * set).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLValidatesCertificateChain();

    /**
     *  kCFStreamPropertySSLSettings
     * 
     *  Discussion:
     * Stream property key for set operations.  CFDictionaryRef filled
     * with different security settings.  By default, there are no
     * security settings.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLSettings();

    /**
     *  kCFStreamSSLLevel
     * 
     *  Discussion:
     * Security property key for kCFStreamPropertySSLSettings.
     * CFStringRef being one of the security levels.  The value is
     * kCFStreamSocketSecurityLevelNegotiatedSSL by default (not set).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLLevel();

    /**
     *  kCFStreamSSLPeerName
     * 
     *  Discussion:
     * Security property key for kCFStreamPropertySSLSettings.
     * CFStringRef overriding the name used for certificate
     * verification.  Set to kCFNull to prevent name verification.
     * Default is the host name with which the streams were created.  If
     * no host name was used, no peer name will be used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLPeerName();

    /**
     *  kCFStreamSSLCertificates
     * 
     *  Discussion:
     * Security property key for kCFStreamPropertySSLSettings.
     * CFArrayRef of SecCertificateRefs, except for index [0], which is
     * a SecIdentityRef.  See SSLSetCertificate in
     * Security/SecureTransport.h for more information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLCertificates();

    /**
     *  kCFStreamSSLIsServer
     * 
     *  Discussion:
     * Security property key for kCFStreamPropertySSLSettings.
     * CFBooleanRef indicating whether the connection is to act as a
     * server in the SSL process or not.  The value is kCFBooleanFalse
     * by default (not set).  If set to kCFBooleanTrue, there must be a
     * valid value for the kCFStreamSSLCertificates key too.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLIsServer();

    /**
     * kCFStreamNetworkServiceType
     * 
     * Discussion:
     * Property key to specify the type of service for the stream.  This
     * allows the system to properly handle the request with respect to
     * routing, suspension behavior and other networking related attributes
     * appropriate for the given service type.  The service types supported
     * are documented below.  Most streams should not need to set this
     * property.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceType();

    /**
     * interactive video
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVideo();

    /**
     * interactive voice data
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVoice();

    /**
     * background
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeBackground();

    /**
     * Call Signaling
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeCallSignaling();

    /**
     * voice over IP control - this service type is deprecated in favor of using PushKit for VoIP control
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVoIP();

    /**
     * kCFStreamPropertyNoCellular
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * The value is a CFBooleanRef which indicates whether the connection
     * is allowed to use the built-in celluar radios.  A value of kCFBooleanTrue
     * disallows use of cellular interfaces.  kCFBooleanFalse (the default)
     * allows use of cellular interfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyNoCellular();

    /**
     * kCFStreamPropertyConnectionIsCellular
     * 
     * Discussion:
     * Stream property key for copy operations.  Returns a CFBooleanRef value
     * of kCFBooleanTrue if the stream has connected using the built in cellular radios.
     * It returns kCFBooleanFalse if the stream is conneceted over a non-cellular
     * interface or has not yet established a connection.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyConnectionIsCellular();

    /**
     * kCFStreamErrorDomainWinSock
     * 
     * Discussion:
     * WinSock error domain.  On Win32 platforms, networking errors will
     * come in this domain.  See <winsock2.h> for values.  Note that
     * non-networking errors, like ENOMEM, will continue to come in the
     * POSIX domain as on OS X.
     */
    @Generated
    @CVariable()
    @NInt
    public static native long kCFStreamErrorDomainWinSock();

    /**
     *  kCFStreamPropertyProxyLocalBypass
     * 
     *  Discussion:
     * CFDictionary key for proxy information.  It matches
     * kSCPropNetProxiesExcludeSimpleHostnames defined in
     * SCSchemaDefinitions.h.  CFNumber (0 or 1) indicating to bypass
     * the proxies for simple hostnames (names without dots).
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyProxyLocalBypass();

    /**
     *  kCFStreamPropertySocketRemoteHost
     * 
     *  Discussion:
     * Stream property key for copy operations. Returns a CFHostRef if
     * known, otherwise NULL.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteHost();

    /**
     *  kCFStreamPropertySocketRemoteNetService
     * 
     *  Discussion:
     * Stream property key for copy operations. Returns a
     * CFNetServiceRef if known, otherwise NULL.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteNetService();

    /**
     *  kCFStreamPropertySocketExtendedBackgroundIdleMode
     * 
     *  Discussion:
     * Set this to kCFBooleanTrue to enable extended background idle
     * mode.  Enabling this mode asks the system to keep the socket open
     *  and delay reclaiming it when the process moves to the background (see
     *  https://developer.apple.com/library/ios/technotes/tn2277/_index.html)
     *  This property must be set before the stream is opened.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketExtendedBackgroundIdleMode();

    /**
     * The following properties are DEPRECATED starting in OS X 10.6 and iOS 4.0.
     * 
     * kCFStreamPropertySSLPeerCertificates:
     *         The peer certificates are available as part of the SecTrustRef object.  See <Security/SecTrust.h>
     * 
     * kCFStreamSSLAllowsExpiredCertificates:
     * kCFStreamSSLAllowsExpiredRoots:
     * kCFStreamSSLAllowsAnyRoot:
     *        The SSL handshake flags which affect untrusted certificate chain evaluation are deprecated.
     *        Instead, use the single property kCFStreamSSLValidatesCertificateChain to disable certificate
     *        chain checking if the user has decided that it is appropriate to do so.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLPeerCertificates();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsExpiredCertificates();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsExpiredRoots();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsAnyRoot();

    /**
     *  kCFStreamErrorDomainFTP
     * 
     *  Discussion:
     * Result code returned by FTP server
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainFTP();

    /**
     *  kCFStreamPropertyFTPUserName
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations.  CFString
     * type to hold login user name.  Don't set this property if you
     * want anonymous FTP.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPUserName();

    /**
     *  kCFStreamPropertyFTPPassword
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations. CFString
     * type to hold login password.  Don't set this property if you want
     * anonymous FTP.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPPassword();

    /**
     *  kCFStreamPropertyFTPUsePassiveMode
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations. CFBoolean
     * type. kCFBooleanTrue means use passive mode, kCFBooleanFalse
     * otherwise
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPUsePassiveMode();

    /**
     *  kCFStreamPropertyFTPResourceSize
     * 
     *  Discussion:
     * Stream property key, for read stream copy operations.  CFNumber
     * of kCFNumberLongLongType to hold resource size in bytes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPResourceSize();

    /**
     *  kCFStreamPropertyFTPFetchResourceInfo
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations.  CFBoolean
     * type.  TRUE means that resource info, such as size, must be
     * provided before download starts at higher cost.  Don't set if
     * resource size/other info is unnecessary.  Initially, only
     * resource size is implemented.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPFetchResourceInfo();

    /**
     *  kCFStreamPropertyFTPFileTransferOffset
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations.  CFNumber
     * of kCFNumberLongLongType for the file offset to start transfer at.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPFileTransferOffset();

    /**
     *  kCFStreamPropertyFTPAttemptPersistentConnection
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations.  CFBoolean
     * type.  TRUE by default, set to FALSE to avoid reusing existing
     * server connections.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPAttemptPersistentConnection();

    /**
     *  kCFStreamPropertyFTPProxy
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations.
     * CFDictionary type that holds key-value pairs of proxy dictionary.
     * The dictionary returned by SystemConfiguration can also be
     * passed directly as the value.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxy();

    /**
     *  kCFStreamPropertyFTPProxyHost
     * 
     *  Discussion:
     * Stream property key or FTP Proxy dictionary key, for both set and
     * copy operations.  It matches kSCPropNetProxiesFTPProxy defined in
     * SCSchemaDefinitions.h.  CFString for proxy server host name.
     * This property can be set and copied individually or via a
     * CFDictionary.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyHost();

    /**
     *  kCFStreamPropertyFTPProxyPort
     * 
     *  Discussion:
     * Stream property key or FTP Proxy dictionary key, for both set and
     * copy operations.  It matches kSCPropNetProxiesFTPPort defined in
     * SCSchemaDefinitions.h.  CFNumber of kCFNumberIntType for proxy
     * server port number.  This property can be set and copied
     * individually or via a CFDictionary.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyPort();

    /**
     * kCFStreamPropertyFTPProxyUser
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyUser();

    /**
     * kCFStreamPropertyFTPProxyPassword
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyPassword();

    /**
     *  kCFFTPResourceMode
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFNumber to hold the
     * resource access permission defined in sys/types.h.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceMode();

    /**
     *  kCFFTPResourceName
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFString that holds
     * the resource name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceName();

    /**
     *  kCFFTPResourceOwner
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFString that holds
     * the resource owner's name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceOwner();

    /**
     *  kCFFTPResourceGroup
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFString to hold the
     * name of the group that shares the resource.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceGroup();

    /**
     *  kCFFTPResourceLink
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFString to hold
     * symbolic link information.  If the item is a symbolic link the
     * string will contain the path to the item the link references.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceLink();

    /**
     *  kCFFTPResourceSize
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFNumber of
     * kCFNumberLongLongType to hold the resource length in bytes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceSize();

    /**
     *  kCFFTPResourceType
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFNumber to hold the
     * resource type as defined in sys/dirent.h.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceType();

    /**
     *  kCFFTPResourceModDate
     * 
     *  Discussion:
     * CFDictionary key, for get value operation.  CFDate to hold the
     * last modification date and time information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceModDate();

    /**
     *  kCFHTTPVersion1_0
     * 
     *  Discussion:
     * Version string for HTTP 1.0.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion1_0();

    /**
     *  kCFHTTPVersion1_1
     * 
     *  Discussion:
     * Version string for HTTP 1.1.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion1_1();

    /**
     *  kCFHTTPVersion2_0
     * 
     *  Discussion:
     * Version string for HTTP 2.0.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion2_0();

    /**
     *  kCFHTTPAuthenticationSchemeBasic
     * 
     *  Discussion:
     * HTTP Basic authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeBasic();

    /**
     *  kCFHTTPAuthenticationSchemeDigest
     * 
     *  Discussion:
     * HTTP Digest Access authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeDigest();

    /**
     *  kCFHTTPAuthenticationSchemeNTLM
     * 
     *  Discussion:
     * HTTP NTLM authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNTLM();

    /**
     *  kCFHTTPAuthenticationSchemeKerberos
     * 
     *  Discussion:
     * HTTP Negotiate authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeKerberos();

    /**
     *  kCFHTTPAuthenticationSchemeNegotiate
     * 
     *  Discussion:
     * HTTP Negotiate authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate();

    /**
     *  kCFHTTPAuthenticationSchemeNegotiate2
     * 
     *  Discussion:
     * HTTP Negotiate v2 authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate2();

    /**
     *  kCFHTTPAuthenticationSchemeXMobileMeAuthToken
     * 
     *  Discussion:
     * HTTP XMobileMeAuthToken authentication scheme.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeXMobileMeAuthToken();

    /**
     *  kCFStreamErrorDomainHTTP
     * 
     *  Discussion:
     * Result code returned by HTTP server
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainHTTP();

    /**
     *  kCFStreamPropertyHTTPResponseHeader
     * 
     *  Discussion:
     * Stream property key, for copy operations. Value is a
     * CFHTTPMessage with 0 bytes data.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPResponseHeader();

    /**
     *  kCFStreamPropertyHTTPFinalURL   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key, for copy operations. The response header
     * value is the CFURL from the final request; will only differ from
     * the URL in the original request if an autoredirection has
     * occurred.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPFinalURL();

    /**
     *  kCFStreamPropertyHTTPFinalRequest   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key, for copy operations. The value is the
     * CFHTTPMessage transmitted by the stream, after all modifications
     * (such as for authentication, connection policy, or redirection)
     * have been made.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPFinalRequest();

    /**
     *  kCFStreamPropertyHTTPProxy   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key, for both set and copy operations. The value
     * is a CFDictionary. HTTP proxy information is set the same way as
     * SOCKS proxies (see CFSocketStream.h). Call
     * CFReadStreamSetProperty() passing an HTTP stream and the property
     * kCFStreamPropertyHTTPProxy. The value should include at least one
     * Host/Port pair from the keys below. Use the dictionary returned
     * by SystemConfiguration.framework to set the default values for
     * the system. HTTP proxies are not applied automatically.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxy();

    /**
     *  kCFStreamPropertyHTTPProxyHost   *** DEPRECATED ***
     * 
     *  Discussion:
     * Proxy dictionary key. The hostname of an HTTP proxy. The value is
     * a CFString. The key name matches kSCPropNetProxiesHTTPProxy.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxyHost();

    /**
     *  kCFStreamPropertyHTTPProxyPort   *** DEPRECATED ***
     * 
     *  Discussion:
     * Proxy dictionary key. Value is a CFNumber.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxyPort();

    /**
     *  kCFStreamPropertyHTTPSProxyHost   *** DEPRECATED ***
     * 
     *  Discussion:
     * Proxy dictionary key. Value is a CFString.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPSProxyHost();

    /**
     *  kCFStreamPropertyHTTPSProxyPort   *** DEPRECATED ***
     * 
     *  Discussion:
     * Proxy dictionary key. Value is a CFNumber.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPSProxyPort();

    /**
     *  kCFStreamPropertyHTTPShouldAutoredirect   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key. Value is a CFBoolean. Redirection is not
     * performed by default.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPShouldAutoredirect();

    /**
     *  kCFStreamPropertyHTTPAttemptPersistentConnection   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key. Value is a CFBoolean.  If this property is
     * set to kCFBooleanTrue, an HTTP stream will look for an
     * appropriate extant persistent connection to use, and if it finds
     * none, will try to create one. Persistent connections are not used
     * by default.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPAttemptPersistentConnection();

    /**
     *  kCFStreamPropertyHTTPRequestBytesWrittenCount   *** DEPRECATED ***
     * 
     *  Discussion:
     * Stream property key. Value is a CFNumber. This property can only
     * be retrieved, not set. The number returned is the number of bytes
     * from the body of the request that have been written to the
     * underlying socket
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPRequestBytesWrittenCount();

    /**
     *  kCFHTTPAuthenticationUsername
     * 
     *  Discussion:
     * CFDictionary key, for CFHTTPMessageApplyCredentialDictionary. The
     * username for authentication as a CFString.  Needs to be added if
     * CFHTTPAuthenticationRequiresUserNameAndPassword returns TRUE.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationUsername();

    /**
     *  kCFHTTPAuthenticationPassword
     * 
     *  Discussion:
     * CFDictionary key, for CFHTTPMessageApplyCredentialDictionary. The
     * password for authentication as a CFString.  Needs to be added if
     * CFHTTPAuthenticationRequiresUserNameAndPassword returns TRUE.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationPassword();

    /**
     *  kCFHTTPAuthenticationAccountDomain
     * 
     *  Discussion:
     * CFDictionary key, for CFHTTPMessageApplyCredentialDictionary. The
     * domain for authentication as a CFString.  Needs to be added if
     * CFHTTPAuthenticationRequiresAccountDomain returns TRUE.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationAccountDomain();

    /**
     *  kCFProxyTypeKey
     * 
     *  Discussion:
     * Key for the type of proxy being represented; value will be one of
     * the kCFProxyType constants listed below.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeKey();

    /**
     *  kCFProxyHostNameKey
     * 
     *  Discussion:
     * Key for the proxy's hostname; value is a CFString.  Note that
     * this may be an IPv4 or IPv6 dotted-IP string.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyHostNameKey();

    /**
     *  kCFProxyPortNumberKey
     * 
     *  Discussion:
     * Key for the proxy's port number; value is a CFNumber specifying
     * the port on which to contact the proxy
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyPortNumberKey();

    /**
     *  kCFProxyAutoConfigurationURLKey
     * 
     *  Discussion:
     * Key for the proxy's PAC file location; this key is only present
     * if the proxy's type is kCFProxyTypeAutoConfigurationURL.  Value
     * is a CFURL specifying the location of a proxy auto-configuration
     * file
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationURLKey();

    /**
     *  kCFProxyAutoConfigurationJavaScriptKey
     * 
     *  Discussion:
     * Key for the proxy's PAC script
     * The value is a CFString that contains the full JavaScript soure text for the PAC file.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationJavaScriptKey();

    /**
     *  kCFProxyUsernameKey
     * 
     *  Discussion:
     * Key for the username to be used with the proxy; value is a
     * CFString. Note that this key will only be present if the username
     * could be extracted from the information passed in.  No external
     * credential stores (like the Keychain) are consulted.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyUsernameKey();

    /**
     *  kCFProxyPasswordKey
     * 
     *  Discussion:
     * Key for the password to be used with the proxy; value is a
     * CFString. Note that this key will only be present if the username
     * could be extracted from the information passed in.  No external
     * credential stores (like the Keychain) are consulted.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyPasswordKey();

    /**
     * kCFProxyTypeNone
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeNone();

    /**
     * kCFProxyTypeHTTP
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeHTTP();

    /**
     * kCFProxyTypeHTTPS
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeHTTPS();

    /**
     * kCFProxyTypeSOCKS
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeSOCKS();

    /**
     * kCFProxyTypeFTP
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeFTP();

    /**
     * kCFProxyTypeAutoConfigurationURL
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeAutoConfigurationURL();

    /**
     * kCFProxyTypeAutoConfigurationJavaScript
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeAutoConfigurationJavaScript();

    /**
     * kCFProxyAutoConfigHTTPResponse
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationHTTPResponseKey();

    /**
     *  kCFNetworkProxiesHTTPEnable
     * 
     *  Discussion:
     * Key for the enabled status of the HTTP proxy; value is a
     * CFNumber.  The proxy is enabled if the key is present and has a non-zero value.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPEnable();

    /**
     *  kCFNetworkProxiesHTTPPort
     * 
     *  Discussion:
     * Key for the port number associated with the HTTP proxy; value is a
     * CFNumber which is the port number.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPPort();

    /**
     *  kCFNetworkProxiesHTTPProxy
     * 
     *  Discussion:
     * Key for the host name associated with the HTTP proxy; value is a
     * CFString which is the proxy host name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPProxy();

    /**
     *  kCFNetworkProxiesProxyAutoConfigEnable
     * 
     *  Discussion:
     * Key for the enabled status ProxyAutoConfig (PAC); value is a
     * CFNumber.  ProxyAutoConfig is enabled if the key is present and has a non-zero value.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigEnable();

    /**
     *  kCFNetworkProxiesProxyAutoConfigURLString
     * 
     *  Discussion:
     * Key for the url which indicates the location of the ProxyAutoConfig (PAC) file; value is a
     * CFString which is url for the PAC file.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigURLString();

    /**
     * kCFNetworkProxiesProxyAutoConfigJavaScript
     * 
     * Discussion:
     * Key for the string which is the full JavaScript source of the ProxyAutoConfig (PAC) script;  value is a
     * CFString with is the full text source of the PAC script.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigJavaScript();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFHostSetClient {
        @Generated
        void call_CFHostSetClient(CFHostRef arg0, int arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceSetClient {
        @Generated
        void call_CFNetServiceSetClient(CFNetServiceRef arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceMonitorCreate {
        @Generated
        void call_CFNetServiceMonitorCreate(CFNetServiceMonitorRef arg0, CFNetServiceRef arg1, int arg2, CFDataRef arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg4, VoidPtr arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceBrowserCreate {
        @Generated
        void call_CFNetServiceBrowserCreate(CFNetServiceBrowserRef arg0, @NUInt long arg1, ConstVoidPtr arg2,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetworkExecuteProxyAutoConfigurationScript {
        @Generated
        void call_CFNetworkExecuteProxyAutoConfigurationScript(VoidPtr arg0, CFArrayRef arg1, CFErrorRef arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetworkExecuteProxyAutoConfigurationURL {
        @Generated
        void call_CFNetworkExecuteProxyAutoConfigurationURL(VoidPtr arg0, CFArrayRef arg1, CFErrorRef arg2);
    }

    /**
     * responsive (time sensitive) data
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeResponsiveData();

    /**
     * multimedia audio/video streaming
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeAVStreaming();

    /**
     * responsive multimedia audio/video
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeResponsiveAV();

    /**
     * kCFStreamPropertyAllowExpensiveNetworkAccess
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * The value is a CFBooleanRef which indicates whether the connection
     * is allowed to use network interfaces that are marked expensive.  A value of
     * kCFBooleanTrue (the default) allows use of expensive interfaces.  kCFBooleanFalse
     * disallows use of expensive interfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyAllowExpensiveNetworkAccess();

    /**
     * kCFStreamPropertyConnectionIsExpensive
     * 
     * Discussion:
     * Stream property key for copy operations.  Returns a CFBooleanRef value
     * of kCFBooleanTrue if the stream has connected using an "expensive" interface.
     * It returns kCFBooleanFalse if the stream is conneceted over an "inexpensive"
     * interface.  If the connection has not been established yet NULL will be returned.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyConnectionIsExpensive();

    /**
     * kCFStreamPropertyAllowConstrainedNetworkAccess
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * The value is a CFBooleanRef which indicates whether the connection
     * is allowed to use "constrained" networks.  A value of kCFBooleanTrue (the default)
     * allows the  use of constrained interfaces.  kCFBooleanFalse
     * disallows use of constrained interfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyAllowConstrainedNetworkAccess();

    /**
     *  kCFHTTPVersion3_0
     * 
     *  Discussion:
     * Version string for HTTP 3.0.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion3_0();
}
