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
     * unarchiver:cannotDecodeObjectOfClassName:originalClasses:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedUnarchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedUnarchiverDelegate/unarchiver:cannotDecodeObjectOfClassName:originalClasses:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("unarchiver:cannotDecodeObjectOfClassName:originalClasses:")
    default Class unarchiverCannotDecodeObjectOfClassNameOriginalClasses(NSKeyedUnarchiver unarchiver, String name,
            NSArray<String> classNames) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * unarchiver:didDecodeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedUnarchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedUnarchiverDelegate/unarchiver:didDecodeObject:">iOS Dev Center</a>
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
     * unarchiver:willReplaceObject:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedUnarchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedUnarchiverDelegate/unarchiver:willReplaceObject:withObject:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("unarchiver:willReplaceObject:withObject:")
    default void unarchiverWillReplaceObjectWithObject(NSKeyedUnarchiver unarchiver,
            @Mapped(ObjCObjectMapper.class) Object object, @Mapped(ObjCObjectMapper.class) Object newObject) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * unarchiverDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedUnarchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedUnarchiverDelegate/unarchiverDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("unarchiverDidFinish:")
    default void unarchiverDidFinish(NSKeyedUnarchiver unarchiver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * unarchiverWillFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSKeyedUnarchiverDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSKeyedUnarchiverDelegate/unarchiverWillFinish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("unarchiverWillFinish:")
    default void unarchiverWillFinish(NSKeyedUnarchiver unarchiver) {
        throw new java.lang.UnsupportedOperationException();
    }
}
