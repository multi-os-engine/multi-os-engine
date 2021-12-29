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

package apple.foundation;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCObjectRawAllocMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableArray<T> extends NSArray<T> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableArray(Pointer peer) {
        super(peer);
    }

    public NSMutableArray() {
        this((Pointer) null);
        ObjCObjectRawAllocMapper.associateReference(_alloc(),this);
        ObjCObjectRawAllocMapper.associateReference(_init(),this);
    }

    @Generated
    @Owned
    @Selector("alloc")
    @MappedReturn(ObjCObjectRawAllocMapper.class)
    private static native Pointer _alloc();

    @Generated
    @Selector("init")
    @MappedReturn(ObjCObjectRawAllocMapper.class)
    private native Pointer _init();

    @Generated
    @Selector("addObject:")
    public native void addObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableArray alloc();

    @Generated
    @Selector("init")
    public native NSMutableArray init();

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableArray initWithCapacity(long numItems);

    public void add(Object b) {
        addObject(b);
    }
}
