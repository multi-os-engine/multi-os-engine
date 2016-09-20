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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLVertexDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLVertexDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLVertexDescriptor alloc();

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
     * addOrReplaceAttribute:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/addOrReplaceAttribute:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOrReplaceAttribute:")
    public native void addOrReplaceAttribute(MDLVertexAttribute attribute);

    /**
     * attributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/attributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributeNamed:")
    public native MDLVertexAttribute attributeNamed(String name);

    /**
     * attributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instp/MDLVertexDescriptor/attributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributes")
    public native NSMutableArray<MDLVertexAttribute> attributes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native MDLVertexDescriptor init();

    /**
     * initWithVertexDescriptor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/initWithVertexDescriptor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithVertexDescriptor:")
    public native MDLVertexDescriptor initWithVertexDescriptor(MDLVertexDescriptor vertexDescriptor);

    /**
     * layouts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instp/MDLVertexDescriptor/layouts">iOS Dev Center</a>
     */
    @Generated
    @Selector("layouts")
    public native NSMutableArray<MDLVertexBufferLayout> layouts();

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * attributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instp/MDLVertexDescriptor/attributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(NSMutableArray<MDLVertexAttribute> value);

    /**
     * layouts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instp/MDLVertexDescriptor/layouts">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLayouts:")
    public native void setLayouts(NSMutableArray<MDLVertexBufferLayout> value);

    /**
     * setPackedOffsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/setPackedOffsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPackedOffsets")
    public native void setPackedOffsets();

    /**
     * setPackedStrides</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLVertexDescriptor_Class/index.html#//apple_ref/occ/instm/MDLVertexDescriptor/setPackedStrides">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPackedStrides")
    public native void setPackedStrides();
}
