package apple.uikit;

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
import apple.uikit.protocol.UISheetPresentationControllerDetentResolutionContext;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.objc.ann.ObjCBlock;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISheetPresentationControllerDetent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UISheetPresentationControllerDetent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISheetPresentationControllerDetent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISheetPresentationControllerDetent allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UISheetPresentationControllerDetent init();

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
     * A system detent for a sheet at full height.
     */
    @Generated
    @Selector("largeDetent")
    public static native UISheetPresentationControllerDetent largeDetent();

    /**
     * A system detent for a sheet that is approximately half the height of the screen, and is inactive in compact
     * height.
     */
    @Generated
    @Selector("mediumDetent")
    public static native UISheetPresentationControllerDetent mediumDetent();

    @Generated
    @Owned
    @Selector("new")
    public static native UISheetPresentationControllerDetent new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A custom detent that may compute a value based on the properties of the passed in context.
     * If the detent needs to be referred to from other API on the sheet, such as `selectedDetentIdentifier`, specify an
     * identifier for the detent.
     * The identifier of each custom detent used by a sheet should be unique.
     * If no identifier is specified, a random one will be generated.
     * The value returned from the resolutionContextBlock is a height within the safe area of the sheet. For example,
     * returning 200 will result in a detent where the height of the sheet is 200 + safeAreaInsets.bottom when
     * edge-attached, and just 200 when floating. Return nil if the detent should be inactive based on the passed in
     * context.
     * If the block depends on any external inputs, call `invalidateDetents` on the sheet when the external inputs
     * change.
     * Do not set any properties on UISheetPresentationController during the execution of this block.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("customDetentWithIdentifier:resolver:")
    public static native UISheetPresentationControllerDetent customDetentWithIdentifierResolver(String identifier,
            @ObjCBlock(name = "call_customDetentWithIdentifierResolver") Block_customDetentWithIdentifierResolver resolver);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customDetentWithIdentifierResolver {
        @Generated
        @NFloat
        double call_customDetentWithIdentifierResolver(@Mapped(ObjCObjectMapper.class) Object context);
    }

    /**
     * The identifier of this detent.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Resolves a detent to its value. Returns UISheetPresentationControllerDetentInactive if the detent is inactive in
     * the provided context.
     * This may be used to get the values of the system medium and large detents, or the value of a custom detent.
     * This is intended to be used inside `customDetentWithIdentifier:resolver:` as a way to construct a custom detent
     * based on the values of known detents.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("resolvedValueInContext:")
    @NFloat
    public native double resolvedValueInContext(
            @Mapped(ObjCObjectMapper.class) UISheetPresentationControllerDetentResolutionContext context);
}
