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

/**
 * This object holds all information about the interface of an exported or imported object. This includes: what messages are allowed, what kinds of objects are allowed as arguments, what the signature of any reply blocks are, and any information about additional proxy objects.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXPCInterface extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSXPCInterface(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSXPCInterface alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSXPCInterface allocWithZone(VoidPtr zone);

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
    @Selector("classesForSelector:argumentIndex:ofReply:")
    public native NSSet<? extends Class> classesForSelectorArgumentIndexOfReply(SEL sel, @NUInt long arg,
            boolean ofReply);

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
    public native NSXPCInterface init();

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
    @Selector("interfaceForSelector:argumentIndex:ofReply:")
    public native NSXPCInterface interfaceForSelectorArgumentIndexOfReply(SEL sel, @NUInt long arg, boolean ofReply);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSXPCInterface new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * If an argument to a method in your protocol is a collection class (for example, NSArray or NSDictionary), then the interface must be configured with the set of expected classes contained inside of the collection. The classes argument to this method should be an NSSet containing Class objects, like [MyObject class]. The selector argument specifies which method in the protocol is being configured. The argumentIndex parameter specifies which argument of the method the NSSet applies to. If the NSSet is for an argument of the reply block in the method, pass YES for the ofReply: argument. The first argument is index 0 for both the method and the reply block.
     * If the expected classes are all property list types, calling this method is optional (property list types are automatically whitelisted for collection objects). You may use this method to further restrict the set of allowed classes.
     */
    @Generated
    @Selector("setClasses:forSelector:argumentIndex:ofReply:")
    public native void setClassesForSelectorArgumentIndexOfReply(NSSet<? extends Class> classes, SEL sel,
            @NUInt long arg, boolean ofReply);

    /**
     * If an argument to a method in your protocol should be sent as a proxy object instead of by copy, then the interface must be configured with the interface of that new proxy object. If the proxy object is to be an argument of the reply block, pass YES for ofReply. The first argument is index 0 for both the method and the reply block.
     */
    @Generated
    @Selector("setInterface:forSelector:argumentIndex:ofReply:")
    public native void setInterfaceForSelectorArgumentIndexOfReply(NSXPCInterface ifc, SEL sel, @NUInt long arg,
            boolean ofReply);

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
