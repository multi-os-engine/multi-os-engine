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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * A tile group rule defines how a certain type of tile should be placed on the map. These tiles are like puzzle pieces,
 * and the rules define how they should be pieced together. This is accomplished by defining which neighboring spaces
 * need to be filled with tiles that belong to the same group, and which tiles are required to be empty. The required
 * pattern of neighboring tiles is defined using the SKTileAdjacencyMask.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTileGroupRule extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileGroupRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileGroupRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKTileGroupRule allocWithZone(VoidPtr zone);

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
    public static native SKTileGroupRule new_objc();

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

    /**
     * Create a tile group rule with the specified adjacency and tile definitions.
     * 
     * @param adjacency       the adjacency requirements for this rule; use the mask that covers the adjacent spaces
     *                        that must be filled with tiles belonging to the same group; tiles not masked out must be
     *                        empty
     * @param tileDefinitions the tile definitions used for this rule
     */
    @Generated
    @Selector("tileGroupRuleWithAdjacency:tileDefinitions:")
    public static native SKTileGroupRule tileGroupRuleWithAdjacencyTileDefinitions(@NUInt long adjacency,
            NSArray<? extends SKTileDefinition> tileDefinitions);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The adjacency mask used by this rule. Set this to the mask that covers the adjacent spaces that must be filled
     * with tiles belonging to the same group for this rule met.
     */
    @Generated
    @Selector("adjacency")
    @NUInt
    public native long adjacency();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SKTileGroupRule init();

    /**
     * Initilize a tile group rule with the specified adjacency and tile definitions.
     * 
     * @param adjacency       the adjacency requirements for this rule; use the mask that covers the adjacent spaces
     *                        that must be filled with tiles belonging to the same group; tiles not masked out must be
     *                        empty
     * @param tileDefinitions the tile definitions used for this rule
     */
    @Generated
    @Selector("initWithAdjacency:tileDefinitions:")
    public native SKTileGroupRule initWithAdjacencyTileDefinitions(@NUInt long adjacency,
            NSArray<? extends SKTileDefinition> tileDefinitions);

    @Generated
    @Selector("initWithCoder:")
    public native SKTileGroupRule initWithCoder(NSCoder coder);

    /**
     * Client-assignable name for the tile group rule. Defaults to nil.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The adjacency mask used by this rule. Set this to the mask that covers the adjacent spaces that must be filled
     * with tiles belonging to the same group for this rule met.
     */
    @Generated
    @Selector("setAdjacency:")
    public native void setAdjacency(@NUInt long value);

    /**
     * Client-assignable name for the tile group rule. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * The tile definitions used by this rule. If the rule is evaluated and its conditions are met, one of the tile
     * definitions within this array will be randomly selected for placement within the tile map. Each tile definitions'
     * placement weight is taken into consideration to determine how likely each is to be selected; tile definitions
     * with higher placement weights will be selected more frequently than those with lower placement weights.
     */
    @Generated
    @Selector("setTileDefinitions:")
    public native void setTileDefinitions(NSArray<? extends SKTileDefinition> value);

    /**
     * The tile definitions used by this rule. If the rule is evaluated and its conditions are met, one of the tile
     * definitions within this array will be randomly selected for placement within the tile map. Each tile definitions'
     * placement weight is taken into consideration to determine how likely each is to be selected; tile definitions
     * with higher placement weights will be selected more frequently than those with lower placement weights.
     */
    @Generated
    @Selector("tileDefinitions")
    public native NSArray<? extends SKTileDefinition> tileDefinitions();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
