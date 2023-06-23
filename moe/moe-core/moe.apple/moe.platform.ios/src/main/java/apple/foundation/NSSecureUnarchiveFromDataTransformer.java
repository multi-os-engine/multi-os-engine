package apple.foundation;

import apple.NSObject;
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
 * A value transformer which transforms values to and from \c NSData by archiving and unarchiving using secure coding.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSecureUnarchiveFromDataTransformer extends NSValueTransformer {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSecureUnarchiveFromDataTransformer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSecureUnarchiveFromDataTransformer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSSecureUnarchiveFromDataTransformer allocWithZone(VoidPtr zone);

    /**
     * The list of allowable classes which the top-level object in the archive must conform to on encoding and decoding.
     * 
     * Returns the result of \c +transformedValueClass if not \c Nil; otherwise, currently returns \c NSArray, \c
     * NSDictionary, \c NSSet, \c NSString, \c NSNumber, \c NSDate, \c NSData, \c NSURL, \c NSUUID, and \c NSNull.
     * 
     * Can be overridden by subclasses to provide an expanded or different set of allowed transformation classes.
     */
    @NotNull
    @Generated
    @Selector("allowedTopLevelClasses")
    public static native NSArray<? extends Class> allowedTopLevelClasses();

    @Generated
    @Selector("allowsReverseTransformation")
    public static native boolean allowsReverseTransformation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    public native NSSecureUnarchiveFromDataTransformer init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native NSSecureUnarchiveFromDataTransformer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setValueTransformer:forName:")
    public static native void setValueTransformerForName(@Nullable NSValueTransformer transformer,
            @NotNull String name);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("transformedValueClass")
    public static native Class transformedValueClass();

    @Nullable
    @Generated
    @Selector("valueTransformerForName:")
    public static native NSValueTransformer valueTransformerForName(@NotNull String name);

    @NotNull
    @Generated
    @Selector("valueTransformerNames")
    public static native NSArray<String> valueTransformerNames();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
