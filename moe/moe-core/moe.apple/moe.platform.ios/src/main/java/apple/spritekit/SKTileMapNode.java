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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.GKNoiseMap;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class SKTileMapNode extends SKNode implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileMapNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileMapNode alloc();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("node")
    public static native SKTileMapNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKTileMapNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSize(SKTileSet tileSet, @NUInt long columns,
            @NUInt long rows, @ByValue CGSize tileSize);

    @Generated
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSizeFillWithTileGroup(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, SKTileGroup tileGroup);

    @Generated
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSizeTileGroupLayout(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize,
            NSArray<? extends SKTileGroup> tileGroupLayout);

    @Generated
    @Selector("tileMapNodesWithTileSet:columns:rows:tileSize:fromNoiseMap:tileTypeNoiseMapThresholds:")
    public static native NSArray<? extends SKTileMapNode> tileMapNodesWithTileSetColumnsRowsTileSizeFromNoiseMapTileTypeNoiseMapThresholds(
            SKTileSet tileSet, @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, GKNoiseMap noiseMap,
            NSArray<? extends NSNumber> thresholds);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Selector("centerOfTileAtColumn:row:")
    @ByValue
    public native CGPoint centerOfTileAtColumnRow(@NUInt long column, @NUInt long row);

    @Generated
    @Selector("color")
    public native UIColor color();

    @Generated
    @Selector("colorBlendFactor")
    @NFloat
    public native double colorBlendFactor();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("enableAutomapping")
    public native boolean enableAutomapping();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fillWithTileGroup:")
    public native void fillWithTileGroup(SKTileGroup tileGroup);

    @Generated
    @Selector("init")
    public native SKTileMapNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileMapNode initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSize(SKTileSet tileSet, @NUInt long columns,
            @NUInt long rows, @ByValue CGSize tileSize);

    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSizeFillWithTileGroup(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, SKTileGroup tileGroup);

    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSizeTileGroupLayout(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize,
            NSArray<? extends SKTileGroup> tileGroupLayout);

    @Generated
    @Selector("lightingBitMask")
    public native int lightingBitMask();

    @Generated
    @Selector("mapSize")
    @ByValue
    public native CGSize mapSize();

    @Generated
    @Selector("numberOfColumns")
    @NUInt
    public native long numberOfColumns();

    @Generated
    @Selector("numberOfRows")
    @NUInt
    public native long numberOfRows();

    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    @Generated
    @Selector("setEnableAutomapping:")
    public native void setEnableAutomapping(boolean value);

    @Generated
    @Selector("setLightingBitMask:")
    public native void setLightingBitMask(int value);

    @Generated
    @Selector("setNumberOfColumns:")
    public native void setNumberOfColumns(@NUInt long value);

    @Generated
    @Selector("setNumberOfRows:")
    public native void setNumberOfRows(@NUInt long value);

    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    @Generated
    @Selector("setTileGroup:andTileDefinition:forColumn:row:")
    public native void setTileGroupAndTileDefinitionForColumnRow(SKTileGroup tileGroup, SKTileDefinition tileDefinition,
            @NUInt long column, @NUInt long row);

    @Generated
    @Selector("setTileGroup:forColumn:row:")
    public native void setTileGroupForColumnRow(SKTileGroup tileGroup, @NUInt long column, @NUInt long row);

    @Generated
    @Selector("setTileSet:")
    public native void setTileSet(SKTileSet value);

    @Generated
    @Selector("setTileSize:")
    public native void setTileSize(@ByValue CGSize value);

    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(SKAttributeValue value, String key);

    @Generated
    @Selector("shader")
    public native SKShader shader();

    @Generated
    @Selector("tileColumnIndexFromPosition:")
    @NUInt
    public native long tileColumnIndexFromPosition(@ByValue CGPoint position);

    @Generated
    @Selector("tileDefinitionAtColumn:row:")
    public native SKTileDefinition tileDefinitionAtColumnRow(@NUInt long column, @NUInt long row);

    @Generated
    @Selector("tileGroupAtColumn:row:")
    public native SKTileGroup tileGroupAtColumnRow(@NUInt long column, @NUInt long row);

    @Generated
    @Selector("tileRowIndexFromPosition:")
    @NUInt
    public native long tileRowIndexFromPosition(@ByValue CGPoint position);

    @Generated
    @Selector("tileSet")
    public native SKTileSet tileSet();

    @Generated
    @Selector("tileSize")
    @ByValue
    public native CGSize tileSize();

    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKTileMapNode nodeWithFileNamedSecurelyWithClassesAndError(String filename,
            NSSet<? extends Class> classes, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
