package apple.fileprovider;

import apple.NSObject;
import apple.fileprovider.protocol.NSFileProviderItem;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLSessionTask;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addDomain:completionHandler:")
    public static native void addDomainCompletionHandler(NSFileProviderDomain domain,
            @ObjCBlock(name = "call_addDomainCompletionHandler") Block_addDomainCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addDomainCompletionHandler {
        @Generated
        void call_addDomainCompletionHandler(NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderManager alloc();

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
    @Selector("defaultManager")
    public static native NSFileProviderManager defaultManager();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("documentStorageURL")
    public native NSURL documentStorageURL();

    @Generated
    @Selector("getDomainsWithCompletionHandler:")
    public static native void getDomainsWithCompletionHandler(
            @ObjCBlock(name = "call_getDomainsWithCompletionHandler") Block_getDomainsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDomainsWithCompletionHandler {
        @Generated
        void call_getDomainsWithCompletionHandler(NSArray<? extends NSFileProviderDomain> domains, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSFileProviderManager init();

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
    @Selector("managerForDomain:")
    public static native NSFileProviderManager managerForDomain(NSFileProviderDomain domain);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);

    @Generated
    @Selector("providerIdentifier")
    public native String providerIdentifier();

    @Generated
    @Selector("registerURLSessionTask:forItemWithIdentifier:completionHandler:")
    public native void registerURLSessionTaskForItemWithIdentifierCompletionHandler(NSURLSessionTask task,
            String identifier,
            @ObjCBlock(name = "call_registerURLSessionTaskForItemWithIdentifierCompletionHandler") Block_registerURLSessionTaskForItemWithIdentifierCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerURLSessionTaskForItemWithIdentifierCompletionHandler {
        @Generated
        void call_registerURLSessionTaskForItemWithIdentifierCompletionHandler(NSError error);
    }

    @Generated
    @Selector("removeAllDomainsWithCompletionHandler:")
    public static native void removeAllDomainsWithCompletionHandler(
            @ObjCBlock(name = "call_removeAllDomainsWithCompletionHandler") Block_removeAllDomainsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllDomainsWithCompletionHandler {
        @Generated
        void call_removeAllDomainsWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("removeDomain:completionHandler:")
    public static native void removeDomainCompletionHandler(NSFileProviderDomain domain,
            @ObjCBlock(name = "call_removeDomainCompletionHandler") Block_removeDomainCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDomainCompletionHandler {
        @Generated
        void call_removeDomainCompletionHandler(NSError error);
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
    @Selector("signalEnumeratorForContainerItemIdentifier:completionHandler:")
    public native void signalEnumeratorForContainerItemIdentifierCompletionHandler(String containerItemIdentifier,
            @ObjCBlock(name = "call_signalEnumeratorForContainerItemIdentifierCompletionHandler") Block_signalEnumeratorForContainerItemIdentifierCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_signalEnumeratorForContainerItemIdentifierCompletionHandler {
        @Generated
        void call_signalEnumeratorForContainerItemIdentifierCompletionHandler(NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURLWithMetadataError(NSURL placeholderURL,
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem metadata,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}