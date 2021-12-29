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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.protocol.GKGameModel;
import apple.gameplaykit.protocol.GKGameModelPlayer;
import apple.gameplaykit.protocol.GKGameModelUpdate;
import apple.gameplaykit.protocol.GKRandom;
import apple.gameplaykit.protocol.GKStrategist;
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
 * The Minmax Strategist is a generic AI that selects a game model update for a given player that maximises
 * potential gain, while minimising potential loss. It does this by examining all of the updates available
 * to the player in question, extrapolating the potential moves opposing players may take, projecting out
 * maxLookAheadDepth number of turns. The selected update will result in the greatest potential gain, balanced
 * against the potential gain of other players.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMinmaxStrategist extends NSObject implements GKStrategist {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMinmaxStrategist(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMinmaxStrategist alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMinmaxStrategist allocWithZone(VoidPtr zone);

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
    public static native GKMinmaxStrategist new_objc();

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
    @Selector("bestMoveForActivePlayer")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModelUpdate bestMoveForActivePlayer();

    /**
     * Selects the best move for the specified player. If randomSource is not nil, it will randomly select
     * which move to use if there are one or more ties for the best. Returns nil if the player is invalid,
     * the player is not a part of the game model, or the player has no valid moves available.
     */
    @Generated
    @Selector("bestMoveForPlayer:")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModelUpdate bestMoveForPlayer(@Mapped(ObjCObjectMapper.class) GKGameModelPlayer player);

    @Generated
    @Selector("gameModel")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModel gameModel();

    @Generated
    @Selector("init")
    public native GKMinmaxStrategist init();

    /**
     * The maximum number of future turns that will be processed when searching for a move.
     */
    @Generated
    @Selector("maxLookAheadDepth")
    @NInt
    public native long maxLookAheadDepth();

    /**
     * Selects one move from the set of N best moves for the specified player, where N is equal to
     * numMovesToConsider. If randomSource is nil, it will not randomly select, but will behave like
     * bestMoveForPlayer and return the first best move. Returns nil if the player is invalid, the
     * player is not a part of the game model, or the player has no valid moves available.
     */
    @Generated
    @Selector("randomMoveForPlayer:fromNumberOfBestMoves:")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModelUpdate randomMoveForPlayerFromNumberOfBestMoves(
            @Mapped(ObjCObjectMapper.class) GKGameModelPlayer player, @NInt long numMovesToConsider);

    @Generated
    @Selector("randomSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKRandom randomSource();

    @Generated
    @Selector("setGameModel:")
    public native void setGameModel(@Mapped(ObjCObjectMapper.class) GKGameModel value);

    /**
     * The maximum number of future turns that will be processed when searching for a move.
     */
    @Generated
    @Selector("setMaxLookAheadDepth:")
    public native void setMaxLookAheadDepth(@NInt long value);

    @Generated
    @Selector("setRandomSource:")
    public native void setRandomSource(@Mapped(ObjCObjectMapper.class) GKRandom value);
}
