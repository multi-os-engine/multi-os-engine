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
import apple.foundation.protocol.NSProgressReporting;
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

/**
 * The NSBundleResourceRequest class is used to interact with the on demand resource loading system.
 * 
 * The purpose of the system is to allow an application to download certain resources on demand, when they are required.
 * This also means that the system can purge a resource from disk when it is no longer required, which will save disk
 * space. This class describes which resources are required, makes the request and reports progress, allows the app to
 * specify how long during its execution that they are required.
 * 
 * Resources are downloaded into the application container, and are made available via the standard NSBundle resource
 * lookup API.
 * 
 * The request object itself is lightweight. You may create as many as you need, for example to request the same set of
 * tags in different components of your application.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBundleResourceRequest extends NSObject implements NSProgressReporting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSBundleResourceRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBundleResourceRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSBundleResourceRequest allocWithZone(VoidPtr zone);

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
    public static native NSBundleResourceRequest new_objc();

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
     * Ask the system to fetch the resources that were part of the tag set in this request. Resources will not be purged
     * while in use by the application (as indicated by the application using this begin API paired with a call to
     * -endAccessingResources). If an application has too many fetched resources and the system is unable to reserve
     * enough space for newly requested tags, the request may return an error.
     * 
     * When you are finished with the resources and they may be purged off the disk, invoke -endAccessingResources. If
     * the request object is deallocated, it will also inform the system that the resources are no longer in use.
     * 
     * The completion block will be invoked on a non-main serial queue when the resources are available or an error has
     * occurred. An example of a possible error that may be reported is the lack of a network connection or a problem
     * connecting to the on-demand servers.
     * 
     * Fetch requests are reference counted across the application. So if you have two requests outstanding with the
     * same set of tags, each may be used independently without having to know about any global state. However, each
     * NSBundleResourceRequest object may only be used once.
     * 
     * If you cancel an outstanding request (via the cancel method on the NSProgress object, or cancelling a parent
     * progress object you have created) the completion handler argument to this method will be called back with an
     * NSUserCancelledError in the NSCocoaErrorDomain.
     * 
     * Be sure to always invoke the -endAccessingResources method to balance a call to the begin method, even in the
     * case of an error in the completion handler.
     * 
     * If you want to access the resources again, create a new NSBundleResourceRequest object.
     */
    @Generated
    @Selector("beginAccessingResourcesWithCompletionHandler:")
    public native void beginAccessingResourcesWithCompletionHandler(
            @ObjCBlock(name = "call_beginAccessingResourcesWithCompletionHandler") Block_beginAccessingResourcesWithCompletionHandler completionHandler);

    /**
     * The bundle object that will hold the requested resources. After the
     * -beginAccessingResourcesWithCompletionHandler: callback is invoked, you may use the standard bundle lookup APIs
     * on this bundle object to find your resources.
     */
    @Generated
    @Selector("bundle")
    public native NSBundle bundle();

    /**
     * Inform the system that you wish to begin accessing the resources that are part of this request, but do not
     * attempt to download any content over the network. The completion handler will be invoked with a YES argument if
     * the resources are available.
     * 
     * If the resources were available, then you must invoke the -endAccessingResources method once you are done
     * accessing them. If the resources were not available, then you may invoke the
     * -beginAccessingResourcesWithCompletionHandler: method to initiate a download of the resources.
     */
    @Generated
    @Selector("conditionallyBeginAccessingResourcesWithCompletionHandler:")
    public native void conditionallyBeginAccessingResourcesWithCompletionHandler(
            @ObjCBlock(name = "call_conditionallyBeginAccessingResourcesWithCompletionHandler") Block_conditionallyBeginAccessingResourcesWithCompletionHandler completionHandler);

    /**
     * Informs the system that you are finished with the resources that were part of the tag set in this request. Call
     * this after you no longer need the resources to be available on disk. It is important to invoke this method to
     * make room for newly requested resources. This method may only be invoked if you have received a callback from
     * -beginAccessingResourcesWithCompletionHandler:. To cancel an in-progress request, invoke cancel on the -progress
     * property.
     */
    @Generated
    @Selector("endAccessingResources")
    public native void endAccessingResources();

    @Generated
    @Selector("init")
    public native NSBundleResourceRequest init();

    /**
     * A tag and bundle are required arguments to the init methods. The tag argument is required and it must exist in
     * the manifest of the specified bundle. The bundle argument describes an existing bundle which was built with on
     * demand resources support. Any resources downloaded can be found using the standard NSBundle resource lookup API
     * once the request is completed. If no bundle is specified then the main bundle is used.
     */
    @Generated
    @Selector("initWithTags:")
    public native NSBundleResourceRequest initWithTags(NSSet<String> tags);

    @Generated
    @Selector("initWithTags:bundle:")
    public native NSBundleResourceRequest initWithTagsBundle(NSSet<String> tags, NSBundle bundle);

    /**
     * Provides a hint to the resource loading system as to the loading priority of this request. Values are limited to
     * between 0 and 1, with 1 being the highest priority. The default priority is 0.5.
     * 
     * The exact meaning of the value is up to your application. The system will prefer to act on requests that have a
     * higher priority (from the same application). You may change the priority at any time, even after a request has
     * started. The system will make a best attempt to take the new priority into account.
     */
    @Generated
    @Selector("loadingPriority")
    public native double loadingPriority();

    @Generated
    @Selector("progress")
    public native NSProgress progress();

    /**
     * Provides a hint to the resource loading system as to the loading priority of this request. Values are limited to
     * between 0 and 1, with 1 being the highest priority. The default priority is 0.5.
     * 
     * The exact meaning of the value is up to your application. The system will prefer to act on requests that have a
     * higher priority (from the same application). You may change the priority at any time, even after a request has
     * started. The system will make a best attempt to take the new priority into account.
     */
    @Generated
    @Selector("setLoadingPriority:")
    public native void setLoadingPriority(double value);

    /**
     * The tags this request will load.
     */
    @Generated
    @Selector("tags")
    public native NSSet<String> tags();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginAccessingResourcesWithCompletionHandler {
        @Generated
        void call_beginAccessingResourcesWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_conditionallyBeginAccessingResourcesWithCompletionHandler {
        @Generated
        void call_conditionallyBeginAccessingResourcesWithCompletionHandler(boolean resourcesAvailable);
    }
}
