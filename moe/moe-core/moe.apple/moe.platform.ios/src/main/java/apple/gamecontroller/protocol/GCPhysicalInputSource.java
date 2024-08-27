package apple.gamecontroller.protocol;

import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A description of the actual physical input element that a user interacts
 * with to manipulate the the value of an input that is exposed to the app.
 * 
 * By querying the source of an element's input that is returned from
 * \c GCDevicePhysicalInput or \c GCDevicePhysicalInputState, an app
 * can see through element remappings applied by the user in the system
 * game controller settings. For example, assuming the user has
 * swapped the A and B buttons in the system game controller settings...
 * 
 * YES == [physicalInput.buttons[GCInputButtonA].pressedInput.source.elementAliases contains:GCInputButtonB]
 * YES == [physicalInput.buttons[GCInputButtonB].pressedInput.source.elementAliases contains:GCInputButtonA]
 * 
 * Examining an input's source is discouraged, but may be necessary depending
 * on how your game's input handling code is implemented. If possible, prefer
 * to load and display the \c sfSymbolsName and \c localizedName from the
 * \c GCPhysicalInputElement in any in-game U.I.
 * 
 * // Use these anywhere you need to instruct the user to press the 'A'
 * // button in your game UI. The symbol name and localized string
 * // returned will reflect the element that GCInputButtonA has been
 * // remapped to (Button B in the above case).
 * physicalInput.buttons[GCInputButtonA].localizedName
 * physicalInput.buttons[GCInputButtonA].sfSymbolsName
 * 
 * [@note]
 * Objects conforming to \c GCPhysicalInputSource protocol are vended by the
 * GameController framework. You should not conform to this protocol in your
 * own types.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCPhysicalInputSource")
public interface GCPhysicalInputSource {
    /**
     * One or more directions associated with the source.
     */
    @Generated
    @Selector("direction")
    @NUInt
    long direction();

    /**
     * The set of aliases for the element that the user interacts with.
     */
    @Generated
    @Selector("elementAliases")
    @NotNull
    NSSet<String> elementAliases();

    /**
     * The localized name of the element that the user interacts with.
     */
    @Generated
    @Selector("elementLocalizedName")
    @Nullable
    String elementLocalizedName();

    /**
     * The SF Symbol of the element that the user interacts with.
     */
    @Generated
    @Selector("sfSymbolsName")
    @Nullable
    String sfSymbolsName();
}