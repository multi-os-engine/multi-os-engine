package apple.webkit;

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
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKContentRuleListStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKContentRuleListStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKContentRuleListStore alloc();

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
    @Selector("compileContentRuleListForIdentifier:encodedContentRuleList:completionHandler:")
    public native void compileContentRuleListForIdentifierEncodedContentRuleListCompletionHandler(String identifier,
            String encodedContentRuleList,
            @ObjCBlock(name = "call_compileContentRuleListForIdentifierEncodedContentRuleListCompletionHandler") Block_compileContentRuleListForIdentifierEncodedContentRuleListCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_compileContentRuleListForIdentifierEncodedContentRuleListCompletionHandler {
        @Generated
        void call_compileContentRuleListForIdentifierEncodedContentRuleListCompletionHandler(WKContentRuleList arg0,
                NSError arg1);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultStore")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultStore();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("getAvailableContentRuleListIdentifiers:")
    public native void getAvailableContentRuleListIdentifiers(
            @ObjCBlock(name = "call_getAvailableContentRuleListIdentifiers") Block_getAvailableContentRuleListIdentifiers completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAvailableContentRuleListIdentifiers {
        @Generated
        void call_getAvailableContentRuleListIdentifiers(NSArray<String> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKContentRuleListStore init();

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
    @Selector("lookUpContentRuleListForIdentifier:completionHandler:")
    public native void lookUpContentRuleListForIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_lookUpContentRuleListForIdentifierCompletionHandler") Block_lookUpContentRuleListForIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lookUpContentRuleListForIdentifierCompletionHandler {
        @Generated
        void call_lookUpContentRuleListForIdentifierCompletionHandler(WKContentRuleList arg0, NSError arg1);
    }

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("removeContentRuleListForIdentifier:completionHandler:")
    public native void removeContentRuleListForIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_removeContentRuleListForIdentifierCompletionHandler") Block_removeContentRuleListForIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeContentRuleListForIdentifierCompletionHandler {
        @Generated
        void call_removeContentRuleListForIdentifierCompletionHandler(NSError arg0);
    }

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
    @Selector("storeWithURL:")
    public static native WKContentRuleListStore storeWithURL(NSURL url);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}