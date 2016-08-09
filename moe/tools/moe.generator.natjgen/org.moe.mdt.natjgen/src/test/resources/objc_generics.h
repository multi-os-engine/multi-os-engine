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

#ifdef __OBJC__

#import <Foundation/Foundation.h>

@interface ParamedClass1WithUnused<T> : NSObject
@end

@interface ParamedClass1<__covariant T> : NSObject
- (T)v;
- (T __unsafe_unretained *)v__ptr;
- (NSArray<T> *)v__array;
- (NSArray<NSArray<T> *> *)v__array_array;
- (NSArray<T> **)v__array_ptr;
- (__strong NSArray<T> ***)v__strong_array_ptr_ptr;
- (NSDictionary<NSString*, T> *)string_v__dictionary;
@property T prop__v;
@property T __unsafe_unretained * prop__v__ptr;
@property NSArray<T> * prop__v__array;
@property NSDictionary<NSString*, T> * prop__string_v__dictionary;
@end

@interface ParamedClass1 (NoParam)
- (void)cat0;
@end

@interface ParamedClass1<T> (UnusedParam)
- (void)cat1unused;
@end

@interface ParamedClass1<T> (UsedParam)
- (T)cat1used;
@end

@interface ParamedClass1<T2> (UnusedParamDifferentName)
- (void)cat1unuseddiff;
@end

@interface ParamedClass1<T2> (UsedParamDifferentName)
- (T2)cat1useddiff;
@end

@interface ParamedClass1WithJavaValue<__covariant Object> : NSObject
- (Object)object_word;
@end

@interface InheritedParamedClass1<T> : ParamedClass1<T>
@end

@interface InheritedParamedClass2<Y> : ParamedClass1<Y>
@end

@interface InheritedParamedClass3<T,Y> : ParamedClass1<T>
@end

@interface InheritedParamedClass4<T,Y> : ParamedClass1<Y>
@end

@interface InheritedParamedClass5 : ParamedClass1<NSString *>
@end

@interface InheritedParamedClass6 : ParamedClass1<NSArray<NSString*>*>
@end

@interface InheritedParamedClass7<T> : ParamedClass1<NSArray<T>*>
@end

#endif /* __OBJC__ */
