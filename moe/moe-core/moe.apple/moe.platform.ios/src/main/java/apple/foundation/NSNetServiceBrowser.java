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
    @Owned
    @Selector("alloc")
    public static native NSNetServiceBrowser alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instp/NSNetServiceBrowser/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSNetServiceBrowserDelegate delegate();

    /**
     * includesPeerToPeer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instp/NSNetServiceBrowser/includesPeerToPeer">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesPeerToPeer")
    public native boolean includesPeerToPeer();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSNetServiceBrowser init();

    /**
     * removeFromRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/removeFromRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * scheduleInRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/scheduleInRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * searchForBrowsableDomains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/searchForBrowsableDomains">iOS Dev Center</a>
     */
    @Generated
    @Selector("searchForBrowsableDomains")
    public native void searchForBrowsableDomains();

    /**
     * searchForRegistrationDomains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/searchForRegistrationDomains">iOS Dev Center</a>
     */
    @Generated
    @Selector("searchForRegistrationDomains")
    public native void searchForRegistrationDomains();

    /**
     * searchForServicesOfType:inDomain:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/searchForServicesOfType:inDomain:">iOS Dev Center</a>
     */
    @Generated
    @Selector("searchForServicesOfType:inDomain:")
    public native void searchForServicesOfTypeInDomain(String type, String domainString);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instp/NSNetServiceBrowser/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSNetServiceBrowserDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instp/NSNetServiceBrowser/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSNetServiceBrowserDelegate value) {
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
     * includesPeerToPeer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instp/NSNetServiceBrowser/includesPeerToPeer">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean value);

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNetServiceBrowser_Class/index.html#//apple_ref/occ/instm/NSNetServiceBrowser/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    public native void stop();
}
