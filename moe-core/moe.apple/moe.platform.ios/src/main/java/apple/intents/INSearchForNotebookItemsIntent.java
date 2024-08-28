package apple.intents;

import apple.NSObject;
import apple.corelocation.CLPlacemark;
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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSearchForNotebookItemsIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INSearchForNotebookItemsIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSearchForNotebookItemsIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSearchForNotebookItemsIntent allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("content")
    public native String content();

    @Generated
    @Selector("dateSearchType")
    @NInt
    public native long dateSearchType();

    @Nullable
    @Generated
    @Selector("dateTime")
    public native INDateComponentsRange dateTime();

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
    public native INSearchForNotebookItemsIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INSearchForNotebookItemsIntent initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.2
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:")
    public native INSearchForNotebookItemsIntent initWithTitleContentItemTypeStatusLocationLocationSearchTypeDateTimeDateSearchType(
            @Nullable INSpeakableString title, @Nullable String content, @NInt long itemType, @NInt long status,
            @Nullable CLPlacemark location, @NInt long locationSearchType, @Nullable INDateComponentsRange dateTime,
            @NInt long dateSearchType);

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
    @Selector("itemType")
    @NInt
    public native long itemType();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("location")
    public native CLPlacemark location();

    @Generated
    @Selector("locationSearchType")
    @NInt
    public native long locationSearchType();

    @Generated
    @Owned
    @Selector("new")
    public static native INSearchForNotebookItemsIntent new_objc();

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
    @Selector("status")
    @NInt
    public native long status();

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

    @Nullable
    @Generated
    @Selector("title")
    public native INSpeakableString title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 11.2
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:notebookItemIdentifier:")
    public native INSearchForNotebookItemsIntent initWithTitleContentItemTypeStatusLocationLocationSearchTypeDateTimeDateSearchTypeNotebookItemIdentifier(
            @Nullable INSpeakableString title, @Nullable String content, @NInt long itemType, @NInt long status,
            @Nullable CLPlacemark location, @NInt long locationSearchType, @Nullable INDateComponentsRange dateTime,
            @NInt long dateSearchType, @Nullable String notebookItemIdentifier);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:temporalEventTriggerTypes:taskPriority:notebookItemIdentifier:")
    public native INSearchForNotebookItemsIntent initWithTitleContentItemTypeStatusLocationLocationSearchTypeDateTimeDateSearchTypeTemporalEventTriggerTypesTaskPriorityNotebookItemIdentifier(
            @Nullable INSpeakableString title, @Nullable String content, @NInt long itemType, @NInt long status,
            @Nullable CLPlacemark location, @NInt long locationSearchType, @Nullable INDateComponentsRange dateTime,
            @NInt long dateSearchType, @NUInt long temporalEventTriggerTypes, @NInt long taskPriority,
            @Nullable String notebookItemIdentifier);

    /**
     * API-Since: 11.2
     */
    @Nullable
    @Generated
    @Selector("notebookItemIdentifier")
    public native String notebookItemIdentifier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("taskPriority")
    @NInt
    public native long taskPriority();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("temporalEventTriggerTypes")
    @NUInt
    public native long temporalEventTriggerTypes();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
