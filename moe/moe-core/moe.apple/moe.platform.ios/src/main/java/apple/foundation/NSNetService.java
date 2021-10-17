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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSNetServiceDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNetService extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNetService(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNetService alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Returns an NSData created from the provided dictionary. The keys in the provided dictionary must be NSStrings, and the values must be NSDatas. If the dictionary cannot be converted into an NSData suitable for a TXT record, this method will return nil. For applications linked on or after Mac OS X 10.5, this method will throw an NSInvalidArgumentException if it is passed nil as the argument.
     */
    @Generated
    @Selector("dataFromTXTRecordDictionary:")
    public static native NSData dataFromTXTRecordDictionary(NSDictionary<String, ? extends NSData> txtDictionary);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns an NSDictionary created from the provided NSData. The keys will be UTF8-encoded NSStrings. The values are NSDatas. The caller is responsible for interpreting these as types appropriate to the keys. If the NSData cannot be converted into an appropriate NSDictionary, this method will return nil. For applications linked on or after Mac OS X 10.5, this method will throw an NSInvalidException if it is passed nil as the argument.
     */
    @Generated
    @Selector("dictionaryFromTXTRecordData:")
    public static native NSDictionary<String, ? extends NSData> dictionaryFromTXTRecordData(NSData txtData);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the raw TXT record of the NSNetService instance. If the instance has not been resolved, or the delegate's -netService:didUpdateTXTRecordData: has not been called, this will return nil. It is permitted to have a zero-length TXT record.
     */
    @Generated
    @Selector("TXTRecordData")
    public native NSData TXTRecordData();

    /**
     * The addresses of the service. This is an NSArray of NSData instances, each of which contains a single struct sockaddr suitable for use with connect(2). In the event that no addresses are resolved for the service or the service has not yet been resolved, an empty NSArray is returned.
     */
    @Generated
    @Selector("addresses")
    public native NSArray<? extends NSData> addresses();

    /**
     * Set a delegate to receive publish, resolve, or monitor events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSNetServiceDelegate delegate();

    /**
     * Returns the domain of the discovered or published service.
     */
    @Generated
    @Selector("domain")
    public native String domain();

    /**
     * Retrieves streams from the NSNetService instance. The instance's delegate methods are not called. Returns YES if the streams requested are created successfully. Returns NO if or any reason the stream could not be created. If only one stream is desired, pass NULL for the address of the other stream. The streams that are created are not open, and are not scheduled in any run loop for any mode.
     */
    @Generated
    @Selector("getInputStream:outputStream:")
    public native boolean getInputStreamOutputStream(
            @ReferenceInfo(type = NSInputStream.class) Ptr<NSInputStream> inputStream,
            @ReferenceInfo(type = NSOutputStream.class) Ptr<NSOutputStream> outputStream);

    /**
     * Returns the DNS host name of the computer hosting the discovered or published service. If a successful resolve has not yet occurred, this method will return nil.
     */
    @Generated
    @Selector("hostName")
    public native String hostName();

    /**
     * Initially set to NO. Set to YES to also publish, resolve, or monitor this service over peer to peer Wi-Fi (if available). Must be set before operation starts.
     */
    @Generated
    @Selector("includesPeerToPeer")
    public native boolean includesPeerToPeer();

    @Generated
    @Selector("init")
    public native NSNetService init();

    /**
     * This is the initializer for resolution. If you know the domain, type and name of the service for which you wish to discover addresses, you should initialize an NSNetService instance using this method and call resolve: on the result. If you wish to connect to this service immediately, you should call getInputStream:getOutputStream: on the result and forego the resolution step entirely.
     * <p>
     * If publish: is called on an NSNetService instance initialized with this method, an NSNetServicesBadArgumentError will be sent in the error dictionary to the delegate's netService:didNotPublish: method.
     */
    @Generated
    @Selector("initWithDomain:type:name:")
    public native NSNetService initWithDomainTypeName(String domain, String type, String name);

    /**
     * This is the initializer for publishing. You should use this initializer if you are going to announce the availability of a service on the network. To publish a service in all available domains, pass the empty string as the domain.
     */
    @Generated
    @Selector("initWithDomain:type:name:port:")
    public native NSNetService initWithDomainTypeNamePort(String domain, String type, String name, int port);

    /**
     * Returns the name of the discovered or published service.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The port of a resolved service. This returns -1 if the service has not been resolved.
     */
    @Generated
    @Selector("port")
    @NInt
    public native long port();

    /**
     * Advertises a given service on the network. This method returns immediately. Success or failure is indicated by callbacks to the NSNetService instance's delegate.
     * <p>
     * If the name of the service is the default name (@""), then the service will be renamed automatically. If the name of the service has been specified, then the service will not be renamed automatically. If more control over renaming is required, then -[NSNetService publishWithOptions:] is available.
     */
    @Generated
    @Selector("publish")
    public native void publish();

    /**
     * Advertises a given service on the network. This method returns immediately. Success or failure is indicated by callbacks to the NSNetService instance's delegate.
     * <p>
     * See the notes above for NSNetServiceNoAutoRename for information about controlling the auto-renaming behavior using this method.
     */
    @Generated
    @Selector("publishWithOptions:")
    public native void publishWithOptions(@NUInt long options);

    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * Attempts to determine at least one address for the NSNetService instance. For applications linked on or after Mac OS X 10.4 "Tiger", this method calls -resolveWithTimeout: with a value of 5.0. Applications linked prior to Mac OS X 10.4 "Tiger" must call -stop on the instance after an appropriate (short) amount of time to avoid causing unnecessary network traffic.
     */
    @Generated
    @Deprecated
    @Selector("resolve")
    public native void resolve();

    /**
     * Starts a resolve for the NSNetService instance of the specified duration. If the delegate's -netServiceDidResolveAddress: method is called before the timeout expires, the resolve is successful. If the timeout is reached, the delegate's -netService:didNotResolve: method will be called. The value of the NSNetServicesErrorCode key in the error dictionary will be NSNetServicesTimeoutError.
     */
    @Generated
    @Selector("resolveWithTimeout:")
    public native void resolveWithTimeout(double timeout);

    /**
     * NSNetService instances may be scheduled on NSRunLoops to operate in different modes, or in other threads. It is generally not necessary to schedule NSNetServices in other threads. NSNetServices are scheduled in the current thread's NSRunLoop in the NSDefaultRunLoopMode when they are created.
     */
    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * Set a delegate to receive publish, resolve, or monitor events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSNetServiceDelegate value);

    /**
     * Set a delegate to receive publish, resolve, or monitor events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSNetServiceDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Initially set to NO. Set to YES to also publish, resolve, or monitor this service over peer to peer Wi-Fi (if available). Must be set before operation starts.
     */
    @Generated
    @Selector("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean value);

    /**
     * Sets the TXT record of the NSNetService instance that has been or will be published. Pass nil to remove the TXT record from the instance.
     */
    @Generated
    @Selector("setTXTRecordData:")
    public native boolean setTXTRecordData(NSData recordData);

    /**
     * Starts monitoring the NSNetService instance for events. In Mac OS X 10.4 Tiger, monitored NSNetService instances inform their delegates of changes to the instance's TXT record by calling the delegate's -netService:didUpdateTXTRecordData: method.
     */
    @Generated
    @Selector("startMonitoring")
    public native void startMonitoring();

    /**
     * Halts a service which is either publishing or resolving.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * Stops monitoring the NSNetService instance for events.
     */
    @Generated
    @Selector("stopMonitoring")
    public native void stopMonitoring();

    /**
     * Returns the type of the discovered or published service.
     */
    @Generated
    @Selector("type")
    public native String type();
}
