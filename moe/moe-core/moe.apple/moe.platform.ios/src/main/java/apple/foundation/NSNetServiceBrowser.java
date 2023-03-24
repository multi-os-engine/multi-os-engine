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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSNetServiceBrowserDelegate;
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
 * API-Since: 2.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use nw_browser_t in Network framework instead
 */
@Deprecated
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNetServiceBrowser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNetServiceBrowser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNetServiceBrowser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSNetServiceBrowser allocWithZone(VoidPtr zone);

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
    public static native NSNetServiceBrowser new_objc();

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
     * Set a delegate to receive discovery events.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSNetServiceBrowserDelegate delegate();

    /**
     * Initially set to NO. Set to YES to also browse over peer to peer Wi-Fi (if available). Must be set before
     * starting to search.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("includesPeerToPeer")
    public native boolean includesPeerToPeer();

    @Generated
    @Selector("init")
    public native NSNetServiceBrowser init();

    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(@NotNull NSRunLoop aRunLoop, @NotNull String mode);

    /**
     * NSNetServiceBrowser instances may be scheduled on NSRunLoops to operate in different modes, or in other threads.
     * It is generally not necessary to schedule NSNetServiceBrowsers in other threads. NSNetServiceBrowsers are
     * scheduled in the current thread's NSRunLoop in the NSDefaultRunLoopMode when they are created.
     */
    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(@NotNull NSRunLoop aRunLoop, @NotNull String mode);

    /**
     * Starts a search for domains that are browsable via Bonjour and the computer's network configuration. Discovered
     * domains are reported to the delegate's -netServiceBrowser:didFindDomain:moreComing: method. There may be more
     * than one browsable domain.
     */
    @Generated
    @Selector("searchForBrowsableDomains")
    public native void searchForBrowsableDomains();

    /**
     * Starts a search for domains in which the network configuration allows registration (i.e. publishing). Most
     * NSNetServiceBrowser clients do not need to use this API, as it is sufficient to publish an NSNetService instance
     * with the empty string (see -[NSNetService initWithDomain:type:name:port:]). Discovered domains are reported to
     * the delegate's -netServiceBrowser:didFindDomain:moreComing: method. There may be more than one registration
     * domain.
     */
    @Generated
    @Selector("searchForRegistrationDomains")
    public native void searchForRegistrationDomains();

    /**
     * Starts a search for services of the specified type in the domain indicated by domainString. For each service
     * discovered, a -netServiceBrowser:foundService:moreComing: message is sent to the NSNetServiceBrowser instance's
     * delegate.
     */
    @Generated
    @Selector("searchForServicesOfType:inDomain:")
    public native void searchForServicesOfTypeInDomain(@NotNull String type, @NotNull String domainString);

    /**
     * Set a delegate to receive discovery events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSNetServiceBrowserDelegate value);

    /**
     * Set a delegate to receive discovery events.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSNetServiceBrowserDelegate value) {
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
     * Initially set to NO. Set to YES to also browse over peer to peer Wi-Fi (if available). Must be set before
     * starting to search.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean value);

    /**
     * Stops the currently running search.
     */
    @Generated
    @Selector("stop")
    public native void stop();
}
