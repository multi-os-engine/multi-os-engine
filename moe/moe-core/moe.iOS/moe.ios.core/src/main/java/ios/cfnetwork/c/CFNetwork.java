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

package ios.cfnetwork.c;


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

import ios.cfnetwork.opaque.CFHTTPAuthenticationRef;
import ios.cfnetwork.opaque.CFHTTPMessageRef;
import ios.cfnetwork.opaque.CFHostRef;
import ios.cfnetwork.opaque.CFNetDiagnosticRef;
import ios.cfnetwork.opaque.CFNetServiceBrowserRef;
import ios.cfnetwork.opaque.CFNetServiceMonitorRef;
import ios.cfnetwork.opaque.CFNetServiceRef;
import ios.cfnetwork.struct.CFHostClientContext;
import ios.cfnetwork.struct.CFNetServiceClientContext;
import ios.corefoundation.opaque.CFAllocatorRef;
import ios.corefoundation.opaque.CFArrayRef;
import ios.corefoundation.opaque.CFDataRef;
import ios.corefoundation.opaque.CFDictionaryRef;
import ios.corefoundation.opaque.CFErrorRef;
import ios.corefoundation.opaque.CFReadStreamRef;
import ios.corefoundation.opaque.CFRunLoopRef;
import ios.corefoundation.opaque.CFRunLoopSourceRef;
import ios.corefoundation.opaque.CFStringRef;
import ios.corefoundation.opaque.CFURLRef;
import ios.corefoundation.opaque.CFWriteStreamRef;
import ios.corefoundation.struct.CFStreamClientContext;
import ios.corefoundation.struct.CFStreamError;

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
	 * CFHostGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFHostGetTypeID();

	/**
	 * CFHostCreateWithName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostCreateWithName">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHostRef CFHostCreateWithName(
			CFAllocatorRef allocator, CFStringRef hostname);

	/**
	 * CFHostCreateWithAddress</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostCreateWithAddress">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHostRef CFHostCreateWithAddress(
			CFAllocatorRef allocator, CFDataRef addr);

	/**
	 * CFHostCreateCopy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostCreateCopy">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHostRef CFHostCreateCopy(CFAllocatorRef alloc,
			CFHostRef host);

	/**
	 * CFHostStartInfoResolution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostStartInfoResolution">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHostStartInfoResolution(
			CFHostRef theHost,
			int info,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFHostGetAddressing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostGetAddressing">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFHostGetAddressing(CFHostRef theHost,
			BytePtr hasBeenResolved);

	/**
	 * CFHostGetNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostGetNames">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFHostGetNames(CFHostRef theHost,
			BytePtr hasBeenResolved);

	/**
	 * CFHostGetReachability</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostGetReachability">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDataRef CFHostGetReachability(CFHostRef theHost,
			BytePtr hasBeenResolved);

	/**
	 * CFHostCancelInfoResolution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostCancelInfoResolution">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFHostCancelInfoResolution(CFHostRef theHost,
			int info);

	/**
	 * CFHostSetClient</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostSetClient">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHostSetClient(
			CFHostRef theHost,
			@FunctionPtr(name = "call_CFHostSetClient") Function_CFHostSetClient clientCB,
			@UncertainArgument("Options: reference, array Fallback: reference") CFHostClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFHostSetClient {
		@Generated
		void call_CFHostSetClient(
				VoidPtr arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg2,
				VoidPtr arg3);
	}

	/**
	 * CFHostScheduleWithRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostScheduleWithRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFHostScheduleWithRunLoop(CFHostRef theHost,
			CFRunLoopRef runLoop, CFStringRef runLoopMode);

	/**
	 * CFHostUnscheduleFromRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHostRef/index.html#//apple_ref/c/func/CFHostUnscheduleFromRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFHostUnscheduleFromRunLoop(CFHostRef theHost,
			CFRunLoopRef runLoop, CFStringRef runLoopMode);

	/**
	 * CFNetServiceGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFNetServiceGetTypeID();

	/**
	 * CFNetServiceMonitorGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFNetServiceMonitorGetTypeID();

	/**
	 * CFNetServiceBrowserGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFNetServiceBrowserGetTypeID();

	/**
	 * CFNetServiceCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetServiceRef CFNetServiceCreate(
			CFAllocatorRef alloc, CFStringRef domain, CFStringRef serviceType,
			CFStringRef name, int port);

	/**
	 * CFNetServiceCreateCopy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceCreateCopy">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetServiceRef CFNetServiceCreateCopy(
			CFAllocatorRef alloc, CFNetServiceRef service);

	/**
	 * CFNetServiceGetDomain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetDomain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFNetServiceGetDomain(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceGetType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFNetServiceGetType(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceGetName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetName">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFNetServiceGetName(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceRegisterWithOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceRegisterWithOptions">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceRegisterWithOptions(
			CFNetServiceRef theService,
			@NUInt long options,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceResolveWithTimeout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceResolveWithTimeout">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceResolveWithTimeout(
			CFNetServiceRef theService,
			double timeout,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceCancel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceCancel">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceCancel(CFNetServiceRef theService);

	/**
	 * CFNetServiceGetTargetHost</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetTargetHost">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFNetServiceGetTargetHost(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceGetPortNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetPortNumber">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CFNetServiceGetPortNumber(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceGetAddressing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetAddressing">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFNetServiceGetAddressing(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceGetTXTData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceGetTXTData">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDataRef CFNetServiceGetTXTData(
			CFNetServiceRef theService);

	/**
	 * CFNetServiceSetTXTData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceSetTXTData">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceSetTXTData(
			CFNetServiceRef theService, CFDataRef txtRecord);

	/**
	 * CFNetServiceCreateDictionaryWithTXTData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceCreateDictionaryWithTXTData">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CFNetServiceCreateDictionaryWithTXTData(
			CFAllocatorRef alloc, CFDataRef txtRecord);

	/**
	 * CFNetServiceCreateTXTDataWithDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceCreateTXTDataWithDictionary">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDataRef CFNetServiceCreateTXTDataWithDictionary(
			CFAllocatorRef alloc, CFDictionaryRef keyValuePairs);

	/**
	 * CFNetServiceSetClient</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceSetClient">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceSetClient(
			CFNetServiceRef theService,
			@FunctionPtr(name = "call_CFNetServiceSetClient") Function_CFNetServiceSetClient clientCB,
			@UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFNetServiceSetClient {
		@Generated
		void call_CFNetServiceSetClient(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg1,
				VoidPtr arg2);
	}

	/**
	 * CFNetServiceScheduleWithRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceScheduleWithRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceScheduleWithRunLoop(
			CFNetServiceRef theService, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFNetServiceUnscheduleFromRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceUnscheduleFromRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceUnscheduleFromRunLoop(
			CFNetServiceRef theService, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFNetServiceMonitorCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetServiceMonitorRef CFNetServiceMonitorCreate(
			CFAllocatorRef alloc,
			CFNetServiceRef theService,
			@FunctionPtr(name = "call_CFNetServiceMonitorCreate") Function_CFNetServiceMonitorCreate clientCB,
			@UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFNetServiceMonitorCreate {
		@Generated
		void call_CFNetServiceMonitorCreate(
				VoidPtr arg0,
				VoidPtr arg1,
				int arg2,
				VoidPtr arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg4,
				VoidPtr arg5);
	}

	/**
	 * CFNetServiceMonitorInvalidate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorInvalidate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceMonitorInvalidate(
			CFNetServiceMonitorRef monitor);

	/**
	 * CFNetServiceMonitorStart</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorStart">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceMonitorStart(
			CFNetServiceMonitorRef monitor,
			int recordType,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceMonitorStop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorStop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceMonitorStop(
			CFNetServiceMonitorRef monitor,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceMonitorScheduleWithRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorScheduleWithRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceMonitorScheduleWithRunLoop(
			CFNetServiceMonitorRef monitor, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFNetServiceMonitorUnscheduleFromRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceMonitorUnscheduleFromRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceMonitorUnscheduleFromRunLoop(
			CFNetServiceMonitorRef monitor, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFNetServiceBrowserCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetServiceBrowserRef CFNetServiceBrowserCreate(
			CFAllocatorRef alloc,
			@FunctionPtr(name = "call_CFNetServiceBrowserCreate") Function_CFNetServiceBrowserCreate clientCB,
			@UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFNetServiceBrowserCreate {
		@Generated
		void call_CFNetServiceBrowserCreate(
				VoidPtr arg0,
				@NUInt long arg1,
				ConstVoidPtr arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg3,
				VoidPtr arg4);
	}

	/**
	 * CFNetServiceBrowserInvalidate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserInvalidate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceBrowserInvalidate(
			CFNetServiceBrowserRef browser);

	/**
	 * CFNetServiceBrowserSearchForDomains</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserSearchForDomains">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceBrowserSearchForDomains(
			CFNetServiceBrowserRef browser,
			byte registrationDomains,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceBrowserSearchForServices</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserSearchForServices">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFNetServiceBrowserSearchForServices(
			CFNetServiceBrowserRef browser,
			CFStringRef domain,
			CFStringRef serviceType,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceBrowserStopSearch</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserStopSearch">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceBrowserStopSearch(
			CFNetServiceBrowserRef browser,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFNetServiceBrowserScheduleWithRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserScheduleWithRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceBrowserScheduleWithRunLoop(
			CFNetServiceBrowserRef browser, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFNetServiceBrowserUnscheduleFromRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetServiceRef/index.html#//apple_ref/c/func/CFNetServiceBrowserUnscheduleFromRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetServiceBrowserUnscheduleFromRunLoop(
			CFNetServiceBrowserRef browser, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	/**
	 * CFSocketStreamSOCKSGetErrorSubdomain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFSocketStreamSOCKSGetErrorSubdomain">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native int CFSocketStreamSOCKSGetErrorSubdomain(
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFSocketStreamSOCKSGetError</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFSocketStreamSOCKSGetError">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native int CFSocketStreamSOCKSGetError(
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFStreamCreatePairWithSocketToCFHost</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreatePairWithSocketToCFHost">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFStreamCreatePairWithSocketToCFHost(
			CFAllocatorRef alloc, CFHostRef host, int port,
			Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

	/**
	 * CFStreamCreatePairWithSocketToNetService</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreatePairWithSocketToNetService">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFStreamCreatePairWithSocketToNetService(
			CFAllocatorRef alloc, CFNetServiceRef service,
			Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

	/**
	 * CFReadStreamCreateWithFTPURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFTPStreamRef/index.html#//apple_ref/c/func/CFReadStreamCreateWithFTPURL">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@CFunction
	public static native CFReadStreamRef CFReadStreamCreateWithFTPURL(
			CFAllocatorRef alloc, CFURLRef ftpURL);

	/**
	 * CFFTPCreateParsedResourceListing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFTPStreamRef/index.html#//apple_ref/c/func/CFFTPCreateParsedResourceListing">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@CFunction
	@NInt
	public static native long CFFTPCreateParsedResourceListing(
			CFAllocatorRef alloc,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
			@NInt long bufferLength, Ptr<CFDictionaryRef> parsed);

	/**
	 * CFWriteStreamCreateWithFTPURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFTPStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCreateWithFTPURL">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@CFunction
	public static native CFWriteStreamRef CFWriteStreamCreateWithFTPURL(
			CFAllocatorRef alloc, CFURLRef ftpURL);

	/**
	 * CFHTTPMessageGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFHTTPMessageGetTypeID();

	/**
	 * CFHTTPMessageCreateRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCreateRequest">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHTTPMessageRef CFHTTPMessageCreateRequest(
			CFAllocatorRef alloc, CFStringRef requestMethod, CFURLRef url,
			CFStringRef httpVersion);

	/**
	 * CFHTTPMessageCreateResponse</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCreateResponse">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHTTPMessageRef CFHTTPMessageCreateResponse(
			CFAllocatorRef alloc, @NInt long statusCode,
			CFStringRef statusDescription, CFStringRef httpVersion);

	/**
	 * CFHTTPMessageCreateEmpty</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCreateEmpty">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHTTPMessageRef CFHTTPMessageCreateEmpty(
			CFAllocatorRef alloc, byte isRequest);

	/**
	 * CFHTTPMessageCreateCopy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCreateCopy">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHTTPMessageRef CFHTTPMessageCreateCopy(
			CFAllocatorRef alloc, CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageIsRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageIsRequest">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageIsRequest(CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageCopyVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyVersion">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPMessageCopyVersion(
			CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageCopyBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyBody">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDataRef CFHTTPMessageCopyBody(
			CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageSetBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageSetBody">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFHTTPMessageSetBody(CFHTTPMessageRef message,
			CFDataRef bodyData);

	/**
	 * CFHTTPMessageCopyHeaderFieldValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyHeaderFieldValue">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPMessageCopyHeaderFieldValue(
			CFHTTPMessageRef message, CFStringRef headerField);

	/**
	 * CFHTTPMessageCopyAllHeaderFields</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyAllHeaderFields">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CFHTTPMessageCopyAllHeaderFields(
			CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageSetHeaderFieldValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageSetHeaderFieldValue">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFHTTPMessageSetHeaderFieldValue(
			CFHTTPMessageRef message, CFStringRef headerField, CFStringRef value);

	/**
	 * CFHTTPMessageAppendBytes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageAppendBytes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageAppendBytes(
			CFHTTPMessageRef message,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
			@NInt long numBytes);

	/**
	 * CFHTTPMessageIsHeaderComplete</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageIsHeaderComplete">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageIsHeaderComplete(
			CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageCopySerializedMessage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopySerializedMessage">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDataRef CFHTTPMessageCopySerializedMessage(
			CFHTTPMessageRef message);

	/**
	 * CFHTTPMessageCopyRequestURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyRequestURL">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFURLRef CFHTTPMessageCopyRequestURL(
			CFHTTPMessageRef request);

	/**
	 * CFHTTPMessageCopyRequestMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyRequestMethod">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPMessageCopyRequestMethod(
			CFHTTPMessageRef request);

	/**
	 * CFHTTPMessageAddAuthentication</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageAddAuthentication">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageAddAuthentication(
			CFHTTPMessageRef request,
			CFHTTPMessageRef authenticationFailureResponse,
			CFStringRef username, CFStringRef password,
			CFStringRef authenticationScheme, byte forProxy);

	/**
	 * CFHTTPMessageGetResponseStatusCode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageGetResponseStatusCode">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long CFHTTPMessageGetResponseStatusCode(
			CFHTTPMessageRef response);

	/**
	 * CFHTTPMessageCopyResponseStatusLine</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageCopyResponseStatusLine">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPMessageCopyResponseStatusLine(
			CFHTTPMessageRef response);

	/**
	 * CFReadStreamCreateForHTTPRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPStreamRef/index.html#//apple_ref/c/func/CFReadStreamCreateForHTTPRequest">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@CFunction
	public static native CFReadStreamRef CFReadStreamCreateForHTTPRequest(
			CFAllocatorRef alloc, CFHTTPMessageRef request);

	/**
	 * CFReadStreamCreateForStreamedHTTPRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPStreamRef/index.html#//apple_ref/c/func/CFReadStreamCreateForStreamedHTTPRequest">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@CFunction
	public static native CFReadStreamRef CFReadStreamCreateForStreamedHTTPRequest(
			CFAllocatorRef alloc, CFHTTPMessageRef requestHeaders,
			CFReadStreamRef requestBody);

	/**
	 * CFHTTPAuthenticationGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CFHTTPAuthenticationGetTypeID();

	/**
	 * CFHTTPAuthenticationCreateFromResponse</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationCreateFromResponse">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFHTTPAuthenticationRef CFHTTPAuthenticationCreateFromResponse(
			CFAllocatorRef alloc, CFHTTPMessageRef response);

	/**
	 * CFHTTPAuthenticationIsValid</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationIsValid">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPAuthenticationIsValid(
			CFHTTPAuthenticationRef auth,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFHTTPAuthenticationAppliesToRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationAppliesToRequest">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPAuthenticationAppliesToRequest(
			CFHTTPAuthenticationRef auth, CFHTTPMessageRef request);

	/**
	 * CFHTTPAuthenticationRequiresOrderedRequests</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationRequiresOrderedRequests">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPAuthenticationRequiresOrderedRequests(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFHTTPMessageApplyCredentials</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageApplyCredentials">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageApplyCredentials(
			CFHTTPMessageRef request,
			CFHTTPAuthenticationRef auth,
			CFStringRef username,
			CFStringRef password,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFHTTPMessageApplyCredentialDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessageRef/index.html#//apple_ref/c/func/CFHTTPMessageApplyCredentialDictionary">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPMessageApplyCredentialDictionary(
			CFHTTPMessageRef request,
			CFHTTPAuthenticationRef auth,
			CFDictionaryRef dict,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

	/**
	 * CFHTTPAuthenticationCopyRealm</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationCopyRealm">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPAuthenticationCopyRealm(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFHTTPAuthenticationCopyDomains</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationCopyDomains">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFHTTPAuthenticationCopyDomains(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFHTTPAuthenticationCopyMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationCopyMethod">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFStringRef CFHTTPAuthenticationCopyMethod(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFHTTPAuthenticationRequiresUserNameAndPassword</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationRequiresUserNameAndPassword">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPAuthenticationRequiresUserNameAndPassword(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFHTTPAuthenticationRequiresAccountDomain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFHTTPAuthenticationRef/index.html#//apple_ref/c/func/CFHTTPAuthenticationRequiresAccountDomain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CFHTTPAuthenticationRequiresAccountDomain(
			CFHTTPAuthenticationRef auth);

	/**
	 * CFNetDiagnosticCreateWithStreams</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetDiagnosticsRef/index.html#//apple_ref/c/func/CFNetDiagnosticCreateWithStreams">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithStreams(
			CFAllocatorRef alloc, CFReadStreamRef readStream,
			CFWriteStreamRef writeStream);

	/**
	 * CFNetDiagnosticCreateWithURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetDiagnosticsRef/index.html#//apple_ref/c/func/CFNetDiagnosticCreateWithURL">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithURL(
			CFAllocatorRef alloc, CFURLRef url);

	/**
	 * CFNetDiagnosticSetName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetDiagnosticsRef/index.html#//apple_ref/c/func/CFNetDiagnosticSetName">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CFNetDiagnosticSetName(
			CFNetDiagnosticRef details, CFStringRef name);

	/**
	 * CFNetDiagnosticDiagnoseProblemInteractively</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetDiagnosticsRef/index.html#//apple_ref/c/func/CFNetDiagnosticDiagnoseProblemInteractively">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long CFNetDiagnosticDiagnoseProblemInteractively(
			CFNetDiagnosticRef details);

	/**
	 * CFNetDiagnosticCopyNetworkStatusPassively</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNetDiagnosticsRef/index.html#//apple_ref/c/func/CFNetDiagnosticCopyNetworkStatusPassively">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long CFNetDiagnosticCopyNetworkStatusPassively(
			CFNetDiagnosticRef details, Ptr<CFStringRef> description);

	/**
	 * CFNetworkCopySystemProxySettings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFProxySupport/index.html#//apple_ref/c/func/CFNetworkCopySystemProxySettings">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CFNetworkCopySystemProxySettings();

	/**
	 * CFNetworkCopyProxiesForURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFProxySupport/index.html#//apple_ref/c/func/CFNetworkCopyProxiesForURL">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFNetworkCopyProxiesForURL(CFURLRef url,
			CFDictionaryRef proxySettings);

	/**
	 * CFNetworkCopyProxiesForAutoConfigurationScript</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFProxySupport/index.html#//apple_ref/c/func/CFNetworkCopyProxiesForAutoConfigurationScript">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CFNetworkCopyProxiesForAutoConfigurationScript(
			CFStringRef proxyAutoConfigurationScript, CFURLRef targetURL,
			Ptr<CFErrorRef> error);

	/**
	 * CFNetworkExecuteProxyAutoConfigurationScript</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFProxySupport/index.html#//apple_ref/c/func/CFNetworkExecuteProxyAutoConfigurationScript">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationScript(
			CFStringRef proxyAutoConfigurationScript,
			CFURLRef targetURL,
			@FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationScript") Function_CFNetworkExecuteProxyAutoConfigurationScript cb,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFNetworkExecuteProxyAutoConfigurationScript {
		@Generated
		void call_CFNetworkExecuteProxyAutoConfigurationScript(
				VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	/**
	 * CFNetworkExecuteProxyAutoConfigurationURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFProxySupport/index.html#//apple_ref/c/func/CFNetworkExecuteProxyAutoConfigurationURL">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationURL(
			CFURLRef proxyAutoConfigURL,
			CFURLRef targetURL,
			@FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationURL") Function_CFNetworkExecuteProxyAutoConfigurationURL cb,
			@UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CFNetworkExecuteProxyAutoConfigurationURL {
		@Generated
		void call_CFNetworkExecuteProxyAutoConfigurationURL(
				VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@CVariable()
	public static native CFStringRef kCFErrorDomainCFNetwork();

	@Generated
	@CVariable()
	public static native CFStringRef kCFErrorDomainWinSock();

	@Generated
	@CVariable()
	public static native CFStringRef kCFURLErrorFailingURLErrorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFURLErrorFailingURLStringErrorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFGetAddrInfoFailureKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFSOCKSStatusCodeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFSOCKSVersionKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFSOCKSNegotiationMethodKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFDNSServiceFailureKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPStatusCodeKey();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainNetDB();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainSystemConfiguration();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainMach();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainNetServices();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySSLContext();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySSLPeerTrust();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSSLValidatesCertificateChain();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySSLSettings();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSSLLevel();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSSLPeerName();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSSLCertificates();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSSLIsServer();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamNetworkServiceType();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamNetworkServiceTypeVoIP();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamNetworkServiceTypeVideo();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamNetworkServiceTypeVoice();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamNetworkServiceTypeBackground();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyNoCellular();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyConnectionIsCellular();

	@Generated
	@CVariable()
	@NInt
	public static native long kCFStreamErrorDomainWinSock();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainSOCKS();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSProxy();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSProxyHost();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSProxyPort();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSOCKSVersion4();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSOCKSVersion5();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSUser();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySOCKSPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyProxyLocalBypass();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainSSL();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySocketSecurityLevel();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSecurityLevelNone();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSecurityLevelSSLv2();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSecurityLevelSSLv3();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSecurityLevelTLSv1();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamSocketSecurityLevelNegotiatedSSL();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyShouldCloseNativeSocket();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySocketRemoteHost();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySocketRemoteNetService();

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

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainFTP();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPUserName();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPUsePassiveMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPResourceSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPFetchResourceInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPFileTransferOffset();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPAttemptPersistentConnection();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPProxy();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPProxyHost();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPProxyPort();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPProxyUser();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyFTPProxyPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceName();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceOwner();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceGroup();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceLink();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceType();

	@Generated
	@CVariable()
	public static native CFStringRef kCFFTPResourceModDate();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPVersion1_0();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPVersion1_1();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeBasic();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeDigest();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeNTLM();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeKerberos();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate2();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeXMobileMeAuthToken();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationSchemeOAuth1();

	@Generated
	@CVariable()
	public static native int kCFStreamErrorDomainHTTP();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPResponseHeader();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPFinalURL();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPFinalRequest();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPProxy();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPProxyHost();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPProxyPort();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPSProxyHost();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPSProxyPort();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPShouldAutoredirect();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPAttemptPersistentConnection();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertyHTTPRequestBytesWrittenCount();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationUsername();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPAuthenticationAccountDomain();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyHostNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyPortNumberKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyAutoConfigurationURLKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyAutoConfigurationJavaScriptKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyUsernameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyPasswordKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeNone();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeHTTP();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeHTTPS();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeSOCKS();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeFTP();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeAutoConfigurationURL();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyTypeAutoConfigurationJavaScript();

	@Generated
	@CVariable()
	public static native CFStringRef kCFProxyAutoConfigurationHTTPResponseKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesHTTPEnable();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesHTTPPort();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesHTTPProxy();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesProxyAutoConfigEnable();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesProxyAutoConfigURLString();

	@Generated
	@CVariable()
	public static native CFStringRef kCFNetworkProxiesProxyAutoConfigJavaScript();

	@Generated
	@CVariable()
	public static native CFStringRef kCFStreamPropertySocketExtendedBackgroundIdleMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCFHTTPVersion2_0();
}
