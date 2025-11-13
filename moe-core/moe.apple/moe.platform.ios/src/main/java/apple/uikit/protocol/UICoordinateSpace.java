package apple.uikit.protocol;

import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICoordinateSpace")
public interface UICoordinateSpace {
    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertPoint:fromCoordinateSpace:")
    @ByValue
    CGPoint convertPointFromCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) @NotNull UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertPoint:toCoordinateSpace:")
    @ByValue
    CGPoint convertPointToCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) @NotNull UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertRect:fromCoordinateSpace:")
    @ByValue
    CGRect convertRectFromCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) @NotNull UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertRect:toCoordinateSpace:")
    @ByValue
    CGRect convertRectToCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) @NotNull UICoordinateSpace coordinateSpace);
}