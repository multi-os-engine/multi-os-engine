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

package org.moe.document.pbxproj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Util {

    public static <V extends PBXObject> V getFirstConforming(List<PBXObjectRef<V>> array, String key, String value) {
        Iterator<PBXObjectRef<V>> it = array.iterator();
        while (it.hasNext()) {
            V elem = it.next().getReferenced();
            String stringValue = elem.getStringValue(key);
            if (stringValue == null) {
                continue;
            }
            if (stringValue.equals(value)) {
                return elem;
            }
        }
        return null;
    }

    public static <V extends PBXObject> ArrayList<V> getAllConforming(List<PBXObjectRef<V>> array, String key,
            String value) {
        ArrayList<V> all = new ArrayList<V>();
        Iterator<PBXObjectRef<V>> it = array.iterator();
        while (it.hasNext()) {
            V elem = it.next().getReferenced();
            String stringValue = elem.getStringValue(key);
            if (stringValue == null) {
                continue;
            }
            if (stringValue.equals(value)) {
                all.add(elem);
            }
        }
        return all;
    }

    @SuppressWarnings("unchecked")
    public static <U extends PBXObject, V extends PBXObject> V getFirstConformingISA(List<PBXObjectRef<U>> array,
            Class<V> cls) {
        Iterator<PBXObjectRef<U>> it = array.iterator();
        String value = cls.getSimpleName();
        while (it.hasNext()) {
            U elem = it.next().getReferenced();
            String stringValue = elem.getStringValue(PBXObject.ISA_KEY);
            if (stringValue == null) {
                continue;
            }
            if (stringValue.equals(value)) {
                return (V)elem;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <U extends PBXObject, V extends PBXObject> ArrayList<V> getAllConformingISA(
            List<PBXObjectRef<U>> array, Class<V> cls) {
        ArrayList<V> all = new ArrayList<V>();
        Iterator<PBXObjectRef<U>> it = array.iterator();
        String value = cls.getSimpleName();
        while (it.hasNext()) {
            U elem = it.next().getReferenced();
            String stringValue = elem.getStringValue(PBXObject.ISA_KEY);
            if (stringValue == null) {
                continue;
            }
            if (stringValue.equals(value)) {
                all.add((V)elem);
            }
        }
        return all;
    }

}
