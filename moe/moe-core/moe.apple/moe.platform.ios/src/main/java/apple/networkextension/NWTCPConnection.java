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
public class NWTCPConnection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NWTCPConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NWTCPConnection alloc();

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * connectedPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/connectedPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("connectedPath")
    public native NWPath connectedPath();

    /**
     * endpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/endpoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("endpoint")
    public native NWEndpoint endpoint();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * hasBetterPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/hasBetterPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasBetterPath")
    public native boolean hasBetterPath();

    @Generated
    @Selector("init")
    public native NWTCPConnection init();

    /**
     * initWithUpgradeForConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/initWithUpgradeForConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUpgradeForConnection:")
    public native NWTCPConnection initWithUpgradeForConnection(NWTCPConnection connection);

    /**
     * viable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/viable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isViable")
    public native boolean isViable();

    /**
     * localAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/localAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("localAddress")
    public native NWEndpoint localAddress();

    /**
     * readLength:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/readLength:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readLength:completionHandler:")
    public native void readLengthCompletionHandler(@NUInt long length,
            @ObjCBlock(name = "call_readLengthCompletionHandler") Block_readLengthCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readLengthCompletionHandler {
        @Generated
        void call_readLengthCompletionHandler(NSData arg0, NSError arg1);
    }

    /**
     * readMinimumLength:maximumLength:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/readMinimumLength:maximumLength:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readMinimumLength:maximumLength:completionHandler:")
    public native void readMinimumLengthMaximumLengthCompletionHandler(@NUInt long minimum, @NUInt long maximum,
            @ObjCBlock(name = "call_readMinimumLengthMaximumLengthCompletionHandler") Block_readMinimumLengthMaximumLengthCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMinimumLengthMaximumLengthCompletionHandler {
        @Generated
        void call_readMinimumLengthMaximumLengthCompletionHandler(NSData arg0, NSError arg1);
    }

    /**
     * remoteAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/remoteAddress">iOS Dev Center</a>
     */
    @Generated
    @Selector("remoteAddress")
    public native NWEndpoint remoteAddress();

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * txtRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instp/NWTCPConnection/txtRecord">iOS Dev Center</a>
     */
    @Generated
    @Selector("txtRecord")
    public native NSData txtRecord();

    /**
     * write:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/write:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("write:completionHandler:")
    public native void writeCompletionHandler(NSData data,
            @ObjCBlock(name = "call_writeCompletionHandler") Block_writeCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeCompletionHandler {
        @Generated
        void call_writeCompletionHandler(NSError arg0);
    }

    /**
     * writeClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionClassRef/index.html#//apple_ref/occ/instm/NWTCPConnection/writeClose">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeClose")
    public native void writeClose();

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
}
