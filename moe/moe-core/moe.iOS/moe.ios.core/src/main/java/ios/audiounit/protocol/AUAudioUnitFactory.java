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

package ios.audiounit.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.audiounit.AUAudioUnit;
import ios.audiounit.struct.AudioComponentDescription;
import ios.foundation.NSError;
import ios.foundation.protocol.NSExtensionRequestHandling;

@Generated
@Library("AudioUnit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AUAudioUnitFactory")
public interface AUAudioUnitFactory extends NSExtensionRequestHandling {
	/**
	 * createAudioUnitWithComponentDescription:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitFactory_ProtocolReference/index.html#//apple_ref/occ/intfm/AUAudioUnitFactory/createAudioUnitWithComponentDescription:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("createAudioUnitWithComponentDescription:error:")
	AUAudioUnit createAudioUnitWithComponentDescriptionError(@ByValue AudioComponentDescription desc,
			Ptr<NSError> error);
}
