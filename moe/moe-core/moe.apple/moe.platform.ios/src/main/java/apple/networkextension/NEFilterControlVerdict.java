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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @interface NEFilterControlVerdict
 * @discussion The NEFilterControlVerdict declares the programmatic interface of an object that is the verdict for a
 * new flow of network data by the control provider.
 * 
 * NEFilterControlVerdict is part of NetworkExtension.framework
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterControlVerdict extends NEFilterNewFlowVerdict implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterControlVerdict(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("URLAppendStringVerdictWithMapKey:")
    public static native NEFilterNewFlowVerdict URLAppendStringVerdictWithMapKey(String urlAppendMapKey);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterControlVerdict alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allowVerdict")
    public static native NEFilterNewFlowVerdict allowVerdict();

    /**
     * @method allowVerdictWithUpdateRules:
     * @discussion This class method returns a verdict indicating that the flow should be allowed to go through, and also
     * tell the data provider whether to update its rules or not.
     * @param updateRules YES if the control provider has updated the rules and wants to communicate that to the data provider
     * @return The NEFilterControlVerdict object.
     */
    @Generated
    @Selector("allowVerdictWithUpdateRules:")
    public static native NEFilterControlVerdict allowVerdictWithUpdateRules(boolean updateRules);

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
    @Selector("dropVerdict")
    public static native NEFilterNewFlowVerdict dropVerdict();

    /**
     * @method dropVerdictWithUpdateRules:
     * @discussion This class method returns a verdict indicating that the flow should be dropped, and also tell the data
     * provider whether to update its rules or not.
     * @param updateRules YES if the control provider has updated the rules and wants to communicate that to the data provider
     * @return The NEFilterControlVerdict object.
     */
    @Generated
    @Selector("dropVerdictWithUpdateRules:")
    public static native NEFilterControlVerdict dropVerdictWithUpdateRules(boolean updateRules);

    @Generated
    @Selector("filterDataVerdictWithFilterInbound:peekInboundBytes:filterOutbound:peekOutboundBytes:")
    public static native NEFilterNewFlowVerdict filterDataVerdictWithFilterInboundPeekInboundBytesFilterOutboundPeekOutboundBytes(
            boolean filterInbound, @NUInt long peekInboundBytes, boolean filterOutbound, @NUInt long peekOutboundBytes);

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
    @Selector("needRulesVerdict")
    public static native NEFilterNewFlowVerdict needRulesVerdict();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:")
    public static native NEFilterNewFlowVerdict remediateVerdictWithRemediationURLMapKeyRemediationButtonTextMapKey(
            String remediationURLMapKey, String remediationButtonTextMapKey);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * @method updateRules
     * @discussion This class method returns a verdict indicating that the flow should be handled by the data provider,
     * and the rules needed by the data provider have been set.
     * @return The NEFilterControlVerdict object.
     */
    @Generated
    @Selector("updateRules")
    public static native NEFilterControlVerdict updateRules();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NEFilterControlVerdict init();

    @Generated
    @Selector("initWithCoder:")
    public native NEFilterControlVerdict initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
