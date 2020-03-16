//
//  MetalPerformanceShaders.m
//

#import <MetalPerformanceShaders/MetalPerformanceShaders.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT MPSIntegerDivisionParams __natj_inline_MPSFindIntegerDivisionParams(uint16_t divisor) {
	return MPSFindIntegerDivisionParams(divisor);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelMaxBatchSize(MPSCustomKernelArgumentCount c) {
	return MPSGetCustomKernelMaxBatchSize(c);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBatchedDestinationIndex(MPSCustomKernelArgumentCount c) {
	return MPSGetCustomKernelBatchedDestinationIndex(c);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBatchedSourceIndex(MPSCustomKernelArgumentCount c, unsigned long sourceIndex) {
	return MPSGetCustomKernelBatchedSourceIndex(c, sourceIndex);
}

EXPORT unsigned long __natj_inline_MPSGetCustomKernelBroadcastSourceIndex(MPSCustomKernelArgumentCount c, unsigned long sourceIndex) {
	return MPSGetCustomKernelBroadcastSourceIndex(c, sourceIndex);
}


