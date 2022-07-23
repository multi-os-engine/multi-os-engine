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

/**
 * AVPlayerItemErrorLogEvent
 * <p>
 * An AVPlayerItemErrorLogEvent represents a single log entry.
 * <p>
 * An AVPlayerItemErrorLogEvent provides named properties for accessing the data
 * fields of each log event. None of the properties of this class are observable.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemErrorLogEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemErrorLogEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemErrorLogEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemErrorLogEvent allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItemErrorLogEvent new_objc();

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
     * [@property] URI
     * <p>
     * The URI of the playback item. Can be nil.
     * <p>
     * If nil is returned the URI is unknown. Corresponds to "uri".
     * This property is not observable.
     */
    @Generated
    @Selector("URI")
    public native String URI();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] date
     * <p>
     * The date and time when the error occured. Can be nil.
     * <p>
     * If nil is returned the date is unknown. Corresponds to "date".
     * This property is not observable.
     */
    @Generated
    @Selector("date")
    public native NSDate date();

    /**
     * [@property] errorComment
     * <p>
     * A description of the error encountered. Can be nil.
     * <p>
     * If nil is returned further information is not available. Corresponds to "comment".
     * This property is not observable.
     */
    @Generated
    @Selector("errorComment")
    public native String errorComment();

    /**
     * [@property] errorDomain
     * <p>
     * The domain of the error.
     * <p>
     * Corresponds to "domain".
     * This property is not observable.
     */
    @Generated
    @Selector("errorDomain")
    public native String errorDomain();

    /**
     * [@property] errorStatusCode
     * <p>
     * A unique error code identifier.
     * <p>
     * Corresponds to "status".
     * This property is not observable.
     */
    @Generated
    @Selector("errorStatusCode")
    @NInt
    public native long errorStatusCode();

    @Generated
    @Selector("init")
    public native AVPlayerItemErrorLogEvent init();

    /**
     * [@property] playbackSessionID
     * <p>
     * A GUID that identifies the playback session. This value is used in HTTP requests. Can be nil.
     * <p>
     * If nil is returned the GUID is unknown. Corresponds to "cs-guid".
     * This property is not observable.
     */
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * [@property] serverAddress
     * <p>
     * The IP address of the server that was the source of the error. Can be nil.
     * <p>
     * If nil is returned the address is unknown. Can be either an IPv4 or IPv6 address. Corresponds to "s-ip".
     * This property is not observable.
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();
}
