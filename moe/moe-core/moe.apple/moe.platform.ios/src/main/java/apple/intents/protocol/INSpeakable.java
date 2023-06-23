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

package apple.intents.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSpeakable")
public interface INSpeakable {
    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Please use vocabularyIdentifier
     */
    @Nullable
    @Deprecated
    @IsOptional
    @Generated
    @Selector("identifier")
    default String identifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @Selector("pronunciationHint")
    String pronunciationHint();

    @NotNull
    @Generated
    @Selector("spokenPhrase")
    String spokenPhrase();

    @Nullable
    @Generated
    @Selector("alternativeSpeakableMatches")
    NSArray<?> alternativeSpeakableMatches();

    @Nullable
    @Generated
    @Selector("vocabularyIdentifier")
    String vocabularyIdentifier();
}
