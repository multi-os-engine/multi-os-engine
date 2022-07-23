package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSExpression;
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
 * Class that describes an attribute whose value should be derived from one or more
 * other properties and how that derivation should be done.
 * This is primarily intended to optimize fetch performance. Some use cases:
 * * creating a derived 'searchName' attribute that reflects a 'name' attribute with
 * case and diacritics stripped for more efficient comparisons during fetching
 * * creating a 'relationshipCount' attribute reflecting the number of objects in
 * a relationship and so avoid having to do a join during fetching
 * <p>
 * IMPORTANT: Derived attributes will be recomputed during save, recomputed values will not be reflected in a managed
 * object's property until after a save.
 * <p>
 * NOTE: Prior to macOS 10.16, iOS 14.0, tvOS 14.0, and watchOS 7.0 a refresh of the object is required after a save to
 * reflect recomputed values
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDerivedAttributeDescription extends NSAttributeDescription {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDerivedAttributeDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDerivedAttributeDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDerivedAttributeDescription allocWithZone(VoidPtr zone);

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

    /**
     * Instance of NSExpression that will be used to generate the derived data.
     * When using derived attributes in an SQL store, this expression should be
     * * a keypath expression (including @operation components)
     * * a function expression using one of the predefined functions defined
     * in NSExpression.h
     * Any keypaths used in the expression must be accessible from the entity on which
     * the derived attribute is specified.
     * If a store is added to a coordinator whose model contains derived attributes of
     * a type not supported by the store, the add will fail and an NSError will be returned.
     */
    @Generated
    @Selector("derivationExpression")
    public native NSExpression derivationExpression();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSDerivedAttributeDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDerivedAttributeDescription initWithCoder(NSCoder coder);

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
    public static native NSDerivedAttributeDescription new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Instance of NSExpression that will be used to generate the derived data.
     * When using derived attributes in an SQL store, this expression should be
     * * a keypath expression (including @operation components)
     * * a function expression using one of the predefined functions defined
     * in NSExpression.h
     * Any keypaths used in the expression must be accessible from the entity on which
     * the derived attribute is specified.
     * If a store is added to a coordinator whose model contains derived attributes of
     * a type not supported by the store, the add will fail and an NSError will be returned.
     */
    @Generated
    @Selector("setDerivationExpression:")
    public native void setDerivationExpression(NSExpression value);

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
