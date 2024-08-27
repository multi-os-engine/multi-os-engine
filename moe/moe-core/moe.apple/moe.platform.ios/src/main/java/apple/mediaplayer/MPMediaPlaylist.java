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

package apple.mediaplayer;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An MPMediaPlaylist is a collection of related MPMediaItems in an MPMediaLibrary.
 * Playlists have a unique identifier which persists across application launches.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaPlaylist extends MPMediaItemCollection {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaPlaylist(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaPlaylist alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaPlaylist allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("canFilterByProperty:")
    public static native boolean canFilterByProperty(@NotNull String property);

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

    @NotNull
    @Generated
    @Selector("collectionWithItems:")
    public static native MPMediaItemCollection collectionWithItems(@NotNull NSArray<? extends MPMediaItem> items);

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
    public static native MPMediaPlaylist new_objc();

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
     * API-Since: 9.3
     */
    @Generated
    @Selector("addItemWithProductID:completionHandler:")
    public native void addItemWithProductIDCompletionHandler(@NotNull String productID,
            @Nullable @ObjCBlock(name = "call_addItemWithProductIDCompletionHandler") Block_addItemWithProductIDCompletionHandler completionHandler);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("addMediaItems:completionHandler:")
    public native void addMediaItemsCompletionHandler(@NotNull NSArray<? extends MPMediaItem> mediaItems,
            @Nullable @ObjCBlock(name = "call_addMediaItemsCompletionHandler") Block_addMediaItemsCompletionHandler completionHandler);

    /**
     * API-Since: 9.3
     */
    @Nullable
    @Generated
    @Selector("authorDisplayName")
    public native String authorDisplayName();

    /**
     * API-Since: 9.3
     */
    @Nullable
    @Generated
    @Selector("descriptionText")
    public native String descriptionText();

    @Generated
    @Selector("init")
    public native MPMediaPlaylist init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaPlaylist initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithItems:")
    public native MPMediaPlaylist initWithItems(@NotNull NSArray<? extends MPMediaItem> items);

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("persistentID")
    public native long persistentID();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("playlistAttributes")
    @NUInt
    public native long playlistAttributes();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("seedItems")
    public native NSArray<? extends MPMediaItem> seedItems();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addItemWithProductIDCompletionHandler {
        @Generated
        void call_addItemWithProductIDCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addMediaItemsCompletionHandler {
        @Generated
        void call_addMediaItemsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("cloudGlobalID")
    public native String cloudGlobalID();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
