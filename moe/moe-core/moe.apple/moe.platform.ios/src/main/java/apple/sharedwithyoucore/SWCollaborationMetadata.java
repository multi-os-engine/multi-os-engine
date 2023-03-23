package apple.sharedwithyoucore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPersonNameComponents;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYouCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SWCollaborationMetadata extends NSObject implements NSSecureCoding, NSCopying, NSMutableCopying,
        NSItemProviderReading, NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected SWCollaborationMetadata(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SWCollaborationMetadata alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SWCollaborationMetadata allocWithZone(VoidPtr zone);

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
     * Globally unique identifier for the item represented by this metadata.
     * 
     * This identifier is unique across platforms and shares of the same item.
     */
    @Generated
    @Selector("collaborationIdentifier")
    public native String collaborationIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The collaboration options that this content supports (updated).
     */
    @Generated
    @Selector("defaultShareOptions")
    public native SWCollaborationShareOptions defaultShareOptions();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SWCollaborationMetadata init();

    @Generated
    @Selector("initWithCoder:")
    public native SWCollaborationMetadata initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCollaborationIdentifier:")
    public native SWCollaborationMetadata initWithCollaborationIdentifier(String collaborationIdentifier);

    @Generated
    @Selector("initWithLocalIdentifier:")
    public native SWCollaborationMetadata initWithLocalIdentifier(String localIdentifier);

    /**
     * The handle of the person initiating the collaboration, e.g. an email address or phone number.
     * 
     * Set by the initiating application to allow the user to confirm the handle being used before beginning
     * collaboration. Value will not be transmitted to recipients, and will be nil when not initiating collaboration.
     */
    @Generated
    @Selector("initiatorHandle")
    public native String initiatorHandle();

    /**
     * The name of the person initiating the collaboration.
     * 
     * Set by the initiating application to allow the user to confirm the name being used before beginning
     * collaboration. Value will not be transmitted to recipients, and will be nil when not initiating collaboration.
     */
    @Generated
    @Selector("initiatorNameComponents")
    public native NSPersonNameComponents initiatorNameComponents();

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
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    /**
     * Locally unique identifier for the item represented by this metadata.
     * 
     * Use this identifier to uniquely identify this metadata before a collaborationIdentifier can be created
     */
    @Generated
    @Selector("localIdentifier")
    public native String localIdentifier();

    @Generated
    @Owned
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native SWCollaborationMetadata new_objc();

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native SWCollaborationMetadata objectWithItemProviderDataTypeIdentifierError(NSData data,
            String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public SWCollaborationMetadata _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The collaboration options that this content supports (updated).
     */
    @Generated
    @Selector("setDefaultShareOptions:")
    public native void setDefaultShareOptions(SWCollaborationShareOptions value);

    /**
     * The handle of the person initiating the collaboration, e.g. an email address or phone number.
     * 
     * Set by the initiating application to allow the user to confirm the handle being used before beginning
     * collaboration. Value will not be transmitted to recipients, and will be nil when not initiating collaboration.
     */
    @Generated
    @Selector("setInitiatorHandle:")
    public native void setInitiatorHandle(String value);

    /**
     * The name of the person initiating the collaboration.
     * 
     * Set by the initiating application to allow the user to confirm the name being used before beginning
     * collaboration. Value will not be transmitted to recipients, and will be nil when not initiating collaboration.
     */
    @Generated
    @Selector("setInitiatorNameComponents:")
    public native void setInitiatorNameComponents(NSPersonNameComponents value);

    /**
     * Title of the content.
     * 
     * Title of the collaboration if provided by the app which owns the collaboration item.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The collaboration options that the user selected when sending the invite (updated).
     */
    @Generated
    @Selector("setUserSelectedShareOptions:")
    public native void setUserSelectedShareOptions(SWCollaborationShareOptions value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Title of the content.
     * 
     * Title of the collaboration if provided by the app which owns the collaboration item.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The collaboration options that the user selected when sending the invite (updated).
     */
    @Generated
    @Selector("userSelectedShareOptions")
    public native SWCollaborationShareOptions userSelectedShareOptions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();
}