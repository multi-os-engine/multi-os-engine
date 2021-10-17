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

package apple.callkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

/**
 * Any property that is not set will be ignored
 */
@Generated
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CXCallUpdate extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CXCallUpdate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CXCallUpdate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CXCallUpdate allocWithZone(VoidPtr zone);

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
    public static native CXCallUpdate new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The call includes video in addition to audio.
     */
    @Generated
    @Selector("hasVideo")
    public native boolean hasVideo();

    @Generated
    @Selector("init")
    public native CXCallUpdate init();

    /**
     * Override the computed caller name to a provider-defined value.
     * Normally the system will determine the appropriate caller name to display (e.g. using the user's contacts) based on the supplied caller identifier. Set this property to customize.
     */
    @Generated
    @Selector("localizedCallerName")
    public native String localizedCallerName();

    /**
     * Handle for the remote party (for an incoming call, the caller; for an outgoing call, the callee)
     */
    @Generated
    @Selector("remoteHandle")
    public native CXHandle remoteHandle();

    /**
     * The call includes video in addition to audio.
     */
    @Generated
    @Selector("setHasVideo:")
    public native void setHasVideo(boolean value);

    /**
     * Override the computed caller name to a provider-defined value.
     * Normally the system will determine the appropriate caller name to display (e.g. using the user's contacts) based on the supplied caller identifier. Set this property to customize.
     */
    @Generated
    @Selector("setLocalizedCallerName:")
    public native void setLocalizedCallerName(String value);

    /**
     * Handle for the remote party (for an incoming call, the caller; for an outgoing call, the callee)
     */
    @Generated
    @Selector("setRemoteHandle:")
    public native void setRemoteHandle(CXHandle value);

    /**
     * The call can send DTMF tones via hard pause digits or in-call keypad entries
     */
    @Generated
    @Selector("setSupportsDTMF:")
    public native void setSupportsDTMF(boolean value);

    /**
     * Whether the call can be grouped (merged) with other calls when it is ungrouped
     */
    @Generated
    @Selector("setSupportsGrouping:")
    public native void setSupportsGrouping(boolean value);

    /**
     * Whether the call can be held on its own or swapped with another call
     */
    @Generated
    @Selector("setSupportsHolding:")
    public native void setSupportsHolding(boolean value);

    /**
     * The call can be ungrouped (taken private) when it is grouped
     */
    @Generated
    @Selector("setSupportsUngrouping:")
    public native void setSupportsUngrouping(boolean value);

    /**
     * The call can send DTMF tones via hard pause digits or in-call keypad entries
     */
    @Generated
    @Selector("supportsDTMF")
    public native boolean supportsDTMF();

    /**
     * Whether the call can be grouped (merged) with other calls when it is ungrouped
     */
    @Generated
    @Selector("supportsGrouping")
    public native boolean supportsGrouping();

    /**
     * Whether the call can be held on its own or swapped with another call
     */
    @Generated
    @Selector("supportsHolding")
    public native boolean supportsHolding();

    /**
     * The call can be ungrouped (taken private) when it is grouped
     */
    @Generated
    @Selector("supportsUngrouping")
    public native boolean supportsUngrouping();
}
