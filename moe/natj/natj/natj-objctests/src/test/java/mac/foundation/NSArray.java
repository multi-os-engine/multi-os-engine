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

package mac.foundation;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

import java.util.Iterator;
import java.util.NoSuchElementException;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArray<T> extends NSObject implements Iterable<T> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSArray alloc();

    @Generated
    @Selector("arrayWithArray:")
    public static native NSArray arrayWithArray(NSArray array);

    @Generated
    @Selector("count")
    public native long count();

    @Generated
    @Selector("description")
    public native String description();

    public Object get(int i) {
        return objectAtIndex(i);
    }

    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    static public interface Block_enumerateObjectsUsingBlock {
        @Generated
        public void call_enumerateObjectsUsingBlock(
                @Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
                BoolPtr arg2);
    }

    @Generated
    @Selector("init")
    public native NSArray init();

    @Generated
    @Selector("objectAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectAtIndex(long index);


    public Object[] toArray() {
        Object[] a = new Object[(int) count()];
        for (int idx = 0; idx < (int) count(); ++idx) {
            a[idx] = objectAtIndex(idx);
        }
        return a;
    }

    @Override
    public Iterator iterator() {
        return new NSArrayIterator(this);
    }

    private final static class NSArrayIterator implements Iterator {

        private long cursor = 0;
        private final long count;
        private final NSArray array;

        public NSArrayIterator(NSArray array) {
            this.array = array;
            this.count = array.count();
        }

        @Override
        public boolean hasNext() {
            return cursor < count;
        }

        @Override
        public Object next() {
            if (cursor >= count) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(cursor++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
