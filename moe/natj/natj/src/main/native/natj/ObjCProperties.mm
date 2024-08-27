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

#import "ObjCProperties.h"
#import <objc/runtime.h>

@implementation ObjCProperties

id getter(id self, SEL _cmd) {
    NSString* name = NSStringFromSelector(_cmd);
    NSRange r;
    r.length = name.length -1 ;
    r.location = 1;
    
    NSString* firstChar =
        [name stringByReplacingCharactersInRange:r withString:@""].lowercaseString;
    
    if ([firstChar isEqualToString:@"_"]) {
        return name;
    }
    
    r.length = 1;
    r.location = 0;
    
    NSString* theRest = [name stringByReplacingCharactersInRange:r withString:@""];
    NSString* ivarName = [NSString stringWithFormat:@"_%@%@",firstChar, theRest];
    Ivar ivar = class_getInstanceVariable([self class], [ivarName UTF8String]);
    id object = object_getIvar(self, ivar);
    
    return object;
}

void setter(id self, SEL _cmd, id newObj) {
    NSRange r1;
    r1.length = 3 ;
    r1.location = 0;
    
    NSString* name =
        [NSStringFromSelector(_cmd) stringByReplacingCharactersInRange:r1 withString:@""];
    NSRange r;
    r.length = name.length -1 ;
    r.location = 1;
    
    NSString* firstChar =
        [name stringByReplacingCharactersInRange:r withString:@""].lowercaseString;
    
    r.length = 1;
    r.location = 0;
    
    NSString* theRest = [name stringByReplacingCharactersInRange:r withString:@""];
    
    NSString* ivarName = [NSString stringWithFormat:@"_%@%@",firstChar, theRest];
    ivarName = [ivarName stringByReplacingOccurrencesOfString:@":" withString:@""];
    Ivar ivar = class_getInstanceVariable([self class], [ivarName UTF8String]);
    
    object_setIvar(self, ivar, newObj);
}

+ (NSString*)propName:(NSString*)name {
    name = [name stringByReplacingOccurrencesOfString:@":" withString:@""];
    
    NSRange r;
    r.length = name.length -1 ;
    r.location = 1;
    
    NSString* firstChar = [name stringByReplacingCharactersInRange:r withString:@""];
    
    if ([firstChar isEqualToString:[firstChar lowercaseString]]) {
        return name;
    }
    
    r.length = 1;
    r.location = 0;
    
    NSString* theRest = [name stringByReplacingCharactersInRange:r withString:@""];
    
    return [NSString stringWithFormat:@"%@%@", [firstChar lowercaseString] , theRest];
}

+ (NSString*)setterName:(NSString*)name {
    name = [self propName:name];
    
    NSRange r;
    r.length = name.length -1 ;
    r.location = 1;
    
    NSString* firstChar = [name stringByReplacingCharactersInRange:r withString:@""];
    
    r.length = 1;
    r.location = 0;
    
    NSString* theRest = [name stringByReplacingCharactersInRange:r withString:@""];
    
    return [NSString stringWithFormat:@"set%@%@:", [firstChar uppercaseString] , theRest];
}

+ (NSString*)ivarName:(NSString*)name {
    NSRange r;
    r.length = name.length -1 ;
    r.location = 1;
    
    NSString* firstChar =
        [name stringByReplacingCharactersInRange:r withString:@""].lowercaseString;
    
    if ([firstChar isEqualToString:@"_"]) {
        return name;
    }

    r.length = 1;
    r.location = 0;
    
    NSString* theRest = [name stringByReplacingCharactersInRange:r withString:@""];
    
    return [NSString stringWithFormat:@"_%@%@",firstChar, theRest];
}

+ (void)addProperty:(NSString*)pName withClass:(Class)nativeClass {
    NSString* propName = [self propName:pName];
    NSString* iVarName = [self ivarName:pName];
    
    class_addIvar(nativeClass, [iVarName UTF8String], sizeof(NSObject*),
                  log2(sizeof(NSObject*)), @encode(NSObject));
    
    const char* className = class_getName(nativeClass);
    const char* attrTypeName = [[NSString stringWithFormat:@"@\"%s\"", className] UTF8String];

    objc_property_attribute_t type = {"T",  attrTypeName};
    objc_property_attribute_t a2 = {"&", ""};
    objc_property_attribute_t a3 = {"N", ""};
    objc_property_attribute_t backingivar = {"V", [iVarName UTF8String]};
    
    objc_property_attribute_t attrs[] = {type, a2, a3, backingivar};
    
    class_addProperty(nativeClass, [propName UTF8String], attrs, 4);
    
    class_addMethod(nativeClass, NSSelectorFromString(propName), (IMP)getter, "@@:");
    NSString *setterNSName = [self setterName:propName];
    class_addMethod(nativeClass, NSSelectorFromString(setterNSName), (IMP)setter, "v@:@");
}

@end
