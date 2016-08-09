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

package objc.tests.ptr;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.foundation.NSError;
import mac.foundation.NSNumber;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ObjectPtrClass extends NSObject {
    static {
        NatJ.register();
    }

    protected ObjectPtrClass(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native ObjectPtrClass alloc();

    @Selector("fillWithOneElement:")
    public native void fillWithOneElement(Ptr<NSError> one);

    @Selector("fillWithOneElement:andWithThreeElements:")
    public native void fillWithOneElementAndWithThreeElements(Ptr<NSError> one, Ptr<NSNumber> two);

    @Selector("fillWithThreeElements:")
    public native void fillWithThreeElements(Ptr<NSNumber> one);

    @Selector("fillWithOneElement:")
    public native void fillWithOneElement2(Ptr<? extends NSError> one);

    @Selector("init")
    public native ObjectPtrClass init();
}
