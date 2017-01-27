/*
 * Java binding for libimobiledevice and libplist.
 * 
 * Copyright 2014-2016 Intel Corporation
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.libplist.c;

import org.libplist.opaque.plist_dict_iter;
import org.libplist.opaque.plist_t;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
    static {
        NatJ.register();
    }

    @Generated
    private Globals() {
    }

    @Generated
    @CFunction
    public static native plist_t plist_new_dict();

    @Generated
    @CFunction
    public static native plist_t plist_new_array();

    @Generated
    @CFunction
    public static native plist_t plist_new_string(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String val);

    @Generated
    @CFunction
    public static native plist_t plist_new_bool(byte val);

    @Generated
    @CFunction
    public static native plist_t plist_new_uint(long val);

    @Generated
    @CFunction
    public static native plist_t plist_new_real(double val);

    @Generated
    @CFunction
    public static native plist_t plist_new_data(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String val, long length);

    @Generated
    @CFunction
    public static native plist_t plist_new_date(int sec, int usec);

    @Generated
    @CFunction
    public static native plist_t plist_new_uid(long val);

    @Generated
    @CFunction
    public static native void plist_free(plist_t plist);

    @Generated
    @CFunction
    public static native plist_t plist_copy(plist_t node);

    @Generated
    @CFunction
    public static native int plist_array_get_size(plist_t node);

    @Generated
    @CFunction
    public static native plist_t plist_array_get_item(plist_t node, int n);

    @Generated
    @CFunction
    public static native int plist_array_get_item_index(plist_t node);

    @Generated
    @CFunction
    public static native void plist_array_set_item(plist_t node, plist_t item, int n);

    @Generated
    @CFunction
    public static native void plist_array_append_item(plist_t node, plist_t item);

    @Generated
    @CFunction
    public static native void plist_array_insert_item(plist_t node, plist_t item, int n);

    @Generated
    @CFunction
    public static native void plist_array_remove_item(plist_t node, int n);

    @Generated
    @CFunction
    public static native int plist_dict_get_size(plist_t node);

    @Generated
    @CFunction
    public static native void plist_dict_new_iter(plist_t node, Ptr<plist_dict_iter> iter);

    @Generated
    @CFunction
    public static native void plist_dict_next_item(plist_t node, plist_dict_iter iter, Ptr<BytePtr> key,
            Ptr<plist_t> val);

    @Generated
    @CFunction
    public static native void plist_dict_get_item_key(plist_t node, Ptr<BytePtr> key);

    @Generated
    @CFunction
    public static native plist_t plist_dict_get_item(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    public static native void plist_dict_set_item(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            plist_t item);

    @Generated
    @Deprecated
    @CFunction
    public static native void plist_dict_insert_item(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            plist_t item);

    @Generated
    @CFunction
    public static native void plist_dict_remove_item(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    public static native void plist_dict_merge(Ptr<plist_t> target, plist_t source);

    @Generated
    @CFunction
    public static native plist_t plist_get_parent(plist_t node);

    @Generated
    @CFunction
    public static native int plist_get_node_type(plist_t node);

    @Generated
    @CFunction
    public static native void plist_get_key_val(plist_t node, Ptr<BytePtr> val);

    @Generated
    @CFunction
    public static native void plist_get_string_val(plist_t node, Ptr<BytePtr> val);

    @Generated
    @CFunction
    public static native void plist_get_bool_val(plist_t node, BytePtr val);

    @Generated
    @CFunction
    public static native void plist_get_uint_val(plist_t node, LongPtr val);

    @Generated
    @CFunction
    public static native void plist_get_real_val(plist_t node, DoublePtr val);

    @Generated
    @CFunction
    public static native void plist_get_data_val(plist_t node, Ptr<BytePtr> val, LongPtr length);

    @Generated
    @CFunction
    public static native void plist_get_date_val(plist_t node, IntPtr sec, IntPtr usec);

    @Generated
    @CFunction
    public static native void plist_get_uid_val(plist_t node, LongPtr val);

    @Generated
    @CFunction
    public static native void plist_set_key_val(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String val);

    @Generated
    @CFunction
    public static native void plist_set_string_val(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String val);

    @Generated
    @CFunction
    public static native void plist_set_bool_val(plist_t node, byte val);

    @Generated
    @CFunction
    public static native void plist_set_uint_val(plist_t node, long val);

    @Generated
    @CFunction
    public static native void plist_set_real_val(plist_t node, double val);

    @Generated
    @CFunction
    public static native void plist_set_data_val(plist_t node,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String val, long length);

    @Generated
    @CFunction
    public static native void plist_set_date_val(plist_t node, int sec, int usec);

    @Generated
    @CFunction
    public static native void plist_set_uid_val(plist_t node, long val);

    @Generated
    @CFunction
    public static native void plist_to_xml(plist_t plist, Ptr<BytePtr> plist_xml, IntPtr length);

    @Generated
    @CFunction
    public static native void plist_to_bin(plist_t plist, Ptr<BytePtr> plist_bin, IntPtr length);

    @Generated
    @CFunction
    public static native void plist_from_xml(ConstBytePtr plist_xml, int length, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native void plist_from_bin(ConstBytePtr plist_bin, int length, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native plist_t plist_access_pathv(plist_t plist, int length, int v);

    @Generated
    @CFunction
    public static native byte plist_compare_node_value(plist_t node_l, plist_t node_r);

    @Generated
    @Variadic()
    @CFunction
    public static native plist_t plist_access_path(plist_t plist, int length, Object... varargs);
}
