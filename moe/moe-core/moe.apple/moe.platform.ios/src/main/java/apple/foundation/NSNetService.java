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

    /**
     * TXTRecordData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/TXTRecordData">iOS Dev Center</a>
     */
    @Generated
    @Selector("TXTRecordData")
    public native NSData TXTRecordData();

    /**
     * addresses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/addresses">iOS Dev Center</a>
     */
    @Generated
    @Selector("addresses")
    public native NSArray<? extends NSData> addresses();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNetService alloc();

    /**
     * dataFromTXTRecordDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/clm/NSNetService/dataFromTXTRecordDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataFromTXTRecordDictionary:")
    public static native NSData dataFromTXTRecordDictionary(NSDictionary<String, ? extends NSData> txtDictionary);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSNetServiceDelegate delegate();

    /**
     * dictionaryFromTXTRecordData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/clm/NSNetService/dictionaryFromTXTRecordData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryFromTXTRecordData:")
    public static native NSDictionary<String, ? extends NSData> dictionaryFromTXTRecordData(NSData txtData);

    /**
     * domain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/domain">iOS Dev Center</a>
     */
    @Generated
    @Selector("domain")
    public native String domain();

    /**
     * getInputStream:outputStream:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/getInputStream:outputStream:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getInputStream:outputStream:")
    public native boolean getInputStreamOutputStream(Ptr<NSInputStream> inputStream, Ptr<NSOutputStream> outputStream);

    /**
     * hostName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/hostName">iOS Dev Center</a>
     */
    @Generated
    @Selector("hostName")
    public native String hostName();

    /**
     * includesPeerToPeer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/includesPeerToPeer">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesPeerToPeer")
    public native boolean includesPeerToPeer();

    @Generated
    @Selector("init")
    public native NSNetService init();

    /**
     * initWithDomain:type:name:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/initWithDomain:type:name:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDomain:type:name:")
    public native NSNetService initWithDomainTypeName(String domain, String type, String name);

    /**
     * initWithDomain:type:name:port:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/initWithDomain:type:name:port:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDomain:type:name:port:")
    public native NSNetService initWithDomainTypeNamePort(String domain, String type, String name, int port);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * port</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/port">iOS Dev Center</a>
     */
    @Generated
    @Selector("port")
    @NInt
    public native long port();

    /**
     * publish</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/publish">iOS Dev Center</a>
     */
    @Generated
    @Selector("publish")
    public native void publish();

    /**
     * publishWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/publishWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("publishWithOptions:")
    public native void publishWithOptions(@NUInt long options);

    /**
     * removeFromRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/removeFromRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * resolve</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/resolve">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("resolve")
    public native void resolve();

    /**
     * resolveWithTimeout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/resolveWithTimeout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveWithTimeout:")
    public native void resolveWithTimeout(double timeout);

    /**
     * scheduleInRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/scheduleInRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSNetServiceDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/delegate">iOS Dev Center</a>
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
     * includesPeerToPeer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/includesPeerToPeer">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean value);

    /**
     * setTXTRecordData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/setTXTRecordData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTXTRecordData:")
    public native boolean setTXTRecordData(NSData recordData);

    /**
     * startMonitoring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/startMonitoring">iOS Dev Center</a>
     */
    @Generated
    @Selector("startMonitoring")
    public native void startMonitoring();

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * stopMonitoring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instm/NSNetService/stopMonitoring">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopMonitoring")
    public native void stopMonitoring();

    /**
     * type</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetService_Class/index.html#//apple_ref/occ/instp/NSNetService/type">iOS Dev Center</a>
     */
    @Generated
    @Selector("type")
    public native String type();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
