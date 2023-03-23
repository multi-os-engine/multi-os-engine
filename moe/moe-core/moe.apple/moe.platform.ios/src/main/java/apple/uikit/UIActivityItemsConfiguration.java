package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSItemProvider;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIActivityItemsConfigurationReading;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;

/**
 * A configuration that allows a responder to export data through a variety of interactions.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIActivityItemsConfiguration extends NSObject implements UIActivityItemsConfigurationReading {
    static {
        NatJ.register();
    }

    @Generated
    protected UIActivityItemsConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationMetadataForItemAtIndex:key:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object activityItemsConfigurationMetadataForItemAtIndexKey(@NInt long index, String key);

    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationMetadataForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object activityItemsConfigurationMetadataForKey(String key);

    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationPreviewForItemAtIndex:intent:suggestedSize:")
    public native NSItemProvider activityItemsConfigurationPreviewForItemAtIndexIntentSuggestedSize(@NInt long index,
            String intent, @ByValue CGSize suggestedSize);

    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationSupportsInteraction:")
    public native boolean activityItemsConfigurationSupportsInteraction(String interaction);

    /**
     * Provide promised items
     */
    @Generated
    @Selector("activityItemsConfigurationWithItemProviders:")
    public static native UIActivityItemsConfiguration activityItemsConfigurationWithItemProviders(
            NSArray<? extends NSItemProvider> itemProviders);

    /**
     * Provide data up front
     */
    @Generated
    @Selector("activityItemsConfigurationWithObjects:")
    public static native UIActivityItemsConfiguration activityItemsConfigurationWithObjects(NSArray<?> objects);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIActivityItemsConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIActivityItemsConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @IsOptional
    @Selector("applicationActivitiesForActivityItemsConfiguration")
    public native NSArray<? extends UIActivity> applicationActivitiesForActivityItemsConfiguration();

    @Generated
    @Selector("applicationActivitiesProvider")
    @ObjCBlock(name = "call_applicationActivitiesProvider_ret")
    public native Block_applicationActivitiesProvider_ret applicationActivitiesProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applicationActivitiesProvider_ret {
        @Generated
        NSArray<? extends UIActivity> call_applicationActivitiesProvider_ret();
    }

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
    public native UIActivityItemsConfiguration init();

    /**
     * Provide promised items
     */
    @Generated
    @Selector("initWithItemProviders:")
    public native UIActivityItemsConfiguration initWithItemProviders(NSArray<? extends NSItemProvider> itemProviders);

    /**
     * Provide data up front
     */
    @Generated
    @Selector("initWithObjects:")
    public native UIActivityItemsConfiguration initWithObjects(NSArray<?> objects);

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
    @Selector("itemProvidersForActivityItemsConfiguration")
    public native NSArray<? extends NSItemProvider> itemProvidersForActivityItemsConfiguration();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * A local object retained for the convenience of the app developer
     */
    @Generated
    @Selector("localObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object localObject();

    @Generated
    @Selector("metadataProvider")
    @ObjCBlock(name = "call_metadataProvider_ret")
    public native Block_metadataProvider_ret metadataProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_metadataProvider_ret {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_metadataProvider_ret(String arg0);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native UIActivityItemsConfiguration new_objc();

    @Generated
    @Selector("perItemMetadataProvider")
    @ObjCBlock(name = "call_perItemMetadataProvider_ret")
    public native Block_perItemMetadataProvider_ret perItemMetadataProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perItemMetadataProvider_ret {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_perItemMetadataProvider_ret(@NInt long arg0, String arg1);
    }

    @Generated
    @Selector("previewProvider")
    @ObjCBlock(name = "call_previewProvider_ret")
    public native Block_previewProvider_ret previewProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previewProvider_ret {
        @Generated
        NSItemProvider call_previewProvider_ret(@NInt long arg0, String arg1, @ByValue CGSize arg2);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setApplicationActivitiesProvider:")
    public native void setApplicationActivitiesProvider(
            @ObjCBlock(name = "call_setApplicationActivitiesProvider") Block_setApplicationActivitiesProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setApplicationActivitiesProvider {
        @Generated
        NSArray<? extends UIActivity> call_setApplicationActivitiesProvider();
    }

    /**
     * A local object retained for the convenience of the app developer
     */
    @Generated
    @Selector("setLocalObject:")
    public native void setLocalObject(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setMetadataProvider:")
    public native void setMetadataProvider(
            @ObjCBlock(name = "call_setMetadataProvider") Block_setMetadataProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMetadataProvider {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_setMetadataProvider(String arg0);
    }

    @Generated
    @Selector("setPerItemMetadataProvider:")
    public native void setPerItemMetadataProvider(
            @ObjCBlock(name = "call_setPerItemMetadataProvider") Block_setPerItemMetadataProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerItemMetadataProvider {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_setPerItemMetadataProvider(@NInt long arg0, String arg1);
    }

    @Generated
    @Selector("setPreviewProvider:")
    public native void setPreviewProvider(@ObjCBlock(name = "call_setPreviewProvider") Block_setPreviewProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPreviewProvider {
        @Generated
        NSItemProvider call_setPreviewProvider(@NInt long arg0, String arg1, @ByValue CGSize arg2);
    }

    /**
     * Defaults to all known interactions
     */
    @Generated
    @Selector("setSupportedInteractions:")
    public native void setSupportedInteractions(NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Defaults to all known interactions
     */
    @Generated
    @Selector("supportedInteractions")
    public native NSArray<String> supportedInteractions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
