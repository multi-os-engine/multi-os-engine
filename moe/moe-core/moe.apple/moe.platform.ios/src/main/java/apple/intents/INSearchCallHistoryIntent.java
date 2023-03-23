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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSearchCallHistoryIntent is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSearchCallHistoryIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INSearchCallHistoryIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSearchCallHistoryIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSearchCallHistoryIntent allocWithZone(VoidPtr zone);

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
    public static native INSearchCallHistoryIntent new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("callCapabilities")
    @NUInt
    public native long callCapabilities();

    /**
     * What type of call record to search for.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use callTypes instead
     */
    @Deprecated
    @Generated
    @Selector("callType")
    @NInt
    public native long callType();

    /**
     * Date of the call to search for in the call history.
     */
    @Generated
    @Selector("dateCreated")
    public native INDateComponentsRange dateCreated();

    @Generated
    @Selector("init")
    public native INSearchCallHistoryIntent init();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithCallType:dateCreated:recipient:callCapabilities:")
    public native INSearchCallHistoryIntent initWithCallTypeDateCreatedRecipientCallCapabilities(@NInt long callType,
            INDateComponentsRange dateCreated, INPerson recipient, @NUInt long callCapabilities);

    @Generated
    @Selector("initWithCoder:")
    public native INSearchCallHistoryIntent initWithCoder(NSCoder coder);

    @Generated
    @Selector("recipient")
    public native INPerson recipient();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("callTypes")
    @NUInt
    public native long callTypes();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithDateCreated:recipient:callCapabilities:callTypes:unseen:")
    public native INSearchCallHistoryIntent initWithDateCreatedRecipientCallCapabilitiesCallTypesUnseen(
            INDateComponentsRange dateCreated, INPerson recipient, @NUInt long callCapabilities, @NUInt long callTypes,
            NSNumber unseen);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("unseen")
    public native NSNumber unseen();
}
