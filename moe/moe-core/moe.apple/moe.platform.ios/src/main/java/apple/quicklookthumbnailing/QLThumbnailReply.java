package apple.quicklookthumbnailing;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * To provide a thumbnail for a request, you have to return a QLThumbnailReply object.
 * 
 * To provide a thumbnail, you have two options:
 * 1. Draw the thumbnail, by providing a QLThumbnailReply created with a drawing block.
 * 2. Pass the thumbnail file URL, by providing a QLThumbnailReply created with a file URL.
 */
@Generated
@Library("QuickLookThumbnailing")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLThumbnailReply extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected QLThumbnailReply(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLThumbnailReply alloc();

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
    @Selector("init")
    public native QLThumbnailReply init();

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

    /**
     * You can create a reply with a drawing block that will draw into the current context with the coordinate system of UIKit or AppKit.
     * 
     * @param contextSize The desired size of the context that will be passed to the drawing block.
     * It should be as close as possible to the maximumSize of the QLFileThumbnailRequest and it has to be greater than or equal to its minimumSize.
     * 
     * Ideally, at least either contextSize's width matches maximumSize's width or contextSize's height matches maximumSize's height.
     * The context size will be scaled to QLFileThumbnailRequest's scale value (if you pass (x, y), the size of the context will be (scale * x, scale * y)).
     * @param drawingBlock A block that draws the thumbnail into the current context which you can access via UIGraphicsGetCurrentContext() or [NSGraphicsContext currentContext].
     * It is a context of type CGBitmapContext, set up to be used with the coordinate system of UIKit or AppKit.
     * Return YES if the thumbnail was successfully drawn into the current context. Return NO otherwise.
     */
    @Generated
    @Selector("replyWithContextSize:currentContextDrawingBlock:")
    public static native QLThumbnailReply replyWithContextSizeCurrentContextDrawingBlock(@ByValue CGSize contextSize,
            @ObjCBlock(name = "call_replyWithContextSizeCurrentContextDrawingBlock") Block_replyWithContextSizeCurrentContextDrawingBlock drawingBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replyWithContextSizeCurrentContextDrawingBlock {
        @Generated
        boolean call_replyWithContextSizeCurrentContextDrawingBlock();
    }

    /**
     * You can create a reply with a drawing block that will draw into a given context with the coordinate system of Core Graphics.
     * 
     * @param contextSize The desired size of the context that will be passed to the drawing block.
     * It should be as close as possible to the maximumSize of the QLFileThumbnailRequest and it has to be greater than or equal to its minimumSize.
     * 
     * Ideally, at least either contextSize's width matches maximumSize's width or contextSize's height matches maximumSize's height.
     * The context size will be scaled to QLFileThumbnailRequest's scale value (if you pass (x, y), the size of the context will be (scale * x, scale * y)).
     * @param drawingBlock The thumbnail should be drawn into the context passed to this block. It is a context of type CGBitmapContext, set up to be used with the coordinate system of Core Graphics.
     * Return YES if the thumbnail was successfully drawn into the context. Return NO otherwise.
     */
    @Generated
    @Selector("replyWithContextSize:drawingBlock:")
    public static native QLThumbnailReply replyWithContextSizeDrawingBlock(@ByValue CGSize contextSize,
            @ObjCBlock(name = "call_replyWithContextSizeDrawingBlock") Block_replyWithContextSizeDrawingBlock drawingBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_replyWithContextSizeDrawingBlock {
        @Generated
        boolean call_replyWithContextSizeDrawingBlock(CGContextRef context);
    }

    /**
     * You can create a reply object with a file URL of an image that will be used as the thumbnail.
     * The image will be downscaled to fit the size of the QLFileThumbnailRequest if necessary.
     */
    @Generated
    @Selector("replyWithImageFileURL:")
    public static native QLThumbnailReply replyWithImageFileURL(NSURL fileURL);

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
}