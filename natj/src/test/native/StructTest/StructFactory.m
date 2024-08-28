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

#import "StructFactory.h"

@implementation StructFactory


/**************************************/
#pragma mark - Test simple CGPoint
/**************************************/


-(BOOL)checkCGPoint:(CGPoint)point
{
    /*
     * Chech CGPoint equales {100.0f, 200.0f}
     */

    if (point.x == 100.0f &
        point.y == 200.0f)
        return YES;
    else
        return NO;
}

-(CGPoint)prepareCGPoint
{
    return CGPointMake(100.0f, 200.0f);
}


/**************************************/
#pragma mark - Test nested struct CGRect
/**************************************/


-(BOOL)checkCGRect:(CGRect)rect
{
    /*
     * Chech CGPoint equales 
     * { {100.0f, 200.0f}, {300.0f, 400.0f} }
     */
    
    if (rect.origin.x == 100.0f &
        rect.origin.y == 200.0f &
        rect.size.width == 300.0f &
        rect.size.height == 400.0f )
        return YES;
    else
        return NO;
}

-(CGRect)prepareCGRect
{
    return CGRectMake(100.0f, 200.0f, 300.0f, 400.0f);
}


@end
