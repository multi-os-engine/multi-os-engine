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

package apple.corespotlight;

import apple.NSObject;
import apple.corespotlight.protocol.CSSearchableIndexDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSExtensionRequestHandling;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSIndexExtensionRequestHandler extends NSObject implements NSExtensionRequestHandling,
        CSSearchableIndexDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected CSIndexExtensionRequestHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSIndexExtensionRequestHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CSIndexExtensionRequestHandler allocWithZone(VoidPtr zone);

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
    public static native CSIndexExtensionRequestHandler new_objc();

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

    @Generated
    @Selector("beginRequestWithExtensionContext:")
    public native void beginRequestWithExtensionContext(@NotNull NSExtensionContext context);

    @Generated
    @Selector("init")
    public native CSIndexExtensionRequestHandler init();

    @Generated
    @Selector("searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    public native void searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler(
            @NotNull CSSearchableIndex searchableIndex,
            @NotNull @ObjCBlock(name = "call_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler") CSSearchableIndexDelegate.Block_searchableIndexReindexAllSearchableItemsWithAcknowledgementHandler acknowledgementHandler);

    @Generated
    @Selector("searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    public native void searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler(
            @NotNull CSSearchableIndex searchableIndex, @NotNull NSArray<String> identifiers,
            @NotNull @ObjCBlock(name = "call_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler") CSSearchableIndexDelegate.Block_searchableIndexReindexSearchableItemsWithIdentifiersAcknowledgementHandler acknowledgementHandler);

    @Generated
    @IsOptional
    @Selector("searchableIndexDidFinishThrottle:")
    public native void searchableIndexDidFinishThrottle(@NotNull CSSearchableIndex searchableIndex);

    @Generated
    @IsOptional
    @Selector("searchableIndexDidThrottle:")
    public native void searchableIndexDidThrottle(@NotNull CSSearchableIndex searchableIndex);

    @Nullable
    @Generated
    @IsOptional
    @Selector("dataForSearchableIndex:itemIdentifier:typeIdentifier:error:")
    public native NSData dataForSearchableIndexItemIdentifierTypeIdentifierError(
            @NotNull CSSearchableIndex searchableIndex, @NotNull String itemIdentifier, @NotNull String typeIdentifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @IsOptional
    @Selector("fileURLForSearchableIndex:itemIdentifier:typeIdentifier:inPlace:error:")
    public native NSURL fileURLForSearchableIndexItemIdentifierTypeIdentifierInPlaceError(
            @NotNull CSSearchableIndex searchableIndex, @NotNull String itemIdentifier, @NotNull String typeIdentifier,
            boolean inPlace, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
