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
import apple.foundation.struct.NSOperatingSystemVersion;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProcessInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSProcessInfo(Pointer peer) {
        super(peer);
    }

    /**
     * activeProcessorCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/activeProcessorCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("activeProcessorCount")
    @NUInt
    public native long activeProcessorCount();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSProcessInfo alloc();

    /**
     * arguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/arguments">iOS Dev Center</a>
     */
    @Generated
    @Selector("arguments")
    public native NSArray<String> arguments();

    /**
     * beginActivityWithOptions:reason:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/beginActivityWithOptions:reason:">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginActivityWithOptions:reason:")
    @MappedReturn(ObjCObjectMapper.class)
    public native apple.protocol.NSObject beginActivityWithOptionsReason(long options, String reason);

    /**
     * endActivity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/endActivity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endActivity:")
    public native void endActivity(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject activity);

    /**
     * environment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/environment">iOS Dev Center</a>
     */
    @Generated
    @Selector("environment")
    public native NSDictionary<String, String> environment();

    /**
     * globallyUniqueString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/globallyUniqueString">iOS Dev Center</a>
     */
    @Generated
    @Selector("globallyUniqueString")
    public native String globallyUniqueString();

    /**
     * hostName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/hostName">iOS Dev Center</a>
     */
    @Generated
    @Selector("hostName")
    public native String hostName();

    @Generated
    @Selector("init")
    public native NSProcessInfo init();

    /**
     * isOperatingSystemAtLeastVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/isOperatingSystemAtLeastVersion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isOperatingSystemAtLeastVersion:")
    public native boolean isOperatingSystemAtLeastVersion(@ByValue NSOperatingSystemVersion version);

    /**
     * operatingSystem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/operatingSystem">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("operatingSystem")
    @NUInt
    public native long operatingSystem();

    /**
     * operatingSystemName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/operatingSystemName">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("operatingSystemName")
    public native String operatingSystemName();

    /**
     * operatingSystemVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/operatingSystemVersion">iOS Dev Center</a>
     */
    @Generated
    @Selector("operatingSystemVersion")
    @ByValue
    public native NSOperatingSystemVersion operatingSystemVersion();

    /**
     * operatingSystemVersionString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/operatingSystemVersionString">iOS Dev Center</a>
     */
    @Generated
    @Selector("operatingSystemVersionString")
    public native String operatingSystemVersionString();

    /**
     * performActivityWithOptions:reason:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/performActivityWithOptions:reason:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performActivityWithOptions:reason:usingBlock:")
    public native void performActivityWithOptionsReasonUsingBlock(long options, String reason,
            @ObjCBlock(name = "call_performActivityWithOptionsReasonUsingBlock") Block_performActivityWithOptionsReasonUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performActivityWithOptionsReasonUsingBlock {
        @Generated
        void call_performActivityWithOptionsReasonUsingBlock();
    }

    /**
     * performExpiringActivityWithReason:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instm/NSProcessInfo/performExpiringActivityWithReason:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performExpiringActivityWithReason:usingBlock:")
    public native void performExpiringActivityWithReasonUsingBlock(String reason,
            @ObjCBlock(name = "call_performExpiringActivityWithReasonUsingBlock") Block_performExpiringActivityWithReasonUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performExpiringActivityWithReasonUsingBlock {
        @Generated
        void call_performExpiringActivityWithReasonUsingBlock(boolean arg0);
    }

    /**
     * physicalMemory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/physicalMemory">iOS Dev Center</a>
     */
    @Generated
    @Selector("physicalMemory")
    public native long physicalMemory();

    /**
     * processIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/processIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("processIdentifier")
    public native int processIdentifier();

    /**
     * processInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/clm/NSProcessInfo/processInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("processInfo")
    public static native NSProcessInfo processInfo();

    /**
     * processName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/processName">iOS Dev Center</a>
     */
    @Generated
    @Selector("processName")
    public native String processName();

    /**
     * processorCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/processorCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("processorCount")
    @NUInt
    public native long processorCount();

    /**
     * processName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/processName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProcessName:")
    public native void setProcessName(String value);

    /**
     * systemUptime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/systemUptime">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemUptime")
    public native double systemUptime();

    /**
     * lowPowerModeEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSProcessInfo_Class/index.html#//apple_ref/occ/instp/NSProcessInfo/lowPowerModeEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLowPowerModeEnabled")
    public native boolean isLowPowerModeEnabled();

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
