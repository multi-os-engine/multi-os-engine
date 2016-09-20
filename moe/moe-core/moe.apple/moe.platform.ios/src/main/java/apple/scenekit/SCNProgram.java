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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLLibrary;
import apple.scenekit.protocol.SCNProgramDelegate;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNProgram extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNProgram(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNProgram alloc();

    /**
     * program</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/clm/SCNProgram/program">iOS Dev Center</a>
     */
    @Generated
    @Selector("program")
    public static native SCNProgram program();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNProgramDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * fragmentShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/fragmentShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("fragmentShader")
    public native String fragmentShader();

    @Generated
    @Selector("init")
    public native SCNProgram init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNProgram initWithCoder(NSCoder aDecoder);

    /**
     * opaque</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/opaque">iOS Dev Center</a>
     */
    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    /**
     * opaque</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/opaque">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * semanticForSymbol:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instm/SCNProgram/semanticForSymbol:">iOS Dev Center</a>
     */
    @Generated
    @Selector("semanticForSymbol:")
    public native String semanticForSymbol(String symbol);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNProgramDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) SCNProgramDelegate value) {
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
     * fragmentShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/fragmentShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFragmentShader:")
    public native void setFragmentShader(String value);

    /**
     * setSemantic:forSymbol:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instm/SCNProgram/setSemantic:forSymbol:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSemantic:forSymbol:options:")
    public native void setSemanticForSymbolOptions(String semantic, String symbol, NSDictionary<String, ?> options);

    /**
     * vertexShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/vertexShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVertexShader:")
    public native void setVertexShader(String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * vertexShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/vertexShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexShader")
    public native String vertexShader();

    /**
     * fragmentFunctionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/fragmentFunctionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("fragmentFunctionName")
    public native String fragmentFunctionName();

    /**
     * handleBindingOfBufferNamed:frequency:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instm/SCNProgram/handleBindingOfBufferNamed:frequency:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("handleBindingOfBufferNamed:frequency:usingBlock:")
    public native void handleBindingOfBufferNamedFrequencyUsingBlock(String name, @NInt long frequency,
            @ObjCBlock(name = "call_handleBindingOfBufferNamedFrequencyUsingBlock") Block_handleBindingOfBufferNamedFrequencyUsingBlock block);

    /**
     * library</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/library">iOS Dev Center</a>
     */
    @Generated
    @Selector("library")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLLibrary library();

    /**
     * fragmentFunctionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/fragmentFunctionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFragmentFunctionName:")
    public native void setFragmentFunctionName(String value);

    /**
     * library</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/library">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLibrary:")
    public native void setLibrary(@Mapped(ObjCObjectMapper.class) MTLLibrary value);

    /**
     * vertexFunctionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/vertexFunctionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVertexFunctionName:")
    public native void setVertexFunctionName(String value);

    /**
     * vertexFunctionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNProgram_Class/index.html#//apple_ref/occ/instp/SCNProgram/vertexFunctionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexFunctionName")
    public native String vertexFunctionName();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBindingOfBufferNamedFrequencyUsingBlock {
        @Generated
        void call_handleBindingOfBufferNamedFrequencyUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                SCNNode arg1, @Mapped(ObjCObjectMapper.class) Object arg2, SCNRenderer arg3);
    }
}
