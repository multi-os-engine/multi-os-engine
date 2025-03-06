package apple.browserenginekit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BETextSelectionDirectionNavigation")
public interface BETextSelectionDirectionNavigation {
    /**
     * Extends text selection in the specified directions, such as in response to an arrow key press while shift is
     * held.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("extendInLayoutDirection:")
    void extendInLayoutDirection(@NInt long direction);

    /**
     * Moves the selection in the specified directions by granularity, in response to different key combinations:
     * 
     * word = shift + option + left/right
     * paragraph = shift + option + up/down
     * line = shift + command + left/right
     * document = shift + command + up/down
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("extendInStorageDirection:byGranularity:")
    void extendInStorageDirectionByGranularity(@NInt long direction, @NInt long granularity);

    /**
     * Moves the cursor in the specified directions, such as in response to an arrow key press.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("moveInLayoutDirection:")
    void moveInLayoutDirection(@NInt long direction);

    /**
     * Moves the cursor in the specified directions by granularity, in response to different key combinations:
     * 
     * Option + left/right = word
     * Option + up/down = paragraph
     * Command + left/right = line
     * Command + up/down = document
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("moveInStorageDirection:byGranularity:")
    void moveInStorageDirectionByGranularity(@NInt long direction, @NInt long granularity);
}