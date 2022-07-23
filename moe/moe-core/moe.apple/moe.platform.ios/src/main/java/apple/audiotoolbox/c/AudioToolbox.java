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

package apple.audiotoolbox.c;

import apple.NSObject;
import apple.OS_os_workgroup;
import apple.audiotoolbox.opaque.AUGraph;
import apple.audiotoolbox.opaque.AudioComponent;
import apple.audiotoolbox.opaque.AudioComponentInstance;
import apple.audiotoolbox.opaque.AudioConverterRef;
import apple.audiotoolbox.opaque.AudioFileID;
import apple.audiotoolbox.opaque.AudioFileStreamID;
import apple.audiotoolbox.opaque.AudioQueueProcessingTapRef;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.opaque.AudioQueueTimelineRef;
import apple.audiotoolbox.opaque.ExtAudioFileRef;
import apple.audiotoolbox.opaque.MusicEventIterator;
import apple.audiotoolbox.opaque.MusicPlayer;
import apple.audiotoolbox.opaque.MusicSequence;
import apple.audiotoolbox.opaque.MusicTrack;
import apple.audiotoolbox.struct.AUPresetEvent;
import apple.audiotoolbox.struct.AURenderCallbackStruct;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.audiotoolbox.struct.AudioFileRegion;
import apple.audiotoolbox.struct.AudioQueueBuffer;
import apple.audiotoolbox.struct.AudioQueueParameterEvent;
import apple.audiotoolbox.struct.CABarBeatTime;
import apple.audiotoolbox.struct.ExtendedNoteOnEvent;
import apple.audiotoolbox.struct.MIDIChannelMessage;
import apple.audiotoolbox.struct.MIDIMetaEvent;
import apple.audiotoolbox.struct.MIDINoteMessage;
import apple.audiotoolbox.struct.MIDIRawData;
import apple.audiotoolbox.struct.MusicDeviceNoteParams;
import apple.audiotoolbox.struct.MusicEventUserData;
import apple.audiotoolbox.struct.ParameterEvent;
import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioChannelLayout;
import apple.coreaudiotypes.struct.AudioClassDescription;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import apple.coreaudiotypes.struct.AudioStreamPacketDescription;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coremidi.struct.MIDIEventList;
import apple.struct.FILE;
import apple.struct.os_workgroup_attr_opaque_s;
import apple.uikit.UIImage;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("AudioToolbox")
@Runtime(CRuntime.class)
public final class AudioToolbox {
    static {
        NatJ.register();
    }

    @Generated
    private AudioToolbox() {
    }

    /**
     * [@function] AudioComponentFindNext
     * <p>
     * Finds an audio component.
     * <p>
     * This function is used to find an audio component that is the closest match
     * to the provided values. Note that the list of available components may change
     * dynamically in situations involving inter-app audio on iOS, or version 3
     * audio unit extensions. See kAudioComponentRegistrationsChangedNotification.
     *
     * @param inComponent If NULL, then the search starts from the beginning until an audio
     *                    component is found that matches the description provided by inDesc.
     *                    If non-NULL, then the search starts (continues) from the previously
     *                    found audio component specified by inComponent, and will return the next
     *                    found audio component.
     * @param inDesc      The type, subtype and manufacturer fields are used to specify the audio
     *                    component to search for. A value of 0 (zero) for any of these fields is
     *                    a wildcard, so the first match found is returned.
     * @return An audio component that matches the search parameters, or NULL if none found.
     */
    @Generated
    @CFunction
    public static native AudioComponent AudioComponentFindNext(AudioComponent inComponent,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

    /**
     * [@function] AudioComponentCount
     * <p>
     * Counts audio components.
     * <p>
     * Returns the number of AudioComponents that match the specified
     * AudioComponentDescription.
     *
     * @param inDesc The type, subtype and manufacturer fields are used to specify the audio
     *               components to count A value of 0 (zero) for any of these fields is a
     *               wildcard, so will match any value for this field
     * @return a UInt32. 0 (zero) means no audio components were found that matched the
     *         search parameters.
     */
    @Generated
    @CFunction
    public static native int AudioComponentCount(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

    /**
     * [@function] AudioComponentCopyName
     * <p>
     * Retrieves the name of an audio component.
     * <p>
     * the name of an audio component
     *
     * @param inComponent the audio component (must not be NULL)
     * @param outName     a CFString that is the name of the audio component. This string should
     *                    be released by the caller.
     * @return an OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioComponentCopyName(AudioComponent inComponent, Ptr<CFStringRef> outName);

    /**
     * [@function] AudioComponentGetDescription
     * <p>
     * Retrieve an audio component's description.
     * <p>
     * This will return the fully specified audio component description for the
     * provided audio component.
     *
     * @param inComponent the audio component (must not be NULL)
     * @param outDesc     the audio component description for the specified audio component
     * @return an OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioComponentGetDescription(AudioComponent inComponent,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDesc);

    /**
     * [@function] AudioComponentGetVersion
     * <p>
     * Retrieve an audio component's version.
     *
     * @param inComponent the audio component (must not be NULL)
     * @param outVersion  the audio component's version in the form of 0xMMMMmmDD (Major, Minor, Dot)
     * @return an OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioComponentGetVersion(AudioComponent inComponent, IntPtr outVersion);

    /**
     * [@function] AudioComponentInstanceNew
     * <p>
     * Creates an audio component instance.
     * <p>
     * This function creates an instance of a given audio component. The audio
     * component instance is the object that does all of the work, whereas the
     * audio component is the way an application finds and then creates this object
     * to do this work. For example, an audio unit is a type of audio component
     * instance, so to use an audio unit, one finds its audio component, and then
     * creates a new instance of that component. This instance is then used to
     * perform the audio tasks for which it was designed (process, mix, synthesise,
     * etc.).
     *
     * @param inComponent the audio component (must not be NULL)
     * @param outInstance the audio component instance
     * @return an OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioComponentInstanceNew(AudioComponent inComponent,
            Ptr<AudioComponentInstance> outInstance);

    /**
     * [@function] AudioComponentInstantiate
     * <p>
     * Creates an audio component instance, asynchronously.
     * <p>
     * This is an asynchronous version of AudioComponentInstanceNew(). It must be
     * used to instantiate any component with kAudioComponentFlag_RequiresAsyncInstantiation
     * set in its component flags. It may be used for other components as well.
     * <p>
     * Note: Do not block the main thread while waiting for the completion handler
     * to be called; this can deadlock.
     *
     * @param inComponent         the audio component
     * @param inOptions           see AudioComponentInstantiationOptions
     * @param inCompletionHandler called in an arbitrary thread context when instantiation is complete.
     */
    @Generated
    @CFunction
    public static native void AudioComponentInstantiate(AudioComponent inComponent, int inOptions,
            @ObjCBlock(name = "call_AudioComponentInstantiate") Block_AudioComponentInstantiate inCompletionHandler);

    /**
     * [@function] AudioComponentInstanceDispose
     * <p>
     * Disposes of an audio component instance.
     * <p>
     * This function will dispose the audio component instance that was created
     * with the New call. It will deallocate any resources that the instance was using.
     *
     * @param inInstance the audio component instance to dispose (must not be NULL)
     * @return an OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioComponentInstanceDispose(AudioComponentInstance inInstance);

    /**
     * [@function] AudioComponentInstanceGetComponent
     * <p>
     * Retrieve the audio component from its instance
     * <p>
     * Allows the application at any time to retrieve the audio component that is
     * the factory object of a given instance (i.e., the audio component that was
     * used to create the instance in the first place). This allows the application
     * to retrieve general information about a particular audio component (its
     * name, version, etc) when one just has an audio component instance to work
     * with
     *
     * @param inInstance the audio component instance (must not be NULL, and instance must be valid - that is, not
     *                   disposed)
     * @return a valid audio component or NULL if no component was found.
     */
    @Generated
    @CFunction
    public static native AudioComponent AudioComponentInstanceGetComponent(AudioComponentInstance inInstance);

    /**
     * [@function] AudioComponentInstanceCanDo
     * <p>
     * Determines if an audio component instance implements a particular component
     * API call as signified by the specified selector identifier token.
     *
     * @param inInstance   the audio component instance
     * @param inSelectorID a number to signify the audio component API (component selector) as appropriate for the
     *                     instance's component type.
     * @return a boolean
     */
    @Generated
    @CFunction
    public static native byte AudioComponentInstanceCanDo(AudioComponentInstance inInstance, short inSelectorID);

    /**
     * [@function] AudioComponentRegister
     * <p>
     * Dynamically registers an AudioComponent within the current process
     * <p>
     * AudioComponents are registered either when found in appropriate bundles in the filesystem,
     * or via this call. AudioComponents registered via this call are available only within
     * the current process.
     *
     * @param inDesc    The AudioComponentDescription that describes the AudioComponent. Note that
     *                  the registrar needs to be sure to set the flag kAudioComponentFlag_SandboxSafe
     *                  in the componentFlags field of the AudioComponentDescription to indicate that
     *                  the AudioComponent can be loaded directly into a sandboxed process.
     * @param inName    the AudioComponent's name
     * @param inVersion the AudioComponent's version
     * @param inFactory an AudioComponentFactoryFunction which will create instances of your
     *                  AudioComponent
     * @return an AudioComponent object
     */
    @Generated
    @CFunction
    public static native AudioComponent AudioComponentRegister(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
            CFStringRef inName, int inVersion,
            @FunctionPtr(name = "call_AudioComponentRegister") Function_AudioComponentRegister inFactory);

    /**
     * [@function] AudioUnitInitialize
     * <p>
     * initialize an audio unit
     * <p>
     * Upon success, the audio unit has been successfully initialized. This means
     * that the formats for input and output are valid and can be supported and it
     * has based its allocations on the max number of frames that it is able to
     * render at any given time. Once initialized, it is in a state where it can be
     * asked to render.
     * <p>
     * In common practice, major state of an audio unit (such as its I/O formats,
     * memory allocations) cannot be changed while an audio unit is initialized.
     *
     * @param inUnit The audio unit to initialize
     * @return noErr, or an error representing the reasons why the audio unit was not able
     *         to be initialized successfully
     */
    @Generated
    @CFunction
    public static native int AudioUnitInitialize(AudioComponentInstance inUnit);

    /**
     * [@function] AudioUnitUninitialize
     * <p>
     * uninitialize an audio unit
     * <p>
     * Once an audio unit has been initialized, to change its state in response to
     * some kind of environmental change, the audio unit should be uninitialized.
     * This will have the effect of the audio unit de-allocating its resources.
     * The caller can then reconfigure the audio unit to match the new environment
     * (for instance, the sample rate to process audio is different than it was) and
     * then re-initialize the audio unit when those changes have been applied.
     *
     * @param inUnit The audio unit to uninitialize
     * @return noErr, or an error representing the reasons why the audio unit was not able
     *         to be initialized successfully. Typically this call won't return an error
     *         unless the audio unit in question is no longer valid.
     */
    @Generated
    @CFunction
    public static native int AudioUnitUninitialize(AudioComponentInstance inUnit);

    /**
     * [@function] AudioUnitGetPropertyInfo
     * <p>
     * retrieves information about a specified property
     * <p>
     * The API can be used to retrieve both the size of the property, and whether it
     * is writable or not. In order to get a general answer on the capability of an
     * audio unit, this function should be called before the audio unit
     * is initialized (as some properties are writable when the audio unit is
     * initialized, and others not)
     *
     * @param inUnit      the audio unit
     * @param inID        the property identifier
     * @param inScope     the scope of the property
     * @param inElement   the element of the scope
     * @param outDataSize if not null, then will retrieve the maximum size for the property. if null,
     *                    then it is ignored
     * @param outWritable if not null, then will retrieve whether the property can be written or not.
     *                    if null, then it is ignored
     * @return noErr, or various audio unit errors related to properties
     */
    @Generated
    @CFunction
    public static native int AudioUnitGetPropertyInfo(AudioComponentInstance inUnit, int inID, int inScope,
            int inElement, IntPtr outDataSize, BytePtr outWritable);

    /**
     * [@function] AudioUnitGetProperty
     * <p>
     * retrieves the value of a specified property
     * <p>
     * The API can is used to retrieve the value of the property. Property values for
     * audio units are always passed by reference
     *
     * @param inUnit     the audio unit
     * @param inID       the property identifier
     * @param inScope    the scope of the property
     * @param inElement  the element of the scope
     * @param outData    used to retrieve the value of the property. It should point to memory at least
     *                   as large as the value described by ioDataSize
     * @param ioDataSize on input contains the size of the data pointed to by outData, on output, the
     *                   size of the data that was returned.
     * @return noErr, or various audio unit errors related to properties
     */
    @Generated
    @CFunction
    public static native int AudioUnitGetProperty(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            VoidPtr outData, IntPtr ioDataSize);

    /**
     * [@function] AudioUnitSetProperty
     * <p>
     * sets the value of a specified property
     * <p>
     * The API can is used to set the value of the property. Property values for
     * audio units are always passed by reference
     *
     * @param inUnit     the audio unit
     * @param inID       the property identifier
     * @param inScope    the scope of the property
     * @param inElement  the element of the scope
     * @param inData     if not null, then is the new value for the property that will be set. If null,
     *                   then inDataSize should be zero, and the call is then used to remove a
     *                   previously set value for a property. This removal is only valid for
     *                   some properties, as most properties will always have a default value if not
     *                   set.
     * @param inDataSize the size of the data being provided in inData
     * @return noErr, or various audio unit errors related to properties
     */
    @Generated
    @CFunction
    public static native int AudioUnitSetProperty(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            ConstVoidPtr inData, int inDataSize);

    /**
     * [@function] AudioUnitAddPropertyListener
     * <p>
     * registration call to receive notifications for when a property changes
     * <p>
     * When an audio unit property value changes, a notification callback can be
     * called by the audio unit to inform interested parties that this event has
     * occurred. The notification is defined by the tuple of inProc and
     * inProcUserData as paired to the specified property ID, so the previously
     * defined AudioUnitRemovePropertyListener is deprecated because it didn't allow
     * for the provision of the inProcUserData to remove a given listener (so,
     * you should use AudioUnitRemovePropertyListenerWithUserData).
     *
     * @param inUnit         the audio unit
     * @param inID           the property identifier
     * @param inProc         the procedure to call when the property changes (on any scope or element)
     * @param inProcUserData the user data to provide with the callback
     * @return noErr, or various audio unit errors related to properties
     */
    @Generated
    @CFunction
    public static native int AudioUnitAddPropertyListener(AudioComponentInstance inUnit, int inID,
            @FunctionPtr(name = "call_AudioUnitAddPropertyListener") Function_AudioUnitAddPropertyListener inProc,
            VoidPtr inProcUserData);

    /**
     * [@function] AudioUnitRemovePropertyListenerWithUserData
     * <p>
     * remove a previously registered property listener
     * <p>
     * Removes a previously registered property listener as specified by the inProc
     * and inProcUser data as paired to the property identifier
     *
     * @param inUnit         the audio unit
     * @param inID           the property identifier
     * @param inProc         the procedure previously registered
     * @param inProcUserData the user data paired with the provided inProc
     * @return noErr, or various audio unit errors related to properties
     */
    @Generated
    @CFunction
    public static native int AudioUnitRemovePropertyListenerWithUserData(AudioComponentInstance inUnit, int inID,
            @FunctionPtr(name = "call_AudioUnitRemovePropertyListenerWithUserData") Function_AudioUnitRemovePropertyListenerWithUserData inProc,
            VoidPtr inProcUserData);

    /**
     * [@function] AudioUnitAddRenderNotify
     * <p>
     * a notification callback to call when an audio unit is asked to render
     * <p>
     * allows an application to register a callback with an audio unit for whenever
     * the audio unit is asked to render. The callback is called both before the
     * audio unit performs its render operations (the render flag's pre-render bit
     * is set) and after the audio unit has completed its render operations (the
     * render flag's post-render bit is set). On post-render, the audio buffer list
     * (ioData) will contain valid audio data that was rendered by the audio unit.
     * <p>
     * The inProc and inProcUserData are treated as a tuple entity, so when wanting
     * to remove one, both the inProc and its inProcUserData must be specified
     *
     * @param inUnit         the audio unit
     * @param inProc         an AURenderCallback proc
     * @param inProcUserData the user data that will be provided with the proc when it is called
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int AudioUnitAddRenderNotify(AudioComponentInstance inUnit,
            @FunctionPtr(name = "call_AudioUnitAddRenderNotify") Function_AudioUnitAddRenderNotify inProc,
            VoidPtr inProcUserData);

    /**
     * [@function] AudioUnitRemoveRenderNotify
     * <p>
     * remove a previously registered render notification proc
     *
     * @param inUnit         the audio unit
     * @param inProc         an AURenderCallback proc
     * @param inProcUserData the user data that was provided with the proc when it was previously
     *                       registered
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int AudioUnitRemoveRenderNotify(AudioComponentInstance inUnit,
            @FunctionPtr(name = "call_AudioUnitRemoveRenderNotify") Function_AudioUnitRemoveRenderNotify inProc,
            VoidPtr inProcUserData);

    /**
     * [@function] AudioUnitGetParameter
     * <p>
     * Get the value of a parameter
     * <p>
     * Get the value of a parameter as specified by its ID, scope and element.
     *
     * @param inUnit    the audio unit
     * @param inID      the parameter ID
     * @param inScope   the scope for the parameter
     * @param inElement the element on the scope for the parameter
     * @param outValue  Must be non-null, and upon success will contain the current value for the
     *                  specified parameter
     * @return noErr, or an audio unit error code (such as InvalidParameter)
     */
    @Generated
    @CFunction
    public static native int AudioUnitGetParameter(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            FloatPtr outValue);

    /**
     * [@function] AudioUnitSetParameter
     * <p>
     * Set the value of a parameter
     * <p>
     * Set the value of a parameter as specified by its ID, scope and element.
     * Parameter IDs are consistent across all of the elements in a scope - so for a
     * mixer, the "input volume" parameter can be applied on any input, and the
     * particular input is specified by the elementID.
     *
     * @param inUnit                 the audio unit
     * @param inID                   the parameter ID
     * @param inScope                the scope for the parameter
     * @param inElement              the element on the scope for the parameter
     * @param inValue                the new value for the parameter.
     * @param inBufferOffsetInFrames generally should be set to zero - see AudioUnitScheduleParameters
     * @return noErr, or an audio unit error code (such as InvalidParameter)
     */
    @Generated
    @CFunction
    public static native int AudioUnitSetParameter(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            float inValue, int inBufferOffsetInFrames);

    /**
     * [@function] AudioUnitScheduleParameters
     * <p>
     * Schedule changes to the value of a parameter
     * <p>
     * This API is used to schedule intra-buffer changes to the value of a parameter
     * (immediate) or to ramp a parameter from a start value to an end value for a
     * specified number of samples (ramp)
     * <p>
     * The API allows for the scheduling of multiple parameter events with the one
     * call. All of the parameter events must apply to the current (and only apply to
     * the current) audio unit render call, so the events are scheduled as a part of
     * the pre-render notification callback.
     * <p>
     * When scheduling an immediate parameter event, the new value at the specified
     * sample buffer offset is provided
     * <p>
     * When scheduling a ramped parameter, the ramp is scheduled each audio unit
     * render for the duration of the ramp. Each schedule of the the new audio unit
     * render specifies the progress of the ramp.
     * <p>
     * Parameters that can have events scheduled to them will indicate this through
     * their parameter info struct
     *
     * @param inUnit           the audio unit
     * @param inParameterEvent a pointer to an array of parameter event structs
     * @param inNumParamEvents the number of parameter event structs pointed to by inParameterEvent
     * @return noErr, or an audio unit error code (such as InvalidParameter)
     */
    @Generated
    @CFunction
    public static native int AudioUnitScheduleParameters(AudioComponentInstance inUnit, VoidPtr inParameterEvent,
            int inNumParamEvents);

    /**
     * [@function] AudioUnitRender
     * <p>
     * the render operation where ioData will contain the results of the audio unit's
     * render operations
     * <p>
     * an audio unit will render the amount of audio data described by
     * inNumberOfFrames and the results of that render will be contained within
     * ioData. The caller should provide audio time stamps where at least the sample
     * time is valid and it is incrementing sequentially from its previous call
     * (so, the next time stamp will be the current time stamp + inNumberFrames)
     * If the sample time is not incrementing sequentially, the audio unit will infer
     * that there is some discontinuity with the timeline it is rendering for
     * <p>
     * The caller must provide a valid ioData AudioBufferList that matches the
     * expected topology for the current audio format for the given bus. The buffer
     * list can be of two variants:
     * (1) If the mData pointers are non-null then the audio unit will render its
     * output into those buffers. These buffers should be aligned to 16 byte
     * boundaries (which is normally what malloc will return).
     * (2) If the mData pointers are null, then the audio unit can provide pointers
     * to its own buffers. In this case the audio unit is required to keep those
     * buffers valid for the duration of the calling thread's I/O cycle
     *
     * @param inUnit            the audio unit
     * @param ioActionFlags     any appropriate action flags for the render operation
     * @param inTimeStamp       the time stamp that applies to this particular render operation. when
     *                          rendering for multiple output buses the time stamp will generally be the same
     *                          for each output bus, so the audio unit is able to determine without doubt that
     *                          this the same render operation
     * @param inOutputBusNumber the output bus to render for
     * @param inNumberFrames    the number of sample frames to render
     * @param ioData            the audio buffer list that the audio unit is to render into.
     * @return noErr, or an audio unit render error
     */
    @Generated
    @CFunction
    public static native int AudioUnitRender(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inOutputBusNumber, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int AudioUnitProcess(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int AudioUnitProcessMultiple(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inNumberFrames, int inNumberInputBufferLists, Ptr<ConstPtr<AudioBufferList>> inInputBufferLists,
            int inNumberOutputBufferLists, Ptr<Ptr<AudioBufferList>> ioOutputBufferLists);

    /**
     * [@function] AudioUnitReset
     * <p>
     * reset an audio unit's render state
     * <p>
     * This call will clear any render state of an audio unit. For instance, with a
     * delay or reverb type of audio unit reset will clear any of the delay lines
     * maintained within the audio unit. Typically, this call is made when an
     * audio unit was previously rendering, and was taken out of the render chain
     * (say, the track it is in was muted) and is being added back in (unmuted).
     * The host should reset the audio unit before adding it back so that it doesn't
     * produce audio from its delay lines that is no longer valid.
     * <p>
     * The call should only clear memory, it should NOT allocate or free memory
     * resources (this is done in the Initialize calls).
     *
     * @param inUnit    the audio unit
     * @param inScope   the scope - typically this is set to GlobalScope
     * @param inElement the element - typically this is set to 0
     * @return noErr, or an audio unit error
     */
    @Generated
    @CFunction
    public static native int AudioUnitReset(AudioComponentInstance inUnit, int inScope, int inElement);

    /**
     * [@function] AudioOutputUnitPublish
     * <p>
     * Register an audio output unit as available to be used as an audio unit by
     * other applications.
     * <p>
     * This allows a publishing application to register its audio (input/)output unit as being able
     * to be redirected and repurposed as an audio unit effect, generator, music device or music
     * effect by another host application.
     *
     * @param inOutputUnit The audio output unit to be published.
     * @param inDesc       The AudioComponentDescription under which to register the application.
     * @param inName       The application or component name.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioOutputUnitPublish(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
            CFStringRef inName, int inVersion, AudioComponentInstance inOutputUnit);

    @Generated
    @CFunction
    public static native UIImage AudioOutputUnitGetHostIcon(AudioComponentInstance au, float desiredPointSize);

    @Generated
    @CFunction
    public static native UIImage AudioComponentGetIcon(AudioComponent comp, float desiredPointSize);

    /**
     * [@function] AudioComponentGetLastActiveTime
     * <p>
     * Fetches the time at which the application publishing the component was last active.
     * <p>
     * Inter-app audio hosts can use this to sort the list of available nodes by how recently
     * the user interacted with them.
     *
     * @param comp The AudioComponent being queried.
     * @return The CFAbsoluteTime at which the node was last active (0 if never).
     */
    @Generated
    @CFunction
    public static native double AudioComponentGetLastActiveTime(AudioComponent comp);

    /**
     * -----------------------------------------------------------------------------
     * Start/stop methods for output units
     * -----------------------------------------------------------------------------
     */
    @Generated
    @CFunction
    public static native int AudioOutputUnitStart(AudioComponentInstance ci);

    @Generated
    @CFunction
    public static native int AudioOutputUnitStop(AudioComponentInstance ci);

    @Generated
    @Inline
    @CFunction
    public static native int GetAudioUnitParameterDisplayType(int flags);

    @Generated
    @Inline
    @CFunction
    public static native int SetAudioUnitParameterDisplayType(int flags, int displayType);

    /**
     * [@function] MusicDeviceMIDIEvent
     * <p>
     * Used to sent MIDI channel messages to an audio unit
     * <p>
     * This is the API used to send MIDI channel messages to an audio unit. The status and data parameters
     * are used exactly as described by the MIDI specification, including the combination of channel and
     * command in the status byte. All events sent via MusicDeviceMIDIEventList will be delivered to the
     * audio unit in the MIDI protocol returned by kAudioUnitProperty_AudioUnitMIDIProtocol.
     *
     * @param inUnit              The audio unit
     * @param inStatus            The MIDI status byte
     * @param inData1             The first MIDI data byte (value is in the range 0 < 128)
     * @param inData2             The second MIDI data byte (value is in the range 0 < 128). If the MIDI status byte
     *                            only has one
     *                            data byte, this should be set to zero.
     * @param inOffsetSampleFrame If you are scheduling the MIDI Event from the audio unit's render thread, then you can
     *                            supply a
     *                            sample offset that the audio unit may apply when applying that event in its next audio
     *                            unit render.
     *                            This allows you to schedule to the sample, the time when a MIDI command is applied and
     *                            is particularly
     *                            important when starting new notes. If you are not scheduling in the audio unit's
     *                            render thread,
     *                            then you should set this value to 0
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int MusicDeviceMIDIEvent(AudioComponentInstance inUnit, int inStatus, int inData1, int inData2,
            int inOffsetSampleFrame);

    /**
     * [@function] MusicDeviceSysEx
     * <p>
     * used to send any non-channel MIDI event to an audio unit
     * <p>
     * This is used to send any non-channel MIDI event to an audio unit. In practise this is a System Exclusive
     * (SysEx) MIDI message
     *
     * @param inUnit   The audio unit
     * @param inData   The complete MIDI SysEx message including the F0 and F7 start and termination bytes
     * @param inLength The size, in bytes, of the data
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int MusicDeviceSysEx(AudioComponentInstance inUnit,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String inData,
            int inLength);

    /**
     * [@function] MusicDeviceStartNote
     * <p>
     * used to start a note
     * <p>
     * This function is used to start a note. The caller must provide a NoteInstanceID to receive a
     * token that is then used to stop the note. The MusicDeviceStopNote call should be used to stop
     * notes started with this API. The token can also be used to address individual notes on the
     * kAudioUnitScope_Note if the audio unit supports it. The instrumentID is no longer used and the
     * kMusicNoteEvent_Unused constant should be specified (this takes the current patch for the
     * specifed group as the sound to use for the note).
     * <p>
     * The Audio unit must provide an unique ID for the note instance ID. This ID must be non-zero and not
     * 0xFFFFFFFF (any other UInt32 value is valid).
     * <p>
     * Not all Music Device audio units implement the semantics of this API (though it is strongly recommended
     * that they do). A host application shoudl query the kMusicDeviceProperty_SupportsStartStopNote to
     * check that this is supported.
     *
     * @param inUnit              The audio unit
     * @param inInstrument        The instrumentID is no longer used and the kMusicNoteEvent_Unused constant should be
     *                            specified (this takes
     *                            the current patch for the specifed group as the sound to use for the note)
     * @param inGroupID           The group ID that this note will be attached too. As with MIDI, all notes sounding on
     *                            a groupID can be
     *                            controlled through the various parameters (such as pitch bend, etc) that can be
     *                            specified on the Group
     *                            Scope
     * @param outNoteInstanceID   A pointer to receive the token that is used to identify the note. This parameter must
     *                            be specified
     * @param inOffsetSampleFrame If you are scheduling the MIDI Event from the audio unit's render thread, then you can
     *                            supply a sample offset
     *                            that the audio unit may apply when starting the note in its next audio unit render.
     *                            This allows you to
     *                            schedule to the sample and is particularly important when starting new notes. If you
     *                            are not scheduling
     *                            in the audio unit's render thread, then you should set this value to 0
     * @param inParams            The parameters to be used when starting the note - pitch and velocity must be
     *                            specified
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int MusicDeviceStartNote(AudioComponentInstance inUnit, int inInstrument, int inGroupID,
            IntPtr outNoteInstanceID, int inOffsetSampleFrame,
            @UncertainArgument("Options: reference, array Fallback: reference") MusicDeviceNoteParams inParams);

    /**
     * [@function] MusicDeviceStopNote
     * <p>
     * used to stop notes started with the MusicDeviceStartNote call
     * <p>
     * This call is used to stop notes that have been started with the MusicDeviceStartNote call; both the group ID
     * that the note was started on and the noteInstanceID should be specified.
     *
     * @param inUnit              The audio unit
     * @param inGroupID           the group ID
     * @param inNoteInstanceID    the note instance ID
     * @param inOffsetSampleFrame the sample offset within the next buffer rendered that the note should be turned off
     *                            at
     * @return noErr, or an audio unit error code
     */
    @Generated
    @CFunction
    public static native int MusicDeviceStopNote(AudioComponentInstance inUnit, int inGroupID, int inNoteInstanceID,
            int inOffsetSampleFrame);

    /**
     * [@function] NewAUGraph
     * <p>
     * Create a new AUGraph
     *
     * @param outGraph the new AUGraph object
     */
    @Generated
    @CFunction
    public static native int NewAUGraph(Ptr<AUGraph> outGraph);

    /**
     * [@function] DisposeAUGraph
     * <p>
     * Dispose an AUGraph
     * <p>
     * Deallocates the AUGraph along with its nodes and their resources.
     *
     * @param inGraph the AUGraph object to be disposed
     */
    @Generated
    @CFunction
    public static native int DisposeAUGraph(AUGraph inGraph);

    /**
     * [@function] AUGraphAddNode
     * <p>
     * Add a node to an AUGraph
     * <p>
     * Creates a node in the graph that is an AudioUnit, using the supplied
     * AudioComponentDescription to find and open that unit.
     *
     * @param inGraph       the AUGraph object
     * @param inDescription the AudioComponentDescription used to find and open the AudioUnit
     * @param outNode       the newly added node
     */
    @Generated
    @CFunction
    public static native int AUGraphAddNode(AUGraph inGraph,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDescription,
            IntPtr outNode);

    /**
     * [@function] AUGraphRemoveNode
     * <p>
     * Remove a node from an AUGraph
     * <p>
     * Nodes can be removed from any thread context. The output node of
     * the AUGraph cannot be removed while the graph is running.
     *
     * @param inGraph the AUGraph object
     * @param inNode  the node to be removed
     */
    @Generated
    @CFunction
    public static native int AUGraphRemoveNode(AUGraph inGraph, int inNode);

    /**
     * [@function] AUGraphGetNodeCount
     * <p>
     * The number of nodes in an AUGraph
     *
     * @param inGraph          the AUGraph object
     * @param outNumberOfNodes the number of nodes
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNodeCount(AUGraph inGraph, IntPtr outNumberOfNodes);

    /**
     * [@function] AUGraphGetIndNode
     * <p>
     * Returns the node at a given index
     * <p>
     * By using AUGraphGetNodeCount in conjunction with this call, you can
     * iterate through the nodes of an AUGraph.
     *
     * @param inGraph the AUGraph object
     * @param inIndex the index of the node to retrieve
     * @param outNode the node at that index
     */
    @Generated
    @CFunction
    public static native int AUGraphGetIndNode(AUGraph inGraph, int inIndex, IntPtr outNode);

    /**
     * [@function] AUGraphNodeInfo
     * <p>
     * Returns information about a particular AUNode
     * <p>
     * You can pass in NULL for any of the out parameters if you're not interested
     * in that value.
     *
     * @param inGraph        the AUGraph object
     * @param inNode         the node to query
     * @param outDescription the component description that would describe the AudioUnit of this node
     * @param outAudioUnit   the AudioUnit of this node
     */
    @Generated
    @CFunction
    public static native int AUGraphNodeInfo(AUGraph inGraph, int inNode,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDescription,
            Ptr<AudioComponentInstance> outAudioUnit);

    /**
     * [@function] AUGraphConnectNodeInput
     * <p>
     * connect a node's output to a node's input
     */
    @Generated
    @CFunction
    public static native int AUGraphConnectNodeInput(AUGraph inGraph, int inSourceNode, int inSourceOutputNumber,
            int inDestNode, int inDestInputNumber);

    /**
     * [@function] AUGraphSetNodeInputCallback
     * <p>
     * Set a callback for the specified node's specified input.
     *
     * @param inInputCallback The callback that will provide input data to the node
     */
    @Generated
    @CFunction
    public static native int AUGraphSetNodeInputCallback(AUGraph inGraph, int inDestNode, int inDestInputNumber,
            @UncertainArgument("Options: reference, array Fallback: reference") AURenderCallbackStruct inInputCallback);

    /**
     * [@function] AUGraphDisconnectNodeInput
     * <p>
     * disconnect a node's input
     * <p>
     * This can be used to disconnect either a connection or callback interaction
     * to the specified node input
     */
    @Generated
    @CFunction
    public static native int AUGraphDisconnectNodeInput(AUGraph inGraph, int inDestNode, int inDestInputNumber);

    /**
     * [@function] AUGraphClearConnections
     * <p>
     * clear all of the interactions in a graph
     * <p>
     * This will clear all connections and callback interactions of the nodes of a graph
     */
    @Generated
    @CFunction
    public static native int AUGraphClearConnections(AUGraph inGraph);

    /**
     * [@function] AUGraphGetNumberOfInteractions
     * <p>
     * Retrieve the number of interactions of a graph
     * <p>
     * The number of node interactions currently being managed by the graph
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNumberOfInteractions(AUGraph inGraph, IntPtr outNumInteractions);

    /**
     * [@function] AUGraphGetInteractionInfo
     * <p>
     * Retrieve information about a particular interaction in a graph
     * <p>
     * Returns information about a particular interaction.
     * inInteractionIndex is based on the outNumInteractions value and is only valid if no
     * edits to the graph's state have been made.
     * <p>
     * An app can iterate through the interactions (as with the nodes) of a graph by retrieving
     * the number of interactions, and then iterating an index from 0 < numInteractions
     *
     * @param outInteraction the interaction information at the specified index
     */
    @Generated
    @CFunction
    public static native int AUGraphGetInteractionInfo(AUGraph inGraph, int inInteractionIndex, VoidPtr outInteraction);

    /**
     * [@function] AUGraphCountNodeInteractions
     * <p>
     * Retrieve the number of interactions of a graph's node
     * <p>
     * The number of node interactions currently being managed by the graph for the specified node.
     */
    @Generated
    @CFunction
    public static native int AUGraphCountNodeInteractions(AUGraph inGraph, int inNode, IntPtr outNumInteractions);

    /**
     * [@function] AUGraphGetNodeInteractions
     * <p>
     * Retrieve information about the interactions in a graph for a given node
     *
     * @param ioNumInteractions on input, specifies the number of interactions that can be returned
     *                          on output, specifies the number of interactions returned.
     * @param outInteractions   the interactions the specified node is involved in
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNodeInteractions(AUGraph inGraph, int inNode, IntPtr ioNumInteractions,
            VoidPtr outInteractions);

    /**
     * [@function] AUGraphUpdate
     * <p>
     * Updates the state of a running AUGraph
     * <p>
     * Call this after performing a series of "edits" on the AUGraph with calls
     * such as AUGraphConnectNodeInput() to finalize those edits.
     * The call will be synchronous if outIsUpdated is NULL,
     * meaning it will block until the changes are incorporated
     * into the graph OR an error is returned from the update process
     * if outIsUpdated is non-NULL, then AUGraphUpdate() will return
     * immediately and outIsUpdated will equal "true" if the changes
     * were already made (no more changes to make) or "false" if changes are still
     * outstanding.
     * <p>
     * Calling from the AUGraphRenderNotification callback:
     * Connection and Disconnection events can be completely processed
     * in the render notification callback of the AUGraph
     * Nodes can also be removed (except for the output node or a sub-graph of the AUGraph)
     * as well.
     * <p>
     * Getting kAUGraphErr_CannotDoInCurrentContext as a result code:
     * If AUGraphUpdate returns this result, then it means it was
     * unable to process the update, due to an inability to safely
     * alter the state of the graph (because another thread was accessing
     * a call that relies on the graph's state having integrity).
     * This result code is only a transitory state, which will pass as soon
     * as your other thread's call to AUGraph (that has the lock) completes.
     * <p>
     * If an error is encountered in the process of an update (say an invalid connection
     * is attempted, a disconnection between nodes that are not connected, etc) on a running graph,
     * then the call will return that error code. It only process events whilst it receives
     * no error results. Thus, if an error is encountered, other events will not be
     * processed until AUGraphUpdate is called again. This is done, in cases where
     * the state of the graph could become inconsistent if further events were processed, so
     * this decision is left up to you. The same applies to the "cant do" error - you have
     * to explicitly call AUGraphUpdate again to have the processing of the events occur.
     *
     * @param outIsUpdated if specified returns true if all of the edits were applied to the graph
     */
    @Generated
    @CFunction
    public static native int AUGraphUpdate(AUGraph inGraph, BytePtr outIsUpdated);

    /**
     * [@function] AUGraphOpen
     * <p>
     * Open a graph
     * <p>
     * AudioUnits are open but not initialized (no resource allocation occurs here)
     */
    @Generated
    @CFunction
    public static native int AUGraphOpen(AUGraph inGraph);

    /**
     * [@function] AUGraphClose
     * <p>
     * Close a graph
     * <p>
     * All AudioUnits are closed - leaving only its nodal representation
     */
    @Generated
    @CFunction
    public static native int AUGraphClose(AUGraph inGraph);

    /**
     * [@function] AUGraphInitialize
     * <p>
     * Initialise a graph
     * <p>
     * AudioUnitInitialize() is called on each opened node/AudioUnit
     * (get ready to render) and SubGraph that are involved in a
     * interaction. If the node is not involved, it is initialised
     * after it becomes involved in an interaction.
     * <p>
     * A graph must be opened before it can be initialised.
     */
    @Generated
    @CFunction
    public static native int AUGraphInitialize(AUGraph inGraph);

    /**
     * [@function] AUGraphUninitialize
     * <p>
     * Uninitialise a graph
     * <p>
     * The member of the graph are uninitialised
     */
    @Generated
    @CFunction
    public static native int AUGraphUninitialize(AUGraph inGraph);

    /**
     * [@function] AUGraphStart
     * <p>
     * Start a graph
     * <p>
     * Start() is called on the "head" node(s) of the AUGraph (now rendering starts)
     * <p>
     * The graph must be initialised before it can be started.
     */
    @Generated
    @CFunction
    public static native int AUGraphStart(AUGraph inGraph);

    /**
     * [@function] AUGraphStop
     * <p>
     * Stop a graph
     * <p>
     * Stop() is called on the "head" node(s) of the AUGraph (rendering is stopped)
     */
    @Generated
    @CFunction
    public static native int AUGraphStop(AUGraph inGraph);

    /**
     * [@function] AUGraphIsOpen
     * <p>
     * Is the graph open
     */
    @Generated
    @CFunction
    public static native int AUGraphIsOpen(AUGraph inGraph, BytePtr outIsOpen);

    /**
     * [@function] AUGraphIsInitialized
     * <p>
     * Is the graph initialised
     */
    @Generated
    @CFunction
    public static native int AUGraphIsInitialized(AUGraph inGraph, BytePtr outIsInitialized);

    /**
     * [@function] AUGraphIsRunning
     * <p>
     * Is the graph running (has it been started)
     */
    @Generated
    @CFunction
    public static native int AUGraphIsRunning(AUGraph inGraph, BytePtr outIsRunning);

    /**
     * [@function] AUGraphGetCPULoad
     * <p>
     * The CPU load of the graph
     * <p>
     * Returns a short-term running average of the current CPU load of the graph.
     */
    @Generated
    @CFunction
    public static native int AUGraphGetCPULoad(AUGraph inGraph, FloatPtr outAverageCPULoad);

    /**
     * [@function] AUGraphGetMaxCPULoad
     * <p>
     * The Maximum CPU load of the graph
     * <p>
     * Returns the max CPU load of the graph since this call was last made or the graph was last
     * started.
     */
    @Generated
    @CFunction
    public static native int AUGraphGetMaxCPULoad(AUGraph inGraph, FloatPtr outMaxLoad);

    /**
     * [@function] AUGraphAddRenderNotify
     * <p>
     * Add a notification callback
     * <p>
     * Add a callback that the graph will call every time the graph renders. The callback will be
     * called once before the graph's render operation, and once after the render operation is
     * complete.
     */
    @Generated
    @CFunction
    public static native int AUGraphAddRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphAddRenderNotify") Function_AUGraphAddRenderNotify inCallback,
            VoidPtr inRefCon);

    /**
     * [@function] AUGraphRemoveRenderNotify
     * <p>
     * Remove a notification callback
     * <p>
     * Remove a previously added callback. You must provide both the callback and the refCon that was
     * used previously to add the callback.
     */
    @Generated
    @CFunction
    public static native int AUGraphRemoveRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphRemoveRenderNotify") Function_AUGraphRemoveRenderNotify inCallback,
            VoidPtr inRefCon);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterNew
     * <p>
     * Create a new AudioConverter.
     *
     * @param inSourceFormat      The format of the source audio to be converted.
     * @param inDestinationFormat The destination format to which the audio is to be converted.
     * @param outAudioConverter   On successful return, points to a new AudioConverter instance.
     * @return An OSStatus result code.
     *         <p>
     *         For a pair of linear PCM formats, the following conversions
     *         are supported:
     *
     *         <ul>
     *         <li>addition and removal of channels, when the stream descriptions'
     *         mChannelsPerFrame does not match. Channels may also be reordered and removed
     *         using the kAudioConverterChannelMap property.</li>
     *         <li>sample rate conversion</li>
     *         <li>interleaving/deinterleaving, when the stream descriptions' (mFormatFlags &
     *         kAudioFormatFlagIsNonInterleaved) does not match.</li>
     *         <li>conversion between any pair of the following formats:</li>
     *         <ul>
     *         <li>8 bit integer, signed or unsigned</li>
     *         <li>16, 24, or 32-bit integer, big- or little-endian. Other integral
     *         bit depths, if high-aligned and non-packed, are also supported</li>
     *         <li>32 and 64-bit float, big- or little-endian.</li>
     *         </ul>
     *         </ul>
     *         <p>
     *         Also, encoding and decoding between linear PCM and compressed formats is
     *         supported. Functions in AudioToolbox/AudioFormat.h return information about the
     *         supported formats. When using a codec, you can use any supported PCM format (as
     *         above); the converter will perform any necessary additional conversion between
     *         your PCM format and the one created or consumed by the codec.
     */
    @Generated
    @CFunction
    public static native int AudioConverterNew(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            Ptr<AudioConverterRef> outAudioConverter);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterNewSpecific
     * <p>
     * Create a new AudioConverter using specific codecs.
     *
     * @param inSourceFormat            The format of the source audio to be converted.
     * @param inDestinationFormat       The destination format to which the audio is to be converted.
     * @param inNumberClassDescriptions The number of class descriptions.
     * @param inClassDescriptions       AudioClassDescriptions specifiying the codec to instantiate.
     * @param outAudioConverter         On successful return, points to a new AudioConverter instance.
     * @return An OSStatus result code.
     *         <p>
     *         This function is identical to AudioConverterNew(), except that the client may
     *         explicitly choose which codec to instantiate if there is more than one choice.
     */
    @Generated
    @CFunction
    public static native int AudioConverterNewSpecific(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            int inNumberClassDescriptions,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioClassDescription inClassDescriptions,
            Ptr<AudioConverterRef> outAudioConverter);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterDispose
     * <p>
     * Destroy an AudioConverter.
     *
     * @param inAudioConverter The AudioConverter to dispose.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioConverterDispose(AudioConverterRef inAudioConverter);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterReset
     * <p>
     * Reset an AudioConverter
     *
     * @param inAudioConverter The AudioConverter to reset.
     * @return An OSStatus result code.
     *         <p>
     *         Should be called whenever there is a discontinuity in the source audio stream
     *         being provided to the converter. This will flush any internal buffers in the
     *         converter.
     */
    @Generated
    @CFunction
    public static native int AudioConverterReset(AudioConverterRef inAudioConverter);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterGetPropertyInfo
     * <p>
     * Returns information about an AudioConverter property.
     *
     * @param inAudioConverter The AudioConverter to query.
     * @param inPropertyID     The property to query.
     * @param outSize          If non-null, on exit, the maximum size of the property value in bytes.
     * @param outWritable      If non-null, on exit, indicates whether the property value is writable.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioConverterGetPropertyInfo(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterGetProperty
     * <p>
     * Returns an AudioConverter property value.
     *
     * @param inAudioConverter   The AudioConverter to query.
     * @param inPropertyID       The property to fetch.
     * @param ioPropertyDataSize On entry, the size of the memory pointed to by outPropertyData. On
     *                           successful exit, the size of the property value.
     * @param outPropertyData    On exit, the property value.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioConverterGetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterSetProperty
     * <p>
     * Sets an AudioConverter property value.
     *
     * @param inAudioConverter   The AudioConverter to modify.
     * @param inPropertyID       The property to set.
     * @param inPropertyDataSize The size in bytes of the property value.
     * @param inPropertyData     Points to the new property value.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioConverterSetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterConvertBuffer
     * <p>
     * Converts data from an input buffer to an output buffer.
     *
     * @param inAudioConverter The AudioConverter to use.
     * @param inInputDataSize  The size of the buffer inInputData.
     * @param inInputData      The input audio data buffer.
     * @param ioOutputDataSize On entry, the size of the buffer outOutputData. On exit, the number of bytes
     *                         written to outOutputData.
     * @param outOutputData    The output data buffer.
     * @return Produces a buffer of output data from an AudioConverter, using the supplied
     *         input buffer.
     *         <p>
     *         WARNING: this function will fail for any conversion where there is a
     *         variable relationship between the input and output data buffer sizes. This
     *         includes sample rate conversions and most compressed formats. In these cases,
     *         use AudioConverterFillComplexBuffer. Generally this function is only appropriate for
     *         PCM-to-PCM conversions where there is no sample rate conversion.
     */
    @Generated
    @CFunction
    public static native int AudioConverterConvertBuffer(AudioConverterRef inAudioConverter, int inInputDataSize,
            ConstVoidPtr inInputData, IntPtr ioOutputDataSize, VoidPtr outOutputData);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterFillComplexBuffer
     * <p>
     * Converts data supplied by an input callback function, supporting non-interleaved
     * and packetized formats.
     *
     * @param inAudioConverter        The AudioConverter to use.
     * @param inInputDataProc         A callback function which supplies the input data.
     * @param inInputDataProcUserData A value for the use of the callback function.
     * @param ioOutputDataPacketSize  On entry, the capacity of outOutputData expressed in packets in the
     *                                converter's output format. On exit, the number of packets of converted
     *                                data that were written to outOutputData.
     * @param outOutputData           The converted output data is written to this buffer. On entry, the buffers'
     *                                mDataByteSize fields (which must all be the same) reflect buffer capacity.
     *                                On exit, mDataByteSize is set to the number of bytes written.
     * @param outPacketDescription    If non-null, and the converter's output uses packet descriptions, then
     *                                packet descriptions are written to this array. It must point to a memory
     *                                block capable of holding *ioOutputDataPacketSize packet descriptions.
     *                                (See AudioFormat.h for ways to determine whether an audio format
     *                                uses packet descriptions).
     * @return An OSStatus result code.
     *         <p>
     *         Produces a buffer list of output data from an AudioConverter. The supplied input
     *         callback function is called whenever necessary.
     */
    @Generated
    @CFunction
    public static native int AudioConverterFillComplexBuffer(AudioConverterRef inAudioConverter,
            @FunctionPtr(name = "call_AudioConverterFillComplexBuffer") Function_AudioConverterFillComplexBuffer inInputDataProc,
            VoidPtr inInputDataProcUserData, IntPtr ioOutputDataPacketSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription outPacketDescription);

    /**
     * -----------------------------------------------------------------------------
     * [@function] AudioConverterConvertComplexBuffer
     * <p>
     * Converts PCM data from an input buffer list to an output buffer list.
     * <p>
     * [@warning] This function will fail for any conversion where there is a
     * variable relationship between the input and output data buffer sizes. This
     * includes sample rate conversions and most compressed formats. In these cases,
     * use AudioConverterFillComplexBuffer. Generally this function is only appropriate for
     * PCM-to-PCM conversions where there is no sample rate conversion.
     *
     * @param inAudioConverter  The AudioConverter to use.
     * @param inNumberPCMFrames The number of PCM frames to convert.
     * @param inInputData       The source audio buffer list.
     * @param outOutputData     The converted output data is written to this buffer list.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioConverterConvertComplexBuffer(AudioConverterRef inAudioConverter,
            int inNumberPCMFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inInputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NumBytesToNumAudioFileMarkers(@NUInt long inNumBytes);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NumAudioFileMarkersToNumBytes(@NUInt long inNumMarkers);

    @Generated
    @Inline
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFileRegion NextAudioFileRegion(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioFileRegion inAFRegionPtr);

    /**
     * [@function] AudioFileCreateWithURL
     * <p>
     * creates a new audio file (or initialises an existing file)
     * <p>
     * creates a new (or initialises an existing) audio file specified by the URL.
     * Upon success, an AudioFileID is returned which can be used for subsequent calls
     * to the AudioFile APIs.
     *
     * @param inFileRef    an CFURLRef fully specifying the path of the file to create/initialise
     * @param inFileType   an AudioFileTypeID indicating the type of audio file to create.
     * @param inFormat     an AudioStreamBasicDescription describing the data format that will be
     *                     added to the audio file.
     * @param inFlags      relevant flags for creating/opening the file.
     *                     if kAudioFileFlags_EraseFile is set, it will erase an existing file
     *                     if not set, then the Create call will fail if the URL is an existing file
     * @param outAudioFile if successful, an AudioFileID that can be used for subsequent AudioFile calls.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileCreateWithURL(CFURLRef inFileRef, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, Ptr<AudioFileID> outAudioFile);

    /**
     * [@function] AudioFileOpenURL
     * <p>
     * Open an existing audio file.
     * <p>
     * Open an existing audio file for reading or reading and writing.
     *
     * @param inFileRef      the CFURLRef of an existing audio file.
     * @param inPermissions  use the permission constants
     * @param inFileTypeHint For files which have no filename extension and whose type cannot be easily or
     *                       uniquely determined from the data (ADTS,AC3), this hint can be used to indicate the file
     *                       type.
     *                       Otherwise you can pass zero for this. The hint is only used on OS versions 10.3.1 or
     *                       greater.
     *                       For OS versions prior to that, opening files of the above description will fail.
     * @param outAudioFile   upon success, an AudioFileID that can be used for subsequent
     *                       AudioFile calls.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileOpenURL(CFURLRef inFileRef, byte inPermissions, int inFileTypeHint,
            Ptr<AudioFileID> outAudioFile);

    /**
     * [@function] AudioFileInitializeWithCallbacks
     * <p>
     * Wipe clean an existing file. You provide callbacks that the AudioFile API
     * will use to get the data.
     *
     * @param inClientData  a constant that will be passed to your callbacks.
     * @param inReadFunc    a function that will be called when AudioFile needs to read data.
     * @param inWriteFunc   a function that will be called when AudioFile needs to write data.
     * @param inGetSizeFunc a function that will be called when AudioFile needs to know the file size.
     * @param inSetSizeFunc a function that will be called when AudioFile needs to set the file size.
     * @param inFileType    an AudioFileTypeID indicating the type of audio file to which to initialize the file.
     * @param inFormat      an AudioStreamBasicDescription describing the data format that will be
     *                      added to the audio file.
     * @param inFlags       flags for creating/opening the file. Currently zero.
     * @param outAudioFile  upon success, an AudioFileID that can be used for subsequent
     *                      AudioFile calls.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileInitializeWithCallbacks(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_1") Function_AudioFileInitializeWithCallbacks_1 inReadFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_2") Function_AudioFileInitializeWithCallbacks_2 inWriteFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_3") Function_AudioFileInitializeWithCallbacks_3 inGetSizeFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_4") Function_AudioFileInitializeWithCallbacks_4 inSetSizeFunc,
            int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, Ptr<AudioFileID> outAudioFile);

    /**
     * [@function] AudioFileOpenWithCallbacks
     * <p>
     * Open an existing file. You provide callbacks that the AudioFile API
     * will use to get the data.
     *
     * @param inClientData   a constant that will be passed to your callbacks.
     * @param inReadFunc     a function that will be called when AudioFile needs to read data.
     * @param inWriteFunc    a function that will be called when AudioFile needs to write data.
     * @param inGetSizeFunc  a function that will be called when AudioFile needs to know the total file size.
     * @param inSetSizeFunc  a function that will be called when AudioFile needs to set the file size.
     * @param inFileTypeHint For files which have no filename extension and whose type cannot be easily or
     *                       uniquely determined from the data (ADTS,AC3), this hint can be used to indicate the file
     *                       type.
     *                       Otherwise you can pass zero for this. The hint is only used on OS versions 10.3.1 or
     *                       greater.
     *                       For OS versions prior to that, opening files of the above description will fail.
     * @param outAudioFile   upon success, an AudioFileID that can be used for subsequent
     *                       AudioFile calls.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileOpenWithCallbacks(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_1") Function_AudioFileOpenWithCallbacks_1 inReadFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_2") Function_AudioFileOpenWithCallbacks_2 inWriteFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_3") Function_AudioFileOpenWithCallbacks_3 inGetSizeFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_4") Function_AudioFileOpenWithCallbacks_4 inSetSizeFunc,
            int inFileTypeHint, Ptr<AudioFileID> outAudioFile);

    /**
     * [@function] AudioFileClose
     * <p>
     * Close an existing audio file.
     *
     * @param inAudioFile an AudioFileID.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileClose(AudioFileID inAudioFile);

    /**
     * [@function] AudioFileOptimize
     * <p>
     * Move the audio data to the end of the file and other internal optimizations of the file structure.
     * <p>
     * Optimize the file so additional audio data can be appended to
     * the existing data. Generally, this will place the audio data at
     * the end of the file so additional writes can be placed to the
     * file end. This can be a potentially expensive and time-consuming operation
     * and should not be used during time critical operations. There is
     * a kAudioFilePropertyIsOptimized property for checking on the optimized state
     * of the file.
     *
     * @param inAudioFile an AudioFileID.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileOptimize(AudioFileID inAudioFile);

    /**
     * [@function] AudioFileReadBytes
     * <p>
     * Read bytes of audio data from the audio file.
     * <p>
     * Returns kAudioFileEndOfFileError when read encounters end of file.
     *
     * @param inAudioFile    an AudioFileID.
     * @param inUseCache     true if it is desired to cache the data upon read, else false
     * @param inStartingByte the byte offset of the audio data desired to be returned
     * @param ioNumBytes     on input, the number of bytes to read, on output, the number of
     *                       bytes actually read.
     * @param outBuffer      outBuffer should be a void * to user allocated memory large enough for the requested bytes.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileReadBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, VoidPtr outBuffer);

    /**
     * [@function] AudioFileWriteBytes
     * <p>
     * Write bytes of audio data to the audio file.
     *
     * @param inAudioFile    an AudioFileID.
     * @param inUseCache     true if it is desired to cache the data upon write, else false
     * @param inStartingByte the byte offset where the audio data should be written
     * @param ioNumBytes     on input, the number of bytes to write, on output, the number of
     *                       bytes actually written.
     * @param inBuffer       inBuffer should be a void * containing the bytes to be written
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileWriteBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, ConstVoidPtr inBuffer);

    /**
     * [@function] AudioFileReadPacketData
     * <p>
     * Read packets of audio data from the audio file.
     * <p>
     * AudioFileReadPacketData reads as many of the requested number of packets
     * as will fit in the buffer size given by ioNumPackets.
     * Unlike the deprecated AudioFileReadPackets, ioNumPackets must be initialized.
     * If the byte size of the number packets requested is
     * less than the buffer size, ioNumBytes will be reduced.
     * If the buffer is too small for the number of packets
     * requested, ioNumPackets and ioNumBytes will be reduced
     * to the number of packets that can be accommodated and their byte size.
     * Returns kAudioFileEndOfFileError when read encounters end of file.
     * For all uncompressed formats, packets == frames.
     *
     * @param inAudioFile           an AudioFileID.
     * @param inUseCache            true if it is desired to cache the data upon read, else false
     * @param ioNumBytes            on input the size of outBuffer in bytes.
     *                              on output, the number of bytes actually returned.
     * @param outPacketDescriptions An array of packet descriptions describing the packets being returned.
     *                              The size of the array must be greater or equal to the number of packets requested.
     *                              On return the packet description will be filled out with the packet offsets and
     *                              sizes.
     *                              Packet descriptions are ignored for CBR data.
     * @param inStartingPacket      The packet index of the first packet desired to be returned
     * @param ioNumPackets          on input, the number of packets to read, on output, the number of
     *                              packets actually read.
     * @param outBuffer             outBuffer should be a pointer to user allocated memory.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileReadPacketData(AudioFileID inAudioFile, byte inUseCache, IntPtr ioNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    /**
     * [@function] AudioFileReadPackets
     * <p>
     * Read packets of audio data from the audio file.
     * <p>
     * AudioFileReadPackets is DEPRECATED. Use AudioFileReadPacketData instead.
     * READ THE HEADER DOC FOR AudioFileReadPacketData. It is not a drop-in replacement.
     * In particular, for AudioFileReadPacketData ioNumBytes must be initialized to the buffer size.
     * AudioFileReadPackets assumes you have allocated your buffer to ioNumPackets times the maximum packet size.
     * For many compressed formats this will only use a portion of the buffer since the ratio of the maximum
     * packet size to the typical packet size can be large. Use AudioFileReadPacketData instead.
     *
     * @param inAudioFile           an AudioFileID.
     * @param inUseCache            true if it is desired to cache the data upon read, else false
     * @param outNumBytes           on output, the number of bytes actually returned
     * @param outPacketDescriptions on output, an array of packet descriptions describing
     *                              the packets being returned. NULL may be passed for this
     *                              parameter. Nothing will be returned for linear pcm data.
     * @param inStartingPacket      the packet index of the first packet desired to be returned
     * @param ioNumPackets          on input, the number of packets to read, on output, the number of
     *                              packets actually read.
     * @param outBuffer             outBuffer should be a pointer to user allocated memory of size:
     *                              number of packets requested times file's maximum (or upper bound on)
     *                              packet size.
     * @return returns noErr if successful.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioFileReadPackets(AudioFileID inAudioFile, byte inUseCache, IntPtr outNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    /**
     * [@function] AudioFileWritePackets
     * <p>
     * Write packets of audio data to the audio file.
     * <p>
     * For all uncompressed formats, packets == frames.
     *
     * @param inAudioFile          an AudioFileID.
     * @param inUseCache           true if it is desired to cache the data upon write, else false
     * @param inNumBytes           the number of bytes being provided for write
     * @param inPacketDescriptions an array of packet descriptions describing the packets being
     *                             provided. Not all formats require packet descriptions to be
     *                             provided. NULL may be passed if no descriptions are required.
     * @param inStartingPacket     the packet index of where the first packet provided should be placed.
     * @param ioNumPackets         on input, the number of packets to write, on output, the number of
     *                             packets actually written.
     * @param inBuffer             a void * to user allocated memory containing the packets to write.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileWritePackets(AudioFileID inAudioFile, byte inUseCache, int inNumBytes,
            ConstPtr<AudioStreamPacketDescription> inPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            ConstVoidPtr inBuffer);

    /**
     * [@function] AudioFileCountUserData
     * <p>
     * Get the number of user data items with a certain ID in the file
     * <p>
     * "User Data" refers to chunks in AIFF, CAF and WAVE files, or resources
     * in Sound Designer II files, and possibly other things in other files.
     * For simplicity, referred to below as "chunks".
     *
     * @param inAudioFile    an AudioFileID.
     * @param inUserDataID   the four char code of the chunk.
     * @param outNumberItems on output, if successful, number of chunks of this type in the file.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileCountUserData(AudioFileID inAudioFile, int inUserDataID, IntPtr outNumberItems);

    /**
     * [@function] AudioFileGetUserDataSize
     * <p>
     * Get the size of user data in a file
     *
     * @param inAudioFile     an AudioFileID.
     * @param inUserDataID    the four char code of the chunk.
     * @param inIndex         an index specifying which chunk if there are more than one.
     * @param outUserDataSize on output, if successful, the size of the user data chunk.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetUserDataSize(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr outUserDataSize);

    /**
     * [@function] AudioFileGetUserData
     * <p>
     * Get the data of a chunk in a file.
     *
     * @param inAudioFile    an AudioFileID.
     * @param inUserDataID   the four char code of the chunk.
     * @param inIndex        an index specifying which chunk if there are more than one.
     * @param outUserData    a pointer to a buffer in which to copy the chunk data.
     * @param ioUserDataSize the size of the buffer on input, size of bytes copied to buffer on output
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr ioUserDataSize, VoidPtr outUserData);

    /**
     * [@function] AudioFileSetUserData
     * <p>
     * Set the data of a chunk in a file.
     *
     * @param inAudioFile    an AudioFileID.
     * @param inUserDataID   the four char code of the chunk.
     * @param inIndex        an index specifying which chunk if there are more than one.
     * @param inUserData     a pointer to a buffer from which to copy the chunk data
     *                       (only the contents of the chunk, not including the chunk header).
     * @param inUserDataSize on input the size of the data to copy, on output, size of bytes copied from the buffer
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileSetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            int inUserDataSize, ConstVoidPtr inUserData);

    /**
     * [@function] AudioFileRemoveUserData
     * <p>
     * Remove a user chunk in a file.
     *
     * @param inAudioFile  an AudioFileID.
     * @param inUserDataID the four char code of the chunk.
     * @param inIndex      an index specifying which chunk if there are more than one.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileRemoveUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex);

    /**
     * [@function] AudioFileGetPropertyInfo
     * <p>
     * Get information about the size of a property of an AudioFile and whether it can be set.
     *
     * @param inAudioFile  an AudioFileID.
     * @param inPropertyID an AudioFileProperty constant.
     * @param outDataSize  the size in bytes of the current value of the property. In order to get the property value,
     *                     you will need a buffer of this size.
     * @param isWritable   will be set to 1 if writable, or 0 if read only.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetPropertyInfo(AudioFileID inAudioFile, int inPropertyID, IntPtr outDataSize,
            IntPtr isWritable);

    /**
     * [@function] AudioFileGetProperty
     * <p>
     * Copies the value for a property of an AudioFile into a buffer.
     *
     * @param inAudioFile     an AudioFileID.
     * @param inPropertyID    an AudioFileProperty constant.
     * @param ioDataSize      on input the size of the outPropertyData buffer. On output the number of bytes written to
     *                        the buffer.
     * @param outPropertyData the buffer in which to write the property data.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetProperty(AudioFileID inAudioFile, int inPropertyID, IntPtr ioDataSize,
            VoidPtr outPropertyData);

    /**
     * [@function] AudioFileSetProperty
     * <p>
     * Sets the value for a property of an AudioFile .
     *
     * @param inAudioFile    an AudioFileID.
     * @param inPropertyID   an AudioFileProperty constant.
     * @param inDataSize     the size of the property data.
     * @param inPropertyData the buffer containing the property data.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileSetProperty(AudioFileID inAudioFile, int inPropertyID, int inDataSize,
            ConstVoidPtr inPropertyData);

    /**
     * [@function] AudioFileGetGlobalInfoSize
     * <p>
     * Get the size of a global property.
     *
     * @param inPropertyID    an AudioFileGlobalInfo property constant.
     * @param inSpecifierSize The size of the specifier data.
     * @param inSpecifier     A specifier is a buffer of data used as an input argument to some of the global info
     *                        properties.
     * @param outDataSize     the size in bytes of the current value of the property. In order to get the property
     *                        value,
     *                        you will need a buffer of this size.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfoSize(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr outDataSize);

    /**
     * [@function] AudioFileGetGlobalInfo
     * <p>
     * Copies the value for a global property into a buffer.
     *
     * @param inPropertyID    an AudioFileGlobalInfo property constant.
     * @param inSpecifierSize The size of the specifier data.
     * @param inSpecifier     A specifier is a buffer of data used as an input argument to some of the global info
     *                        properties.
     * @param ioDataSize      on input the size of the outPropertyData buffer. On output the number of bytes written to
     *                        the buffer.
     * @param outPropertyData the buffer in which to write the property data.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfo(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr ioDataSize, VoidPtr outPropertyData);

    /**
     * [@function] AudioFileStreamOpen
     * <p>
     * Create a new audio file stream parser.
     * The client provides the parser with data and the parser calls
     * callbacks when interesting things are found in the data, such as properties and
     * audio packets.
     *
     * @param inFileTypeHint         For files whose type cannot be easily or uniquely determined from the data
     *                               (ADTS,AC3),
     *                               this hint can be used to indicate the file type.
     *                               Otherwise if you do not know the file type, you can pass zero.
     * @param inClientData           a constant that will be passed to your callbacks.
     * @param inPropertyListenerProc Whenever the value of a property is parsed in the data, this function will be
     *                               called.
     *                               You can then get the value of the property from in the callback. In some cases, due
     *                               to
     *                               boundaries in the input data, the property may return
     *                               kAudioFileStreamError_DataUnavailable.
     *                               When unavailable data is requested from within the property listener, the parser
     *                               will begin
     *                               caching the property value and will call the property listener again when the
     *                               property is
     *                               available. For property values for which
     *                               kAudioFileStreamPropertyFlag_PropertyIsCached is unset, this
     *                               will be the only opportunity to get the value of the property, since the data will
     *                               be
     *                               disposed upon return of the property listener callback.
     * @param inPacketsProc          Whenever packets are parsed in the data, a pointer to the packets is passed to the
     *                               client
     *                               using this callback. At times only a single packet may be passed due to boundaries
     *                               in the
     *                               input data.
     * @param outAudioFileStream     A new file stream ID for use in other AudioFileStream API calls.
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamOpen(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileStreamOpen_1") Function_AudioFileStreamOpen_1 inPropertyListenerProc,
            @FunctionPtr(name = "call_AudioFileStreamOpen_2") Function_AudioFileStreamOpen_2 inPacketsProc,
            int inFileTypeHint, Ptr<AudioFileStreamID> outAudioFileStream);

    /**
     * [@function] AudioFileStreamParseBytes
     * <p>
     * This call is the means for streams to supply data to the parser.
     * Data is expected to be passed in sequentially from the beginning of the file, without gaps.
     * In the course of parsing, the client's property and/or packets callbacks may be called.
     * At the end of the stream, this function must be called once with null data pointer and zero
     * data byte size to flush any remaining packets out of the parser.
     *
     * @param inAudioFileStream The file stream ID
     * @param inDataByteSize    The number of bytes passed in for parsing. Must be zero when flushing the parser.
     * @param inData            The data passed in to be parsed. Must be null when flushing the parser.
     * @param inFlags           If there is a data discontinuity, then kAudioFileStreamParseFlag_Discontinuity should be
     *                          set true.
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamParseBytes(AudioFileStreamID inAudioFileStream, int inDataByteSize,
            ConstVoidPtr inData, int inFlags);

    /**
     * [@function] AudioFileStreamSeek
     * <p>
     * This call is used to seek in the data stream. The client passes in a packet
     * offset to seek to and the parser passes back a byte offset from which to
     * get the data to satisfy that request. The data passed to the next call to
     * AudioFileParseBytes will be assumed to be from that byte offset.
     * For file formats which do not contain packet tables the byte offset may
     * be an estimate. If so, the flag kAudioFileStreamSeekFlag_OffsetIsEstimated will be true.
     *
     * @param inAudioFileStream The file stream ID
     * @param inPacketOffset    The offset from the beginning of the file of the packet to which to seek.
     * @param outDataByteOffset The byte offset of the data from the file's data offset returned.
     *                          You need to add the value of kAudioFileStreamProperty_DataOffset to get an absolute byte
     *                          offset in the file.
     * @param ioFlags           If outDataByteOffset is an estimate, then kAudioFileStreamSeekFlag_OffsetIsEstimated
     *                          will be set on output.
     *                          There are currently no flags defined for passing into this call.
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamSeek(AudioFileStreamID inAudioFileStream, long inPacketOffset,
            LongPtr outDataByteOffset, IntPtr ioFlags);

    /**
     * [@function] AudioFileStreamGetPropertyInfo
     * <p>
     * Retrieve the info about the given property. The outSize argument
     * will return the size in bytes of the current value of the property.
     *
     * @param inAudioFileStream   The file stream ID
     * @param inPropertyID        Property ID whose value should be read
     * @param outPropertyDataSize Size in bytes of the property
     * @param outWritable         whether the property is writable
     * @return an OSStatus return code
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamGetPropertyInfo(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr outPropertyDataSize, BytePtr outWritable);

    /**
     * [@function] AudioFileStreamGetProperty
     * <p>
     * Retrieve the indicated property data.
     *
     * @param inAudioFileStream  The file stream ID
     * @param inPropertyID       Property ID whose value should be read
     * @param ioPropertyDataSize On input, the size of the buffer pointed to by outPropertyData. On output,
     *                           the number of bytes written.
     * @param outPropertyData    Pointer to the property data buffer
     * @return an OSStatus return code
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamGetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * [@function] AudioFileStreamSetProperty
     * <p>
     * Set the value of the property. There are currently no settable properties.
     *
     * @param inAudioFileStream  The file stream ID
     * @param inPropertyID       Property ID whose value should be set
     * @param inPropertyDataSize Size in bytes of the property data
     * @param inPropertyData     Pointer to the property data buffer
     * @return an OSStatus return code
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamSetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * [@function] AudioFileStreamClose
     * <p>
     * Close and deallocate the file stream object.
     *
     * @param inAudioFileStream The file stream ID
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamClose(AudioFileStreamID inAudioFileStream);

    /**
     * [@function] AudioFormatGetPropertyInfo
     * <p>
     * Retrieve information about the given property
     *
     * @param inPropertyID        an AudioFormatPropertyID constant.
     * @param inSpecifierSize     The size of the specifier data.
     * @param inSpecifier         A specifier is a buffer of data used as an input argument to some of the properties.
     * @param outPropertyDataSize The size in bytes of the current value of the property. In order to get the property
     *                            value,
     *                            you will need a buffer of this size.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFormatGetPropertyInfo(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr outPropertyDataSize);

    /**
     * [@function] AudioFormatGetProperty
     * <p>
     * Retrieve the indicated property data
     *
     * @param inPropertyID       an AudioFormatPropertyID constant.
     * @param inSpecifierSize    The size of the specifier data.
     * @param inSpecifier        A specifier is a buffer of data used as an input argument to some of the properties.
     * @param ioPropertyDataSize on input the size of the outPropertyData buffer. On output the number of bytes written
     *                           to the buffer.
     * @param outPropertyData    the buffer in which to write the property data. If outPropertyData is NULL and
     *                           ioPropertyDataSize is
     *                           not, the amount that would have been written will be reported.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int AudioFormatGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * [@function] AudioQueueNewOutput
     * <p>
     * Creates a new audio queue for playing audio data.
     * <p>
     * To create an playback audio queue, you allocate buffers, then queue buffers (using
     * AudioQueueEnqueueBuffer). The callback receives buffers and typically queues them again.
     * To schedule a buffer for playback, providing parameter and start time information, call
     * AudioQueueEnqueueBufferWithParameters.
     *
     * @param inFormat              A pointer to a structure describing the format of the audio data to be played. For
     *                              linear PCM, only interleaved formats are supported. Compressed formats are
     *                              supported.
     * @param inCallbackProc        A pointer to a callback function to be called when the audio queue has finished
     *                              playing
     *                              a buffer.
     * @param inUserData            A value or pointer to data that you specify to be passed to the callback function.
     * @param inCallbackRunLoop     The event loop on which inCallbackProc is to be called. If you specify NULL, the
     *                              callback is called on one of the audio queue's internal threads.
     * @param inCallbackRunLoopMode The run loop mode in which to call the callback. Typically, you pass
     *                              kCFRunLoopCommonModes. (NULL also specifies kCFRunLoopCommonModes). Other
     *                              possibilities are implementation specific. You can choose to create your own thread
     *                              with
     *                              your own run loops. For more information on run loops, see Run Loops or CFRunLoop
     *                              Reference.
     * @param inFlags               Reserved for future use. Pass 0.
     * @param outAQ                 On return, this variable contains a pointer to the newly created playback audio
     *                              queue
     *                              object.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewOutput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewOutput") Function_AudioQueueNewOutput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    /**
     * [@function] AudioQueueNewInput
     * <p>
     * Creates a new audio queue for recording audio data.
     * <p>
     * Outline of how to use the queue for input:
     * <p>
     * - create input queue
     * - allocate buffers
     * - enqueue buffers (AudioQueueEnqueueBuffer, not with parameters, no packet descriptions)
     * - the callback receives buffers and re-enqueues them
     *
     * @param inFormat              A pointer to a structure describing the format of the audio data to be recorded. For
     *                              linear PCM, only interleaved formats are supported. Compressed formats are
     *                              supported.
     * @param inCallbackProc        A pointer to a callback function to be called when the audio queue has finished
     *                              filling
     *                              a buffer.
     * @param inUserData            A value or pointer to data that you specify to be passed to the callback function.
     * @param inCallbackRunLoop     The event loop on which inCallbackProc is to be called. If you specify NULL, the
     *                              callback is called on one of the audio queue's internal threads.
     * @param inCallbackRunLoopMode The run loop mode in which to call the callback. Typically, you pass
     *                              kCFRunLoopCommonModes. (NULL also specifies kCFRunLoopCommonModes). Other
     *                              possibilities are implementation specific. You can choose to create your own thread
     *                              with
     *                              your own run loops. For more information on run loops, see Run Loops or CFRunLoop
     *                              Reference.
     * @param inFlags               Reserved for future use. Pass 0.
     * @param outAQ                 On return, this variable contains a pointer to the newly created recording audio
     *                              queue
     *                              object.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewInput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewInput") Function_AudioQueueNewInput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    /**
     * [@function] AudioQueueNewOutputWithDispatchQueue
     * <p>
     * Creates a new audio queue for playing audio data.
     * <p>
     * To create an playback audio queue, you allocate buffers, then queue buffers (using
     * AudioQueueEnqueueBuffer). The callback receives buffers and typically queues them again.
     * To schedule a buffer for playback, providing parameter and start time information, call
     * AudioQueueEnqueueBufferWithParameters.
     *
     * @param outAQ                   On return, this variable contains a pointer to the newly created playback audio
     *                                queue
     *                                object.
     * @param inFormat                A pointer to a structure describing the format of the audio data to be played. For
     *                                linear PCM, only interleaved formats are supported. Compressed formats are
     *                                supported.
     * @param inFlags                 Reserved for future use. Pass 0.
     * @param inCallbackDispatchQueue The dispatch queue from which inCallbackBlock is to be called.
     * @param inCallbackBlock         A pointer to a callback block to be called when the audio queue has finished
     *                                playing
     *                                a buffer.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewOutputWithDispatchQueue(Ptr<AudioQueueRef> outAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, NSObject inCallbackDispatchQueue,
            @ObjCBlock(name = "call_AudioQueueNewOutputWithDispatchQueue") Block_AudioQueueNewOutputWithDispatchQueue inCallbackBlock);

    /**
     * [@function] AudioQueueNewInputWithDispatchQueue
     * <p>
     * Creates a new audio queue for recording audio data.
     * <p>
     * Outline of how to use the queue for input:
     * <p>
     * - create input queue
     * - allocate buffers
     * - enqueue buffers (AudioQueueEnqueueBuffer, not with parameters, no packet descriptions)
     * - the callback receives buffers and re-enqueues them
     *
     * @param outAQ                   On return, this variable contains a pointer to the newly created recording audio
     *                                queue
     *                                object.
     * @param inFormat                A pointer to a structure describing the format of the audio data to be recorded.
     *                                For
     *                                linear PCM, only interleaved formats are supported. Compressed formats are
     *                                supported.
     * @param inFlags                 Reserved for future use. Pass 0.
     * @param inCallbackDispatchQueue The dispatch queue from which inCallbackBlock is to be called.
     * @param inCallbackBlock         A pointer to a callback block to be called when the audio queue has finished
     *                                filling
     *                                a buffer.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewInputWithDispatchQueue(Ptr<AudioQueueRef> outAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, NSObject inCallbackDispatchQueue,
            @ObjCBlock(name = "call_AudioQueueNewInputWithDispatchQueue") Block_AudioQueueNewInputWithDispatchQueue inCallbackBlock);

    /**
     * [@function] AudioQueueDispose
     * <p>
     * Disposes an existing audio queue.
     * <p>
     * Disposing of the audio queue also disposes of all its resources, including its buffers.
     *
     * @param inAQ        The audio queue you want to dispose of
     * @param inImmediate If you pass true, the audio queue is disposed of immediately (that is, synchronously).
     *                    If you pass false, disposal does not take place until all enqueued buffers are
     *                    processed. Whether you call AudioQueueDispose synchronously or asynchronously, you can
     *                    no longer interact with the queue, and the queue no longer invokes any callbacks to your
     *                    application after the function returns.
     *                    <p>
     *                    Note that if AudioQueueDispose is called from a buffer completion callback or property
     *                    listener, you may receive further callbacks afterwards.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueDispose(AudioQueueRef inAQ, byte inImmediate);

    /**
     * [@function] AudioQueueAllocateBuffer
     * <p>
     * Asks an audio queue to allocate a buffer.
     * <p>
     * Once allocated, the pointer to the buffer and the buffer's size are fixed and cannot be
     * changed. The mAudioDataByteSize field in the audio queue buffer structure,
     * AudioQueueBuffer, is initially set to 0.
     *
     * @param inAQ             The audio queue you want to allocate a buffer.
     * @param inBufferByteSize The desired size of the new buffer, in bytes. An appropriate buffer size depends on the
     *                         processing you will perform on the data as well as on the audio data format.
     * @param outBuffer        On return, points to the newly created audio buffer. The mAudioDataByteSize field in the
     *                         audio queue buffer structure, AudioQueueBuffer, is initially set to 0.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueAllocateBuffer(AudioQueueRef inAQ, int inBufferByteSize,
            Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    /**
     * [@function] AudioQueueAllocateBufferWithPacketDescriptions
     * <p>
     * Asks an audio queue to allocate a buffer with space for packet descriptions.
     * <p>
     * Once allocated, the pointer to the buffer and the buffer's size are fixed and cannot be
     * changed. The mAudioDataByteSize field in the audio queue buffer structure,
     * AudioQueueBuffer, is initially set to 0.
     *
     * @param inAQ                       The audio queue you want to allocate a buffer.
     * @param inBufferByteSize           The desired size of the new buffer, in bytes. An appropriate buffer size
     *                                   depends on the
     *                                   processing you will perform on the data as well as on the audio data format.
     * @param inNumberPacketDescriptions The desired capacity of the packet description array in the new buffer.
     * @param outBuffer                  On return, points to the newly created audio buffer. The mAudioDataByteSize
     *                                   field in the
     *                                   audio queue buffer structure, AudioQueueBuffer, is initially set to 0.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueAllocateBufferWithPacketDescriptions(AudioQueueRef inAQ, int inBufferByteSize,
            int inNumberPacketDescriptions, Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    /**
     * [@function] AudioQueueFreeBuffer
     * <p>
     * Disposes of an audio queue buffer.
     * <p>
     * This function disposes of the buffer allocated by AudioQueueAllocateBuffer. Disposing of
     * an audio queue also automatically disposes of any associated buffers and timeline
     * objects. Call this function only if you want to dispose of a particular buffer while
     * continuing to use an audio queue. You can dispose of buffers only when the associated
     * queue is stopped (that is, not processing audio data).
     *
     * @param inAQ     The queue from which the buffer was allocated.
     * @param inBuffer The buffer to be disposed.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueFreeBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer);

    /**
     * [@function] AudioQueueEnqueueBuffer
     * <p>
     * Assigns a buffer to an audio queue for recording or playback.
     * <p>
     * If the buffer was allocated with AudioQueueAllocateBufferWithPacketDescriptions,
     * the client should provide packet descriptions in the buffer's mPacketDescriptions
     * and mPacketDescriptionCount fields rather than in inPacketDescs and
     * inNumPacketDescs, which should be NULL and 0, respectively, in this case.
     * <p>
     * For an input queue, pass 0 and NULL for inNumPacketDescs and inPacketDescs,
     * respectively. Your callback will receive packet descriptions owned by the audio queue.
     *
     * @param inAQ             The audio queue you are assigning the buffer to.
     * @param inBuffer         The buffer to queue (that is, to be recorded into or played from).
     * @param inNumPacketDescs The number of packet descriptions pointed to by the inPacketDescs pointer. Applicable
     *                         only for output queues and required only for variable-bit-rate (VBR) audio formats. Pass
     *                         0 for input queues (no packet descriptions are required).
     * @param inPacketDescs    An array of packet descriptions. Applicable only for output queues and required only for
     *                         variable-bit-rate (VBR) audio formats. Pass NULL for input queues (no packet
     *                         descriptions are required).
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueEnqueueBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
            int inNumPacketDescs,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs);

    /**
     * [@function] AudioQueueEnqueueBufferWithParameters
     * <p>
     * Assigns a buffer to an audio queue for playback, providing parameters
     * and start time information.
     * <p>
     * You can exert some control of the buffer queue by using this function. You can assign
     * audio queue settings that are in effect carried by an audio queue buffer as you enqueue
     * it. Hence, these changes only take effect when an audio queue buffer begins playing.
     * <p>
     * This function queues a buffer for playback only, not for recording. Audio queues for
     * recording have no parameters, do not support variable-bit-rate (VBR) formats (which
     * might require trimming), and have a different way to handle timing. When queued for
     * playback, the buffer must contain the audio data to be played back. See
     * AudioQueueEnqueueBuffer for details on queuing a buffer for recording.
     * <p>
     * If the buffer was allocated with AudioQueueAllocateBufferWithPacketDescriptions,
     * the client should provide packet descriptions in the buffer's mPacketDescriptions
     * and mPacketDescriptionCount fields rather than in inPacketDescs and
     * inNumPacketDescs, which should be NULL and 0, respectively, in this case.
     *
     * @param inAQ                The audio queue associated with the buffer.
     * @param inBuffer            The buffer to be played from.
     * @param inNumPacketDescs    The number of packet descriptions pointed to by the inPacketDescs parameter. Required
     *                            only for variable-bit-rate (VBR) audio formats. Pass 0 if no packet descriptions are
     *                            required.
     * @param inPacketDescs       A pointer to an array of audio stream packet descriptions. Required only for VBR audio
     *                            formats. Pass NULL if no packet descriptions are required.
     * @param inTrimFramesAtStart The number of priming frames to skip at the start of the buffer.
     * @param inTrimFramesAtEnd   The number of frames to skip at the end of the buffer.
     * @param inNumParamValues    The number of parameter values pointed to by the inParamValues parameter.
     * @param inParamValues       An array of parameter values. (In macOS v10.5, there is only one parameter,
     *                            kAudioQueueParam_Volume.) These values are set before buffer playback and cannot be
     *                            changed while the buffer is playing. How accurately changes in parameters can be
     *                            scheduled depends on the size of the buffer. If there are no parameters to set
     *                            (inNumParamValues = 0), pass NULL.
     * @param inStartTime         A pointer to a structure containing the desired start time for playing the buffer. If
     *                            you specify the time using the mSampleTime field of the AudioTimeStamp structure, the
     *                            sample time is relative to the time the queue started. If you pass NULL for the start
     *                            time, the buffer starts immediately after the previously queued buffer, or as soon as
     *                            possible if no buffers are queued ahead of it. Buffers are played in the order they
     *                            are
     *                            queued. If multiple buffers are queued, their times must be in ascending order or
     *                            NULL;
     *                            otherwise, an error occurs. The start time indicates when the actual audio data in the
     *                            buffer is to be played (that is, the trim frames are not counted).
     *                            <p>
     *                            Note: When specifying a start time for a buffer, if the buffer is not the first
     *                            enqueued
     *                            since AudioQueueStop or AudioQueueReset, it is normally necessary to call
     *                            AudioQueueFlush
     *                            before AudioQueueEnqueueBufferWithParameters.
     * @param outActualStartTime  On return, points to an AudioTimeStamp structure indicating when the buffer will
     *                            actually play.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueEnqueueBufferWithParameters(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
            int inNumPacketDescs,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs,
            int inTrimFramesAtStart, int inTrimFramesAtEnd, int inNumParamValues,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueParameterEvent inParamValues,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outActualStartTime);

    /**
     * [@function] AudioQueueStart
     * <p>
     * Begins playing or recording audio.
     * <p>
     * If the audio hardware is not already running, this function starts it.
     *
     * @param inAQ        The audio queue to start.
     * @param inStartTime A pointer to the time at which the audio queue should start. If you specify the time
     *                    using the mSampleTime field of the AudioTimeStamp structure, the sample time is
     *                    referenced to the sample frame timeline of the associated audio device. May be NULL.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueStart(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime);

    /**
     * [@function] AudioQueuePrime
     * <p>
     * Begins decoding buffers in preparation for playback.
     * <p>
     * This function begins decoding buffers in preparation for playback. It returns when at
     * least the number of audio sample frames are decoded and ready to play or when all
     * enqueued buffers have been completely decoded. To ensure that a buffer has been decoded
     * and is completely ready for playback, before playback:
     * <p>
     * 1. Call AudioQueueEnqueueBuffer.
     * 2. Call AudioQueuePrime, which waits if you pass 0 to have a default number of
     * frames decoded.
     * 3. Call AudioQueueStart.
     * <p>
     * Calls to AudioQueuePrime following AudioQueueStart/AudioQueuePrime, and before
     * AudioQueueReset/AudioQueueStop, will have no useful effect. In this situation,
     * outNumberOfFramesPrepared will not have a useful return value.
     *
     * @param inAQ                      The audio queue to be primed.
     * @param inNumberOfFramesToPrepare The number of frames to decode before returning. Pass 0 to decode all enqueued
     *                                  buffers.
     * @param outNumberOfFramesPrepared If not NULL, on return, a pointer to the number of frames actually decoded and
     *                                  prepared
     *                                  for playback.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueuePrime(AudioQueueRef inAQ, int inNumberOfFramesToPrepare,
            IntPtr outNumberOfFramesPrepared);

    /**
     * [@function] AudioQueueStop
     * <p>
     * Stops playing or recording audio.
     * <p>
     * This function resets the audio queue and stops the audio hardware associated with the
     * queue if it is not in use by other audio services. Synchronous stops occur immediately,
     * regardless of previously buffered audio data. Asynchronous stops occur after all queued
     * buffers have been played or recorded.
     *
     * @param inAQ        The audio queue to stop.
     * @param inImmediate If you pass true, the stop request occurs immediately (that is, synchronously), and the
     *                    function returns when the audio queue has stopped. Buffer callbacks are invoked during
     *                    the stopping. If you pass false, the function returns immediately, but the queue does
     *                    not stop until all its queued buffers are played or filled (that is, the stop occurs
     *                    asynchronously). Buffer callbacks are invoked as necessary until the queue actually
     *                    stops. Also, a playback audio queue callback calls this function when there is no more
     *                    audio to play.
     *                    <p>
     *                    Note that when stopping immediately, all pending buffer callbacks are normally invoked
     *                    during the process of stopping. But if the calling thread is responding to a buffer
     *                    callback, then it is possible for additional buffer callbacks to occur after
     *                    AudioQueueStop returns.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueStop(AudioQueueRef inAQ, byte inImmediate);

    /**
     * [@function] AudioQueuePause
     * <p>
     * Pauses audio playback or recording.
     * <p>
     * Pausing the queue does not affect buffers or reset the audio queue. To resume playback
     * or recording using the audio queue, call AudioQueueStart.
     *
     * @param inAQ The queue to be paused.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueuePause(AudioQueueRef inAQ);

    /**
     * [@function] AudioQueueFlush
     * <p>
     * Resets the audio queue's decoder state.
     * <p>
     * After all queued buffers have been played, the function cleans up all decoder state
     * information. You must call this function following a sequence of buffers of encoded
     * audio; otherwise, some of the audio might not play in the next set of queued buffers.
     * The only time it is not necessary to call AudioQueueFlush is following AudioQueueStop
     * with inImmediate=false. (This action internally calls AudioQueueFlush.)
     * <p>
     * Also, you might wish to call this function before calling AudioQueueStop depending on
     * whether you want to stop immediately regardless of what has played or whether you want
     * to ensure that all buffered data and all data that is in the middle of processing gets
     * recorded or played before stopping.
     *
     * @param inAQ The audio queue to be flushed.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueFlush(AudioQueueRef inAQ);

    /**
     * [@function] AudioQueueReset
     * <p>
     * Resets an audio queue.
     * <p>
     * This function immediately resets an audio queue, flushes any queued buffer, removes all
     * buffers from previously scheduled use, and resets any decoder and digital signal
     * processing (DSP) state information. It also invokes callbacks for any flushed buffers.
     * If you queue any buffers after calling this function, processing does not occur until
     * the decoder and DSP state information is reset. Hence, a discontinuity (that is, a
     * "glitch") might occur.
     * <p>
     * Note that when resetting, all pending buffer callbacks are normally invoked
     * during the process of resetting. But if the calling thread is responding to a buffer
     * callback, then it is possible for additional buffer callbacks to occur after
     * AudioQueueReset returns.
     *
     * @param inAQ The audio queue to reset.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueReset(AudioQueueRef inAQ);

    /**
     * [@function] AudioQueueGetParameter
     * <p>
     * Obtains an audio queue parameter value.
     * <p>
     * You can access the current parameter values for an audio queue at any time with this
     * function.
     *
     * @param inAQ      The audio queue whose parameter value you want to obtain.
     * @param inParamID The ID of the parameter you want to obtain. In macOS v10.5, audio queues have one
     *                  parameter available: kAudioQueueParam_Volume, which controls the queue's playback
     *                  volume.
     * @param outValue  On return, points to the current value of the specified parameter.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetParameter(AudioQueueRef inAQ, int inParamID, FloatPtr outValue);

    /**
     * [@function] AudioQueueSetParameter
     * <p>
     * Sets an audio queue parameter value.
     *
     * @param inAQ      The audio queue whose parameter value you want to set.
     * @param inParamID The ID of the parameter you want to set.
     * @param inValue   The parameter value to set.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetParameter(AudioQueueRef inAQ, int inParamID, float inValue);

    /**
     * [@function] AudioQueueGetProperty
     * <p>
     * Obtains an audio queue property value.
     *
     * @param inAQ       The audio queue whose property value you want to obtain.
     * @param inID       The ID of the property you want to obtain. See "Audio Queue Property IDs."
     * @param outData    On return, points to the desired property value.
     * @param ioDataSize A pointer to the size of the property data. On input, points to the maximum bytes of
     *                   space the caller expects to receive. On return, points to the actual data size.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetProperty(AudioQueueRef inAQ, int inID, VoidPtr outData, IntPtr ioDataSize);

    /**
     * [@function] AudioQueueSetProperty
     * <p>
     * Sets an audio queue property value.
     *
     * @param inAQ       The audio queue whose property value you want to set.
     * @param inID       The ID of the property you want to set. See "Audio Queue Property IDs" for the various
     *                   audio queue properties.
     * @param inData     A pointer to the property value to set.
     * @param inDataSize The size of the property data.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetProperty(AudioQueueRef inAQ, int inID, ConstVoidPtr inData, int inDataSize);

    /**
     * [@function] AudioQueueGetPropertySize
     * <p>
     * Obtains the size of an audio queue property.
     *
     * @param inAQ        The audio queue containing the property value whose size you want to obtain.
     * @param inID        The ID of the property value whose size you want to obtain. See "Audio Queue Property
     *                    IDs" for possible values.
     * @param outDataSize On return, points to the size of the specified property value.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetPropertySize(AudioQueueRef inAQ, int inID, IntPtr outDataSize);

    /**
     * [@function] AudioQueueAddPropertyListener
     * <p>
     * Adds a listener callback for a property.
     * <p>
     * This callback is used to act upon a change in an audio queue property such as
     * kAudioQueueProperty_IsRunning. For instance, if your application has a user interface
     * with a Play/Stop button, and kAudioQueueProperty_IsRunning changes, you need to update
     * your button.
     *
     * @param inAQ       The audio queue that owns the property you want to assign the listener callback to.
     * @param inID       The ID of the property to which you want to assign a listener callback. See "Audio Queue
     *                   Property IDs".
     * @param inProc     The listener callback to be called when the property value changes.
     * @param inUserData A value to be passed to the listener callback when it is called.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueAddPropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueAddPropertyListener") Function_AudioQueueAddPropertyListener inProc,
            VoidPtr inUserData);

    /**
     * [@function] AudioQueueRemovePropertyListener
     * <p>
     * Removes a listener callback for a property.
     *
     * @param inAQ       The audio queue that owns the property from which you want to remove a listener.
     * @param inID       The ID of the property from which you want to remove a listener.
     * @param inProc     The listener being removed.
     * @param inUserData The same inUserData value that was previously passed to AudioQueueAddPropertyListener.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueRemovePropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueRemovePropertyListener") Function_AudioQueueRemovePropertyListener inProc,
            VoidPtr inUserData);

    /**
     * [@function] AudioQueueCreateTimeline
     * <p>
     * Creates a timeline object.
     * <p>
     * You need to instantiate a timeline object if you want to know about any timeline
     * discontinuities. See AudioQueueGetCurrentTime for more details.
     *
     * @param inAQ        The audio queue to associate with the new timeline object.
     * @param outTimeline On return, points to the newly created timeline object.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueCreateTimeline(AudioQueueRef inAQ, Ptr<AudioQueueTimelineRef> outTimeline);

    /**
     * [@function] AudioQueueDisposeTimeline
     * <p>
     * Disposes of a timeline object.
     * <p>
     * Disposing of an audio queue automatically disposes of any associated timeline objects.
     * Call this function only if you want to dispose of a timeline object and not the audio
     * queue associated with it.
     *
     * @param inAQ       The audio queue associated with the timeline object you want to dispose of.
     * @param inTimeline The timeline object to dispose of.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueDisposeTimeline(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline);

    /**
     * [@function] AudioQueueGetCurrentTime
     * <p>
     * Obtains the current audio queue time.
     * <p>
     * You must specify a timeline object if you want to be notified about any timeline
     * discontinuities in the outTimelineDiscontinuity parameter. If you don't care about
     * discontinuities, pass NULL in the inTimeLine and outTimelineDiscontinuity parameters.
     *
     * @param inAQ                     The audio queue whose current time you want to obtain.
     * @param inTimeline               The audio queue timeline object to which any timeline discontinuities are
     *                                 reported. May
     *                                 be NULL.
     * @param outTimeStamp             On return, points to an audio timestamp structure containing the current audio
     *                                 queue
     *                                 time. The mSampleTime field is in terms of the audio queue's sample rate, and
     *                                 relative
     *                                 to the time at which the queue has started or will start.
     * @param outTimelineDiscontinuity Can be NULL. On return, only set to true or false if the inTimeLine parameter is
     *                                 not
     *                                 NULL. Set to true if a discontinuity has occurred in the sample timeline of the
     *                                 audio
     *                                 queue. For instance, the device's sample rate changed and a gap occurred in
     *                                 playback or
     *                                 recording, or the audio queue was unable to prepare and playback in time because
     *                                 it was
     *                                 late.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetCurrentTime(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp,
            BytePtr outTimelineDiscontinuity);

    /**
     * [@function] AudioQueueDeviceGetCurrentTime
     * <p>
     * Obtains the current time of the audio device associated with an audio queue.
     * <p>
     * If the audio device associated with the audio queue is not running, the only valid field
     * in the audio timestamp structure is mHostTime. This result differentiates the action of
     * this function from that of the AudioDeviceGetCurrentTime function, (declared in
     * AudioHardware.h) which returns an error if the audio device is not running.
     *
     * @param inAQ         The audio queue whose audio device is to be queried.
     * @param outTimeStamp A pointer to a structure that, on return, contains the current time of the audio device
     *                     associated with the audio queue.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetCurrentTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp);

    /**
     * [@function] AudioQueueDeviceTranslateTime
     * <p>
     * Converts the time in the time base of the associated audio device from one
     * representation to another.
     * <p>
     * This function converts from one time representation to another (for example, from sample
     * time to host time or vice versa):
     * <p>
     * - Sample time is the absolute sample frame time. Sample numbers are the count of the samples
     * on the audio device.
     * - Host time is the time base of the host machine such as the time of the bus clock on the CPU.
     * <p>
     * The mSampleTime field in the AudioTimestamp structure (described in Core Audio Data
     * Types Reference) is always in device time, not in audio queue time. Audio queue time is
     * relative to the audio queue's start time. The associated audio device has to be running
     * for the AudioQueueDeviceTranslateTime function to provide a result.
     *
     * @param inAQ    The queue whose audio device is to perform the requested time translation.
     * @param inTime  A pointer to a structure containing the time to be translated.
     * @param outTime A pointer to the the translated time.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceTranslateTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTime,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTime);

    /**
     * [@function] AudioQueueDeviceGetNearestStartTime
     * <p>
     * Obtains an audio device's start time that is closest to a requested start time.
     *
     * @param inAQ                 The audio queue whose device's nearest start time you want to obtain.
     * @param ioRequestedStartTime On entry, points to the requested start time. On return, points to the actual start
     *                             time.
     * @param inFlags              Reserved for future use. Pass 0.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetNearestStartTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp ioRequestedStartTime,
            int inFlags);

    /**
     * [@function] AudioQueueSetOfflineRenderFormat
     * <p>
     * Specify an audio format to which the queue will perform subsequent offline rendering,
     * or disable offline rendering.
     * <p>
     * An output queue's audio playback can be redirected for capture to an audio file,
     * to support an export function, for example. AudioQueueSetOfflineRenderFormat switches
     * a queue between normal and offline rendering modes.
     *
     * @param inAQ     The output queue whose offline rendering mode is to be changed.
     * @param inFormat The desired format for offline rendering. Pass NULL to disable offline rendering and return the
     *                 queue to normal output to an audio device. This format must be linear PCM and (if not mono)
     *                 interleaved.
     * @param inLayout The desired channel layout for offline rendering; also NULL when disabling offline rendering.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetOfflineRenderFormat(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inLayout);

    /**
     * [@function] AudioQueueOfflineRender
     * <p>
     * Obtain a buffer of audio output from a queue in offline rendering mode.
     *
     * @param inAQ           The output queue from which to obtain output.
     * @param inTimestamp    The point in time corresponding to the beginning of the output buffer. Only mSampleTime
     *                       is used. mFlags must include kAudioTimeStampSampleTimeValid.
     * @param ioBuffer       The buffer into which the queue will render.
     * @param inNumberFrames The number of frames of audio to render. Note that fewer frames than requested may be
     *                       returned.
     *                       This can happen if insufficient data was enqueued.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueOfflineRender(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimestamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer ioBuffer,
            int inNumberFrames);

    /**
     * [@function] AudioQueueProcessingTapNew
     * <p>
     * Create a new processing tap
     * <p>
     * This function creates a processing tap on a given audio queue. A
     * processing tap can only be established (or removed) on an audio queue that is
     * stopped (paused is not sufficient). The processing tap will then be used to
     * process either decoded data in the case of an output queue, or input data
     * (before it is encoded) in the case of an input queue.
     * <p>
     * The processing is performed on audio either before or after any effects or other
     * processing (varispeed, etc) is applied by the audio queue, depending on inFlags.
     *
     * @param inAQ                The audio queue from which to create the processing tap
     * @param inCallback          A callback which the queue will call to process the audio
     * @param inClientData        Client data provided to the callback
     * @param inFlags             Flags that are used to control aspects of the processing tap.
     *                            Valid flags are:
     *                            - kAudioQueueProcessingTap_PreEffects: processing is done before any
     *                            further effects are applied by the audio queue to the audio
     *                            - kAudioQueueProcessingTap_PostEffects: processing is done after all
     *                            processing is done, including that of other taps.
     *                            - kAudioQueueProcessingTap_Siphon
     * @param outMaxFrames        The maximum number of sample frames that can be requested of a processing
     *                            tap at any one time. Typically this will be approximately 50 msec of audio
     *                            (2048 samples @ 44.1kHz)
     * @param outProcessingFormat The format in which the client will receive the audio data to be processed.
     *                            This will always be the same sample rate as the client format and usually
     *                            the same number of channels as the client format of the audio queue. (NOTE:
     *                            the number of channels may be different in some cases if the client format
     *                            has some channel count restrictions, for instance the client provides 5.1
     *                            AAC, but the decoder can only produce stereo). The channel order, if the
     *                            same as the client format, will be the same as the client channel order. If
     *                            the channel count is changed, it will be to either 1 (mono) or 2 (stereo, in
     *                            which case the first channel is left, the second right).
     *                            <p>
     *                            If the data is not in a convenient format for the client to process in, then
     *                            the client should convert the data to and from that format. This is the most
     *                            efficient mechanism to use (as the audio queue can chose a format that is
     *                            most efficient from its playback (or recording) requirement.
     * @param outAQTap            The processing tap object.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapNew(AudioQueueRef inAQ,
            @FunctionPtr(name = "call_AudioQueueProcessingTapNew") Function_AudioQueueProcessingTapNew inCallback,
            VoidPtr inClientData, int inFlags, IntPtr outMaxFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription outProcessingFormat,
            Ptr<AudioQueueProcessingTapRef> outAQTap);

    /**
     * [@function] AudioQueueProcessingTapDispose
     * <p>
     * Dispose a processing tap object
     * <p>
     * As with AudioQueueProcessingTapNew(), this call can only be made on an
     * audio queue that is stopped (paused is not sufficient)
     *
     * @param inAQTap The processing tap to dispose.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapDispose(AudioQueueProcessingTapRef inAQTap);

    /**
     * [@function] AudioQueueProcessingTapGetSourceAudio
     * <p>
     * Used by a processing tap to retrieve source audio.
     * <p>
     * This function may only be called from the processing tap's callback.
     *
     * @param inAQTap         the processing tap
     * @param inNumberFrames  the number of frames the processing tap requires for its processing
     * @param ioTimeStamp     On an input audio queue, the timestamp is returned from this function.
     *                        On an output audio queue, the caller must provide a continuous timestamp.
     * @param outFlags        flags to describe state about the input requested, e.g.
     *                        discontinuity/complete
     * @param outNumberFrames the number of source frames that have been provided by the parent audio
     *                        queue. This can be less than the number of requested frames specified in
     *                        inNumberFrames
     * @param ioData          the audio buffer list which will contain the source data. The audio queue owns
     *                        the buffer pointers if NULL pointers were provided (recommended). In this case
     *                        the source buffers are only valid for the duration of the processing tap
     *                        callback. If the buffer pointers are non-NULL, then they must be big enough to
     *                        hold inNumberFrames, and the audio queue will copy its source data into those
     *                        buffers.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapGetSourceAudio(AudioQueueProcessingTapRef inAQTap,
            int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp ioTimeStamp,
            IntPtr outFlags, IntPtr outNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * [@function] AudioQueueProcessingTapGetQueueTime
     * <p>
     * Used by a processing tap to retrieve the queue's current time.
     * <p>
     * This function may only be called from the processing tap's callback, and only
     * for audio output queues. It must be called after calling
     * AudioQueueProcessingTapGetSourceAudio().
     *
     * @param inAQTap            the processing tap
     * @param outQueueSampleTime the current sample time of the audio queue. This will appear to be stationary
     *                           if the queue is paused.
     * @param outQueueFrameCount the number of sample frames of queue time corresponding to the current chunk of
     *                           audio being processed by the tap. This will differ from the frame count passed
     *                           to the tap if the queue's playback rate is currently other than 1.0, due to the
     *                           use of time compression/expansion. The frame count can also be 0 if the queue is
     *                           paused.
     * @return An OSStatus result code.
     */
    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapGetQueueTime(AudioQueueProcessingTapRef inAQTap,
            DoublePtr outQueueSampleTime, IntPtr outQueueFrameCount);

    /**
     * [@function] AudioSessionInitialize
     * <p>
     * Initialize the AudioSession.
     * <p>
     * This function has to be called once before calling any other
     * AudioSession functions.
     *
     * @param inRunLoop              A CFRunLoopRef indicating the desired run loop the interruption routine should
     *                               be run on. Pass NULL to use the main run loop.
     * @param inRunLoopMode          A CFStringRef indicating the run loop mode for the runloop where the
     *                               completion routine will be executed. Pass NULL to use kCFRunLoopDefaultMode.
     * @param inInterruptionListener An AudioSessionInterruptionListener to be called when the AudioSession
     *                               is interrupted.
     * @param inClientData           The client user data to use when calling the interruption listener.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionInitialize(CFRunLoopRef inRunLoop, CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioSessionInitialize") Function_AudioSessionInitialize inInterruptionListener,
            VoidPtr inClientData);

    /**
     * [@function] AudioSessionSetActive
     * <p>
     * Activate or deactivate the AudioSession.
     * <p>
     * Call this function with active set to true to activate this AudioSession (interrupt
     * the currently active AudioSession).
     * Call this function with active set to false to deactivate this AudioSession (allow
     * another interrupted AudioSession to resume).
     * When active is true this call may fail if the currently active AudioSession has a higher priority.
     *
     * @param active A Boolean indicating if you want to make this AudioSession active or inactive.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActive(byte active);

    /**
     * [@function] AudioSessionSetActiveWithFlags
     * <p>
     * Same functionality as AudioSessionSetActive, with an additional flags parameter for
     * refining behavior.
     * <p>
     * Call this function with active set to true to activate this AudioSession (interrupt
     * the currently active AudioSession).
     * Call this function with active set to false to deactivate this AudioSession (allow
     * another interrupted AudioSession to resume).
     * Pass in one or more flags to refine the behavior during activation or deactivation.
     * When active is true this call may fail if the currently active AudioSession has a
     * higher priority.
     *
     * @param active  A Boolean indicating if you want to make this AudioSession active or inactive.
     * @param inFlags A bitmap containing one or more flags from the AudioSessionActivationFlags enum.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActiveWithFlags(byte active, int inFlags);

    /**
     * [@function] AudioSessionGetProperty
     * <p>
     * Get the value of a property.
     * <p>
     * This function can be called to get the value for a property of the AudioSession.
     * Valid properties are listed in an enum above.
     *
     * @param inID       The AudioSessionPropertyID for which we want to get the value.
     * @param ioDataSize The size of the data payload.
     *                   On entry it should contain the size of the memory pointed to by outData.
     *                   On exit it will contain the actual size of the data.
     * @param outData    The data for the property will be copied here.
     * @return kAudioSessionNoError if the operation was successful. If the property is a
     *         write-only property or only available by way of property listeners,
     *         kAudioSessionUnsupportedPropertyError will be returned. Other error codes
     *         listed under AudioSession Error Constants also apply to this function.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetProperty(int inID, IntPtr ioDataSize, VoidPtr outData);

    /**
     * [@function] AudioSessionSetProperty
     * <p>
     * Set the value of a property.
     * <p>
     * This function can be called to set the value for a property of the AudioSession.
     * Valid properties are listed in an enum above.
     *
     * @param inID       The AudioSessionPropertyID for which we want to set the value.
     * @param inDataSize The size of the data payload.
     * @param inData     The data for the property we want to set.
     * @return kAudioSessionNoError if the operation was successful. If the property is a
     *         read-only property or an invalid property value is passed in,
     *         kAudioSessionUnsupportedPropertyError will be returned. Other error codes
     *         listed under AudioSession Error Constants also apply to
     *         this function.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetProperty(int inID, int inDataSize, ConstVoidPtr inData);

    /**
     * [@function] AudioSessionGetPropertySize
     * <p>
     * Get the size of the payload for a property.
     * <p>
     * This function can be called to get the size for the payload of a property.
     * Valid properties are listed in an enum above.
     *
     * @param inID        The AudioSessionPropertyID for which we want to get the size of the payload.
     * @param outDataSize The size of the data payload will be copied here.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetPropertySize(int inID, IntPtr outDataSize);

    /**
     * [@function] AudioSessionAddPropertyListener
     * <p>
     * Add a property listener.
     * <p>
     * This function can be used to add a listener to be called when a property changes.
     * If a listener and user data already exist for this property, they will be replaced.
     * Valid properties are listed above.
     *
     * @param inID         The AudioSessionPropertyID for which we want to set a listener.
     * @param inProc       The listener to be called when the property changes.
     * @param inClientData The client user data to use when calling the listener.
     * @return kAudioSessionNoError if the operation was successful. If the property does
     *         not support listeners, kAudioSessionUnsupportedPropertyError will be returned.
     *         Other error codes listed under AudioSession Error Constants also apply to
     *         this function.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionAddPropertyListener(int inID,
            @FunctionPtr(name = "call_AudioSessionAddPropertyListener") Function_AudioSessionAddPropertyListener inProc,
            VoidPtr inClientData);

    /**
     * [@function] AudioSessionRemovePropertyListener
     * <p>
     * see AudioSessionRemovePropertyListenerWithUserData
     * <p>
     * see AudioSessionRemovePropertyListenerWithUserData
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListener(int inID);

    /**
     * [@function] AudioSessionRemovePropertyListener
     * <p>
     * Remove a property listener.
     * <p>
     * This function can be called to remove the listener for a property. The caller
     * provides the same proc and user data that was used to add the listener. This ensures
     * that there can be more than one listener established for a given property ID,
     * and each listener can be removed as requested.
     * Valid properties are listed above.
     *
     * @param inID         The AudioSessionPropertyID for which we want to remove the listener.
     * @param inProc       The proc that was used to add the listener that needs to be removed.
     * @param inClientData The client data that was used to add the listener that needs to be removed.
     * @return kAudioSessionNoError if the operation was successful. If the property does
     *         not support listeners, kAudioSessionUnsupportedPropertyError will be returned.
     *         Other error codes listed under AudioSession Error Constants also apply to
     *         this function.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListenerWithUserData(int inID,
            @FunctionPtr(name = "call_AudioSessionRemovePropertyListenerWithUserData") Function_AudioSessionRemovePropertyListenerWithUserData inProc,
            VoidPtr inClientData);

    /**
     * [@function] AudioServicesCreateSystemSoundID
     * <p>
     * Allows the application to designate an audio file for playback by the System Sound server.
     * <p>
     * Returned SystemSoundIDs are passed to AudioServicesPlayAlertSoundWithCompletion()
     * and AudioServicesPlaySystemSoundWithCompletion() to be played.
     * <p>
     * The maximum supported duration for a system sound is 30 secs.
     *
     * @param inFileURL        A CFURLRef for an AudioFile.
     * @param outSystemSoundID Returns a SystemSoundID.
     */
    @Generated
    @CFunction
    public static native int AudioServicesCreateSystemSoundID(CFURLRef inFileURL, IntPtr outSystemSoundID);

    /**
     * [@function] AudioServicesDisposeSystemSoundID
     * <p>
     * Allows the System Sound server to dispose any resources needed for the provided
     * SystemSoundID.
     * <p>
     * Allows the application to tell the System Sound server that the resources for the
     * associated audio file are no longer required.
     *
     * @param inSystemSoundID A SystemSoundID that the application no longer needs to use.
     */
    @Generated
    @CFunction
    public static native int AudioServicesDisposeSystemSoundID(int inSystemSoundID);

    /**
     * [@function] AudioServicesPlayAlertSoundWithCompletion
     * <p>
     * Play an alert sound
     * <p>
     * Play the sound designated by the provided SystemSoundID with alert sound behavior.
     *
     * @param inSystemSoundID   The SystemSoundID to be played. On the desktop the kSystemSoundID_UserPreferredAlert
     *                          constant can be passed in to play back the alert sound selected by the user
     *                          in System Preferences. On iOS there is no preferred user alert sound.
     * @param inCompletionBlock The completion block gets executed for every attempt to play a system sound irrespective
     *                          of success or failure. The callbacks are issued on a serial queue and the client is
     *                          responsible for handling thread safety.
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlayAlertSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlayAlertSoundWithCompletion") Block_AudioServicesPlayAlertSoundWithCompletion inCompletionBlock);

    /**
     * [@function] AudioServicesPlaySystemSoundWithCompletion
     * <p>
     * Play a system sound
     * <p>
     * Play the sound designated by the provided SystemSoundID.
     *
     * @param inSystemSoundID   The SystemSoundID to be played.
     * @param inCompletionBlock The completion block gets executed for every attempt to play a system sound irrespective
     *                          of success or failure. The callbacks are issued on a serial queue and the client is
     *                          responsible for handling thread safety.
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlaySystemSoundWithCompletion") Block_AudioServicesPlaySystemSoundWithCompletion inCompletionBlock);

    /**
     * [@function] AudioServicesGetPropertyInfo
     * <p>
     * Get information about the size of an AudioServices property and whether it can
     * be set.
     *
     * @param inPropertyID        a AudioServicesPropertyID constant.
     * @param inSpecifierSize     The size of the specifier data.
     * @param inSpecifier         A specifier is a buffer of data used as an input argument to some of the
     *                            properties.
     * @param outPropertyDataSize The size in bytes of the current value of the property. In order to get the
     *                            property value, you will need a buffer of this size.
     * @param outWritable         Will be set to 1 if writable, or 0 if read only.
     * @return returns kAudioServicesNoError if successful.
     */
    @Generated
    @CFunction
    public static native int AudioServicesGetPropertyInfo(int inPropertyID, int inSpecifierSize,
            ConstVoidPtr inSpecifier, IntPtr outPropertyDataSize, BytePtr outWritable);

    /**
     * [@function] AudioServicesGetProperty
     * <p>
     * Retrieve the indicated property data
     *
     * @param inPropertyID       a AudioServicesPropertyID constant.
     * @param inSpecifierSize    The size of the specifier data.
     * @param inSpecifier        A specifier is a buffer of data used as an input argument to some of the
     *                           properties.
     * @param ioPropertyDataSize On input, the size of the outPropertyData buffer. On output the number of
     *                           bytes written to the buffer.
     * @param outPropertyData    The buffer in which to write the property data. May be NULL if caller only
     *                           wants ioPropertyDataSize to be filled with the amount that would have been
     *                           written.
     * @return returns kAudioServicesNoError if successful.
     */
    @Generated
    @CFunction
    public static native int AudioServicesGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * [@function] AudioServicesSetProperty
     * <p>
     * Set the indicated property data
     *
     * @param inPropertyID       a AudioServicesPropertyID constant.
     * @param inSpecifierSize    The size of the specifier data.
     * @param inSpecifier        A specifier is a buffer of data used as an input argument to some of the
     *                           properties.
     * @param inPropertyDataSize The size of the inPropertyData buffer.
     * @param inPropertyData     The buffer containing the property data.
     * @return returns kAudioServicesNoError if successful.
     */
    @Generated
    @CFunction
    public static native int AudioServicesSetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * This function will be deprecated in a future release. Use AudioServicesPlayAlertSoundWithCompletion instead.
     * <p>
     * [@function] AudioServicesPlayAlertSound
     * <p>
     * Play an Alert Sound
     * <p>
     * Play the provided SystemSoundID with AlertSound behavior.
     *
     * @param inSystemSoundID A SystemSoundID for the System Sound server to play. On the desktop you
     *                        can pass the kSystemSoundID_UserPreferredAlert constant to playback the alert sound
     *                        selected by the user in System Preferences. On iOS there is no preferred user alert sound.
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlayAlertSound(int inSystemSoundID);

    /**
     * This function will be deprecated in a future release. Use AudioServicesPlaySystemSoundWithCompletion instead.
     * <p>
     * [@function] AudioServicesPlaySystemSound
     * <p>
     * Play the sound designated by the provided SystemSoundID.
     * <p>
     * A SystemSoundID indicating the desired System Sound to be played.
     *
     * @param inSystemSoundID A SystemSoundID for the System Sound server to play.
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSound(int inSystemSoundID);

    /**
     * This function will be deprecated in a future release. Use AudioServicesPlayAlertSoundWithCompletion
     * or AudioServicesPlaySystemSoundWithCompletion instead.
     * <p>
     * [@function] AudioServicesAddSystemSoundCompletion
     * <p>
     * Call the provided Completion Routine when provided SystemSoundID
     * finishes playing.
     * <p>
     * Once set, the System Sound server will send a message to the System Sound client
     * indicating which SystemSoundID has finished playing.
     *
     * @param inSystemSoundID     The SystemSoundID to associate with the provided completion
     *                            routine.
     * @param inRunLoop           A CFRunLoopRef indicating the desired run loop the completion routine should
     *                            be run on. Pass NULL to use the main run loop.
     * @param inRunLoopMode       A CFStringRef indicating the run loop mode for the runloop where the
     *                            completion routine will be executed. Pass NULL to use kCFRunLoopDefaultMode.
     * @param inCompletionRoutine An AudioServicesSystemSoundCompletionProc to be called when the provided
     *                            SystemSoundID has completed playing in the server.
     * @param inClientData        A void* to pass client data to the completion routine.
     */
    @Generated
    @CFunction
    public static native int AudioServicesAddSystemSoundCompletion(int inSystemSoundID, CFRunLoopRef inRunLoop,
            CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioServicesAddSystemSoundCompletion") Function_AudioServicesAddSystemSoundCompletion inCompletionRoutine,
            VoidPtr inClientData);

    /**
     * This function will be deprecated in a future release. Use AudioServicesPlayAlertSoundWithCompletion
     * or AudioServicesPlaySystemSoundWithCompletion instead.
     * <p>
     * [@function] AudioServicesRemoveSystemSoundCompletion
     * <p>
     * Disassociate any completion proc for the specified SystemSoundID
     * <p>
     * Tells the SystemSound client to remove any completion proc associated with the
     * provided SystemSoundID
     *
     * @param inSystemSoundID The SystemSoundID for which completion routines should be
     *                        removed.
     */
    @Generated
    @CFunction
    public static native void AudioServicesRemoveSystemSoundCompletion(int inSystemSoundID);

    /**
     * [@function] ExtAudioFileOpenURL
     * <p>
     * Opens an audio file specified by a CFURLRef.
     * <p>
     * Allocates a new ExtAudioFileRef, for reading an existing audio file.
     *
     * @param inURL           The audio file to read.
     * @param outExtAudioFile On exit, a newly-allocated ExtAudioFileRef.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileOpenURL(CFURLRef inURL, Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * [@function] ExtAudioFileWrapAudioFileID
     * <p>
     * Wrap an AudioFileID in an ExtAudioFileRef.
     * <p>
     * Allocates a new ExtAudioFileRef which wraps an existing AudioFileID. The
     * client is responsible for keeping the AudioFileID open until the
     * ExtAudioFileRef is disposed. Disposing the ExtAudioFileRef will not close
     * the AudioFileID when this Wrap API call is used, so the client is also
     * responsible for closing the AudioFileID when finished with it.
     *
     * @param inFileID        The AudioFileID to wrap.
     * @param inForWriting    True if the AudioFileID is a new file opened for writing.
     * @param outExtAudioFile On exit, a newly-allocated ExtAudioFileRef.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWrapAudioFileID(AudioFileID inFileID, byte inForWriting,
            Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * [@function] ExtAudioFileCreateWithURL
     * <p>
     * Create a new audio file.
     * <p>
     * Creates a new audio file.
     * <p>
     * If the file to be created is in an encoded format, it is permissible for the
     * sample rate in inStreamDesc to be 0, since in all cases, the file's encoding
     * AudioConverter may produce audio at a different sample rate than the source. The
     * file will be created with the audio format actually produced by the encoder.
     *
     * @param inURL           The URL of the new audio file.
     * @param inFileType      The type of file to create. This is a constant from AudioToolbox/AudioFile.h, e.g.
     *                        kAudioFileAIFFType. Note that this is not an HFSTypeCode.
     * @param inStreamDesc    The format of the audio data to be written to the file.
     * @param inChannelLayout The channel layout of the audio data. If non-null, this must be consistent
     *                        with the number of channels specified by inStreamDesc.
     * @param inFlags         The same flags as are used with AudioFileCreateWithURL
     *                        Can use these to control whether an existing file is overwritten (or not).
     * @param outExtAudioFile On exit, a newly-allocated ExtAudioFileRef.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileCreateWithURL(CFURLRef inURL, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inStreamDesc,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inChannelLayout,
            int inFlags, Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * [@function] ExtAudioFileDispose
     * <p>
     * Close the file and dispose the object.
     * <p>
     * Closes the file and deletes the object.
     *
     * @param inExtAudioFile The extended audio file object.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileDispose(ExtAudioFileRef inExtAudioFile);

    /**
     * [@function] ExtAudioFileRead
     * <p>
     * Perform a synchronous sequential read.
     * <p>
     * If the file has a client data format, then the audio data from the file is
     * translated from the file data format to the client format, via the
     * ExtAudioFile's internal AudioConverter.
     * <p>
     * (Note that the use of sequential reads/writes means that an ExtAudioFile must
     * not be read on multiple threads; clients wishing to do this should use the
     * lower-level AudioFile API set).
     *
     * @param inExtAudioFile The extended audio file object.
     * @param ioNumberFrames On entry, ioNumberFrames is the number of frames to be read from the file.
     *                       On exit, it is the number of frames actually read. A number of factors may
     *                       cause a fewer number of frames to be read, including the supplied buffers
     *                       not being large enough, and internal optimizations. If 0 frames are
     *                       returned, however, this indicates that end-of-file was reached.
     * @param ioData         Buffer(s) into which the audio data is read.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileRead(ExtAudioFileRef inExtAudioFile, IntPtr ioNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * [@function] ExtAudioFileWrite
     * <p>
     * Perform a synchronous sequential write.
     * <p>
     * If the file has a client data format, then the audio data in ioData is
     * translated from the client format to the file data format, via the
     * ExtAudioFile's internal AudioConverter.
     *
     * @param inExtAudioFile The extended audio file object.
     * @param inNumberFrames The number of frames to write.
     * @param ioData         The buffer(s) from which audio data is written to the file.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWrite(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * [@function] ExtAudioFileWriteAsync
     * <p>
     * Perform an asynchronous sequential write.
     * <p>
     * Writes the provided buffer list to an internal ring buffer and notifies an
     * internal thread to perform the write at a later time. The first time this is
     * called, allocations may be performed. You can call this with 0 frames and null
     * buffer in a non-time-critical context to initialize the asynchronous mechanism.
     * Once initialized, subsequent calls are very efficient and do not take locks;
     * thus this may be used to write to a file from a realtime thread.
     * <p>
     * The client must not mix synchronous and asynchronous writes to the same file.
     * <p>
     * Pending writes are not guaranteed to be flushed to disk until
     * ExtAudioFileDispose is called.
     * <p>
     * N.B. Errors may occur after this call has returned. Such errors may be returned
     * from subsequent calls to this function.
     *
     * @param inExtAudioFile The extended audio file object.
     * @param inNumberFrames The number of frames to write.
     * @param ioData         The buffer(s) from which audio data is written to the file.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWriteAsync(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * [@function] ExtAudioFileSeek
     * <p>
     * Seek to a specific frame position.
     * <p>
     * Sets the file's read position to the specified sample frame number. The next call
     * to ExtAudioFileRead will return samples from precisely this location, even if it
     * is located in the middle of a packet.
     * <p>
     * This function's behavior with files open for writing is currently undefined.
     *
     * @param inExtAudioFile The extended audio file object.
     * @param inFrameOffset  The desired seek position, in sample frames, relative to the beginning of
     *                       the file. This is specified in the sample rate and frame count of the file's format
     *                       (not the client format)
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileSeek(ExtAudioFileRef inExtAudioFile, long inFrameOffset);

    /**
     * [@function] ExtAudioFileTell
     * <p>
     * Return the file's read/write position.
     *
     * @param inExtAudioFile The extended audio file object.
     * @param outFrameOffset On exit, the file's current read/write position in sample frames. This is specified in the
     *                       sample rate and frame count of the file's format (not the client format)
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileTell(ExtAudioFileRef inExtAudioFile, LongPtr outFrameOffset);

    /**
     * [@function] ExtAudioFileGetPropertyInfo
     * <p>
     * Get information about a property
     *
     * @param inExtAudioFile The extended audio file object.
     * @param inPropertyID   The property being queried.
     * @param outSize        If non-null, on exit, this is set to the size of the property's value.
     * @param outWritable    If non-null, on exit, this indicates whether the property value is settable.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileGetPropertyInfo(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    /**
     * [@function] ExtAudioFileGetProperty
     * <p>
     * Get a property value.
     *
     * @param inExtAudioFile     The extended audio file object.
     * @param inPropertyID       The property being fetched.
     * @param ioPropertyDataSize On entry, the size (in bytes) of the memory pointed to by outPropertyData.
     *                           On exit, the actual size of the property data returned.
     * @param outPropertyData    The value of the property is copied to the memory this points to.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileGetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * [@function] ExtAudioFileSetProperty
     * <p>
     * Set a property value.
     *
     * @param inExtAudioFile     The extended audio file object.
     * @param inPropertyID       The property being set.
     * @param inPropertyDataSize The size of the property data, in bytes.
     * @param inPropertyData     Points to the property's new value.
     * @return An OSStatus error code.
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileSetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * [@function] NewMusicPlayer
     * <p>
     * Create a new music player
     * <p>
     * A music player is used to play a sequence back. This call is used to create a player
     * When a sequence is to be played by a player, it can play to either an AUGraph, a MIDI Destination or a
     * mixture/combination of both.
     *
     * @param outPlayer the newly created player
     */
    @Generated
    @CFunction
    public static native int NewMusicPlayer(Ptr<MusicPlayer> outPlayer);

    /**
     * [@function] DisposeMusicPlayer
     * <p>
     * Dispose a music player
     *
     * @param inPlayer the player to dispose
     */
    @Generated
    @CFunction
    public static native int DisposeMusicPlayer(MusicPlayer inPlayer);

    /**
     * [@function] MusicPlayerSetSequence
     * <p>
     * Set the sequence for the player to play
     * <p>
     * A Sequence cannot be set on a player while it is playing. Setting a sequence
     * will overide the currently set sequence.
     *
     * @param inPlayer   the player
     * @param inSequence the sequence for the player to play
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetSequence(MusicPlayer inPlayer, MusicSequence inSequence);

    /**
     * [@function] MusicPlayerGetSequence
     * <p>
     * Get the sequence attached to a player
     * <p>
     * If the player does not have a sequence set, this will return the _NoSequence error
     *
     * @param inPlayer    the player
     * @param outSequence the sequence currently set on the player
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetSequence(MusicPlayer inPlayer, Ptr<MusicSequence> outSequence);

    /**
     * [@function] MusicPlayerSetTime
     * <p>
     * Set the current time on the player
     * <p>
     * The Get and Set Time calls take a specification of time as beats. This positions the player
     * to the specified time based on the currently set sequence. No range checking on the time value
     * is done. This can be set on a playing player (in which case playing will be resumed from the
     * new time).
     *
     * @param inPlayer the player
     * @param inTime   the new time value
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetTime(MusicPlayer inPlayer, double inTime);

    /**
     * [@function] MusicPlayerGetTime
     * <p>
     * Get the current time of the player
     * <p>
     * The Get and Set Time calls take a specification of time as beats. This retrieves the player's
     * current time. If it is playing this time is the time of the player at the time the call was made.
     *
     * @param inPlayer the player
     * @param outTime  the current time value
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetTime(MusicPlayer inPlayer, DoublePtr outTime);

    /**
     * [@function] MusicPlayerGetHostTimeForBeats
     * <p>
     * Returns the host time that will be (or was) played at the specified beat.
     * <p>
     * This call is only valid if the player is playing and will return an error if the player is not playing
     * or if the starting position of the player (its "starting beat") was after the specified beat.
     * For general translation of beats to time in a sequence, see the MusicSequence calls for beat<->seconds.
     * <p>
     * The call uses the player's sequence's tempo map to translate a beat time from the starting time and beat
     * of the player.
     *
     * @param inPlayer    the player
     * @param inBeats     the specified beat-time value
     * @param outHostTime the corresponding host time
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetHostTimeForBeats(MusicPlayer inPlayer, double inBeats, LongPtr outHostTime);

    /**
     * [@function] MusicPlayerGetBeatsForHostTime
     * <p>
     * Returns the beat that will be (or was) played at the specified host time.
     * <p>
     * This call is only valid if the player is playing and will return an error if the player is not playing
     * or if the starting time of the player was after the specified host time.
     * For general translation of beats to time in a sequence, see the MusicSequence calls for beat<->seconds.
     * <p>
     * The call uses the player's sequence's tempo map to retrieve a beat time from the starting and specified host
     * time.
     *
     * @param inPlayer   the player
     * @param inHostTime the specified host time value
     * @param outBeats   the corresponding beat time
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetBeatsForHostTime(MusicPlayer inPlayer, long inHostTime, DoublePtr outBeats);

    /**
     * [@function] MusicPlayerPreroll
     * <p>
     * Prepare the player for playing
     * <p>
     * Allows the player to prepare its state so that starting is has a lower latency. If a player is started without
     * being prerolled, the player will pre-roll itself and then start.
     *
     * @param inPlayer the player
     */
    @Generated
    @CFunction
    public static native int MusicPlayerPreroll(MusicPlayer inPlayer);

    /**
     * [@function] MusicPlayerStart
     * <p>
     * Start the player
     * <p>
     * If the player has not been prerolled, it will pre-roll itself and then start.
     *
     * @param inPlayer the player
     */
    @Generated
    @CFunction
    public static native int MusicPlayerStart(MusicPlayer inPlayer);

    /**
     * [@function] MusicPlayerStop
     * <p>
     * Stop the player
     *
     * @param inPlayer the player
     */
    @Generated
    @CFunction
    public static native int MusicPlayerStop(MusicPlayer inPlayer);

    /**
     * [@function] MusicPlayerIsPlaying
     * <p>
     * Returns the playing state of the player. "Is it playing?"
     * <p>
     * This call returns a non-zero value in outIsPlaying if the player has been
     * started and not stopped. It may have "played" past the events of the attached
     * MusicSequence, but it is still considered to be playing (and its time value increasing)
     * until it is explicitly stopped
     *
     * @param inPlayer     the player
     * @param outIsPlaying false if not, true (non-zero) if is playing
     */
    @Generated
    @CFunction
    public static native int MusicPlayerIsPlaying(MusicPlayer inPlayer, BytePtr outIsPlaying);

    /**
     * [@function] MusicPlayerSetPlayRateScalar
     * <p>
     * Scale the playback rate of the player
     *
     * @param inPlayer    the player
     * @param inScaleRate a scalar that will be applied to the playback rate. If 2, playback is twice as fast, if
     *                    0.5 it is half as fast. As a scalar, the value must be greater than zero.
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetPlayRateScalar(MusicPlayer inPlayer, double inScaleRate);

    /**
     * [@function] MusicPlayerGetPlayRateScalar
     * <p>
     * Get the playback rate scalar of the player
     *
     * @param inPlayer     the player
     * @param outScaleRate the current scalar being applied to the player. Default value is 1.0
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetPlayRateScalar(MusicPlayer inPlayer, DoublePtr outScaleRate);

    /**
     * [@functiongroup] Music Sequence
     * [@function] NewMusicSequence
     * <p>
     * Create a new empty sequence
     * <p>
     * A new music sequence will only have a tempo track (with a default tempo of 120 bpm),
     * and the default type is beat based.
     * <p>
     * When a sequence is to be played by a player, it can play to either an AUGraph, a MIDI Destination or a
     * mixture/combination of both. See MusicSequenceSetAUGraph and MusicSequenceSetMIDIEndpoint for the generic
     * destination assignments. Specific tracks can also be assigned nodes of a graph or a MIDI endpoint as targets
     * for the events that they contain; see MusicTrackSetDestNode and MusicTrackSetDestMIDIEndpoint.
     *
     * @param outSequence the new sequence
     */
    @Generated
    @CFunction
    public static native int NewMusicSequence(Ptr<MusicSequence> outSequence);

    /**
     * [@function] DisposeMusicSequence
     * <p>
     * Dispose the sequence
     * <p>
     * A sequence cannot be disposed while a MusicPlayer has it.
     *
     * @param inSequence the sequence
     */
    @Generated
    @CFunction
    public static native int DisposeMusicSequence(MusicSequence inSequence);

    /**
     * [@function] MusicSequenceNewTrack
     * <p>
     * Add a new (empty) track to the sequence
     *
     * @param inSequence the sequence
     * @param outTrack   the new track (it is always appended to any existing tracks)
     */
    @Generated
    @CFunction
    public static native int MusicSequenceNewTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    /**
     * [@function] MusicSequenceDisposeTrack
     * <p>
     * Remove and dispose a track from a sequence
     *
     * @param inSequence the sequence
     * @param inTrack    the track to remove and dispose
     */
    @Generated
    @CFunction
    public static native int MusicSequenceDisposeTrack(MusicSequence inSequence, MusicTrack inTrack);

    /**
     * [@function] MusicSequenceGetTrackCount
     * <p>
     * The number of tracks in a sequence.
     * The track count and accessors exclude the tempo track (which is treated as a special case)
     *
     * @param inSequence        the sequence
     * @param outNumberOfTracks the number of tracks
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackCount(MusicSequence inSequence, IntPtr outNumberOfTracks);

    /**
     * [@function] MusicSequenceGetIndTrack
     * <p>
     * Get a track at the specified index
     * <p>
     * Index is zero based. It will return kAudio_ParamError if index is not in the range: 0 < TrackCount
     * The track count and accessors exclude the tempo track (which is treated as a special case)
     *
     * @param inSequence   the sequence
     * @param inTrackIndex the index
     * @param outTrack     the track at that index
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetIndTrack(MusicSequence inSequence, int inTrackIndex,
            Ptr<MusicTrack> outTrack);

    /**
     * [@function] MusicSequenceGetTrackIndex
     * <p>
     * Get the index for a specific track
     * <p>
     * Index is zero based. It will return an error if the track is not a member of the sequence.
     * The track count and accessors exclude the tempo track (which is treated as a special case)
     *
     * @param inSequence    the sequence
     * @param inTrack       the track
     * @param outTrackIndex the index of the track
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackIndex(MusicSequence inSequence, MusicTrack inTrack,
            IntPtr outTrackIndex);

    /**
     * [@function] MusicSequenceGetTempoTrack
     * <p>
     * Get the tempo track of the sequence
     * <p>
     * Each sequence has a single tempo track. All tempo events are placed into this tempo track (as well
     * as other appropriate events (time sig for instance from a MIDI file). The tempo track, once retrieved
     * can be edited and iterated upon as any other track. Non-tempo events in a tempo track are ignored.
     *
     * @param inSequence the sequence
     * @param outTrack   the tempo track of the sequence
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTempoTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    /**
     * [@function] MusicSequenceSetAUGraph
     * <p>
     * Set the graph to be associated with the sequence
     * <p>
     * A sequence can be associated with an AUGraph and this graph will be used to render the events as
     * controlled by the sequence when it is played. By default, all of the tracks of a sequence will
     * find the first AUNode that is an instance of an Apple MusicDevice audio unit (see MusicSequenceGetAUGraph).
     * Specific nodes of the graph can be targeted for different tracks (see MusicTrackSetDestNode). To render a
     * multi-track GM MIDI sequence on iOS, create a custom graph with a MIDISynth audio unit as the MusicDevice.
     * If inGraph is set to NULL, the sequence will reset to use the default graph.
     *
     * @param inSequence the sequence
     * @param inGraph    the graph
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetAUGraph(MusicSequence inSequence, AUGraph inGraph);

    /**
     * [@function] MusicSequenceGetAUGraph
     * <p>
     * Gets the graph currently associated with a sequence
     * <p>
     * By default if no graph is assigned to a sequence then the sequence will create a default graph.
     * This default graph contains a MusicDevice and a DynamicsProcessor and all tracks will be targeted
     * to the MusicDevice. On macOS, this MusicDevice is an instance of a software synthesizer that is
     * compatible with the GM and GS MIDI standards. On iOS, it is an instance of a monotimbral software
     * synthesizer designed to render events from a single MIDI channel. To render multi-track GM MIDI
     * sequences on iOS, create a custom graph with a MIDISynth audio unit as the MusicDevice.
     * <p>
     * This call will thus either return the graph as set by the user, or this default graph.
     *
     * @param inSequence the sequence
     * @param outGraph   the graph
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetAUGraph(MusicSequence inSequence, Ptr<AUGraph> outGraph);

    /**
     * [@function] MusicSequenceSetMIDIEndpoint
     * <p>
     * Makes the target of all of the tracks in the sequence a MIDI endpoint
     * <p>
     * This is a convenience function, and is equivalent to iterating through all of the tracks in a sequence
     * and targeting each track to the MIDI endpoint
     *
     * @param inSequence the sequence
     * @param inEndpoint the MIDI endpoint
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetMIDIEndpoint(MusicSequence inSequence, int inEndpoint);

    /**
     * [@function] MusicSequenceSetSequenceType
     * <p>
     * Set the sequence type (the default is beats)
     * <p>
     * These two calls allow you to get and set a MusicSequence type; specifying
     * kMusicSequenceType_Beats = 'beat',
     * kMusicSequenceType_Seconds = 'secs',
     * kMusicSequenceType_Samples = 'samp'
     * <p>
     * The sequence type can be set to beats at any time. The sequence type can only be set to
     * seconds or samples if there are NO tempo events already in the sequence.
     * <p>
     * For beats - it can have as many tempo events as you want
     * For Samples and Seconds - you should add a single tempo event after setting the type
     * Samples - the tempo is the desired sample rate - e.g. 44100 and each "beat" in the sequence will be
     * interpreted as a sample count at that sample rate (so beat == 44100 is a second)
     * Seconds - the tempo should be set to 60 - a beat is a second.
     * <p>
     * Beats is the default (and is the behaviour on pre 10.5 systems)
     * <p>
     * A meta event of interest for Seconds based MIDI files is the SMPTE Offset meta event - stored in the tempo track.
     * The sequence doesn't do anything with this event (except store/write it)
     *
     * @param inSequence the sequence
     * @param inType     the sequence type
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetSequenceType(MusicSequence inSequence, int inType);

    /**
     * [@function] MusicSequenceGetSequenceType
     * <p>
     * Get the sequence type
     * <p>
     * See SetSequence for a full description
     *
     * @param inSequence the sequence
     * @param outType    the type
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetSequenceType(MusicSequence inSequence, IntPtr outType);

    /**
     * [@function] MusicSequenceFileLoad
     * <p>
     * Load the data contained within the referenced file to the sequence
     * <p>
     * This function will parse the file referenced by the URL and add the events to the sequence.
     *
     * @param inSequence     the sequence
     * @param inFileRef      a file:// URL that references a file
     * @param inFileTypeHint provides a hint to the sequence on the file type being imported. Can be zero in many cases.
     * @param inFlags        flags that can control how the data is parsed in the file and laid out in the tracks
     *                       that will be created and added to the sequence in this operation
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileLoad(MusicSequence inSequence, CFURLRef inFileRef, int inFileTypeHint,
            int inFlags);

    /**
     * [@function] MusicSequenceFileLoadData
     * <p>
     * Load the data to the sequence
     * <p>
     * This function will parse the data and add the events to the sequence. The data provided needs to
     * be of a particular file type as specified by the fileTypeHint.
     *
     * @param inSequence     the sequence
     * @param inData         the contents of a valid file loaded into a CFData object
     * @param inFileTypeHint provides a hint to the sequence on the file type being imported. Can be zero in many cases.
     * @param inFlags        flags that can control how the data is parsed in the file and laid out in the tracks
     *                       that will be created and added to the sequence in this operation
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileLoadData(MusicSequence inSequence, CFDataRef inData, int inFileTypeHint,
            int inFlags);

    /**
     * [@function] MusicSequenceSetSMPTEResolution
     * <p>
     * Helper function to establish the SMPTE based MIDI file resolution for the specified ticks
     * <p>
     * SMPTE resolution helpers for dealing with the interpretation and creation of
     * tick values for standard MIDI files (see MusicSequenceFileCreate)
     *
     * @param fps   the frames per second
     * @param ticks the ticks per quarter note
     * @return the resolution that can be used when creating a MIDI file derived from the two parameters
     */
    @Generated
    @Inline
    @CFunction
    public static native short MusicSequenceSetSMPTEResolution(byte fps, byte ticks);

    /**
     * [@function] MusicSequenceGetSMPTEResolution
     * <p>
     * Helper function to get the fps and ticks from their representation in a SMPTE based MIDI file
     * <p>
     * SMPTE resolution helpers for dealing with the interpretation and creation of
     * tick values for standard MIDI files (see MusicSequenceFileCreate)
     *
     * @param inRes the resolution from a MIDI file
     * @param fps   the frames per second
     * @param ticks the ticks per quarter note
     */
    @Generated
    @Inline
    @CFunction
    public static native void MusicSequenceGetSMPTEResolution(short inRes, BytePtr fps, BytePtr ticks);

    /**
     * [@function] MusicSequenceFileCreate
     * <p>
     * Create a file from a sequence
     * <p>
     * This function can be (and is most commonly) used to create a MIDI file from the events in a sequence.
     * Only MIDI based events are used when creating the MIDI file. MIDI files are normally beat based, but
     * can also have a SMPTE (or real-time rather than beat time) representation.
     * <p>
     * inResolution is relationship between "tick" and quarter note for saving to Standard MIDI File
     * - pass in zero to use default - this will be the value that is currently set on the tempo track
     * - see the comments for the set track property's time resolution
     * <p>
     * The different Sequence types determine the kinds of files that can be created:
     * <p>
     * Beats
     * When saving a MIDI file, it saves a beats (PPQ) based axis
     * <p>
     * Seconds
     * When saving a MIDI file, it will save it as a SMPTE resolution - so you should specify this resolution
     * when creating the MIDI file.
     * If zero is specified, 25 fps and 40 ticks/frame is used (a time scale of a millisecond)
     * <p>
     * Samples
     * You cannot save to a MIDI file with this sequence type
     * <p>
     * The complete meaning of the 16-bit "division" field in a MIDI File's MThd chunk.
     * <p>
     * If it is positive, then a tick represents 1/D quarter notes.
     * <p>
     * If it negative:
     * <p>
     * bits 14-8 are a signed 7-bit number representing the SMPTE format:
     * -24, -25, -29 (drop), -30
     * bits 7-0 represents the number of ticks per SMPTE frame
     * typical values: 4, 10, 80, 100
     * <p>
     * You can obtain millisecond resolution by specifying 25 frames/sec and 40 divisions/frame.
     * <p>
     * 30 fps with 80 bits (ticks) per frame: 0xE250 ((char)0xE2 == -30)
     *
     * @param inSequence   the sequence
     * @param inFileRef    the location of the file to create
     * @param inFileType   the type of file to create
     * @param inFlags      flags to control the file creation
     * @param inResolution the resolution (depending on file type and sequence type)
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileCreate(MusicSequence inSequence, CFURLRef inFileRef, int inFileType,
            int inFlags, short inResolution);

    /**
     * [@function] MusicSequenceFileCreateData
     * <p>
     * Create a data object from a sequence
     * <p>
     * The same basic parameters apply to this as with the MusicSequenceFileCreate function. The difference
     * being that that function will create a file on disk, whereas this one will create a CFData object
     * that is a file in memory. The CFData object should be released by the caller.
     *
     * @param inSequence   the sequence
     * @param inFileType   the type of file to create
     * @param inFlags      flags to control the file creation
     * @param inResolution the resolution (depending on file type and sequence type)
     * @param outData      the resulting data object
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileCreateData(MusicSequence inSequence, int inFileType, int inFlags,
            short inResolution, Ptr<CFDataRef> outData);

    /**
     * [@function] MusicSequenceReverse
     * <p>
     * Reverse in time all events in a sequence, including the tempo events
     *
     * @param inSequence the sequence
     */
    @Generated
    @CFunction
    public static native int MusicSequenceReverse(MusicSequence inSequence);

    /**
     * [@function] MusicSequenceGetSecondsForBeats
     * <p>
     * Returns a seconds value that would correspond to the supplied beats
     * <p>
     * Uses the sequence's tempo events
     *
     * @param inSequence the sequence
     * @param inBeats    the beats
     * @param outSeconds the seconds (time from 0 beat)
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetSecondsForBeats(MusicSequence inSequence, double inBeats,
            DoublePtr outSeconds);

    /**
     * [@function] MusicSequenceGetBeatsForSeconds
     * <p>
     * Returns a beat value that would correspond to the supplied seconds from zero.
     * <p>
     * Uses the sequence's tempo events
     *
     * @param inSequence the sequence
     * @param inSeconds  the seconds
     * @param outBeats   the corresponding beat
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetBeatsForSeconds(MusicSequence inSequence, double inSeconds,
            DoublePtr outBeats);

    /**
     * [@function] MusicSequenceSetUserCallback
     * <p>
     * Establish a user callback for a sequence
     * <p>
     * This call is used to register (or remove if inCallback is NULL) a callback
     * that the MusicSequence will call for ANY UserEvents that are added to any of the
     * tracks of the sequence.
     * <p>
     * If there is a callback registered, then UserEvents will be chased when
     * MusicPlayerSetTime is called. In that case the inStartSliceBeat and inEndSliceBeat
     * will both be the same value and will be the beat that the player is chasing too.
     * <p>
     * In normal cases, where the sequence data is being scheduled for playback, the
     * following will apply:
     * inStartSliceBeat <= inEventTime < inEndSliceBeat
     * <p>
     * The only exception to this is if the track that owns the MusicEvent is looping.
     * In this case the start beat will still be less than the end beat (so your callback
     * can still determine that it is playing, and what beats are currently being scheduled),
     * however, the inEventTime will be the original time-stamped time of the user event.
     *
     * @param inSequence   the sequence
     * @param inCallback   the callback
     * @param inClientData client (user supplied) data provided back to the callback when it is called by the sequence
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetUserCallback(MusicSequence inSequence,
            @FunctionPtr(name = "call_MusicSequenceSetUserCallback") Function_MusicSequenceSetUserCallback inCallback,
            VoidPtr inClientData);

    /**
     * [@function] MusicSequenceBeatsToBarBeatTime
     * <p>
     * Convenience function to format a sequence's beat time to its bar-beat time
     * <p>
     * The sequence's tempo track Time Sig events are used to
     * to calculate the bar-beat representation. If there are no Time Sig events added to the sequence
     * 4/4 is assumed. A Time Sig event is a MIDI Meta Event as specified for MIDI files.
     *
     * @param inSequence       the sequence
     * @param inBeats          the beat which should be represented by the bar-beat
     * @param inSubbeatDivisor The denominator of the fractional number of beats.
     * @param outBarBeatTime   the formatted bar/beat time
     */
    @Generated
    @CFunction
    public static native int MusicSequenceBeatsToBarBeatTime(MusicSequence inSequence, double inBeats,
            int inSubbeatDivisor,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime outBarBeatTime);

    /**
     * [@function] MusicSequenceBarBeatTimeToBeats
     * <p>
     * Convenience function to format a bar-beat time to a sequence's beat time
     * <p>
     * The sequence's tempo track Time Sig events are used to
     * to calculate the bar-beat representation. If there are no Time Sig events added to the sequence
     * 4/4 is assumed. A Time Sig event is a MIDI Meta Event as specified for MIDI files.
     *
     * @param inSequence    the sequence
     * @param inBarBeatTime the bar-beat time
     * @param outBeats      the sequence's beat time for that bar-beat time
     */
    @Generated
    @CFunction
    public static native int MusicSequenceBarBeatTimeToBeats(MusicSequence inSequence,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime inBarBeatTime,
            DoublePtr outBeats);

    /**
     * [@function] MusicSequenceGetInfoDictionary
     * <p>
     * Returns a dictionary containing meta-data derived from a sequence
     * <p>
     * The dictionary can contain one or more of the kAFInfoDictionary_*
     * keys specified in <AudioToolbox/AudioFile.h>
     * <p>
     * The caller should release the returned dictionary. If the call fails it will return NULL
     *
     * @param inSequence the sequence
     * @return a CFDictionary or NULL if the call fails.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef MusicSequenceGetInfoDictionary(MusicSequence inSequence);

    /**
     * [@function] MusicTrackGetSequence
     * <p>
     * Gets the sequence which the track is a member of
     *
     * @param inTrack     the track
     * @param outSequence the track's sequence
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetSequence(MusicTrack inTrack, Ptr<MusicSequence> outSequence);

    /**
     * [@function] MusicTrackSetDestNode
     * <p>
     * Sets the track's target to the specified AUNode
     * <p>
     * The node must be a member of the graph that the track's sequence is using. When played, the track
     * will send all of its events to that node.
     *
     * @param inTrack the track
     * @param inNode  the new node
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetDestNode(MusicTrack inTrack, int inNode);

    /**
     * [@function] MusicTrackSetDestMIDIEndpoint
     * <p>
     * Sets the track's target to the specified MIDI endpoint
     * <p>
     * When played, the track will send all of its events to the specified MIDI Endpoint.
     *
     * @param inTrack    the track
     * @param inEndpoint the new MIDI endpoint
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetDestMIDIEndpoint(MusicTrack inTrack, int inEndpoint);

    /**
     * [@function] MusicTrackGetDestNode
     * <p>
     * Gets the track's target if it is an AUNode
     * <p>
     * Returns kAudioToolboxErr_IllegalTrackDestination if the track's target is a MIDIEndpointRef
     * and NOT an AUNode
     *
     * @param inTrack the track
     * @param outNode the node target for the track
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetDestNode(MusicTrack inTrack, IntPtr outNode);

    /**
     * [@function] MusicTrackGetDestMIDIEndpoint
     * <p>
     * Gets the track's target if it is a MIDI Endpoint
     * <p>
     * Returns kAudioToolboxErr_IllegalTrackDestination if the track's target is an AUNode
     * and NOT a MIDI Endpoint
     *
     * @param inTrack     the track
     * @param outEndpoint the MIDI Endpoint target for the track
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetDestMIDIEndpoint(MusicTrack inTrack, IntPtr outEndpoint);

    /**
     * [@function] MusicTrackSetProperty
     * <p>
     * Sets the specified property value
     * <p>
     * Property values are always get and set by reference
     *
     * @param inTrack      the track
     * @param inPropertyID the property ID
     * @param inData       the new property value
     * @param inLength     the size of the property value being set
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr inData, int inLength);

    /**
     * [@function] MusicTrackGetProperty
     * <p>
     * Gets the specified property value
     * <p>
     * If outData is NULL, then the size of the data will be passed back in ioLength
     * This allows the client to allocate a buffer of the correct size (useful for variable
     * length properties -- currently all properties have fixed size)
     * Property values are always get and set by reference
     *
     * @param inTrack      the track
     * @param inPropertyID the property ID
     * @param outData      if not NULL, points to data of size ioLength
     * @param ioLength     on input the available size of outData, on output the size of the valid data that outData
     *                     will then point too.
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr outData,
            IntPtr ioLength);

    /**
     * [@function] MusicTrackMoveEvents
     * <p>
     * Move events in a track
     * <p>
     * Moves all of the events in the specified time range by the moveTime. MoveTime maybe negative to
     * move events backwards (towards zero).
     * <p>
     * All time ranges are [starttime < endtime]
     *
     * @param inTrack     the track
     * @param inStartTime the start time for the range of events
     * @param inEndTime   the end time up to which will form the range of the events to move
     * @param inMoveTime  amount of beats to move the selected events.
     */
    @Generated
    @CFunction
    public static native int MusicTrackMoveEvents(MusicTrack inTrack, double inStartTime, double inEndTime,
            double inMoveTime);

    /**
     * [@function] MusicTrackClear
     * <p>
     * Removes all events within the specified range
     * <p>
     * All time ranges are [starttime < endtime]
     *
     * @param inTrack     the track
     * @param inStartTime the start time for the range of events
     * @param inEndTime   the end time up to which will form the range of the events to clear
     */
    @Generated
    @CFunction
    public static native int MusicTrackClear(MusicTrack inTrack, double inStartTime, double inEndTime);

    /**
     * [@function] MusicTrackCut
     * <p>
     * Removes all the events within the specified range
     * <p>
     * Events that fall past the specified range will be moved back by the specified range time.
     * <p>
     * All time ranges are [starttime < endtime]
     *
     * @param inTrack     the track
     * @param inStartTime the start time for the range of events
     * @param inEndTime   the end time up to which will form the range of the events to cut out
     */
    @Generated
    @CFunction
    public static native int MusicTrackCut(MusicTrack inTrack, double inStartTime, double inEndTime);

    /**
     * [@function] MusicTrackCopyInsert
     * <p>
     * Copies events from one track and inserts them into another
     * <p>
     * Copies all of the events with the specified time range of the source track. It then inserts
     * those events into the destination track. All events at and after inDestInsertTime in inDestTrack
     * are moved forward by the range's duration
     * <p>
     * All time ranges are [starttime < endtime]
     *
     * @param inSourceTrack     the source track
     * @param inSourceStartTime the start time for the range of events
     * @param inSourceEndTime   the end time up to which will form the range of the events to copy from the source track
     * @param inDestTrack       the destination track to copy too
     * @param inDestInsertTime  the time at which the copied events will be inserted.
     */
    @Generated
    @CFunction
    public static native int MusicTrackCopyInsert(MusicTrack inSourceTrack, double inSourceStartTime,
            double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);

    /**
     * [@function] MusicTrackMerge
     * <p>
     * Copies events from one track and merges them into another
     * <p>
     * Copies all of the events with the specified time range of the source track. It then merges
     * those events into the destination track starting at inDestInsertTime.
     * <p>
     * All time ranges are [starttime < endtime]
     *
     * @param inSourceTrack     the source track
     * @param inSourceStartTime the start time for the range of events
     * @param inSourceEndTime   the end time up to which will form the range of the events to copy from the source track
     * @param inDestTrack       the destination track to copy too
     * @param inDestInsertTime  the time at which the copied events will be merged.
     */
    @Generated
    @CFunction
    public static native int MusicTrackMerge(MusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime,
            MusicTrack inDestTrack, double inDestInsertTime);

    /**
     * [@function] MusicTrackNewMIDINoteEvent
     * <p>
     * Adds a MIDINoteMessage event to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inMessage   the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDINoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDINoteMessage inMessage);

    /**
     * [@function] MusicTrackNewMIDIChannelEvent
     * <p>
     * Adds a MIDIChannelMessage event to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inMessage   the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIChannelEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIChannelMessage inMessage);

    /**
     * [@function] MusicTrackNewMIDIRawDataEvent
     * <p>
     * Adds a MIDIRawData event to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inRawData   the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIRawDataEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIRawData inRawData);

    /**
     * [@function] MusicTrackNewExtendedNoteEvent
     * <p>
     * Adds a ExtendedNoteOnEvent to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inInfo      the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedNoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ExtendedNoteOnEvent inInfo);

    /**
     * [@function] MusicTrackNewParameterEvent
     * <p>
     * Adds a ParameterEvent to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inInfo      the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewParameterEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ParameterEvent inInfo);

    /**
     * [@function] MusicTrackNewExtendedTempoEvent
     * <p>
     * Adds a tempo event to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inBPM       the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedTempoEvent(MusicTrack inTrack, double inTimeStamp, double inBPM);

    /**
     * [@function] MusicTrackNewMetaEvent
     * <p>
     * Adds a MIDIMetaEvent to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inMetaEvent the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMetaEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIMetaEvent inMetaEvent);

    /**
     * [@function] MusicEventUserData
     * <p>
     * Adds a MusicEventUserData event to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack     the track
     * @param inTimeStamp the time stamp
     * @param inUserData  the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewUserEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData inUserData);

    /**
     * [@function] MusicTrackNewAUPresetEvent
     * <p>
     * Adds a AUPresetEvent to a track
     * <p>
     * The event is added at the specified time stamp. The time stamp should not be less than zero.
     *
     * @param inTrack       the track
     * @param inTimeStamp   the time stamp
     * @param inPresetEvent the event
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewAUPresetEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AUPresetEvent inPresetEvent);

    /**
     * [@function] NewMusicEventIterator
     * <p>
     * Creates an iterator to iterator over a track's events
     * <p>
     * The iterator should be considered invalid if a track is edited. In that case you should create a new
     * iterator and seek it to the desired position.
     *
     * @param inTrack     the track upon which to iterate
     * @param outIterator the new iterator
     */
    @Generated
    @CFunction
    public static native int NewMusicEventIterator(MusicTrack inTrack, Ptr<MusicEventIterator> outIterator);

    /**
     * [@function] DisposeMusicEventIterator
     * <p>
     * Dispose an iterator
     *
     * @param inIterator the iterator
     */
    @Generated
    @CFunction
    public static native int DisposeMusicEventIterator(MusicEventIterator inIterator);

    /**
     * [@function] MusicEventIteratorSeek
     * <p>
     * Move the iterator to an event at the specified time
     * <p>
     * If there is no event at the specified time, the iterator will point to the first event after
     * that time.
     * By specifying kMusicTimeStamp_EndOfTrack you will position the iterator to the end of track
     * (which is pointing to the space just AFTER the last event). You can use MusicEventIteratorPreviousEvent
     * to backup to the last event.
     * By specifying 0, you will position the iterator at the first event
     *
     * @param inIterator  the iterator
     * @param inTimeStamp the time stamp to seek too
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSeek(MusicEventIterator inIterator, double inTimeStamp);

    /**
     * [@function] MusicEventIteratorNextEvent
     * <p>
     * Move the iterator to the next event
     * <p>
     * If the iterator was at the last event, then it will move past the last event and will no longer point
     * to an event. You can use check MusicEventIteratorHasCurrentEvent to see if there is an event at the
     * iterator's current position. See also MusicEventIteratorHasNextEvent.
     * <p>
     * Typically this call is used to move the iterator forwards through the track's events.
     *
     * @param inIterator the iterator
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorNextEvent(MusicEventIterator inIterator);

    /**
     * [@function] MusicEventIteratorPreviousEvent
     * <p>
     * Move the iterator to the previous event
     * <p>
     * If the iterator was at the first event, then it will leave the iterator unchanged and return an error.
     * See also MusicEventIteratorHasPreviousEvent
     * <p>
     * Typically this call is used to move the iterator backwards through the track's events.
     *
     * @param inIterator the iterator
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorPreviousEvent(MusicEventIterator inIterator);

    /**
     * [@function] MusicEventIteratorGetEventInfo
     * <p>
     * Retrieves the event data at the iterator.
     * <p>
     * Retrieves the event and other information from the iterator's current position.
     * <p>
     * If you do not want specific information (eg, the time stamp) pass in NULL for that parameter.
     *
     * @param inIterator       the iterator
     * @param outTimeStamp     the time stamp of the event
     * @param outEventType     one of kMusicEventType_XXX that indicates what kind of event type the iterator
     *                         is currently pointing too
     * @param outEventData     a reference to the event data. The type of data is described by the eventType. This data
     *                         is read only and should not be edited in place.
     * @param outEventDataSize the size of the data referenced by outEventData
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorGetEventInfo(MusicEventIterator inIterator, DoublePtr outTimeStamp,
            IntPtr outEventType, Ptr<ConstVoidPtr> outEventData, IntPtr outEventDataSize);

    /**
     * [@function] MusicEventIteratorSetEventInfo
     * <p>
     * Changes the type or value of an event
     * <p>
     * Allows you to change either the event type, or the values of the event data, that the iterator is
     * currently pointing too. You cannot change the event's time (to do that you should use
     * MusicEventIteratorSetEventTime).
     *
     * @param inIterator  the iterator
     * @param inEventType the new (or existing) type of the event you are changing
     * @param inEventData the new event data. The size and type of this event data must match the inEventType
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventInfo(MusicEventIterator inIterator, int inEventType,
            ConstVoidPtr inEventData);

    /**
     * [@function] MusicEventIteratorSetEventTime
     * <p>
     * Set a new time for an event
     * <p>
     * The iterator will still be pointing to the same event, but as the event will have moved,
     * it may or may not have a next or previous event now (depending of course on the time
     * you moved it too).
     *
     * @param inIterator  the iterator
     * @param inTimeStamp the new time stamp of the event
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventTime(MusicEventIterator inIterator, double inTimeStamp);

    /**
     * [@function] MusicEventIteratorDeleteEvent
     * <p>
     * Deletes the event pointed to by the iterator
     * <p>
     * The iterator will reference the next event after the event has been deleted.
     *
     * @param inIterator the iterator
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorDeleteEvent(MusicEventIterator inIterator);

    /**
     * [@function] MusicEventIteratorHasPreviousEvent
     * <p>
     * Does the track have an event previous to the event the iterator is pointing to?
     * <p>
     * To use the iterator going backwards through a track:
     * iter = New Iterator (points at first event)
     * MusicEventIteratorSeek (iter, kMusicTimeStamp_EndOfTrack) // will point it past the last event
     * bool hasPreviousEvent;
     * MusicEventIteratorHasPreviousEvent (iter, &hasPreviousEvent)
     * while (hasPreviousEvent) {
     * MusicEventIteratorPreviousEvent (iter)
     * // do work... MusicEventIteratorGetEventInfo (iter, ...
     * <p>
     * MusicEventIteratorHasPreviousEvent (iter, &hasPreviousEvent);
     * }
     *
     * @param inIterator      the iterator
     * @param outHasPrevEvent true if there is a previous event, false if not
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasPreviousEvent(MusicEventIterator inIterator, BytePtr outHasPrevEvent);

    /**
     * [@function] MusicEventIteratorHasNextEvent
     * <p>
     * Does the track have an event past the event the iterator is pointing too?
     * <p>
     * To use the iterator going forwards through a track:
     * iter = New Iterator (points at first event)
     * bool hasCurrentEvent;
     * MusicEventIteratorHasCurrentEvent(iter, &hasCurrentEvent);
     * while (hasCurrentEvent) {
     * // do work... MusicEventIteratorGetEventInfo (iter, ...
     * <p>
     * MusicEventIteratorNextEvent (iter)
     * MusicEventIteratorHasCurrentEvent(iter, &hasCurrentEvent);
     * }
     *
     * @param inIterator      the iterator
     * @param outHasNextEvent true if there is a next event, false if not
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasNextEvent(MusicEventIterator inIterator, BytePtr outHasNextEvent);

    /**
     * [@function] MusicEventIteratorHasCurrentEvent
     * <p>
     * Is there an event at the iterator's current position?
     *
     * @param inIterator     the iterator
     * @param outHasCurEvent true if there is an event, false if not
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasCurrentEvent(MusicEventIterator inIterator, BytePtr outHasCurEvent);

    /**
     * Print the internal state of an object to os_log.
     */
    @Generated
    @CFunction
    public static native void CAShow(VoidPtr inObject);

    /**
     * Print the internal state of an object to the supplied FILE*.
     */
    @Generated
    @CFunction
    public static native void CAShowFile(VoidPtr inObject,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE inFile);

    /**
     * [@function] CopyNameFromSoundBank
     * <p>
     * This will return the name of a sound bank from a DLS or SF2 bank.
     * The name should be released by the caller.
     *
     * @param inURL   The URL for the sound bank.
     * @param outName A pointer to a CFStringRef to be created and returned by the function.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int CopyNameFromSoundBank(CFURLRef inURL, Ptr<CFStringRef> outName);

    /**
     * [@function] CopyInstrumentInfoFromSoundBank
     * <p>
     * This will return a CFArray of CFDictionaries, one per instrument found in the DLS or SF2 bank.
     * Each dictionary will contain four items accessed via CFStringRef versions of the keys kInstrumentInfoKey_MSB,
     * kInstrumentInfoKey_LSB, kInstrumentInfoKey_Program, and kInstrumentInfoKey_Name.
     * MSB: An NSNumberRef for the most-significant byte of the bank number. GM melodic banks will return 120 (0x78).
     * GM percussion banks will return 121 (0x79). Custom banks will return their literal value.
     * LSB: An NSNumberRef for the least-significant byte of the bank number. All GM banks will return
     * the bank variation number (0-127).
     * Program Number: An NSNumberRef for the program number (0-127) of an instrument within a particular bank.
     * Name: A CFStringRef containing the name of the instrument.
     * <p>
     * Using these MSB, LSB, and Program values will guarantee that the correct instrument is loaded by the DLS synth
     * or Sampler Audio Unit.
     * The CFArray should be released by the caller.
     *
     * @param inURL             The URL for the sound bank.
     * @param outInstrumentInfo A pointer to a CFArrayRef to be created and returned by the function.
     * @return returns noErr if successful.
     */
    @Generated
    @CFunction
    public static native int CopyInstrumentInfoFromSoundBank(CFURLRef inURL, Ptr<CFArrayRef> outInstrumentInfo);

    /**
     * [@constant] kAudioComponentRegistrationsChangedNotification
     * <p>
     * Notification generated when the set of available AudioComponents changes.
     * <p>
     * Register for this notification name with `[NSNotificationCenter defaultCenter]` or
     * `CFNotificationCenterGetLocalCenter()`, using an object of NULL.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kAudioComponentRegistrationsChangedNotification();

    /**
     * [@constant] kAudioComponentInstanceInvalidationNotification
     * <p>
     * Notification generated when the connection to an audio unit extension process
     * is invalidated.
     * <p>
     * Register for this notification name with `[NSNotificationCenter defaultCenter]` or
     * `CFNotificationCenterGetLocalCenter()`. The "object" refers to an AUAudioUnit instance
     * to be observed, or can be nil to observe all instances.
     * <p>
     * This notification can happen for several reasons, for instance the connection being
     * invalidated or the process abnormally ending. There can be multiple notifications for
     * the same event (i.e. a terminated process will also invalidate the connection).
     * <p>
     * The notification's userInfo dictionary may contain the following keys, depending on
     * the reason for the invalidation and the platform in which it's running:
     *
     * @"audioUnit", a NSValue whose pointerValue is the AudioUnit or
     * AudioComponentInstance which is wrapping the AUAudioUnit communicating with
     * the extension process. (This may be null if there is no such component instance.).
     * For example:
     * <p>
     * ```
     * [[NSNotificationCenter defaultCenter]
     * addObserverForName:(NSString *)kAudioComponentInstanceInvalidationNotification
     * object:nil queue:nil usingBlock:^(NSNotification *note) {
     * AUAudioUnit *auAudioUnit = (AUAudioUnit *)note.object;
     * NSValue *val = note.userInfo[@"audioUnit"];
     * AudioUnit audioUnit = (AudioUnit)val.pointerValue;
     * NSLog(@"Received kAudioComponentInstanceInvalidationNotification: auAudioUnit %@, audioUnit %p",
     * auAudioUnit, audioUnit);
     * }];
     * ```
     * @"Service PID", a NSNumber with the process ID for the service.
     * @"Host PID", a NSNumber with the process ID for the host.
     * @"Executable Path", a NSString with the path for the executable that may be responsible
     * for the abnormal exit.
     * @"Descriptions" a NSArray of NSValues representing byte encoded
     * AudioComponentDescriptions that may be responsible for the abnormal exit.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kAudioComponentInstanceInvalidationNotification();

    /**
     * CFString version of kAudioSession_AudioRouteChangeKey_Reason. This is more convenient to use than the raw string
     * version.
     * Available in iOS 5.0 or greater
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_RouteChangeKey_Reason();

    /**
     * CFDictionary keys for kAudioSessionProperty_AudioRouteChange
     * Available in iOS 5.0 or greater
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteChangeKey_PreviousRouteDescription();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteChangeKey_CurrentRouteDescription();

    /**
     * CFDictionary keys for kAudioSessionProperty_AudioRouteDescription
     * Available in iOS 5.0 or greater
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Inputs();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Outputs();

    /**
     * key(s) for the CFDictionary associated with each entry of the CFArrays returned by
     * kAudioSession_AudioRouteKey_Inputs
     * and kAudioSession_AudioRouteKey_Outputs.
     * Available in iOS 5.0 or greater
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Type();

    /**
     * [@enum] AudioSession route input types
     * <p>
     * These are the strings used with the kAudioSession_AudioRouteKey_Type key for the CFDictionary associated
     * with kAudioSession_AudioRouteKey_Inputs.
     * Available in iOS 5.0 or greater
     * [@constant] kAudioSessionInputRoute_LineIn
     * A line in input
     * [@constant] kAudioSessionInputRoute_BuiltInMic
     * A built-in microphone input. (Note that some devices like early iPods do not have this input)
     * [@constant] kAudioSessionInputRoute_HeadsetMic
     * A microphone that is part of a headset (combined microphone and headphones)
     * [@constant] kAudioSessionInputRoute_BluetoothHFP
     * A microphone that is part of a Bluetooth Hands-Free Profile device
     * [@constant] kAudioSessionInputRoute_USBAudio
     * A Universal Serial Bus input
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_LineIn();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_BuiltInMic();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_HeadsetMic();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_BluetoothHFP();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_USBAudio();

    /**
     * [@enum] AudioSession route output types
     * <p>
     * These are strings used with the kAudioSession_AudioRouteKey_Type key for the CFDictionary associated
     * with kAudioSession_AudioRouteKey_Outputs.
     * Available in iOS 5.0 or greater
     * [@constant] kAudioSessionOutputRoute_LineOut
     * A line out output
     * [@constant] kAudioSessionOutputRoute_Headphones
     * Speakers in a headset (mic and headphones) or simple headphones
     * [@constant] kAudioSessionOutputRoute_BluetoothHFP
     * Speakers that are part of a Bluetooth Hands-Free Profile device
     * [@constant] kAudioSessionOutputRoute_BluetoothA2DP
     * Speakers in a Bluetooth A2DP device
     * [@constant] kAudioSessionOutputRoute_BuiltInReceiver
     * The speaker you hold to your ear when on a phone call
     * [@constant] kAudioSessionOutputRoute_BuiltInSpeaker
     * The built-in speaker
     * [@constant] kAudioSessionOutputRoute_USBAudio
     * Speaker(s) in a Universal Serial Bus device
     * [@constant] kAudioSessionOutputRoute_HDMI
     * Output via High-Definition Multimedia Interface
     * [@constant] kAudioSessionOutputRoute_AirPlay
     * Output on a remote Air Play device
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_LineOut();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_Headphones();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BluetoothHFP();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BluetoothA2DP();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BuiltInReceiver();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BuiltInSpeaker();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_USBAudio();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_HDMI();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_AirPlay();

    /**
     * CFDictionary keys for kAudioSessionProperty_InputSources
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_InputSourceKey_ID();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_InputSourceKey_Description();

    /**
     * CFDictionary keys for kAudioSessionProperty_OutputDestinations
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_OutputDestinationKey_ID();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_OutputDestinationKey_Description();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioComponentInstantiate {
        @Generated
        void call_AudioComponentInstantiate(AudioComponentInstance arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioComponentRegister {
        @Generated
        VoidPtr call_AudioComponentRegister(
                @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitAddPropertyListener {
        @Generated
        void call_AudioUnitAddPropertyListener(VoidPtr arg0, AudioComponentInstance arg1, int arg2, int arg3, int arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitRemovePropertyListenerWithUserData {
        @Generated
        void call_AudioUnitRemovePropertyListenerWithUserData(VoidPtr arg0, AudioComponentInstance arg1, int arg2,
                int arg3, int arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitAddRenderNotify {
        @Generated
        int call_AudioUnitAddRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitRemoveRenderNotify {
        @Generated
        int call_AudioUnitRemoveRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AUGraphAddRenderNotify {
        @Generated
        int call_AUGraphAddRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AUGraphRemoveRenderNotify {
        @Generated
        int call_AUGraphRemoveRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioConverterFillComplexBuffer {
        @Generated
        int call_AudioConverterFillComplexBuffer(AudioConverterRef arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg2,
                @ReferenceInfo(type = AudioStreamPacketDescription.class, depth = 2) Ptr<Ptr<AudioStreamPacketDescription>> arg3,
                VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_1 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_1(VoidPtr arg0, long arg1, int arg2, VoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_2 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_2(VoidPtr arg0, long arg1, int arg2, ConstVoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_3 {
        @Generated
        long call_AudioFileInitializeWithCallbacks_3(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_4 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_4(VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_1 {
        @Generated
        int call_AudioFileOpenWithCallbacks_1(VoidPtr arg0, long arg1, int arg2, VoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_2 {
        @Generated
        int call_AudioFileOpenWithCallbacks_2(VoidPtr arg0, long arg1, int arg2, ConstVoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_3 {
        @Generated
        long call_AudioFileOpenWithCallbacks_3(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_4 {
        @Generated
        int call_AudioFileOpenWithCallbacks_4(VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileStreamOpen_1 {
        @Generated
        void call_AudioFileStreamOpen_1(VoidPtr arg0, AudioFileStreamID arg1, int arg2, IntPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileStreamOpen_2 {
        @Generated
        void call_AudioFileStreamOpen_2(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueNewOutput {
        @Generated
        void call_AudioQueueNewOutput(VoidPtr arg0, AudioQueueRef arg1, AudioQueueBuffer arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueNewInput {
        @Generated
        void call_AudioQueueNewInput(VoidPtr arg0, AudioQueueRef arg1, AudioQueueBuffer arg2, AudioTimeStamp arg3,
                int arg4,
                @ReferenceInfo(type = AudioStreamPacketDescription.class) ConstPtr<AudioStreamPacketDescription> arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioQueueNewOutputWithDispatchQueue {
        @Generated
        void call_AudioQueueNewOutputWithDispatchQueue(AudioQueueRef inAQ,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioQueueNewInputWithDispatchQueue {
        @Generated
        void call_AudioQueueNewInputWithDispatchQueue(AudioQueueRef inAQ,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime,
                int inNumberPacketDescriptions,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueAddPropertyListener {
        @Generated
        void call_AudioQueueAddPropertyListener(VoidPtr arg0, AudioQueueRef arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueRemovePropertyListener {
        @Generated
        void call_AudioQueueRemovePropertyListener(VoidPtr arg0, AudioQueueRef arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueProcessingTapNew {
        @Generated
        void call_AudioQueueProcessingTapNew(VoidPtr arg0, AudioQueueProcessingTapRef arg1, int arg2,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg3, IntPtr arg4,
                IntPtr arg5, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg6);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionInitialize {
        @Generated
        void call_AudioSessionInitialize(VoidPtr arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionAddPropertyListener {
        @Generated
        void call_AudioSessionAddPropertyListener(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionRemovePropertyListenerWithUserData {
        @Generated
        void call_AudioSessionRemovePropertyListenerWithUserData(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioServicesPlayAlertSoundWithCompletion {
        @Generated
        void call_AudioServicesPlayAlertSoundWithCompletion();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioServicesPlaySystemSoundWithCompletion {
        @Generated
        void call_AudioServicesPlaySystemSoundWithCompletion();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioServicesAddSystemSoundCompletion {
        @Generated
        void call_AudioServicesAddSystemSoundCompletion(int arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MusicSequenceSetUserCallback {
        @Generated
        void call_MusicSequenceSetUserCallback(VoidPtr arg0, MusicSequence arg1, MusicTrack arg2, double arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData arg4,
                double arg5, double arg6);
    }

    /**
     * [@function] AudioUnitExtensionSetComponentList
     * <p>
     * Allows the implementor of an audio unit extension to dynamically modify the
     * list of component registrations for the extension.
     * <p>
     * Note that the bundle ID of the process calling this API must prefix (or match)
     * the provided extension identifier.
     *
     * @return An OSStatus result code.
     * @param extensionIdentifier The bundle ID of the audio unit extension.
     * @param audioComponentInfo  An array of dictionaries, one for each component, in the same format as
     *                            described in AudioComponent.h for the Info.plist key "AudioComponents".
     */
    @Generated
    @CFunction
    public static native int AudioUnitExtensionSetComponentList(CFStringRef extensionIdentifier,
            CFArrayRef audioComponentInfo);

    /**
     * [@function] AudioUnitExtensionCopyComponentList
     * <p>
     * Returns the component registrations for a given audio unit extension.
     *
     * @param extensionIdentifier The bundle ID of the audio unit extension.
     * @return An array of dictionaries, one for each component, in the same format as
     *         described in AudioComponent.h for the Info.plist key "AudioComponents".
     *         The caller should release this value when done with it.
     */
    @Generated
    @CFunction
    public static native CFArrayRef AudioUnitExtensionCopyComponentList(CFStringRef extensionIdentifier);

    /**
     * [@function] AudioCodecGetPropertyInfo
     * <p>
     * Retrieve information about the given property. The outSize argument
     * will return the size in bytes of the current value of the property.
     * The outWritable argument will return whether or not the property
     * in question can be changed.
     *
     * @param inCodec      An AudioCodec instance
     * @param inPropertyID Property ID whose value should be read
     * @param outSize      Size in bytes of the property
     * @param outWritable  Flag indicating wether the underlying property can be modified or not
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecGetPropertyInfo(AudioComponentInstance inCodec, int inPropertyID, IntPtr outSize,
            BytePtr outWritable);

    /**
     * [@function] AudioCodecGetProperty
     * <p>
     * Retrieve the indicated property data. On input, ioDataSize has the size
     * of the data pointed to by outPropertyData. On output, ioDataSize will contain
     * the amount written.
     *
     * @param inCodec            An AudioCodec instance
     * @param inPropertyID       Property ID whose value should be read
     * @param ioPropertyDataSize Size in bytes of the property data
     * @param outPropertyData    Pointer to the property data buffer
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecGetProperty(AudioComponentInstance inCodec, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * [@function] AudioCodecSetProperty
     * <p>
     * Set the indicated property data.
     *
     * @param inCodec            An AudioCodec instance
     * @param inPropertyID       Property ID whose value should be changed
     * @param inPropertyDataSize Size in bytes of the property data
     * @param inPropertyData     Pointer to the property data buffer
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecSetProperty(AudioComponentInstance inCodec, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * [@function] AudioCodecInitialize
     * <p>
     * This call will allocate any buffers needed and otherwise set the codec
     * up to perform the indicated translation. If an argument is NULL, any
     * previously set properties will be used for preparing the codec for work.
     * Note that this routine will also validate the format information as useable.
     *
     * @param inCodec               An AudioCodec instance
     * @param inInputFormat         Pointer to an input format structure
     * @param inOutputFormat        Pointer to an output format structure
     * @param inMagicCookie         Pointer to the magic cookie
     * @param inMagicCookieByteSize Size in bytes of the magic cookie
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecInitialize(AudioComponentInstance inCodec,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inInputFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inOutputFormat,
            ConstVoidPtr inMagicCookie, int inMagicCookieByteSize);

    /**
     * [@function] AudioCodecUninitialize
     * <p>
     * This call will move the codec from the initialized state back to the
     * uninitialized state. The codec will release any resources it allocated
     * or claimed in AudioCodecInitialize.
     *
     * @param inCodec An AudioCodec instance
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecUninitialize(AudioComponentInstance inCodec);

    /**
     * [@function] AudioCodecAppendInputData
     * <p>
     * Append as much of the given data in inInputData to the codec's input buffer as possible
     * and return in ioInputDataByteSize the amount of data used.
     * <p>
     * The inPacketDescription argument is an array of AudioStreamPacketDescription
     * structs that describes the packet layout. The number of elements in this array
     * is indicated on input by ioNumberPackets. On return, this number indicates the number
     * of packets consumed.
     * <p>
     * Note also in this case that it is an error to supply less than a full packet
     * of data at a time.
     *
     * @param inCodec             An AudioCodec instance
     * @param inInputData         A const pointer to the input data
     * @param ioInputDataByteSize The size in bytes of the input data in inInputData on input,
     *                            the number of bytes consumed on output
     * @param ioNumberPackets     The number of packets
     * @param inPacketDescription The packet description pointer
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecAppendInputData(AudioComponentInstance inCodec, ConstVoidPtr inInputData,
            IntPtr ioInputDataByteSize, IntPtr ioNumberPackets,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescription);

    /**
     * [@function] AudioCodecProduceOutputPackets
     * <p>
     * Produce as many output packets as requested and the amount of input data
     * allows for. The outStatus argument returns information about the codec's
     * status to allow for proper data management. See the constants above for
     * the possible values that can be returned.
     * <p>
     * The outPacketDescription argument is an array of AudioStreamPacketDescription
     * structs that describes the packet layout returned in outOutputData. This
     * argument is optional. Pass NULL if this information is not to be returned.
     * Note that this information is only provided when the output format isn't
     * linear PCM.
     * <p>
     * Note that decoders will always only produce linear PCM data in multiples of
     * the number frames in a packet of the encoded format (as returned by
     * kAudioCodecPropertyPacketFrameSize). Encoders will consume this many frames
     * of linear PCM data to produce a packet of their format.
     *
     * @param inCodec              The AudioCodec instance
     * @param outOutputData        Pointer to the output data buffer
     * @param ioOutputDataByteSize A pointer to the size
     * @param ioNumberPackets      number of input/output packets
     * @return The OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecProduceOutputPackets(AudioComponentInstance inCodec, VoidPtr outOutputData,
            IntPtr ioOutputDataByteSize, IntPtr ioNumberPackets,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription outPacketDescription,
            IntPtr outStatus);

    @Generated
    @CFunction
    public static native int AudioCodecAppendInputBufferList(AudioComponentInstance inCodec,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inBufferList,
            IntPtr ioNumberPackets,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescription,
            IntPtr outBytesConsumed);

    @Generated
    @CFunction
    public static native int AudioCodecProduceOutputBufferList(AudioComponentInstance inCodec,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioBufferList,
            IntPtr ioNumberPackets,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription outPacketDescription,
            IntPtr outStatus);

    /**
     * [@function] AudioCodecReset
     * <p>
     * Flushes all the data in the codec and clears the input buffer. Note that
     * the formats, and magic cookie will be retained so they won't need to be
     * set up again to decode the same data.
     *
     * @param inCodec The audio codec descriptor
     * @return the OSStatus value
     */
    @Generated
    @CFunction
    public static native int AudioCodecReset(AudioComponentInstance inCodec);

    /**
     * [@function] AudioComponentCopyIcon
     * <p>
     * Fetches an icon representing the component.
     * <p>
     * For a component originating in an app extension, the returned icon will be that of the
     * application containing the extension.
     * <p>
     * For components loaded from bundles, the icon will be that of the bundle.
     * <p>
     * The caller is responsible to release this value when done with it.
     *
     * @param comp The component whose icon data is to be retrieved.
     * @return A retained UIImage object.
     */
    @Generated
    @CFunction
    public static native UIImage AudioComponentCopyIcon(AudioComponent comp);

    /**
     * [@fn] AudioWorkIntervalCreate
     * <p>
     * Create an OS workgroup interval for use with audio realtime threads.
     *
     * @param name  A name for the created work interval.
     * @param clock The clockid in which interval timestamps are specified, e.g. `OS_CLOCK_MACH_ABSOLUTE_TIME`
     *              from <os/clock.h>.
     * @param attr  This field is currently not used and should be NULL.
     * @return A new os_workgroup_interval_t. The client should call `os_workgroup_interval_start()`
     *         and `os_workgroup_interval_finish()` to notify the system of the beginning and ending
     *         of each work duty cycle. The caller is responsible for releasing this object when finished
     *         with it (if not using automatic reference counting).
     */
    @Generated
    @CFunction
    public static native OS_os_workgroup AudioWorkIntervalCreate(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name, int clock,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_attr_opaque_s attr);

    /**
     * [@function] MusicDeviceMIDIEventList
     * <p>
     * Used to send MIDI messages to an audio unit
     * <p>
     * This API is suitable for sending Universal MIDI Packet (UMP) MIDI messages to an audio unit. The message must be
     * a full non-SysEx event, a partial SysEx event, or a complete SysEx event. Running status is not allowed. MIDI 1.0
     * in
     * universal packets (MIDI-1UP) and MIDI 2.0 messages are allowed. All events sent via MusicDeviceMIDIEventList will
     * be delivered to the audio unit in the MIDI protocol returned by kAudioUnitProperty_AudioUnitMIDIProtocol.
     * <p>
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputCallback.
     *
     * @param evtList The MIDIEventList to be sent
     * @return noErr, or an audio unit error code
     * @param inUnit              The audio unit
     * @param inOffsetSampleFrame If you are scheduling the MIDIEventList from the audio unit's render thread, then you
     *                            can supply a
     *                            sample offset that the audio unit may apply within its next audio unit render.
     *                            This allows you to schedule to the sample, the time when a MIDI command is applied and
     *                            is particularly
     *                            important when starting new notes. If you are not scheduling in the audio unit's
     *                            render thread,
     *                            then you should set this value to 0
     *                            <p>
     *                            inOffsetSampleFrame should serve as the base offset for each packet's timestamp i.e.
     *                            sampleOffset = inOffsetSampleFrame + evtList.packet[0].timeStamp
     */
    @Generated
    @CFunction
    public static native int MusicDeviceMIDIEventList(AudioComponentInstance inUnit, int inOffsetSampleFrame,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList evtList);
}
