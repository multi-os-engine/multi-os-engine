package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * A representation of an attribute implemented on a server cluster by an
 * MTRDeviceController. An attribute has an identifier and a value, and may or
 * may not be writable.
 * 
 * MTRServerAttribute's API can be accessed from any thread.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRServerAttribute extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRServerAttribute(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRServerAttribute alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRServerAttribute allocWithZone(VoidPtr zone);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("attributeID")
    @NotNull
    public native NSNumber attributeID();

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
    public native MTRServerAttribute init();

    /**
     * Initialize as a readonly attribute. The value is a data-value as documented
     * in MTRBaseDevice.h.
     * 
     * Will fail if the attribute ID is not valid per the Matter specification or
     * the attribute value is not a valid data-value.
     * 
     * requiredPrivilege is the privilege required to read the attribute. This
     * initializer may fail if the provided attributeID is a global attribute and
     * the provided requiredPrivilege value is not correct for that attribute ID.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initReadonlyAttributeWithID:initialValue:requiredPrivilege:")
    public native MTRServerAttribute initReadonlyAttributeWithIDInitialValueRequiredPrivilege(
            @NotNull NSNumber attributeID, @NotNull NSDictionary<String, ?> value, byte requiredPrivilege);

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

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("isWritable")
    public native boolean isWritable();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRServerAttribute new_objc();

    /**
     * Create an attribute description for a FeatureMap attribute with the provided
     * value (expected to be an unsigned integer representing the value of the
     * bitmap). This will automatically set requiredPrivilege to the right value
     * for FeatureMap.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Owned
    @Selector("newFeatureMapAttributeWithInitialValue:")
    @NotNull
    public static native MTRServerAttribute newFeatureMapAttributeWithInitialValue(@NotNull NSNumber value);

    /**
     * The privilege level necessary to read this attribute.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("requiredReadPrivilege")
    public native byte requiredReadPrivilege();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Change the value of the attribute to a new value. The value is a data-value as documented
     * in MTRBaseDevice.h.
     * 
     * Will fail if the attribute is not a valid data-value.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setValue:")
    public native boolean setValue(@NotNull NSDictionary<String, ?> value);

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

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("value")
    @NotNull
    public native NSDictionary<String, ?> value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}