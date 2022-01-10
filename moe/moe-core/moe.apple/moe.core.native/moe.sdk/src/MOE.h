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

#if defined(__cplusplus)
#define EXTERN extern "C"
#else
#define EXTERN extern
#endif

//! Entry point of MOE.
EXTERN int run_moevm(int isDebug, const int jargc, char *const *jargv);

static inline int moevm(const int jargc, char *const *jargv) {
    return run_moevm(
#ifdef DEBUG
                     1
#else
                     0
#endif
                     , jargc, jargv
                     );
}
