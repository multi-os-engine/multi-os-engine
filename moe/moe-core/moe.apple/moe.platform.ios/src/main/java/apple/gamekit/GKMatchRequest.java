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
public class GKMatchRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchRequest alloc();

    @Generated
    @Selector("maxPlayersAllowedForMatchOfType:")
    @NUInt
    public static native long maxPlayersAllowedForMatchOfType(@NUInt long matchType);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("defaultNumberOfPlayers")
    @NUInt
    public native long defaultNumberOfPlayers();

    @Generated
    @Selector("init")
    public native GKMatchRequest init();

    @Generated
    @Selector("inviteMessage")
    public native String inviteMessage();

    @Generated
    @Selector("maxPlayers")
    @NUInt
    public native long maxPlayers();

    @Generated
    @Selector("minPlayers")
    @NUInt
    public native long minPlayers();

    @Generated
    @Selector("playerAttributes")
    public native int playerAttributes();

    @Generated
    @Selector("playerGroup")
    @NUInt
    public native long playerGroup();

    @Generated
    @Deprecated
    @Selector("playersToInvite")
    public native NSArray<String> playersToInvite();

    @Generated
    @Selector("recipients")
    public native NSArray<? extends GKPlayer> recipients();

    @Generated
    @Selector("setDefaultNumberOfPlayers:")
    public native void setDefaultNumberOfPlayers(@NUInt long value);

    @Generated
    @Selector("setInviteMessage:")
    public native void setInviteMessage(String value);

    @Generated
    @Deprecated
    @Selector("setInviteeResponseHandler:")
    public native void setInviteeResponseHandler(
            @ObjCBlock(name = "call_setInviteeResponseHandler") Block_setInviteeResponseHandler value);

    @Generated
    @Selector("setMaxPlayers:")
    public native void setMaxPlayers(@NUInt long value);

    @Generated
    @Selector("setMinPlayers:")
    public native void setMinPlayers(@NUInt long value);

    @Generated
    @Selector("setPlayerAttributes:")
    public native void setPlayerAttributes(int value);

    @Generated
    @Selector("setPlayerGroup:")
    public native void setPlayerGroup(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("setPlayersToInvite:")
    public native void setPlayersToInvite(NSArray<String> value);

    @Generated
    @Selector("setRecipientResponseHandler:")
    public native void setRecipientResponseHandler(
            @ObjCBlock(name = "call_setRecipientResponseHandler") Block_setRecipientResponseHandler value);

    @Generated
    @Selector("setRecipients:")
    public native void setRecipients(NSArray<? extends GKPlayer> value);

    @Generated
    @Deprecated
    @Selector("inviteeResponseHandler")
    @ObjCBlock(name = "call_inviteeResponseHandler_ret")
    public native Block_inviteeResponseHandler_ret inviteeResponseHandler();

    @Generated
    @Selector("recipientResponseHandler")
    @ObjCBlock(name = "call_recipientResponseHandler_ret")
    public native Block_recipientResponseHandler_ret recipientResponseHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInviteeResponseHandler {
        @Generated
        void call_setInviteeResponseHandler(String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecipientResponseHandler {
        @Generated
        void call_setRecipientResponseHandler(GKPlayer arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inviteeResponseHandler_ret {
        @Generated
        void call_inviteeResponseHandler_ret(String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recipientResponseHandler_ret {
        @Generated
        void call_recipientResponseHandler_ret(GKPlayer arg0, @NInt long arg1);
    }
}
