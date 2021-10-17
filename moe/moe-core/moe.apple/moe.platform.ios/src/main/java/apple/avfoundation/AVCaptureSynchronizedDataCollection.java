package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureSynchronizedDataCollection
 * <p>
 * A collection of AVCaptureSynchronizedData objects.
 * <p>
 * AVCaptureDataOutputSynchronizer's -dataOutputSynchronizer:didOutputSynchronizedDataCollection: delegate method delivers a collection of AVCaptureSynchronizedData objects which can be iterated by use AVCaptureOutput. AVCaptureSynchronizedDataCollection supports object subscripting and fast enumeration of the data outputs as keys.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSynchronizedDataCollection extends NSObject implements NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSynchronizedDataCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSynchronizedDataCollection alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureSynchronizedDataCollection allocWithZone(VoidPtr zone);

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
     * [@property] count
     * <p>
     * The number of items in the collection.
     * <p>
     * Returns the number of data output / synchronized data pairs present in the collection.
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

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
    public native AVCaptureSynchronizedDataCollection init();

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
    public static native AVCaptureSynchronizedDataCollection new_objc();

    /**
     * objectForKeyedSubscript:
     * <p>
     * Method that provides support for object subscripting.
     * <p>
     * AVCaptureSynchronizedDataCollection supports object subscripting. If you'd like to find the synchronized data for a given data output, simply:
     * AVCaptureSynchronizedData *synchronizedData = synchronizedDataCollection[dataOutput];
     *
     * @param key The data output whose synchronized data you'd like to inspect.
     * @return The synchronized data object associated with the provided output, or nil, if there is none.
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native AVCaptureSynchronizedData objectForKeyedSubscript(AVCaptureOutput key);

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

    /**
     * synchronizedDataForCaptureOutput:
     * <p>
     * Provides the synchronized data object for a given capture output.
     *
     * @param captureOutput The data output whose synchronized data you'd like to inspect.
     * @return The synchronized data object associated with the provided output, or nil, if there is none.
     */
    @Generated
    @Selector("synchronizedDataForCaptureOutput:")
    public native AVCaptureSynchronizedData synchronizedDataForCaptureOutput(AVCaptureOutput captureOutput);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
