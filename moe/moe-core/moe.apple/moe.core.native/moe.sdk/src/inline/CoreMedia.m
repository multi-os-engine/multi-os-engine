//
//  CoreMedia.m
//

#import <CoreMedia/CMSync.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

EXPORT OSStatus __natj_inline_CMTimebaseCreateWithSourceClock(CFAllocatorRef _Nullable allocator, CMClockRef _Nonnull sourceClock, CMTimebaseRef  _Nullable * _Nonnull timebaseOut) {
	return CMTimebaseCreateWithSourceClock(allocator, sourceClock, timebaseOut);
}

EXPORT OSStatus __natj_inline_CMTimebaseCreateWithSourceTimebase(CFAllocatorRef _Nullable allocator, CMTimebaseRef _Nonnull sourceTimebase, CMTimebaseRef  _Nullable * _Nonnull timebaseOut) {
	return CMTimebaseCreateWithSourceTimebase(allocator, sourceTimebase, timebaseOut);
}

EXPORT CMTimebaseRef _Nullable __natj_inline_CMTimebaseCopySourceTimebase(CMTimebaseRef _Nonnull timebase) {
	return CMTimebaseCopySourceTimebase(timebase);
}

EXPORT CMClockRef _Nullable __natj_inline_CMTimebaseCopySourceClock(CMTimebaseRef _Nonnull timebase) {
	return CMTimebaseCopySourceClock(timebase);
}

EXPORT CMClockOrTimebaseRef _Nonnull __natj_inline_CMTimebaseCopySource(CMTimebaseRef _Nonnull timebase) {
	return CMTimebaseCopySource(timebase);
}

EXPORT CMClockRef _Nonnull __natj_inline_CMTimebaseCopyUltimateSourceClock(CMTimebaseRef _Nonnull timebase) {
	return CMTimebaseCopyUltimateSourceClock(timebase);
}

EXPORT OSStatus __natj_inline_CMTimebaseSetSourceClock(CMTimebaseRef _Nonnull timebase, CMClockRef _Nonnull newSourceClock) {
	return CMTimebaseSetSourceClock(timebase, newSourceClock);
}

EXPORT OSStatus __natj_inline_CMTimebaseSetSourceTimebase(CMTimebaseRef _Nonnull timebase, CMTimebaseRef _Nonnull newSourceTimebase) {
	return CMTimebaseSetSourceTimebase(timebase, newSourceTimebase);
}


