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

package apple.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class FILE extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public FILE() {
        super(FILE.class);
    }

    @Generated
    protected FILE(Pointer peer) {
        super(peer);
    }

    /**
     * current position in (some) buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr _p();

    /**
     * current position in (some) buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set_p(BytePtr value);

    /**
     * read space left for getc()
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int _r();

    /**
     * read space left for getc()
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set_r(int value);

    /**
     * write space left for putc()
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int _w();

    /**
     * write space left for putc()
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set_w(int value);

    /**
     * flags, below; this FILE is free if 0
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native short _flags();

    /**
     * flags, below; this FILE is free if 0
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set_flags(short value);

    /**
     * fileno, if Unix descriptor, else -1
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native short _file();

    /**
     * fileno, if Unix descriptor, else -1
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void set_file(short value);

    /**
     * the buffer (at least 1 byte, if !NULL)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native __sbuf _bf();

    /**
     * the buffer (at least 1 byte, if !NULL)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void set_bf(@ByValue __sbuf value);

    /**
     * 0 or -_bf._size, for inline putc
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int _lbfsize();

    /**
     * 0 or -_bf._size, for inline putc
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void set_lbfsize(int value);

    /**
     * cookie passed to io functions
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native VoidPtr _cookie();

    /**
     * cookie passed to io functions
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void set_cookie(VoidPtr value);

    @Nullable
    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call__close")
    public native Function__close _close();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void set_close(@Nullable @FunctionPtr(name = "call__close") Function__close value);

    @Nullable
    @Generated
    @StructureField(order = 9, isGetter = true)
    @FunctionPtr(name = "call__read")
    public native Function__read _read();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void set_read(@Nullable @FunctionPtr(name = "call__read") Function__read value);

    @Nullable
    @Generated
    @StructureField(order = 10, isGetter = true)
    @FunctionPtr(name = "call__seek")
    public native Function__seek _seek();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void set_seek(@Nullable @FunctionPtr(name = "call__seek") Function__seek value);

    @Nullable
    @Generated
    @StructureField(order = 11, isGetter = true)
    @FunctionPtr(name = "call__write")
    public native Function__write _write();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void set_write(@Nullable @FunctionPtr(name = "call__write") Function__write value);

    /**
     * ungetc buffer
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    @ByValue
    public native __sbuf _ub();

    /**
     * ungetc buffer
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void set_ub(@ByValue __sbuf value);

    /**
     * additions to FILE to not break ABI
     */
    @Generated
    @StructureField(order = 13, isGetter = true)
    public native VoidPtr _extra();

    /**
     * additions to FILE to not break ABI
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void set_extra(VoidPtr value);

    /**
     * saved _r when _r is counting ungetc data
     */
    @Generated
    @StructureField(order = 14, isGetter = true)
    public native int _ur();

    /**
     * saved _r when _r is counting ungetc data
     */
    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void set_ur(int value);

    /**
     * guarantee an ungetc() buffer
     */
    @Generated
    @StructureField(order = 15, isGetter = true, count = 3)
    public native byte _ubuf(int field_idx);

    /**
     * guarantee an ungetc() buffer
     */
    @Generated
    @StructureField(order = 15, isGetter = false, count = 3)
    public native void set_ubuf(byte value, int field_idx);

    /**
     * guarantee a getc() buffer
     */
    @Generated
    @StructureField(order = 16, isGetter = true)
    public native byte _nbuf();

    /**
     * guarantee a getc() buffer
     */
    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void set_nbuf(byte value);

    /**
     * buffer for fgetln()
     */
    @Generated
    @StructureField(order = 17, isGetter = true)
    @ByValue
    public native __sbuf _lb();

    /**
     * buffer for fgetln()
     */
    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void set_lb(@ByValue __sbuf value);

    /**
     * stat.st_blksize (may be != _bf._size)
     */
    @Generated
    @StructureField(order = 18, isGetter = true)
    public native int _blksize();

    /**
     * stat.st_blksize (may be != _bf._size)
     */
    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void set_blksize(int value);

    /**
     * current lseek offset (see WARNING)
     */
    @Generated
    @StructureField(order = 19, isGetter = true)
    public native long _offset();

    /**
     * current lseek offset (see WARNING)
     */
    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void set_offset(long value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__close {
        @Generated
        int call__close(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__read {
        @Generated
        int call__read(VoidPtr arg0, BytePtr arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__seek {
        @Generated
        long call__seek(VoidPtr arg0, long arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__write {
        @Generated
        int call__write(VoidPtr arg0,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
                int arg2);
    }
}
