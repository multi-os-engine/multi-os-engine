package apple.audiotoolbox.protocol;

import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AUMessageChannel
 * 
 * The protocol which objects returned from `[AUAudioUnit messageChannelFor:]` have to conform to.
 * 
 * Audio Units and hosts that have special needs of communication, e.g. to exchange musical context required for better
 * audio processing,
 * can implement a communication object to exchange messages in form of NSDictionaries. An Audio Unit would need to
 * implement
 * a class conforming to the AUMessageChannel protocol and return an instance via `[AUAudioUnit messageChannelFor:]`. A
 * host can query
 * the instance via the channel name.
 * The protocol offers a method to send messages to the AU and a block to send messages to the host.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AUMessageChannel")
public interface AUMessageChannel {
    /**
     * callAudioUnit:
     * 
     * Calls the Audio Unit with custom data message.
     * 
     * @param message
     *                An NSDictionary with custom data. The allowed classes for key and value types are
     *                NSArray, NSDictionary, NSOrderedSet, NSSet, NSString, NSData, NSNull, NSNumber, NSDate
     * @return
     *         An NSDictionary with custom data. The allowed classes for key and value types are
     *         NSArray, NSDictionary, NSOrderedSet, NSSet, NSString, NSData, NSNull, NSNumber, NSDate
     */
    @Generated
    @IsOptional
    @Selector("callAudioUnit:")
    default NSDictionary<?, ?> callAudioUnit(NSDictionary<?, ?> message) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] sendMessageToHostBlock
     * 
     * A callback for the AU to send a message to the host.
     * 
     * The host has to set a block on this property.
     */
    @Generated
    @IsOptional
    @Selector("callHostBlock")
    @ObjCBlock(name = "call_callHostBlock_ret")
    default Block_callHostBlock_ret callHostBlock() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_callHostBlock_ret {
        @Generated
        NSDictionary<?, ?> call_callHostBlock_ret(NSDictionary<?, ?> message);
    }

    /**
     * [@property] sendMessageToHostBlock
     * 
     * A callback for the AU to send a message to the host.
     * 
     * The host has to set a block on this property.
     */
    @Generated
    @IsOptional
    @Selector("setCallHostBlock:")
    default void setCallHostBlock(@ObjCBlock(name = "call_setCallHostBlock") Block_setCallHostBlock value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCallHostBlock {
        @Generated
        NSDictionary<?, ?> call_setCallHostBlock(NSDictionary<?, ?> message);
    }
}