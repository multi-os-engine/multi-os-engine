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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.protocol.CAAction;
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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CATiledLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CATiledLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CATiledLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CATiledLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The time in seconds that newly added images take to "fade-in" to the
     * rendered representation of the tiled layer. The default implementation
     * returns 0.25 seconds.
     */
    @Generated
    @Selector("fadeDuration")
    public static native double fadeDuration();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("layer")
    public static native CATiledLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CATiledLayer new_objc();

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

    @Generated
    @Selector("init")
    public native CATiledLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CATiledLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native CATiledLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * The number of levels of detail maintained by this layer. Defaults to
     * one. Each LOD is half the resolution of the previous level. If too
     * many levels are specified for the current size of the layer, then
     * the number of levels is clamped to the maximum value (the bottom
     * most LOD must contain at least a single pixel in each dimension).
     */
    @Generated
    @Selector("levelsOfDetail")
    @NUInt
    public native long levelsOfDetail();

    /**
     * The number of magnified levels of detail for this layer. Defaults to
     * zero. Each previous level of detail is twice the resolution of the
     * later. E.g. specifying 'levelsOfDetailBias' of two means that the
     * layer devotes two of its specified levels of detail to
     * magnification, i.e. 2x and 4x.
     */
    @Generated
    @Selector("levelsOfDetailBias")
    @NUInt
    public native long levelsOfDetailBias();

    /**
     * The number of levels of detail maintained by this layer. Defaults to
     * one. Each LOD is half the resolution of the previous level. If too
     * many levels are specified for the current size of the layer, then
     * the number of levels is clamped to the maximum value (the bottom
     * most LOD must contain at least a single pixel in each dimension).
     */
    @Generated
    @Selector("setLevelsOfDetail:")
    public native void setLevelsOfDetail(@NUInt long value);

    /**
     * The number of magnified levels of detail for this layer. Defaults to
     * zero. Each previous level of detail is twice the resolution of the
     * later. E.g. specifying 'levelsOfDetailBias' of two means that the
     * layer devotes two of its specified levels of detail to
     * magnification, i.e. 2x and 4x.
     */
    @Generated
    @Selector("setLevelsOfDetailBias:")
    public native void setLevelsOfDetailBias(@NUInt long value);

    /**
     * The maximum size of each tile used to create the layer's content.
     * Defaults to (256, 256). Note that there is a maximum tile size, and
     * requests for tiles larger than that limit will cause a suitable
     * value to be substituted.
     */
    @Generated
    @Selector("setTileSize:")
    public native void setTileSize(@ByValue CGSize value);

    /**
     * The maximum size of each tile used to create the layer's content.
     * Defaults to (256, 256). Note that there is a maximum tile size, and
     * requests for tiles larger than that limit will cause a suitable
     * value to be substituted.
     */
    @Generated
    @Selector("tileSize")
    @ByValue
    public native CGSize tileSize();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);
}
