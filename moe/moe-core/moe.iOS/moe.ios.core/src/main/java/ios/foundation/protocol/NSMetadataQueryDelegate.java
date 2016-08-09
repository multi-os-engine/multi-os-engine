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

package ios.foundation.protocol;


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

import ios.foundation.NSMetadataItem;
import ios.foundation.NSMetadataQuery;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSMetadataQueryDelegate")
public interface NSMetadataQueryDelegate {
	/**
	 * metadataQuery:replacementObjectForResultObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMetadataQueryDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSMetadataQueryDelegate/metadataQuery:replacementObjectForResultObject:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("metadataQuery:replacementObjectForResultObject:")
	@MappedReturn(ObjCObjectMapper.class)
	default Object metadataQueryReplacementObjectForResultObject(
			NSMetadataQuery query, NSMetadataItem result) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * metadataQuery:replacementValueForAttribute:value:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSMetadataQueryDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSMetadataQueryDelegate/metadataQuery:replacementValueForAttribute:value:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("metadataQuery:replacementValueForAttribute:value:")
	@MappedReturn(ObjCObjectMapper.class)
	default Object metadataQueryReplacementValueForAttributeValue(
			NSMetadataQuery query, String attrName,
			@Mapped(ObjCObjectMapper.class) Object attrValue) {
		throw new java.lang.UnsupportedOperationException();
	}
}
