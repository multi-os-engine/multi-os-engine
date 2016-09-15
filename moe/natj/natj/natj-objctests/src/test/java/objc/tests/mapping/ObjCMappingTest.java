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

package objc.tests.mapping;

import apple.foundation.NSMutableArray;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSMutableSet;
import objc.binding.MappingClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ObjCMappingTest {

    @Test
    public void test_listMapping() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("melon");

        NSMutableArray narray = NSMutableArray.alloc().initWithCapacity(list.size());
        for (String str : list) {
            narray.add(str);
        }

        String old = MappingClass.testListMapping(list, narray, 1);
        Assert.assertEquals(old, "pear");
        Assert.assertEquals(list.get(1), "!pear!");
    }

    @Test
    public void test_mapMapping() {
        HashMap<String, String> map = new HashMap<>();
        map.put("first", "apple");
        map.put("second", "pear");
        map.put("third", "melon");

        NSMutableDictionary ndict = NSMutableDictionary.alloc().initWithCapacity(map.size());
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            ndict.setObjectForKey(entry.getValue(), entry.getKey());
        }

        String old = MappingClass.testMapMapping(map, ndict, "second");
        Assert.assertEquals(old, "pear");
        Assert.assertEquals(map.get("second"), "!pear!");
    }

    @Test
    public void test_setMapping() {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("pear");
        set.add("melon");

        NSMutableSet nset = NSMutableSet.alloc().initWithCapacity(set.size());
        for (String str : set) {
            nset.addObject(str);
        }

        String old = MappingClass.testSetMapping(set, nset, "pear");
        Assert.assertEquals(old, "pear");
        Assert.assertFalse(set.contains("pear"));
        Assert.assertTrue(set.contains("!pear!"));
    }

    @Test
    public void test_iteratorMapping() {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("pear");
        set.add("melon");

        long count = MappingClass.testIteratorMapping(set.iterator());
        Assert.assertEquals(count, 3 + "apple".length() + "pear".length() + "melon".length());
    }

}
