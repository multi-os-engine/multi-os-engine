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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NWUDPSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NWUDPSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NWUDPSession alloc();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * currentPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/currentPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPath")
    public native NWPath currentPath();

    /**
     * endpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/endpoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("endpoint")
    public native NWEndpoint endpoint();

    /**
     * hasBetterPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/hasBetterPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasBetterPath")
    public native boolean hasBetterPath();

    @Generated
    @Selector("init")
    public native NWUDPSession init();

    /**
     * initWithUpgradeForSession:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/initWithUpgradeForSession:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUpgradeForSession:")
    public native NWUDPSession initWithUpgradeForSession(NWUDPSession session);

    /**
     * viable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/viable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isViable")
    public native boolean isViable();

    /**
     * maximumDatagramLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/maximumDatagramLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumDatagramLength")
    @NUInt
    public native long maximumDatagramLength();

    /**
     * resolvedEndpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/resolvedEndpoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolvedEndpoint")
    public native NWEndpoint resolvedEndpoint();

    /**
     * setReadHandler:maxDatagrams:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/setReadHandler:maxDatagrams:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReadHandler:maxDatagrams:")
    public native void setReadHandlerMaxDatagrams(
            @ObjCBlock(name = "call_setReadHandlerMaxDatagrams") Block_setReadHandlerMaxDatagrams handler,
            @NUInt long maxDatagrams);

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instp/NWUDPSession/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * tryNextResolvedEndpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/tryNextResolvedEndpoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("tryNextResolvedEndpoint")
    public native void tryNextResolvedEndpoint();

    /**
     * writeDatagram:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/writeDatagram:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeDatagram:completionHandler:")
    public native void writeDatagramCompletionHandler(NSData datagram,
            @ObjCBlock(name = "call_writeDatagramCompletionHandler") Block_writeDatagramCompletionHandler completionHandler);

    /**
     * writeMultipleDatagrams:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWUDPSessionClassRef/index.html#//apple_ref/occ/instm/NWUDPSession/writeMultipleDatagrams:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeMultipleDatagrams:completionHandler:")
    public native void writeMultipleDatagramsCompletionHandler(NSArray<? extends NSData> datagramArray,
            @ObjCBlock(name = "call_writeMultipleDatagramsCompletionHandler") Block_writeMultipleDatagramsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReadHandlerMaxDatagrams {
        @Generated
        void call_setReadHandlerMaxDatagrams(NSArray<? extends NSData> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDatagramCompletionHandler {
        @Generated
        void call_writeDatagramCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeMultipleDatagramsCompletionHandler {
        @Generated
        void call_writeMultipleDatagramsCompletionHandler(NSError arg0);
    }
}
