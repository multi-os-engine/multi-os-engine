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

#import <UIKit/UIKit.h>

#include <pthread.h>
#include <iostream>

#define IMAGE_PREFIX "-Ximage:"
#define IMAGE_NAME "image.art"

#define CLASSPATH_PREFIX "-cp"

#define BOOTCLASSPATH_PREFIX "-Xbootclasspath:"
#define RESOURCES_NAME "application.jar"

NSString* moeErrorTitle;
NSString* moeErrorDescription;

#include "oat.h"

#import "ErrorDelegate.h"

#include "moe_entry.h"

#define xstr(s) str(s)
#define str(s) #s

#ifdef GRADLE_BUILD_VERSION
#error "GRADLE_BUILD_VERSION is not defined"
#endif

// Defined in runtime
extern void* get_oat_data(size_t* size);

// Defined in dalvikvm
extern "C" int dalvikvm(int argc, char** argv, int prec, char* const prev[]);

#if defined(__arm64__)
// The function hypot has to return NaN for (x, NaN) arguments,
// but on arm64 the default implementation returns x, instead.
extern "C" double hypot(double a, double b) {
  if (a == 0 && b == 0) return 0;
  double absa = fabs(a);
  if (absa == INFINITY) return INFINITY;
  double absb = fabs(b);
  if (absb == INFINITY) return INFINITY;
  double max;
  double min;
  if (absa > absb) {
    max = absa;
    min = absb;
  } else {
    max = absb;
    min = absa;
  }
  double r = min / max;
  return max * sqrt(1 + (r * r));
}
#endif

extern "C" int moevm(const int jargc, char* const* jargv) {
  reserve_tls_key();

  @autoreleasepool {
    NSBundle* mainBundle = [NSBundle mainBundle];

    // Do same initial checks
    {
      // Get the oatdata for validation purposes
      BOOL error = false;
      void* oatdata = get_oat_data(nullptr);

      if (oatdata == NULL) {
        // If oatdata segment is missing then continuing is unnecessary
        moeErrorTitle = @"Wrong Build";
        moeErrorDescription =
            @"The binary is built without oatdata, try to rebuild it again!";
        error = true;
      }

      // If there is an error, then report it to the user through the
      // ErrorDelegate
      if (error) {
        return UIApplicationMain(0, 0, nil,
                                 NSStringFromClass([ErrorDelegate class]));
      }
    }

    NSString* resourcePath = [mainBundle resourcePath];

    // Set ICU properties
    // Use framework icudt54l.dat and if that is not present then
    // use the one from the resources directory
    NSBundle* fwBundle =
        [NSBundle bundleWithIdentifier:@"org.moe.MOE"];

#ifndef USE_APLE_CF
    if (fwBundle) {
      setenv("MOE_ICU_DATA", [[fwBundle resourcePath] UTF8String], true);
    } else {
      setenv("MOE_ICU_DATA", [resourcePath UTF8String], true);
    }
#endif
      
    // Set default properties
    setenv("MOE_TMP_DIR", [NSTemporaryDirectory() UTF8String], true);
    setenv("MOE_USER_HOME", [[mainBundle bundlePath] UTF8String], true);
    setenv("MOE_USER_NAME", "moeuser", true);
    setenv("MOE_USER_SHELL", "/bin/bash", true);
    setenv("ANDROID_ROOT",
           [[[mainBundle bundlePath]
               stringByAppendingPathComponent:@"android_root"] UTF8String],
           true);
    setenv("ANDROID_DATA",
           [[[mainBundle bundlePath]
               stringByAppendingPathComponent:@"android_data"] UTF8String],
           true);

    // Create array for arguments
    NSMutableArray* args = [NSMutableArray array];

    // Add ignorable first arg
    [args addObject:@""];

    // Set MOE specific properties
    NSOperatingSystemVersion ver =
        [[NSProcessInfo processInfo] operatingSystemVersion];
    NSString* verStr =
        [NSString stringWithFormat:@"-Dmoe.platform.version=%@.%@.%@",
                                   @(ver.majorVersion), @(ver.minorVersion),
                                   @(ver.patchVersion)];
    [args addObject:verStr];
#if TARGET_OS_MAC
#if TARGET_OS_IOS
    [args addObject:@"-Dmoe.platform.name=iOS"];
#else
#error Unsupported Mac OS X variant
#endif
#else
#error Unsupported OS
#endif
    [args addObject:@"-Dmoe.version=" xstr(BUILD_VERSION)];

    // Create arguments for classpath
    [args addObject:@CLASSPATH_PREFIX];
    [args addObject:@""];

    // Create argument for boot classpath, resources will be placed there
    [args
        addObject:[NSString stringWithFormat:@"%s%@/%s:%@",
                                             BOOTCLASSPATH_PREFIX, resourcePath,
                                             RESOURCES_NAME, resourcePath]];

    // Create argument for art image
    [args addObject:[NSString stringWithFormat:@"%s%@/%s", IMAGE_PREFIX,
                                               resourcePath, IMAGE_NAME]];

    // Read VM args
    int jargi = 1;
    NSString* mainClass = nil;
    while (jargi < jargc) {
      NSString* opt = [NSString stringWithUTF8String:jargv[jargi++]];
      if ([opt isEqualToString:@"-mainClass"]) {
        if (jargi < jargc) {
          mainClass = [NSString stringWithUTF8String:jargv[jargi++]];
        } else {
          std::cerr << "FATAL: Missing argument after -mainClass\n";
          abort();
        }
      } else if ([opt isEqualToString:@"-args"]) {
        break;
      } else {
        [args addObject:opt];
      }
    }

    // Create argument for main class
    if (mainClass == nil) {
      mainClass =
          [[mainBundle infoDictionary] objectForKey:@"MOE.Main.Class"];
    }
    if (mainClass == nil) {
      std::cerr << "FATAL: mainClass is nil! Please specify with '-mainClass' argument or with the 'MOE.Main.Class' key in Info.plist file.\n";
      abort();
    }
    [args addObject:mainClass];
    
    NSDictionary* plistEnvs = [[mainBundle infoDictionary] objectForKey:@"MOE.Env"];
    if (plistEnvs != nil) {
      if (![plistEnvs isKindOfClass:[NSDictionary class]]) {
        std::cerr << "FATAL: MOE.Env in Info.plist is not a dictionary!\n";
        abort();
      }
      [plistEnvs enumerateKeysAndObjectsUsingBlock:^(id  _Nonnull key, id  _Nonnull obj, BOOL * _Nonnull stop) {
        if (![obj isKindOfClass:[NSString class]]) {
          std::cerr << "FATAL: MOE.Env error in Info.plist: value for '" << [key UTF8String] << "' is not a string!\n";
          abort();
        }
        setenv([key UTF8String], [obj UTF8String], true);
      }];
    }

    // Append java arguments
    while (jargi < jargc) {
      NSString* opt = [NSString stringWithUTF8String:jargv[jargi++]];
      [args addObject:opt];
    }

    // Build up class preregister list
    NSURL* url = [NSURL URLWithString:@"preregister.txt"
                        relativeToURL:[mainBundle resourceURL]];
    NSString* fileContents =
        [NSString stringWithContentsOfFile:[url path]
                                  encoding:NSUTF8StringEncoding
                                     error:nil];
    NSMutableArray* lines = [NSMutableArray
        arrayWithArray:[fileContents componentsSeparatedByCharactersInSet:
                                         [NSCharacterSet newlineCharacterSet]]];
    [lines
        filterUsingPredicate:
            [NSPredicate predicateWithBlock:^BOOL(id line, NSDictionary* dict) {
                return [line length] > 0;
            }]];

    // Create c argument array for preregister list
    NSUInteger prec = [lines count];
    const char** prev = (char const**)alloca(prec * sizeof(char*));
    for (NSUInteger i = 0; i < prec; i++) {
      prev[i] = [[lines objectAtIndex:i] UTF8String];
    }

    // Create c argument array
    NSUInteger argc = [args count];
    const char** argv = (char const**)alloca((argc + 1) * sizeof(char*));
    for (NSUInteger i = 0; i < argc; i++) {
      argv[i] = [[args objectAtIndex:i] UTF8String];
    }
    argv[argc] = NULL;  // ART runtime requires a null terminator

#if defined(__arm__)
    __asm__ volatile(
        "vmrs r0, fpscr\n"
        "bic r0, $(1 << 24)\n"
        "vmsr fpscr, r0"
        :
        :
        : "r0");
#endif

    dalvikvm(argc, (char**)argv, prec, (char**)prev);
  }
  return 0;
}
