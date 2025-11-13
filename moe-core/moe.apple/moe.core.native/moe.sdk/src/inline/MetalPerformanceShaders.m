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

#import <MetalPerformanceShaders/MetalPerformanceShaders.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT size_t __natj_inline_MPSDataTypeBitsCount(MPSDataType t) {
	return MPSDataTypeBitsCount(t);
}

EXPORT size_t __natj_inline_MPSSizeofMPSDataType(MPSDataType t) {
	return MPSSizeofMPSDataType(t);
}

EXPORT MPSIntegerDivisionParams __natj_inline_MPSFindIntegerDivisionParams(uint16_t divisor) {
	return MPSFindIntegerDivisionParams(divisor);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelMaxBatchSize(MPSCustomKernelArgumentCount c, unsigned long MPSMaxTextures) {
	return MPSGetCustomKernelMaxBatchSize(c, MPSMaxTextures);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBatchedDestinationIndex(MPSCustomKernelArgumentCount c) {
	return MPSGetCustomKernelBatchedDestinationIndex(c);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBatchedSourceIndex(MPSCustomKernelArgumentCount c, unsigned long sourceIndex, unsigned long MPSMaxTextures) {
	return MPSGetCustomKernelBatchedSourceIndex(c, sourceIndex, MPSMaxTextures);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBroadcastSourceIndex(MPSCustomKernelArgumentCount c, unsigned long sourceIndex, unsigned long MPSMaxTextures) {
	return MPSGetCustomKernelBroadcastSourceIndex(c, sourceIndex, MPSMaxTextures);
}


