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

/**
 * [@interface] NEAppProxyTCPFlow
 * <p>
 * The NEAppProxyTCPFlow class declares the programmatic interface of an object that is used by NEAppProxyProvider
 * implementations to proxy the payload of TCP connections.
 * <p>
 * NEAppProxyTCPFlow is part of NetworkExtension.framework
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppProxyTCPFlow extends NEAppProxyFlow {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppProxyTCPFlow(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppProxyTCPFlow alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEAppProxyTCPFlow allocWithZone(VoidPtr zone);

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
    public static native NEAppProxyTCPFlow new_objc();

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

    @Generated
    @Selector("init")
    public native NEAppProxyTCPFlow init();

    /**
     * readDataWithCompletionHandler:
     * <p>
     * Read data from the flow.
     *
     * @param completionHandler A block that will be executed when some data is read from the flow. The block is passed
     *                          either the data that was read or a non-nil error if an error occurred. If data has a
     *                          length of 0 then no data can be subsequently read from the flow. The completion handler
     *                          is only called for the single read operation that was initiated by calling this method.
     *                          If the caller wants to read more data then it should call this method again to schedule
     *                          another read operation and another execution of the completion handler block.
     */
    @Generated
    @Selector("readDataWithCompletionHandler:")
    public native void readDataWithCompletionHandler(
            @ObjCBlock(name = "call_readDataWithCompletionHandler") Block_readDataWithCompletionHandler completionHandler);

    /**
     * [@property] remoteEndpoint
     * <p>
     * An NWEndpoint object containing information about the intended remote endpoint of the flow.
     */
    @Generated
    @Selector("remoteEndpoint")
    public native NWEndpoint remoteEndpoint();

    /**
     * writeData:completionHandler
     * <p>
     * Write data to the flow.
     *
     * @param data              The data to write.
     * @param completionHandler A block that will be executed when the data is written into the associated socket's
     *                          receive buffer. The caller should use this callback as an indication that it is possible
     *                          to write more data to the flow without using up excessive buffer memory. If an error
     *                          occurs while writing the data then a non-nil NSError object is passed to the block.
     */
    @Generated
    @Selector("writeData:withCompletionHandler:")
    public native void writeDataWithCompletionHandler(NSData data,
            @ObjCBlock(name = "call_writeDataWithCompletionHandler") Block_writeDataWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readDataWithCompletionHandler {
        @Generated
        void call_readDataWithCompletionHandler(NSData data, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDataWithCompletionHandler {
        @Generated
        void call_writeDataWithCompletionHandler(NSError error);
    }
}
