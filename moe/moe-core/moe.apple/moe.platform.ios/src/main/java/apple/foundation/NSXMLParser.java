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
import apple.foundation.protocol.NSXMLParserDelegate;
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
public class NSXMLParser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSXMLParser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSXMLParser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSXMLParser allocWithZone(VoidPtr zone);

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
    public static native NSXMLParser new_objc();

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
     * called by the delegate to stop the parse. The delegate will get an error message sent to it.
     */
    @Generated
    @Selector("abortParsing")
    public native void abortParsing();

    @Generated
    @Selector("allowedExternalEntityURLs")
    public native NSSet<? extends NSURL> allowedExternalEntityURLs();

    @Generated
    @Selector("columnNumber")
    @NInt
    public native long columnNumber();

    /**
     * delegate management. The delegate is not retained.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSXMLParserDelegate delegate();

    /**
     * defaults to NSXMLNodeLoadExternalEntitiesNever
     */
    @Generated
    @Selector("externalEntityResolvingPolicy")
    @NUInt
    public native long externalEntityResolvingPolicy();

    @Generated
    @Selector("init")
    public native NSXMLParser init();

    /**
     * initializes the parser with the specified URL.
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSXMLParser initWithContentsOfURL(NSURL url);

    /**
     * create the parser from data
     */
    @Generated
    @Selector("initWithData:")
    public native NSXMLParser initWithData(NSData data);

    /**
     * create a parser that incrementally pulls data from the specified stream and parses it.
     */
    @Generated
    @Selector("initWithStream:")
    public native NSXMLParser initWithStream(NSInputStream stream);

    @Generated
    @Selector("lineNumber")
    @NInt
    public native long lineNumber();

    /**
     * called to start the event-driven parse. Returns YES in the event of a successful parse, and NO in case of error.
     */
    @Generated
    @Selector("parse")
    public native boolean parse();

    /**
     * can be called after a parse is over to determine parser state.
     */
    @Generated
    @Selector("parserError")
    public native NSError parserError();

    @Generated
    @Selector("publicID")
    public native String publicID();

    @Generated
    @Selector("setAllowedExternalEntityURLs:")
    public native void setAllowedExternalEntityURLs(NSSet<? extends NSURL> value);

    /**
     * delegate management. The delegate is not retained.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSXMLParserDelegate value);

    /**
     * delegate management. The delegate is not retained.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSXMLParserDelegate value) {
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
     * defaults to NSXMLNodeLoadExternalEntitiesNever
     */
    @Generated
    @Selector("setExternalEntityResolvingPolicy:")
    public native void setExternalEntityResolvingPolicy(@NUInt long value);

    @Generated
    @Selector("setShouldProcessNamespaces:")
    public native void setShouldProcessNamespaces(boolean value);

    @Generated
    @Selector("setShouldReportNamespacePrefixes:")
    public native void setShouldReportNamespacePrefixes(boolean value);

    /**
     * Toggles between disabling external entities entirely, and the current setting of the 'externalEntityResolvingPolicy'.
     * The 'externalEntityResolvingPolicy' property should be used instead of this, unless targeting 10.9/7.0 or earlier
     */
    @Generated
    @Selector("setShouldResolveExternalEntities:")
    public native void setShouldResolveExternalEntities(boolean value);

    @Generated
    @Selector("shouldProcessNamespaces")
    public native boolean shouldProcessNamespaces();

    @Generated
    @Selector("shouldReportNamespacePrefixes")
    public native boolean shouldReportNamespacePrefixes();

    /**
     * Toggles between disabling external entities entirely, and the current setting of the 'externalEntityResolvingPolicy'.
     * The 'externalEntityResolvingPolicy' property should be used instead of this, unless targeting 10.9/7.0 or earlier
     */
    @Generated
    @Selector("shouldResolveExternalEntities")
    public native boolean shouldResolveExternalEntities();

    @Generated
    @Selector("systemID")
    public native String systemID();
}
