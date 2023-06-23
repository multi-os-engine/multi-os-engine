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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVFragmentedMovieMinder
 * 
 * A class that periodically checks whether additional movie fragments have been appended to fragmented movie files.
 * 
 * AVFragmentedMovieMinder is identical to AVFragmentedAssetMinder except that it's capable of minding only assets of
 * class AVFragmentedMovie.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVFragmentedMovieMinder extends AVFragmentedAssetMinder {
    static {
        NatJ.register();
    }

    @Generated
    protected AVFragmentedMovieMinder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addFragmentedMovie:
     * 
     * Adds a fragmented movie to the array of movies being minded.
     * 
     * @param movie
     *              The fragmented movie to add to the minder.
     */
    @Generated
    @Selector("addFragmentedMovie:")
    public native void addFragmentedMovie(@NotNull AVFragmentedMovie movie);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVFragmentedMovieMinder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVFragmentedMovieMinder allocWithZone(VoidPtr zone);

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
    @Selector("fragmentedAssetMinderWithAsset:mindingInterval:")
    public static native AVFragmentedMovieMinder fragmentedAssetMinderWithAssetMindingInterval(@NotNull AVAsset asset,
            double mindingInterval);

    /**
     * fragmentedMovieMinderWithMovie:mindingInterval:
     * 
     * Creates an AVFragmentedMovieMinder, adds the specified movie to it, and sets the mindingInterval to the specified
     * value.
     * 
     * @param movie
     *                        An instance of AVFragmentedMovie to add to the AVFragmentedMovieMinder
     * @param mindingInterval
     *                        The initial minding interval of the AVFragmentedMovieMinder.
     * @return A new instance of AVFragmentedMovieMinder.
     */
    @Generated
    @Selector("fragmentedMovieMinderWithMovie:mindingInterval:")
    public static native AVFragmentedMovieMinder fragmentedMovieMinderWithMovieMindingInterval(
            @NotNull AVFragmentedMovie movie, double mindingInterval);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVFragmentedMovieMinder init();

    @Generated
    @Selector("initWithAsset:mindingInterval:")
    public native AVFragmentedMovieMinder initWithAssetMindingInterval(@NotNull AVAsset asset, double mindingInterval);

    /**
     * initWithMovie:mindingInterval:
     * 
     * Creates an AVFragmentedMovieMinder, adds the specified movie to it, and sets the mindingInterval to the specified
     * value.
     * 
     * @param movie
     *                        An instance of AVFragmentedMovie to add to the AVFragmentedMovieMinder
     * @param mindingInterval
     *                        The initial minding interval of the AVFragmentedMovieMinder.
     * @return A new instance of AVFragmentedMovieMinder.
     */
    @Generated
    @Selector("initWithMovie:mindingInterval:")
    public native AVFragmentedMovieMinder initWithMovieMindingInterval(@NotNull AVFragmentedMovie movie,
            double mindingInterval);

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

    /**
     * [@property] mindingInterval
     * 
     * An NSTimeInterval indicating how often a check for additional movie fragments should be performed. The default
     * interval is 10.0.
     */
    @Generated
    @Selector("mindingInterval")
    public native double mindingInterval();

    /**
     * [@property] movies
     * 
     * An NSArray of the AVFragmentedMovie objects being minded.
     */
    @NotNull
    @Generated
    @Selector("movies")
    public native NSArray<? extends AVFragmentedMovie> movies();

    @Generated
    @Owned
    @Selector("new")
    public static native AVFragmentedMovieMinder new_objc();

    /**
     * removeFragmentedMovie:
     * 
     * Removes a fragmented movie from the array of movies being minded.
     * 
     * @param movie
     *              The fragmented movie to remove from the minder.
     */
    @Generated
    @Selector("removeFragmentedMovie:")
    public native void removeFragmentedMovie(@NotNull AVFragmentedMovie movie);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] mindingInterval
     * 
     * An NSTimeInterval indicating how often a check for additional movie fragments should be performed. The default
     * interval is 10.0.
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
