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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEProxySettings extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEProxySettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEProxySettings alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * HTTPEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPEnabled")
    public native boolean HTTPEnabled();

    /**
     * HTTPSEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPSEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPSEnabled")
    public native boolean HTTPSEnabled();

    /**
     * HTTPSServer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPSServer">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPSServer")
    public native NEProxyServer HTTPSServer();

    /**
     * HTTPServer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPServer">iOS Dev Center</a>
     */
    @Generated
    @Selector("HTTPServer")
    public native NEProxyServer HTTPServer();

    /**
     * autoProxyConfigurationEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/autoProxyConfigurationEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoProxyConfigurationEnabled")
    public native boolean autoProxyConfigurationEnabled();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * exceptionList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/exceptionList">iOS Dev Center</a>
     */
    @Generated
    @Selector("exceptionList")
    public native NSArray<String> exceptionList();

    /**
     * excludeSimpleHostnames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/excludeSimpleHostnames">iOS Dev Center</a>
     */
    @Generated
    @Selector("excludeSimpleHostnames")
    public native boolean excludeSimpleHostnames();

    @Generated
    @Selector("init")
    public native NEProxySettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEProxySettings initWithCoder(NSCoder aDecoder);

    /**
     * matchDomains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/matchDomains">iOS Dev Center</a>
     */
    @Generated
    @Selector("matchDomains")
    public native NSArray<String> matchDomains();

    /**
     * proxyAutoConfigurationJavaScript</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/proxyAutoConfigurationJavaScript">iOS Dev Center</a>
     */
    @Generated
    @Selector("proxyAutoConfigurationJavaScript")
    public native String proxyAutoConfigurationJavaScript();

    /**
     * proxyAutoConfigurationURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/proxyAutoConfigurationURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("proxyAutoConfigurationURL")
    public native NSURL proxyAutoConfigurationURL();

    /**
     * autoProxyConfigurationEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/autoProxyConfigurationEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoProxyConfigurationEnabled:")
    public native void setAutoProxyConfigurationEnabled(boolean value);

    /**
     * exceptionList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/exceptionList">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExceptionList:")
    public native void setExceptionList(NSArray<String> value);

    /**
     * excludeSimpleHostnames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/excludeSimpleHostnames">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExcludeSimpleHostnames:")
    public native void setExcludeSimpleHostnames(boolean value);

    /**
     * HTTPEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPEnabled:")
    public native void setHTTPEnabled(boolean value);

    /**
     * HTTPSEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPSEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPSEnabled:")
    public native void setHTTPSEnabled(boolean value);

    /**
     * HTTPSServer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPSServer">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPSServer:")
    public native void setHTTPSServer(NEProxyServer value);

    /**
     * HTTPServer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/HTTPServer">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHTTPServer:")
    public native void setHTTPServer(NEProxyServer value);

    /**
     * matchDomains</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/matchDomains">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMatchDomains:")
    public native void setMatchDomains(NSArray<String> value);

    /**
     * proxyAutoConfigurationJavaScript</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/proxyAutoConfigurationJavaScript">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProxyAutoConfigurationJavaScript:")
    public native void setProxyAutoConfigurationJavaScript(String value);

    /**
     * proxyAutoConfigurationURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NEProxySettingsClassRef/index.html#//apple_ref/occ/instp/NEProxySettings/proxyAutoConfigurationURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProxyAutoConfigurationURL:")
    public native void setProxyAutoConfigurationURL(NSURL value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
