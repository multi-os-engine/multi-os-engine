package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVFragmentedAssetMinder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVFragmentedAssetMinder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addFragmentedAsset:
     * <p>
     * Adds a fragmented asset to the array of assets being minded.
     *
     * @param asset The fragmented asset to add to the minder.
     */
    @Generated
    @Selector("addFragmentedAsset:")
    public native void addFragmentedAsset(AVAsset asset);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVFragmentedAssetMinder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVFragmentedAssetMinder allocWithZone(VoidPtr zone);

    /**
     * [@property] assets
     * <p>
     * An NSArray of the AVFragmentedAsset objects being minded.
     */
    @Generated
    @Selector("assets")
    public native NSArray<? extends AVAsset> assets();

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * fragmentedAssetMinderWithAsset:mindingInterval:
     * <p>
     * Creates an AVFragmentedAssetMinder, adds the specified asset to it, and sets the mindingInterval to the specified
     * value.
     *
     * @param asset           An instance of AVFragmentedAsset to add to the AVFragmentedAssetMinder
     * @param mindingInterval The initial minding interval of the AVFragmentedAssetMinder.
     * @return A new instance of AVFragmentedAssetMinder.
     */
    @Generated
    @Selector("fragmentedAssetMinderWithAsset:mindingInterval:")
    public static native AVFragmentedAssetMinder fragmentedAssetMinderWithAssetMindingInterval(AVAsset asset,
            double mindingInterval);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVFragmentedAssetMinder init();

    /**
     * initWithAsset:mindingInterval:
     * <p>
     * Creates an AVFragmentedAssetMinder, adds the specified asset to it, and sets the mindingInterval to the specified
     * value.
     *
     * @param asset           An instance of AVFragmentedAsset to add to the AVFragmentedAssetMinder
     * @param mindingInterval The initial minding interval of the AVFragmentedAssetMinder.
     * @return A new instance of AVFragmentedAssetMinder.
     */
    @Generated
    @Selector("initWithAsset:mindingInterval:")
    public native AVFragmentedAssetMinder initWithAssetMindingInterval(AVAsset asset, double mindingInterval);

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

    /**
     * [@property] mindingInterval
     * <p>
     * An NSTimeInterval indicating how often a check for additional fragments should be performed. The default interval
     * is 10.0.
     */
    @Generated
    @Selector("mindingInterval")
    public native double mindingInterval();

    @Generated
    @Owned
    @Selector("new")
    public static native AVFragmentedAssetMinder new_objc();

    /**
     * removeFragmentedAsset:
     * <p>
     * Removes a fragmented asset from the array of assets being minded.
     *
     * @param asset The fragmented asset to remove from the minder.
     */
    @Generated
    @Selector("removeFragmentedAsset:")
    public native void removeFragmentedAsset(AVAsset asset);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] mindingInterval
     * <p>
     * An NSTimeInterval indicating how often a check for additional fragments should be performed. The default interval
     * is 10.0.
     */
    @Generated
    @Selector("setMindingInterval:")
    public native void setMindingInterval(double value);

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
