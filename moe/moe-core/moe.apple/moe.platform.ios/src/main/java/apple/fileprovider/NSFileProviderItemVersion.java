package apple.fileprovider;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderItemVersion extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderItemVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderItemVersion alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSFileProviderItemVersion allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Version component exposed by the system to denote a state that predates a version returned by the provider.
     * 
     * In case an item was created by calling `createItemBasedOnTemplate` and the item returned by the provider in
     * the completion handler of that call didn't match the item template passed by the system, the system will try
     * to apply the changes asked by the provider to the disk. However, the system may detect conflicts when applying
     * those content back to the disk, which will cause the system to send the new disk version to the extension,
     * by calling `modifyItem` or `deleteItemWithIdentifier` with a `baseVersion` that represents the item as passed in
     * the template of the `createItemBasedOnTemplate` call.
     * 
     * This constant is used by the system to represent that specific version that was communicated by the system to
     * the extension but does not have a corresponding version assigned by the extension.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("beforeFirstSyncComponent")
    public static native NSData beforeFirstSyncComponent();

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

    /**
     * Version data for the content of the file.
     * 
     * This property is used by the system for two purposes: if the contentVersion changes,
     * - the system assumes that the contents have changed and will trigger a redownload if
     * necessary. The exception to this is the case where the extension accepts a content
     * sent by the system when replying to a createItemBasedOnTemplate or modifyItem call
     * with shouldFetchContent set to NO.
     * - the thumbnail cache is invalidated
     * 
     * Note that the resource fork of the file is considered content, so this version
     * data should change when either the data fork or the resource fork changes.
     */
    @NotNull
    @Generated
    @Selector("contentVersion")
    public native NSData contentVersion();

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
    public native NSFileProviderItemVersion init();

    /**
     * Items versions have two distinct components, one for the file contents and one
     * for metadata.
     * 
     * Components are limited to 128 bytes in size.
     */
    @Generated
    @Selector("initWithContentVersion:metadataVersion:")
    public native NSFileProviderItemVersion initWithContentVersionMetadataVersion(@NotNull NSData contentVersion,
            @NotNull NSData metadataVersion);

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

    /**
     * Version data for the metadata of the item, i.e everything but the data fork and
     * the resource fork.
     * 
     * The system will store this version, but otherwise ignore it:
     * - metadata changes on an item will be applied even if the metadataVersion remains unchanged
     * - if the metadata version changes without any corresponding observable changes in the metadata returned
     * to the system, the system will simply store the updated metadata version (to return it as the base version
     * of a possible future change request).
     */
    @NotNull
    @Generated
    @Selector("metadataVersion")
    public native NSData metadataVersion();

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileProviderItemVersion new_objc();

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