package apple.matter.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.protocol.NSSecureCoding;
import apple.matter.MTRDeviceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol for storing and retrieving controller-specific data.
 * 
 * Implementations of this protocol MUST keep these things in mind:
 * 
 * 1) The controller provided to the delegate methods may not be fully
 * initialized when the callbacks are called. The only safe thing to do with
 * it is to get its controllerID.
 * 
 * 2) The delegate method calls will happen on the queue that was provided along
 * with the delegate. All Matter work will be blocked until the method
 * completes, and these calls may themselves block other Matter API calls
 * from completing. Attempting to call any Matter API on the queue used for
 * this delegate, apart from de-serializing and serializing the items being
 * stored and calling MTRDeviceControllerStorageClasses(), is likely to lead
 * to deadlocks.
 * 
 * 3) Security level and sharing type will always be the same for any given key value
 * and are provided to describe the data should the storage delegate choose to
 * implement separating storage location by security level and sharing type.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceControllerStorageDelegate")
public interface MTRDeviceControllerStorageDelegate {
    /**
     * Remove the stored value for the given key. Returns whether the remove succeeded.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("controller:removeValueForKey:securityLevel:sharingType:")
    boolean controllerRemoveValueForKeySecurityLevelSharingType(@NotNull MTRDeviceController controller,
            @NotNull String key, @NUInt long securityLevel, @NUInt long sharingType);

    /**
     * Store a value for the given key. Returns whether the store succeeded.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("controller:storeValue:forKey:securityLevel:sharingType:")
    boolean controllerStoreValueForKeySecurityLevelSharingType(@NotNull MTRDeviceController controller,
            @Mapped(ObjCObjectMapper.class) @NotNull NSSecureCoding value, @NotNull String key,
            @NUInt long securityLevel, @NUInt long sharingType);

    /**
     * Store a list of key/value pairs in the form of a dictionary. Returns whether
     * the store succeeded. Specifically, if any keys in this dictionary fail to store,
     * the storage delegate should return NO.
     * 
     * API-Since: 17.6
     */
    @Generated
    @IsOptional
    @Selector("controller:storeValues:securityLevel:sharingType:")
    default boolean controllerStoreValuesSecurityLevelSharingType(@NotNull MTRDeviceController controller,
            @NotNull NSDictionary<String, ?> values, @NUInt long securityLevel, @NUInt long sharingType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return the stored value for the given key, if any, for the provided
     * controller. Returns nil if there is no stored value.
     * 
     * The set of classes that might be decoded by this function is available by
     * calling MTRDeviceControllerStorageClasses().
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("controller:valueForKey:securityLevel:sharingType:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    NSSecureCoding controllerValueForKeySecurityLevelSharingType(@NotNull MTRDeviceController controller,
            @NotNull String key, @NUInt long securityLevel, @NUInt long sharingType);

    /**
     * Return all keys and values stored, if any, for the provided controller, in a
     * dictionary. Returns nil if there are no stored values.
     * 
     * securityLevel and sharingType are provided as a hint for the storage delegate
     * to load from the right security level and sharing type, if the implementation
     * stores them separately. If the implementation includes key/value pairs from other
     * security levels or sharing types, they will be ignored by the caller.
     * 
     * The set of classes that might be decoded by this function is available by
     * calling MTRDeviceControllerStorageClasses().
     * 
     * API-Since: 17.6
     */
    @Generated
    @IsOptional
    @Selector("valuesForController:securityLevel:sharingType:")
    @Nullable
    default NSDictionary<String, ?> valuesForControllerSecurityLevelSharingType(@NotNull MTRDeviceController controller,
            @NUInt long securityLevel, @NUInt long sharingType) {
        throw new java.lang.UnsupportedOperationException();
    }
}