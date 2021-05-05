package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewCompositionalLayout extends UICollectionViewLayout {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewCompositionalLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewCompositionalLayout alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * Setting this property will invalidate the layout immediately to affect any changes
     *    Note: any changes made to properites directly will have no effect.
     */
    @Generated
    @Selector("configuration")
    public native UICollectionViewCompositionalLayoutConfiguration configuration();

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
    public native UICollectionViewCompositionalLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewCompositionalLayout initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithSection:")
    public native UICollectionViewCompositionalLayout initWithSection(NSCollectionLayoutSection section);

    @Generated
    @Selector("initWithSection:configuration:")
    public native UICollectionViewCompositionalLayout initWithSectionConfiguration(NSCollectionLayoutSection section,
            UICollectionViewCompositionalLayoutConfiguration configuration);

    @Generated
    @Selector("initWithSectionProvider:")
    public native UICollectionViewCompositionalLayout initWithSectionProvider(
            @ObjCBlock(name = "call_initWithSectionProvider") Block_initWithSectionProvider sectionProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSectionProvider {
        @Generated
        NSCollectionLayoutSection call_initWithSectionProvider(@NInt long arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("initWithSectionProvider:configuration:")
    public native UICollectionViewCompositionalLayout initWithSectionProviderConfiguration(
            @ObjCBlock(name = "call_initWithSectionProviderConfiguration") Block_initWithSectionProviderConfiguration sectionProvider,
            UICollectionViewCompositionalLayoutConfiguration configuration);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSectionProviderConfiguration {
        @Generated
        NSCollectionLayoutSection call_initWithSectionProviderConfiguration(@NInt long arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

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
    @Selector("invalidationContextClass")
    public static native Class invalidationContextClass();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layoutAttributesClass")
    public static native Class layoutAttributesClass();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Setting this property will invalidate the layout immediately to affect any changes
     *    Note: any changes made to properites directly will have no effect.
     */
    @Generated
    @Selector("setConfiguration:")
    public native void setConfiguration(UICollectionViewCompositionalLayoutConfiguration value);

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

    /**
     * Creates a compositional layout containing only list sections of the specified configuration.
     */
    @Generated
    @Selector("layoutWithListConfiguration:")
    public static native UICollectionViewCompositionalLayout layoutWithListConfiguration(
            UICollectionLayoutListConfiguration configuration);
}