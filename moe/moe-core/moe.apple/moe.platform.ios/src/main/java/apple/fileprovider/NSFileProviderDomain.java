package apple.fileprovider;

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

/**
 * File provider domain.
 * <p>
 * A file provider domain can be used to represent accounts or different locations
 * exposed within a given file provider.
 * <p>
 * Domains can be registered to the system using
 * [@c] -[NSFileProviderMananger addDomain:completionHandler:]
 * <p>
 * By default, a file provider extension does not have any domain.
 * <p>
 * On the extension side, a separate instance of NSFileProviderExtension will be
 * created for each @c NSFileProviderDomain registered.  In that case, the
 * [@c] NSFileProviderExtension.domain properties will indicate which domain the
 * NSFileProviderExtension belongs to (or nil if none).
 * <p>
 * All the files on disk belonging to the same domain must be grouped inside a
 * common directory. That directory path is indicated by the
 * [@p] pathRelativeToDocumentStorage property.
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderDomain extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderDomain(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderDomain alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSFileProviderDomain allocWithZone(VoidPtr zone);

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

    /**
     * The display name shown by the system to represent this domain.
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier - as provided by the file provider extension.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSFileProviderDomain init();

    /**
     * Initialize a new NSFileProviderDomain
     * <p>
     * The file provider extension implementation can pick any @c identifier as it sees
     * fit to identify the group of items. The identifier must not contain any characters from this set: [/:]
     * <p>
     * [@c] NSFileProviderExtension.documentStorageURL.
     *
     * @param displayName                   a user visible string representing the group of items the
     *                                      file provider extension is using.
     * @param pathRelativeToDocumentStorage a path relative to
     */
    @Generated
    @Selector("initWithIdentifier:displayName:pathRelativeToDocumentStorage:")
    public native NSFileProviderDomain initWithIdentifierDisplayNamePathRelativeToDocumentStorage(String identifier,
            String displayName, String pathRelativeToDocumentStorage);

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
    public static native NSFileProviderDomain new_objc();

    /**
     * The path relative to the document storage of the file provider extension.
     * Files belonging to this domains should be stored under this path.
     */
    @Generated
    @Selector("pathRelativeToDocumentStorage")
    public native String pathRelativeToDocumentStorage();

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
