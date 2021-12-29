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
 * A tile group encapsulates a collection of related tile definitions that are designed to be pieced together within a tile map. How those tiles are pieced together is governed by the set of rules. When a tile group is placed in a tile map, the map evaluates the rules to determine which tiles should be placed to achieve the desired outcome.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTileGroup extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKTileGroup allocWithZone(VoidPtr zone);

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

    /**
     * Create an empty tile group. Placing this in a tile map will erase the existing tile at that location.
     */
    @Generated
    @Selector("emptyTileGroup")
    public static native SKTileGroup emptyTileGroup();

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
    public static native SKTileGroup new_objc();

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
     * Create a tile group with the specified rules.
     *
     * @param rules the rules the group will use to determine tile placement
     */
    @Generated
    @Selector("tileGroupWithRules:")
    public static native SKTileGroup tileGroupWithRules(NSArray<? extends SKTileGroupRule> rules);

    /**
     * Create a simple tile group for a single tile definition. This creates and initializes the SKTileGroupRule necessary to place the provided tile definition in a tile map.
     *
     * @param tileDefinition the tile definition we wish to place in a tile map
     */
    @Generated
    @Selector("tileGroupWithTileDefinition:")
    public static native SKTileGroup tileGroupWithTileDefinition(SKTileDefinition tileDefinition);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

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
    public native SKTileGroup init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileGroup initWithCoder(NSCoder coder);

    /**
     * Initilize a tile group with the specified rules.
     *
     * @param rules the rules the group will use to determine tile placement
     */
    @Generated
    @Selector("initWithRules:")
    public native SKTileGroup initWithRules(NSArray<? extends SKTileGroupRule> rules);

    /**
     * Initilize a simple tile group for a single tile definition. This creates and initializes the SKTileGroupRule necessary to place the provided tile definition in a tile map.
     *
     * @param tileDefinition tile definition we wish to place in a tile map
     */
    @Generated
    @Selector("initWithTileDefinition:")
    public native SKTileGroup initWithTileDefinition(SKTileDefinition tileDefinition);

    /**
     * Client-assignable name for the tile group. Defaults to nil.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The rules that govern which tiles are placed when this group is used, and where in the map they'll be placed.
     */
    @Generated
    @Selector("rules")
    public native NSArray<? extends SKTileGroupRule> rules();

    /**
     * Client-assignable name for the tile group. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * The rules that govern which tiles are placed when this group is used, and where in the map they'll be placed.
     */
    @Generated
    @Selector("setRules:")
    public native void setRules(NSArray<? extends SKTileGroupRule> value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
