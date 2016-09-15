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
import apple.networkextension.NEHotspotHelperCommand;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableURLRequest extends NSURLRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableURLRequest(Pointer peer) {
        super(peer);
    }

    /**
     * HTTPBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPBody")
    public native NSData HTTPBody();

    /**
     * HTTPBodyStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPBodyStream">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPBodyStream")
    public native NSInputStream HTTPBodyStream();

    /**
     * HTTPMethod</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPMethod">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPMethod")
    public native String HTTPMethod();

    /**
     * HTTPShouldHandleCookies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPShouldHandleCookies">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPShouldHandleCookies")
    public native boolean HTTPShouldHandleCookies();

    /**
     * HTTPShouldUsePipelining</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPShouldUsePipelining">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * addValue:forHTTPHeaderField:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instm/NSMutableURLRequest/addValue:forHTTPHeaderField:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addValue:forHTTPHeaderField:")
    public native void addValueForHTTPHeaderField(String value, String field);

    /**
     * allHTTPHeaderFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/allHTTPHeaderFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("allHTTPHeaderFields")
    public native NSDictionary<String, String> allHTTPHeaderFields();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableURLRequest alloc();

    /**
     * allowsCellularAccess</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/allowsCellularAccess">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    /**
     * cachePolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/cachePolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("cachePolicy")
    @NUInt
    public native long cachePolicy();

    @Generated
    @Selector("init")
    public native NSMutableURLRequest init();

    @Generated
    @Selector("initWithURL:")
    public native NSMutableURLRequest initWithURL(NSURL URL);

    @Generated
    @Selector("initWithURL:cachePolicy:timeoutInterval:")
    public native NSMutableURLRequest initWithURLCachePolicyTimeoutInterval(NSURL URL, @NUInt long cachePolicy,
            double timeoutInterval);

    /**
     * mainDocumentURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/mainDocumentURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("mainDocumentURL")
    public native NSURL mainDocumentURL();

    /**
     * networkServiceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/networkServiceType">iOS Dev Center</a>
     */
    @Generated
    @Selector("networkServiceType")
    @NUInt
    public native long networkServiceType();

    @Generated
    @Selector("requestWithURL:")
    public static native NSMutableURLRequest requestWithURL(NSURL URL);

    @Generated
    @Selector("requestWithURL:cachePolicy:timeoutInterval:")
    public static native NSMutableURLRequest requestWithURLCachePolicyTimeoutInterval(NSURL URL,
            @NUInt long cachePolicy, double timeoutInterval);

    /**
     * allHTTPHeaderFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/allHTTPHeaderFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllHTTPHeaderFields:")
    public native void setAllHTTPHeaderFields(NSDictionary<String, String> value);

    /**
     * allowsCellularAccess</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/allowsCellularAccess">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    /**
     * cachePolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/cachePolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCachePolicy:")
    public native void setCachePolicy(@NUInt long value);

    /**
     * HTTPBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPBody:")
    public native void setHTTPBody(NSData value);

    /**
     * HTTPBodyStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPBodyStream">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPBodyStream:")
    public native void setHTTPBodyStream(NSInputStream value);

    /**
     * HTTPMethod</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPMethod">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPMethod:")
    public native void setHTTPMethod(String value);

    /**
     * HTTPShouldHandleCookies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPShouldHandleCookies">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPShouldHandleCookies:")
    public native void setHTTPShouldHandleCookies(boolean value);

    /**
     * HTTPShouldUsePipelining</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/HTTPShouldUsePipelining">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean value);

    /**
     * mainDocumentURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/mainDocumentURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMainDocumentURL:")
    public native void setMainDocumentURL(NSURL value);

    /**
     * networkServiceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/networkServiceType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNetworkServiceType:")
    public native void setNetworkServiceType(@NUInt long value);

    /**
     * timeoutInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/timeoutInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeoutInterval:")
    public native void setTimeoutInterval(double value);

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * setValue:forHTTPHeaderField:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instm/NSMutableURLRequest/setValue:forHTTPHeaderField:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forHTTPHeaderField:")
    public native void setValueForHTTPHeaderField(String value, String field);

    /**
     * timeoutInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableURLRequest_Class/index.html#//apple_ref/occ/instp/NSMutableURLRequest/timeoutInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeoutInterval")
    public native double timeoutInterval();

    @Generated
    @Selector("bindToHotspotHelperCommand:")
    public native void bindToHotspotHelperCommand(NEHotspotHelperCommand command);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableURLRequest initWithCoder(NSCoder aDecoder);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
