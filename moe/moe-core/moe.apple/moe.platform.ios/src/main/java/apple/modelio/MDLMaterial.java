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
import apple.foundation.protocol.NSFastEnumeration;
import apple.modelio.protocol.MDLAssetResolver;
import apple.modelio.protocol.MDLNamed;
import apple.scenekit.SCNMaterial;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLMaterial extends NSObject implements MDLNamed, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLMaterial(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLMaterial alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLMaterial allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("materialWithSCNMaterial:")
    public static native MDLMaterial materialWithSCNMaterial(SCNMaterial scnMaterial);

    @Generated
    @Owned
    @Selector("new")
    public static native MDLMaterial new_objc();

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
     * If a property is not found by propertyForKey and baseMaterial is not nil,
     * propertyForKey will invoke propertyForKey on baseMaterial.
     * All other selectors disregard baseMaterial.
     */
    @Generated
    @Selector("baseMaterial")
    public native MDLMaterial baseMaterial();

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("init")
    public native MDLMaterial init();

    @Generated
    @Selector("initWithName:scatteringFunction:")
    public native MDLMaterial initWithNameScatteringFunction(String name, MDLScatteringFunction scatteringFunction);

    /**
     * Default is MDLMaterialFaceFront
     */
    @Generated
    @Selector("materialFace")
    @NUInt
    public native long materialFace();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native MDLMaterialProperty objectAtIndexedSubscript(@NUInt long idx);

    @Generated
    @Selector("objectForKeyedSubscript:")
    public native MDLMaterialProperty objectForKeyedSubscript(String name);

    /**
     * Returns the complete list of properties that match the semantic (e.g. Kd & Kd_map)
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("propertiesWithSemantic:")
    public native NSArray<? extends MDLMaterialProperty> propertiesWithSemantic(@NUInt long semantic);

    @Generated
    @Selector("propertyNamed:")
    public native MDLMaterialProperty propertyNamed(String name);

    /**
     * Returns the first occurence of the property that matches the semantic.
     * Not recommended to use when there are multiple properties with same semantic.
     */
    @Generated
    @Selector("propertyWithSemantic:")
    public native MDLMaterialProperty propertyWithSemantic(@NUInt long semantic);

    @Generated
    @Selector("removeAllProperties")
    public native void removeAllProperties();

    @Generated
    @Selector("removeProperty:")
    public native void removeProperty(MDLMaterialProperty property);

    @Generated
    @Selector("scatteringFunction")
    public native MDLScatteringFunction scatteringFunction();

    /**
     * If a property is not found by propertyForKey and baseMaterial is not nil,
     * propertyForKey will invoke propertyForKey on baseMaterial.
     * All other selectors disregard baseMaterial.
     */
    @Generated
    @Selector("setBaseMaterial:")
    public native void setBaseMaterial(MDLMaterial value);

    /**
     * Default is MDLMaterialFaceFront
     */
    @Generated
    @Selector("setMaterialFace:")
    public native void setMaterialFace(@NUInt long value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setProperty:")
    public native void setProperty(MDLMaterialProperty property);

    /**
     * Iterates all material properties. If they are string values or NSURL values, and
     * can be resolved as textures, then the string and NSURL values will be replaced by
     * MDLTextureSampler values. The transforms on the samplers will be identity, the
     * wrap modes will be clamp, and the filter modes will be linear.
     * 
     * @param resolver If non-nil, the resolver can be invoked to convert stringValues
     *                 to NSURLs for loading.
     * 
     *                 API-Since: 11.0
     */
    @Generated
    @Selector("loadTexturesUsingResolver:")
    public native void loadTexturesUsingResolver(@Mapped(ObjCObjectMapper.class) MDLAssetResolver resolver);

    /**
     * Iterates all material properties. If they are string values, they are resolved into
     * valid paths as NSURL values.
     * 
     * @param resolver If non-nil, the resolver can be invoked to convert stringValues
     *                 to NSURLs for loading.
     * 
     *                 API-Since: 11.0
     */
    @Generated
    @Selector("resolveTexturesWithResolver:")
    public native void resolveTexturesWithResolver(@Mapped(ObjCObjectMapper.class) MDLAssetResolver resolver);
}
