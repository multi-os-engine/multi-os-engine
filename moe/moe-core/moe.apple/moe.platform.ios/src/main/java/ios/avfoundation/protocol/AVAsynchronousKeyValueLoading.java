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

package ios.avfoundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSError;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAsynchronousKeyValueLoading")
public interface AVAsynchronousKeyValueLoading {
	/**
	 * loadValuesAsynchronouslyForKeys:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsynchronousKeyValueLoading_Protocol/index.html#//apple_ref/occ/intfm/AVAsynchronousKeyValueLoading/loadValuesAsynchronouslyForKeys:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
	void loadValuesAsynchronouslyForKeysCompletionHandler(
			NSArray<String> keys,
			@ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
    public interface Block_loadValuesAsynchronouslyForKeysCompletionHandler {
		@Generated
        void call_loadValuesAsynchronouslyForKeysCompletionHandler();
	}

	/**
	 * statusOfValueForKey:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsynchronousKeyValueLoading_Protocol/index.html#//apple_ref/occ/intfm/AVAsynchronousKeyValueLoading/statusOfValueForKey:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("statusOfValueForKey:error:")
	@NInt
	long statusOfValueForKeyError(String key, Ptr<NSError> outError);
}
