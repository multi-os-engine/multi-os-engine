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
import apple.foundation.NSDictionary;
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
 * [@interface] NEFilterControlProvider
 * <p>
 * The NEFilterControlProvider class declares the programmatic interface for an object that is responsible for installing filtering rules on the device.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterControlProvider extends NEFilterProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterControlProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterControlProvider alloc();

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
     * [@property] URLAppendStringMap
     * <p>
     * A dictionary containing strings to be appended to URLs.
     */
    @Generated
    @Selector("URLAppendStringMap")
    public native NSDictionary<String, String> URLAppendStringMap();

    /**
     * handleNewFlow:completionHandler:
     * <p>
     * This function is called by the framework when the NEFilterDataProvider indicates that the filtering verdict for the given flow is NEFilterNewFlowVerdictNeedRules. Subclass implementations must override this method and implement whatever steps are necessary to fetch new rules pertaining to the given flow and place them on disk in a location accessible by the NEFilterDataProvider.
     *
     * @param flow              An NEFilterFlow object containing details about the flow that requires a rules update.
     * @param completionHandler A block that must be called when the NEFilterControlProvider is ready for the NEFilterDataProvider to re-process the new flow. NEFilterControlVerdict stores the verdict through which the control provider determines if a flow needs to be dropped or allowed. The verdict also indicates if the control plugin wants the data plugin to update its rules and handle the verdict.
     */
    @Generated
    @Selector("handleNewFlow:completionHandler:")
    public native void handleNewFlowCompletionHandler(NEFilterFlow flow,
            @ObjCBlock(name = "call_handleNewFlowCompletionHandler") Block_handleNewFlowCompletionHandler completionHandler);

    /**
     * handleRemediationForFlow:completionHandler:
     * <p>
     * This function is called by the framework when the NEFilterDataProvider indicates that the filtering verdict for the given flow is NEFilterRemediateVerdictNeedRules. Subclass implementations must override this method and implement whatever steps are necessary to remediate the given flow.
     *
     * @param flow              An NEFilterFlow object containing details about the flow that requires remediation.
     * @param completionHandler A block that must be called when the NEFilterControlProvider is ready for the NEFilterDataProvider to re-process the new flow. NEFilterControlVerdict stores the verdict through which the control provider determines if a flow needs to be dropped or allowed. The verdict also indicates if the control plugin wants the data plugin to update its rules and handle the verdict.
     */
    @Generated
    @Selector("handleRemediationForFlow:completionHandler:")
    public native void handleRemediationForFlowCompletionHandler(NEFilterFlow flow,
            @ObjCBlock(name = "call_handleRemediationForFlowCompletionHandler") Block_handleRemediationForFlowCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NEFilterControlProvider init();

    /**
     * notifyRulesChanged
     * <p>
     * This function is called by filter control implementations to notify the data provider "out of band" that the rules changed.
     */
    @Generated
    @Selector("notifyRulesChanged")
    public native void notifyRulesChanged();

    /**
     * * @property remediationMap
     * * @discussion A dictionary containing custom strings to be inserted into the "content blocked" page displayed in WebKit. Each key in this dictionary corresponds to a string in the "content blocked" page. The value of each key is a dictionary that maps keys to the custom strings to be inserted into the "content blocked" page. The keys for the sub-dictionaries are defined by the control provider. When the data provider creates a "remediate" verdict using [NEFilterDataVerdict remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:], it passes the key corresponding to the custom string to be inserted into the "content blocked" page.
     * <p>
     * Here is a sample remediationMap dictionary:
     * <p>
     * remediationMap = @{ NEFilterProviderRemediationMapRemediationURLs :
     *
     * @{
     * @"RemediateKey1" : @"http://www.remediation_url_1.com",
     * @"RemediateKey2" : @"http://www.remediation_url_2.com"
     * },
     * NEFilterProviderRemediationMapRemediationButtonTexts :
     * @{
     * @"RemediationButtonText1" : @"Remediate URL"
     * }
     * };
     */
    @Generated
    @Selector("remediationMap")
    public native NSDictionary<String, ? extends NSDictionary<String, ? extends NSObject>> remediationMap();

    /**
     * * @property remediationMap
     * * @discussion A dictionary containing custom strings to be inserted into the "content blocked" page displayed in WebKit. Each key in this dictionary corresponds to a string in the "content blocked" page. The value of each key is a dictionary that maps keys to the custom strings to be inserted into the "content blocked" page. The keys for the sub-dictionaries are defined by the control provider. When the data provider creates a "remediate" verdict using [NEFilterDataVerdict remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:], it passes the key corresponding to the custom string to be inserted into the "content blocked" page.
     * <p>
     * Here is a sample remediationMap dictionary:
     * <p>
     * remediationMap = @{ NEFilterProviderRemediationMapRemediationURLs :
     *
     * @{
     * @"RemediateKey1" : @"http://www.remediation_url_1.com",
     * @"RemediateKey2" : @"http://www.remediation_url_2.com"
     * },
     * NEFilterProviderRemediationMapRemediationButtonTexts :
     * @{
     * @"RemediationButtonText1" : @"Remediate URL"
     * }
     * };
     */
    @Generated
    @Selector("setRemediationMap:")
    public native void setRemediationMap(
            NSDictionary<String, ? extends NSDictionary<String, ? extends NSObject>> value);

    /**
     * [@property] URLAppendStringMap
     * <p>
     * A dictionary containing strings to be appended to URLs.
     */
    @Generated
    @Selector("setURLAppendStringMap:")
    public native void setURLAppendStringMap(NSDictionary<String, String> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleNewFlowCompletionHandler {
        @Generated
        void call_handleNewFlowCompletionHandler(NEFilterControlVerdict arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleRemediationForFlowCompletionHandler {
        @Generated
        void call_handleRemediationForFlowCompletionHandler(NEFilterControlVerdict arg0);
    }
}
