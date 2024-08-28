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

#import "ObjC+Methods+ObjectPtr.h"

@implementation ObjectPtrClass

- (void) fillWithOneElement:(NSError**)one {
    one[0] = [[[NSError alloc] initWithDomain:@"test1" code:123 userInfo:nil] autorelease];
}

- (void) fillWithThreeElements:(NSNumber**)one {
    one[0] = [[NSNumber alloc] initWithDouble:66.77];
    one[1] = [[NSNumber alloc] initWithDouble:77.88];
    one[2] = [[NSNumber alloc] initWithDouble:88.99];
}

- (void) fillWithOneElement:(NSError**)one andWithThreeElements:(NSNumber**)two {
    one[0] = [[[NSError alloc] initWithDomain:@"test2" code:456 userInfo:nil] autorelease];

    two[0] = [[NSNumber alloc] initWithDouble:11.22];
    two[1] = [[NSNumber alloc] initWithDouble:22.33];
    two[2] = [[NSNumber alloc] initWithDouble:33.44];
}

@end
