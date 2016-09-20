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

package apple.javascriptcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.javascriptcore.opaque.JSGlobalContextRef;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("JavaScriptCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class JSContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected JSContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native JSContext alloc();

    /**
     * contextWithJSGlobalContextRef:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/clm/JSContext/contextWithJSGlobalContextRef:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextWithJSGlobalContextRef:")
    public static native JSContext contextWithJSGlobalContextRef(JSGlobalContextRef jsGlobalContextRef);

    /**
     * currentArguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/clm/JSContext/currentArguments">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentArguments")
    public static native NSArray<?> currentArguments();

    /**
     * currentCallee</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/clm/JSContext/currentCallee">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentCallee")
    public static native JSValue currentCallee();

    /**
     * currentContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/clm/JSContext/currentContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentContext")
    public static native JSContext currentContext();

    /**
     * currentThis</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/clm/JSContext/currentThis">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentThis")
    public static native JSValue currentThis();

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
     * JSGlobalContextRef</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/JSGlobalContextRef">iOS Dev Center</a>
     */
    @Generated
    @Selector("JSGlobalContextRef")
    public native JSGlobalContextRef JSGlobalContextRef();

    /**
     * evaluateScript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/evaluateScript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("evaluateScript:")
    public native JSValue evaluateScript(String script);

    /**
     * evaluateScript:withSourceURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/evaluateScript:withSourceURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("evaluateScript:withSourceURL:")
    public native JSValue evaluateScriptWithSourceURL(String script, NSURL sourceURL);

    /**
     * exception</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/exception">iOS Dev Center</a>
     */
    @Generated
    @Selector("exception")
    public native JSValue exception();

    /**
     * globalObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/globalObject">iOS Dev Center</a>
     */
    @Generated
    @Selector("globalObject")
    public native JSValue globalObject();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native JSContext init();

    /**
     * initWithVirtualMachine:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/initWithVirtualMachine:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithVirtualMachine:")
    public native JSContext initWithVirtualMachine(JSVirtualMachine virtualMachine);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * objectForKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/objectForKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native JSValue objectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object key);

    /**
     * exception</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/exception">iOS Dev Center</a>
     */
    @Generated
    @Selector("setException:")
    public native void setException(JSValue value);

    /**
     * exceptionHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/exceptionHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExceptionHandler:")
    public native void setExceptionHandler(
            @ObjCBlock(name = "call_setExceptionHandler") Block_setExceptionHandler value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * setObject:forKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instm/JSContext/setObject:forKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object object, NSObject key);

    /**
     * virtualMachine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/virtualMachine">iOS Dev Center</a>
     */
    @Generated
    @Selector("virtualMachine")
    public native JSVirtualMachine virtualMachine();

    /**
     * exceptionHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContext_Ref/index.html#//apple_ref/occ/instp/JSContext/exceptionHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("exceptionHandler")
    @ObjCBlock(name = "call_exceptionHandler_ret")
    public native Block_exceptionHandler_ret exceptionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExceptionHandler {
        @Generated
        void call_setExceptionHandler(JSContext arg0, JSValue arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exceptionHandler_ret {
        @Generated
        void call_exceptionHandler_ret(JSContext arg0, JSValue arg1);
    }
}
