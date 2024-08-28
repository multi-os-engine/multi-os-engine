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

#import <CoreGraphics/CoreGraphics.h>
#include <dispatch/dispatch.h>

CGRect inline_test_CGRectMake(CGFloat a, CGFloat b, CGFloat c, CGFloat d)
{
    return CGRectMake(a, b, c, d);
}

dispatch_queue_t inline_dispatch_get_main_queue(void)
{
    return dispatch_get_main_queue();
}
