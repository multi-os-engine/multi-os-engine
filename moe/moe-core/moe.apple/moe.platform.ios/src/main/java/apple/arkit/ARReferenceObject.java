package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A reference object to track in the scene.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARReferenceObject extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected ARReferenceObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARReferenceObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARReferenceObject allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Exports the object as an archive at the given URL.
     * 
     * The URL path should use ARReferenceObjectArchiveExtension (.arobject) for the file extension.
     * If serialization across devices is desired, NSKeyedArchiver should be used instead.
     * 
     * @param url          The URL at which to write the exported object.
     * @param previewImage An optional preview image to include in the archive.
     * @param error        The error to populate if the write is not successful.
     * @return YES if the location is written successfully, otherwise NO.
     */
    @Generated
    @Selector("exportObjectToURL:previewImage:error:")
    public native boolean exportObjectToURLPreviewImageError(NSURL url, UIImage previewImage,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARReferenceObject init();

    /**
     * Initializes a new reference object with the contents of an archive at the specified URL.
     * 
     * @param url   The URL from which to read data (.arobject archive).
     * @param error The error to populate if the object could not be initialized.
     */
    @Generated
    @Selector("initWithArchiveURL:error:")
    public native ARReferenceObject initWithArchiveURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithCoder:")
    public native ARReferenceObject initWithCoder(NSCoder coder);

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
     * An optional name used to identify the object.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native ARReferenceObject new_objc();

    /**
     * The feature points of the object.
     */
    @Generated
    @Selector("rawFeaturePoints")
    public native ARPointCloud rawFeaturePoints();

    /**
     * Returns a new reference object by aligning and merging the provided object with this reference.
     * 
     * This can be used to combine multiple scans of the same object for detection in different conditions. The object
     * being merged
     * must share similar feature points for the merge to succeed.
     * 
     * @param object The reference object to align and merge.
     * @param error  The error to populate if the merge is not successful.
     * @return A new reference object combining features of both scans or nil if the merge was not successful.
     */
    @Generated
    @Selector("referenceObjectByMergingObject:error:")
    public native ARReferenceObject referenceObjectByMergingObjectError(ARReferenceObject object,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the set of ARReferenceObjects in the specified resource group and bundle.
     * 
     * @param name   The name of the resource group.
     * @param bundle The bundle containing the image file or asset catalog. Specify nil to search the app’s main bundle.
     * @return The set of reference objects or nil on error.
     */
    @Generated
    @Selector("referenceObjectsInGroupNamed:bundle:")
    public static native NSSet<? extends ARReferenceObject> referenceObjectsInGroupNamedBundle(String name,
            NSBundle bundle);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The AR resource group name for this object.
     * 
     * If this object was loaded via an AR resource group in the Xcode asset catalogue this property will have the name
     * of the resource group,
     * else be set to nil.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("resourceGroupName")
    public native String resourceGroupName();

    /**
     * An optional name used to identify the object.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
