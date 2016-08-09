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

#import "ObjCException.h"
#import "ObjCRuntime.h"

@implementation ObjCException

- (id)initWithEnv:(JNIEnv*)env javaException:(jthrowable)javaExc {
  jstring jName = (jstring)env->CallObjectMethod(env->GetObjectClass(javaExc),
                                                 gGetClassNameMethod);
  const char* cName = env->GetStringUTFChars(jName, NULL);
  NSString* name = [[NSString alloc] initWithUTF8String:cName];
  NSString* reason = getExceptionStacktrace(env, javaExc);

  self = [super initWithName:name reason:reason userInfo:nil];
  if (self) {
    _javaException = (jthrowable)env->NewGlobalRef(javaExc);
  }

  [name release];
  env->ReleaseStringUTFChars(jName, cName);
  env->DeleteLocalRef(jName);

  if (reason) {
    [reason release];
  }

  return self;
}

- (void)dealloc {
  if (gJVMIsRunning) {
    ATTACH_ENV();
    env->DeleteGlobalRef(_javaException);
    DETACH_ENV();
  }
  [super dealloc];
}

@end
