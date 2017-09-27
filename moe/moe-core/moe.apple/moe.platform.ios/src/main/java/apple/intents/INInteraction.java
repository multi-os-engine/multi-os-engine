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
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INInteraction extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INInteraction alloc();

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
    @Selector("deleteAllInteractionsWithCompletion:")
    public static native void deleteAllInteractionsWithCompletion(
            @ObjCBlock(name = "call_deleteAllInteractionsWithCompletion") Block_deleteAllInteractionsWithCompletion completion);

    @Generated
    @Selector("deleteInteractionsWithGroupIdentifier:completion:")
    public static native void deleteInteractionsWithGroupIdentifierCompletion(String groupIdentifier,
            @ObjCBlock(name = "call_deleteInteractionsWithGroupIdentifierCompletion") Block_deleteInteractionsWithGroupIdentifierCompletion completion);

    @Generated
    @Selector("deleteInteractionsWithIdentifiers:completion:")
    public static native void deleteInteractionsWithIdentifiersCompletion(NSArray<String> identifiers,
            @ObjCBlock(name = "call_deleteInteractionsWithIdentifiersCompletion") Block_deleteInteractionsWithIdentifiersCompletion completion);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    @Selector("dateInterval")
    public native NSDateInterval dateInterval();

    @Generated
    @Selector("direction")
    @NInt
    public native long direction();

    @Generated
    @Selector("donateInteractionWithCompletion:")
    public native void donateInteractionWithCompletion(
            @ObjCBlock(name = "call_donateInteractionWithCompletion") Block_donateInteractionWithCompletion completion);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INInteraction init();

    @Generated
    @Selector("initWithCoder:")
    public native INInteraction initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithIntent:response:")
    public native INInteraction initWithIntentResponse(INIntent intent, INIntentResponse response);

    @Generated
    @Selector("intent")
    public native INIntent intent();

    @Generated
    @Selector("intentHandlingStatus")
    @NInt
    public native long intentHandlingStatus();

    @Generated
    @Selector("intentResponse")
    public native INIntentResponse intentResponse();

    @Generated
    @Selector("setDateInterval:")
    public native void setDateInterval(NSDateInterval value);

    @Generated
    @Selector("setDirection:")
    public native void setDirection(@NInt long value);

    @Generated
    @Selector("setGroupIdentifier:")
    public native void setGroupIdentifier(String value);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteAllInteractionsWithCompletion {
        @Generated
        void call_deleteAllInteractionsWithCompletion(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteInteractionsWithGroupIdentifierCompletion {
        @Generated
        void call_deleteInteractionsWithGroupIdentifierCompletion(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteInteractionsWithIdentifiersCompletion {
        @Generated
        void call_deleteInteractionsWithIdentifiersCompletion(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_donateInteractionWithCompletion {
        @Generated
        void call_donateInteractionWithCompletion(NSError arg0);
    }

    @Generated
    @Selector("parameterValueForParameter:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object parameterValueForParameter(INParameter parameter);
}
