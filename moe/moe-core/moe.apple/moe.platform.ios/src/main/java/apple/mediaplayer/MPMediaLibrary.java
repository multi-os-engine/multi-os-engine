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
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.protocol.NSSecureCoding;
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
 * API-Since: 3.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaLibrary extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaLibrary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaLibrary allocWithZone(VoidPtr zone);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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

    @NotNull
    @Generated
    @Selector("defaultMediaLibrary")
    public static native MPMediaLibrary defaultMediaLibrary();

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
    public static native MPMediaLibrary new_objc();

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("requestAuthorization:")
    public static native void requestAuthorization(
            @NotNull @ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization completionHandler);

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
     * MPMediaLibraryDidChangeNotification will be posted when a sync happens.
     */
    @Generated
    @Selector("beginGeneratingLibraryChangeNotifications")
    public native void beginGeneratingLibraryChangeNotifications();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("endGeneratingLibraryChangeNotifications")
    public native void endGeneratingLibraryChangeNotifications();

    /**
     * Finds the playlist associated with the UUID.
     * If the playlist exists, the creation metadata is ignored.
     * If no such playlist exists and creation metadata is valid, a playlist associated the UUID will be created.
     * 
     * The UUID should typically be pre-generated to avoid creating a new playlist with every call.
     * 
     * API-Since: 9.3
     */
    @Generated
    @Selector("getPlaylistWithUUID:creationMetadata:completionHandler:")
    public native void getPlaylistWithUUIDCreationMetadataCompletionHandler(@NotNull NSUUID uuid,
            @Nullable MPMediaPlaylistCreationMetadata creationMetadata,
            @NotNull @ObjCBlock(name = "call_getPlaylistWithUUIDCreationMetadataCompletionHandler") Block_getPlaylistWithUUIDCreationMetadataCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native MPMediaLibrary init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaLibrary initWithCoder(@NotNull NSCoder coder);

    /**
     * Returns the date at which the media library was last modified.
     */
    @NotNull
    @Generated
    @Selector("lastModifiedDate")
    public native NSDate lastModifiedDate();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addItemWithProductIDCompletionHandler {
        @Generated
        void call_addItemWithProductIDCompletionHandler(@NotNull NSArray<? extends MPMediaEntity> entities,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPlaylistWithUUIDCreationMetadataCompletionHandler {
        @Generated
        void call_getPlaylistWithUUIDCreationMetadataCompletionHandler(@Nullable MPMediaPlaylist playlist,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorization {
        @Generated
        void call_requestAuthorization(@NInt long status);
    }
}
