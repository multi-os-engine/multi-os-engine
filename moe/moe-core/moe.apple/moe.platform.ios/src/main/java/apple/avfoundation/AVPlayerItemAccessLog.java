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
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * AVPlayerItemAccessLog
 * 
 * An AVPlayerItemAccessLog provides methods to retrieve the access log in a format suitable for serialization.
 * 
 * An AVPlayerItemAccessLog acculumulates key metrics about network playback and presents them as a collection
 * of AVPlayerItemAccessLogEvent instances. Each AVPlayerItemAccessLogEvent instance collates the data
 * that relates to each uninterrupted period of playback.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 4.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemAccessLog extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemAccessLog(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemAccessLog alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemAccessLog allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItemAccessLog new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] events
     * 
     * An ordered collection of AVPlayerItemAccessLogEvent instances.
     * 
     * An ordered collection of AVPlayerItemAccessLogEvent instances that represent the chronological
     * sequence of events contained in the access log.
     * This property is not observable.
     */
    @NotNull
    @Generated
    @Selector("events")
    public native NSArray<? extends AVPlayerItemAccessLogEvent> events();

    /**
     * extendedLogData
     * 
     * Serializes an AVPlayerItemAccessLog in the Extended Log File Format.
     * 
     * This method converts the webserver access log into a textual format that conforms to the
     * W3C Extended Log File Format for web server log files.
     * For more information see: http://www.w3.org/pub/WWW/TR/WD-logfile.html
     * 
     * @return An autoreleased NSData instance.
     */
    @Nullable
    @Generated
    @Selector("extendedLogData")
    public native NSData extendedLogData();

    /**
     * [@property] extendedLogDataStringEncoding
     * 
     * Returns the NSStringEncoding for extendedLogData, see above.
     * 
     * A string suitable for console output is obtainable by:
     * [[NSString alloc] initWithData:[myLog extendedLogData] encoding:[myLog extendedLogDataStringEncoding]]
     */
    @Generated
    @Selector("extendedLogDataStringEncoding")
    @NUInt
    public native long extendedLogDataStringEncoding();

    @Generated
    @Selector("init")
    public native AVPlayerItemAccessLog init();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
