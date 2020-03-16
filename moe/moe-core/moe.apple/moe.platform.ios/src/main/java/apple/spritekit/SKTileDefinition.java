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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTileDefinition extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileDefinition alloc();

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
    @Selector("tileDefinitionWithTexture:")
    public static native SKTileDefinition tileDefinitionWithTexture(SKTexture texture);

    @Generated
    @Selector("tileDefinitionWithTexture:normalTexture:size:")
    public static native SKTileDefinition tileDefinitionWithTextureNormalTextureSize(SKTexture texture,
            SKTexture normalTexture, @ByValue CGSize size);

    @Generated
    @Selector("tileDefinitionWithTexture:size:")
    public static native SKTileDefinition tileDefinitionWithTextureSize(SKTexture texture, @ByValue CGSize size);

    @Generated
    @Selector("tileDefinitionWithTextures:normalTextures:size:timePerFrame:")
    public static native SKTileDefinition tileDefinitionWithTexturesNormalTexturesSizeTimePerFrame(
            NSArray<? extends SKTexture> textures, NSArray<? extends SKTexture> normalTextures, @ByValue CGSize size,
            @NFloat double timePerFrame);

    @Generated
    @Selector("tileDefinitionWithTextures:size:timePerFrame:")
    public static native SKTileDefinition tileDefinitionWithTexturesSizeTimePerFrame(
            NSArray<? extends SKTexture> textures, @ByValue CGSize size, @NFloat double timePerFrame);

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
    @Selector("flipHorizontally")
    public native boolean flipHorizontally();

    @Generated
    @Selector("flipVertically")
    public native boolean flipVertically();

    @Generated
    @Selector("init")
    public native SKTileDefinition init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileDefinition initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithTexture:")
    public native SKTileDefinition initWithTexture(SKTexture texture);

    @Generated
    @Selector("initWithTexture:normalTexture:size:")
    public native SKTileDefinition initWithTextureNormalTextureSize(SKTexture texture, SKTexture normalTexture,
            @ByValue CGSize size);

    @Generated
    @Selector("initWithTexture:size:")
    public native SKTileDefinition initWithTextureSize(SKTexture texture, @ByValue CGSize size);

    @Generated
    @Selector("initWithTextures:normalTextures:size:timePerFrame:")
    public native SKTileDefinition initWithTexturesNormalTexturesSizeTimePerFrame(NSArray<? extends SKTexture> textures,
            NSArray<? extends SKTexture> normalTextures, @ByValue CGSize size, @NFloat double timePerFrame);

    @Generated
    @Selector("initWithTextures:size:timePerFrame:")
    public native SKTileDefinition initWithTexturesSizeTimePerFrame(NSArray<? extends SKTexture> textures,
            @ByValue CGSize size, @NFloat double timePerFrame);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("normalTextures")
    public native NSArray<? extends SKTexture> normalTextures();

    @Generated
    @Selector("placementWeight")
    @NUInt
    public native long placementWeight();

    @Generated
    @Selector("rotation")
    @NUInt
    public native long rotation();

    @Generated
    @Selector("setFlipHorizontally:")
    public native void setFlipHorizontally(boolean value);

    @Generated
    @Selector("setFlipVertically:")
    public native void setFlipVertically(boolean value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setNormalTextures:")
    public native void setNormalTextures(NSArray<? extends SKTexture> value);

    @Generated
    @Selector("setPlacementWeight:")
    public native void setPlacementWeight(@NUInt long value);

    @Generated
    @Selector("setRotation:")
    public native void setRotation(@NUInt long value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("setTextures:")
    public native void setTextures(NSArray<? extends SKTexture> value);

    @Generated
    @Selector("setTimePerFrame:")
    public native void setTimePerFrame(@NFloat double value);

    @Generated
    @Selector("setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> value);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("textures")
    public native NSArray<? extends SKTexture> textures();

    @Generated
    @Selector("timePerFrame")
    @NFloat
    public native double timePerFrame();

    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
