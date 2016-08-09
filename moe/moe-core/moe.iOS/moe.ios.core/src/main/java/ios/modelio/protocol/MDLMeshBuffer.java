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

package ios.modelio.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSData;
import ios.foundation.protocol.NSCopying;
import ios.modelio.MDLMeshBufferMap;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBuffer")
public interface MDLMeshBuffer extends NSCopying {
	/**
	 * allocator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfp/MDLMeshBuffer/allocator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allocator")
	@MappedReturn(ObjCObjectMapper.class)
	Object allocator();

	/**
	 * fillData:offset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBuffer/fillData:offset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fillData:offset:")
	void fillDataOffset(NSData data, @NUInt long offset);

	/**
	 * length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfp/MDLMeshBuffer/length">iOS Dev Center</a>
	 */
	@Generated
	@Selector("length")
	@NUInt
	long length();

	/**
	 * map</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBuffer/map">iOS Dev Center</a>
	 */
	@Generated
	@Selector("map")
	MDLMeshBufferMap map();

	/**
	 * type</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfp/MDLMeshBuffer/type">iOS Dev Center</a>
	 */
	@Generated
	@Selector("type")
	@NUInt
	long type();

	/**
	 * zone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBuffer_Protocol/index.html#//apple_ref/occ/intfp/MDLMeshBuffer/zone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zone")
	@MappedReturn(ObjCObjectMapper.class)
	Object zone();
}
