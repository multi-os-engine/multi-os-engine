package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMTagCollectionRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVVideoOutputSpecification
 * 
 * AVVideoOutputSpecification offers a way to package CMTagCollections together with pixel buffer attributes. Allowing
 * for direct association between pixel buffer attributes and specific tag collections, as well as default pixel buffer
 * attributes which can be associated with all tag collections which do not have a specified mapping.
 * 
 * For more information about working with CMTagCollections and CMTags first look at <CoreMedia/CMTagCollection.h>
 * 
 * API-Since: 17.2
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoOutputSpecification extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoOutputSpecification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoOutputSpecification alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVVideoOutputSpecification allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] defaultPixelBufferAttributes
     * 
     * The default client requirements for CVPixelBuffers related to all tag collections not explicitly set with
     * setOutputPixelBufferAttributes:forTagCollection:, expressed using the constants in <CoreVideo/CVPixelBuffer.h>.
     * 
     * NSDictionary where keys are of type NSString, values should match the type specified by the corresponding keys
     * documentation in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("defaultPixelBufferAttributes")
    @Nullable
    public native NSDictionary<String, ?> defaultPixelBufferAttributes();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVVideoOutputSpecification init();

    /**
     * initWithTagCollections:
     * 
     * Creates an instance of AVVideoOutputSpecification initialized with the specified tag collections.
     * 
     * This method throws an exception for the following reasons:
     * - tagCollections is nil or has a count of 0.
     * - tagCollections contains elements that are not of the type CMTagCollection.
     * 
     * @param tagCollections
     *                       Expects a non-empty array of CMTagCollections. Tag collections are given priority based on
     *                       their position in the array, where position i take priority over position i+1.
     */
    @Generated
    @Selector("initWithTagCollections:")
    public native AVVideoOutputSpecification initWithTagCollections(@NotNull NSArray<?> tagCollections);

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
    public static native AVVideoOutputSpecification new_objc();

    /**
     * [@property] preferredTagCollections
     * 
     * Tag collections held by AVTaggedVideoOutputSpecification.
     * 
     * Returns an array of CMTagCollections.
     */
    @Generated
    @Selector("preferredTagCollections")
    @NotNull
    public native NSArray<?> preferredTagCollections();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] defaultPixelBufferAttributes
     * 
     * The default client requirements for CVPixelBuffers related to all tag collections not explicitly set with
     * setOutputPixelBufferAttributes:forTagCollection:, expressed using the constants in <CoreVideo/CVPixelBuffer.h>.
     * 
     * NSDictionary where keys are of type NSString, values should match the type specified by the corresponding keys
     * documentation in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("setDefaultPixelBufferAttributes:")
    public native void setDefaultPixelBufferAttributes(@Nullable NSDictionary<String, ?> value);

    /**
     * setOutputPixelBufferAttributes:forTagCollection:
     * 
     * Specifies a mapping between a tag collection and a set of pixel buffer attributes.
     * 
     * If this method is called twice on the same tag collection, the first requested pixel buffer attributes will be
     * overridden.
     * 
     * @param pixelBufferAttributes
     *                              The client requirements for CVPixelBuffers related to the tags in tagCollection,
     *                              expressed using the constants in <CoreVideo/CVPixelBuffer.h>.
     * @param tagCollection
     *                              A single tag collection for which these pixel buffer attributes should map to.
     */
    @Generated
    @Selector("setOutputPixelBufferAttributes:forTagCollection:")
    public native void setOutputPixelBufferAttributesForTagCollection(
            @Nullable NSDictionary<String, ?> pixelBufferAttributes, @NotNull CMTagCollectionRef tagCollection);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}