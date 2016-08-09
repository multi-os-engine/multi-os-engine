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

package ios.coredata.protocol;


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

import ios.coredata.NSFetchedResultsController;
import ios.foundation.NSIndexPath;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFetchedResultsControllerDelegate")
public interface NSFetchedResultsControllerDelegate {
	/**
	 * controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFetchedResultsControllerDelegate/controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:")
	default void controllerDidChangeObjectAtIndexPathForChangeTypeNewIndexPath(
			NSFetchedResultsController controller,
			@Mapped(ObjCObjectMapper.class) Object anObject,
			NSIndexPath indexPath, @NUInt long type, NSIndexPath newIndexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * controller:didChangeSection:atIndex:forChangeType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFetchedResultsControllerDelegate/controller:didChangeSection:atIndex:forChangeType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("controller:didChangeSection:atIndex:forChangeType:")
	default void controllerDidChangeSectionAtIndexForChangeType(
			NSFetchedResultsController controller,
			@Mapped(ObjCObjectMapper.class) Object sectionInfo,
			@NUInt long sectionIndex, @NUInt long type) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * controller:sectionIndexTitleForSectionName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFetchedResultsControllerDelegate/controller:sectionIndexTitleForSectionName:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("controller:sectionIndexTitleForSectionName:")
	default String controllerSectionIndexTitleForSectionName(
			NSFetchedResultsController controller, String sectionName) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * controllerDidChangeContent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFetchedResultsControllerDelegate/controllerDidChangeContent:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("controllerDidChangeContent:")
	default void controllerDidChangeContent(
			NSFetchedResultsController controller) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * controllerWillChangeContent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFetchedResultsControllerDelegate/controllerWillChangeContent:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("controllerWillChangeContent:")
	default void controllerWillChangeContent(
			NSFetchedResultsController controller) {
		throw new java.lang.UnsupportedOperationException();
	}
}
