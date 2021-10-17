package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewSupplementaryRegistration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewSupplementaryRegistration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewSupplementaryRegistration alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewSupplementaryRegistration allocWithZone(VoidPtr zone);

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
    @Selector("configurationHandler")
    @ObjCBlock(name = "call_configurationHandler_ret")
    public native Block_configurationHandler_ret configurationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationHandler_ret {
        @Generated
        void call_configurationHandler_ret(UICollectionReusableView supplementaryView, String elementKind,
                NSIndexPath indexPath);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("elementKind")
    public native String elementKind();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UICollectionViewSupplementaryRegistration init();

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
    public static native UICollectionViewSupplementaryRegistration new_objc();

    @Generated
    @Selector("registrationWithSupplementaryClass:elementKind:configurationHandler:")
    public static native UICollectionViewSupplementaryRegistration registrationWithSupplementaryClassElementKindConfigurationHandler(
            Class supplementaryClass, String elementKind,
            @ObjCBlock(name = "call_registrationWithSupplementaryClassElementKindConfigurationHandler") Block_registrationWithSupplementaryClassElementKindConfigurationHandler configurationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registrationWithSupplementaryClassElementKindConfigurationHandler {
        @Generated
        void call_registrationWithSupplementaryClassElementKindConfigurationHandler(
                UICollectionReusableView supplementaryView, String elementKind, NSIndexPath indexPath);
    }

    @Generated
    @Selector("registrationWithSupplementaryNib:elementKind:configurationHandler:")
    public static native UICollectionViewSupplementaryRegistration registrationWithSupplementaryNibElementKindConfigurationHandler(
            UINib supplementaryNib, String elementKind,
            @ObjCBlock(name = "call_registrationWithSupplementaryNibElementKindConfigurationHandler") Block_registrationWithSupplementaryNibElementKindConfigurationHandler configurationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registrationWithSupplementaryNibElementKindConfigurationHandler {
        @Generated
        void call_registrationWithSupplementaryNibElementKindConfigurationHandler(
                UICollectionReusableView supplementaryView, String elementKind, NSIndexPath indexPath);
    }

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
    @Selector("supplementaryClass")
    public native Class supplementaryClass();

    @Generated
    @Selector("supplementaryNib")
    public native UINib supplementaryNib();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
