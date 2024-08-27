package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRAttributeReport extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRAttributeReport(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRAttributeReport alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRAttributeReport allocWithZone(VoidPtr zone);

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

    /**
     * If this specific path resulted in an error, the error (in the
     * MTRInteractionErrorDomain or MTRErrorDomain) that corresponds to this
     * path.
     */
    @Generated
    @Selector("error")
    @Nullable
    public native NSError error();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRAttributeReport init();

    /**
     * Initialize an MTRAttributeReport with a response-value dictionary of the sort
     * that MTRDeviceResponseHandler would receive.
     * 
     * Will return nil and hand out an error if the response-value dictionary is not
     * an attribute response.
     * 
     * Will set the value property to nil and the error property to non-nil, even if
     * the schema for the value is not known, if the response-value is an error, not
     * data.
     * 
     * Will return nil and hand out an error if the response-value is data in the
     * following cases:
     * 
     * * The response is for a cluster/attribute combination for which the schema is
     * unknown and hence the type of the data is not known.
     * * The data does not match the known schema.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTRAttributeReport initWithResponseValueError(@NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    public static native MTRAttributeReport new_objc();

    @Generated
    @Selector("path")
    @NotNull
    public native MTRAttributePath path();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * value will be nil in the following cases:
     * 
     * * There was an error. In this case, "error" will not be nil.
     * * The attribute is nullable and the value of the attribute is null.
     * 
     * If value is not nil, the actual type of value will depend on the
     * schema-defined (typically defiend in the Matter specification) type of the
     * attribute as follows:
     * 
     * * list: NSArray of whatever type the list entries are.
     * * struct: The corresponding structure interface defined by Matter.framework
     * * octet string: NSData
     * * string: NSString
     * * discrete/analog types: NSNumber
     * 
     * Derived types (in the Matter specification sense) are represented the same as
     * the base type, except for "string" (which is a derived type of "octet string"
     * in the specification).
     */
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}