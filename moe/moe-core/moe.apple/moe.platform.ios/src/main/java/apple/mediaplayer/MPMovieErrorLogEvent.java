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
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * -----------------------------------------------------------------------------
 * An MPMovieErrorLogEvent repesents a single error log entry.
 * 
 * API-Since: 4.3
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use AVFoundation.
 */
@Deprecated
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMovieErrorLogEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMovieErrorLogEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMovieErrorLogEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMovieErrorLogEvent allocWithZone(VoidPtr zone);

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
    public static native MPMovieErrorLogEvent new_objc();

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
     * The URI of the playback item.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("URI")
    public native String URI();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The date and time when the error occured.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("date")
    public native NSDate date();

    /**
     * A description of the error encountered.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("errorComment")
    public native String errorComment();

    /**
     * The domain of the error.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("errorDomain")
    public native String errorDomain();

    /**
     * A unique error code identifier. The value is negative if unknown.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("errorStatusCode")
    @NInt
    public native long errorStatusCode();

    @Generated
    @Selector("init")
    public native MPMovieErrorLogEvent init();

    /**
     * A GUID that identifies the playback session. This value is used in HTTP requests.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * The IP address of the server that was the source of the error.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
