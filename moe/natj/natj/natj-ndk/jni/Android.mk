DEPENDENCY_PATH := $(call my-dir)
LOCAL_PATH := $(abspath $(DEPENDENCY_PATH))
include $(CLEAR_VARS)

LOCAL_MODULE := natj

ifdef DEBUG
  LOCAL_CFLAGS := -DDEBUG -g
else
  LOCAL_CFLAGS := -DNDEBUG
endif

LOCAL_CPP_FEATURES := \
	exceptions

ifeq ($(TARGET_ARCH), arm)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/arm-unknown-linux-androideabi/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/arm-unknown-linux-androideabi/include
endif

ifeq ($(TARGET_ARCH), mips)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/mipsel-unknown-linux-android/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/mipsel-unknown-linux-android/include
endif

ifeq ($(TARGET_ARCH), x86)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/i686-pc-linux-android/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/i686-pc-linux-android/include
endif

ifeq ($(TARGET_ARCH), arm64)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/aarch64-unknown-linux-android/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/aarch64-unknown-linux-android/include
endif

ifeq ($(TARGET_ARCH), mips64)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/mips64el-unknown-linux-android/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/mips64el-unknown-linux-android/include
endif

ifeq ($(TARGET_ARCH), x86_64)
  LOCAL_LDLIBS := -Wl,--whole-archive $(LOCAL_PATH)/../../libffi/x86_64-pc-linux-android/.libs/libffi.a -Wl,--no-whole-archive
  LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../../src/native/include \
    $(LOCAL_PATH)/../../libffi/x86_64-pc-linux-android/include
endif

ifeq ($(LOCAL_LDLIBS),)
  $(error Architecture is not supported by NatJ: $(TARGET_ARCH))
endif

LOCAL_LDLIBS += -llog

LOCAL_SRC_FILES := $(wildcard $(LOCAL_PATH)/../../src/main/native/natj/*.cpp)

include $(BUILD_SHARED_LIBRARY)
