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

package apple.avfoundation.protocol;

import apple.avfoundation.AVAudioMixingDestination;
import apple.avfoundation.AVAudioNode;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol   AVAudioMixing
 *    @abstract   Protocol that defines properties applicable to the input bus of a mixer
 *                node
 * 
 * Nodes that conform to the AVAudioMixing protocol can talk to a mixer node downstream,
 * specifically of type AVAudioMixerNode or AVAudioEnvironmentNode. The properties defined
 * by this protocol apply to the respective input bus of the mixer node that the source node is
 * connected to. Note that effect nodes cannot talk to their downstream mixer.
 * 
 * Properties can be set either on the source node, or directly on individual mixer connections.
 * Source node properties are:
 * - applied to all existing mixer connections when set
 * - applied to new mixer connections
 * - preserved upon disconnection from mixers
 * - not affected by connections/disconnections to/from mixers
 * - not affected by any direct changes to properties on individual mixer connections
 * 
 * Individual mixer connection properties, when set, will override any values previously derived
 * from the corresponding source node properties. However, if a source node property is
 * subsequently set, it will override the corresponding property value of all individual mixer
 * connections.
 * Unlike source node properties, individual mixer connection properties are not preserved upon
 * disconnection (see `AVAudioMixing(destinationForMixer:bus:)` and `AVAudioMixingDestination`).
 * 
 * Source nodes that are connected to a mixer downstream can be disconnected from
 * one mixer and connected to another mixer with source node's mixing settings intact.
 * For example, an AVAudioPlayerNode that is being used in a gaming scenario can set up its
 * 3D mixing settings and then move from one environment to another.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioMixing")
public interface AVAudioMixing extends AVAudioStereoMixing, AVAudio3DMixing {
    /**
     * @abstract Returns the AVAudioMixingDestination object corresponding to specified mixer node and
     * 	its input bus
     * 
     * When a source node is connected to multiple mixers downstream, setting AVAudioMixing
     * properties directly on the source node will apply the change to all the mixers downstream.
     * If you want to set/get properties on a specific mixer, use this method to get the
     * corresponding AVAudioMixingDestination and set/get properties on it.
     * 
     * Note:
     * - Properties set on individual AVAudioMixingDestination instances will not reflect at the
     * 	source node level.
     * 
     * - AVAudioMixingDestination reference returned by this method could become invalid when
     * 	there is any disconnection between the source and the mixer node. Hence this reference
     * 	should not be retained and should be fetched every time you want to set/get properties
     * 	on a specific mixer.
     * 
     * If the source node is not connected to the specified mixer/input bus, this method
     * returns nil.
     * 
     * Calling this on an AVAudioMixingDestination instance returns self if the specified
     * mixer/input bus matches its connection point, otherwise, it returns nil.
     */
    @Generated
    @Selector("destinationForMixer:bus:")
    AVAudioMixingDestination destinationForMixerBus(AVAudioNode mixer, @NUInt long bus);

    /**
     * @property volume
     * @abstract Set a bus's input volume
     * @discussion
     *     Range:      0.0 -> 1.0
     *     Default:    1.0
     *     Mixers:     AVAudioMixerNode, AVAudioEnvironmentNode
     */
    @Generated
    @Selector("setVolume:")
    void setVolume(float value);

    /**
     * @property volume
     * @abstract Set a bus's input volume
     * @discussion
     *     Range:      0.0 -> 1.0
     *     Default:    1.0
     *     Mixers:     AVAudioMixerNode, AVAudioEnvironmentNode
     */
    @Generated
    @Selector("volume")
    float volume();
}
