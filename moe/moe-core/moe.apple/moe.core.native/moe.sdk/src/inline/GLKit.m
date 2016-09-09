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

#import <GLKit/GLKMathTypes.h>
#import <GLKit/GLKMathUtils.h>
#import <GLKit/GLKMatrix3.h>
#import <GLKit/GLKMatrix4.h>
#import <GLKit/GLKQuaternion.h>
#import <GLKit/GLKVector2.h>
#import <GLKit/GLKVector3.h>
#import <GLKit/GLKVector4.h>
#import <sys/_types/_size_t.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT GLKVector3 __natj_inline_GLKVector3Make(float x, float y, float z) {
	return GLKVector3Make(x, y, z);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Negate(GLKVector3 vector) {
	return GLKVector3Negate(vector);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Add(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Add(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Subtract(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Subtract(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Multiply(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Multiply(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Divide(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Divide(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3AddScalar(GLKVector3 vector, float value) {
	return GLKVector3AddScalar(vector, value);
}

EXPORT GLKVector3 __natj_inline_GLKVector3SubtractScalar(GLKVector3 vector, float value) {
	return GLKVector3SubtractScalar(vector, value);
}

EXPORT GLKVector3 __natj_inline_GLKVector3MultiplyScalar(GLKVector3 vector, float value) {
	return GLKVector3MultiplyScalar(vector, value);
}

EXPORT GLKVector3 __natj_inline_GLKVector3DivideScalar(GLKVector3 vector, float value) {
	return GLKVector3DivideScalar(vector, value);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Maximum(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Maximum(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Minimum(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3Minimum(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector3AllEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3AllEqualToVector3(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector3AllEqualToScalar(GLKVector3 vector, float value) {
	return GLKVector3AllEqualToScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector3AllGreaterThanVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3AllGreaterThanVector3(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector3AllGreaterThanScalar(GLKVector3 vector, float value) {
	return GLKVector3AllGreaterThanScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector3AllGreaterThanOrEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3AllGreaterThanOrEqualToVector3(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector3AllGreaterThanOrEqualToScalar(GLKVector3 vector, float value) {
	return GLKVector3AllGreaterThanOrEqualToScalar(vector, value);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Normalize(GLKVector3 vector) {
	return GLKVector3Normalize(vector);
}

EXPORT float __natj_inline_GLKVector3DotProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3DotProduct(vectorLeft, vectorRight);
}

EXPORT float __natj_inline_GLKVector3Length(GLKVector3 vector) {
	return GLKVector3Length(vector);
}

EXPORT float __natj_inline_GLKVector3Distance(GLKVector3 vectorStart, GLKVector3 vectorEnd) {
	return GLKVector3Distance(vectorStart, vectorEnd);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Lerp(GLKVector3 vectorStart, GLKVector3 vectorEnd, float t) {
	return GLKVector3Lerp(vectorStart, vectorEnd, t);
}

EXPORT GLKVector3 __natj_inline_GLKVector3CrossProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
	return GLKVector3CrossProduct(vectorLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKVector3Project(GLKVector3 vectorToProject, GLKVector3 projectionVector) {
	return GLKVector3Project(vectorToProject, projectionVector);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Make(float x, float y, float z, float w) {
	return GLKVector4Make(x, y, z, w);
}

EXPORT GLKVector4 __natj_inline_GLKVector4MakeWithVector3(GLKVector3 vector, float w) {
	return GLKVector4MakeWithVector3(vector, w);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Negate(GLKVector4 vector) {
	return GLKVector4Negate(vector);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Add(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Add(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Subtract(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Subtract(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Multiply(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Multiply(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Divide(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Divide(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4AddScalar(GLKVector4 vector, float value) {
	return GLKVector4AddScalar(vector, value);
}

EXPORT GLKVector4 __natj_inline_GLKVector4SubtractScalar(GLKVector4 vector, float value) {
	return GLKVector4SubtractScalar(vector, value);
}

EXPORT GLKVector4 __natj_inline_GLKVector4MultiplyScalar(GLKVector4 vector, float value) {
	return GLKVector4MultiplyScalar(vector, value);
}

EXPORT GLKVector4 __natj_inline_GLKVector4DivideScalar(GLKVector4 vector, float value) {
	return GLKVector4DivideScalar(vector, value);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Maximum(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Maximum(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Minimum(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4Minimum(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector4AllEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4AllEqualToVector4(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector4AllEqualToScalar(GLKVector4 vector, float value) {
	return GLKVector4AllEqualToScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector4AllGreaterThanVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4AllGreaterThanVector4(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector4AllGreaterThanScalar(GLKVector4 vector, float value) {
	return GLKVector4AllGreaterThanScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector4AllGreaterThanOrEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4AllGreaterThanOrEqualToVector4(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector4AllGreaterThanOrEqualToScalar(GLKVector4 vector, float value) {
	return GLKVector4AllGreaterThanOrEqualToScalar(vector, value);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Normalize(GLKVector4 vector) {
	return GLKVector4Normalize(vector);
}

EXPORT float __natj_inline_GLKVector4DotProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4DotProduct(vectorLeft, vectorRight);
}

EXPORT float __natj_inline_GLKVector4Length(GLKVector4 vector) {
	return GLKVector4Length(vector);
}

EXPORT float __natj_inline_GLKVector4Distance(GLKVector4 vectorStart, GLKVector4 vectorEnd) {
	return GLKVector4Distance(vectorStart, vectorEnd);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Lerp(GLKVector4 vectorStart, GLKVector4 vectorEnd, float t) {
	return GLKVector4Lerp(vectorStart, vectorEnd, t);
}

EXPORT GLKVector4 __natj_inline_GLKVector4CrossProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
	return GLKVector4CrossProduct(vectorLeft, vectorRight);
}

EXPORT GLKVector4 __natj_inline_GLKVector4Project(GLKVector4 vectorToProject, GLKVector4 projectionVector) {
	return GLKVector4Project(vectorToProject, projectionVector);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionMake(float x, float y, float z, float w) {
	return GLKQuaternionMake(x, y, z, w);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionMakeWithVector3(GLKVector3 vector, float scalar) {
	return GLKQuaternionMakeWithVector3(vector, scalar);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionMakeWithAngleAndAxis(float radians, float x, float y, float z) {
	return GLKQuaternionMakeWithAngleAndAxis(radians, x, y, z);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionMakeWithAngleAndVector3Axis(float radians, GLKVector3 axisVector) {
	return GLKQuaternionMakeWithAngleAndVector3Axis(radians, axisVector);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionAdd(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
	return GLKQuaternionAdd(quaternionLeft, quaternionRight);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionSubtract(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
	return GLKQuaternionSubtract(quaternionLeft, quaternionRight);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionMultiply(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
	return GLKQuaternionMultiply(quaternionLeft, quaternionRight);
}

EXPORT float __natj_inline_GLKQuaternionLength(GLKQuaternion quaternion) {
	return GLKQuaternionLength(quaternion);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionConjugate(GLKQuaternion quaternion) {
	return GLKQuaternionConjugate(quaternion);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionInvert(GLKQuaternion quaternion) {
	return GLKQuaternionInvert(quaternion);
}

EXPORT GLKQuaternion __natj_inline_GLKQuaternionNormalize(GLKQuaternion quaternion) {
	return GLKQuaternionNormalize(quaternion);
}

EXPORT GLKVector3 __natj_inline_GLKQuaternionRotateVector3(GLKQuaternion quaternion, GLKVector3 vector) {
	return GLKQuaternionRotateVector3(quaternion, vector);
}

EXPORT GLKVector4 __natj_inline_GLKQuaternionRotateVector4(GLKQuaternion quaternion, GLKVector4 vector) {
	return GLKQuaternionRotateVector4(quaternion, vector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Make(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
	return GLKMatrix3Make(m00, m01, m02, m10, m11, m12, m20, m21, m22);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeAndTranspose(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
	return GLKMatrix3MakeAndTranspose(m00, m01, m02, m10, m11, m12, m20, m21, m22);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeWithRows(GLKVector3 row0, GLKVector3 row1, GLKVector3 row2) {
	return GLKMatrix3MakeWithRows(row0, row1, row2);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeWithColumns(GLKVector3 column0, GLKVector3 column1, GLKVector3 column2) {
	return GLKMatrix3MakeWithColumns(column0, column1, column2);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeWithQuaternion(GLKQuaternion quaternion) {
	return GLKMatrix3MakeWithQuaternion(quaternion);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeScale(float sx, float sy, float sz) {
	return GLKMatrix3MakeScale(sx, sy, sz);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeRotation(float radians, float x, float y, float z) {
	return GLKMatrix3MakeRotation(radians, x, y, z);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeXRotation(float radians) {
	return GLKMatrix3MakeXRotation(radians);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeYRotation(float radians) {
	return GLKMatrix3MakeYRotation(radians);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3MakeZRotation(float radians) {
	return GLKMatrix3MakeZRotation(radians);
}

EXPORT GLKMatrix2 __natj_inline_GLKMatrix3GetMatrix2(GLKMatrix3 matrix) {
	return GLKMatrix3GetMatrix2(matrix);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix3GetRow(GLKMatrix3 matrix, int row) {
	return GLKMatrix3GetRow(matrix, row);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix3GetColumn(GLKMatrix3 matrix, int column) {
	return GLKMatrix3GetColumn(matrix, column);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3SetRow(GLKMatrix3 matrix, int row, GLKVector3 vector) {
	return GLKMatrix3SetRow(matrix, row, vector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3SetColumn(GLKMatrix3 matrix, int column, GLKVector3 vector) {
	return GLKMatrix3SetColumn(matrix, column, vector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Transpose(GLKMatrix3 matrix) {
	return GLKMatrix3Transpose(matrix);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Multiply(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
	return GLKMatrix3Multiply(matrixLeft, matrixRight);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Add(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
	return GLKMatrix3Add(matrixLeft, matrixRight);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Subtract(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
	return GLKMatrix3Subtract(matrixLeft, matrixRight);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Scale(GLKMatrix3 matrix, float sx, float sy, float sz) {
	return GLKMatrix3Scale(matrix, sx, sy, sz);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3ScaleWithVector3(GLKMatrix3 matrix, GLKVector3 scaleVector) {
	return GLKMatrix3ScaleWithVector3(matrix, scaleVector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3ScaleWithVector4(GLKMatrix3 matrix, GLKVector4 scaleVector) {
	return GLKMatrix3ScaleWithVector4(matrix, scaleVector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3Rotate(GLKMatrix3 matrix, float radians, float x, float y, float z) {
	return GLKMatrix3Rotate(matrix, radians, x, y, z);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3RotateWithVector3(GLKMatrix3 matrix, float radians, GLKVector3 axisVector) {
	return GLKMatrix3RotateWithVector3(matrix, radians, axisVector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3RotateWithVector4(GLKMatrix3 matrix, float radians, GLKVector4 axisVector) {
	return GLKMatrix3RotateWithVector4(matrix, radians, axisVector);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3RotateX(GLKMatrix3 matrix, float radians) {
	return GLKMatrix3RotateX(matrix, radians);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3RotateY(GLKMatrix3 matrix, float radians) {
	return GLKMatrix3RotateY(matrix, radians);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix3RotateZ(GLKMatrix3 matrix, float radians) {
	return GLKMatrix3RotateZ(matrix, radians);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix3MultiplyVector3(GLKMatrix3 matrixLeft, GLKVector3 vectorRight) {
	return GLKMatrix3MultiplyVector3(matrixLeft, vectorRight);
}

EXPORT void __natj_inline_GLKMatrix3MultiplyVector3Array(GLKMatrix3 matrix, GLKVector3 * vectors, size_t vectorCount) {
	GLKMatrix3MultiplyVector3Array(matrix, vectors, vectorCount);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Make(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
	return GLKMatrix4Make(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeAndTranspose(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
	return GLKMatrix4MakeAndTranspose(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeWithRows(GLKVector4 row0, GLKVector4 row1, GLKVector4 row2, GLKVector4 row3) {
	return GLKMatrix4MakeWithRows(row0, row1, row2, row3);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeWithColumns(GLKVector4 column0, GLKVector4 column1, GLKVector4 column2, GLKVector4 column3) {
	return GLKMatrix4MakeWithColumns(column0, column1, column2, column3);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeWithQuaternion(GLKQuaternion quaternion) {
	return GLKMatrix4MakeWithQuaternion(quaternion);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeTranslation(float tx, float ty, float tz) {
	return GLKMatrix4MakeTranslation(tx, ty, tz);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeScale(float sx, float sy, float sz) {
	return GLKMatrix4MakeScale(sx, sy, sz);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeRotation(float radians, float x, float y, float z) {
	return GLKMatrix4MakeRotation(radians, x, y, z);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeXRotation(float radians) {
	return GLKMatrix4MakeXRotation(radians);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeYRotation(float radians) {
	return GLKMatrix4MakeYRotation(radians);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeZRotation(float radians) {
	return GLKMatrix4MakeZRotation(radians);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakePerspective(float fovyRadians, float aspect, float nearZ, float farZ) {
	return GLKMatrix4MakePerspective(fovyRadians, aspect, nearZ, farZ);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeFrustum(float left, float right, float bottom, float top, float nearZ, float farZ) {
	return GLKMatrix4MakeFrustum(left, right, bottom, top, nearZ, farZ);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeOrtho(float left, float right, float bottom, float top, float nearZ, float farZ) {
	return GLKMatrix4MakeOrtho(left, right, bottom, top, nearZ, farZ);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4MakeLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
	return GLKMatrix4MakeLookAt(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
}

EXPORT GLKMatrix3 __natj_inline_GLKMatrix4GetMatrix3(GLKMatrix4 matrix) {
	return GLKMatrix4GetMatrix3(matrix);
}

EXPORT GLKMatrix2 __natj_inline_GLKMatrix4GetMatrix2(GLKMatrix4 matrix) {
	return GLKMatrix4GetMatrix2(matrix);
}

EXPORT GLKVector4 __natj_inline_GLKMatrix4GetRow(GLKMatrix4 matrix, int row) {
	return GLKMatrix4GetRow(matrix, row);
}

EXPORT GLKVector4 __natj_inline_GLKMatrix4GetColumn(GLKMatrix4 matrix, int column) {
	return GLKMatrix4GetColumn(matrix, column);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4SetRow(GLKMatrix4 matrix, int row, GLKVector4 vector) {
	return GLKMatrix4SetRow(matrix, row, vector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4SetColumn(GLKMatrix4 matrix, int column, GLKVector4 vector) {
	return GLKMatrix4SetColumn(matrix, column, vector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Transpose(GLKMatrix4 matrix) {
	return GLKMatrix4Transpose(matrix);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Multiply(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
	return GLKMatrix4Multiply(matrixLeft, matrixRight);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Add(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
	return GLKMatrix4Add(matrixLeft, matrixRight);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Subtract(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
	return GLKMatrix4Subtract(matrixLeft, matrixRight);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Translate(GLKMatrix4 matrix, float tx, float ty, float tz) {
	return GLKMatrix4Translate(matrix, tx, ty, tz);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4TranslateWithVector3(GLKMatrix4 matrix, GLKVector3 translationVector) {
	return GLKMatrix4TranslateWithVector3(matrix, translationVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4TranslateWithVector4(GLKMatrix4 matrix, GLKVector4 translationVector) {
	return GLKMatrix4TranslateWithVector4(matrix, translationVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Scale(GLKMatrix4 matrix, float sx, float sy, float sz) {
	return GLKMatrix4Scale(matrix, sx, sy, sz);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4ScaleWithVector3(GLKMatrix4 matrix, GLKVector3 scaleVector) {
	return GLKMatrix4ScaleWithVector3(matrix, scaleVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4ScaleWithVector4(GLKMatrix4 matrix, GLKVector4 scaleVector) {
	return GLKMatrix4ScaleWithVector4(matrix, scaleVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4Rotate(GLKMatrix4 matrix, float radians, float x, float y, float z) {
	return GLKMatrix4Rotate(matrix, radians, x, y, z);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4RotateWithVector3(GLKMatrix4 matrix, float radians, GLKVector3 axisVector) {
	return GLKMatrix4RotateWithVector3(matrix, radians, axisVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4RotateWithVector4(GLKMatrix4 matrix, float radians, GLKVector4 axisVector) {
	return GLKMatrix4RotateWithVector4(matrix, radians, axisVector);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4RotateX(GLKMatrix4 matrix, float radians) {
	return GLKMatrix4RotateX(matrix, radians);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4RotateY(GLKMatrix4 matrix, float radians) {
	return GLKMatrix4RotateY(matrix, radians);
}

EXPORT GLKMatrix4 __natj_inline_GLKMatrix4RotateZ(GLKMatrix4 matrix, float radians) {
	return GLKMatrix4RotateZ(matrix, radians);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix4MultiplyVector3(GLKMatrix4 matrixLeft, GLKVector3 vectorRight) {
	return GLKMatrix4MultiplyVector3(matrixLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix4MultiplyVector3WithTranslation(GLKMatrix4 matrixLeft, GLKVector3 vectorRight) {
	return GLKMatrix4MultiplyVector3WithTranslation(matrixLeft, vectorRight);
}

EXPORT GLKVector3 __natj_inline_GLKMatrix4MultiplyAndProjectVector3(GLKMatrix4 matrixLeft, GLKVector3 vectorRight) {
	return GLKMatrix4MultiplyAndProjectVector3(matrixLeft, vectorRight);
}

EXPORT void __natj_inline_GLKMatrix4MultiplyVector3Array(GLKMatrix4 matrix, GLKVector3 * vectors, size_t vectorCount) {
	GLKMatrix4MultiplyVector3Array(matrix, vectors, vectorCount);
}

EXPORT void __natj_inline_GLKMatrix4MultiplyVector3ArrayWithTranslation(GLKMatrix4 matrix, GLKVector3 * vectors, size_t vectorCount) {
	GLKMatrix4MultiplyVector3ArrayWithTranslation(matrix, vectors, vectorCount);
}

EXPORT void __natj_inline_GLKMatrix4MultiplyAndProjectVector3Array(GLKMatrix4 matrix, GLKVector3 * vectors, size_t vectorCount) {
	GLKMatrix4MultiplyAndProjectVector3Array(matrix, vectors, vectorCount);
}

EXPORT GLKVector4 __natj_inline_GLKMatrix4MultiplyVector4(GLKMatrix4 matrixLeft, GLKVector4 vectorRight) {
	return GLKMatrix4MultiplyVector4(matrixLeft, vectorRight);
}

EXPORT void __natj_inline_GLKMatrix4MultiplyVector4Array(GLKMatrix4 matrix, GLKVector4 * vectors, size_t vectorCount) {
	GLKMatrix4MultiplyVector4Array(matrix, vectors, vectorCount);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Make(float x, float y) {
	return GLKVector2Make(x, y);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Negate(GLKVector2 vector) {
	return GLKVector2Negate(vector);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Add(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Add(vectorLeft, vectorRight);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Subtract(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Subtract(vectorLeft, vectorRight);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Multiply(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Multiply(vectorLeft, vectorRight);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Divide(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Divide(vectorLeft, vectorRight);
}

EXPORT GLKVector2 __natj_inline_GLKVector2AddScalar(GLKVector2 vector, float value) {
	return GLKVector2AddScalar(vector, value);
}

EXPORT GLKVector2 __natj_inline_GLKVector2SubtractScalar(GLKVector2 vector, float value) {
	return GLKVector2SubtractScalar(vector, value);
}

EXPORT GLKVector2 __natj_inline_GLKVector2MultiplyScalar(GLKVector2 vector, float value) {
	return GLKVector2MultiplyScalar(vector, value);
}

EXPORT GLKVector2 __natj_inline_GLKVector2DivideScalar(GLKVector2 vector, float value) {
	return GLKVector2DivideScalar(vector, value);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Maximum(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Maximum(vectorLeft, vectorRight);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Minimum(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2Minimum(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector2AllEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2AllEqualToVector2(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector2AllEqualToScalar(GLKVector2 vector, float value) {
	return GLKVector2AllEqualToScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector2AllGreaterThanVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2AllGreaterThanVector2(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector2AllGreaterThanScalar(GLKVector2 vector, float value) {
	return GLKVector2AllGreaterThanScalar(vector, value);
}

EXPORT _Bool __natj_inline_GLKVector2AllGreaterThanOrEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2AllGreaterThanOrEqualToVector2(vectorLeft, vectorRight);
}

EXPORT _Bool __natj_inline_GLKVector2AllGreaterThanOrEqualToScalar(GLKVector2 vector, float value) {
	return GLKVector2AllGreaterThanOrEqualToScalar(vector, value);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Normalize(GLKVector2 vector) {
	return GLKVector2Normalize(vector);
}

EXPORT float __natj_inline_GLKVector2DotProduct(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
	return GLKVector2DotProduct(vectorLeft, vectorRight);
}

EXPORT float __natj_inline_GLKVector2Length(GLKVector2 vector) {
	return GLKVector2Length(vector);
}

EXPORT float __natj_inline_GLKVector2Distance(GLKVector2 vectorStart, GLKVector2 vectorEnd) {
	return GLKVector2Distance(vectorStart, vectorEnd);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Lerp(GLKVector2 vectorStart, GLKVector2 vectorEnd, float t) {
	return GLKVector2Lerp(vectorStart, vectorEnd, t);
}

EXPORT GLKVector2 __natj_inline_GLKVector2Project(GLKVector2 vectorToProject, GLKVector2 projectionVector) {
	return GLKVector2Project(vectorToProject, projectionVector);
}

EXPORT float __natj_inline_GLKMathDegreesToRadians(float degrees) {
	return GLKMathDegreesToRadians(degrees);
}

EXPORT float __natj_inline_GLKMathRadiansToDegrees(float radians) {
	return GLKMathRadiansToDegrees(radians);
}


