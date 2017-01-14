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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
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

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKTurnBasedExchange extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKTurnBasedExchange(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKTurnBasedExchange alloc();

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

    @Generated
    @Selector("cancelWithLocalizableMessageKey:arguments:completionHandler:")
    public native void cancelWithLocalizableMessageKeyArgumentsCompletionHandler(String key, NSArray<String> arguments,
            @ObjCBlock(name = "call_cancelWithLocalizableMessageKeyArgumentsCompletionHandler") Block_cancelWithLocalizableMessageKeyArgumentsCompletionHandler completionHandler);

    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("exchangeID")
    public native String exchangeID();

    @Generated
    @Selector("init")
    public native GKTurnBasedExchange init();

    @Generated
    @Selector("message")
    public native String message();

    @Generated
    @Selector("recipients")
    public native NSArray<? extends GKTurnBasedParticipant> recipients();

    @Generated
    @Selector("replies")
    public native NSArray<? extends GKTurnBasedExchangeReply> replies();

    @Generated
    @Selector("replyWithLocalizableMessageKey:arguments:data:completionHandler:")
    public native void replyWithLocalizableMessageKeyArgumentsDataCompletionHandler(String key,
            NSArray<String> arguments, NSData data,
            @ObjCBlock(name = "call_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler") Block_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler completionHandler);

    @Generated
    @Selector("sendDate")
    public native NSDate sendDate();

    @Generated
    @Selector("sender")
    public native GKTurnBasedParticipant sender();

    @Generated
    @Selector("status")
    public native byte status();

    @Generated
    @Selector("timeoutDate")
    public native NSDate timeoutDate();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelWithLocalizableMessageKeyArgumentsCompletionHandler {
        @Generated
        void call_cancelWithLocalizableMessageKeyArgumentsCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler {
        @Generated
        void call_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler(NSError arg0);
    }
}
