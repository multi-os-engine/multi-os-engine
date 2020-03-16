package apple.quicklookthumbnailing;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuickLookThumbnailing")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class QLThumbnailGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected QLThumbnailGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native QLThumbnailGenerator alloc();

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
    @Selector("cancelRequest:")
    public native void cancelRequest(QLThumbnailGenerationRequest request);

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
    @Selector("generateBestRepresentationForRequest:completionHandler:")
    public native void generateBestRepresentationForRequestCompletionHandler(QLThumbnailGenerationRequest request,
            @ObjCBlock(name = "call_generateBestRepresentationForRequestCompletionHandler") Block_generateBestRepresentationForRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateBestRepresentationForRequestCompletionHandler {
        @Generated
        void call_generateBestRepresentationForRequestCompletionHandler(QLThumbnailRepresentation arg0, NSError arg1);
    }

    @Generated
    @Selector("generateRepresentationsForRequest:updateHandler:")
    public native void generateRepresentationsForRequestUpdateHandler(QLThumbnailGenerationRequest request,
            @ObjCBlock(name = "call_generateRepresentationsForRequestUpdateHandler") Block_generateRepresentationsForRequestUpdateHandler updateHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateRepresentationsForRequestUpdateHandler {
        @Generated
        void call_generateRepresentationsForRequestUpdateHandler(QLThumbnailRepresentation arg0, @NInt long arg1,
                NSError arg2);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native QLThumbnailGenerator init();

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
    @Selector("saveBestRepresentationForRequest:toFileAtURL:withContentType:completionHandler:")
    public native void saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler(
            QLThumbnailGenerationRequest request, NSURL fileURL, String contentType,
            @ObjCBlock(name = "call_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler") Block_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler {
        @Generated
        void call_saveBestRepresentationForRequestToFileAtURLWithContentTypeCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sharedGenerator")
    public static native QLThumbnailGenerator sharedGenerator();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}