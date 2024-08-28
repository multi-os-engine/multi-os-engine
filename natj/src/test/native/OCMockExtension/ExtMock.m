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

/*
#import "ExtMock.h"

@implementation OCMockObject (CategoryName)

void addArgumentToInv (NSMethodSignature* methodSignature, NSInvocation* inv, va_list args, NSInteger argIndex)
{
    const char *argType = OCMTypeWithoutQualifiers([methodSignature getArgumentTypeAtIndex:(NSUInteger)argIndex]);
    
    if((strlen(argType) > 1) && (strchr("{^", argType[0]) == NULL) && (strcmp("@?", argType) != 0))
        [NSException raise:NSInvalidArgumentException format:@"Cannot handle argument type '%s'.", argType];
    
    if(OCMIsObjectType(argType))
    {
        id value = va_arg(args, id);
        [inv setArgument:&value atIndex:argIndex];
        return;
    }
    
    switch(argType[0])
    {
        case ':':
        {
            SEL s = va_arg(args, SEL);
            [inv setArgument:&s atIndex:argIndex];
            return;
        }
        case 'i':
        {
            int value = va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 's':
        {
            short value = (short)va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'l':
        {
            long value = va_arg(args, long);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'q':
        {
            long long value = va_arg(args, long long);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'c':
        {
            char value = (char)va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'C':
        {
            unsigned char value = (unsigned char)va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'I':
        {
            unsigned int value = va_arg(args, unsigned int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'S':
        {
            unsigned short value= (unsigned short)va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'L':
        {
            unsigned long value= va_arg(args, unsigned long);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'Q':
        {
            unsigned long long value= va_arg(args, unsigned long long);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'f':
        {
            float value= (float)va_arg(args, double);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'd':
        {
            double value= va_arg(args, double);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'D':
        {
            long double value= va_arg(args, long double);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case 'B':
        {
            bool value= (bool)va_arg(args, int);
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case '^':
        case '*':
        {
            void *value = NULL;
            [inv setArgument:&value atIndex:argIndex];
            return;
        }
        case '{': // structure
        {
            NSMutableData *argumentData = va_arg(args, NSMutableData*);
            [inv setArgument:&argumentData atIndex:argIndex];
            return;
        }       
            
    }
    [NSException raise:NSInvalidArgumentException format:@"Argument type '%s' not supported", argType];
    return;
}

- (NSArray *)getInv
{
    return invocations;
}

- (void)addInvocation:(NSInvocation *)anInvocation
{
    [invocations addObject:anInvocation];
}

-(void)addClassInvocationWithSel:(SEL) sel, ...
{
    NSMethodSignature* methodSignature = [[self class] methodSignatureForSelector:sel];
    NSInvocation *inv = [NSInvocation invocationWithMethodSignature: methodSignature];
    NSUInteger argNum = methodSignature.numberOfArguments;
    [inv setSelector:sel];
    
    va_list argumentList;
    va_start(argumentList, sel);
    
    for (unsigned int i = 2; i < argNum; i++) {
        addArgumentToInv (methodSignature, inv, argumentList, i);
    }
    
    va_end(argumentList);
    
    [self addInvocation:inv];
}

-(void)addInstanceInvocationWithSel:(SEL) sel, ...
{
    
    NSMethodSignature* methodSignature = [[self class] instanceMethodSignatureForSelector:sel];
    NSInvocation *inv = [NSInvocation invocationWithMethodSignature: methodSignature];
    NSUInteger argNum = methodSignature.numberOfArguments;
    [inv setSelector:sel];
    
    va_list argumentList;
    va_start(argumentList, sel);
    
    for (unsigned int i = 2; i < argNum; i++) {
        addArgumentToInv (methodSignature, inv, argumentList, i);
    }
    
    va_end(argumentList);
    
    [self addInvocation:inv];
}

- (NSString*)printInvocation
{
    NSArray *invs = [self getInv];
    NSString *ret = @"Invocations:";
    NSString *obj = NSStringFromClass([self class]);
    
    
    for (NSInvocation *inv in invs)
    {
        ret = [ret stringByAppendingString:[NSString stringWithFormat:@"\n%@ %@", obj, [inv invocationDescription]]];
    }
    
    return ret;
}


@end
*/
