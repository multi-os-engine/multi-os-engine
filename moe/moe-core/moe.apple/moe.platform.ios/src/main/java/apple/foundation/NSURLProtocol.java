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
import apple.foundation.protocol.NSURLProtocolClient;
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
public class NSURLProtocol extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLProtocol(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLProtocol alloc();

    /**
     * cachedResponse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instp/NSURLProtocol/cachedResponse">iOS Dev Center</a>
     */
    @Generated
    @Selector("cachedResponse")
    public native NSCachedURLResponse cachedResponse();

    /**
     * canInitWithRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/canInitWithRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canInitWithRequest:")
    public static native boolean canInitWithRequest(NSURLRequest request);

    @Generated
    @Selector("canInitWithTask:")
    public static native boolean canInitWithTask(NSURLSessionTask task);

    /**
     * canonicalRequestForRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/canonicalRequestForRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canonicalRequestForRequest:")
    public static native NSURLRequest canonicalRequestForRequest(NSURLRequest request);

    /**
     * client</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instp/NSURLProtocol/client">iOS Dev Center</a>
     */
    @Generated
    @Selector("client")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLProtocolClient client();

    @Generated
    @Selector("init")
    public native NSURLProtocol init();

    /**
     * initWithRequest:cachedResponse:client:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instm/NSURLProtocol/initWithRequest:cachedResponse:client:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRequest:cachedResponse:client:")
    public native NSURLProtocol initWithRequestCachedResponseClient(NSURLRequest request,
            NSCachedURLResponse cachedResponse, @Mapped(ObjCObjectMapper.class) NSURLProtocolClient client);

    @Generated
    @Selector("initWithTask:cachedResponse:client:")
    public native NSURLProtocol initWithTaskCachedResponseClient(NSURLSessionTask task,
            NSCachedURLResponse cachedResponse, @Mapped(ObjCObjectMapper.class) NSURLProtocolClient client);

    /**
     * propertyForKey:inRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/propertyForKey:inRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyForKey:inRequest:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyForKeyInRequest(String key, NSURLRequest request);

    /**
     * registerClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/registerClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:")
    public static native boolean registerClass(Class protocolClass);

    /**
     * removePropertyForKey:inRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/removePropertyForKey:inRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removePropertyForKey:inRequest:")
    public static native void removePropertyForKeyInRequest(String key, NSMutableURLRequest request);

    /**
     * request</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instp/NSURLProtocol/request">iOS Dev Center</a>
     */
    @Generated
    @Selector("request")
    public native NSURLRequest request();

    /**
     * requestIsCacheEquivalent:toRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/requestIsCacheEquivalent:toRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestIsCacheEquivalent:toRequest:")
    public static native boolean requestIsCacheEquivalentToRequest(NSURLRequest a, NSURLRequest b);

    /**
     * setProperty:forKey:inRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/setProperty:forKey:inRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProperty:forKey:inRequest:")
    public static native void setPropertyForKeyInRequest(@Mapped(ObjCObjectMapper.class) Object value, String key,
            NSMutableURLRequest request);

    /**
     * startLoading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instm/NSURLProtocol/startLoading">iOS Dev Center</a>
     */
    @Generated
    @Selector("startLoading")
    public native void startLoading();

    /**
     * stopLoading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/instm/NSURLProtocol/stopLoading">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopLoading")
    public native void stopLoading();

    @Generated
    @Selector("task")
    public native NSURLSessionTask task();

    /**
     * unregisterClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLProtocol_Class/index.html#//apple_ref/occ/clm/NSURLProtocol/unregisterClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unregisterClass:")
    public static native void unregisterClass(Class protocolClass);

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
