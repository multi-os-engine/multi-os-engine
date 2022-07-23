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

/**
 * [@interface] NEProxySettings
 * <p>
 * The NEProxySettings class declares the programmatic interface for an object that contains proxy settings.
 * <p>
 * NEProxySettings is used in the context of a Network Extension configuration to specify the proxy that should be used
 * for network traffic when the Network Extension is active.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEProxySettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEProxySettings allocWithZone(VoidPtr zone);

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
    public static native NEProxySettings new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] HTTPEnabled
     * <p>
     * A boolean indicating if the static HTTP proxy is enabled.
     */
    @Generated
    @Selector("HTTPEnabled")
    public native boolean HTTPEnabled();

    /**
     * [@property] HTTPSEnabled
     * <p>
     * A boolean indicating if the static HTTPS proxy is enabled.
     */
    @Generated
    @Selector("HTTPSEnabled")
    public native boolean HTTPSEnabled();

    /**
     * [@property] HTTPSServer
     * <p>
     * A NEProxyServer object containing the HTTPS proxy server settings.
     */
    @Generated
    @Selector("HTTPSServer")
    public native NEProxyServer HTTPSServer();

    /**
     * [@property] HTTPServer
     * <p>
     * A NEProxyServer object containing the HTTP proxy server settings.
     */
    @Generated
    @Selector("HTTPServer")
    public native NEProxyServer HTTPServer();

    /**
     * [@property] autoProxyConfigurationEnabled
     * <p>
     * A boolean indicating if proxy auto-configuration is enabled.
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
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] exceptionList
     * <p>
     * An array of domain strings. If the destination host name of a connection shares a suffix with one of these
     * strings then the proxy settings will not be used for the connection.
     */
    @Generated
    @Selector("exceptionList")
    public native NSArray<String> exceptionList();

    /**
     * [@property] excludeSimpleHostnames
     * <p>
     * A flag indicating if the proxy settings should not be used for network destinations specified using single-label
     * host names.
     */
    @Generated
    @Selector("excludeSimpleHostnames")
    public native boolean excludeSimpleHostnames();

    @Generated
    @Selector("init")
    public native NEProxySettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEProxySettings initWithCoder(NSCoder coder);

    /**
     * [@property] matchDomains
     * <p>
     * An array of domain strings. If the destination host name of a connection shares a suffix with one of these
     * strings then the proxy settings will be used for the connection. Otherwise the proxy settings will not be used.
     * If this property is nil then all connections to which the Network Extension applies will use the proxy settings.
     */
    @Generated
    @Selector("matchDomains")
    public native NSArray<String> matchDomains();

    /**
     * [@property] proxyAutoConfigurationJavaScript
     * <p>
     * A string containing the PAC JavaScript source code.
     */
    @Generated
    @Selector("proxyAutoConfigurationJavaScript")
    public native String proxyAutoConfigurationJavaScript();

    /**
     * [@property] proxyAutoConfigurationURL
     * <p>
     * A URL specifying where the PAC script is located.
     */
    @Generated
    @Selector("proxyAutoConfigurationURL")
    public native NSURL proxyAutoConfigurationURL();

    /**
     * [@property] autoProxyConfigurationEnabled
     * <p>
     * A boolean indicating if proxy auto-configuration is enabled.
     */
    @Generated
    @Selector("setAutoProxyConfigurationEnabled:")
    public native void setAutoProxyConfigurationEnabled(boolean value);

    /**
     * [@property] exceptionList
     * <p>
     * An array of domain strings. If the destination host name of a connection shares a suffix with one of these
     * strings then the proxy settings will not be used for the connection.
     */
    @Generated
    @Selector("setExceptionList:")
    public native void setExceptionList(NSArray<String> value);

    /**
     * [@property] excludeSimpleHostnames
     * <p>
     * A flag indicating if the proxy settings should not be used for network destinations specified using single-label
     * host names.
     */
    @Generated
    @Selector("setExcludeSimpleHostnames:")
    public native void setExcludeSimpleHostnames(boolean value);

    /**
     * [@property] HTTPEnabled
     * <p>
     * A boolean indicating if the static HTTP proxy is enabled.
     */
    @Generated
    @Selector("setHTTPEnabled:")
    public native void setHTTPEnabled(boolean value);

    /**
     * [@property] HTTPSEnabled
     * <p>
     * A boolean indicating if the static HTTPS proxy is enabled.
     */
    @Generated
    @Selector("setHTTPSEnabled:")
    public native void setHTTPSEnabled(boolean value);

    /**
     * [@property] HTTPSServer
     * <p>
     * A NEProxyServer object containing the HTTPS proxy server settings.
     */
    @Generated
    @Selector("setHTTPSServer:")
    public native void setHTTPSServer(NEProxyServer value);

    /**
     * [@property] HTTPServer
     * <p>
     * A NEProxyServer object containing the HTTP proxy server settings.
     */
    @Generated
    @Selector("setHTTPServer:")
    public native void setHTTPServer(NEProxyServer value);

    /**
     * [@property] matchDomains
     * <p>
     * An array of domain strings. If the destination host name of a connection shares a suffix with one of these
     * strings then the proxy settings will be used for the connection. Otherwise the proxy settings will not be used.
     * If this property is nil then all connections to which the Network Extension applies will use the proxy settings.
     */
    @Generated
    @Selector("setMatchDomains:")
    public native void setMatchDomains(NSArray<String> value);

    /**
     * [@property] proxyAutoConfigurationJavaScript
     * <p>
     * A string containing the PAC JavaScript source code.
     */
    @Generated
    @Selector("setProxyAutoConfigurationJavaScript:")
    public native void setProxyAutoConfigurationJavaScript(String value);

    /**
     * [@property] proxyAutoConfigurationURL
     * <p>
     * A URL specifying where the PAC script is located.
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
