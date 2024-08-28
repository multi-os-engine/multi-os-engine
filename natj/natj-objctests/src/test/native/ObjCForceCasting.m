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

#import "ObjCForceCasting.h"

#import <objc/runtime.h>

@interface DefaultClassAttributesCustomizer : NSObject

@property (unsafe_unretained) id customizedInstance;
@end

static CustomizableDefaultClass* CustomizableDefaultClassDefaults = nil;
static CustomizableDefaultClass* CustomizableDefaultClassCustomizer = nil;

@implementation CustomizableDefaultClass

+ (instancetype)classDefaults {
    static dispatch_once_t onceToken = 0L;
    dispatch_once(&onceToken, ^{
        CustomizableDefaultClassDefaults = [[CustomizableDefaultClass alloc] initDefaults];
        DefaultClassAttributesCustomizer* customizer = [[DefaultClassAttributesCustomizer alloc] init];
        customizer.customizedInstance = CustomizableDefaultClassDefaults;
        CustomizableDefaultClassCustomizer = customizer;
    });
    return CustomizableDefaultClassCustomizer;
}

- (instancetype)initDefaults {
    self = [super init];
    return self;
}

- (instancetype)init {
    self = [super init];
    if (self) {
        [CustomizableDefaultClass classDefaults];
        _text = CustomizableDefaultClassDefaults.text;
    }
    return self;
}

+ (BOOL)checkTransparentDefaultsObject:(CustomizableDefaultClass*)transparent
       andNonTransparentDefaultsObject:(CustomizableDefaultClass*)nonTransparent {
    if (transparent == nonTransparent) {
        return NO;
    }
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wundeclared-selector"
    if (!class_respondsToSelector(object_getClass(nonTransparent), @selector(instance))) {
#pragma clang diagnostic pop
        return NO;
    }
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-method-access"
    CustomizableDefaultClass* instance = [nonTransparent instance];
#pragma clang diagnostic pop
    if (instance != transparent) {
        return NO;
    }
    if (![[transparent text] isEqualToString:@"Hello World"]) {
        return NO;
    }
    if ([nonTransparent text] != [transparent text]) {
        return NO;
    }
    return YES;
}

@end

@implementation DefaultClassAttributesCustomizer

- (id)forwardingTargetForSelector:(SEL)aSelector {
    return _customizedInstance;
}

@end
