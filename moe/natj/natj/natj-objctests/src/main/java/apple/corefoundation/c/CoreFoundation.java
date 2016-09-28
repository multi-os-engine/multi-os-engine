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

package apple.corefoundation.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.struct.CFRange;

@Generated
@Library("CoreFoundation")
@Runtime(CRuntime.class)
public final class CoreFoundation {
    static {
        NatJ.register();
    }

    @Generated
    private CoreFoundation() {
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFRange CFRangeMake(long loc, long len);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCString(
            CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    @Generated
    @CFunction
    public static native void CFArrayGetValues(CFArrayRef theArray,
                                               @ByValue CFRange range, Ptr<ConstVoidPtr> values);
}
