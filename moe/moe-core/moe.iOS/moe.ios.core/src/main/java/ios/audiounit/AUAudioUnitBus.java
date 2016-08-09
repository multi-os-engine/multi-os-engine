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

package ios.audiounit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.avfoundation.AVAudioFormat;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.foundation.NSNumber;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AudioUnit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnitBus extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected AUAudioUnitBus(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AUAudioUnitBus alloc();

	/**
	 * busType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/busType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("busType")
	@NInt
	public native long busType();

	/**
	 * contextPresentationLatency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/contextPresentationLatency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextPresentationLatency")
	public native double contextPresentationLatency();

	/**
	 * format</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/format">iOS Dev Center</a>
	 */
	@Generated
	@Selector("format")
	public native AVAudioFormat format();

	/**
	 * index</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/index">iOS Dev Center</a>
	 */
	@Generated
	@Selector("index")
	@NUInt
	public native long index();

	@Generated
	@Selector("init")
	public native AUAudioUnitBus init();

	/**
	 * initWithFormat:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBus/initWithFormat:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithFormat:error:")
	public native AUAudioUnitBus initWithFormatError(AVAudioFormat format, Ptr<NSError> outError);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * maximumChannelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/maximumChannelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumChannelCount")
	public native int maximumChannelCount();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * ownerAudioUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/ownerAudioUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ownerAudioUnit")
	public native AUAudioUnit ownerAudioUnit();

	/**
	 * contextPresentationLatency</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/contextPresentationLatency">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContextPresentationLatency:")
	public native void setContextPresentationLatency(double value);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * setFormat:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBus/setFormat:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFormat:error:")
	public native boolean setFormatError(AVAudioFormat format, Ptr<NSError> outError);

	/**
	 * maximumChannelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/maximumChannelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumChannelCount:")
	public native void setMaximumChannelCount(int value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * supportedChannelCounts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/supportedChannelCounts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSupportedChannelCounts:")
	public native void setSupportedChannelCounts(NSArray<? extends NSNumber> value);

	/**
	 * supportedChannelCounts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/supportedChannelCounts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportedChannelCounts")
	public native NSArray<? extends NSNumber> supportedChannelCounts();

	/**
	 * supportedChannelLayoutTags</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBus_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBus/supportedChannelLayoutTags">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportedChannelLayoutTags")
	public native NSArray<? extends NSNumber> supportedChannelLayoutTags();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
