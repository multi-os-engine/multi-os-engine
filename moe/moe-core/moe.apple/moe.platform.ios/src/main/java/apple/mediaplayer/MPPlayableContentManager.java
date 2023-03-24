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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPPlayableContentDataSource;
import apple.mediaplayer.protocol.MPPlayableContentDelegate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPPlayableContentManager is a class that manages the interactions between a
 * media application and an external media player interface. The application
 * provides the content manager with a data source, which allows the media player
 * to browse the media content offered by the application, as well as a delegate,
 * which allows the media player to relay non-media remote playback commands to the application.
 * 
 * API-Since: 7.1
 * Deprecated-Since: 14.0
 * Deprecated-Message: Use CarPlay framework
 */
@Deprecated
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPPlayableContentManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPPlayableContentManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPPlayableContentManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPPlayableContentManager allocWithZone(VoidPtr zone);

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
    public static native MPPlayableContentManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns the application's instance of the content manager.
     */
    @NotNull
    @Generated
    @Selector("sharedContentManager")
    public static native MPPlayableContentManager sharedContentManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Used to begin a synchronized update to multiple MPContentItems at once.
     */
    @Generated
    @Selector("beginUpdates")
    public native void beginUpdates();

    /**
     * API-Since: 8.4
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use CarPlay framework
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("context")
    public native MPPlayableContentManagerContext context();

    @Nullable
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPPlayableContentDataSource dataSource();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPPlayableContentDelegate delegate();

    /**
     * Ends a synchronized update.
     */
    @Generated
    @Selector("endUpdates")
    public native void endUpdates();

    @Generated
    @Selector("init")
    public native MPPlayableContentManager init();

    /**
     * Tells the content manager which MPContentItems are currently playing based on their identifiers.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use CarPlay framework
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("nowPlayingIdentifiers")
    public native NSArray<String> nowPlayingIdentifiers();

    /**
     * Tells the content manager that the data source has changed and that we need to
     * reload data from the data source.
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MPPlayableContentDataSource value);

    @Generated
    public void setDataSource(@Nullable @Mapped(ObjCObjectMapper.class) MPPlayableContentDataSource value) {
        Object __old = dataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) MPPlayableContentDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MPPlayableContentDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Tells the content manager which MPContentItems are currently playing based on their identifiers.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use CarPlay framework
     */
    @Deprecated
    @Generated
    @Selector("setNowPlayingIdentifiers:")
    public native void setNowPlayingIdentifiers(@NotNull NSArray<String> value);
}
