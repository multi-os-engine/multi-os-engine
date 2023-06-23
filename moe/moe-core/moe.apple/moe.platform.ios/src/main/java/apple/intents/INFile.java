package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
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
 * An object that describes a piece of data and its associated name and uniform type identifier.
 * This data can either be stored in a file on disk, or in memory.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INFile extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INFile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INFile alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INFile allocWithZone(VoidPtr zone);

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

    /**
     * The contents of the file.
     * If the file was created with a URL, accessing this property will memory map the file contents.
     */
    @NotNull
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * URL to the file on disk, if any.
     * If the file isn't stored on disk, access the contents using the `data` property.
     * 
     * If the file was created elsewhere on the system, make sure to surround access to file contents
     * with `-[NSURL startAccessingSecurityScopedResource]` and `-[NSURL stopAccessingSecurityScopedResource]`.
     */
    @Nullable
    @Generated
    @Selector("fileURL")
    public native NSURL fileURL();

    @NotNull
    @Generated
    @Selector("fileWithData:filename:typeIdentifier:")
    public static native INFile fileWithDataFilenameTypeIdentifier(@NotNull NSData data, @NotNull String filename,
            @Nullable String typeIdentifier);

    @NotNull
    @Generated
    @Selector("fileWithFileURL:filename:typeIdentifier:")
    public static native INFile fileWithFileURLFilenameTypeIdentifier(@NotNull NSURL fileURL, @Nullable String filename,
            @Nullable String typeIdentifier);

    /**
     * The human-readable name of the file, which will be displayed to the user.
     */
    @NotNull
    @Generated
    @Selector("filename")
    public native String filename();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INFile init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native INFile new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The human-readable name of the file, which will be displayed to the user.
     */
    @Generated
    @Selector("setFilename:")
    public native void setFilename(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The uniform type identifier of the file. (i.e. "public.json", "public.png", or any custom type)
     * More information about uniform type identifiers can be found in <CoreServices/UTCoreTypes.h>
     */
    @Nullable
    @Generated
    @Selector("typeIdentifier")
    public native String typeIdentifier();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native INFile initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Indicates whether the file should be automatically deleted from disk when the Shortcut is done running. `false`
     * by default.
     * 
     * API-Since: 15.1
     */
    @Generated
    @Selector("removedOnCompletion")
    public native boolean removedOnCompletion();

    /**
     * Indicates whether the file should be automatically deleted from disk when the Shortcut is done running. `false`
     * by default.
     * 
     * API-Since: 15.1
     */
    @Generated
    @Selector("setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean value);
}
