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

#import "MappingClass.h"

#define __NATJ_ASSERT(x) { if (!(x)) { abort(); }}

@implementation MappingClass

+ (NSString*)testListMapping:(NSMutableArray*)list :(NSArray*)narray :(NSUInteger)index {
    // Sanity test
    __NATJ_ASSERT([list count] > index > 0);

    // Testing type
    __NATJ_ASSERT([list isKindOfClass:[NSMutableArray class]]);
    
    // Testing count
    __NATJ_ASSERT([list count] == [narray count]);
    
    // Testing objectAtIndex:
    for (size_t i = 0; i < [list count]; i++) {
        __NATJ_ASSERT([[list objectAtIndex:i] isEqualToString:[narray objectAtIndex:i]]);
    }
    
    // Testing insertObject:atIndex:
    [list insertObject:@"blueberry" atIndex:index];
    __NATJ_ASSERT([list count] == [narray count] + 1);
    __NATJ_ASSERT([[list objectAtIndex:index] isEqualToString:@"blueberry"]);
    
    // Testing removeObjectAtIndex:
    [list removeObjectAtIndex:index];
    __NATJ_ASSERT([list count] == [narray count]);
    for (size_t i = 0; i < [list count]; i++) {
        __NATJ_ASSERT([[list objectAtIndex:i] isEqualToString:[narray objectAtIndex:i]]);
    }
    
    // Testing addObject:
    [list addObject:@"blackberry"];
    __NATJ_ASSERT([list count] == [narray count] + 1);
    __NATJ_ASSERT([[list objectAtIndex:[list count] - 1] isEqualToString:@"blackberry"]);
    
    // Testing removeLastObject
    [list removeLastObject];
    __NATJ_ASSERT([list count] == [narray count]);
    for (size_t i = 0; i < [list count]; i++) {
        __NATJ_ASSERT([[list objectAtIndex:i] isEqualToString:[narray objectAtIndex:i]]);
    }
    
    // Testing replaceObjectAtIndex:withObject:
    id old = [list objectAtIndex:index];
    __NATJ_ASSERT(old); // Value will be tested at Java side.
    id newVal = [NSString stringWithFormat:@"!%@!", old];
    [list replaceObjectAtIndex:index withObject:newVal];
    __NATJ_ASSERT([list count] == [narray count]);
    for (size_t i = 0; i < [list count]; i++) {
        if (i == index) {
            __NATJ_ASSERT([[list objectAtIndex:index] isEqualToString:newVal]);
            continue;
        }
        __NATJ_ASSERT([[list objectAtIndex:i] isEqualToString:[narray objectAtIndex:i]]);
    }
    
    return old;
}

+ (NSString*)testMapMapping:(NSMutableDictionary*)map :(NSDictionary*)ndict :(NSString*)key {
    // Sanity test
    __NATJ_ASSERT([map count] > 0);

    // Testing type
    __NATJ_ASSERT([map isKindOfClass:[NSMutableDictionary class]]);
    
    // Testing count
    __NATJ_ASSERT([map count] == [ndict count]);
    
    // Testing objectForKey:
    id old = [map objectForKey:key];
    __NATJ_ASSERT(old); // Value will be tested at Java side.
    
    // Testing keyEnumerator:
    NSEnumerator* enumerator = [map keyEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        size_t rem = [map count];
        id it;
        while((it = [enumerator nextObject])) {
            __NATJ_ASSERT(it);
            __NATJ_ASSERT([[map objectForKey:it] isEqualToString:[ndict objectForKey:it]]);
            rem--;
        }
        __NATJ_ASSERT(rem == 0);
    }

    // Testing removeObjectForKey:
    [map removeObjectForKey:key];
    __NATJ_ASSERT([map count] == [ndict count] - 1);
    enumerator = [map keyEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        NSArray* last = [enumerator allObjects];
        __NATJ_ASSERT([last count] == [map count]);
        for (id it in last) {
            __NATJ_ASSERT(![it isEqualToString:key]);
            __NATJ_ASSERT([[map objectForKey:it] isEqualToString:[ndict objectForKey:it]]);
        }
    }
    
    // Testing setObject:forKey:
    id newVal = [NSString stringWithFormat:@"!%@!", old];
    [map setObject:newVal forKey:key];
    __NATJ_ASSERT([map count] == [ndict count]);
    enumerator = [map keyEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        NSArray* last = [enumerator allObjects];
        __NATJ_ASSERT([last count] == [map count]);
        for (id it in last) {
            if ([it isEqualToString:key]) {
                __NATJ_ASSERT([[map objectForKey:key] isEqualToString:newVal]);
                continue;
            }
            __NATJ_ASSERT([[map objectForKey:it] isEqualToString:[ndict objectForKey:it]]);
        }
    }
    
    return old;
}

+ (NSString*)testSetMapping:(NSMutableSet*)set :(NSSet*)nset :(NSString*)member {
    // Sanity test
    __NATJ_ASSERT([set count] > 0);
    
    // Testing type
    __NATJ_ASSERT([set isKindOfClass:[NSMutableSet class]]);
    
    // Testing count
    __NATJ_ASSERT([set count] == [nset count]);
    
    // Testing member:
    id old = [set member:member];
    __NATJ_ASSERT(old); // Value will be tested at Java side.
    
    // Testing objectEnumerator
    NSEnumerator* enumerator = [set objectEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        size_t rem = [set count];
        id it;
        while((it = [enumerator nextObject])) {
            __NATJ_ASSERT([[set member:it] isEqualToString:[nset member:it]]);
            rem--;
        }
        __NATJ_ASSERT(rem == 0);
    }
    
    // Testing removeObject:
    [set removeObject:member];
    __NATJ_ASSERT([set count] == [nset count] - 1);
    enumerator = [set objectEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        NSArray* last = [enumerator allObjects];
        __NATJ_ASSERT([last count] == [set count]);
        for (id it in last) {
            __NATJ_ASSERT(![it isEqualToString:old]);
            __NATJ_ASSERT([[set member:it] isEqualToString:[nset member:it]]);
        }
    }
    
    // Testing addObject:
    id newVal = [NSString stringWithFormat:@"!%@!", old];
    [set addObject:newVal];
    __NATJ_ASSERT([set count] == [nset count]);
    enumerator = [set objectEnumerator];
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        size_t hit = 0;
        NSArray* last = [enumerator allObjects];
        __NATJ_ASSERT([last count] == [set count]);
        for (id it in last) {
            if ([it isEqualToString:newVal]) {
                hit++;
                continue;
            }
            __NATJ_ASSERT([[set member:it] isEqualToString:[nset member:it]]);
        }
        __NATJ_ASSERT(hit == 1);
    }
    
    return old;
}

+ (NSUInteger)testIteratorMapping:(NSEnumerator*)enumerator {
    NSUInteger count = 0;
    __NATJ_ASSERT([enumerator isKindOfClass:[NSEnumerator class]]);
    {
        id it;
        while((it = [enumerator nextObject])) {
            __NATJ_ASSERT([it isKindOfClass:[NSString class]]);
            count += [(NSString *)it length];
            count++;
        }
    }
    return count;
}

@end
