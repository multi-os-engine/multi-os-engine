package apple.gamecontroller.protocol;

import apple.foundation.NSEnumerator;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object conforming to the \c GCDevicePhysicalInputStateDiff protocol
 * contains the input state differences between the current and previous
 * \c GCDevicePhysicalInputState objects returned from the \c -nextInputState
 * method of \c GCDevicePhysicalInput.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDevicePhysicalInputStateDiff")
public interface GCDevicePhysicalInputStateDiff {
    /**
     * Check if a value of \a element changed, compared the previous input state.
     * 
     * @param element
     *                The element to check. This may be a pointer to either the "live" element
     *                from the device's physical input, or a pointer to an element from any input
     *                state "snapshot" of the device's physical input.
     */
    @Generated
    @Selector("changeForElement:")
    @NInt
    long changeForElement(@NotNull @Mapped(ObjCObjectMapper.class) GCPhysicalInputElement element);

    /**
     * Gets an enumerator that iterates over the elements that have changed, compared
     * the previous input state.
     * 
     * This method returns \c nil if the changed elements could not be determined -
     * typically because the input state queue filled up and older input state
     * snapshots were dropped.
     */
    @Nullable
    @Generated
    @Selector("changedElements")
    NSEnumerator<Object> changedElements();
}