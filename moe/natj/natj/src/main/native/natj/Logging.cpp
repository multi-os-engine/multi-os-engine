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

#include "Logging.h"

#ifdef __ANDROID__

LogAppender::LogAppender(int severity) : prio(severity) {}

LogAppender::LogAppender(LogAppender&& rhs) : ss(std::move(rhs.ss)) {}

LogAppender::~LogAppender() {
  ss << std::endl;
  __android_log_write(prio, "NatJ", ss.str().c_str());
}

LogAppender LogAppender::get(int severity) { return LogAppender(severity); }

#else

std::mutex LogAppender::mLock;

LogAppender::LogAppender(bool pToAbort) : mToAbort(pToAbort) { mLock.lock(); }

LogAppender::~LogAppender() {
  std::cout << std::endl;
  if (mToAbort) {
    abort();
  }
  mLock.unlock();
}

LogAppender LogAppender::get(bool pToAbort) { return LogAppender(pToAbort); }

#endif
