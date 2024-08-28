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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An app can use an INInteraction to donate an action (represented as an intent) and its state to the system.
 * 
 * The system may also launch the app with an NSUserActivity containing an INInteraction such that the app can perform
 * the action if it chooses.
 * 
 * API-Since: 10.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INInteraction allocWithZone(VoidPtr zone);

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

    /**
     * delete all the interactions ever donated by the calling app
     */
    @Generated
    @Selector("deleteAllInteractionsWithCompletion:")
    public static native void deleteAllInteractionsWithCompletion(
            @Nullable @ObjCBlock(name = "call_deleteAllInteractionsWithCompletion") Block_deleteAllInteractionsWithCompletion completion);

    /**
     * delete this app's interactions with the specified group identifier
     */
    @Generated
    @Selector("deleteInteractionsWithGroupIdentifier:completion:")
    public static native void deleteInteractionsWithGroupIdentifierCompletion(@NotNull String groupIdentifier,
            @Nullable @ObjCBlock(name = "call_deleteInteractionsWithGroupIdentifierCompletion") Block_deleteInteractionsWithGroupIdentifierCompletion completion);

    /**
     * delete the interactions with the specified identifiers that were donated by this app
     */
    @Generated
    @Selector("deleteInteractionsWithIdentifiers:completion:")
    public static native void deleteInteractionsWithIdentifiersCompletion(@NotNull NSArray<String> identifiers,
            @Nullable @ObjCBlock(name = "call_deleteInteractionsWithIdentifiersCompletion") Block_deleteInteractionsWithIdentifiersCompletion completion);

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
    public static native INInteraction new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The time the interaction started/occurred and its duration. The app can override with their own timestamp but it
     * defaults to the time of creation of this interaction object
     */
    @Nullable
    @Generated
    @Selector("dateInterval")
    public native NSDateInterval dateInterval();

    /**
     * Indicates the direction of the interaction
     */
    @Generated
    @Selector("direction")
    @NInt
    public native long direction();

    /**
     * donate this interaction to the system
     */
    @Generated
    @Selector("donateInteractionWithCompletion:")
    public native void donateInteractionWithCompletion(
            @Nullable @ObjCBlock(name = "call_donateInteractionWithCompletion") Block_donateInteractionWithCompletion completion);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * A user-defined identifier for the interaction group, this is handy during deletion time
     */
    @Nullable
    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    /**
     * A unique identifier for the interaction. It defaults to a globally unique identifier.
     * The app can override with their own identifier that is unique in the app's domain
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INInteraction init();

    @Generated
    @Selector("initWithCoder:")
    public native INInteraction initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithIntent:response:")
    public native INInteraction initWithIntentResponse(@NotNull INIntent intent, @Nullable INIntentResponse response);

    @NotNull
    @Generated
    @Selector("intent")
    public native INIntent intent();

    /**
     * Indicates the state of execution of the intent
     * This is consistent with the response state of the intentResponse, if specified
     */
    @Generated
    @Selector("intentHandlingStatus")
    @NInt
    public native long intentHandlingStatus();

    @Nullable
    @Generated
    @Selector("intentResponse")
    public native INIntentResponse intentResponse();

    /**
     * The time the interaction started/occurred and its duration. The app can override with their own timestamp but it
     * defaults to the time of creation of this interaction object
     */
    @Generated
    @Selector("setDateInterval:")
    public native void setDateInterval(@Nullable NSDateInterval value);

    /**
     * Indicates the direction of the interaction
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@NInt long value);

    /**
     * A user-defined identifier for the interaction group, this is handy during deletion time
     */
    @Generated
    @Selector("setGroupIdentifier:")
    public native void setGroupIdentifier(@Nullable String value);

    /**
     * A unique identifier for the interaction. It defaults to a globally unique identifier.
     * The app can override with their own identifier that is unique in the app's domain
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteAllInteractionsWithCompletion {
        @Generated
        void call_deleteAllInteractionsWithCompletion(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteInteractionsWithGroupIdentifierCompletion {
        @Generated
        void call_deleteInteractionsWithGroupIdentifierCompletion(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteInteractionsWithIdentifiersCompletion {
        @Generated
        void call_deleteInteractionsWithIdentifiersCompletion(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_donateInteractionWithCompletion {
        @Generated
        void call_donateInteractionWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("parameterValueForParameter:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object parameterValueForParameter(@NotNull INParameter parameter);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
