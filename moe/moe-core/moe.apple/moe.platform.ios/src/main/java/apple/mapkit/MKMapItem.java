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

package apple.mapkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIScene;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKMapItem extends NSObject implements NSSecureCoding, NSItemProviderReading, NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected MKMapItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKMapItem allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("mapItemForCurrentLocation")
    public static native MKMapItem mapItemForCurrentLocation();

    @Generated
    @Owned
    @Selector("new")
    public static native MKMapItem new_objc();

    @Generated
    @Selector("openMapsWithItems:launchOptions:")
    public static native boolean openMapsWithItemsLaunchOptions(@NotNull NSArray<? extends MKMapItem> mapItems,
            @Nullable NSDictionary<String, ?> launchOptions);

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
    @Selector("init")
    public native MKMapItem init();

    @Generated
    @Selector("initWithPlacemark:")
    public native MKMapItem initWithPlacemark(@NotNull MKPlacemark placemark);

    @Generated
    @Selector("isCurrentLocation")
    public native boolean isCurrentLocation();

    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("openInMapsWithLaunchOptions:")
    public native boolean openInMapsWithLaunchOptions(@Nullable NSDictionary<String, ?> launchOptions);

    @Nullable
    @Generated
    @Selector("phoneNumber")
    public native String phoneNumber();

    /**
     * If this MKMapItem represents your current location (isCurrentLocation == YES), then placemark will be nil.
     */
    @NotNull
    @Generated
    @Selector("placemark")
    public native MKPlacemark placemark();

    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    @Generated
    @Selector("setPhoneNumber:")
    public native void setPhoneNumber(@Nullable String value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(@Nullable NSTimeZone value);

    @Generated
    @Selector("setUrl:")
    public native void setUrl(@Nullable NSURL value);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    @Nullable
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MKMapItem initWithCoder(@NotNull NSCoder coder);

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(
            @NotNull String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(@NotNull String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(@NotNull String typeIdentifier);

    @Nullable
    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(@NotNull String typeIdentifier,
            @NotNull @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native MKMapItem objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public MKMapItem _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @NotNull
    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @NotNull
    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @NotNull
    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @NotNull
    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * fromScene is used to indicate the UIScene where the user interaction took place.
     * 
     * API-Since: 13.2
     */
    @Generated
    @Selector("openInMapsWithLaunchOptions:fromScene:completionHandler:")
    public native void openInMapsWithLaunchOptionsFromSceneCompletionHandler(
            @Nullable NSDictionary<String, ?> launchOptions, @Nullable UIScene scene,
            @Nullable @ObjCBlock(name = "call_openInMapsWithLaunchOptionsFromSceneCompletionHandler") Block_openInMapsWithLaunchOptionsFromSceneCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openInMapsWithLaunchOptionsFromSceneCompletionHandler {
        @Generated
        void call_openInMapsWithLaunchOptionsFromSceneCompletionHandler(boolean success);
    }

    /**
     * API-Since: 13.2
     */
    @Generated
    @Selector("openMapsWithItems:launchOptions:fromScene:completionHandler:")
    public static native void openMapsWithItemsLaunchOptionsFromSceneCompletionHandler(
            @NotNull NSArray<? extends MKMapItem> mapItems, @Nullable NSDictionary<String, ?> launchOptions,
            @Nullable UIScene scene,
            @Nullable @ObjCBlock(name = "call_openMapsWithItemsLaunchOptionsFromSceneCompletionHandler") Block_openMapsWithItemsLaunchOptionsFromSceneCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openMapsWithItemsLaunchOptionsFromSceneCompletionHandler {
        @Generated
        void call_openMapsWithItemsLaunchOptionsFromSceneCompletionHandler(boolean success);
    }

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("pointOfInterestCategory")
    public native String pointOfInterestCategory();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPointOfInterestCategory:")
    public native void setPointOfInterestCategory(@Nullable String value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
