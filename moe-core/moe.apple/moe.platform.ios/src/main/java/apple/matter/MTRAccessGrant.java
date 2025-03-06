package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * An access grant, which can be represented as an entry in the Matter Access
 * Control cluster.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRAccessGrant extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRAccessGrant(Pointer peer) {
        super(peer);
    }

    /**
     * Grant access to any node on the fabric, as long as it's communicating with us
     * over a unicast authenticated channel.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("accessGrantForAllNodesWithPrivilege:")
    @NotNull
    public static native MTRAccessGrant accessGrantForAllNodesWithPrivilege(byte privilege);

    /**
     * Grant access to any node on the fabric that has a matching CASE Authenticated
     * Tag in its operational certificate. The provided caseAuthenticatedTag must
     * be a 32-bit unsigned integer with lower 16 bits not 0, per the Matter
     * specification.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("accessGrantForCASEAuthenticatedTag:privilege:")
    @Nullable
    public static native MTRAccessGrant accessGrantForCASEAuthenticatedTagPrivilege(
            @NotNull NSNumber caseAuthenticatedTag, byte privilege);

    /**
     * Grant access to any node on the fabric that is communicating with us via
     * group messages sent to the given group. The provided groupID must be a valid
     * group identifier in the range 1-65535.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("accessGrantForGroupID:privilege:")
    @Nullable
    public static native MTRAccessGrant accessGrantForGroupIDPrivilege(@NotNull NSNumber groupID, byte privilege);

    /**
     * Grant access at the provided level to a specific node on the fabric. The
     * provided nodeID must be an operational node identifier.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("accessGrantForNodeID:privilege:")
    @Nullable
    public static native MTRAccessGrant accessGrantForNodeIDPrivilege(@NotNull NSNumber nodeID, byte privilege);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRAccessGrant alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRAccessGrant allocWithZone(VoidPtr zone);

    /**
     * The type of authentication mode the access grant is
     * for. MTRAccessControlEntryAuthModeCASE for unicast messages and
     * MTRAccessControlEntryAuthModeGroup for groupcast ones.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("authenticationMode")
    public native byte authenticationMode();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The privilege that has been granted
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("grantedPrivilege")
    public native byte grantedPrivilege();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRAccessGrant init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRAccessGrant new_objc();

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
     * The matter access control subject ID that access has been granted for. Nil
     * when access has been granted for all subjects (e.g. via initForAllNodesWithPrivilege).
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("subjectID")
    @Nullable
    public native NSNumber subjectID();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}