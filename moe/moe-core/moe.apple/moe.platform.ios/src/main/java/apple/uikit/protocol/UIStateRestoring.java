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

package apple.uikit.protocol;

import apple.foundation.NSCoder;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Conform to this protocol if you want your objects to participate in state restoration.
 * <p>
 * To participate in state restoration, the function registerObjectForStateRestoration must
 * be called for the object.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIStateRestoring")
public interface UIStateRestoring {
    /**
     * applicationFinishedRestoringState is called on all restored objects that implement the method *after* all other object
     * decoding has been done (including the application delegate). This allows an object to complete setup after state
     * restoration, knowing that all objects from the restoration archive have decoded their state.
     */
    @Generated
    @IsOptional
    @Selector("applicationFinishedRestoringState")
    default void applicationFinishedRestoringState() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("decodeRestorableStateWithCoder:")
    default void decodeRestorableStateWithCoder(NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Methods to save and restore state for the object. If these aren't implemented, the object
     * can still be referenced by other objects in state restoration archives, but it won't
     * save/restore any state of its own.
     */
    @Generated
    @IsOptional
    @Selector("encodeRestorableStateWithCoder:")
    default void encodeRestorableStateWithCoder(NSCoder coder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The restoration class specifies a class which is consulted during restoration to find/create
     * the object, rather than trying to look it up implicitly
     */
    @Generated
    @IsOptional
    @Selector("objectRestorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    default UIObjectRestoration objectRestorationClass() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The parent property is used to scope the restoration identifier path for an object, to
     * disambiguate it from other objects that might be using the same identifier. The parent
     * must be a restorable object or a view controller, else it will be ignored.
     */
    @Generated
    @IsOptional
    @Selector("restorationParent")
    @MappedReturn(ObjCObjectMapper.class)
    default UIStateRestoring restorationParent() {
        throw new java.lang.UnsupportedOperationException();
    }
}
