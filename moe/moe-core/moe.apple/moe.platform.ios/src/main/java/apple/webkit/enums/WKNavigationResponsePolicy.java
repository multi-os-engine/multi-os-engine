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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKNavigationResponsePolicy
 * 
 * The policy to pass back to the decision handler from the webView:decidePolicyForNavigationResponse:decisionHandler: method.
 * [@constant] WKNavigationResponsePolicyCancel   Cancel the navigation.
 * [@constant] WKNavigationResponsePolicyAllow    Allow the navigation to continue.
 */
@Generated
public final class WKNavigationResponsePolicy {
    @Generated @NInt public static final long Cancel = 0x0000000000000000L;
    @Generated @NInt public static final long Allow = 0x0000000000000001L;

    @Generated
    private WKNavigationResponsePolicy() {
    }
}
