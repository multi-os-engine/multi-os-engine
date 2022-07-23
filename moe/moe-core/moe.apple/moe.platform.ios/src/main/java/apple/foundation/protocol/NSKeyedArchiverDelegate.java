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

package apple.foundation.protocol;

import apple.foundation.NSKeyedArchiver;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSKeyedArchiverDelegate")
public interface NSKeyedArchiverDelegate {
    /**
     * Informs the delegate that the object is about to be encoded. The delegate
     * either returns this object or can return a different object to be encoded
     * instead. The delegate can also fiddle with the coder state. If the delegate
     * returns nil, nil is encoded. This method is called after the original object
     * may have replaced itself with replacementObjectForKeyedArchiver:.
     * This method is not called for an object once a replacement mapping has been
     * setup for that object (either explicitly, or because the object has previously
     * been encoded). This is also not called when nil is about to be encoded.
     * This method is called whether or not the object is being encoded conditionally.
     */
    @Generated
    @IsOptional
    @Selector("archiver:didEncodeObject:")
    default void archiverDidEncodeObject(NSKeyedArchiver archiver, @Mapped(ObjCObjectMapper.class) Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * substitution
     */
    @Generated
    @IsOptional
    @Selector("archiver:willEncodeObject:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object archiverWillEncodeObject(NSKeyedArchiver archiver, @Mapped(ObjCObjectMapper.class) Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * notification
     */
    @Generated
    @IsOptional
    @Selector("archiver:willReplaceObject:withObject:")
    default void archiverWillReplaceObjectWithObject(NSKeyedArchiver archiver,
            @Mapped(ObjCObjectMapper.class) Object object, @Mapped(ObjCObjectMapper.class) Object newObject) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate that encoding is about to finish.
     */
    @Generated
    @IsOptional
    @Selector("archiverDidFinish:")
    default void archiverDidFinish(NSKeyedArchiver archiver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that the newObject is being substituted for the
     * object. This is also called when the delegate itself is doing/has done
     * the substitution. The delegate may use this method if it is keeping track
     * of the encoded or decoded objects.
     */
    @Generated
    @IsOptional
    @Selector("archiverWillFinish:")
    default void archiverWillFinish(NSKeyedArchiver archiver) {
        throw new java.lang.UnsupportedOperationException();
    }
}
