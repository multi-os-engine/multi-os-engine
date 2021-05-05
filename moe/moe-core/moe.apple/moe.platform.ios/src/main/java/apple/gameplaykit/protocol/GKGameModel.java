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

package apple.gameplaykit.protocol;

import apple.foundation.NSArray;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A protocol for abstracting a game model for use with the GKMinmaxStrategist class. The minmax
 * strategist uses the game model class, along with GKGameModelPlayer and GKGameModelUpdate to
 * find optimal moves in an adversarial, turn-based game.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKGameModel")
public interface GKGameModel extends NSCopying {
    /**
     * The player whose turn it is to perform an update to the game model. GKMinmaxStrategist assumes
     * that the next call to the applyGameModelUpdate: method will perform a move on behalf of this player.
     */
    @Generated
    @Selector("activePlayer")
    @MappedReturn(ObjCObjectMapper.class)
    GKGameModelPlayer activePlayer();

    /**
     * Applies a GKGameModelUpdate to the game model, potentially resulting in a new activePlayer.
     * GKMinmaxStrategist will call this method on a copy of the primary game model to speculate
     * about possible future moves and their effects. It is assumed that calling this method performs
     * a move on behalf of the player identified by the activePlayer property.
     */
    @Generated
    @Selector("applyGameModelUpdate:")
    void applyGameModelUpdate(@Mapped(ObjCObjectMapper.class) GKGameModelUpdate gameModelUpdate);

    /**
     * Returns an array of all the GKGameModelUpdates (i.e. actions/moves) that the active
     * player can undertake, with one instance of GKGameModelUpdate for each possible move.
     * Returns nil if the specified player is invalid, is not a part of the game model, or
     * if there are no valid moves available.
     */
    @Generated
    @Selector("gameModelUpdatesForPlayer:")
    NSArray<?> gameModelUpdatesForPlayer(@Mapped(ObjCObjectMapper.class) GKGameModelPlayer player);

    /**
     * Returns YES if the specified player has reached a loss state, NO if otherwise. Note that NO does not
     * necessarily mean that the player has won. Optionally used by GKMinmaxStrategist to improve move selection.
     */
    @Generated
    @IsOptional
    @Selector("isLossForPlayer:")
    default boolean isLossForPlayer(@Mapped(ObjCObjectMapper.class) GKGameModelPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns YES if the specified player has reached a win state, NO if otherwise. Note that NO does not
     * necessarily mean that the player has lost. Optionally used by GKMinmaxStrategist to improve move selection.
     */
    @Generated
    @IsOptional
    @Selector("isWinForPlayer:")
    default boolean isWinForPlayer(@Mapped(ObjCObjectMapper.class) GKGameModelPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Array of instances of GKGameModelPlayers representing players within this game model. When the
     * GKMinmaxStrategist class is used to find an optimal move for a specific player, it uses this
     * array to rate the moves of that player’s opponent(s).
     */
    @Generated
    @Selector("players")
    NSArray<?> players();

    /**
     * Returns the score for the specified player. A higher value indicates a better position for
     * the player than a lower value. Required by GKMinmaxStrategist to determine which
     * GKGameModelUpdate is the most advantageous for a given player. If the player is invalid, or
     * not a part of the game model, returns NSIntegerMin.
     */
    @Generated
    @IsOptional
    @Selector("scoreForPlayer:")
    @NInt
    default long scoreForPlayer(@Mapped(ObjCObjectMapper.class) GKGameModelPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sets the data of another game model. All data should be copied over, and should not maintain
     * any pointers to the copied game state. This is used by the GKMinmaxStrategist to process
     * permutations of the game without needing to apply potentially destructive updates to the
     * primary game model.
     */
    @Generated
    @Selector("setGameModel:")
    void setGameModel(@Mapped(ObjCObjectMapper.class) GKGameModel gameModel);

    @Generated
    @IsOptional
    @Selector("unapplyGameModelUpdate:")
    default void unapplyGameModelUpdate(@Mapped(ObjCObjectMapper.class) GKGameModelUpdate gameModelUpdate) {
        throw new java.lang.UnsupportedOperationException();
    }
}
