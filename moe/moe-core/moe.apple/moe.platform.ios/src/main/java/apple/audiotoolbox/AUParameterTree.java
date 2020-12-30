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

package apple.audiotoolbox;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
 * @class	AUParameterTree
 * @brief	The top level group node, representing all of an audio unit's parameters.
 * @discussion
 * 	An audio unit's parameters are organized into a tree containing groups and parameters.
 * 	Groups may be nested.
 * 
 * 	The tree is KVO-compliant. For example, if the tree contains a group named "LFO" ,
 * 	containing a parameter named rate, then "LFO.rate" refers to that parameter object, and
 * 	"LFO.rate.value" refers to that parameter's value.
 * 
 * 	An audio unit may choose to dynamically rearrange the tree. When doing so, it must
 * 	issue a KVO notification on the audio unit's parameterTree property. The tree's elements are
 * 	mostly immutable (except for values and implementor hooks); the only way to modify them
 * 	is to publish a new tree.
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUParameterTree extends AUParameterGroup implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AUParameterTree(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUParameterTree alloc();

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

    /**
     * @brief	Initialize a group as a copied instance of a template group.
     * @param templateGroup	A group to be used as a template and largely copied.
     * @param identifier		An identifier for the new group (non-localized, persistent).
     * @param name				The new group's human-readable name (localized).
     * @param addressOffset	The new group's parameters' addresses will be offset from those in
     * 						the template by this value.
     */
    @Generated
    @Selector("createGroupFromTemplate:identifier:name:addressOffset:")
    public static native AUParameterGroup createGroupFromTemplateIdentifierNameAddressOffset(
            AUParameterGroup templateGroup, String identifier, String name, long addressOffset);

    /**
     * @brief		Create a template group which may be used as a prototype for further group instances.
     * 
     * @discussion
     * 	Template groups provide a way to construct multiple instances of identical parameter
     * 	groups, sharing certain immutable state between the instances.
     * 
     * 	Template groups may not appear in trees except at the root.
     */
    @Generated
    @Selector("createGroupTemplate:")
    public static native AUParameterGroup createGroupTemplate(NSArray<? extends AUParameterNode> children);

    /**
     * @brief	Create an AUParameterGroup.
     * @param identifier	An identifier for the group (non-localized, persistent).
     * @param name			The group's human-readable name (localized).
     * @param children		The group's child nodes.
     */
    @Generated
    @Selector("createGroupWithIdentifier:name:children:")
    public static native AUParameterGroup createGroupWithIdentifierNameChildren(String identifier, String name,
            NSArray<? extends AUParameterNode> children);

    /**
     * Create an AUParameter.
     * See AUParameter's properties for descriptions of the arguments.
     */
    @Generated
    @Selector("createParameterWithIdentifier:name:address:min:max:unit:unitName:flags:valueStrings:dependentParameters:")
    public static native AUParameter createParameterWithIdentifierNameAddressMinMaxUnitUnitNameFlagsValueStringsDependentParameters(
            String identifier, String name, long address, float min, float max, int unit, String unitName, int flags,
            NSArray<String> valueStrings, NSArray<? extends NSNumber> dependentParameters);

    /**
     * @brief	Create an AUParameterTree.
     * @param children		The tree's top-level child nodes.
     */
    @Generated
    @Selector("createTreeWithChildren:")
    public static native AUParameterTree createTreeWithChildren(NSArray<? extends AUParameterNode> children);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native AUParameterTree init();

    @Generated
    @Selector("initWithCoder:")
    public native AUParameterTree initWithCoder(NSCoder coder);

    /**
     * @method	parameterWithAddress:
     * @brief	Search a tree for a parameter with a specific address.
     * @return
     * 	The parameter corresponding to the supplied address, or nil if no such parameter exists.
     */
    @Generated
    @Selector("parameterWithAddress:")
    public native AUParameter parameterWithAddress(long address);

    /**
     * @method	parameterWithID:scope:element:
     * @brief	Search a tree for a specific v2 audio unit parameter.
     * @discussion
     * 	V2 audio units publish parameters identified by a parameter ID, scope, and element.
     * 	A host that knows that it is dealing with a v2 unit can locate parameters using this method,
     * 	for example, for the Apple-supplied system audio units.
     * @return
     * 	The parameter corresponding to the supplied ID/scope/element, or nil if no such parameter
     * 	exists, or if the audio unit is not a v2 unit.
     */
    @Generated
    @Selector("parameterWithID:scope:element:")
    public native AUParameter parameterWithIDScopeElement(int paramID, int scope, int element);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
