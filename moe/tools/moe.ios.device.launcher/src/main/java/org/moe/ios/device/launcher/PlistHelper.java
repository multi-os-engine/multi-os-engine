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

package org.moe.ios.device.launcher;

import org.libplist.enums.plist_type;
import org.libplist.opaque.plist_dict_iter;
import org.libplist.opaque.plist_t;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import static org.libplist.c.Globals.*;

/**
 * Plist helper.
 */
public class PlistHelper {

    /**
     * Creates a new PlistHelper instance.
     */
    private PlistHelper() {

    }

    /**
     * Returns a plist node's Java value.
     *
     * @param node plist node
     * @return Java equivalent
     */
    public static Object getObject(plist_t node) {
        if (node == null) {
            return null;
        }
        switch (plist_get_node_type(node)) {
        case plist_type.PLIST_STRING: {
            @SuppressWarnings("unchecked") Ptr<BytePtr> ptr = (Ptr<BytePtr>)PtrFactory
                    .newPointerPtr(Byte.class, 2, 1, true, false);
            plist_get_string_val(node, ptr);
            return ptr.get().toUTF8String();
        }

        case plist_type.PLIST_ARRAY: {
            return getArray(node);
        }

        case plist_type.PLIST_DICT: {
            return getDict(node);
        }

        case plist_type.PLIST_BOOLEAN: {
            BytePtr ptr = PtrFactory.newByteReference();
            plist_get_bool_val(node, ptr);
            return ptr.get() > 0 ? Boolean.TRUE : Boolean.FALSE;
        }

        case plist_type.PLIST_UINT: {
            LongPtr ptr = PtrFactory.newLongReference();
            plist_get_uint_val(node, ptr);
            return ptr.get();
        }

        case plist_type.PLIST_REAL: {
            DoublePtr ptr = PtrFactory.newDoubleReference();
            plist_get_real_val(node, ptr);
            return ptr.get();
        }

        case plist_type.PLIST_DATE: {
            IntPtr sec = PtrFactory.newIntReference();
            IntPtr usec = PtrFactory.newIntReference();
            plist_get_date_val(node, sec, usec);
            return new Date((long)sec.getValue() * 1000L + (long)usec.getValue() / 1000L);
        }

        case plist_type.PLIST_DATA: {
            @SuppressWarnings("unchecked") Ptr<BytePtr> val = (Ptr<BytePtr>)PtrFactory
                    .newPointerPtr(Byte.class, 2, 1, true, false);
            LongPtr length = PtrFactory.newLongReference();
            plist_get_data_val(node, val, length);
            return length.getValue() == 0 ? new byte[0] : val.get().toByteArray((int)length.getValue());
        }
        case plist_type.PLIST_KEY: {
            @SuppressWarnings("unchecked") Ptr<BytePtr> ptr = (Ptr<BytePtr>)PtrFactory
                    .newPointerPtr(Byte.class, 2, 1, true, false);
            plist_get_key_val(node, ptr);
            return ptr.get().toUTF8String();
        }

        default:
            return null;
        }
    }

    /**
     * Returns a plist array type node's Java equivalent.
     *
     * @param node plist array type node
     * @return Java equivalent
     */
    public static ArrayList<Object> getArray(plist_t node) {
        if (node == null) {
            return null;
        }

        int size = plist_array_get_size(node);
        ArrayList<Object> array = new ArrayList<Object>(size);

        // Iterate
        for (int i = 0; i < size; ++i) {
            Object o = getObject(plist_array_get_item(node, i));
            array.add(i, o);
        }

        return array;
    }

    /**
     * Returns a plist dictionary type node's Java equivalent.
     *
     * @param node plist dictionary type node
     * @return Java equivalent
     */
    public static HashMap<String, Object> getDict(plist_t node) {
        if (node == null) {
            return null;
        }

        HashMap<String, Object> map = new HashMap<String, Object>(plist_dict_get_size(node));

        // Get iterator
        Ptr<plist_dict_iter> iter_ptr = PtrFactory.newOpaquePtrReference(plist_dict_iter.class);
        plist_dict_new_iter(node, iter_ptr);

        // Create pointers for 'next' items
        @SuppressWarnings("unchecked") Ptr<BytePtr> key_ = (Ptr<BytePtr>)PtrFactory
                .newPointerPtr(Byte.class, 2, 1, true, false);
        Ptr<plist_t> val_ = PtrFactory.newOpaquePtrReference(plist_t.class);

        // Iterate
        plist_dict_iter iter = iter_ptr.get();
        plist_dict_next_item(node, iter, key_, val_);
        while (val_.get() != null) {
            String key = key_.get().toUTF8String();
            Object value = getObject(val_.get());
            map.put(key, value);
            plist_dict_next_item(node, iter, key_, val_);
        }

        return map;
    }

    /**
     * Returns all the keys in a plist dictionary type node.
     *
     * @param node plist dictionary type node
     * @return Java keys in the node
     */
    public static ArrayList<String> getDictKeys(plist_t node) {
        ArrayList<String> keys = new ArrayList<String>();

        // Get iterator
        Ptr<plist_dict_iter> iter_ptr = PtrFactory.newOpaquePtrReference(plist_dict_iter.class);
        plist_dict_new_iter(node, iter_ptr);

        // Create pointers for 'next' items
        @SuppressWarnings("unchecked") Ptr<BytePtr> key_ = (Ptr<BytePtr>)PtrFactory
                .newPointerPtr(Byte.class, 2, 1, true, false);
        Ptr<plist_t> val_ = PtrFactory.newOpaquePtrReference(plist_t.class);

        // Iterate
        plist_dict_iter iter = iter_ptr.get();
        plist_dict_next_item(node, iter, key_, val_);
        while (val_.get() != null) {
            keys.add(key_.get().toUTF8String());
            plist_dict_next_item(node, iter, key_, val_);
        }

        return keys;
    }

    /**
     * Reads a plist from a file.
     *
     * @param file file to read
     * @return Read plist
     */
    public static HashMap<String, Object> readFromFile(File file) {
        if (file == null || !file.exists()) {
            return null;
        }

        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        } catch (IOException e) {
            return null;
        }
        BytePtr bytePtr = PtrFactory.newByteArray(bytes);
        Ptr<plist_t> pPtr = PtrFactory.newOpaquePtrReference(plist_t.class);

        plist_from_bin(bytePtr, bytes.length, pPtr);
        if (pPtr.get() == null) {
            plist_from_xml(bytePtr, bytes.length, pPtr);
        }
        if (pPtr.get() == null) {
            return null;
        }

        HashMap<String, Object> dict = getDict(pPtr.get());
        plist_free(pPtr.get());
        return dict;
    }
}
