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

package ios.quartzcore.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMediaTiming")
public interface CAMediaTiming {
	/**
	 * autoreverses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/autoreverses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("autoreverses")
	boolean autoreverses();

	/**
	 * beginTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/beginTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginTime")
	double beginTime();

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("duration")
	double duration();

	/**
	 * fillMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/fillMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fillMode")
	String fillMode();

	/**
	 * repeatCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/repeatCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("repeatCount")
	float repeatCount();

	/**
	 * repeatDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/repeatDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("repeatDuration")
	double repeatDuration();

	/**
	 * autoreverses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/autoreverses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAutoreverses:")
	void setAutoreverses(boolean value);

	/**
	 * beginTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/beginTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBeginTime:")
	void setBeginTime(double value);

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDuration:")
	void setDuration(double value);

	/**
	 * fillMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/fillMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFillMode:")
	void setFillMode(String value);

	/**
	 * repeatCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/repeatCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRepeatCount:")
	void setRepeatCount(float value);

	/**
	 * repeatDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/repeatDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRepeatDuration:")
	void setRepeatDuration(double value);

	/**
	 * speed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/speed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSpeed:")
	void setSpeed(float value);

	/**
	 * timeOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/timeOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeOffset:")
	void setTimeOffset(double value);

	/**
	 * speed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/speed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("speed")
	float speed();

	/**
	 * timeOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAMediaTiming_protocol/index.html#//apple_ref/occ/intfp/CAMediaTiming/timeOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeOffset")
	double timeOffset();
}
