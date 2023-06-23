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

package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * HKCDADocumentSample
 * 
 * A sample object representing a CDA document.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKCDADocumentSample extends HKDocumentSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKCDADocumentSample(Pointer peer) {
        super(peer);
    }

    /**
     * CDADocumentSampleWithData:startDate:endDate:device:metadata:validationError:
     * 
     * Creates a new document sample with the specified attributes.
     * 
     * Attributes of the document, such as title, patient name, etc. will be extracted automatically
     * from the document content.
     * 
     * @param documentData    Document contents in an XML format that meets the CDA standard.
     * @param startDate       The start date for the document.
     * @param endDate         The end date for the document.
     * @param metadata        Metadata for the document.
     * @param validationError The XML content will be validated against the standard for CDA content. If that validation
     *                        fails, then this parameter will be set with the relavant error. Detailed information about
     *                        the
     *                        failure may be obtained by examining the value for the HKDetailedCDAValidationErrorKey key
     *                        of
     *                        the NSError's userInfo dictionary.
     * @return The new instance or nil if the documentData does not pass validation.
     */
    @Generated
    @Selector("CDADocumentSampleWithData:startDate:endDate:metadata:validationError:")
    public static native HKCDADocumentSample CDADocumentSampleWithDataStartDateEndDateMetadataValidationError(
            @NotNull NSData documentData, @NotNull NSDate startDate, @NotNull NSDate endDate,
            @Nullable NSDictionary<String, ?> metadata,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> validationError);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKCDADocumentSample alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKCDADocumentSample allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKCDADocumentSample new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] document
     * 
     * The contents of the document.
     * 
     * Access to each CDA instance must be authorized by the user in order for the document data to be
     * accessible to an app. The authorization request occurs the first time a document matches the predicate
     * of an executed HKDocumentQuery. This property will always be nil if the sample is returned by an
     * HKSampleQuery or an HKAnchoredObjectQuery.
     */
    @Nullable
    @Generated
    @Selector("document")
    public native HKCDADocument document();

    @Generated
    @Selector("init")
    public native HKCDADocumentSample init();

    @Generated
    @Selector("initWithCoder:")
    public native HKCDADocumentSample initWithCoder(@NotNull NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
