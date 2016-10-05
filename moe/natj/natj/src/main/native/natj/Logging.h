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

#ifndef MOE_NatJ_Common_Logging_h
#define MOE_NatJ_Common_Logging_h

#ifdef __ANDROID__

#include <android/log.h>
#include <sstream>

class LogAppender {
  int prio;
  std::stringstream ss;

  LogAppender(int);
  LogAppender(LogAppender&&);

 public:
  template <class T>
  LogAppender& operator<<(const T& toAppend) {
    ss << toAppend;
    return *this;
  }

  ~LogAppender();

  static LogAppender get(int);
};

#define LOG(severity) LogAppender::get(severity) << __FILE__ << ":" << __LINE__ << ": "

#define LOGI LOG(ANDROID_LOG_INFO)
#define LOGW LOG(ANDROID_LOG_WARN)
#define LOGF LOG(ANDROID_LOG_FATAL)

#else

#include <iostream>
#include <mutex>

class LogAppender {
  static std::mutex mLock;

  bool mToAbort;

  LogAppender(bool);

 public:
  template <class T>
  LogAppender& operator<<(const T& toAppend) {
    std::cout << toAppend;
    return *this;
  }

  ~LogAppender();

  static LogAppender get(bool);
};

#define LOG(severity, toAbort)                                                 \
  LogAppender::get(toAbort) << __FILE__ << ":" << __LINE__ << " " << #severity \
                            << ": "

#define LOGI LOG(INFO, false)
#define LOGW LOG(WARNING, false)
#define LOGF LOG(FAILURE, true)

#endif

#endif
