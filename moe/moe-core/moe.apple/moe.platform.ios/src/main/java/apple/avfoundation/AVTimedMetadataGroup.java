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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVTimedMetadataGroup
 * 
 * AVTimedMetadataGroup is used to represent a collection of metadata items that are valid for use during a specific
 * range of time. For example, AVTimedMetadataGroups are used to represent chapters, optionally containing metadata
 * items for chapter titles and chapter images.
 * 
 * API-Since: 4.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVTimedMetadataGroup extends AVMetadataGroup implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVTimedMetadataGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVTimedMetadataGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVTimedMetadataGroup allocWithZone(VoidPtr zone);

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
    public static native AVTimedMetadataGroup new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * copyFormatDescription
     * 
     * Creates a format description based on the receiver's items.
     * 
     * The returned format description is suitable for use as the format hint parameter when creating an instance of
     * AVAssetWriterInput.
     * 
     * Each item referenced by the receiver must carry a non-nil value for its dataType property. An exception will be
     * thrown if any item does not have a data type.
     * 
     * API-Since: 8.0
     * 
     * @return An instance of CMMetadataFormatDescription sufficient to describe the contents of all the items
     *         referenced by the receiver.
     */
    @Nullable
    @Generated
    @Selector("copyFormatDescription")
    public native CMFormatDescriptionRef copyFormatDescription();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native AVTimedMetadataGroup init();

    /**
     * initWithItems:timeRange:
     * 
     * Initializes an instance of AVTimedMetadataGroup with a collection of metadata items.
     * 
     * @param items
     *                  An NSArray of AVMetadataItems.
     * @param timeRange
     *                  The timeRange of the collection of AVMetadataItems.
     * @return An instance of AVTimedMetadataGroup.
     */
    @Generated
    @Selector("initWithItems:timeRange:")
    public native AVTimedMetadataGroup initWithItemsTimeRange(@NotNull NSArray<? extends AVMetadataItem> items,
            @ByValue CMTimeRange timeRange);

    /**
     * initWithSampleBuffer:
     * 
     * Initializes an instance of AVTimedMetadataGroup with a sample buffer.
     * 
     * @param sampleBuffer
     *                     A CMSampleBuffer with media type kCMMediaType_Metadata.
     * @return An instance of AVTimedMetadataGroup.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @Selector("initWithSampleBuffer:")
    public native AVTimedMetadataGroup initWithSampleBuffer(@NotNull CMSampleBufferRef sampleBuffer);

    /**
     * an array of AVMetadataItems
     */
    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<? extends AVMetadataItem> items();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    /**
     * indicates the time range of the timed metadata
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();
}
