package apple.cryptotokenkit;

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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKTokenWatcher extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKTokenWatcher(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add removal watcher for specific tokenID
     * [@disscussion] after removalHandler for a specific tokenID is called the reference to this handler is removed. For one tokenID just one handler can be added, so next call to addRemovalHandler will replace previous handler
     *
     * @param removalHandler called when a token is removed
     * @param tokenID        specified tokenID, if tokenID does not exist removal handler is called imediately
     */
    @Generated
    @Selector("addRemovalHandler:forTokenID:")
    public native void addRemovalHandlerForTokenID(
            @ObjCBlock(name = "call_addRemovalHandlerForTokenID") Block_addRemovalHandlerForTokenID removalHandler,
            String tokenID);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addRemovalHandlerForTokenID {
        @Generated
        void call_addRemovalHandlerForTokenID(String tokenID);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKTokenWatcher alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native TKTokenWatcher allocWithZone(VoidPtr zone);

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

    /**
     * Init watcher
     */
    @Generated
    @Selector("init")
    public native TKTokenWatcher init();

    /**
     * Init watcher with insertion handler
     * [@disscussion] init watcher with insertion handler which is called when a new token arrives
     *
     * @param insertionHandler called when a new token is inserted
     */
    @Generated
    @Selector("initWithInsertionHandler:")
    public native TKTokenWatcher initWithInsertionHandler(
            @ObjCBlock(name = "call_initWithInsertionHandler") Block_initWithInsertionHandler insertionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithInsertionHandler {
        @Generated
        void call_initWithInsertionHandler(String tokenID);
    }

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
    public static native TKTokenWatcher new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set insertion handler
     * [@disscussion] when an insertion handler is set the TokenWatcher will call this handler when new token appears in the system. TokenWatcher will call the handler also for tokens which was registered in the system before the handler was set.
     *
     * @param insertionHandler called when a new token is inserted
     */
    @Generated
    @Selector("setInsertionHandler:")
    public native void setInsertionHandler(
            @ObjCBlock(name = "call_setInsertionHandler") Block_setInsertionHandler insertionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInsertionHandler {
        @Generated
        void call_setInsertionHandler(String tokenID);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Array of currently known TokenIDs in the system.  Tokens are identified by instance's names. It is possible to use KVO to be notified about token arrivals and removals.
     */
    @Generated
    @Selector("tokenIDs")
    public native NSArray<String> tokenIDs();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Return TokenInfo for specific tokenID
     *
     * @param tokenID specified tokenID
     * @return A TokenInfo object, or nil if tokenID does not exist
     */
    @Generated
    @Selector("tokenInfoForTokenID:")
    public native TKTokenWatcherTokenInfo tokenInfoForTokenID(String tokenID);
}
