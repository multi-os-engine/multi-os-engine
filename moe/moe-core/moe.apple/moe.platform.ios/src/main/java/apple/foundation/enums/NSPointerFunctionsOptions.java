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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSPointerFunctions
 * <p>
 * This object defines callout functions appropriate for managing a pointer reference held somewhere else.
 * <p>
 * Used by NSHashTable, NSMapTable, and NSPointerArray, this object defines the acquision and retention behavior for the
 * pointers provided to these collection objects.
 * <p>
 * The functions are separated into two clusters - those that define "personality", such as object or cString, and those
 * that describe memory management issues such as a memory deallocation function. Common personalities and memory
 * manager selections are provided as enumerations, and further customization is provided by methods such that the
 * composition of the actual list of functions is done opaquely such that they can be extended in the future.
 * <p>
 * The pointer collections copy NSPointerFunctions objects on input and output, and so NSPointerFunctions is not
 * usefully subclassed.
 */
@Generated
public final class NSPointerFunctionsOptions {
    /**
     * use strong write-barrier to backing store; use GC memory on copyIn
     */
    @Generated @NUInt public static final long StrongMemory = 0x0000000000000000L;
    @Generated @NUInt public static final long OpaqueMemory = 0x0000000000000002L;
    /**
     * free() will be called on removal, calloc on copyIn
     */
    @Generated @NUInt public static final long MallocMemory = 0x0000000000000003L;
    @Generated @NUInt public static final long MachVirtualMemory = 0x0000000000000004L;
    /**
     * uses weak read and write barriers appropriate for ARC
     */
    @Generated @NUInt public static final long WeakMemory = 0x0000000000000005L;
    /**
     * use -hash and -isEqual, object description
     */
    @Generated @NUInt public static final long ObjectPersonality = 0x0000000000000000L;
    /**
     * use shifted pointer hash and direct equality
     */
    @Generated @NUInt public static final long OpaquePersonality = 0x0000000000000100L;
    /**
     * use shifted pointer hash and direct equality, object description
     */
    @Generated @NUInt public static final long ObjectPointerPersonality = 0x0000000000000200L;
    /**
     * use a string hash and strcmp, description assumes UTF-8 contents; recommended for UTF-8 (or ASCII, which is a
     * subset) only cstrings
     */
    @Generated @NUInt public static final long CStringPersonality = 0x0000000000000300L;
    /**
     * use a memory hash and memcmp (using size function you must set)
     */
    @Generated @NUInt public static final long StructPersonality = 0x0000000000000400L;
    /**
     * use unshifted value as hash & equality
     */
    @Generated @NUInt public static final long IntegerPersonality = 0x0000000000000500L;
    /**
     * the memory acquire function will be asked to allocate and copy items on input
     */
    @Generated @NUInt public static final long CopyIn = 0x0000000000010000L;

    @Generated
    private NSPointerFunctionsOptions() {
    }
}
