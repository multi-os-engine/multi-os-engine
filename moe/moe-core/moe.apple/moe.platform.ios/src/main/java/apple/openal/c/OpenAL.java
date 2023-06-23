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

package apple.openal.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("OpenAL")
@Runtime(CRuntime.class)
public final class OpenAL {
    static {
        NatJ.register();
    }

    @Generated
    private OpenAL() {
    }

    /**
     * Renderer State management
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alEnable(int capability);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDisable(int capability);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alIsEnabled(int capability);

    /**
     * State retrieval
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String alGetString(int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBooleanv(int param, BytePtr data);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetIntegerv(int param, IntPtr data);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetFloatv(int param, FloatPtr data);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetDoublev(int param, DoublePtr data);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alGetBoolean(int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int alGetInteger(int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native float alGetFloat(int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native double alGetDouble(int param);

    /**
     * Error support.
     * Obtain the most recent error generated in the AL state machine.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int alGetError();

    /**
     * Extension support.
     * Query for the presence of an extension, and obtain any appropriate
     * function pointers and enum values.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alIsExtensionPresent(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String extname);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alGetProcAddress(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fname);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int alGetEnumValue(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ename);

    /**
     * Set Listener parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListenerf(int param, float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListener3f(int param, float value1, float value2, float value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListenerfv(int param, ConstFloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListeneri(int param, int value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListener3i(int param, int value1, int value2, int value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alListeneriv(int param, ConstIntPtr values);

    /**
     * Get Listener parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListenerf(int param, FloatPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListener3f(int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListenerfv(int param, FloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListeneri(int param, IntPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListener3i(int param, IntPtr value1, IntPtr value2, IntPtr value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetListeneriv(int param, IntPtr values);

    /**
     * Create Source objects
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGenSources(int n, IntPtr sources);

    /**
     * Delete Source objects
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDeleteSources(int n, ConstIntPtr sources);

    /**
     * Verify a handle is a valid Source
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alIsSource(int sid);

    /**
     * Set Source parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcef(int sid, int param, float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSource3f(int sid, int param, float value1, float value2, float value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcefv(int sid, int param, ConstFloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcei(int sid, int param, int value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSource3i(int sid, int param, int value1, int value2, int value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceiv(int sid, int param, ConstIntPtr values);

    /**
     * Get Source parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSourcef(int sid, int param, FloatPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSource3f(int sid, int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSourcefv(int sid, int param, FloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSourcei(int sid, int param, IntPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSource3i(int sid, int param, IntPtr value1, IntPtr value2, IntPtr value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetSourceiv(int sid, int param, IntPtr values);

    /**
     * Play, replay, or resume (if paused) a list of Sources
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcePlayv(int ns, ConstIntPtr sids);

    /**
     * Stop a list of Sources
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceStopv(int ns, ConstIntPtr sids);

    /**
     * Rewind a list of Sources
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceRewindv(int ns, ConstIntPtr sids);

    /**
     * Pause a list of Sources
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcePausev(int ns, ConstIntPtr sids);

    /**
     * Play, replay, or resume a Source
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcePlay(int sid);

    /**
     * Stop a Source
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceStop(int sid);

    /**
     * Rewind a Source (set playback postiton to beginning)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceRewind(int sid);

    /**
     * Pause a Source
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourcePause(int sid);

    /**
     * Source Queuing
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceQueueBuffers(int sid, int numEntries, ConstIntPtr bids);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSourceUnqueueBuffers(int sid, int numEntries, IntPtr bids);

    /**
     * Create Buffer objects
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGenBuffers(int n, IntPtr buffers);

    /**
     * Delete Buffer objects
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDeleteBuffers(int n, ConstIntPtr buffers);

    /**
     * Verify a handle is a valid Buffer
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alIsBuffer(int bid);

    /**
     * Specify the data to be copied into a buffer
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBufferData(int bid, int format, ConstVoidPtr data, int size, int freq);

    /**
     * Set Buffer parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBufferf(int bid, int param, float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBuffer3f(int bid, int param, float value1, float value2, float value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBufferfv(int bid, int param, ConstFloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBufferi(int bid, int param, int value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBuffer3i(int bid, int param, int value1, int value2, int value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alBufferiv(int bid, int param, ConstIntPtr values);

    /**
     * Get Buffer parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBufferf(int bid, int param, FloatPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBuffer3f(int bid, int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBufferfv(int bid, int param, FloatPtr values);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBufferi(int bid, int param, IntPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alGetBuffer3i(int bid, int param, IntPtr value1, IntPtr value2, IntPtr value3);

    @Generated
    @CFunction
    public static native void alGetBufferiv(int bid, int param, IntPtr values);

    /**
     * Global Parameters
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDopplerFactor(float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDopplerVelocity(float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alSpeedOfSound(float value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alDistanceModel(int distanceModel);

    /**
     * Context Management
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcCreateContext(VoidPtr device, ConstIntPtr attrlist);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alcMakeContextCurrent(VoidPtr context);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcProcessContext(VoidPtr context);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcSuspendContext(VoidPtr context);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcDestroyContext(VoidPtr context);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcGetCurrentContext();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcGetContextsDevice(VoidPtr context);

    /**
     * Device Management
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcOpenDevice(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String devicename);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alcCloseDevice(VoidPtr device);

    /**
     * Error support.
     * Obtain the most recent Context error
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int alcGetError(VoidPtr device);

    /**
     * Extension support.
     * Query for the presence of an extension, and obtain any appropriate
     * function pointers and enum values.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alcIsExtensionPresent(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String extname);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcGetProcAddress(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String funcname);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int alcGetEnumValue(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String enumname);

    /**
     * Query functions
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String alcGetString(VoidPtr device, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcGetIntegerv(VoidPtr device, int param, int size, IntPtr data);

    /**
     * Capture functions
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr alcCaptureOpenDevice(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String devicename,
            int frequency, int format, int buffersize);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte alcCaptureCloseDevice(VoidPtr device);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcCaptureStart(VoidPtr device);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcCaptureStop(VoidPtr device);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: OpenAL is deprecated in favor of AVAudioEngine
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void alcCaptureSamples(VoidPtr device, VoidPtr buffer, int samples);

    @Generated public static final double AL_NONE = 0.0;
    @Generated public static final double AL_FALSE = 0.0;
    @Generated public static final double AL_TRUE = 1.0;
    @Generated public static final double AL_SOURCE_RELATIVE = 514.0;
    @Generated public static final double AL_CONE_INNER_ANGLE = 4097.0;
    @Generated public static final double AL_CONE_OUTER_ANGLE = 4098.0;
    @Generated public static final double AL_PITCH = 4099.0;
    @Generated public static final double AL_POSITION = 4100.0;
    @Generated public static final double AL_DIRECTION = 4101.0;
    @Generated public static final double AL_VELOCITY = 4102.0;
    @Generated public static final double AL_LOOPING = 4103.0;
    @Generated public static final double AL_BUFFER = 4105.0;
    @Generated public static final double AL_GAIN = 4106.0;
    @Generated public static final double AL_MIN_GAIN = 4109.0;
    @Generated public static final double AL_MAX_GAIN = 4110.0;
    @Generated public static final double AL_ORIENTATION = 4111.0;
    @Generated public static final double AL_SOURCE_STATE = 4112.0;
    @Generated public static final double AL_INITIAL = 4113.0;
    @Generated public static final double AL_PLAYING = 4114.0;
    @Generated public static final double AL_PAUSED = 4115.0;
    @Generated public static final double AL_STOPPED = 4116.0;
    @Generated public static final double AL_BUFFERS_QUEUED = 4117.0;
    @Generated public static final double AL_BUFFERS_PROCESSED = 4118.0;
    @Generated public static final double AL_SEC_OFFSET = 4132.0;
    @Generated public static final double AL_SAMPLE_OFFSET = 4133.0;
    @Generated public static final double AL_BYTE_OFFSET = 4134.0;
    @Generated public static final double AL_SOURCE_TYPE = 4135.0;
    @Generated public static final double AL_STATIC = 4136.0;
    @Generated public static final double AL_STREAMING = 4137.0;
    @Generated public static final double AL_UNDETERMINED = 4144.0;
    @Generated public static final double AL_FORMAT_MONO8 = 4352.0;
    @Generated public static final double AL_FORMAT_MONO16 = 4353.0;
    @Generated public static final double AL_FORMAT_STEREO8 = 4354.0;
    @Generated public static final double AL_FORMAT_STEREO16 = 4355.0;
    @Generated public static final double AL_REFERENCE_DISTANCE = 4128.0;
    @Generated public static final double AL_ROLLOFF_FACTOR = 4129.0;
    @Generated public static final double AL_CONE_OUTER_GAIN = 4130.0;
    @Generated public static final double AL_MAX_DISTANCE = 4131.0;
    @Generated public static final double AL_FREQUENCY = 8193.0;
    @Generated public static final double AL_BITS = 8194.0;
    @Generated public static final double AL_CHANNELS = 8195.0;
    @Generated public static final double AL_SIZE = 8196.0;
    @Generated public static final double AL_UNUSED = 8208.0;
    @Generated public static final double AL_PENDING = 8209.0;
    @Generated public static final double AL_PROCESSED = 8210.0;
    @Generated public static final double AL_INVALID_NAME = 40961.0;
    @Generated public static final double AL_INVALID_ENUM = 40962.0;
    @Generated public static final double AL_INVALID_VALUE = 40963.0;
    @Generated public static final double AL_INVALID_OPERATION = 40964.0;
    @Generated public static final double AL_OUT_OF_MEMORY = 40965.0;
    @Generated public static final double AL_VENDOR = 45057.0;
    @Generated public static final double AL_VERSION = 45058.0;
    @Generated public static final double AL_RENDERER = 45059.0;
    @Generated public static final double AL_EXTENSIONS = 45060.0;
    @Generated public static final double AL_DOPPLER_FACTOR = 49152.0;
    @Generated public static final double AL_DOPPLER_VELOCITY = 49153.0;
    @Generated public static final double AL_SPEED_OF_SOUND = 49155.0;
    @Generated public static final double AL_DISTANCE_MODEL = 53248.0;
    @Generated public static final double AL_INVERSE_DISTANCE = 53249.0;
    @Generated public static final double AL_INVERSE_DISTANCE_CLAMPED = 53250.0;
    @Generated public static final double AL_LINEAR_DISTANCE = 53251.0;
    @Generated public static final double AL_LINEAR_DISTANCE_CLAMPED = 53252.0;
    @Generated public static final double AL_EXPONENT_DISTANCE = 53253.0;
    @Generated public static final double AL_EXPONENT_DISTANCE_CLAMPED = 53254.0;
    @Generated public static final double ALC_INVALID = 0.0;
    @Generated public static final double ALC_VERSION_0_1 = 1.0;
    @Generated public static final double ALC_FALSE = 0.0;
    @Generated public static final double ALC_TRUE = 1.0;
    @Generated public static final double ALC_FREQUENCY = 4103.0;
    @Generated public static final double ALC_REFRESH = 4104.0;
    @Generated public static final double ALC_SYNC = 4105.0;
    @Generated public static final double ALC_MONO_SOURCES = 4112.0;
    @Generated public static final double ALC_STEREO_SOURCES = 4113.0;
    @Generated public static final double ALC_INVALID_DEVICE = 40961.0;
    @Generated public static final double ALC_INVALID_CONTEXT = 40962.0;
    @Generated public static final double ALC_INVALID_ENUM = 40963.0;
    @Generated public static final double ALC_INVALID_VALUE = 40964.0;
    @Generated public static final double ALC_OUT_OF_MEMORY = 40965.0;
    @Generated public static final double ALC_DEFAULT_DEVICE_SPECIFIER = 4100.0;
    @Generated public static final double ALC_DEVICE_SPECIFIER = 4101.0;
    @Generated public static final double ALC_EXTENSIONS = 4102.0;
    @Generated public static final double ALC_MAJOR_VERSION = 4096.0;
    @Generated public static final double ALC_MINOR_VERSION = 4097.0;
    @Generated public static final double ALC_ATTRIBUTES_SIZE = 4098.0;
    @Generated public static final double ALC_ALL_ATTRIBUTES = 4099.0;
    @Generated public static final double ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 4114.0;
    @Generated public static final double ALC_ALL_DEVICES_SPECIFIER = 4115.0;
    @Generated public static final double ALC_CAPTURE_DEVICE_SPECIFIER = 784.0;
    @Generated public static final double ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 785.0;
    @Generated public static final double ALC_CAPTURE_SAMPLES = 786.0;
    @Generated public static final double AL_QUEUE_HAS_LOOPED = 36864.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_SmallRoom = 0.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_MediumRoom = 1.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_LargeRoom = 2.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_MediumHall = 3.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_LargeHall = 4.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_Plate = 5.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_MediumChamber = 6.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_LargeChamber = 7.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_Cathedral = 8.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_LargeRoom2 = 9.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_MediumHall2 = 10.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_MediumHall3 = 11.0;
    @Generated public static final double ALC_ASA_REVERB_ROOM_TYPE_LargeHall2 = 12.0;
}
