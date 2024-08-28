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

package apple.foundation.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * Objects which are safe to be encoded and decoded across privilege boundaries should adopt NSSecureCoding instead of
 * NSCoding. Secure coders (those that respond YES to requiresSecureCoding) will only encode objects that adopt the
 * NSSecureCoding protocol.
 * NOTE: NSSecureCoding guarantees only that an archive contains the classes it claims. It makes no guarantees about the
 * suitability for consumption by the receiver of the decoded content of the archive. Archived objects which may trigger
 * code evaluation should be validated independently by the consumer of the objects to verify that no malicious code is
 * executed (i.e. by checking key paths, selectors etc. specified in the archive).
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSSecureCoding")
public interface NSSecureCoding extends NSCoding {
    /**
     * This property must return YES on all classes that allow secure coding. Subclasses of classes that adopt
     * NSSecureCoding and override initWithCoder: must also override this method and return YES.
     * The Secure Coding Guide should be consulted when writing methods that decode data.
     */
    @Generated
    @Selector("supportsSecureCoding")
    @ProtocolClassMethod("supportsSecureCoding")
    boolean _supportsSecureCoding();
}
