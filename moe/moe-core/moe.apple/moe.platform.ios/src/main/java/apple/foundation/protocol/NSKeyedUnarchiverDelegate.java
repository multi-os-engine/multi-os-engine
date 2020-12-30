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

import apple.foundation.NSArray;
import apple.foundation.NSKeyedUnarchiver;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSKeyedUnarchiverDelegate")
public interface NSKeyedUnarchiverDelegate {
    /**
     * error handling
     */
    @Generated
    @IsOptional
    @Selector("unarchiver:cannotDecodeObjectOfClassName:originalClasses:")
    default Class unarchiverCannotDecodeObjectOfClassNameOriginalClasses(NSKeyedUnarchiver unarchiver, String name,
            NSArray<String> classNames) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * substitution
     */
    @Generated
    @IsOptional
    @Selector("unarchiver:didDecodeObject:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object unarchiverDidDecodeObject(NSKeyedUnarchiver unarchiver,
            @Mapped(ObjCObjectMapper.class) Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * notification
     */
    @Generated
    @IsOptional
    @Selector("unarchiver:willReplaceObject:withObject:")
    default void unarchiverWillReplaceObjectWithObject(NSKeyedUnarchiver unarchiver,
            @Mapped(ObjCObjectMapper.class) Object object, @Mapped(ObjCObjectMapper.class) Object newObject) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate that decoding is about to finish.
     */
    @Generated
    @IsOptional
    @Selector("unarchiverDidFinish:")
    default void unarchiverDidFinish(NSKeyedUnarchiver unarchiver) {
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
    @Selector("unarchiverWillFinish:")
    default void unarchiverWillFinish(NSKeyedUnarchiver unarchiver) {
        throw new java.lang.UnsupportedOperationException();
    }
}
