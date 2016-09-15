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

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEFilterNewFlowVerdict extends NEFilterVerdict implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEFilterNewFlowVerdict(Pointer peer) {
        super(peer);
    }

    /**
     * URLAppendStringVerdictWithMapKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/URLAppendStringVerdictWithMapKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLAppendStringVerdictWithMapKey:")
    public static native NEFilterNewFlowVerdict URLAppendStringVerdictWithMapKey(String urlAppendMapKey);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEFilterNewFlowVerdict alloc();

    /**
     * allowVerdict</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/allowVerdict">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowVerdict")
    public static native NEFilterNewFlowVerdict allowVerdict();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dropVerdict</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/dropVerdict">iOS Dev Center</a>
     */
    @Generated
    @Selector("dropVerdict")
    public static native NEFilterNewFlowVerdict dropVerdict();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * filterDataVerdictWithFilterInbound:peekInboundBytes:filterOutbound:peekOutboundBytes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/filterDataVerdictWithFilterInbound:peekInboundBytes:filterOutbound:peekOutboundBytes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("filterDataVerdictWithFilterInbound:peekInboundBytes:filterOutbound:peekOutboundBytes:")
    public static native NEFilterNewFlowVerdict filterDataVerdictWithFilterInboundPeekInboundBytesFilterOutboundPeekOutboundBytes(
            boolean filterInbound, @NUInt long peekInboundBytes, boolean filterOutbound, @NUInt long peekOutboundBytes);

    @Generated
    @Selector("init")
    public native NEFilterNewFlowVerdict init();

    @Generated
    @Selector("initWithCoder:")
    public native NEFilterNewFlowVerdict initWithCoder(NSCoder aDecoder);

    /**
     * needRulesVerdict</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/needRulesVerdict">iOS Dev Center</a>
     */
    @Generated
    @Selector("needRulesVerdict")
    public static native NEFilterNewFlowVerdict needRulesVerdict();

    /**
     * remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEFilterNewFlowVerdictClassRef/index.html#//apple_ref/occ/clm/NEFilterNewFlowVerdict/remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("remediateVerdictWithRemediationURLMapKey:remediationButtonTextMapKey:")
    public static native NEFilterNewFlowVerdict remediateVerdictWithRemediationURLMapKeyRemediationButtonTextMapKey(
            String remediationURLMapKey, String remediationButtonTextMapKey);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

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
    public static native long version();
}
