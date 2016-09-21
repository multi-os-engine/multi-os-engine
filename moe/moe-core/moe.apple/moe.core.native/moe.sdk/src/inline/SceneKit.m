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
#import <SceneKit/SceneKitTypes.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT SCNVector3 __natj_inline_SCNVector3Make(float x, float y, float z) {
	return SCNVector3Make(x, y, z);
}

EXPORT SCNVector4 __natj_inline_SCNVector4Make(float x, float y, float z, float w) {
	return SCNVector4Make(x, y, z, w);
}

EXPORT SCNMatrix4 __natj_inline_SCNMatrix4MakeTranslation(float tx, float ty, float tz) {
	return SCNMatrix4MakeTranslation(tx, ty, tz);
}

EXPORT SCNMatrix4 __natj_inline_SCNMatrix4MakeScale(float sx, float sy, float sz) {
	return SCNMatrix4MakeScale(sx, sy, sz);
}

EXPORT SCNMatrix4 __natj_inline_SCNMatrix4Translate(SCNMatrix4 m, float tx, float ty, float tz) {
	return SCNMatrix4Translate(m, tx, ty, tz);
}

EXPORT SCNVector3 __natj_inline_SCNVector3FromGLKVector3(GLKVector3 vector) {
	return SCNVector3FromGLKVector3(vector);
}

EXPORT GLKVector3 __natj_inline_SCNVector3ToGLKVector3(SCNVector3 vector) {
	return SCNVector3ToGLKVector3(vector);
}

EXPORT SCNVector4 __natj_inline_SCNVector4FromGLKVector4(GLKVector4 vector) {
	return SCNVector4FromGLKVector4(vector);
}

EXPORT GLKVector4 __natj_inline_SCNVector4ToGLKVector4(SCNVector4 vector) {
	return SCNVector4ToGLKVector4(vector);
}


