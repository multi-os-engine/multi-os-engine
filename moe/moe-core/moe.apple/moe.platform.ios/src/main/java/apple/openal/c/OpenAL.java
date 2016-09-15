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

    @Generated
    @CFunction
    public static native void alEnable(int capability);

    @Generated
    @CFunction
    public static native void alDisable(int capability);

    @Generated
    @CFunction
    public static native byte alIsEnabled(int capability);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String alGetString(int param);

    @Generated
    @CFunction
    public static native void alGetBooleanv(int param, BytePtr data);

    @Generated
    @CFunction
    public static native void alGetIntegerv(int param, IntPtr data);

    @Generated
    @CFunction
    public static native void alGetFloatv(int param, FloatPtr data);

    @Generated
    @CFunction
    public static native void alGetDoublev(int param, DoublePtr data);

    @Generated
    @CFunction
    public static native byte alGetBoolean(int param);

    @Generated
    @CFunction
    public static native int alGetInteger(int param);

    @Generated
    @CFunction
    public static native float alGetFloat(int param);

    @Generated
    @CFunction
    public static native double alGetDouble(int param);

    @Generated
    @CFunction
    public static native int alGetError();

    @Generated
    @CFunction
    public static native byte alIsExtensionPresent(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String extname);

    @Generated
    @CFunction
    public static native VoidPtr alGetProcAddress(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fname);

    @Generated
    @CFunction
    public static native int alGetEnumValue(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ename);

    @Generated
    @CFunction
    public static native void alListenerf(int param, float value);

    @Generated
    @CFunction
    public static native void alListener3f(int param, float value1, float value2, float value3);

    @Generated
    @CFunction
    public static native void alListenerfv(int param, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void alListeneri(int param, int value);

    @Generated
    @CFunction
    public static native void alListener3i(int param, int value1, int value2, int value3);

    @Generated
    @CFunction
    public static native void alListeneriv(int param, ConstIntPtr values);

    @Generated
    @CFunction
    public static native void alGetListenerf(int param, FloatPtr value);

    @Generated
    @CFunction
    public static native void alGetListener3f(int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    @Generated
    @CFunction
    public static native void alGetListenerfv(int param, FloatPtr values);

    @Generated
    @CFunction
    public static native void alGetListeneri(int param, IntPtr value);

    @Generated
    @CFunction
    public static native void alGetListener3i(int param, IntPtr value1, IntPtr value2, IntPtr value3);

    @Generated
    @CFunction
    public static native void alGetListeneriv(int param, IntPtr values);

    @Generated
    @CFunction
    public static native void alGenSources(int n, IntPtr sources);

    @Generated
    @CFunction
    public static native void alDeleteSources(int n, ConstIntPtr sources);

    @Generated
    @CFunction
    public static native byte alIsSource(int sid);

    @Generated
    @CFunction
    public static native void alSourcef(int sid, int param, float value);

    @Generated
    @CFunction
    public static native void alSource3f(int sid, int param, float value1, float value2, float value3);

    @Generated
    @CFunction
    public static native void alSourcefv(int sid, int param, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void alSourcei(int sid, int param, int value);

    @Generated
    @CFunction
    public static native void alSource3i(int sid, int param, int value1, int value2, int value3);

    @Generated
    @CFunction
    public static native void alSourceiv(int sid, int param, ConstIntPtr values);

    @Generated
    @CFunction
    public static native void alGetSourcef(int sid, int param, FloatPtr value);

    @Generated
    @CFunction
    public static native void alGetSource3f(int sid, int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    @Generated
    @CFunction
    public static native void alGetSourcefv(int sid, int param, FloatPtr values);

    @Generated
    @CFunction
    public static native void alGetSourcei(int sid, int param, IntPtr value);

    @Generated
    @CFunction
    public static native void alGetSource3i(int sid, int param, IntPtr value1, IntPtr value2, IntPtr value3);

    @Generated
    @CFunction
    public static native void alGetSourceiv(int sid, int param, IntPtr values);

    @Generated
    @CFunction
    public static native void alSourcePlayv(int ns, ConstIntPtr sids);

    @Generated
    @CFunction
    public static native void alSourceStopv(int ns, ConstIntPtr sids);

    @Generated
    @CFunction
    public static native void alSourceRewindv(int ns, ConstIntPtr sids);

    @Generated
    @CFunction
    public static native void alSourcePausev(int ns, ConstIntPtr sids);

    @Generated
    @CFunction
    public static native void alSourcePlay(int sid);

    @Generated
    @CFunction
    public static native void alSourceStop(int sid);

    @Generated
    @CFunction
    public static native void alSourceRewind(int sid);

    @Generated
    @CFunction
    public static native void alSourcePause(int sid);

    @Generated
    @CFunction
    public static native void alSourceQueueBuffers(int sid, int numEntries, ConstIntPtr bids);

    @Generated
    @CFunction
    public static native void alSourceUnqueueBuffers(int sid, int numEntries, IntPtr bids);

    @Generated
    @CFunction
    public static native void alGenBuffers(int n, IntPtr buffers);

    @Generated
    @CFunction
    public static native void alDeleteBuffers(int n, ConstIntPtr buffers);

    @Generated
    @CFunction
    public static native byte alIsBuffer(int bid);

    @Generated
    @CFunction
    public static native void alBufferData(int bid, int format, ConstVoidPtr data, int size, int freq);

    @Generated
    @CFunction
    public static native void alBufferf(int bid, int param, float value);

    @Generated
    @CFunction
    public static native void alBuffer3f(int bid, int param, float value1, float value2, float value3);

    @Generated
    @CFunction
    public static native void alBufferfv(int bid, int param, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void alBufferi(int bid, int param, int value);

    @Generated
    @CFunction
    public static native void alBuffer3i(int bid, int param, int value1, int value2, int value3);

    @Generated
    @CFunction
    public static native void alBufferiv(int bid, int param, ConstIntPtr values);

    @Generated
    @CFunction
    public static native void alGetBufferf(int bid, int param, FloatPtr value);

    @Generated
    @CFunction
    public static native void alGetBuffer3f(int bid, int param, FloatPtr value1, FloatPtr value2, FloatPtr value3);

    @Generated
    @CFunction
    public static native void alGetBufferfv(int bid, int param, FloatPtr values);

    @Generated
    @CFunction
    public static native void alGetBufferi(int bid, int param, IntPtr value);

    @Generated
    @CFunction
    public static native void alGetBuffer3i(int bid, int param, IntPtr value1, IntPtr value2, IntPtr value3);

    @Generated
    @CFunction
    public static native void alGetBufferiv(int bid, int param, IntPtr values);

    @Generated
    @CFunction
    public static native void alDopplerFactor(float value);

    @Generated
    @CFunction
    public static native void alDopplerVelocity(float value);

    @Generated
    @CFunction
    public static native void alSpeedOfSound(float value);

    @Generated
    @CFunction
    public static native void alDistanceModel(int distanceModel);

    @Generated
    @CFunction
    public static native VoidPtr alcCreateContext(VoidPtr device, ConstIntPtr attrlist);

    @Generated
    @CFunction
    public static native byte alcMakeContextCurrent(VoidPtr context);

    @Generated
    @CFunction
    public static native void alcProcessContext(VoidPtr context);

    @Generated
    @CFunction
    public static native void alcSuspendContext(VoidPtr context);

    @Generated
    @CFunction
    public static native void alcDestroyContext(VoidPtr context);

    @Generated
    @CFunction
    public static native VoidPtr alcGetCurrentContext();

    @Generated
    @CFunction
    public static native VoidPtr alcGetContextsDevice(VoidPtr context);

    @Generated
    @CFunction
    public static native VoidPtr alcOpenDevice(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String devicename);

    @Generated
    @CFunction
    public static native byte alcCloseDevice(VoidPtr device);

    @Generated
    @CFunction
    public static native int alcGetError(VoidPtr device);

    @Generated
    @CFunction
    public static native byte alcIsExtensionPresent(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String extname);

    @Generated
    @CFunction
    public static native VoidPtr alcGetProcAddress(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String funcname);

    @Generated
    @CFunction
    public static native int alcGetEnumValue(VoidPtr device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String enumname);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String alcGetString(VoidPtr device, int param);

    @Generated
    @CFunction
    public static native void alcGetIntegerv(VoidPtr device, int param, int size, IntPtr data);

    @Generated
    @CFunction
    public static native VoidPtr alcCaptureOpenDevice(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String devicename,
            int frequency, int format, int buffersize);

    @Generated
    @CFunction
    public static native byte alcCaptureCloseDevice(VoidPtr device);

    @Generated
    @CFunction
    public static native void alcCaptureStart(VoidPtr device);

    @Generated
    @CFunction
    public static native void alcCaptureStop(VoidPtr device);

    @Generated
    @CFunction
    public static native void alcCaptureSamples(VoidPtr device, VoidPtr buffer, int samples);
}
