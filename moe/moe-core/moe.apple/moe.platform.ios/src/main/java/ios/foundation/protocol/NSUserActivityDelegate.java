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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSInputStream;
import ios.foundation.NSOutputStream;
import ios.foundation.NSUserActivity;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSUserActivityDelegate")
public interface NSUserActivityDelegate {
	/**
	 * userActivity:didReceiveInputStream:outputStream:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSUserActivityDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSUserActivityDelegate/userActivity:didReceiveInputStream:outputStream:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("userActivity:didReceiveInputStream:outputStream:")
	default void userActivityDidReceiveInputStreamOutputStream(
			NSUserActivity userActivity, NSInputStream inputStream,
			NSOutputStream outputStream) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * userActivityWasContinued:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSUserActivityDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSUserActivityDelegate/userActivityWasContinued:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("userActivityWasContinued:")
	default void userActivityWasContinued(NSUserActivity userActivity) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * userActivityWillSave:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSUserActivityDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSUserActivityDelegate/userActivityWillSave:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("userActivityWillSave:")
	default void userActivityWillSave(NSUserActivity userActivity) {
		throw new java.lang.UnsupportedOperationException();
	}
}
