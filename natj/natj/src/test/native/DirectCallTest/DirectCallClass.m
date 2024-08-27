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

#import <Foundation/Foundation.h>
#import "DirectCallClass.h"

@implementation DirectCallClass : NSObject
static NSObject* staticString = nil;
@synthesize  bounds;
@synthesize dataCopy;


static NSMutableArray *invocationList;

+(NSObject*) staticStringProp
{
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return staticString;
}

+(void) setStaticStringProp:(NSObject *) string
{
    staticString = string;
    [invocationList addObject:NSStringFromSelector(_cmd)];
}


  
-(bool) assertMethodCall:(NSString *)selector times:(long) times
{
    int count = 0;
    for(NSString *element in invocationList)
    {
        if([element isEqualToString:selector]) count++;
    }
    
    return (count == times);
}

-(id) initWithBounds
{
    self = [super init];
    NativeCGRect cgBounds;
    cgBounds.origin.x = 101;
    cgBounds.origin.y = 202;
    cgBounds.size.width = 303;
    cgBounds.size.height = 404;
    bounds = cgBounds;
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return self;
}



//base instance void method
-(int)methodDCall { TESTLog(@"[NATIVE] methodDCall");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return 42; }

//methods with signed primitive arguments
-(char)     methodDCallWithCharArg:      (char)arg       { TESTLog(@"[NATIVE] methodDCallWithCharArg: %c", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(short)     methodDCallWithShortArg:     (short)arg      { TESTLog(@"[NATIVE] methodDCallWithShortArg: %hd", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(int)     methodDCallWithIntArg:       (int)arg        { TESTLog(@"[NATIVE] methodDCallWithIntArg: %d", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(long)     methodDCallWithLongArg:      (long)arg       { TESTLog(@"[NATIVE] methodDCallWithLongArg: %ld", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(long long)     methodDCallWithLongLongArg:  (long long)arg  { TESTLog(@"[NATIVE] methodDCallWithLongLongArg: %lld", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }

//methods with unsigned primitive arguments
-(unsigned char)     methodDCallWithUCharArg:     (unsigned char)arg      { TESTLog(@"[NATIVE] methodDCallWithUCharArg: %C", (unsigned short)arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(unsigned short)     methodDCallWithUShortArg:    (unsigned short)arg     { TESTLog(@"[NATIVE] methodDCallWithUShortArg: %hu", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(unsigned int)     methodDCallWithUIntArg:      (unsigned int)arg       { TESTLog(@"[NATIVE] methodDCallWithUIntArg: %u", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(unsigned long)     methodDCallWithULongArg:     (unsigned long)arg      { TESTLog(@"[NATIVE] methodDCallWithULongArg: %lu", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(unsigned long long)     methodDCallWithULongLongArg: (unsigned long long)arg { TESTLog(@"[NATIVE] methodDCallWithULongLongArg: %llu", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }

//methods with other primitive arguments
-(float)     methodDCallWithFloatArg:     (float)arg      { TESTLog(@"[NATIVE] methodDCallWithFloatArg: %f", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(double)     methodDCallWithDoubleArg:    (double)arg     { TESTLog(@"[NATIVE] methodDCallWithDoubleArg: %f", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }
-(bool)     methodDCallWithBooleanArg:   (bool)arg       { TESTLog(@"[NATIVE] methodDCallWithBooleanArg: %d", arg);
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return arg; }

//methods which return primitives
-(char)                 methodDCallWithCharRet       { TESTLog(@"[NATIVE] methodDCallWithCharRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return CHAR_MIN; }
-(short)                methodDCallWithShortRet      { TESTLog(@"[NATIVE] methodDCallWithShortRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return SHRT_MIN; }
-(int)                  methodDCallWithIntRet        { TESTLog(@"[NATIVE] methodDCallWithIntRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return
    INT_MIN; }
-(long)                 methodDCallWithLongRet       { TESTLog(@"[NATIVE] methodDCallWithLongRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return LONG_MIN; }
-(long long)            methodDCallWithLongLongRet   { TESTLog(@"[NATIVE] methodDCallWithLongLongRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return LLONG_MIN; }
-(unsigned char)        methodDCallWithUCharRet      { TESTLog(@"[NATIVE] methodDCallWithUCharRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return UCHAR_MAX; }
-(unsigned short)       methodDCallWithUShortRet     { TESTLog(@"[NATIVE] methodDCallWithUShortRet");
    [invocationList addObject:NSStringFromSelector(_cmd)];
    return USHRT_MAX; }
-(unsigned int)         methodDCallWithUIntRet       { TESTLog(@"[NATIVE] methodDCallWithUIntRet"); return UINT_MAX; }
-(unsigned long)        methodDCallWithULongRet      { TESTLog(@"[NATIVE] methodDCallWithULongRet"); return ULONG_MAX; }
-(unsigned long long)   methodDCallWithULongLongRet  { TESTLog(@"[NATIVE] methodDCallWithULongLongRet"); return ULLONG_MAX; }
-(float)                methodDCallWithFloatRet      { TESTLog(@"[NATIVE] methodDCallWithFloatRet"); return 123.456; }
-(double)               methodDCallWithDoubleRet     { TESTLog(@"[NATIVE] methodDCallWithDoubleRet"); return 456.789; }
-(bool)                 methodDCallWithBooleanRet    { TESTLog(@"[NATIVE] methodDCallWithBooleanRet"); return true; }

//methods with complex argument
-(NSString*)     methodDCallWithNSStringArg:  (NSString*)string   { TESTLog(@"[NATIVE] methodDCallWithNSStringArg: %@", string); return string; }
-(id)     methodDCallWithObjectArg:    (id)object          { TESTLog(@"[NATIVE] methodDCallWithObjectArg: %@", object); return object; }

//method with two arguments
-(NSString*)     methodDCallWithFirst:(long)longParam andSecondParam:(NSString*)stringParam
{ TESTLog(@"[NATIVE] methodDCallWithFirst: %ld andSecondParam: %@", longParam, stringParam); return [NSString stringWithFormat: @"%@ %ld", stringParam, longParam]; }

//methods wich return complex types
-(NSString*)    methodDCallWithNSStringRet   { TESTLog(@"[NATIVE] methodDCallWithNSStringRet"); return @"[NATIVE] Hi, bindings!"; }
-(id)           methodDCallWithObjectRet     { TESTLog(@"[NATIVE] methodDCallWithObjectRet"); return self; }

//static method
+(NSString*)staticMethodDCallWithNSStringRet { TESTLog(@"[NATIVE] staticMethodDCallWithNSStringRet"); return @"[NATIVE] staticMethodDCallWithNSStringRet"; }

//methods with structures
-(void)        methodDCallWithStructArg:   (NativeCGPoint)arg   { TESTLog(@"[NATIVE] methodDCallWithStructArg: %f, %f", arg.x, arg.y); }
-(NativeCGPoint)     methodDCallWithStructRet:   (NativeCGPoint)arg   { TESTLog(@"[NATIVE] methodDCallWithStructRet"); return arg; }
-(NativeCGPoint) methodDCallWithStructRetX:(double)x Y:(double)y
{
    TESTLog(@"[NATIVE] methodDCallWithStructRetX:%lf Y:%lf", x, y);
    return createNativeCGPoint(x, y);
}
-(NativeComplexCGPoint) methodDCallWithComplexStructRetX:(NativeCGPoint)x Y:(float)y
{
    TESTLog(@"[NATIVE] methodDCallWithComplexStructRetX:(%lf, %lf) Y:%f", x.x, x.y, y);
    return createNativeComplexCGPoint(x, y);
}

-(NativeCGPointFloat) methodDStructRetStructFloat:(float)x Y:(float)y
{
    TESTLog(@"[NATIVE] methodDStructRetStructFloat:%f, %f", x, y);
    NativeCGPointFloat retStruct;
    retStruct.x = x;
    retStruct.y = y;
    return retStruct;
}

-(NativeCGPointFloat) methodDStructRetStructFloatFromStruct:(NativeCGPointFloat)x
{
    TESTLog(@"[NATIVE] methodDStructRetStructFloat:%f, %f", x.x, x.y);
    NativeCGPointFloat retStruct;
    retStruct.x = x.x;
    retStruct.y = x.y;
    return retStruct;
}

-(NativeCGRect) methodDCallRetCGRectX:(double)x Y:(double)y
{
    TESTLog(@"In methodDCallRetCGRect");
    NativeCGRect rect;
    rect.origin.x = x;
    rect.origin.y = y;
    rect.size.width = 300;
    rect.size.height = 500;
    return rect;
}

-(NativeCGRect) methodDCallRetCGRectProperty
{
    return [self bounds];
}


//methods with selectors
-(void) methodDCallWithSelectorArg:(SEL)arg  { TESTLog(@"[NATIVE] methodDCallWithSelectorArg: %@", NSStringFromSelector(arg)); }
-(SEL)  methodDCallWithSelectorRet           { TESTLog(@"[NATIVE] methodDCallWithSelectorRet"); return _cmd; }
-(long)  methodDCall:(id)object WithJavaSelectorArg:(SEL)selector { return (long)[object performSelector:selector] ;}

//methods with to id pointer
-(void)methodDCallWithToIdPtrBase:(id*)arg {
    id old = *arg;
    *arg = [[NSObject alloc] init];
    TESTLog(@"[NATIVE] methodDCallWithToIdPtrBase: from %@ to %@", old, *arg );
}
-(void)methodDCallWithToIdPtrArg:(id*)arg {
    id old = *arg;
    *arg = self;
    TESTLog(@"[NATIVE] methodDCallWithToIdPtrArg: from %@ to %@", old, *arg );
}

-(void)methodDCallWithFirst:(id*)idPtr1 andSecondToIdPtr:(id*)idPtr2 {
    TESTLog(@"[NATIVE] methodDCallWithFirst: %@ andSecondToIdPtr: %@", *idPtr1, *idPtr2 );
    if(idPtr2)
    {
      *idPtr1 = *idPtr2;
        *idPtr2 = self;
    }
   
    TESTLog(@"[NATIVE] newValueForFirst: %@ andForSecondId: %@", *idPtr1 , *idPtr2 );
}

-(void)methodDCallWithToNSErrorPtr:(NSError**)error { *error = [NSError errorWithDomain:@"methodDCallWithToNSErrorPtr" code:42 userInfo:nil]; }

-(NSObject *)producingNativeObjects
{
    NSObject *newObj = [NSObject new];
    return newObj;
}

-(void) raiseExceptionMethod
{
    [NSException raise:@"Exception raised for test" format:@""];
}

@end
