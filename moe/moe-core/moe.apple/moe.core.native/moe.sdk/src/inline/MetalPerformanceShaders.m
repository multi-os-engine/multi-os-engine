//
//  MetalPerformanceShaders.m
//

#import <MetalPerformanceShaders/MetalPerformanceShaders.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

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


