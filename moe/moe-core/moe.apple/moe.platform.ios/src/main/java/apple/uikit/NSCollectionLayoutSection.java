package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.protocol.NSCollectionLayoutEnvironment;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
public class NSCollectionLayoutSection extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutSection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutSection alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutSection allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Supplementaries associated with the boundary edges of the section
     */
    @Generated
    @Selector("boundarySupplementaryItems")
    public native NSArray<? extends NSCollectionLayoutBoundarySupplementaryItem> boundarySupplementaryItems();

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
    @Selector("contentInsets")
    @ByValue
    public native NSDirectionalEdgeInsets contentInsets();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * decoration views anchored to the section's geometry (e.g. background decoration view)
     */
    @Generated
    @Selector("decorationItems")
    public native NSArray<? extends NSCollectionLayoutDecorationItem> decorationItems();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutSection init();

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
    @Selector("interGroupSpacing")
    @NFloat
    public native double interGroupSpacing();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutSection new_objc();

    /**
     * default is .none
     */
    @Generated
    @Selector("orthogonalScrollingBehavior")
    @NInt
    public native long orthogonalScrollingBehavior();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sectionWithGroup:")
    public static native NSCollectionLayoutSection sectionWithGroup(NSCollectionLayoutGroup group);

    /**
     * Supplementaries associated with the boundary edges of the section
     */
    @Generated
    @Selector("setBoundarySupplementaryItems:")
    public native void setBoundarySupplementaryItems(
            NSArray<? extends NSCollectionLayoutBoundarySupplementaryItem> value);

    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * decoration views anchored to the section's geometry (e.g. background decoration view)
     */
    @Generated
    @Selector("setDecorationItems:")
    public native void setDecorationItems(NSArray<? extends NSCollectionLayoutDecorationItem> value);

    @Generated
    @Selector("setInterGroupSpacing:")
    public native void setInterGroupSpacing(@NFloat double value);

    /**
     * default is .none
     */
    @Generated
    @Selector("setOrthogonalScrollingBehavior:")
    public native void setOrthogonalScrollingBehavior(@NInt long value);

    /**
     * by default, section supplementaries will follow any section-specific contentInsets
     */
    @Generated
    @Selector("setSupplementariesFollowContentInsets:")
    public native void setSupplementariesFollowContentInsets(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Called for each layout pass to allow modification of item properties right before they are displayed.
     */
    @Generated
    @Selector("setVisibleItemsInvalidationHandler:")
    public native void setVisibleItemsInvalidationHandler(
            @ObjCBlock(name = "call_setVisibleItemsInvalidationHandler") Block_setVisibleItemsInvalidationHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setVisibleItemsInvalidationHandler {
        @Generated
        void call_setVisibleItemsInvalidationHandler(NSArray<?> visibleItems, @ByValue CGPoint contentOffset,
                @Mapped(ObjCObjectMapper.class) Object layoutEnvironment);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * by default, section supplementaries will follow any section-specific contentInsets
     */
    @Generated
    @Selector("supplementariesFollowContentInsets")
    public native boolean supplementariesFollowContentInsets();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Called for each layout pass to allow modification of item properties right before they are displayed.
     */
    @Generated
    @Selector("visibleItemsInvalidationHandler")
    @ObjCBlock(name = "call_visibleItemsInvalidationHandler_ret")
    public native Block_visibleItemsInvalidationHandler_ret visibleItemsInvalidationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_visibleItemsInvalidationHandler_ret {
        @Generated
        void call_visibleItemsInvalidationHandler_ret(NSArray<?> visibleItems, @ByValue CGPoint contentOffset,
                @Mapped(ObjCObjectMapper.class) Object layoutEnvironment);
    }

    /**
     * default is UIContentInsetsReferenceAutomatic i.e. following the layout configuration's contentInsetsReference
     */
    @Generated
    @Selector("contentInsetsReference")
    @NInt
    public native long contentInsetsReference();

    /**
     * Creates a list section using the specified configuration. You should pass the layoutEnvironment from inside the UICollectionViewCompositionalLayoutSectionProvider.
     */
    @Generated
    @Selector("sectionWithListConfiguration:layoutEnvironment:")
    public static native NSCollectionLayoutSection sectionWithListConfigurationLayoutEnvironment(
            UICollectionLayoutListConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) NSCollectionLayoutEnvironment layoutEnvironment);

    /**
     * default is UIContentInsetsReferenceAutomatic i.e. following the layout configuration's contentInsetsReference
     */
    @Generated
    @Selector("setContentInsetsReference:")
    public native void setContentInsetsReference(@NInt long value);
}