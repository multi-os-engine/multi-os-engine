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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * UIGuidedAccessRestrictions
 * <p>
 * Guided Access is a feature that restricts iOS to running only one app, while disabling the use of hardware buttons.
 * <p>
 * The UIGuidedAccessRestrictions protocol allows an app to specify additional features that can be disabled by users when in Guided Access mode.
 * <p>
 * For example, a Photos-based app could disallow photo deletion.
 * If the user disabled photo deletion, guidedAccessRestrictionWithIdentifier:willChangeState: will be called.
 * The app should then completely remove the ability to delete photos through any user interface mechanism.
 * <p>
 * The app should provide the list of semantic features that are desirable to be disabled while running in Guided Access mode.
 */
@Generated
public final class UIGuidedAccessRestrictionState {
    @Generated @NInt public static final long Allow = 0x0000000000000000L;
    @Generated @NInt public static final long Deny = 0x0000000000000001L;

    @Generated
    private UIGuidedAccessRestrictionState() {
    }
}
