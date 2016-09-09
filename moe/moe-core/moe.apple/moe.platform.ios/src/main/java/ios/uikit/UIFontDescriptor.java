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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGAffineTransform;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.NSSet;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFontDescriptor extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected UIFontDescriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIFontDescriptor alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fontAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontAttributes")
	public native NSDictionary<String, ?> fontAttributes();

	/**
	 * fontDescriptorByAddingAttributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorByAddingAttributes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorByAddingAttributes:")
	public native UIFontDescriptor fontDescriptorByAddingAttributes(
			NSDictionary<String, ?> attributes);

	/**
	 * fontDescriptorWithFace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorWithFace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithFace:")
	public native UIFontDescriptor fontDescriptorWithFace(String newFace);

	/**
	 * fontDescriptorWithFamily:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorWithFamily:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithFamily:")
	public native UIFontDescriptor fontDescriptorWithFamily(String newFamily);

	/**
	 * fontDescriptorWithFontAttributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/clm/UIFontDescriptor/fontDescriptorWithFontAttributes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithFontAttributes:")
	public static native UIFontDescriptor fontDescriptorWithFontAttributes(
			NSDictionary<String, ?> attributes);

	/**
	 * fontDescriptorWithMatrix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorWithMatrix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithMatrix:")
	public native UIFontDescriptor fontDescriptorWithMatrix(
			@ByValue CGAffineTransform matrix);

	/**
	 * fontDescriptorWithName:matrix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/clm/UIFontDescriptor/fontDescriptorWithName:matrix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithName:matrix:")
	public static native UIFontDescriptor fontDescriptorWithNameMatrix(
			String fontName, @ByValue CGAffineTransform matrix);

	/**
	 * fontDescriptorWithName:size:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/clm/UIFontDescriptor/fontDescriptorWithName:size:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithName:size:")
	public static native UIFontDescriptor fontDescriptorWithNameSize(
			String fontName, @NFloat double size);

	/**
	 * fontDescriptorWithSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorWithSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithSize:")
	public native UIFontDescriptor fontDescriptorWithSize(
			@NFloat double newPointSize);

	/**
	 * fontDescriptorWithSymbolicTraits:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/fontDescriptorWithSymbolicTraits:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontDescriptorWithSymbolicTraits:")
	public native UIFontDescriptor fontDescriptorWithSymbolicTraits(
			int symbolicTraits);

	@Generated
	@Selector("init")
	public native UIFontDescriptor init();

	@Generated
	@Selector("initWithCoder:")
	public native UIFontDescriptor initWithCoder(NSCoder aDecoder);

	/**
	 * initWithFontAttributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/initWithFontAttributes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithFontAttributes:")
	public native UIFontDescriptor initWithFontAttributes(
			NSDictionary<String, ?> attributes);

	/**
	 * matchingFontDescriptorsWithMandatoryKeys:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/matchingFontDescriptorsWithMandatoryKeys:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matchingFontDescriptorsWithMandatoryKeys:")
	public native NSArray<? extends UIFontDescriptor> matchingFontDescriptorsWithMandatoryKeys(
			NSSet<String> mandatoryKeys);

	/**
	 * matrix</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instp/UIFontDescriptor/matrix">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matrix")
	@ByValue
	public native CGAffineTransform matrix();

	/**
	 * objectForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instm/UIFontDescriptor/objectForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String anAttribute);

	/**
	 * pointSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instp/UIFontDescriptor/pointSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pointSize")
	@NFloat
	public native double pointSize();

	/**
	 * postscriptName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instp/UIFontDescriptor/postscriptName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postscriptName")
	public native String postscriptName();

	/**
	 * preferredFontDescriptorWithTextStyle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/clm/UIFontDescriptor/preferredFontDescriptorWithTextStyle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredFontDescriptorWithTextStyle:")
	public static native UIFontDescriptor preferredFontDescriptorWithTextStyle(
			String style);

	/**
	 * symbolicTraits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIFontDescriptor_Class/index.html#//apple_ref/occ/instp/UIFontDescriptor/symbolicTraits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("symbolicTraits")
	public native int symbolicTraits();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
