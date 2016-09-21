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

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNetService alloc();

    @Generated
    @Selector("dataFromTXTRecordDictionary:")
    public static native NSData dataFromTXTRecordDictionary(NSDictionary<String, ? extends NSData> txtDictionary);

    @Generated
    @Selector("dictionaryFromTXTRecordData:")
    public static native NSDictionary<String, ? extends NSData> dictionaryFromTXTRecordData(NSData txtData);

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

    @Generated
    @Selector("TXTRecordData")
    public native NSData TXTRecordData();

    @Generated
    @Selector("addresses")
    public native NSArray<? extends NSData> addresses();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSNetServiceDelegate delegate();

    @Generated
    @Selector("domain")
    public native String domain();

    @Generated
    @Selector("getInputStream:outputStream:")
    public native boolean getInputStreamOutputStream(Ptr<NSInputStream> inputStream, Ptr<NSOutputStream> outputStream);

    @Generated
    @Selector("hostName")
    public native String hostName();

    @Generated
    @Selector("includesPeerToPeer")
    public native boolean includesPeerToPeer();

    @Generated
    @Selector("init")
    public native NSNetService init();

    @Generated
    @Selector("initWithDomain:type:name:")
    public native NSNetService initWithDomainTypeName(String domain, String type, String name);

    @Generated
    @Selector("initWithDomain:type:name:port:")
    public native NSNetService initWithDomainTypeNamePort(String domain, String type, String name, int port);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("port")
    @NInt
    public native long port();

    @Generated
    @Selector("publish")
    public native void publish();

    @Generated
    @Selector("publishWithOptions:")
    public native void publishWithOptions(@NUInt long options);

    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    @Generated
    @Deprecated
    @Selector("resolve")
    public native void resolve();

    @Generated
    @Selector("resolveWithTimeout:")
    public native void resolveWithTimeout(double timeout);

    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSNetServiceDelegate value);

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

    @Generated
    @Selector("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean value);

    @Generated
    @Selector("setTXTRecordData:")
    public native boolean setTXTRecordData(NSData recordData);

    @Generated
    @Selector("startMonitoring")
    public native void startMonitoring();

    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("stopMonitoring")
    public native void stopMonitoring();

    @Generated
    @Selector("type")
    public native String type();
}
