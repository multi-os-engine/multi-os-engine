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

package apple.glkit.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.glkit.opaque.GLKMatrixStackRef;
import apple.glkit.struct.GLKMatrix2;
import apple.glkit.struct.GLKMatrix3;
import apple.glkit.struct.GLKMatrix4;
import apple.glkit.struct.GLKQuaternion;
import apple.glkit.struct.GLKVector2;
import apple.glkit.struct.GLKVector3;
import apple.glkit.struct.GLKVector4;
import apple.glkit.struct.GLKVertexAttributeParameters;
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

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Make(float x, float y, float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Negate(@ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Add(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Subtract(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Multiply(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Divide(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3AddScalar(@ByValue GLKVector3 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3SubtractScalar(@ByValue GLKVector3 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3MultiplyScalar(@ByValue GLKVector3 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3DivideScalar(@ByValue GLKVector3 vector, float value);

    /**
     * Returns a vector whose elements are the larger of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Maximum(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    /**
     * Returns a vector whose elements are the smaller of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Minimum(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    /**
     * Returns true if all of the first vector's elements are equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllEqualToVector3(@ByValue GLKVector3 vectorLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Returns true if all of the vector's elements are equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllEqualToScalar(@ByValue GLKVector3 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllGreaterThanVector3(@ByValue GLKVector3 vectorLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllGreaterThanScalar(@ByValue GLKVector3 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than or equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllGreaterThanOrEqualToVector3(@ByValue GLKVector3 vectorLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than or equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector3AllGreaterThanOrEqualToScalar(@ByValue GLKVector3 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Normalize(@ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector3DotProduct(@ByValue GLKVector3 vectorLeft, @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector3Length(@ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector3Distance(@ByValue GLKVector3 vectorStart, @ByValue GLKVector3 vectorEnd);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Lerp(@ByValue GLKVector3 vectorStart, @ByValue GLKVector3 vectorEnd,
            float t);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3CrossProduct(@ByValue GLKVector3 vectorLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Project the vector, vectorToProject, onto the vector, projectionVector.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKVector3Project(@ByValue GLKVector3 vectorToProject,
            @ByValue GLKVector3 projectionVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Make(float x, float y, float z, float w);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4MakeWithVector3(@ByValue GLKVector3 vector, float w);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Negate(@ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Add(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Subtract(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Multiply(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Divide(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4AddScalar(@ByValue GLKVector4 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4SubtractScalar(@ByValue GLKVector4 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4MultiplyScalar(@ByValue GLKVector4 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4DivideScalar(@ByValue GLKVector4 vector, float value);

    /**
     * Returns a vector whose elements are the larger of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Maximum(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    /**
     * Returns a vector whose elements are the smaller of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Minimum(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    /**
     * Returns true if all of the first vector's elements are equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllEqualToVector4(@ByValue GLKVector4 vectorLeft,
            @ByValue GLKVector4 vectorRight);

    /**
     * Returns true if all of the vector's elements are equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllEqualToScalar(@ByValue GLKVector4 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllGreaterThanVector4(@ByValue GLKVector4 vectorLeft,
            @ByValue GLKVector4 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllGreaterThanScalar(@ByValue GLKVector4 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than or equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllGreaterThanOrEqualToVector4(@ByValue GLKVector4 vectorLeft,
            @ByValue GLKVector4 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than or equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector4AllGreaterThanOrEqualToScalar(@ByValue GLKVector4 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Normalize(@ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector4DotProduct(@ByValue GLKVector4 vectorLeft, @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector4Length(@ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector4Distance(@ByValue GLKVector4 vectorStart, @ByValue GLKVector4 vectorEnd);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Lerp(@ByValue GLKVector4 vectorStart, @ByValue GLKVector4 vectorEnd,
            float t);

    /**
     * Performs a 3D cross product. The last component of the resulting cross product will be zeroed out.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4CrossProduct(@ByValue GLKVector4 vectorLeft,
            @ByValue GLKVector4 vectorRight);

    /**
     * Project the vector, vectorToProject, onto the vector, projectionVector.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKVector4Project(@ByValue GLKVector4 vectorToProject,
            @ByValue GLKVector4 projectionVector);

    /**
     * x, y, and z represent the imaginary values.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMake(float x, float y, float z, float w);

    /**
     * vector represents the imaginary values.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMakeWithVector3(@ByValue GLKVector3 vector, float scalar);

    /**
     * Assumes the axis is already normalized.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMakeWithAngleAndAxis(float radians, float x, float y, float z);

    /**
     * Assumes the axis is already normalized.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMakeWithAngleAndVector3Axis(float radians,
            @ByValue GLKVector3 axisVector);

    @Generated
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMakeWithMatrix3(@ByValue GLKMatrix3 matrix);

    @Generated
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMakeWithMatrix4(@ByValue GLKMatrix4 matrix);

    /**
     * Calculate and return the angle component of the angle and axis form.
     */
    @Generated
    @CFunction
    public static native float GLKQuaternionAngle(@ByValue GLKQuaternion quaternion);

    /**
     * Calculate and return the axis component of the angle and axis form.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKVector3 GLKQuaternionAxis(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionAdd(@ByValue GLKQuaternion quaternionLeft,
            @ByValue GLKQuaternion quaternionRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionSubtract(@ByValue GLKQuaternion quaternionLeft,
            @ByValue GLKQuaternion quaternionRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionMultiply(@ByValue GLKQuaternion quaternionLeft,
            @ByValue GLKQuaternion quaternionRight);

    @Generated
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionSlerp(@ByValue GLKQuaternion quaternionStart,
            @ByValue GLKQuaternion quaternionEnd, float t);

    @Generated
    @Inline
    @CFunction
    public static native float GLKQuaternionLength(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionConjugate(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionInvert(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKQuaternion GLKQuaternionNormalize(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKQuaternionRotateVector3(@ByValue GLKQuaternion quaternion,
            @ByValue GLKVector3 vector);

    @Generated
    @CFunction
    public static native void GLKQuaternionRotateVector3Array(@ByValue GLKQuaternion quaternion,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
            @NUInt long vectorCount);

    /**
     * The fourth component of the vector is ignored when calculating the rotation.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKQuaternionRotateVector4(@ByValue GLKQuaternion quaternion,
            @ByValue GLKVector4 vector);

    @Generated
    @CFunction
    public static native void GLKQuaternionRotateVector4Array(@ByValue GLKQuaternion quaternion,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector4 vectors,
            @NUInt long vectorCount);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Make(float m00, float m01, float m02, float m10, float m11, float m12,
            float m20, float m21, float m22);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeAndTranspose(float m00, float m01, float m02, float m10, float m11,
            float m12, float m20, float m21, float m22);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeWithRows(@ByValue GLKVector3 row0, @ByValue GLKVector3 row1,
            @ByValue GLKVector3 row2);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeWithColumns(@ByValue GLKVector3 column0, @ByValue GLKVector3 column1,
            @ByValue GLKVector3 column2);

    /**
     * The quaternion will be normalized before conversion.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeWithQuaternion(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeScale(float sx, float sy, float sz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeRotation(float radians, float x, float y, float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeXRotation(float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeYRotation(float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3MakeZRotation(float radians);

    /**
     * Returns the upper left 2x2 portion of the 3x3 matrix.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix2 GLKMatrix3GetMatrix2(@ByValue GLKMatrix3 matrix);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix3GetRow(@ByValue GLKMatrix3 matrix, int row);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix3GetColumn(@ByValue GLKMatrix3 matrix, int column);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3SetRow(@ByValue GLKMatrix3 matrix, int row, @ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3SetColumn(@ByValue GLKMatrix3 matrix, int column,
            @ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Transpose(@ByValue GLKMatrix3 matrix);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Invert(@ByValue GLKMatrix3 matrix, BoolPtr isInvertible);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3InvertAndTranspose(@ByValue GLKMatrix3 matrix, BoolPtr isInvertible);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Multiply(@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Add(@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Subtract(@ByValue GLKMatrix3 matrixLeft, @ByValue GLKMatrix3 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Scale(@ByValue GLKMatrix3 matrix, float sx, float sy, float sz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3ScaleWithVector3(@ByValue GLKMatrix3 matrix,
            @ByValue GLKVector3 scaleVector);

    /**
     * The last component of the GLKVector4, scaleVector, is ignored.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3ScaleWithVector4(@ByValue GLKMatrix3 matrix,
            @ByValue GLKVector4 scaleVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3Rotate(@ByValue GLKMatrix3 matrix, float radians, float x, float y,
            float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3RotateWithVector3(@ByValue GLKMatrix3 matrix, float radians,
            @ByValue GLKVector3 axisVector);

    /**
     * The last component of the GLKVector4, axisVector, is ignored.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3RotateWithVector4(@ByValue GLKMatrix3 matrix, float radians,
            @ByValue GLKVector4 axisVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3RotateX(@ByValue GLKMatrix3 matrix, float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3RotateY(@ByValue GLKMatrix3 matrix, float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix3RotateZ(@ByValue GLKMatrix3 matrix, float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix3MultiplyVector3(@ByValue GLKMatrix3 matrixLeft,
            @ByValue GLKVector3 vectorRight);

    @Generated
    @Inline
    @CFunction
    public static native void GLKMatrix3MultiplyVector3Array(@ByValue GLKMatrix3 matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
            @NUInt long vectorCount);

    /**
     * m30, m31, and m32 correspond to the translation values tx, ty, tz, respectively.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Make(float m00, float m01, float m02, float m03, float m10, float m11,
            float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32,
            float m33);

    /**
     * m03, m13, and m23 correspond to the translation values tx, ty, tz, respectively.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeAndTranspose(float m00, float m01, float m02, float m03, float m10,
            float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31,
            float m32, float m33);

    /**
     * row0, row1, and row2's last component should correspond to the translation values tx, ty, and tz, respectively.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeWithRows(@ByValue GLKVector4 row0, @ByValue GLKVector4 row1,
            @ByValue GLKVector4 row2, @ByValue GLKVector4 row3);

    /**
     * column3's first three components should correspond to the translation values tx, ty, and tz.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeWithColumns(@ByValue GLKVector4 column0, @ByValue GLKVector4 column1,
            @ByValue GLKVector4 column2, @ByValue GLKVector4 column3);

    /**
     * The quaternion will be normalized before conversion.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeWithQuaternion(@ByValue GLKQuaternion quaternion);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeTranslation(float tx, float ty, float tz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeScale(float sx, float sy, float sz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeRotation(float radians, float x, float y, float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeXRotation(float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeYRotation(float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeZRotation(float radians);

    /**
     * Equivalent to gluPerspective.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakePerspective(float fovyRadians, float aspect, float nearZ, float farZ);

    /**
     * Equivalent to glFrustum.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeFrustum(float left, float right, float bottom, float top, float nearZ,
            float farZ);

    /**
     * Equivalent to glOrtho.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeOrtho(float left, float right, float bottom, float top, float nearZ,
            float farZ);

    /**
     * Equivalent to gluLookAt.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4MakeLookAt(float eyeX, float eyeY, float eyeZ, float centerX,
            float centerY, float centerZ, float upX, float upY, float upZ);

    /**
     * Returns the upper left 3x3 portion of the 4x4 matrix.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrix4GetMatrix3(@ByValue GLKMatrix4 matrix);

    /**
     * Returns the upper left 2x2 portion of the 4x4 matrix.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix2 GLKMatrix4GetMatrix2(@ByValue GLKMatrix4 matrix);

    /**
     * GLKMatrix4GetRow returns vectors for rows 0, 1, and 2 whose last component will be the translation value tx, ty, and tz, respectively.
     * Valid row values range from 0 to 3, inclusive.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKMatrix4GetRow(@ByValue GLKMatrix4 matrix, int row);

    /**
     * GLKMatrix4GetColumn returns a vector for column 3 whose first three components will be the translation values tx, ty, and tz.
     * Valid column values range from 0 to 3, inclusive.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKMatrix4GetColumn(@ByValue GLKMatrix4 matrix, int column);

    /**
     * GLKMatrix4SetRow expects that the vector for row 0, 1, and 2 will have a translation value as its last component.
     * Valid row values range from 0 to 3, inclusive.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4SetRow(@ByValue GLKMatrix4 matrix, int row, @ByValue GLKVector4 vector);

    /**
     * GLKMatrix4SetColumn expects that the vector for column 3 will contain the translation values tx, ty, and tz as its first three components, respectively.
     * Valid column values range from 0 to 3, inclusive.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4SetColumn(@ByValue GLKMatrix4 matrix, int column,
            @ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Transpose(@ByValue GLKMatrix4 matrix);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Invert(@ByValue GLKMatrix4 matrix, BoolPtr isInvertible);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4InvertAndTranspose(@ByValue GLKMatrix4 matrix, BoolPtr isInvertible);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Multiply(@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Add(@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Subtract(@ByValue GLKMatrix4 matrixLeft, @ByValue GLKMatrix4 matrixRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Translate(@ByValue GLKMatrix4 matrix, float tx, float ty, float tz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4TranslateWithVector3(@ByValue GLKMatrix4 matrix,
            @ByValue GLKVector3 translationVector);

    /**
     * The last component of the GLKVector4, translationVector, is ignored.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4TranslateWithVector4(@ByValue GLKMatrix4 matrix,
            @ByValue GLKVector4 translationVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Scale(@ByValue GLKMatrix4 matrix, float sx, float sy, float sz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4ScaleWithVector3(@ByValue GLKMatrix4 matrix,
            @ByValue GLKVector3 scaleVector);

    /**
     * The last component of the GLKVector4, scaleVector, is ignored.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4ScaleWithVector4(@ByValue GLKMatrix4 matrix,
            @ByValue GLKVector4 scaleVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4Rotate(@ByValue GLKMatrix4 matrix, float radians, float x, float y,
            float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4RotateWithVector3(@ByValue GLKMatrix4 matrix, float radians,
            @ByValue GLKVector3 axisVector);

    /**
     * The last component of the GLKVector4, axisVector, is ignored.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4RotateWithVector4(@ByValue GLKMatrix4 matrix, float radians,
            @ByValue GLKVector4 axisVector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4RotateX(@ByValue GLKMatrix4 matrix, float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4RotateY(@ByValue GLKMatrix4 matrix, float radians);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrix4RotateZ(@ByValue GLKMatrix4 matrix, float radians);

    /**
     * Assumes 0 in the w component.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix4MultiplyVector3(@ByValue GLKMatrix4 matrixLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Assumes 1 in the w component.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix4MultiplyVector3WithTranslation(@ByValue GLKMatrix4 matrixLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Assumes 1 in the w component and divides the resulting vector by w before returning.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMatrix4MultiplyAndProjectVector3(@ByValue GLKMatrix4 matrixLeft,
            @ByValue GLKVector3 vectorRight);

    /**
     * Assumes 0 in the w component.
     */
    @Generated
    @Inline
    @CFunction
    public static native void GLKMatrix4MultiplyVector3Array(@ByValue GLKMatrix4 matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
            @NUInt long vectorCount);

    /**
     * Assumes 1 in the w component.
     */
    @Generated
    @Inline
    @CFunction
    public static native void GLKMatrix4MultiplyVector3ArrayWithTranslation(@ByValue GLKMatrix4 matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
            @NUInt long vectorCount);

    /**
     * Assumes 1 in the w component and divides the resulting vector by w before returning.
     */
    @Generated
    @Inline
    @CFunction
    public static native void GLKMatrix4MultiplyAndProjectVector3Array(@ByValue GLKMatrix4 matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector3 vectors,
            @NUInt long vectorCount);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 GLKMatrix4MultiplyVector4(@ByValue GLKMatrix4 matrixLeft,
            @ByValue GLKVector4 vectorRight);

    @Generated
    @Inline
    @CFunction
    public static native void GLKMatrix4MultiplyVector4Array(@ByValue GLKMatrix4 matrix,
            @UncertainArgument("Options: reference, array Fallback: reference") GLKVector4 vectors,
            @NUInt long vectorCount);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Make(float x, float y);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Negate(@ByValue GLKVector2 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Add(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Subtract(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Multiply(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Divide(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2AddScalar(@ByValue GLKVector2 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2SubtractScalar(@ByValue GLKVector2 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2MultiplyScalar(@ByValue GLKVector2 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2DivideScalar(@ByValue GLKVector2 vector, float value);

    /**
     * Returns a vector whose elements are the larger of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Maximum(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    /**
     * Returns a vector whose elements are the smaller of the corresponding elements of the vector arguments.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Minimum(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    /**
     * Returns true if all of the first vector's elements are equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllEqualToVector2(@ByValue GLKVector2 vectorLeft,
            @ByValue GLKVector2 vectorRight);

    /**
     * Returns true if all of the vector's elements are equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllEqualToScalar(@ByValue GLKVector2 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllGreaterThanVector2(@ByValue GLKVector2 vectorLeft,
            @ByValue GLKVector2 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllGreaterThanScalar(@ByValue GLKVector2 vector, float value);

    /**
     * Returns true if all of the first vector's elements are greater than or equal to all of the second vector's arguments.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllGreaterThanOrEqualToVector2(@ByValue GLKVector2 vectorLeft,
            @ByValue GLKVector2 vectorRight);

    /**
     * Returns true if all of the vector's elements are greater than or equal to the provided value.
     */
    @Generated
    @Inline
    @CFunction
    public static native boolean GLKVector2AllGreaterThanOrEqualToScalar(@ByValue GLKVector2 vector, float value);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Normalize(@ByValue GLKVector2 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector2DotProduct(@ByValue GLKVector2 vectorLeft, @ByValue GLKVector2 vectorRight);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector2Length(@ByValue GLKVector2 vector);

    @Generated
    @Inline
    @CFunction
    public static native float GLKVector2Distance(@ByValue GLKVector2 vectorStart, @ByValue GLKVector2 vectorEnd);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Lerp(@ByValue GLKVector2 vectorStart, @ByValue GLKVector2 vectorEnd,
            float t);

    /**
     * Project the vector, vectorToProject, onto the vector, projectionVector.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector2 GLKVector2Project(@ByValue GLKVector2 vectorToProject,
            @ByValue GLKVector2 projectionVector);

    /**
     * CFType GLKMatrixStack creation routine. Pass NULL or kCFAllocatorDefault to use the current default
     * allocator. A newly created stack is initialized with the identity matrix.
     */
    @Generated
    @CFunction
    public static native GLKMatrixStackRef GLKMatrixStackCreate(CFAllocatorRef alloc);

    /**
     * Returns the type identifier for the GLKMatrixStack opaque type.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long GLKMatrixStackGetTypeID();

    /**
     * Pushes all of the matrices down one level and copies the topmost matrix.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackPush(GLKMatrixStackRef stack);

    /**
     * Pops the topmost matrix off of the stack, moving the rest of the matrices up one level.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackPop(GLKMatrixStackRef stack);

    /**
     * Returns the number of matrices currently on the stack.
     */
    @Generated
    @CFunction
    public static native int GLKMatrixStackSize(GLKMatrixStackRef stack);

    /**
     * Replaces the topmost matrix with the matrix provided.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackLoadMatrix4(GLKMatrixStackRef stack, @ByValue GLKMatrix4 matrix);

    /**
     * Returns the 4x4 matrix currently residing on top of the stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrixStackGetMatrix4(GLKMatrixStackRef stack);

    /**
     * Returns the upper left 3x3 portion of the matrix currently residing on top of the stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrixStackGetMatrix3(GLKMatrixStackRef stack);

    /**
     * Returns the upper left 2x2 portion of the matrix currently residing on top of the stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix2 GLKMatrixStackGetMatrix2(GLKMatrixStackRef stack);

    /**
     * Calculate and return the inverse matrix from the matrix currently residing on top of stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrixStackGetMatrix4Inverse(GLKMatrixStackRef stack);

    /**
     * Calculate and return the inverse transpose matrix from the matrix currently residing on top of stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 GLKMatrixStackGetMatrix4InverseTranspose(GLKMatrixStackRef stack);

    /**
     * Calculate and return the upper left 3x3 inverse matrix from the matrix currently residing on top of stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrixStackGetMatrix3Inverse(GLKMatrixStackRef stack);

    /**
     * Calculate and return the upper left 3x3 inverse transpose matrix from the matrix currently residing on top of stack.
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix3 GLKMatrixStackGetMatrix3InverseTranspose(GLKMatrixStackRef stack);

    /**
     * Multiply the topmost matrix with the matrix provided.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackMultiplyMatrix4(GLKMatrixStackRef stack, @ByValue GLKMatrix4 matrix);

    /**
     * Multiply the topmost matrix of the stackLeft with the topmost matrix of stackRight and store in stackLeft.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackMultiplyMatrixStack(GLKMatrixStackRef stackLeft,
            GLKMatrixStackRef stackRight);

    /**
     * Translate the topmost matrix.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackTranslate(GLKMatrixStackRef stack, float tx, float ty, float tz);

    @Generated
    @CFunction
    public static native void GLKMatrixStackTranslateWithVector3(GLKMatrixStackRef stack,
            @ByValue GLKVector3 translationVector);

    @Generated
    @CFunction
    public static native void GLKMatrixStackTranslateWithVector4(GLKMatrixStackRef stack,
            @ByValue GLKVector4 translationVector);

    /**
     * Scale the topmost matrix.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackScale(GLKMatrixStackRef stack, float sx, float sy, float sz);

    @Generated
    @CFunction
    public static native void GLKMatrixStackScaleWithVector3(GLKMatrixStackRef stack, @ByValue GLKVector3 scaleVector);

    @Generated
    @CFunction
    public static native void GLKMatrixStackScaleWithVector4(GLKMatrixStackRef stack, @ByValue GLKVector4 scaleVector);

    /**
     * Rotate the topmost matrix about the specified axis.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackRotate(GLKMatrixStackRef stack, float radians, float x, float y, float z);

    @Generated
    @CFunction
    public static native void GLKMatrixStackRotateWithVector3(GLKMatrixStackRef stack, float radians,
            @ByValue GLKVector3 axisVector);

    @Generated
    @CFunction
    public static native void GLKMatrixStackRotateWithVector4(GLKMatrixStackRef stack, float radians,
            @ByValue GLKVector4 axisVector);

    /**
     * Rotate the topmost matrix about the x, y, or z axis.
     */
    @Generated
    @CFunction
    public static native void GLKMatrixStackRotateX(GLKMatrixStackRef stack, float radians);

    @Generated
    @CFunction
    public static native void GLKMatrixStackRotateY(GLKMatrixStackRef stack, float radians);

    @Generated
    @CFunction
    public static native void GLKMatrixStackRotateZ(GLKMatrixStackRef stack, float radians);

    @Generated
    @Inline
    @CFunction
    public static native float GLKMathDegreesToRadians(float degrees);

    @Generated
    @Inline
    @CFunction
    public static native float GLKMathRadiansToDegrees(float radians);

    @Generated
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMathProject(@ByValue GLKVector3 object, @ByValue GLKMatrix4 model,
            @ByValue GLKMatrix4 projection, IntPtr viewport);

    @Generated
    @CFunction
    @ByValue
    public static native GLKVector3 GLKMathUnproject(@ByValue GLKVector3 window, @ByValue GLKMatrix4 model,
            @ByValue GLKMatrix4 projection, IntPtr viewport, BoolPtr success);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKMatrix2(@ByValue GLKMatrix2 matrix);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKMatrix3(@ByValue GLKMatrix3 matrix);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKMatrix4(@ByValue GLKMatrix4 matrix);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKVector2(@ByValue GLKVector2 vector);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKVector3(@ByValue GLKVector3 vector);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKVector4(@ByValue GLKVector4 vector);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromGLKQuaternion(@ByValue GLKQuaternion quaternion);

    /**
     * @struct GLKVertexAttributeParametersFromModelIO
     * @abstract Returns parameters to use in a call to glVertexAttribPointer given a MDLVertexFormat
     */
    @Generated
    @CFunction
    @ByValue
    public static native GLKVertexAttributeParameters GLKVertexAttributeParametersFromModelIO(@NUInt long vertexFormat);

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

    /**
     * @constant kGLKModelErrorDomain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kGLKModelErrorDomain();

    /**
     * @constant kGLKModelErrorKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kGLKModelErrorKey();

    /**
     * Dictionary keys for texture loader properties
     * GLKTextureLoaderApplyPremultiplication - A boolean NSNumber.
     * Non-alpha channels are premultiplied by corresponding alpha channel values.
     * For compressed formats, this option must be omitted, or false.
     * False by default.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderApplyPremultiplication();

    /**
     * GLKTextureLoaderGenerateMipmaps - A boolean NSNumber
     * Generates all levels of mipmaps for the current image being loaded as a texture.
     * Generates mipmap levels for all faces when used with cube maps.
     * Sets GL_TEXTURE_MIN_FILTER parameter to GL_LINEAR_MIPMAP_LINEAR when true.
     * False by default. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderGenerateMipmaps();

    /**
     * GLKTextureLoaderOriginBottomLeft - A boolean NSNumber.
     * Transform image data to match OpenGL's bottom left orientation specification.
     * False by default. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderOriginBottomLeft();

    /**
     * GLKTextureLoaderGrayscaleAsAlpha - A boolean NSNumber.
     * If true, a single channel grayscale image is loaded as GL_ALPHA.
     * If false, it will be loaded as GL_LUMINANCE.
     * Has no effect on non-grayscale images and on OS X.
     * False by default.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderGrayscaleAsAlpha();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderSRGB();

    /**
     * Error domain for GLKTextureLoader
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderErrorDomain();

    /**
     * Error keys for obtaining more error information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GLKTextureLoaderGLErrorKey();
}
