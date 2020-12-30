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

package apple.imageio.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum CGImageMetadataErrors
 * @discussion the list of all error codes returned under the error domain kCFErrorDomainCGImageMetadata
 */
@Generated
public final class CGImageMetadataErrors {
    @Generated public static final int Unknown = 0x00000000;
    @Generated public static final int UnsupportedFormat = 0x00000001;
    @Generated public static final int BadArgument = 0x00000002;
    @Generated public static final int ConflictingArguments = 0x00000003;
    @Generated public static final int PrefixConflict = 0x00000004;

    @Generated
    private CGImageMetadataErrors() {
    }
}
