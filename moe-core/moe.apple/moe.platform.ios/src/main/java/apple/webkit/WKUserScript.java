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

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * A @link WKUserScript @/link object represents a script that can be injected into webpages.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKUserScript extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKUserScript(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKUserScript alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKUserScript allocWithZone(VoidPtr zone);

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
    public static native WKUserScript new_objc();

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

    @Generated
    @Selector("init")
    public native WKUserScript init();

    /**
     * Returns an initialized user script that can be added to a @link WKUserContentController @/link.
     * 
     * Calling this method is the same as calling `initWithSource:injectionTime:forMainFrameOnly:inContentWorld:` with a
     * `contentWorld` value of `WKContentWorld.pageWorld`
     * 
     * @param source           The script source.
     * @param injectionTime    When the script should be injected.
     * @param forMainFrameOnly Whether the script should be injected into all frames or just the main frame.
     */
    @Generated
    @Selector("initWithSource:injectionTime:forMainFrameOnly:")
    public native WKUserScript initWithSourceInjectionTimeForMainFrameOnly(@NotNull String source,
            @NInt long injectionTime, boolean forMainFrameOnly);

    /**
     * When the script should be injected.
     */
    @Generated
    @Selector("injectionTime")
    @NInt
    public native long injectionTime();

    /**
     * Whether the script should be injected into all frames or just the main frame.
     */
    @Generated
    @Selector("isForMainFrameOnly")
    public native boolean isForMainFrameOnly();

    /**
     * The script source code.
     */
    @NotNull
    @Generated
    @Selector("source")
    public native String source();

    /**
     * Returns an initialized user script that can be added to a @link WKUserContentController @/link.
     * 
     * @param source           The script source.
     * @param injectionTime    When the script should be injected.
     * @param forMainFrameOnly Whether the script should be injected into all frames or just the main frame.
     * @param contentWorld     The WKContentWorld in which to inject the script.
     * 
     *                         API-Since: 14.0
     */
    @Generated
    @Selector("initWithSource:injectionTime:forMainFrameOnly:inContentWorld:")
    public native WKUserScript initWithSourceInjectionTimeForMainFrameOnlyInContentWorld(@NotNull String source,
            @NInt long injectionTime, boolean forMainFrameOnly, @NotNull WKContentWorld contentWorld);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
