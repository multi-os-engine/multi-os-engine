package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A tool for drawing on a PKCanvasView.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKInkingTool extends PKTool {
    static {
        NatJ.register();
    }

    @Generated
    protected PKInkingTool(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKInkingTool alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKInkingTool allocWithZone(VoidPtr zone);

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
    @Selector("color")
    public native UIColor color();

    /**
     * Converts a color from one user interface style to another.
     * 
     * A dark color in a light user interface style is converted to a lighter color in a
     * dark user interface style. This conversion is not guaranteed to roundtrip losslessly, or to
     * be consistent between different OS versions.
     * 
     * @param color                  The color to convert
     * @param fromUserInterfaceStyle The user interface style to convert the color from.
     * @param toUserInterfaceStyle   The user interface style to convert the color to.
     */
    @Generated
    @Selector("convertColor:fromUserInterfaceStyle:to:")
    public static native UIColor convertColorFromUserInterfaceStyleTo(UIColor color, @NInt long fromUserInterfaceStyle,
            @NInt long toUserInterfaceStyle);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The default width for an ink of a type.
     */
    @Generated
    @Selector("defaultWidthForInkType:")
    @NFloat
    public static native double defaultWidthForInkType(String inkType);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKInkingTool init();

    @Generated
    @Selector("initWithInkType:color:")
    public native PKInkingTool initWithInkTypeColor(String type, UIColor color);

    @Generated
    @Selector("initWithInkType:color:width:")
    public native PKInkingTool initWithInkTypeColorWidth(String type, UIColor color, @NFloat double width);

    /**
     * The type of ink, eg. pen, pencil...
     */
    @Generated
    @Selector("inkType")
    public native String inkType();

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
     * The maximum width for an ink of a type.
     */
    @Generated
    @Selector("maximumWidthForInkType:")
    @NFloat
    public static native double maximumWidthForInkType(String inkType);

    /**
     * The minimum width for an ink of a type.
     */
    @Generated
    @Selector("minimumWidthForInkType:")
    @NFloat
    public static native double minimumWidthForInkType(String inkType);

    @Generated
    @Owned
    @Selector("new")
    public static native PKInkingTool new_objc();

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
     * The base width of the ink.
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();

    /**
     * Create a new inking tool for the provided ink.
     * 
     * @param ink   The ink to use.
     * @param width The width of stroke to create.
     * 
     *              API-Since: 14.0
     */
    @Generated
    @Selector("initWithInk:width:")
    public native PKInkingTool initWithInkWidth(PKInk ink, @NFloat double width);

    /**
     * The ink that this tool will create strokes with.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("ink")
    public native PKInk ink();
}
