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

    @Generated
    @Selector("allocWithZone:")
    public static native UIPasteboard allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIPasteboard new_objc();

    @Generated
    @Selector("pasteboardWithName:create:")
    public static native UIPasteboard pasteboardWithNameCreate(String pasteboardName, boolean create);

    @Generated
    @Selector("pasteboardWithUniqueName")
    public static native UIPasteboard pasteboardWithUniqueName();

    @Generated
    @Selector("removePasteboardWithName:")
    public static native void removePasteboardWithName(String pasteboardName);

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
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("URLs")
    public native NSArray<? extends NSURL> URLs();

    @Generated
    @Selector("addItems:")
    public native void addItems(NSArray<? extends NSDictionary<String, ?>> items);

    @Generated
    @Selector("changeCount")
    @NInt
    public native long changeCount();

    @Generated
    @Selector("color")
    public native UIColor color();

    @Generated
    @Selector("colors")
    public native NSArray<? extends UIColor> colors();

    @Generated
    @Selector("containsPasteboardTypes:")
    public native boolean containsPasteboardTypes(NSArray<String> pasteboardTypes);

    @Generated
    @Selector("containsPasteboardTypes:inItemSet:")
    public native boolean containsPasteboardTypesInItemSet(NSArray<String> pasteboardTypes, NSIndexSet itemSet);

    @Generated
    @Selector("dataForPasteboardType:")
    public native NSData dataForPasteboardType(String pasteboardType);

    @Generated
    @Selector("dataForPasteboardType:inItemSet:")
    public native NSArray<? extends NSData> dataForPasteboardTypeInItemSet(String pasteboardType, NSIndexSet itemSet);

    @Generated
    @Selector("hasColors")
    public native boolean hasColors();

    @Generated
    @Selector("hasImages")
    public native boolean hasImages();

    /**
     * Queries
     */
    @Generated
    @Selector("hasStrings")
    public native boolean hasStrings();

    @Generated
    @Selector("hasURLs")
    public native boolean hasURLs();

    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("images")
    public native NSArray<? extends UIImage> images();

    @Generated
    @Selector("init")
    public native UIPasteboard init();

    @Generated
    @Selector("isPersistent")
    public native boolean isPersistent();

    @Generated
    @Selector("setPersistent:")
    public native void setPersistent(boolean persistent);

    @Generated
    @Selector("itemSetWithPasteboardTypes:")
    public native NSIndexSet itemSetWithPasteboardTypes(NSArray<String> pasteboardTypes);

    /**
     * Direct access
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends NSDictionary<String, ?>> items();

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
    @Generated
    @Selector("pasteboardTypes")
    public native NSArray<String> pasteboardTypes();

    @Generated
    @Selector("pasteboardTypesForItemSet:")
    public native NSArray<? extends NSArray<String>> pasteboardTypesForItemSet(NSIndexSet itemSet);

    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    @Generated
    @Selector("setColors:")
    public native void setColors(NSArray<? extends UIColor> value);

    @Generated
    @Selector("setData:forPasteboardType:")
    public native void setDataForPasteboardType(NSData data, String pasteboardType);

    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    @Generated
    @Selector("setImages:")
    public native void setImages(NSArray<? extends UIImage> value);

    /**
     * Direct access
     */
    @Generated
    @Selector("setItems:")
    public native void setItems(NSArray<? extends NSDictionary<String, ?>> value);

    @Generated
    @Selector("setItems:options:")
    public native void setItemsOptions(NSArray<? extends NSDictionary<String, ?>> items,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("setString:")
    public native void setString(String value);

    @Generated
    @Selector("setStrings:")
    public native void setStrings(NSArray<String> value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    @Generated
    @Selector("setURLs:")
    public native void setURLs(NSArray<? extends NSURL> value);

    @Generated
    @Selector("setValue:forPasteboardType:")
    public native void setValueForPasteboardType(@Mapped(ObjCObjectMapper.class) Object value, String pasteboardType);

    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("strings")
    public native NSArray<String> strings();

    @Generated
    @Selector("valueForPasteboardType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForPasteboardType(String pasteboardType);

    @Generated
    @Selector("valuesForPasteboardType:inItemSet:")
    public native NSArray<?> valuesForPasteboardTypeInItemSet(String pasteboardType, NSIndexSet itemSet);

    /**
     * Item provider interface
     */
    @Generated
    @Selector("itemProviders")
    public native NSArray<? extends NSItemProvider> itemProviders();

    /**
     * Item provider interface
     */
    @Generated
    @Selector("setItemProviders:")
    public native void setItemProviders(NSArray<? extends NSItemProvider> value);

    @Generated
    @Selector("setItemProviders:localOnly:expirationDate:")
    public native void setItemProvidersLocalOnlyExpirationDate(NSArray<? extends NSItemProvider> itemProviders,
            boolean localOnly, NSDate expirationDate);

    /**
     * Automatically creates item providers wrapping the objects passed in.
     */
    @Generated
    @Selector("setObjects:")
    public native void setObjects(NSArray<?> objects);

    @Generated
    @Selector("setObjects:localOnly:expirationDate:")
    public native void setObjectsLocalOnlyExpirationDate(NSArray<?> objects, boolean localOnly, NSDate expirationDate);

    /**
     * Detects patterns in the first pasteboard item.
     *
     * @param patterns          Detect only these patterns.
     * @param completionHandler Receives which patterns were detected, or an error.
     */
    @Generated
    @Selector("detectPatternsForPatterns:completionHandler:")
    public native void detectPatternsForPatternsCompletionHandler(NSSet<String> patterns,
            @ObjCBlock(name = "call_detectPatternsForPatternsCompletionHandler") Block_detectPatternsForPatternsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectPatternsForPatternsCompletionHandler {
        @Generated
        void call_detectPatternsForPatternsCompletionHandler(NSSet<String> arg0, NSError arg1);
    }

    /**
     * Detects patterns in the specified pasteboard items.
     *
     * @param patterns          Detect only these patterns.
     * @param itemSet           Specifies which pasteboard items by their position. Nil means all items.
     * @param completionHandler Receives which patterns were detected per item specified,
     *                          or an error.
     */
    @Generated
    @Selector("detectPatternsForPatterns:inItemSet:completionHandler:")
    public native void detectPatternsForPatternsInItemSetCompletionHandler(NSSet<String> patterns, NSIndexSet itemSet,
            @ObjCBlock(name = "call_detectPatternsForPatternsInItemSetCompletionHandler") Block_detectPatternsForPatternsInItemSetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectPatternsForPatternsInItemSetCompletionHandler {
        @Generated
        void call_detectPatternsForPatternsInItemSetCompletionHandler(NSArray<? extends NSSet<String>> arg0,
                NSError arg1);
    }

    /**
     * Detects patterns and corresponding values in the first pasteboard item.
     *
     * @param patterns          Detect only these patterns.
     * @param completionHandler Receives which patterns and values were detected, or an error.
     */
    @Generated
    @Selector("detectValuesForPatterns:completionHandler:")
    public native void detectValuesForPatternsCompletionHandler(NSSet<String> patterns,
            @ObjCBlock(name = "call_detectValuesForPatternsCompletionHandler") Block_detectValuesForPatternsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectValuesForPatternsCompletionHandler {
        @Generated
        void call_detectValuesForPatternsCompletionHandler(NSDictionary<String, ?> arg0, NSError arg1);
    }

    /**
     * Detects patterns and corresponding values in the specified pasteboard items.
     *
     * @param patterns          Detect only these patterns.
     * @param itemSet           Specifies which pasteboard items by their position. Nil means all items.
     * @param completionHandler Receives which patterns and values were detected per item specified,
     *                          or an error.
     */
    @Generated
    @Selector("detectValuesForPatterns:inItemSet:completionHandler:")
    public native void detectValuesForPatternsInItemSetCompletionHandler(NSSet<String> patterns, NSIndexSet itemSet,
            @ObjCBlock(name = "call_detectValuesForPatternsInItemSetCompletionHandler") Block_detectValuesForPatternsInItemSetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectValuesForPatternsInItemSetCompletionHandler {
        @Generated
        void call_detectValuesForPatternsInItemSetCompletionHandler(NSArray<? extends NSDictionary<String, ?>> arg0,
                NSError arg1);
    }
}
