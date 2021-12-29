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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCache extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLCache(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLCache alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLCache allocWithZone(VoidPtr zone);

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
    public static native NSURLCache new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sharedURLCache
     * <p>
     * Returns the shared NSURLCache instance or
     * sets the NSURLCache instance shared by all clients of
     * the current process. This will be the new object returned when
     * calls to the <tt>sharedURLCache</tt> method are made.
     * <p>
     * Unless set explicitly through a call to
     * <tt>+setSharedURLCache:</tt>, this method returns an NSURLCache
     * instance created with the following default values:
     * <ul>
     * <li>Memory capacity: 4 megabytes (4 * 1024 * 1024 bytes)
     * <li>Disk capacity: 20 megabytes (20 * 1024 * 1024 bytes)
     * <li>Disk path: <nobr>(user home directory)/Library/Caches/(application bundle id)</nobr>
     * </ul>
     * <p>Users who do not have special caching requirements or
     * constraints should find the default shared cache instance
     * acceptable. If this default shared cache instance is not
     * acceptable, <tt>+setSharedURLCache:</tt> can be called to set a
     * different NSURLCache instance to be returned from this method.
     * Callers should take care to ensure that the setter is called
     * at a time when no other caller has a reference to the previously-set
     * shared URL cache. This is to prevent storing cache data from
     * becoming unexpectedly unretrievable.
     *
     * @return the shared NSURLCache instance.
     */
    @Generated
    @Selector("setSharedURLCache:")
    public static native void setSharedURLCache(NSURLCache value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sharedURLCache
     * <p>
     * Returns the shared NSURLCache instance or
     * sets the NSURLCache instance shared by all clients of
     * the current process. This will be the new object returned when
     * calls to the <tt>sharedURLCache</tt> method are made.
     * <p>
     * Unless set explicitly through a call to
     * <tt>+setSharedURLCache:</tt>, this method returns an NSURLCache
     * instance created with the following default values:
     * <ul>
     * <li>Memory capacity: 4 megabytes (4 * 1024 * 1024 bytes)
     * <li>Disk capacity: 20 megabytes (20 * 1024 * 1024 bytes)
     * <li>Disk path: <nobr>(user home directory)/Library/Caches/(application bundle id)</nobr>
     * </ul>
     * <p>Users who do not have special caching requirements or
     * constraints should find the default shared cache instance
     * acceptable. If this default shared cache instance is not
     * acceptable, <tt>+setSharedURLCache:</tt> can be called to set a
     * different NSURLCache instance to be returned from this method.
     * Callers should take care to ensure that the setter is called
     * at a time when no other caller has a reference to the previously-set
     * shared URL cache. This is to prevent storing cache data from
     * becoming unexpectedly unretrievable.
     *
     * @return the shared NSURLCache instance.
     */
    @Generated
    @Selector("sharedURLCache")
    public static native NSURLCache sharedURLCache();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * cachedResponseForRequest:
     * <p>
     * Returns the NSCachedURLResponse stored in the cache with
     * the given request.
     * <p>
     * The method returns nil if there is no
     * NSCachedURLResponse stored using the given request.
     *
     * @param request the NSURLRequest to use as a key for the lookup.
     * @return The NSCachedURLResponse stored in the cache with the given
     * request, or nil if there is no NSCachedURLResponse stored with the
     * given request.
     */
    @Generated
    @Selector("cachedResponseForRequest:")
    public native NSCachedURLResponse cachedResponseForRequest(NSURLRequest request);

    /**
     * Returns the current amount of space consumed by the
     * on-disk cache of the receiver.
     * <p>
     * This size, measured in bytes, indicates the current
     * usage of the on-disk cache.
     *
     * @return the current usage of the on-disk cache of the receiver.
     */
    @Generated
    @Selector("currentDiskUsage")
    @NUInt
    public native long currentDiskUsage();

    /**
     * Returns the current amount of space consumed by the
     * in-memory cache of the receiver.
     * <p>
     * This size, measured in bytes, indicates the current
     * usage of the in-memory cache.
     *
     * @return the current usage of the in-memory cache of the receiver.
     */
    @Generated
    @Selector("currentMemoryUsage")
    @NUInt
    public native long currentMemoryUsage();

    /**
     * The on-disk capacity of the receiver.
     * <p>
     * The on-disk capacity, measured in bytes, for the receiver. On mutation the on-disk cache will truncate its contents to the size given, if necessary.
     */
    @Generated
    @Selector("diskCapacity")
    @NUInt
    public native long diskCapacity();

    @Generated
    @Selector("getCachedResponseForDataTask:completionHandler:")
    public native void getCachedResponseForDataTaskCompletionHandler(NSURLSessionDataTask dataTask,
            @ObjCBlock(name = "call_getCachedResponseForDataTaskCompletionHandler") Block_getCachedResponseForDataTaskCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NSURLCache init();

    /**
     * initWithMemoryCapacity:diskCapacity:diskPath:
     * <p>
     * Initializes an NSURLCache with the given capacity and
     * path.
     * <p>
     * The returned NSURLCache is backed by disk, so
     * developers can be more liberal with space when choosing the
     * capacity for this kind of cache. A disk cache measured in the tens
     * of megabytes should be acceptable in most cases.
     *
     * @param memoryCapacity the capacity, measured in bytes, for the cache in memory.
     * @param diskCapacity   the capacity, measured in bytes, for the cache on disk.
     * @param path           the path on disk where the cache data is stored.
     * @return an initialized NSURLCache, with the given capacity, backed
     * by disk.
     */
    @Generated
    @Selector("initWithMemoryCapacity:diskCapacity:diskPath:")
    public native NSURLCache initWithMemoryCapacityDiskCapacityDiskPath(@NUInt long memoryCapacity,
            @NUInt long diskCapacity, String path);

    /**
     * In-memory capacity of the receiver.
     * <p>
     * At the time this call is made, the in-memory cache will truncate its contents to the size given, if necessary.
     *
     * @return The in-memory capacity, measured in bytes, for the receiver.
     */
    @Generated
    @Selector("memoryCapacity")
    @NUInt
    public native long memoryCapacity();

    /**
     * removeAllCachedResponses
     * <p>
     * Clears the given cache, removing all NSCachedURLResponse
     * objects that it stores.
     */
    @Generated
    @Selector("removeAllCachedResponses")
    public native void removeAllCachedResponses();

    @Generated
    @Selector("removeCachedResponseForDataTask:")
    public native void removeCachedResponseForDataTask(NSURLSessionDataTask dataTask);

    /**
     * removeCachedResponseForRequest:
     * <p>
     * Removes the NSCachedURLResponse from the cache that is
     * stored using the given request.
     * <p>
     * No action is taken if there is no NSCachedURLResponse
     * stored with the given request.
     *
     * @param request the NSURLRequest to use as a key for the lookup.
     */
    @Generated
    @Selector("removeCachedResponseForRequest:")
    public native void removeCachedResponseForRequest(NSURLRequest request);

    /**
     * removeCachedResponsesSince:
     * <p>
     * Clears the given cache of any cached responses since the provided date.
     */
    @Generated
    @Selector("removeCachedResponsesSinceDate:")
    public native void removeCachedResponsesSinceDate(NSDate date);

    /**
     * The on-disk capacity of the receiver.
     * <p>
     * The on-disk capacity, measured in bytes, for the receiver. On mutation the on-disk cache will truncate its contents to the size given, if necessary.
     */
    @Generated
    @Selector("setDiskCapacity:")
    public native void setDiskCapacity(@NUInt long value);

    /**
     * In-memory capacity of the receiver.
     * <p>
     * At the time this call is made, the in-memory cache will truncate its contents to the size given, if necessary.
     *
     * @return The in-memory capacity, measured in bytes, for the receiver.
     */
    @Generated
    @Selector("setMemoryCapacity:")
    public native void setMemoryCapacity(@NUInt long value);

    @Generated
    @Selector("storeCachedResponse:forDataTask:")
    public native void storeCachedResponseForDataTask(NSCachedURLResponse cachedResponse,
            NSURLSessionDataTask dataTask);

    /**
     * storeCachedResponse:forRequest:
     * <p>
     * Stores the given NSCachedURLResponse in the cache using
     * the given request.
     *
     * @param cachedResponse The cached response to store.
     * @param request        the NSURLRequest to use as a key for the storage.
     */
    @Generated
    @Selector("storeCachedResponse:forRequest:")
    public native void storeCachedResponseForRequest(NSCachedURLResponse cachedResponse, NSURLRequest request);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCachedResponseForDataTaskCompletionHandler {
        @Generated
        void call_getCachedResponseForDataTaskCompletionHandler(NSCachedURLResponse cachedResponse);
    }

    /**
     * initWithMemoryCapacity:diskCapacity:directoryURL:
     * <p>
     * Initializes an NSURLCache with the given capacity and directory.
     *
     * @param memoryCapacity the capacity, measured in bytes, for the cache in memory. Or 0 to disable memory cache.
     * @param diskCapacity   the capacity, measured in bytes, for the cache on disk. Or 0 to disable disk cache.
     * @param directoryURL   the path to a directory on disk where the cache data is stored. Or nil for default directory.
     * @return an initialized NSURLCache, with the given capacity, optionally backed by disk.
     */
    @Generated
    @Selector("initWithMemoryCapacity:diskCapacity:directoryURL:")
    public native NSURLCache initWithMemoryCapacityDiskCapacityDirectoryURL(@NUInt long memoryCapacity,
            @NUInt long diskCapacity, NSURL directoryURL);
}
