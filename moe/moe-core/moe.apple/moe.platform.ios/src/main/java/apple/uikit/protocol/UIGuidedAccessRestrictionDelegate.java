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

package apple.uikit.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UIGuidedAccessRestrictionDelegate
 * 
 * Implement on the application delegate to present the user with additional Guided Access restrictions.
 * 
 * The initial state of all Guided Access restrictions is UIGuidedAccessRestrictionStateAllow.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIGuidedAccessRestrictionDelegate")
public interface UIGuidedAccessRestrictionDelegate {
    /**
     * Returns a localized string that gives additional detail about the restriction associated with the identifier.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("detailTextForGuidedAccessRestrictionWithIdentifier:")
    default String detailTextForGuidedAccessRestrictionWithIdentifier(@NotNull String restrictionIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a list of restriction identifiers in the order they will be presented to the user.
     * Each restriction identifier must be unique string.
     * For example: com.MyCompany.MyApp.SomeRestrictionIdentifier
     */
    @Nullable
    @Generated
    @Selector("guidedAccessRestrictionIdentifiers")
    NSArray<String> guidedAccessRestrictionIdentifiers();

    /**
     * Called each time the restriction associated with the identifier changes state.
     */
    @Generated
    @Selector("guidedAccessRestrictionWithIdentifier:didChangeState:")
    void guidedAccessRestrictionWithIdentifierDidChangeState(@NotNull String restrictionIdentifier,
            @NInt long newRestrictionState);

    /**
     * Returns a localized string that describes the restriction associated with the identifier.
     */
    @Nullable
    @Generated
    @Selector("textForGuidedAccessRestrictionWithIdentifier:")
    String textForGuidedAccessRestrictionWithIdentifier(@NotNull String restrictionIdentifier);
}
