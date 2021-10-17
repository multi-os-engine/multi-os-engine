package apple.chip.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The protocol definition for the CHIPPersistenStorageDelegate
 * <p>
 * All delegate methods will be called on the supplied Delegate Queue.
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHIPPersistentStorageDelegate")
public interface CHIPPersistentStorageDelegate {
    /**
     * Delete the key and corresponding value
     */
    @Generated
    @Selector("CHIPDeleteKeyValue:")
    void CHIPDeleteKeyValue(String key);

    /**
     * Get the value for the given key
     */
    @Generated
    @Selector("CHIPGetKeyValue:")
    String CHIPGetKeyValue(String key);

    /**
     * Set the value of the key to the given value
     */
    @Generated
    @Selector("CHIPSetKeyValue:value:")
    void CHIPSetKeyValueValue(String key, String value);
}
