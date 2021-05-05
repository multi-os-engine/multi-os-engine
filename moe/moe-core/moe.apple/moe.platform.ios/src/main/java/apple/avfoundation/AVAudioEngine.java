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

package apple.avfoundation;

import apple.NSObject;
import apple.audiotoolbox.opaque.MusicSequence;
import apple.coreaudiotypes.struct.AudioBufferList;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioEngine
 * 
 * An AVAudioEngine contains a group of connected AVAudioNodes ("nodes"), each of which performs
 * an audio signal generation, processing, or input/output task.
 * 
 * Nodes are created separately and attached to the engine.
 * 
 * The engine supports dynamic connection, disconnection and removal of nodes while running,
 * with only minor limitations:
 * - all dynamic reconnections must occur upstream of a mixer
 * - while removals of effects will normally result in the automatic connection of the adjacent
 * 	nodes, removal of a node which has differing input vs. output channel counts, or which
 * 	is a mixer, is likely to result in a broken graph.
 * 
 * By default, the engine is connected to an audio device and automatically renders in realtime. 
 * It can also be configured to operate in manual rendering mode, i.e. not connected to an
 * audio device and rendering in response to requests from the client, normally at or
 * faster than realtime rate.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEngine alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * attachNode:
     * 
     * 	Take ownership of a new node.
     * 
     * @param node
     * 	The node to be attached to the engine.
     * 
     * To support the instantiation of arbitrary AVAudioNode subclasses, instances are created
     * externally to the engine, but are not usable until they are attached to the engine via
     * this method. Thus the idiom, without ARC, is:
     * 
     * ```
     * // when building engine:
     * AVAudioNode *_player;	// member of controller class (for example)
     * ...
     * _player = [[AVAudioPlayerNode alloc] init];
     * [engine attachNode: _player];
     * ...
     * // when destroying engine (without ARC)
     * [_player release];
     * ```
     */
    @Generated
    @Selector("attachNode:")
    public native void attachNode(AVAudioNode node);

    /**
     * connect:to:format:
     * 
     * 	Establish a connection between two nodes
     * 
     * This calls connect:to:fromBus:toBus:format: using bus 0 on the source node,
     * and bus 0 on the destination node, except in the case of a destination which is a mixer,
     * in which case the destination is the mixer's nextAvailableInputBus.
     */
    @Generated
    @Selector("connect:to:format:")
    public native void connectToFormat(AVAudioNode node1, AVAudioNode node2, AVAudioFormat format);

    /**
     * connect:to:fromBus:toBus:format:
     * 
     * 	Establish a connection between two nodes.
     * 
     * @param node1 
     * 	The source node
     * @param node2 
     * 	The destination node
     * @param bus1 
     * 	The output bus on the source node
     * @param bus2 
     * 	The input bus on the destination node
     * @param format 
     * 	If non-nil, the format of the source node's output bus is set to this
     * 	format. In all cases, the format of the destination node's input bus is set to
     * 	match that of the source node's output bus.
     * 
     * Nodes have input and output buses (AVAudioNodeBus). Use this method to establish
     * one-to-one connections betweeen nodes. Connections made using this method are always
     * one-to-one, never one-to-many or many-to-one.
     * 
     * Note that any pre-existing connection(s) involving the source's output bus or the
     * destination's input bus will be broken.
     */
    @Generated
    @Selector("connect:to:fromBus:toBus:format:")
    public native void connectToFromBusToBusFormat(AVAudioNode node1, AVAudioNode node2, @NUInt long bus1,
            @NUInt long bus2, AVAudioFormat format);

    /**
     * connect:toConnectionPoints:fromBus:format:
     * 
     * 	Establish connections between a source node and multiple destination nodes.
     * 
     * @param sourceNode 
     * 	The source node
     * @param destNodes 
     * 	An array of AVAudioConnectionPoint objects specifying destination
     * 	nodes and busses
     * @param sourceBus 
     * 	The output bus on source node
     * @param format 
     * 	If non-nil, the format of the source node's output bus is set to this
     * 	format. In all cases, the format of the destination nodes' input bus is set to
     * 	match that of the source node's output bus
     * 
     * Use this method to establish connections from a source node to multiple destination nodes.
     * Connections made using this method are either one-to-one (when a single destination
     * connection is specified) or one-to-many (when multiple connections are specified), but 
     * never many-to-one.
     * 
     * To incrementally add a new connection to a source node, use this method with an array
     * of AVAudioConnectionPoint objects comprising of pre-existing connections (obtained from
     * `outputConnectionPointsForNode:outputBus:`) and the new connection.
     * 
     * Note that any pre-existing connection involving the destination's input bus will be 
     * broken. And, any pre-existing connection on source node which is not a part of the
     * specified destination connection array will also be broken.
     * 
     * Also note that when the output of a node is split into multiple paths, all the paths
     * must render at the same rate until they reach a common mixer.
     * In other words, starting from the split node until the common mixer node where all split 
     * paths terminate, you cannot have:
     * 	- any AVAudioUnitTimeEffect
     * 	- any sample rate conversion
     */
    @Generated
    @Selector("connect:toConnectionPoints:fromBus:format:")
    public native void connectToConnectionPointsFromBusFormat(AVAudioNode sourceNode,
            NSArray<? extends AVAudioConnectionPoint> destNodes, @NUInt long sourceBus, AVAudioFormat format);

    /**
     * detachNode:
     * 
     * 	Detach a node previously attached to the engine.
     * 
     * If necessary, the engine will safely disconnect the node before detaching it.
     */
    @Generated
    @Selector("detachNode:")
    public native void detachNode(AVAudioNode node);

    /**
     * disconnectNodeInput:
     * 
     * 	Remove a connection between two nodes.
     * 
     * @param node 
     * 	The node whose inputs are to be disconnected
     * 
     * Connections are broken on each of the node's input busses.
     */
    @Generated
    @Selector("disconnectNodeInput:")
    public native void disconnectNodeInput(AVAudioNode node);

    /**
     * disconnectNodeInput:bus:
     * 
     * 	Remove a connection between two nodes.
     * 
     * @param node 
     * 	The node whose input is to be disconnected
     * @param bus 
     * 	The destination's input bus to disconnect
     */
    @Generated
    @Selector("disconnectNodeInput:bus:")
    public native void disconnectNodeInputBus(AVAudioNode node, @NUInt long bus);

    /**
     * disconnectNodeOutput:
     * 
     * 	Remove a connection between two nodes.
     * 
     * @param node 
     * 	The node whose outputs are to be disconnected
     * 
     * Connections are broken on each of the node's output busses.
     */
    @Generated
    @Selector("disconnectNodeOutput:")
    public native void disconnectNodeOutput(AVAudioNode node);

    /**
     * disconnectNodeOutput:bus:
     * 
     * 	Remove a connection between two nodes.
     * 
     * @param node 
     * 	The node whose output is to be disconnected
     * @param bus 
     * 	The source's output bus to disconnect
     */
    @Generated
    @Selector("disconnectNodeOutput:bus:")
    public native void disconnectNodeOutputBus(AVAudioNode node, @NUInt long bus);

    /**
     * init
     * 
     * 	Initialize a new engine.
     * 
     * On creation, the engine is by default connected to an audio device and automatically renders 
     * in realtime. It can be configured to operate in manual rendering mode through 
     * `enableManualRenderingMode:format:maximumFrameCount:error:`.
     */
    @Generated
    @Selector("init")
    public native AVAudioEngine init();

    /**
     * inputConnectionPointForNode:inputBus:
     * 
     * 	Get connection information on a node's input bus.
     * 
     * @param node 
     * 	The node whose input connection is being queried.
     * @param bus 
     * 	The node's input bus on which the connection is being queried.
     * @return	
     * 	An AVAudioConnectionPoint object with connection information on the node's
     * 	specified input bus.
     * 
     * Connections are always one-to-one or one-to-many, never many-to-one.
     * 
     * Returns nil if there is no connection on the node's specified input bus.
     */
    @Generated
    @Selector("inputConnectionPointForNode:inputBus:")
    public native AVAudioConnectionPoint inputConnectionPointForNodeInputBus(AVAudioNode node, @NUInt long bus);

    /**
     * [@property] inputNode
     * 
     * 	The engine's singleton input node.
     * 
     * Audio input is performed via an input node. The engine creates a singleton on demand when
     * this property is first accessed. To receive input, connect another node from the output of 
     * the input node, or create a recording tap on it.
     * 
     * When the engine is rendering to/from an audio device, the AVAudioSesssion category and/or
     * availability of hardware determine whether an app can perform input (e.g. input hardware is
     * not available on tvos). Check for the input node's input format (i.e. hardware format) for
     * non-zero sample rate and channel count to see if input is enabled.
     * Trying to perform input through the input node when it is not enabled or available will 
     * cause the engine to throw an error (when possible) or an exception.
     * 
     * In manual rendering mode, the input node can be used to synchronously supply data to
     * the engine while it is rendering (see 
     * `AVAudioInputNode(setManualRenderingInputPCMFormat:inputBlock:)`.
     */
    @Generated
    @Selector("inputNode")
    public native AVAudioInputNode inputNode();

    /**
     * [@property] running
     * 
     * 	The engine's running state.
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * [@property] mainMixerNode
     * 
     * 	The engine's optional singleton main mixer node.
     * 
     * The engine will construct a singleton main mixer and connect it to the outputNode on demand,
     * when this property is first accessed. You can then connect additional nodes to the mixer.
     * 
     * If the client has never explicitly set the connection format between the mainMixerNode and
     * the outputNode, the engine will always set/update the format to track the format of the outputNode
     * on (re)start, even after an AVAudioEngineConfigurationChangeNotification.
     * Otherwise, it's the client's responsibility to set/update this connection format after an
     * AVAudioEngineConfigurationChangeNotification.
     * 
     * By default, the mixer's output format (sample rate and channel count) will track the format 
     * of the output node. You may however make the connection explicitly with a different format.
     */
    @Generated
    @Selector("mainMixerNode")
    public native AVAudioMixerNode mainMixerNode();

    /**
     * [@property] musicSequence
     * 
     * 	The MusicSequence previously attached to the engine (if any).
     */
    @Generated
    @Selector("musicSequence")
    public native MusicSequence musicSequence();

    /**
     * outputConnectionPointsForNode:outputBus:
     * 
     * 	Get connection information on a node's output bus.
     * 
     * @param node 
     * 	The node whose output connections are being queried.
     * @param bus 
     * 	The node's output bus on which connections are being queried.
     * @return
     * 	An array of AVAudioConnectionPoint objects with connection information on the node's
     * 	specified output bus.
     * 
     * Connections are always one-to-one or one-to-many, never many-to-one.
     * 
     * Returns an empty array if there are no connections on the node's specified output bus.
     */
    @Generated
    @Selector("outputConnectionPointsForNode:outputBus:")
    public native NSArray<? extends AVAudioConnectionPoint> outputConnectionPointsForNodeOutputBus(AVAudioNode node,
            @NUInt long bus);

    /**
     * [@property] outputNode
     * 
     * 	The engine's singleton output node.
     * 
     * Audio output is performed via an output node. The engine creates a singleton on demand when
     * this property is first accessed. Connect another node to the input of the output node, or
     * obtain a mixer that is connected there by default, using the "mainMixerNode" property.
     * 
     * When the engine is rendering to/from an audio device, the AVAudioSesssion category and/or
     * availability of hardware determine whether an app can perform output. Check the output
     * format of output node (i.e. hardware format) for non-zero sample rate and channel count to
     * see if output is enabled. 
     * Trying to perform output through the output node when it is not enabled or available will 
     * cause the engine to throw an error (when possible) or an exception.
     * 
     * In manual rendering mode, the output format of the output node will determine the
     * render format of the engine. It can be changed through
     * `enableManualRenderingMode:format:maximumFrameCount:error:`.
     */
    @Generated
    @Selector("outputNode")
    public native AVAudioOutputNode outputNode();

    /**
     * pause
     * 
     * 	Pause the engine.
     * 
     * When the engine is rendering to/from an audio device, stops the audio hardware and the flow
     * of audio through the engine. When operating in this mode, it is recommended that the engine
     * be paused or stopped (as applicable) when not in use, to minimize power consumption.
     * 
     * Pausing the engine does not deallocate the resources allocated by prepare. Resume the
     * engine by invoking start again.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * prepare
     * 
     * 	Prepare the engine for starting.
     * 
     * This method preallocates many of the resources the engine requires in order to start.
     * It can be used to be able to start more responsively.
     */
    @Generated
    @Selector("prepare")
    public native void prepare();

    /**
     * reset
     * 
     * reset
     * 	Reset all of the nodes in the engine.
     * 
     * This will reset all of the nodes in the engine. This is useful, for example, for silencing
     * reverb and delay tails.
     * 
     * In manual rendering mode, the render timeline is reset to a sample time of zero.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * [@property] musicSequence
     * 
     * 	The MusicSequence previously attached to the engine (if any).
     */
    @Generated
    @Selector("setMusicSequence:")
    public native void setMusicSequence(MusicSequence value);

    /**
     * startAndReturnError:
     * 
     * 	Start the engine.
     * 
     * @return
     * 	YES for success
     * 
     * Calls prepare if it has not already been called since stop.
     * 
     * When the engine is rendering to/from an audio device, starts the audio hardware via the
     * AVAudioInputNode and/or AVAudioOutputNode instances in the engine. Audio begins to flow 
     * through the engine.
     * Reasons for potential failure to start in this mode include:
     * 1. There is problem in the structure of the graph. Input can't be routed to output or to a
     * 	recording tap through converter type nodes.
     * 2. An AVAudioSession error.
     * 3. The driver failed to start the hardware.
     * 
     * In manual rendering mode, prepares the engine to render when requested by the client.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * stop
     * 
     * 	When the engine is rendering to/from an audio device, stops the audio hardware and the
     * 	engine. When operating in this mode, it is recommended that the engine be paused or stopped
     * 	 (as applicable) when not in use, to minimize power consumption.
     * 
     * 	Stopping the engine releases the resources allocated by prepare.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * disableManualRenderingMode
     * 
     * 	Set the engine to render to/from an audio device.
     * 
     * When disabling the manual rendering mode, the engine:
     * 1. Stops and resets itself (see `stop` and `reset`).
     * 2. Switches the output/input nodes to render to/from an audio device. Their input and
     *    output formats may change.
     * 3. Removes any taps previously installed on the input and output nodes.
     * 4. Maintains all the engine connections as is.
     * 
     * Calling this method when the engine is already rendering to/from an audio device has no 
     * effect.
     */
    @Generated
    @Selector("disableManualRenderingMode")
    public native void disableManualRenderingMode();

    /**
     * enableManualRenderingMode:format:maximumFrameCount:error:
     * 
     * 	Set the engine to operate in a manual rendering mode with the specified render format and
     * 	maximum frame count.
     * 
     * @param mode
     * 	The manual rendering mode to use.
     * @param pcmFormat
     * 	The format of the output PCM audio data from the engine.
     * @param maximumFrameCount
     * 	The maximum number of PCM sample frames the engine will be asked to produce in any single
     * 	render call.
     * 	@param outError
     * 	On exit, if the engine cannot switch to the manual rendering mode, a description of the
     * 	error (see `AVAudioEngineManualRenderingError` for the possible errors).
     * @return
     * 	YES for success.
     * 
     * Use this method to configure the engine to render in response to requests from the client.
     * 
     * The engine must be in a stopped state before calling this method.
     * The render format must be a PCM format and match the format of the buffer to which
     * the engine is asked to render (see `renderOffline:toBuffer:error:`).
     * 
     * It is advised to enable manual rendering mode soon after the engine is created, and
     * before accessing any of mainMixerNode, inputNode or outputNode of the engine.
     * Otherwise, accessing or interacting with the engine before enabling manual rendering
     * mode could have the unintended side-effect of configuring the hardware for device-rendering
     * mode.
     * 
     * The input data in manual rendering mode can be supplied through the source nodes, e.g.
     * `AVAudioPlayerNode`, `AVAudioInputNode` etc.
     * 
     * When switching to manual rendering mode, the engine:
     * 1. Switches the input and output nodes to manual rendering mode. Their input and output
     *    formats may change.
     * 2. Removes any taps previously installed on the input and output nodes.
     * 3. Maintains all the engine connections as is.
     * 
     * Reasons for potential failure when switching to manual rendering mode include:
     * - Engine is not in a stopped state.
     */
    @Generated
    @Selector("enableManualRenderingMode:format:maximumFrameCount:error:")
    public native boolean enableManualRenderingModeFormatMaximumFrameCountError(@NInt long mode,
            AVAudioFormat pcmFormat, int maximumFrameCount, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] autoShutdownEnabled
     * 
     * 	When auto shutdown is enabled, the engine can start and stop the audio hardware dynamically,
     * 	to conserve power. This is the enforced behavior on watchOS and can be optionally enabled on
     * 	other platforms.
     * 
     * To conserve power, it is advised that the client pause/stop the engine when not in use.
     * But when auto shutdown is enabled, the engine will stop the audio hardware if it was running 
     * idle for a certain duration, and restart it later when required.
     * Note that, because this operation is dynamic, it may affect the start times of the source 
     * nodes (e.g. `AVAudioPlayerNode`), if the engine has to resume from its shutdown state.
     * 
     * On watchOS, auto shutdown is always enabled. On other platforms, it is disabled by
     * default, but the client can enable it if needed.
     * 
     * This property is applicable only when the engine is rendering to/from an audio device. If
     * the value is changed when the engine is in manual rendering mode, it will take effect
     * whenever the engine is switched to render to/from the audio device.
     */
    @Generated
    @Selector("isAutoShutdownEnabled")
    public native boolean isAutoShutdownEnabled();

    /**
     * [@property] isInManualRenderingMode
     * 
     * 	Whether or not the engine is operating in manual rendering mode, i.e. not connected
     * 	to an audio device and rendering in response to the requests from the client
     */
    @Generated
    @Selector("isInManualRenderingMode")
    public native boolean isInManualRenderingMode();

    /**
     * [@property] manualRenderingBlock
     * 
     * 	Block to render the engine operating in manual rendering mode
     * 
     * This block based render call must be used to render the engine when operating in
     * `AVAudioEngineManualRenderingModeRealtime`. In this mode, the engine operates under
     * realtime constraints and will not make any blocking call (e.g. calling libdispatch, blocking 
     * on a mutex, allocating memory etc.) while rendering. 
     * 
     * Before invoking the rendering functionality, client must fetch this block and cache the
     * result. The block can then be called from a realtime context, without any possibility of 
     * blocking.
     * 
     * When rendering in `AVAudioEngineManualRenderingModeOffline`, either this block based render
     * call or	`renderOffline:toBuffer:error:` ObjC method can be used.
     * All the rules outlined in `renderOffline:toBuffer:error:` are applicable here as well.
     */
    @Generated
    @Selector("manualRenderingBlock")
    @ObjCBlock(name = "call_manualRenderingBlock_ret")
    public native Block_manualRenderingBlock_ret manualRenderingBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_manualRenderingBlock_ret {
        @Generated
        @NInt
        long call_manualRenderingBlock_ret(int numberOfFrames,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outBuffer,
                IntPtr outError);
    }

    /**
     * [@property] manualRenderingFormat
     * 
     * 	The render format of the engine in manual rendering mode.
     * 
     * Querying this property when the engine is not in manual rendering mode will return an
     * invalid format, with zero sample rate and channel count.
     */
    @Generated
    @Selector("manualRenderingFormat")
    public native AVAudioFormat manualRenderingFormat();

    /**
     * [@property] manualRenderingMaximumFrameCount
     * 
     * 	The maximum number of PCM sample frames the engine can produce in any single render call in 
     * 	the manual rendering mode.
     * 
     * Querying this property when the engine is not in manual rendering mode will return zero.
     */
    @Generated
    @Selector("manualRenderingMaximumFrameCount")
    public native int manualRenderingMaximumFrameCount();

    /**
     * [@property] manualRenderingMode
     * 
     * 	The manual rendering mode configured on the engine
     * 
     * This property is meaningful only when the engine is operating in manual rendering mode,
     * i.e. when `isInManualRenderingMode` returns true.
     */
    @Generated
    @Selector("manualRenderingMode")
    @NInt
    public native long manualRenderingMode();

    /**
     * [@property] manualRenderingSampleTime
     * 
     * 	Indicates where the engine is on its render timeline in manual rendering mode.
     * 
     * The timeline in manual rendering mode starts at a sample time of zero, and is in terms
     * of the render format's sample rate. Resetting the engine (see `reset`) will reset the
     * timeline back to zero.
     */
    @Generated
    @Selector("manualRenderingSampleTime")
    public native long manualRenderingSampleTime();

    /**
     * renderOffline:toBuffer:error:
     * 
     * 	Render call to the engine operating in the offline manual rendering mode
     * 
     * @param numberOfFrames
     * 	The number of PCM sample frames to be rendered
     * @param buffer
     * 	The PCM buffer to which the engine must render the audio
     * @param outError
     * 	On exit, if an error occurs during rendering, a description of the error (see
     * 	`AVAudioEngineManualRenderingError` for the possible errors)
     * @return
     * 	One of the status codes from `AVAudioEngineManualRenderingStatus`. Irrespective of the
     * 	returned status code, on exit, the output buffer's frameLength will indicate the number of
     * 	PCM samples rendered by the engine
     * 
     * The engine must be in the offline manual rendering mode 
     * (`AVAudioEngineManualRenderingModeOffline`) and started before calling this method.
     * 
     * The format of the buffer must match the render format set through 
     * `enableManualRenderingMode:format:maximumFrameCount:error:`. The buffer capacity must be
     * greater than or equal to the number of samples asked to render.
     * On exit, the buffer's frameLength will indicate the number of PCM samples rendered by the 
     * engine.
     * 
     * The engine's timeline in manual rendering mode starts at a sample time of zero, and is in
     * terms of the render format's sample rate. Resetting the engine (see `reset`) will reset the
     * timeline back to zero.
     * 
     * When rendering in `AVAudioEngineManualRenderingModeRealtime`, this ObjC render method 
     * must not be used, an error is returned otherwise. Use the block based render call
     * (`manualRenderingBlock`) in that mode instead.
     */
    @Generated
    @Selector("renderOffline:toBuffer:error:")
    @NInt
    public native long renderOfflineToBufferError(int numberOfFrames, AVAudioPCMBuffer buffer,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] autoShutdownEnabled
     * 
     * 	When auto shutdown is enabled, the engine can start and stop the audio hardware dynamically,
     * 	to conserve power. This is the enforced behavior on watchOS and can be optionally enabled on
     * 	other platforms.
     * 
     * To conserve power, it is advised that the client pause/stop the engine when not in use.
     * But when auto shutdown is enabled, the engine will stop the audio hardware if it was running 
     * idle for a certain duration, and restart it later when required.
     * Note that, because this operation is dynamic, it may affect the start times of the source 
     * nodes (e.g. `AVAudioPlayerNode`), if the engine has to resume from its shutdown state.
     * 
     * On watchOS, auto shutdown is always enabled. On other platforms, it is disabled by
     * default, but the client can enable it if needed.
     * 
     * This property is applicable only when the engine is rendering to/from an audio device. If
     * the value is changed when the engine is in manual rendering mode, it will take effect
     * whenever the engine is switched to render to/from the audio device.
     */
    @Generated
    @Selector("setAutoShutdownEnabled:")
    public native void setAutoShutdownEnabled(boolean value);

    /**
     * [@property] attachedNodes
     * 
     * 	Set of all nodes attached to the engine.
     */
    @Generated
    @Selector("attachedNodes")
    public native NSSet<? extends AVAudioNode> attachedNodes();

    /**
     * connectMIDI:to:format:block:
     * 
     *        Establish a MIDI only connection between two nodes.
     * 
     *    @param sourceNode
     *        The source node.
     *    @param destinationNode
     *        The destination node.
     *    @param format
     *        If non-nil, the format of the source node's output bus is set to this format.
     *        In all cases, the format of the source nodes' output bus has to match with the
     *        destination nodes' output bus format.
     *        Although the output bus of the source is not in use, the format needs to be set
     *        in order to be able to use the sample rate for MIDI event timing calculations.
     *    @param tapBlock
     *        If non-nil, this block is called from the source node's `AUMIDIOutputEventBlock`
     *        on the realtime thread. The host can tap the MIDI data of the source node through
     *        this block. May be nil.
     * 
     * Use this method to establish a MIDI only connection between a source node and a
     * destination node that has MIDI input capability.
     * 
     * The source node can only be a AVAudioUnit node of type `kAudioUnitType_MIDIProcessor`.
     * The destination node types can be `kAudioUnitType_MusicDevice`,
     * `kAudioUnitType_MusicEffect` or `kAudioUnitType_MIDIProcessor`.
     * 
     * Note that any pre-existing MIDI connection involving the destination will be broken.
     * 
     * Any client installed block on the source node's audio unit `AUMIDIOutputEventBlock`
     * will be overwritten when making the MIDI connection.
     */
    @Generated
    @Selector("connectMIDI:to:format:block:")
    public native void connectMIDIToFormatBlock(AVAudioNode sourceNode, AVAudioNode destinationNode,
            AVAudioFormat format,
            @ObjCBlock(name = "call_connectMIDIToFormatBlock") Block_connectMIDIToFormatBlock tapBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectMIDIToFormatBlock {
        @Generated
        int call_connectMIDIToFormatBlock(long eventSampleTime, byte cable, @NInt long length,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String midiBytes);
    }

    /**
     * connectMIDI:toNodes:format:block:
     * 
     *        Establish a MIDI only connection between a source node and multiple destination nodes.
     * 
     *    @param sourceNode
     *        The source node.
     *    @param destinationNodes
     *        An array of AVAudioNodes specifying destination nodes.
     *    @param format
     *        If non-nil, the format of the source node's output bus is set to this format.
     *        In all cases, the format of the source nodes' output bus has to match with the
     *        destination nodes' output bus format.
     *        Although the output bus of the source is not in use, the format needs to be set
     *        in order to be able to use the sample rate for MIDI event timing calculations.
     *    @param tapBlock
     *        If non-nil, this block is called from the source node's `AUMIDIOutputEventBlock`
     *        on the realtime thread. The host can tap the MIDI data of the source node through
     *        this block. May be nil.
     * 
     * Use this method to establish a MIDI only connection between a source node and
     * multiple destination nodes.
     * 
     * The source node can only be a AVAudioUnit node of type `kAudioUnitType_MIDIProcessor`.
     * The destination node types can be `kAudioUnitType_MusicDevice`,
     * `kAudioUnitType_MusicEffect` or `kAudioUnitType_MIDIProcessor`.
     * 
     * MIDI connections made using this method are either one-to-one (when a single
     * destination connection is specified) or one-to-many (when multiple connections are
     * specified), but never many-to-one.
     * 
     * Note that any pre-existing connection involving the destination will be broken.
     * 
     * Any client installed block on the source node's audio unit `AUMIDIOutputEventBlock`
     * will be overwritten when making the MIDI connection.
     */
    @Generated
    @Selector("connectMIDI:toNodes:format:block:")
    public native void connectMIDIToNodesFormatBlock(AVAudioNode sourceNode,
            NSArray<? extends AVAudioNode> destinationNodes, AVAudioFormat format,
            @ObjCBlock(name = "call_connectMIDIToNodesFormatBlock") Block_connectMIDIToNodesFormatBlock tapBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectMIDIToNodesFormatBlock {
        @Generated
        int call_connectMIDIToNodesFormatBlock(long eventSampleTime, byte cable, @NInt long length,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String midiBytes);
    }

    /**
     * disconnectMIDI:from:
     * 
     *        Remove a MIDI connection between two nodes.
     * 
     *    @param sourceNode
     *        The node whose MIDI output is to be disconnected.
     *    @param destinationNode
     *        The node whose MIDI input is to be disconnected.
     * 
     * If a tap block is installed on the source node, it will be removed when the last
     * connection from the source node is removed.
     */
    @Generated
    @Selector("disconnectMIDI:from:")
    public native void disconnectMIDIFrom(AVAudioNode sourceNode, AVAudioNode destinationNode);

    /**
     * disconnectMIDI:fromNodes:
     * 
     *        Remove a MIDI connection between one source node and multiple destination nodes.
     * 
     *    @param sourceNode
     *        The node whose MIDI output is to be disconnected.
     *    @param destinationNodes
     *        An array of AVAudioNodes specifying nodes whose MIDI input is to be disconnected.
     * 
     * If a tap block is installed on the source node, it will be removed when the last
     * connection from the source node is removed.
     */
    @Generated
    @Selector("disconnectMIDI:fromNodes:")
    public native void disconnectMIDIFromNodes(AVAudioNode sourceNode, NSArray<? extends AVAudioNode> destinationNodes);

    /**
     * disconnectMIDIInput:
     * 
     *     Disconnects all input MIDI connections of this node.
     * 
     * @param node
     *     The node whose MIDI input is to be disconnected.
     */
    @Generated
    @Selector("disconnectMIDIInput:")
    public native void disconnectMIDIInput(AVAudioNode node);

    /**
     * disconnectMIDIOutput:
     * 
     *     Disconnects all output MIDI connections of this node.
     * 
     * @param node
     *     The node whose MIDI outputs are to be disconnected.
     */
    @Generated
    @Selector("disconnectMIDIOutput:")
    public native void disconnectMIDIOutput(AVAudioNode node);
}
