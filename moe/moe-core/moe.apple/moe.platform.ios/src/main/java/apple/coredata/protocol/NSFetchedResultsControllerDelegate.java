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

package apple.coredata.protocol;

import apple.coredata.NSFetchedResultsController;
import apple.foundation.NSIndexPath;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFetchedResultsControllerDelegate")
public interface NSFetchedResultsControllerDelegate {
    @Generated
    @IsOptional
    @Selector("controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:")
    default void controllerDidChangeObjectAtIndexPathForChangeTypeNewIndexPath(NSFetchedResultsController controller,
            @Mapped(ObjCObjectMapper.class) Object anObject, NSIndexPath indexPath, @NUInt long type,
            NSIndexPath newIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("controller:didChangeSection:atIndex:forChangeType:")
    default void controllerDidChangeSectionAtIndexForChangeType(NSFetchedResultsController controller,
            @Mapped(ObjCObjectMapper.class) Object sectionInfo, @NUInt long sectionIndex, @NUInt long type) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("controller:sectionIndexTitleForSectionName:")
    default String controllerSectionIndexTitleForSectionName(NSFetchedResultsController controller,
            String sectionName) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("controllerDidChangeContent:")
    default void controllerDidChangeContent(NSFetchedResultsController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("controllerWillChangeContent:")
    default void controllerWillChangeContent(NSFetchedResultsController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
