package apple.webkit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKSnapshotConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKSnapshotConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * A Boolean value that specifies whether the snapshot should be taken after recent
     * changes have been incorporated. The value NO will capture the screen in its current state,
     * which might not include recent changes.
     * <p>
     * The default value is YES.
     */
    @Generated
    @Selector("afterScreenUpdates")
    public native boolean afterScreenUpdates();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKSnapshotConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKSnapshotConfiguration allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    public native WKSnapshotConfiguration init();

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
    public static native WKSnapshotConfiguration new_objc();

    /**
     * The rect to snapshot in view coordinates.
     * <p>
     * This rect should be contained within WKWebView's bounds. If the rect is set to the
     * null rect, the view's bounds will be used. The initial value is the null rect.
     */
    @Generated
    @Selector("rect")
    @ByValue
    public native CGRect rect();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value that specifies whether the snapshot should be taken after recent
     * changes have been incorporated. The value NO will capture the screen in its current state,
     * which might not include recent changes.
     * <p>
     * The default value is YES.
     */
    @Generated
    @Selector("setAfterScreenUpdates:")
    public native void setAfterScreenUpdates(boolean value);

    /**
     * The rect to snapshot in view coordinates.
     * <p>
     * This rect should be contained within WKWebView's bounds. If the rect is set to the
     * null rect, the view's bounds will be used. The initial value is the null rect.
     */
    @Generated
    @Selector("setRect:")
    public native void setRect(@ByValue CGRect value);

    /**
     * Specify a custom width to control the size of image you get back. The height will be
     * computed to maintain the aspect ratio established by rect.
     * <p>
     * snapshotWidth represents the width in points. If the snapshotWidth is nil, rect's
     * width will be used.
     */
    @Generated
    @Selector("setSnapshotWidth:")
    public native void setSnapshotWidth(NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Specify a custom width to control the size of image you get back. The height will be
     * computed to maintain the aspect ratio established by rect.
     * <p>
     * snapshotWidth represents the width in points. If the snapshotWidth is nil, rect's
     * width will be used.
     */
    @Generated
    @Selector("snapshotWidth")
    public native NSNumber snapshotWidth();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
