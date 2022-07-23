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

/**
 * A SpriteKit node used to render a 2D array of textured sprites. Uses SKTileSet to determine what textures it can use
 * to render. Separate tile map nodes can be layered on top of one another to achieve various effects, such as parallax
 * scrolling.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKTileMapNode allocWithZone(VoidPtr zone);

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
    public static native SKTileMapNode new_objc();

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

    /**
     * Create a tile map node with the specified tile set and dimensions. The tiles of the map will be empty, equivalent
     * to the nil tile definition/group.
     *
     * @param tileSet  the tile set that is used to render the tiles
     * @param columns  the number of columns in the map that can hold tiles
     * @param rows     the number of rows in the map that can hold tiles
     * @param tileSize the size of each tile in points
     */
    @Generated
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSize(SKTileSet tileSet, @NUInt long columns,
            @NUInt long rows, @ByValue CGSize tileSize);

    /**
     * Create a tile map node with the specified tile set and dimensions, and fill it with the specified tile group.
     *
     * @param tileSet   the tile set that is used to render the tiles
     * @param columns   the number of columns in the map that can hold tiles
     * @param rows      the number of rows in the map that can hold tiles
     * @param tileSize  the size of each tile in points
     * @param tileGroup the tile group we wish to fill the tile map with
     */
    @Generated
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSizeFillWithTileGroup(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, SKTileGroup tileGroup);

    /**
     * Create a tile map node with the specified tile set and dimensions, and fill it with a specific layout of tile
     * groups that belong to the provided tile set. The tileGroupLayout array should match the dimensions of the tile
     * map (i.e., the number of elements should be equal to columns * rows). Index 0 of the array maps to column 0, row
     * 0 of the tile map. Index 1 is column 1, row 0, and so on, wrapping around to the next row once the index passes
     * the number of columns in the tile map. If the array has fewer elements than the number of tiles in the map, the
     * remaining tiles are initialized with the nil tile group. If the array has more elements than the number of tiles
     * in the map, the extra tile groups are ignored.
     *
     * @param tileSet         the tile set that is used to render the tiles
     * @param columns         the number of columns in the map that can hold tiles
     * @param rows            the number of rows in the map that can hold tiles
     * @param tileSize        the size of each tile in points
     * @param tileGroupLayout an array of tile groups that we want to use to fill the tile map
     */
    @Generated
    @Selector("tileMapNodeWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    public static native SKTileMapNode tileMapNodeWithTileSetColumnsRowsTileSizeTileGroupLayout(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize,
            NSArray<? extends SKTileGroup> tileGroupLayout);

    /**
     * Create a set of layered tile map nodes with the specified tile set and dimensions, and fill each layer based on
     * the provided noise map. Each
     * layer will be partially filled with a tile group using values from the noise map that fall below the
     * corresponding values in the thresholds
     * array. The values in the noise map range from -1 to 1, and the provided threshold values are implicitly bounded
     * with the values -1.0 and 1.0.
     * Each threshold value corresponds with a tile group in the tile set, starting with the first tile group in the
     * set. If, for example, we passed
     * in a thresholds array with the values [-0.5, 0.0, 0.5], this method would return an array of four tile maps. The
     * first tile map would contain
     * the first tile group (i.e., tileSet.tileGroups[0]) within tiles that fall between the threshold values -1.0 and
     * -0.5 in the noise map. The
     * second tile map would contain the second tile group (i.e., tileSet.tileGroups[1]) within tiles that fall between
     * the threshold values -0.5 and
     * 0.0 in the noise map. The third tile map would contain the third tile group (i.e., tileSet.tileGroups[2]) within
     * tiles that fall between the
     * threshold values 0.0 and 0.5 in the noise map. And finally, the fourth tile map would contain the fourth tile
     * group
     * (i.e., tileSet.tileGroups[3]) within tiles that fall between the threshold values 0.5 and 1.0.
     *
     * @param tileSet    the tile set that is used to render the tiles
     * @param columns    the number of columns in each map that can hold tiles
     * @param rows       the number of rows in each map that can hold tiles
     * @param tileSize   the size of each tile in points
     * @param noiseMap   the noise map we wish to use to fill each layer
     * @param thresholds the thresholds for each tile group in the tile set
     */
    @Generated
    @Selector("tileMapNodesWithTileSet:columns:rows:tileSize:fromNoiseMap:tileTypeNoiseMapThresholds:")
    public static native NSArray<? extends SKTileMapNode> tileMapNodesWithTileSetColumnsRowsTileSizeFromNoiseMapTileTypeNoiseMapThresholds(
            SKTileSet tileSet, @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, GKNoiseMap noiseMap,
            NSArray<? extends NSNumber> thresholds);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Used to choose the location in the tile map that maps to its 'position' in the parent's coordinate space. The
     * valid interval for each input is from 0.0 up to and including 1.0.
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     */
    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    /**
     * Sets the blend mode to use when composing the tile map with the final framebuffer.
     *
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * Returns the position of the center of the tile at the specified column and row.
     *
     * @param column the column index of the tile
     * @param row    the row index of the tile
     */
    @Generated
    @Selector("centerOfTileAtColumn:row:")
    @ByValue
    public native CGPoint centerOfTileAtColumnRow(@NUInt long column, @NUInt long row);

    /**
     * Base color for the tile map (If no texture is present, the color still is drawn).
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * Controls the blending between the texture and the tile map color. The valid interval of values is from 0.0 up to
     * and including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum
     * (1.0) if above.
     */
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

    /**
     * Fill the entire tile map with the provided tile group.
     *
     * @param tileGroup the tile group that will be used to fill the map
     */
    @Generated
    @Selector("fillWithTileGroup:")
    public native void fillWithTileGroup(SKTileGroup tileGroup);

    @Generated
    @Selector("init")
    public native SKTileMapNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileMapNode initWithCoder(NSCoder coder);

    /**
     * Initialize a tile map node with the specified tile set and dimensions. The tiles of the map will be empty,
     * equivalent to the nil tile definition/group.
     *
     * @param tileSet  the tile set that is used to render the tiles
     * @param columns  the number of columns in the map that can hold tiles
     * @param rows     the number of rows in the map that can hold tiles
     * @param tileSize the size of each tile in points
     */
    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSize(SKTileSet tileSet, @NUInt long columns,
            @NUInt long rows, @ByValue CGSize tileSize);

    /**
     * Initialize a tile map node with the specified tile set and dimensions, and fill it with the specified tile group.
     *
     * @param tileSet   the tile set that is used to render the tiles
     * @param columns   the number of columns in the map that can hold tiles
     * @param rows      the number of rows in the map that can hold tiles
     * @param tileSize  the size of each tile in points
     * @param tileGroup the tile group we wish to fill the tile map with
     */
    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSizeFillWithTileGroup(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize, SKTileGroup tileGroup);

    /**
     * Initialize a tile map node with the specified tile set and dimensions, and fill it with a specific layout of tile
     * groups that belong to the provided tile set. The tileGroupLayout array should match the dimensions of the tile
     * map (i.e., the number of elements should be equal to columns * rows). Index 0 of the array maps to column 0, row
     * 0 of the tile map. Index 1 is column 1, row 0, and so on, wrapping around to the next row once the index passes
     * the number of columns in the tile map. If the array has fewer elements than the number of tiles in the map, the
     * remaining tiles are initialized with the nil tile group. If the array has more elements than the number of tiles
     * in the map, the extra tile groups are ignored.
     *
     * @param tileSet         the tile set that is used to render the tiles
     * @param columns         the number of columns in the map that can hold tiles
     * @param rows            the number of rows in the map that can hold tiles
     * @param tileSize        the size of each tile in points
     * @param tileGroupLayout an array of tile groups that we want to use to fill the tile map
     */
    @Generated
    @Selector("initWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    public native SKTileMapNode initWithTileSetColumnsRowsTileSizeTileGroupLayout(SKTileSet tileSet,
            @NUInt long columns, @NUInt long rows, @ByValue CGSize tileSize,
            NSArray<? extends SKTileGroup> tileGroupLayout);

    /**
     * Bitmask to indicate being lit by a set of lights using overlapping lighting categories.
     * <p>
     * A light whose category is set to a value that masks to non-zero using this mask will
     * apply light to this sprite.
     * <p>
     * When used together with a normal texture, complex lighting effects can be used.
     */
    @Generated
    @Selector("lightingBitMask")
    public native int lightingBitMask();

    /**
     * The size of the tile map. This is dependent on the tileSize, the number of columns and rows in the map, and the
     * tile set type.
     */
    @Generated
    @Selector("mapSize")
    @ByValue
    public native CGSize mapSize();

    /**
     * The number of columns in the tile map.
     */
    @Generated
    @Selector("numberOfColumns")
    @NUInt
    public native long numberOfColumns();

    /**
     * The number of rows in the tile map.
     */
    @Generated
    @Selector("numberOfRows")
    @NUInt
    public native long numberOfRows();

    /**
     * Used to choose the location in the tile map that maps to its 'position' in the parent's coordinate space. The
     * valid interval for each input is from 0.0 up to and including 1.0.
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     */
    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    /**
     * Sets the blend mode to use when composing the tile map with the final framebuffer.
     *
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * Base color for the tile map (If no texture is present, the color still is drawn).
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * Controls the blending between the texture and the tile map color. The valid interval of values is from 0.0 up to
     * and including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum
     * (1.0) if above.
     */
    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    @Generated
    @Selector("setEnableAutomapping:")
    public native void setEnableAutomapping(boolean value);

    /**
     * Bitmask to indicate being lit by a set of lights using overlapping lighting categories.
     * <p>
     * A light whose category is set to a value that masks to non-zero using this mask will
     * apply light to this sprite.
     * <p>
     * When used together with a normal texture, complex lighting effects can be used.
     */
    @Generated
    @Selector("setLightingBitMask:")
    public native void setLightingBitMask(int value);

    /**
     * The number of columns in the tile map.
     */
    @Generated
    @Selector("setNumberOfColumns:")
    public native void setNumberOfColumns(@NUInt long value);

    /**
     * The number of rows in the tile map.
     */
    @Generated
    @Selector("setNumberOfRows:")
    public native void setNumberOfRows(@NUInt long value);

    /**
     * A property that determines whether the tile map is rendered using a custom shader.
     */
    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    /**
     * Set the tile group and tile defintion at the specified tile index. When automapping is enabled, it will attempt
     * to resolve the surrounding tiles to allow the specified tile definition to be placed. When automapping is
     * disabled, it will simply place the tile definition and not modify any of the neighboring tiles.
     *
     * @param tileGroup      the tile group we want to place in the map
     * @param tileDefinition the tile definition we want to place in the map
     * @param column         the column index of the tile
     * @param row            the row index of the tile
     */
    @Generated
    @Selector("setTileGroup:andTileDefinition:forColumn:row:")
    public native void setTileGroupAndTileDefinitionForColumnRow(SKTileGroup tileGroup, SKTileDefinition tileDefinition,
            @NUInt long column, @NUInt long row);

    /**
     * Set the tile group at the specified tile index. When automapping is enabled, the appropriate tile definitions
     * will automatically be selected and placed, possibly modifying neighboring tiles. When automapping is disabled, it
     * will simply place the default center tile definition for the group, and will not modify any of the neihboring
     * tiles.
     *
     * @param tileGroup the tile group we want to place in the map
     * @param column    the column index of the tile
     * @param row       the row index of the tile
     */
    @Generated
    @Selector("setTileGroup:forColumn:row:")
    public native void setTileGroupForColumnRow(SKTileGroup tileGroup, @NUInt long column, @NUInt long row);

    /**
     * The tile set being used by this tile map.
     */
    @Generated
    @Selector("setTileSet:")
    public native void setTileSet(SKTileSet value);

    /**
     * The size of each tile in the map.
     */
    @Generated
    @Selector("setTileSize:")
    public native void setTileSize(@ByValue CGSize value);

    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(SKAttributeValue value, String key);

    /**
     * A property that determines whether the tile map is rendered using a custom shader.
     */
    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * Returns the column index of the tile that lies under the specified position. Returns NSUIntegerMax if the
     * position does not fall within the tile map.
     *
     * @param position the position we want to check against the tile map
     */
    @Generated
    @Selector("tileColumnIndexFromPosition:")
    @NUInt
    public native long tileColumnIndexFromPosition(@ByValue CGPoint position);

    /**
     * Look up the tile definition at the specified tile index.
     *
     * @param column the column index of the tile
     * @param row    the row index of the tile
     */
    @Generated
    @Selector("tileDefinitionAtColumn:row:")
    public native SKTileDefinition tileDefinitionAtColumnRow(@NUInt long column, @NUInt long row);

    /**
     * Look up the tile group at the specified tile index.
     *
     * @param column the column index of the tile
     * @param row    the row index of the tile
     */
    @Generated
    @Selector("tileGroupAtColumn:row:")
    public native SKTileGroup tileGroupAtColumnRow(@NUInt long column, @NUInt long row);

    /**
     * Returns the row index of the tile that lies under the specified position. Returns NSUIntegerMax if the position
     * does not fall within the tile map.
     *
     * @param position the position we want to check against the tile map
     */
    @Generated
    @Selector("tileRowIndexFromPosition:")
    @NUInt
    public native long tileRowIndexFromPosition(@ByValue CGPoint position);

    /**
     * The tile set being used by this tile map.
     */
    @Generated
    @Selector("tileSet")
    public native SKTileSet tileSet();

    /**
     * The size of each tile in the map.
     */
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
