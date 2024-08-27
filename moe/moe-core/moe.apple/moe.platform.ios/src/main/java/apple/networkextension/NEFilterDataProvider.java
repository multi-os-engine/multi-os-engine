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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEFilterDataProvider
 * 
 * The NEFilterDataProvider class declares the programmatic interface for an object that evaluates network data flows
 * based on a set of locally-available rules and makes decisions about whether to block or allow the flows.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterDataProvider extends NEFilterProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterDataProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterDataProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEFilterDataProvider allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NEFilterDataProvider new_objc();

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
     * handleInboundDataCompleteForFlow:
     * 
     * This function is called by the framework after all of the inbound data for a flow has been seen by the filter.
     * Subclasses must override this method to return an appropriate pass/block result.
     * 
     * @param flow The flow
     * @return The final NEFilterFlowDataVerdict verdict for the flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleInboundDataCompleteForFlow:")
    public native NEFilterDataVerdict handleInboundDataCompleteForFlow(@NotNull NEFilterFlow flow);

    /**
     * handleInboundDataFromFlow:readBytesStartOffset:readBytes:
     * 
     * This function is called by the framework when a filtering decision needs to be made about some inbound data that
     * the filter previously requested access to via the NEFilterFlowDataVerdict or the NEFilterNewFlowVerdict.
     * Subclasses must override this method.
     * 
     * @param flow      The NEFilterFlow from which the data was read.
     * @param offset    The offset in bytes from the start of the flow's inbound data at which readBytes begins.
     * @param readBytes The data that was read. For non-UDP/TCP flows, since data may optionally include the IP header,
     *                  readBytes includes a 4-bytes NEFilterDataAttribute field preceding the user data. Handler must
     *                  examine the NEFilterDataAttribute field and handle the data accordingly.
     * @return An NEFilterFlowDataVerdict containing the verdict for the flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleInboundDataFromFlow:readBytesStartOffset:readBytes:")
    public native NEFilterDataVerdict handleInboundDataFromFlowReadBytesStartOffsetReadBytes(@NotNull NEFilterFlow flow,
            @NUInt long offset, @NotNull NSData readBytes);

    /**
     * handleNewFlow:
     * 
     * This function is called by the framework when a filtering decision needs to be made about a new network data
     * flow. Subclasses must override this method to implement the steps necessary to match the flow against some
     * locally stored rules and return an appropriate verdict.
     * 
     * @param flow An NEFilterFlow object containing details about the new flow.
     * @return An NEFilterNewFlowVerdict object containing the verdict for the new flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleNewFlow:")
    public native NEFilterNewFlowVerdict handleNewFlow(@NotNull NEFilterFlow flow);

    /**
     * handleOutboundDataCompleteForFlow:
     * 
     * This function is called by the framework after all of the outbound data for a flow has been seen by the filter.
     * Subclasses must override this method to return an appropriate pass/block result.
     * 
     * @param flow The flow
     * @return The final NEFilterFlowDataVerdict verdict for the flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleOutboundDataCompleteForFlow:")
    public native NEFilterDataVerdict handleOutboundDataCompleteForFlow(@NotNull NEFilterFlow flow);

    /**
     * handleOutboundDataFromFlow:readBytesStartOffset:readBytes:
     * 
     * This function is called by the framework when a filtering decision needs to be made about some outbound data that
     * the filter previously requested access to via the NEFilterFlowDataVerdict or the NEFilterNewFlowVerdict.
     * Subclasses must override this method.
     * 
     * @param flow      The NEFilterFlow from which the data was read.
     * @param offset    The offset in bytes from the start of the flow's outbound data at which readBytes begins.
     * @param readBytes The data that was read. For non-UDP/TCP flows, since data may optionally include the IP header,
     *                  readBytes includes a 4-bytes NEFilterDataAttribute field preceding the user data. Handler must
     *                  examine the NEFilterDataAttribute field and handle the data accordingly.
     * @return An NEFilterFlowDataVerdict containing the verdict for the flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleOutboundDataFromFlow:readBytesStartOffset:readBytes:")
    public native NEFilterDataVerdict handleOutboundDataFromFlowReadBytesStartOffsetReadBytes(
            @NotNull NEFilterFlow flow, @NUInt long offset, @NotNull NSData readBytes);

    /**
     * handleRemediationForFlow:
     * 
     * This function is called by the framework after the user requests remediation for a blocked flow. Subclasses must
     * override this method to return an appropriate pass/block result.
     * 
     * @param flow The flow
     * @return The final NEFilterRemediationVerdict verdict for the flow.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("handleRemediationForFlow:")
    public native NEFilterRemediationVerdict handleRemediationForFlow(@NotNull NEFilterFlow flow);

    /**
     * handleRulesChanged
     * 
     * This function is called by the framework when -[NEFilterControlProvider notifyRulesChanged] is called. Subclasses
     * should override this method to reload new rules from disk.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("handleRulesChanged")
    public native void handleRulesChanged();

    @Generated
    @Selector("init")
    public native NEFilterDataProvider init();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
