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
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKChallenge extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKChallenge(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKChallenge alloc();

    /**
     * completionDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/completionDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    /**
     * decline</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instm/GKChallenge/decline">iOS Dev Center</a>
     */
    @Generated
    @Selector("decline")
    public native void decline();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native GKChallenge init();

    @Generated
    @Selector("initWithCoder:")
    public native GKChallenge initWithCoder(NSCoder aDecoder);

    /**
     * issueDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/issueDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("issueDate")
    public native NSDate issueDate();

    /**
     * issuingPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/issuingPlayer">iOS Dev Center</a>
     */
    @Generated
    @Selector("issuingPlayer")
    public native GKPlayer issuingPlayer();

    /**
     * issuingPlayerID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/issuingPlayerID">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("issuingPlayerID")
    public native String issuingPlayerID();

    /**
     * loadReceivedChallengesWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/clm/GKChallenge/loadReceivedChallengesWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadReceivedChallengesWithCompletionHandler:")
    public static native void loadReceivedChallengesWithCompletionHandler(
            @ObjCBlock(name = "call_loadReceivedChallengesWithCompletionHandler") Block_loadReceivedChallengesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadReceivedChallengesWithCompletionHandler {
        @Generated
        void call_loadReceivedChallengesWithCompletionHandler(NSArray<? extends GKChallenge> arg0, NSError arg1);
    }

    /**
     * message</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/message">iOS Dev Center</a>
     */
    @Generated
    @Selector("message")
    public native String message();

    /**
     * receivingPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/receivingPlayer">iOS Dev Center</a>
     */
    @Generated
    @Selector("receivingPlayer")
    public native GKPlayer receivingPlayer();

    /**
     * receivingPlayerID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/receivingPlayerID">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("receivingPlayerID")
    public native String receivingPlayerID();

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKChallenge_Ref/index.html#//apple_ref/occ/instp/GKChallenge/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

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
    public static native long version_static();
}
