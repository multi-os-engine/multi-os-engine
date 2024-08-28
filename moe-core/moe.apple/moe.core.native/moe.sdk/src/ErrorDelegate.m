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

#import "ErrorDelegate.h"

extern NSString* moeErrorTitle;
extern NSString* moeErrorDescription;

@implementation ErrorDelegate {
  UIAlertView* alertView;
}

- (BOOL)application:(UIApplication*)application
    didFinishLaunchingWithOptions:(NSDictionary*)launchOptions {
  self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
  // Override point for customization after application launch.
  self.window.backgroundColor = [UIColor whiteColor];
  [self.window makeKeyAndVisible];

  alertView = [[UIAlertView alloc] initWithTitle:moeErrorTitle
                                         message:moeErrorDescription
                                        delegate:self
                               cancelButtonTitle:nil
                               otherButtonTitles:nil, nil];
  [alertView show];

  return YES;
}

- (void)dealloc {
  [alertView release];
  [super dealloc];
}

@end
