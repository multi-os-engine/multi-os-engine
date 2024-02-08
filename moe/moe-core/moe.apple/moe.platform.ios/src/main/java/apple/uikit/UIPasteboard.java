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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSItemProvider;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPasteboard extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPasteboard(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPasteboard alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPasteboard allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("generalPasteboard")
    public static native UIPasteboard generalPasteboard();

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
    public static native UIPasteboard new_objc();

    @Nullable
    @Generated
    @Selector("pasteboardWithName:create:")
    public static native UIPasteboard pasteboardWithNameCreate(@NotNull String pasteboardName, boolean create);

    @NotNull
    @Generated
    @Selector("pasteboardWithUniqueName")
    public static native UIPasteboard pasteboardWithUniqueName();

    @Generated
    @Selector("removePasteboardWithName:")
    public static native void removePasteboardWithName(@NotNull String pasteboardName);

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

    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Nullable
    @Generated
    @Selector("URLs")
    public native NSArray<? extends NSURL> URLs();

    @Generated
    @Selector("addItems:")
    public native void addItems(@NotNull NSArray<? extends NSDictionary<String, ?>> items);

    @Generated
    @Selector("changeCount")
    @NInt
    public native long changeCount();

    @Nullable
    @Generated
    @Selector("color")
    public native UIColor color();

    @Nullable
    @Generated
    @Selector("colors")
    public native NSArray<? extends UIColor> colors();

    @Generated
    @Selector("containsPasteboardTypes:")
    public native boolean containsPasteboardTypes(@NotNull NSArray<String> pasteboardTypes);

    @Generated
    @Selector("containsPasteboardTypes:inItemSet:")
    public native boolean containsPasteboardTypesInItemSet(@NotNull NSArray<String> pasteboardTypes,
            @Nullable NSIndexSet itemSet);

    @Nullable
    @Generated
    @Selector("dataForPasteboardType:")
    public native NSData dataForPasteboardType(@NotNull String pasteboardType);

    @Nullable
    @Generated
    @Selector("dataForPasteboardType:inItemSet:")
    public native NSArray<? extends NSData> dataForPasteboardTypeInItemSet(@NotNull String pasteboardType,
            @Nullable NSIndexSet itemSet);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasColors")
    public native boolean hasColors();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasImages")
    public native boolean hasImages();

    /**
     * Queries
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasStrings")
    public native boolean hasStrings();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasURLs")
    public native boolean hasURLs();

    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Nullable
    @Generated
    @Selector("images")
    public native NSArray<? extends UIImage> images();

    @Generated
    @Selector("init")
    public native UIPasteboard init();

    @Generated
    @Selector("isPersistent")
    public native boolean isPersistent();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Do not set persistence on pasteboards. This property is set automatically.
     */
    @Deprecated
    @Generated
    @Selector("setPersistent:")
    public native void setPersistent(boolean persistent);

    @Nullable
    @Generated
    @Selector("itemSetWithPasteboardTypes:")
    public native NSIndexSet itemSetWithPasteboardTypes(@NotNull NSArray<String> pasteboardTypes);

    /**
     * Direct access
     */
    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<? extends NSDictionary<String, ?>> items();

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Multiple items
     */
    @Generated
    @Selector("numberOfItems")
    @NInt
    public native long numberOfItems();

    /**
     * First item
     */
    @NotNull
    @Generated
    @Selector("pasteboardTypes")
    public native NSArray<String> pasteboardTypes();

    @Nullable
    @Generated
    @Selector("pasteboardTypesForItemSet:")
    public native NSArray<? extends NSArray<String>> pasteboardTypesForItemSet(@Nullable NSIndexSet itemSet);

    @Generated
    @Selector("setColor:")
    public native void setColor(@Nullable UIColor value);

    @Generated
    @Selector("setColors:")
    public native void setColors(@Nullable NSArray<? extends UIColor> value);

    @Generated
    @Selector("setData:forPasteboardType:")
    public native void setDataForPasteboardType(@NotNull NSData data, @NotNull String pasteboardType);

    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    @Generated
    @Selector("setImages:")
    public native void setImages(@Nullable NSArray<? extends UIImage> value);

    /**
     * Direct access
     */
    @Generated
    @Selector("setItems:")
    public native void setItems(@NotNull NSArray<? extends NSDictionary<String, ?>> value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setItems:options:")
    public native void setItemsOptions(@NotNull NSArray<? extends NSDictionary<String, ?>> items,
            @NotNull NSDictionary<String, ?> options);

    @Generated
    @Selector("setString:")
    public native void setString(@Nullable String value);

    @Generated
    @Selector("setStrings:")
    public native void setStrings(@Nullable NSArray<String> value);

    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    @Generated
    @Selector("setURLs:")
    public native void setURLs(@Nullable NSArray<? extends NSURL> value);

    @Generated
    @Selector("setValue:forPasteboardType:")
    public native void setValueForPasteboardType(@NotNull @Mapped(ObjCObjectMapper.class) Object value,
            @NotNull String pasteboardType);

    @Nullable
    @Generated
    @Selector("string")
    public native String string();

    @Nullable
    @Generated
    @Selector("strings")
    public native NSArray<String> strings();

    @Nullable
    @Generated
    @Selector("valueForPasteboardType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForPasteboardType(@NotNull String pasteboardType);

    @Nullable
    @Generated
    @Selector("valuesForPasteboardType:inItemSet:")
    public native NSArray<?> valuesForPasteboardTypeInItemSet(@NotNull String pasteboardType,
            @Nullable NSIndexSet itemSet);

    /**
     * Item provider interface
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("itemProviders")
    public native NSArray<? extends NSItemProvider> itemProviders();

    /**
     * Item provider interface
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setItemProviders:")
    public native void setItemProviders(@NotNull NSArray<? extends NSItemProvider> value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setItemProviders:localOnly:expirationDate:")
    public native void setItemProvidersLocalOnlyExpirationDate(@NotNull NSArray<? extends NSItemProvider> itemProviders,
            boolean localOnly, @Nullable NSDate expirationDate);

    /**
     * Automatically creates item providers wrapping the objects passed in.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setObjects:")
    public native void setObjects(@NotNull NSArray<?> objects);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setObjects:localOnly:expirationDate:")
    public native void setObjectsLocalOnlyExpirationDate(@NotNull NSArray<?> objects, boolean localOnly,
            @Nullable NSDate expirationDate);

    /**
     * Detects patterns in the first pasteboard item.
     * 
     * @param patterns          Detect only these patterns.
     * @param completionHandler Receives which patterns were detected, or an error.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("detectPatternsForPatterns:completionHandler:")
    public native void detectPatternsForPatternsCompletionHandler(@NotNull NSSet<String> patterns,
            @NotNull @ObjCBlock(name = "call_detectPatternsForPatternsCompletionHandler") Block_detectPatternsForPatternsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectPatternsForPatternsCompletionHandler {
        @Generated
        void call_detectPatternsForPatternsCompletionHandler(@Nullable NSSet<String> arg0, @Nullable NSError arg1);
    }

    /**
     * Detects patterns in the specified pasteboard items.
     * 
     * @param patterns          Detect only these patterns.
     * @param itemSet           Specifies which pasteboard items by their position. Nil means all items.
     * @param completionHandler Receives which patterns were detected per item specified,
     *                          or an error.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("detectPatternsForPatterns:inItemSet:completionHandler:")
    public native void detectPatternsForPatternsInItemSetCompletionHandler(@NotNull NSSet<String> patterns,
            @Nullable NSIndexSet itemSet,
            @NotNull @ObjCBlock(name = "call_detectPatternsForPatternsInItemSetCompletionHandler") Block_detectPatternsForPatternsInItemSetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectPatternsForPatternsInItemSetCompletionHandler {
        @Generated
        void call_detectPatternsForPatternsInItemSetCompletionHandler(@Nullable NSArray<? extends NSSet<String>> arg0,
                @Nullable NSError arg1);
    }

    /**
     * Detects patterns and corresponding values in the first pasteboard item.
     * 
     * @param patterns          Detect only these patterns.
     * @param completionHandler Receives which patterns and values were detected, or an error.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("detectValuesForPatterns:completionHandler:")
    public native void detectValuesForPatternsCompletionHandler(@NotNull NSSet<String> patterns,
            @NotNull @ObjCBlock(name = "call_detectValuesForPatternsCompletionHandler") Block_detectValuesForPatternsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectValuesForPatternsCompletionHandler {
        @Generated
        void call_detectValuesForPatternsCompletionHandler(@Nullable NSDictionary<String, ?> arg0,
                @Nullable NSError arg1);
    }

    /**
     * Detects patterns and corresponding values in the specified pasteboard items.
     * 
     * @param patterns          Detect only these patterns.
     * @param itemSet           Specifies which pasteboard items by their position. Nil means all items.
     * @param completionHandler Receives which patterns and values were detected per item specified,
     *                          or an error.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @Selector("detectValuesForPatterns:inItemSet:completionHandler:")
    public native void detectValuesForPatternsInItemSetCompletionHandler(@NotNull NSSet<String> patterns,
            @Nullable NSIndexSet itemSet,
            @NotNull @ObjCBlock(name = "call_detectValuesForPatternsInItemSetCompletionHandler") Block_detectValuesForPatternsInItemSetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectValuesForPatternsInItemSetCompletionHandler {
        @Generated
        void call_detectValuesForPatternsInItemSetCompletionHandler(
                @Nullable NSArray<? extends NSDictionary<String, ?>> arg0, @Nullable NSError arg1);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
