APP_PLATFORM := android-21
NDK_TOOLCHAIN_VERSION := 4.9

APP_ABI := \
	armeabi-v7a \
	arm64-v8a \
	mips \
	mips64 \
	x86 \
	x86_64

APP_STL := c++_shared

ifdef DEBUG
	APP_OPTIM := debug
else
	APP_OPTIM := release
endif

APP_CPPFLAGS += -std=c++11
