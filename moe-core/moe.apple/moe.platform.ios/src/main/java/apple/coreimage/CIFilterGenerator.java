package apple.coreimage;

import apple.NSObject;
import apple.coreimage.protocol.CIFilterConstructor;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The goal is to CIFilters to be connected and form a single CIFilter for ease of reusability.
 * 
 * The CIFilterGenerator allows developers to create complex effects built out of one or more CIFilter and reuse them
 * without changing code. The resulting CIFilterGenerator can be written into a file for which we introduce a new file
 * type (extension). A CIFilterGenerator can be created from the API or more conveniently through an editor view that we
 * provide.
 * CIFilterGenerator files can be put into the Image Units folders on the system and they will be loaded when the user
 * invokes one of the loadPlugIns methods. They will be registered by their filename or if present by an attribute in
 * its description.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIFilterGenerator extends NSObject implements NSSecureCoding, NSCopying, CIFilterConstructor {
    static {
        NatJ.register();
    }

    @Generated
    protected CIFilterGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIFilterGenerator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CIFilterGenerator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * Retrieve or Set the class attributes that will be used to register the filter using the registerFilterName
     * method.
     * Make sure you set the class attributes before using the registerFilterName method.
     * See CIFilter for a description of the classAttributes that are needed to register a filter.
     */
    @Generated
    @Selector("classAttributes")
    @NotNull
    public native NSDictionary<?, ?> classAttributes();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Connect two objects into the filter chain.
     * 
     * This method connects two object in the filter chain. For instance you can connect the outputImage key of a
     * CISepiaTone filter object to the inputImage key of another CIFilter.
     * 
     * @param sourceObject A CIFilter, CIImage, NSString, or NSURL describing the path to the image
     * @param sourceKey    For KVC access to the source object. Can be nil which means that the source object will be
     *                     used directly.
     * @param targetObject The object that you link the source object to.
     * @param targetKey    The key that you assign the source object to.
     */
    @Generated
    @Selector("connectObject:withKey:toObject:withKey:")
    public native void connectObjectWithKeyToObjectWithKey(@Mapped(ObjCObjectMapper.class) @NotNull Object sourceObject,
            @Nullable String sourceKey, @Mapped(ObjCObjectMapper.class) @NotNull Object targetObject,
            @NotNull String targetKey);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Removes the connection between two objects in the filter chain.
     * 
     * Use this method to disconnect two objects that you connected using the connectObject:withKey:toObject:withKey:
     * method.
     * 
     * @param sourceObject A CIFilter or CIImage or an NSString or an NSURL describing the path to the image
     * @param sourceKey    For KVC access to the source object. Can be nil which means that the source object will be
     *                     used directly.
     * @param targetObject The object that you linked the source object to.
     * @param targetKey    The key that you assigned the source object to.
     */
    @Generated
    @Selector("disconnectObject:withKey:toObject:withKey:")
    public native void disconnectObjectWithKeyToObjectWithKey(
            @Mapped(ObjCObjectMapper.class) @NotNull Object sourceObject, @NotNull String sourceKey,
            @Mapped(ObjCObjectMapper.class) @NotNull Object targetObject, @NotNull String targetKey);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * This methods allows you to export an input or output key of an object in the filter chain to be available through
     * the inputKeys or outputKeys API when converted into a CIFilter
     * 
     * When you create a CIFilter from the CIFilterGenerator, you might want the client of the filter being able to set
     * some of the paramters of the filter chain. To do so these parameters have to be exported as keys much like the
     * inputKeys and outputKeys of all CIFilters.
     * 
     * @param key             The key path that is to be exported from the target object (eg. inputImage)
     * @param targetObject    The object of which the key is to be exported (eg the filter).
     * @param exportedKeyName The name under which you want the new key to be available. This parameter can be nil in
     *                        which case the original key name will be used. This name has to be unique. If a key being
     *                        exported is an inputKey of the filter it will be exported as an input key and the other
     *                        way around for output keys.
     */
    @Generated
    @Selector("exportKey:fromObject:withName:")
    public native void exportKeyFromObjectWithName(@NotNull String key,
            @Mapped(ObjCObjectMapper.class) @NotNull Object targetObject, @Nullable String exportedKeyName);

    /**
     * An array of the exported keys.
     * 
     * Use this method to get an NSArray of all the keys that you have exported using exportKey:fromObject:withName: or
     * that were exported before written to a file from which you read the filter chain.
     * 
     * @return An array of dictionaries that describe the exported key and target object. See CIExportedKey,
     *         CIExportedKeyTargetObject and CIExportedKeyName for keys used in the dictionary.
     */
    @Generated
    @Selector("exportedKeys")
    @NotNull
    public native NSDictionary<?, ?> exportedKeys();

    /**
     * Create a CIFilter object based on this filter chain.
     * 
     * This method creates a CIFilter from the filter chain where the topology of the chain is immutable, meaning that
     * changes to the filter chain will not be reflected in the filter. The filter will have the input and output keys
     * that were exported as described above.
     */
    @Generated
    @Selector("filter")
    @NotNull
    public native CIFilter filter();

    /**
     * This creates an empty CIFilterGenerator in which you connect filters and images.
     */
    @Generated
    @Selector("filterGenerator")
    @NotNull
    public static native CIFilterGenerator filterGenerator();

    /**
     * Create a CIFilterGenerator with the contents of the file.
     * 
     * @return CIFilterGenerator object. If the file could not be read it returns nil.
     */
    @Generated
    @Selector("filterGeneratorWithContentsOfURL:")
    @Nullable
    public static native CIFilterGenerator filterGeneratorWithContentsOfURL(@NotNull NSURL aURL);

    @Generated
    @Selector("filterWithName:")
    @Nullable
    public native CIFilter filterWithName(@NotNull String name);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CIFilterGenerator init();

    @Generated
    @Selector("initWithCoder:")
    public native CIFilterGenerator initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a CIFilterGenerator with the contents of the file.
     * 
     * @return CIFilterGenerator object. If the file could not be read it returns nil.
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native CIFilterGenerator initWithContentsOfURL(@NotNull NSURL aURL);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIFilterGenerator new_objc();

    /**
     * Register the resulting filter of the chain in the CIFilter repository.
     * 
     * This method allows you to register the filter chain as a named filter in the filter repository. You can then
     * create a CIFilter object from it using the filterWithName: method. Make sure you set the class attributes first -
     * see CIFilter for a description of the classAttributes that are needed to register a filter.
     * When registering Core Image automatically adds the kCIFilterGeneratorCategory to the filters categories. The
     * kCIFilterGeneratorCategory is purely for identification purpose and will not be exposed in the filter browser as
     * a seperate category.
     * 
     * @param name The name under which the filter will be registered. This name has to be unique.
     */
    @Generated
    @Selector("registerFilterName:")
    public native void registerFilterName(@NotNull String name);

    /**
     * Removes a key that was exported before using exportKey:fromObject:withName:
     * 
     * Use this method when you want to remove a prior exported key. It will not show up under inputKeys or outputKeys
     * anymore.
     * 
     * @param exportedKeyName Name of the key that was exported.
     */
    @Generated
    @Selector("removeExportedKey:")
    public native void removeExportedKey(@NotNull String exportedKeyName);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set a new dictionary of attributes for an exported key.
     * 
     * By default, the exported key inherits the attributes from its original key and target object. Use this method to
     * for instance change the default value or lower the maximum allowed value.
     */
    @Generated
    @Selector("setAttributes:forExportedKey:")
    public native void setAttributesForExportedKey(@NotNull NSDictionary<?, ?> attributes, @NotNull String key);

    /**
     * Retrieve or Set the class attributes that will be used to register the filter using the registerFilterName
     * method.
     * Make sure you set the class attributes before using the registerFilterName method.
     * See CIFilter for a description of the classAttributes that are needed to register a filter.
     */
    @Generated
    @Selector("setClassAttributes:")
    public native void setClassAttributes(@NotNull NSDictionary<?, ?> value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Write the CIFilterGenerator into a file
     * 
     * @return Returns true when the chain with written our succesfully
     */
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(@NotNull NSURL aURL, boolean flag);
}