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
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLNamed;
import apple.modelio.protocol.MDLObjectContainerComponent;
import apple.modelio.protocol.MDLTransformComponent;
import apple.scenekit.SCNNode;
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
public class MDLObject extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLObject(Pointer peer) {
        super(peer);
    }

    /**
     * addChild:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instm/MDLObject/addChild:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addChild:")
    public native void addChild(MDLObject child);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLObject alloc();

    /**
     * children</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/children">iOS Dev Center</a>
     */
    @Generated
    @Selector("children")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent children();

    @Generated
    @Selector("init")
    public native MDLObject init();

    @Generated
    @Selector("name")
    public native String name();

    /**
     * objectWithSCNNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/clm/MDLObject/objectWithSCNNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLObject objectWithSCNNode(SCNNode scnNode);

    /**
     * parent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/parent">iOS Dev Center</a>
     */
    @Generated
    @Selector("parent")
    public native MDLObject parent();

    /**
     * children</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/children">iOS Dev Center</a>
     */
    @Generated
    @Selector("setChildren:")
    public native void setChildren(@Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * parent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/parent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParent:")
    public native void setParent_unsafe(MDLObject value);

    /**
     * parent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/parent">iOS Dev Center</a>
     */
    @Generated
    public void setParent(MDLObject value) {
        Object __old = parent();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setParent_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/transform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@Mapped(ObjCObjectMapper.class) MDLTransformComponent value);

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObject_Class/index.html#//apple_ref/occ/instp/MDLObject/transform">iOS Dev Center</a>
     */
    @Generated
    @Selector("transform")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLTransformComponent transform();

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
}
