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

package objc.binding;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSSet;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class MappingClass extends NSObject {

    static {
        NatJ.register();
    }

    protected MappingClass(Pointer peer) {
        super(peer);
    }

    @Selector("testListMapping:::")
    public static native String testListMapping(List list, NSArray narray, @NUInt long index);

    @Selector("testMapMapping:::")
    public static native String testMapMapping(Map map, NSDictionary ndict, String key);

    @Selector("testSetMapping:::")
    public static native String testSetMapping(Set set, NSSet nset, String member);

    @Selector("testIteratorMapping:")
    public static native @NUInt long testIteratorMapping(Iterator iterator);
}
