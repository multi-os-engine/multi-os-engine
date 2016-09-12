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

#import <Metal/MTLRenderPass.h>
#import <Metal/MTLTypes.h>
#import <objc/NSObjCRuntime.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT MTLOrigin __natj_inline_MTLOriginMake(NSUInteger x, NSUInteger y, NSUInteger z) {
	return MTLOriginMake(x, y, z);
}

EXPORT MTLSize __natj_inline_MTLSizeMake(NSUInteger width, NSUInteger height, NSUInteger depth) {
	return MTLSizeMake(width, height, depth);
}

EXPORT MTLRegion __natj_inline_MTLRegionMake1D(NSUInteger x, NSUInteger width) {
	return MTLRegionMake1D(x, width);
}

EXPORT MTLRegion __natj_inline_MTLRegionMake2D(NSUInteger x, NSUInteger y, NSUInteger width, NSUInteger height) {
	return MTLRegionMake2D(x, y, width, height);
}

EXPORT MTLRegion __natj_inline_MTLRegionMake3D(NSUInteger x, NSUInteger y, NSUInteger z, NSUInteger width, NSUInteger height, NSUInteger depth) {
	return MTLRegionMake3D(x, y, z, width, height, depth);
}

EXPORT MTLClearColor __natj_inline_MTLClearColorMake(double red, double green, double blue, double alpha) {
	return MTLClearColorMake(red, green, blue, alpha);
}


