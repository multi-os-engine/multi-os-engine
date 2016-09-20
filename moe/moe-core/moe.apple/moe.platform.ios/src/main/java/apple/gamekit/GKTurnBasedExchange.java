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
    @Owned
    @Selector("alloc")
    public static native GKTurnBasedExchange alloc();

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

    /**
     * cancelWithLocalizableMessageKey:arguments:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedExchange/cancelWithLocalizableMessageKey:arguments:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelWithLocalizableMessageKey:arguments:completionHandler:")
    public native void cancelWithLocalizableMessageKeyArgumentsCompletionHandler(String key, NSArray<String> arguments,
            @ObjCBlock(name = "call_cancelWithLocalizableMessageKeyArgumentsCompletionHandler") Block_cancelWithLocalizableMessageKeyArgumentsCompletionHandler completionHandler);

    /**
     * completionDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/completionDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    /**
     * data</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/data">iOS Dev Center</a>
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * exchangeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/exchangeID">iOS Dev Center</a>
     */
    @Generated
    @Selector("exchangeID")
    public native String exchangeID();

    @Generated
    @Selector("init")
    public native GKTurnBasedExchange init();

    /**
     * message</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/message">iOS Dev Center</a>
     */
    @Generated
    @Selector("message")
    public native String message();

    /**
     * recipients</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/recipients">iOS Dev Center</a>
     */
    @Generated
    @Selector("recipients")
    public native NSArray<? extends GKTurnBasedParticipant> recipients();

    /**
     * replies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/replies">iOS Dev Center</a>
     */
    @Generated
    @Selector("replies")
    public native NSArray<? extends GKTurnBasedExchangeReply> replies();

    /**
     * replyWithLocalizableMessageKey:arguments:data:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedExchange/replyWithLocalizableMessageKey:arguments:data:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replyWithLocalizableMessageKey:arguments:data:completionHandler:")
    public native void replyWithLocalizableMessageKeyArgumentsDataCompletionHandler(String key,
            NSArray<String> arguments, NSData data,
            @ObjCBlock(name = "call_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler") Block_replyWithLocalizableMessageKeyArgumentsDataCompletionHandler completionHandler);

    /**
     * sendDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/sendDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("sendDate")
    public native NSDate sendDate();

    /**
     * sender</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/sender">iOS Dev Center</a>
     */
    @Generated
    @Selector("sender")
    public native GKTurnBasedParticipant sender();

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/status">iOS Dev Center</a>
     */
    @Generated
    @Selector("status")
    public native byte status();

    /**
     * timeoutDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedExchange_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedExchange/timeoutDate">iOS Dev Center</a>
     */
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
