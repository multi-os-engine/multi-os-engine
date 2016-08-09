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

package mac.foundation;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
//import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
//import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
//import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
//import ios.foundation.protocol.NSCoding;
//import ios.foundation.protocol.NSCopying;
import java.lang.String;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSException extends NSObject /*implements NSCopying, NSCoding*/ {
	static {
		NatJ.register();
	}

	@Generated
	protected NSException(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSException alloc();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSException_Class/index.html#//apple_ref/occ/instp/NSException/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * raise</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSException_Class/index.html#//apple_ref/occ/instm/NSException/raise">iOS Dev Center</a>
	 */
	@Generated
	@Selector("raise")
	public native void raise();

	/**
	 * raise:format:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSException_Class/index.html#//apple_ref/occ/clm/NSException/raise:format:">iOS Dev Center</a>
	 */
	@Generated
	@Variadic()
	@Selector("raise:format:")
	public static native void raiseFormat(String name, String format,
			Object... varargs);

	/**
	 * raise:format:arguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSException_Class/index.html#//apple_ref/occ/clm/NSException/raise:format:arguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("raise:format:arguments:")
	public static native void raiseFormatArguments(String name, String format,
			BytePtr argList);

	/**
	 * reason</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSException_Class/index.html#//apple_ref/occ/instp/NSException/reason">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reason")
	public native String reason();

}
