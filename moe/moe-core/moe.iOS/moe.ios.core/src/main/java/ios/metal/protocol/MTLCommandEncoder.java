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

package ios.metal.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandEncoder")
public interface MTLCommandEncoder {
	/**
	 * device</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfp/MTLCommandEncoder/device">iOS Dev Center</a>
	 */
	@Generated
	@Selector("device")
	@MappedReturn(ObjCObjectMapper.class)
	Object device();

	/**
	 * endEncoding</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLCommandEncoder/endEncoding">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endEncoding")
	void endEncoding();

	/**
	 * insertDebugSignpost:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLCommandEncoder/insertDebugSignpost:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertDebugSignpost:")
	void insertDebugSignpost(String string);

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfp/MTLCommandEncoder/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("label")
	String label();

	/**
	 * popDebugGroup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLCommandEncoder/popDebugGroup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("popDebugGroup")
	void popDebugGroup();

	/**
	 * pushDebugGroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLCommandEncoder/pushDebugGroup:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushDebugGroup:")
	void pushDebugGroup(String string);

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandEncoder_Ref/index.html#//apple_ref/occ/intfp/MTLCommandEncoder/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLabel:")
	void setLabel(String value);
}
