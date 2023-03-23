package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 14.5
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIEventAttribution extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIEventAttribution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIEventAttribution alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIEventAttribution allocWithZone(VoidPtr zone);

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

    /**
     * The destination URL of an attribution. For example, the link opened when an advertisement is tapped.
     * 
     * This field corresponds to `attributed_on_site` in the subsequent attribution report.
     */
    @Generated
    @Selector("destinationURL")
    public native NSURL destinationURL();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIEventAttribution init();

    /**
     * Create a `UIEventAttribution` object.
     * 
     * @param sourceIdentifier  An identifier associated with the attribution.
     * @param destinationURL    The destination URL of the attribution.
     * @param sourceDescription A high-level description of the content to be attributed. Pass in an empty string if no
     *                          description is available.
     * @param purchaser         The name of the party that purchased the content to be attributed. Pass in an empty
     *                          string if no name is available.
     * 
     * @return An instance of `UIEventAttribution` with the specified values for each field.
     * 
     *         The `sourceDescription` and `purchaser` fields may be truncated by the system if they are too long.
     */
    @Generated
    @Selector("initWithSourceIdentifier:destinationURL:sourceDescription:purchaser:")
    public native UIEventAttribution initWithSourceIdentifierDestinationURLSourceDescriptionPurchaser(
            byte sourceIdentifier, NSURL destinationURL, String sourceDescription, String purchaser);

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
    public static native UIEventAttribution new_objc();

    /**
     * The name of the party that purchased the content to be attributed. For example, this could be the name of the
     * party that purchased the placement of an advertisement.
     * 
     * The system may truncate this field if it is too long.
     */
    @Generated
    @Selector("purchaser")
    public native String purchaser();

    /**
     * The URL to which the attribution report will be sent. You do not provide this field at creation time. Instead,
     * you must define the URL
     * as a string in your app's Info.plist under the `NSAdvertisingAttributionReportEndpoint` key.
     * 
     * This field corresponds to `source_site` in the subsequent attribution report.
     */
    @Generated
    @Selector("reportEndpoint")
    public native NSURL reportEndpoint();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A high-level description of the source of the attribution. For example, this could be a description of the
     * content of an advertisement a user taps on.
     * 
     * The system may truncate this field if it is too long.
     */
    @Generated
    @Selector("sourceDescription")
    public native String sourceDescription();

    /**
     * An identifier that is associated with the source of the attribution. For example, you may choose to use this as a
     * campaign identifier to measure the effectiveness of different advertisement campaigns.
     * 
     * This field corresponds to `source_id` in the subsequent attribution report.
     */
    @Generated
    @Selector("sourceIdentifier")
    public native byte sourceIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
