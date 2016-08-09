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

package ios.glkit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.objc.map.ObjCStringMapper;

import ios.corefoundation.opaque.CFAllocatorRef;
import ios.glkit.opaque.GLKMatrixStackRef;
import ios.glkit.struct.GLKMatrix2;
import ios.glkit.struct.GLKMatrix3;
import ios.glkit.struct.GLKMatrix4;
import ios.glkit.struct.GLKQuaternion;
import ios.glkit.struct.GLKVector2;
import ios.glkit.struct.GLKVector3;
import ios.glkit.struct.GLKVector4;
import ios.glkit.struct.GLKVertexAttributeParameters;

@Generated
@Library("GLKit")
@Runtime(CRuntime.class)
public final class GLKit {
	static {
		NatJ.register();
	}

	@Generated
	private GLKit() {
	}

	/**
	 * GLKVector3Make</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Make">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Make(float x, float y, float z);

	/**
	 * GLKVector3Negate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Negate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Negate(@ByValue GLKVector3 vector);

	/**
	 * GLKVector3Add</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Add">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Add(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Subtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Subtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Subtract(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Multiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Multiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Multiply(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Divide</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Divide">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Divide(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3AddScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AddScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3AddScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3SubtractScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3SubtractScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3SubtractScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3MultiplyScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3MultiplyScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3MultiplyScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3DivideScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3DivideScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3DivideScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3Maximum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Maximum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Maximum(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Minimum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Minimum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Minimum(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3AllEqualToVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllEqualToVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllEqualToVector3(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3AllEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllEqualToScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3AllGreaterThanVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllGreaterThanVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllGreaterThanVector3(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3AllGreaterThanScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllGreaterThanScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllGreaterThanScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3AllGreaterThanOrEqualToVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllGreaterThanOrEqualToVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllGreaterThanOrEqualToVector3(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3AllGreaterThanOrEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3AllGreaterThanOrEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector3AllGreaterThanOrEqualToScalar(
			@ByValue GLKVector3 vector, float value);

	/**
	 * GLKVector3Normalize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Normalize">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Normalize(
			@ByValue GLKVector3 vector);

	/**
	 * GLKVector3DotProduct</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3DotProduct">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector3DotProduct(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Length">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector3Length(@ByValue GLKVector3 vector);

	/**
	 * GLKVector3Distance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Distance">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector3Distance(
			@ByValue GLKVector3 vectorStart, @ByValue GLKVector3 vectorEnd);

	/**
	 * GLKVector3Lerp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Lerp">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Lerp(
			@ByValue GLKVector3 vectorStart, @ByValue GLKVector3 vectorEnd,
			float t);

	/**
	 * GLKVector3CrossProduct</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3CrossProduct">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3CrossProduct(
			@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKVector3Project</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector3/index.html#//apple_ref/c/func/GLKVector3Project">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKVector3Project(
			@ByValue GLKVector3 vectorToProject,
			@ByValue GLKVector3 projectionVector);

	/**
	 * GLKVector4Make</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Make">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Make(float x, float y, float z,
			float w);

	/**
	 * GLKVector4MakeWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4MakeWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4MakeWithVector3(
			@ByValue GLKVector3 vector, float w);

	/**
	 * GLKVector4Negate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Negate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Negate(@ByValue GLKVector4 vector);

	/**
	 * GLKVector4Add</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Add">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Add(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Subtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Subtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Subtract(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Multiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Multiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Multiply(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Divide</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Divide">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Divide(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4AddScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AddScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4AddScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4SubtractScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4SubtractScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4SubtractScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4MultiplyScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4MultiplyScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4MultiplyScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4DivideScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4DivideScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4DivideScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4Maximum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Maximum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Maximum(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Minimum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Minimum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Minimum(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4AllEqualToVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllEqualToVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllEqualToVector4(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4AllEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllEqualToScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4AllGreaterThanVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllGreaterThanVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllGreaterThanVector4(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4AllGreaterThanScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllGreaterThanScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllGreaterThanScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4AllGreaterThanOrEqualToVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllGreaterThanOrEqualToVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllGreaterThanOrEqualToVector4(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4AllGreaterThanOrEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4AllGreaterThanOrEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector4AllGreaterThanOrEqualToScalar(
			@ByValue GLKVector4 vector, float value);

	/**
	 * GLKVector4Normalize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Normalize">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Normalize(
			@ByValue GLKVector4 vector);

	/**
	 * GLKVector4DotProduct</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4DotProduct">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector4DotProduct(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Length">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector4Length(@ByValue GLKVector4 vector);

	/**
	 * GLKVector4Distance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Distance">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector4Distance(
			@ByValue GLKVector4 vectorStart, @ByValue GLKVector4 vectorEnd);

	/**
	 * GLKVector4Lerp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Lerp">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Lerp(
			@ByValue GLKVector4 vectorStart, @ByValue GLKVector4 vectorEnd,
			float t);

	/**
	 * GLKVector4CrossProduct</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4CrossProduct">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4CrossProduct(
			@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKVector4Project</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector4/index.html#//apple_ref/c/func/GLKVector4Project">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKVector4Project(
			@ByValue GLKVector4 vectorToProject,
			@ByValue GLKVector4 projectionVector);

	/**
	 * GLKQuaternionMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMake">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMake(float x, float y,
			float z, float w);

	/**
	 * GLKQuaternionMakeWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMakeWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMakeWithVector3(
			@ByValue GLKVector3 vector, float scalar);

	/**
	 * GLKQuaternionMakeWithAngleAndAxis</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMakeWithAngleAndAxis">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMakeWithAngleAndAxis(
			float radians, float x, float y, float z);

	/**
	 * GLKQuaternionMakeWithAngleAndVector3Axis</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMakeWithAngleAndVector3Axis">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMakeWithAngleAndVector3Axis(
			float radians, @ByValue GLKVector3 axisVector);

	/**
	 * GLKQuaternionMakeWithMatrix3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMakeWithMatrix3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMakeWithMatrix3(
			@ByValue GLKMatrix3 matrix);

	/**
	 * GLKQuaternionMakeWithMatrix4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMakeWithMatrix4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMakeWithMatrix4(
			@ByValue GLKMatrix4 matrix);

	/**
	 * GLKQuaternionAngle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionAngle">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native float GLKQuaternionAngle(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionAxis</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionAxis">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKVector3 GLKQuaternionAxis(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionAdd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionAdd">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionAdd(
			@ByValue GLKQuaternion quaternionLeft,
			@ByValue GLKQuaternion quaternionRight);

	/**
	 * GLKQuaternionSubtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionSubtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionSubtract(
			@ByValue GLKQuaternion quaternionLeft,
			@ByValue GLKQuaternion quaternionRight);

	/**
	 * GLKQuaternionMultiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionMultiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionMultiply(
			@ByValue GLKQuaternion quaternionLeft,
			@ByValue GLKQuaternion quaternionRight);

	/**
	 * GLKQuaternionSlerp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionSlerp">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionSlerp(
			@ByValue GLKQuaternion quaternionStart,
			@ByValue GLKQuaternion quaternionEnd, float t);

	/**
	 * GLKQuaternionLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionLength">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKQuaternionLength(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionConjugate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionConjugate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionConjugate(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionInvert</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionInvert">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionInvert(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionNormalize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionNormalize">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKQuaternion GLKQuaternionNormalize(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKQuaternionRotateVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionRotateVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKQuaternionRotateVector3(
			@ByValue GLKQuaternion quaternion, @ByValue GLKVector3 vector);

	/**
	 * GLKQuaternionRotateVector3Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionRotateVector3Array">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKQuaternionRotateVector3Array(
			@ByValue GLKQuaternion quaternion,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKQuaternionRotateVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionRotateVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKQuaternionRotateVector4(
			@ByValue GLKQuaternion quaternion, @ByValue GLKVector4 vector);

	/**
	 * GLKQuaternionRotateVector4Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKQuaternion/index.html#//apple_ref/c/func/GLKQuaternionRotateVector4Array">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKQuaternionRotateVector4Array(
			@ByValue GLKQuaternion quaternion,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector4 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKMatrix3Make</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Make">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Make(float m00, float m01,
			float m02, float m10, float m11, float m12, float m20, float m21,
			float m22);

	/**
	 * GLKMatrix3MakeAndTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeAndTranspose">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeAndTranspose(float m00,
			float m01, float m02, float m10, float m11, float m12, float m20,
			float m21, float m22);

	/**
	 * GLKMatrix3MakeWithRows</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeWithRows">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeWithRows(
			@ByValue GLKVector3 row0, @ByValue GLKVector3 row1,
			@ByValue GLKVector3 row2);

	/**
	 * GLKMatrix3MakeWithColumns</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeWithColumns">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeWithColumns(
			@ByValue GLKVector3 column0, @ByValue GLKVector3 column1,
			@ByValue GLKVector3 column2);

	/**
	 * GLKMatrix3MakeWithQuaternion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeWithQuaternion">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeWithQuaternion(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKMatrix3MakeScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeScale">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeScale(float sx, float sy,
			float sz);

	/**
	 * GLKMatrix3MakeRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeRotation(float radians,
			float x, float y, float z);

	/**
	 * GLKMatrix3MakeXRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeXRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeXRotation(float radians);

	/**
	 * GLKMatrix3MakeYRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeYRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeYRotation(float radians);

	/**
	 * GLKMatrix3MakeZRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MakeZRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3MakeZRotation(float radians);

	/**
	 * GLKMatrix3GetMatrix2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3GetMatrix2">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix2 GLKMatrix3GetMatrix2(
			@ByValue GLKMatrix3 matrix);

	/**
	 * GLKMatrix3GetRow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3GetRow">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix3GetRow(
			@ByValue GLKMatrix3 matrix, int row);

	/**
	 * GLKMatrix3GetColumn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3GetColumn">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix3GetColumn(
			@ByValue GLKMatrix3 matrix, int column);

	/**
	 * GLKMatrix3SetRow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3SetRow">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3SetRow(
			@ByValue GLKMatrix3 matrix, int row, @ByValue GLKVector3 vector);

	/**
	 * GLKMatrix3SetColumn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3SetColumn">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3SetColumn(
			@ByValue GLKMatrix3 matrix, int column, @ByValue GLKVector3 vector);

	/**
	 * GLKMatrix3Transpose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Transpose">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Transpose(
			@ByValue GLKMatrix3 matrix);

	/**
	 * GLKMatrix3Invert</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Invert">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Invert(
			@ByValue GLKMatrix3 matrix, BoolPtr isInvertible);

	/**
	 * GLKMatrix3InvertAndTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3InvertAndTranspose">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3InvertAndTranspose(
			@ByValue GLKMatrix3 matrix, BoolPtr isInvertible);

	/**
	 * GLKMatrix3Multiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Multiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Multiply(
			@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

	/**
	 * GLKMatrix3Add</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Add">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Add(
			@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

	/**
	 * GLKMatrix3Subtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Subtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Subtract(
			@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

	/**
	 * GLKMatrix3Scale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Scale">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Scale(@ByValue GLKMatrix3 matrix,
			float sx, float sy, float sz);

	/**
	 * GLKMatrix3ScaleWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3ScaleWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3ScaleWithVector3(
			@ByValue GLKMatrix3 matrix, @ByValue GLKVector3 scaleVector);

	/**
	 * GLKMatrix3ScaleWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3ScaleWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3ScaleWithVector4(
			@ByValue GLKMatrix3 matrix, @ByValue GLKVector4 scaleVector);

	/**
	 * GLKMatrix3Rotate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3Rotate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Rotate(
			@ByValue GLKMatrix3 matrix, float radians, float x, float y, float z);

	/**
	 * GLKMatrix3RotateWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3RotateWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3RotateWithVector3(
			@ByValue GLKMatrix3 matrix, float radians,
			@ByValue GLKVector3 axisVector);

	/**
	 * GLKMatrix3RotateWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3RotateWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3RotateWithVector4(
			@ByValue GLKMatrix3 matrix, float radians,
			@ByValue GLKVector4 axisVector);

	/**
	 * GLKMatrix3RotateX</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3RotateX">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3RotateX(
			@ByValue GLKMatrix3 matrix, float radians);

	/**
	 * GLKMatrix3RotateY</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3RotateY">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3RotateY(
			@ByValue GLKMatrix3 matrix, float radians);

	/**
	 * GLKMatrix3RotateZ</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3RotateZ">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix3RotateZ(
			@ByValue GLKMatrix3 matrix, float radians);

	/**
	 * GLKMatrix3MultiplyVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MultiplyVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix3MultiplyVector3(
			@ByValue GLKMatrix3 matrixLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKMatrix3MultiplyVector3Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix3/index.html#//apple_ref/c/func/GLKMatrix3MultiplyVector3Array">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native void GLKMatrix3MultiplyVector3Array(
			@ByValue GLKMatrix3 matrix,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKMatrix4Make</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Make">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Make(float m00, float m01,
			float m02, float m03, float m10, float m11, float m12, float m13,
			float m20, float m21, float m22, float m23, float m30, float m31,
			float m32, float m33);

	/**
	 * GLKMatrix4MakeAndTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeAndTranspose">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeAndTranspose(float m00,
			float m01, float m02, float m03, float m10, float m11, float m12,
			float m13, float m20, float m21, float m22, float m23, float m30,
			float m31, float m32, float m33);

	/**
	 * GLKMatrix4MakeWithRows</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeWithRows">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeWithRows(
			@ByValue GLKVector4 row0, @ByValue GLKVector4 row1,
			@ByValue GLKVector4 row2, @ByValue GLKVector4 row3);

	/**
	 * GLKMatrix4MakeWithColumns</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeWithColumns">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeWithColumns(
			@ByValue GLKVector4 column0, @ByValue GLKVector4 column1,
			@ByValue GLKVector4 column2, @ByValue GLKVector4 column3);

	/**
	 * GLKMatrix4MakeWithQuaternion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeWithQuaternion">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeWithQuaternion(
			@ByValue GLKQuaternion quaternion);

	/**
	 * GLKMatrix4MakeTranslation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeTranslation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeTranslation(float tx,
			float ty, float tz);

	/**
	 * GLKMatrix4MakeScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeScale">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeScale(float sx, float sy,
			float sz);

	/**
	 * GLKMatrix4MakeRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeRotation(float radians,
			float x, float y, float z);

	/**
	 * GLKMatrix4MakeXRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeXRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeXRotation(float radians);

	/**
	 * GLKMatrix4MakeYRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeYRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeYRotation(float radians);

	/**
	 * GLKMatrix4MakeZRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeZRotation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeZRotation(float radians);

	/**
	 * GLKMatrix4MakePerspective</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakePerspective">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakePerspective(
			float fovyRadians, float aspect, float nearZ, float farZ);

	/**
	 * GLKMatrix4MakeFrustum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeFrustum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeFrustum(float left,
			float right, float bottom, float top, float nearZ, float farZ);

	/**
	 * GLKMatrix4MakeOrtho</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeOrtho">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeOrtho(float left,
			float right, float bottom, float top, float nearZ, float farZ);

	/**
	 * GLKMatrix4MakeLookAt</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MakeLookAt">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4MakeLookAt(float eyeX,
			float eyeY, float eyeZ, float centerX, float centerY,
			float centerZ, float upX, float upY, float upZ);

	/**
	 * GLKMatrix4GetMatrix3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4GetMatrix3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrix4GetMatrix3(
			@ByValue GLKMatrix4 matrix);

	/**
	 * GLKMatrix4GetMatrix2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4GetMatrix2">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix2 GLKMatrix4GetMatrix2(
			@ByValue GLKMatrix4 matrix);

	/**
	 * GLKMatrix4GetRow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4GetRow">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKMatrix4GetRow(
			@ByValue GLKMatrix4 matrix, int row);

	/**
	 * GLKMatrix4GetColumn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4GetColumn">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKMatrix4GetColumn(
			@ByValue GLKMatrix4 matrix, int column);

	/**
	 * GLKMatrix4SetRow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4SetRow">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4SetRow(
			@ByValue GLKMatrix4 matrix, int row, @ByValue GLKVector4 vector);

	/**
	 * GLKMatrix4SetColumn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4SetColumn">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4SetColumn(
			@ByValue GLKMatrix4 matrix, int column, @ByValue GLKVector4 vector);

	/**
	 * GLKMatrix4Transpose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Transpose">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Transpose(
			@ByValue GLKMatrix4 matrix);

	/**
	 * GLKMatrix4Invert</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Invert">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Invert(
			@ByValue GLKMatrix4 matrix, BoolPtr isInvertible);

	/**
	 * GLKMatrix4InvertAndTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4InvertAndTranspose">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4InvertAndTranspose(
			@ByValue GLKMatrix4 matrix, BoolPtr isInvertible);

	/**
	 * GLKMatrix4Multiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Multiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Multiply(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

	/**
	 * GLKMatrix4Add</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Add">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Add(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

	/**
	 * GLKMatrix4Subtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Subtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Subtract(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

	/**
	 * GLKMatrix4Translate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Translate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Translate(
			@ByValue GLKMatrix4 matrix, float tx, float ty, float tz);

	/**
	 * GLKMatrix4TranslateWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4TranslateWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4TranslateWithVector3(
			@ByValue GLKMatrix4 matrix, @ByValue GLKVector3 translationVector);

	/**
	 * GLKMatrix4TranslateWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4TranslateWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4TranslateWithVector4(
			@ByValue GLKMatrix4 matrix, @ByValue GLKVector4 translationVector);

	/**
	 * GLKMatrix4Scale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Scale">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Scale(@ByValue GLKMatrix4 matrix,
			float sx, float sy, float sz);

	/**
	 * GLKMatrix4ScaleWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4ScaleWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4ScaleWithVector3(
			@ByValue GLKMatrix4 matrix, @ByValue GLKVector3 scaleVector);

	/**
	 * GLKMatrix4ScaleWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4ScaleWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4ScaleWithVector4(
			@ByValue GLKMatrix4 matrix, @ByValue GLKVector4 scaleVector);

	/**
	 * GLKMatrix4Rotate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4Rotate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Rotate(
			@ByValue GLKMatrix4 matrix, float radians, float x, float y, float z);

	/**
	 * GLKMatrix4RotateWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4RotateWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4RotateWithVector3(
			@ByValue GLKMatrix4 matrix, float radians,
			@ByValue GLKVector3 axisVector);

	/**
	 * GLKMatrix4RotateWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4RotateWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4RotateWithVector4(
			@ByValue GLKMatrix4 matrix, float radians,
			@ByValue GLKVector4 axisVector);

	/**
	 * GLKMatrix4RotateX</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4RotateX">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4RotateX(
			@ByValue GLKMatrix4 matrix, float radians);

	/**
	 * GLKMatrix4RotateY</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4RotateY">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4RotateY(
			@ByValue GLKMatrix4 matrix, float radians);

	/**
	 * GLKMatrix4RotateZ</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4RotateZ">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrix4RotateZ(
			@ByValue GLKMatrix4 matrix, float radians);

	/**
	 * GLKMatrix4MultiplyVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix4MultiplyVector3(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKMatrix4MultiplyVector3WithTranslation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector3WithTranslation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix4MultiplyVector3WithTranslation(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKMatrix4MultiplyAndProjectVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyAndProjectVector3">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMatrix4MultiplyAndProjectVector3(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKVector3 vectorRight);

	/**
	 * GLKMatrix4MultiplyVector3Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector3Array">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native void GLKMatrix4MultiplyVector3Array(
			@ByValue GLKMatrix4 matrix,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKMatrix4MultiplyVector3ArrayWithTranslation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector3ArrayWithTranslation">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native void GLKMatrix4MultiplyVector3ArrayWithTranslation(
			@ByValue GLKMatrix4 matrix,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKMatrix4MultiplyAndProjectVector3Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyAndProjectVector3Array">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native void GLKMatrix4MultiplyAndProjectVector3Array(
			@ByValue GLKMatrix4 matrix,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKMatrix4MultiplyVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector4">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector4 GLKMatrix4MultiplyVector4(
			@ByValue GLKMatrix4 matrixLeft, @ByValue GLKVector4 vectorRight);

	/**
	 * GLKMatrix4MultiplyVector4Array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrix4/index.html#//apple_ref/c/func/GLKMatrix4MultiplyVector4Array">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native void GLKMatrix4MultiplyVector4Array(
			@ByValue GLKMatrix4 matrix,
			@UncertainArgument("Options: reference, array Fallback: reference") GLKVector4 vectors,
			@NUInt long vectorCount);

	/**
	 * GLKVector2Make</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Make">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Make(float x, float y);

	/**
	 * GLKVector2Negate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Negate">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Negate(@ByValue GLKVector2 vector);

	/**
	 * GLKVector2Add</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Add">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Add(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2Subtract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Subtract">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Subtract(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2Multiply</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Multiply">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Multiply(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2Divide</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Divide">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Divide(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2AddScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AddScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2AddScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2SubtractScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2SubtractScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2SubtractScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2MultiplyScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2MultiplyScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2MultiplyScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2DivideScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2DivideScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2DivideScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2Maximum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Maximum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Maximum(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2Minimum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Minimum">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Minimum(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2AllEqualToVector2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllEqualToVector2">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllEqualToVector2(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2AllEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllEqualToScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2AllGreaterThanVector2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllGreaterThanVector2">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllGreaterThanVector2(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2AllGreaterThanScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllGreaterThanScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllGreaterThanScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2AllGreaterThanOrEqualToVector2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllGreaterThanOrEqualToVector2">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllGreaterThanOrEqualToVector2(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2AllGreaterThanOrEqualToScalar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2AllGreaterThanOrEqualToScalar">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean GLKVector2AllGreaterThanOrEqualToScalar(
			@ByValue GLKVector2 vector, float value);

	/**
	 * GLKVector2Normalize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Normalize">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Normalize(
			@ByValue GLKVector2 vector);

	/**
	 * GLKVector2DotProduct</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2DotProduct">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector2DotProduct(
			@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

	/**
	 * GLKVector2Length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Length">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector2Length(@ByValue GLKVector2 vector);

	/**
	 * GLKVector2Distance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Distance">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKVector2Distance(
			@ByValue GLKVector2 vectorStart, @ByValue GLKVector2 vectorEnd);

	/**
	 * GLKVector2Lerp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Lerp">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Lerp(
			@ByValue GLKVector2 vectorStart, @ByValue GLKVector2 vectorEnd,
			float t);

	/**
	 * GLKVector2Project</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKVector2/index.html#//apple_ref/c/func/GLKVector2Project">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native GLKVector2 GLKVector2Project(
			@ByValue GLKVector2 vectorToProject,
			@ByValue GLKVector2 projectionVector);

	/**
	 * GLKMatrixStackCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native GLKMatrixStackRef GLKMatrixStackCreate(
			CFAllocatorRef alloc);

	/**
	 * GLKMatrixStackGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long GLKMatrixStackGetTypeID();

	/**
	 * GLKMatrixStackPush</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackPush">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackPush(GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackPop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackPop">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackPop(GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackSize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int GLKMatrixStackSize(GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackLoadMatrix4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackLoadMatrix4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackLoadMatrix4(
			GLKMatrixStackRef stack, @ByValue GLKMatrix4 matrix);

	/**
	 * GLKMatrixStackGetMatrix4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrixStackGetMatrix4(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrixStackGetMatrix3(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix2">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix2 GLKMatrixStackGetMatrix2(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix4Inverse</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix4Inverse">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrixStackGetMatrix4Inverse(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix4InverseTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix4InverseTranspose">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix4 GLKMatrixStackGetMatrix4InverseTranspose(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix3Inverse</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix3Inverse">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrixStackGetMatrix3Inverse(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackGetMatrix3InverseTranspose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackGetMatrix3InverseTranspose">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKMatrix3 GLKMatrixStackGetMatrix3InverseTranspose(
			GLKMatrixStackRef stack);

	/**
	 * GLKMatrixStackMultiplyMatrix4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackMultiplyMatrix4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackMultiplyMatrix4(
			GLKMatrixStackRef stack, @ByValue GLKMatrix4 matrix);

	/**
	 * GLKMatrixStackMultiplyMatrixStack</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackMultiplyMatrixStack">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackMultiplyMatrixStack(
			GLKMatrixStackRef stackLeft, GLKMatrixStackRef stackRight);

	/**
	 * GLKMatrixStackTranslate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackTranslate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackTranslate(GLKMatrixStackRef stack,
			float tx, float ty, float tz);

	/**
	 * GLKMatrixStackTranslateWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackTranslateWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackTranslateWithVector3(
			GLKMatrixStackRef stack, @ByValue GLKVector3 translationVector);

	/**
	 * GLKMatrixStackTranslateWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackTranslateWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackTranslateWithVector4(
			GLKMatrixStackRef stack, @ByValue GLKVector4 translationVector);

	/**
	 * GLKMatrixStackScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackScale">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackScale(GLKMatrixStackRef stack,
			float sx, float sy, float sz);

	/**
	 * GLKMatrixStackScaleWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackScaleWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackScaleWithVector3(
			GLKMatrixStackRef stack, @ByValue GLKVector3 scaleVector);

	/**
	 * GLKMatrixStackScaleWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackScaleWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackScaleWithVector4(
			GLKMatrixStackRef stack, @ByValue GLKVector4 scaleVector);

	/**
	 * GLKMatrixStackRotate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotate(GLKMatrixStackRef stack,
			float radians, float x, float y, float z);

	/**
	 * GLKMatrixStackRotateWithVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotateWithVector3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotateWithVector3(
			GLKMatrixStackRef stack, float radians,
			@ByValue GLKVector3 axisVector);

	/**
	 * GLKMatrixStackRotateWithVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotateWithVector4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotateWithVector4(
			GLKMatrixStackRef stack, float radians,
			@ByValue GLKVector4 axisVector);

	/**
	 * GLKMatrixStackRotateX</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotateX">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotateX(GLKMatrixStackRef stack,
			float radians);

	/**
	 * GLKMatrixStackRotateY</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotateY">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotateY(GLKMatrixStackRef stack,
			float radians);

	/**
	 * GLKMatrixStackRotateZ</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMatrixStack/index.html#//apple_ref/c/func/GLKMatrixStackRotateZ">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void GLKMatrixStackRotateZ(GLKMatrixStackRef stack,
			float radians);

	/**
	 * GLKMathDegreesToRadians</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/GLKMathDegreesToRadians">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKMathDegreesToRadians(float degrees);

	/**
	 * GLKMathRadiansToDegrees</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/GLKMathRadiansToDegrees">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native float GLKMathRadiansToDegrees(float radians);

	/**
	 * GLKMathProject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/GLKMathProject">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMathProject(@ByValue GLKVector3 object,
			@ByValue GLKMatrix4 model, @ByValue GLKMatrix4 projection,
			IntPtr viewport);

	/**
	 * GLKMathUnproject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/GLKMathUnproject">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native GLKVector3 GLKMathUnproject(
			@ByValue GLKVector3 window, @ByValue GLKMatrix4 model,
			@ByValue GLKMatrix4 projection, IntPtr viewport, BoolPtr success);

	/**
	 * NSStringFromGLKMatrix2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKMatrix2">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKMatrix2(
			@ByValue GLKMatrix2 matrix);

	/**
	 * NSStringFromGLKMatrix3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKMatrix3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKMatrix3(
			@ByValue GLKMatrix3 matrix);

	/**
	 * NSStringFromGLKMatrix4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKMatrix4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKMatrix4(
			@ByValue GLKMatrix4 matrix);

	/**
	 * NSStringFromGLKVector2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKVector2">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKVector2(
			@ByValue GLKVector2 vector);

	/**
	 * NSStringFromGLKVector3</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKVector3">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKVector3(
			@ByValue GLKVector3 vector);

	/**
	 * NSStringFromGLKVector4</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKVector4">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKVector4(
			@ByValue GLKVector4 vector);

	/**
	 * NSStringFromGLKQuaternion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKMathUtils/index.html#//apple_ref/c/func/NSStringFromGLKQuaternion">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGLKQuaternion(
			@ByValue GLKQuaternion quaternion);

	@Generated
	@CVariable()
	@ByValue
	public static native GLKQuaternion GLKQuaternionIdentity();

	@Generated
	@CVariable()
	@ByValue
	public static native GLKMatrix3 GLKMatrix3Identity();

	@Generated
	@CVariable()
	@ByValue
	public static native GLKMatrix4 GLKMatrix4Identity();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderApplyPremultiplication();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderGenerateMipmaps();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderOriginBottomLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderGrayscaleAsAlpha();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderSRGB();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GLKTextureLoaderGLErrorKey();

	@Generated
	@CFunction
	@ByValue
	public static native GLKVertexAttributeParameters GLKVertexAttributeParametersFromModelIO(@NUInt long vertexFormat);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGLKModelErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGLKModelErrorKey();
}
