package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.NFloat;

/**
 * An eraser tool for erasing parts of a drawing.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKEraserTool extends PKTool {
    static {
        NatJ.register();
    }

    @Generated
    protected PKEraserTool(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKEraserTool alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKEraserTool allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The eraser type.
     */
    @Generated
    @Selector("eraserType")
    @NInt
    public native long eraserType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKEraserTool init();

    @Generated
    @Selector("initWithEraserType:")
    public native PKEraserTool initWithEraserType(@NInt long eraserType);

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
    @Owned
    @Selector("new")
    public static native PKEraserTool new_objc();

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
     * The default width for an eraser type.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("defaultWidthForEraserType:")
    @NFloat
    public static native double defaultWidthForEraserType(@NInt long eraserType);

    /**
     * Create a new eraser tool with a width.
     * 
     * @param eraserType The type of eraser.
     * @param width      The width of the eraser.
     * 
     *                   API-Since: 16.4
     */
    @Generated
    @Selector("initWithEraserType:width:")
    public native PKEraserTool initWithEraserTypeWidth(@NInt long eraserType, @NFloat double width);

    /**
     * The maximum width for an eraser type.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("maximumWidthForEraserType:")
    @NFloat
    public static native double maximumWidthForEraserType(@NInt long eraserType);

    /**
     * The minimum width for an eraser type.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("minimumWidthForEraserType:")
    @NFloat
    public static native double minimumWidthForEraserType(@NInt long eraserType);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The width of the eraser.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();
}
