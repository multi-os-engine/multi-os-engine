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
import apple.avfoundation.protocol.AVAssetResourceLoaderDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.opaque.dispatch_queue_t;

/**
 * API-Since: 6.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetResourceLoader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetResourceLoader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetResourceLoader alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetResourceLoader allocWithZone(VoidPtr zone);

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
    public static native AVAssetResourceLoader new_objc();

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
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * The value of this property is an object conforming to the AVAssetResourceLoaderDelegate protocol. The delegate is
     * set using the setDelegate:queue: method. The delegate is held using a zeroing-weak reference, so this property
     * will have a value of nil after a delegate that was previously set has been deallocated.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAssetResourceLoaderDelegate delegate();

    /**
     * [@property] delegateQueue
     * 
     * The dispatch queue on which all delegate methods will be invoked.
     * 
     * The value of this property is a dispatch_queue_t. The queue is set using the setDelegate:queue: method.
     */
    @Nullable
    @Generated
    @Selector("delegateQueue")
    public native dispatch_queue_t delegateQueue();

    @Generated
    @Selector("init")
    public native AVAssetResourceLoader init();

    /**
     * [@property] preloadsEligibleContentKeys
     * 
     * When YES, eligible content keys will be loaded as eagerly as possible, potentially handled by the delegate.
     * Setting to YES may result in network activity.
     * 
     * Any work done as a result of setting this property will be performed asynchronously.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("preloadsEligibleContentKeys")
    public native boolean preloadsEligibleContentKeys();

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate that will mediate resource loading and the dispatch queue on which delegate methods
     * will be invoked.
     * 
     * If you employ an AVAssetResourceLoader delegate that loads media data for playback, you should set the value of
     * your AVPlayer’s automaticallyWaitsToMinimizeStalling property to NO. Allowing the value of
     * automaticallyWaitsToMinimizeStalling to remain YES — its default value — when an AVAssetResourceLoader delegate
     * is used for the loading of media data can result in poor start-up times for playback and poor recovery from
     * stalls, because the behaviors provided by AVPlayer when automaticallyWaitsToMinimizeStalling has a value of YES
     * depend on predictions of the future availability of media data that that do not function as expected when data is
     * loaded via a client-controlled means, using the AVAssetResourceLoader delegate interface.
     * 
     * You can allow the value of automaticallyWaitsToMinimizeStalling to remain YES if you use an AVAssetResourceLoader
     * delegate to manage content keys for FairPlay Streaming, to provide dynamically-generated master playlists for
     * HTTP Live Streaming, or to respond to authentication challenges, but not to load media data for playback.
     * 
     * @param delegate
     *                      An object conforming to the AVAssetResourceLoaderDelegate protocol.
     * @param delegateQueue
     *                      A dispatch queue on which all delegate methods will be invoked.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Nullable @Mapped(ObjCObjectMapper.class) AVAssetResourceLoaderDelegate delegate,
            @Nullable dispatch_queue_t delegateQueue);

    /**
     * [@property] preloadsEligibleContentKeys
     * 
     * When YES, eligible content keys will be loaded as eagerly as possible, potentially handled by the delegate.
     * Setting to YES may result in network activity.
     * 
     * Any work done as a result of setting this property will be performed asynchronously.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setPreloadsEligibleContentKeys:")
    public native void setPreloadsEligibleContentKeys(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
