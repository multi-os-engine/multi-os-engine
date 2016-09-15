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

package apple.audiounit.struct;

import apple.coreaudio.struct.AudioBufferList;
import apple.coreaudio.struct.AudioTimeStamp;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class AURenderCallbackStruct extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AURenderCallbackStruct() {
        super(AURenderCallbackStruct.class);
    }

    @Generated
    protected AURenderCallbackStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    public AURenderCallbackStruct(@FunctionPtr(name = "call_inputProc") Function_inputProc inputProc,
            VoidPtr inputProcRefCon) {
        super(AURenderCallbackStruct.class);
        setInputProc(inputProc);
        setInputProcRefCon(inputProcRefCon);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInputProc(@FunctionPtr(name = "call_inputProc") Function_inputProc value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_inputProc {
        @Generated
        int call_inputProc(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr inputProcRefCon();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInputProcRefCon(VoidPtr value);

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_inputProc")
    public native Function_inputProc inputProc();
}
