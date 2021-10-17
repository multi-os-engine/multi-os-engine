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

/**
 * [@interface] NEAppProxyFlow
 * <p>
 * The NEAppProxyFlow class is an abstract base class that declares the programmatic interface for a flow of network data.
 * <p>
 * NEAppProxyFlow is part of NetworkExtension.framework.
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppProxyFlow extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppProxyFlow(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppProxyFlow alloc();

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
     * closeReadWithError:
     * <p>
     * This function is used by an NEProvider implementation to indicate that it does not want to receive any more data from the flow.
     *
     * @param error An error in NEAppProxyErrorDomain that should be passed to the flow's source application.
     */
    @Generated
    @Selector("closeReadWithError:")
    public native void closeReadWithError(NSError error);

    /**
     * closeWriteWithError:
     * <p>
     * This functions is used by an NEProvider implementation to indicate that it does not have any more data to write to the flow.
     *
     * @param error An error in NEAppProxyErrorDomain that should be passed to the flow's source application.
     */
    @Generated
    @Selector("closeWriteWithError:")
    public native void closeWriteWithError(NSError error);

    @Generated
    @Selector("init")
    public native NEAppProxyFlow init();

    /**
     * [@property] metaData
     * <p>
     * An NEFlowMetaData object containing meta data for the flow.
     */
    @Generated
    @Selector("metaData")
    public native NEFlowMetaData metaData();

    /**
     * openWithLocalEndpoint:completionHandler:
     * <p>
     * This function is used by an NEProvider implementation to indicate that it is ready to handle flow data.
     *
     * @param localEndpoint     The address and port that should be used as the local endpoint of the socket associated with this flow. If the source application already specifed a local endpoint by binding the socket then this parameter is ignored.
     * @param completionHandler A block that is called when the process of opening flow is complete. A nil value passed to this block indicates that the flow was opened successfully. A non-nil NSError value indicates that the flow failed to open successfully.
     */
    @Generated
    @Selector("openWithLocalEndpoint:completionHandler:")
    public native void openWithLocalEndpointCompletionHandler(NWHostEndpoint localEndpoint,
            @ObjCBlock(name = "call_openWithLocalEndpointCompletionHandler") Block_openWithLocalEndpointCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithLocalEndpointCompletionHandler {
        @Generated
        void call_openWithLocalEndpointCompletionHandler(NSError error);
    }

    /**
     * [@property] networkInterface
     * <p>
     * An nw_interface_t containing information about the network interface used by the flow. If the flow's data is transported using a different interface, this property
     * should be set to that interface.
     */
    @Generated
    @Selector("networkInterface")
    public native NSObject networkInterface();

    /**
     * [@property] networkInterface
     * <p>
     * An nw_interface_t containing information about the network interface used by the flow. If the flow's data is transported using a different interface, this property
     * should be set to that interface.
     */
    @Generated
    @Selector("setNetworkInterface:")
    public native void setNetworkInterface(NSObject value);

    /**
     * [@property] remoteHostname
     * <p>
     * If the flow was created by passing a hostname to a "connect by name" API such as NSURLSession or Network.framework, this property is set to the
     * remote hostname.
     */
    @Generated
    @Selector("remoteHostname")
    public native String remoteHostname();

    /**
     * [@property] isBound
     * <p>
     * YES if the flow was bound by the application to a specific interface (contained in the networkInterface property), NO otherwise.
     */
    @Generated
    @Selector("isBound")
    public native boolean isBound();
}
