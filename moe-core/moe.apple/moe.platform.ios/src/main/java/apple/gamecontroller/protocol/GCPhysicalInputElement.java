package apple.gamecontroller.protocol;

import apple.foundation.NSSet;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The \c GCPhysicalInputElement protocol is a base protocol for specific types
 * of elements that represent controls on a device.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCPhysicalInputElement")
public interface GCPhysicalInputElement {
    /**
     * The set of aliases that can be used to access this element with keyed subscript
     * notation.
     */
    @NotNull
    @Generated
    @Selector("aliases")
    NSSet<String> aliases();

    /**
     * The element's localized display name.
     * 
     * This is the string that your app should display in any on-screen messages
     * instructing the user to interact with the control. For example:
     * 
     * "Press \(buttonA.localizedName) to jump!"
     * 
     * Do not cache this value - it can change when the user remaps controls.
     */
    @Nullable
    @Generated
    @Selector("localizedName")
    String localizedName();

    /**
     * The SF Symbols name for the element.
     */
    @Nullable
    @Generated
    @Selector("sfSymbolsName")
    String sfSymbolsName();
}