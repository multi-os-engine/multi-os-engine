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

package ios.corespotlight;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSString;
import ios.foundation.NSURL;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSLocalizedString extends NSString {
	static {
		NatJ.register();
	}

	@Generated
	protected CSLocalizedString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CSLocalizedString alloc();

	@Generated
	@Selector("init")
	public native CSLocalizedString init();

	@Generated
	@Selector("initWithBytes:length:encoding:")
	public native CSLocalizedString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len,
			@NUInt long encoding);

	@Generated
	@Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
	public native CSLocalizedString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
			@NUInt long encoding, boolean freeBuffer);

	@Generated
	@Deprecated
	@Selector("initWithCString:")
	public native CSLocalizedString initWithCString(
			ConstBytePtr bytes);

	@Generated
	@Selector("initWithCString:encoding:")
	public native CSLocalizedString initWithCStringEncoding(
			ConstBytePtr nullTerminatedCString,
			@NUInt long encoding);

	@Generated
	@Deprecated
	@Selector("initWithCString:length:")
	public native CSLocalizedString initWithCStringLength(
			ConstBytePtr bytes,
			@NUInt long length);

	@Generated
	@Deprecated
	@Selector("initWithCStringNoCopy:length:freeWhenDone:")
	public native CSLocalizedString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
			boolean freeBuffer);

	@Generated
	@Selector("initWithCharacters:length:")
	public native CSLocalizedString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

	@Generated
	@Selector("initWithCharactersNoCopy:length:freeWhenDone:")
	public native CSLocalizedString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
			boolean freeBuffer);

	@Generated
	@Selector("initWithCoder:")
	public native CSLocalizedString initWithCoder(NSCoder aDecoder);

	@Generated
	@Deprecated
	@Selector("initWithContentsOfFile:")
	public native CSLocalizedString initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:encoding:error:")
	public native CSLocalizedString initWithContentsOfFileEncodingError(String path, @NUInt long enc,
			Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfFile:usedEncoding:error:")
	public native CSLocalizedString initWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
			Ptr<NSError> error);

	@Generated
	@Deprecated
	@Selector("initWithContentsOfURL:")
	public native CSLocalizedString initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:encoding:error:")
	public native CSLocalizedString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:usedEncoding:error:")
	public native CSLocalizedString initWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:encoding:")
	public native CSLocalizedString initWithDataEncoding(NSData data, @NUInt long encoding);

	@Generated
	@Variadic()
	@Selector("initWithFormat:")
	public native CSLocalizedString initWithFormat(String format, Object... varargs);

	@Generated
	@Selector("initWithFormat:arguments:")
	public native CSLocalizedString initWithFormatArguments(String format, BytePtr argList);

	@Generated
	@Variadic()
	@Selector("initWithFormat:locale:")
	public native CSLocalizedString initWithFormatLocale(String format, @Mapped(ObjCObjectMapper.class) Object locale,
			Object... varargs);

	@Generated
	@Selector("initWithFormat:locale:arguments:")
	public native CSLocalizedString initWithFormatLocaleArguments(String format,
			@Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList);

	/**
	 * initWithLocalizedStrings:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSLocalizedString_Class/index.html#//apple_ref/occ/instm/CSLocalizedString/initWithLocalizedStrings:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLocalizedStrings:")
	public native CSLocalizedString initWithLocalizedStrings(NSDictionary<?, ?> localizedStrings);

	@Generated
	@Selector("initWithString:")
	public native CSLocalizedString initWithString(String aString);

	@Generated
	@Selector("initWithUTF8String:")
	public native CSLocalizedString initWithUTF8String(
			ConstBytePtr nullTerminatedCString);

	/**
	 * localizedString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSLocalizedString_Class/index.html#//apple_ref/occ/instm/CSLocalizedString/localizedString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedString")
	public native String localizedString();

	@Generated
	@Selector("string")
	public static native CSLocalizedString string();

	@Generated
	@Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
	@NUInt
	public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
			NSDictionary<String, ?> opts, Ptr<NSString> string, BoolPtr usedLossyConversion);

	@Generated
	@Deprecated
	@Selector("stringWithCString:")
	public static native CSLocalizedString stringWithCString(
			ConstBytePtr bytes);

	@Generated
	@Selector("stringWithCString:encoding:")
	public static native CSLocalizedString stringWithCStringEncoding(
			ConstBytePtr cString,
			@NUInt long enc);

	@Generated
	@Deprecated
	@Selector("stringWithCString:length:")
	public static native CSLocalizedString stringWithCStringLength(
			ConstBytePtr bytes,
			@NUInt long length);

	@Generated
	@Selector("stringWithCharacters:length:")
	public static native CSLocalizedString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

	@Generated
	@Deprecated
	@Selector("stringWithContentsOfFile:")
	public static native CSLocalizedString stringWithContentsOfFile(String path);

	@Generated
	@Selector("stringWithContentsOfFile:encoding:error:")
	public static native CSLocalizedString stringWithContentsOfFileEncodingError(String path, @NUInt long enc,
			Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfFile:usedEncoding:error:")
	public static native CSLocalizedString stringWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
			Ptr<NSError> error);

	@Generated
	@Deprecated
	@Selector("stringWithContentsOfURL:")
	public static native CSLocalizedString stringWithContentsOfURL(NSURL url);

	@Generated
	@Selector("stringWithContentsOfURL:encoding:error:")
	public static native CSLocalizedString stringWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
			Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:usedEncoding:error:")
	public static native CSLocalizedString stringWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
			Ptr<NSError> error);

	@Generated
	@Variadic()
	@Selector("stringWithFormat:")
	public static native CSLocalizedString stringWithFormat(String format, Object... varargs);

	@Generated
	@Selector("stringWithString:")
	public static native CSLocalizedString stringWithString(String string);

	@Generated
	@Selector("stringWithUTF8String:")
	public static native CSLocalizedString stringWithUTF8String(
			ConstBytePtr nullTerminatedCString);

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
	@Selector("availableStringEncodings")
	public static native ConstNUIntPtr availableStringEncodings();

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
	@Selector("defaultCStringEncoding")
	@NUInt
	public static native long defaultCStringEncoding();

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
	@Selector("localizedNameOfStringEncoding:")
	public static native String localizedNameOfStringEncoding(
			@NUInt long encoding);

	@Generated
	@Variadic()
	@Selector("localizedStringWithFormat:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object localizedStringWithFormat(String format,
			Object... varargs);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("pathWithComponents:")
	public static native String pathWithComponents(NSArray<String> components);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
