//
//  CoreAudioTypes.m
//

#import <CoreAudioTypes/CoreAudioBaseTypes.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT UInt32 __natj_inline_AudioChannelLayoutTag_GetNumberOfChannels(AudioChannelLayoutTag inLayoutTag) {
	return AudioChannelLayoutTag_GetNumberOfChannels(inLayoutTag);
}


