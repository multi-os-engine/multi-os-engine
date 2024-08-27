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

package org.moe.natj.objc;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ann.ObjCClassBinding;

/**
 * The Ascendant of every Objective-C native object.
 *
 * <p>
 * Inherit from this class or NSObject to define a binding, inherited or a hybrid class.
 * Binding classes are used to bind native classes without doing any modifications against them.
 * Inherited classes are created by JVM, and every implementation in them is implemented in Java.
 * Hybrid classes are created in Objective-C runtime side but they can have Java implementations
 * injected into them.
 *
 * <p>
 * Binding mode will be in use if the class is marked with the {@link ObjCClassBinding} annotation
 * Hybrid mode will be in use if we are defining a class with a name that is already taken by an
 * existing native Objective-C class. Otherwise, inherited mode will be used.
 *
 * <p>
 * Note: Hidden implementations in Objective-C class of hybrid classes is not supported
 * and they won't be invoked by NatJ at all.
 */
@Runtime(CRuntime.class)
public class ObjCObject extends NativeObject {

    /**
     * Construct an Objective-C object from a pointer.
     *
     * @param peer Objective-C object pointer
     */
    protected ObjCObject(Pointer peer) {
        super(peer);
    }

    /**
     * Returns the Objective-C object description.
     *
     * @return Object description
     */
    @Override
    public String toString() {
        return ObjCRuntime.getObjectDescription(this.getPeer().getPeer());
    }

    @Override
    public boolean equals(Object obj) {
        return isEqual(obj);
    }

    /**
     * Objective-C's isEqual method.
     *
     * @param obj object to compare with
     * @return true if equals, otherwise false
     */
    public boolean isEqual(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof ObjCObject) {
            return getPeer().getPeer() == ((ObjCObject) obj).getPeer().getPeer();
        }

        return false;
    }

}
